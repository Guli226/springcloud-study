package com.guliya.configclient.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "data")
public class GitAutoRefreshConfig {

    private String env;
    private UserInfo user;

    @Setter
    @Getter
    public static class UserInfo {
        private String username;
        private String password;

        @Override
        public String toString() {
            return "UserInfo{" +
                    "username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

}
