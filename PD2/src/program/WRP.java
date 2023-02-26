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
import java.awt.SystemColor;

public class WRP {

	private JFrame FWRP;
	private JTextField CAM;
	private JTextField AM;
	private JTextField FR;
	private JTextField RCL;
	private JTextField DMG;
	private JTextField SPR;
	private JTextField SM_DM;
	private JTextField AP_Min;
	private JTextField APC;
	private JTextField AP_Max;
	private JTextField Shotgun_DMG_Near;
	private JTextField Shotgun_DMG_Far;
	private JTextField Shotgun_Rays;

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
		JLabel WPN_test = new JLabel("Weapon Name Place Holder");
		JLabel WPN_Name = new JLabel("Weapon Name:");
		JLabel ID = new JLabel("ID");
		JTextPane Output = new JTextPane();
		Output.setForeground(Color.WHITE);
		Output.setBackground(Color.DARK_GRAY);
		Output.setFont(new Font("Arial", Font.PLAIN, 12));
		Output.setEditable(false);
		JButton Change_Weapon_Stats = new JButton("Commit Weapon Change");
		
		JLabel Shotgun_Exclusive_Stats = new JLabel("Shotgun Exclusive Stats");
		JLabel Shotgun_ES_Near = new JLabel("Damage Near:");
		JLabel Shotgun_ES_Far = new JLabel("Damage Far:");
		JLabel Shotgun_ES_rays = new JLabel("Rays:");
		JTextPane ReloadStatExplanation = new JTextPane();
		ReloadStatExplanation.setEditable(false);
		JTextPane ShotgunRangeExplination = new JTextPane();
		ShotgunRangeExplination.setEditable(false);
		Shotgun_DMG_Near = new JTextField();
		Shotgun_DMG_Far = new JTextField();
		Shotgun_Rays = new JTextField();
		Shotgun_Exclusive_Stats.setVisible(false);
		Shotgun_ES_Near.setVisible(false);
		Shotgun_ES_Far.setVisible(false);
		Shotgun_ES_rays.setVisible(false);
		Shotgun_DMG_Near.setVisible(false);
		Shotgun_DMG_Far.setVisible(false);
		Shotgun_Rays.setVisible(false);
		ShotgunRangeExplination.setVisible(false);
		
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
		
		JLabel Hidden_Stats = new JLabel("Hidden Stats");
		Hidden_Stats.setBounds(244, 131, 201, 22);
		FWRP.getContentPane().add(Hidden_Stats);
		
		JLabel Stats_Modifiers = new JLabel("Damage Multiplier:");
		Stats_Modifiers.setBounds(244, 149, 201, 22);
		FWRP.getContentPane().add(Stats_Modifiers);
		
		JLabel Ammo_Pickup = new JLabel("Ammo Pickup {Minimum, Maximum}:");
		Ammo_Pickup.setBounds(244, 170, 237, 22);
		FWRP.getContentPane().add(Ammo_Pickup);
		
		JLabel Can_Shoot_Through_Enemy = new JLabel("Can Shoot Through Enemy:");
		Can_Shoot_Through_Enemy.setBounds(244, 189, 201, 22);
		FWRP.getContentPane().add(Can_Shoot_Through_Enemy);
		
		JLabel Can_Shoot_Through_Wall = new JLabel("Can Shoot Through Wall:");
		Can_Shoot_Through_Wall.setBounds(244, 208, 201, 22);
		FWRP.getContentPane().add(Can_Shoot_Through_Wall);
		
		JLabel Can_Shoot_Through_Shield = new JLabel("Can Shoot Through Shield:");
		Can_Shoot_Through_Shield.setBounds(244, 229, 201, 22);
		FWRP.getContentPane().add(Can_Shoot_Through_Shield);
		
		JLabel Armor_Piercing_Chance = new JLabel("Armor Piercing Chance:");
		Armor_Piercing_Chance.setToolTipText("1 for always piercing, 0 for no piercing. can be any value inbetween for a chance of piercing.");
		Armor_Piercing_Chance.setBounds(244, 248, 201, 22);
		FWRP.getContentPane().add(Armor_Piercing_Chance);
		
		JLabel Alert_Size = new JLabel("Alert Size:");
		Alert_Size.setBounds(679, 149, 201, 22);
		FWRP.getContentPane().add(Alert_Size);
		
		WPN_Name.setBounds(10, 98, 201, 22);
		FWRP.getContentPane().add(WPN_Name);
		
		WPN_test.setBounds(100, 98, 201, 22);
		FWRP.getContentPane().add(WPN_test);
		
		WeaponCategory.setBounds(10, 1, 201, 22);
		FWRP.getContentPane().add(WeaponCategory);
		
		WeaponChoice.setBounds(10, 50, 201, 22);
		FWRP.getContentPane().add(WeaponChoice);
		
		Shotgun_Exclusive_Stats.setBounds(574, 279, 201, 22);
		FWRP.getContentPane().add(Shotgun_Exclusive_Stats);
		
		Shotgun_ES_Near.setBounds(574, 300, 201, 14);
		FWRP.getContentPane().add(Shotgun_ES_Near);
		
		Shotgun_ES_Far.setBounds(574, 321, 201, 14);
		FWRP.getContentPane().add(Shotgun_ES_Far);
		
		Shotgun_ES_rays.setBounds(574, 342, 201, 14);
		FWRP.getContentPane().add(Shotgun_ES_rays);
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
		DMG.setToolTipText("");
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
		
		JSlider AS = new JSlider();
		AS.setValue(10);
		AS.setToolTipText("The distance at which your gun shots are audible, matters only really in stealth. \r\nSimilarly to suppression, 1 is the maximum value, 20 is the minimum value (the gun is quiet as far as the game is concerned).");
		AS.setSnapToTicks(true);
		AS.setPaintTicks(true);
		AS.setPaintLabels(true);
		AS.setMinimum(1);
		AS.setMaximum(20);
		AS.setMajorTickSpacing(1);
		AS.setBounds(679, 169, 455, 38);
		FWRP.getContentPane().add(AS);
		
