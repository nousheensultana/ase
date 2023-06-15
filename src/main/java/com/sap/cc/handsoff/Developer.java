package com.sap.cc.handsoff;

public class Developer extends CodeCreator{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    private String name, language;

    public Developer(String name, String language) {
        this.name = name;
        this.language = language;
    }

    @Override
    public String code() throws UnsupportedDevelopmentLanguageException {
        String result, language = getLanguage();

        switch(language) {
            case "java": result = "fmt.Println(\"Hello," + getName() + "!\")";
                break;
            case "nodejs": result = "console.log(\"Hello," + getName() + "!\")";
                break;
            case "python": result = "print(\"Hello," + getName() + "!\")";
                break;
            default: throw new UnsupportedDevelopmentLanguageException(language);
        }
        return result;
    }

    public static void main(String args[]) throws UnsupportedDevelopmentLanguageException {
        Developer dev = new Developer("Greg", "java");
        System.out.println(dev.code());
    }

}
