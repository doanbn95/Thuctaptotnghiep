package ominext.doan.stores.common.utils;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import java.util.Arrays;
import java.util.List;

public class GeneratePassword {
    public static String generatePassword(int length){
        List<CharacterRule> rules= Arrays.asList(
                new CharacterRule(EnglishCharacterData.UpperCase,1),
                new CharacterRule(EnglishCharacterData.LowerCase,1),
                new CharacterRule(EnglishCharacterData.Digit,1)
        );
        PasswordGenerator generator= new PasswordGenerator();
        return  generator.generatePassword(length,rules);
    }
}
