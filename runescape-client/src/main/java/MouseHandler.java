import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("an")
@Implements("MouseHandler")
public class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("MouseHandler_instance")
	public static MouseHandler MouseHandler_instance;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1143719973
	)
	@Export("MouseHandler_x")
	public static int MouseHandler_x;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1974069729
	)
	@Export("MouseHandler_idleCycles")
	public static volatile int MouseHandler_idleCycles;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1364611737
	)
	@Export("MouseHandler_currentButtonVolatile")
	public static volatile int MouseHandler_currentButtonVolatile;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2055178857
	)
	@Export("MouseHandler_xVolatile")
	public static volatile int MouseHandler_xVolatile;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1688755757
	)
	@Export("MouseHandler_yVolatile")
	public static volatile int MouseHandler_yVolatile;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1287204919
	)
	@Export("MouseHandler_y")
	public static int MouseHandler_y;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 7709354002309026339L
	)
	@Export("MouseHandler_lastMovedVolatile")
	public static volatile long MouseHandler_lastMovedVolatile;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -209311199
	)
	@Export("MouseHandler_currentButton")
	public static int MouseHandler_currentButton;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -868233354292084107L
	)
	@Export("MouseHandler_millis")
	public static long MouseHandler_millis;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 865676075
	)
	@Export("MouseHandler_lastButtonVolatile")
	public static volatile int MouseHandler_lastButtonVolatile;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1286436051
	)
	@Export("MouseHandler_lastPressedXVolatile")
	public static volatile int MouseHandler_lastPressedXVolatile;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1010724681
	)
	@Export("MouseHandler_lastPressedYVolatile")
	public static volatile int MouseHandler_lastPressedYVolatile;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 1162908990734194165L
	)
	@Export("MouseHandler_lastPressedTimeMillisVolatile")
	public static volatile long MouseHandler_lastPressedTimeMillisVolatile;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 816171475
	)
	@Export("MouseHandler_lastButton")
	public static int MouseHandler_lastButton;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1831350435
	)
	@Export("MouseHandler_lastPressedX")
	public static int MouseHandler_lastPressedX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1907624927
	)
	@Export("MouseHandler_lastPressedY")
	public static int MouseHandler_lastPressedY;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 2485464938828390509L
	)
	@Export("MouseHandler_lastPressedTimeMillis")
	public static long MouseHandler_lastPressedTimeMillis;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = -559854337
	)
	static int field240;

	static {
		MouseHandler_instance = new MouseHandler(); // L: 15
		MouseHandler_idleCycles = 0; // L: 16
		MouseHandler_currentButtonVolatile = 0; // L: 17
		MouseHandler_xVolatile = -1; // L: 18
		MouseHandler_yVolatile = -1; // L: 19
		MouseHandler_lastMovedVolatile = -1L; // L: 20
		MouseHandler_currentButton = 0; // L: 21
		MouseHandler_x = 0; // L: 22
		MouseHandler_y = 0; // L: 23
		MouseHandler_millis = 0L; // L: 24
		MouseHandler_lastButtonVolatile = 0; // L: 25
		MouseHandler_lastPressedXVolatile = 0; // L: 26
		MouseHandler_lastPressedYVolatile = 0; // L: 27
		MouseHandler_lastPressedTimeMillisVolatile = 0L; // L: 28
		MouseHandler_lastButton = 0; // L: 29
		MouseHandler_lastPressedX = 0; // L: 30
		MouseHandler_lastPressedY = 0; // L: 31
		MouseHandler_lastPressedTimeMillis = 0L; // L: 32
	}

	MouseHandler() {
	} // L: 34

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/event/MouseEvent;I)I",
		garbageValue = "-2147483648"
	)
	@Export("getButton")
	final int getButton(MouseEvent var1) {
		int var2 = var1.getButton(); // L: 55
		if (!var1.isAltDown() && var2 != 2) { // L: 56
			return !var1.isMetaDown() && var2 != 3 ? 1 : 2; // L: 57 58
		} else {
			return 4;
		}
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 103
			MouseHandler_idleCycles = 0; // L: 104
			MouseHandler_xVolatile = var1.getX(); // L: 105
			MouseHandler_yVolatile = var1.getY(); // L: 106
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 107
		}

	} // L: 109

	public final synchronized void mousePressed(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 62
			MouseHandler_idleCycles = 0; // L: 63
			MouseHandler_lastPressedXVolatile = var1.getX(); // L: 64
			MouseHandler_lastPressedYVolatile = var1.getY(); // L: 65
			MouseHandler_lastPressedTimeMillisVolatile = Language.method6232(); // L: 66
			MouseHandler_lastButtonVolatile = this.getButton(var1); // L: 67
			if (MouseHandler_lastButtonVolatile != 0) { // L: 68
				MouseHandler_currentButtonVolatile = MouseHandler_lastButtonVolatile;
			}
		}

		if (var1.isPopupTrigger()) { // L: 70
			var1.consume();
		}

	} // L: 71

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 74
			MouseHandler_idleCycles = 0; // L: 75
			MouseHandler_currentButtonVolatile = 0; // L: 76
		}

		if (var1.isPopupTrigger()) { // L: 78
			var1.consume();
		}

	} // L: 79

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) { // L: 82
			var1.consume();
		}

	} // L: 83

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1); // L: 86
	} // L: 87

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1); // L: 99
	} // L: 100

	public final void focusGained(FocusEvent var1) {
	} // L: 111

	public final synchronized void focusLost(FocusEvent var1) {
		if (MouseHandler_instance != null) { // L: 114
			MouseHandler_currentButtonVolatile = 0;
		}

	} // L: 115

	public final synchronized void mouseExited(MouseEvent var1) {
		if (MouseHandler_instance != null) { // L: 90
			MouseHandler_idleCycles = 0; // L: 91
			MouseHandler_xVolatile = -1; // L: 92
			MouseHandler_yVolatile = -1; // L: 93
			MouseHandler_lastMovedVolatile = var1.getWhen(); // L: 94
		}

	} // L: 96

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "-117"
	)
	static int method603(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) { // L: 2682
			if (class83.guestClanSettings != null) { // L: 2683
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2684
				class230.field2798 = class83.guestClanSettings; // L: 2685
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2687
			}

			return 1; // L: 2688
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) { // L: 2690
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2691
				if (Client.currentClanSettings[var3] != null) { // L: 2692
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2693
					class230.field2798 = Client.currentClanSettings[var3]; // L: 2694
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2696
				}

				return 1; // L: 2697
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) { // L: 2699
				Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = class230.field2798.name; // L: 2700
				return 1; // L: 2701
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) { // L: 2703
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.allowGuests ? 1 : 0; // L: 2704
				return 1; // L: 2705
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) { // L: 2707
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.field1631; // L: 2708
				return 1; // L: 2709
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) { // L: 2711
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.field1632; // L: 2712
				return 1; // L: 2713
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) { // L: 2715
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.field1633; // L: 2716
				return 1; // L: 2717
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) { // L: 2719
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.field1634; // L: 2720
				return 1; // L: 2721
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) { // L: 2723
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.memberCount; // L: 2724
				return 1; // L: 2725
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) { // L: 2727
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2728
				Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = class230.field2798.memberNames[var3]; // L: 2729
				return 1; // L: 2730
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) { // L: 2732
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2733
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.memberRanks[var3]; // L: 2734
				return 1; // L: 2735
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) { // L: 2737
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.bannedMemberCount; // L: 2738
				return 1; // L: 2739
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) { // L: 2741
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2742
				Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = class230.field2798.bannedMemberNames[var3]; // L: 2743
				return 1; // L: 2744
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) { // L: 2746
					Interpreter.Interpreter_intStackSize -= 3; // L: 2747
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2748
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2749
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2750
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.method3149(var3, var6, var5); // L: 2751
					return 1; // L: 2752
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) { // L: 2754
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.currentOwner; // L: 2755
					return 1; // L: 2756
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) { // L: 2758
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.field1643; // L: 2759
					return 1; // L: 2760
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) { // L: 2762
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.method3134(Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]); // L: 2763
					return 1; // L: 2764
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) { // L: 2766
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class230.field2798.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 2767
					return 1; // L: 2768
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) { // L: 2770
					Interpreter.Interpreter_intStackSize -= 2; // L: 2771
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2772
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2773
					class20.method303(var6, var3); // L: 2774
					return 1; // L: 2775
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) { // L: 2777
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2778
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.field1640[var3]; // L: 2779
					return 1; // L: 2780
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) { // L: 2782
						Interpreter.Interpreter_intStackSize -= 3; // L: 2783
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2784
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1; // L: 2785
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2786
						VertexNormal.method4646(var5, var3, var4); // L: 2787
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) { // L: 2789
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2790
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.field2798.field1642[var3] ? 1 : 0; // L: 2791
						return 1; // L: 2792
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) { // L: 2794
						if (MusicPatchPcmStream.guestClanChannel != null) { // L: 2795
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2796
							class387.field4426 = MusicPatchPcmStream.guestClanChannel; // L: 2797
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2799
						}

						return 1; // L: 2800
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) { // L: 2802
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2803
						if (Client.currentClanChannels[var3] != null) { // L: 2804
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2805
							class387.field4426 = Client.currentClanChannels[var3]; // L: 2806
							AbstractUserComparator.field4354 = var3; // L: 2807
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2809
						}

						return 1; // L: 2810
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) { // L: 2812
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = class387.field4426.name; // L: 2813
						return 1; // L: 2814
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) { // L: 2816
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class387.field4426.field1709; // L: 2817
						return 1; // L: 2818
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) { // L: 2820
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class387.field4426.field1711; // L: 2821
						return 1; // L: 2822
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) { // L: 2824
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class387.field4426.method3265(); // L: 2825
						return 1; // L: 2826
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) { // L: 2828
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2829
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class387.field4426.members.get(var3)).username.getName(); // L: 2830
						return 1; // L: 2831
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) { // L: 2833
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2834
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class387.field4426.members.get(var3)).rank; // L: 2835
						return 1; // L: 2836
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) { // L: 2838
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2839
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class387.field4426.members.get(var3)).world; // L: 2840
						return 1; // L: 2841
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) { // L: 2843
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2844
						WorldMapSection0.method5070(AbstractUserComparator.field4354, var3); // L: 2845
						return 1; // L: 2846
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) { // L: 2848
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class387.field4426.method3266(Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]); // L: 2849
						return 1; // L: 2850
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) { // L: 2852
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class387.field4426.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]]; // L: 2853
						return 1; // L: 2854
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) { // L: 2856
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class29.field182 != null ? 1 : 0; // L: 2857
						return 1; // L: 2858
					} else {
						return 2; // L: 2860
					}
				}
			}
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1603294231"
	)
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (FloorOverlayDefinition.loadInterface(var0)) { // L: 11501
			Widget[] var1 = Calendar.Widget_interfaceComponents[var0]; // L: 11502

			for (int var2 = 0; var2 < var1.length; ++var2) { // L: 11503
				Widget var3 = var1[var2]; // L: 11504
				if (var3 != null) { // L: 11505
					var3.modelFrame = 0; // L: 11506
					var3.modelFrameCycle = 0; // L: 11507
				}
			}

		}
	} // L: 11509
}
