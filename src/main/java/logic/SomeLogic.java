package logic;

import dataService.DataService;

import javax.xml.crypto.Data;

public class SomeLogic implements DataService {
    private DataService data;
    public int[] retrieveAllData(){
        return data.retrieveAllData();
    }

    public void setData(DataService data) {
        this.data = data;
    }

    public int calculateSum(){
        int[] data = this.data.retrieveAllData();
        int sum = 0;
        for(int value:data){
            sum += value;
        }
        return sum;
    }
}
