package view.component;

import javax.swing.*;

import model.Model_NhanVien;
import service.Service;

import java.awt.Font;
import java.awt.Color;

public class Item_khuSach extends JPanel{
	
	private JPanel panel;
	private JLabel lb_nhanVienTruc;
	private JLabel lb_trangThai;
	private JLabel lb_title;
	private Model_NhanVien nhanvien;
	private int quay;
	private JLabel lblNewLabel_2;
	private JLabel lb_ban;

	public Item_khuSach(int quay) {
		this.quay = quay;
		setBackground(new Color(238, 228, 221));
		setSize(280, 280);
		setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 280, 207);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhân viên trực");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 85, 199, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Trạng thái");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 10, 139, 40);
		panel.add(lblNewLabel_1);
		
		lb_trangThai = new JLabel("Không hoạt động");
		lb_trangThai.setIcon(new ImageIcon(Item_khuSach.class.getResource("/images/offline.png")));
		lb_trangThai.setForeground(Color.red);
		lb_trangThai.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_trangThai.setBounds(10, 45, 260, 34);
		panel.add(lb_trangThai);
		
		lb_nhanVienTruc = new JLabel("");
		lb_nhanVienTruc.setIcon(new ImageIcon(Item_khuSach.class.getResource("/images/staff_offline.png")));
		lb_nhanVienTruc.setForeground(new Color(35, 210, 52));
		lb_nhanVienTruc.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_nhanVienTruc.setBounds(10, 115, 260, 34);
		panel.add(lb_nhanVienTruc);
		
		lblNewLabel_2 = new JLabel("Bàn có khách");
		lblNewLabel_2.setIcon(new ImageIcon(Item_khuSach.class.getResource("/images/ban_off.png")));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 159, 205, 38);
		panel.add(lblNewLabel_2);
		
		lb_ban = new JLabel("");
		lb_ban.setFont(new Font("Tahoma", Font.BOLD, 25));
		lb_ban.setBounds(225, 159, 45, 38);
		panel.add(lb_ban);
		
		lb_title = new JLabel("SÁCH GIÁO KHOA");
		lb_title.setForeground(new Color(160, 82, 45));
		lb_title.setHorizontalAlignment(SwingConstants.CENTER);
		lb_title.setFont(new Font("Tahoma", Font.BOLD, 30));
		lb_title.setBounds(0, 206, 280, 54);
		add(lb_title);
	}
	
	public void online(Model_NhanVien nhanvien) {
		this.nhanvien = nhanvien;
		lb_nhanVienTruc.setText(nhanvien.getTen());
		lb_trangThai.setText("Đang hoạt động");
		lb_trangThai.setForeground(new Color(35, 210, 52));
		lb_trangThai.setIcon(new ImageIcon(Item_khuSach.class.getResource("/images/online.png")));
		lb_nhanVienTruc.setIcon(new ImageIcon(Item_khuSach.class.getResource("/images/staff_online.png")));
		lblNewLabel_2.setIcon(new ImageIcon(Item_khuSach.class.getResource("/images/ban_on.png")));
		lb_ban.setForeground(new Color(35, 210, 52));
		lb_ban.setText(Service.getInstance().getMain().getBody().getCuahang().soBan(quay) + "");
	}
	
	public void offline() {
		this.nhanvien = null;
		lb_nhanVienTruc.setText("");
		lb_trangThai.setText("Không hoạt động");
		lb_trangThai.setForeground(Color.RED);
		lb_trangThai.setIcon(new ImageIcon(Item_khuSach.class.getResource("/images/offline.png")));
		lb_nhanVienTruc.setIcon(new ImageIcon(Item_khuSach.class.getResource("/images/staff_offline.png")));
		lblNewLabel_2.setIcon(new ImageIcon(Item_khuSach.class.getResource("/images/ban_off.png")));
		lb_ban.setText("");
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLb_nhanVienTruc() {
		return lb_nhanVienTruc;
	}

	public void setLb_nhanVienTruc(JLabel lb_nhanVienTruc) {
		this.lb_nhanVienTruc = lb_nhanVienTruc;
	}

	public JLabel getLb_trangThai() {
		return lb_trangThai;
	}

	public void setLb_trangThai(JLabel lb_trangThai) {
		this.lb_trangThai = lb_trangThai;
	}

	public JLabel getLb_title() {
		return lb_title;
	}

	public void setLb_title(JLabel lb_title) {
		this.lb_title = lb_title;
	}

	public Model_NhanVien getNhanvien() {
		return nhanvien;
	}

	public int getQuay() {
		return quay;
	}

	public JLabel getLb_ban() {
		return lb_ban;
	}

	public void setLb_ban(JLabel lb_ban) {
		this.lb_ban = lb_ban;
	}
	
	

}
