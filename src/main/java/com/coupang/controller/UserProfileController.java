package com.coupang.controller;

import com.coupang.model.UserProfile;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserProfileController {
    private Map<String, UserProfile> userMap;

    @PostConstruct
    public void init() { //데이터초기화
        userMap = new HashMap<String, UserProfile>();
        userMap.put("1", new UserProfile("1", "홍길동", 5000));

    }

    @GetMapping("/user/{id}")
    public UserProfile getUserProfile(@PathVariable String id) {
        return userMap.get(id);
    }

    @GetMapping("/user/all")
    public List<UserProfile> getUserProfileList() {
        return new ArrayList<UserProfile>(userMap.values());

      }

      @PutMapping("/user/{id}")
      public void putUserProfile(@PathVariable String id, @RequestParam("name")String name, @RequestParam("point")Integer point) {
          UserProfile userProfile = new UserProfile(id, name, point);
          userMap.put(id, userProfile);
      }

    @PostMapping("/user/{id}")
    public void postUserProfile(@PathVariable String id, @RequestParam("name")String name, @RequestParam("point")Integer point) {
        UserProfile userProfile = userMap.get(id);
        userProfile.setName(name);
        userProfile.setPoint(point);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserProfile(@PathVariable("id") String id) {
        userMap.remove(id);
    }




    }
