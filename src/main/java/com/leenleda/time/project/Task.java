package com.leenleda.time.project;

/**
 * @author pengbenlei
 * @company leenleda
 * @date 2021/1/8 9:21
 * @description
 */
public class Task extends Thread{
    // 执行的刻度 和圈数一起计量 如，1圈后20秒执行
    private int index;
    // 圈数
    private int cycleNum;

    // 多少秒后执行
    private int key;

    /**
     * 任务唯一值
     */
    private int taskId;

    @Override
    public void run() {
    }

    public int getKey() {
        return key;
    }

    /**
     * @param key Delay time(seconds)
     */
    public void setKey(int key) {
        this.key = key;
    }

    public int getCycleNum() {
        return cycleNum;
    }

    public void setCycleNum(int cycleNum) {
        this.cycleNum = cycleNum;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
}
