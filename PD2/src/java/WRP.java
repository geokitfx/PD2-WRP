package java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.Choice;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

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
		JComboBox WC = new JComboBox();
		WC.setMaximumRowCount(10);
		JLabel WeaponCategory = new JLabel("Weapon Category");
		JLabel WeaponChoice = new JLabel("Weapon Choice");
		JComboBox WeaponChoiceBox = new JComboBox();
		
		FWRP = new JFrame();
		FWRP.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		FWRP.setForeground(Color.BLACK);
		FWRP.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\904365002\\git\\PD2-WRP\\PD2\\src\\java\\logo.png"));
		FWRP.setTitle("Weapon Rebalance Program");
		FWRP.setBounds(100, 100, 1920, 1080);
		FWRP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FWRP.getContentPane().setLayout(null);
		
		WC.setModel(new DefaultComboBoxModel(new String[] {"Akimbo", "Assault Rifle", "Light Machine Gun", "Pistol", "Shotgun Primary", "Shotgun Secondary", "Sniper Rifle", "Special Primary", "Special Secondary", "Submachine Gun"}));
		WC.setBounds(10, 26, 201, 22);
		FWRP.getContentPane().add(WC);
		
		WeaponChoiceBox.setModel(new DefaultComboBoxModel(new String[] {"Akimbo Bernetti 9", "Brothers Grimm 12G", "Akimbo Castigo .44", "Akimbo Chimano 88", "Akimbo Chimano Compact", "Akimbo Chimano Custom", "Akimbo Compact-5", "Akimbo Contractor", "Akimbo Crosskill", "Akimbo Crosskill Guard", "Akimbo Deagle", "Akimbo Heather", "Akimbo Interceptor 45", "Akimbo Krinkov", "Akimbo Baby Deagle", "Akimbo Bronco .44", "Akimbo Broomstick", "Akimbo Gruber Kurz", "Akimbo LEO", "Akimbo Matever .357", "Akimbo Parabellum", "Akimbo Signature .40", "Akimbo STRYK 18c", "Akimbo White Streak", "Akimbo M13 9mm", "Akimbo Goliath 12G", "Akimbo Judge", "Akimbo Blaster 9mm", "Akimbo Chicago Typewriter", "Akimbo CMP", "Akimbo Cobra", "Akimbo CR 805B", "Akimbo Jackal", "Akimbo Jacket's Piece", "Akimbo Kobus 90", "Akimbo Kross Vertex", "Akimbo Mark 10", "Akimbo Micro Uzi", "Akimbo MP40", "Akimbo Para", "Akimbo Patchett L2A1", "Akimbo Signature", "Akimbo SpecOps", "Akimbo Swedish K", "Akimbo Tatonka", "Akimbo Uzi", "Akimbo Bernetti Auto Pistol", "Akimbo Czech 92 Pistol", "Akimbo Igor Automatik Pistol", "Akimbo Holt 9 mm Pistol", "Akimbo Frenchman Model 87 Revolver", "Akimbo Crosskill Chunky Compact Pistol", "Akimbo AK Gen 21 Tactical", "Akimbo Miyaka 10 Special", "Akimbo K\u00E1ng Arms Model 54", "Akimbo Gecko M2", "Akimbo Kahn .357", "Akimbo VD-12", "AK", "AK.762", "AK5", "AK17", "AMCAR", "AMR-16", "Bootleg", "CAR-4", "Cavity 9mm", "Clarion", "Commando 553", "Eagle Heavy", "Falcon", "Galant", "Gecko 7.62", "Gewehr 3", "Golden AK.762", "JP36", "Little Friend 7.62", "Lion's Roar", "M308", "Queen's Wrath", "UAR", "Union 5.56", "Valkyria", "Tempest 21", "Ketchnov Byk-1", "KS12 Urban", "Brenner-21", "Buzzsaw 42", "KSP", "KSP 58", "RPK", "M60", "SG Versteckt 51D", "5/7", "Baby Deagle", "Bernetti 9", "Bronco .44", "Broomstick", "Castigo .44", "Chimano 88", "Chimano Compact", "Chimano Custom", "Contractor", "Crosskill", "Crosskill Guard", "Deagle", "Gruber Kurz", "Interceptor 45", "LEO", "Matever .357", "Parabellum", "Peacemaker .45", "Signature .40", "STRYK 18c", "White Streak", "M13 9mm", "Bernetti Auto Pistol", "Czech 92 Pistol", "Igor Automatik Pistol", "Holt 9 mm Pistol", "Frenchman Model 87 Revolver", "Crosskill Chunky Compact Pistol", "K\u00E1ng Arms Model 54", "RUS-12 Angry Tiger", "Gecko M2", "Kahn .357", "Breaker 12G", "IZHMA 12G", "Joceline O/U 12G", "M1014", "Mosconi 12G", "Predator 12G", "Raven", "Reinfeld 880", "Steakout 12G", "Reinfeld 88 Shotgun", "Mosconi 12G Tactical Shotgun", "VD-12", "Grimm 12G", "GSPS 12G", "Goliath 12G", "Locomotive 12G", "Street Sweeper", "The Judge", "Claire 12G", "Argos III", "Contractor .308", "Desertfox", "Grom", "Lebensauger .308", "Nagant", "Platypus 70", "R93", "Rattlesnake", "Repeater 1874", "Thanatos .50 cal", "R700", "Bernetti Rangehitter Sniper Rifle", "K\u00E1ng Arms X1", "Pronghorn", "Airbow", "English Longbow", "Flamethrower Mk. 1", "GL40 Grenade Launcher", "Heavy Crossbow", "Light Crossbow", "OVE9000 Saw", "Piglet Grenade Launcher", "Plainsrider Bow", "Vulcan Minigun", "XL 5.56 Microgun", "Hailstorm Mk 5", "Arbiter Grenade launcher", "China Puff 40mm Grenade Launcher", "Commando 101 Rocket Launcher", "Compact 40mm Grenade Launcher", "HRL-7 Rocket Launcher", "OVE9000 Saw", "Pistol Crossbow", "MA-17 Flamethrower", "Basilisk 3V", "Blaster 9mm", "Chicago Typewriter", "CMP", "Cobra", "Compact-5", "CR 805B", "Heather", "Jackal", "Jacket's Piece", "Kobus 90", "Krinkov", "Kross Vertex", "Mark 10", "Micro Uzi", "MP40", "Para", "Patchett L2A1", "SpecOps", "Swedish K", "Tatonka", "Uzi", "Signature", "AK Gen 21 Tactical", "Miyaka 10 Special", "Wasp-DS"}));
		WeaponChoiceBox.setMaximumRowCount(206);
		WeaponChoiceBox.setBounds(10, 76, 201, 22);
		FWRP.getContentPane().add(WeaponChoiceBox);
		
		WeaponCategory.setBounds(10, 1, 201, 22);
		FWRP.getContentPane().add(WeaponCategory);
		
		WeaponChoice.setBounds(10, 50, 201, 22);
		FWRP.getContentPane().add(WeaponChoice);
	}
}
