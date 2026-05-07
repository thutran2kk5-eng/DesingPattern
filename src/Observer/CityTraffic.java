package Observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CityTraffic {
    private String cityName;
    private String status;
    private PropertyChangeSupport support;

    public CityTraffic(String cityName) {
        this.cityName = cityName;
        this.support = new PropertyChangeSupport(this);
    }

    public void addObserver(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removeObserver(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setStatus(String newStatus) {
        String oldStatus = this.status;
        this.status = newStatus;
        support.firePropertyChange("status", oldStatus, newStatus);
    }

    @Override
    public String toString() {
        return "Thành phố " + cityName;
    }
}

