package com.trekit.trekitapi.resources;

import com.google.auto.value.AutoValue;

import java.util.Date;

@AutoValue
public abstract class User {

    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract String getUserName();
    public abstract String getEmail();
    public abstract String getEncryptedPassword();
    public abstract Date getDateOfBirth();

    public static Builder builder() {
        return new AutoValue_User.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setFirstName(final String firstName);
        public abstract Builder setLastName(final String lastName);
        public abstract Builder setUserName(final String userName);
        public abstract Builder setEmail(final String email);
        public abstract Builder setEncryptedPassword(final String password);
        public abstract Builder setDateOfBirth(final Date dateOfBirth);
        public abstract User build();
    }
}
