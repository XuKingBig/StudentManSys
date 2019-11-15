package UI.UI;

import UI.UI.MySystemUI;
import studentManSys.BasicOperaService;
import studentManSys.BasicOperaServicelmp;
import POJO.Student;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;


import java.awt.Color;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

    private JPanel LoginPanel;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Login() {
        /**
         * 创建并设置登陆界面主面板
         */
        setTitle("学生成绩管理系统登陆界面（1.0）");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 356);
        setLocationRelativeTo(null);//居中
        /**
         * 创建主布局Panel
         */
        LoginPanel = new JPanel();
        LoginPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
        setContentPane(LoginPanel);
        LoginPanel.setLayout(null);
        /**
         * 添加背景图片到JLabel中
         */
        ImageIcon backimg;
        backimg=new ImageIcon("E:\\JavaECode\\GUIofManagementSystem\\src\\Picture\\Back.jpg");
        /**
         * 创建一个账号标签
         */
        JLabel IDLabel = new JLabel("账  号：");
        IDLabel.setFont(new Font("新宋体", Font.BOLD, 20));
        IDLabel.setForeground(Color.LIGHT_GRAY);
        IDLabel.setBounds(49, 170, 91, 38);
        IDLabel.setOpaque(false);
        LoginPanel.add(IDLabel);
        /**
         * 创建一个密码标签
         */
        JLabel PasswordLabel = new JLabel("密  码：");
        PasswordLabel.setOpaque(false);
        PasswordLabel.setForeground(Color.LIGHT_GRAY);
        PasswordLabel.setFont(new Font("新宋体", Font.BOLD, 20));
        PasswordLabel.setBounds(49, 221, 91, 38);
        LoginPanel.add(PasswordLabel);
        /**
         * 登陆文本框
         */
        final JFormattedTextField idTextField = new JFormattedTextField();
        idTextField.setForeground(Color.LIGHT_GRAY);
        idTextField.setToolTipText("");
        idTextField.setText("请输入您的账号");
        idTextField.setBounds(143, 175, 227, 33);
        //                             添加账号框事件
        idTextField.addMouseListener(new MouseListener() {

            public void mouseReleased(MouseEvent e) {
                // TODO 当用户松开鼠标按钮时发生

            }

            public void mousePressed(MouseEvent e) {
                // TODO 当用户按下鼠标按钮时发生.
                if(idTextField.getText().equals("请输入您的账号"))
                    idTextField.setText(null);
                idTextField.setForeground(Color.BLACK);

            }

            public void mouseExited(MouseEvent e) {
                // TODO 当鼠标离开你所监听的组件时发生.

            }

            public void mouseEntered(MouseEvent e) {
                // TODO  当鼠标离开当前组件并进入你所监听的组件时激活事件.

            }

            public void mouseClicked(MouseEvent e) {
                // TODO 鼠标按下后松开

            }
        });

        LoginPanel.add(idTextField);
        /**
         * 密码框
         */
        passwordField = new JPasswordField();
        passwordField.setBounds(143, 221, 227, 33);
        LoginPanel.add(passwordField);
        /**
         * 登陆按钮
         */
        Button StdBtn = new Button("\u7BA1\u7406\u5458\u767B\u9646");
        StdBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(idTextField.getText().equals("root")&&passwordField.getText().equals("123456")) {
                    /**
                     * 登陆成功后自动关闭登陆界面进入到信息界面
                     */
                    System.out.print("登陆成功");
                    dispose();
                    MySystemUI F=new MySystemUI();
                    F.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null,"账户或密码错误，登陆失败！" ,null, JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        StdBtn.setForeground(Color.DARK_GRAY);
        StdBtn.setFont(new Font("宋体", Font.BOLD, 17));
        StdBtn.setBackground(Color.LIGHT_GRAY);
        StdBtn.setBounds(178, 266, 110, 33);
        LoginPanel.add(StdBtn);
        /**
         * 背景图片的设置
         */
        JLabel BackgroundLabel = new JLabel(backimg);
        BackgroundLabel.setBounds(0, 0, 482, 309);
        LoginPanel.add(BackgroundLabel);

    }
}