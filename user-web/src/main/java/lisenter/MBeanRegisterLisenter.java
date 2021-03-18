package lisenter;

import manage.SystemConfig;

import javax.management.*;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.lang.management.ManagementFactory;

/**
 * @author djt
 * @date 2021/3/18
 */
@WebListener()
public class MBeanRegisterLisenter implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        try {
            ObjectName objectName = new ObjectName("com.mx:type=SystemConfig");
            SystemConfig systemConfig = new SystemConfig();
            platformMBeanServer.registerMBean(systemConfig,objectName);
        } catch (MalformedObjectNameException | InstanceAlreadyExistsException | MBeanRegistrationException | NotCompliantMBeanException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
