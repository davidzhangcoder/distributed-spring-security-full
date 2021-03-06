package com;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class TestBCrypt {

    public static void main(String[] args) {
        String secret = BCrypt.hashpw("secret", BCrypt.gensalt());
        System.out.println(secret);
    }

}
