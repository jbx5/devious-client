import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
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
public final class Client extends GameEngine implements Usernamed, OAuthApi, class325 {
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = 1025060263
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vp")
	@ObfuscatedGetter(
		intValue = 441278609
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = -550294613
	)
	public static int field814;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	static final class232 field816;
	@ObfuscatedName("xx")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	static final ApproximateRouteStrategy field643;
	@ObfuscatedName("xo")
	static int[] field821;
	@ObfuscatedName("xu")
	static int[] field637;
	@ObfuscatedName("wu")
	@ObfuscatedGetter(
		intValue = 2042036807
	)
	static int field805;
	@ObfuscatedName("vi")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = 1362741755
	)
	static int field806;
	@ObfuscatedName("wc")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("xp")
	@ObfuscatedGetter(
		intValue = -72664761
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("vt")
	static int[] field707;
	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "[Log;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("xy")
	@ObfuscatedGetter(
		intValue = 521838813
	)
	static int field819;
	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	static class490 field737;
	@ObfuscatedName("vm")
	static short field791;
	@ObfuscatedName("vc")
	static short field792;
	@ObfuscatedName("vv")
	static short field594;
	@ObfuscatedName("vo")
	static short field798;
	@ObfuscatedName("vy")
	static short field662;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		intValue = 352410347
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vw")
	static short field795;
	@ObfuscatedName("vn")
	@ObfuscatedGetter(
		intValue = 1587678989
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = -1695078929
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vq")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vs")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("wz")
	static List field815;
	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	static class438 field810;
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("ws")
	@ObfuscatedGetter(
		intValue = -949581313
	)
	static int field587;
	@ObfuscatedName("bq")
	static boolean field536;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1845111543
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -678916321
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1141159649
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cg")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cq")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 190783413
	)
	static int field717;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1953789213
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1843463469
	)
	static int field525;
	@ObfuscatedName("cs")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -34504981
	)
	@Export("revision")
	public static int revision;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -536970535
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("ds")
	static boolean field615;
	@ObfuscatedName("eo")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 1478401101
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		longValue = 1781940677952610751L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -1636995889
	)
	static int field652;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -448589971
	)
	static int field597;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		longValue = 4950206723942446097L
	)
	static long field708;
	@ObfuscatedName("ek")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1975774047
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 1931950625
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 2139633527
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 2061765689
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("eq")
	@ObfuscatedGetter(
		intValue = -1088840979
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 1552857465
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = 1648916966
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -921682624
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = -1057122752
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("ee")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ey")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	static class94 field577;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = -1477389957
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = -1208586899
	)
	static int field552;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = 178361339
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -2050897657
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = 41305447
	)
	static int field555;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = -1259040265
	)
	static int field732;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 714300877
	)
	static int field557;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	static class141 field558;
	@ObfuscatedName("gz")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	static class534 field559;
	@ObfuscatedName("ha")
	static final String field570;
	@ObfuscatedName("hh")
	static final String field571;
	@ObfuscatedName("hr")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("im")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "[Ldc;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = 1607562291
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("if")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -614171483
	)
	static int field581;
	@ObfuscatedName("ib")
	static int[] field533;
	@ObfuscatedName("it")
	static String field772;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = 1835674189
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ip")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ji")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(
		intValue = -1965397131
	)
	static int field588;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 596527587
	)
	static int field589;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = -1395552755
	)
	static int field590;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 335846101
	)
	static int field591;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = 415283483
	)
	static int field545;
	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "[Lih;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jb")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jg")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("km")
	static final int[] field596;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 596305001
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 1285310077
	)
	static int field598;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = -1186719255
	)
	static int field801;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -1019436009
	)
	static int field556;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -504922113
	)
	static int field601;
	@ObfuscatedName("kv")
	static boolean field582;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -2037781071
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kd")
	@ObfuscatedGetter(
		intValue = -1872737735
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -1380774171
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -2065740293
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1633491125
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -1725957457
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -1381138387
	)
	static int field608;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = -848420063
	)
	static int mouseCamClickedY;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 197447207
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = 597336379
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 1398857067
	)
	static int field612;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 683276725
	)
	static int field613;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -1676940483
	)
	static int field614;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = -199987921
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -4178743
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 1998035387
	)
	public static int field547;
	@ObfuscatedName("le")
	static boolean field618;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = 261421435
	)
	static int field619;
	@ObfuscatedName("ln")
	static boolean field550;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -452116849
	)
	static int field621;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -1011934611
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -118095121
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("mi")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("ma")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("mj")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("mm")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("mc")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("mw")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("mx")
	static int[][] field630;
	@ObfuscatedName("mr")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("mt")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("mf")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 1268729305
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mu")
	@ObfuscatedGetter(
		intValue = -954692081
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -53982227
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 445764083
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = -536149059
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -1166137964
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = -1358084465
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("ms")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = -251513165
	)
	static int field790;
	@ObfuscatedName("my")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "[Ldj;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -505989115
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = 1142496111
	)
	static int field646;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		longValue = 4613200119782930099L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("nv")
	static boolean field648;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = -1279467103
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 344108283
	)
	static int field650;
	@ObfuscatedName("nc")
	static int[] field651;
	@ObfuscatedName("nk")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("nn")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("na")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nh")
	static int[] defaultRotations;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(
		intValue = 1612926111
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "[[[Lpf;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nr")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("ne")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nq")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("ng")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("np")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = -1679392067
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("oe")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("ob")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ok")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("ou")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("om")
	@Export("menuItemIds")
	static int[] menuItemIds;
	@ObfuscatedName("oo")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("ox")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("oc")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("oz")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("op")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ov")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -235410389
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = 1491278035
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = -1350255941
	)
	static int field788;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 910505255
	)
	static int field530;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 134903783
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("pc")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = 490485615
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -1680657639
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("ph")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("ps")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -702019829
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = -838666147
	)
	static int field691;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 1703110501
	)
	static int field692;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = -766426161
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = -1040295617
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 574925483
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = -1216858893
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = -1202113569
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pe")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -1707638011
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 102610401
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("qw")
	static boolean field647;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = -1189995383
	)
	static int field750;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -1811446391
	)
	static int field748;
	@ObfuscatedName("qm")
	static boolean field685;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = -1866235119
	)
	static int field554;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = 1207332227
	)
	static int field711;
	@ObfuscatedName("qn")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = 3592763
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qy")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 456212605
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("qv")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -60781103
	)
	static int field602;
	@ObfuscatedName("qs")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = -197182683
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qe")
	static int[] field720;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -1079499457
	)
	static int field721;
	@ObfuscatedName("qu")
	@ObfuscatedGetter(
		intValue = 482337689
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 1351992329
	)
	static int field723;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = -1504198831
	)
	static int field710;
	@ObfuscatedName("rl")
	@ObfuscatedGetter(
		intValue = -2036430613
	)
	static int field642;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = -9738657
	)
	static int field517;
	@ObfuscatedName("rr")
	@ObfuscatedGetter(
		intValue = -1041356011
	)
	static int field727;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = 656160353
	)
	static int field744;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 1573332305
	)
	static int field729;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = -473358783
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Lvz;"
	)
	static class547 field785;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static NodeDeque field542;
	@ObfuscatedName("rw")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static NodeDeque field734;
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	static NodeDeque field534;
	@ObfuscatedName("ru")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(
		intValue = -2037831695
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(
		intValue = 327497997
	)
	static int field738;
	@ObfuscatedName("ro")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("rd")
	static boolean[] field735;
	@ObfuscatedName("rb")
	static boolean[] field677;
	@ObfuscatedName("rz")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rg")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("sz")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("sr")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = -627973459
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		longValue = 3140104511378205691L
	)
	static long field700;
	@ObfuscatedName("sl")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sy")
	static int[] field749;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 288886593
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = 240907527
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sb")
	static String field752;
	@ObfuscatedName("se")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 759544711
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	static class226 field755;
	@ObfuscatedName("sn")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	static class224 field756;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -623625213
	)
	static int field757;
	@ObfuscatedName("so")
	static int[] field661;
	@ObfuscatedName("sc")
	static int[] field759;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		longValue = 7564198371908948165L
	)
	static long field760;
	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("tc")
	@ObfuscatedSignature(
		descriptor = "[Lgb;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = 188633027
	)
	static int field763;
	@ObfuscatedName("tp")
	@ObfuscatedGetter(
		intValue = 902990863
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tf")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("ts")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("ta")
	@ObfuscatedGetter(
		intValue = 755346193
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = -19262227
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = -1790146335
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tk")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = 858023415
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("uq")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ug")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("uu")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("ua")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("um")
	@ObfuscatedSignature(
		descriptor = "[Lbr;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("ub")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uk")
	static boolean field779;
	@ObfuscatedName("uh")
	static boolean field780;
	@ObfuscatedName("uw")
	static boolean field781;
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	static class494 field782;
	@ObfuscatedName("un")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static class493 field783;
	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	static class493 field784;
	@ObfuscatedName("ue")
	static boolean field726;
	@ObfuscatedName("vf")
	static boolean[] field786;
	@ObfuscatedName("vj")
	static int[] field787;
	@ObfuscatedName("vu")
	static int[] field680;
	@ObfuscatedName("ve")
	static int[] field789;
	@ObfuscatedName("hi")
	String field560;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	class14 field697;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	class18 field562;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester field563;
	@ObfuscatedName("hl")
	Future field740;
	@ObfuscatedName("hm")
	boolean field565;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(
		intValue = -1980265847
	)
	int field566;
	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	class18 field567;
	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field568;
	@ObfuscatedName("hn")
	Future field607;
	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	Buffer field764;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	class7 field575;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		longValue = 5776892925694285285L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field536 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field717 = -1;
		clientType = -1;
		field525 = -1;
		onMobile = false;
		revision = 217;
		gameState = 0;
		field615 = false;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field652 = -1;
		field597 = -1;
		field708 = -1L;
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
		field577 = class94.field1161;
		js5ConnectState = 0;
		field552 = 0;
		js5Errors = 0;
		loginState = 0;
		field555 = 0;
		field732 = 0;
		field557 = 0;
		field558 = class141.field1630;
		field559 = class534.field5199;
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

		field570 = class233.method4421(var2);
		field571 = class233.method4421(FriendSystem.method1945("com_jagex_auth_desktop_runelite:public"));
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[65536];
		npcCount = 0;
		npcIndices = new int[65536];
		field581 = 0;
		field533 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field588 = 0;
		field589 = 1;
		field590 = 0;
		field591 = 1;
		field545 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field596 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		graphicsCycle = 0;
		field598 = 2301979;
		field801 = 5063219;
		field556 = 3353893;
		field601 = 7759444;
		field582 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		field608 = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field612 = 0;
		field613 = 0;
		field614 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field547 = 0;
		field618 = false;
		field619 = 0;
		field550 = false;
		field621 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field630 = new int[overheadTextLimit][];
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
		field790 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field646 = 0;
		userId = -1L;
		field648 = true;
		drawPlayerNames = 0;
		field650 = 0;
		field651 = new int[1000];
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
		field788 = 0;
		field530 = 50;
		isItemSelected = 0;
		field772 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field691 = 0;
		field692 = -1;
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
		field647 = false;
		field750 = -1;
		field748 = -1;
		field685 = false;
		field554 = -1;
		field711 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field602 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field720 = new int[32];
		field721 = 0;
		chatCycle = 0;
		field723 = 0;
		field710 = 0;
		field642 = 0;
		field517 = 0;
		field727 = 0;
		field744 = 0;
		field729 = 0;
		mouseWheelRotation = 0;
		field785 = new class547();
		scriptEvents = new NodeDeque();
		field542 = new NodeDeque();
		field734 = new NodeDeque();
		field534 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field738 = -2;
		validRootWidgets = new boolean[100];
		field735 = new boolean[100];
		field677 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field700 = 0L;
		isResizable = true;
		field749 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field752 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field755 = new class226();
		field756 = new class224();
		field757 = 0;
		field661 = new int[128];
		field759 = new int[128];
		field760 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field763 = -1;
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
		field779 = false;
		field780 = false;
		field781 = false;
		field782 = null;
		field783 = null;
		field784 = null;
		field726 = false;
		field786 = new boolean[5];
		field787 = new int[5];
		field680 = new int[5];
		field789 = new int[5];
		field707 = new int[5];
		field791 = 256;
		field792 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field795 = 1;
		field662 = 32767;
		field594 = 1;
		field798 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field805 = -1;
		field806 = -1;
		field737 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field810 = new class438(8, class436.field4651);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field587 = -1;
		field814 = -1;
		field815 = new ArrayList();
		field816 = new class232();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field819 = 0;
		field643 = new ApproximateRouteStrategy();
		field821 = new int[50];
		field637 = new int[50];
	}

	public Client() {
		this.field565 = false;
		this.field566 = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-953371865"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field700 = GrandExchangeOfferTotalQuantityComparator.method7049() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1340(true);
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			ByteArrayPool.ByteArrayPool_alternativeSizes = var1;
			class425.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			class28.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) {
				class28.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field4591.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field4591);
		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null;
			class425.ByteArrayPool_altSizeArrayCounts = null;
			class28.ByteArrayPool_arrays = null;
			ByteArrayPool.field4591.clear();
			ByteArrayPool.field4591.add(100);
			ByteArrayPool.field4591.add(5000);
			ByteArrayPool.field4591.add(10000);
			ByteArrayPool.field4591.add(30000);
		}

		ObjectComposition.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class363.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		class164.currentPort = ObjectComposition.worldPort;
		PlayerComposition.field3615 = class345.field3664;
		class104.field1342 = class345.field3660;
		Coord.field3572 = class345.field3661;
		class33.field187 = class345.field3663;
		AbstractWorldMapIcon.urlRequester = new class115(this.field565, 217);
		this.setUpKeyboard();
		this.method552();
		class493.mouseWheel = this.mouseWheel();
		this.method488(field756, 0);
		this.method488(field755, 1);
		this.setUpClipboard();
		UserComparator10.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		class91.clientPreferences = FadeInTask.method7759();
		class416.method7746(this, GraphicsObject.field888);
		NPCComposition.setWindowedMode(class91.clientPreferences.method2525());
		InvDefinition.friendSystem = new FriendSystem(class166.loginType);
		this.field697 = new class14("tokenRequest", 1, 1);
		WorldMapIcon_1.method5236(this);
		field816.method4389();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-800201684"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		Skills.method6794();
		boolean var1 = CollisionMap.method4325();
		if (var1 && playingJingle && class171.pcmPlayer1 != null) {
			class171.pcmPlayer1.tryDiscard();
		}

		class313.method5891();
		field755.method4250();
		this.method539();
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

		if (class493.mouseWheel != null) {
			int var4 = class493.mouseWheel.useRotation();
			mouseWheelRotation = var4;
		}

		if (gameState == 0) {
			class314.method5896();
			class19.method283();
		} else if (gameState == 5) {
			WorldMapRenderer.loginScreen(this, class14.fontPlain11, UserComparator6.fontPlain12);
			class314.method5896();
			class19.method283();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				WorldMapRenderer.loginScreen(this, class14.fontPlain11, UserComparator6.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 50) {
				WorldMapRenderer.loginScreen(this, class14.fontPlain11, UserComparator6.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				Occluder.method4858();
			}
		} else {
			WorldMapRenderer.loginScreen(this, class14.fontPlain11, UserComparator6.fontPlain12);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "40"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && field700 != 0L && GrandExchangeOfferTotalQuantityComparator.method7049() > field700) {
			NPCComposition.setWindowedMode(class178.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			class367.drawTitle(SoundCache.fontBold12, class14.fontPlain11, UserComparator6.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class367.drawTitle(SoundCache.fontBold12, class14.fontPlain11, UserComparator6.fontPlain12);
			} else if (gameState == 50) {
				class367.drawTitle(SoundCache.fontBold12, class14.fontPlain11, UserComparator6.fontPlain12);
			} else if (gameState == 25) {
				if (field545 == 1) {
					if (field588 > field589) {
						field589 = field588;
					}

					var2 = (field589 * 50 - field588 * 50) / field589;
					class427.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field545 == 2) {
					if (field590 > field591) {
						field591 = field590;
					}

					var2 = (field591 * 50 - field590 * 50) / field591 + 50;
					class427.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					class427.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class427.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class427.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class367.drawTitle(SoundCache.fontBold12, class14.fontPlain11, UserComparator6.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field735[var2]) {
					class223.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field735[var2] = false;
				}
			}
		} else if (gameState > 0) {
			class223.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field735[var2] = false;
			}
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1875481219"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class33.varcs.hasUnwrittenChanges()) {
			class33.varcs.write();
		}

		if (class233.mouseRecorder != null) {
			class233.mouseRecorder.isRunning = false;
		}

		class233.mouseRecorder = null;
		packetWriter.close();
		BufferedSink.method8239();
		class493.mouseWheel = null;
		if (class171.pcmPlayer1 != null) {
			class171.pcmPlayer1.shutdown();
		}

		class59.field452.method7008();
		WorldMapDecorationType.method6792();
		if (AbstractWorldMapIcon.urlRequester != null) {
			AbstractWorldMapIcon.urlRequester.close();
			AbstractWorldMapIcon.urlRequester = null;
		}

		HealthBar.method2615();
		this.field697.method175();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "390692392"
	)
	protected final void vmethod1244() {
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "28669"
	)
	boolean method1246() {
		return this.field566 == 1;
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-83"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return class467.accessToken != null && !class467.accessToken.trim().isEmpty() && class191.refreshToken != null && !class191.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1137874919"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return LoginScreenAnimation.sessionId != null && !LoginScreenAnimation.sessionId.trim().isEmpty() && class155.characterId != null && !class155.characterId.trim().isEmpty();
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	boolean method1249() {
		return this.field563 != null;
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-10"
	)
	void method1250(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class59.field453 + "shield/oauth/token" + (new class478(var2)).method8510());
		class434 var4 = new class434();
		if (this.method1246()) {
			var4.method7865(field571);
		} else {
			var4.method7865(field570);
		}

		var4.method7893("Host", (new URL(class59.field453)).getHost());
		var4.method7870(class475.field4818);
		class9 var5 = class9.field41;
		RefreshAccessTokenRequester var6 = this.field568;
		if (var6 != null) {
			this.field607 = var6.request(var5.method70(), var3, var4.method7898(), "");
		} else {
			class10 var7 = new class10(var3, var5, var4, this.field565);
			this.field567 = this.field697.method174(var7);
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2007713791"
	)
	void method1251(String var1) throws IOException {
		URL var2 = new URL(class59.field453 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		class434 var3 = new class434();
		var3.method7885(var1);
		class9 var4 = class9.field32;
		OtlTokenRequester var5 = this.field563;
		if (var5 != null) {
			this.field740 = var5.request(var4.method70(), var2, var3.method7898(), "");
		} else {
			class10 var6 = new class10(var2, var4, var3, this.field565);
			this.field562 = this.field697.method174(var6);
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-259118253"
	)
	void method1252(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(Actor.field1264 + "game-session/v1/tokens");
		class10 var4 = new class10(var3, class9.field41, this.field565);
		var4.method102().method7885(var1);
		var4.method102().method7870(class475.field4818);
		JSONObject var5 = new JSONObject();
		var5.method8392("accountId", var2);
		var4.method86(new class477(var5));
		this.field562 = this.field697.method174(var4);
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-19583"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = class59.field452.method7027();
			if (!var1) {
				this.method1258();
			}

		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1822852781"
	)
	void method1258() {
		if (class59.field452.field4364 >= 4) {
			this.error("js5crc");
			DefaultsGroup.updateGameState(1000);
		} else {
			if (class59.field452.field4356 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					DefaultsGroup.updateGameState(1000);
					return;
				}

				field552 = 3000;
				class59.field452.field4356 = 3;
			}

			if (--field552 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class199.js5SocketTask = GameEngine.taskHandler.newSocketTask(MouseHandler.worldHost, class164.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class199.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class199.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						class162.js5Socket = WorldMapData_1.method5535((Socket)class199.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(217);
						class162.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						FloorDecoration.field2499 = GrandExchangeOfferTotalQuantityComparator.method7049();
					}

					if (js5ConnectState == 3) {
						if (class162.js5Socket.available() > 0) {
							int var2 = class162.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (GrandExchangeOfferTotalQuantityComparator.method7049() - FloorDecoration.field2499 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						class59.field452.method7001(class162.js5Socket, gameState > 20);
						class199.js5SocketTask = null;
						class162.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "5"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class199.js5SocketTask = null;
		class162.js5Socket = null;
		js5ConnectState = 0;
		if (class164.currentPort == ObjectComposition.worldPort) {
			class164.currentPort = class363.js5Port;
		} else {
			class164.currentPort = ObjectComposition.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				DefaultsGroup.updateGameState(1000);
			} else {
				field552 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			DefaultsGroup.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				DefaultsGroup.updateGameState(1000);
			} else {
				field552 = 3000;
			}
		}

	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (class224.field2363 == null && (secureRandomFuture.isDone() || field555 > 250)) {
					class224.field2363 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class224.field2363 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					MouseHandler.field249 = null;
					hadNetworkError = false;
					field555 = 0;
					if (field559.method9506()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.method1250(class191.refreshToken);
								class409.method7554(21);
							} catch (Throwable var24) {
								class190.RunException_sendStackTrace((String)null, var24);
								class198.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								class198.getLoginError(65);
								return;
							}

							try {
								this.method1252(LoginScreenAnimation.sessionId, class155.characterId);
								class409.method7554(20);
							} catch (Exception var23) {
								class190.RunException_sendStackTrace((String)null, var23);
								class198.getLoginError(65);
								return;
							}
						}
					} else {
						class409.method7554(1);
					}
				}
			}

			class20 var26;
			if (loginState == 21) {
				if (this.field607 != null) {
					if (!this.field607.isDone()) {
						return;
					}

					if (this.field607.isCancelled()) {
						class198.getLoginError(65);
						this.field607 = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field607.get();
						if (!var3.isSuccess()) {
							class198.getLoginError(65);
							this.field607 = null;
							return;
						}

						class467.accessToken = var3.getAccessToken();
						class191.refreshToken = var3.getRefreshToken();
						this.field607 = null;
					} catch (Exception var22) {
						class190.RunException_sendStackTrace((String)null, var22);
						class198.getLoginError(65);
						this.field607 = null;
						return;
					}
				} else {
					if (this.field567 == null) {
						class198.getLoginError(65);
						return;
					}

					if (!this.field567.method279()) {
						return;
					}

					if (this.field567.method270()) {
						class190.RunException_sendStackTrace(this.field567.method269(), (Throwable)null);
						class198.getLoginError(65);
						this.field567 = null;
						return;
					}

					var26 = this.field567.method272();
					if (var26.method287() != 200) {
						class198.getLoginError(65);
						this.field567 = null;
						return;
					}

					field555 = 0;
					class477 var4 = new class477(var26.method289());

					try {
						class467.accessToken = var4.method8491().getString("access_token");
						class191.refreshToken = var4.method8491().getString("refresh_token");
					} catch (Exception var21) {
						class190.RunException_sendStackTrace("Error parsing tokens", var21);
						class198.getLoginError(65);
						this.field567 = null;
						return;
					}
				}

				this.method1251(class467.accessToken);
				class409.method7554(20);
			}

			if (loginState == 20) {
				if (this.field740 != null) {
					if (!this.field740.isDone()) {
						return;
					}

					if (this.field740.isCancelled()) {
						class198.getLoginError(65);
						this.field740 = null;
						return;
					}

					try {
						OtlTokenResponse var27 = (OtlTokenResponse)this.field740.get();
						if (!var27.isSuccess()) {
							class198.getLoginError(65);
							this.field740 = null;
							return;
						}

						this.field560 = var27.getToken();
						this.field740 = null;
					} catch (Exception var20) {
						class190.RunException_sendStackTrace((String)null, var20);
						class198.getLoginError(65);
						this.field740 = null;
						return;
					}
				} else {
					if (this.field562 == null) {
						class198.getLoginError(65);
						return;
					}

					if (!this.field562.method279()) {
						return;
					}

					if (this.field562.method270()) {
						class190.RunException_sendStackTrace(this.field562.method269(), (Throwable)null);
						class198.getLoginError(65);
						this.field562 = null;
						return;
					}

					var26 = this.field562.method272();
					if (var26.method287() != 200) {
						class190.RunException_sendStackTrace("Response code: " + var26.method287() + "Response body: " + var26.method289(), (Throwable)null);
						class198.getLoginError(65);
						this.field562 = null;
						return;
					}

					List var29 = (List)var26.method288().get("Content-Type");
					if (var29 != null && var29.contains(class475.field4818.method8476())) {
						try {
							JSONObject var5 = new JSONObject(var26.method289());
							this.field560 = var5.getString("token");
						} catch (JSONException var19) {
							class190.RunException_sendStackTrace((String)null, var19);
							class198.getLoginError(65);
							this.field562 = null;
							return;
						}
					} else {
						this.field560 = var26.method289();
					}

					this.field562 = null;
				}

				field555 = 0;
				class409.method7554(1);
			}

			if (loginState == 1) {
				if (MouseHandler.field249 == null) {
					MouseHandler.field249 = GameEngine.taskHandler.newSocketTask(MouseHandler.worldHost, class164.currentPort);
				}

				if (MouseHandler.field249.status == 2) {
					throw new IOException();
				}

				if (MouseHandler.field249.status == 1) {
					var1 = WorldMapData_1.method5535((Socket)MouseHandler.field249.result, 40000, 5000);
					packetWriter.setSocket(var1);
					MouseHandler.field249 = null;
					class409.method7554(2);
				}
			}

			PacketBufferNode var28;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var28 = class103.method2692();
				var28.packetBuffer.writeByte(LoginPacket.field3387.id);
				packetWriter.addNode(var28);
				packetWriter.flush();
				var2.offset = 0;
				class409.method7554(3);
			}

			int var13;
			if (loginState == 3) {
				if (class171.pcmPlayer1 != null) {
					class171.pcmPlayer1.method780();
				}

				if (var1.isAvailable(1)) {
					var13 = var1.readUnsignedByte();
					if (class171.pcmPlayer1 != null) {
						class171.pcmPlayer1.method780();
					}

					if (var13 != 0) {
						class198.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					class409.method7554(4);
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
					AttackOption.field1354 = var2.readLong();
					class409.method7554(5);
				}
			}

			int var6;
			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var30 = new PacketBuffer(500);
				int[] var31 = new int[]{class224.field2363.nextInt(), class224.field2363.nextInt(), class224.field2363.nextInt(), class224.field2363.nextInt()};
				var30.offset = 0;
				var30.writeByte(1);
				var30.writeInt(var31[0]);
				var30.writeInt(var31[1]);
				var30.writeInt(var31[2]);
				var30.writeInt(var31[3]);
				var30.writeLong(AttackOption.field1354);
				if (gameState == 40) {
					var30.writeInt(SecureRandomFuture.field1000[0]);
					var30.writeInt(SecureRandomFuture.field1000[1]);
					var30.writeInt(SecureRandomFuture.field1000[2]);
					var30.writeInt(SecureRandomFuture.field1000[3]);
				} else {
					if (gameState == 50) {
						var30.writeByte(class141.field1634.rsOrdinal());
						var30.writeInt(class153.field1693);
					} else {
						var30.writeByte(field558.rsOrdinal());
						switch(field558.field1626) {
						case 1:
							var30.offset += 4;
							break;
						case 2:
							var30.writeInt(class91.clientPreferences.method2510(Login.Login_username));
							break;
						case 3:
						case 4:
							var30.writeMedium(ClientPreferences.field1295);
							++var30.offset;
						}
					}

					if (field559.method9506()) {
						var30.writeByte(class534.field5192.rsOrdinal());
						var30.writeStringCp1252NullTerminated(this.field560);
					} else {
						var30.writeByte(class534.field5199.rsOrdinal());
						var30.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var30.encryptRsa(class76.field921, class76.field922);
				SecureRandomFuture.field1000 = var31;
				PacketBufferNode var34 = class103.method2692();
				var34.packetBuffer.offset = 0;
				if (gameState == 40) {
					var34.packetBuffer.writeByte(LoginPacket.field3391.id);
				} else {
					var34.packetBuffer.writeByte(LoginPacket.field3386.id);
				}

				var34.packetBuffer.writeShort(0);
				var6 = var34.packetBuffer.offset;
				var34.packetBuffer.writeInt(217);
				var34.packetBuffer.writeInt(1);
				var34.packetBuffer.writeByte(clientType);
				var34.packetBuffer.writeByte(field525);
				byte var7 = 0;
				var34.packetBuffer.writeByte(var7);
				var34.packetBuffer.writeBytes(var30.array, 0, var30.offset);
				int var8 = var34.packetBuffer.offset;
				var34.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var34.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var34.packetBuffer.writeShort(class340.canvasWidth);
				var34.packetBuffer.writeShort(class491.canvasHeight);
				PacketBuffer var9 = var34.packetBuffer;
				if (randomDatData != null) {
					var9.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var10 = class131.method3015();
					var9.writeBytes(var10, 0, var10.length);
				}

				var34.packetBuffer.writeStringCp1252NullTerminated(HealthBarDefinition.field1995);
				var34.packetBuffer.writeInt(WorldMapIcon_1.field2916);
				if (revision > 213) {
					var34.packetBuffer.writeByte(0);
				}

				Buffer var40 = new Buffer(Skeleton.platformInfo.size());
				Skeleton.platformInfo.write(var40);
				var34.packetBuffer.writeBytes(var40.array, 0, var40.array.length);
				var34.packetBuffer.writeByte(clientType);
				var34.packetBuffer.writeInt(0);
				var34.packetBuffer.writeInt(WorldMapDecorationType.field3881.hash);
				var34.packetBuffer.writeInt(class199.field2009.hash);
				var34.packetBuffer.writeIntIME(class199.archive8.hash);
				var34.packetBuffer.writeIntME(class241.field2558.hash);
				var34.packetBuffer.writeIntLE(class27.archive13.hash);
				var34.packetBuffer.writeIntLE(class469.field4812.hash);
				var34.packetBuffer.writeIntLE(SoundSystem.archive2.hash);
				var34.packetBuffer.writeIntME(class190.archive10.hash);
				var34.packetBuffer.writeIntIME(HorizontalAlignment.field2028.hash);
				var34.packetBuffer.writeIntME(GrandExchangeOfferOwnWorldComparator.field515.hash);
				var34.packetBuffer.writeInt(class358.field3898.hash);
				var34.packetBuffer.writeIntME(Language.field4435.hash);
				var34.packetBuffer.writeIntME(0);
				var34.packetBuffer.writeIntLE(AbstractByteArrayCopier.archive4.hash);
				var34.packetBuffer.writeIntLE(class198.archive9.hash);
				var34.packetBuffer.writeIntLE(AABB.field2658.hash);
				var34.packetBuffer.writeInt(ArchiveDiskAction.field4291.hash);
				var34.packetBuffer.writeIntLE(CollisionMap.archive6.hash);
				var34.packetBuffer.writeInt(SongTask.archive12.hash);
				var34.packetBuffer.writeIntLE(class317.field3415.hash);
				var34.packetBuffer.writeIntIME(class92.field1117.hash);
				var34.packetBuffer.xteaEncrypt(var31, var8, var34.packetBuffer.offset);
				var34.packetBuffer.writeLengthShort(var34.packetBuffer.offset - var6);
				packetWriter.addNode(var34);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var31);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var31[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				class409.method7554(6);
			}

			int var14;
			if (loginState == 6 && var1.available() > 0) {
				var13 = var1.readUnsignedByte();
				if (var13 == 61) {
					var14 = var1.available();
					MusicPatchNode2.field3427 = var14 == 1 && var1.readUnsignedByte() == 1;
					class409.method7554(5);
				}

				if (var13 == 21 && gameState == 20) {
					class409.method7554(12);
				} else if (var13 == 2) {
					class409.method7554(14);
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class409.method7554(19);
				} else if (var13 == 64) {
					class409.method7554(10);
				} else if (var13 == 23 && field732 < 1) {
					++field732;
					class409.method7554(0);
				} else if (var13 == 29) {
					class409.method7554(17);
				} else {
					if (var13 != 69) {
						class198.getLoginError(var13);
						return;
					}

					class409.method7554(7);
				}
			}

			if (loginState == 7 && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				class13.field68 = var2.readUnsignedShort();
				class409.method7554(8);
			}

			if (loginState == 8 && var1.available() >= class13.field68) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, class13.field68);
				class6[] var32 = new class6[]{class6.field14};
				class6 var33 = var32[var2.readUnsignedByte()];

				try {
					switch(var33.field21) {
					case 0:
						class0 var36 = new class0();
						this.field575 = new class7(var2, var36);
						class409.method7554(9);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var18) {
					class198.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field575.method44()) {
				this.field764 = this.field575.method46();
				this.field575.method45();
				this.field575 = null;
				if (this.field764 == null) {
					class198.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var28 = class103.method2692();
				var28.packetBuffer.writeByte(LoginPacket.field3388.id);
				var28.packetBuffer.writeShort(this.field764.offset);
				var28.packetBuffer.writeBuffer(this.field764);
				packetWriter.addNode(var28);
				packetWriter.flush();
				this.field764 = null;
				class409.method7554(6);
			}

			if (loginState == 10 && var1.available() > 0) {
				class174.field1833 = var1.readUnsignedByte();
				class409.method7554(11);
			}

			if (loginState == 11 && var1.available() >= class174.field1833) {
				var1.read(var2.array, 0, class174.field1833);
				var2.offset = 0;
				class409.method7554(6);
			}

			if (loginState == 12 && var1.available() > 0) {
				field557 = (var1.readUnsignedByte() + 3) * 60;
				class409.method7554(13);
			}

			if (loginState == 13) {
				field555 = 0;
				AbstractWorldMapIcon.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field557 / 60 + " seconds.");
				if (--field557 <= 0) {
					class409.method7554(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) {
					Tiles.field1039 = var1.readUnsignedByte();
					class409.method7554(15);
				}

				if (loginState == 15 && var1.available() >= Tiles.field1039) {
					boolean var42 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var41 = false;
					if (var42) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						class91.clientPreferences.method2583(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						class91.clientPreferences.method2520(Login.Login_username);
					} else {
						class91.clientPreferences.method2520((String)null);
					}

					class144.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field646 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					if (revision >= 214) {
						var1.read(var2.array, 0, 8);
						var2.offset = 0;
						var2.readLong();
					}

					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var38 = class209.ServerPacket_values();
					var6 = var2.readSmartByteShortIsaac();
					if (var6 < 0 || var6 >= var38.length) {
						throw new IOException(var6 + " " + var2.offset);
					}

					packetWriter.serverPacket = var38[var6];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var16 = class159.client;
						JSObject.getWindow(var16).call("zap", (Object[])null);
					} catch (Throwable var17) {
					}

					class409.method7554(16);
				}

				if (loginState == 16) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method7834();
						MusicPatchNode2.method5928();
						class180.updatePlayer(var2);
						class94.field1150 = -1;
						class151.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						ApproximateRouteStrategy.field508 = var2.readUnsignedShort();
						class409.method7554(18);
					}

					if (loginState == 18 && var1.available() >= ApproximateRouteStrategy.field508) {
						var2.offset = 0;
						var1.read(var2.array, 0, ApproximateRouteStrategy.field508);
						var2.offset = 0;
						String var37 = var2.readStringCp1252NullTerminated();
						String var35 = var2.readStringCp1252NullTerminated();
						String var39 = var2.readStringCp1252NullTerminated();
						AbstractWorldMapIcon.setLoginResponseString(var37, var35, var39);
						DefaultsGroup.updateGameState(10);
						if (field559.method9506()) {
							GameEngine.setLoginIndex(9);
						}
					}

					if (loginState == 19) {
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
							timer.method7837();
							MouseHandler.method683();
							class180.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field555;
						if (field555 > 2000) {
							if (field732 < 1) {
								if (ObjectComposition.worldPort == class164.currentPort) {
									class164.currentPort = class363.js5Port;
								} else {
									class164.currentPort = ObjectComposition.worldPort;
								}

								++field732;
								class409.method7554(0);
							} else {
								class198.getLoginError(-3);
							}
						}
					}
				}
			}
		} catch (IOException var25) {
			if (field732 < 1) {
				if (ObjectComposition.worldPort == class164.currentPort) {
					class164.currentPort = class363.js5Port;
				} else {
					class164.currentPort = ObjectComposition.worldPort;
				}

				++field732;
				class409.method7554(0);
			} else {
				class198.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
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
			class148.method3177();
		} else {
			if (!isMenuOpen) {
				StudioGame.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last();
					boolean var41;
					if (var2 == null) {
						var41 = false;
					} else {
						var41 = true;
					}

					int var3;
					PacketBufferNode var42;
					if (!var41) {
						PacketBufferNode var20;
						int var21;
						if (timer.field4617) {
							var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
							var20.packetBuffer.writeByte(0);
							var21 = var20.packetBuffer.offset;
							timer.write(var20.packetBuffer);
							var20.packetBuffer.writeLengthByte(var20.packetBuffer.offset - var21);
							packetWriter.addNode(var20);
							timer.method7835();
						}

						int var4;
						int var5;
						int var6;
						int var7;
						int var8;
						int var9;
						int var10;
						int var11;
						int var12;
						synchronized(class233.mouseRecorder.lock) {
							if (!field536) {
								class233.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || class233.mouseRecorder.index >= 40) {
								var42 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < class233.mouseRecorder.index && (var42 == null || var42.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = class233.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = class233.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field652 || var8 != field597) {
										if (var42 == null) {
											var42 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3188, packetWriter.isaacCipher);
											var42.packetBuffer.writeByte(0);
											var3 = var42.packetBuffer.offset;
											PacketBuffer var10000 = var42.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (-1L != field708) {
											var10 = var9 - field652;
											var11 = var8 - field597;
											var12 = (int)((class233.mouseRecorder.millis[var7] - field708) / 20L);
											var5 = (int)((long)var5 + (class233.mouseRecorder.millis[var7] - field708) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field652 = var9;
										field597 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var42.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var42.packetBuffer.writeByte(var12 + 128);
											var42.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var42.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var42.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var42.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var42.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var42.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var42.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field708 = class233.mouseRecorder.millis[var7];
									}
								}

								if (var42 != null) {
									var42.packetBuffer.writeLengthByte(var42.packetBuffer.offset - var3);
									var7 = var42.packetBuffer.offset;
									var42.packetBuffer.offset = var3;
									var42.packetBuffer.writeByte(var5 / var6);
									var42.packetBuffer.writeByte(var5 % var6);
									var42.packetBuffer.offset = var7;
									packetWriter.addNode(var42);
								}

								if (var4 >= class233.mouseRecorder.index) {
									class233.mouseRecorder.index = 0;
								} else {
									MouseRecorder var58 = class233.mouseRecorder;
									var58.index -= var4;
									System.arraycopy(class233.mouseRecorder.xs, var4, class233.mouseRecorder.xs, 0, class233.mouseRecorder.index);
									System.arraycopy(class233.mouseRecorder.ys, var4, class233.mouseRecorder.ys, 0, class233.mouseRecorder.index);
									System.arraycopy(class233.mouseRecorder.millis, var4, class233.mouseRecorder.millis, 0, class233.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var24;
						if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator8.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var22 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
							if (var22 > 32767L) {
								var22 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > class491.canvasHeight) {
								var3 = class491.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class340.canvasWidth) {
								var4 = class340.canvasWidth;
							}

							var5 = (int)var22;
							var24 = ClanChannelMember.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
							var24.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
							var24.packetBuffer.writeShort(var4);
							var24.packetBuffer.writeShort(var3);
							packetWriter.addNode(var24);
						}

						if (mouseWheelRotation != 0) {
							var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3149, packetWriter.isaacCipher);
							var20.packetBuffer.writeShort(mouseWheelRotation);
							packetWriter.addNode(var20);
						}

						if (field755.field2376 > 0) {
							var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
							var20.packetBuffer.writeShort(0);
							var21 = var20.packetBuffer.offset;
							long var25 = GrandExchangeOfferTotalQuantityComparator.method7049();

							for (var5 = 0; var5 < field755.field2376; ++var5) {
								long var27 = var25 - field760;
								if (var27 > 16777215L) {
									var27 = 16777215L;
								}

								field760 = var25;
								var20.packetBuffer.writeByte(field755.field2373[var5]);
								var20.packetBuffer.writeMediumLE((int)var27);
							}

							var20.packetBuffer.writeLengthShort(var20.packetBuffer.offset - var21);
							packetWriter.addNode(var20);
						}

						if (field619 > 0) {
							--field619;
						}

						if (field755.method4280(96) || field755.method4280(97) || field755.method4280(98) || field755.method4280(99)) {
							field550 = true;
						}

						if (field550 && field619 <= 0) {
							field619 = 20;
							field550 = false;
							var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
							var20.packetBuffer.writeShortLE(camAngleY);
							var20.packetBuffer.writeShortAddLE(camAngleX);
							packetWriter.addNode(var20);
						}

						if (KeyHandler.hasFocus && !hadFocus) {
							hadFocus = true;
							var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var20.packetBuffer.writeByte(1);
							packetWriter.addNode(var20);
						}

						if (!KeyHandler.hasFocus && hadFocus) {
							hadFocus = false;
							var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var20.packetBuffer.writeByte(0);
							packetWriter.addNode(var20);
						}

						if (class434.worldMap != null) {
							class434.worldMap.method8718();
						}

						class143.method3142();
						if (PcmPlayer.field307) {
							for (var1 = 0; var1 < Players.Players_count; ++var1) {
								Player var43 = players[Players.Players_indices[var1]];
								var43.method2396();
							}

							PcmPlayer.field307 = false;
						}

						if (field763 != class87.Client_plane) {
							field763 = class87.Client_plane;
							class87.method2310(class87.Client_plane);
						}

						if (gameState != 30) {
							return;
						}

						UserComparator8.method2890();
						class73.method2110();
						++packetWriter.field1429;
						if (packetWriter.field1429 > 750) {
							class148.method3177();
							return;
						}

						class139.method3084();

						for (var1 = 0; var1 < npcCount; ++var1) {
							var21 = npcIndices[var1];
							NPC var29 = npcs[var21];
							if (var29 != null) {
								class6.updateActorSequence(var29, var29.definition.size);
							}
						}

						int[] var49 = Players.Players_indices;

						for (var21 = 0; var21 < Players.Players_count; ++var21) {
							Player var52 = players[var49[var21]];
							if (var52 != null && var52.overheadTextCyclesRemaining > 0) {
								--var52.overheadTextCyclesRemaining;
								if (var52.overheadTextCyclesRemaining == 0) {
									var52.overheadText = null;
								}
							}
						}

						for (var21 = 0; var21 < npcCount; ++var21) {
							var3 = npcIndices[var21];
							NPC var30 = npcs[var3];
							if (var30 != null && var30.overheadTextCyclesRemaining > 0) {
								--var30.overheadTextCyclesRemaining;
								if (var30.overheadTextCyclesRemaining == 0) {
									var30.overheadText = null;
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

						Widget var50 = class64.mousedOverWidgetIf1;
						Widget var44 = GrandExchangeOfferNameComparator.field4374;
						class64.mousedOverWidgetIf1 = null;
						GrandExchangeOfferNameComparator.field4374 = null;
						draggedOnWidget = null;
						field685 = false;
						field647 = false;
						field757 = 0;

						while (field755.method4256() && field757 < 128) {
							if (staffModLevel >= 2 && field755.method4280(82) && field755.field2386 == 66) {
								String var53 = RouteStrategy.method4341();
								class159.client.method558(var53);
							} else if (oculusOrbState != 1 || field755.field2375 <= 0) {
								field759[field757] = field755.field2386;
								field661[field757] = field755.field2375;
								++field757;
							}
						}

						boolean var45 = staffModLevel >= 2;
						PacketBufferNode var31;
						if (var45 && field755.method4280(82) && field755.method4280(81) && mouseWheelRotation != 0) {
							var4 = TextureProvider.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != TextureProvider.localPlayer.plane) {
								var5 = TextureProvider.localPlayer.pathX[0] + class20.baseX * 64;
								var6 = TextureProvider.localPlayer.pathY[0] + class19.baseY * 64;
								var31 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3154, packetWriter.isaacCipher);
								var31.packetBuffer.writeShortAddLE(var5);
								var31.packetBuffer.writeShortLE(var6);
								var31.packetBuffer.writeInt(0);
								var31.packetBuffer.writeByteAdd(var4);
								packetWriter.addNode(var31);
							}

							mouseWheelRotation = 0;
						}

						if (MouseHandler.MouseHandler_lastButton == 1) {
							field756.method4232();
						}

						if (rootInterface != -1) {
							class511.updateRootInterface(rootInterface, 0, 0, class340.canvasWidth, class491.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var32;
							Widget var51;
							ScriptEvent var54;
							do {
								var54 = (ScriptEvent)field542.removeLast();
								if (var54 == null) {
									while (true) {
										do {
											var54 = (ScriptEvent)field734.removeLast();
											if (var54 == null) {
												while (true) {
													do {
														var54 = (ScriptEvent)scriptEvents.removeLast();
														if (var54 == null) {
															while (true) {
																while (true) {
																	class225 var55;
																	do {
																		do {
																			do {
																				var55 = (class225)field534.removeLast();
																				if (var55 == null) {
																					this.menu();
																					class30.method446();
																					if (clickedWidget != null) {
																						this.method1274();
																					}

																					if (Scene.shouldSendWalk()) {
																						var4 = Scene.Scene_selectedX;
																						var5 = Scene.Scene_selectedY;
																						var24 = ClanChannelMember.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																						var24.packetBuffer.writeByte(5);
																						var24.packetBuffer.writeShortAdd(class19.baseY * 64 + var5);
																						var24.packetBuffer.writeByte(field755.method4280(82) ? (field755.method4280(81) ? 2 : 1) : 0);
																						var24.packetBuffer.writeShortAdd(class20.baseX * 64 + var4);
																						packetWriter.addNode(var24);
																						Scene.method4783();
																						mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																						mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																						mouseCrossColor = 1;
																						mouseCrossState = 0;
																						destinationX = var4;
																						destinationY = var5;
																					}

																					if (var50 != class64.mousedOverWidgetIf1) {
																						if (var50 != null) {
																							ClanChannelMember.invalidateWidget(var50);
																						}

																						if (class64.mousedOverWidgetIf1 != null) {
																							ClanChannelMember.invalidateWidget(class64.mousedOverWidgetIf1);
																						}
																					}

																					if (var44 != GrandExchangeOfferNameComparator.field4374 && field788 == field530) {
																						if (var44 != null) {
																							ClanChannelMember.invalidateWidget(var44);
																						}

																						if (GrandExchangeOfferNameComparator.field4374 != null) {
																							ClanChannelMember.invalidateWidget(GrandExchangeOfferNameComparator.field4374);
																						}
																					}

																					if (GrandExchangeOfferNameComparator.field4374 != null) {
																						if (field788 < field530) {
																							++field788;
																							if (field788 == field530) {
																								ClanChannelMember.invalidateWidget(GrandExchangeOfferNameComparator.field4374);
																							}
																						}
																					} else if (field788 > 0) {
																						--field788;
																					}

																					if (oculusOrbState == 0) {
																						var4 = TextureProvider.localPlayer.x;
																						var5 = TextureProvider.localPlayer.y;
																						if (ChatChannel.oculusOrbFocalPointX - var4 < -500 || ChatChannel.oculusOrbFocalPointX - var4 > 500 || AbstractWorldMapData.oculusOrbFocalPointY - var5 < -500 || AbstractWorldMapData.oculusOrbFocalPointY - var5 > 500) {
																							ChatChannel.oculusOrbFocalPointX = var4;
																							AbstractWorldMapData.oculusOrbFocalPointY = var5;
																						}

																						if (var4 != ChatChannel.oculusOrbFocalPointX) {
																							ChatChannel.oculusOrbFocalPointX += (var4 - ChatChannel.oculusOrbFocalPointX) / 16;
																						}

																						if (var5 != AbstractWorldMapData.oculusOrbFocalPointY) {
																							AbstractWorldMapData.oculusOrbFocalPointY += (var5 - AbstractWorldMapData.oculusOrbFocalPointY) / 16;
																						}

																						var6 = ChatChannel.oculusOrbFocalPointX >> 7;
																						var7 = AbstractWorldMapData.oculusOrbFocalPointY >> 7;
																						var8 = class115.getTileHeight(ChatChannel.oculusOrbFocalPointX, AbstractWorldMapData.oculusOrbFocalPointY, class87.Client_plane);
																						var9 = 0;
																						if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
																							for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
																								for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																									var12 = class87.Client_plane;
																									if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) {
																										++var12;
																									}

																									int var34 = var8 - Tiles.Tiles_heights[var12][var10][var11];
																									if (var34 > var9) {
																										var9 = var34;
																									}
																								}
																							}
																						}

																						var10 = var9 * 192;
																						if (var10 > 98048) {
																							var10 = 98048;
																						}

																						if (var10 < 32768) {
																							var10 = 32768;
																						}

																						if (var10 > field621) {
																							field621 += (var10 - field621) / 24;
																						} else if (var10 < field621) {
																							field621 += (var10 - field621) / 80;
																						}

																						class433.field4639 = class115.getTileHeight(TextureProvider.localPlayer.x, TextureProvider.localPlayer.y, class87.Client_plane) - camFollowHeight;
																					} else if (oculusOrbState == 1) {
																						if (field618 && TextureProvider.localPlayer != null) {
																							var4 = TextureProvider.localPlayer.pathX[0];
																							var5 = TextureProvider.localPlayer.pathY[0];
																							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
																								ChatChannel.oculusOrbFocalPointX = TextureProvider.localPlayer.x;
																								var6 = class115.getTileHeight(TextureProvider.localPlayer.x, TextureProvider.localPlayer.y, class87.Client_plane) - camFollowHeight;
																								if (var6 < class433.field4639) {
																									class433.field4639 = var6;
																								}

																								AbstractWorldMapData.oculusOrbFocalPointY = TextureProvider.localPlayer.y;
																								field618 = false;
																							}
																						}

																						short var47 = -1;
																						if (field755.method4280(33)) {
																							var47 = 0;
																						} else if (field755.method4280(49)) {
																							var47 = 1024;
																						}

																						if (field755.method4280(48)) {
																							if (var47 == 0) {
																								var47 = 1792;
																							} else if (var47 == 1024) {
																								var47 = 1280;
																							} else {
																								var47 = 1536;
																							}
																						} else if (field755.method4280(50)) {
																							if (var47 == 0) {
																								var47 = 256;
																							} else if (var47 == 1024) {
																								var47 = 768;
																							} else {
																								var47 = 512;
																							}
																						}

																						byte var48 = 0;
																						if (field755.method4280(35)) {
																							var48 = -1;
																						} else if (field755.method4280(51)) {
																							var48 = 1;
																						}

																						var6 = 0;
																						if (var47 >= 0 || var48 != 0) {
																							var6 = field755.method4280(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																							var6 *= 16;
																							field613 = var47;
																							field614 = var48;
																						}

																						if (field612 < var6) {
																							field612 += var6 / 8;
																							if (field612 > var6) {
																								field612 = var6;
																							}
																						} else if (field612 > var6) {
																							field612 = field612 * 9 / 10;
																						}

																						if (field612 > 0) {
																							var7 = field612 / 16;
																							if (field613 >= 0) {
																								var4 = field613 - WallDecoration.cameraYaw & 2047;
																								var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																								var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																								ChatChannel.oculusOrbFocalPointX += var7 * var8 / 65536;
																								AbstractWorldMapData.oculusOrbFocalPointY += var9 * var7 / 65536;
																							}

																							if (field614 != 0) {
																								class433.field4639 += var7 * field614;
																								if (class433.field4639 > 0) {
																									class433.field4639 = 0;
																								}
																							}
																						} else {
																							field613 = -1;
																							field614 = -1;
																						}

																						if (field755.method4280(13)) {
																							class425.method7821();
																						}
																					}

																					if (MouseHandler.MouseHandler_currentButton == 4 && UserComparator8.mouseCam) {
																						var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																						camAngleDX = var4 * 2;
																						mouseCamClickedY = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
																						var5 = field608 - MouseHandler.MouseHandler_x;
																						camAngleDY = var5 * 2;
																						field608 = var5 != -1 && var5 != 1 ? (field608 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
																					} else {
																						if (field755.method4280(96)) {
																							camAngleDY += (-24 - camAngleDY) / 2;
																						} else if (field755.method4280(97)) {
																							camAngleDY += (24 - camAngleDY) / 2;
																						} else {
																							camAngleDY /= 2;
																						}

																						if (field755.method4280(98)) {
																							camAngleDX += (12 - camAngleDX) / 2;
																						} else if (field755.method4280(99)) {
																							camAngleDX += (-12 - camAngleDX) / 2;
																						} else {
																							camAngleDX /= 2;
																						}

																						mouseCamClickedY = MouseHandler.MouseHandler_y;
																						field608 = MouseHandler.MouseHandler_x;
																					}

																					camAngleY = camAngleDY / 2 + camAngleY & 2047;
																					camAngleX += camAngleDX / 2;
																					if (camAngleX < 128) {
																						camAngleX = 128;
																					}

																					if (camAngleX > 383) {
																						camAngleX = 383;
																					}

																					if (field726) {
																						WorldMapSectionType.method5616(AbstractUserComparator.field4701, TriBool.field4718, JagexCache.field1844);
																						Projectile.method2184(class14.field76, GrandExchangeOfferOwnWorldComparator.field516);
																						if (AbstractUserComparator.field4701 == cameraX && class17.cameraY == TriBool.field4718 && JagexCache.field1844 == WorldMapArea.cameraZ && class14.field76 == class365.cameraPitch && WallDecoration.cameraYaw == GrandExchangeOfferOwnWorldComparator.field516) {
																							field726 = false;
																							isCameraLocked = false;
																							field779 = false;
																							field780 = false;
																							class148.field1663 = 0;
																							BufferedNetSocket.field4722 = 0;
																							class161.field1754 = 0;
																							class232.field2431 = 0;
																							class465.field4788 = 0;
																							class131.field1535 = 0;
																							SecureRandomCallable.field1049 = 0;
																							class191.field1922 = 0;
																							MouseHandler.field224 = 0;
																							SoundSystem.field323 = 0;
																							field782 = null;
																							field784 = null;
																							field783 = null;
																						}
																					} else if (isCameraLocked) {
																						PcmPlayer.method819();
																					}

																					for (var4 = 0; var4 < 5; ++var4) {
																						int var10002 = field707[var4]++;
																					}

																					class33.varcs.tryWrite();
																					var4 = ++MouseHandler.MouseHandler_idleCycles - 1;
																					var6 = BuddyRankComparator.method2936();
																					if (var4 > 15000 && var6 > 15000) {
																						logoutTimer = 250;
																						class138.method3081(14500);
																						var31 = ClanChannelMember.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																						packetWriter.addNode(var31);
																					}

																					InvDefinition.friendSystem.processFriendUpdates();

																					for (var7 = 0; var7 < field815.size(); ++var7) {
																						var9 = (Integer)field815.get(var7);
																						class139 var35 = (class139)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var9);
																						class139 var36;
																						if (var35 != null) {
																							var36 = var35;
																						} else {
																							AbstractArchive var13 = SequenceDefinition.SequenceDefinition_animationsArchive;
																							AbstractArchive var14 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
																							boolean var15 = true;
																							byte[] var16 = var13.getFile(var9 >> 16 & 65535, var9 & 65535);
																							class139 var37;
																							if (var16 == null) {
																								var15 = false;
																								var37 = null;
																							} else {
																								int var17 = (var16[1] & 255) << 8 | var16[2] & 255;
																								byte[] var18 = var14.getFile(var17, 0);
																								if (var18 == null) {
																									var15 = false;
																								}

																								if (!var15) {
																									var37 = null;
																								} else {
																									if (SoundCache.field333 == null) {
																										MusicPatchPcmStream.field3510 = Runtime.getRuntime().availableProcessors();
																										SoundCache.field333 = new ThreadPoolExecutor(0, MusicPatchPcmStream.field3510, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(MusicPatchPcmStream.field3510 * 100 + 100), new class64(this));
																									}

																									try {
																										var37 = new class139(var13, var14, var9, false);
																									} catch (Exception var39) {
																										var37 = null;
																									}
																								}
																							}

																							if (var37 != null) {
																								SequenceDefinition.SequenceDefinition_cachedModel.put(var37, (long)var9);
																							}

																							var36 = var37;
																						}

																						if (var36 == null) {
																							var8 = 2;
																						} else {
																							var8 = var36.method3091() ? 0 : 1;
																						}

																						if (var8 != 2) {
																							field815.remove(var7);
																							--var7;
																						}
																					}

																					++packetWriter.pendingWrites;
																					if (packetWriter.pendingWrites > 50) {
																						var31 = ClanChannelMember.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																						packetWriter.addNode(var31);
																					}

																					try {
																						packetWriter.flush();
																					} catch (IOException var38) {
																						class148.method3177();
																					}

																					return;
																				}
																			} while(var55 == null);
																		} while(var55.field2365 == null);

																		if (var55.field2365.childIndex < 0) {
																			break;
																		}

																		var32 = class33.widgetDefinition.method6240(var55.field2365.parentId);
																	} while(var32 == null || var32.children == null || var32.children.length == 0 || var55.field2365.childIndex >= var32.children.length || var55.field2365 != var32.children[var55.field2365.childIndex]);

																	if (var55.field2365.type == 11 && var55.field2368 == 0) {
																		if (var55.field2365.method6680(var55.field2370, var55.field2367, 0, 0)) {
																			switch(var55.field2365.method6631()) {
																			case 0:
																				VertexNormal.openURL(var55.field2365.method6609(), true, false);
																				break;
																			case 1:
																				var6 = MouseRecorder.getWidgetFlags(var55.field2365);
																				boolean var46 = (var6 >> 22 & 1) != 0;
																				if (var46) {
																					int[] var56 = var55.field2365.method6610();
																					if (var56 != null) {
																						PacketBufferNode var33 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3137, packetWriter.isaacCipher);
																						var33.packetBuffer.writeShortLE(var55.field2365.childIndex);
																						var33.packetBuffer.writeInt(var55.field2365.method6688());
																						var33.packetBuffer.writeIntLE(var55.field2365.id);
																						var33.packetBuffer.writeIntIME(var56[1]);
																						var33.packetBuffer.writeIntME(var56[0]);
																						var33.packetBuffer.writeIntME(var56[2]);
																						packetWriter.addNode(var33);
																					}
																				}
																			}
																		}
																	} else if (var55.field2365.type == 12) {
																		class344 var57 = var55.field2365.method6614();
																		if (var57 != null && var57.method6356()) {
																			switch(var55.field2368) {
																			case 0:
																				field756.method4216(var55.field2365);
																				var57.method6304(true);
																				var57.method6343(var55.field2370, var55.field2367, field755.method4280(82), field755.method4280(81));
																				break;
																			case 1:
																				var57.method6562(var55.field2370, var55.field2367);
																			}
																		}
																	}
																}
															}
														}

														var32 = var54.widget;
														if (var32.childIndex < 0) {
															break;
														}

														var51 = class33.widgetDefinition.method6240(var32.parentId);
													} while(var51 == null || var51.children == null || var32.childIndex >= var51.children.length || var32 != var51.children[var32.childIndex]);

													Interpreter.runScriptEvent(var54);
												}
											}

											var32 = var54.widget;
											if (var32.childIndex < 0) {
												break;
											}

											var51 = class33.widgetDefinition.method6240(var32.parentId);
										} while(var51 == null || var51.children == null || var32.childIndex >= var51.children.length || var32 != var51.children[var32.childIndex]);

										Interpreter.runScriptEvent(var54);
									}
								}

								var32 = var54.widget;
								if (var32.childIndex < 0) {
									break;
								}

								var51 = class33.widgetDefinition.method6240(var32.parentId);
							} while(var51 == null || var51.children == null || var32.childIndex >= var51.children.length || var32 != var51.children[var32.childIndex]);

							Interpreter.runScriptEvent(var54);
						}
					}

					var42 = ClanChannelMember.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var42.packetBuffer.writeByte(0);
					var3 = var42.packetBuffer.offset;
					class305.performReflectionCheck(var42.packetBuffer);
					var42.packetBuffer.writeLengthByte(var42.packetBuffer.offset - var3);
					packetWriter.addNode(var42);
				}
			}
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "328818380"
	)
	public void vmethod6161(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && class91.clientPreferences.method2515() > 0 && !playingJingle) {
				PacketBufferNode var3 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3150, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1844765006"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class340.canvasWidth;
		int var2 = class491.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class91.clientPreferences != null) {
			try {
				Client var3 = class159.client;
				Object[] var4 = new Object[]{class178.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class178.method3552(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field735[var1] = true;
			}

			field677[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field738 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class410.drawWidgets(rootInterface, 0, 0, class340.canvasWidth, class491.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				EnumComposition.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				EnumComposition.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				class135.method3072(viewportX, viewportY);
			}
		} else {
			var1 = class28.menuX;
			var2 = class463.menuY;
			var3 = class341.menuWidth;
			var4 = Language.menuHeight;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			SoundCache.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			var6 = MouseHandler.MouseHandler_x;
			var7 = MouseHandler.MouseHandler_y;

			int var9;
			int var10;
			for (var8 = 0; var8 < menuOptionsCount; ++var8) {
				var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31;
				var10 = 16777215;
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				SoundCache.fontBold12.draw(class169.method3418(var8), var1 + 3, var9, var10, 0);
			}

			var8 = class28.menuX;
			var9 = class463.menuY;
			var10 = class341.menuWidth;
			int var11 = Language.menuHeight;

			for (int var12 = 0; var12 < rootWidgetCount; ++var12) {
				if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var8 && rootWidgetXs[var12] < var10 + var8 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var9 && rootWidgetYs[var12] < var9 + var11) {
					field735[var12] = true;
				}
			}
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field677[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field735[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = class87.Client_plane;
		var2 = TextureProvider.localPlayer.x;
		var3 = TextureProvider.localPlayer.y;
		var4 = graphicsCycle;

		for (ObjectSound var13 = (ObjectSound)ObjectSound.objectSounds.last(); var13 != null; var13 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var13.soundEffectId != -1 || var13.soundEffectIds != null) {
				var6 = 0;
				if (var2 > var13.maxX * 128) {
					var6 += var2 - var13.maxX * 128;
				} else if (var2 < var13.x * 16384) {
					var6 += var13.x * 16384 - var2;
				}

				if (var3 > var13.maxY * 16384) {
					var6 += var3 - var13.maxY * 16384;
				} else if (var3 < var13.y * 16384) {
					var6 += var13.y * 16384 - var3;
				}

				if (var6 - 64 <= var13.field853 && class91.clientPreferences.method2589() != 0 && var1 == var13.plane) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = (var13.field853 - var6) * class91.clientPreferences.method2589() / var13.field853;
					Object var10000;
					if (var13.stream1 == null) {
						if (var13.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var14 = SoundEffect.readSoundEffect(class469.field4812, var13.soundEffectId, 0);
							if (var14 != null) {
								RawSound var15 = var14.toRawSound().resample(class136.decimator);
								RawPcmStream var16 = RawPcmStream.createRawPcmStream(var15, 100, var7);
								var16.setNumLoops(-1);
								class140.pcmStreamMixer.addSubStream(var16);
								var13.stream1 = var16;
							}
						}
					} else {
						var13.stream1.method880(var7);
					}

					if (var13.stream2 == null) {
						if (var13.soundEffectIds != null && (var13.field864 -= var4) <= 0) {
							var8 = (int)(Math.random() * (double)var13.soundEffectIds.length);
							var10000 = null;
							SoundEffect var18 = SoundEffect.readSoundEffect(class469.field4812, var13.soundEffectIds[var8], 0);
							if (var18 != null) {
								RawSound var19 = var18.toRawSound().resample(class136.decimator);
								RawPcmStream var17 = RawPcmStream.createRawPcmStream(var19, 100, var7);
								var17.setNumLoops(0);
								class140.pcmStreamMixer.addSubStream(var17);
								var13.stream2 = var17;
								var13.field864 = var13.field860 + (int)(Math.random() * (double)(var13.field862 - var13.field860));
							}
						}
					} else {
						var13.stream2.method880(var7);
						if (!var13.stream2.hasNext()) {
							var13.stream2 = null;
						}
					}
				} else {
					if (var13.stream1 != null) {
						class140.pcmStreamMixer.removeSubStream(var13.stream1);
						var13.stream1 = null;
					}

					if (var13.stream2 != null) {
						class140.pcmStreamMixer.removeSubStream(var13.stream2);
						var13.stream2 = null;
					}
				}
			}
		}

		graphicsCycle = 0;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lez;IS)Z",
		garbageValue = "-3136"
	)
	boolean method1680(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			class358.friendsChat = null;
		} else {
			if (class358.friendsChat == null) {
				class358.friendsChat = new FriendsChat(class166.loginType, class159.client);
			}

			class358.friendsChat.method8009(var1.packetBuffer, var2);
		}

		UserComparator10.method2922();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)Z",
		garbageValue = "-1216543487"
	)
	boolean method1772(PacketWriter var1) {
		if (class358.friendsChat != null) {
			class358.friendsChat.method7985(var1.packetBuffer);
		}

		UserComparator10.method2922();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lez;I)Z",
		garbageValue = "1463612350"
	)
	@Export("method1434")
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
					if (var1.field1432) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1429 = 0;
						var1.field1432 = false;
					}

					var3.offset = 0;
					if (var3.method9163()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1429 = 0;
					}

					var1.field1432 = true;
					ServerPacket[] var4 = class209.ServerPacket_values();
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
				var1.field1429 = 0;
				timer.method7832();
				var1.field1433 = var1.field1420;
				var1.field1420 = var1.field1431;
				var1.field1431 = var1.serverPacket;
				if (ServerPacket.field3266 == var1.serverPacket) {
					return this.method1680(var1, 1);
				}

				byte var72;
				if (ServerPacket.field3287 == var1.serverPacket) {
					class172.method3496();
					var72 = var3.readByte();
					class148 var83 = new class148(var3);
					ClanSettings var67;
					if (var72 >= 0) {
						var67 = currentClanSettings[var72];
					} else {
						var67 = VerticalAlignment.guestClanSettings;
					}

					if (var67 == null) {
						this.method1277(var72);
						var1.serverPacket = null;
						return true;
					}

					if (var83.field1661 > var67.field1704) {
						this.method1277(var72);
						var1.serverPacket = null;
						return true;
					}

					if (var83.field1661 < var67.field1704) {
						var1.serverPacket = null;
						return true;
					}

					var83.method3167(var67);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3351 == var1.serverPacket) {
					class172.method3496();
					var72 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var72 >= 0) {
							currentClanSettings[var72] = null;
						} else {
							VerticalAlignment.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var72 >= 0) {
						currentClanSettings[var72] = new ClanSettings(var3);
					} else {
						VerticalAlignment.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3348 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3242);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					class332.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var8;
				int var20;
				if (ServerPacket.field3378 == var1.serverPacket) {
					var22 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedShortLE();
					var8 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					ArrayList var56 = new ArrayList();
					var56.add(var20);
					class202.method3764(var56, var5, var22, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field726 = false;
					field780 = true;
					var20 = NPC.method2684(var3.readShort() & 2027);
					var5 = class153.method3210(var3.readShort() & 2027);
					var22 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field784 = new class493(class365.cameraPitch, var5, var22, var7);
					field783 = new class493(WallDecoration.cameraYaw, var20, var22, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3265 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3239);
					var1.serverPacket = null;
					return true;
				}

				Widget var6;
				if (ServerPacket.field3331 == var1.serverPacket) {
					var20 = var3.readInt();
					var21 = var3.readStringCp1252NullTerminated();
					var6 = class33.widgetDefinition.method6240(var20);
					if (!var21.equals(var6.text)) {
						var6.text = var21;
						ClanChannelMember.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var22 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedShortLE();
					var20 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var86 = npcs[var20];
					if (var86 != null) {
						if (var5 == var86.sequence && var5 != -1) {
							var8 = class36.SequenceDefinition_get(var5).field2340;
							if (var8 == 1) {
								var86.sequenceFrame = 0;
								var86.sequenceFrameCycle = 0;
								var86.sequenceDelay = var22;
								var86.field1235 = 0;
							} else if (var8 == 2) {
								var86.field1235 = 0;
							}
						} else if (var5 == -1 || var86.sequence == -1 || class36.SequenceDefinition_get(var5).field2333 >= class36.SequenceDefinition_get(var86.sequence).field2333) {
							var86.sequence = var5;
							var86.sequenceFrame = 0;
							var86.sequenceFrameCycle = 0;
							var86.sequenceDelay = var22;
							var86.field1235 = 0;
							var86.field1261 = var86.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					GrandExchangeOfferUnitPriceComparator.method7111(var20);
					changedItemContainers[++field602 - 1 & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < VarpDefinition.field1924; ++var20) {
						VarpDefinition var82 = class150.VarpDefinition_get(var20);
						if (var82 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}

					class304.method5860();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3381 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3244);
					var1.serverPacket = null;
					return true;
				}

				String var55;
				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var54 = new byte[var1.serverPacketLength];
					var3.method9149(var54, 0, var54.length);
					Buffer var80 = new Buffer(var54);
					var55 = var80.readStringCp1252NullTerminated();
					VertexNormal.openURL(var55, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3260 == var1.serverPacket) {
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					WorldMapEvent.performPlayerAnimation(TextureProvider.localPlayer, var5, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortLE();
					var6 = class33.widgetDefinition.method6240(var20);
					if (var6.modelType != 1 || var5 != var6.modelId) {
						var6.modelType = 1;
						var6.modelId = var5;
						ClanChannelMember.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3315 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var22 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field786[var20] = true;
					field787[var20] = var5;
					field680[var20] = var22;
					field789[var20] = var7;
					field707[var20] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field726 = false;
					isCameraLocked = false;
					field779 = false;
					field780 = false;
					class148.field1663 = 0;
					BufferedNetSocket.field4722 = 0;
					class161.field1754 = 0;
					field781 = false;
					class232.field2431 = 0;
					class465.field4788 = 0;
					class131.field1535 = 0;
					SecureRandomCallable.field1049 = 0;
					class191.field1922 = 0;
					MouseHandler.field224 = 0;
					SoundSystem.field323 = 0;
					field782 = null;
					field784 = null;
					field783 = null;

					for (var20 = 0; var20 < 5; ++var20) {
						field786[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						Interpreter.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3346 == var1.serverPacket) {
					class304.method5860();
					runEnergy = var3.readUnsignedShort();
					field729 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3370 == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedByteAdd();
					var6 = class33.widgetDefinition.method6240(var20);
					UrlRequester.method2842(var6, TextureProvider.localPlayer.appearance.gender, var5);
					ClanChannelMember.invalidateWidget(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var22 = TileItem.getGcDuration();
					PacketBufferNode var84 = ClanChannelMember.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var84.packetBuffer.writeIntME(var20);
					var84.packetBuffer.writeIntIME(var5);
					var84.packetBuffer.writeByte(var22);
					var84.packetBuffer.writeByteNeg(GameEngine.fps);
					packetWriter.addNode(var84);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3283 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3234);
					var1.serverPacket = null;
					return true;
				}

				int var10;
				int var24;
				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field726 = false;
					field780 = false;
					class148.field1663 = var3.readUnsignedByte() * 128;
					BufferedNetSocket.field4722 = var3.readUnsignedByte() * 128;
					class161.field1754 = var3.readUnsignedShort();
					class232.field2431 = var3.readUnsignedByte();
					class465.field4788 = var3.readUnsignedByte();
					if (class465.field4788 >= 100) {
						var20 = class148.field1663 * 16384 + 64;
						var5 = BufferedNetSocket.field4722 * 16384 + 64;
						var22 = class115.getTileHeight(var20, var5, class87.Client_plane) - class161.field1754;
						var7 = var20 - cameraX;
						var8 = var22 - class17.cameraY;
						var24 = var5 - WorldMapArea.cameraZ;
						var10 = (int)Math.sqrt((double)(var24 * var24 + var7 * var7));
						class365.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
						WallDecoration.cameraYaw = (int)(Math.atan2((double)var7, (double)var24) * -325.9490051269531D) & 2047;
						if (class365.cameraPitch < 128) {
							class365.cameraPitch = 128;
						}

						if (class365.cameraPitch > 383) {
							class365.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3356 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntIME();
					var6 = class33.widgetDefinition.method6240(var5);
					if (var6.modelType != 6 || var20 != var6.modelId) {
						var6.modelType = 6;
						var6.modelId = var20;
						ClanChannelMember.invalidateWidget(var6);
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

					field727 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3342 == var1.serverPacket) {
					class304.method5860();
					weight = var3.readShort();
					field729 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var79;
				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var79 = class33.widgetDefinition.method6240(var20);
					var79.modelType = 3;
					var79.modelId = TextureProvider.localPlayer.appearance.getChatHeadId();
					ClanChannelMember.invalidateWidget(var79);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					tradeChatMode = var3.readUnsignedByte();
					publicChatMode = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}

				boolean var11;
				long var25;
				long var27;
				long var29;
				String var31;
				int var68;
				int var69;
				if (ServerPacket.field3341 == var1.serverPacket) {
					var72 = var3.readByte();
					var25 = (long)var3.readUnsignedShort();
					var27 = (long)var3.readMedium();
					var29 = var27 + (var25 << 32);
					var11 = false;
					ClanChannel var63 = var72 >= 0 ? currentClanChannels[var72] : ClanChannelMember.guestClanChannel;
					if (var63 == null) {
						var11 = true;
					} else {
						for (var68 = 0; var68 < 100; ++var68) {
							if (crossWorldMessageIds[var68] == var29) {
								var11 = true;
								break;
							}
						}
					}

					if (!var11) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var29;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var31 = class172.method3430(var3);
						var69 = var72 >= 0 ? 43 : 46;
						class164.addChatMessage(var69, "", var31, var63.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3324 == var1.serverPacket) {
					var1.serverPacket = null;
					return true;
				}

				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				int var60;
				byte var62;
				byte var85;
				int var87;
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					var60 = var3.method9254();
					var62 = var3.readByte();
					var69 = var3.readUnsignedByteAdd() * 4;
					var18 = var3.readUnsignedByte();
					var68 = var3.readUnsignedByteNeg() * 4;
					var87 = var3.readUnsignedShortAddLE();
					var22 = var3.method9253();
					var20 = var22 >> 16;
					var5 = var22 >> 8 & 255;
					var7 = var20 + (var22 >> 4 & 7);
					var8 = var5 + (var22 & 7);
					var16 = var3.readUnsignedShortLE();
					var15 = var3.readUnsignedShortAddLE();
					var85 = var3.readByte();
					var24 = var85 + var7;
					var10 = var62 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var24 >= 0 && var10 >= 0 && var24 < 104 && var10 < 104 && var87 != 65535) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						var24 = var24 * 128 + 64;
						var10 = var10 * 128 + 64;
						var19 = new Projectile(var87, class87.Client_plane, var7, var8, class115.getTileHeight(var7, var8, class87.Client_plane) - var68, var15 + cycle, var16 + cycle, var17, var18, var60, var69);
						var19.setDestination(var24, var10, class115.getTileHeight(var24, var10, class87.Client_plane) - var69, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					class151.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					InvDefinition.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class492.FriendSystem_invalidateIgnoreds();
					field723 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3289 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3246);
					var1.serverPacket = null;
					return true;
				}

				Widget var23;
				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var22 = var3.readUnsignedIntIME();
					var23 = class33.widgetDefinition.method6240(var22);
					ItemComposition var92;
					if (!var23.isIf3) {
						if (var5 == -1) {
							var23.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var92 = class214.ItemDefinition_get(var5).getCountObj(var20);
						var23.modelType = 4;
						var23.modelId = var5;
						var23.modelAngleX = var92.xan2d;
						var23.modelAngleY = var92.yan2d;
						var23.modelZoom = var92.zoom2d * 100 / var20;
						ClanChannelMember.invalidateWidget(var23);
					} else {
						var23.itemId = var5;
						var23.itemQuantity = var20;
						var92 = class214.ItemDefinition_get(var5).getCountObj(var20);
						var23.modelAngleX = var92.xan2d;
						var23.modelAngleY = var92.yan2d;
						var23.modelAngleZ = var92.zan2d;
						var23.modelOffsetX = var92.offsetX2d;
						var23.modelOffsetY = var92.offsetY2d;
						var23.modelZoom = var92.zoom2d;
						if (var92.isStackable == 1) {
							var23.itemQuantityMode = 1;
						} else {
							var23.itemQuantityMode = 2;
						}

						if (var23.field3732 > 0) {
							var23.modelZoom = var23.modelZoom * 32 / var23.field3732;
						} else if (var23.rawWidth > 0) {
							var23.modelZoom = var23.modelZoom * 32 / var23.rawWidth;
						}

						ClanChannelMember.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3368 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3236);
					var1.serverPacket = null;
					return true;
				}

				Widget var33;
				InterfaceParent var78;
				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedIntIME();
					InterfaceParent var65 = (InterfaceParent)interfaceParents.get((long)var20);
					var78 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var78 != null) {
						ArchiveDisk.closeInterface(var78, var65 == null || var65.group != var78.group);
					}

					if (var65 != null) {
						var65.remove();
						interfaceParents.put(var65, (long)var5);
					}

					var33 = class33.widgetDefinition.method6240(var20);
					if (var33 != null) {
						ClanChannelMember.invalidateWidget(var33);
					}

					var33 = class33.widgetDefinition.method6240(var5);
					if (var33 != null) {
						ClanChannelMember.invalidateWidget(var33);
						PendingSpawn.revalidateWidgetScroll(class33.widgetDefinition.Widget_interfaceComponents[var33.id >>> 16], var33, true);
					}

					if (rootInterface != -1) {
						Interpreter.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3375 == var1.serverPacket) {
					field517 = cycleCntr;
					var72 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var72 >= 0) {
							currentClanChannels[var72] = null;
						} else {
							ClanChannelMember.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var72 >= 0) {
						currentClanChannels[var72] = new ClanChannel(var3);
					} else {
						ClanChannelMember.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3264 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedByteNeg();
					var22 = var3.readUnsignedIntLE();
					var78 = (InterfaceParent)interfaceParents.get((long)var22);
					if (var78 != null) {
						ArchiveDisk.closeInterface(var78, var20 != var78.group);
					}

					ClanChannel.openInterface(var22, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3276 == var1.serverPacket) {
					SequenceDefinition.field2316 = new class469(class53.Widget_cachedFonts);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var79 = class33.widgetDefinition.method6240(var20);

					for (var22 = 0; var22 < var79.itemIds.length; ++var22) {
						var79.itemIds[var22] = -1;
						var79.itemIds[var22] = 0;
					}

					ClanChannelMember.invalidateWidget(var79);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3332 == var1.serverPacket) {
					isCameraLocked = true;
					field726 = false;
					field780 = true;
					class148.field1663 = var3.readUnsignedByte() * 128;
					BufferedNetSocket.field4722 = var3.readUnsignedByte() * 128;
					class161.field1754 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var22 = class148.field1663 * 16384 + 64;
					var7 = BufferedNetSocket.field4722 * 16384 + 64;
					var8 = class115.getTileHeight(var22, var7, class87.Client_plane) - class161.field1754;
					var24 = var22 - cameraX;
					var10 = var8 - class17.cameraY;
					var60 = var7 - WorldMapArea.cameraZ;
					double var91 = Math.sqrt((double)(var60 * var60 + var24 * var24));
					var69 = class153.method3210((int)(Math.atan2((double)var10, var91) * 325.9490051269531D) & 2047);
					var15 = NPC.method2684((int)(Math.atan2((double)var24, (double)var60) * -325.9490051269531D) & 2047);
					field784 = new class493(class365.cameraPitch, var69, var20, var5);
					field783 = new class493(WallDecoration.cameraYaw, var15, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3294 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAddLE();
					var20 = var3.readUnsignedShortLE();
					ItemComposition.method4136(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					class332.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var24 = var3.readUnsignedShortAddLE();
					var10 = var3.readUnsignedByteNeg();
					var22 = var3.method9253();
					var20 = var22 >> 16;
					var5 = var22 >> 8 & 255;
					var7 = var20 + (var22 >> 4 & 7);
					var8 = var5 + (var22 & 7);
					var60 = var3.readUnsignedShortAdd();
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						GraphicsObject var12 = new GraphicsObject(var24, class87.Client_plane, var7, var8, class115.getTileHeight(var7, var8, class87.Client_plane) - var10, var60, cycle);
						graphicsObjects.addFirst(var12);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3273 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					class180.method3565(var20);
					var1.serverPacket = null;
					return true;
				}

				String var50;
				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					Object[] var77 = new Object[var50.length() + 1];

					for (var22 = var50.length() - 1; var22 >= 0; --var22) {
						if (var50.charAt(var22) == 's') {
							var77[var22 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var77[var22 + 1] = new Integer(var3.readInt());
						}
					}

					var77[0] = new Integer(var3.readInt());
					ScriptEvent var64 = new ScriptEvent();
					var64.args = var77;
					Interpreter.runScriptEvent(var64);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3322 == var1.serverPacket) {
					field517 = cycleCntr;
					var72 = var3.readByte();
					class162 var76 = new class162(var3);
					ClanChannel var59;
					if (var72 >= 0) {
						var59 = currentClanChannels[var72];
					} else {
						var59 = ClanChannelMember.guestClanChannel;
					}

					if (var59 == null) {
						this.method1507(var72);
						var1.serverPacket = null;
						return true;
					}

					if (var76.field1758 > var59.field1775) {
						this.method1507(var72);
						var1.serverPacket = null;
						return true;
					}

					if (var76.field1758 < var59.field1775) {
						var1.serverPacket = null;
						return true;
					}

					var76.method3353(var59);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3306 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					rootInterface = var20;
					this.method1340(false);
					class357.method6796(var20);
					VerticalAlignment.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var32;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var25 = (long)var3.readUnsignedShort();
					var27 = (long)var3.readMedium();
					PlayerType var9 = (PlayerType)SequenceDefinition.findEnumerated(class183.PlayerType_values(), var3.readUnsignedByte());
					long var36 = var27 + (var25 << 32);
					var32 = false;

					for (var68 = 0; var68 < 100; ++var68) {
						if (var36 == crossWorldMessageIds[var68]) {
							var32 = true;
							break;
						}
					}

					if (InvDefinition.friendSystem.isIgnored(new Username(var50, class166.loginType))) {
						var32 = true;
					}

					if (!var32 && field790 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var36;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var31 = AbstractFont.escapeBrackets(HealthBarUpdate.method2462(class172.method3430(var3)));
						byte var70;
						if (var9.isPrivileged) {
							var70 = 7;
						} else {
							var70 = 3;
						}

						if (var9.modIcon != -1) {
							class411.addGameMessage(var70, class436.method7916(var9.modIcon) + var50, var31);
						} else {
							class411.addGameMessage(var70, var50, var31);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var20 = var3.readShort();
					var5 = var3.readUnsignedIntLE();
					var22 = var3.method9281();
					var23 = class33.widgetDefinition.method6240(var5);
					if (var20 != var23.rawX || var22 != var23.rawY || var23.xAlignment != 0 || var23.yAlignment != 0) {
						var23.rawX = var20;
						var23.rawY = var22;
						var23.xAlignment = 0;
						var23.yAlignment = 0;
						ClanChannelMember.invalidateWidget(var23);
						this.alignWidget(var23);
						if (var23.type == 0) {
							PendingSpawn.revalidateWidgetScroll(class33.widgetDefinition.Widget_interfaceComponents[var5 >> 16], var23, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3382 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedByteSub();
					var22 = var3.readUnsignedByte();
					var23 = class33.widgetDefinition.method6240(var20);
					UrlRequest.method2875(var23, var22, var5);
					ClanChannelMember.invalidateWidget(var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readInt();
					var22 = var20 >> 10 & 31;
					var7 = var20 >> 5 & 31;
					var8 = var20 & 31;
					var24 = (var7 << 11) + (var22 << 19) + (var8 << 3);
					Widget var97 = class33.widgetDefinition.method6240(var5);
					if (var24 != var97.color) {
						var97.color = var24;
						ClanChannelMember.invalidateWidget(var97);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					byte var71 = var3.readByte();
					Varps.Varps_temp[var20] = var71;
					if (Varps.Varps_main[var20] != var71) {
						Varps.Varps_main[var20] = var71;
					}

					ScriptEvent.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				boolean var61;
				if (ServerPacket.field3296 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var61 = var3.readUnsignedByte() == 1;
					var6 = class33.widgetDefinition.method6240(var20);
					Strings.method6820(var6, TextureProvider.localPlayer.appearance, var61);
					ClanChannelMember.invalidateWidget(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3349 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					var24 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShortAdd();
					var8 = var3.readUnsignedShortAddLE();
					var22 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					ArrayList var95 = new ArrayList();
					var95.add(var20);
					var95.add(var5);
					class202.method3764(var95, var22, var7, var8, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3358 == var1.serverPacket) {
					return this.method1772(var1);
				}

				if (ServerPacket.field3376 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3243);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3290 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3240);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3327 == var1.serverPacket) {
					SequenceDefinition.field2316 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3367 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3238);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3354 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					GraphicsDefaults.queueSoundEffect(var20, var5, var22);
					var1.serverPacket = null;
					return true;
				}

				long var34;
				if (ServerPacket.field3383 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var22 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1340(false);
						class357.method6796(rootInterface);
						VerticalAlignment.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var93;
					for (; var22-- > 0; var93.field1074 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var24 = var3.readUnsignedByte();
						var93 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var93 != null && var8 != var93.group) {
							ArchiveDisk.closeInterface(var93, true);
							var93 = null;
						}

						if (var93 == null) {
							var93 = ClanChannel.openInterface(var7, var8, var24);
						}
					}

					for (var78 = (InterfaceParent)interfaceParents.first(); var78 != null; var78 = (InterfaceParent)interfaceParents.next()) {
						if (var78.field1074) {
							var78.field1074 = false;
						} else {
							ArchiveDisk.closeInterface(var78, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var20) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var24 = var3.readUnsignedShort();
						var10 = var3.readInt();

						for (var60 = var8; var60 <= var24; ++var60) {
							var34 = ((long)var7 << 32) + (long)var60;
							widgetFlags.put(new IntegerNode(var10), var34);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					Tiles.updatePlayers(var3, var1.serverPacketLength);
					SecureRandomCallable.method2285();
					var1.serverPacket = null;
					return true;
				}

				boolean var74;
				if (ServerPacket.field3314 == var1.serverPacket) {
					var74 = var3.readUnsignedByte() == 1;
					if (var74) {
						class411.field4526 = GrandExchangeOfferTotalQuantityComparator.method7049() - var3.readLong();
						Varps.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						Varps.grandExchangeEvents = null;
					}

					field744 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3268 == var1.serverPacket) {
					Clock.field1891 = var3.readUnsignedByte();
					class354.field3856 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3281 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var6 = class33.widgetDefinition.method6240(var5);
					class309.method5870(var6, var20);
					ClanChannelMember.invalidateWidget(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var24 = var3.readUnsignedByteNeg();
					var10 = var24 >> 2;
					var60 = var24 & 3;
					var87 = field596[var10];
					var22 = var3.method9252();
					var20 = var22 >> 16;
					var5 = var22 >> 8 & 255;
					var7 = var20 + (var22 >> 4 & 7);
					var8 = var5 + (var22 & 7);
					var68 = var3.readUnsignedShortAddLE();
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
						if (var87 == 0) {
							BoundaryObject var100 = class10.scene.method4681(class87.Client_plane, var7, var8);
							if (var100 != null) {
								var15 = SecureRandomFuture.Entity_unpackID(var100.tag);
								if (var10 == 2) {
									var100.renderable1 = new DynamicObject(var15, 2, var60 + 4, class87.Client_plane, var7, var8, var68, false, var100.renderable1);
									var100.renderable2 = new DynamicObject(var15, 2, var60 + 1 & 3, class87.Client_plane, var7, var8, var68, false, var100.renderable2);
								} else {
									var100.renderable1 = new DynamicObject(var15, var10, var60, class87.Client_plane, var7, var8, var68, false, var100.renderable1);
								}
							}
						} else if (var87 == 1) {
							WallDecoration var98 = class10.scene.method4682(class87.Client_plane, var7, var8);
							if (var98 != null) {
								var15 = SecureRandomFuture.Entity_unpackID(var98.tag);
								if (var10 != 4 && var10 != 5) {
									if (var10 == 6) {
										var98.renderable1 = new DynamicObject(var15, 4, var60 + 4, class87.Client_plane, var7, var8, var68, false, var98.renderable1);
									} else if (var10 == 7) {
										var98.renderable1 = new DynamicObject(var15, 4, (var60 + 2 & 3) + 4, class87.Client_plane, var7, var8, var68, false, var98.renderable1);
									} else if (var10 == 8) {
										var98.renderable1 = new DynamicObject(var15, 4, var60 + 4, class87.Client_plane, var7, var8, var68, false, var98.renderable1);
										var98.renderable2 = new DynamicObject(var15, 4, (var60 + 2 & 3) + 4, class87.Client_plane, var7, var8, var68, false, var98.renderable2);
									}
								} else {
									var98.renderable1 = new DynamicObject(var15, 4, var60, class87.Client_plane, var7, var8, var68, false, var98.renderable1);
								}
							}
						} else if (var87 == 2) {
							GameObject var94 = class10.scene.getGameObject(class87.Client_plane, var7, var8);
							if (var10 == 11) {
								var10 = 10;
							}

							if (var94 != null) {
								var94.renderable = new DynamicObject(SecureRandomFuture.Entity_unpackID(var94.tag), var10, var60, class87.Client_plane, var7, var8, var68, false, var94.renderable);
							}
						} else if (var87 == 3) {
							FloorDecoration var96 = class10.scene.getFloorDecoration(class87.Client_plane, var7, var8);
							if (var96 != null) {
								var96.renderable = new DynamicObject(SecureRandomFuture.Entity_unpackID(var96.tag), 22, var60, class87.Client_plane, var7, var8, var68, false, var96.renderable);
							}
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var5 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedByteNeg();
					var20 = var3.readUnsignedShortAdd();
					Player var90;
					if (var20 == localPlayerIndex) {
						var90 = TextureProvider.localPlayer;
					} else {
						var90 = players[var20];
					}

					var22 = var3.readInt();
					if (var90 != null) {
						var90.updateSpotAnimation(var7, var5, var22 >> 16, var22 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var20 = var3.readInt();
					var61 = var3.readUnsignedByte() == 1;
					var6 = class33.widgetDefinition.method6240(var20);
					if (var61 != var6.isHidden) {
						var6.isHidden = var61;
						ClanChannelMember.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3303 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShortAddLE();
					var7 = var3.readUnsignedShortAdd();
					class206.method3837(var20, var5, var22, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortLE() * 30;
					field729 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortAddLE();
					var6 = class33.widgetDefinition.method6240(var20);
					if (var6 != null && var6.type == 0) {
						if (var5 > var6.scrollHeight - var6.height) {
							var5 = var6.scrollHeight - var6.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var6.scrollY) {
							var6.scrollY = var5;
							ClanChannelMember.invalidateWidget(var6);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3282 == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var22 = var3.readUnsignedShort();
					if (var22 == 65535) {
						var22 = -1;
					}

					var7 = var3.readUnsignedIntIME();

					for (var8 = var22; var8 <= var5; ++var8) {
						var29 = ((long)var7 << 32) + (long)var8;
						Node var99 = widgetFlags.get(var29);
						if (var99 != null) {
							var99.remove();
						}

						widgetFlags.put(new IntegerNode(var20), var29);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					MusicPatch.playSong(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3274 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.method9252();
					class437.method7924(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var53 = new World();
					var53.host = var3.readStringCp1252NullTerminated();
					var53.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var53.properties = var5;
					if (var53.isDeadman()) {
						var53.field833 = "beta";
					}

					DefaultsGroup.updateGameState(45);
					var2.close();
					var2 = null;
					Language.changeWorld(var53);
					var1.serverPacket = null;
					return false;
				}

				NPC var89;
				if (ServerPacket.field3269 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					short var66 = (short)var3.readShortLE();
					var22 = var3.readUnsignedIntLE();
					var7 = var3.readUnsignedByteNeg();
					var89 = npcs[var20];
					if (var89 != null) {
						var89.method2666(var7, var22, var66);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedByte();
					var22 = var3.readUnsignedByteNeg();
					if (var5 >= 1 && var5 <= 8) {
						if (var50.equalsIgnoreCase("null")) {
							var50 = null;
						}

						playerMenuActions[var5 - 1] = var50;
						playerOptionsPriorities[var5 - 1] = var22 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var5 = var3.readUnsignedIntLE();
					var22 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedByte();
					var20 = var3.readUnsignedShort();
					var89 = npcs[var20];
					if (var89 != null) {
						var89.updateSpotAnimation(var7, var22, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3293 == var1.serverPacket) {
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

				if (ServerPacket.field3372 == var1.serverPacket) {
					if (SequenceDefinition.field2316 == null) {
						SequenceDefinition.field2316 = new class469(class53.Widget_cachedFonts);
					}

					class538 var52 = class53.Widget_cachedFonts.method8450(var3);
					SequenceDefinition.field2316.field4815.vmethod8918(var52.field5205, var52.field5204);
					field720[++field721 - 1 & 31] = var52.field5205;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					var61 = var3.readUnsignedByte() == 1;
					var55 = "";
					boolean var58 = false;
					if (var61) {
						var55 = var3.readStringCp1252NullTerminated();
						if (InvDefinition.friendSystem.isIgnored(new Username(var55, class166.loginType))) {
							var58 = true;
						}
					}

					String var88 = var3.readStringCp1252NullTerminated();
					if (!var58) {
						class411.addGameMessage(var20, var55, var88);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					Clock.field1891 = var3.readUnsignedByte();
					class354.field3856 = var3.readUnsignedByteSub();

					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						class309 var75 = class404.method7414()[var20];
						UrlRequest.method2877(var75);
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
						var6 = class33.widgetDefinition.method6240(var20);
					} else {
						var6 = null;
					}

					for (; var3.offset < var1.serverPacketLength; SecureRandomFuture.itemContainerSetItem(var5, var7, var8 - 1, var24)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var24 = 0;
						if (var8 != 0) {
							var24 = var3.readUnsignedByte();
							if (var24 == 255) {
								var24 = var3.readInt();
							}
						}

						if (var6 != null && var7 >= 0 && var7 < var6.itemIds.length) {
							var6.itemIds[var7] = var8;
							var6.itemQuantities[var7] = var24;
						}
					}

					if (var6 != null) {
						ClanChannelMember.invalidateWidget(var6);
					}

					class304.method5860();
					changedItemContainers[++field602 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3320 == var1.serverPacket) {
					InvDefinition.friendSystem.method1889();
					field723 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3344 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3245);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						NPC.method2643(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShortAdd();
					var6 = class33.widgetDefinition.method6240(var20);
					if (var6.modelType != 2 || var5 != var6.modelId) {
						var6.modelType = 2;
						var6.modelId = var5;
						ClanChannelMember.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3297 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortLE();
					var22 = var3.readUnsignedShort();
					var23 = class33.widgetDefinition.method6240(var20);
					var23.field3733 = var5 + (var22 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3373 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != field547) {
						field547 = var20;
						class174.method3513();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					class357.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var73 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var73 != null) {
						ArchiveDisk.closeInterface(var73, true);
					}

					if (meslayerContinueWidget != null) {
						ClanChannelMember.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

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
						var6 = class33.widgetDefinition.method6240(var20);
					} else {
						var6 = null;
					}

					if (var6 != null) {
						for (var7 = 0; var7 < var6.itemIds.length; ++var7) {
							var6.itemIds[var7] = 0;
							var6.itemQuantities[var7] = 0;
						}
					}

					class155.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var24 = var3.readUnsignedByte();
						if (var24 == 255) {
							var24 = var3.readUnsignedIntIME();
						}

						var10 = var3.readUnsignedShort();
						if (var6 != null && var8 < var6.itemIds.length) {
							var6.itemIds[var8] = var10;
							var6.itemQuantities[var8] = var24;
						}

						SecureRandomFuture.itemContainerSetItem(var5, var8, var10 - 1, var24);
					}

					if (var6 != null) {
						ClanChannelMember.invalidateWidget(var6);
					}

					class304.method5860();
					changedItemContainers[++field602 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					class304.method5860();
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByteSub();
					var22 = var3.readUnsignedIntIME();
					experience[var20] = var22;
					currentLevels[var20] = var5;
					levels[var20] = 1;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var22 >= Skills.Skills_experienceTable[var7]) {
							levels[var20] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3310 == var1.serverPacket) {
					return this.method1680(var1, 2);
				}

				if (ServerPacket.field3330 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3237);
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
						hintArrowHeight = var3.readUnsignedByte() * 2;
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					InvDefinition.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field723 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortLE();
					Varps.Varps_temp[var5] = var20;
					if (Varps.Varps_main[var5] != var20) {
						Varps.Varps_main[var5] = var20;
					}

					ScriptEvent.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					class151.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					Clock.field1891 = var3.readUnsignedByte();
					class354.field3856 = var3.readUnsignedByteNeg();

					for (var20 = Clock.field1891; var20 < Clock.field1891 + 8; ++var20) {
						for (var5 = class354.field3856; var5 < class354.field3856 + 8; ++var5) {
							if (groundItems[class87.Client_plane][var20][var5] != null) {
								groundItems[class87.Client_plane][var20][var5] = null;
								class30.updateItemPile(var20, var5);
							}
						}
					}

					for (PendingSpawn var51 = (PendingSpawn)pendingSpawns.last(); var51 != null; var51 = (PendingSpawn)pendingSpawns.previous()) {
						if (var51.x >= Clock.field1891 && var51.x < Clock.field1891 + 8 && var51.y >= class354.field3856 && var51.y < class354.field3856 + 8 && var51.plane == class87.Client_plane) {
							var51.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3323 == var1.serverPacket) {
					isCameraLocked = true;
					field726 = false;
					field780 = true;
					var20 = var3.readShort();
					var5 = var3.readShort();
					var22 = class153.method3210(var5 + class365.cameraPitch & 2027);
					var7 = var20 + WallDecoration.cameraYaw;
					var8 = var3.readUnsignedShort();
					var24 = var3.readUnsignedByte();
					field784 = new class493(class365.cameraPitch, var22, var8, var24);
					field783 = new class493(WallDecoration.cameraYaw, var7, var8, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					Canvas.privateChatMode = UserComparator9.method2919(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3380 == var1.serverPacket) {
					var87 = var3.readUnsignedShortAdd();
					var22 = var3.method9252();
					var20 = var22 >> 16;
					var5 = var22 >> 8 & 255;
					var7 = var20 + (var22 >> 4 & 7);
					var8 = var5 + (var22 & 7);
					var18 = var3.readUnsignedShortAddLE();
					var68 = var3.readUnsignedByteNeg() * 4;
					var85 = var3.readByteNeg();
					var62 = var3.readByteAdd();
					var16 = var3.readUnsignedShortAdd();
					var15 = var3.readUnsignedShortAddLE();
					var60 = var3.method9208();
					var17 = var3.readUnsignedByteSub();
					var69 = var3.readUnsignedByteAdd() * 4;
					var24 = var85 + var7;
					var10 = var62 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var24 >= 0 && var10 >= 0 && var24 < 104 && var10 < 104 && var87 != 65535) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						var24 = var24 * 128 + 64;
						var10 = var10 * 128 + 64;
						var19 = new Projectile(var87, class87.Client_plane, var7, var8, class115.getTileHeight(var7, var8, class87.Client_plane) - var68, var15 + cycle, var16 + cycle, var17, var18, var60, var69);
						var19.setDestination(var24, var10, class115.getTileHeight(var24, var10, class87.Client_plane) - var69, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				String var41;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var25 = var3.readLong();
					var27 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					PlayerType var40 = (PlayerType)SequenceDefinition.findEnumerated(class183.PlayerType_values(), var3.readUnsignedByte());
					var34 = (var27 << 32) + var29;
					boolean var14 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (var34 == crossWorldMessageIds[var15]) {
							var14 = true;
							break;
						}
					}

					if (var40.isUser && InvDefinition.friendSystem.isIgnored(new Username(var50, class166.loginType))) {
						var14 = true;
					}

					if (!var14 && field790 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var41 = AbstractFont.escapeBrackets(HealthBarUpdate.method2462(class172.method3430(var3)));
						if (var40.modIcon != -1) {
							class164.addChatMessage(9, class436.method7916(var40.modIcon) + var50, var41, class163.base37DecodeLong(var25));
						} else {
							class164.addChatMessage(9, var50, var41, class163.base37DecodeLong(var25));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3338 == var1.serverPacket && isCameraLocked) {
					field726 = true;
					field780 = false;
					field779 = false;

					for (var20 = 0; var20 < 5; ++var20) {
						field786[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3291 == var1.serverPacket) {
					var20 = var3.method9412();
					var5 = var3.readUnsignedIntIME();
					var6 = class33.widgetDefinition.method6240(var5);
					if (var20 != var6.sequenceId || var20 == -1) {
						var6.sequenceId = var20;
						var6.modelFrame = 0;
						var6.modelFrameCycle = 0;
						ClanChannelMember.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3278 == var1.serverPacket) {
					var74 = var3.readBoolean();
					if (var74) {
						if (WallDecoration.field2871 == null) {
							WallDecoration.field2871 = new class384();
						}
					} else {
						WallDecoration.field2871 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3333 == var1.serverPacket) {
					var72 = var3.readByte();
					var21 = var3.readStringCp1252NullTerminated();
					long var42 = (long)var3.readUnsignedShort();
					long var44 = (long)var3.readMedium();
					PlayerType var38 = (PlayerType)SequenceDefinition.findEnumerated(class183.PlayerType_values(), var3.readUnsignedByte());
					long var46 = (var42 << 32) + var44;
					boolean var13 = false;
					ClanChannel var39 = null;
					var39 = var72 >= 0 ? currentClanChannels[var72] : ClanChannelMember.guestClanChannel;
					if (var39 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var38.isUser && InvDefinition.friendSystem.isIgnored(new Username(var21, class166.loginType))) {
									var13 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var46) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var46;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var41 = AbstractFont.escapeBrackets(class172.method3430(var3));
						var16 = var72 >= 0 ? 41 : 44;
						if (var38.modIcon != -1) {
							class164.addChatMessage(var16, class436.method7916(var38.modIcon) + var21, var41, var39.name);
						} else {
							class164.addChatMessage(var16, var21, var41, var39.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3362 == var1.serverPacket) {
					isCameraLocked = true;
					field726 = false;
					field779 = true;
					class191.field1922 = var3.readUnsignedByte() * 16384;
					MouseHandler.field224 = var3.readUnsignedByte() * 16384;
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field781 = var3.readBoolean();
					var22 = var3.readUnsignedByte();
					var7 = class191.field1922 * 128 + 64;
					var8 = MouseHandler.field224 * 128 + 64;
					boolean var81 = false;
					boolean var57 = false;
					if (field781) {
						var24 = class17.cameraY;
						var10 = class115.getTileHeight(var7, var8, class87.Client_plane) - var20;
					} else {
						var24 = class115.getTileHeight(cameraX, WorldMapArea.cameraZ, class87.Client_plane) - class17.cameraY;
						var10 = var20;
					}

					field782 = new class492(cameraX, WorldMapArea.cameraZ, var24, var7, var8, var10, var5, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							ScriptEvent.changeGameOptions(var20);
							changedVarps[++changedVarpCount - 1 & 31] = var20;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					class7.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3347 == var1.serverPacket) {
					isCameraLocked = true;
					field726 = false;
					field779 = true;
					class191.field1922 = var3.readUnsignedByte() * 16384;
					MouseHandler.field224 = var3.readUnsignedByte() * 16384;
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte() * 128 + 64;
					var22 = var3.readUnsignedByte() * 128 + 64;
					var7 = var3.readUnsignedShort();
					field781 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var24 = class191.field1922 * 128 + 64;
					var10 = MouseHandler.field224 * 128 + 64;
					var11 = false;
					var32 = false;
					if (field781) {
						var60 = class17.cameraY;
						var87 = class115.getTileHeight(var24, var10, class87.Client_plane) - var20;
					} else {
						var60 = class115.getTileHeight(cameraX, WorldMapArea.cameraZ, class87.Client_plane) - class17.cameraY;
						var87 = var20;
					}

					field782 = new class491(cameraX, WorldMapArea.cameraZ, var60, var24, var10, var87, var5, var22, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					CollisionMap.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3369 == var1.serverPacket) {
					isCameraLocked = true;
					field726 = false;
					field779 = false;
					class191.field1922 = var3.readUnsignedByte() * 16384;
					MouseHandler.field224 = var3.readUnsignedByte() * 16384;
					SoundSystem.field323 = var3.readUnsignedShort();
					SecureRandomCallable.field1049 = var3.readUnsignedByte();
					class131.field1535 = var3.readUnsignedByte();
					if (class131.field1535 >= 100) {
						cameraX = class191.field1922 * 128 + 64;
						WorldMapArea.cameraZ = MouseHandler.field224 * 128 + 64;
						class17.cameraY = class115.getTileHeight(cameraX, WorldMapArea.cameraZ, class87.Client_plane) - SoundSystem.field323;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var21 = AbstractFont.escapeBrackets(HealthBarUpdate.method2462(class172.method3430(var3)));
					class411.addGameMessage(6, var50, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3355 == var1.serverPacket) {
					World.method1852(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntLE();
					var22 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShortAddLE();
					var33 = class33.widgetDefinition.method6240(var5);
					if (var20 != var33.modelAngleX || var7 != var33.modelAngleY || var22 != var33.modelZoom) {
						var33.modelAngleX = var20;
						var33.modelAngleY = var7;
						var33.modelZoom = var22;
						ClanChannelMember.invalidateWidget(var33);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3335 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3241);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3360 == var1.serverPacket) {
					UrlRequest.method2877(class309.field3235);
					var1.serverPacket = null;
					return true;
				}

				class190.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1420 != null ? var1.field1420.id : -1) + "," + (var1.field1433 != null ? var1.field1433.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				CollisionMap.logOut();
			} catch (IOException var48) {
				class148.method3177();
			} catch (Exception var49) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1420 != null ? var1.field1420.id : -1) + "," + (var1.field1433 != null ? var1.field1433.id : -1) + "," + var1.serverPacketLength + "," + (TextureProvider.localPlayer.pathX[0] + class20.baseX * 64) + "," + (TextureProvider.localPlayer.pathY[0] + class19.baseY * 64) + ",";

				for (var22 = 0; var22 < var1.serverPacketLength && var22 < 50; ++var22) {
					var21 = var21 + var3.array[var22] + ",";
				}

				class190.RunException_sendStackTrace(var21, var49);
				CollisionMap.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false;

		int var2;
		int var5;
		while (!var1) {
			var1 = true;

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
					String var10 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var10;
					String var11 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var11;
					var5 = menuOpcodes[var2];
					menuOpcodes[var2] = menuOpcodes[var2 + 1];
					menuOpcodes[var2 + 1] = var5;
					var5 = menuArguments1[var2];
					menuArguments1[var2] = menuArguments1[var2 + 1];
					menuArguments1[var2 + 1] = var5;
					var5 = menuArguments2[var2];
					menuArguments2[var2] = menuArguments2[var2 + 1];
					menuArguments2[var2 + 1] = var5;
					var5 = menuIdentifiers[var2];
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1];
					menuIdentifiers[var2 + 1] = var5;
					var5 = menuItemIds[var2];
					menuItemIds[var2] = menuItemIds[var2 + 1];
					menuItemIds[var2 + 1] = var5;
					boolean var6 = menuShiftClick[var2];
					menuShiftClick[var2] = menuShiftClick[var2 + 1];
					menuShiftClick[var2 + 1] = var6;
					var1 = false;
				}
			}
		}

		if (clickedWidget == null) {
			int var12 = MouseHandler.MouseHandler_lastButton;
			if (isMenuOpen) {
				int var3;
				if (var12 != 1 && (UserComparator8.mouseCam || var12 != 4)) {
					var2 = MouseHandler.MouseHandler_x;
					var3 = MouseHandler.MouseHandler_y;
					if (var2 < class28.menuX - 10 || var2 > class341.menuWidth + class28.menuX + 10 || var3 < class463.menuY - 10 || var3 > class463.menuY + Language.menuHeight + 10) {
						isMenuOpen = false;
						class19.method284(class28.menuX, class463.menuY, class341.menuWidth, Language.menuHeight);
					}
				}

				if (var12 == 1 || !UserComparator8.mouseCam && var12 == 4) {
					var2 = class28.menuX;
					var3 = class463.menuY;
					int var4 = class341.menuWidth;
					var5 = MouseHandler.MouseHandler_lastPressedX;
					int var13 = MouseHandler.MouseHandler_lastPressedY;
					int var7 = -1;

					for (int var8 = 0; var8 < menuOptionsCount; ++var8) {
						int var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
						if (var5 > var2 && var5 < var2 + var4 && var13 > var9 - 13 && var13 < var9 + 3) {
							var7 = var8;
						}
					}

					if (var7 != -1) {
						AddRequestTask.method7738(var7);
					}

					isMenuOpen = false;
					class19.method284(class28.menuX, class463.menuY, class341.menuWidth, Language.menuHeight);
				}
			} else {
				var2 = AttackOption.method2714();
				if ((var12 == 1 || !UserComparator8.mouseCam && var12 == 4) && this.shouldLeftClickOpenMenu()) {
					var12 = 2;
				}

				if ((var12 == 1 || !UserComparator8.mouseCam && var12 == 4) && menuOptionsCount > 0) {
					AddRequestTask.method7738(var2);
				}

				if (var12 == 2 && menuOptionsCount > 0) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "29401"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = AttackOption.method2714();
		return (leftClickOpensMenu && menuOptionsCount > 2 || WallDecoration.method5194(var1)) && !menuShiftClick[var1];
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-2675"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		class481.method8540(var1, var2);
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		class10.scene.menuOpen(class87.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-758466559"
	)
	final void method1340(boolean var1) {
		int var2 = rootInterface;
		int var3 = class340.canvasWidth;
		int var4 = class491.canvasHeight;
		if (class33.widgetDefinition.loadInterface(var2)) {
			class360.resizeInterface(class33.widgetDefinition.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(Lnm;B)V",
		garbageValue = "0"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class33.widgetDefinition.method6240(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class340.canvasWidth;
			var4 = class491.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		class140.alignWidgetSize(var1, var3, var4, false);
		Username.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2017777407"
	)
	final void method1274() {
		ClanChannelMember.invalidateWidget(clickedWidget);
		++FriendsChat.widgetDragDuration;
		if (field685 && field647) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field750) {
				var1 = field750;
			}

			if (var1 + clickedWidget.width > field750 + clickedWidgetParent.width) {
				var1 = field750 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field748) {
				var2 = field748;
			}

			if (var2 + clickedWidget.height > field748 + clickedWidgetParent.height) {
				var2 = field748 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field554;
			int var4 = var2 - field711;
			int var5 = clickedWidget.dragZoneSize;
			if (FriendsChat.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field750 + clickedWidgetParent.scrollX;
			int var7 = var2 - field748 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				Interpreter.runScriptEvent(var8);
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
						Interpreter.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && class212.method3891(clickedWidget) != null) {
						PacketBufferNode var9 = ClanChannelMember.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var9.packetBuffer.writeIntLE(clickedWidget.id);
						var9.packetBuffer.writeShort(draggedOnWidget.childIndex);
						var9.packetBuffer.writeShort(clickedWidget.childIndex);
						var9.packetBuffer.writeInt(draggedOnWidget.id);
						var9.packetBuffer.writeShortAddLE(clickedWidget.itemId);
						var9.packetBuffer.writeShort(draggedOnWidget.itemId);
						packetWriter.addNode(var9);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field554 + widgetClickX, field711 + widgetClickY);
				} else if (menuOptionsCount > 0) {
					VarbitComposition.method3905(widgetClickX + field554, widgetClickY + field711);
				}

				clickedWidget = null;
			}

		} else {
			if (FriendsChat.widgetDragDuration > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					VarbitComposition.method3905(field554 + widgetClickX, field711 + widgetClickY);
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(I)Lvf;",
		garbageValue = "-1440888763"
	)
	@Export("username")
	public Username username() {
		return TextureProvider.localPlayer != null ? TextureProvider.localPlayer.username : null;
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "95"
	)
	void method1507(int var1) {
		if (revision >= 216) {
			PacketBufferNode var2 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3136, packetWriter.isaacCipher);
			var2.packetBuffer.writeByte(var1);
			packetWriter.addNode(var2);
		}

	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-859215777"
	)
	void method1277(int var1) {
		if (revision >= 216) {
			PacketBufferNode var2 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3175, packetWriter.isaacCipher);
			var2.packetBuffer.writeByte(var1);
			packetWriter.addNode(var2);
		}

	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
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
							WorldMapLabelSize.clientLanguage = Language.method7160(Integer.parseInt(var2));
							break;
						case 7:
							SoundSystem.field325 = class432.method7855(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							HealthBarDefinition.field1995 = var2;
							break;
						case 10:
							UrlRequester.field1436 = (StudioGame)SequenceDefinition.findEnumerated(Calendar.method6760(), Integer.parseInt(var2));
							if (UrlRequester.field1436 == StudioGame.oldscape) {
								class166.loginType = LoginType.oldscape;
							} else {
								class166.loginType = LoginType.field5032;
							}
							break;
						case 11:
							class59.field453 = var2;
							break;
						case 12:
							worldId = Integer.parseInt(var2);
						case 13:
						case 16:
						case 18:
						case 19:
						case 20:
						case 23:
						case 24:
						default:
							break;
						case 14:
							WorldMapIcon_1.field2916 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class59.field450 = var2;
							break;
						case 21:
							field717 = Integer.parseInt(var2);
							break;
						case 22:
							Actor.field1264 = var2;
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								revision = Integer.parseInt(var2);
							} else {
								revision = Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
						}
					}
				}

				AddRequestTask.method7739();
				MouseHandler.worldHost = this.getCodeBase().getHost();
				class59.field452 = new JagNetThread();
				String var4 = SoundSystem.field325.name;
				byte var5 = 0;
				if ((worldProperties & class525.field5112.rsOrdinal()) != 0) {
					UserComparator3.field1471 = "beta";
				}

				try {
					class139.method3110("oldschool", UserComparator3.field1471, var4, var5, 23);
				} catch (Exception var7) {
					class190.RunException_sendStackTrace((String)null, var7);
				}

				class159.client = this;
				class189.field1912 = clientType;
				class223.initCredentials();
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.field565 = true;
				}

				if (field525 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field525 = 0;
					} else {
						field525 = 5;
					}
				}

				this.startThread(765, 503, 217, 1);
			}
		} catch (RuntimeException var8) {
			throw GrandExchangeOfferTotalQuantityComparator.newRunException(var8, "client.init(" + ')');
		}
	}

	protected void finalize() throws Throwable {
		class319.field3434.remove(this);
		super.finalize();
	}

	public void setClient(int var1) {
		this.field566 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field563 = var1;
			GameEngine.setLoginIndex(10);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field568 = var1;
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhg;",
		garbageValue = "-1459620271"
	)
	public static VarcInt method1828(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method3671(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1501700081"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
