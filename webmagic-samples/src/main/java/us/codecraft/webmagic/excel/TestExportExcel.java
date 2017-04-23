package us.codecraft.webmagic.excel;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestExportExcel<T> {


	public static void main(String[] args) {
		// 测试学生
		ExportExcel<RoomInfo> ex = new ExportExcel<RoomInfo>();
		String[] headers = { "URL", "标题", "价格", "房型", "地址" };
		List<RoomInfo> dataset = new ArrayList<RoomInfo>();
		//(String title, String money, String addr, String room, String url)
//		dataset.add(new RoomInfo(10000001, "张三", 20, true, new Date()));
//		dataset.add(new RoomInfo(20000002, "李四", 24, false, new Date()));
//		dataset.add(new RoomInfo(30000003, "王五", 22, true, new Date()));
		try {
			// BufferedInputStream bis = new BufferedInputStream(
			// new FileInputStream("V://book.bmp"));
//			BufferedInputStream bis = new BufferedInputStream(
//					new FileInputStream("C:\\Users\\admin\\Desktop\\excel.bmp"));
//			byte[] buf = new byte[bis.available()];
//			while ((bis.read(buf)) != -1) {
//				//
//			}

			// OutputStream out = new FileOutputStream("E://export2003_a.xls");
			OutputStream out = new FileOutputStream(new File("C:\\Users\\admin\\Desktop\\excel\\export2003_a.xls"),true);
			ex.exportExcel(headers, dataset, out,null,0);
			out.close();
//			JOptionPane.showMessageDialog(null, "导出成功!");
			System.out.println("excel导出成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}