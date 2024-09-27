package com.solvd.connection;

public class Connection {

        private final String id;

        public Connection(String id){
            this.id = id;
        }

        public String getId(){
            return id;
        }

        public void use(){
            System.out.println("Using connection: " + id);
        }

        public void release(){
            System.out.println("Releasing connection: " + id);
        }


}