		SM_DM = new JTextField();
		SM_DM.setToolTipText("Damage multiplier, used for sniper rifles and the displayed stat of explosives. The weapon damage as defined on the left will be modified by the value put in in place here.");
		SM_DM.setBounds(459, 150, 101, 20);
		FWRP.getContentPane().add(SM_DM);
		SM_DM.setColumns(10);
		
		AP_Min = new JTextField();
		AP_Min.setToolTipText("Ammo pickup is randomized between the two values.");
		AP_Min.setColumns(10);
		AP_Min.setBounds(459, 170, 101, 20);
		FWRP.getContentPane().add(AP_Min);
		
		AP_Max = new JTextField();
		AP_Max.setToolTipText("Ammo pickup is randomized between the two values.");
		AP_Max.setColumns(10);
		AP_Max.setBounds(568, 170, 101, 20);
		FWRP.getContentPane().add(AP_Max);
		
		APC = new JTextField();
		APC.setColumns(10);
		APC.setBounds(459, 250, 101, 20);
		FWRP.getContentPane().add(APC);
		
		Shotgun_DMG_Near.setBounds(656, 300, 119, 20);
		FWRP.getContentPane().add(Shotgun_DMG_Near);
		Shotgun_DMG_Near.setColumns(10);
		
		Shotgun_DMG_Far.setColumns(10);
		Shotgun_DMG_Far.setBounds(656, 321, 119, 20);
		FWRP.getContentPane().add(Shotgun_DMG_Far);
		
		Shotgun_Rays.setColumns(10);
		Shotgun_Rays.setBounds(656, 342, 119, 20);
		FWRP.getContentPane().add(Shotgun_Rays);
		// STATS HERE
		
		// EXPLNATIONS
		JLabel DTAS = new JLabel("Distance table for the Alert Size stat:");
		DTAS.setBounds(414, 631, 243, 22);
		FWRP.getContentPane().add(DTAS);
		
		JLabel DTAS_1 = new JLabel("1 = 300 meters");
		DTAS_1.setBounds(414, 648, 243, 22);
		FWRP.getContentPane().add(DTAS_1);
		
		JLabel DTAS_2 = new JLabel("2 = 200m");
		DTAS_2.setBounds(414, 665, 243, 22);
		FWRP.getContentPane().add(DTAS_2);
		
		JLabel DTAS_3 = new JLabel("3 = 150m");
		DTAS_3.setBounds(414, 681, 243, 22);
		FWRP.getContentPane().add(DTAS_3);
		
		JLabel DTAS_4 = new JLabel("4 = 100m");
		DTAS_4.setBounds(414, 698, 243, 22);
		FWRP.getContentPane().add(DTAS_4);
		
		JLabel DTAS_5 = new JLabel("5 = 75m");
		DTAS_5.setBounds(414, 714, 243, 22);
		FWRP.getContentPane().add(DTAS_5);
		
		JLabel DTAS_6 = new JLabel("6 = 60m");
		DTAS_6.setBounds(414, 731, 243, 22);
		FWRP.getContentPane().add(DTAS_6);
		
		JLabel DTAS_7 = new JLabel("7 = 45m");
		DTAS_7.setBounds(414, 747, 243, 22);
		FWRP.getContentPane().add(DTAS_7);
		
		JLabel DTAS_8 = new JLabel("8 = 40m");
		DTAS_8.setBounds(414, 764, 243, 22);
		FWRP.getContentPane().add(DTAS_8);
		
		JLabel DTAS_9 = new JLabel("9 = 35m");
		DTAS_9.setBounds(414, 780, 243, 22);
		FWRP.getContentPane().add(DTAS_9);
		
		JLabel DTAS_10 = new JLabel("10 = 18m");
		DTAS_10.setBounds(414, 797, 243, 22);
		FWRP.getContentPane().add(DTAS_10);
		
		JLabel DTAS_11 = new JLabel("11 = 15m");
		DTAS_11.setBounds(414, 813, 243, 22);
		FWRP.getContentPane().add(DTAS_11);
		
		JLabel DTAS_12 = new JLabel("12 = 12m");
		DTAS_12.setBounds(414, 830, 243, 22);
		FWRP.getContentPane().add(DTAS_12);
		
		JLabel DTAS_13 = new JLabel("13 = 10m");
		DTAS_13.setBounds(414, 846, 243, 22);
		FWRP.getContentPane().add(DTAS_13);
		
		JLabel DTAS_14 = new JLabel("14 = 8.5m");
		DTAS_14.setBounds(414, 863, 243, 22);
		FWRP.getContentPane().add(DTAS_14);
		
		JLabel DTAS_15 = new JLabel("15 = 7m");
		DTAS_15.setBounds(414, 879, 243, 22);
		FWRP.getContentPane().add(DTAS_15);
		
		JLabel DTAS_16 = new JLabel("16 = 5m");
		DTAS_16.setBounds(414, 896, 243, 22);
		FWRP.getContentPane().add(DTAS_16);
		
		JLabel DTAS_17 = new JLabel("17 = 3.5m");
		DTAS_17.setBounds(414, 912, 243, 22);
		FWRP.getContentPane().add(DTAS_17);
		
		JLabel DTAS_18 = new JLabel("18 = 2m");
		DTAS_18.setBounds(414, 929, 243, 22);
		FWRP.getContentPane().add(DTAS_18);
		
		JLabel DTAS_19 = new JLabel("19 = 1m");
		DTAS_19.setBounds(414, 945, 243, 22);
		FWRP.getContentPane().add(DTAS_19);
		
		JLabel DTAS_20 = new JLabel("20 = 0m");
		DTAS_20.setBounds(414, 962, 243, 22);
		FWRP.getContentPane().add(DTAS_20);
		
		JLabel RSE = new JLabel("Speed table for the Reload Speed stat:");
		RSE.setBounds(667, 631, 243, 22);
		FWRP.getContentPane().add(RSE);
		
		JLabel RSE_1 = new JLabel("1 = 0.5");
		RSE_1.setBounds(667, 648, 243, 22);
		FWRP.getContentPane().add(RSE_1);
		
