package com.sap.cc.handsoff;

import java.util.ArrayList;
import java.util.List;

public class Hackathon implements DeveloperEvent {

    @Override
    public String codeTogether(List<CodeCreator> codeCreators) {
        String greeting = "";
        for(CodeCreator coded : codeCreators) {
            try{
                greeting = greeting + coded.code() + "\n";
            }
            catch (UnsupportedDevelopmentLanguageException e) {
                throw new RuntimeException(e);
            }

        }
        return greeting;
    }
    public CodeCreator create(String name, String language) {
        CodeCreator newCode = new Developer(name, language);
        return newCode;
    }

    public static void main(String args[]) {
        Hackathon hack = new Hackathon();
        List<CodeCreator> cd = new ArrayList<CodeCreator>();

        cd.add(hack.create("anu", "java"));
        cd.add(hack.create("joseph", "python"));

        System.out.println(hack.codeTogether(cd));
    }

}
