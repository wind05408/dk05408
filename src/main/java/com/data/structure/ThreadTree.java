package com.data.structure;

/**
 * @author dk
 * @date 2016/1/27
 */
public class ThreadTree {
    private BiThrNode root;
    private int size;
    private BiThrNode pre = null;

    public ThreadTree() {
        this.root = null;
        this.size = 0;
        this.pre = null;
    }

    public ThreadTree(int[] data){
        this.pre = null ;
        this.size = data.length ;
        this.root = createTree(data , 1) ;//����������
    }

    public BiThrNode createTree(int[] data,int index){
        if(index>data.length)
            return null;
        BiThrNode node = new BiThrNode(data[index-1]);
        BiThrNode left = createTree(data,2*index);
        BiThrNode right = createTree(data,2*index+1);
        node.setLchild(left);
        node.setRchild(right);
        return node;
    }

    public void initThread(BiThrNode root){
        if(root!=null){
            initThread(root.getLchild());
            if(null==root.getLchild()){
                root.setLtag(true);
                root.setLchild(pre);
            }
            if(pre!=null&&null==pre.getRchild()){
                pre.setRtag(true);
                pre.setRchild(root);
            }
            pre = root;
            initThread(root.getRchild());
        }
    }

    /**
     * �����������������
     * @param root
     */
    public void inThreadList(BiThrNode root){
        if(root != null){
            while(root!=null && !root.isLtag()){//������Ӳ�������
                root = root.getLchild() ;//
            }

            do{
                System.out.print(root.getData() + ",");
                if(root.isRtag()){//����Һ���������
                    root = root.getRchild();
                }else{//���Һ���
                    root = root.getRchild() ;
                    while(root!=null && !root.isLtag()){
                        root = root.getLchild() ;
                    }
                }
            }while(root != null) ;
        }
    }
    /**
     * ��������ݹ��㷨
     * @param root
     */
    public void preList(BiThrNode root){
        if(root != null){
            System.out.print(root.getData() + ",");
            preList(root.getLchild()) ;
            preList(root.getRchild()) ;
        }
    }

    /**
     * �������
     * @param root
     */
    public void inList(BiThrNode root){
        if(root != null){
            inList(root.getLchild()) ;
            System.out.print(root.getData() + ",");
            inList(root.getRchild()) ;
        }
    }

    public BiThrNode getRoot() {
        return root;
    }


    public void setRoot(BiThrNode root) {
        this.root = root;
    }


    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10} ;
        ThreadTree tt = new ThreadTree(data) ;//������ͨ������
        tt.inList(tt.getRoot()) ;//����ݹ����������
        System.out.println("");
        tt.initThread(tt.getRoot());//�������������������������
        tt.inThreadList(tt.getRoot()) ;//�������������������
    }
}
class BiThrNode{
    //ltagΪ0ʱָ��ý������ӣ�Ϊ1ʱָ��ý���ǰ����
    //rtagΪ0ʱָ��ý����Һ��ӣ�Ϊ1ʱָ��ý��ĺ�̡�
    private Object data;
    private BiThrNode lchild;
    private boolean ltag;//�����Ƿ�Ϊ����
    private BiThrNode rchild;
    private boolean rtag;////�Һ����Ƿ�Ϊ����

    public BiThrNode(Object data) {
        this.data = data;
        this.lchild = null ;
        this.ltag = false ;
        this.rchild = null ;
        this.rtag = false ;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BiThrNode getLchild() {
        return lchild;
    }

    public void setLchild(BiThrNode lchild) {
        this.lchild = lchild;
    }

    public boolean isLtag() {
        return ltag;
    }

    public void setLtag(boolean ltag) {
        this.ltag = ltag;
    }

    public BiThrNode getRchild() {
        return rchild;
    }

    public void setRchild(BiThrNode rchild) {
        this.rchild = rchild;
    }

    public boolean isRtag() {
        return rtag;
    }

    public void setRtag(boolean rtag) {
        this.rtag = rtag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BiThrNode)) return false;

        BiThrNode biThrNode = (BiThrNode) o;

        if (ltag != biThrNode.ltag) return false;
        if (rtag != biThrNode.rtag) return false;
        if (data != null ? !data.equals(biThrNode.data) : biThrNode.data != null) return false;
        if (lchild != null ? !lchild.equals(biThrNode.lchild) : biThrNode.lchild != null) return false;
        return !(rchild != null ? !rchild.equals(biThrNode.rchild) : biThrNode.rchild != null);

    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (lchild != null ? lchild.hashCode() : 0);
        result = 31 * result + (ltag ? 1 : 0);
        result = 31 * result + (rchild != null ? rchild.hashCode() : 0);
        result = 31 * result + (rtag ? 1 : 0);
        return result;
    }
}