		JLabel RSE_2 = new JLabel("2 = 0.55");
		RSE_2.setBounds(667, 665, 243, 22);
		FWRP.getContentPane().add(RSE_2);
		
		JLabel RSE_3 = new JLabel("3 = 0.6");
		RSE_3.setBounds(667, 681, 243, 22);
		FWRP.getContentPane().add(RSE_3);
		
		JLabel RSE_4 = new JLabel("4 = 0.65");
		RSE_4.setBounds(667, 698, 243, 22);
		FWRP.getContentPane().add(RSE_4);
		
		JLabel RSE_5 = new JLabel("5 = 0.7");
		RSE_5.setBounds(667, 714, 243, 22);
		FWRP.getContentPane().add(RSE_5);
		
		JLabel RSE_6 = new JLabel("6 = 0.75");
		RSE_6.setBounds(667, 731, 243, 22);
		FWRP.getContentPane().add(RSE_6);
		
		JLabel RSE_7 = new JLabel("7 = 0.8");
		RSE_7.setBounds(667, 747, 243, 22);
		FWRP.getContentPane().add(RSE_7);
		
		JLabel RSE_8 = new JLabel("8 = 0.85");
		RSE_8.setBounds(667, 764, 243, 22);
		FWRP.getContentPane().add(RSE_8);
		
		JLabel RSE_9 = new JLabel("9 = 0.9");
		RSE_9.setBounds(667, 780, 243, 22);
		FWRP.getContentPane().add(RSE_9);
		
		JLabel RSE_10 = new JLabel("10 = 0.95");
		RSE_10.setBounds(667, 797, 243, 22);
		FWRP.getContentPane().add(RSE_10);
		
		JLabel RSE_11 = new JLabel("11 = 1.0");
		RSE_11.setBounds(667, 813, 243, 22);
		FWRP.getContentPane().add(RSE_11);
		
		JLabel RSE_12 = new JLabel("12 = 1.1");
		RSE_12.setBounds(667, 830, 243, 22);
		FWRP.getContentPane().add(RSE_12);
		
		JLabel RSE_13 = new JLabel("13 = 1.2");
		RSE_13.setBounds(667, 846, 243, 22);
		FWRP.getContentPane().add(RSE_13);
		
		JLabel RSE_14 = new JLabel("14 = 1.3");
		RSE_14.setBounds(667, 863, 243, 22);
		FWRP.getContentPane().add(RSE_14);
		
		JLabel RSE_15 = new JLabel("15 = 1.4");
		RSE_15.setBounds(667, 879, 243, 22);
		FWRP.getContentPane().add(RSE_15);
		
		JLabel RSE_16 = new JLabel("16 = 1.5");
		RSE_16.setBounds(667, 896, 243, 22);
		FWRP.getContentPane().add(RSE_16);
		
		JLabel RSE_17 = new JLabel("17 = 1.6");
		RSE_17.setBounds(667, 912, 243, 22);
		FWRP.getContentPane().add(RSE_17);
		
		JLabel RSE_18 = new JLabel("18 = 1.7");
		RSE_18.setBounds(667, 929, 243, 22);
		FWRP.getContentPane().add(RSE_18);
		
		JLabel RSE_19 = new JLabel("19 = 1.8");
		RSE_19.setBounds(667, 945, 243, 22);
		FWRP.getContentPane().add(RSE_19);
		
		JLabel RSE_20 = new JLabel("20 = 1.9");
		RSE_20.setBounds(667, 962, 243, 22);
		FWRP.getContentPane().add(RSE_20);
		
		JLabel RSE_21 = new JLabel("21 = 2.0");
		RSE_21.setBounds(667, 978, 243, 22);
		FWRP.getContentPane().add(RSE_21);
		
		JLabel APC_Note = new JLabel("NOTE: 1 for always piercing, 0 for no piercing. can be any value inbetween for a chance of piercing.");
		APC_Note.setBounds(568, 252, 577, 14);
		FWRP.getContentPane().add(APC_Note);
		
		JLabel NFD_1 = new JLabel("Note for the Damage Stat:");
		NFD_1.setBounds(459, 26, 301, 14);
		FWRP.getContentPane().add(NFD_1);
		
		JLabel NFD_2 = new JLabel("Damage, the maximum vanilla value is 210. ");
		NFD_2.setBounds(459, 38, 301, 14);
		FWRP.getContentPane().add(NFD_2);
		
		JLabel NFD_3 = new JLabel("Some weapons, however, mostly sniper rifles and explosives, have a damage multiplier that enables them to raise the damage above 210. ");
		NFD_3.setBounds(459, 50, 862, 14);
		FWRP.getContentPane().add(NFD_3);
		
		JLabel NFD_4 = new JLabel("Remember to factor it in if you choose to rebalance these. ");
		NFD_4.setBounds(459, 62, 519, 14);
		FWRP.getContentPane().add(NFD_4);
		
		JLabel NFD_5 = new JLabel("Additionally, changing this stat won't affect the actual damage dealt by explosives. ");
		NFD_5.setBounds(459, 74, 540, 14);
		FWRP.getContentPane().add(NFD_5);
		
		JLabel NFD_6 = new JLabel("In their case, the damage stat exists only for display, and the actual damage is handled by the projectile.");
		NFD_6.setBounds(459, 86, 726, 14);
		FWRP.getContentPane().add(NFD_6);
		// EXPLINATIONS
		
		
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
		
		WCB_SniperRifle.setModel(new DefaultComboBoxModel(new String[] {"Contractor .308", "Desertfox", "Grom", "Lebensauger .308", "Nagant", "Platypus 70", "R93", "Rattlesnake", "Repeater 1874", "Thanatos .50 cal", "R700", "Bernetti Rangehitter Sniper Rifle", "K\u00E1ng Arms X1", "Pronghorn", "North Star Sniper Rifle"}));
		WCB_SniperRifle.setMaximumRowCount(15);
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
		
		JComboBox CSTE = new JComboBox();
		CSTE.setToolTipText("True or False.");
		CSTE.setModel(new DefaultComboBoxModel(new String[] {"", "true", "false"}));
		CSTE.setMaximumRowCount(3);
		CSTE.setBounds(459, 190, 101, 22);
		FWRP.getContentPane().add(CSTE);
		
