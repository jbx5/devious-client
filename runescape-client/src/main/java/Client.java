import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class335 {
	@ObfuscatedName("wh")
	@ObfuscatedGetter(
		intValue = -1568752971
	)
	public static int field823;
	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	static final class239 field770;
	@ObfuscatedName("xw")
	@ObfuscatedSignature(
		descriptor = "Lcf;"
	)
	static final ApproximateRouteStrategy field829;
	@ObfuscatedName("wz")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wi")
	@ObfuscatedGetter(
		intValue = -539925881
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("xq")
	static int[] field830;
	@ObfuscatedName("xf")
	static int[] field831;
	@ObfuscatedName("wr")
	@ObfuscatedGetter(
		intValue = -1819816953
	)
	static int field828;
	@ObfuscatedName("wg")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("wk")
	@ObfuscatedGetter(
		intValue = -130764561
	)
	static int field822;
	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static class460 field819;
	@ObfuscatedName("wc")
	static List field824;
	@ObfuscatedName("by")
	static boolean field551;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 2015442527
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -643724961
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -995947895
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cs")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cm")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 676583951
	)
	static int field531;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 753378011
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -171150743
	)
	static int field533;
	@ObfuscatedName("cz")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1811237787
	)
	static int field557;
	@ObfuscatedName("dm")
	static boolean field527;
	@ObfuscatedName("dr")
	static boolean field684;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1485751769
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("do")
	static boolean field539;
	@ObfuscatedName("ds")
	static boolean field540;
	@ObfuscatedName("df")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1456841351
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 967009251
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		longValue = -8540685319604864889L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1295160999
	)
	static int field751;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1333263023
	)
	static int field546;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		longValue = -1981057678477566385L
	)
	static long field547;
	@ObfuscatedName("dl")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 184636729
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1765644963
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 73668781
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 236353945
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -841060561
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1276653507
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 2123014700
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 60396224
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -357375424
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("em")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ev")
	@Export("z")
	static boolean z;
	@ObfuscatedName("ey")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	static class94 field561;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = -739090101
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 535821113
	)
	static int field563;
	@ObfuscatedName("fn")
	@ObfuscatedGetter(
		intValue = -618272967
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = -860219627
	)
	static int field535;
	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = 1649979411
	)
	static int field566;
	@ObfuscatedName("fd")
	@ObfuscatedGetter(
		intValue = -1948376401
	)
	static int field630;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static class550 field569;
	@ObfuscatedName("gd")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("gw")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("hu")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hk")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(
		intValue = -1444736081
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("hz")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 58631603
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("if")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("it")
	static String field545;
	@ObfuscatedName("ij")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 504433759
	)
	static int field595;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -840950563
	)
	static int field596;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = -1696342819
	)
	static int field699;
	@ObfuscatedName("is")
	@ObfuscatedGetter(
		intValue = -1952142175
	)
	static int field638;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(
		intValue = -1469562999
	)
	static int field584;
	@ObfuscatedName("im")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("jw")
	static int[][][] field601;
	@ObfuscatedName("jz")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("js")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jg")
	static final int[] field604;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 1850382471
	)
	static int field753;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(
		intValue = 700467845
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -819092385
	)
	static int field759;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 1838715027
	)
	static int field608;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = 1152384791
	)
	static int field526;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = -835672749
	)
	static int field662;
	@ObfuscatedName("ka")
	static boolean field611;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 886127191
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 2080637623
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 171319421
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 925056187
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 886767377
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = -1020776691
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 1679308039
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -627689525
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 1095700823
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = 2012668925
	)
	static int field621;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = -961913637
	)
	static int field622;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -1846134361
	)
	static int field623;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = 1691905935
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 794263599
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -1036129075
	)
	@Export("revision")
	public static int revision;
	@ObfuscatedName("lo")
	static boolean field627;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = 1451141151
	)
	static int field628;
	@ObfuscatedName("lv")
	static boolean field629;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -323128913
	)
	static int field610;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = 481094299
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 818089427
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("lw")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("lk")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("lx")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("lz")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("la")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("lp")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("ld")
	static int[][] field787;
	@ObfuscatedName("lj")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("lm")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -1679902223
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 1207558497
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 213058995
	)
	@Export("viewportTempX")
	static int viewportTempY;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -1382789253
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -209186385
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -1792452175
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -1072754781
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mn")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("md")
	@ObfuscatedGetter(
		intValue = -204153191
	)
	static int field650;
	@ObfuscatedName("mj")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("me")
	@ObfuscatedGetter(
		intValue = 1560860713
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = -366864293
	)
	static int field653;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		longValue = 3453023163764971459L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		longValue = -2716180425969645215L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("ma")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = -1894011999
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = -1676534335
	)
	static int field658;
	@ObfuscatedName("ne")
	static int[] field659;
	@ObfuscatedName("ns")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("nr")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nq")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("nw")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("nm")
	@ObfuscatedGetter(
		intValue = 845393953
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("nj")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nl")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nk")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nz")
	static int[] field669;
	@ObfuscatedName("nu")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("nv")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(
		intValue = 1214762271
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nf")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("nd")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("na")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("nx")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("ni")
	@Export("menuItemIds")
	static int[] menuItemIds;
	@ObfuscatedName("nc")
	@Export("menuWorldViewIds")
	static int[] menuWorldViewIds;
	@ObfuscatedName("of")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("oo")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("oi")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("op")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("oh")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("oe")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = -496775203
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -1452246127
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = 2127942889
	)
	static int field780;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 1852826997
	)
	static int field687;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = -1767500567
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("og")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 1091051327
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 412502351
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("oc")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("or")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = -1705433687
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -2058345993
	)
	static int field697;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = 1419726125
	)
	static int field698;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = -206483657
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 576526631
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = -1359640633
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 944647145
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = 655633371
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pl")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = 1935902859
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = -601701583
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pq")
	static boolean field734;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -405187715
	)
	static int field713;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = 715718325
	)
	static int field795;
	@ObfuscatedName("pi")
	static boolean field715;
	@ObfuscatedName("po")
	@ObfuscatedGetter(
		intValue = -534982633
	)
	static int field716;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = -103207115
	)
	static int field748;
	@ObfuscatedName("pv")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -614524711
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qz")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -1171404535
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("qx")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -108515045
	)
	static int field723;
	@ObfuscatedName("qm")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 1605480393
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qr")
	static int[] field706;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 1984437631
	)
	static int field727;
	@ObfuscatedName("qb")
	@ObfuscatedGetter(
		intValue = -958874579
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -895902721
	)
	static int field729;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 1772842415
	)
	static int field730;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = -1092809017
	)
	static int field731;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -1253937119
	)
	static int field745;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 2045003501
	)
	static int field733;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = 663610575
	)
	static int field651;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = 1108853003
	)
	static int field735;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = 457804249
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	static class563 field737;
	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("ri")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	static NodeDeque field741;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = -1213585137
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rh")
	@ObfuscatedGetter(
		intValue = -1774371555
	)
	static int field600;
	@ObfuscatedName("rv")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("rk")
	static boolean[] field746;
	@ObfuscatedName("ru")
	static boolean[] field757;
	@ObfuscatedName("rt")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rl")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("rq")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rm")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 563385483
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		longValue = 4044768072575596341L
	)
	static long field578;
	@ObfuscatedName("rw")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = 570791161
	)
	static int field542;
	@ObfuscatedName("sc")
	@ObfuscatedGetter(
		intValue = 1662378903
	)
	static int field756;
	@ObfuscatedName("sk")
	static int[] field825;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = -1613964547
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = -1130289429
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("st")
	static String field525;
	@ObfuscatedName("sm")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sb")
	@ObfuscatedGetter(
		intValue = 940483095
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	@Export("indexCheck")
	public static IndexCheck indexCheck;
	@ObfuscatedName("sr")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	static class228 field552;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = -729682599
	)
	static int field765;
	@ObfuscatedName("ss")
	static int[] field766;
	@ObfuscatedName("sy")
	static int[] field767;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		longValue = 8080048737762926953L
	)
	static long field768;
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "[Lgc;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sd")
	@ObfuscatedSignature(
		descriptor = "[Lgo;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = 1325981057
	)
	static int field771;
	@ObfuscatedName("tw")
	@ObfuscatedGetter(
		intValue = -1174915981
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("ti")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tj")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = 306981547
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tm")
	@ObfuscatedGetter(
		intValue = -1468438125
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 1240587083
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tg")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = -669537727
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("tb")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tz")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tc")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("to")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ta")
	static int[] field785;
	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "[Lbp;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uv")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("uh")
	static boolean field788;
	@ObfuscatedName("ud")
	static boolean field789;
	@ObfuscatedName("uj")
	static boolean field790;
	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static class510 field791;
	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static class509 field792;
	@ObfuscatedName("ut")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static class509 field793;
	@ObfuscatedName("um")
	static boolean field794;
	@ObfuscatedName("ua")
	static boolean[] field598;
	@ObfuscatedName("vs")

	static int[] field744;
	@ObfuscatedName("vt")
	static int[] field714;
	@ObfuscatedName("vo")
	static int[] field798;
	@ObfuscatedName("va")
	static int[] field709;
	@ObfuscatedName("vj")
	static short field800;
	@ObfuscatedName("vq")
	static short field801;
	@ObfuscatedName("vd")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vg")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vf")
	static short field804;
	@ObfuscatedName("vp")
	static short field760;
	@ObfuscatedName("vx")
	static short field695;
	@ObfuscatedName("vm")
	static short field807;
	@ObfuscatedName("vl")
	@ObfuscatedGetter(
		intValue = -248147819
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = 1122470769
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = -1473664455
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vk")
	@ObfuscatedGetter(
		intValue = -519264569
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vr")
	@ObfuscatedGetter(
		intValue = 1752143465
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = 1264861269
	)
	static int field814;
	@ObfuscatedName("vw")
	@ObfuscatedGetter(
		intValue = 1840830891
	)
	static int field815;
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	static class506 field816;
	@ObfuscatedName("vb")
	@ObfuscatedSignature(
		descriptor = "[Lpg;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("go")
	@Export("token")
	String token;
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Lae;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("gr")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("gb")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("gv")
	@Export("https")
	boolean https;
	@ObfuscatedName("gu")
	@ObfuscatedGetter(
		intValue = 779277509
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "Las;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	@Export("refreshAccessTokenRequester")
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("gz")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	Buffer field532;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	class7 field585;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(
		longValue = 4940111494881884911L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field551 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field531 = -1;
		clientType = -1;
		field533 = -1;
		onMobile = false;
		field557 = 222;
		field527 = false;
		field684 = false;
		gameState = 0;
		field539 = false;
		field540 = false;
		isLoading = true;
		cycle = 0;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field751 = -1;
		field546 = -1;
		field547 = -1L;
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
		z = false;
		field561 = class94.field1166;
		js5ConnectState = 0;
		field563 = 0;
		js5Errors = 0;
		field535 = 0;
		field566 = 0;
		field630 = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field569 = class550.field5403;
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

		BASIC_AUTH_DESKTOP_OSRS = class173.base64Encode(var2);
		int var6 = "com_jagex_auth_desktop_runelite:public".length();
		byte[] var7 = new byte[var6];

		for (int var9 = 0; var9 < var6; ++var9) {
			char var5 = "com_jagex_auth_desktop_runelite:public".charAt(var9);
			if (var5 > 127) {
				var7[var9] = 63;
			} else {
				var7[var9] = (byte)var5;
			}
		}

		String var0 = class193.method3793(var7, 0, var7.length);
		BASIC_AUTH_DESKTOP_RUNELITE = var0;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field595 = 0;
		field596 = 1;
		field699 = 0;
		field638 = 1;
		field584 = 0;
		field601 = new int[4][13][13];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field604 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field753 = -1;
		graphicsCycle = 0;
		field759 = 2301979;
		field608 = 5063219;
		field526 = 3353893;
		field662 = 7759444;
		field611 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field621 = 0;
		field622 = 0;
		field623 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		revision = 0;
		field627 = false;
		field628 = 0;
		field629 = false;
		field610 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field787 = new int[overheadTextLimit][];
		overheadTextCyclesRemaining = new int[overheadTextLimit];
		overheadText = new String[overheadTextLimit];
		viewportDrawCount = 0;
		viewportTempX = -1;
		viewportTempY = -1;
		mouseCrossX = 0;
		mouseCrossY = 0;
		mouseCrossState = 0;
		mouseCrossColor = 0;
		showMouseCross = true;
		field650 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field653 = 0;
		userId = -1L;
		userHash = -1L;
		renderSelf = true;
		drawPlayerNames = 0;
		field658 = 0;
		field659 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field669 = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuItemIds = new int[500];
		menuWorldViewIds = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field780 = 0;
		field687 = 50;
		isItemSelected = 0;
		field545 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field697 = 0;
		field698 = -1;
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
		field734 = false;
		field713 = -1;
		field795 = 715718325 * -32669;
		field715 = false;
		field716 = -1;
		field748 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field723 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field706 = new int[32];
		field727 = 0;
		chatCycle = 0;
		field729 = 0;
		field730 = 0;
		field731 = 0;
		field745 = 0;
		field733 = 0;
		field651 = 0;
		field735 = 0;
		mouseWheelRotation = 0;
		field737 = new class563();
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field741 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field600 = -2;
		validRootWidgets = new boolean[100];
		field746 = new boolean[100];
		field757 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field578 = 0L;
		isResizable = true;
		field542 = 600;
		field756 = field542 / GameEngine.cycleDurationMillis;
		field825 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field525 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		indexCheck = new IndexCheck();
		field552 = new class228();
		field765 = 0;
		field766 = new int[128];
		field767 = new int[128];
		field768 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field771 = -1;
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
		field785 = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field788 = false;
		field789 = false;
		field790 = false;
		field791 = null;
		field792 = null;
		field793 = null;
		field794 = false;
		field598 = new boolean[5];
		field744 = new int[5];
		field714 = new int[5];
		field798 = new int[5];
		field709 = new int[5];
		field800 = 256;
		field801 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field804 = 1;
		field760 = 32767;
		field695 = 1;
		field807 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field814 = -1;
		field815 = -1;
		field816 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field819 = new class460(8, class458.field4877);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field822 = -1;
		field823 = -1;
		field824 = new ArrayList();
		field770 = new class239();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field828 = 0;
		field829 = new ApproximateRouteStrategy();
		field830 = new int[50];
		field831 = new int[50];
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1709856685"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field578 = class129.method3033() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1798(true);
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-31560"
	)
	@Export("setUp")
	protected final void setUp() {
		class355.method6903(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		GraphicsObject.field902 = BoundaryObject.method5455(worldProperties, class541.field5313);
		ApproximateRouteStrategy.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		class294.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		WorldMapLabelSize.currentPort = ApproximateRouteStrategy.worldPort;
		PcmPlayer.field294 = class356.field3800;
		AddRequestTask.field4780 = class356.field3797;
		GrandExchangeOfferOwnWorldComparator.field494 = class356.field3799;
		CollisionMap.field2491 = class356.field3798;
		PacketBufferNode.urlRequester = new SecureUrlRequester(this.https, 222);
		this.setUpKeyboard();
		this.setUpMouse();
		SoundCache.mouseWheel = this.mouseWheel();
		this.method485(field552, 0);
		this.method485(indexCheck, 1);
		this.setUpClipboard();
		class332.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		class459.clientPreferences = Language.method7480();
		String var2 = class533.field5270;
		class31.field165 = this;
		if (var2 != null) {
			class31.field162 = var2;
		}

		class147.setWindowedMode(class459.clientPreferences.getWindowMode());
		class33.friendSystem = new FriendSystem(class236.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		InvDefinition.method3790(this);
		field770.method4555();
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
			}

			if (var1 == null) {
				boolean var5 = false;
				boolean var6 = false;
				if (!class329.field3581.isEmpty()) {
					SongTask var4 = (SongTask)class329.field3581.get(0);
					if (var4 == null) {
						class329.field3581.remove(0);
					} else if (var4.vmethod8329()) {
						if (var4.method8301()) {
							System.out.println("Error in midimanager.service: " + var4.method8319());
							var5 = true;
						} else {
							if (var4.method8304() != null) {
								class329.field3581.add(1, var4.method8304());
							}

							var6 = var4.method8302();
						}

						class329.field3581.remove(0);
					} else {
						var6 = var4.method8302();
					}
				}

				if (var5) {
					class329.field3581.clear();
					LoginScreenAnimation.method2471();
				}

				if (var6 && playingJingle && class137.pcmPlayer1 != null) {
					class137.pcmPlayer1.tryDiscard();
				}

				class212.method4031();
				indexCheck.method4415();
				this.method484();
				class411.method7677();
				if (SoundCache.mouseWheel != null) {
					int var9 = SoundCache.mouseWheel.useRotation();
					mouseWheelRotation = var9;
				}

				if (gameState == 0) {
					ReflectionCheck.method699();
					Canvas.method311();
				} else if (gameState == 5) {
					Canvas.loginScreen(this, class554.fontPlain11, WorldMapSection2.fontPlain12);
					ReflectionCheck.method699();
					Canvas.method311();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						Canvas.loginScreen(this, class554.fontPlain11, WorldMapSection2.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						Canvas.loginScreen(this, class554.fontPlain11, WorldMapSection2.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						if (field527) {
							WorldMapSection2.loadRegion();
						}

						if (field684) {
							class142.method3190(class30.field155);
						}

						if (!field684 && !field527) {
							class105.updateGameState(30);
						}
					}
				} else {
					Canvas.loginScreen(this, class554.fontPlain11, WorldMapSection2.fontPlain12);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if (gameState == 40 || gameState == 45) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1374452311"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && field578 != 0L && class129.method3033() > field578) {
			class147.setWindowedMode(class534.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, class527.field5252);
		} else if (gameState == 5) {
			UserComparator3.drawTitle(WorldMapRenderer.fontBold12, class554.fontPlain11, WorldMapSection2.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				UserComparator3.drawTitle(WorldMapRenderer.fontBold12, class554.fontPlain11, WorldMapSection2.fontPlain12);
			} else if (gameState == 50) {
				UserComparator3.drawTitle(WorldMapRenderer.fontBold12, class554.fontPlain11, WorldMapSection2.fontPlain12);
			} else if (gameState == 25) {
				if (field584 == 1) {
					if (field595 > field596) {
						field596 = field595;
					}

					var2 = (field596 * 50 - field595 * 50) / field596;
					IgnoreList.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field584 == 2) {
					if (field699 > field638) {
						field638 = field699;
					}

					var2 = (field638 * 50 - field699 * 50) / field638 + 50;
					IgnoreList.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					IgnoreList.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				IgnoreList.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				IgnoreList.drawLoadingMessage("Please wait...", false);
			}
		} else {
			UserComparator3.drawTitle(WorldMapRenderer.fontBold12, class554.fontPlain11, WorldMapSection2.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field746[var2]) {
					WorldMapSprite.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field746[var2] = false;
				}
			}
		} else if (gameState > 0) {
			WorldMapSprite.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field746[var2] = false;
			}
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1556603630"
	)
	@Export("kill0")
	protected final void kill0() {
		if (WorldMapCacheName.varcs != null && WorldMapCacheName.varcs.hasUnwrittenChanges()) {
			WorldMapCacheName.varcs.write();
		}

		if (Message.mouseRecorder != null) {
			Message.mouseRecorder.isRunning = false;
		}

		Message.mouseRecorder = null;
		packetWriter.close();
		class53.method1090();
		SoundCache.mouseWheel = null;
		if (class137.pcmPlayer1 != null) {
			class137.pcmPlayer1.shutdown();
		}

		HttpMethod.field32.method7345();
		class319.method6172();
		if (PacketBufferNode.urlRequester != null) {
			PacketBufferNode.urlRequester.close();
			PacketBufferNode.urlRequester = null;
		}

		class160.method3400();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "264023387"
	)
	protected final void vmethod1228() {
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1504950085"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1550466987"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return HttpRequestTask.accessToken != null && !HttpRequestTask.accessToken.trim().isEmpty() && class232.refreshToken != null && !class232.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-634165806"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return HttpRequest.sessionId != null && !HttpRequest.sessionId.trim().isEmpty() && Interpreter.characterId != null && !Interpreter.characterId.trim().isEmpty();
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1894572436"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-5"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class326.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(class326.authServiceBaseUrl)).getHost());
		var4.accept(HttpContentType.APPLICATION_JSON);
		HttpMethod var5 = HttpMethod.POST;
		RefreshAccessTokenRequester var6 = this.refreshAccessTokenRequester;
		if (var6 != null) {
			this.refreshAccessTokenRequestFuture = var6.request(var5.getName(), var3, var4.getHeaders(), "");
		} else {
			HttpRequest var7 = new HttpRequest(var3, var5, var4, this.https);
			this.asyncAccessTokenResponse = this.asyncRestClient.submitRequest(var7);
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1774951208"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(class326.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HttpHeaders var3 = new HttpHeaders();
		var3.bearerToken(var1);
		HttpMethod var4 = HttpMethod.GET;
		OtlTokenRequester var5 = this.otlTokenRequester;
		if (var5 != null) {
			this.otlTokenRequestFuture = var5.request(var4.getName(), var2, var3.getHeaders(), "");
		} else {
			HttpRequest var6 = new HttpRequest(var2, var4, var3, this.https);
			this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var6);
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "100"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class375.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = HttpMethod.field32.method7342();
			if (!var1) {
				this.method1573();
			}

		}
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-8375"
	)
	void method1573() {
		if (HttpMethod.field32.field4542 >= 4) {
			this.error("js5crc");
			class105.updateGameState(1000);
		} else {
			if (HttpMethod.field32.field4543 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					class105.updateGameState(1000);
					return;
				}

				field563 = 3000;
				HttpMethod.field32.field4543 = 3;
			}

			if (--field563 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class163.js5SocketTask = GameEngine.taskHandler.newSocketTask(class11.worldHost, WorldMapLabelSize.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class163.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class163.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						class53.js5Socket = class138.method3132((Socket)class163.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(5);
						var1.writeByte(class322.field3533.field3538);
						var1.writeInt(222);
						class53.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						class134.field1612 = class129.method3033();
					}

					if (js5ConnectState == 3) {
						if (class53.js5Socket.available() > 0) {
							int var2 = class53.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (class129.method3033() - class134.field1612 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						HttpMethod.field32.method7323(class53.js5Socket, gameState > 20);
						class163.js5SocketTask = null;
						class53.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1264069971"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class163.js5SocketTask = null;
		class53.js5Socket = null;
		js5ConnectState = 0;
		if (ApproximateRouteStrategy.worldPort == WorldMapLabelSize.currentPort) {
			WorldMapLabelSize.currentPort = class294.js5Port;
		} else {
			WorldMapLabelSize.currentPort = ApproximateRouteStrategy.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				class105.updateGameState(1000);
			} else {
				field563 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			class105.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				class105.updateGameState(1000);
			} else {
				field563 = 3000;
			}
		}

	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2039123776"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (Tiles.loginState == LoginState.SHUTDOWN_PREVIOUS_CONNECTION) {
				if (Canvas.field120 == null && (secureRandomFuture.isDone() || field535 > 250)) {
					Canvas.field120 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (Canvas.field120 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					AddRequestTask.field4779 = null;
					hadNetworkError = false;
					field535 = 0;
					if (field569.method9939()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(class232.refreshToken);
								SoundSystem.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var22) {
								BufferedSink.RunException_sendStackTrace((String)null, var22);
								class210.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								class210.getLoginError(65);
								return;
							}

							try {
								this.authenticate(HttpRequest.sessionId, Interpreter.characterId);
								SoundSystem.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var21) {
								BufferedSink.RunException_sendStackTrace((String)null, var21);
								class210.getLoginError(65);
								return;
							}
						}
					} else {
						SoundSystem.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var24;
			if (LoginState.TOKEN_RESPONSE == Tiles.loginState) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						class210.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							class210.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						HttpRequestTask.accessToken = var3.getAccessToken();
						class232.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var20) {
						BufferedSink.RunException_sendStackTrace((String)null, var20);
						class210.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						class210.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						BufferedSink.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						class210.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var24 = this.asyncAccessTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						class210.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field535 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var24.getResponseBody());

					try {
						HttpRequestTask.accessToken = var4.getBody().getString("access_token");
						class232.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var19) {
						BufferedSink.RunException_sendStackTrace("Error parsing tokens", var19);
						class210.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(HttpRequestTask.accessToken);
				SoundSystem.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (LoginState.REFRESHING_TOKEN == Tiles.loginState) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						class210.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var25.isSuccess()) {
							class210.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var25.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var18) {
						BufferedSink.RunException_sendStackTrace((String)null, var18);
						class210.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						class210.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						BufferedSink.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						class210.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var24 = this.asyncGameSessionTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						BufferedSink.RunException_sendStackTrace("Response code: " + var24.getResponseCode() + "Response body: " + var24.getResponseBody(), (Throwable)null);
						class210.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var26 = (List)var24.getHeaderFields().get("Content-Type");
					if (var26 != null && var26.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var24.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var17) {
							BufferedSink.RunException_sendStackTrace((String)null, var17);
							class210.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var24.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field535 = 0;
				SoundSystem.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (Tiles.loginState == LoginState.INIT_MOUSEHANDLER_SOCKET) {
				if (AddRequestTask.field4779 == null) {
					AddRequestTask.field4779 = GameEngine.taskHandler.newSocketTask(class11.worldHost, WorldMapLabelSize.currentPort);
				}

				if (AddRequestTask.field4779.status == 2) {
					throw new IOException();
				}

				if (AddRequestTask.field4779.status == 1) {
					var1 = class138.method3132((Socket)AddRequestTask.field4779.result, 40000, 5000);
					packetWriter.setSocket(var1);
					AddRequestTask.field4779 = null;
					SoundSystem.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var28;
			if (LoginState.UNMAPPED_20 == Tiles.loginState) {
				packetWriter.clearBuffer();
				var28 = WorldMapEvent.method6095();
				var28.clientPacket = null;
				var28.clientPacketLength = 0;
				var28.packetBuffer = new PacketBuffer(5000);
				var28.packetBuffer.writeByte(class322.field3535.field3538);
				packetWriter.addNode(var28);
				packetWriter.flush();
				var2.offset = 0;
				SoundSystem.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var13;
			if (Tiles.loginState == LoginState.READ_LOGIN_STATUS) {
				if (class137.pcmPlayer1 != null) {
					class137.pcmPlayer1.method779();
				}

				if (var1.isAvailable(1)) {
					var13 = var1.readUnsignedByte();
					if (class137.pcmPlayer1 != null) {
						class137.pcmPlayer1.method779();
					}

					if (var13 != 0) {
						class210.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					SoundSystem.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == Tiles.loginState) {
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
					MusicPatchPcmStream.field3659 = var2.readLong();
					SoundSystem.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (Tiles.loginState == LoginState.WRITE_INITIAL_LOGIN_PACKET) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var27 = new PacketBuffer(500);
				int[] var30 = new int[]{Canvas.field120.nextInt(), Canvas.field120.nextInt(), Canvas.field120.nextInt(), Canvas.field120.nextInt()};
				var27.offset = 0;
				var27.writeByte(1);
				var27.writeInt(var30[0]);
				var27.writeInt(var30[1]);
				var27.writeInt(var30[2]);
				var27.writeInt(var30[3]);
				var27.writeLong(MusicPatchPcmStream.field3659);
				if (gameState == 40) {
					var27.writeInt(ObjectSound.field869[0]);
					var27.writeInt(ObjectSound.field869[1]);
					var27.writeInt(ObjectSound.field869[2]);
					var27.writeInt(ObjectSound.field869[3]);
				} else {
					if (gameState == 50) {
						var27.writeByte(AuthenticationScheme.field1674.rsOrdinal());
						var27.writeInt(Script.field1026);
					} else {
						var27.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
						case 3:
							var27.writeMedium(class414.otpMedium);
							++var27.offset;
						case 1:
						default:
							break;
						case 2:
							var27.writeInt(class459.clientPreferences.getParameterValue(Login.Login_username));
							break;
						case 4:
							var27.offset += 4;
						}
					}

					if (field569.method9939()) {
						var27.writeByte(class550.field5396.rsOrdinal());
						var27.writeStringCp1252NullTerminated(this.token);
					} else {
						var27.writeByte(class550.field5403.rsOrdinal());
						var27.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var27.encryptRsa(class76.field935, class76.field936);
				ObjectSound.field869 = var30;
				PacketBufferNode var6 = WorldMapEvent.method6095();
				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(class322.field3534.field3538);
				} else {
					var6.packetBuffer.writeByte(class322.field3540.field3538);
				}

				var6.packetBuffer.writeShort(0);
				int var7 = var6.packetBuffer.offset;
				var6.packetBuffer.writeInt(222);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field533);
				byte var8 = 0;
				var6.packetBuffer.writeByte(var8);
				var6.packetBuffer.writeBytes(var27.array, 0, var27.offset);
				int var9 = var6.packetBuffer.offset;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(GameEngine.canvasWidth);
				var6.packetBuffer.writeShort(DbTable.canvasHeight);
				MouseRecorder.method2331(var6.packetBuffer);
				var6.packetBuffer.writeStringCp1252NullTerminated(class432.field4745);
				var6.packetBuffer.writeInt(class165.field1813);
				var6.packetBuffer.writeByte(0);
				Buffer var10 = new Buffer(class350.platformInfo.size());
				class350.platformInfo.write(var10);
				var6.packetBuffer.writeBytes(var10.array, 0, var10.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				if (GraphicsObject.field902) {
					class194.method3795(var6);
				} else {
					class352.method6562(var6);
				}

				var6.packetBuffer.xteaEncrypt(var30, var9, var6.packetBuffer.offset);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var7);
				packetWriter.addNode(var6);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var30);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var30[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				SoundSystem.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var14;
			if (LoginState.READ_CLIENT_INFO_STATUS == Tiles.loginState && var1.available() > 0) {
				var13 = var1.readUnsignedByte();
				if (var13 == 61) {
					var14 = var1.available();
					AbstractByteArrayCopier.field3976 = var14 == 1 && var1.readUnsignedByte() == 1;
					SoundSystem.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var13 == 21 && gameState == 20) {
					SoundSystem.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var13 == 2) {
					if (GraphicsObject.field902) {
						SoundSystem.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						SoundSystem.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					SoundSystem.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var13 == 64) {
					SoundSystem.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var13 == 23 && field566 < 1) {
					++field566;
					SoundSystem.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var13 == 29) {
					SoundSystem.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var13 != 69) {
						class210.getLoginError(var13);
						return;
					}

					SoundSystem.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (Tiles.loginState == LoginState.UNMAPPED_21) {
				class527.field5252 = true;
				UserComparator6.method3020(class94.field1170);
				class105.updateGameState(0);
			}

			if (LoginState.READ_DIGEST_PARSER_PACKET_SIZE == Tiles.loginState && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				PacketBufferNode.field3390 = var2.readUnsignedShort();
				SoundSystem.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (Tiles.loginState == LoginState.SUBMIT_DIGEST_PARSER_TASK && var1.available() >= PacketBufferNode.field3390) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, PacketBufferNode.field3390);
				class6[] var29 = new class6[]{class6.field15};
				class6 var32 = var29[var2.readUnsignedByte()];

				try {
					class3 var33 = class378.method7154(var32);
					this.field585 = new class7(var2, var33);
					SoundSystem.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
				} catch (Exception var16) {
					class210.getLoginError(22);
					return;
				}
			}

			if (Tiles.loginState == LoginState.WRITE_DIGEST_PARSER_RESULT && this.field585.method40()) {
				this.field532 = this.field585.method42();
				this.field585.method41();
				this.field585 = null;
				if (this.field532 == null) {
					class210.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var28 = WorldMapEvent.method6095();
				var28.clientPacket = null;
				var28.clientPacketLength = 0;
				var28.packetBuffer = new PacketBuffer(5000);
				var28.packetBuffer.writeByte(class322.field3532.field3538);
				var28.packetBuffer.writeShort(this.field532.offset);
				var28.packetBuffer.writeBuffer(this.field532);
				packetWriter.addNode(var28);
				packetWriter.flush();
				this.field532 = null;
				SoundSystem.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (Tiles.loginState == LoginState.READ_STATE_11_PACKET_SIZE && var1.available() > 0) {
				DevicePcmPlayerProvider.field114 = var1.readUnsignedByte();
				SoundSystem.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (Tiles.loginState == LoginState.UNMAPPED_11 && var1.available() >= DevicePcmPlayerProvider.field114) {
				var1.read(var2.array, 0, DevicePcmPlayerProvider.field114);
				var2.offset = 0;
				SoundSystem.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (Tiles.loginState == LoginState.READ_PROFILE_TRANSFER_TIME && var1.available() > 0) {
				field630 = (var1.readUnsignedByte() + 3) * 60;
				SoundSystem.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (LoginState.PROFILE_TRANSFER == Tiles.loginState) {
				field535 = 0;
				WorldMapSection2.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field630 / 60 + " seconds.");
				if (--field630 <= 0) {
					SoundSystem.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (LoginState.READ_ACCOUNT_INFO_PACKET_SIZE == Tiles.loginState) {
				var28 = WorldMapEvent.method6095();
				var28.clientPacket = null;
				var28.clientPacketLength = 0;
				var28.packetBuffer = new PacketBuffer(5000);
				var28.packetBuffer.writeByte(class322.field3537.field3538);
				var28.packetBuffer.writeShort(class322.field3537.field3536);
				var28.packetBuffer.writeIntME(LoginState.archive4.hash);
				var28.packetBuffer.writeIntLE(0);
				var28.packetBuffer.writeIntIME(class438.archive12.hash);
				var28.packetBuffer.writeIntIME(WorldMapRegion.field3093.hash);
				var28.packetBuffer.writeIntIME(class333.field3643.hash);
				var28.packetBuffer.writeIntIME(class324.field3552.hash);
				var28.packetBuffer.writeIntME(class327.field3564.hash);
				var28.packetBuffer.writeIntME(HttpResponse.field105.hash);
				var28.packetBuffer.writeInt(Projection.archive2.hash);
				var28.packetBuffer.writeIntLE(class133.field1602.hash);
				var28.packetBuffer.writeIntME(SceneTilePaint.archive9.hash);
				var28.packetBuffer.writeIntLE(class53.field370.hash);
				var28.packetBuffer.writeIntME(Varcs.field1452.hash);
				var28.packetBuffer.writeIntME(ClientPacket.field3374.hash);
				packetWriter.addNode(var28);
				packetWriter.flush();
				SoundSystem.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (Tiles.loginState == LoginState.UNMAPPED && var1.available() >= 1) {
					SecureUrlRequester.field1482 = var1.readUnsignedByte();
					if (SecureUrlRequester.field1482 != class322.field3541.field3536) {
						class210.getLoginError(SecureUrlRequester.field1482);
						return;
					}

					SoundSystem.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (LoginState.READ_ACCOUNT_INFO == Tiles.loginState && var1.available() >= SecureUrlRequester.field1482) {
					boolean var38 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var37 = false;
					if (var38) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						class459.clientPreferences.put(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						class459.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						class459.clientPreferences.updateRememberedUsername((String)null);
					}

					class202.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field653 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					MilliClock.method3646().method3658(this.https);
					SoundSystem.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (LoginState.SET_SERVER_PROTOCOL == Tiles.loginState && var1.available() >= packetWriter.serverPacketLength) {
					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method9602()) {
						var1.read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var31 = class30.ServerPacket_values();
					var14 = var2.readSmartByteShortIsaac();
					if (var14 < 0 || var14 >= var31.length) {
						throw new IOException("Invalid ServerProt: " + var14 + " at " + var2.offset);
					}

					packetWriter.serverPacket = var31[var14];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class26.method375(class188.client, "zap");
					} catch (Throwable var15) {
					}

					SoundSystem.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS == Tiles.loginState) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method8393();
						class449.method8388();
						class358.topLevelWorldView.playerUpdateManager.updatePlayer(var2, true);
						Interpreter.field899 = class17.localPlayer;
						class485.field5007 = -1;
						class424.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field539 = false;
					}

				} else {
					if (LoginState.UNMAPPED_17 == Tiles.loginState && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						BuddyRankComparator.field1520 = var2.readUnsignedShort();
						SoundSystem.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (Tiles.loginState == LoginState.UNMAPPED_18 && var1.available() >= BuddyRankComparator.field1520) {
						var2.offset = 0;
						var1.read(var2.array, 0, BuddyRankComparator.field1520);
						var2.offset = 0;
						String var34 = var2.readStringCp1252NullTerminated();
						String var36 = var2.readStringCp1252NullTerminated();
						String var35 = var2.readStringCp1252NullTerminated();
						WorldMapSection2.setLoginResponseString(var34, var36, var35);
						class105.updateGameState(10);
						if (field569.method9939()) {
							ParamComposition.updateLoginIndex(9);
						}
					}

					if (Tiles.loginState != LoginState.UNMAPPED_19) {
						++field535;
						if (field535 > 2000) {
							if (field566 < 1) {
								if (ApproximateRouteStrategy.worldPort == WorldMapLabelSize.currentPort) {
									WorldMapLabelSize.currentPort = class294.js5Port;
								} else {
									WorldMapLabelSize.currentPort = ApproximateRouteStrategy.worldPort;
								}

								++field566;
								SoundSystem.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								class210.getLoginError(-3);
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
							timer.method8395();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1474 = null;
							packetWriter.field1475 = null;
							packetWriter.field1476 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1470 = 0;
							rebootTimer = 0;
							Huffman.method7078();
							minimapState = 0;
							destinationX = 0;
							class358.topLevelWorldView.method2640();
							class146.method3220();
							class105.updateGameState(30);

							for (var14 = 0; var14 < 100; ++var14) {
								validRootWidgets[var14] = true;
							}

							if (packetWriter != null && packetWriter.isaacCipher != null) {
								var28 = WorldMapElement.getPacketBufferNode(ClientPacket.field3368, packetWriter.isaacCipher);
								var28.packetBuffer.writeByte(class534.getWindowedMode());
								var28.packetBuffer.writeShort(GameEngine.canvasWidth);
								var28.packetBuffer.writeShort(DbTable.canvasHeight);
								packetWriter.addNode(var28);
							}

							class358.topLevelWorldView.playerUpdateManager.updatePlayer(var2, true);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var23) {
			if (field566 < 1) {
				if (WorldMapLabelSize.currentPort == ApproximateRouteStrategy.worldPort) {
					WorldMapLabelSize.currentPort = class294.js5Port;
				} else {
					WorldMapLabelSize.currentPort = ApproximateRouteStrategy.worldPort;
				}

				++field566;
				SoundSystem.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				class210.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2107564254"
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
			ClientPacket.method6167();
		} else {
			if (!isMenuOpen) {
				MouseHandler.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last();
					boolean var37;
					if (var2 == null) {
						var37 = false;
					} else {
						var37 = true;
					}

					int var3;
					PacketBufferNode var38;
					if (!var37) {
						PacketBufferNode var16;
						int var17;
						if (timer.field4835) {
							var16 = WorldMapElement.getPacketBufferNode(ClientPacket.field3289, packetWriter.isaacCipher);
							var16.packetBuffer.writeByte(0);
							var17 = var16.packetBuffer.offset;
							timer.write(var16.packetBuffer);
							var16.packetBuffer.writeLengthByte(var16.packetBuffer.offset - var17);
							packetWriter.addNode(var16);
							timer.method8394();
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
						synchronized(Message.mouseRecorder.lock) {
							if (!field551) {
								Message.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || Message.mouseRecorder.index >= 40) {
								var38 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < Message.mouseRecorder.index && (var38 == null || var38.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = Message.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = Message.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field751 || var8 != field546) {
										if (var38 == null) {
											var38 = WorldMapElement.getPacketBufferNode(ClientPacket.field3318, packetWriter.isaacCipher);
											var38.packetBuffer.writeByte(0);
											var3 = var38.packetBuffer.offset;
											PacketBuffer var10000 = var38.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (field547 != -1L) {
											var10 = var9 - field751;
											var11 = var8 - field546;
											var12 = (int)((Message.mouseRecorder.millis[var7] - field547) / 20L);
											var5 = (int)((long)var5 + (Message.mouseRecorder.millis[var7] - field547) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field751 = var9;
										field546 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var38.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var38.packetBuffer.writeByte(var12 + 128);
											var38.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var38.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var38.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var38.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var38.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var38.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var38.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field547 = Message.mouseRecorder.millis[var7];
									}
								}

								if (var38 != null) {
									var38.packetBuffer.writeLengthByte(var38.packetBuffer.offset - var3);
									var7 = var38.packetBuffer.offset;
									var38.packetBuffer.offset = var3;
									var38.packetBuffer.writeByte(var5 / var6);
									var38.packetBuffer.writeByte(var5 % var6);
									var38.packetBuffer.offset = var7;
									packetWriter.addNode(var38);
								}

								if (var4 >= Message.mouseRecorder.index) {
									Message.mouseRecorder.index = 0;
								} else {
									MouseRecorder var57 = Message.mouseRecorder;
									var57.index -= var4;
									System.arraycopy(Message.mouseRecorder.xs, var4, Message.mouseRecorder.xs, 0, Message.mouseRecorder.index);
									System.arraycopy(Message.mouseRecorder.ys, var4, Message.mouseRecorder.ys, 0, Message.mouseRecorder.index);
									System.arraycopy(Message.mouseRecorder.millis, var4, Message.mouseRecorder.millis, 0, Message.mouseRecorder.index);
								}
							}
						}

						if (MouseHandler.MouseHandler_lastButton == 1 || !class105.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var18 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
							if (var18 > 32767L) {
								var18 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > DbTable.canvasHeight) {
								var3 = DbTable.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > GameEngine.canvasWidth) {
								var4 = GameEngine.canvasWidth;
							}

							var5 = (int)var18;
							PacketBufferNode var20 = WorldMapElement.getPacketBufferNode(ClientPacket.field3322, packetWriter.isaacCipher);
							var20.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var20.packetBuffer.writeShort(var4);
							var20.packetBuffer.writeShort(var3);
							packetWriter.addNode(var20);
						}

						if (mouseWheelRotation != 0) {
							var16 = WorldMapElement.getPacketBufferNode(ClientPacket.field3364, packetWriter.isaacCipher);
							var16.packetBuffer.writeShort(mouseWheelRotation);
							packetWriter.addNode(var16);
						}

						if (indexCheck.field2467 > 0) {
							var16 = WorldMapElement.getPacketBufferNode(ClientPacket.field3362, packetWriter.isaacCipher);
							var16.packetBuffer.writeShort(0);
							var17 = var16.packetBuffer.offset;
							long var21 = class129.method3033();

							for (var5 = 0; var5 < indexCheck.field2467; ++var5) {
								long var23 = var21 - field768;
								if (var23 > 16777215L) {
									var23 = 16777215L;
								}

								field768 = var21;
								var16.packetBuffer.writeByte(indexCheck.field2473[var5]);
								var16.packetBuffer.method9458((int)var23);
							}

							var16.packetBuffer.writeLengthShort(var16.packetBuffer.offset - var17);
							packetWriter.addNode(var16);
						}

						if (field628 > 0) {
							--field628;
						}

						if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
							field629 = true;
						}

						if (field629 && field628 <= 0) {
							field628 = 20;
							field629 = false;
							var16 = WorldMapElement.getPacketBufferNode(ClientPacket.field3305, packetWriter.isaacCipher);
							var16.packetBuffer.writeShortAdd(camAngleX);
							var16.packetBuffer.writeShortAddLE(camAngleY);
							packetWriter.addNode(var16);
						}

						if (HttpAuthenticationHeader.hasFocus && !hadFocus) {
							hadFocus = true;
							var16 = WorldMapElement.getPacketBufferNode(ClientPacket.field3276, packetWriter.isaacCipher);
							var16.packetBuffer.writeByte(1);
							packetWriter.addNode(var16);
						}

						if (!HttpAuthenticationHeader.hasFocus && hadFocus) {
							hadFocus = false;
							var16 = WorldMapElement.getPacketBufferNode(ClientPacket.field3276, packetWriter.isaacCipher);
							var16.packetBuffer.writeByte(0);
							packetWriter.addNode(var16);
						}

						if (class6.worldMap != null) {
							class6.worldMap.method9267();
						}

						class237.method4550();
						if (class238.field2539) {
							HttpJsonRequestBody.method8938();
							class238.field2539 = false;
						}

						if (field771 != class358.topLevelWorldView.plane) {
							field771 = class358.topLevelWorldView.plane;
							var1 = class358.topLevelWorldView.plane;
							int[] var39 = HealthBarUpdate.sceneMinimapSprite.pixels;
							var3 = var39.length;

							for (var4 = 0; var4 < var3; ++var4) {
								var39[var4] = 0;
							}

							for (var4 = 1; var4 < 103; ++var4) {
								var5 = (103 - var4) * 2048 + 24628;

								for (var6 = 1; var6 < 103; ++var6) {
									if ((class358.topLevelWorldView.tileSettings[var1][var6][var4] & 24) == 0) {
										class358.topLevelWorldView.scene.drawTileMinimap(var39, var5, 512, var1, var6, var4);
									}

									if (var1 < 3 && (class358.topLevelWorldView.tileSettings[var1 + 1][var6][var4] & 8) != 0) {
										class358.topLevelWorldView.scene.drawTileMinimap(var39, var5, 512, var1 + 1, var6, var4);
									}

									var5 += 4;
								}
							}

							var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
							var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
							HealthBarUpdate.sceneMinimapSprite.setRaster();

							for (var6 = 1; var6 < 103; ++var6) {
								for (var7 = 1; var7 < 103; ++var7) {
									if ((class358.topLevelWorldView.tileSettings[var1][var7][var6] & 24) == 0) {
										class27.drawObject(var1, var7, var6, var4, var5);
									}

									if (var1 < 3 && (class358.topLevelWorldView.tileSettings[var1 + 1][var7][var6] & 8) != 0) {
										class27.drawObject(var1 + 1, var7, var6, var4, var5);
									}
								}
							}

							mapIconCount = 0;

							for (var6 = 0; var6 < 104; ++var6) {
								for (var7 = 0; var7 < 104; ++var7) {
									long var25 = class358.topLevelWorldView.scene.getFloorDecorationTag(class358.topLevelWorldView.plane, var6, var7);
									if (0L != var25) {
										var10 = class105.Entity_unpackID(var25);
										var11 = HitSplatDefinition.getObjectDefinition(var10).mapIconId;
										if (var11 >= 0 && WorldMapElement.WorldMapElement_get(var11).field2028) {
											mapIcons[mapIconCount] = WorldMapElement.WorldMapElement_get(var11).getSpriteBool(false);
											mapIconXs[mapIconCount] = var6;
											mapIconYs[mapIconCount] = var7;
											++mapIconCount;
										}
									}
								}
							}

							WorldMapSprite.rasterProvider.apply();
						}

						if (gameState != 30) {
							return;
						}

						Actor.method2464(class358.topLevelWorldView);
						class27.method416();
						++packetWriter.field1470;
						if (packetWriter.field1470 > 750) {
							ClientPacket.method6167();
							return;
						}

						WorldView var43 = class358.topLevelWorldView;
						var17 = var43.playerUpdateManager.playerCount;
						int[] var27 = var43.playerUpdateManager.playerIndices;

						for (var4 = 0; var4 < var17; ++var4) {
							Player var28 = var43.players[var27[var4]];
							if (var28 != null) {
								GrandExchangeOfferOwnWorldComparator.updateActorSequence(var43, var28, 1);
							}
						}

						class229.method4408(class358.topLevelWorldView);
						WorldView var40 = class358.topLevelWorldView;

						for (var3 = 0; var3 < var40.worldEntityCount; ++var3) {
							var4 = var40.worldEntityIndices[var3];
							WorldEntity var47 = var40.worldEntities[var4];
							if (var47 != null) {
								var47.method8758();
							}
						}

						class53.method1091(class358.topLevelWorldView);

						for (var3 = 0; var3 < class358.topLevelWorldView.worldEntityCount; ++var3) {
							WorldEntity var29 = class358.topLevelWorldView.worldEntities[class358.topLevelWorldView.worldEntityIndices[var3]];
							if (var29 != null) {
								Actor.method2464(var29.worldView);
								WorldView var48 = var29.worldView;
								var6 = var48.playerUpdateManager.playerCount;
								int[] var30 = var48.playerUpdateManager.playerIndices;

								for (var8 = 0; var8 < var6; ++var8) {
									Player var31 = var48.players[var30[var8]];
									if (var31 != null) {
										GrandExchangeOfferOwnWorldComparator.updateActorSequence(var48, var31, 1);
									}
								}

								class229.method4408(var29.worldView);
								class53.method1091(var29.worldView);
							}
						}

						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var46 = MouseHandler.mousedOverWidgetIf1;
						Widget var50 = class210.field2162;
						MouseHandler.mousedOverWidgetIf1 = null;
						class210.field2162 = null;
						draggedOnWidget = null;
						field715 = false;
						field734 = false;
						field765 = 0;

						while (indexCheck.method4439() && field765 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field2476 == 66) {
								String var49 = Widget.method7058();
								class188.client.method481(var49);
							} else if (oculusOrbState != 1 || indexCheck.field2464 <= 0) {
								field767[field765] = indexCheck.field2476;
								field766[field765] = indexCheck.field2464;
								++field765;
							}
						}

						if (class232.method4491() && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var5 = class17.localPlayer.plane - mouseWheelRotation;
							if (var5 < 0) {
								var5 = 0;
							} else if (var5 > 3) {
								var5 = 3;
							}

							if (var5 != class17.localPlayer.plane) {
								var6 = class17.localPlayer.pathX[0] + class358.topLevelWorldView.baseX;
								var7 = class17.localPlayer.pathY[0] + class358.topLevelWorldView.baseY;
								PacketBufferNode var32 = WorldMapElement.getPacketBufferNode(ClientPacket.field3336, packetWriter.isaacCipher);
								var32.packetBuffer.writeByteNeg(var5);
								var32.packetBuffer.writeShortAddLE(var7);
								var32.packetBuffer.writeIntIME(0);
								var32.packetBuffer.writeShort(var6);
								packetWriter.addNode(var32);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							HorizontalAlignment.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, DbTable.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var44;
							ScriptEvent var51;
							Widget var52;
							do {
								var51 = (ScriptEvent)scriptEvents2.removeLast();
								if (var51 == null) {
									while (true) {
										do {
											var51 = (ScriptEvent)scriptEvents3.removeLast();
											if (var51 == null) {
												while (true) {
													do {
														var51 = (ScriptEvent)scriptEvents.removeLast();
														if (var51 == null) {
															boolean var41 = false;

															while (true) {
																class229 var45 = (class229)field741.removeLast();
																if (var45 == null) {
																	if (!var41 && MouseHandler.MouseHandler_lastButton == 1) {
																		field552.method4379();
																	}

																	this.menu();
																	if (class6.worldMap != null) {
																		class6.worldMap.method9095(class358.topLevelWorldView.plane, (Interpreter.field899.vmethod8779() >> 7) + class358.topLevelWorldView.baseX, (Interpreter.field899.vmethod8773() >> 7) + class358.topLevelWorldView.baseY, false);
																		class6.worldMap.loadCache();
																	}

																	if (clickedWidget != null) {
																		this.method1260();
																	}

																	boolean var42 = false;

																	for (var7 = 0; var7 < class358.topLevelWorldView.worldEntityCount; ++var7) {
																		WorldEntity var55 = class358.topLevelWorldView.worldEntities[class358.topLevelWorldView.worldEntityIndices[var7]];
																		WorldView var53 = var55.worldView;
																		Scene var33 = var53.scene;
																		if (var55 != null && var33.shouldSendWalk()) {
																			if (!var42) {
																				var11 = var33.baseX;
																				var12 = var33.baseY;
																				PacketBufferNode var13 = WorldMapElement.getPacketBufferNode(ClientPacket.field3298, packetWriter.isaacCipher);
																				var13.packetBuffer.writeByte(5);
																				var13.packetBuffer.writeShortAddLE(var12 + var53.baseY);
																				var13.packetBuffer.writeShortAdd(var11 + var53.baseX);
																				var13.packetBuffer.writeByte(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																				packetWriter.addNode(var13);
																				var42 = true;
																				mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																				mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																				mouseCrossColor = 1;
																				mouseCrossState = 0;
																				destinationX = var11;
																				destinationY = var12;
																			}

																			var33.method4986();
																		}
																	}

																	if (!var42 && class358.topLevelWorldView.scene.shouldSendWalk()) {
																		var7 = class358.topLevelWorldView.scene.baseX;
																		var8 = class358.topLevelWorldView.scene.baseY;
																		PacketBufferNode var54 = WorldMapElement.getPacketBufferNode(ClientPacket.field3298, packetWriter.isaacCipher);
																		var54.packetBuffer.writeByte(5);
																		var54.packetBuffer.writeShortAddLE(var8 + class358.topLevelWorldView.baseY);
																		var54.packetBuffer.writeShortAdd(var7 + class358.topLevelWorldView.baseX);
																		var54.packetBuffer.writeByte(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																		packetWriter.addNode(var54);
																		class358.topLevelWorldView.scene.method4986();
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																		mouseCrossColor = 1;
																		mouseCrossState = 0;
																		destinationX = var7;
																		destinationY = var8;
																	}

																	if (var42) {
																		class358.topLevelWorldView.scene.method4986();
																	}

																	if (var46 != MouseHandler.mousedOverWidgetIf1) {
																		if (var46 != null) {
																			class324.invalidateWidget(var46);
																		}

																		if (MouseHandler.mousedOverWidgetIf1 != null) {
																			class324.invalidateWidget(MouseHandler.mousedOverWidgetIf1);
																		}
																	}

																	if (var50 != class210.field2162 && field687 == field780) {
																		if (var50 != null) {
																			class324.invalidateWidget(var50);
																		}

																		if (class210.field2162 != null) {
																			class324.invalidateWidget(class210.field2162);
																		}
																	}

																	if (class210.field2162 != null) {
																		if (field780 < field687) {
																			++field780;
																			if (field687 == field780) {
																				class324.invalidateWidget(class210.field2162);
																			}
																		}
																	} else if (field780 > 0) {
																		--field780;
																	}

																	ModeWhere.method7491();
																	if (field794) {
																		class129.method3038();
																	} else if (isCameraLocked) {
																		if (!field788) {
																			var7 = class76.field938 * 16384 + 64;
																			var8 = Varps.field3707 * 16384 + 64;
																			var9 = SoundSystem.getTileHeight(class358.topLevelWorldView, var7, var8, class358.topLevelWorldView.plane) - class459.field4880;
																			class91.method2339(var7, var9, var8);
																		} else if (field791 != null) {
																			PlayerComposition.cameraX = field791.vmethod9046();
																			UserComparator4.cameraZ = field791.vmethod9049();
																			if (field790) {
																				class171.cameraY = field791.vmethod9047();
																			} else {
																				class171.cameraY = SoundSystem.getTileHeight(class358.topLevelWorldView, PlayerComposition.cameraX, UserComparator4.cameraZ, class358.topLevelWorldView.plane) - field791.vmethod9047();
																			}

																			field791.method9057();
																		}

																		if (!field789) {
																			var7 = class315.field3269 * 16384 + 64;
																			var8 = class284.field3133 * 16384 + 64;
																			var9 = SoundSystem.getTileHeight(class358.topLevelWorldView, var7, var8, class358.topLevelWorldView.plane) - UserComparator7.field1502;
																			var10 = var7 - PlayerComposition.cameraX;
																			var11 = var9 - class171.cameraY;
																			var12 = var8 - UserComparator4.cameraZ;
																			int var34 = (int)Math.sqrt((double)(var12 * var12 + var10 * var10));
																			int var14 = (int)(Math.atan2((double)var11, (double)var34) * 325.9490051269531D) & 2047;
																			int var15 = (int)(Math.atan2((double)var10, (double)var12) * -325.9490051269531D) & 2047;
																			class316.method6165(var14, var15);
																		} else {
																			if (field793 != null) {
																				Actor.cameraPitch = field793.method9042();
																				Actor.cameraPitch = Math.min(Math.max(Actor.cameraPitch, 128), 383);
																				field793.method9057();
																			}

																			if (field792 != null) {
																				class206.cameraYaw = field792.method9042() & 2047;
																				field792.method9057();
																			}
																		}
																	}

																	for (var7 = 0; var7 < 5; ++var7) {
																		int var10002 = field709[var7]++;
																	}

																	WorldMapCacheName.varcs.tryWrite();
																	var7 = ModelData0.method5451();
																	var8 = GameEngine.keyHandler.method338();
																	PacketBufferNode var56;
																	if (var7 > 15000 && var8 > 15000) {
																		logoutTimer = 250;
																		MouseHandler.MouseHandler_idleCycles = 14500;
																		var56 = WorldMapElement.getPacketBufferNode(ClientPacket.field3327, packetWriter.isaacCipher);
																		packetWriter.addNode(var56);
																	}

																	class33.friendSystem.processFriendUpdates();
																	class497.method8985();
																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var56 = WorldMapElement.getPacketBufferNode(ClientPacket.field3357, packetWriter.isaacCipher);
																		packetWriter.addNode(var56);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var35) {
																		ClientPacket.method6167();
																	}

																	MilliClock.method3646().method3669();
																	return;
																}

																if (var45.field2459.type == 12) {
																	var41 = true;
																}

																class533.method9516(var45);
															}
														}

														var44 = var51.widget;
														if (var44.childIndex < 0) {
															break;
														}

														var52 = AsyncRestClient.widgetDefinition.method6536(var44.parentId);
													} while(var52 == null || var52.children == null || var44.childIndex >= var52.children.length || var44 != var52.children[var44.childIndex]);

													class371.runScriptEvent(var51);
												}
											}

											var44 = var51.widget;
											if (var44.childIndex < 0) {
												break;
											}

											var52 = AsyncRestClient.widgetDefinition.method6536(var44.parentId);
										} while(var52 == null || var52.children == null || var44.childIndex >= var52.children.length || var44 != var52.children[var44.childIndex]);

										class371.runScriptEvent(var51);
									}
								}

								var44 = var51.widget;
								if (var44.childIndex < 0) {
									break;
								}

								var52 = AsyncRestClient.widgetDefinition.method6536(var44.parentId);
							} while(var52 == null || var52.children == null || var44.childIndex >= var52.children.length || var44 != var52.children[var44.childIndex]);

							class371.runScriptEvent(var51);
						}
					}

					var38 = WorldMapElement.getPacketBufferNode(ClientPacket.field3286, packetWriter.isaacCipher);
					var38.packetBuffer.writeByte(0);
					var3 = var38.packetBuffer.offset;
					class203.performReflectionCheck(var38.packetBuffer);
					var38.packetBuffer.writeLengthByte(var38.packetBuffer.offset - var3);
					packetWriter.addNode(var38);
				}
			}
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1845076134"
	)
	public void vmethod6444(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && class459.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = WorldMapElement.getPacketBufferNode(ClientPacket.field3277, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2082176512"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = GameEngine.canvasWidth;
		int var2 = DbTable.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class459.clientPreferences != null) {
			try {
				Client var3 = class188.client;
				Object[] var4 = new Object[]{class534.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "736289381"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class140.method3145(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field746[var1] = true;
			}

			field757[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field600 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			class365.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, DbTable.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class237.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class237.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		int var4;
		int var6;
		int var8;
		int var9;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				var2 = viewportY;
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					var3 = menuOptionsCount - 1;
					String var13;
					if (isItemSelected == 1 && menuOptionsCount < 2) {
						var13 = "Use" + " " + field545 + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) {
						var13 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						String var14;
						if (var3 < 0) {
							var14 = "";
						} else if (menuTargets[var3].length() > 0) {
							var14 = menuActions[var3] + " " + menuTargets[var3];
						} else {
							var14 = menuActions[var3];
						}

						var13 = var14;
					}

					if (menuOptionsCount > 2) {
						var13 = var13 + HttpAuthenticationHeader.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					WorldMapRenderer.fontBold12.drawRandomAlphaAndSpacing(var13, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			var1 = class156.menuX;
			var2 = Ignored.menuY;
			var3 = WorldMapLabelSize.menuWidth;
			var4 = ArchiveDiskActionHandler.menuHeight;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			WorldMapRenderer.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			var6 = MouseHandler.MouseHandler_x;
			int var7 = MouseHandler.MouseHandler_y;

			for (var8 = 0; var8 < menuOptionsCount; ++var8) {
				var9 = (menuOptionsCount - 1 - var8) * 15 + var2 + 31;
				int var10 = 16777215;
				if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				Font var11 = WorldMapRenderer.fontBold12;
				String var12;
				if (var8 < 0) {
					var12 = "";
				} else if (menuTargets[var8].length() > 0) {
					var12 = menuActions[var8] + " " + menuTargets[var8];
				} else {
					var12 = menuActions[var8];
				}

				var11.draw(var12, var1 + 3, var9, var10, 0);
			}

			Canvas.method310(class156.menuX, Ignored.menuY, WorldMapLabelSize.menuWidth, ArchiveDiskActionHandler.menuHeight);
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field757[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field746[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = class358.topLevelWorldView.plane;
		var2 = class17.localPlayer.x;
		var3 = class17.localPlayer.y;
		var4 = graphicsCycle;

		for (ObjectSound var21 = (ObjectSound)ObjectSound.objectSounds.last(); var21 != null; var21 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var21.soundEffectId != -1 || var21.soundEffectIds != null) {
				var6 = 0;
				if (var2 > var21.maxX * 16384) {
					var6 += var2 - var21.maxX * 16384;
				} else if (var2 < var21.x * 16384) {
					var6 += var21.x * 16384 - var2;
				}

				if (var3 > var21.maxY * 128) {
					var6 += var3 - var21.maxY * 128;
				} else if (var3 < var21.y * 16384) {
					var6 += var21.y * 16384 - var3;
				}

				var6 = Math.max(var6 - 64, 0);
				if (var6 < var21.field859 && class459.clientPreferences.getAreaSoundEffectsVolume() != 0 && var1 == var21.plane) {
					float var17 = var21.field858 < var21.field859 ? Math.min(Math.max((float)(var21.field859 - var6) / (float)(var21.field859 - var21.field858), 0.0F), 1.0F) : 1.0F;
					var8 = (int)(var17 * (float)class459.clientPreferences.getAreaSoundEffectsVolume());
					Object var10000;
					if (var21.stream1 == null) {
						if (var21.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var15 = SoundEffect.readSoundEffect(class135.field1637, var21.soundEffectId, 0);
							if (var15 != null) {
								RawSound var16 = var15.toRawSound().resample(HealthBar.decimator);
								RawPcmStream var18 = RawPcmStream.createRawPcmStream(var16, 100, var8);
								var18.setNumLoops(-1);
								class349.pcmStreamMixer.addSubStream(var18);
								var21.stream1 = var18;
							}
						}
					} else {
						var21.stream1.method898(var8);
					}

					if (var21.stream2 == null) {
						if (var21.soundEffectIds != null && (var21.field870 -= var4) <= 0) {
							var9 = (int)(Math.random() * (double)var21.soundEffectIds.length);
							var10000 = null;
							SoundEffect var22 = SoundEffect.readSoundEffect(class135.field1637, var21.soundEffectIds[var9], 0);
							if (var22 != null) {
								RawSound var19 = var22.toRawSound().resample(HealthBar.decimator);
								RawPcmStream var20 = RawPcmStream.createRawPcmStream(var19, 100, var8);
								var20.setNumLoops(0);
								class349.pcmStreamMixer.addSubStream(var20);
								var21.stream2 = var20;
								var21.field870 = var21.field867 + (int)(Math.random() * (double)(var21.field868 - var21.field867));
							}
						}
					} else {
						var21.stream2.method898(var8);
						if (!var21.stream2.hasNext()) {
							var21.stream2 = null;
						}
					}
				} else {
					if (var21.stream1 != null) {
						class349.pcmStreamMixer.removeSubStream(var21.stream1);
						var21.stream1 = null;
					}

					if (var21.stream2 != null) {
						class349.pcmStreamMixer.removeSubStream(var21.stream2);
						var21.stream2 = null;
					}
				}
			}
		}

		graphicsCycle = 0;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Lel;IB)Z",
		garbageValue = "-52"
	)
	boolean method1291(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			class108.friendsChat = null;
		} else {
			if (class108.friendsChat == null) {
				class108.friendsChat = new FriendsChat(class236.loginType, class188.client);
			}

			class108.friendsChat.method8546(var1.packetBuffer, var2);
		}

		field730 = cycleCntr;
		class285.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Lel;B)Z",
		garbageValue = "2"
	)
	boolean method1279(PacketWriter var1) {
		if (class108.friendsChat != null) {
			class108.friendsChat.method8547(var1.packetBuffer);
		}

		field730 = cycleCntr;
		class285.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)Z",
		garbageValue = "330526201"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var21;
			String var24;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1471) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1470 = 0;
						var1.field1471 = false;
					}

					var3.offset = 0;
					if (var3.method9602()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1470 = 0;
					}

					var1.field1471 = true;
					ServerPacket[] var4 = class30.ServerPacket_values();
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
				var1.field1470 = 0;
				timer.method8390();
				var1.field1476 = var1.field1475;
				var1.field1475 = var1.field1474;
				var1.field1474 = var1.serverPacket;
				int var20;
				Widget var56;
				if (ServerPacket.field3435 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntLE();
					var56 = AsyncRestClient.widgetDefinition.method6536(var5);
					if (var56.modelType != 2 || var20 != var56.modelId) {
						var56.modelType = 2;
						var56.modelId = var20;
						class324.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3466 == var1.serverPacket) {
					field794 = false;
					isCameraLocked = false;
					field788 = false;
					field789 = false;
					class315.field3269 = 0;
					class284.field3133 = 0;
					UserComparator7.field1502 = 0;
					field790 = false;
					Varcs.field1450 = 0;
					GameObject.field3031 = 0;
					Huffman.field3967 = 0;
					UserComparator7.field1505 = 0;
					class76.field938 = 0;
					Varps.field3707 = 0;
					class459.field4880 = 0;
					field791 = null;
					field793 = null;
					field792 = null;

					for (var20 = 0; var20 < 5; ++var20) {
						field598[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3430 == var1.serverPacket) {
					if (rootInterface != -1) {
						SecureUrlRequester.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3521 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					this.method492(false);
					if (var20 == 0) {
						Interpreter.field899 = class358.topLevelWorldView.players[var5];
					} else if (var20 == 1) {
						Interpreter.field899 = class358.topLevelWorldView.npcs[var5];
					} else if (var20 == 2) {
						Interpreter.field899 = class358.topLevelWorldView.worldEntities[var5];
						this.method492(true);
					}

					if (Interpreter.field899 == null) {
						Interpreter.field899 = class17.localPlayer;
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var95;
				if (ServerPacket.field3482 == var1.serverPacket) {
					var95 = var3.readUnsignedByteSub() == 1;
					var5 = var3.readUnsignedIntIME();
					var56 = AsyncRestClient.widgetDefinition.method6536(var5);
					Message.method1187(var56, class17.localPlayer.appearance, var95);
					class324.invalidateWidget(var56);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3493 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != revision) {
						revision = var20;
						class105.method2750();
					}

					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var8;
				if (ServerPacket.field3486 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAdd();
					var21 = var3.readUnsignedShort();
					var8 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShortLE();
					var7 = var3.readUnsignedShortAddLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					ArrayList var58 = new ArrayList();
					var58.add(var20);
					Canvas.method307(var58, var5, var21, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				int var10;
				int var11;
				int var12;
				int var22;
				boolean var61;
				boolean var63;
				if (ServerPacket.field3489 == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field788 = true;
					class76.field938 = var3.readUnsignedByte() * 128;
					Varps.field3707 = var3.readUnsignedByte() * 128;
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte() * 128 + 64;
					var21 = var3.readUnsignedByte() * 128 + 64;
					var7 = var3.readUnsignedShort();
					field790 = var3.readBoolean();
					var8 = var3.readUnsignedByte();
					var22 = class76.field938 * 16384 + 64;
					var10 = Varps.field3707 * 16384 + 64;
					var61 = false;
					var63 = false;
					if (field790) {
						var11 = class171.cameraY;
						var12 = SoundSystem.getTileHeight(class358.topLevelWorldView, var22, var10, class358.topLevelWorldView.plane) - var20;
					} else {
						var11 = SoundSystem.getTileHeight(class358.topLevelWorldView, PlayerComposition.cameraX, UserComparator4.cameraZ, class358.topLevelWorldView.plane) - class171.cameraY;
						var12 = var20;
					}

					field791 = new class507(PlayerComposition.cameraX, UserComparator4.cameraZ, var11, var22, var10, var12, var5, var21, var7, var8);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3476 == var1.serverPacket) {
					class33.friendSystem.method1888();
					field729 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				byte var66;
				int var67;
				int var68;
				byte var89;
				if (ServerPacket.field3402 == var1.serverPacket) {
					var17 = var3.readUnsignedByte();
					var67 = var3.readUnsignedByteSub() * 4;
					var12 = var3.readUnsignedShortAdd();
					var89 = var3.readByteAdd();
					var11 = var3.method9651();
					var21 = var3.method9838();
					var20 = var21 >> 16;
					var5 = var21 >> 8 & 255;
					var7 = var20 + (var21 >> 4 & 7);
					var8 = var5 + (var21 & 7);
					var15 = var3.readUnsignedShortLE();
					var68 = var3.readUnsignedByte() * 4;
					var16 = var3.readUnsignedShort();
					var66 = var3.readByteSub();
					var18 = var3.readUnsignedByteSub();
					var22 = var89 + var7;
					var10 = var66 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < ModeWhere.worldView.sizeX && var8 < ModeWhere.worldView.sizeY && var22 >= 0 && var10 >= 0 && var22 < ModeWhere.worldView.sizeX && var10 < ModeWhere.worldView.sizeY && var12 != 65535) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						var22 = var22 * 128 + 64;
						var10 = var10 * 128 + 64;
						var19 = new Projectile(var12, ModeWhere.worldView.plane, var7, var8, SoundSystem.getTileHeight(ModeWhere.worldView, var7, var8, ModeWhere.worldView.plane) - var67, var15 + cycle, var16 + cycle, var17, var18, var11, var68);
						var19.setDestination(var22, var10, SoundSystem.getTileHeight(ModeWhere.worldView, var22, var10, ModeWhere.worldView.plane) - var68, var15 + cycle);
						ModeWhere.worldView.projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3501 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var21 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field598[var20] = true;
					field744[var20] = var5;
					field714[var20] = var21;
					field798[var20] = var7;
					field709[var20] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3479 == var1.serverPacket) {
					var5 = var3.readUnsignedShortLE();
					var20 = var3.readUnsignedShort();
					var21 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedShortAdd();
					FloorUnderlayDefinition.method4067(var20, var5, var21, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3495 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var21 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var82 = ModeWhere.worldView.npcs[var20];
					if (var82 != null) {
						if (var5 == var82.sequence && var5 != -1) {
							var8 = FaceNormal.SequenceDefinition_get(var5).restartMode;
							if (var8 == 1) {
								var82.sequenceFrame = 0;
								var82.sequenceFrameCycle = 0;
								var82.sequenceDelay = var21;
								var82.field1239 = 0;
							} else if (var8 == 2) {
								var82.field1239 = 0;
							}
						} else if (var5 == -1 || var82.sequence == -1 || FaceNormal.SequenceDefinition_get(var5).field2409 >= FaceNormal.SequenceDefinition_get(var82.sequence).field2409) {
							var82.sequence = var5;
							var82.sequenceFrame = 0;
							var82.sequenceFrameCycle = 0;
							var82.sequenceDelay = var21;
							var82.field1239 = 0;
							var82.field1226 = var82.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				String var52;
				if (ServerPacket.field3418 == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var24 = AbstractFont.escapeBrackets(class370.method7126(class323.method6188(var3)));
					UrlRequest.addGameMessage(6, var52, var24);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3518 == var1.serverPacket) {
					var95 = var3.readUnsignedByte() == 1;
					if (var95) {
						VarcInt.field2038 = class129.method3033() - var3.readLong();
						class160.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class160.grandExchangeEvents = null;
					}

					field651 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var72;
				if (ServerPacket.field3459 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readInt();
					var21 = var3.readUnsignedShortLE();
					if (var21 == 65535) {
						var21 = -1;
					}

					var72 = AsyncRestClient.widgetDefinition.method6536(var5);
					ItemComposition var93;
					if (!var72.isIf3) {
						if (var21 == -1) {
							var72.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var93 = KeyHandler.ItemDefinition_get(var21).getCountObj(var20);
						var72.modelType = 4;
						var72.modelId = var21;
						var72.modelAngleX = var93.xan2d;
						var72.modelAngleY = var93.yan2d;
						var72.modelZoom = var93.zoom2d * 100 / var20;
						class324.invalidateWidget(var72);
					} else {
						var72.itemId = var21;
						var72.itemQuantity = var20;
						var93 = KeyHandler.ItemDefinition_get(var21).getCountObj(var20);
						var72.modelAngleX = var93.xan2d;
						var72.modelAngleY = var93.yan2d;
						var72.modelAngleZ = var93.zan2d;
						var72.modelOffsetX = var93.offsetX2d;
						var72.modelOffsetY = var93.offsetY2d;
						var72.modelZoom = var93.zoom2d;
						if (var93.isStackable == 1) {
							var72.itemQuantityMode = 1;
						} else {
							var72.itemQuantityMode = 2;
						}

						if (var72.field3871 > 0) {
							var72.modelZoom = var72.modelZoom * 32 / var72.field3871;
						} else if (var72.rawWidth > 0) {
							var72.modelZoom = var72.modelZoom * 32 / var72.rawWidth;
						}

						class324.invalidateWidget(var72);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3455 == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field789 = true;
					var20 = var3.readShort();
					var5 = var3.readShort();
					var21 = class284.method5844(var5 + Actor.cameraPitch & 2027);
					var7 = var20 + class206.cameraYaw;
					var8 = var3.readUnsignedShort();
					var22 = var3.readUnsignedByte();
					field793 = new class509(Actor.cameraPitch, var21, var8, var22);
					field792 = new class509(class206.cameraYaw, var7, var8, var22);
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var23;
				long var27;
				if (ServerPacket.field3445 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var21 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1798(false);
						TaskHandler.method3581(rootInterface);
						class7.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var87;
					for (; var21-- > 0; var87.field1091 = true) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var22 = var3.readUnsignedByte();
						var87 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var87 != null && var8 != var87.group) {
							MouseHandler.closeInterface(var87, true);
							var87 = null;
						}

						if (var87 == null) {
							var87 = WorldMapLabelSize.openInterface(var7, var8, var22);
						}
					}

					for (var23 = (InterfaceParent)interfaceParents.first(); var23 != null; var23 = (InterfaceParent)interfaceParents.next()) {
						if (var23.field1091) {
							var23.field1091 = false;
						} else {
							MouseHandler.closeInterface(var23, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var20) {
						var7 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var22 = var3.readUnsignedShort();
						var10 = var3.readInt();

						for (var11 = var8; var11 <= var22; ++var11) {
							var27 = (long)var11 + ((long)var7 << 32);
							widgetFlags.put(new IntegerNode(var10), var27);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				String var55;
				if (ServerPacket.field3524 == var1.serverPacket) {
					var20 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedByteAdd();
					var55 = var3.readStringCp1252NullTerminated();
					if (var20 >= 1 && var20 <= 8) {
						if (var55.equalsIgnoreCase("null")) {
							var55 = null;
						}

						playerMenuActions[var20 - 1] = var55;
						playerOptionsPriorities[var20 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				byte var70;
				if (ServerPacket.field3496 == var1.serverPacket) {
					GrandExchangeEvents.method7359();
					var70 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var70 >= 0) {
							currentClanSettings[var70] = null;
						} else {
							KitDefinition.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var70 >= 0) {
						currentClanSettings[var70] = new ClanSettings(var3);
					} else {
						KitDefinition.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3470 == var1.serverPacket) {
					var95 = var3.readBoolean();
					if (var95) {
						if (Decimator.field413 == null) {
							Decimator.field413 = new class397();
						}
					} else {
						Decimator.field413 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3460 == var1.serverPacket) {
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

				if (ServerPacket.field3403 == var1.serverPacket) {
					var11 = var3.method9707();
					var12 = var3.readUnsignedShortAdd();
					var66 = var3.readByteAdd();
					var17 = var3.readUnsignedByteSub();
					var18 = var3.readUnsignedShortLE();
					var89 = var3.readByteSub();
					var68 = var3.readUnsignedByteNeg() * 4;
					var16 = var3.readUnsignedShortLE();
					var67 = var3.readUnsignedByteAdd() * 4;
					var15 = var3.readUnsignedShortAddLE();
					var21 = var3.method9864();
					var20 = var21 >> 16;
					var5 = var21 >> 8 & 255;
					var7 = var20 + (var21 >> 4 & 7);
					var8 = var5 + (var21 & 7);
					var22 = var89 + var7;
					var10 = var66 + var8;
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var22 >= 0 && var10 >= 0 && var22 < 104 && var10 < 104 && var12 != 65535) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						var22 = var22 * 128 + 64;
						var10 = var10 * 128 + 64;
						var19 = new Projectile(var12, ModeWhere.worldView.plane, var7, var8, SoundSystem.getTileHeight(ModeWhere.worldView, var7, var8, ModeWhere.worldView.plane) - var67, var15 + cycle, var16 + cycle, var17, var18, var11, var68);
						var19.setDestination(var22, var10, SoundSystem.getTileHeight(ModeWhere.worldView, var22, var10, ModeWhere.worldView.plane) - var68, var15 + cycle);
						ModeWhere.worldView.projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3464 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					rootInterface = var20;
					this.method1798(false);
					TaskHandler.method3581(var20);
					class7.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3480 == var1.serverPacket) {
					KitDefinition.method3899(class319.field3382);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3478 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readShort();
					var21 = var3.readShortLE();
					var72 = AsyncRestClient.widgetDefinition.method6536(var20);
					if (var5 != var72.rawX || var21 != var72.rawY || var72.xAlignment != 0 || var72.yAlignment != 0) {
						var72.rawX = var5;
						var72.rawY = var21;
						var72.xAlignment = 0;
						var72.yAlignment = 0;
						class324.invalidateWidget(var72);
						this.alignWidget(var72);
						if (var72.type == 0) {
							class148.revalidateWidgetScroll(AsyncRestClient.widgetDefinition.Widget_interfaceComponents[var20 >> 16], var72, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3444 == var1.serverPacket) {
					MouseHandler.field242 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3424 == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAddLE() * 30;
					field735 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3409 == var1.serverPacket) {
					if (MouseHandler.field242 == null) {
						MouseHandler.field242 = new class485(ApproximateRouteStrategy.field491);
					}

					class554 var54 = ApproximateRouteStrategy.field491.method8901(var3);
					MouseHandler.field242.field5008.vmethod9377(var54.field5408, var54.field5410);
					field706[++field727 - 1 & 31] = var54.field5408;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3427 == var1.serverPacket) {
					KitDefinition.method3899(class319.field3383);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3443 == var1.serverPacket) {
					for (var20 = 0; var20 < VarpDefinition.field2003; ++var20) {
						VarpDefinition var92 = class249.VarpDefinition_get(var20);
						if (var92 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}

					LoginScreenAnimation.method2501();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3507 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedByteAdd();
					var56 = AsyncRestClient.widgetDefinition.method6536(var20);
					JagNetThread.method7358(var56, class17.localPlayer.appearance.gender, var5);
					class324.invalidateWidget(var56);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3506 == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field788 = false;
					class76.field938 = var3.readUnsignedByte() * 128;
					Varps.field3707 = var3.readUnsignedByte() * 128;
					class459.field4880 = var3.readUnsignedShort();
					UserComparator7.field1505 = var3.readUnsignedByte();
					Huffman.field3967 = var3.readUnsignedByte();
					if (Huffman.field3967 >= 100) {
						PlayerComposition.cameraX = class76.field938 * 16384 + 64;
						UserComparator4.cameraZ = Varps.field3707 * 16384 + 64;
						class171.cameraY = SoundSystem.getTileHeight(class358.topLevelWorldView, PlayerComposition.cameraX, UserComparator4.cameraZ, class358.topLevelWorldView.plane) - class459.field4880;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3522 == var1.serverPacket) {
					return this.method1291(var1, 2);
				}

				if (ServerPacket.field3494 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readSignedShort();
					var56 = AsyncRestClient.widgetDefinition.method6536(var20);
					if (var5 != var56.sequenceId || var5 == -1) {
						var56.sequenceId = var5;
						var56.modelFrame = 0;
						var56.modelFrameCycle = 0;
						class324.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3428 == var1.serverPacket) {
					KitDefinition.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3437 == var1.serverPacket) {
					ModeWhere.worldView.playerUpdateManager.method2777(var3, var1.serverPacketLength);
					PlayerCompositionColorTextureOverride.method3777();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3467 == var1.serverPacket) {
					KitDefinition.method3899(class319.field3378);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3457 == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntME();
					var56 = AsyncRestClient.widgetDefinition.method6536(var5);
					Player.method2383(var56, var20);
					class324.invalidateWidget(var56);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3434 == var1.serverPacket) {
					var21 = var3.method9522();
					var20 = var21 >> 16;
					var5 = var21 >> 8 & 255;
					var7 = var20 + (var21 >> 4 & 7);
					var8 = var5 + (var21 & 7);
					var11 = var3.readUnsignedShortAddLE();
					var10 = var3.readUnsignedByteSub();
					var22 = var3.readUnsignedShortLE();
					if (var7 >= 0 && var8 >= 0 && var7 < ModeWhere.worldView.sizeX && var8 < ModeWhere.worldView.sizeY) {
						var7 = var7 * 128 + 64;
						var8 = var8 * 128 + 64;
						GraphicsObject var94 = new GraphicsObject(var22, ModeWhere.worldView.plane, var7, var8, SoundSystem.getTileHeight(ModeWhere.worldView, var7, var8, ModeWhere.worldView.plane) - var10, var11, cycle);
						ModeWhere.worldView.graphicsObjects.addFirst(var94);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3509 == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field788 = true;
					class76.field938 = var3.readUnsignedByte() * 128;
					Varps.field3707 = var3.readUnsignedByte() * 128;
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field790 = var3.readBoolean();
					var21 = var3.readUnsignedByte();
					var7 = class76.field938 * 16384 + 64;
					var8 = Varps.field3707 * 16384 + 64;
					boolean var79 = false;
					boolean var62 = false;
					if (field790) {
						var22 = class171.cameraY;
						var10 = SoundSystem.getTileHeight(class358.topLevelWorldView, var7, var8, class358.topLevelWorldView.plane) - var20;
					} else {
						var22 = SoundSystem.getTileHeight(class358.topLevelWorldView, PlayerComposition.cameraX, UserComparator4.cameraZ, class358.topLevelWorldView.plane) - class171.cameraY;
						var10 = var20;
					}

					field791 = new class508(PlayerComposition.cameraX, UserComparator4.cameraZ, var22, var7, var8, var10, var5, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3488 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var20] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false);
					}

					field733 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3420 == var1.serverPacket) {
					LoginScreenAnimation.method2501();
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedIntIME();
					var21 = var3.readUnsignedByteAdd();
					var7 = var3.readUnsignedByteAdd();
					experience[var7] = var5;
					currentLevels[var7] = var21;
					levels[var7] = 1;
					field669[var7] = var20;

					for (var8 = 0; var8 < 98; ++var8) {
						if (var5 >= Skills.Skills_experienceTable[var8]) {
							levels[var7] = var8 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var7;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3528 == var1.serverPacket) {
					ModeWhere.worldView.npcCount = 0;
					ModeWhere.worldView.worldEntityCount = 0;

					for (var20 = 0; var20 < 65536; ++var20) {
						ModeWhere.worldView.npcs[var20] = null;
					}

					for (var20 = 0; var20 < 2048; ++var20) {
						ModeWhere.worldView.worldEntities[var20] = null;
					}

					class17.localPlayer.worldView = class358.topLevelWorldView;
					var1.serverPacket = null;
					return true;
				}

				Widget var77;
				if (ServerPacket.field3417 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedIntLE();
					InterfaceParent var65 = (InterfaceParent)interfaceParents.get((long)var5);
					var23 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var23 != null) {
						MouseHandler.closeInterface(var23, var65 == null || var65.group != var23.group);
					}

					if (var65 != null) {
						var65.remove();
						interfaceParents.put(var65, (long)var20);
					}

					var77 = AsyncRestClient.widgetDefinition.method6536(var5);
					if (var77 != null) {
						class324.invalidateWidget(var77);
					}

					var77 = AsyncRestClient.widgetDefinition.method6536(var20);
					if (var77 != null) {
						class324.invalidateWidget(var77);
						class148.revalidateWidgetScroll(AsyncRestClient.widgetDefinition.Widget_interfaceComponents[var77.id >>> 16], var77, true);
					}

					if (rootInterface != -1) {
						SecureUrlRequester.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3505 == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							ClanChannelMember.changeGameOptions(var20);
							changedVarps[++changedVarpCount - 1 & 31] = var20;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				long var30;
				long var32;
				String var36;
				if (ServerPacket.field3423 == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var30 = (long)var3.readUnsignedShort();
					var32 = (long)var3.readMedium();
					PlayerType var9 = (PlayerType)MenuAction.findEnumerated(class108.PlayerType_values(), var3.readUnsignedByte());
					long var34 = var32 + (var30 << 32);
					var63 = false;

					for (var67 = 0; var67 < 100; ++var67) {
						if (var34 == crossWorldMessageIds[var67]) {
							var63 = true;
							break;
						}
					}

					if (class33.friendSystem.isIgnored(new Username(var52, class236.loginType))) {
						var63 = true;
					}

					if (!var63 && field650 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var36 = AbstractFont.escapeBrackets(class370.method7126(class323.method6188(var3)));
						byte var69;
						if (var9.isPrivileged) {
							var69 = 7;
						} else {
							var69 = 3;
						}

						if (var9.modIcon != -1) {
							UrlRequest.addGameMessage(var69, class322.method6186(var9.modIcon) + var52, var36);
						} else {
							UrlRequest.addGameMessage(var69, var52, var36);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3415 == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field789 = true;
					class315.field3269 = var3.readUnsignedByte() * 128;
					class284.field3133 = var3.readUnsignedByte() * 128;
					UserComparator7.field1502 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var21 = class315.field3269 * 16384 + 64;
					var7 = class284.field3133 * 16384 + 64;
					var8 = SoundSystem.getTileHeight(class358.topLevelWorldView, var21, var7, class358.topLevelWorldView.plane) - UserComparator7.field1502;
					var22 = var21 - PlayerComposition.cameraX;
					var10 = var8 - class171.cameraY;
					var11 = var7 - UserComparator4.cameraZ;
					double var90 = Math.sqrt((double)(var11 * var11 + var22 * var22));
					var68 = class284.method5844((int)(Math.atan2((double)var10, var90) * 325.9490051269531D) & 2047);
					var15 = class13.method166((int)(Math.atan2((double)var22, (double)var11) * -325.9490051269531D) & 2047);
					field793 = new class509(Actor.cameraPitch, var68, var20, var5);
					field792 = new class509(class206.cameraYaw, var15, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3492 == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var91 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var91 != null) {
						MouseHandler.closeInterface(var91, true);
					}

					if (meslayerContinueWidget != null) {
						class324.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3525 == var1.serverPacket) {
					PcmPlayer.field296 = var3.readUnsignedByte();
					class130.field1562 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3529 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					Player var83;
					if (var20 == localPlayerIndex) {
						var83 = class17.localPlayer;
					} else {
						var83 = ModeWhere.worldView.players[var20];
					}

					var5 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedByte();
					var21 = var3.readUnsignedIntME();
					if (var83 != null) {
						var83.updateSpotAnimation(var7, var5, var21 >> 16, var21 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3410 == var1.serverPacket) {
					GrandExchangeEvents.method7359();
					var70 = var3.readByte();
					class150 var88 = new class150(var3);
					ClanSettings var64;
					if (var70 >= 0) {
						var64 = currentClanSettings[var70];
					} else {
						var64 = KitDefinition.guestClanSettings;
					}

					if (var64 == null) {
						this.method1263(var70);
						var1.serverPacket = null;
						return true;
					}

					if (var88.field1706 > var64.field1763) {
						this.method1263(var70);
						var1.serverPacket = null;
						return true;
					}

					if (var88.field1706 < var64.field1763) {
						var1.serverPacket = null;
						return true;
					}

					var88.method3261(var64);
					var1.serverPacket = null;
					return true;
				}

				long var37;
				if (ServerPacket.field3421 == var1.serverPacket) {
					var70 = var3.readByte();
					var30 = (long)var3.readUnsignedShort();
					var32 = (long)var3.readMedium();
					var37 = (var30 << 32) + var32;
					var61 = false;
					ClanChannel var29 = var70 >= 0 ? currentClanChannels[var70] : Language.guestClanChannel;
					if (var29 == null) {
						var61 = true;
					} else {
						for (var67 = 0; var67 < 100; ++var67) {
							if (crossWorldMessageIds[var67] == var37) {
								var61 = true;
								break;
							}
						}
					}

					if (!var61) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var37;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var36 = class323.method6188(var3);
						var68 = var70 >= 0 ? 43 : 46;
						class497.addChatMessage(var68, "", var36, var29.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3514 == var1.serverPacket) {
					return this.method1291(var1, 1);
				}

				if (ServerPacket.field3400 == var1.serverPacket) {
					byte[] var53 = new byte[var1.serverPacketLength];
					var3.method9594(var53, 0, var53.length);
					Buffer var85 = new Buffer(var53);
					var55 = var85.readStringCp1252NullTerminated();
					class379.openURL(var55, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3449 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					ActorSpotAnim.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3468 == var1.serverPacket) {
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedIntIME();
					var21 = var3.readUnsignedByteNeg();
					var72 = AsyncRestClient.widgetDefinition.method6536(var5);
					RouteStrategy.method4504(var72, var20, var21);
					class324.invalidateWidget(var72);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3473 == var1.serverPacket) {
					class33.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field729 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3436 == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field789 = true;
					var20 = class13.method166(var3.readShort() & 2027);
					var5 = class284.method5844(var3.readShort() & 2027);
					var21 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field793 = new class509(Actor.cameraPitch, var5, var21, var7);
					field792 = new class509(class206.cameraYaw, var20, var21, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3485 == var1.serverPacket) {
					tradeChatMode = var3.readUnsignedByteAdd();
					publicChatMode = var3.readUnsignedByteAdd();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3463 == var1.serverPacket) {
					WorldMap.privateChatMode = class104.method2727(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3450 == var1.serverPacket) {
					var70 = var3.readByte();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var70;
					if (Varps.Varps_main[var5] != var70) {
						Varps.Varps_main[var5] = var70;
					}

					ClanChannelMember.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3441 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var56 = AsyncRestClient.widgetDefinition.method6536(var20);
					} else {
						var56 = null;
					}

					if (var56 != null) {
						for (var7 = 0; var7 < var56.itemIds.length; ++var7) {
							var56.itemIds[var7] = 0;
							var56.itemQuantities[var7] = 0;
						}
					}

					HttpResponse.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var7; ++var8) {
						var22 = var3.readUnsignedShortAddLE();
						var10 = var3.readUnsignedByteNeg();
						if (var10 == 255) {
							var10 = var3.readUnsignedIntIME();
						}

						if (var56 != null && var8 < var56.itemIds.length) {
							var56.itemIds[var8] = var22;
							var56.itemQuantities[var8] = var10;
						}

						ItemComposition.itemContainerSetItem(var5, var8, var22 - 1, var10);
					}

					if (var56 != null) {
						class324.invalidateWidget(var56);
					}

					LoginScreenAnimation.method2501();
					changedItemContainers[++field723 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3413 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var21 = var3.readUnsignedShort();
					class453.queueSoundEffect(var20, var5, var21);
					var1.serverPacket = null;
					return true;
				}

				String var40;
				if (ServerPacket.field3452 == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var30 = var3.readLong();
					var32 = (long)var3.readUnsignedShort();
					var37 = (long)var3.readMedium();
					PlayerType var96 = (PlayerType)MenuAction.findEnumerated(class108.PlayerType_values(), var3.readUnsignedByte());
					var27 = (var32 << 32) + var37;
					boolean var14 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var27) {
							var14 = true;
							break;
						}
					}

					if (var96.isUser && class33.friendSystem.isIgnored(new Username(var52, class236.loginType))) {
						var14 = true;
					}

					if (!var14 && field650 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var27;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(class370.method7126(class323.method6188(var3)));
						if (var96.modIcon != -1) {
							class497.addChatMessage(9, class322.method6186(var96.modIcon) + var52, var40, class165.base37DecodeLong(var30));
						} else {
							class497.addChatMessage(9, var52, var40, class165.base37DecodeLong(var30));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3508 == var1.serverPacket) {
					KitDefinition.method3899(class319.field3385);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3411 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					WorldMapData_1.method5808(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3429 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var56 = AsyncRestClient.widgetDefinition.method6536(var20);
					} else {
						var56 = null;
					}

					for (; var3.offset < var1.serverPacketLength; ItemComposition.itemContainerSetItem(var5, var7, var8 - 1, var22)) {
						var7 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var22 = 0;
						if (var8 != 0) {
							var22 = var3.readUnsignedByte();
							if (var22 == 255) {
								var22 = var3.readInt();
							}
						}

						if (var56 != null && var7 >= 0 && var7 < var56.itemIds.length) {
							var56.itemIds[var7] = var8;
							var56.itemQuantities[var7] = var22;
						}
					}

					if (var56 != null) {
						class324.invalidateWidget(var56);
					}

					LoginScreenAnimation.method2501();
					changedItemContainers[++field723 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3517 == var1.serverPacket) {
					var22 = var3.readUnsignedByte();
					var10 = var22 >> 2;
					var11 = var22 & 3;
					var12 = field604[var10];
					var67 = var3.readUnsignedShortLE();
					var21 = var3.method9864();
					var20 = var21 >> 16;
					var5 = var21 >> 8 & 255;
					var7 = var20 + (var21 >> 4 & 7);
					var8 = var5 + (var21 & 7);
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
						FontName.method9301(var7, var8, var10, var11, var12, var67);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3487 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readInt();
					var56 = AsyncRestClient.widgetDefinition.method6536(var5);
					if (var56.modelType != 6 || var20 != var56.modelId) {
						var56.modelType = 6;
						var56.modelId = var20;
						class324.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				NPC var25;
				if (ServerPacket.field3515 == var1.serverPacket) {
					var5 = var3.readUnsignedIntLE();
					var7 = var3.readUnsignedByteNeg();
					var20 = var3.readUnsignedShortAddLE();
					var25 = ModeWhere.worldView.npcs[var20];
					var21 = var3.readUnsignedShort();
					if (var25 != null) {
						var25.updateSpotAnimation(var7, var21, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3497 == var1.serverPacket) {
					class424.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3412 == var1.serverPacket) {
					var95 = var3.readUnsignedByteNeg() == 1;
					var5 = var3.readInt();
					var56 = AsyncRestClient.widgetDefinition.method6536(var5);
					if (var95 != var56.isHidden) {
						var56.isHidden = var95;
						class324.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3484 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					KeyHandler.playSong(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3511 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.method9864();
					class27.method414(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3499 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntLE();
					var56 = AsyncRestClient.widgetDefinition.method6536(var5);
					if (var56.modelType != 1 || var20 != var56.modelId) {
						var56.modelType = 1;
						var56.modelId = var20;
						class324.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var76;
				if (ServerPacket.field3491 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var76 = AsyncRestClient.widgetDefinition.method6536(var20);
					var76.modelType = 3;
					var76.modelId = class17.localPlayer.appearance.getChatHeadId();
					class324.invalidateWidget(var76);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3439 == var1.serverPacket) {
					ClientPreferences.updateNpcs(ModeWhere.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3510 == var1.serverPacket) {
					PlayerUpdateManager.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3451 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var21 = VarcInt.getGcDuration();
					PacketBufferNode var74 = WorldMapElement.getPacketBufferNode(ClientPacket.field3285, packetWriter.isaacCipher);
					var74.packetBuffer.writeByteNeg(GameEngine.fps);
					var74.packetBuffer.writeInt(var20);
					var74.packetBuffer.writeIntME(var5);
					var74.packetBuffer.writeByte(var21);
					packetWriter.addNode(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3442 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						Script.method2220(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3446 == var1.serverPacket) {
					KitDefinition.method3899(class319.field3375);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3419 == var1.serverPacket) {
					LoginScreenAnimation.method2501();
					weight = var3.readShort();
					field735 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3516 == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					Object[] var81 = new Object[var52.length() + 1];

					for (var21 = var52.length() - 1; var21 >= 0; --var21) {
						if (var52.charAt(var21) == 's') {
							var81[var21 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var81[var21 + 1] = new Integer(var3.readInt());
						}
					}

					var81[0] = new Integer(var3.readInt());
					ScriptEvent var57 = new ScriptEvent();
					var57.args = var81;
					class371.runScriptEvent(var57);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3461 == var1.serverPacket) {
					class424.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3527 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntLE();
					var21 = var3.readUnsignedShort();
					var72 = AsyncRestClient.widgetDefinition.method6536(var5);
					var72.field3872 = var21 + (var20 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3440 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					FriendsChat.method8575(var20);
					changedItemContainers[++field723 - 1 & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3490 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var21 = var3.readUnsignedByte();
					if (var20 == 0) {
						class358.topLevelWorldView.plane = var21;
						ModeWhere.worldView = class358.topLevelWorldView;
					} else {
						if (var20 != 1) {
							throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
						}

						WorldEntity var71 = class358.topLevelWorldView.worldEntities[var5];
						var71.worldView.plane = var21;
						ModeWhere.worldView = var71.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3438 == var1.serverPacket) {
					KitDefinition.method3899(class319.field3377);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3519 == var1.serverPacket && isCameraLocked) {
					field794 = true;
					field789 = false;
					field788 = false;

					for (var20 = 0; var20 < 5; ++var20) {
						field598[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3408 == var1.serverPacket) {
					KitDefinition.method3899(class319.field3380);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3475 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readInt();
					var56 = AsyncRestClient.widgetDefinition.method6536(var5);
					if (var56 != null && var56.type == 0) {
						if (var20 > var56.scrollHeight - var56.height) {
							var20 = var56.scrollHeight - var56.height;
						}

						if (var20 < 0) {
							var20 = 0;
						}

						if (var20 != var56.scrollY) {
							var56.scrollY = var20;
							class324.invalidateWidget(var56);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3531 == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedIntME();
					var56 = AsyncRestClient.widgetDefinition.method6536(var5);
					if (!var52.equals(var56.text)) {
						var56.text = var52;
						class324.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3472 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByteSub();
					if (var20 == 65535) {
						var20 = -1;
					}

					class162.performPlayerAnimation(class17.localPlayer, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3503 == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3526 == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					boolean var60 = var3.readUnsignedByte() == 1;
					var55 = "";
					boolean var59 = false;
					if (var60) {
						var55 = var3.readStringCp1252NullTerminated();
						if (class33.friendSystem.isIgnored(new Username(var55, class236.loginType))) {
							var59 = true;
						}
					}

					String var80 = var3.readStringCp1252NullTerminated();
					if (!var59) {
						UrlRequest.addGameMessage(var20, var55, var80);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3458 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortLE();
					var21 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var8 = var5 & 31;
					var22 = (var7 << 11) + (var21 << 19) + (var8 << 3);
					Widget var86 = AsyncRestClient.widgetDefinition.method6536(var20);
					if (var22 != var86.color) {
						var86.color = var22;
						class324.invalidateWidget(var86);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3520 == var1.serverPacket) {
					var70 = var3.readByte();
					var24 = var3.readStringCp1252NullTerminated();
					long var41 = (long)var3.readUnsignedShort();
					long var43 = (long)var3.readMedium();
					PlayerType var84 = (PlayerType)MenuAction.findEnumerated(class108.PlayerType_values(), var3.readUnsignedByte());
					long var45 = (var41 << 32) + var43;
					boolean var13 = false;
					ClanChannel var47 = null;
					var47 = var70 >= 0 ? currentClanChannels[var70] : Language.guestClanChannel;
					if (var47 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var84.isUser && class33.friendSystem.isIgnored(new Username(var24, class236.loginType))) {
									var13 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var45) {
								var13 = true;
								break;
							}

							++var15;
						}
					}

					if (!var13) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var45;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(class323.method6188(var3));
						var16 = var70 >= 0 ? 41 : 44;
						if (var84.modIcon != -1) {
							class497.addChatMessage(var16, class322.method6186(var84.modIcon) + var24, var40, var47.name);
						} else {
							class497.addChatMessage(var16, var24, var40, var47.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3456 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortAddLE();
					var21 = var3.readUnsignedShort();
					var7 = var3.readUnsignedIntIME();
					var77 = AsyncRestClient.widgetDefinition.method6536(var7);
					if (var21 != var77.modelAngleX || var5 != var77.modelAngleY || var20 != var77.modelZoom) {
						var77.modelAngleX = var21;
						var77.modelAngleY = var5;
						var77.modelZoom = var20;
						class324.invalidateWidget(var77);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3502 == var1.serverPacket) {
					var8 = var3.readUnsignedShortAddLE();
					var21 = var3.readUnsignedShortLE();
					var22 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					var7 = var3.readUnsignedShort();
					ArrayList var26 = new ArrayList();
					var26.add(var20);
					var26.add(var5);
					Canvas.method307(var26, var21, var7, var8, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3453 == var1.serverPacket) {
					DelayFadeTask.method8284(ModeWhere.worldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3471 == var1.serverPacket) {
					HttpRequestTask.field96 = var3.readUnsignedByteAdd();
					field753 = var3.readUnsignedByteSub();
					class323.field3544 = var3.readUnsignedByte();

					for (var20 = HttpRequestTask.field96; var20 < HttpRequestTask.field96 + 8; ++var20) {
						for (var5 = class323.field3544; var5 < class323.field3544 + 8; ++var5) {
							if (ModeWhere.worldView.groundItems[field753][var20][var5] != null) {
								ModeWhere.worldView.groundItems[field753][var20][var5] = null;
								class349.updateItemPile(field753, var20, var5);
							}
						}
					}

					for (PendingSpawn var51 = (PendingSpawn)ModeWhere.worldView.pendingSpawns.last(); var51 != null; var51 = (PendingSpawn)ModeWhere.worldView.pendingSpawns.previous()) {
						if (var51.x >= HttpRequestTask.field96 && var51.x < HttpRequestTask.field96 + 8 && var51.y >= class323.field3544 && var51.y < class323.field3544 + 8 && var51.plane == field753) {
							var51.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3474 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3422 == var1.serverPacket) {
					MouseHandler.field242 = new class485(ApproximateRouteStrategy.field491);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3404 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedByteAdd();
					short var73 = (short)var3.readSignedShort();
					var7 = var3.readInt();
					var25 = ModeWhere.worldView.npcs[var20];
					if (var25 != null) {
						var25.method2663(var5, var7, var73);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3425 == var1.serverPacket) {
					HttpRequestTask.field96 = var3.readUnsignedByteSub();
					class323.field3544 = var3.readUnsignedByteNeg();
					field753 = var3.readUnsignedByteAdd();

					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						class319 var78 = class28.method424()[var20];
						KitDefinition.method3899(var78);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3513 == var1.serverPacket) {
					ClientPreferences.updateNpcs(ModeWhere.worldView, true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3469 == var1.serverPacket) {
					class33.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					ItemContainer.FriendSystem_invalidateIgnoreds();
					field729 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3432 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var21 = var3.readUnsignedIntIME();
					var7 = var3.readUnsignedIntLE();

					for (var8 = var20; var8 <= var5; ++var8) {
						var37 = ((long)var7 << 32) + (long)var8;
						Node var39 = widgetFlags.get(var37);
						if (var39 != null) {
							var39.remove();
						}

						widgetFlags.put(new IntegerNode(var21), var37);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3414 == var1.serverPacket) {
					return this.method1279(var1);
				}

				if (ServerPacket.field3530 == var1.serverPacket) {
					field745 = cycleCntr;
					var70 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var70 >= 0) {
							currentClanChannels[var70] = null;
						} else {
							Language.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var70 >= 0) {
						currentClanChannels[var70] = new ClanChannel(var3);
					} else {
						Language.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3433 == var1.serverPacket) {
					KitDefinition.method3899(class319.field3387);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3401 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var76 = AsyncRestClient.widgetDefinition.method6536(var20);

					for (var21 = 0; var21 < var76.itemIds.length; ++var21) {
						var76.itemIds[var21] = -1;
						var76.itemIds[var21] = 0;
					}

					class324.invalidateWidget(var76);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3465 == var1.serverPacket) {
					LoginScreenAnimation.method2501();
					runEnergy = var3.readUnsignedShort();
					field735 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3462 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAddLE();
					var20 = var3.readUnsignedShortAdd();
					Skills.method7123(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3431 == var1.serverPacket) {
					KitDefinition.method3899(class319.field3388);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3448 == var1.serverPacket) {
					Messages.method2875(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3406 == var1.serverPacket) {
					field745 = cycleCntr;
					var70 = var3.readByte();
					class164 var75 = new class164(var3);
					ClanChannel var6;
					if (var70 >= 0) {
						var6 = currentClanChannels[var70];
					} else {
						var6 = Language.guestClanChannel;
					}

					if (var6 == null) {
						this.method1262(var70);
						var1.serverPacket = null;
						return true;
					}

					if (var75.field1806 > var6.field1826) {
						this.method1262(var70);
						var1.serverPacket = null;
						return true;
					}

					if (var75.field1806 < var6.field1826) {
						var1.serverPacket = null;
						return true;
					}

					var75.method3425(var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3481 == var1.serverPacket) {
					isCameraLocked = true;
					field794 = false;
					field789 = false;
					class315.field3269 = var3.readUnsignedByte() * 128;
					class284.field3133 = var3.readUnsignedByte() * 128;
					UserComparator7.field1502 = var3.readUnsignedShort();
					Varcs.field1450 = var3.readUnsignedByte();
					GameObject.field3031 = var3.readUnsignedByte();
					if (GameObject.field3031 >= 100) {
						var20 = class315.field3269 * 16384 + 64;
						var5 = class284.field3133 * 16384 + 64;
						var21 = SoundSystem.getTileHeight(class358.topLevelWorldView, var20, var5, class358.topLevelWorldView.plane) - UserComparator7.field1502;
						var7 = var20 - PlayerComposition.cameraX;
						var8 = var21 - class171.cameraY;
						var22 = var5 - UserComparator4.cameraZ;
						var10 = (int)Math.sqrt((double)(var22 * var22 + var7 * var7));
						Actor.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
						class206.cameraYaw = (int)(Math.atan2((double)var7, (double)var22) * -325.9490051269531D) & 2047;
						if (Actor.cameraPitch < 128) {
							Actor.cameraPitch = 128;
						}

						if (Actor.cameraPitch > 383) {
							Actor.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3512 == var1.serverPacket) {
					class59.method1148(ModeWhere.worldView, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3504 == var1.serverPacket) {
					HttpRequestTask.field96 = var3.readUnsignedByteAdd();
					field753 = var3.readUnsignedByteSub();
					class323.field3544 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3523 == var1.serverPacket) {
					KitDefinition.method3899(class319.field3379);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3498 == var1.serverPacket) {
					LoginScreenAnimation.method2501();
					var20 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByteNeg();
					var21 = var3.readUnsignedIntIME();
					experience[var20] = var21;
					currentLevels[var20] = var5;
					levels[var20] = 1;
					field669[var20] = var5;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var21 >= Skills.Skills_experienceTable[var7]) {
							levels[var20] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3454 == var1.serverPacket) {
					World var50 = new World();
					var50.host = var3.readStringCp1252NullTerminated();
					var50.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var50.properties = var5;
					if (var50.isDeadman()) {
						var50.field832 = "beta";
						GraphicsObject.field902 = true;
					} else {
						GraphicsObject.field902 = false;
					}

					class105.updateGameState(45);
					var2.close();
					var2 = null;
					WorldMapArchiveLoader.changeWorld(var50);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3447 == var1.serverPacket) {
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

				if (ServerPacket.field3477 == var1.serverPacket) {
					var20 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedShortAdd();
					var21 = var3.readUnsignedIntIME();
					var23 = (InterfaceParent)interfaceParents.get((long)var21);
					if (var23 != null) {
						MouseHandler.closeInterface(var23, var5 != var23.group);
					}

					WorldMapLabelSize.openInterface(var21, var5, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3416 == var1.serverPacket) {
					for (var20 = 0; var20 < ModeWhere.worldView.players.length; ++var20) {
						if (ModeWhere.worldView.players[var20] != null) {
							ModeWhere.worldView.players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < ModeWhere.worldView.npcs.length; ++var20) {
						if (ModeWhere.worldView.npcs[var20] != null) {
							ModeWhere.worldView.npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3483 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntIME();
					Varps.Varps_temp[var20] = var5;
					if (Varps.Varps_main[var20] != var5) {
						Varps.Varps_main[var20] = var5;
					}

					ClanChannelMember.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				BufferedSink.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1475 != null ? var1.field1475.id : -1) + "," + (var1.field1476 != null ? var1.field1476.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				KitDefinition.logOut();
			} catch (IOException var48) {
				ClientPacket.method6167();
			} catch (Exception var49) {
				var24 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1475 != null ? var1.field1475.id : -1) + "," + (var1.field1476 != null ? var1.field1476.id : -1) + "," + var1.serverPacketLength + "," + (class17.localPlayer.pathX[0] + class358.topLevelWorldView.baseX) + "," + (class17.localPlayer.pathY[0] + class358.topLevelWorldView.baseY) + ",";

				for (var21 = 0; var21 < var1.serverPacketLength && var21 < 50; ++var21) {
					var24 = var24 + var3.array[var21] + ",";
				}

				BufferedSink.RunException_sendStackTrace(var24, var49);
				KitDefinition.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "821798106"
	)
	@Export("menu")
	final void menu() {
		WorldMapID.method5941();
		if (clickedWidget == null) {
			int var1 = MouseHandler.MouseHandler_lastButton;
			int var2;
			if (isMenuOpen) {
				int var3;
				if (var1 != 1 && (class105.mouseCam || var1 != 4)) {
					var2 = MouseHandler.MouseHandler_x;
					var3 = MouseHandler.MouseHandler_y;
					if (var2 < class156.menuX - 10 || var2 > WorldMapLabelSize.menuWidth + class156.menuX + 10 || var3 < Ignored.menuY - 10 || var3 > Ignored.menuY + ArchiveDiskActionHandler.menuHeight + 10) {
						isMenuOpen = false;
						class486.invalidateWidgetsUnder(class156.menuX, Ignored.menuY, WorldMapLabelSize.menuWidth, ArchiveDiskActionHandler.menuHeight);
					}
				}

				if (var1 == 1 || !class105.mouseCam && var1 == 4) {
					var2 = class156.menuX;
					var3 = Ignored.menuY;
					int var4 = WorldMapLabelSize.menuWidth;
					int var5 = MouseHandler.MouseHandler_lastPressedX;
					int var6 = MouseHandler.MouseHandler_lastPressedY;
					int var7 = -1;

					for (int var8 = 0; var8 < menuOptionsCount; ++var8) {
						int var9 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31;
						if (var5 > var2 && var5 < var4 + var2 && var6 > var9 - 13 && var6 < var9 + 3) {
							var7 = var8;
						}
					}

					if (var7 != -1) {
						class144.menuActionByIdx(var7);
					}

					isMenuOpen = false;
					class486.invalidateWidgetsUnder(class156.menuX, Ignored.menuY, WorldMapLabelSize.menuWidth, ArchiveDiskActionHandler.menuHeight);
				}
			} else {
				var2 = class163.method3419();
				if ((var1 == 1 || !class105.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
					var1 = 2;
				}

				if ((var1 == 1 || !class105.mouseCam && var1 == 4) && menuOptionsCount > 0) {
					class144.menuActionByIdx(var2);
				}

				if (var1 == 2 && menuOptionsCount > 0) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1803741356"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = menuOptionsCount - 1;
		boolean var3 = leftClickOpensMenu && menuOptionsCount > 2;
		if (!var3) {
			boolean var4;
			if (var1 < 0) {
				var4 = false;
			} else {
				int var5 = menuOpcodes[var1];
				if (var5 >= 2000) {
					var5 -= 2000;
				}

				if (var5 == 1007) {
					var4 = true;
				} else {
					var4 = false;
				}
			}

			var3 = var4;
		}

		return var3 && !menuShiftClick[var1];
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "122"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = WorldMapRenderer.fontBold12.stringWidth("Choose Option");

		int var4;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) {
			Font var9 = WorldMapRenderer.fontBold12;
			String var10;
			if (var4 < 0) {
				var10 = "";
			} else if (menuTargets[var4].length() > 0) {
				var10 = menuActions[var4] + " " + menuTargets[var4];
			} else {
				var10 = menuActions[var4];
			}

			int var7 = var9.stringWidth(var10);
			if (var7 > var3) {
				var3 = var7;
			}
		}

		var3 += 8;
		var4 = menuOptionsCount * 15 + 22;
		int var5 = var1 - var3 / 2;
		if (var3 + var5 > GameEngine.canvasWidth) {
			var5 = GameEngine.canvasWidth - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		int var6 = var2;
		if (var2 + var4 > DbTable.canvasHeight) {
			var6 = DbTable.canvasHeight - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		class156.menuX = var5;
		Ignored.menuY = var6;
		WorldMapLabelSize.menuWidth = var3;
		ArchiveDiskActionHandler.menuHeight = menuOptionsCount * 15 + 22;
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		class358.topLevelWorldView.scene.menuOpen(class358.topLevelWorldView.plane, var1, var2, false);

		for (var3 = 0; var3 < class358.topLevelWorldView.worldEntityCount; ++var3) {
			WorldEntity var8 = class358.topLevelWorldView.worldEntities[class358.topLevelWorldView.worldEntityIndices[var3]];
			if (var8 != null) {
				var8.worldView.scene.menuOpen(var8.worldView.plane, var1, var2, false);
			}
		}

		isMenuOpen = true;
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "52"
	)
	final void method1798(boolean var1) {
		ItemContainer.method2304(rootInterface, GameEngine.canvasWidth, DbTable.canvasHeight, var1);
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V",
		garbageValue = "1126291948"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : AsyncRestClient.widgetDefinition.method6536(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = GameEngine.canvasWidth;
			var4 = DbTable.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		class352.alignWidgetSize(var1, var3, var4, false);
		class7.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	final void method1260() {
		class324.invalidateWidget(clickedWidget);
		++Tile.widgetDragDuration;
		if (field715 && field734) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field713) {
				var1 = field713;
			}

			if (var1 + clickedWidget.width > field713 + clickedWidgetParent.width) {
				var1 = field713 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field795) {
				var2 = field795;
			}

			if (var2 + clickedWidget.height > field795 + clickedWidgetParent.height) {
				var2 = field795 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field716;
			int var4 = var2 - field748;
			int var5 = clickedWidget.dragZoneSize;
			if (Tile.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field713 + clickedWidgetParent.scrollX;
			int var7 = var2 - field795 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class371.runScriptEvent(var8);
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
						class371.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && class13.method167(clickedWidget) != null) {
						PacketBufferNode var9 = WorldMapElement.getPacketBufferNode(ClientPacket.field3288, packetWriter.isaacCipher);
						var9.packetBuffer.writeIntLE(clickedWidget.id);
						var9.packetBuffer.writeShortAddLE(clickedWidget.childIndex);
						var9.packetBuffer.writeShortAdd(clickedWidget.itemId);
						var9.packetBuffer.writeIntME(draggedOnWidget.id);
						var9.packetBuffer.writeShort(draggedOnWidget.itemId);
						var9.packetBuffer.writeShortAdd(draggedOnWidget.childIndex);
						packetWriter.addNode(var9);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field716 + widgetClickX, widgetClickY + field748);
				} else if (menuOptionsCount > 0) {
					class186.method3734(widgetClickX + field716, widgetClickY + field748);
				}

				clickedWidget = null;
			}

		} else {
			if (Tile.widgetDragDuration > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					class186.method3734(widgetClickX + field716, field748 + widgetClickY);
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "1783143876"
	)
	@Export("username")
	public Username username() {
		return class17.localPlayer != null ? class17.localPlayer.username : null;
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "21"
	)
	void method1262(int var1) {
		PacketBufferNode var2 = WorldMapElement.getPacketBufferNode(ClientPacket.field3353, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "463606038"
	)
	void method1263(int var1) {
		PacketBufferNode var2 = WorldMapElement.getPacketBufferNode(ClientPacket.field3349, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
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
							class188.clientLanguage = Language.method7462(Integer.parseInt(var2));
							break;
						case 7:
							FloorOverlayDefinition.field2400 = class53.method1093(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class432.field4745 = var2;
							break;
						case 10:
							class111.field1431 = (StudioGame)MenuAction.findEnumerated(DirectByteArrayCopier.method7109(), Integer.parseInt(var2));
							if (StudioGame.oldscape == class111.field1431) {
								class236.loginType = LoginType.oldscape;
							} else {
								class236.loginType = LoginType.field5227;
							}
							break;
						case 11:
							class326.authServiceBaseUrl = var2;
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
							class165.field1813 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							Skeleton.field2697 = var2;
							break;
						case 21:
							field531 = Integer.parseInt(var2);
							break;
						case 22:
							class375.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								field557 = Integer.parseInt(var2);
							} else {
								field557 = Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class11.worldHost = this.getCodeBase().getHost();
				HttpMethod.field32 = new JagNetThread();
				String var4 = FloorOverlayDefinition.field2400.name;
				byte var5 = 0;
				if ((worldProperties & class541.field5313.rsOrdinal()) != 0) {
					class375.field4075 = "beta";
				}

				try {
					class95.method2410("oldschool", class375.field4075, var4, var5, 23);
				} catch (Exception var7) {
					BufferedSink.RunException_sendStackTrace((String)null, var7);
				}

				class188.client = this;
				WorldMapIcon_0.field3144 = clientType;
				HttpRequestTask.accessToken = System.getenv("JX_ACCESS_TOKEN");
				class232.refreshToken = System.getenv("JX_REFRESH_TOKEN");
				HttpRequest.sessionId = System.getenv("JX_SESSION_ID");
				Interpreter.characterId = System.getenv("JX_CHARACTER_ID");
				UserComparator7.method2966(System.getenv("JX_DISPLAY_NAME"));
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field533 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field533 = 0;
					} else {
						field533 = 5;
					}
				}

				this.startThread(765, 503, 222, 1);
			}
		} catch (RuntimeException var8) {
			throw GrandExchangeEvent.newRunException(var8, "client.init(" + ')');
		}
	}

	protected void finalize() throws Throwable {
		class329.field3582.remove(this);
		super.finalize();
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			ParamComposition.updateLoginIndex(10);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.refreshAccessTokenRequester = var1;
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1876446467"
	)
	static final void method1809(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class459.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
