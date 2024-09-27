package com.solvd.connection;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class ConnectionPool {

    private static volatile ConnectionPool instance;
    private final BlockingQueue<Connection> pool;

    private ConnectionPool(int poolSize){
        pool = new LinkedBlockingQueue<>(poolSize);
        for (int i = 0; i < poolSize; i++){
            pool.offer(new Connection("Connection - " + (i + 1)));
        }
    }

    public static ConnectionPool getInstance(int poolSize) {
        if (instance == null){
            synchronized (ConnectionPool.class){
                if (instance == null){
                    instance = new ConnectionPool(poolSize);
                }
            }
        }
        return instance;
    }

    public Connection getConnection() throws InterruptedException{
        return pool.take();
    }

    public void releaseConnection(Connection connection){
        if (connection != null){
            pool.offer(connection);
        }
    }
}
