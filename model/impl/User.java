package model.impl;

import util.UserComparator;

public abstract class User extends UserComparator<User> implements Comparable<User>{

    protected int id;
    protected String name;
    protected String lastName;
    protected int groupId;


    public User(int id, String name, String lastName, int groupId) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.groupId = groupId;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format(getClass()
                .getSimpleName() + " = [id: %s, name: %s, lastName: %s]", id, name, lastName);
    }

    @Override
    public int compareTo(User o) {
        return compare(this, o);
    }


}
