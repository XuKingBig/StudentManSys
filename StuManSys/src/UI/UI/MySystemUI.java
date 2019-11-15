package UI.UI;
import POJO.Student;//JIN
//import UI.AddINFUI;
import studentManSys.BasicOperaService;
import studentManSys.BasicOperaServicelmp;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import java.awt.TextField;
import java.util.Vector;
import java.awt.TextArea;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author CAOXI
 *
 */

public class MySystemUI extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private static Object[][]tableobj=new Object[10][50] ;
    private static  DefaultTableModel dtm;

    public MySystemUI() {
        setForeground(Color.WHITE);
        setTitle("\u5B66\u751F\u6210\u7EE9\u7BA1\u7406\u7CFB\u7EDF\u754C\u9762");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1102, 698);
        setLocationRelativeTo(null);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon backimg;
        backimg=new ImageIcon("E:\\JavaECode\\GUIofManagementSystem\\src\\Picture\\System.jpg");

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(122, 0, 974, 650);
        contentPane.add(scrollPane);
        final JTable table = new JTable(1,10);
        table.setCellSelectionEnabled(true);
        table.setColumnSelectionAllowed(true);
        table.setFillsViewportHeight(true);
        table.setRowHeight(30);
        table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        table.setBackground(new Color(255, 255, 153));
        table.setFont(new Font("宋体", Font.PLAIN, 15));
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                        "\u5E8F\u53F7", "  \u5B66 \u53F7", " \u59D3 \u540D", " \u52A0 \u6743 \u6210 \u7EE9", " \u82F1 \u8BED", " \u5386 \u53F2", " \u6570 \u5B66 ", " \u4F53 \u80B2", " \u7ECF\u6D4E\u5B66", " \u7A0E\u6536\u5B66", "   WEB"
                }
        ) {
            /**
             *
             */
            private static final long serialVersionUID = 1L;
            boolean[] columnEditables = new boolean[] {
                    false, false, false, false, false, false, false, false, false, false, false
            };
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });
        table.getColumnModel().getColumn(0).setResizable(false);
        table.getColumnModel().getColumn(0).setPreferredWidth(45);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(1).setPreferredWidth(86);
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(2).setPreferredWidth(86);
        table.getColumnModel().getColumn(3).setResizable(false);
        table.getColumnModel().getColumn(3).setPreferredWidth(114);
        table.getColumnModel().getColumn(4).setResizable(false);
        table.getColumnModel().getColumn(4).setPreferredWidth(86);
        table.getColumnModel().getColumn(5).setResizable(false);
        table.getColumnModel().getColumn(5).setPreferredWidth(86);
        table.getColumnModel().getColumn(6).setResizable(false);
        table.getColumnModel().getColumn(6).setPreferredWidth(86);
        table.getColumnModel().getColumn(7).setResizable(false);
        table.getColumnModel().getColumn(7).setPreferredWidth(86);
        table.getColumnModel().getColumn(8).setResizable(false);
        table.getColumnModel().getColumn(8).setPreferredWidth(86);
        table.getColumnModel().getColumn(9).setResizable(false);
        table.getColumnModel().getColumn(9).setPreferredWidth(86);
        table.getColumnModel().getColumn(10).setResizable(false);
        table.getColumnModel().getColumn(10).setPreferredWidth(86);
        scrollPane.setViewportView(table);

        /**
         * 按钮
         *
         */
        JButton btn_Add = new JButton("\u6DFB  \u52A0");//增加按钮
        btn_Add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //new AddINFUI();

            }
        });
        btn_Add.setToolTipText("\u6DFB\u52A0\u5B66\u751F\u4FE1\u606F");
        btn_Add.setFont(new Font("方正粗黑宋简体", Font.PLAIN, 18));
        btn_Add.setBounds(0, 89, 118, 39);
        contentPane.add(btn_Add);

        JButton btn_Delete = new JButton("\u5220  \u9664");//删除按钮
        btn_Delete.setForeground(new Color(255, 51, 102));
        btn_Delete.setToolTipText("\u6DFB\u52A0\u5B66\u751F\u4FE1\u606F");
        btn_Delete.setFont(new Font("方正粗黑宋简体", Font.PLAIN, 18));
        btn_Delete.setBounds(0, 194, 118, 39);
        contentPane.add(btn_Delete);

        JButton btn_Correct = new JButton("\u4FEE  \u6539");//修改按钮
        btn_Correct.setForeground(new Color(153, 204, 204));
        btn_Correct.setToolTipText("\u6DFB\u52A0\u5B66\u751F\u4FE1\u606F");
        btn_Correct.setFont(new Font("方正粗黑宋简体", Font.PLAIN, 18));
        btn_Correct.setBounds(0, 303, 118, 39);
        contentPane.add(btn_Correct);

        JButton btn_Seek = new JButton("\u67E5  \u627E");//查找按钮
        btn_Seek.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btn_Seek.setForeground(new Color(0, 255, 153));
        btn_Seek.setToolTipText("\u6DFB\u52A0\u5B66\u751F\u4FE1\u606F");
        btn_Seek.setFont(new Font("方正粗黑宋简体", Font.PLAIN, 18));
        btn_Seek.setBounds(0, 412, 118, 39);
        contentPane.add(btn_Seek);

        /**
         * 设置界面背景
         */

        JButton btn_Refresh = new JButton("\u5237 \u65B0");
        btn_Refresh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /**
                 * 刷新Jtable
                 *
                 */
                BasicOperaService std=new BasicOperaServicelmp();
                table.setModel(new DefaultTableModel((Object[][]) std.getData(),new String[] {
                        "\u5E8F\u53F7", "  \u5B66 \u53F7", " \u59D3 \u540D", " \u52A0 \u6743 \u6210 \u7EE9", " \u82F1 \u8BED", " \u5386 \u53F2", " \u6570 \u5B66 ", " \u4F53 \u80B2", " \u7ECF\u6D4E\u5B66", " \u7A0E\u6536\u5B66", "   WEB"
                }));
            }
        });
        btn_Refresh.setToolTipText("\u6DFB\u52A0\u5B66\u751F\u4FE1\u606F");
        btn_Refresh.setForeground(new Color(0, 0, 139));
        btn_Refresh.setFont(new Font("方正粗黑宋简体", Font.PLAIN, 18));
        btn_Refresh.setBounds(0, 519, 118, 39);
        contentPane.add(btn_Refresh);
        JLabel BackLabel = new JLabel(backimg);
        BackLabel.setBackground(new Color(0, 51, 102));
        BackLabel.setBounds(0, 0, 1084, 651);

        contentPane.add(BackLabel);
    }
    public void RefreshTable() {
        /**
         * Jtable刷新函数
         */
		/*table.setModel(//,new String[] {
		"\u5E8F\u53F7", "  \u5B66 \u53F7", " \u59D3 \u540D", " \u52A0 \u6743 \u6210 \u7EE9", " \u82F1 \u8BED", " \u5386 \u53F2", " \u6570 \u5B66 ", " \u4F53 \u80B2", " \u7ECF\u6D4E\u5B66", " \u7A0E\u6536\u5B66", "   WEB"
	});*/
    }

}