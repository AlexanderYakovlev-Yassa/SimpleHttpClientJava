package pl.twerd.httpclient;

public class Man {

    private String name;
    private String sureName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Man man = (Man) o;

        if (getAge() != man.getAge()) return false;
        if (getName() != null ? !getName().equals(man.getName()) : man.getName() != null) return false;
        return getSureName() != null ? getSureName().equals(man.getSureName()) : man.getSureName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSureName() != null ? getSureName().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Man{");
        sb.append("name='").append(name).append('\'');
        sb.append(", sureName='").append(sureName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