		JComboBox CSTW = new JComboBox();
		CSTW.setToolTipText("True or False.");
		CSTW.setModel(new DefaultComboBoxModel(new String[] {"", "true", "false"}));
		CSTW.setMaximumRowCount(3);
		CSTW.setBounds(459, 210, 101, 22);
		FWRP.getContentPane().add(CSTW);
		
		JComboBox CSTS = new JComboBox();
		CSTS.setToolTipText("True or False.");
		CSTS.setModel(new DefaultComboBoxModel(new String[] {"", "true", "false"}));
		CSTS.setMaximumRowCount(3);
		CSTS.setBounds(459, 230, 101, 22);
		FWRP.getContentPane().add(CSTS);
		// JCOMBO BOX GROUP
		
		// JBUTTON GROUP
		Change_Weapon_Category.setBounds(222, 26, 187, 23);
		FWRP.getContentPane().add(Change_Weapon_Category);
		
		Change_Weapon.setBounds(221, 76, 187, 23);
		FWRP.getContentPane().add(Change_Weapon);
		
		Change_Weapon_Stats.setBounds(10, 423, 187, 23);
		FWRP.getContentPane().add(Change_Weapon_Stats);
		
		JButton Change_Weapon_Stats_Shotgun = new JButton("Commit Weapon Change");
		Change_Weapon_Stats_Shotgun.setBounds(10, 423, 187, 23);
		FWRP.getContentPane().add(Change_Weapon_Stats_Shotgun);
		// JBUTTON GROUP
		
		Output.setBounds(10, 631, 399, 399);
		FWRP.getContentPane().add(Output);
		
		ReloadStatExplanation.setText("Reload stat explanation: you know it's good when an explanation starts with \"because the devs are stupid\". \r\nBut, because the devs are stupid, reload works in a weird way. \r\nIt's split up into two things: the reload timers, which define how much time passes between the press of a button and the refilling of the magazine, and the animation lenght itself, which is not affected by timers. \r\nWhen Overkill introduced speedpull mags, and later decided to rebalance reload times as well, they added a third aspect that tied these two together: the reload stat. \r\nThe reload stat takes the reload timers and the animation lenght and divides them both by the same value, so their speed can be changed. \r\n11 corresponds to a value of 1, meaning both are divided by 1 and essentially unchanged. Values lower than 11 increment this divisor by 0.05, down to the value of 0.5 at 1. \r\nDividing by half is equal to multiplying by 2, so the reload time is doubled. values above 11 increment the divisor by 0.1, up to a value of 2 at 21. \r\nDividing by two halves the reload time. full table below, in case you want to be really precise with how you change the reload times.");
		ReloadStatExplanation.setBackground(new Color(240, 240, 240));
		ReloadStatExplanation.setBounds(920, 631, 862, 369);
		FWRP.getContentPane().add(ReloadStatExplanation);
		
