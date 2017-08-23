package com.rayoy.bookcode.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 参数解释:堆最小值-Xms 和和最大值 -Xmx 参数设置一样即可避免堆自动扩展,通过参数-XX:+HeapDumpOnOutOfMemoryError
 * 可以让虚拟机在出现内存溢出异常时Dump出当前的内存堆转存储快照以便时候进行分析.
 */
public class HeapOOM {

	static class OOMObject {
	}

	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();

		while (true) {
			list.add(new OOMObject());
		}
	}
}
