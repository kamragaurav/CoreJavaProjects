package com.threadgroups;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ThreadGroupsConstructors {
	
	public static void main(String[] args) {
		ThreadGroup group1 = new ThreadGroup("Group1");
		System.out.println(group1.getParent().getName());//main thread group
		ThreadGroup threadGroup = new ThreadGroup(group1, "Group2");
		
		System.out.println(threadGroup.getParent().getName());//Group1 thread group
	}

}