		ShotgunRangeExplination.setText("The distance before any falloff is applied, measured in centimeters (100 = 1m). applies ONLY to shotguns. by default the value is 2000 for all shotguns.\r\nThe distance from the point where falloff is applied to the point where the damage is no longer applied. for example, if damage_near is 300 and damage_far is 300,\r\nthen after 3 meters the damage will start falling off, decreasing gradually with distance, and at 6 meters (300+300=600) the hits will no longer register. \r\nApplies ONLY to shotguns. by default the value is 5000 for all shotguns.\r\nThe amount of pellets shot from the gun. each pellet deals full damage, but only one (per enemy) can apply it - so more pellets don't mean more damage, but more chances to hit. applies ONLY to shotguns.");
		ShotgunRangeExplination.setBackground(new Color(240, 240, 240));
		ShotgunRangeExplination.setBounds(851, 275, 804, 287);
		FWRP.getContentPane().add(ShotgunRangeExplination);
		
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
					//Shotgun stuff
					Change_Weapon_Stats.setVisible(true);
					Change_Weapon_Stats_Shotgun.setVisible(false);
					Shotgun_Exclusive_Stats.setVisible(false);
					Shotgun_ES_Near.setVisible(false);
					Shotgun_ES_Far.setVisible(false);
					Shotgun_ES_rays.setVisible(false);
					Shotgun_DMG_Near.setVisible(false);
					Shotgun_DMG_Far.setVisible(false);
					Shotgun_Rays.setVisible(false);
					ShotgunRangeExplination.setVisible(false);
					//Shotgun stuff
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
					//Shotgun stuff
					Change_Weapon_Stats.setVisible(true);
					Change_Weapon_Stats_Shotgun.setVisible(false);
					Shotgun_Exclusive_Stats.setVisible(false);
					Shotgun_ES_Near.setVisible(false);
					Shotgun_ES_Far.setVisible(false);
					Shotgun_ES_rays.setVisible(false);
					Shotgun_DMG_Near.setVisible(false);
					Shotgun_DMG_Far.setVisible(false);
					Shotgun_Rays.setVisible(false);
					ShotgunRangeExplination.setVisible(false);
					//Shotgun stuff
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
					//Shotgun stuff
					Change_Weapon_Stats.setVisible(true);
					Change_Weapon_Stats_Shotgun.setVisible(false);
					Shotgun_Exclusive_Stats.setVisible(false);
					Shotgun_ES_Near.setVisible(false);
					Shotgun_ES_Far.setVisible(false);
					Shotgun_ES_rays.setVisible(false);
					Shotgun_DMG_Near.setVisible(false);
					Shotgun_DMG_Far.setVisible(false);
					Shotgun_Rays.setVisible(false);
					ShotgunRangeExplination.setVisible(false);
					//Shotgun stuff
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
					//Shotgun stuff
					Change_Weapon_Stats.setVisible(true);
					Change_Weapon_Stats_Shotgun.setVisible(false);
					Shotgun_Exclusive_Stats.setVisible(false);
					Shotgun_ES_Near.setVisible(false);
					Shotgun_ES_Far.setVisible(false);
					Shotgun_ES_rays.setVisible(false);
					Shotgun_DMG_Near.setVisible(false);
					Shotgun_DMG_Far.setVisible(false);
					Shotgun_Rays.setVisible(false);
					ShotgunRangeExplination.setVisible(false);
					//Shotgun stuff
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
					// Shotgun Stuff
					Change_Weapon_Stats.setVisible(false);
					Change_Weapon_Stats_Shotgun.setVisible(true);
					Shotgun_Exclusive_Stats.setVisible(true);
					Shotgun_ES_Near.setVisible(true);
					Shotgun_ES_Far.setVisible(true);
					Shotgun_ES_rays.setVisible(true);
					Shotgun_DMG_Near.setVisible(true);
					Shotgun_DMG_Far.setVisible(true);
					Shotgun_Rays.setVisible(true);
					ShotgunRangeExplination.setVisible(true);
					// Shotgun Stuff
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
					// Shotgun Stuff
					Change_Weapon_Stats.setVisible(false);
					Change_Weapon_Stats_Shotgun.setVisible(true);
					Shotgun_Exclusive_Stats.setVisible(true);
					Shotgun_ES_Near.setVisible(true);
					Shotgun_ES_Far.setVisible(true);
					Shotgun_ES_rays.setVisible(true);
					Shotgun_DMG_Near.setVisible(true);
					Shotgun_DMG_Far.setVisible(true);
					Shotgun_Rays.setVisible(true);
					ShotgunRangeExplination.setVisible(true);
					// Shotgun Stuff
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
					//Shotgun stuff
					Change_Weapon_Stats.setVisible(true);
					Change_Weapon_Stats_Shotgun.setVisible(false);
					Shotgun_Exclusive_Stats.setVisible(false);
					Shotgun_ES_Near.setVisible(false);
					Shotgun_ES_Far.setVisible(false);
					Shotgun_ES_rays.setVisible(false);
					Shotgun_DMG_Near.setVisible(false);
					Shotgun_DMG_Far.setVisible(false);
					Shotgun_Rays.setVisible(false);
					ShotgunRangeExplination.setVisible(false);
					//Shotgun stuff
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
					//Shotgun stuff
					Change_Weapon_Stats.setVisible(true);
					Change_Weapon_Stats_Shotgun.setVisible(false);
					Shotgun_Exclusive_Stats.setVisible(false);
					Shotgun_ES_Near.setVisible(false);
					Shotgun_ES_Far.setVisible(false);
					Shotgun_ES_rays.setVisible(false);
					Shotgun_DMG_Near.setVisible(false);
					Shotgun_DMG_Far.setVisible(false);
					Shotgun_Rays.setVisible(false);
					ShotgunRangeExplination.setVisible(false);
					//Shotgun stuff
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
					//Shotgun stuff
					Change_Weapon_Stats.setVisible(true);
					Change_Weapon_Stats_Shotgun.setVisible(false);
					Shotgun_Exclusive_Stats.setVisible(false);
					Shotgun_ES_Near.setVisible(false);
					Shotgun_ES_Far.setVisible(false);
					Shotgun_ES_rays.setVisible(false);
					Shotgun_DMG_Near.setVisible(false);
					Shotgun_DMG_Far.setVisible(false);
					Shotgun_Rays.setVisible(false);
					ShotgunRangeExplination.setVisible(false);
					//Shotgun stuff
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
					//Shotgun stuff
					Change_Weapon_Stats.setVisible(true);
					Change_Weapon_Stats_Shotgun.setVisible(false);
					Shotgun_Exclusive_Stats.setVisible(false);
					Shotgun_ES_Near.setVisible(false);
					Shotgun_ES_Far.setVisible(false);
					Shotgun_ES_rays.setVisible(false);
					Shotgun_DMG_Near.setVisible(false);
					Shotgun_DMG_Far.setVisible(false);
					Shotgun_Rays.setVisible(false);
					ShotgunRangeExplination.setVisible(false);
					//Shotgun stuff
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
					 if (WCB_AssaultRifle.getSelectedItem().toString().contains("AK")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("ak74");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("AK.762")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("akm");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("AK5")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("ak5");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("AK17")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("flint");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("AMCAR")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("amcar");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("AMR-16")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("m16");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Bootleg")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("tecci");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("CAR-4")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("new_m4");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Cavity 9mm")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("sub2000");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Clarion")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("famas");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Commando 553")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("s552");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Eagle Heavy")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("scar");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Falcon")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("fal");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Galant")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("ching");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Gecko 7.62")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("galil");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Gewehr 3")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("g3");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Golden AK.762")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("akm_gold");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("JP36")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("g36");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Little Friend 7.62")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("contraband");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Lion's Roar")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("vhs");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("M308")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("new_m14");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Queen's Wrath")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("l85a2");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("UAR")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("aug");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Union 5.56")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("corgi");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Valkyria")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("asval");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Tempest 21")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("komodo");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("Ketchnov Byk-1")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("groza");
						} else if (WCB_AssaultRifle.getSelectedItem().toString().contains("KS12 Urban")) {
							WPN_test.setText(WCB_AssaultRifle.getSelectedItem().toString());
							ID.setText("shak12");
						}
				} else if (WC.getSelectedItem().toString().contains("Light Machine Gun")) {
					if (WCB_LightMachineGun.getSelectedItem().toString().contains("Brenner-21")) {
						WPN_test.setText(WCB_LightMachineGun.getSelectedItem().toString());
						ID.setText("hk21");
					} else if (WCB_LightMachineGun.getSelectedItem().toString().contains("Buzzsaw 42")) {
						WPN_test.setText(WCB_LightMachineGun.getSelectedItem().toString());
						ID.setText("mg42");
					} else if (WCB_LightMachineGun.getSelectedItem().toString().contains("KSP")) {
						WPN_test.setText(WCB_LightMachineGun.getSelectedItem().toString());
						ID.setText("m249");
					} else if (WCB_LightMachineGun.getSelectedItem().toString().contains("KSP 58")) {
						WPN_test.setText(WCB_LightMachineGun.getSelectedItem().toString());
						ID.setText("par");
					} else if (WCB_LightMachineGun.getSelectedItem().toString().contains("RPK")) {
						WPN_test.setText(WCB_LightMachineGun.getSelectedItem().toString());
						ID.setText("rpk");
					} else if (WCB_LightMachineGun.getSelectedItem().toString().contains("M60")) {
						WPN_test.setText(WCB_LightMachineGun.getSelectedItem().toString());
						ID.setText("m60");
					} else if (WCB_LightMachineGun.getSelectedItem().toString().contains("SG Versteckt 51D")) {
						WPN_test.setText(WCB_LightMachineGun.getSelectedItem().toString());
						ID.setText("hk51b");
					}
				} else if (WC.getSelectedItem().toString().contains("Pistol")) {
					if (WCB_Pistol.getSelectedItem().toString().contains("5/7")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("lemming");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Baby Deagle")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("sparrow");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Bernetti 9")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("b92fs");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Bronco .44")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("new_raging_bull");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Broomstick")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("c96");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Castigo .44")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("chinchilla");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Chimano 88")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("glock_17");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Chimano Compact")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("g26");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Chimano Custom")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("g22c");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Contractor")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("packrat");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Crosskill")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("colt_1911");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Crosskill Guard")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("shrew");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Deagle")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("deagle");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Gruber Kurz")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("ppk");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Interceptor 45")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("usp");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("LEO")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("hs2000");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Matever .357")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("mateba");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Parabellum")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("breech");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Peacemaker .45")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("peacemaker");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Signature .40")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("p226");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("STRYK 18c")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("glock_18c");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("White Streak")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("pl14");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("M13 9mm")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("legacy");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Bernetti Auto Pistol")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("beer");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Czech 92 Pistol")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("czech");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Igor Automatik Pistol")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("stech");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Holt 9 mm Pistol")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("holt");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Frenchman Model 87 Revolver")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("model3");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Crosskill Chunky Compact Pistol")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("m1911");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Káng Arms Model 54")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("type54");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("RUS-12 Angry Tiger")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("rsh12");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Gecko M2")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("maxim9");
					} else if (WCB_Pistol.getSelectedItem().toString().contains("Kahn .357")) {
						WPN_test.setText(WCB_Pistol.getSelectedItem().toString());
						ID.setText("korth");
					}
				} else if (WC.getSelectedItem().toString().contains("Shotgun Primary")) {
					if (WCB_ShotgunPrimary.getSelectedItem().toString().contains("Breaker 12G")) {
						WPN_test.setText(WCB_ShotgunPrimary.getSelectedItem().toString());
						ID.setText("boot");
					} else if (WCB_ShotgunPrimary.getSelectedItem().toString().contains("IZHMA 12G")) {
						WPN_test.setText(WCB_ShotgunPrimary.getSelectedItem().toString());
						ID.setText("saiga");
					} else if (WCB_ShotgunPrimary.getSelectedItem().toString().contains("Joceline O/U 12G")) {
						WPN_test.setText(WCB_ShotgunPrimary.getSelectedItem().toString());
						ID.setText("b682");
					} else if (WCB_ShotgunPrimary.getSelectedItem().toString().contains("M1014")) {
						WPN_test.setText(WCB_ShotgunPrimary.getSelectedItem().toString());
						ID.setText("benelli");
					} else if (WCB_ShotgunPrimary.getSelectedItem().toString().contains("Mosconi 12G")) {
						WPN_test.setText(WCB_ShotgunPrimary.getSelectedItem().toString());
						ID.setText("huntsman");
					} else if (WCB_ShotgunPrimary.getSelectedItem().toString().contains("Predator 12G")) {
						WPN_test.setText(WCB_ShotgunPrimary.getSelectedItem().toString());
						ID.setText("spas12");
					} else if (WCB_ShotgunPrimary.getSelectedItem().toString().contains("Raven")) {
						WPN_test.setText(WCB_ShotgunPrimary.getSelectedItem().toString());
						ID.setText("ksg");
					} else if (WCB_ShotgunPrimary.getSelectedItem().toString().contains("Reinfeld 880")) {
						WPN_test.setText(WCB_ShotgunPrimary.getSelectedItem().toString());
						ID.setText("r870");
					} else if (WCB_ShotgunPrimary.getSelectedItem().toString().contains("Steakout 12G")) {
						WPN_test.setText(WCB_ShotgunPrimary.getSelectedItem().toString());
						ID.setText("aa12");
					} else if (WCB_ShotgunPrimary.getSelectedItem().toString().contains("Reinfeld 88 Shotgun")) {
						WPN_test.setText(WCB_ShotgunPrimary.getSelectedItem().toString());
						ID.setText("m1897");
					} else if (WCB_ShotgunPrimary.getSelectedItem().toString().contains("Mosconi 12G Tactical Shotgun")) {
						WPN_test.setText(WCB_ShotgunPrimary.getSelectedItem().toString());
						ID.setText("m590");
					} else if (WCB_ShotgunPrimary.getSelectedItem().toString().contains("VD-12")) {
						WPN_test.setText(WCB_ShotgunPrimary.getSelectedItem().toString());
						ID.setText("sko12");
					}
				} else if (WC.getSelectedItem().toString().contains("Shotgun Secondary")) {
					if (WCB_ShotgunSecondary.getSelectedItem().toString().contains("Grimm 12G")) {
						WPN_test.setText(WCB_ShotgunSecondary.getSelectedItem().toString());
						ID.setText("basset");
					} else if (WCB_ShotgunSecondary.getSelectedItem().toString().contains("GSPS 12G")) {
						WPN_test.setText(WCB_ShotgunSecondary.getSelectedItem().toString());
						ID.setText("m37");
					} else if (WCB_ShotgunSecondary.getSelectedItem().toString().contains("Goliath 12G")) {
						WPN_test.setText(WCB_ShotgunSecondary.getSelectedItem().toString());
						ID.setText("rota");
					} else if (WCB_ShotgunSecondary.getSelectedItem().toString().contains("Locomotive 12G")) {
						WPN_test.setText(WCB_ShotgunSecondary.getSelectedItem().toString());
						ID.setText("serbu");
					} else if (WCB_ShotgunSecondary.getSelectedItem().toString().contains("Street Sweeper")) {
						WPN_test.setText(WCB_ShotgunSecondary.getSelectedItem().toString());
						ID.setText("striker");
					} else if (WCB_ShotgunSecondary.getSelectedItem().toString().contains("The Judge")) {
						WPN_test.setText(WCB_ShotgunSecondary.getSelectedItem().toString());
						ID.setText("judge");
					} else if (WCB_ShotgunSecondary.getSelectedItem().toString().contains("Claire 12G")) {
						WPN_test.setText(WCB_ShotgunSecondary.getSelectedItem().toString());
						ID.setText("coach");
					} else if (WCB_ShotgunSecondary.getSelectedItem().toString().contains("Argos III")) {
						WPN_test.setText(WCB_ShotgunSecondary.getSelectedItem().toString());
						ID.setText("ultima");
					}
				} else if (WC.getSelectedItem().toString().contains("Sniper Rifle")) {
					 if (WCB_SniperRifle.getSelectedItem().toString().contains("Contractor .308")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("tti");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("Desertfox")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("desertfox");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("Grom")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("siltstone");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("Lebensauger .308")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("wa2000");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("Nagant")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("mosin");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("Platypus 70")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("model70");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("R93")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("r93");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("Rattlesnake")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("msr");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("Repeater 1874")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("winchester1874");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("Thanatos .50 cal")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("m95");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("R700")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("r700");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("Bernetti Rangehitter Sniper Rifle")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("sbl");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("Káng Arms X1")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("qbu88");
						} else if (WCB_SniperRifle.getSelectedItem().toString().contains("Pronghorn")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("scout");
						}  else if (WCB_SniperRifle.getSelectedItem().toString().contains("North Star Sniper Rifle")) {
							WPN_test.setText(WCB_SniperRifle.getSelectedItem().toString());
							ID.setText("victor");
						}
				} else if (WC.getSelectedItem().toString().contains("Special Primary")) {
					if (WCB_SpecialPrimary.getSelectedItem().toString().contains("Airbow")) {
						WPN_test.setText(WCB_SpecialPrimary.getSelectedItem().toString());
						ID.setText("ecp");
					} else if (WCB_SpecialPrimary.getSelectedItem().toString().contains("English Longbow")) {
						WPN_test.setText(WCB_SpecialPrimary.getSelectedItem().toString());
						ID.setText("long");
					} else if (WCB_SpecialPrimary.getSelectedItem().toString().contains("Flamethrower Mk. 1")) {
						WPN_test.setText(WCB_SpecialPrimary.getSelectedItem().toString());
						ID.setText("flamethrower_mk2");
					} else if (WCB_SpecialPrimary.getSelectedItem().toString().contains("GL40 Grenade Launcher")) {
						WPN_test.setText(WCB_SpecialPrimary.getSelectedItem().toString());
						ID.setText("gre_m79");
					} else if (WCB_SpecialPrimary.getSelectedItem().toString().contains("Heavy Crossbow")) {
						WPN_test.setText(WCB_SpecialPrimary.getSelectedItem().toString());
						ID.setText("arblast");
					} else if (WCB_SpecialPrimary.getSelectedItem().toString().contains("Light Crossbow")) {
						WPN_test.setText(WCB_SpecialPrimary.getSelectedItem().toString());
						ID.setText("frankish");
					} else if (WCB_SpecialPrimary.getSelectedItem().toString().contains("OVE9000 Saw")) {
						WPN_test.setText(WCB_SpecialPrimary.getSelectedItem().toString());
						ID.setText("saw");
					} else if (WCB_SpecialPrimary.getSelectedItem().toString().contains("Piglet Grenade Launcher")) {
						WPN_test.setText(WCB_SpecialPrimary.getSelectedItem().toString());
						ID.setText("m32");
					} else if (WCB_SpecialPrimary.getSelectedItem().toString().contains("Plainsrider Bow")) {
						WPN_test.setText(WCB_SpecialPrimary.getSelectedItem().toString());
						ID.setText("plainsrider");
					} else if (WCB_SpecialPrimary.getSelectedItem().toString().contains("Vulcan Minigun")) {
						WPN_test.setText(WCB_SpecialPrimary.getSelectedItem().toString());
						ID.setText("m134");
					} else if (WCB_SpecialPrimary.getSelectedItem().toString().contains("XL 5.56 Microgun")) {
						WPN_test.setText(WCB_SpecialPrimary.getSelectedItem().toString());
						ID.setText("shuno");
					} else if (WCB_SpecialPrimary.getSelectedItem().toString().contains("Hailstorm Mk 5")) {
						WPN_test.setText(WCB_SpecialPrimary.getSelectedItem().toString());
						ID.setText("hailstorm");
					}
				} else if (WC.getSelectedItem().toString().contains("Special Secondary")) {
					 if (WCB_SpecialSecondary.getSelectedItem().toString().contains("Arbiter Grenade launcher")) {
							WPN_test.setText(WCB_SpecialSecondary.getSelectedItem().toString());
							ID.setText("arbiter");
						} else if (WCB_SpecialSecondary.getSelectedItem().toString().contains("China Puff 40mm Grenade Launcher")) {
							WPN_test.setText(WCB_SpecialSecondary.getSelectedItem().toString());
							ID.setText("china");
						} else if (WCB_SpecialSecondary.getSelectedItem().toString().contains("Commando 101 Rocket Launcher")) {
							WPN_test.setText(WCB_SpecialSecondary.getSelectedItem().toString());
							ID.setText("ray");
						} else if (WCB_SpecialSecondary.getSelectedItem().toString().contains("Compact 40mm Grenade Launcher")) {
							WPN_test.setText(WCB_SpecialSecondary.getSelectedItem().toString());
							ID.setText("slap");
						} else if (WCB_SpecialSecondary.getSelectedItem().toString().contains("HRL-7 Rocket Launcher")) {
							WPN_test.setText(WCB_SpecialSecondary.getSelectedItem().toString());
							ID.setText("rpg7");
						} else if (WCB_SpecialSecondary.getSelectedItem().toString().contains("OVE9000 Saw")) {
							WPN_test.setText(WCB_SpecialSecondary.getSelectedItem().toString());
							ID.setText("saw_secondary");
						} else if (WCB_SpecialSecondary.getSelectedItem().toString().contains("Pistol Crossbow")) {
							WPN_test.setText(WCB_SpecialSecondary.getSelectedItem().toString());
							ID.setText("hunter");
						} else if (WCB_SpecialSecondary.getSelectedItem().toString().contains("MA-17 Flamethrower")) {
							WPN_test.setText(WCB_SpecialSecondary.getSelectedItem().toString());
							ID.setText("system");
						} else if (WCB_SpecialSecondary.getSelectedItem().toString().contains("Basilisk 3V")) {
							WPN_test.setText(WCB_SpecialSecondary.getSelectedItem().toString());
							ID.setText("ms3gl");
						}
				} else if (WC.getSelectedItem().toString().contains("Submachine Gun")) {
					 if (WCB_SubmachineGun.getSelectedItem().toString().contains("Blaster 9mm")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("tec9");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Chicago Typewriter")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("m1928");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("CMP")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("mp9");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Cobra")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("scorpion");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Compact-5")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("new_mp5");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("CR 805B")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("hajk");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Heather")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("sr2");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Jackal")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("schakal");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Jacket's Piece")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("cobray");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Kobus 90")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("p90");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Krinkov")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("akmsu");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Kross Vertex")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("polymer");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Mark 10")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("mac10");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Micro Uzi")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("baka");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("MP40")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("erma");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Para")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("olympic");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Patchett L2A1")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("sterling");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("SpecOps")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("mp7");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Swedish K")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("m45");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Tatonka")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("coal");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Uzi")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("uzi");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Signature")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("shepheard");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("AK Gen 21 Tactical")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("vityaz");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Miyaka 10 Special")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("pm9");
						} else if (WCB_SubmachineGun.getSelectedItem().toString().contains("Wasp-DS")) {
							WPN_test.setText(WCB_SubmachineGun.getSelectedItem().toString());
							ID.setText("fmg9");
						}
				}
			}
		});
		
		Change_Weapon_Stats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Output.setText("--Displayed stats" + "\n" +
							   "self."+ ID.getText() + ".CLIP_AMMO_MAX = "+ CAM.getText() + "\n" +
							   "self."+ ID.getText() + ".AMMO_MAX = "+ AM.getText() + "\n" +
						       "self."+ ID.getText() + ".fire_mode_data.fire_rate = 60 / "+ FR.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.damage = "+ DMG.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.spread = "+ SPR.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.recoil = "+ RCL.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.suppression = "+ SUP.getValue() + "\n" +
						       "self."+ ID.getText() + ".stats.concealment = "+ CON.getValue() + "\n" +
						       "self."+ ID.getText() + ".stats.reload = "+ RS.getValue() + "\n" +
						       "\n" +
						       "--Hidden stats" + "\n" +
							   "self."+ ID.getText() + ".stats_modifiers = {damage = "+ SM_DM.getText() + "}" + "\n" +
						       "self."+ ID.getText() + ".AMMO_PICKUP = {"+ AP_Min.getText() +"," + AP_Max.getText() + "}"  + "\n" +
						       "self."+ ID.getText() + ".can_shoot_through_enemy = "+ CSTE.getSelectedItem().toString() + "\n" +
						       "self."+ ID.getText() + ".can_shoot_through_wall = "+ CSTW.getSelectedItem().toString() + "\n" +
						       "self."+ ID.getText() + ".can_shoot_through_shield = "+ CSTS.getSelectedItem().toString() + "\n" +
						       "self."+ ID.getText() + ".armor_piercing_chance = "+ APC.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.alert_size = "+ AS.getValue() + "\n"
							  );
			}
		});
		
		Change_Weapon_Stats_Shotgun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Output.setText("--Displayed stats" + "\n" +
							   "self."+ ID.getText() + ".CLIP_AMMO_MAX = "+ CAM.getText() + "\n" +
							   "self."+ ID.getText() + ".AMMO_MAX = "+ AM.getText() + "\n" +
						       "self."+ ID.getText() + ".fire_mode_data.fire_rate = 60 / "+ FR.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.damage = "+ DMG.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.spread = "+ SPR.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.recoil = "+ RCL.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.suppression = "+ SUP.getValue() + "\n" +
						       "self."+ ID.getText() + ".stats.concealment = "+ CON.getValue() + "\n" +
						       "self."+ ID.getText() + ".stats.reload = "+ RS.getValue() + "\n" +
						       "\n" +
						       "--Hidden stats" + "\n" +
							   "self."+ ID.getText() + ".stats_modifiers = {damage = "+ SM_DM.getText() + "}" + "\n" +
						       "self."+ ID.getText() + ".AMMO_PICKUP = {"+ AP_Min.getText() +"," + AP_Max.getText() + "}"  + "\n" +
						       "self."+ ID.getText() + ".can_shoot_through_enemy = "+ CSTE.getSelectedItem().toString() + "\n" +
						       "self."+ ID.getText() + ".can_shoot_through_wall = "+ CSTW.getSelectedItem().toString() + "\n" +
						       "self."+ ID.getText() + ".can_shoot_through_shield = "+ CSTS.getSelectedItem().toString() + "\n" +
						       "self."+ ID.getText() + ".armor_piercing_chance = "+ APC.getText() + "\n" +
						       "self."+ ID.getText() + ".stats.alert_size = "+ AS.getValue() + "\n" +
						       "\n" +
						       "--Shotgun Exclusive Stats" + "\n" +
							   "self."+ ID.getText() + ".damage_near = "+ Shotgun_DMG_Near.getText() + "\n" +
						       "self."+ ID.getText() + ".damage_far = "+ Shotgun_DMG_Far.getText() + "\n" +
						       "self."+ ID.getText() + ".rays = "+ Shotgun_Rays.getText() + "\n"
							  );
			}
		});
		
	}
}

/*
 */
