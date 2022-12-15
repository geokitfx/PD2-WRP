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
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JSlider;

public class WRP {

	private JFrame FWRP;
	private JTextField CAM;
	private JTextField AM;
	private JTextField FR;
	private JTextField RCL;
	private JTextField DMG;
	private JTextField SPR;

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
		JTextPane Output = new JTextPane();
		Output.setFont(new Font("Arial", Font.PLAIN, 12));
		Output.setEditable(false);
		JButton Change_Weapon_Stats = new JButton("Change Weapon");
		// ACSSES ALL J THINGS \\
		
		FWRP = new JFrame();
		FWRP.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		FWRP.setForeground(Color.BLACK);
		FWRP.setIconImage(Toolkit.getDefaultToolkit().getImage(WRP.class.getResource("/program/logo.png")));
		FWRP.setTitle("Weapon Rebalance Program");
		FWRP.setBounds(100, 100, 1920, 1080);
		FWRP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FWRP.getContentPane().setLayout(null);
		
		// WEAPON LABEL SHET HERE
		ID.setVisible(false);
		
		ID.setBounds(10, 120, 187, 14);
		FWRP.getContentPane().add(ID);
		
		JLabel Weapon_Stats = new JLabel("Weapon Stats");
		Weapon_Stats.setBounds(10, 116, 201, 22);
		FWRP.getContentPane().add(Weapon_Stats);
		
		JLabel Displayed_Stats = new JLabel("Displayed Stats");
		Displayed_Stats.setBounds(10, 131, 201, 22);
		FWRP.getContentPane().add(Displayed_Stats);
		
		JLabel Clip_Ammo_Max_Label = new JLabel("Clip Ammo Max:");
		Clip_Ammo_Max_Label.setBounds(10, 149, 201, 22);
		FWRP.getContentPane().add(Clip_Ammo_Max_Label);
		
		JLabel Ammo_Max_Label = new JLabel("Ammo Max:");
		Ammo_Max_Label.setBounds(10, 170, 201, 22);
		FWRP.getContentPane().add(Ammo_Max_Label);
		
		JLabel Fire_Rate_label = new JLabel("Fire Rate:");
		Fire_Rate_label.setBounds(10, 189, 201, 22);
		FWRP.getContentPane().add(Fire_Rate_label);
		
		JLabel Damage_label = new JLabel("Damage:");
		Damage_label.setBounds(10, 208, 201, 22);
		FWRP.getContentPane().add(Damage_label);
		
		JLabel Spread_label = new JLabel("Spread:");
		Spread_label.setBounds(10, 229, 201, 22);
		FWRP.getContentPane().add(Spread_label);
		
		JLabel Recoil_Label = new JLabel("Recoil:");
		Recoil_Label.setBounds(10, 248, 201, 22);
		FWRP.getContentPane().add(Recoil_Label);
		
		JLabel Concealment_label = new JLabel("Concealment:");
		Concealment_label.setBounds(10, 275, 201, 22);
		FWRP.getContentPane().add(Concealment_label);
		
		JLabel Suppression_Label = new JLabel("Suppression:");
		Suppression_Label.setBounds(10, 324, 201, 22);
		FWRP.getContentPane().add(Suppression_Label);
		
		JLabel Reload_label = new JLabel("Reload Speed:");
		Reload_label.setBounds(10, 373, 201, 22);
		FWRP.getContentPane().add(Reload_label);
		
		WPN_Name.setBounds(10, 98, 201, 22);
		FWRP.getContentPane().add(WPN_Name);
		
		WPN_test.setBounds(100, 98, 201, 22);
		FWRP.getContentPane().add(WPN_test);
		
		WeaponCategory.setBounds(10, 1, 201, 22);
		FWRP.getContentPane().add(WeaponCategory);
		
		WeaponChoice.setBounds(10, 50, 201, 22);
		FWRP.getContentPane().add(WeaponChoice);
		
		// WEAPON LABEL SHET HERE
		
		// STATS HERE
		
		CAM = new JTextField();
		CAM.setToolTipText("Magazine size.");
		CAM.setBounds(110, 150, 124, 20);
		FWRP.getContentPane().add(CAM);
		CAM.setColumns(10);
		
		AM = new JTextField();
		AM.setToolTipText("Total ammo.");
		AM.setColumns(10);
		AM.setBounds(110, 170, 124, 20);
		FWRP.getContentPane().add(AM);
		
		FR = new JTextField();
		FR.setToolTipText("Firerate.");
		FR.setColumns(10);
		FR.setBounds(110, 190, 124, 20);
		FWRP.getContentPane().add(FR);
		
		DMG = new JTextField();
		DMG.setToolTipText("Damage, the maximum vanilla value is 210. \r\nSome weapons, however, mostly sniper rifles and explosives, have a damage multiplier that enables them to raise the damage above 210. \r\nRemember to factor it in if you choose to rebalance these. \r\nAdditionally, changing this stat won't affect the actual damage dealt by explosives. \r\nIn their case, the damage stat exists only for display, and the actual damage is handled by the projectile.");
		DMG.setColumns(10);
		DMG.setBounds(110, 210, 124, 20);
		FWRP.getContentPane().add(DMG);
		
		SPR = new JTextField();
		SPR.setToolTipText("Accuracy, gets multiplied by 4 and 4 is subtracted (for example 10 spread = 36 accuracy).");
		SPR.setColumns(10);
		SPR.setBounds(110, 230, 124, 20);
		FWRP.getContentPane().add(SPR);
		
		RCL = new JTextField();
		RCL.setToolTipText("Stability, gets multiplied by 4 and 4 is subtracted (for example 10 recoil = 36 stability).");
		RCL.setColumns(10);
		RCL.setBounds(110, 250, 124, 20);
		FWRP.getContentPane().add(RCL);
		
