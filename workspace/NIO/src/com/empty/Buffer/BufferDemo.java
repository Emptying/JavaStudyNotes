package com.empty.Buffer;

import java.nio.CharBuffer;

public class BufferDemo {
	/**
	 * 1.capacity 缓冲区容量
	 * 2.limit 界限 位于limit后的数据不可被读写
	 * 3.position 位置 用于指明下一个可被都写得缓冲区位置
	 * 4.mark 指向在0到position之间的位置
	 * 他们的关系
	 * 0<=mark<=position<=limit<=capacity
	 * */

	public static void main(String[] args) {
		//通过allocate方法创建一个capacity为8的CharBuffer
		CharBuffer buff = CharBuffer.allocate(8);
		//查看当前的capacity，limit，position
		//当前
		//capacity:8
		//limit:8
		//position:0
		System.out.println("capacity:"+buff.capacity());
		System.out.println("limit:"+buff.limit());
		System.out.println("position:"+buff.position());
		//放入3个元素
		buff.put('A');
		buff.put('B');
		buff.put('C');
		//position移动到了3的位置
		System.out.println("position:="+buff.position());
		//
		buff.flip();
		//执行flip后limit和position的位置
		//limit = 3
		//position = 0
		System.out.println("flip_limit="+buff.limit());
		System.out.println("flip_position="+buff.position());
		//取出第一个元素
		System.out.println("第一个元素:"+buff.get());
		System.out.println("第一个元素后position:"+buff.position());
		//执行clear后(clear : 为再次向buffer中装入数据做准备)
		buff.clear();
		//limit和position恢复到默认位置
		System.out.println("执行clear后limit:"+buff.limit());//8
		System.out.println("执行clear后position:"+buff.position());//0
		//但是缓冲区并没有被清除
		System.out.println("执行clear后第二个元素:"+buff.get(1));
		//执行绝对读取后的的position还是为0
		System.out.println("执行绝对读取后的的position"+buff.position());
		
		
	}

}
