import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class312 {
	@ObfuscatedName("vq")
	@ObfuscatedGetter(
		intValue = 47452049
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = 868756145
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("wj")
	@ObfuscatedGetter(
		intValue = 1865655403
	)
	public static int field792;
	@ObfuscatedName("xm")
	@ObfuscatedSignature(
		descriptor = "Lco;"
	)
	static final ApproximateRouteStrategy field815;
	@ObfuscatedName("xk")
	static int[] field795;
	@ObfuscatedName("xz")
	static int[] field737;
	@ObfuscatedName("wc")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = -1671944719
	)
	static int field720;
	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("DBTableMasterIndex_cache")
	static EvictingDualNodeHashTable DBTableMasterIndex_cache;
	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "Lmb;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = -1401999309
	)
	static int field802;
	@ObfuscatedName("wv")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("archive5")
	static class424 archive5;
	@ObfuscatedName("wz")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("vf")
	static boolean[] field618;
	@ObfuscatedName("wb")
	@ObfuscatedGetter(
		intValue = -1226376575
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	static class476 field803;
	@ObfuscatedName("vm")
	static short field787;
	@ObfuscatedName("vv")
	static short field777;
	@ObfuscatedName("vk")
	static short field759;
	@ObfuscatedName("vr")
	static short field794;
	@ObfuscatedName("va")
	static short field592;
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = 1857793079
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vb")
	static short field791;
	@ObfuscatedName("vw")
	@ObfuscatedGetter(
		intValue = 847600333
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("wy")
	@ObfuscatedGetter(
		intValue = -1411646229
	)
	static int field814;
	@ObfuscatedName("vh")
	@ObfuscatedGetter(
		intValue = -687459409
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vl")
	static int[] field784;
	@ObfuscatedName("vc")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vo")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vn")
	static int[] field783;
	@ObfuscatedName("vs")
	static int[] field785;
	@ObfuscatedName("vj")
	static int[] field771;
	@ObfuscatedName("wu")
	@ObfuscatedSignature(
		descriptor = "[Loc;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wh")
	static List field654;
	@ObfuscatedName("ws")
	@ObfuscatedGetter(
		intValue = -836129535
	)
	static int field619;
	@ObfuscatedName("bg")
	static boolean field631;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -2119372723
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 158752487
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1783227915
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cj")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cn")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1615345771
	)
	static int field521;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -499824195
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1342177981
	)
	static int field657;
	@ObfuscatedName("cu")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -991874195
	)
	public static int field525;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1417535651
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dg")
	static boolean field527;
	@ObfuscatedName("et")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 1238765663
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		longValue = 1980140754930076583L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 640777775
	)
	static int field743;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -1271286263
	)
	static int field532;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		longValue = 604056039982651979L
	)
	static long field533;
	@ObfuscatedName("eb")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 896449927
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 312102811
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = 347271717
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -1673903927
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = -712016263
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1813183945
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 610251460
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -877869888
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 132594496
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ef")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	static class92 field547;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -2110612925
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = 248022457
	)
	static int field549;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1717377099
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 616343285
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gh")
	@ObfuscatedGetter(
		intValue = -843456021
	)
	static int field552;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 765842399
	)
	static int field796;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 759402093
	)
	static int field554;
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	static class139 field555;
	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	static class518 field556;
	@ObfuscatedName("hx")
	static final String field566;
	@ObfuscatedName("hq")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("ig")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "[Ldh;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = 300173975
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ir")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = -714277577
	)
	static int field801;
	@ObfuscatedName("iq")
	static int[] field587;
	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = -809919791
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ic")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("if")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("it")
	static String field557;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 1278223397
	)
	static int field730;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -839774411
	)
	static int field584;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = -598151613
	)
	static int field679;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = 162637255
	)
	static int field586;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = 1128441289
	)
	static int field537;
	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "[Lij;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jz")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jj")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jg")
	static final int[] field591;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -1194079031
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = -1227054453
	)
	static int field593;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 2010514991
	)
	static int field594;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 857433743
	)
	static int field595;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 1907854713
	)
	static int field772;
	@ObfuscatedName("ky")
	static boolean field816;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(
		intValue = 1735736549
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -1244201607
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -1601768337
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 437288283
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 204992847
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 1652689909
	)
	static int field603;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 1752284847
	)
	static int field817;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 2077927661
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1541112681
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -1706009913
	)
	static int field583;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 381616147
	)
	static int field608;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1120345741
	)
	static int field609;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 1667775323
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -427705151
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 463380451
	)
	public static int field624;
	@ObfuscatedName("lt")
	static boolean field613;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 2002218613
	)
	static int field614;
	@ObfuscatedName("lf")
	static boolean field707;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = -1799504205
	)
	static int field616;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 917474073
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = 1233279609
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("lc")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("lb")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("lg")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("ll")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("lm")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("mn")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("mf")
	static int[][] field638;
	@ObfuscatedName("mm")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("mp")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("mw")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 834803823
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -200797859
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 917486313
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = 1250951581
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = 647703879
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = 979968876
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 1218159829
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mv")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -2098245115
	)
	static int field637;
	@ObfuscatedName("mc")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "[Ldf;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = -1017365099
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = 997423737
	)
	static int field641;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		longValue = 4451498081408470985L
	)
	static long field642;
	@ObfuscatedName("ml")
	static boolean field766;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -987204071
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -907081017
	)
	static int field645;
	@ObfuscatedName("nh")
	static int[] field601;
	@ObfuscatedName("na")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("ns")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nc")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ni")
	static int[] defaultRotations;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 2138013585
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "[[[Lod;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nr")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nw")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nn")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nl")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("ny")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = -537932205
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("ou")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("ow")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ok")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("ol")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("oc")
	@Export("menuItemIds")
	static int[] menuItemIds;
	@ObfuscatedName("ov")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("oq")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("oe")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("os")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ot")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ox")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = 54684725
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -636826009
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -2038600311
	)
	static int field675;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 1562297711
	)
	static int field676;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 1575582685
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("oy")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 1130173745
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -365573201
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("pl")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("pa")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 1534184267
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 293764065
	)
	static int field617;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = 689715031
	)
	static int field687;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 1236800007
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pj")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 393003301
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -1955172741
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -2002469019
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = 482282341
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pb")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = 2089718555
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = -1739795111
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pv")
	static boolean field761;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = -1063021957
	)
	static int field648;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 29449565
	)
	static int field703;
	@ObfuscatedName("qx")
	static boolean field809;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -1603358381
	)
	static int field705;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 1790853701
	)
	static int field706;
	@ObfuscatedName("qc")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = 1286236293
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qv")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = 585742461
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("qk")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -677272579
	)
	static int field686;
	@ObfuscatedName("qt")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -637428081
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qe")
	static int[] field715;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = -1379550179
	)
	static int field793;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 1427942765
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 1636769603
	)
	static int field763;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = 1788096061
	)
	static int field719;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(
		intValue = 83672307
	)
	static int field553;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1330146549
	)
	static int field622;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = -1854935939
	)
	static int field721;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = 1153122609
	)
	static int field723;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = -1871498489
	)
	static int field724;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(
		intValue = 472886801
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	static class531 field726;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	static NodeDeque field728;
	@ObfuscatedName("rv")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	static NodeDeque field729;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	static NodeDeque field810;
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = 1703169969
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rl")
	@ObfuscatedGetter(
		intValue = -258246903
	)
	static int field528;
	@ObfuscatedName("rc")
	static boolean[] field718;
	@ObfuscatedName("ro")
	static boolean[] field735;
	@ObfuscatedName("rw")
	static boolean[] field736;
	@ObfuscatedName("rs")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rq")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("re")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rx")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = -1389452585
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		longValue = 5728657505068008691L
	)
	static long field742;
	@ObfuscatedName("rz")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("su")
	static int[] field744;
	@ObfuscatedName("sy")
	@ObfuscatedGetter(
		intValue = 1265363081
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		intValue = -1913638653
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sd")
	static String field747;
	@ObfuscatedName("sl")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -1532136743
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static class213 field750;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static class211 field612;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = -765429031
	)
	static int field752;
	@ObfuscatedName("sf")
	static int[] field753;
	@ObfuscatedName("sw")
	static int[] field754;
	@ObfuscatedName("sa")
	@ObfuscatedGetter(
		longValue = 2460032034323984283L
	)
	static long field650;
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "[Lfx;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("ta")
	@ObfuscatedSignature(
		descriptor = "[Lgh;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = 128103147
	)
	static int field758;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = 1590700353
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tp")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("td")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("te")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = 805422353
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = -1408328319
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = -1469304083
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("th")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tb")
	@ObfuscatedGetter(
		intValue = -620552217
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tj")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tl")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tf")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("tz")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "[Lbc;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uh")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = 2061927751
	)
	static int field755;
	@ObfuscatedName("uv")
	static boolean field775;
	@ObfuscatedName("uz")
	static boolean field797;
	@ObfuscatedName("uy")
	static boolean field782;
	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static class480 field778;
	@ObfuscatedName("ui")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	static class479 field779;
	@ObfuscatedName("up")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	static class479 field643;
	@ObfuscatedName("uo")
	static boolean field781;
	@ObfuscatedName("gu")
	String field697;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	class14 field558;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	class18 field634;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester field560;
	@ObfuscatedName("hp")
	Future field561;
	@ObfuscatedName("hh")
	boolean field562;
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	class18 field563;
	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field564;
	@ObfuscatedName("he")
	Future field565;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	Buffer field569;
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	class7 field570;
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		longValue = 4165547584203049963L
	)
	long field780;

	static {
		field631 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field521 = -1;
		clientType = -1;
		field657 = -1;
		onMobile = false;
		field525 = 215;
		gameState = 0;
		field527 = false;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field743 = -1;
		field532 = -1;
		field533 = -1L;
		hadFocus = true;
		rebootTimer = 0;
		hintArrowType = 0;
		hintArrowNpcIndex = 0;
		hintArrowPlayerIndex = 0;
		hintArrowX = 0;
		hintArrowY = 0;
		hintArrowHeight = 0;
		hintArrowSubX = 0;
		hintArrowSubY = 0;
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		renderSelf = false;
		field547 = class92.field1144;
		js5ConnectState = 0;
		field549 = 0;
		js5Errors = 0;
		loginState = 0;
		field552 = 0;
		field796 = 0;
		field554 = 0;
		field555 = class139.field1629;
		field556 = class518.field5129;
		int var1 = "com_jagex_auth_desktop_osrs:public".length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		field566 = class345.method6646(var2);
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[65536];
		npcCount = 0;
		npcIndices = new int[65536];
		field801 = 0;
		field587 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field730 = 0;
		field584 = 1;
		field679 = 0;
		field586 = 1;
		field537 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field591 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		graphicsCycle = 0;
		field593 = 2301979;
		field594 = 5063219;
		field595 = 3353893;
		field772 = 7759444;
		field816 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		field603 = 0;
		field817 = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field583 = 0;
		field608 = 0;
		field609 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field624 = 0;
		field613 = false;
		field614 = 0;
		field707 = false;
		field616 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field638 = new int[overheadTextLimit][];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		tileLastDrawnActor = new int[104][104];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field637 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field641 = 0;
		field642 = -1L;
		field766 = true;
		drawPlayerNames = 0;
		field645 = 0;
		field601 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuItemIds = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field675 = 0;
		field676 = 50;
		isItemSelected = 0;
		field557 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field617 = 0;
		field687 = -1;
		chatEffects = 0;
		meslayerContinueWidget = null;
		runEnergy = 0;
		weight = 0;
		staffModLevel = 0;
		followerIndex = -1;
		playerMod = false;
		viewportWidget = null;
		clickedWidget = null;
		clickedWidgetParent = null;
		widgetClickX = 0;
		widgetClickY = 0;
		draggedOnWidget = null;
		field761 = false;
		field648 = -1;
		field703 = -1;
		field809 = false;
		field705 = -1;
		field706 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field686 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field715 = new int[32];
		field793 = 0;
		chatCycle = 0;
		field763 = 0;
		field719 = 0;
		field553 = 0;
		field622 = 0;
		field721 = 0;
		field723 = 0;
		field724 = 0;
		mouseWheelRotation = 0;
		field726 = new class531();
		scriptEvents = new NodeDeque();
		field728 = new NodeDeque();
		field729 = new NodeDeque();
		field810 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field528 = -2;
		field718 = new boolean[100];
		field735 = new boolean[100];
		field736 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field742 = 0L;
		isResizable = true;
		field744 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field747 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field750 = new class213();
		field612 = new class211();
		field752 = 0;
		field753 = new int[128];
		field754 = new int[128];
		field650 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field758 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field775 = false;
		field797 = false;
		field782 = false;
		field778 = null;
		field779 = null;
		field643 = null;
		field781 = false;
		field618 = new boolean[5];
		field783 = new int[5];
		field784 = new int[5];
		field785 = new int[5];
		field771 = new int[5];
		field787 = 256;
		field777 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field791 = 1;
		field592 = 32767;
		field759 = 1;
		field794 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field720 = -1;
		field802 = -1;
		field803 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		archive5 = new class424(8, class422.field4609);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		DBTableMasterIndex_cache = new EvictingDualNodeHashTable(64);
		field619 = -1;
		field792 = -1;
		field654 = new ArrayList();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field814 = 0;
		field815 = new ApproximateRouteStrategy();
		field795 = new int[50];
		field737 = new int[50];
	}

	public Client() {
		this.field562 = false;
		this.field780 = -1L;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field742 = class113.method2835() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "72"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			ByteArrayPool.ByteArrayPool_alternativeSizes = var1;
			class125.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			class152.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) {
				class152.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field4557.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field4557);
		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null;
			class125.ByteArrayPool_altSizeArrayCounts = null;
			class152.ByteArrayPool_arrays = null;
			ByteArrayPool.field4557.clear();
			ByteArrayPool.field4557.add(100);
			ByteArrayPool.field4557.add(5000);
			ByteArrayPool.field4557.add(10000);
			ByteArrayPool.field4557.add(30000);
		}

		Login.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class11.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		Varps.currentPort = Login.worldPort;
		class33.field196 = class331.field3605;
		ClanChannel.field1776 = class331.field3604;
		ViewportMouse.field2762 = class331.field3602;
		WorldMapSectionType.field2980 = class331.field3603;
		WorldMapLabel.urlRequester = new class113(this.field562, 215);
		this.setUpKeyboard();
		this.method485();
		MidiPcmStream.mouseWheel = this.mouseWheel();
		this.method481(field612, 0);
		this.method481(field750, 1);
		class158.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		class150.clientPreferences = class126.method2941();
		this.setUpClipboard();
		WorldMapSectionType.method5461(this, class326.field3544);
		RouteStrategy.setWindowedMode(class150.clientPreferences.method2487());
		class177.friendSystem = new FriendSystem(class457.loginType);
		this.field558 = new class14("tokenRequest", 1, 1);
		class102.method2657(this);
		class219.field2388 = new class217[1];
		class215 var4 = class215.field2349;
		class219.field2388[0] = new class217(var4.field2357, var4.field2358);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "443189499"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		BufferedSink.method8158();
		boolean var1 = InterfaceParent.method2276(cycle);
		if (var1 && playingJingle && VerticalAlignment.pcmPlayer1 != null) {
			VerticalAlignment.pcmPlayer1.tryDiscard();
		}

		class105.method2684();
		field750.method4171();
		this.method480();
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}

		if (MidiPcmStream.mouseWheel != null) {
			int var4 = MidiPcmStream.mouseWheel.useRotation();
			mouseWheelRotation = var4;
		}

		if (gameState == 0) {
			Skeleton.method4557();
			HealthBarDefinition.method3672();
		} else if (gameState == 5) {
			FileSystem.loginScreen(this, ItemComposition.fontPlain11, class113.fontPlain12);
			Skeleton.method4557();
			HealthBarDefinition.method3672();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				FileSystem.loginScreen(this, ItemComposition.fontPlain11, class113.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 50) {
				FileSystem.loginScreen(this, ItemComposition.fontPlain11, class113.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				class126.method2939();
			}
		} else {
			FileSystem.loginScreen(this, ItemComposition.fontPlain11, class113.fontPlain12);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-23"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field742 && class113.method2835() > field742) {
			RouteStrategy.setWindowedMode(Huffman.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				field718[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			class395.drawTitle(Calendar.fontBold12, ItemComposition.fontPlain11, class113.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class395.drawTitle(Calendar.fontBold12, ItemComposition.fontPlain11, class113.fontPlain12);
			} else if (gameState == 50) {
				class395.drawTitle(Calendar.fontBold12, ItemComposition.fontPlain11, class113.fontPlain12);
			} else if (gameState == 25) {
				if (field537 == 1) {
					if (field730 > field584) {
						field584 = field730;
					}

					var2 = (field584 * 50 - field730 * 50) / field584;
					Actor.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field537 == 2) {
					if (field679 > field586) {
						field586 = field679;
					}

					var2 = (field586 * 50 - field679 * 50) / field586 + 50;
					Actor.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					Actor.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				Actor.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				Actor.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class395.drawTitle(Calendar.fontBold12, ItemComposition.fontPlain11, class113.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field735[var2]) {
					class156.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field735[var2] = false;
				}
			}
		} else if (gameState > 0) {
			class156.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field735[var2] = false;
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "73"
	)
	@Export("kill0")
	protected final void kill0() {
		if (PendingSpawn.varcs.hasUnwrittenChanges()) {
			PendingSpawn.varcs.write();
		}

		if (class497.mouseRecorder != null) {
			class497.mouseRecorder.isRunning = false;
		}

		class497.mouseRecorder = null;
		packetWriter.close();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		MidiPcmStream.mouseWheel = null;
		if (VerticalAlignment.pcmPlayer1 != null) {
			VerticalAlignment.pcmPlayer1.shutdown();
		}

		class153.field1700.method6853();
		ArchiveDiskAction.method6681();
		if (WorldMapLabel.urlRequester != null) {
			WorldMapLabel.urlRequester.close();
			WorldMapLabel.urlRequester = null;
		}

		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var3 = 0; var3 < JagexCache.field1840; ++var3) {
				class302.JagexCache_idxFiles[var3].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var5) {
		}

		this.field558.method184();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2050335898"
	)
	protected final void vmethod1262() {
	}

	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-57"
	)
	boolean method1267() {
		return class20.field114 != null && !class20.field114.trim().isEmpty() && Script.field1003 != null && !Script.field1003.trim().isEmpty();
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	boolean method1472() {
		return class11.field65 != null && !class11.field65.trim().isEmpty() && Login.field960 != null && !Login.field960.trim().isEmpty();
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1435710939"
	)
	boolean method1777() {
		return this.field560 != null;
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1913894736"
	)
	void method1270(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(BuddyRankComparator.field1477 + "shield/oauth/token" + (new class464(var2)).method8413());
		class420 var4 = new class420();
		var4.method7764(field566);
		var4.method7761("Host", (new URL(BuddyRankComparator.field1477)).getHost());
		var4.method7768(class461.field4777);
		class9 var5 = class9.field43;
		RefreshAccessTokenRequester var6 = this.field564;
		if (var6 != null) {
			this.field565 = var6.request(var5.method73(), var3, var4.method7778(), "");
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field562);
			this.field563 = this.field558.method182(var7);
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "828576760"
	)
	void method1271(String var1) throws IOException {
		URL var2 = new URL(BuddyRankComparator.field1477 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		class420 var3 = new class420();
		var3.method7765(var1);
		class9 var4 = class9.field37;
		OtlTokenRequester var5 = this.field560;
		if (var5 != null) {
			this.field561 = var5.request(var4.method73(), var2, var3.method7778(), "");
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field562);
			this.field634 = this.field558.method182(var6);
		}
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-176461860"
	)
	void method1272(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(BuddyRankComparator.field1477 + "game-session/v1/tokens");
		class10 var4 = new class10(var3, class9.field43, this.field562);
		var4.method85().method7765(var1);
		var4.method85().method7768(class461.field4777);
		JSONObject var5 = new JSONObject();
		var5.method8392("accountId", var2);
		var4.method86(new class463(var5));
		this.field634 = this.field558.method182(var4);
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1086320458"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = class153.field1700.method6858();
			if (!var1) {
				this.method1278();
			}

		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1146125856"
	)
	void method1278() {
		if (class153.field1700.field4318 >= 4) {
			this.error("js5crc");
			class129.updateGameState(1000);
		} else {
			if (class153.field1700.field4298 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					class129.updateGameState(1000);
					return;
				}

				field549 = 3000;
				class153.field1700.field4298 = 3;
			}

			if (--field549 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class303.js5SocketTask = GameEngine.taskHandler.newSocketTask(VarbitComposition.worldHost, Varps.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class303.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class303.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						class147.js5Socket = class310.method6008((Socket)class303.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(215);
						class147.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						class197.field2059 = class113.method2835();
					}

					if (js5ConnectState == 3) {
						if (class147.js5Socket.available() > 0) {
							int var2 = class147.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (class113.method2835() - class197.field2059 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						class153.field1700.method6846(class147.js5Socket, gameState > 20);
						class303.js5SocketTask = null;
						class147.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2025858335"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class303.js5SocketTask = null;
		class147.js5Socket = null;
		js5ConnectState = 0;
		if (Varps.currentPort == Login.worldPort) {
			Varps.currentPort = class11.js5Port;
		} else {
			Varps.currentPort = Login.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				class129.updateGameState(1000);
			} else {
				field549 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			class129.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				class129.updateGameState(1000);
			} else {
				field549 = 3000;
			}
		}

	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (PlayerCompositionColorTextureOverride.field1892 == null && (secureRandomFuture.isDone() || field552 > 250)) {
					PlayerCompositionColorTextureOverride.field1892 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (PlayerCompositionColorTextureOverride.field1892 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					class457.field4771 = null;
					hadNetworkError = false;
					field552 = 0;
					if (field556.method9394()) {
						if (this.method1267()) {
							try {
								this.method1270(Script.field1003);
								BuddyRankComparator.method2912(21);
							} catch (Throwable var25) {
								class317.RunException_sendStackTrace((String)null, var25);
								GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
								return;
							}
						} else {
							if (!this.method1472()) {
								GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
								return;
							}

							try {
								this.method1272(class11.field65, Login.field960);
								BuddyRankComparator.method2912(20);
							} catch (Exception var24) {
								class317.RunException_sendStackTrace((String)null, var24);
								GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
								return;
							}
						}
					} else {
						BuddyRankComparator.method2912(1);
					}
				}
			}

			class20 var27;
			if (loginState == 21) {
				if (this.field565 != null) {
					if (!this.field565.isDone()) {
						return;
					}

					if (this.field565.isCancelled()) {
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
						this.field565 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field565.get();
						if (!var3.isSuccess()) {
							GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
							this.field565 = null;
							return;
						}

						class20.field114 = var3.getAccessToken();
						Script.field1003 = var3.getRefreshToken();
						this.field565 = null;
					} catch (Exception var23) {
						class317.RunException_sendStackTrace((String)null, var23);
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
						this.field565 = null;
						return;
					}
				} else {
					if (this.field563 == null) {
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
						return;
					}

					if (!this.field563.method260()) {
						return;
					}

					if (this.field563.method263()) {
						class317.RunException_sendStackTrace(this.field563.method262(), (Throwable)null);
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
						this.field563 = null;
						return;
					}

					var27 = this.field563.method265();
					if (var27.method284() != 200) {
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
						this.field563 = null;
						return;
					}

					field552 = 0;
					class463 var4 = new class463(var27.method286());

					try {
						class20.field114 = var4.method8398().getString("access_token");
						Script.field1003 = var4.method8398().getString("refresh_token");
					} catch (Exception var22) {
						class317.RunException_sendStackTrace("Error parsing tokens", var22);
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
						this.field563 = null;
						return;
					}
				}

				this.method1271(class20.field114);
				BuddyRankComparator.method2912(20);
			}

			if (loginState == 20) {
				if (this.field561 != null) {
					if (!this.field561.isDone()) {
						return;
					}

					if (this.field561.isCancelled()) {
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
						this.field561 = null;
						return;
					}

					try {
						OtlTokenResponse var28 = (OtlTokenResponse)this.field561.get();
						if (!var28.isSuccess()) {
							GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
							this.field561 = null;
							return;
						}

						this.field697 = var28.getToken();
						this.field561 = null;
					} catch (Exception var21) {
						class317.RunException_sendStackTrace((String)null, var21);
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
						this.field561 = null;
						return;
					}
				} else {
					if (this.field634 == null) {
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
						return;
					}

					if (!this.field634.method260()) {
						return;
					}

					if (this.field634.method263()) {
						class317.RunException_sendStackTrace(this.field634.method262(), (Throwable)null);
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
						this.field634 = null;
						return;
					}

					var27 = this.field634.method265();
					if (var27.method284() != 200) {
						class317.RunException_sendStackTrace("Response code: " + var27.method284() + "Response body: " + var27.method286(), (Throwable)null);
						GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
						this.field634 = null;
						return;
					}

					List var29 = (List)var27.method285().get("Content-Type");
					if (var29 != null && var29.contains(class461.field4777.method8386())) {
						try {
							JSONObject var5 = new JSONObject(var27.method286());
							this.field697 = var5.getString("token");
						} catch (JSONException var20) {
							class317.RunException_sendStackTrace((String)null, var20);
							GrandExchangeOfferTotalQuantityComparator.getLoginError(65);
							this.field634 = null;
							return;
						}
					} else {
						this.field697 = var27.method286();
					}

					this.field634 = null;
				}

				field552 = 0;
				BuddyRankComparator.method2912(1);
			}

			if (loginState == 1) {
				if (class457.field4771 == null) {
					class457.field4771 = GameEngine.taskHandler.newSocketTask(VarbitComposition.worldHost, Varps.currentPort);
				}

				if (class457.field4771.status == 2) {
					throw new IOException();
				}

				if (class457.field4771.status == 1) {
					var1 = class310.method6008((Socket)class457.field4771.result, 40000, 5000);
					packetWriter.setSocket(var1);
					class457.field4771 = null;
					BuddyRankComparator.method2912(2);
				}
			}

			PacketBufferNode var31;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var31 = class130.method3005();
				var31.clientPacket = null;
				var31.clientPacketLength = 0;
				var31.packetBuffer = new PacketBuffer(5000);
				var31.packetBuffer.writeByte(LoginPacket.field3341.id);
				packetWriter.addNode(var31);
				packetWriter.flush();
				var2.offset = 0;
				BuddyRankComparator.method2912(3);
			}

			int var13;
			if (loginState == 3) {
				if (VerticalAlignment.pcmPlayer1 != null) {
					VerticalAlignment.pcmPlayer1.method783();
				}

				if (var1.isAvailable(1)) {
					var13 = var1.readUnsignedByte();
					if (VerticalAlignment.pcmPlayer1 != null) {
						VerticalAlignment.pcmPlayer1.method783();
					}

					if (var13 != 0) {
						GrandExchangeOfferTotalQuantityComparator.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					BuddyRankComparator.method2912(4);
				}
			}

			if (loginState == 4) {
				if (var2.offset < 8) {
					var13 = var1.available();
					if (var13 > 8 - var2.offset) {
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) {
						var1.read(var2.array, var2.offset, var13);
						var2.offset += var13;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					class313.field3479 = var2.readLong();
					BuddyRankComparator.method2912(5);
				}
			}

			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var30 = new PacketBuffer(500);
				int[] var33 = new int[]{PlayerCompositionColorTextureOverride.field1892.nextInt(), PlayerCompositionColorTextureOverride.field1892.nextInt(), PlayerCompositionColorTextureOverride.field1892.nextInt(), PlayerCompositionColorTextureOverride.field1892.nextInt()};
				var30.offset = 0;
				var30.writeByte(1);
				var30.writeInt(var33[0]);
				var30.writeInt(var33[1]);
				var30.writeInt(var33[2]);
				var30.writeInt(var33[3]);
				var30.writeLong(class313.field3479);
				if (gameState == 40) {
					var30.writeInt(GrandExchangeOfferWorldComparator.field4340[0]);
					var30.writeInt(GrandExchangeOfferWorldComparator.field4340[1]);
					var30.writeInt(GrandExchangeOfferWorldComparator.field4340[2]);
					var30.writeInt(GrandExchangeOfferWorldComparator.field4340[3]);
				} else {
					if (gameState == 50) {
						var30.writeByte(class139.field1631.rsOrdinal());
						var30.writeInt(World.field835);
					} else {
						var30.writeByte(field555.rsOrdinal());
						switch(field555.field1632) {
						case 1:
						case 4:
							var30.writeMedium(class424.field4622);
							++var30.offset;
							break;
						case 2:
							var30.offset += 4;
							break;
						case 3:
							var30.writeInt(class150.clientPreferences.method2490(Login.Login_username));
						}
					}

					if (field556.method9394()) {
						var30.writeByte(class518.field5122.rsOrdinal());
						var30.writeStringCp1252NullTerminated(this.field697);
					} else {
						var30.writeByte(class518.field5129.rsOrdinal());
						var30.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var30.encryptRsa(class74.field918, class74.field915);
				GrandExchangeOfferWorldComparator.field4340 = var33;
				PacketBufferNode var6 = class130.method3005();
				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(LoginPacket.field3343.id);
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field3342.id);
				}

				var6.packetBuffer.writeShort(0);
				int var7 = var6.packetBuffer.offset;
				var6.packetBuffer.writeInt(215);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field657);
				byte var8 = 0;
				var6.packetBuffer.writeByte(var8);
				var6.packetBuffer.writeBytes(var30.array, 0, var30.offset);
				int var9 = var6.packetBuffer.offset;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(GrandExchangeOfferTotalQuantityComparator.canvasWidth);
				var6.packetBuffer.writeShort(WorldMapArchiveLoader.canvasHeight);
				VertexNormal.method4951(var6.packetBuffer);
				var6.packetBuffer.writeStringCp1252NullTerminated(class36.field263);
				var6.packetBuffer.writeInt(PcmPlayer.field299);
				if (field525 > 213) {
					var6.packetBuffer.writeByte(0);
				}

				Buffer var10 = new Buffer(NPCComposition.platformInfo.size());
				NPCComposition.platformInfo.write(var10);
				var6.packetBuffer.writeBytes(var10.array, 0, var10.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				var6.packetBuffer.writeIntIME(class197.archive2.hash);
				var6.packetBuffer.writeIntLE(Interpreter.field885.hash);
				var6.packetBuffer.writeIntIME(class151.field1694.hash);
				var6.packetBuffer.writeIntLE(0);
				var6.packetBuffer.writeIntIME(class253.archive4.hash);
				var6.packetBuffer.writeIntME(World.field829.hash);
				var6.packetBuffer.writeInt(class131.archive10.hash);
				var6.packetBuffer.writeIntME(class7.archive11.hash);
				var6.packetBuffer.writeIntLE(class126.archive12.hash);
				var6.packetBuffer.writeIntLE(Canvas.archive9.hash);
				var6.packetBuffer.writeIntIME(TileItem.archive7.hash);
				var6.packetBuffer.writeIntIME(class191.field1970.hash);
				var6.packetBuffer.writeIntME(Varcs.field1402.hash);
				var6.packetBuffer.writeIntLE(class386.archive8.hash);
				var6.packetBuffer.writeInt(GrandExchangeOfferOwnWorldComparator.field511.hash);
				var6.packetBuffer.writeIntME(FontName.archive13.hash);
				var6.packetBuffer.writeInt(class106.field1358.hash);
				var6.packetBuffer.writeIntIME(ReflectionCheck.field273.hash);
				var6.packetBuffer.writeIntME(class148.field1670.hash);
				var6.packetBuffer.writeIntIME(class149.field1676.hash);
				var6.packetBuffer.writeIntME(class13.archive6.hash);
				var6.packetBuffer.xteaEncrypt(var33, var9, var6.packetBuffer.offset);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7);
				packetWriter.addNode(var6);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var33);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var33[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				BuddyRankComparator.method2912(6);
			}

			int var14;
			if (loginState == 6 && var1.available() > 0) {
				var13 = var1.readUnsignedByte();
				if (var13 == 61) {
					var14 = var1.available();
					Message.field506 = var14 == 1 && var1.readUnsignedByte() == 1;
					BuddyRankComparator.method2912(5);
				}

				if (var13 == 21 && gameState == 20) {
					BuddyRankComparator.method2912(12);
				} else if (var13 == 2) {
					BuddyRankComparator.method2912(14);
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					BuddyRankComparator.method2912(19);
				} else if (var13 == 64) {
					BuddyRankComparator.method2912(10);
				} else if (var13 == 23 && field796 < 1) {
					++field796;
					BuddyRankComparator.method2912(0);
				} else if (var13 == 29) {
					BuddyRankComparator.method2912(17);
				} else {
					if (var13 != 69) {
						GrandExchangeOfferTotalQuantityComparator.getLoginError(var13);
						return;
					}

					BuddyRankComparator.method2912(7);
				}
			}

			if (loginState == 7 && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				class386.field4434 = var2.readUnsignedShort();
				BuddyRankComparator.method2912(8);
			}

			if (loginState == 8 && var1.available() >= class386.field4434) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, class386.field4434);
				class6 var32 = class304.method5780()[var2.readUnsignedByte()];

				try {
					class3 var35 = Interpreter.method2069(var32);
					this.field570 = new class7(var2, var35);
					BuddyRankComparator.method2912(9);
				} catch (Exception var19) {
					GrandExchangeOfferTotalQuantityComparator.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field570.method54()) {
				this.field569 = this.field570.method48();
				this.field570.method47();
				this.field570 = null;
				if (this.field569 == null) {
					GrandExchangeOfferTotalQuantityComparator.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var31 = class130.method3005();
				var31.clientPacket = null;
				var31.clientPacketLength = 0;
				var31.packetBuffer = new PacketBuffer(5000);
				var31.packetBuffer.writeByte(LoginPacket.field3345.id);
				var31.packetBuffer.writeShort(this.field569.offset);
				var31.packetBuffer.writeBuffer(this.field569);
				packetWriter.addNode(var31);
				packetWriter.flush();
				this.field569 = null;
				BuddyRankComparator.method2912(6);
			}

			if (loginState == 10 && var1.available() > 0) {
				class293.field3091 = var1.readUnsignedByte();
				BuddyRankComparator.method2912(11);
			}

			if (loginState == 11 && var1.available() >= class293.field3091) {
				var1.read(var2.array, 0, class293.field3091);
				var2.offset = 0;
				BuddyRankComparator.method2912(6);
			}

			if (loginState == 12 && var1.available() > 0) {
				field554 = (var1.readUnsignedByte() + 3) * 60;
				BuddyRankComparator.method2912(13);
			}

			if (loginState == 13) {
				field552 = 0;
				Actor.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field554 / 60 + " seconds.");
				if (--field554 <= 0) {
					BuddyRankComparator.method2912(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) {
					class28.field162 = var1.readUnsignedByte();
					BuddyRankComparator.method2912(15);
				}

				if (loginState == 15 && var1.available() >= class28.field162) {
					boolean var43 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var42 = false;
					if (var43) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						class150.clientPreferences.method2488(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						class150.clientPreferences.method2482(Login.Login_username);
					} else {
						class150.clientPreferences.method2482((String)null);
					}

					GrandExchangeEvents.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field641 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.field780 = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					field642 = var2.readLong();
					if (field525 >= 214) {
						var1.read(var2.array, 0, 8);
						var2.offset = 0;
						var2.readLong();
					}

					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var36 = Messages.ServerPacket_values();
					int var15 = var2.readSmartByteShortIsaac();
					if (var15 < 0 || var15 >= var36.length) {
						throw new IOException(var15 + " " + var2.offset);
					}

					packetWriter.serverPacket = var36[var15];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var16 = TileItem.client;
						JSObject.getWindow(var16).call("zap", (Object[])null);
					} catch (Throwable var18) {
					}

					BuddyRankComparator.method2912(16);
				}

				if (loginState == 16) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method7726();
						mouseLastLastPressedTimeMillis = -1L;
						class497.mouseRecorder.index = 0;
						class326.hasFocus = true;
						hadFocus = true;
						field650 = -1L;
						class19.method280();
						packetWriter.clearBuffer();
						packetWriter.packetBuffer.offset = 0;
						packetWriter.serverPacket = null;
						packetWriter.field1416 = null;
						packetWriter.field1421 = null;
						packetWriter.field1422 = null;
						packetWriter.serverPacketLength = 0;
						packetWriter.field1423 = 0;
						rebootTimer = 0;
						logoutTimer = 0;
						hintArrowType = 0;
						menuOptionsCount = 0;
						isMenuOpen = false;
						ApproximateRouteStrategy.method1244(0);
						SoundCache.method857();
						isItemSelected = 0;
						isSpellSelected = false;
						soundEffectCount = 0;
						camAngleY = 0;
						oculusOrbState = 0;
						UserComparator7.field1455 = null;
						minimapState = 0;
						field758 = -1;
						destinationX = 0;
						destinationY = 0;
						playerAttackOption = AttackOption.AttackOption_hidden;
						npcAttackOption = AttackOption.AttackOption_hidden;
						npcCount = 0;
						CollisionMap.method4208();

						for (var13 = 0; var13 < 2048; ++var13) {
							players[var13] = null;
						}

						for (var13 = 0; var13 < 65536; ++var13) {
							npcs[var13] = null;
						}

						combatTargetPlayerIndex = -1;
						projectiles.clear();
						graphicsObjects.clear();

						for (var13 = 0; var13 < 4; ++var13) {
							for (var14 = 0; var14 < 104; ++var14) {
								for (int var17 = 0; var17 < 104; ++var17) {
									groundItems[var13][var14][var17] = null;
								}
							}
						}

						pendingSpawns = new NodeDeque();
						class177.friendSystem.clear();

						for (var13 = 0; var13 < VarpDefinition.field1904; ++var13) {
							VarpDefinition var41 = class158.VarpDefinition_get(var13);
							if (var41 != null) {
								Varps.Varps_temp[var13] = 0;
								Varps.Varps_main[var13] = 0;
							}
						}

						PendingSpawn.varcs.clearTransient();
						followerIndex = -1;
						if (rootInterface != -1) {
							var13 = rootInterface;
							if (var13 != -1 && Widget.Widget_loadedInterfaces[var13]) {
								ArchiveLoader.Widget_archive.clearFilesGroup(var13);
								if (ArchiveLoader.Widget_interfaceComponents[var13] != null) {
									for (var14 = 0; var14 < ArchiveLoader.Widget_interfaceComponents[var13].length; ++var14) {
										if (ArchiveLoader.Widget_interfaceComponents[var13][var14] != null) {
											ArchiveLoader.Widget_interfaceComponents[var13][var14] = null;
										}
									}

									ArchiveLoader.Widget_interfaceComponents[var13] = null;
									Widget.Widget_loadedInterfaces[var13] = false;
								}
							}
						}

						for (InterfaceParent var37 = (InterfaceParent)interfaceParents.first(); var37 != null; var37 = (InterfaceParent)interfaceParents.next()) {
							Actor.closeInterface(var37, true);
						}

						rootInterface = -1;
						interfaceParents = new NodeHashTable(8);
						meslayerContinueWidget = null;
						menuOptionsCount = 0;
						isMenuOpen = false;
						playerAppearance.method6119((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

						for (var13 = 0; var13 < 8; ++var13) {
							playerMenuActions[var13] = null;
							playerOptionsPriorities[var13] = false;
						}

						ItemContainer.itemContainers = new NodeHashTable(32);
						isLoading = true;

						for (var13 = 0; var13 < 100; ++var13) {
							field718[var13] = true;
						}

						LoadSongTask.method7680();
						Canvas.friendsChat = null;
						class11.guestClanSettings = null;
						Arrays.fill(currentClanSettings, (Object)null);
						WorldMapLabelSize.guestClanChannel = null;
						Arrays.fill(currentClanChannels, (Object)null);

						for (var13 = 0; var13 < 8; ++var13) {
							grandExchangeOffers[var13] = new GrandExchangeOffer();
						}

						class28.grandExchangeEvents = null;
						field527 = false;
						class164.updatePlayer(var2);
						class309.field3456 = -1;
						class303.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						WorldMapSectionType.field2979 = var2.readUnsignedShort();
						BuddyRankComparator.method2912(18);
					}

					if (loginState == 18 && var1.available() >= WorldMapSectionType.field2979) {
						var2.offset = 0;
						var1.read(var2.array, 0, WorldMapSectionType.field2979);
						var2.offset = 0;
						String var34 = var2.readStringCp1252NullTerminated();
						String var39 = var2.readStringCp1252NullTerminated();
						String var38 = var2.readStringCp1252NullTerminated();
						Actor.setLoginResponseString(var34, var39, var38);
						class129.updateGameState(10);
						if (field556.method9394()) {
							class328.method6115(9);
						}
					}

					if (loginState != 19) {
						++field552;
						if (field552 > 2000) {
							if (field796 < 1) {
								if (Login.worldPort == Varps.currentPort) {
									Varps.currentPort = class11.js5Port;
								} else {
									Varps.currentPort = Login.worldPort;
								}

								++field796;
								BuddyRankComparator.method2912(0);
							} else {
								GrandExchangeOfferTotalQuantityComparator.getLoginError(-3);
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) {
							if (var1.available() < 2) {
								return;
							}

							var1.read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (var1.available() >= packetWriter.serverPacketLength) {
							var1.read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var13 = packetWriter.serverPacketLength;
							timer.method7728();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1416 = null;
							packetWriter.field1421 = null;
							packetWriter.field1422 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1423 = 0;
							rebootTimer = 0;
							menuOptionsCount = 0;
							isMenuOpen = false;
							minimapState = 0;
							destinationX = 0;

							for (var14 = 0; var14 < 2048; ++var14) {
								players[var14] = null;
							}

							class136.localPlayer = null;

							for (var14 = 0; var14 < npcs.length; ++var14) {
								NPC var40 = npcs[var14];
								if (var40 != null) {
									var40.targetIndex = -1;
									var40.false0 = false;
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32);
							class129.updateGameState(30);

							for (var14 = 0; var14 < 100; ++var14) {
								field718[var14] = true;
							}

							LoadSongTask.method7680();
							class164.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var26) {
			if (field796 < 1) {
				if (Login.worldPort == Varps.currentPort) {
					Varps.currentPort = class11.js5Port;
				} else {
					Varps.currentPort = Login.worldPort;
				}

				++field796;
				BuddyRankComparator.method2912(0);
			} else {
				GrandExchangeOfferTotalQuantityComparator.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2055696363"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) {
			--rebootTimer;
		}

		if (logoutTimer > 0) {
			--logoutTimer;
		}

		if (hadNetworkError) {
			hadNetworkError = false;
			class93.method2369();
		} else {
			if (!isMenuOpen) {
				class89.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var14;
				while (GraphicsObject.method2081()) {
					var14 = class503.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					ArchiveDiskAction.performReflectionCheck(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (timer.field4562) {
					var14 = class503.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					timer.write(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
					timer.method7727();
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				PacketBuffer var10000;
				synchronized(class497.mouseRecorder.lock) {
					if (!field631) {
						class497.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class497.mouseRecorder.index >= 40) {
						PacketBufferNode var15 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; var7 < class497.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = class497.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							var9 = class497.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if (var9 != field743 || var8 != field532) {
								if (var15 == null) {
									var15 = class503.getPacketBufferNode(ClientPacket.field3115, packetWriter.isaacCipher);
									var15.packetBuffer.writeByte(0);
									var3 = var15.packetBuffer.offset;
									var10000 = var15.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								if (-1L != field533) {
									var10 = var9 - field743;
									var11 = var8 - field532;
									var12 = (int)((class497.mouseRecorder.millis[var7] - field533) / 20L);
									var5 = (int)((long)var5 + (class497.mouseRecorder.millis[var7] - field533) % 20L);
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field743 = var9;
								field532 = var8;
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
									var10 += 32;
									var11 += 32;
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
									var10 += 128;
									var11 += 128;
									var15.packetBuffer.writeByte(var12 + 128);
									var15.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var15.packetBuffer.writeByte(var12 + 192);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344);
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field533 = class497.mouseRecorder.millis[var7];
							}
						}

						if (var15 != null) {
							var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3);
							var7 = var15.packetBuffer.offset;
							var15.packetBuffer.offset = var3;
							var15.packetBuffer.writeByte(var5 / var6);
							var15.packetBuffer.writeByte(var5 % var6);
							var15.packetBuffer.offset = var7;
							packetWriter.addNode(var15);
						}

						if (var4 >= class497.mouseRecorder.index) {
							class497.mouseRecorder.index = 0;
						} else {
							MouseRecorder var50 = class497.mouseRecorder;
							var50.index -= var4;
							System.arraycopy(class497.mouseRecorder.xs, var4, class497.mouseRecorder.xs, 0, class497.mouseRecorder.index);
							System.arraycopy(class497.mouseRecorder.ys, var4, class497.mouseRecorder.ys, 0, class497.mouseRecorder.index);
							System.arraycopy(class497.mouseRecorder.millis, var4, class497.mouseRecorder.millis, 0, class497.mouseRecorder.index);
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !class28.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
					if (var16 > 32767L) {
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > WorldMapArchiveLoader.canvasHeight) {
						var3 = WorldMapArchiveLoader.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > GrandExchangeOfferTotalQuantityComparator.canvasWidth) {
						var4 = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
					}

					var5 = (int)var16;
					var18 = class503.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
					var18.packetBuffer.writeShort(var4);
					var18.packetBuffer.writeShort(var3);
					packetWriter.addNode(var18);
				}

				if (mouseWheelRotation != 0) {
					var14 = class503.getPacketBufferNode(ClientPacket.field3190, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(mouseWheelRotation);
					packetWriter.addNode(var14);
				}

				if (field750.field2331 > 0) {
					var14 = class503.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(0);
					var2 = var14.packetBuffer.offset;
					long var19 = class113.method2835();

					for (var5 = 0; var5 < field750.field2331; ++var5) {
						long var21 = var19 - field650;
						if (var21 > 16777215L) {
							var21 = 16777215L;
						}

						field650 = var19;
						var14.packetBuffer.writeMediumLE((int)var21);
						var14.packetBuffer.writeByteAdd(field750.field2319[var5]);
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (field614 > 0) {
					--field614;
				}

				if (field750.method4151(96) || field750.method4151(97) || field750.method4151(98) || field750.method4151(99)) {
					field707 = true;
				}

				if (field707 && field614 <= 0) {
					field614 = 20;
					field707 = false;
					var14 = class503.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(camAngleY);
					var14.packetBuffer.writeShort(camAngleX);
					packetWriter.addNode(var14);
				}

				if (class326.hasFocus && !hadFocus) {
					hadFocus = true;
					var14 = class503.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(1);
					packetWriter.addNode(var14);
				}

				if (!class326.hasFocus && hadFocus) {
					hadFocus = false;
					var14 = class503.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					packetWriter.addNode(var14);
				}

				if (class127.worldMap != null) {
					class127.worldMap.method8531();
				}

				Player var31;
				if (DynamicObject.ClanChat_inClanChat) {
					if (Canvas.friendsChat != null) {
						Canvas.friendsChat.sort();
					}

					for (var1 = 0; var1 < Players.Players_count; ++var1) {
						var31 = players[Players.Players_indices[var1]];
						var31.clearIsInFriendsChat();
					}

					DynamicObject.ClanChat_inClanChat = false;
				}

				if (class458.field4775) {
					for (var1 = 0; var1 < Players.Players_count; ++var1) {
						var31 = players[Players.Players_indices[var1]];
						var31.method2345();
					}

					class458.field4775 = false;
				}

				if (class36.Client_plane != field758) {
					field758 = class36.Client_plane;
					class12.method172(class36.Client_plane);
				}

				if (gameState == 30) {
					for (PendingSpawn var30 = (PendingSpawn)pendingSpawns.last(); var30 != null; var30 = (PendingSpawn)pendingSpawns.previous()) {
						if (var30.hitpoints > 0) {
							--var30.hitpoints;
						}

						if (var30.hitpoints == 0) {
							if (var30.objectId < 0 || DevicePcmPlayerProvider.method311(var30.objectId, var30.field1169)) {
								PlayerCompositionColorTextureOverride.addPendingSpawnToScene(var30.plane, var30.type, var30.x, var30.y, var30.objectId, var30.field1168, var30.field1169, var30.field1172);
								var30.remove();
							}
						} else {
							if (var30.delay > 0) {
								--var30.delay;
							}

							if (var30.delay == 0 && var30.x >= 1 && var30.y >= 1 && var30.x <= 102 && var30.y <= 102 && (var30.field1173 < 0 || DevicePcmPlayerProvider.method311(var30.field1173, var30.field1170))) {
								PlayerCompositionColorTextureOverride.addPendingSpawnToScene(var30.plane, var30.type, var30.x, var30.y, var30.field1173, var30.field1171, var30.field1170, var30.field1172);
								var30.delay = -1;
								if (var30.objectId == var30.field1173 && var30.objectId == -1) {
									var30.remove();
								} else if (var30.objectId == var30.field1173 && var30.field1168 == var30.field1171 && var30.field1170 == var30.field1169) {
									var30.remove();
								}
							}
						}
					}

					int var10002;
					for (var1 = 0; var1 < soundEffectCount; ++var1) {
						var10002 = queuedSoundEffectDelays[var1]--;
						if (queuedSoundEffectDelays[var1] >= -10) {
							SoundEffect var34 = soundEffects[var1];
							if (var34 == null) {
								var10000 = null;
								var34 = SoundEffect.readSoundEffect(class149.field1676, soundEffectIds[var1], 0);
								if (var34 == null) {
									continue;
								}

								int[] var51 = queuedSoundEffectDelays;
								var51[var1] += var34.calculateDelay();
								soundEffects[var1] = var34;
							}

							if (queuedSoundEffectDelays[var1] < 0) {
								if (soundLocations[var1] != 0) {
									var4 = (soundLocations[var1] & 255) * 128;
									var5 = soundLocations[var1] >> 16 & 255;
									var6 = var5 * 128 + 64 - class136.localPlayer.x;
									if (var6 < 0) {
										var6 = -var6;
									}

									var7 = soundLocations[var1] >> 8 & 255;
									var8 = var7 * 128 + 64 - class136.localPlayer.y;
									if (var8 < 0) {
										var8 = -var8;
									}

									var9 = var8 + var6 - 128;
									if (var9 > var4) {
										queuedSoundEffectDelays[var1] = -100;
										continue;
									}

									if (var9 < 0) {
										var9 = 0;
									}

									var3 = (var4 - var9) * class150.clientPreferences.method2481() / var4;
								} else {
									var3 = class150.clientPreferences.method2480();
								}

								if (var3 > 0) {
									RawSound var23 = var34.toRawSound().resample(SoundCache.decimator);
									RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3);
									var24.setNumLoops(queuedSoundEffectLoops[var1] - 1);
									SecureRandomCallable.pcmStreamMixer.addSubStream(var24);
								}

								queuedSoundEffectDelays[var1] = -100;
							}
						} else {
							--soundEffectCount;

							for (var2 = var1; var2 < soundEffectCount; ++var2) {
								soundEffectIds[var2] = soundEffectIds[var2 + 1];
								soundEffects[var2] = soundEffects[var2 + 1];
								queuedSoundEffectLoops[var2] = queuedSoundEffectLoops[var2 + 1];
								queuedSoundEffectDelays[var2] = queuedSoundEffectDelays[var2 + 1];
								soundLocations[var2] = soundLocations[var2 + 1];
							}

							--var1;
						}
					}

					if (playingJingle && !ItemContainer.method2273()) {
						if (class150.clientPreferences.method2478() != 0 && HorizontalAlignment.method3701()) {
							Archive var32 = class13.archive6;
							var2 = class150.clientPreferences.method2478();
							if (!class306.field3398.isEmpty()) {
								ArrayList var25 = new ArrayList();
								Iterator var38 = class306.field3398.iterator();

								while (var38.hasNext()) {
									MusicSong var41 = (MusicSong)var38.next();
									var41.field3508 = false;
									var41.field3513 = false;
									var41.field3515 = false;
									var41.musicTrackArchive = var32;
									var41.musicTrackVolume = var2;
									var41.field3511 = 0.0F;
									var25.add(var41);
								}

								UserComparator4.method2858(var25, class306.musicPlayerStatus, class306.field3402, class306.field3403, class306.field3407, false);
							}
						}

						playingJingle = false;
					}

					++packetWriter.field1423;
					if (packetWriter.field1423 > 750) {
						class93.method2369();
					} else {
						class27.method421();
						class132.method3039();
						int[] var33 = Players.Players_indices;

						for (var2 = 0; var2 < Players.Players_count; ++var2) {
							Player var45 = players[var33[var2]];
							if (var45 != null && var45.overheadTextCyclesRemaining > 0) {
								--var45.overheadTextCyclesRemaining;
								if (var45.overheadTextCyclesRemaining == 0) {
									var45.overheadText = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) {
							var3 = npcIndices[var2];
							NPC var39 = npcs[var3];
							if (var39 != null && var39.overheadTextCyclesRemaining > 0) {
								--var39.overheadTextCyclesRemaining;
								if (var39.overheadTextCyclesRemaining == 0) {
									var39.overheadText = null;
								}
							}
						}

						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 400;
							if (mouseCrossState * 20 >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var35 = WorldMapScaleHandler.mousedOverWidgetIf1;
						Widget var37 = DelayFadeTask.field4519;
						WorldMapScaleHandler.mousedOverWidgetIf1 = null;
						DelayFadeTask.field4519 = null;
						draggedOnWidget = null;
						field809 = false;
						field761 = false;
						field752 = 0;

						while (field750.method4162() && field752 < 128) {
							if (staffModLevel >= 2 && field750.method4151(82) && field750.field2330 == 66) {
								StringBuilder var40 = new StringBuilder();

								Message var36;
								for (Iterator var43 = Messages.Messages_hashTable.iterator(); var43.hasNext(); var40.append(var36.text).append('\n')) {
									var36 = (Message)var43.next();
									if (var36.sender != null && !var36.sender.isEmpty()) {
										var40.append(var36.sender).append(':');
									}
								}

								String var46 = var40.toString();
								TileItem.client.method620(var46);
							} else if (oculusOrbState != 1 || field750.field2329 <= 0) {
								field754[field752] = field750.field2330;
								field753[field752] = field750.field2329;
								++field752;
							}
						}

						if (class158.method3322() && field750.method4151(82) && field750.method4151(81) && mouseWheelRotation != 0) {
							var3 = class136.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != class136.localPlayer.plane) {
								var4 = class136.localPlayer.pathX[0] + AbstractArchive.baseX * 64;
								var5 = class136.localPlayer.pathY[0] + class148.baseY * 64;
								var18 = class503.getPacketBufferNode(ClientPacket.field3165, packetWriter.isaacCipher);
								var18.packetBuffer.writeIntIME(0);
								var18.packetBuffer.writeShortAddLE(var4);
								var18.packetBuffer.writeByteAdd(var3);
								var18.packetBuffer.writeShortAdd(var5);
								packetWriter.addNode(var18);
							}

							mouseWheelRotation = 0;
						}

						if (MouseHandler.MouseHandler_lastButton == 1) {
							field612.method4119();
						}

						if (rootInterface != -1) {
							class10.updateRootInterface(rootInterface, 0, 0, GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var42;
							Widget var44;
							ScriptEvent var47;
							do {
								var47 = (ScriptEvent)field728.removeLast();
								if (var47 == null) {
									while (true) {
										do {
											var47 = (ScriptEvent)field729.removeLast();
											if (var47 == null) {
												while (true) {
													do {
														var47 = (ScriptEvent)scriptEvents.removeLast();
														if (var47 == null) {
															while (true) {
																class212 var49 = (class212)field810.removeLast();
																if (var49 == null) {
																	this.menu();
																	if (class127.worldMap != null) {
																		class127.worldMap.method8541(class36.Client_plane, AbstractArchive.baseX * 64 + (class136.localPlayer.x >> 7), class148.baseY * 64 + (class136.localPlayer.y >> 7), false);
																		class127.worldMap.loadCache();
																	}

																	if (clickedWidget != null) {
																		this.method1294();
																	}

																	if (Scene.shouldSendWalk()) {
																		var3 = Scene.Scene_selectedX;
																		var4 = Scene.Scene_selectedY;
																		PacketBufferNode var48 = class503.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																		var48.packetBuffer.writeByte(5);
																		var48.packetBuffer.writeShort(AbstractArchive.baseX * 64 + var3);
																		var48.packetBuffer.writeByteAdd(field750.method4151(82) ? (field750.method4151(81) ? 2 : 1) : 0);
																		var48.packetBuffer.writeShortLE(class148.baseY * 64 + var4);
																		packetWriter.addNode(var48);
																		Scene.method4601();
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																		mouseCrossColor = 1;
																		mouseCrossState = 0;
																		destinationX = var3;
																		destinationY = var4;
																	}

																	if (var35 != WorldMapScaleHandler.mousedOverWidgetIf1) {
																		if (var35 != null) {
																			class200.invalidateWidget(var35);
																		}

																		if (WorldMapScaleHandler.mousedOverWidgetIf1 != null) {
																			class200.invalidateWidget(WorldMapScaleHandler.mousedOverWidgetIf1);
																		}
																	}

																	if (var37 != DelayFadeTask.field4519 && field676 == field675) {
																		if (var37 != null) {
																			class200.invalidateWidget(var37);
																		}

																		if (DelayFadeTask.field4519 != null) {
																			class200.invalidateWidget(DelayFadeTask.field4519);
																		}
																	}

																	if (DelayFadeTask.field4519 != null) {
																		if (field675 < field676) {
																			++field675;
																			if (field676 == field675) {
																				class200.invalidateWidget(DelayFadeTask.field4519);
																			}
																		}
																	} else if (field675 > 0) {
																		--field675;
																	}

																	if (oculusOrbState == 0) {
																		var3 = class136.localPlayer.x;
																		var4 = class136.localPlayer.y;
																		if (class467.oculusOrbFocalPointX - var3 < -500 || class467.oculusOrbFocalPointX - var3 > 500 || class36.oculusOrbFocalPointY - var4 < -500 || class36.oculusOrbFocalPointY - var4 > 500) {
																			class467.oculusOrbFocalPointX = var3;
																			class36.oculusOrbFocalPointY = var4;
																		}

																		if (var3 != class467.oculusOrbFocalPointX) {
																			class467.oculusOrbFocalPointX += (var3 - class467.oculusOrbFocalPointX) / 16;
																		}

																		if (var4 != class36.oculusOrbFocalPointY) {
																			class36.oculusOrbFocalPointY += (var4 - class36.oculusOrbFocalPointY) / 16;
																		}

																		var5 = class467.oculusOrbFocalPointX >> 7;
																		var6 = class36.oculusOrbFocalPointY >> 7;
																		var7 = class306.getTileHeight(class467.oculusOrbFocalPointX, class36.oculusOrbFocalPointY, class36.Client_plane);
																		var8 = 0;
																		if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
																			for (var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
																				for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
																					var11 = class36.Client_plane;
																					if (var11 < 3 && (Tiles.Tiles_renderFlags[1][var9][var10] & 2) == 2) {
																						++var11;
																					}

																					var12 = var7 - Tiles.Tiles_heights[var11][var9][var10];
																					if (var12 > var8) {
																						var8 = var12;
																					}
																				}
																			}
																		}

																		var9 = var8 * 192;
																		if (var9 > 98048) {
																			var9 = 98048;
																		}

																		if (var9 < 32768) {
																			var9 = 32768;
																		}

																		if (var9 > field616) {
																			field616 += (var9 - field616) / 24;
																		} else if (var9 < field616) {
																			field616 += (var9 - field616) / 80;
																		}

																		class90.field1108 = class306.getTileHeight(class136.localPlayer.x, class136.localPlayer.y, class36.Client_plane) - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		Bounds.method8206();
																		short var29 = -1;
																		if (field750.method4151(33)) {
																			var29 = 0;
																		} else if (field750.method4151(49)) {
																			var29 = 1024;
																		}

																		if (field750.method4151(48)) {
																			if (var29 == 0) {
																				var29 = 1792;
																			} else if (var29 == 1024) {
																				var29 = 1280;
																			} else {
																				var29 = 1536;
																			}
																		} else if (field750.method4151(50)) {
																			if (var29 == 0) {
																				var29 = 256;
																			} else if (var29 == 1024) {
																				var29 = 768;
																			} else {
																				var29 = 512;
																			}
																		}

																		byte var28 = 0;
																		if (field750.method4151(35)) {
																			var28 = -1;
																		} else if (field750.method4151(51)) {
																			var28 = 1;
																		}

																		var5 = 0;
																		if (var29 >= 0 || var28 != 0) {
																			var5 = field750.method4151(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var5 *= 16;
																			field608 = var29;
																			field609 = var28;
																		}

																		if (field583 < var5) {
																			field583 += var5 / 8;
																			if (field583 > var5) {
																				field583 = var5;
																			}
																		} else if (field583 > var5) {
																			field583 = field583 * 9 / 10;
																		}

																		if (field583 > 0) {
																			var6 = field583 / 16;
																			if (field608 >= 0) {
																				var3 = field608 - class456.cameraYaw & 2047;
																				var7 = Rasterizer3D.Rasterizer3D_sine[var3];
																				var8 = Rasterizer3D.Rasterizer3D_cosine[var3];
																				class467.oculusOrbFocalPointX += var6 * var7 / 65536;
																				class36.oculusOrbFocalPointY += var8 * var6 / 65536;
																			}

																			if (field609 != 0) {
																				class90.field1108 += var6 * field609;
																				if (class90.field1108 > 0) {
																					class90.field1108 = 0;
																				}
																			}
																		} else {
																			field608 = -1;
																			field609 = -1;
																		}

																		if (field750.method4151(13)) {
																			packetWriter.addNode(class503.getPacketBufferNode(ClientPacket.FREECAM_EXIT, packetWriter.isaacCipher));
																			oculusOrbState = 0;
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && class28.mouseCam) {
																		var3 = MouseHandler.MouseHandler_y - field817;
																		camAngleDX = var3 * 2;
																		field817 = var3 != -1 && var3 != 1 ? (field817 + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
																		var4 = field603 - MouseHandler.MouseHandler_x;
																		camAngleDY = var4 * 2;
																		field603 = var4 != -1 && var4 != 1 ? (field603 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
																	} else {
																		if (field750.method4151(96)) {
																			camAngleDY += (-24 - camAngleDY) / 2;
																		} else if (field750.method4151(97)) {
																			camAngleDY += (24 - camAngleDY) / 2;
																		} else {
																			camAngleDY /= 2;
																		}

																		if (field750.method4151(98)) {
																			camAngleDX += (12 - camAngleDX) / 2;
																		} else if (field750.method4151(99)) {
																			camAngleDX += (-12 - camAngleDX) / 2;
																		} else {
																			camAngleDX /= 2;
																		}

																		field817 = MouseHandler.MouseHandler_y;
																		field603 = MouseHandler.MouseHandler_x;
																	}

																	camAngleY = camAngleDY / 2 + camAngleY & 2047;
																	camAngleX += camAngleDX / 2;
																	if (camAngleX < 128) {
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) {
																		camAngleX = 383;
																	}

																	if (field781) {
																		class89.method2306(class422.field4606, FadeInTask.field4522, ModeWhere.field4410);
																		class184.method3581(class165.field1791, class4.field11);
																		if (class157.cameraX == class422.field4606 && FadeInTask.field4522 == class384.cameraY && ModeWhere.field4410 == SoundSystem.cameraZ && class165.field1791 == class19.cameraPitch && class456.cameraYaw == class4.field11) {
																			field781 = false;
																			isCameraLocked = false;
																			field775 = false;
																			field797 = false;
																			Canvas.field124 = 0;
																			PlayerCompositionColorTextureOverride.field1890 = 0;
																			FontName.field4949 = 0;
																			class18.field95 = 0;
																			class157.field1743 = 0;
																			SecureRandomFuture.field990 = 0;
																			field755 = 0;
																			WorldMapIcon_1.field2870 = 0;
																			class132.field1574 = 0;
																			ModeWhere.field4408 = 0;
																			field778 = null;
																			field643 = null;
																			field779 = null;
																		}
																	} else if (isCameraLocked) {
																		if (!field775) {
																			var3 = WorldMapIcon_1.field2870 * 16384 + 64;
																			var4 = class132.field1574 * 16384 + 64;
																			var5 = class306.getTileHeight(var3, var4, class36.Client_plane) - ModeWhere.field4408;
																			class89.method2306(var3, var5, var4);
																		} else if (field778 != null) {
																			class157.cameraX = field778.vmethod8499();
																			SoundSystem.cameraZ = field778.vmethod8496();
																			if (field782) {
																				class384.cameraY = field778.vmethod8497();
																			} else {
																				class384.cameraY = class306.getTileHeight(class157.cameraX, SoundSystem.cameraZ, class36.Client_plane) - field778.vmethod8497();
																			}

																			field778.method8506();
																		}

																		if (!field797) {
																			var3 = Canvas.field124 * 128 + 64;
																			var4 = PlayerCompositionColorTextureOverride.field1890 * 16384 + 64;
																			var5 = class306.getTileHeight(var3, var4, class36.Client_plane) - FontName.field4949;
																			var6 = var3 - class157.cameraX;
																			var7 = var5 - class384.cameraY;
																			var8 = var4 - SoundSystem.cameraZ;
																			var9 = (int)Math.sqrt((double)(var8 * var8 + var6 * var6));
																			var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531D) & 2047;
																			var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531D) & 2047;
																			class184.method3581(var10, var11);
																		} else {
																			if (field643 != null) {
																				class19.cameraPitch = field643.method8493();
																				class19.cameraPitch = Math.min(Math.max(class19.cameraPitch, 128), 383);
																				field643.method8506();
																			}

																			if (field779 != null) {
																				class456.cameraYaw = field779.method8493() & 2047;
																				field779.method8506();
																			}
																		}
																	}

																	for (var3 = 0; var3 < 5; ++var3) {
																		var10002 = field771[var3]++;
																	}

																	PendingSpawn.varcs.tryWrite();
																	var3 = ++MouseHandler.MouseHandler_idleCycles - 1;
																	var5 = class1.method11();
																	if (var3 > 15000 && var5 > 15000) {
																		logoutTimer = 250;
																		ApproximateRouteStrategy.method1244(14500);
																		var18 = class503.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var18);
																	}

																	class177.friendSystem.processFriendUpdates();
																	class146.method3154();
																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var18 = class503.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var18);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var26) {
																		class93.method2369();
																	}

																	return;
																}

																PacketWriter.method2802(var49);
															}
														}

														var42 = var47.widget;
														if (var42.childIndex < 0) {
															break;
														}

														var44 = VarbitComposition.getWidget(var42.parentId);
													} while(var44 == null || var44.children == null || var42.childIndex >= var44.children.length || var42 != var44.children[var42.childIndex]);

													GrandExchangeOfferOwnWorldComparator.runScriptEvent(var47);
												}
											}

											var42 = var47.widget;
											if (var42.childIndex < 0) {
												break;
											}

											var44 = VarbitComposition.getWidget(var42.parentId);
										} while(var44 == null || var44.children == null || var42.childIndex >= var44.children.length || var42 != var44.children[var42.childIndex]);

										GrandExchangeOfferOwnWorldComparator.runScriptEvent(var47);
									}
								}

								var42 = var47.widget;
								if (var42.childIndex < 0) {
									break;
								}

								var44 = VarbitComposition.getWidget(var42.parentId);
							} while(var44 == null || var44.children == null || var42.childIndex >= var44.children.length || var42 != var44.children[var42.childIndex]);

							GrandExchangeOfferOwnWorldComparator.runScriptEvent(var47);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "57"
	)
	public void vmethod6017(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && class150.clientPreferences.method2478() > 0 && !playingJingle) {
				PacketBufferNode var3 = class503.getPacketBufferNode(ClientPacket.field3182, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2120321682"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
		int var2 = WorldMapArchiveLoader.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class150.clientPreferences != null) {
			try {
				class26.method383(TileItem.client, "resize", new Object[]{Huffman.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1641979157"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (Login.loadInterface(var1)) {
				class142.drawModelComponents(ArchiveLoader.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field718[var1]) {
				field735[var1] = true;
			}

			field736[var1] = field718[var1];
			field718[var1] = false;
		}

		field528 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class7.drawWidgets(rootInterface, 0, 0, GrandExchangeOfferTotalQuantityComparator.canvasWidth, WorldMapArchiveLoader.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class211.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class211.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				class335.method6605(viewportX, viewportY);
			}
		} else {
			var1 = Canvas.menuX;
			int var2 = UserComparator6.menuY;
			int var3 = UserComparator5.menuWidth;
			int var4 = ModeWhere.menuHeight;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			Calendar.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			int var6 = MouseHandler.MouseHandler_x;
			int var7 = MouseHandler.MouseHandler_y;

			int var8;
			int var9;
			int var10;
			for (var8 = 0; var8 < menuOptionsCount; ++var8) {
				var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31;
				var10 = 16777215;
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				Font var13 = Calendar.fontBold12;
				String var14;
				if (var8 < 0) {
					var14 = "";
				} else if (menuTargets[var8].length() > 0) {
					var14 = menuActions[var8] + " " + menuTargets[var8];
				} else {
					var14 = menuActions[var8];
				}

				var13.draw(var14, var1 + 3, var9, var10, 0);
			}

			var8 = Canvas.menuX;
			var9 = UserComparator6.menuY;
			var10 = UserComparator5.menuWidth;
			int var11 = ModeWhere.menuHeight;

			for (int var12 = 0; var12 < rootWidgetCount; ++var12) {
				if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var8 + var10 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var9 && rootWidgetYs[var12] < var11 + var9) {
					field735[var12] = true;
				}
			}
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field736[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field735[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		class456.method8366(class36.Client_plane, class136.localPlayer.x, class136.localPlayer.y, graphicsCycle);
		graphicsCycle = 0;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(Leb;IB)Z",
		garbageValue = "84"
	)
	boolean method1523(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			Canvas.friendsChat = null;
		} else {
			if (Canvas.friendsChat == null) {
				Canvas.friendsChat = new FriendsChat(class457.loginType, TileItem.client);
			}

			Canvas.friendsChat.method7893(var1.packetBuffer, var2);
		}

		field719 = cycleCntr;
		DynamicObject.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)Z",
		garbageValue = "46"
	)
	boolean method1287(PacketWriter var1) {
		if (Canvas.friendsChat != null) {
			Canvas.friendsChat.method7903(var1.packetBuffer);
		}

		field719 = cycleCntr;
		DynamicObject.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(Leb;I)Z",
		garbageValue = "1827422343"
	)
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			String var21;
			int var22;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1417) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1423 = 0;
						var1.field1417 = false;
					}

					var3.offset = 0;
					if (var3.method9034()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1423 = 0;
					}

					var1.field1417 = true;
					ServerPacket[] var4 = Messages.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if (var5 < 0 || var5 >= var4.length) {
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == -1) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == -2) {
					if (!var2.isAvailable(2)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2);
					var3.offset = 0;
					var1.serverPacketLength = var3.readUnsignedShort();
				}

				if (!var2.isAvailable(var1.serverPacketLength)) {
					return false;
				}

				var3.offset = 0;
				var2.read(var3.array, 0, var1.serverPacketLength);
				var1.field1423 = 0;
				timer.method7737();
				var1.field1422 = var1.field1421;
				var1.field1421 = var1.field1416;
				var1.field1416 = var1.serverPacket;
				Widget var6;
				int var20;
				if (ServerPacket.field3229 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var21 = var3.readStringCp1252NullTerminated();
					var6 = VarbitComposition.getWidget(var20);
					if (!var21.equals(var6.text)) {
						var6.text = var21;
						class200.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var8;
				int var11;
				int var57;
				int var59;
				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var59 = var3.readUnsignedByteNeg();
					var22 = var3.method9290();
					var20 = var22 >> 16;
					var5 = var22 >> 8 & 255;
					var7 = var20 + (var22 >> 4 & 7);
					var8 = var5 + (var22 & 7);
					var57 = var3.readUnsignedShort();
					var11 = var3.readUnsignedShort();
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						GraphicsObject var61 = new GraphicsObject(var57, class36.Client_plane, var7, var8, class306.getTileHeight(var7, var8, class36.Client_plane) - var59, var11, cycle);
						graphicsObjects.addFirst(var61);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var23;
				boolean var62;
				int var79;
				if (ServerPacket.field3228 == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field775 = true;
					WorldMapIcon_1.field2870 = var3.readUnsignedByte() * 128;
					class132.field1574 = var3.readUnsignedByte() * 128;
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte() * 128 + 64;
					var22 = var3.readUnsignedByte() * 128 + 64;
					var7 = var3.readUnsignedShort();
					field782 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var57 = WorldMapIcon_1.field2870 * 16384 + 64;
					var59 = class132.field1574 * 16384 + 64;
					var62 = false;
					var23 = false;
					if (field782) {
						var11 = class384.cameraY;
						var79 = class306.getTileHeight(var57, var59, class36.Client_plane) - var20;
					} else {
						var11 = class306.getTileHeight(class157.cameraX, SoundSystem.cameraZ, class36.Client_plane) - class384.cameraY;
						var79 = var20;
					}

					field778 = new class477(class157.cameraX, SoundSystem.cameraZ, var11, var57, var59, var79, var5, var22, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var22 = var3.readUnsignedByteAdd();
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var86 = npcs[var20];
					if (var86 != null) {
						if (var5 == var86.sequence && var5 != -1) {
							var8 = class135.SequenceDefinition_get(var5).field2274;
							if (var8 == 1) {
								var86.sequenceFrame = 0;
								var86.sequenceFrameCycle = 0;
								var86.sequenceDelay = var22;
								var86.field1199 = 0;
							} else if (var8 == 2) {
								var86.field1199 = 0;
							}
						} else if (var5 == -1 || var86.sequence == -1 || class135.SequenceDefinition_get(var5).field2258 >= class135.SequenceDefinition_get(var86.sequence).field2258) {
							var86.sequence = var5;
							var86.sequenceFrame = 0;
							var86.sequenceFrameCycle = 0;
							var86.sequenceDelay = var22;
							var86.field1199 = 0;
							var86.field1257 = var86.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					DbRowType.method9006();
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedByte();
					var22 = var3.readUnsignedByteNeg();
					experience[var22] = var20;
					currentLevels[var22] = var5;
					levels[var22] = 1;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var20 >= Skills.Skills_experienceTable[var7]) {
							levels[var22] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var22;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3258 == var1.serverPacket) {
					for (var20 = 0; var20 < players.length; ++var20) {
						if (players[var20] != null) {
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) {
						if (npcs[var20] != null) {
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					GrandExchangeEvents.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}

				String var64;
				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var54 = new byte[var1.serverPacketLength];
					var3.method9060(var54, 0, var54.length);
					Buffer var83 = new Buffer(var54);
					var64 = var83.readStringCp1252NullTerminated();
					NPC.openURL(var64, true, false);
					var1.serverPacket = null;
					return true;
				}

				Widget var78;
				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var78 = VarbitComposition.getWidget(var20);
					var78.modelType = 3;
					var78.modelId = class136.localPlayer.appearance.getChatHeadId();
					class200.invalidateWidget(var78);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3231 == var1.serverPacket) {
					class27.method408(class296.field3201);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3220 == var1.serverPacket) {
					var7 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAddLE();
					var8 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShortAdd();
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					ArrayList var84 = new ArrayList();
					var84.add(var20);
					ObjectComposition.method3963(var84, var5, var22, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				int var15;
				int var69;
				if (ServerPacket.field3318 == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field797 = true;
					Canvas.field124 = var3.readUnsignedByte() * 16384;
					PlayerCompositionColorTextureOverride.field1890 = var3.readUnsignedByte() * 128;
					FontName.field4949 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var22 = Canvas.field124 * 128 + 64;
					var7 = PlayerCompositionColorTextureOverride.field1890 * 16384 + 64;
					var8 = class306.getTileHeight(var22, var7, class36.Client_plane) - FontName.field4949;
					var57 = var22 - class157.cameraX;
					var59 = var8 - class384.cameraY;
					var11 = var7 - SoundSystem.cameraZ;
					double var85 = Math.sqrt((double)(var11 * var11 + var57 * var57));
					var69 = class74.method2088((int)(Math.atan2((double)var59, var85) * 325.9490051269531D) & 2047);
					var15 = class4.method18((int)(Math.atan2((double)var57, (double)var11) * -325.9490051269531D) & 2047);
					field643 = new class479(class19.cameraPitch, var69, var20, var5);
					field779 = new class479(class456.cameraYaw, var15, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3313 == var1.serverPacket) {
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3319 == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field797 = true;
					var20 = var3.readShort();
					var5 = var3.readShort();
					var22 = class74.method2088(var5 + class19.cameraPitch & 2027);
					var7 = var20 + class456.cameraYaw;
					var8 = var3.readUnsignedShort();
					var57 = var3.readUnsignedByte();
					field643 = new class479(class19.cameraPitch, var22, var8, var57);
					field779 = new class479(class456.cameraYaw, var7, var8, var57);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field797 = false;
					Canvas.field124 = var3.readUnsignedByte() * 16384;
					PlayerCompositionColorTextureOverride.field1890 = var3.readUnsignedByte() * 128;
					FontName.field4949 = var3.readUnsignedShort();
					class18.field95 = var3.readUnsignedByte();
					class157.field1743 = var3.readUnsignedByte();
					if (class157.field1743 >= 100) {
						var20 = Canvas.field124 * 128 + 64;
						var5 = PlayerCompositionColorTextureOverride.field1890 * 16384 + 64;
						var22 = class306.getTileHeight(var20, var5, class36.Client_plane) - FontName.field4949;
						var7 = var20 - class157.cameraX;
						var8 = var22 - class384.cameraY;
						var57 = var5 - SoundSystem.cameraZ;
						var59 = (int)Math.sqrt((double)(var7 * var7 + var57 * var57));
						class19.cameraPitch = (int)(Math.atan2((double)var8, (double)var59) * 325.9490051269531D) & 2047;
						class456.cameraYaw = (int)(Math.atan2((double)var7, (double)var57) * -325.9490051269531D) & 2047;
						if (class19.cameraPitch < 128) {
							class19.cameraPitch = 128;
						}

						if (class19.cameraPitch > 383) {
							class19.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readInt();
					var22 = var20 >> 10 & 31;
					var7 = var20 >> 5 & 31;
					var8 = var20 & 31;
					var57 = (var7 << 11) + (var22 << 19) + (var8 << 3);
					Widget var90 = VarbitComposition.getWidget(var5);
					if (var57 != var90.color) {
						var90.color = var57;
						class200.invalidateWidget(var90);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3219 == var1.serverPacket) {
					DbRowType.method9006();
					weight = var3.readShort();
					field724 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				boolean var87;
				if (ServerPacket.field3252 == var1.serverPacket) {
					var87 = var3.readUnsignedByte() == 1;
					if (var87) {
						VerticalAlignment.field2049 = class113.method2835() - var3.readLong();
						class28.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class28.grandExchangeEvents = null;
					}

					field723 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3270 == var1.serverPacket) {
					return this.method1523(var1, 1);
				}

				if (ServerPacket.field3223 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != field624) {
						field624 = var20;
						UserComparator7.method2871();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3221 == var1.serverPacket && isCameraLocked) {
					field781 = true;
					field797 = false;
					field775 = false;

					for (var20 = 0; var20 < 5; ++var20) {
						field618[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3273 == var1.serverPacket) {
					var20 = var3.readShortLE();
					var5 = var3.readInt();
					var6 = VarbitComposition.getWidget(var5);
					if (var20 != var6.sequenceId || var20 == -1) {
						var6.sequenceId = var20;
						var6.modelFrame = 0;
						var6.modelFrameCycle = 0;
						class200.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				long var26;
				long var29;
				long var31;
				long var33;
				String var36;
				String var52;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var29 = var3.readLong();
					var31 = (long)var3.readUnsignedShort();
					var33 = (long)var3.readMedium();
					PlayerType var91 = (PlayerType)ClientPreferences.findEnumerated(PendingSpawn.PlayerType_values(), var3.readUnsignedByte());
					var26 = (var31 << 32) + var33;
					boolean var70 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var26) {
							var70 = true;
							break;
						}
					}

					if (var91.isUser && class177.friendSystem.isIgnored(new Username(var52, class457.loginType))) {
						var70 = true;
					}

					if (!var70 && field637 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var26;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var36 = AbstractFont.escapeBrackets(class153.method3218(class292.method5720(var3)));
						if (var91.modIcon != -1) {
							class213.addChatMessage(9, SecureRandomCallable.method2253(var91.modIcon) + var52, var36, class170.base37DecodeLong(var29));
						} else {
							class213.addChatMessage(9, var52, var36, class170.base37DecodeLong(var29));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3334 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAddLE();
					var20 = var3.readUnsignedShortAddLE();
					RouteStrategy.method4227(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					WorldMapScaleHandler.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					boolean var81 = var3.readUnsignedByte() == 1;
					var64 = "";
					boolean var66 = false;
					if (var81) {
						var64 = var3.readStringCp1252NullTerminated();
						if (class177.friendSystem.isIgnored(new Username(var64, class457.loginType))) {
							var66 = true;
						}
					}

					String var97 = var3.readStringCp1252NullTerminated();
					if (!var66) {
						class415.addGameMessage(var20, var64, var97);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShort();
					var6 = VarbitComposition.getWidget(var20);
					if (var6 != null && var6.type == 0) {
						if (var5 > var6.scrollHeight - var6.height) {
							var5 = var6.scrollHeight - var6.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var6.scrollY) {
							var6.scrollY = var5;
							class200.invalidateWidget(var6);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field781 = false;
					isCameraLocked = false;
					field775 = false;
					field797 = false;
					Canvas.field124 = 0;
					PlayerCompositionColorTextureOverride.field1890 = 0;
					FontName.field4949 = 0;
					field782 = false;
					class18.field95 = 0;
					class157.field1743 = 0;
					SecureRandomFuture.field990 = 0;
					field755 = 0;
					WorldMapIcon_1.field2870 = 0;
					class132.field1574 = 0;
					ModeWhere.field4408 = 0;
					field778 = null;
					field643 = null;
					field779 = null;

					for (var20 = 0; var20 < 5; ++var20) {
						field618[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3224 == var1.serverPacket) {
					class27.method408(class296.field3198);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3322 == var1.serverPacket) {
					class27.method408(class296.field3199);
					var1.serverPacket = null;
					return true;
				}

				int var13;
				String var38;
				byte var72;
				if (ServerPacket.field3306 == var1.serverPacket) {
					var72 = var3.readByte();
					var29 = (long)var3.readUnsignedShort();
					var31 = (long)var3.readMedium();
					var33 = var31 + (var29 << 32);
					var62 = false;
					ClanChannel var12 = var72 >= 0 ? currentClanChannels[var72] : WorldMapLabelSize.guestClanChannel;
					if (var12 == null) {
						var62 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (var33 == crossWorldMessageIds[var13]) {
								var62 = true;
								break;
							}
						}
					}

					if (!var62) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var33;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var38 = class292.method5720(var3);
						var69 = var72 >= 0 ? 43 : 46;
						class213.addChatMessage(var69, "", var38, var12.name);
					}

					var1.serverPacket = null;
					return true;
				}

				int var16;
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					byte var68 = var3.readByte();
					int var18 = var3.readUnsignedByteAdd();
					int var17 = var3.readUnsignedByte();
					var69 = var3.readUnsignedByte() * 4;
					byte var63 = var3.readByteAdd();
					var13 = var3.readUnsignedByteNeg() * 4;
					var22 = var3.method9290();
					var20 = var22 >> 16;
					var5 = var22 >> 8 & 255;
					var7 = var20 + (var22 >> 4 & 7);
					var8 = var5 + (var22 & 7);
					var11 = var3.method9170();
					var79 = var3.readUnsignedShortAddLE();
					var16 = var3.readUnsignedShortAdd();
					var15 = var3.readUnsignedShortAddLE();
					var57 = var68 + var7;
					var59 = var63 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var57 >= 0 && var59 >= 0 && var57 < 104 && var59 < 104 && var79 != 65535) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						var57 = var57 * 128 + 64;
						var59 = var59 * 128 + 64;
						Projectile var19 = new Projectile(var79, class36.Client_plane, var7, var8, class306.getTileHeight(var7, var8, class36.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var69);
						var19.setDestination(var57, var59, class306.getTileHeight(var57, var59, class36.Client_plane) - var69, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var82;
				if (ServerPacket.field3217 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var22 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						class92.Widget_resetModelFrames(rootInterface);
						ScriptFrame.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							field718[var7] = true;
						}
					}

					InterfaceParent var89;
					for (; var22-- > 0; var89.field1065 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var57 = var3.readUnsignedByte();
						var89 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var89 != null && var8 != var89.group) {
							Actor.closeInterface(var89, true);
							var89 = null;
						}

						if (var89 == null) {
							var89 = WorldMapLabelSize.method5085(var7, var8, var57);
						}
					}

					for (var82 = (InterfaceParent)interfaceParents.first(); var82 != null; var82 = (InterfaceParent)interfaceParents.next()) {
						if (var82.field1065) {
							var82.field1065 = false;
						} else {
							Actor.closeInterface(var82, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var20) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var57 = var3.readUnsignedShort();
						var59 = var3.readInt();

						for (var11 = var8; var11 <= var57; ++var11) {
							var26 = ((long)var7 << 32) + (long)var11;
							widgetFlags.put(new IntegerNode(var59), var26);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3303 == var1.serverPacket) {
					return this.method1523(var1, 2);
				}

				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var20 = var3.readInt();
					var78 = VarbitComposition.getWidget(var20);

					for (var22 = 0; var22 < var78.itemIds.length; ++var22) {
						var78.itemIds[var22] = -1;
						var78.itemIds[var22] = 0;
					}

					class200.invalidateWidget(var78);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3324 == var1.serverPacket) {
					class450.method8229(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					Player var94;
					if (var20 == localPlayerIndex) {
						var94 = class136.localPlayer;
					} else {
						var94 = players[var20];
					}

					var7 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShortAddLE();
					var22 = var3.readUnsignedIntME();
					if (var94 != null) {
						var94.updateSpotAnimation(var7, var5, var22 >> 16, var22 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						DelayFadeTask.method7630(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					Object[] var77 = new Object[var52.length() + 1];

					for (var22 = var52.length() - 1; var22 >= 0; --var22) {
						if (var52.charAt(var22) == 's') {
							var77[var22 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var77[var22 + 1] = new Integer(var3.readInt());
						}
					}

					var77[0] = new Integer(var3.readInt());
					ScriptEvent var67 = new ScriptEvent();
					var67.args = var77;
					GrandExchangeOfferOwnWorldComparator.runScriptEvent(var67);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3248 == var1.serverPacket) {
					var87 = var3.readBoolean();
					if (var87) {
						if (UserComparator7.field1455 == null) {
							UserComparator7.field1455 = new class370();
						}
					} else {
						UserComparator7.field1455 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						ChatChannel.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var80;
				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readUnsignedIntLE();
					var22 = var3.readUnsignedIntLE();
					var80 = VarbitComposition.getWidget(var5);
					ItemComposition var93;
					if (!var80.isIf3) {
						if (var20 == -1) {
							var80.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var93 = class125.ItemDefinition_get(var20).getCountObj(var22);
						var80.modelType = 4;
						var80.modelId = var20;
						var80.modelAngleX = var93.xan2d;
						var80.modelAngleY = var93.yan2d;
						var80.modelZoom = var93.zoom2d * 100 / var22;
						class200.invalidateWidget(var80);
					} else {
						var80.itemId = var20;
						var80.itemQuantity = var22;
						var93 = class125.ItemDefinition_get(var20).getCountObj(var22);
						var80.modelAngleX = var93.xan2d;
						var80.modelAngleY = var93.yan2d;
						var80.modelAngleZ = var93.zan2d;
						var80.modelOffsetX = var93.offsetX2d;
						var80.modelOffsetY = var93.offsetY2d;
						var80.modelZoom = var93.zoom2d;
						if (var93.isStackable == 1) {
							var80.itemQuantityMode = 1;
						} else {
							var80.itemQuantityMode = 2;
						}

						if (var80.field3679 > 0) {
							var80.modelZoom = var80.modelZoom * 32 / var80.field3679;
						} else if (var80.rawWidth > 0) {
							var80.modelZoom = var80.modelZoom * 32 / var80.rawWidth;
						}

						class200.invalidateWidget(var80);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3277 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntLE();
					var22 = var3.readUnsignedShortLE();
					var80 = VarbitComposition.getWidget(var5);
					var80.field3680 = var20 + (var22 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.HINT_ARROW == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) {
						if (hintArrowType == 2) {
							hintArrowSubX = 4096;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 8192;
							hintArrowSubY = 4096;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 4096;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 4096;
							hintArrowSubY = 8192;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte() * 4;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var76 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var76 != null) {
						Actor.closeInterface(var76, true);
					}

					if (meslayerContinueWidget != null) {
						class200.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3314 == var1.serverPacket) {
					class135.field1600 = new class455(class344.HitSplatDefinition_cached);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3257 == var1.serverPacket) {
					class387.field4440 = var3.readUnsignedByte();
					WorldMapSectionType.field2978 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3235 == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field797 = true;
					var20 = class4.method18(var3.readShort() & 2027);
					var5 = class74.method2088(var3.readShort() & 2027);
					var22 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field643 = new class479(class19.cameraPitch, var5, var22, var7);
					field779 = new class479(class456.cameraYaw, var20, var22, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3298 == var1.serverPacket) {
					if (class135.field1600 == null) {
						class135.field1600 = new class455(class344.HitSplatDefinition_cached);
					}

					class522 var53 = class344.HitSplatDefinition_cached.method8355(var3);
					class135.field1600.field4768.vmethod8804(var53.field5135, var53.field5134);
					field715[++field793 - 1 & 31] = var53.field5135;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var57 = var3.readUnsignedByteSub();
					var59 = var57 >> 2;
					var11 = var57 & 3;
					var79 = field591[var59];
					var13 = var3.readUnsignedShort();
					var22 = var3.readMedium();
					var20 = var22 >> 16;
					var5 = var22 >> 8 & 255;
					var7 = var20 + (var22 >> 4 & 7);
					var8 = var5 + (var22 & 7);
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
						if (var79 == 0) {
							BoundaryObject var99 = UserComparator5.scene.method4581(class36.Client_plane, var7, var8);
							if (var99 != null) {
								var15 = class458.Entity_unpackID(var99.tag);
								if (var59 == 2) {
									var99.renderable1 = new DynamicObject(var15, 2, var11 + 4, class36.Client_plane, var7, var8, var13, false, var99.renderable1);
									var99.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, class36.Client_plane, var7, var8, var13, false, var99.renderable2);
								} else {
									var99.renderable1 = new DynamicObject(var15, var59, var11, class36.Client_plane, var7, var8, var13, false, var99.renderable1);
								}
							}
						} else if (var79 == 1) {
							WallDecoration var98 = UserComparator5.scene.method4616(class36.Client_plane, var7, var8);
							if (var98 != null) {
								var15 = class458.Entity_unpackID(var98.tag);
								if (var59 != 4 && var59 != 5) {
									if (var59 == 6) {
										var98.renderable1 = new DynamicObject(var15, 4, var11 + 4, class36.Client_plane, var7, var8, var13, false, var98.renderable1);
									} else if (var59 == 7) {
										var98.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, class36.Client_plane, var7, var8, var13, false, var98.renderable1);
									} else if (var59 == 8) {
										var98.renderable1 = new DynamicObject(var15, 4, var11 + 4, class36.Client_plane, var7, var8, var13, false, var98.renderable1);
										var98.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, class36.Client_plane, var7, var8, var13, false, var98.renderable2);
									}
								} else {
									var98.renderable1 = new DynamicObject(var15, 4, var11, class36.Client_plane, var7, var8, var13, false, var98.renderable1);
								}
							}
						} else if (var79 == 2) {
							GameObject var95 = UserComparator5.scene.getGameObject(class36.Client_plane, var7, var8);
							if (var59 == 11) {
								var59 = 10;
							}

							if (var95 != null) {
								var95.renderable = new DynamicObject(class458.Entity_unpackID(var95.tag), var59, var11, class36.Client_plane, var7, var8, var13, false, var95.renderable);
							}
						} else if (var79 == 3) {
							FloorDecoration var96 = UserComparator5.scene.getFloorDecoration(class36.Client_plane, var7, var8);
							if (var96 != null) {
								var96.renderable = new DynamicObject(class458.Entity_unpackID(var96.tag), 22, var11, class36.Client_plane, var7, var8, var13, false, var96.renderable);
							}
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3336 == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShortLE();
					var22 = var3.readUnsignedShortLE();
					class452.method8324(var20, var5, var22, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var20 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedByteNeg();
					var64 = var3.readStringCp1252NullTerminated();
					if (var20 >= 1 && var20 <= 8) {
						if (var64.equalsIgnoreCase("null")) {
							var64 = null;
						}

						playerMenuActions[var20 - 1] = var64;
						playerOptionsPriorities[var20 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3335 == var1.serverPacket) {
					var20 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					WorldMapSectionType.performPlayerAnimation(class136.localPlayer, var5, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3251 == var1.serverPacket) {
					class27.method408(class296.field3194);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3329 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntIME();
					var6 = VarbitComposition.getWidget(var5);
					if (var6.modelType != 6 || var20 != var6.modelId) {
						var6.modelType = 6;
						var6.modelId = var20;
						class200.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
					destinationX = var3.readUnsignedByte();
					if (destinationX == 255) {
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte();
					if (destinationY == 255) {
						destinationY = 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3311 == var1.serverPacket) {
					field622 = cycleCntr;
					var72 = var3.readByte();
					class160 var75 = new class160(var3);
					ClanChannel var60;
					if (var72 >= 0) {
						var60 = currentClanChannels[var72];
					} else {
						var60 = WorldMapLabelSize.guestClanChannel;
					}

					var75.method3339(var60);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3301 == var1.serverPacket) {
					var8 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					var57 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShortAdd();
					var22 = var3.readUnsignedShortAddLE();
					ArrayList var88 = new ArrayList();
					var88.add(var20);
					var88.add(var5);
					ObjectComposition.method3963(var88, var22, var7, var8, var57);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var6 = VarbitComposition.getWidget(var20);
					} else {
						var6 = null;
					}

					if (var6 != null) {
						for (var7 = 0; var7 < var6.itemIds.length; ++var7) {
							var6.itemIds[var7] = 0;
							var6.itemQuantities[var7] = 0;
						}
					}

					GrandExchangeOfferNameComparator.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var57 = var3.readUnsignedByteSub();
						if (var57 == 255) {
							var57 = var3.readInt();
						}

						var59 = var3.readUnsignedShortLE();
						if (var6 != null && var8 < var6.itemIds.length) {
							var6.itemIds[var8] = var59;
							var6.itemQuantities[var8] = var57;
						}

						ObjectComposition.itemContainerSetItem(var5, var8, var59 - 1, var57);
					}

					if (var6 != null) {
						class200.invalidateWidget(var6);
					}

					DbRowType.method9006();
					changedItemContainers[++field686 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					var87 = this.username() == null;
					class85.updatePlayers(var3, var1.serverPacketLength);
					WorldMapSectionType.method5467();
					if (var87 && this.username() != null && this.username().method9741().equalsIgnoreCase("nin")) {
						class415.addGameMessage(4, "", "$jmod_luck = true");
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3331 == var1.serverPacket) {
					var72 = var3.readByte();
					var21 = var3.readStringCp1252NullTerminated();
					long var40 = (long)var3.readUnsignedShort();
					long var42 = (long)var3.readMedium();
					PlayerType var28 = (PlayerType)ClientPreferences.findEnumerated(PendingSpawn.PlayerType_values(), var3.readUnsignedByte());
					long var44 = var42 + (var40 << 32);
					boolean var65 = false;
					ClanChannel var39 = null;
					var39 = var72 >= 0 ? currentClanChannels[var72] : WorldMapLabelSize.guestClanChannel;
					if (var39 == null) {
						var65 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var28.isUser && class177.friendSystem.isIgnored(new Username(var21, class457.loginType))) {
									var65 = true;
								}
								break;
							}

							if (var44 == crossWorldMessageIds[var15]) {
								var65 = true;
								break;
							}

							++var15;
						}
					}

					if (!var65) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var44;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var36 = AbstractFont.escapeBrackets(class292.method5720(var3));
						var16 = var72 >= 0 ? 41 : 44;
						if (var28.modIcon != -1) {
							class213.addChatMessage(var16, SecureRandomCallable.method2253(var28.modIcon) + var21, var36, var39.name);
						} else {
							class213.addChatMessage(var16, var21, var36, var39.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3305 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readUnsignedIntME();
					var22 = var3.readUnsignedShortLE();
					if (var22 == 65535) {
						var22 = -1;
					}

					var7 = var3.readUnsignedIntME();

					for (var8 = var20; var8 <= var22; ++var8) {
						var33 = (long)var8 + ((long)var7 << 32);
						Node var35 = widgetFlags.get(var33);
						if (var35 != null) {
							var35.remove();
						}

						widgetFlags.put(new IntegerNode(var5), var33);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3284 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readInt();
					var6 = VarbitComposition.getWidget(var20);
					UserComparator9.method2889(var6, var5);
					class200.invalidateWidget(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortAdd();
					var6 = VarbitComposition.getWidget(var20);
					if (var6.modelType != 1 || var5 != var6.modelId) {
						var6.modelType = 1;
						var6.modelId = var5;
						class200.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					class177.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field763 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3274 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShortAddLE();
					var82 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var82 != null) {
						Actor.closeInterface(var82, var22 != var82.group);
					}

					WorldMapLabelSize.method5085(var20, var22, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					tradeChatMode = var3.readUnsignedByteAdd();
					publicChatMode = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < VarpDefinition.field1904; ++var20) {
						VarpDefinition var74 = class158.VarpDefinition_get(var20);
						if (var74 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}

					DbRowType.method9006();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3332 == var1.serverPacket) {
					var87 = var3.readUnsignedByteAdd() == 1;
					var5 = var3.readUnsignedIntLE();
					var6 = VarbitComposition.getWidget(var5);
					WorldMapRenderer.method5373(var6, class136.localPlayer.appearance, var87);
					class200.invalidateWidget(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3246 == var1.serverPacket) {
					var20 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByteSub();
					var22 = var3.readUnsignedIntIME();
					var80 = VarbitComposition.getWidget(var22);
					class310.method6007(var80, var5, var20);
					class200.invalidateWidget(var80);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3232 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedByteSub();
					var6 = VarbitComposition.getWidget(var20);
					TaskHandler.method3518(var6, class136.localPlayer.appearance.gender, var5);
					class200.invalidateWidget(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					if (var20 == 65535) {
						var20 = -1;
					}

					WorldMapSectionType.playSong(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3260 == var1.serverPacket) {
					var20 = var3.method9134();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					Interpreter.method1995(var5, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					class14.privateChatMode = class228.method4513(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3299 == var1.serverPacket) {
					field622 = cycleCntr;
					var72 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var72 >= 0) {
							currentClanChannels[var72] = null;
						} else {
							WorldMapLabelSize.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var72 >= 0) {
						currentClanChannels[var72] = new ClanChannel(var3);
					} else {
						WorldMapLabelSize.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var20] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false);
					}

					field721 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3249 == var1.serverPacket) {
					class27.method408(class296.field3200);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3327 == var1.serverPacket) {
					class27.method408(class296.field3193);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3308 == var1.serverPacket) {
					Tile.method4401();
					var72 = var3.readByte();
					class146 var73 = new class146(var3);
					ClanSettings var56;
					if (var72 >= 0) {
						var56 = currentClanSettings[var72];
					} else {
						var56 = class11.guestClanSettings;
					}

					var73.method3159(var56);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var87 = var3.readUnsignedByteSub() == 1;
					var5 = var3.readUnsignedIntLE();
					var6 = VarbitComposition.getWidget(var5);
					if (var87 != var6.isHidden) {
						var6.isHidden = var87;
						class200.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var37;
				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntLE();
					InterfaceParent var55 = (InterfaceParent)interfaceParents.get((long)var5);
					var82 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var82 != null) {
						Actor.closeInterface(var82, var55 == null || var82.group != var55.group);
					}

					if (var55 != null) {
						var55.remove();
						interfaceParents.put(var55, (long)var20);
					}

					var37 = VarbitComposition.getWidget(var5);
					if (var37 != null) {
						class200.invalidateWidget(var37);
					}

					var37 = VarbitComposition.getWidget(var20);
					if (var37 != null) {
						class200.invalidateWidget(var37);
						SoundCache.revalidateWidgetScroll(ArchiveLoader.Widget_interfaceComponents[var37.id >>> 16], var37, true);
					}

					if (rootInterface != -1) {
						ChatChannel.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var20 = var3.readShortLE();
					var5 = var3.readUnsignedIntME();
					var22 = var3.method9131();
					var80 = VarbitComposition.getWidget(var5);
					if (var20 != var80.rawX || var22 != var80.rawY || var80.xAlignment != 0 || var80.yAlignment != 0) {
						var80.rawX = var20;
						var80.rawY = var22;
						var80.xAlignment = 0;
						var80.yAlignment = 0;
						class200.invalidateWidget(var80);
						this.alignWidget(var80);
						if (var80.type == 0) {
							SoundCache.revalidateWidgetScroll(ArchiveLoader.Widget_interfaceComponents[var5 >> 16], var80, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							MenuAction.changeGameOptions(var20);
							changedVarps[++changedVarpCount - 1 & 31] = var20;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3280 == var1.serverPacket) {
					class135.field1600 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3259 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					class17.queueSoundEffect(var20, var5, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					class358.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3302 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					FriendsChat.method7908(var20);
					var1.serverPacket = null;
					return true;
				}

				NPC var92;
				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var5 = var3.readUnsignedIntIME();
					var22 = var3.readUnsignedShortAdd();
					var20 = var3.readUnsignedShortAddLE();
					var92 = npcs[var20];
					var7 = var3.readUnsignedByte();
					if (var92 != null) {
						var92.updateSpotAnimation(var7, var22, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3216 == var1.serverPacket) {
					class27.method408(class296.field3195);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3230 == var1.serverPacket) {
					return this.method1287(var1);
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var21 = AbstractFont.escapeBrackets(class153.method3218(class292.method5720(var3)));
					class415.addGameMessage(6, var52, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var22 = class27.getGcDuration();
					PacketBufferNode var24 = class503.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var24.packetBuffer.writeByteNeg(var22);
					var24.packetBuffer.writeByteAdd(GameEngine.fps);
					var24.packetBuffer.writeIntLE(var20);
					var24.packetBuffer.writeInt(var5);
					packetWriter.addNode(var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3291 == var1.serverPacket) {
					Tile.method4401();
					var72 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var72 >= 0) {
							currentClanSettings[var72] = null;
						} else {
							class11.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var72 >= 0) {
						currentClanSettings[var72] = new ClanSettings(var3);
					} else {
						class11.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					AABB.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					class303.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					class303.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var29 = (long)var3.readUnsignedShort();
					var31 = (long)var3.readMedium();
					PlayerType var25 = (PlayerType)ClientPreferences.findEnumerated(PendingSpawn.PlayerType_values(), var3.readUnsignedByte());
					long var46 = (var29 << 32) + var31;
					var23 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (var46 == crossWorldMessageIds[var13]) {
							var23 = true;
							break;
						}
					}

					if (class177.friendSystem.isIgnored(new Username(var52, class457.loginType))) {
						var23 = true;
					}

					if (!var23 && field637 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var46;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var38 = AbstractFont.escapeBrackets(class153.method3218(class292.method5720(var3)));
						byte var14;
						if (var25.isPrivileged) {
							var14 = 7;
						} else {
							var14 = 3;
						}

						if (var25.modIcon != -1) {
							class415.addGameMessage(var14, SecureRandomCallable.method2253(var25.modIcon) + var52, var38);
						} else {
							class415.addGameMessage(var14, var52, var38);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var51 = new World();
					var51.host = var3.readStringCp1252NullTerminated();
					var51.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var51.properties = var5;
					if (var51.isDeadman()) {
						var51.field823 = "beta";
					}

					class129.updateGameState(45);
					var2.close();
					var2 = null;
					class137.changeWorld(var51);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3312 == var1.serverPacket) {
					DbRowType.method9006();
					runEnergy = var3.readUnsignedShort();
					field724 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3296 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					short var58 = (short)var3.method9131();
					var22 = var3.readUnsignedByteAdd();
					var7 = var3.readUnsignedShortLE();
					var92 = npcs[var7];
					if (var92 != null) {
						var92.method2597(var22, var20, var58);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3321 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					rootInterface = var20;
					this.resizeRoot(false);
					class92.Widget_resetModelFrames(var20);
					ScriptFrame.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field718[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					class59.method1175(var20);
					changedItemContainers[++field686 - 1 & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3290 == var1.serverPacket) {
					class177.friendSystem.method1865();
					field763 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3286 == var1.serverPacket) {
					class27.method408(class296.field3197);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3250 == var1.serverPacket) {
					class27.method408(class296.field3202);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3328 == var1.serverPacket) {
					class27.method408(class296.field3196);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					class387.field4440 = var3.readUnsignedByteSub();
					WorldMapSectionType.field2978 = var3.readUnsignedByteNeg();

					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						class296 var71 = ViewportMouse.method4947()[var20];
						class27.method408(var71);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					class177.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					GameBuild.FriendSystem_invalidateIgnoreds();
					field763 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAdd() * 30;
					field724 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readInt();
					var22 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedShortAdd();
					var37 = VarbitComposition.getWidget(var5);
					if (var7 != var37.modelAngleX || var20 != var37.modelAngleY || var22 != var37.modelZoom) {
						var37.modelAngleX = var7;
						var37.modelAngleY = var20;
						var37.modelZoom = var22;
						class200.invalidateWidget(var37);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var6 = VarbitComposition.getWidget(var20);
					} else {
						var6 = null;
					}

					for (; var3.offset < var1.serverPacketLength; ObjectComposition.itemContainerSetItem(var5, var7, var8 - 1, var57)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var57 = 0;
						if (var8 != 0) {
							var57 = var3.readUnsignedByte();
							if (var57 == 255) {
								var57 = var3.readInt();
							}
						}

						if (var6 != null && var7 >= 0 && var7 < var6.itemIds.length) {
							var6.itemIds[var7] = var8;
							var6.itemQuantities[var7] = var57;
						}
					}

					if (var6 != null) {
						class200.invalidateWidget(var6);
					}

					DbRowType.method9006();
					changedItemContainers[++field686 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var72 = var3.readByteSub();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var72;
					if (Varps.Varps_main[var5] != var72) {
						Varps.Varps_main[var5] = var72;
					}

					MenuAction.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3325 == var1.serverPacket) {
					class27.method408(class296.field3203);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					class387.field4440 = var3.readUnsignedByte();
					WorldMapSectionType.field2978 = var3.readUnsignedByte();

					for (var20 = WorldMapSectionType.field2978; var20 < WorldMapSectionType.field2978 + 8; ++var20) {
						for (var5 = class387.field4440; var5 < class387.field4440 + 8; ++var5) {
							if (groundItems[class36.Client_plane][var20][var5] != null) {
								groundItems[class36.Client_plane][var20][var5] = null;
								class344.updateItemPile(var20, var5);
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) {
						if (var50.x >= WorldMapSectionType.field2978 && var50.x < WorldMapSectionType.field2978 + 8 && var50.y >= class387.field4440 && var50.y < class387.field4440 + 8 && var50.plane == class36.Client_plane) {
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntME();
					var6 = VarbitComposition.getWidget(var5);
					if (var6.modelType != 2 || var20 != var6.modelId) {
						var6.modelType = 2;
						var6.modelId = var20;
						class200.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3239 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var22 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field618[var20] = true;
					field783[var20] = var5;
					field784[var20] = var22;
					field785[var20] = var7;
					field771[var20] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					class358.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field775 = false;
					WorldMapIcon_1.field2870 = var3.readUnsignedByte() * 128;
					class132.field1574 = var3.readUnsignedByte() * 128;
					ModeWhere.field4408 = var3.readUnsignedShort();
					field755 = var3.readUnsignedByte();
					SecureRandomFuture.field990 = var3.readUnsignedByte();
					if (SecureRandomFuture.field990 >= 100) {
						class157.cameraX = WorldMapIcon_1.field2870 * 16384 + 64;
						SoundSystem.cameraZ = class132.field1574 * 16384 + 64;
						class384.cameraY = class306.getTileHeight(class157.cameraX, SoundSystem.cameraZ, class36.Client_plane) - ModeWhere.field4408;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntME();
					Varps.Varps_temp[var20] = var5;
					if (Varps.Varps_main[var20] != var5) {
						Varps.Varps_main[var20] = var5;
					}

					MenuAction.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3297 == var1.serverPacket) {
					isCameraLocked = true;
					field781 = false;
					field775 = true;
					WorldMapIcon_1.field2870 = var3.readUnsignedByte() * 128;
					class132.field1574 = var3.readUnsignedByte() * 128;
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field782 = var3.readBoolean();
					var22 = var3.readUnsignedByte();
					var7 = WorldMapIcon_1.field2870 * 16384 + 64;
					var8 = class132.field1574 * 16384 + 64;
					boolean var9 = false;
					boolean var10 = false;
					if (field782) {
						var57 = class384.cameraY;
						var59 = class306.getTileHeight(var7, var8, class36.Client_plane) - var20;
					} else {
						var57 = class306.getTileHeight(class157.cameraX, SoundSystem.cameraZ, class36.Client_plane) - class384.cameraY;
						var59 = var20;
					}

					field778 = new class478(class157.cameraX, SoundSystem.cameraZ, var57, var7, var8, var59, var5, var22);
					var1.serverPacket = null;
					return true;
				}

				class317.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1421 != null ? var1.field1421.id : -1) + "," + (var1.field1422 != null ? var1.field1422.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				WorldMapScaleHandler.logOut();
			} catch (IOException var48) {
				class93.method2369();
			} catch (Exception var49) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1421 != null ? var1.field1421.id : -1) + "," + (var1.field1422 != null ? var1.field1422.id : -1) + "," + var1.serverPacketLength + "," + (class136.localPlayer.pathX[0] + AbstractArchive.baseX * 64) + "," + (class136.localPlayer.pathY[0] + class148.baseY * 64) + ",";

				for (var22 = 0; var22 < var1.serverPacketLength && var22 < 50; ++var22) {
					var21 = var21 + var3.array[var22] + ",";
				}

				class317.RunException_sendStackTrace(var21, var49);
				WorldMapScaleHandler.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1663377203"
	)
	@Export("menu")
	final void menu() {
		class143.menuSort();
		if (clickedWidget == null) {
			int var1 = MouseHandler.MouseHandler_lastButton;
			int var2;
			if (isMenuOpen) {
				int var3;
				if (var1 != 1 && (class28.mouseCam || var1 != 4)) {
					var2 = MouseHandler.MouseHandler_x;
					var3 = MouseHandler.MouseHandler_y;
					if (var2 < Canvas.menuX - 10 || var2 > Canvas.menuX + UserComparator5.menuWidth + 10 || var3 < UserComparator6.menuY - 10 || var3 > UserComparator6.menuY + ModeWhere.menuHeight + 10) {
						isMenuOpen = false;
						Skeleton.method4553(Canvas.menuX, UserComparator6.menuY, UserComparator5.menuWidth, ModeWhere.menuHeight);
					}
				}

				if (var1 == 1 || !class28.mouseCam && var1 == 4) {
					var2 = Canvas.menuX;
					var3 = UserComparator6.menuY;
					int var4 = UserComparator5.menuWidth;
					int var5 = MouseHandler.MouseHandler_lastPressedX;
					int var6 = MouseHandler.MouseHandler_lastPressedY;
					int var7 = -1;

					for (int var8 = 0; var8 < menuOptionsCount; ++var8) {
						int var9 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31;
						if (var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) {
							var7 = var8;
						}
					}

					if (var7 != -1) {
						SoundCache.method859(var7);
					}

					isMenuOpen = false;
					Skeleton.method4553(Canvas.menuX, UserComparator6.menuY, UserComparator5.menuWidth, ModeWhere.menuHeight);
				}
			} else {
				var2 = class59.method1178();
				if ((var1 == 1 || !class28.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
					var1 = 2;
				}

				if ((var1 == 1 || !class28.mouseCam && var1 == 4) && menuOptionsCount > 0) {
					SoundCache.method859(var2);
				}

				if (var1 == 2 && menuOptionsCount > 0) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1989304759"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = class59.method1178();
		return (leftClickOpensMenu && menuOptionsCount > 2 || class127.method2959(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "14"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		ClanSettings.method3291(var1, var2);
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		UserComparator5.scene.menuOpen(class36.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-657989898"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface;
		int var3 = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
		int var4 = WorldMapArchiveLoader.canvasHeight;
		if (Login.loadInterface(var2)) {
			class36.resizeInterface(ArchiveLoader.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)V",
		garbageValue = "1861901325"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : VarbitComposition.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
			var4 = WorldMapArchiveLoader.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		FriendSystem.alignWidgetSize(var1, var3, var4, false);
		class17.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	final void method1294() {
		class200.invalidateWidget(clickedWidget);
		++class130.widgetDragDuration;
		int var1;
		int var2;
		if (field809 && field761) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field648) {
				var1 = field648;
			}

			if (var1 + clickedWidget.width > field648 + clickedWidgetParent.width) {
				var1 = field648 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field703) {
				var2 = field703;
			}

			if (var2 + clickedWidget.height > field703 + clickedWidgetParent.height) {
				var2 = field703 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field705;
			int var4 = var2 - field706;
			int var5 = clickedWidget.dragZoneSize;
			if (class130.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field648 + clickedWidgetParent.scrollX;
			int var7 = var2 - field703 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				GrandExchangeOfferOwnWorldComparator.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = clickedWidget.onDragComplete;
						GrandExchangeOfferOwnWorldComparator.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && WorldMapEvent.method5647(clickedWidget) != null) {
						PacketBufferNode var13 = class503.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var13.packetBuffer.writeShort(clickedWidget.itemId);
						var13.packetBuffer.writeShortLE(clickedWidget.childIndex);
						var13.packetBuffer.writeShort(draggedOnWidget.childIndex);
						var13.packetBuffer.writeShortAddLE(draggedOnWidget.itemId);
						var13.packetBuffer.writeIntLE(clickedWidget.id);
						var13.packetBuffer.writeIntIME(draggedOnWidget.id);
						packetWriter.addNode(var13);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(widgetClickX + field705, widgetClickY + field706);
				} else if (menuOptionsCount > 0) {
					int var11 = widgetClickX + field705;
					int var9 = widgetClickY + field706;
					MenuAction var10 = WorldMapRegion.tempMenuAction;
					if (var10 != null) {
						class60.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.itemId, var10.action, var10.target, var11, var9);
					}

					WorldMapRegion.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		} else {
			if (class130.widgetDragDuration > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					var1 = widgetClickX + field705;
					var2 = field706 + widgetClickY;
					MenuAction var12 = WorldMapRegion.tempMenuAction;
					if (var12 != null) {
						class60.menuAction(var12.param0, var12.param1, var12.opcode, var12.identifier, var12.itemId, var12.action, var12.target, var1, var2);
					}

					WorldMapRegion.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "466420447"
	)
	@Export("username")
	public Username username() {
		return class136.localPlayer != null ? class136.localPlayer.username : null;
	}

	protected void finalize() throws Throwable {
		class306.field3400.remove(this);
		super.finalize();
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field560 = var1;
			class328.method6115(10);
		}
	}

	public long getAccountHash() {
		return this.field780;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						int var4;
						switch(var1) {
						case 3:
							if (var2.equalsIgnoreCase("true")) {
								isMembersWorld = true;
							} else {
								isMembersWorld = false;
							}
							break;
						case 4:
							if (clientType == -1) {
								clientType = Integer.parseInt(var2);
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2);
							break;
						case 6:
							var4 = Integer.parseInt(var2);
							Language var15;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var15 = Language.Language_valuesOrdered[var4];
							} else {
								var15 = null;
							}

							Interpreter.clientLanguage = var15;
							break;
						case 7:
							var4 = Integer.parseInt(var2);
							GameBuild[] var5 = new GameBuild[]{GameBuild.WIP, GameBuild.RC, GameBuild.LIVE, GameBuild.BUILDLIVE};
							GameBuild[] var6 = var5;
							int var7 = 0;

							GameBuild var14;
							while (true) {
								if (var7 >= var6.length) {
									var14 = null;
									break;
								}

								GameBuild var8 = var6[var7];
								if (var4 == var8.buildId) {
									var14 = var8;
									break;
								}

								++var7;
							}

							ArchiveLoader.field1044 = var14;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class36.field263 = var2;
							break;
						case 10:
							StudioGame[] var9 = new StudioGame[]{StudioGame.game5, StudioGame.oldscape, StudioGame.stellardawn, StudioGame.game4, StudioGame.runescape, StudioGame.game3};
							KeyHandler.field138 = (StudioGame)ClientPreferences.findEnumerated(var9, Integer.parseInt(var2));
							if (StudioGame.oldscape == KeyHandler.field138) {
								class457.loginType = LoginType.oldscape;
							} else {
								class457.loginType = LoginType.field4989;
							}
							break;
						case 11:
							BuddyRankComparator.field1477 = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 22:
						case 23:
						case 24:
						default:
							break;
						case 14:
							PcmPlayer.field299 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class292.field3084 = var2;
							break;
						case 21:
							field521 = Integer.parseInt(var2);
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								field525 = Integer.parseInt(var2);
							} else {
								field525 = Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
						}
					}
				}

				class92.method2368();
				VarbitComposition.worldHost = this.getCodeBase().getHost();
				class153.field1700 = new NewArchiveStuff();
				String var10 = ArchiveLoader.field1044.name;
				byte var11 = 0;
				if ((worldProperties & 65536) != 0) {
					VarpDefinition.field1910 = "beta";
				}

				try {
					PlayerCompositionColorTextureOverride.method3575("oldschool", VarpDefinition.field1910, var10, var11, 22);
				} catch (Exception var12) {
					class317.RunException_sendStackTrace((String)null, var12);
				}

				TileItem.client = this;
				RunException.field5236 = clientType;
				Actor.method2418();
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.field562 = true;
				}

				if (field657 == -1) {
					if (!this.method1267() && !this.method1472()) {
						field657 = 0;
					} else {
						field657 = 5;
					}
				}

				this.startThread(765, 503, 215, 1);
			}
		} catch (RuntimeException var13) {
			throw class300.newRunException(var13, "client.init(" + ')');
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field564 = var1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)J",
		garbageValue = "-71"
	)
	public static long method1805(int var0) {
		if (var0 > 63) {
			throw new class390("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L;
		}
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Ldh;B)V",
		garbageValue = "2"
	)
	static void method1623(NPC var0) {
		var0.field1223 = var0.definition.size;
		var0.field1251 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field1996;
		var0.field1194 = var0.definition.field2013;
		var0.field1197 = var0.definition.field1998;
		var0.field1198 = var0.definition.field2015;
		var0.field1211 = var0.definition.field2016;
		var0.field1200 = var0.definition.field2017;
		var0.field1201 = var0.definition.field2018;
		var0.field1202 = var0.definition.field2024;
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2022659709"
	)
	static final void method1806(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? currentClanChannels[var0] : WorldMapLabelSize.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3383()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = class503.getPacketBufferNode(ClientPacket.field3106, packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + class501.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				packetWriter.addNode(var5);
			}
		}
	}
}