		JSlider CON = new JSlider();
		CON.setToolTipText("Concealment. \r\nThe max value is 30, but it can be increased above that with attachments.");
		CON.setSnapToTicks(true);
		CON.setPaintLabels(true);
		CON.setPaintTicks(true);
		CON.setValue(15);
		CON.setMaximum(30);
		CON.setMajorTickSpacing(1);
		CON.setBounds(109, 275, 455, 38);
		FWRP.getContentPane().add(CON);
		
		JSlider SUP = new JSlider();
		SUP.setToolTipText("Threat, the distance on which enemies are suppressed by your gun, meaning they duck and jump for cover. \r\n1 is the maximum value (43), 20 is the minimum value (0).");
		SUP.setSnapToTicks(true);
		SUP.setPaintLabels(true);
		SUP.setPaintTicks(true);
		SUP.setValue(10);
		SUP.setMinimum(1);
		SUP.setMaximum(20);
		SUP.setMajorTickSpacing(1);
		SUP.setBounds(109, 324, 455, 38);
		FWRP.getContentPane().add(SUP);
		
		JSlider RS = new JSlider();
		RS.setToolTipText("The time it takes the weapon to reload. \r\n11 is the default value. Values lower than 11 increase the reload time, down to the minimum value of 1 (doubled reload length). \r\nvalues above 11 decrease the reload time, up to a maximum value of 21 (halved reload length).");
		RS.setSnapToTicks(true);
		RS.setPaintLabels(true);
		RS.setPaintTicks(true);
		RS.setMajorTickSpacing(1);
		RS.setValue(11);
		RS.setMinimum(1);
		RS.setMaximum(21);
		RS.setBounds(109, 374, 455, 38);
		FWRP.getContentPane().add(RS);
		
		// STATS HERE
		
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
		
		Change_Weapon_Stats.setBounds(10, 467, 187, 23);
		FWRP.getContentPane().add(Change_Weapon_Stats);
		// JBUTTON GROUP
		
		Output.setBounds(10, 631, 399, 399);
		FWRP.getContentPane().add(Output);
		
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
						ID.setText("x_basset");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Castigo .44")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_chinchilla");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Chimano 88")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_g17");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Chimano Compact")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("jowi");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Chimano Custom")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_g22c");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Compact-5")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_mp5");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Contractor")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_packrat");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Crosskill")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_1911");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Crosskill Guard")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_shrew");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Deagle")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_deagle");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Heather")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_sr2");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Interceptor 45")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_usp");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Krinkov")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_akmsu");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Baby Deagle")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_sparrow");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Bronco .44")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_rage");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Broomstick")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_c96");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Gruber Kurz")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_ppk");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo LEO")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_hs2000");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Matever .357")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_2006m");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Parabellum")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_breech");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Signature .40")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_p226");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo STRYK 18c")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_g18c");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo White Streak")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_pl14");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo M13 9mm")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_legacy");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Goliath 12G")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_rota");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Judge")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_judge");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Blaster 9mm")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_tec9");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Chicago Typewriter")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_m1928");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo CMP")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_mp9");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Cobra")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_scorpion");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo CR 805B")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_hajk");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Jackal")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_schakal");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Jacket's Piece")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_cobray");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Kobus 90")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_p90");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Kross Vertex")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_polymer");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Mark 10")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_mac10");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Micro Uzi")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_baka");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo MP40")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_erma");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Para")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_olympic");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Patchett L2A1")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_sterling");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Signature")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_shepheard");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo SpecOps")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_mp7");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Swedish K")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_m45");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Tatonka")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_coal");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Uzi")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_uzi");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Bernetti Auto Pistol")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_beer");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Czech 92 Pistol")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_czech");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Igor Automatik Pistol")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_stech");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Holt 9 mm Pistol")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_holt");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Frenchman Model 87 Revolver")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_model3");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Crosskill Chunky Compact Pistol")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_m1911");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo AK Gen 21 Tactical")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_vityaz");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Miyaka 10 Special")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_pm9");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Káng Arms Model 54")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_type54");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Gecko M2")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_maxim9");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo Kahn .357")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_korth");
					} else if (WCB_Akimbo.getSelectedItem().toString().contains("Akimbo VD-12")) {
						WPN_test.setText(WCB_Akimbo.getSelectedItem().toString());
						ID.setText("x_sko12");
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
		
		Change_Weapon_Stats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Output.setText("Displayed stats" + "\n" +
							   "self."+ ID.getText() + ".CLIP_AMMO_MAX = "+ CAM.getText() + "\n" +
						       "self."+ ID.getText() + ".fire_mode_data.fire_rate = 60 / "+ CAM.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.damage = "+ CAM.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.spread = "+ CAM.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.recoil = "+ CAM.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.suppression = "+ CAM.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.concealment = "+ CAM.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.reload = "+ CAM.getText() + "\n" +
						       "\n" +
						       "Hidden stats" + "\n" +
							   "self."+ ID.getText() + ".stats_modifiers = {damage = "+ CAM.getText() + "}" + "\n" +
						       "self."+ ID.getText() + ".AMMO_PICKUP = {"+ CAM.getText() +"," + CAM.getText() + "}"  + "\n" +
						       "self."+ ID.getText() + ".can_shoot_through_enemy = "+ CAM.getText() + "\n" +
						       "self."+ ID.getText() + ".can_shoot_through_wall = "+ CAM.getText() + "\n" +
						       "self."+ ID.getText() + ".can_shoot_through_shield = "+ CAM.getText() + "\n" +
						       "self."+ ID.getText() + ".armor_piercing_chance = "+ CAM.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.alert_size = "+ CAM.getText() + "\n"
							  );
			}
		});
		
	}
}

/*
 */

