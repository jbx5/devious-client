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

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi, class340 {
	@ObfuscatedName("wg")
	@ObfuscatedGetter(
		intValue = 1873696417
	)
	public static int field808;
	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	static final class278 field810;
	@ObfuscatedName("wn")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	static final ApproximateRouteStrategy field815;
	@ObfuscatedName("wz")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("wu")
	static int[] field691;
	@ObfuscatedName("xe")
	static int[] field817;
	@ObfuscatedName("we")
	@ObfuscatedGetter(
		intValue = 1275318517
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wk")
	@ObfuscatedGetter(
		intValue = 1424828263
	)
	static int field814;
	@ObfuscatedName("wj")
	@ObfuscatedGetter(
		intValue = -1220676765
	)
	static int field811;
	@ObfuscatedName("wo")
	static List field809;
	@ObfuscatedName("bc")
	static boolean field531;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 914504241
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 12039691
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -872183921
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cx")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("ci")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1888871377
	)
	static int field520;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 133853773
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -651306003
	)
	static int field522;
	@ObfuscatedName("cz")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("df")
	static boolean field772;
	@ObfuscatedName("dv")
	static boolean field612;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -941305067
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dk")
	static boolean field528;
	@ObfuscatedName("dl")
	static boolean field575;
	@ObfuscatedName("dj")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1472813913
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 931216447
	)
	@Export("serverCycle")
	static int serverCycle;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		longValue = 6174591635879649929L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 300416259
	)
	static int field648;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -831784087
	)
	static int field535;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		longValue = 2665910617217622239L
	)
	static long field536;
	@ObfuscatedName("dg")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 893536765
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -2050039675
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 33112227
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1424979597
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -200498717
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1621731881
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -959934118
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -417717568
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = -479387840
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Lef;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ex")
	@Export("z")
	static boolean z;
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	static class95 field603;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = 1385466207
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 491243699
	)
	static int field552;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = 1234584475
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fy")
	@ObfuscatedGetter(
		intValue = -1368109439
	)
	static int field554;
	@ObfuscatedName("fz")
	@ObfuscatedGetter(
		intValue = -2067538029
	)
	static int field555;
	@ObfuscatedName("fa")
	@ObfuscatedGetter(
		intValue = -1907896375
	)
	static int field556;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static class555 field558;
	@ObfuscatedName("gn")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("gg")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("hn")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "Ldv;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("hm")
	static int[] field574;
	@ObfuscatedName("hh")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 1014601869
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ho")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 296627897
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ij")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("it")
	static String field674;
	@ObfuscatedName("ik")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 2116597885
	)
	static int field604;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 197948989
	)
	static int field713;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -83594241
	)
	static int field626;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = 141205851
	)
	static int field529;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = -1691895385
	)
	static int field590;
	@ObfuscatedName("jn")
	static int[][][] field591;
	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	@Export("worldViewManager")
	static WorldViewManager worldViewManager;
	@ObfuscatedName("jk")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jz")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jq")
	static final int[] field595;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = -1259542005
	)
	static int field596;
	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	@Export("playerUpdateManager")
	static PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = -766676153
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -925961083
	)
	static int field599;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = 102650921
	)
	static int field600;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = -913688389
	)
	static int field601;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 1202215799
	)
	static int field602;
	@ObfuscatedName("kt")
	static boolean field587;
	@ObfuscatedName("kk")
	@ObfuscatedGetter(
		intValue = 1914864737
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 187341447
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 1933903023
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(
		intValue = 969990531
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 184178511
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = 2071697973
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -1856385195
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -383889001
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -2036767999
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = -599126039
	)
	static int field613;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = -1158007375
	)
	static int field664;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = 117303701
	)
	static int field630;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = 1840503925
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = 966764149
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1992677881
	)
	@Export("revision")
	static int revision;
	@ObfuscatedName("lw")
	static boolean field619;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = -355812493
	)
	static int field620;
	@ObfuscatedName("lg")
	static boolean field621;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 536984253
	)
	static int field760;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -1246122631
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1523539003
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("li")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("lt")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("lj")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("lk")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("mu")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("mo")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("mh")
	static int[][] field645;
	@ObfuscatedName("md")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("ml")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 1902076515
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -1845042183
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mg")
	@ObfuscatedGetter(
		intValue = 490165719
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = -424007135
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = 1493190109
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 1646952437
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 1487372307
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mx")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -1292724789
	)
	static int field728;
	@ObfuscatedName("mk")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mf")
	@ObfuscatedGetter(
		intValue = -797776089
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(
		intValue = -1508867573
	)
	static int field565;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		longValue = -2377611982249716887L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("mw")
	@ObfuscatedGetter(
		longValue = -1783228074382635555L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("mv")
	static String field597;
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -7285045
	)
	static int field649;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = 1072013155
	)
	static int field818;
	@ObfuscatedName("ne")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = 1716697315
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = 640762613
	)
	static int field525;
	@ObfuscatedName("nv")
	static int[] field526;
	@ObfuscatedName("nl")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("no")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("nm")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ni")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = -1884548229
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("ng")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nx")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nj")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nd")
	static int[] field662;
	@ObfuscatedName("nu")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("nr")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("menu")
	static Menu menu;
	@ObfuscatedName("nf")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("nz")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("oc")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -1494343047
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = -1694717047
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(
		intValue = -2031046123
	)
	static int field766;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -807419885
	)
	static int field672;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = -1780236987
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("od")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 1157608211
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -199269311
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("ou")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("op")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 250910895
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = 617367329
	)
	static int field682;
	@ObfuscatedName("oy")
	@ObfuscatedGetter(
		intValue = -333400519
	)
	static int field629;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 899085923
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("po")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = 1580905911
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = 297176239
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 703902891
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = 199590507
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("ph")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 1316322631
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = -1002423649
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pn")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("pg")
	static boolean field697;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = -2002133621
	)
	static int field576;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = -37233011
	)
	static int field684;
	@ObfuscatedName("px")
	static boolean field700;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 2086211187
	)
	static int field701;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = -156028895
	)
	static int field702;
	@ObfuscatedName("pl")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = -1886097335
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qt")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 27018589
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("ql")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = 1589829289
	)
	static int field761;
	@ObfuscatedName("qj")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = 383696619
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qy")
	static int[] field711;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 457935711
	)
	static int field712;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		intValue = 1737347249
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 1544138419
	)
	static int field714;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = -1286891143
	)
	static int field715;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = -172518859
	)
	static int field716;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = -2082301231
	)
	static int field615;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 430743117
	)
	static int field718;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(
		intValue = -90938195
	)
	static int field647;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = -168818499
	)
	static int field720;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 581621369
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qk")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	static class568 field722;
	@ObfuscatedName("qw")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("qb")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	static NodeDeque field726;
	@ObfuscatedName("rh")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = -1513272411
	)
	@Export("rootWidgetCount")
	public static int rootWidgetCount;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(
		intValue = -2140154283
	)
	static int field593;
	@ObfuscatedName("ri")
	@Export("validRootWidgets")
	public static boolean[] validRootWidgets;
	@ObfuscatedName("ru")
	static boolean[] field731;
	@ObfuscatedName("ra")
	static boolean[] field732;
	@ObfuscatedName("rq")
	@Export("rootWidgetXs")
	public static int[] rootWidgetXs;
	@ObfuscatedName("rx")
	@Export("rootWidgetYs")
	public static int[] rootWidgetYs;
	@ObfuscatedName("rv")
	@Export("rootWidgetWidths")
	public static int[] rootWidgetWidths;
	@ObfuscatedName("rn")
	@Export("rootWidgetHeights")
	public static int[] rootWidgetHeights;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		intValue = 322525129
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		longValue = -6394115933444112669L
	)
	static long field738;
	@ObfuscatedName("rw")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 267139405
	)
	static int field740;
	@ObfuscatedName("ry")
	@ObfuscatedGetter(
		intValue = 521636781
	)
	static int field741;
	@ObfuscatedName("rt")
	static int[] field742;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 777193457
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(
		intValue = -1761391013
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sp")
	static String field745;
	@ObfuscatedName("sj")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -1445186557
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("ss")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("indexCheck")
	public static IndexCheck indexCheck;
	@ObfuscatedName("se")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	static class267 field679;
	@ObfuscatedName("st")
	@ObfuscatedGetter(
		intValue = -114857575
	)
	static int field514;
	@ObfuscatedName("sq")
	static int[] field533;
	@ObfuscatedName("sy")
	static int[] field752;
	@ObfuscatedName("su")
	@ObfuscatedGetter(
		longValue = -1072029752873570999L
	)
	static long field748;
	@ObfuscatedName("sg")
	@ObfuscatedSignature(
		descriptor = "[Lgo;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		descriptor = "[Lgm;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = -179610807
	)
	static int field756;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = 1308275453
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("sb")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sa")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("sz")
	@ObfuscatedGetter(
		intValue = 1311031545
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("si")
	@ObfuscatedGetter(
		intValue = -1317418145
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = 1860751979
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tm")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = -613960017
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("to")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("tx")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tq")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("tg")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ta")
	static int[] field627;
	@ObfuscatedName("td")
	@ObfuscatedSignature(
		descriptor = "[Lbi;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("tt")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("ue")
	static boolean field773;
	@ObfuscatedName("us")
	static boolean field774;
	@ObfuscatedName("ui")
	static boolean field775;
	@ObfuscatedName("uq")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	static class514 field776;
	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static class513 field777;
	@ObfuscatedName("ua")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	static class513 field778;
	@ObfuscatedName("ul")
	static boolean field779;
	@ObfuscatedName("up")
	static boolean[] field577;
	@ObfuscatedName("un")
	static int[] field781;
	@ObfuscatedName("uv")
	static int[] field782;
	@ObfuscatedName("uj")
	static int[] field589;
	@ObfuscatedName("um")
	static int[] field518;
	@ObfuscatedName("uz")
	static short field785;
	@ObfuscatedName("uk")
	static short field786;
	@ObfuscatedName("vm")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("vk")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vc")
	static short field727;
	@ObfuscatedName("va")
	static short field790;
	@ObfuscatedName("vf")
	static short field791;
	@ObfuscatedName("vh")
	static short field792;
	@ObfuscatedName("vz")
	@ObfuscatedGetter(
		intValue = -1044320277
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = 2116232713
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vb")
	@ObfuscatedGetter(
		intValue = -249064015
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vg")
	@ObfuscatedGetter(
		intValue = -1451243729
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vq")
	@ObfuscatedGetter(
		intValue = 491886171
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("playerAppearance")
	static final PlayerComposition playerAppearance;
	@ObfuscatedName("vu")
	@ObfuscatedGetter(
		intValue = 421605065
	)
	static int field799;
	@ObfuscatedName("vr")
	@ObfuscatedGetter(
		intValue = 744244053
	)
	static int field800;
	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "Ltg;"
	)
	static class510 field801;
	@ObfuscatedName("vv")
	@ObfuscatedSignature(
		descriptor = "[Lpj;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("vl")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static class464 field804;
	@ObfuscatedName("vs")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("ws")
	@ObfuscatedGetter(
		intValue = -786295739
	)
	static int field807;
	@ObfuscatedName("gz")
	@Export("token")
	String token;
	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("gw")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("gr")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("gq")
	@Export("https")
	boolean https;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 681196719
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	@Export("refreshAccessTokenRequester")
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("gh")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	Buffer field584;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	class7 field666;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		longValue = 3852145709794123581L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field531 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field520 = -1;
		clientType = -1;
		field522 = -1;
		onMobile = false;
		class548.field5407 = 225;
		field772 = false;
		field612 = false;
		gameState = 0;
		field528 = false;
		field575 = false;
		isLoading = true;
		cycle = 0;
		serverCycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field648 = -1;
		field535 = -1;
		field536 = -1L;
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
		field603 = class95.field1174;
		js5ConnectState = 0;
		field552 = 0;
		js5Errors = 0;
		field554 = 0;
		field555 = 0;
		field556 = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field558 = class555.field5472;
		BASIC_AUTH_DESKTOP_OSRS = FileSystem.base64Encode(class272.method5649("com_jagex_auth_desktop_osrs:public"));
		BASIC_AUTH_DESKTOP_RUNELITE = FileSystem.base64Encode(class272.method5649("com_jagex_auth_desktop_runelite:public"));
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		field574 = new int[4];
		randomDatData = null;
		npcCount = 0;
		npcIndices = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field604 = 0;
		field713 = 1;
		field626 = 0;
		field529 = 1;
		field590 = 0;
		field591 = new int[4][13][13];
		worldViewManager = new WorldViewManager();
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field595 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field596 = -1;
		playerUpdateManager = new PlayerUpdateManager();
		graphicsCycle = 0;
		field599 = 2301979;
		field600 = 5063219;
		field601 = 3353893;
		field602 = 7759444;
		field587 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field613 = 0;
		field664 = 0;
		field630 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		revision = 0;
		field619 = false;
		field620 = 0;
		field621 = false;
		field760 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field645 = new int[overheadTextLimit][];
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
		field728 = 0;
		showLoadingMessages = true;
		localPlayerIndex = -1;
		field565 = 0;
		userId = -1L;
		userHash = -1L;
		field597 = "";
		field649 = -1;
		renderSelf = true;
		drawPlayerNames = 0;
		field525 = 0;
		field526 = new int[1000];
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
		combatTargetPlayerIndex = -1;
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		field662 = new int[25];
		leftClickOpensMenu = false;
		isMenuOpen = false;
		menu = new Menu(true);
		followerOpsLowPriority = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field766 = 0;
		field672 = 50;
		isItemSelected = 0;
		field674 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field682 = 0;
		field629 = -1;
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
		field697 = false;
		field576 = -1;
		field684 = -1;
		field700 = false;
		field701 = -1;
		field702 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field761 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field711 = new int[32];
		field712 = 0;
		chatCycle = 0;
		field714 = 0;
		field715 = 0;
		field716 = 0;
		field615 = 0;
		field718 = 0;
		field647 = 0;
		field720 = 0;
		mouseWheelRotation = 0;
		field722 = new class568();
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field726 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field593 = -2;
		validRootWidgets = new boolean[100];
		field731 = new boolean[100];
		field732 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field738 = 0L;
		isResizable = true;
		field740 = 600;
		field741 = field740 / GameEngine.cycleDurationMillis;
		field742 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field745 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		indexCheck = new IndexCheck();
		field679 = new class267();
		field514 = 0;
		field533 = new int[128];
		field752 = new int[128];
		field748 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field756 = -1;
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
		field627 = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field773 = false;
		field774 = false;
		field775 = false;
		field776 = null;
		field777 = null;
		field778 = null;
		field779 = false;
		field577 = new boolean[5];
		field781 = new int[5];
		field782 = new int[5];
		field589 = new int[5];
		field518 = new int[5];
		field785 = 256;
		field786 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field727 = 1;
		field790 = 32767;
		field791 = 1;
		field792 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field799 = -1;
		field800 = -1;
		field801 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field804 = new class464(8, class462.field4931);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field807 = -1;
		field808 = -1;
		field809 = new ArrayList();
		field810 = new class278();
		field811 = 10;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field814 = 0;
		field815 = new ApproximateRouteStrategy();
		field691 = new int[50];
		field817 = new int[50];
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1968536005"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field738 = WorldMapElement.method3843() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1313(true);
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-31153294"
	)
	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{20, 260, 10000};
		int[] var2 = new int[]{1000, 100, 500};
		if (var1 != null && var2 != null) {
			MusicSong.ByteArrayPool_alternativeSizes = var1;
			class159.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			class416.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < MusicSong.ByteArrayPool_alternativeSizes.length; ++var3) {
				class416.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field4873.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field4873);
		} else {
			MusicSong.ByteArrayPool_alternativeSizes = null;
			class159.ByteArrayPool_altSizeArrayCounts = null;
			class416.ByteArrayPool_arrays = null;
			ByteArrayPool.field4873.clear();
			ByteArrayPool.field4873.add(100);
			ByteArrayPool.field4873.add(5000);
			ByteArrayPool.field4873.add(10000);
			ByteArrayPool.field4873.add(30000);
		}

		int var4 = worldProperties;
		class545 var5 = class545.field5380;
		boolean var8 = (var4 & var5.rsOrdinal()) != 0;
		class492.field5083 = var8;
		class30.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		WorldMapRenderer.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		BuddyRankComparator.currentPort = class30.worldPort;
		PlayerComposition.field3801 = class361.field3836;
		Projection.field2769 = class361.field3837;
		TextureProvider.field2768 = class361.field3838;
		HttpRequest.field48 = class361.field3839;
		AsyncHttpResponse.urlRequester = new SecureUrlRequester(this.https, 225);
		this.setUpKeyboard();
		this.setUpMouse();
		RestClientThreadFactory.mouseWheel = this.mouseWheel();
		this.method490(field679, 0);
		this.method490(indexCheck, 1);
		this.setUpClipboard();
		class382.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		class461.clientPreferences = class531.method9700();
		String var7 = KitDefinition.field1940;
		class31.field147 = this;
		if (var7 != null) {
			class31.field143 = var7;
		}

		HttpRequest.setWindowedMode(class461.clientPreferences.getWindowMode());
		class425.friendSystem = new FriendSystem(class28.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		class329.method6421(this);
		field810.method5712();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "124564403"
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
				if (!class334.field3620.isEmpty()) {
					SongTask var4 = (SongTask)class334.field3620.get(0);
					if (var4 == null) {
						class334.field3620.remove(0);
					} else if (var4.vmethod8618()) {
						if (var4.method8599()) {
							System.out.println("Error in midimanager.service: " + var4.method8601());
							var5 = true;
						} else {
							if (var4.method8597() != null) {
								class334.field3620.add(1, var4.method8597());
							}

							var6 = var4.method8600();
						}

						class334.field3620.remove(0);
					} else {
						var6 = var4.method8600();
					}
				}

				if (var5) {
					class334.field3620.clear();
					class60.method1192();
				}

				if (var6 && playingJingle && HealthBarConfig.pcmPlayer1 != null) {
					HealthBarConfig.pcmPlayer1.tryDiscard();
				}

				GrandExchangeOffer.method7712();
				indexCheck.method5572();
				this.method489();
				class113.method3037();
				if (RestClientThreadFactory.mouseWheel != null) {
					int var9 = RestClientThreadFactory.mouseWheel.useRotation();
					mouseWheelRotation = var9;
				}

				if (gameState == 0) {
					class329.method6422();
					KitDefinition.method3891();
				} else if (gameState == 5) {
					NPC.loginScreen(this, class169.fontPlain11, UserComparator9.fontPlain12);
					class329.method6422();
					KitDefinition.method3891();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						NPC.loginScreen(this, class169.fontPlain11, UserComparator9.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						NPC.loginScreen(this, class169.fontPlain11, UserComparator9.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						if (field772) {
							GameBuild.loadRegion();
						}

						if (field612) {
							VarbitComposition.method4074(class382.field4458);
						}

						if (!field612 && !field772) {
							class464.updateGameState(30);
						}
					}
				} else {
					NPC.loginScreen(this, class169.fontPlain11, UserComparator9.fontPlain12);
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-149306215"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && field738 != 0L && WorldMapElement.method3843() > field738) {
			HttpRequest.setWindowedMode(Script.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, SoundSystem.field293);
		} else if (gameState == 5) {
			Message.drawTitle(class33.fontBold12, class169.fontPlain11, UserComparator9.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				Message.drawTitle(class33.fontBold12, class169.fontPlain11, UserComparator9.fontPlain12);
			} else if (gameState == 50) {
				Message.drawTitle(class33.fontBold12, class169.fontPlain11, UserComparator9.fontPlain12);
			} else if (gameState == 25) {
				if (field590 == 1) {
					if (field604 > field713) {
						field713 = field604;
					}

					var2 = (field713 * 50 - field604 * 50) / field713;
					class328.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field590 == 2) {
					if (field626 > field529) {
						field529 = field626;
					}

					var2 = (field529 * 50 - field626 * 50) / field529 + 50;
					class328.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					class328.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class328.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				class328.drawLoadingMessage("Please wait...", false);
			}
		} else {
			Message.drawTitle(class33.fontBold12, class169.fontPlain11, UserComparator9.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field731[var2]) {
					class310.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field731[var2] = false;
				}
			}
		} else if (gameState > 0) {
			class310.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field731[var2] = false;
			}
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1112351068"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class229.varcs != null && class229.varcs.hasUnwrittenChanges()) {
			class229.varcs.write();
		}

		if (LoginScreenAnimation.mouseRecorder != null) {
			LoginScreenAnimation.mouseRecorder.isRunning = false;
		}

		LoginScreenAnimation.mouseRecorder = null;
		packetWriter.close();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		RestClientThreadFactory.mouseWheel = null;
		if (HealthBarConfig.pcmPlayer1 != null) {
			HealthBarConfig.pcmPlayer1.shutdown();
		}

		FontName.field5260.method7625();
		TextureProvider.method5183();
		if (AsyncHttpResponse.urlRequester != null) {
			AsyncHttpResponse.urlRequester.close();
			AsyncHttpResponse.urlRequester = null;
		}

		BuddyRankComparator.method3233();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1505119794"
	)
	protected final void vmethod1297() {
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-688416680"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "245347311"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return ReflectionCheck.accessToken != null && !ReflectionCheck.accessToken.trim().isEmpty() && class374.refreshToken != null && !class374.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2099146027"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return class331.sessionId != null && !class331.sessionId.trim().isEmpty() && FriendsList.characterId != null && !FriendsList.characterId.trim().isEmpty();
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-837596325"
	)
	@Export("otlTokenRequesterInitialized")
	boolean otlTokenRequesterInitialized() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-792886980"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class215.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(class215.authServiceBaseUrl)).getHost());
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

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(class215.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
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

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1204503132"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class532.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = FontName.field5260.method7617();
			if (!var1) {
				this.method1299();
			}

		}
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1894915670"
	)
	void method1299() {
		if (FontName.field5260.field4564 >= 4) {
			this.error("js5crc");
			class464.updateGameState(1000);
		} else {
			if (FontName.field5260.field4592 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					class464.updateGameState(1000);
					return;
				}

				field552 = 3000;
				FontName.field5260.field4592 = 3;
			}

			if (--field552 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						SpotAnimationDefinition.js5SocketTask = GameEngine.taskHandler.newSocketTask(class324.worldHost, BuddyRankComparator.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (SpotAnimationDefinition.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (SpotAnimationDefinition.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						class425.js5Socket = SwapSongTask.method8585((Socket)SpotAnimationDefinition.js5SocketTask.result, 40000, 5000);
						Buffer var1;
						if (class548.field5407 >= 223) {
							var1 = new Buffer(class327.field3581.field3576 + 1);
							var1.writeByte(class327.field3581.field3575);
							var1.writeInt(225);
							var1.writeInt(field574[0]);
							var1.writeInt(field574[1]);
							var1.writeInt(field574[2]);
							var1.writeInt(field574[3]);
							class425.js5Socket.write(var1.array, 0, class327.field3581.field3576 + 1);
						} else {
							var1 = new Buffer(5);
							var1.writeByte(class327.field3581.field3575);
							var1.writeInt(225);
							class425.js5Socket.write(var1.array, 0, 5);
						}

						++js5ConnectState;
						SoundSystem.field298 = WorldMapElement.method3843();
					}

					if (js5ConnectState == 3) {
						if (class425.js5Socket.available() > 0) {
							int var2 = class425.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (WorldMapElement.method3843() - SoundSystem.field298 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						FontName.field5260.method7618(class425.js5Socket, gameState > 20);
						SpotAnimationDefinition.js5SocketTask = null;
						class425.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var3) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "474332468"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		SpotAnimationDefinition.js5SocketTask = null;
		class425.js5Socket = null;
		js5ConnectState = 0;
		if (class30.worldPort == BuddyRankComparator.currentPort) {
			BuddyRankComparator.currentPort = WorldMapRenderer.js5Port;
		} else {
			BuddyRankComparator.currentPort = class30.worldPort;
		}

		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				class464.updateGameState(1000);
			} else {
				field552 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			class464.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				class464.updateGameState(1000);
			} else {
				field552 = 3000;
			}
		}

	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "816153822"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (HttpRequestTask.loginState == LoginState.SHUTDOWN_PREVIOUS_CONNECTION) {
				if (AsyncHttpResponse.field69 == null && (secureRandomFuture.isDone() || field554 > 250)) {
					AsyncHttpResponse.field69 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (AsyncHttpResponse.field69 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					BufferedSink.field5044 = null;
					hadNetworkError = false;
					field554 = 0;
					if (field558.method10223()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(class374.refreshToken);
								class166.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var23) {
								class171.RunException_sendStackTrace((String)null, var23);
								ReflectionCheck.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								ReflectionCheck.getLoginError(65);
								return;
							}

							try {
								this.authenticate(class331.sessionId, FriendsList.characterId);
								class166.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var22) {
								class171.RunException_sendStackTrace((String)null, var22);
								ReflectionCheck.getLoginError(65);
								return;
							}
						}
					} else {
						class166.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var25;
			if (LoginState.TOKEN_RESPONSE == HttpRequestTask.loginState) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						ReflectionCheck.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							ReflectionCheck.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						ReflectionCheck.accessToken = var3.getAccessToken();
						class374.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var21) {
						class171.RunException_sendStackTrace((String)null, var21);
						ReflectionCheck.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						ReflectionCheck.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						class171.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						ReflectionCheck.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var25 = this.asyncAccessTokenResponse.await();
					if (var25.getResponseCode() != 200) {
						ReflectionCheck.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field554 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var25.getResponseBody());

					try {
						ReflectionCheck.accessToken = var4.getBody().getString("access_token");
						class374.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var20) {
						class171.RunException_sendStackTrace("Error parsing tokens", var20);
						ReflectionCheck.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(ReflectionCheck.accessToken);
				class166.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (LoginState.REFRESHING_TOKEN == HttpRequestTask.loginState) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						ReflectionCheck.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var26 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var26.isSuccess()) {
							ReflectionCheck.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var26.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var19) {
						class171.RunException_sendStackTrace((String)null, var19);
						ReflectionCheck.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						ReflectionCheck.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						class171.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						ReflectionCheck.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var25 = this.asyncGameSessionTokenResponse.await();
					if (var25.getResponseCode() != 200) {
						class171.RunException_sendStackTrace("Response code: " + var25.getResponseCode() + "Response body: " + var25.getResponseBody(), (Throwable)null);
						ReflectionCheck.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var27 = (List)var25.getHeaderFields().get("Content-Type");
					if (var27 != null && var27.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var25.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var18) {
							class171.RunException_sendStackTrace((String)null, var18);
							ReflectionCheck.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var25.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field554 = 0;
				class166.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (LoginState.INIT_MOUSEHANDLER_SOCKET == HttpRequestTask.loginState) {
				if (BufferedSink.field5044 == null) {
					BufferedSink.field5044 = GameEngine.taskHandler.newSocketTask(class324.worldHost, BuddyRankComparator.currentPort);
				}

				if (BufferedSink.field5044.status == 2) {
					throw new IOException();
				}

				if (BufferedSink.field5044.status == 1) {
					var1 = SwapSongTask.method8585((Socket)BufferedSink.field5044.result, 40000, 5000);
					packetWriter.setSocket(var1);
					BufferedSink.field5044 = null;
					class166.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var29;
			if (HttpRequestTask.loginState == LoginState.UNMAPPED_20) {
				packetWriter.clearBuffer();
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var29 = new PacketBufferNode();
				} else {
					var29 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var29.clientPacket = null;
				var29.clientPacketLength = 0;
				var29.packetBuffer = new PacketBuffer(5000);
				var29.packetBuffer.writeByte(class327.field3585.field3575);
				packetWriter.addNode(var29);
				packetWriter.flush();
				var2.offset = 0;
				class166.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var13;
			if (HttpRequestTask.loginState == LoginState.READ_LOGIN_STATUS) {
				if (HealthBarConfig.pcmPlayer1 != null) {
					HealthBarConfig.pcmPlayer1.method791();
				}

				if (var1.isAvailable(1)) {
					var13 = var1.readUnsignedByte();
					if (HealthBarConfig.pcmPlayer1 != null) {
						HealthBarConfig.pcmPlayer1.method791();
					}

					if (var13 != 0) {
						ReflectionCheck.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					class166.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (LoginState.READ_RANDOM_VERIFICATION_NUMBER == HttpRequestTask.loginState) {
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
					class113.field1459 = var2.readLong();
					class166.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (HttpRequestTask.loginState == LoginState.WRITE_INITIAL_LOGIN_PACKET) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var28 = new PacketBuffer(500);
				int[] var34 = new int[]{AsyncHttpResponse.field69.nextInt(), AsyncHttpResponse.field69.nextInt(), AsyncHttpResponse.field69.nextInt(), AsyncHttpResponse.field69.nextInt()};
				var28.offset = 0;
				var28.writeByte(1);
				var28.writeInt(var34[0]);
				var28.writeInt(var34[1]);
				var28.writeInt(var34[2]);
				var28.writeInt(var34[3]);
				var28.writeLong(class113.field1459);
				if (gameState == 40) {
					var28.writeInt(field574[0]);
					var28.writeInt(field574[1]);
					var28.writeInt(field574[2]);
					var28.writeInt(field574[3]);
				} else {
					if (gameState == 50) {
						var28.writeByte(AuthenticationScheme.field1550.rsOrdinal());
						var28.writeInt(Script.field1037);
					} else {
						var28.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
							var28.writeInt(class461.clientPreferences.getParameterValue(Login.Login_username));
						case 1:
						default:
							break;
						case 2:
						case 4:
							var28.writeMedium(class53.otpMedium);
							++var28.offset;
							break;
						case 3:
							var28.offset += 4;
						}
					}

					if (field558.method10223()) {
						var28.writeByte(class555.field5467.rsOrdinal());
						var28.writeStringCp1252NullTerminated(this.token);
					} else {
						var28.writeByte(class555.field5472.rsOrdinal());
						var28.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var28.encryptRsa(class77.field943, class77.field940);
				field574 = var34;
				PacketBufferNode var6;
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var6 = new PacketBufferNode();
				} else {
					var6 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(class327.field3573.field3575);
				} else {
					var6.packetBuffer.writeByte(class327.field3574.field3575);
				}

				var6.packetBuffer.writeShort(0);
				int var14 = var6.packetBuffer.offset;
				var6.packetBuffer.writeInt(225);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field522);
				byte var8 = 0;
				var6.packetBuffer.writeByte(var8);
				var6.packetBuffer.writeBytes(var28.array, 0, var28.offset);
				int var9 = var6.packetBuffer.offset;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(class154.canvasWidth);
				var6.packetBuffer.writeShort(UrlRequester.canvasHeight);
				class27.randomDatData2(var6.packetBuffer);
				var6.packetBuffer.writeStringCp1252NullTerminated(HttpJsonRequestBody.field5091);
				var6.packetBuffer.writeInt(class215.field2352);
				var6.packetBuffer.writeByte(0);
				Buffer var10 = new Buffer(CollisionMap.platformInfo.size());
				CollisionMap.platformInfo.write(var10);
				var6.packetBuffer.writeBytes(var10.array, 0, var10.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				if (class492.field5083) {
					var6.packetBuffer.writeInt(HorizontalAlignment.archive6.hash);
					var6.packetBuffer.writeIntLE(ApproximateRouteStrategy.archive8.hash);
					var6.packetBuffer.writeIntLE(class134.field1578.hash);
					var6.packetBuffer.writeIntME(BuddyRankComparator.archive13.hash);
					var6.packetBuffer.writeIntIME(class216.archive10.hash);
					var6.packetBuffer.writeIntIME(class60.soundEffectsArchive.hash);
					var6.packetBuffer.writeIntLE(KeyHandler.field112.hash);
				} else {
					var6.packetBuffer.writeIntIME(class347.field3742.hash);
					var6.packetBuffer.writeInt(HorizontalAlignment.archive6.hash);
					var6.packetBuffer.writeIntIME(class134.field1578.hash);
					var6.packetBuffer.writeInt(class53.archive2.hash);
					var6.packetBuffer.writeInt(0);
					var6.packetBuffer.writeIntIME(KeyHandler.field110.hash);
					var6.packetBuffer.writeIntIME(KeyHandler.field112.hash);
					var6.packetBuffer.writeIntLE(class216.archive10.hash);
					var6.packetBuffer.writeIntLE(class464.field4946.hash);
					var6.packetBuffer.writeIntME(VertexNormal.field2888.hash);
					var6.packetBuffer.writeInt(class187.archive12.hash);
					var6.packetBuffer.writeIntME(ScriptFrame.field460.hash);
					var6.packetBuffer.writeIntLE(class327.archive4.hash);
					var6.packetBuffer.writeIntIME(Login.field986.hash);
					var6.packetBuffer.writeIntLE(ApproximateRouteStrategy.archive8.hash);
					var6.packetBuffer.writeIntIME(Bounds.archive9.hash);
					var6.packetBuffer.writeIntME(class358.field3790.hash);
					var6.packetBuffer.writeIntIME(MusicPatch.field3690.hash);
					var6.packetBuffer.writeIntME(class60.soundEffectsArchive.hash);
					var6.packetBuffer.writeIntLE(BuddyRankComparator.archive13.hash);
					var6.packetBuffer.writeInt(PendingSpawn.field1213.hash);
				}

				var6.packetBuffer.xteaEncrypt(var34, var9, var6.packetBuffer.offset);
				var6.packetBuffer.writeLengthShort(var6.packetBuffer.offset - var14);
				packetWriter.addNode(var6);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var34);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var34[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				class166.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var15;
			if (LoginState.READ_CLIENT_INFO_STATUS == HttpRequestTask.loginState && var1.available() > 0) {
				var13 = var1.readUnsignedByte();
				if (var13 == 61) {
					var15 = var1.available();
					KeyHandler.field109 = var15 == 1 && var1.readUnsignedByte() == 1;
					class166.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var13 == 21 && gameState == 20) {
					class166.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var13 == 2) {
					if (class492.field5083) {
						class166.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						class166.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class166.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var13 == 64) {
					class166.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var13 == 23 && field555 < 1) {
					++field555;
					class166.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var13 == 29) {
					class166.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var13 != 69) {
						ReflectionCheck.getLoginError(var13);
						return;
					}

					class166.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (LoginState.UNMAPPED_21 == HttpRequestTask.loginState) {
				SoundSystem.field293 = true;
				class324.method6405(class95.field1175);
				class464.updateGameState(0);
			}

			if (HttpRequestTask.loginState == LoginState.READ_DIGEST_PARSER_PACKET_SIZE && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				class421.field4705 = var2.readUnsignedShort();
				class166.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (HttpRequestTask.loginState == LoginState.SUBMIT_DIGEST_PARSER_TASK && var1.available() >= class421.field4705) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, class421.field4705);
				class6[] var30 = new class6[]{class6.field10};
				class6 var36 = var30[var2.readUnsignedByte()];

				try {
					switch(var36.field8) {
					case 0:
						class0 var32 = new class0();
						this.field666 = new class7(var2, var32);
						class166.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var17) {
					ReflectionCheck.getLoginError(22);
					return;
				}
			}

			if (HttpRequestTask.loginState == LoginState.WRITE_DIGEST_PARSER_RESULT && this.field666.method45()) {
				this.field584 = this.field666.method58();
				this.field666.method46();
				this.field666 = null;
				if (this.field584 == null) {
					ReflectionCheck.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var29 = new PacketBufferNode();
				} else {
					var29 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var29.clientPacket = null;
				var29.clientPacketLength = 0;
				var29.packetBuffer = new PacketBuffer(5000);
				var29.packetBuffer.writeByte(class327.field3572.field3575);
				var29.packetBuffer.writeShort(this.field584.offset);
				var29.packetBuffer.writeBuffer(this.field584);
				packetWriter.addNode(var29);
				packetWriter.flush();
				this.field584 = null;
				class166.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_STATE_11_PACKET_SIZE == HttpRequestTask.loginState && var1.available() > 0) {
				class357.field3782 = var1.readUnsignedByte();
				class166.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (LoginState.UNMAPPED_11 == HttpRequestTask.loginState && var1.available() >= class357.field3782) {
				var1.read(var2.array, 0, class357.field3782);
				var2.offset = 0;
				class166.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (LoginState.READ_PROFILE_TRANSFER_TIME == HttpRequestTask.loginState && var1.available() > 0) {
				field556 = (var1.readUnsignedByte() + 3) * 60;
				class166.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (HttpRequestTask.loginState == LoginState.PROFILE_TRANSFER) {
				field554 = 0;
				Login.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field556 / 60 + " seconds.");
				if (--field556 <= 0) {
					class166.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (LoginState.READ_ACCOUNT_INFO_PACKET_SIZE == HttpRequestTask.loginState) {
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var29 = new PacketBufferNode();
				} else {
					var29 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var29.clientPacket = null;
				var29.clientPacketLength = 0;
				var29.packetBuffer = new PacketBuffer(5000);
				var29.packetBuffer.writeByte(class327.field3577.field3575);
				var29.packetBuffer.writeShort(class327.field3577.field3576);
				class172.method3754(var29);
				packetWriter.addNode(var29);
				packetWriter.flush();
				class166.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (HttpRequestTask.loginState == LoginState.UNMAPPED && var1.available() >= 1) {
					PlayerCompositionColorTextureOverride.field1869 = var1.readUnsignedByte();
					if (PlayerCompositionColorTextureOverride.field1869 != class327.field3578.field3576) {
						ReflectionCheck.getLoginError(PlayerCompositionColorTextureOverride.field1869);
						return;
					}

					class166.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (HttpRequestTask.loginState == LoginState.READ_ACCOUNT_INFO && var1.available() >= PlayerCompositionColorTextureOverride.field1869) {
					boolean var39 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var40 = false;
					if (var39) {
						var15 = var2.readByteIsaac() << 24;
						var15 |= var2.readByteIsaac() << 16;
						var15 |= var2.readByteIsaac() << 8;
						var15 |= var2.readByteIsaac();
						class461.clientPreferences.put(Login.Login_username, var15);
					}

					if (Login_isUsernameRemembered) {
						class461.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						class461.clientPreferences.updateRememberedUsername((String)null);
					}

					AsyncRestClient.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field565 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					Player.method2610().method4518(this.https);
					class166.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (HttpRequestTask.loginState == LoginState.SET_SERVER_PROTOCOL && var1.available() >= packetWriter.serverPacketLength) {
					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method9895()) {
						var1.read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var31 = class310.ServerPacket_values();
					var15 = var2.readSmartByteShortIsaac();
					if (var15 < 0 || var15 >= var31.length) {
						throw new IOException("Invalid ServerProt: " + var15 + " at " + var2.offset);
					}

					packetWriter.serverPacket = var31[var15];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					var1.read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var35 = class1.client;
						JSObject.getWindow(var35).call("zap", (Object[])null);
					} catch (Throwable var16) {
					}

					class166.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS == HttpRequestTask.loginState) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method8668();
						class501.method9230();
						playerUpdateManager.updatePlayer(var2);
						ClanSettings.entity = AddRequestTask.localPlayer;
						class95.field1191 = -1;
						Message.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field528 = false;
					}

				} else {
					if (LoginState.UNMAPPED_17 == HttpRequestTask.loginState && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						SecureRandomFuture.field1019 = var2.readUnsignedShort();
						class166.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (HttpRequestTask.loginState == LoginState.UNMAPPED_18 && var1.available() >= SecureRandomFuture.field1019) {
						var2.offset = 0;
						var1.read(var2.array, 0, SecureRandomFuture.field1019);
						var2.offset = 0;
						String var33 = var2.readStringCp1252NullTerminated();
						String var38 = var2.readStringCp1252NullTerminated();
						String var37 = var2.readStringCp1252NullTerminated();
						Login.setLoginResponseString(var33, var38, var37);
						class464.updateGameState(10);
						if (field558.method10223()) {
							LoginState.updateLoginIndex(9);
						}
					}

					if (HttpRequestTask.loginState != LoginState.UNMAPPED_19) {
						++field554;
						if (field554 > 2000) {
							if (field555 < 1) {
								if (class30.worldPort == BuddyRankComparator.currentPort) {
									BuddyRankComparator.currentPort = WorldMapRenderer.js5Port;
								} else {
									BuddyRankComparator.currentPort = class30.worldPort;
								}

								++field555;
								class166.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								ReflectionCheck.getLoginError(-3);
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
							timer.method8684();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1492 = null;
							packetWriter.field1488 = null;
							packetWriter.field1493 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1489 = 0;
							rebootTimer = 0;
							menu.menuOptionsCount = 0;
							isMenuOpen = false;
							minimapState = 0;
							destinationX = 0;
							ClientPreferences.topLevelWorldView.method2856();
							ItemContainer.itemContainers = new NodeHashTable(32);
							class464.updateGameState(30);

							for (var15 = 0; var15 < 100; ++var15) {
								validRootWidgets[var15] = true;
							}

							if (packetWriter != null && packetWriter.isaacCipher != null) {
								var29 = class141.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, packetWriter.isaacCipher);
								var29.packetBuffer.writeByte(Script.getWindowedMode());
								var29.packetBuffer.writeShort(class154.canvasWidth);
								var29.packetBuffer.writeShort(UrlRequester.canvasHeight);
								packetWriter.addNode(var29);
							}

							playerUpdateManager.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var24) {
			if (field555 < 1) {
				if (class30.worldPort == BuddyRankComparator.currentPort) {
					BuddyRankComparator.currentPort = WorldMapRenderer.js5Port;
				} else {
					BuddyRankComparator.currentPort = class30.worldPort;
				}

				++field555;
				class166.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				ReflectionCheck.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "13"
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
			class375.method7427();
		} else {
			if (!isMenuOpen) {
				HealthBarDefinition.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last();
					boolean var34;
					if (var2 == null) {
						var34 = false;
					} else {
						var34 = true;
					}

					int var3;
					PacketBufferNode var35;
					if (!var34) {
						PacketBufferNode var16;
						int var17;
						if (timer.field4879) {
							var16 = class141.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
							var16.packetBuffer.writeByte(0);
							var17 = var16.packetBuffer.offset;
							timer.write(var16.packetBuffer);
							var16.packetBuffer.writeLengthByte(var16.packetBuffer.offset - var17);
							packetWriter.addNode(var16);
							timer.method8669();
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
						PacketBuffer var10000;
						synchronized(LoginScreenAnimation.mouseRecorder.lock) {
							if (!field531) {
								LoginScreenAnimation.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || LoginScreenAnimation.mouseRecorder.index >= 40) {
								var35 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < LoginScreenAnimation.mouseRecorder.index && (var35 == null || var35.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = LoginScreenAnimation.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = LoginScreenAnimation.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field648 || var8 != field535) {
										if (var35 == null) {
											var35 = class141.getPacketBufferNode(ClientPacket.field3349, packetWriter.isaacCipher);
											var35.packetBuffer.writeByte(0);
											var3 = var35.packetBuffer.offset;
											var10000 = var35.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (-1L != field536) {
											var10 = var9 - field648;
											var11 = var8 - field535;
											var12 = (int)((LoginScreenAnimation.mouseRecorder.millis[var7] - field536) / 20L);
											var5 = (int)((long)var5 + (LoginScreenAnimation.mouseRecorder.millis[var7] - field536) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field648 = var9;
										field535 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var35.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var35.packetBuffer.writeByte(var12 + 128);
											var35.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var35.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var35.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var35.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var35.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var35.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var35.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field536 = LoginScreenAnimation.mouseRecorder.millis[var7];
									}
								}

								if (var35 != null) {
									var35.packetBuffer.writeLengthByte(var35.packetBuffer.offset - var3);
									var7 = var35.packetBuffer.offset;
									var35.packetBuffer.offset = var3;
									var35.packetBuffer.writeByte(var5 / var6);
									var35.packetBuffer.writeByte(var5 % var6);
									var35.packetBuffer.offset = var7;
									packetWriter.addNode(var35);
								}

								if (var4 >= LoginScreenAnimation.mouseRecorder.index) {
									LoginScreenAnimation.mouseRecorder.index = 0;
								} else {
									MouseRecorder var59 = LoginScreenAnimation.mouseRecorder;
									var59.index -= var4;
									System.arraycopy(LoginScreenAnimation.mouseRecorder.xs, var4, LoginScreenAnimation.mouseRecorder.xs, 0, LoginScreenAnimation.mouseRecorder.index);
									System.arraycopy(LoginScreenAnimation.mouseRecorder.ys, var4, LoginScreenAnimation.mouseRecorder.ys, 0, LoginScreenAnimation.mouseRecorder.index);
									System.arraycopy(LoginScreenAnimation.mouseRecorder.millis, var4, LoginScreenAnimation.mouseRecorder.millis, 0, LoginScreenAnimation.mouseRecorder.index);
								}
							}
						}

						if (MouseHandler.MouseHandler_lastButton == 1 || !Varcs.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var18 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
							if (var18 > 32767L) {
								var18 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > UrlRequester.canvasHeight) {
								var3 = UrlRequester.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class154.canvasWidth) {
								var4 = class154.canvasWidth;
							}

							var5 = (int)var18;
							PacketBufferNode var20 = class141.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
							var20.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var20.packetBuffer.writeShort(var4);
							var20.packetBuffer.writeShort(var3);
							packetWriter.addNode(var20);
						}

						if (mouseWheelRotation != 0) {
							var16 = class141.getPacketBufferNode(ClientPacket.field3377, packetWriter.isaacCipher);
							var16.packetBuffer.writeShort(mouseWheelRotation);
							packetWriter.addNode(var16);
						}

						if (indexCheck.field2987 > 0) {
							var16 = class141.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
							var16.packetBuffer.writeShort(0);
							var17 = var16.packetBuffer.offset;
							long var21 = WorldMapElement.method3843();

							for (var5 = 0; var5 < indexCheck.field2987; ++var5) {
								long var23 = var21 - field748;
								if (var23 > 16777215L) {
									var23 = 16777215L;
								}

								field748 = var21;
								var16.packetBuffer.writeByteAdd(indexCheck.field2980[var5]);
								var16.packetBuffer.method10106((int)var23);
							}

							var16.packetBuffer.writeLengthShort(var16.packetBuffer.offset - var17);
							packetWriter.addNode(var16);
						}

						if (field620 > 0) {
							--field620;
						}

						if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
							field621 = true;
						}

						if (field621 && field620 <= 0) {
							field620 = 20;
							field621 = false;
							var16 = class141.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
							var16.packetBuffer.writeShortLE(camAngleX);
							var16.packetBuffer.writeShortLE(camAngleY);
							packetWriter.addNode(var16);
						}

						if (class177.hasFocus && !hadFocus) {
							hadFocus = true;
							var16 = class141.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var16.packetBuffer.writeByte(1);
							packetWriter.addNode(var16);
						}

						if (!class177.hasFocus && hadFocus) {
							hadFocus = false;
							var16 = class141.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var16.packetBuffer.writeByte(0);
							packetWriter.addNode(var16);
						}

						if (UserComparator8.worldMap != null) {
							UserComparator8.worldMap.method9344();
						}

						if (class173.ClanChat_inClanChat) {
							if (class168.friendsChat != null) {
								class168.friendsChat.sort();
							}

							class7.method53();
							class173.ClanChat_inClanChat = false;
						}

						WorldView var36;
						Iterator var44;
						if (class6.field13) {
							var44 = worldViewManager.iterator();

							while (var44.hasNext()) {
								var36 = (WorldView)var44.next();

								for (var3 = 0; var3 < playerUpdateManager.playerCount; ++var3) {
									Player var25 = ClientPreferences.topLevelWorldView.players[playerUpdateManager.playerIndices[var3]];
									if (var25 != null) {
										var25.method2555();
									}
								}
							}

							class6.field13 = false;
						}

						KeyHandler.method340();
						if (gameState != 30) {
							return;
						}

						var44 = worldViewManager.iterator();

						while (var44.hasNext()) {
							var36 = (WorldView)var44.next();
							class330.method6428(var36);
						}

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) {
							var10002 = queuedSoundEffectDelays[var1]--;
							if (queuedSoundEffectDelays[var1] >= -10) {
								SoundEffect var37 = soundEffects[var1];
								if (var37 == null) {
									var10000 = null;
									var37 = SoundEffect.readSoundEffect(class60.soundEffectsArchive, soundEffectIds[var1], 0);
									if (var37 == null) {
										continue;
									}

									int[] var60 = queuedSoundEffectDelays;
									var60[var1] += var37.calculateDelay();
									soundEffects[var1] = var37;
								}

								if (queuedSoundEffectDelays[var1] < 0) {
									if (soundLocations[var1] != 0) {
										var4 = (soundLocations[var1] & 255) * 128;
										var5 = soundLocations[var1] >> 16 & 255;
										var6 = Math.abs(Coord.method6797(var5) - AddRequestTask.localPlayer.x);
										var7 = soundLocations[var1] >> 8 & 255;
										var8 = Math.abs(Coord.method6797(var7) - AddRequestTask.localPlayer.y);
										var9 = Math.max(var6 + var8 - 128, 0);
										var10 = Math.max(((field627[var1] & 31) - 1) * 128, 0);
										if (var9 >= var4) {
											queuedSoundEffectDelays[var1] = -100;
											continue;
										}

										float var43 = var10 < var4 ? Math.min(Math.max((float)(var4 - var9) / (float)(var4 - var10), 0.0F), 1.0F) : 1.0F;
										var3 = (int)(var43 * (float)class461.clientPreferences.getAreaSoundEffectsVolume());
									} else {
										var3 = class461.clientPreferences.getSoundEffectsVolume();
									}

									if (var3 > 0) {
										RawSound var48 = var37.toRawSound().resample(DevicePcmPlayerProvider.decimator);
										RawPcmStream var26 = RawPcmStream.createRawPcmStream(var48, 100, var3);
										var26.setNumLoops(queuedSoundEffectLoops[var1] - 1);
										GameEngine.pcmStreamMixer.addSubStream(var26);
									}

									queuedSoundEffectDelays[var1] = -100;
								}
							} else {
								--soundEffectCount;

								for (var17 = var1; var17 < soundEffectCount; ++var17) {
									soundEffectIds[var17] = soundEffectIds[var17 + 1];
									soundEffects[var17] = soundEffects[var17 + 1];
									queuedSoundEffectLoops[var17] = queuedSoundEffectLoops[var17 + 1];
									queuedSoundEffectDelays[var17] = queuedSoundEffectDelays[var17 + 1];
									soundLocations[var17] = soundLocations[var17 + 1];
									field627[var17] = field627[var17 + 1];
								}

								--var1;
							}
						}

						if (playingJingle && !HitSplatDefinition.method4158()) {
							if (class461.clientPreferences.getMusicVolume() != 0 && FileSystem.method4494()) {
								class132.method3248(HorizontalAlignment.archive6, class461.clientPreferences.getMusicVolume());
							}

							playingJingle = false;
						}

						++packetWriter.field1489;
						if (packetWriter.field1489 > 750) {
							class375.method7427();
							return;
						}

						StudioGame.method7437();
						class146.method3428();
						class7.method52();
						class190.method3950();
						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var45 = class275.mousedOverWidgetIf1;
						Widget var38 = class7.field22;
						class275.mousedOverWidgetIf1 = null;
						class7.field22 = null;
						draggedOnWidget = null;
						field700 = false;
						field697 = false;
						field514 = 0;

						while (indexCheck.method5573() && field514 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field2991 == 66) {
								StringBuilder var49 = new StringBuilder();

								Message var46;
								for (Iterator var51 = Messages.Messages_hashTable.iterator(); var51.hasNext(); var49.append(var46.text).append('\n')) {
									var46 = (Message)var51.next();
									if (var46.sender != null && !var46.sender.isEmpty()) {
										var49.append(var46.sender).append(':');
									}
								}

								String var27 = var49.toString();
								class1.client.method506(var27);
							} else if (oculusOrbState != 1 || indexCheck.field2990 <= 0) {
								field752[field514] = indexCheck.field2991;
								field533[field514] = indexCheck.field2990;
								++field514;
							}
						}

						if (InterfaceParent.method2509() && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var3 = AddRequestTask.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != AddRequestTask.localPlayer.plane) {
								class537.method9777(AddRequestTask.localPlayer.pathX[0] + ClientPreferences.topLevelWorldView.baseX, AddRequestTask.localPlayer.pathY[0] + ClientPreferences.topLevelWorldView.baseY, var3, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class338.updateRootInterface(rootInterface, 0, 0, class154.canvasWidth, UrlRequester.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var50;
							Widget var52;
							ScriptEvent var54;
							do {
								var54 = (ScriptEvent)scriptEvents2.removeLast();
								if (var54 == null) {
									while (true) {
										do {
											var54 = (ScriptEvent)scriptEvents3.removeLast();
											if (var54 == null) {
												while (true) {
													do {
														var54 = (ScriptEvent)scriptEvents.removeLast();
														if (var54 == null) {
															boolean var40 = false;

															while (true) {
																class268 var53 = (class268)field726.removeLast();
																if (var53 == null) {
																	if (!var40 && MouseHandler.MouseHandler_lastButton == 1) {
																		field679.method5545();
																	}

																	this.menu();
																	if (UserComparator8.worldMap != null) {
																		UserComparator8.worldMap.method9342(ClientPreferences.topLevelWorldView.plane, (ClanSettings.entity.getX() >> 7) + ClientPreferences.topLevelWorldView.baseX, (ClanSettings.entity.getY() >> 7) + ClientPreferences.topLevelWorldView.baseY, false);
																		UserComparator8.worldMap.loadCache();
																	}

																	if (clickedWidget != null) {
																		this.method1315();
																	}

																	boolean var39 = false;

																	for (var5 = 0; var5 < ClientPreferences.topLevelWorldView.worldEntityCount; ++var5) {
																		WorldEntity var47 = ClientPreferences.topLevelWorldView.worldEntities[ClientPreferences.topLevelWorldView.worldEntityIndices[var5]];
																		WorldView var28 = var47.worldView;
																		Scene var29 = var28.scene;
																		if (var47 != null && var29.shouldSendWalk()) {
																			if (!var39) {
																				var9 = var29.baseX;
																				var10 = var29.baseY;
																				PacketBufferNode var30 = class141.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																				var30.packetBuffer.writeByte(5);
																				var30.packetBuffer.writeShort(var10 + var28.baseY);
																				var30.packetBuffer.writeByteSub(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																				var30.packetBuffer.writeShortAdd(var9 + var28.baseX);
																				packetWriter.addNode(var30);
																				var39 = true;
																				mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																				mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																				mouseCrossColor = 1;
																				mouseCrossState = 0;
																				destinationX = var9;
																				destinationY = var10;
																			}

																			var29.method4952();
																		}
																	}

																	if (!var39 && ClientPreferences.topLevelWorldView.scene.shouldSendWalk()) {
																		var5 = ClientPreferences.topLevelWorldView.scene.baseX;
																		var6 = ClientPreferences.topLevelWorldView.scene.baseY;
																		PacketBufferNode var55 = class141.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																		var55.packetBuffer.writeByte(5);
																		var55.packetBuffer.writeShort(var6 + ClientPreferences.topLevelWorldView.baseY);
																		var55.packetBuffer.writeByteSub(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																		var55.packetBuffer.writeShortAdd(var5 + ClientPreferences.topLevelWorldView.baseX);
																		packetWriter.addNode(var55);
																		ClientPreferences.topLevelWorldView.scene.method4952();
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																		mouseCrossColor = 1;
																		mouseCrossState = 0;
																		destinationX = var5;
																		destinationY = var6;
																	}

																	if (var39) {
																		ClientPreferences.topLevelWorldView.scene.method4952();
																	}

																	if (var45 != class275.mousedOverWidgetIf1) {
																		if (var45 != null) {
																			SecureRandomCallable.invalidateWidget(var45);
																		}

																		if (class275.mousedOverWidgetIf1 != null) {
																			SecureRandomCallable.invalidateWidget(class275.mousedOverWidgetIf1);
																		}
																	}

																	if (var38 != class7.field22 && field766 == field672) {
																		if (var38 != null) {
																			SecureRandomCallable.invalidateWidget(var38);
																		}

																		if (class7.field22 != null) {
																			SecureRandomCallable.invalidateWidget(class7.field22);
																		}
																	}

																	if (class7.field22 != null) {
																		if (field766 < field672) {
																			++field766;
																			if (field672 == field766) {
																				SecureRandomCallable.invalidateWidget(class7.field22);
																			}
																		}
																	} else if (field766 > 0) {
																		--field766;
																	}

																	if (oculusOrbState == 0) {
																		var5 = ClanSettings.entity.getX();
																		var6 = ClanSettings.entity.getY();
																		if (field649 != -1) {
																			Player var56 = AddRequestTask.localPlayer.worldView.players[field649];
																			if (var56 != null) {
																				Coord var57 = var56.method2646(AddRequestTask.localPlayer.worldView);
																				var5 = var57.x;
																				var6 = var57.y;
																			}
																		}

																		var7 = ClanSettings.entity.getPlane();
																		if (UserComparator6.oculusOrbFocalPointX - var5 < -500 || UserComparator6.oculusOrbFocalPointX - var5 > 500 || AsyncHttpResponse.oculusOrbFocalPointY - var6 < -500 || AsyncHttpResponse.oculusOrbFocalPointY - var6 > 500) {
																			UserComparator6.oculusOrbFocalPointX = var5;
																			AsyncHttpResponse.oculusOrbFocalPointY = var6;
																		}

																		if (var5 != UserComparator6.oculusOrbFocalPointX) {
																			UserComparator6.oculusOrbFocalPointX += (var5 - UserComparator6.oculusOrbFocalPointX) / 16;
																		}

																		if (var6 != AsyncHttpResponse.oculusOrbFocalPointY) {
																			AsyncHttpResponse.oculusOrbFocalPointY += (var6 - AsyncHttpResponse.oculusOrbFocalPointY) / 16;
																		}

																		var8 = UserComparator6.oculusOrbFocalPointX >> 7;
																		var9 = AsyncHttpResponse.oculusOrbFocalPointY >> 7;
																		var10 = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, UserComparator6.oculusOrbFocalPointX, AsyncHttpResponse.oculusOrbFocalPointY, var7);
																		var11 = 0;
																		if (var8 > 3 && var9 > 3 && var8 < 100 && var9 < 100) {
																			for (var12 = var8 - 4; var12 <= var8 + 4; ++var12) {
																				for (int var31 = var9 - 4; var31 <= var9 + 4; ++var31) {
																					int var14 = var7;
																					if (var7 < 3 && (ClientPreferences.topLevelWorldView.tileSettings[1][var12][var31] & 2) == 2) {
																						var14 = var7 + 1;
																					}

																					int var15 = var10 - ClientPreferences.topLevelWorldView.tileHeights[var14][var12][var31];
																					if (var15 > var11) {
																						var11 = var15;
																					}
																				}
																			}
																		}

																		var12 = var11 * 192;
																		if (var12 > 98048) {
																			var12 = 98048;
																		}

																		if (var12 < 32768) {
																			var12 = 32768;
																		}

																		if (var12 > field760) {
																			field760 += (var12 - field760) / 24;
																		} else if (var12 < field760) {
																			field760 += (var12 - field760) / 80;
																		}

																		class147.oculusOrbFocalPointZ = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, var5, var6, var7) - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		WorldMapAreaData.method6283();
																		short var42 = -1;
																		if (indexCheck.isValidIndexInRange(33)) {
																			var42 = 0;
																		} else if (indexCheck.isValidIndexInRange(49)) {
																			var42 = 1024;
																		}

																		if (indexCheck.isValidIndexInRange(48)) {
																			if (var42 == 0) {
																				var42 = 1792;
																			} else if (var42 == 1024) {
																				var42 = 1280;
																			} else {
																				var42 = 1536;
																			}
																		} else if (indexCheck.isValidIndexInRange(50)) {
																			if (var42 == 0) {
																				var42 = 256;
																			} else if (var42 == 1024) {
																				var42 = 768;
																			} else {
																				var42 = 512;
																			}
																		}

																		byte var41 = 0;
																		if (indexCheck.isValidIndexInRange(35)) {
																			var41 = -1;
																		} else if (indexCheck.isValidIndexInRange(51)) {
																			var41 = 1;
																		}

																		var7 = 0;
																		if (var42 >= 0 || var41 != 0) {
																			var7 = indexCheck.isValidIndexInRange(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var7 *= 16;
																			field664 = var42;
																			field630 = var41;
																		}

																		if (field613 < var7) {
																			field613 += var7 / 8;
																			if (field613 > var7) {
																				field613 = var7;
																			}
																		} else if (field613 > var7) {
																			field613 = field613 * 9 / 10;
																		}

																		if (field613 > 0) {
																			var8 = field613 / 16;
																			if (field664 >= 0) {
																				var5 = field664 - class267.cameraYaw & 2047;
																				var9 = Rasterizer3D.Rasterizer3D_sine[var5];
																				var10 = Rasterizer3D.Rasterizer3D_cosine[var5];
																				UserComparator6.oculusOrbFocalPointX += var9 * var8 / 65536;
																				AsyncHttpResponse.oculusOrbFocalPointY += var8 * var10 / 65536;
																			}

																			if (field630 != 0) {
																				class147.oculusOrbFocalPointZ += var8 * field630;
																				if (class147.oculusOrbFocalPointZ > 0) {
																					class147.oculusOrbFocalPointZ = 0;
																				}
																			}
																		} else {
																			field664 = -1;
																			field630 = -1;
																		}

																		if (indexCheck.isValidIndexInRange(13)) {
																			packetWriter.addNode(class141.getPacketBufferNode(ClientPacket.FREECAM_EXIT, packetWriter.isaacCipher));
																			oculusOrbState = 0;
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && Varcs.mouseCam) {
																		var5 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																		camAngleDX = var5 * 2;
																		mouseCamClickedY = var5 != -1 && var5 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
																		var6 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																		camAngleDY = var6 * 2;
																		mouseCamClickedX = var6 != -1 && var6 != 1 ? (MouseHandler.MouseHandler_x + mouseCamClickedX) / 2 : MouseHandler.MouseHandler_x;
																	} else {
																		if (indexCheck.isValidIndexInRange(96)) {
																			camAngleDY += (-24 - camAngleDY) / 2;
																		} else if (indexCheck.isValidIndexInRange(97)) {
																			camAngleDY += (24 - camAngleDY) / 2;
																		} else {
																			camAngleDY /= 2;
																		}

																		if (indexCheck.isValidIndexInRange(98)) {
																			camAngleDX += (12 - camAngleDX) / 2;
																		} else if (indexCheck.isValidIndexInRange(99)) {
																			camAngleDX += (-12 - camAngleDX) / 2;
																		} else {
																			camAngleDX /= 2;
																		}

																		mouseCamClickedY = MouseHandler.MouseHandler_y;
																		mouseCamClickedX = MouseHandler.MouseHandler_x;
																	}

																	camAngleY = camAngleDY / 2 + camAngleY & 2047;
																	camAngleX += camAngleDX / 2;
																	if (camAngleX < 128) {
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) {
																		camAngleX = 383;
																	}

																	if (field779) {
																		Player.method2609(HttpAuthenticationHeader.field4918, Player.field1170, Strings.field4450);
																		KeyHandler.method374(SoundCache.field303, class53.field353);
																		if (class301.cameraX == HttpAuthenticationHeader.field4918 && Player.field1170 == ArchiveLoader.cameraY && Strings.field4450 == class33.cameraZ && class463.cameraPitch == SoundCache.field303 && class267.cameraYaw == class53.field353) {
																			field779 = false;
																			isCameraLocked = false;
																			field773 = false;
																			field774 = false;
																			HorizontalAlignment.field1989 = 0;
																			class28.field1287 = 0;
																			class380.field4133 = 0;
																			HttpMethod.field29 = 0;
																			class224.field2411 = 0;
																			class27.field117 = 0;
																			ObjectComposition.field2214 = 0;
																			DynamicObject.field1049 = 0;
																			class1.field3 = 0;
																			class7.field21 = 0;
																			field776 = null;
																			field778 = null;
																			field777 = null;
																		}
																	} else if (isCameraLocked) {
																		class139.method3375();
																	}

																	for (var5 = 0; var5 < 5; ++var5) {
																		var10002 = field518[var5]++;
																	}

																	class229.varcs.tryWrite();
																	var5 = class143.method3390();
																	var6 = GameEngine.keyHandler.method369();
																	PacketBufferNode var58;
																	if (var5 > 15000 && var6 > 15000) {
																		logoutTimer = 250;
																		class537.method9770(14500);
																		var58 = class141.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var58);
																	}

																	class425.friendSystem.processFriendUpdates();
																	class310.method6340();
																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var58 = class141.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var58);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var32) {
																		class375.method7427();
																	}

																	Player.method2610().method4547();
																	return;
																}

																if (var53.field2969.type == 12) {
																	var40 = true;
																}

																class420.method8018(var53);
															}
														}

														var50 = var54.widget;
														if (var50.childIndex < 0) {
															break;
														}

														var52 = TaskHandler.widgetDefinition.method6841(var50.parentId);
													} while(var52 == null || var52.children == null || var50.childIndex >= var52.children.length || var50 != var52.children[var50.childIndex]);

													class215.runScriptEvent(var54);
												}
											}

											var50 = var54.widget;
											if (var50.childIndex < 0) {
												break;
											}

											var52 = TaskHandler.widgetDefinition.method6841(var50.parentId);
										} while(var52 == null || var52.children == null || var50.childIndex >= var52.children.length || var50 != var52.children[var50.childIndex]);

										class215.runScriptEvent(var54);
									}
								}

								var50 = var54.widget;
								if (var50.childIndex < 0) {
									break;
								}

								var52 = TaskHandler.widgetDefinition.method6841(var50.parentId);
							} while(var52 == null || var52.children == null || var50.childIndex >= var52.children.length || var50 != var52.children[var50.childIndex]);

							class215.runScriptEvent(var54);
						}
					}

					var35 = class141.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var35.packetBuffer.writeByte(0);
					var3 = var35.packetBuffer.offset;
					class419.performReflectionCheck(var35.packetBuffer);
					var35.packetBuffer.writeLengthByte(var35.packetBuffer.offset - var3);
					packetWriter.addNode(var35);
				}
			}
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "338596605"
	)
	public void vmethod6713(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && class461.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = class141.getPacketBufferNode(ClientPacket.field3365, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-76"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class154.canvasWidth;
		int var2 = UrlRequester.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class461.clientPreferences != null) {
			try {
				class26.method376(class1.client, "resize", new Object[]{Script.getWindowedMode()});
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-972488886"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (TaskHandler.widgetDefinition.loadInterface(var1)) {
				class6.drawModelComponents(TaskHandler.widgetDefinition.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field731[var1] = true;
			}

			field732[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field593 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			InterfaceParent.drawWidgets(rootInterface, 0, 0, class154.canvasWidth, UrlRequester.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				WorldMapData_0.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				WorldMapData_0.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				UserComparator10.method3227(viewportX, viewportY);
			}
		} else {
			menu.method10547();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field732[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field731[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		ClanChannelMember.method3493(ClientPreferences.topLevelWorldView.plane, AddRequestTask.localPlayer.x, AddRequestTask.localPlayer.y, graphicsCycle);
		graphicsCycle = 0;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Lel;II)Z",
		garbageValue = "-433788480"
	)
	boolean method1592(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			class168.friendsChat = null;
		} else {
			if (class168.friendsChat == null) {
				class168.friendsChat = new FriendsChat(class28.loginType, class1.client);
			}

			class168.friendsChat.method8819(var1.packetBuffer, var2);
		}

		class106.method2951();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)Z",
		garbageValue = "-515103935"
	)
	boolean method1308(PacketWriter var1) {
		if (class168.friendsChat != null) {
			class168.friendsChat.method8828(var1.packetBuffer);
		}

		class106.method2951();
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lel;B)Z",
		garbageValue = "0"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var32;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1484) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1489 = 0;
						var1.field1484 = false;
					}

					var3.offset = 0;
					if (var3.method9895()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1489 = 0;
					}

					var1.field1484 = true;
					ServerPacket[] var4 = class310.ServerPacket_values();
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
				var1.field1489 = 0;
				timer.method8665();
				var1.field1493 = var1.field1488;
				var1.field1488 = var1.field1492;
				var1.field1492 = var1.serverPacket;
				InterfaceParent var57;
				int var71;
				if (ServerPacket.field3539 == var1.serverPacket) {
					var71 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntIME();
					var6 = var3.readUnsignedByteSub();
					var57 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var57 != null) {
						class145.closeInterface(var57, var71 != var57.group);
					}

					UserComparator10.openInterface(var5, var71, var6);
					var1.serverPacket = null;
					return true;
				}

				int var22;
				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readInt();
					var22 = var3.readUnsignedByteAdd();
					var71 = var3.readUnsignedShortAdd();
					Player var64;
					if (var71 == localPlayerIndex) {
						var64 = AddRequestTask.localPlayer;
					} else {
						var64 = class162.worldView.players[var71];
					}

					if (var64 != null) {
						var64.updateSpotAnimation(var22, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				int var13;
				long var23;
				long var25;
				String var27;
				String var51;
				boolean var66;
				if (ServerPacket.field3453 == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var23 = (long)var3.readUnsignedShort();
					var25 = (long)var3.readMedium();
					PlayerType var61 = (PlayerType)ArchiveDiskAction.findEnumerated(class188.PlayerType_values(), var3.readUnsignedByte());
					long var10 = var25 + (var23 << 32);
					var66 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (crossWorldMessageIds[var13] == var10) {
							var66 = true;
							break;
						}
					}

					if (class425.friendSystem.isIgnored(new Username(var51, class28.loginType))) {
						var66 = true;
					}

					if (!var66 && field728 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var10;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var27 = AbstractFont.escapeBrackets(class162.method3641(class501.method9239(var3)));
						byte var69;
						if (var61.isPrivileged) {
							var69 = 7;
						} else {
							var69 = 3;
						}

						if (var61.modIcon != -1) {
							StructComposition.addGameMessage(var69, class201.method4066(var61.modIcon) + var51, var27);
						} else {
							StructComposition.addGameMessage(var69, var51, var27);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var28;
				long var29;
				if (ServerPacket.field3535 == var1.serverPacket) {
					var71 = var3.readUnsignedShort();
					if (var71 == 65535) {
						var71 = -1;
					}

					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedIntME();
					var22 = var3.readInt();

					for (var28 = var71; var28 <= var5; ++var28) {
						var29 = ((long)var6 << 32) + (long)var28;
						Node var65 = widgetFlags.get(var29);
						if (var65 != null) {
							var65.remove();
						}

						widgetFlags.put(new IntegerNode(var22), var29);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3563 == var1.serverPacket) {
					class73.field893 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				Widget var74;
				if (ServerPacket.field3489 == var1.serverPacket) {
					var71 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedIntIME();
					var74 = TaskHandler.widgetDefinition.method6841(var5);
					var74.field3910.method6894(var71);
					SecureRandomCallable.invalidateWidget(var74);
					var1.serverPacket = null;
					return true;
				}

				Widget var58;
				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var71 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntLE();
					InterfaceParent var95 = (InterfaceParent)interfaceParents.get((long)var71);
					var57 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var57 != null) {
						class145.closeInterface(var57, var95 == null || var95.group != var57.group);
					}

					if (var95 != null) {
						var95.remove();
						interfaceParents.put(var95, (long)var5);
					}

					var58 = TaskHandler.widgetDefinition.method6841(var71);
					if (var58 != null) {
						SecureRandomCallable.invalidateWidget(var58);
					}

					var58 = TaskHandler.widgetDefinition.method6841(var5);
					if (var58 != null) {
						SecureRandomCallable.invalidateWidget(var58);
						AsyncHttpResponse.revalidateWidgetScroll(TaskHandler.widgetDefinition.Widget_interfaceComponents[var58.id >>> 16], var58, true);
					}

					if (rootInterface != -1) {
						class147.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3527 == var1.serverPacket) {
					GrandExchangeOfferTotalQuantityComparator.method7663();
					weight = var3.readShort();
					field720 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				boolean var96;
				if (ServerPacket.field3531 == var1.serverPacket) {
					var96 = var3.readBoolean();
					if (var96) {
						if (class389.field4542 == null) {
							class389.field4542 = new class401();
						}
					} else {
						class389.field4542 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					PcmPlayer.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field779 = false;
					isCameraLocked = false;
					field773 = false;
					field774 = false;
					HorizontalAlignment.field1989 = 0;
					class28.field1287 = 0;
					class380.field4133 = 0;
					field775 = false;
					HttpMethod.field29 = 0;
					class224.field2411 = 0;
					class27.field117 = 0;
					ObjectComposition.field2214 = 0;
					DynamicObject.field1049 = 0;
					class1.field3 = 0;
					class7.field21 = 0;
					field776 = null;
					field778 = null;
					field777 = null;

					for (var71 = 0; var71 < 5; ++var71) {
						field577[var71] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3499 == var1.serverPacket) {
					var71 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					class277.performPlayerAnimation(AddRequestTask.localPlayer, var5, var71);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3554 == var1.serverPacket) {
					Actor.method2650(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3562 == var1.serverPacket) {
					class77.field941 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
					var71 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var71] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var71] = new GrandExchangeOffer(var3, false);
					}

					field718 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByteNeg();
					tradeChatMode = var3.readUnsignedByteAdd();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3501 == var1.serverPacket) {
					GrandExchangeOfferTotalQuantityComparator.method7663();
					runEnergy = var3.readUnsignedShort();
					field720 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				Widget var7;
				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var71 = var3.readShortLE();
					var5 = var3.readUnsignedIntIME();
					var6 = var3.method9972();
					var7 = TaskHandler.widgetDefinition.method6841(var5);
					if (var6 != var7.rawX || var71 != var7.rawY || var7.xAlignment != 0 || var7.yAlignment != 0) {
						var7.rawX = var6;
						var7.rawY = var71;
						var7.xAlignment = 0;
						var7.yAlignment = 0;
						SecureRandomCallable.invalidateWidget(var7);
						this.alignWidget(var7);
						if (var7.type == 0) {
							AsyncHttpResponse.revalidateWidgetScroll(TaskHandler.widgetDefinition.Widget_interfaceComponents[var5 >> 16], var7, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3481 == var1.serverPacket) {
					if (WorldMapData_0.field3064 == null) {
						WorldMapData_0.field3064 = new class489(ApproximateRouteStrategy.field477);
					}

					class559 var55 = ApproximateRouteStrategy.field477.method9150(var3);
					WorldMapData_0.field3064.field5079.vmethod9621(var55.field5479, var55.field5480);
					field711[++field712 - 1 & 31] = var55.field5479;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3558 == var1.serverPacket) {
					var71 = var3.readUnsignedByte();
					AsyncRestClient.method172(var71);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3463 == var1.serverPacket && isCameraLocked) {
					field779 = true;
					field774 = false;
					field773 = false;

					for (var71 = 0; var71 < 5; ++var71) {
						field577[var71] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3475 == var1.serverPacket) {
					GrandExchangeOfferTotalQuantityComparator.method7663();
					var71 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedByteNeg();
					var6 = var3.readUnsignedByte();
					experience[var6] = var71;
					currentLevels[var6] = var5;
					levels[var6] = 1;
					field662[var6] = var5;

					for (var22 = 0; var22 < 98; ++var22) {
						if (var71 >= Skills.Skills_experienceTable[var22]) {
							levels[var6] = var22 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var71 = 0; var71 < VarpDefinition.field1888; ++var71) {
						VarpDefinition var86 = UserComparator9.VarpDefinition_get(var71);
						if (var86 != null) {
							Varps.Varps_temp[var71] = 0;
							Varps.Varps_main[var71] = 0;
						}
					}

					GrandExchangeOfferTotalQuantityComparator.method7663();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3553 == var1.serverPacket) {
					var71 = var3.readUnsignedShortAdd();
					var22 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedShortAdd();
					class164.method3669(var71, var5, var6, var22);
					var1.serverPacket = null;
					return true;
				}

				NPC var62;
				if (ServerPacket.field3547 == var1.serverPacket) {
					var71 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					short var70 = (short)var3.method9972();
					var22 = var3.readUnsignedByteAdd();
					var62 = class162.worldView.npcs[var5];
					if (var62 != null) {
						var62.method2883(var22, var71, var70);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3503 == var1.serverPacket) {
					class166.method3682(class162.worldView, var3);
					var1.serverPacket = null;
					return true;
				}

				Widget var80;
				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var71 = var3.readInt();
					var80 = TaskHandler.widgetDefinition.method6841(var71);

					for (var6 = 0; var6 < var80.itemIds.length; ++var6) {
						var80.itemIds[var6] = -1;
						var80.itemIds[var6] = 0;
					}

					SecureRandomCallable.invalidateWidget(var80);
					var1.serverPacket = null;
					return true;
				}

				int var12;
				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				int var33;
				int var34;
				int var35;
				int var68;
				byte var83;
				byte var91;
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var68 = var3.readUnsignedByteAdd() * 4;
					var13 = var3.readUnsignedByte() * 4;
					var91 = var3.readByteAdd();
					var17 = var3.readUnsignedByteAdd();
					var15 = var3.readUnsignedShortLE();
					var6 = var3.method9976();
					var71 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var22 = var71 + (var6 >> 4 & 7);
					var28 = var5 + (var6 & 7);
					var16 = var3.readUnsignedShortAddLE();
					var12 = var3.readUnsignedShort();
					var83 = var3.readByteAdd();
					var35 = var3.method10045();
					var18 = var3.readUnsignedShort();
					var33 = var91 + var22;
					var34 = var83 + var28;
					if (0 <= var22 && var22 < 104 && 0 <= var28 && var28 < 104 && 0 <= var33 && var33 < 104 && 0 <= var34 && var34 < 104 && var12 != 65535) {
						var22 = Coord.method6797(var22);
						var28 = Coord.method6797(var28);
						var33 = Coord.method6797(var33);
						var34 = Coord.method6797(var34);
						var19 = new Projectile(var12, class162.worldView.plane, var22, var28, VarcInt.getTileHeight(class162.worldView, var22, var28, class162.worldView.plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var35, var68);
						var19.setDestination(var33, var34, VarcInt.getTileHeight(class162.worldView, var33, var34, class162.worldView.plane) - var68, var15 + cycle);
						class162.worldView.projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3474 == var1.serverPacket) {
					WorldMapSprite.method6194(class324.field3415);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var5 = var3.readUnsignedIntIME();
					var71 = var3.readUnsignedShortAdd();
					var62 = class162.worldView.npcs[var71];
					var22 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedShort();
					if (var62 != null) {
						var62.updateSpotAnimation(var22, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3445 == var1.serverPacket) {
					WorldMapData_0.field3064 = new class489(ApproximateRouteStrategy.field477);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3485 == var1.serverPacket) {
					var71 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					MenuAction.queueSoundEffect(var71, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3483 == var1.serverPacket) {
					var71 = var3.readUnsignedShort();
					if (var71 == 65535) {
						var71 = -1;
					}

					rootInterface = var71;
					this.method1313(false);
					SpotAnimationDefinition.method4048(var71);
					WorldMapEvent.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var71 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntIME();
					Varps.Varps_temp[var71] = var5;
					if (Varps.Varps_main[var71] != var5) {
						Varps.Varps_main[var71] = var5;
					}

					class153.changeGameOptions(var71);
					changedVarps[++changedVarpCount - 1 & 31] = var71;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3446 == var1.serverPacket) {
					var83 = var3.readByte();
					var13 = var3.readUnsignedByteSub() * 4;
					var12 = var3.readUnsignedShortLE();
					var35 = var3.method10045();
					var68 = var3.readUnsignedByteAdd() * 4;
					var18 = var3.readUnsignedByteNeg();
					var6 = var3.method10041();
					var71 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var22 = var71 + (var6 >> 4 & 7);
					var28 = var5 + (var6 & 7);
					var91 = var3.readByteNeg();
					var16 = var3.readUnsignedShortAddLE();
					var15 = var3.readUnsignedShortAdd();
					var17 = var3.readUnsignedByte();
					var33 = var91 + var22;
					var34 = var83 + var28;
					if (var22 >= 0 && var28 >= 0 && var22 < class162.worldView.sizeX && var28 < class162.worldView.sizeY && var33 >= 0 && var34 >= 0 && var33 < class162.worldView.sizeX && var34 < class162.worldView.sizeY && var12 != 65535) {
						var22 = Coord.method6797(var22);
						var28 = Coord.method6797(var28);
						var33 = Coord.method6797(var33);
						var34 = Coord.method6797(var34);
						var19 = new Projectile(var12, class162.worldView.plane, var22, var28, VarcInt.getTileHeight(class162.worldView, var22, var28, class162.worldView.plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var35, var68);
						var19.setDestination(var33, var34, VarcInt.getTileHeight(class162.worldView, var33, var34, class162.worldView.plane) - var68, var15 + cycle);
						class162.worldView.projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3570 == var1.serverPacket) {
					class169.field1830 = var3.readUnsignedByte();
					field596 = var3.readUnsignedByteAdd();
					WorldMapArea.field3102 = var3.readUnsignedByteAdd();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3508 == var1.serverPacket) {
					class174.updateWorldEntitiesFromPacketBuffer(class162.worldView, var3, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3567 == var1.serverPacket) {
					class174.updateWorldEntitiesFromPacketBuffer(class162.worldView, var3, true);
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

				if (ServerPacket.field3466 == var1.serverPacket) {
					var71 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedIntME();
					var74 = TaskHandler.widgetDefinition.method6841(var5);
					var74.field3910.method6891(AddRequestTask.localPlayer.appearance.gender, var71);
					SecureRandomCallable.invalidateWidget(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3473 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAdd();
					var71 = var3.readUnsignedShort();
					AbstractWorldMapIcon.method6257(var71, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					playerUpdateManager.method3014(var3, var1.serverPacketLength);
					class396.method7680();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var71 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntLE();
					var6 = var71 >> 10 & 31;
					var22 = var71 >> 5 & 31;
					var28 = var71 & 31;
					var33 = (var22 << 11) + (var6 << 19) + (var28 << 3);
					Widget var93 = TaskHandler.widgetDefinition.method6841(var5);
					if (var33 != var93.color) {
						var93.color = var33;
						SecureRandomCallable.invalidateWidget(var93);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3519 == var1.serverPacket) {
					var71 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedByte();
					DevicePcmPlayerProvider.field88 = var6;
					if (var71 == 0) {
						ClientPreferences.topLevelWorldView.plane = var6;
						class162.worldView = ClientPreferences.topLevelWorldView;
					} else {
						if (var71 != 1) {
							throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
						}

						WorldEntity var63 = ClientPreferences.topLevelWorldView.worldEntities[var5];
						var63.worldView.plane = var6;
						class162.worldView = var63.worldView;
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var72;
				if (ServerPacket.field3522 == var1.serverPacket) {
					var71 = var3.readUnsignedIntLE();
					var72 = var3.readUnsignedByteNeg() == 1;
					var74 = TaskHandler.widgetDefinition.method6841(var71);
					var74.method7274(AddRequestTask.localPlayer.appearance, var72);
					SecureRandomCallable.invalidateWidget(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					class160.privateChatMode = ChatChannel.method2411(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3476 == var1.serverPacket) {
					WorldMapSprite.method6194(class324.field3422);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3559 == var1.serverPacket) {
					WorldView.field1360 = var3.readUnsignedByte();
					field818 = var3.readUnsignedByte();
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

				if (ServerPacket.field3498 == var1.serverPacket) {
					var71 = var3.readShort();
					var5 = var3.readUnsignedIntME();
					var74 = TaskHandler.widgetDefinition.method6841(var5);
					if (var71 != var74.sequenceId || var71 == -1) {
						var74.sequenceId = var71;
						var74.modelFrame = 0;
						var74.modelFrameCycle = 0;
						SecureRandomCallable.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				byte var21;
				boolean var87;
				if (ServerPacket.field3514 == var1.serverPacket) {
					var21 = var3.readByte();
					var23 = (long)var3.readUnsignedShort();
					var25 = (long)var3.readMedium();
					var29 = var25 + (var23 << 32);
					var87 = false;
					ClanChannel var90 = var21 >= 0 ? currentClanChannels[var21] : class166.guestClanChannel;
					if (var90 == null) {
						var87 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (var29 == crossWorldMessageIds[var13]) {
								var87 = true;
								break;
							}
						}
					}

					if (!var87) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var29;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var27 = class501.method9239(var3);
						var68 = var21 >= 0 ? 43 : 46;
						IndexCheck.addChatMessage(var68, "", var27, var90.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field779 = false;
					field774 = true;
					var71 = WorldMapSection0.method6118(var3.readShort() & 2027);
					var5 = class30.method447(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var22 = var3.readUnsignedByte();
					field778 = new class513(class463.cameraPitch, var5, var6, var22);
					field777 = new class513(class267.cameraYaw, var71, var6, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var54 = new World();
					var54.host = var3.readStringCp1252NullTerminated();
					var54.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var54.properties = var5;
					if (var54.isDeadman()) {
						var54.field834 = "beta";
						class492.field5083 = true;
					} else {
						class492.field5083 = false;
					}

					class464.updateGameState(45);
					var2.close();
					var2 = null;
					class431.changeWorld(var54);
					var1.serverPacket = null;
					return false;
				}

				String var77;
				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var71 = var3.readUShortSmart();
					var72 = var3.readUnsignedByte() == 1;
					var77 = "";
					boolean var73 = false;
					if (var72) {
						var77 = var3.readStringCp1252NullTerminated();
						if (class425.friendSystem.isIgnored(new Username(var77, class28.loginType))) {
							var73 = true;
						}
					}

					String var59 = var3.readStringCp1252NullTerminated();
					if (!var73) {
						StructComposition.addGameMessage(var71, var77, var59);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3525 == var1.serverPacket) {
					field615 = cycleCntr;
					var21 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var21 >= 0) {
							currentClanChannels[var21] = null;
						} else {
							class166.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var21 >= 0) {
						currentClanChannels[var21] = new ClanChannel(var3);
					} else {
						class166.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var71 = var3.readInt();
					InterfaceParent var84 = (InterfaceParent)interfaceParents.get((long)var71);
					if (var84 != null) {
						class145.closeInterface(var84, true);
					}

					if (meslayerContinueWidget != null) {
						SecureRandomCallable.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3484 == var1.serverPacket) {
					var71 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var22 = var3.readUnsignedByte();
					field577[var71] = true;
					field781[var71] = var5;
					field782[var71] = var6;
					field589[var71] = var22;
					field518[var71] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					class425.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field714 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3491 == var1.serverPacket) {
					var96 = var3.readUnsignedByte() == 1;
					if (var96) {
						class4.field4 = WorldMapElement.method3843() - var3.readLong();
						class59.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class59.grandExchangeEvents = null;
					}

					field647 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var96 = var3.readUnsignedByteSub() == 1;
					var5 = var3.readUnsignedIntIME();
					var74 = TaskHandler.widgetDefinition.method6841(var5);
					if (var96 != var74.isHidden) {
						var74.isHidden = var96;
						SecureRandomCallable.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var71 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShort();
					var22 = var3.readUnsignedIntIME();
					var58 = TaskHandler.widgetDefinition.method6841(var22);
					if (var6 != var58.modelAngleX || var71 != var58.modelAngleY || var5 != var58.modelZoom) {
						var58.modelAngleX = var6;
						var58.modelAngleY = var71;
						var58.modelZoom = var5;
						SecureRandomCallable.invalidateWidget(var58);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3532 == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var5 = var3.readInt();
					var74 = TaskHandler.widgetDefinition.method6841(var5);
					if (!var51.equals(var74.text)) {
						var74.text = var51;
						SecureRandomCallable.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				String var45;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var21 = var3.readByte();
					var32 = var3.readStringCp1252NullTerminated();
					long var38 = (long)var3.readUnsignedShort();
					long var40 = (long)var3.readMedium();
					PlayerType var92 = (PlayerType)ArchiveDiskAction.findEnumerated(class188.PlayerType_values(), var3.readUnsignedByte());
					long var42 = (var38 << 32) + var40;
					boolean var67 = false;
					ClanChannel var44 = null;
					var44 = var21 >= 0 ? currentClanChannels[var21] : class166.guestClanChannel;
					if (var44 == null) {
						var67 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var92.isUser && class425.friendSystem.isIgnored(new Username(var32, class28.loginType))) {
									var67 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var42) {
								var67 = true;
								break;
							}

							++var15;
						}
					}

					if (!var67) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var42;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var45 = AbstractFont.escapeBrackets(class501.method9239(var3));
						var16 = var21 >= 0 ? 41 : 44;
						if (var92.modIcon != -1) {
							IndexCheck.addChatMessage(var16, class201.method4066(var92.modIcon) + var32, var45, var44.name);
						} else {
							IndexCheck.addChatMessage(var16, var32, var45, var44.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var71 = var3.readInt();
					var5 = var3.readUnsignedShortLE();
					var74 = TaskHandler.widgetDefinition.method6841(var71);
					if (var74.modelType != 1 || var5 != var74.modelId) {
						var74.modelType = 1;
						var74.modelId = var5;
						SecureRandomCallable.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3444 == var1.serverPacket) {
					var71 = var3.readInt();
					if (var71 != revision) {
						revision = var71;
						Actor.method2688();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3556 == var1.serverPacket) {
					WorldMapSprite.method6194(class324.field3416);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var13 = var3.readUnsignedShortAdd();
					var6 = var3.readMedium();
					var71 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var22 = var71 + (var6 >> 4 & 7);
					var28 = var5 + (var6 & 7);
					var33 = var3.readUnsignedByteAdd();
					var34 = var33 >> 2;
					var35 = var33 & 3;
					var12 = field595[var34];
					if (0 <= var22 && var22 < 103 && 0 <= var28 && var28 < 103) {
						ModeWhere.method7774(var22, var28, var34, var35, var12, var13);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					WorldMapArea.field3102 = var3.readUnsignedByte();
					class169.field1830 = var3.readUnsignedByteNeg();
					field596 = var3.readUnsignedByteAdd();

					while (var3.offset < var1.serverPacketLength) {
						var71 = var3.readUnsignedByte();
						class324 var82 = class219.method4473()[var71];
						WorldMapSprite.method6194(var82);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var71 = var3.readUnsignedIntIME();
					var80 = TaskHandler.widgetDefinition.method6841(var71);
					var80.modelType = 3;
					var80.modelId = AddRequestTask.localPlayer.appearance.getChatHeadId();
					SecureRandomCallable.invalidateWidget(var80);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3511 == var1.serverPacket) {
					isCameraLocked = true;
					field779 = false;
					field773 = false;
					DynamicObject.field1049 = var3.readUnsignedByte();
					class1.field3 = var3.readUnsignedByte();
					class7.field21 = var3.readUnsignedShort();
					ObjectComposition.field2214 = var3.readUnsignedByte();
					class27.field117 = var3.readUnsignedByte();
					if (class27.field117 >= 100) {
						class301.cameraX = Coord.method6797(DynamicObject.field1049);
						class33.cameraZ = Coord.method6797(class1.field3);
						ArchiveLoader.cameraY = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, class301.cameraX, class33.cameraZ, ClientPreferences.topLevelWorldView.plane) - class7.field21;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var71 = var3.readInt();
					var5 = var3.readInt();
					var6 = class501.getGcDuration();
					PacketBufferNode var60 = class141.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var60.packetBuffer.writeByteNeg(GameEngine.fps);
					var60.packetBuffer.writeIntME(var71);
					var60.packetBuffer.writeInt(var5);
					var60.packetBuffer.writeByteNeg(var6);
					packetWriter.addNode(var60);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3449 == var1.serverPacket) {
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedShortAddLE();
					var22 = var3.readUnsignedShortLE();
					var71 = var3.readUnsignedShortAddLE();
					var28 = var3.readUnsignedShortAdd();
					if (var71 == 65535) {
						var71 = -1;
					}

					ArrayList var9 = new ArrayList();
					var9.add(var71);
					ItemContainer.method2498(var9, var5, var6, var22, var28);
					var1.serverPacket = null;
					return true;
				}

				long var46;
				if (ServerPacket.field3469 == var1.serverPacket) {
					var71 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1313(false);
						SpotAnimationDefinition.method4048(rootInterface);
						WorldMapEvent.runWidgetOnLoadListener(rootInterface);

						for (var22 = 0; var22 < 100; ++var22) {
							validRootWidgets[var22] = true;
						}
					}

					InterfaceParent var88;
					for (; var6-- > 0; var88.field1095 = true) {
						var22 = var3.readInt();
						var28 = var3.readUnsignedShort();
						var33 = var3.readUnsignedByte();
						var88 = (InterfaceParent)interfaceParents.get((long)var22);
						if (var88 != null && var28 != var88.group) {
							class145.closeInterface(var88, true);
							var88 = null;
						}

						if (var88 == null) {
							var88 = UserComparator10.openInterface(var22, var28, var33);
						}
					}

					for (var57 = (InterfaceParent)interfaceParents.first(); var57 != null; var57 = (InterfaceParent)interfaceParents.next()) {
						if (var57.field1095) {
							var57.field1095 = false;
						} else {
							class145.closeInterface(var57, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var71) {
						var22 = var3.readInt();
						var28 = var3.readUnsignedShort();
						var33 = var3.readUnsignedShort();
						var34 = var3.readInt();

						for (var35 = var28; var35 <= var33; ++var35) {
							var46 = ((long)var22 << 32) + (long)var35;
							widgetFlags.put(new IntegerNode(var34), var46);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3541 == var1.serverPacket) {
					WorldMapSprite.method6194(class324.field3418);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3565 == var1.serverPacket) {
					return this.method1592(var1, 1);
				}

				if (ServerPacket.field3456 == var1.serverPacket) {
					isCameraLocked = true;
					field779 = false;
					field773 = true;
					DynamicObject.field1049 = var3.readUnsignedByte();
					class1.field3 = var3.readUnsignedByte();
					var71 = var3.readUnsignedShort();
					var5 = Coord.method6797(var3.readUnsignedByte());
					var6 = Coord.method6797(var3.readUnsignedByte());
					var22 = var3.readUnsignedShort();
					field775 = var3.readBoolean();
					var28 = var3.readUnsignedByte();
					var33 = Coord.method6797(DynamicObject.field1049);
					var34 = Coord.method6797(class1.field3);
					var87 = false;
					var66 = false;
					if (field775) {
						var35 = ArchiveLoader.cameraY;
						var12 = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, var33, var34, ClientPreferences.topLevelWorldView.plane) - var71;
					} else {
						var35 = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, class301.cameraX, class33.cameraZ, ClientPreferences.topLevelWorldView.plane) - ArchiveLoader.cameraY;
						var12 = var71;
					}

					field776 = new class511(class301.cameraX, class33.cameraZ, var35, var33, var34, var12, var5, var6, var22, var28);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_MOVETO == var1.serverPacket) {
					isCameraLocked = true;
					field779 = false;
					field773 = true;
					DynamicObject.field1049 = var3.readUnsignedByte();
					class1.field3 = var3.readUnsignedByte();
					var71 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field775 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var22 = Coord.method6797(DynamicObject.field1049);
					var28 = Coord.method6797(class1.field3);
					boolean var94 = false;
					boolean var89 = false;
					if (field775) {
						var33 = ArchiveLoader.cameraY;
						var34 = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, var22, var28, ClientPreferences.topLevelWorldView.plane) - var71;
					} else {
						var33 = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, class301.cameraX, class33.cameraZ, ClientPreferences.topLevelWorldView.plane) - ArchiveLoader.cameraY;
						var34 = var71;
					}

					field776 = new class512(class301.cameraX, class33.cameraZ, var33, var22, var28, var34, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3433 == var1.serverPacket) {
					WorldMapData_0.field3064 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3468 == var1.serverPacket) {
					isCameraLocked = true;
					field779 = false;
					field774 = true;
					HorizontalAlignment.field1989 = var3.readUnsignedByte();
					class28.field1287 = var3.readUnsignedByte();
					class380.field4133 = var3.readUnsignedShort();
					var71 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = Coord.method6797(HorizontalAlignment.field1989);
					var22 = Coord.method6797(class28.field1287);
					var28 = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, var6, var22, ClientPreferences.topLevelWorldView.plane) - class380.field4133;
					var33 = var6 - class301.cameraX;
					var34 = var28 - ArchiveLoader.cameraY;
					var35 = var22 - class33.cameraZ;
					double var97 = Math.sqrt((double)(var35 * var35 + var33 * var33));
					var68 = class30.method447((int)(Math.atan2((double)var34, var97) * 325.9490051269531D) & 2047);
					var15 = WorldMapSection0.method6118((int)(Math.atan2((double)var33, (double)var35) * -325.9490051269531D) & 2047);
					field778 = new class513(class463.cameraPitch, var68, var71, var5);
					field777 = new class513(class267.cameraYaw, var15, var71, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3487 == var1.serverPacket) {
					for (var71 = 0; var71 < class162.worldView.players.length; ++var71) {
						if (class162.worldView.players[var71] != null) {
							class162.worldView.players[var71].sequence = -1;
						}
					}

					for (var71 = 0; var71 < class162.worldView.npcs.length; ++var71) {
						if (class162.worldView.npcs[var71] != null) {
							class162.worldView.npcs[var71].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3462 == var1.serverPacket) {
					var71 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedIntLE();
					var7 = TaskHandler.widgetDefinition.method6841(var6);
					var7.field3910.method6893(var71, var5);
					SecureRandomCallable.invalidateWidget(var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					class188.updateNpcs(class162.worldView, false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					class425.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class417.FriendSystem_invalidateIgnoreds();
					field714 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3478 == var1.serverPacket) {
					++serverCycle;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						Clock.method4630(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3479 == var1.serverPacket) {
					WorldMapSprite.method6194(class324.field3414);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3538 == var1.serverPacket) {
					JagexCache.field2390 = var3.readBoolean();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3551 == var1.serverPacket) {
					return this.method1592(var1, 2);
				}

				if (ServerPacket.field3447 == var1.serverPacket) {
					var71 = var3.readUnsignedShortAdd();
					var5 = var3.readInt();
					var6 = var3.readUnsignedShortLE();
					var7 = TaskHandler.widgetDefinition.method6841(var5);
					var7.field3909 = var71 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					GrandExchangeOfferTotalQuantityComparator.method7663();
					var71 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedByteNeg();
					var22 = var3.readUnsignedByteAdd();
					experience[var5] = var71;
					currentLevels[var5] = var22;
					levels[var5] = 1;
					field662[var5] = var6;

					for (var28 = 0; var28 < 98; ++var28) {
						if (var71 >= Skills.Skills_experienceTable[var28]) {
							levels[var5] = var28 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3439 == var1.serverPacket) {
					var71 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortAdd();
					var74 = TaskHandler.widgetDefinition.method6841(var71);
					if (var74.modelType != 6 || var5 != var74.modelId) {
						var74.modelType = 6;
						var74.modelId = var5;
						SecureRandomCallable.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3569 == var1.serverPacket) {
					field597 = var3.readStringCp1252NullTerminated();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					Bounds.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAdd() * 30;
					field720 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var71 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedIntLE();
					var74 = TaskHandler.widgetDefinition.method6841(var5);
					if (var74.modelType != 2 || var71 != var74.modelId) {
						var74.modelType = 2;
						var74.modelId = var71;
						SecureRandomCallable.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3493 == var1.serverPacket) {
					var71 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					var6 = class548.field5407 >= 223 ? var3.readShort() : -1;
					if (var71 == 0) {
						ClanSettings.entity = ClientPreferences.topLevelWorldView.players[var5];
						field649 = -1;
					} else if (var71 == 1) {
						field649 = -1;
						ClanSettings.entity = ClientPreferences.topLevelWorldView.npcs[var5];
					} else if (var71 == 2) {
						field649 = var6;
						ClanSettings.entity = ClientPreferences.topLevelWorldView.worldEntities[var5];
						this.method497(true);
					}

					if (ClanSettings.entity == null) {
						field649 = -1;
						ClanSettings.entity = AddRequestTask.localPlayer;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3568 == var1.serverPacket) {
					var17 = var3.readUnsignedByteAdd();
					var83 = var3.readByteAdd();
					var91 = var3.readByte();
					int var48 = var3.method9979();
					var18 = var3.readUnsignedShort();
					var16 = var3.readUnsignedShortLE();
					var68 = var3.readUnsignedByteAdd() * 4;
					var35 = var3.method10045();
					var12 = var3.readUnsignedShortLE();
					var13 = var3.readUnsignedByte() * 4;
					var6 = var3.readMedium();
					var71 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var22 = var71 + (var6 >> 4 & 7);
					var28 = var5 + (var6 & 7);
					var15 = var3.readUnsignedShortAddLE();
					var33 = var91 + var22;
					var34 = var83 + var28;
					if (0 <= var22 && var22 < 104 && 0 <= var28 && var28 < 104 && 0 <= var33 && var33 < 104 && 0 <= var34 && var34 < 104 && var12 != 65535) {
						var22 = Coord.method6797(var22);
						var28 = Coord.method6797(var28);
						var33 = Coord.method6797(var33);
						var34 = Coord.method6797(var34);
						Projectile var20 = new Projectile(var12, class162.worldView.plane, var22, var28, VarcInt.getTileHeight(class162.worldView, var22, var28, class162.worldView.plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var48, var35, var68);
						var20.setDestination(var33, var34, VarcInt.getTileHeight(class162.worldView, var33, var34, class162.worldView.plane) - var68, var15 + cycle);
						class162.worldView.projectiles.addFirst(var20);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var53 = new byte[var1.serverPacketLength];
					var3.method9874(var53, 0, var53.length);
					Buffer var79 = new Buffer(var53);
					var77 = var79.readStringCp1252NullTerminated();
					FloorOverlayDefinition.openURL(var77, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var71 = var3.readUnsignedShort();
					if (var71 == 65535) {
						var71 = -1;
					}

					ChatChannel.playSong(var71);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3516 == var1.serverPacket) {
					var71 = var3.readUnsignedShort();
					if (var71 == 65535) {
						var71 = -1;
					}

					var5 = var3.method10171();
					Projectile.method2363(var71, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var71 = var3.readUnsignedShortAdd();
					class59.method1188(var71);
					changedItemContainers[++field761 - 1 & 31] = var71 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					Message.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var71 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var71 < -70000) {
						var5 += 32768;
					}

					if (var71 >= 0) {
						var74 = TaskHandler.widgetDefinition.method6841(var71);
					} else {
						var74 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class60.itemContainerSetItem(var5, var22, var28 - 1, var33)) {
						var22 = var3.readUShortSmart();
						var28 = var3.readUnsignedShort();
						var33 = 0;
						if (var28 != 0) {
							var33 = var3.readUnsignedByte();
							if (var33 == 255) {
								var33 = var3.readInt();
							}
						}

						if (var74 != null && var22 >= 0 && var22 < var74.itemIds.length) {
							var74.itemIds[var22] = var28;
							var74.itemQuantities[var22] = var33;
						}
					}

					if (var74 != null) {
						SecureRandomCallable.invalidateWidget(var74);
					}

					GrandExchangeOfferTotalQuantityComparator.method7663();
					changedItemContainers[++field761 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					Object[] var78 = new Object[var51.length() + 1];

					for (var6 = var51.length() - 1; var6 >= 0; --var6) {
						if (var51.charAt(var6) == 's') {
							var78[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var78[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var78[0] = new Integer(var3.readInt());
					ScriptEvent var85 = new ScriptEvent();
					var85.args = var78;
					class215.runScriptEvent(var85);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3548 == var1.serverPacket) {
					Decimator.method1158();
					var21 = var3.readByte();
					class153 var76 = new class153(var3);
					ClanSettings var81;
					if (var21 >= 0) {
						var81 = currentClanSettings[var21];
					} else {
						var81 = WorldMapSectionType.guestClanSettings;
					}

					if (var81 == null) {
						this.method1318(var21);
						var1.serverPacket = null;
						return true;
					}

					if (var76.field1715 > var81.field1765) {
						this.method1318(var21);
						var1.serverPacket = null;
						return true;
					}

					if (var76.field1715 < var81.field1765) {
						var1.serverPacket = null;
						return true;
					}

					var76.method3500(var81);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					class188.updateNpcs(class162.worldView, true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3442 == var1.serverPacket) {
					return this.method1308(var1);
				}

				if (ServerPacket.field3561 == var1.serverPacket) {
					class162.worldView.npcCount = 0;
					class162.worldView.worldEntityCount = 0;

					for (var71 = 0; var71 < 65536; ++var71) {
						class162.worldView.npcs[var71] = null;
					}

					for (var71 = 0; var71 < 2048; ++var71) {
						class162.worldView.worldEntities[var71] = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var6 = var3.method10041();
					var71 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var22 = var71 + (var6 >> 4 & 7);
					var28 = var5 + (var6 & 7);
					var33 = var3.readUnsignedShortAddLE();
					var34 = var3.readUnsignedByteNeg();
					var35 = var3.readUnsignedShortLE();
					if (var22 >= 0 && var28 >= 0 && var22 < class162.worldView.sizeX && var28 < class162.worldView.sizeY) {
						var22 = Coord.method6797(var22);
						var28 = Coord.method6797(var28);
						GraphicsObject var37 = new GraphicsObject(var33, class162.worldView.plane, var22, var28, VarcInt.getTileHeight(class162.worldView, var22, var28, class162.worldView.plane) - var34, var35, cycle);
						class162.worldView.graphicsObjects.addFirst(var37);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var32 = AbstractFont.escapeBrackets(class162.method3641(class501.method9239(var3)));
					StructComposition.addGameMessage(6, var51, var32);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3467 == var1.serverPacket) {
					Decimator.method1158();
					var21 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var21 >= 0) {
							currentClanSettings[var21] = null;
						} else {
							WorldMapSectionType.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var21 >= 0) {
						currentClanSettings[var21] = new ClanSettings(var3);
					} else {
						WorldMapSectionType.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3472 == var1.serverPacket) {
					WorldMapSprite.method6194(class324.field3417);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var71 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedByte();
					var77 = var3.readStringCp1252NullTerminated();
					if (var71 >= 1 && var71 <= 8) {
						if (var77.equalsIgnoreCase("null")) {
							var77 = null;
						}

						playerMenuActions[var71 - 1] = var77;
						playerOptionsPriorities[var71 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3496 == var1.serverPacket) {
					class425.friendSystem.method2039();
					field714 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					Message.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var5 = var3.readUnsignedShortAddLE();
					var71 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedByte();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var56 = class162.worldView.npcs[var71];
					if (var56 != null) {
						if (var5 == var56.sequence && var5 != -1) {
							var28 = HealthBarUpdate.SequenceDefinition_get(var5).restartMode;
							if (var28 == 1) {
								var56.sequenceFrame = 0;
								var56.sequenceFrameCycle = 0;
								var56.sequenceDelay = var6;
								var56.field1272 = 0;
							} else if (var28 == 2) {
								var56.field1272 = 0;
							}
						} else if (var5 == -1 || var56.sequence == -1 || HealthBarUpdate.SequenceDefinition_get(var5).field2321 >= HealthBarUpdate.SequenceDefinition_get(var56.sequence).field2321) {
							var56.sequence = var5;
							var56.sequenceFrame = 0;
							var56.sequenceFrameCycle = 0;
							var56.sequenceDelay = var6;
							var56.field1272 = 0;
							var56.field1298 = var56.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					class169.field1830 = var3.readUnsignedByteAdd();
					field596 = var3.readUnsignedByteSub();
					WorldMapArea.field3102 = var3.readUnsignedByteSub();

					for (var71 = class169.field1830; var71 < class169.field1830 + 8; ++var71) {
						for (var5 = WorldMapArea.field3102; var5 < WorldMapArea.field3102 + 8; ++var5) {
							if (class162.worldView.groundItems[field596][var71][var5] != null) {
								class162.worldView.groundItems[field596][var71][var5] = null;
								class537.updateItemPile(field596, var71, var5);
							}
						}
					}

					for (PendingSpawn var52 = (PendingSpawn)class162.worldView.pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)class162.worldView.pendingSpawns.previous()) {
						if (var52.x >= class169.field1830 && var52.x < class169.field1830 + 8 && var52.y >= WorldMapArea.field3102 && var52.y < WorldMapArea.field3102 + 8 && var52.plane == field596) {
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3457 == var1.serverPacket) {
					isCameraLocked = true;
					field779 = false;
					field774 = true;
					var71 = var3.readShort();
					var5 = var3.readShort();
					var6 = class30.method447(var5 + class463.cameraPitch & 2027);
					var22 = var71 + class267.cameraYaw;
					var28 = var3.readUnsignedShort();
					var33 = var3.readUnsignedByte();
					field778 = new class513(class463.cameraPitch, var6, var28, var33);
					field777 = new class513(class267.cameraYaw, var22, var28, var33);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3440 == var1.serverPacket) {
					WorldMapSprite.method6194(class324.field3419);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var71 = var3.readUnsignedByte();
					class53.forceDisconnect(var71);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var71 = 0; var71 < Varps.Varps_main.length; ++var71) {
						if (Varps.Varps_temp[var71] != Varps.Varps_main[var71]) {
							Varps.Varps_main[var71] = Varps.Varps_temp[var71];
							class153.changeGameOptions(var71);
							changedVarps[++changedVarpCount - 1 & 31] = var71;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field779 = false;
					field774 = false;
					HorizontalAlignment.field1989 = var3.readUnsignedByte();
					class28.field1287 = var3.readUnsignedByte();
					class380.field4133 = var3.readUnsignedShort();
					HttpMethod.field29 = var3.readUnsignedByte();
					class224.field2411 = var3.readUnsignedByte();
					if (class224.field2411 >= 100) {
						var71 = Coord.method6797(HorizontalAlignment.field1989);
						var5 = Coord.method6797(class28.field1287);
						var6 = VarcInt.getTileHeight(ClientPreferences.topLevelWorldView, var71, var5, ClientPreferences.topLevelWorldView.plane) - class380.field4133;
						var22 = var71 - class301.cameraX;
						var28 = var6 - ArchiveLoader.cameraY;
						var33 = var5 - class33.cameraZ;
						var34 = (int)Math.sqrt((double)(var33 * var33 + var22 * var22));
						class463.cameraPitch = (int)(Math.atan2((double)var28, (double)var34) * 325.9490051269531D) & 2047;
						class267.cameraYaw = (int)(Math.atan2((double)var22, (double)var33) * -325.9490051269531D) & 2047;
						if (class463.cameraPitch < 128) {
							class463.cameraPitch = 128;
						}

						if (class463.cameraPitch > 383) {
							class463.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						class147.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3451 == var1.serverPacket) {
					WorldMapSprite.method6194(class324.field3412);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var71 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShortAdd();
					var74 = TaskHandler.widgetDefinition.method6841(var71);
					if (var74 != null && var74.type == 0) {
						if (var5 > var74.scrollHeight - var74.height) {
							var5 = var74.scrollHeight - var74.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var74.scrollY) {
							var74.scrollY = var5;
							SecureRandomCallable.invalidateWidget(var74);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3505 == var1.serverPacket) {
					WorldMapSprite.method6194(class324.field3410);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
					var71 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var71 < -70000) {
						var5 += 32768;
					}

					if (var71 >= 0) {
						var74 = TaskHandler.widgetDefinition.method6841(var71);
					} else {
						var74 = null;
					}

					if (var74 != null) {
						for (var22 = 0; var22 < var74.itemIds.length; ++var22) {
							var74.itemIds[var22] = 0;
							var74.itemQuantities[var22] = 0;
						}
					}

					AbstractByteArrayCopier.clearItemContainer(var5);
					var22 = var3.readUnsignedShort();

					for (var28 = 0; var28 < var22; ++var28) {
						var33 = var3.readUnsignedByteNeg();
						if (var33 == 255) {
							var33 = var3.readUnsignedIntIME();
						}

						var34 = var3.readUnsignedShortAddLE();
						if (var74 != null && var28 < var74.itemIds.length) {
							var74.itemIds[var28] = var34;
							var74.itemQuantities[var28] = var33;
						}

						class60.itemContainerSetItem(var5, var28, var34 - 1, var33);
					}

					if (var74 != null) {
						SecureRandomCallable.invalidateWidget(var74);
					}

					GrandExchangeOfferTotalQuantityComparator.method7663();
					changedItemContainers[++field761 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var23 = var3.readLong();
					var25 = (long)var3.readUnsignedShort();
					var29 = (long)var3.readMedium();
					PlayerType var11 = (PlayerType)ArchiveDiskAction.findEnumerated(class188.PlayerType_values(), var3.readUnsignedByte());
					var46 = (var25 << 32) + var29;
					boolean var14 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var46) {
							var14 = true;
							break;
						}
					}

					if (var11.isUser && class425.friendSystem.isIgnored(new Username(var51, class28.loginType))) {
						var14 = true;
					}

					if (!var14 && field728 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var46;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var45 = AbstractFont.escapeBrackets(class162.method3641(class501.method9239(var3)));
						if (var11.modIcon != -1) {
							IndexCheck.addChatMessage(9, class201.method4066(var11.modIcon) + var51, var45, ServerPacket.base37DecodeLong(var23));
						} else {
							IndexCheck.addChatMessage(9, var51, var45, ServerPacket.base37DecodeLong(var23));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var71 = var3.readUnsignedShortLE();
					if (var71 == 65535) {
						var71 = -1;
					}

					var5 = var3.readUnsignedIntIME();
					var6 = var3.readUnsignedIntLE();
					var7 = TaskHandler.widgetDefinition.method6841(var6);
					ItemComposition var8;
					if (!var7.isIf3) {
						if (var71 == -1) {
							var7.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var8 = MouseRecorder.ItemDefinition_get(var71).getCountObj(var5);
						var7.modelType = 4;
						var7.modelId = var71;
						var7.modelAngleX = var8.xan2d;
						var7.modelAngleY = var8.yan2d;
						var7.modelZoom = var8.zoom2d * 100 / var5;
						SecureRandomCallable.invalidateWidget(var7);
					} else {
						var7.itemId = var71;
						var7.itemQuantity = var5;
						var8 = MouseRecorder.ItemDefinition_get(var71).getCountObj(var5);
						var7.modelAngleX = var8.xan2d;
						var7.modelAngleY = var8.yan2d;
						var7.modelAngleZ = var8.zan2d;
						var7.modelOffsetX = var8.offsetX2d;
						var7.modelOffsetY = var8.offsetY2d;
						var7.modelZoom = var8.zoom2d;
						if (var8.isStackable == 1) {
							var7.itemQuantityMode = 1;
						} else {
							var7.itemQuantityMode = 2;
						}

						if (var7.field3908 > 0) {
							var7.modelZoom = var7.modelZoom * 32 / var7.field3908;
						} else if (var7.rawWidth > 0) {
							var7.modelZoom = var7.modelZoom * 32 / var7.rawWidth;
						}

						SecureRandomCallable.invalidateWidget(var7);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var21 = var3.readByteSub();
					var5 = var3.readUnsignedShortAddLE();
					Varps.Varps_temp[var5] = var21;
					if (Varps.Varps_main[var5] != var21) {
						Varps.Varps_main[var5] = var21;
					}

					class153.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3470 == var1.serverPacket) {
					var71 = var3.readUnsignedByte();
					var5 = var3.readUnsignedShort();
					this.method497(false);
					if (var71 == 0) {
						ClanSettings.entity = ClientPreferences.topLevelWorldView.players[var5];
					} else if (var71 == 1) {
						ClanSettings.entity = ClientPreferences.topLevelWorldView.npcs[var5];
					} else if (var71 == 2) {
						ClanSettings.entity = ClientPreferences.topLevelWorldView.worldEntities[var5];
						this.method497(true);
					}

					if (ClanSettings.entity == null) {
						ClanSettings.entity = AddRequestTask.localPlayer;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3512 == var1.serverPacket) {
					var22 = var3.readUnsignedShort();
					var33 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var28 = var3.readUnsignedShortAdd();
					var71 = var3.readUnsignedShort();
					if (var71 == 65535) {
						var71 = -1;
					}

					ArrayList var36 = new ArrayList();
					var36.add(var71);
					var36.add(var5);
					ItemContainer.method2498(var36, var6, var22, var28, var33);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3537 == var1.serverPacket) {
					field615 = cycleCntr;
					var21 = var3.readByte();
					class167 var75 = new class167(var3);
					ClanChannel var31;
					if (var21 >= 0) {
						var31 = currentClanChannels[var21];
					} else {
						var31 = class166.guestClanChannel;
					}

					if (var31 == null) {
						this.method1398(var21);
						var1.serverPacket = null;
						return true;
					}

					if (var75.field1814 > var31.field1837) {
						this.method1398(var21);
						var1.serverPacket = null;
						return true;
					}

					if (var75.field1814 < var31.field1837) {
						var1.serverPacket = null;
						return true;
					}

					var75.method3696(var31);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3509 == var1.serverPacket) {
					WorldMapSprite.method6194(class324.field3413);
					var1.serverPacket = null;
					return true;
				}

				class171.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1488 != null ? var1.field1488.id : -1) + "," + (var1.field1493 != null ? var1.field1493.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				PcmPlayer.logOut();
			} catch (IOException var49) {
				class375.method7427();
			} catch (Exception var50) {
				var32 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1488 != null ? var1.field1488.id : -1) + "," + (var1.field1493 != null ? var1.field1493.id : -1) + "," + var1.serverPacketLength + "," + (AddRequestTask.localPlayer.pathX[0] + ClientPreferences.topLevelWorldView.baseX) + "," + (AddRequestTask.localPlayer.pathY[0] + ClientPreferences.topLevelWorldView.baseY) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var32 = var32 + var3.array[var6] + ",";
				}

				class171.RunException_sendStackTrace(var32, var50);
				PcmPlayer.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1372689442"
	)
	@Export("menu")
	final void menu() {
		Menu var1 = menu;
		boolean var2 = false;

		int var3;
		while (!var2) {
			var2 = true;

			for (var3 = 0; var3 < var1.menuOptionsCount - 1; ++var3) {
				if (var1.menuOpcodes[var3] < 1000 && var1.menuOpcodes[var3 + 1] > 1000) {
					String var4 = var1.menuTargets[var3];
					var1.menuTargets[var3] = var1.menuTargets[var3 + 1];
					var1.menuTargets[var3 + 1] = var4;
					String var5 = var1.menuActions[var3];
					var1.menuActions[var3] = var1.menuActions[var3 + 1];
					var1.menuActions[var3 + 1] = var5;
					Menu var6 = var1.subMenus[var3];
					var1.subMenus[var3] = var1.subMenus[var3 + 1];
					var1.subMenus[var3 + 1] = var6;
					int var7 = var1.menuOpcodes[var3];
					var1.menuOpcodes[var3] = var1.menuOpcodes[var3 + 1];
					var1.menuOpcodes[var3 + 1] = var7;
					var7 = var1.menuArguments1[var3];
					var1.menuArguments1[var3] = var1.menuArguments1[var3 + 1];
					var1.menuArguments1[var3 + 1] = var7;
					var7 = var1.menuArguments2[var3];
					var1.menuArguments2[var3] = var1.menuArguments2[var3 + 1];
					var1.menuArguments2[var3 + 1] = var7;
					var7 = var1.menuIdentifiers[var3];
					var1.menuIdentifiers[var3] = var1.menuIdentifiers[var3 + 1];
					var1.menuIdentifiers[var3 + 1] = var7;
					var7 = var1.menuItemIds[var3];
					var1.menuItemIds[var3] = var1.menuItemIds[var3 + 1];
					var1.menuItemIds[var3 + 1] = var7;
					var7 = var1.menuWorldViewIds[var3];
					var1.menuWorldViewIds[var3] = var1.menuWorldViewIds[var3 + 1];
					var1.menuWorldViewIds[var3 + 1] = var7;
					boolean var8 = var1.menuShiftClick[var3];
					var1.menuShiftClick[var3] = var1.menuShiftClick[var3 + 1];
					var1.menuShiftClick[var3 + 1] = var8;
					var2 = false;
				}
			}
		}

		if (clickedWidget == null) {
			int var9 = MouseHandler.MouseHandler_lastButton;
			if (isMenuOpen) {
				if (var9 != 1 && (Varcs.mouseCam || var9 != 4) && !menu.method10577(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y)) {
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}

				if (var9 == 1 || !Varcs.mouseCam && var9 == 4) {
					menu.method10542(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					isMenuOpen = false;
					menu.invalidateWidgetsUnder();
				}
			} else if (menu.menuOptionsCount > 0) {
				var3 = class537.method9781();
				if ((var9 == 1 || !Varcs.mouseCam && var9 == 4) && this.shouldLeftClickOpenMenu(menu.menuOpcodes[var3], menu.menuShiftClick[var3])) {
					var9 = 2;
				}

				if (var9 == 1 || !Varcs.mouseCam && var9 == 4) {
					menu.method10540(var3);
				}

				if (var9 == 2) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(IZI)Z",
		garbageValue = "-1465325724"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu(int var1, boolean var2) {
		boolean var3 = leftClickOpensMenu && menu.menuOptionsCount > 2;
		if (!var3) {
			int var5 = var1;
			if (var1 >= 2000) {
				var5 = var1 - 2000;
			}

			boolean var4 = var5 == 1007;
			var3 = var4;
		}

		return var3 && !var2;
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1928480518"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		menu.method10537(var1, var2);
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		ClientPreferences.topLevelWorldView.scene.menuOpen(ClientPreferences.topLevelWorldView.plane, var1, var2, false);

		for (int var3 = 0; var3 < ClientPreferences.topLevelWorldView.worldEntityCount; ++var3) {
			WorldEntity var4 = ClientPreferences.topLevelWorldView.worldEntities[ClientPreferences.topLevelWorldView.worldEntityIndices[var3]];
			if (var4 != null) {
				var4.worldView.scene.menuOpen(var4.worldView.plane, var1, var2, false);
			}
		}

		isMenuOpen = true;
		menu.method10556();
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1789728771"
	)
	final void method1313(boolean var1) {
		KeyHandler.method373(rootInterface, class154.canvasWidth, UrlRequester.canvasHeight, var1);
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)V",
		garbageValue = "1210347830"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : TaskHandler.widgetDefinition.method6841(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class154.canvasWidth;
			var4 = UrlRequester.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		Projectile.alignWidgetSize(var1, var3, var4, false);
		InvDefinition.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	final void method1315() {
		SecureRandomCallable.invalidateWidget(clickedWidget);
		++class140.widgetDragDuration;
		int var1;
		int var2;
		if (field700 && field697) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field576) {
				var1 = field576;
			}

			if (var1 + clickedWidget.width > field576 + clickedWidgetParent.width) {
				var1 = field576 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field684) {
				var2 = field684;
			}

			if (var2 + clickedWidget.height > field684 + clickedWidgetParent.height) {
				var2 = field684 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field701;
			int var4 = var2 - field702;
			int var5 = clickedWidget.dragZoneSize;
			if (class140.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field576 + clickedWidgetParent.scrollX;
			int var7 = var2 - field684 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				class215.runScriptEvent(var8);
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
						class215.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var13 = clickedWidget;
						int var14 = class149.method3465(class310.getWidgetFlags(var13));
						Widget var16;
						if (var14 == 0) {
							var16 = null;
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var14) {
									var16 = var13;
									break;
								}

								var13 = TaskHandler.widgetDefinition.method6841(var13.parentId);
								if (var13 == null) {
									var16 = null;
									break;
								}

								++var11;
							}
						}

						if (var16 != null) {
							PacketBufferNode var17 = class141.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
							var17.packetBuffer.writeIntLE(clickedWidget.id);
							var17.packetBuffer.writeShortLE(clickedWidget.itemId);
							var17.packetBuffer.writeShortAddLE(clickedWidget.childIndex);
							var17.packetBuffer.writeShort(draggedOnWidget.itemId);
							var17.packetBuffer.writeShortLE(draggedOnWidget.childIndex);
							var17.packetBuffer.writeIntLE(draggedOnWidget.id);
							packetWriter.addNode(var17);
						}
					}
				} else if (class439.tempMenuAction != null && !this.shouldLeftClickOpenMenu(class439.tempMenuAction.opcode, class439.tempMenuAction.field935)) {
					if (menu.menuOptionsCount > 0) {
						int var12 = field701 + widgetClickX;
						int var9 = field702 + widgetClickY;
						MenuAction var10 = class439.tempMenuAction;
						if (var10 != null) {
							class416.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.itemId, var10.worldViewId, var10.action, var10.target, var12, var9);
						}

						class439.tempMenuAction = null;
					}
				} else {
					this.openMenu(widgetClickX + field701, field702 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (class140.widgetDragDuration > 1) {
				if (!isDraggingWidget && menu.menuOptionsCount > 0) {
					var1 = field701 + widgetClickX;
					var2 = widgetClickY + field702;
					MenuAction var15 = class439.tempMenuAction;
					if (var15 != null) {
						class416.menuAction(var15.param0, var15.param1, var15.opcode, var15.identifier, var15.itemId, var15.worldViewId, var15.action, var15.target, var1, var2);
					}

					class439.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(I)Lwf;",
		garbageValue = "616356373"
	)
	@Export("username")
	public Username username() {
		return AddRequestTask.localPlayer != null ? AddRequestTask.localPlayer.username : null;
	}

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "96"
	)
	void method1398(int var1) {
		PacketBufferNode var2 = class141.getPacketBufferNode(ClientPacket.field3375, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("pr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1344186207"
	)
	void method1318(int var1) {
		PacketBufferNode var2 = class141.getPacketBufferNode(ClientPacket.field3385, packetWriter.isaacCipher);
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
							LoginScreenAnimation.clientLanguage = Language.method7757(Integer.parseInt(var2));
							break;
						case 7:
							WorldMapSprite.field3217 = Varcs.method3039(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							HttpJsonRequestBody.field5091 = var2;
							break;
						case 10:
							StudioGame[] var4 = new StudioGame[]{StudioGame.oldscape, StudioGame.runescape, StudioGame.game3, StudioGame.game5, StudioGame.stellardawn, StudioGame.game4};
							class332.field3603 = (StudioGame)ArchiveDiskAction.findEnumerated(var4, Integer.parseInt(var2));
							if (class332.field3603 == StudioGame.oldscape) {
								class28.loginType = LoginType.oldscape;
							} else {
								class28.loginType = LoginType.field5296;
							}
							break;
						case 11:
							class215.authServiceBaseUrl = var2;
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
							class215.field2352 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class281.field3070 = var2;
							break;
						case 21:
							field520 = Integer.parseInt(var2);
							break;
						case 22:
							class532.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								class548.field5407 = Integer.parseInt(var2);
							} else {
								class548.field5407 = Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class324.worldHost = this.getCodeBase().getHost();
				FontName.field5260 = new JagNetThread();
				String var5 = WorldMapSprite.field3217.name;
				byte var6 = 0;
				if ((worldProperties & class545.field5380.rsOrdinal()) != 0) {
					JagexCache.field2382 = "beta";
				}

				try {
					WorldMapLabel.method6195("oldschool", JagexCache.field2382, var5, var6, 23);
				} catch (Exception var7) {
					class171.RunException_sendStackTrace((String)null, var7);
				}

				class1.client = this;
				class365.field4014 = clientType;
				ReflectionCheck.accessToken = System.getenv("JX_ACCESS_TOKEN");
				class374.refreshToken = System.getenv("JX_REFRESH_TOKEN");
				class331.sessionId = System.getenv("JX_SESSION_ID");
				FriendsList.characterId = System.getenv("JX_CHARACTER_ID");
				String var9 = System.getenv("JX_DISPLAY_NAME");
				Login.displayName = BufferedSink.method9121(var9);
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field522 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field522 = 0;
					} else {
						field522 = 5;
					}
				}

				this.startThread(765, 503, 225, 1);
			}
		} catch (RuntimeException var8) {
			throw class547.newRunException(var8, "client.init(" + ')');
		}
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			LoginState.updateLoginIndex(10);
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

	protected void finalize() throws Throwable {
		class334.field3623.remove(this);
		super.finalize();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgi;",
		garbageValue = "-48"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Lcr;II[I[II)V",
		garbageValue = "-1635008324"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var11 != var12) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-31"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}
}
