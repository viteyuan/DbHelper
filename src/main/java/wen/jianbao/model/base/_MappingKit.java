package wen.jianbao.model.base;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import wen.jianbao.model.Blog;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("blog", "blogId", Blog.class);
	}
}

