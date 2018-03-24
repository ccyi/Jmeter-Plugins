package com.zys.jmeter.protocol.hbase.sampler;

/**
 * Created by 01369755 on 2018/1/4.
 */
import java.beans.PropertyDescriptor;
import org.apache.jmeter.testbeans.BeanInfoSupport;

public class HbaseSamplerBeanInfo extends BeanInfoSupport {
    public HbaseSamplerBeanInfo()
    {
        super(HbaseSampler.class);
        createPropertyGroup("ZooKeeper信息", new String[] { "zkAddr" });
        createPropertyGroup("Hbase信息", new String[] {"tableName", "rowKey", "family", "column"});
        PropertyDescriptor p = property("zkAddr");
        p.setValue("notUndefined", Boolean.TRUE);
        p.setValue("default", "");
        p = property("tableName");
        p.setValue("notUndefined", Boolean.TRUE);
        p.setValue("default", "");
        p = property("rowKey");
        p.setValue("notUndefined", Boolean.TRUE);
        p.setValue("default", "");
        p = property("family");
        p.setValue("notUndefined", Boolean.TRUE);
        p.setValue("default", "");
        p = property("column");
        p.setValue("notUndefined", Boolean.TRUE);
        p.setValue("default", "");
    }
}