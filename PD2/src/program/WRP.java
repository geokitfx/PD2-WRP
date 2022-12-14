package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Choice;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class WRP {

	private JFrame FWRP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WRP window = new WRP();
					window.FWRP.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WRP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// ACSSES ALL J THINGS \\
		JLabel WeaponCategory = new JLabel("Weapon Category");
		JLabel WeaponChoice = new JLabel("Weapon Choice");
		JComboBox WC = new JComboBox();
		JComboBox WCB_Akimbo = new JComboBox();
		JComboBox WCB_AssaultRifle = new JComboBox();
		JComboBox WCB_LightMachineGun = new JComboBox();
		JComboBox WCB_Pistol = new JComboBox();
		JComboBox WCB_ShotgunPrimary = new JComboBox();
		JComboBox WCB_ShotgunSecondary = new JComboBox();
		JComboBox WCB_SniperRifle = new JComboBox();
		JComboBox WCB_SpecialPrimary = new JComboBox();
		JComboBox WCB_SpecialSecondary = new JComboBox();
		JComboBox WCB_SubmachineGun = new JComboBox();
		JButton Change_Weapon_Category = new JButton("Change Weapon Category");
		JButton Change_Weapon = new JButton("Change Weapon");
		JLabel WPN_test = new JLabel("Weapon Test");
		JLabel WPN_Name = new JLabel("Weapon Name:");
		JLabel ID = new JLabel("ID");
		// ACSSES ALL J THINGS \\
		
		FWRP = new JFrame();
		FWRP.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		FWRP.setForeground(Color.BLACK);
		FWRP.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\904365002\\git\\PD2-WRP\\PD2\\src\\program\\logo.png"));
		FWRP.setTitle("Weapon Rebalance Program");
		FWRP.setBounds(100, 100, 1920, 1080);
		FWRP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FWRP.getContentPane().setLayout(null);
		
		ID.setVisible(false);
		ID.setBounds(10, 120, 46, 14);
		FWRP.getContentPane().add(ID);
		
		WPN_Name.setBounds(10, 98, 201, 22);
		FWRP.getContentPane().add(WPN_Name);
		
		WPN_test.setBounds(100, 98, 201, 22);
		FWRP.getContentPane().add(WPN_test);
		
		WeaponCategory.setBounds(10, 1, 201, 22);
		FWRP.getContentPane().add(WeaponCategory);
		
		WeaponChoice.setBounds(10, 50, 201, 22);
		FWRP.getContentPane().add(WeaponChoice);
		
		// JCOMBO BOX GROUP
		WC.setMaximumRowCount(10);
		WC.setModel(new DefaultComboBoxModel(new String[] {"Akimbo", "Assault Rifle", "Light Machine Gun", "Pistol", "Shotgun Primary", "Shotgun Secondary", "Sniper Rifle", "Special Primary", "Special Secondary", "Submachine Gun"}));
		WC.setBounds(10, 26, 201, 22);
		FWRP.getContentPane().add(WC);
		
		WCB_Akimbo.setModel(new DefaultComboBoxModel(new String[] {"Akimbo Bernetti 9", "Brothers Grimm 12G", "Akimbo Castigo .44", "Akimbo Chimano 88", "Akimbo Chimano Compact", "Akimbo Chimano Custom", "Akimbo Compact-5", "Akimbo Contractor", "Akimbo Crosskill", "Akimbo Crosskill Guard", "Akimbo Deagle", "Akimbo Heather", "Akimbo Interceptor 45", "Akimbo Krinkov", "Akimbo Baby Deagle", "Akimbo Bronco .44", "Akimbo Broomstick", "Akimbo Gruber Kurz", "Akimbo LEO", "Akimbo Matever .357", "Akimbo Parabellum", "Akimbo Signature .40", "Akimbo STRYK 18c", "Akimbo White Streak", "Akimbo M13 9mm", "Akimbo Goliath 12G", "Akimbo Judge", "Akimbo Blaster 9mm", "Akimbo Chicago Typewriter", "Akimbo CMP", "Akimbo Cobra", "Akimbo CR 805B", "Akimbo Jackal", "Akimbo Jacket's Piece", "Akimbo Kobus 90", "Akimbo Kross Vertex", "Akimbo Mark 10", "Akimbo Micro Uzi", "Akimbo MP40", "Akimbo Para", "Akimbo Patchett L2A1", "Akimbo Signature", "Akimbo SpecOps", "Akimbo Swedish K", "Akimbo Tatonka", "Akimbo Uzi", "Akimbo Bernetti Auto Pistol", "Akimbo Czech 92 Pistol", "Akimbo Igor Automatik Pistol", "Akimbo Holt 9 mm Pistol", "Akimbo Frenchman Model 87 Revolver", "Akimbo Crosskill Chunky Compact Pistol", "Akimbo AK Gen 21 Tactical", "Akimbo Miyaka 10 Special", "Akimbo K\u00E1ng Arms Model 54", "Akimbo Gecko M2", "Akimbo Kahn .357", "Akimbo VD-12"}));
		WCB_Akimbo.setMaximumRowCount(58);
		WCB_Akimbo.setBounds(10, 76, 201, 22);
		FWRP.getContentPane().add(WCB_Akimbo);

		WCB_AssaultRifle.setModel(new DefaultComboBoxModel(new String[] {"AK", "AK.762", "AK5", "AK17", "AMCAR", "AMR-16", "Bootleg", "CAR-4", "Cavity 9mm", "Clarion", "Commando 553", "Eagle Heavy", "Falcon", "Galant", "Gecko 7.62", "Gewehr 3", "Golden AK.762", "JP36", "Little Friend 7.62", "Lion's Roar", "M308", "Queen's Wrath", "UAR", "Union 5.56", "Valkyria", "Tempest 21", "Ketchnov Byk-1", "KS12 Urban"}));
		WCB_AssaultRifle.setMaximumRowCount(28);
		WCB_AssaultRifle.setBounds(10, 76, 201, 22);
		FWRP.getContentPane().add(WCB_AssaultRifle);
		
		WCB_LightMachineGun.setModel(new DefaultComboBoxModel(new String[] {"Brenner-21", "Buzzsaw 42", "KSP", "KSP 58", "RPK", "M60", "SG Versteckt 51D"}));
		WCB_LightMachineGun.setMaximumRowCount(7);
		WCB_LightMachineGun.setBounds(10, 76, 201, 22);
		FWRP.getContentPane().add(WCB_LightMachineGun);
		
		WCB_Pistol.setModel(new DefaultComboBoxModel(new String[] {"5/7", "Baby Deagle", "Bernetti 9", "Bronco .44", "Broomstick", "Castigo .44", "Chimano 88", "Chimano Compact", "Chimano Custom", "Contractor", "Crosskill", "Crosskill Guard", "Deagle", "Gruber Kurz", "Interceptor 45", "LEO", "Matever .357", "Parabellum", "Peacemaker .45", "Signature .40", "STRYK 18c", "White Streak", "M13 9mm", "Bernetti Auto Pistol", "Czech 92 Pistol", "Igor Automatik Pistol", "Holt 9 mm Pistol", "Frenchman Model 87 Revolver", "Crosskill Chunky Compact Pistol", "K\u00E1ng Arms Model 54", "RUS-12 Angry Tiger", "Gecko M2", "Kahn .357"}));
		WCB_Pistol.setMaximumRowCount(33);
		WCB_Pistol.setBounds(10, 76, 201, 22);
		FWRP.getContentPane().add(WCB_Pistol);
		
		WCB_ShotgunPrimary.setModel(new DefaultComboBoxModel(new String[] {"Breaker 12G", "IZHMA 12G", "Joceline O/U 12G", "M1014", "Mosconi 12G", "Predator 12G", "Raven", "Reinfeld 880", "Steakout 12G", "Reinfeld 88 Shotgun", "Mosconi 12G Tactical Shotgun", "VD-12"}));
		WCB_ShotgunPrimary.setMaximumRowCount(12);
		WCB_ShotgunPrimary.setBounds(10, 76, 201, 22);
		FWRP.getContentPane().add(WCB_ShotgunPrimary);
		
		WCB_ShotgunSecondary.setModel(new DefaultComboBoxModel(new String[] {"Grimm 12G", "GSPS 12G", "Goliath 12G", "Locomotive 12G", "Street Sweeper", "The Judge", "Claire 12G", "Argos III"}));
		WCB_ShotgunSecondary.setBounds(10, 76, 201, 22);
		FWRP.getContentPane().add(WCB_ShotgunSecondary);
		
		WCB_SniperRifle.setModel(new DefaultComboBoxModel(new String[] {"Contractor .308", "Desertfox", "Grom", "Lebensauger .308", "Nagant", "Platypus 70", "R93", "Rattlesnake", "Repeater 1874", "Thanatos .50 cal", "R700", "Bernetti Rangehitter Sniper Rifle", "K\u00E1ng Arms X1", "Pronghorn"}));
		WCB_SniperRifle.setMaximumRowCount(14);
		WCB_SniperRifle.setBounds(10, 76, 201, 22);
		FWRP.getContentPane().add(WCB_SniperRifle);
		
		WCB_SpecialPrimary.setModel(new DefaultComboBoxModel(new String[] {"Airbow", "English Longbow", "Flamethrower Mk. 1", "GL40 Grenade Launcher", "Heavy Crossbow", "Light Crossbow", "OVE9000 Saw", "Piglet Grenade Launcher", "Plainsrider Bow", "Vulcan Minigun", "XL 5.56 Microgun", "Hailstorm Mk 5"}));
		WCB_SpecialPrimary.setMaximumRowCount(12);
		WCB_SpecialPrimary.setBounds(10, 76, 201, 22);
		FWRP.getContentPane().add(WCB_SpecialPrimary);
		
		WCB_SpecialSecondary.setModel(new DefaultComboBoxModel(new String[] {"Arbiter Grenade launcher", "China Puff 40mm Grenade Launcher", "Commando 101 Rocket Launcher", "Compact 40mm Grenade Launcher", "HRL-7 Rocket Launcher", "OVE9000 Saw", "Pistol Crossbow", "MA-17 Flamethrower", "Basilisk 3V"}));
		WCB_SpecialSecondary.setMaximumRowCount(9);
		WCB_SpecialSecondary.setBounds(10, 76, 201, 22);
		FWRP.getContentPane().add(WCB_SpecialSecondary);
		
		WCB_SubmachineGun.setModel(new DefaultComboBoxModel(new String[] {"Blaster 9mm", "Chicago Typewriter", "CMP", "Cobra", "Compact-5", "CR 805B", "Heather", "Jackal", "Jacket's Piece", "Kobus 90", "Krinkov", "Kross Vertex", "Mark 10", "Micro Uzi", "MP40", "Para", "Patchett L2A1", "SpecOps", "Swedish K", "Tatonka", "Uzi", "Signature", "AK Gen 21 Tactical", "Miyaka 10 Special", "Wasp-DS"}));
		WCB_SubmachineGun.setMaximumRowCount(25);
		WCB_SubmachineGun.setBounds(10, 76, 201, 22);
		FWRP.getContentPane().add(WCB_SubmachineGun);
		// JCOMBO BOX GROUP
		
		// JBUTTON GROUP
		Change_Weapon_Category.setBounds(222, 26, 187, 23);
		FWRP.getContentPane().add(Change_Weapon_Category);
		
		Change_Weapon.setBounds(221, 76, 187, 23);
		FWRP.getContentPane().add(Change_Weapon);
		// JBUTTON GROUP
		
		Change_Weapon_Category.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (WC.getSelectedItem().toString().contains("Akimbo")) {
					WCB_Akimbo.setVisible(true);
					WCB_AssaultRifle.setVisible(false);
					WCB_LightMachineGun.setVisible(false);
					WCB_Pistol.setVisible(false);
					WCB_ShotgunPrimary.setVisible(false);
					WCB_ShotgunSecondary.setVisible(false);
					WCB_SniperRifle.setVisible(false);
					WCB_SpecialPrimary.setVisible(false);
					WCB_SpecialSecondary.setVisible(false);
					WCB_SubmachineGun.setVisible(false);
				} else if (WC.getSelectedItem().toString().contains("Assault Rifle")) {
					WCB_Akimbo.setVisible(false);
					WCB_AssaultRifle.setVisible(true);
					WCB_LightMachineGun.setVisible(false);
					WCB_Pistol.setVisible(false);
					WCB_ShotgunPrimary.setVisible(false);
					WCB_ShotgunSecondary.setVisible(false);
					WCB_SniperRifle.setVisible(false);
					WCB_SpecialPrimary.setVisible(false);
					WCB_SpecialSecondary.setVisible(false);
					WCB_SubmachineGun.setVisible(false);
				} else if (WC.getSelectedItem().toString().contains("Light Machine Gun")) {
					WCB_Akimbo.setVisible(false);
					WCB_AssaultRifle.setVisible(false);
					WCB_LightMachineGun.setVisible(true);
					WCB_Pistol.setVisible(false);
					WCB_ShotgunPrimary.setVisible(false);
					WCB_ShotgunSecondary.setVisible(false);
					WCB_SniperRifle.setVisible(false);
					WCB_SpecialPrimary.setVisible(false);
					WCB_SpecialSecondary.setVisible(false);
					WCB_SubmachineGun.setVisible(false);
				} else if (WC.getSelectedItem().toString().contains("Pistol")) {
					WCB_Akimbo.setVisible(false);
					WCB_AssaultRifle.setVisible(false);
					WCB_LightMachineGun.setVisible(false);
					WCB_Pistol.setVisible(true);
					WCB_ShotgunPrimary.setVisible(false);
					WCB_ShotgunSecondary.setVisible(false);
					WCB_SniperRifle.setVisible(false);
					WCB_SpecialPrimary.setVisible(false);
					WCB_SpecialSecondary.setVisible(false);
					WCB_SubmachineGun.setVisible(false);
				} else if (WC.getSelectedItem().toString().contains("Shotgun Primary")) {
					WCB_Akimbo.setVisible(false);
					WCB_AssaultRifle.setVisible(false);
					WCB_LightMachineGun.setVisible(false);
					WCB_Pistol.setVisible(false);
					WCB_ShotgunPrimary.setVisible(true);
					WCB_ShotgunSecondary.setVisible(false);
					WCB_SniperRifle.setVisible(false);
					WCB_SpecialPrimary.setVisible(false);
					WCB_SpecialSecondary.setVisible(false);
					WCB_SubmachineGun.setVisible(false);
				} else if (WC.getSelectedItem().toString().contains("Shotgun Secondary")) {
					WCB_Akimbo.setVisible(false);
					WCB_AssaultRifle.setVisible(false);
					WCB_LightMachineGun.setVisible(false);
					WCB_Pistol.setVisible(false);
					WCB_ShotgunPrimary.setVisible(false);
					WCB_ShotgunSecondary.setVisible(true);
					WCB_SniperRifle.setVisible(false);
					WCB_SpecialPrimary.setVisible(false);
					WCB_SpecialSecondary.setVisible(false);
					WCB_SubmachineGun.setVisible(false);
				} else if (WC.getSelectedItem().toString().contains("Sniper Rifle")) {
					WCB_Akimbo.setVisible(false);
					WCB_AssaultRifle.setVisible(false);
					WCB_LightMachineGun.setVisible(false);
					WCB_Pistol.setVisible(false);
					WCB_ShotgunPrimary.setVisible(false);
					WCB_ShotgunSecondary.setVisible(false);
					WCB_SniperRifle.setVisible(true);
					WCB_SpecialPrimary.setVisible(false);
					WCB_SpecialSecondary.setVisible(false);
					WCB_SubmachineGun.setVisible(false);
				} else if (WC.getSelectedItem().toString().contains("Special Primary")) {
					WCB_Akimbo.setVisible(false);
					WCB_AssaultRifle.setVisible(false);
					WCB_LightMachineGun.setVisible(false);
					WCB_Pistol.setVisible(false);
					WCB_ShotgunPrimary.setVisible(false);
					WCB_ShotgunSecondary.setVisible(false);
					WCB_SniperRifle.setVisible(false);
					WCB_SpecialPrimary.setVisible(true);
					WCB_SpecialSecondary.setVisible(false);
					WCB_SubmachineGun.setVisible(false);
				} else if (WC.getSelectedItem().toString().contains("Special Secondary")) {
					WCB_Akimbo.setVisible(false);
					WCB_AssaultRifle.setVisible(false);
					WCB_LightMachineGun.setVisible(false);
					WCB_Pistol.setVisible(false);
					WCB_ShotgunPrimary.setVisible(false);
					WCB_ShotgunSecondary.setVisible(false);
					WCB_SniperRifle.setVisible(false);
					WCB_SpecialPrimary.setVisible(false);
					WCB_SpecialSecondary.setVisible(true);
					WCB_SubmachineGun.setVisible(false);
				} else if (WC.getSelectedItem().toString().contains("Submachine Gun")) {
					WCB_Akimbo.setVisible(false);
					WCB_AssaultRifle.setVisible(false);
					WCB_LightMachineGun.setVisible(false);
					WCB_Pistol.setVisible(false);
					WCB_ShotgunPrimary.setVisible(false);
					WCB_ShotgunSecondary.setVisible(false);
					WCB_SniperRifle.setVisible(false);
					WCB_SpecialPrimary.setVisible(false);
					WCB_SpecialSecondary.setVisible(false);
					WCB_SubmachineGun.setVisible(true);
				}
			}
		});
		
		Change_Weapon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (WC.getSelectedItem().toString().contains("Akimbo")) {
					if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Bernetti 9")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_b92fs");
					}  else if (WCB_Akimbo.getSelectedItem().toString().contains("Brothers Grimm 12G")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Castigo .44")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Chimano 88")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Chimano Compact")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Chimano Custom")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Compact-5")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Contractor")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Crosskill")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Crosskill Guard")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Deagle")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Heather")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Interceptor 45")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Krinkov")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Baby Deagle")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Bronco .44")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Broomstick")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Gruber Kurz")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo LEO")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Matever .357")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Parabellum")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Signature .40")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo STRYK 18c")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo White Streak")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo M13 9mm")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Goliath 12G")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Judge")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Blaster 9mm")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Chicago Typewriter")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo CMP")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Cobra")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo CR 805B")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Jackal")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Jacket's Piece")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Kobus 90")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Kross Vertex")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Mark 10")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Micro Uzi")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo MP40")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Para")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Patchett L2A1")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Signature")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo SpecOps")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Swedish K")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Tatonka")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Uzi")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Bernetti Auto Pistol")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Czech 92 Pistol")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Igor Automatik Pistol")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Holt 9 mm Pistol")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Frenchman Model 87 Revolver")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Crosskill Chunky Compact Pistol")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo AK Gen 21 Tactical")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Miyaka 10 Special")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Káng Arms Model 54")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Gecko M2")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Kahn .357")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo VD-12")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
					}

				} else if (WC.getSelectedItem().toString().contains("Assault Rifle")) {

				} else if (WC.getSelectedItem().toString().contains("Light Machine Gun")) {

				} else if (WC.getSelectedItem().toString().contains("Pistol")) {

				} else if (WC.getSelectedItem().toString().contains("Shotgun Primary")) {

				} else if (WC.getSelectedItem().toString().contains("Shotgun Secondary")) {

				} else if (WC.getSelectedItem().toString().contains("Sniper Rifle")) {

				} else if (WC.getSelectedItem().toString().contains("Special Primary")) {

				} else if (WC.getSelectedItem().toString().contains("Special Secondary")) {

				} else if (WC.getSelectedItem().toString().contains("Submachine Gun")) {

				}
			}
		});
		
	}
}

/*


 */

