package manage;

/**
 * @author djt
 * @date 2021/3/18
 */
public class SystemConfig implements SystemConfigMBean  {

    private String applicationName;

    @Override
    public String getApplicationName() {
        return this.applicationName;
    }

    @Override
    public void setApplicationName(String name) {
        this.applicationName=name;
    }
}
