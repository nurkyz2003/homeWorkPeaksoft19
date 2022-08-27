public enum DaysOfTheWeek {
    MONDAY("ДУЙШОМБУ"),TUESDAY("ШЕЙШЕМБИ"),THIRSDAY("ШАРШЕМБИ"),WEDNESDAY("БЕЙШЕМБИ"),FRIDAY("ЖУМА"),SATURDAY("ИШЕМБИ"),SUNDAY("ЖЕКШЕМБИ");

    private String daysInKyrgyz;

    DaysOfTheWeek(String daysInKyrgyz) {
        this.daysInKyrgyz = daysInKyrgyz;
    }

    public String getDaysInKyrgyz() {
        return daysInKyrgyz;
    }

    public void setDaysInKyrgyz(String daysInKyrgyz) {
        this.daysInKyrgyz = daysInKyrgyz;
    }
}
