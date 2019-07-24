package com.fly.jdbc.cfg;

/**
 * SqlFly在加载过程中的切面事件 
 * @author kong
 *
 */
public interface FlyLoad {

	
	/**
	 * 加载之前执行
	 * @return
	 */
	public boolean loadBefore();
	
	
	/**
	 * 开始加载
	 * @return
	 */
	public boolean load();
	

	/**
	 * 加载之后执行
	 * @return
	 */
	public boolean loadAfter();
	
	
}
