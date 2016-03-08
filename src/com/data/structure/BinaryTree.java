package com.data.structure;

import java.util.Stack;

/**
 * @author dk
 * @date 2016/1/26
 */
public class BinaryTree {
    private BinaryTree lchild;
    private BinaryTree rchild;
    private Object date;

    public BinaryTree(BinaryTree lchild, BinaryTree rchild, Object date) {
        this.lchild = lchild;
        this.rchild = rchild;
        this.date = date;
    }

   public static void visit(BinaryTree binaryTree){
       System.out.println(binaryTree.date +"");
   }

    public static void pre(BinaryTree root){
        if(root == null) return;
        visit(root);
        if(root.lchild!=null)pre(root.lchild);
        if(root.rchild!=null)pre(root.rchild);
    }

    //�ݹ��������
    public static void in(BinaryTree root) {
        if(root == null)return;
        if(root.lchild != null)in(root.lchild);
        visit(root);
        if(root.rchild != null)in(root.rchild);
    }
    //�ݹ�������
    public static void post(BinaryTree root) {
        if(root == null)return;
        if(root.lchild != null)post(root.lchild);
        if(root.rchild != null)post(root.rchild);
        visit(root);
    }


    //�ǵݹ��������
    public static void preTraverse(BinaryTree root) {
        Stack s = new Stack();
        s.push(root);
        while(!s.isEmpty()) {
            BinaryTree bt = (BinaryTree)s.pop();
            visit(bt);
            if(bt.rchild != null) s.push(bt.rchild);
            if(bt.lchild != null) s.push(bt.lchild);
        }
    }

    //�ǵݹ��������
    public static void inTraverse(BinaryTree root) {
        Stack s = new Stack();
        BinaryTree p = root;
        while(p!=null || !s.isEmpty()) {
            if(p!=null) {
                s.push(p);
                p = p.lchild;
            }
            else {
                p = (BinaryTree)s.pop();
                visit(p);
                p = p.rchild;
            }
        }
    }

    //�ǵݹ�������
    public static void postTraverse(BinaryTree root) {
        Stack s = new Stack();
        BinaryTree p = root;
        //pre��������ջ�Ľڵ㣬�����ж��Ƿ���p�ڵ���Һ��ӣ�����ǵĻ����Ϳ��Է���p�ڵ�
        BinaryTree pre = p;
        //flag����ǳ�ջ���Ǽ��������ӽ�ջ
        boolean flag = true;
        while(p!=null || !s.isEmpty()) {
            if(p!=null && flag) {
                s.push(p);
                p = p.lchild;
            }
            else {
                if(s.isEmpty()) return;
                p = (BinaryTree)s.peek();
                if(p.rchild != null && p.rchild!=pre) {
                    p = p.rchild;
                    flag = true;
                }
                else {
                    p = (BinaryTree)s.pop();
                    visit(p);
                    flag = false;
                    pre = p;
                }
            }
        }
    }

    //�ǵݹ�������2
    public static void postTraverse2(BinaryTree root) {
        Stack s = new Stack();
        BinaryTree p = root;
        //pre��������ջ�Ľڵ㣬�����ж��Ƿ���p�ڵ���Һ��ӣ�����ǵĻ����Ϳ��Է���p�ڵ�
        BinaryTree pre = p;
        while(p!=null || !s.isEmpty()) {
            if(p!=null) {
                s.push(p);
                p = p.lchild;
            }
            else {
                if(s.isEmpty()) return;
                p = (BinaryTree)s.peek();
                if(p.rchild != null && p.rchild!=pre) {
                    p = p.rchild;
                }
                else {
                    p = (BinaryTree)s.pop();
                    visit(p);
                    pre = p;
                    p = null;
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree  G= new BinaryTree(null, null, 'G');
        BinaryTree  H= new BinaryTree(null, null, 'H');
        BinaryTree  J= new BinaryTree(null, null, 'J');
        BinaryTree  I= new BinaryTree(J, null, 'I');
        BinaryTree  F= new BinaryTree(G, H, 'F');
        BinaryTree  D= new BinaryTree(null, F, 'D');
        BinaryTree  E= new BinaryTree(null, null, 'E');
        BinaryTree  B= new BinaryTree(D, E,  'B');
        BinaryTree  C= new BinaryTree(null, I, 'C');
        BinaryTree A = new BinaryTree(B, C, 'A');

        System.out.println("���������������������");
        pre(A);
        System.out.println();

        System.out.println("���������������������");
        in(A);
        System.out.println();

        System.out.println("���������������������");
        post(A);
        System.out.println();

        System.out.println("�ǵݹ����������������������");
        preTraverse(A);
        System.out.println();

        System.out.println("�ǵݹ����������������������");
        inTraverse(A);
        System.out.println();

        System.out.println("�ǵݹ���������������������");
        postTraverse(A);
        System.out.println();

        System.out.println("�ǵݹ�������2��������������");
        postTraverse2(A);
        System.out.println();
    }

}
