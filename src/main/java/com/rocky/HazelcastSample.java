package com.rocky;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class HazelcastSample
{
    public static void main( String[] args )
    {
       HazelcastSample hcs = new HazelcastSample();
        hcs.start();
    }

    private Config config = new Config();
    HazelcastInstance instance = Hazelcast.newHazelcastInstance(config);

    private void start() {
        Map<Integer, String> customerMap = instance.getMap("customers");
        customerMap.put(1, "James");
        customerMap.put(2, "Frank");
        customerMap.put(3, "Betty");


    }
}
