package entities;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

public class LogEntry {

    private String userName;
    private Date moment;


    public LogEntry(String userName, Date moment) {
        this.userName = userName;
        this.moment = moment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(userName, logEntry.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }
}
