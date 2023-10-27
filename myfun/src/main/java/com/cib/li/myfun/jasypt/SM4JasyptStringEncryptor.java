package com.cib.li.myfun.jasypt;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.stereotype.Service;

@Service("myFunJasypt")
public class SM4JasyptStringEncryptor implements StringEncryptor {
    @Override
    public String encrypt(String s) {
        return "encrypte:"+ s;
    }

    @Override
    public String decrypt(String s) {
        return "decrypt: "+ s;
    }
}
