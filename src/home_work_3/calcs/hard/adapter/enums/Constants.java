package home_work_3.calcs.hard.adapter.enums;

public enum Constants {

    PI("PI"),
    E("E");


    private final String letterForm;

    public String getLetterForm() {
        return letterForm;
    }

    Constants(String letterForm) {
        this.letterForm = letterForm;
    }


    public static Constants[] getAllConstants() {
        return Constants.values();
    }


}
