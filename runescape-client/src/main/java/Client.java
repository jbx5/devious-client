import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
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
public final class Client extends GameEngine implements Usernamed, OAuthApi, class327 {
	@ObfuscatedName("wm")
	@ObfuscatedGetter(
		intValue = 1239902349
	)
	public static int field808;
	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	static final class234 field629;
	@ObfuscatedName("wk")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	static final ApproximateRouteStrategy field814;
	@ObfuscatedName("wo")
	static int[] field815;
	@ObfuscatedName("wx")
	static int[] field655;
	@ObfuscatedName("wy")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("ww")
	@ObfuscatedGetter(
		intValue = 305828621
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = 719195901
	)
	static int field773;
	@ObfuscatedName("va")
	@ObfuscatedSignature(
		descriptor = "[Loa;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("wn")
	static List field533;
	@ObfuscatedName("vz")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	static class443 field597;
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("vf")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("vt")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("wc")
	@ObfuscatedGetter(
		intValue = -1907131929
	)
	static int field807;
	@ObfuscatedName("bv")
	static boolean field803;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 667514601
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -260383041
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -716065063
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cl")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cw")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -455589887
	)
	static int field513;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1924556571
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 85657971
	)
	static int field794;
	@ObfuscatedName("cp")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 466501763
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dn")
	static boolean field519;
	@ObfuscatedName("dl")
	static boolean field788;
	@ObfuscatedName("da")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 538624397
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		longValue = 6590002606368687705L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 770080737
	)
	static int field795;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1850835207
	)
	static int field525;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		longValue = -1242148376214615293L
	)
	static long field526;
	@ObfuscatedName("dg")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1030172277
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1757984615
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1656156545
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -1035355627
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1115799069
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -873808003
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1223335210
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 378876736
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1697678400
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lej;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ej")
	@Export("z")
	static boolean z;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static class93 field540;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		intValue = 1348713939
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 815633175
	)
	static int field542;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = 1697406739
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -1212804763
	)
	static int field544;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = -1987747205
	)
	static int field667;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = -2004100679
	)
	static int field546;
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	static class539 field810;
	@ObfuscatedName("gy")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("gd")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("hv")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("ho")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "[Ldk;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("hl")
	@ObfuscatedGetter(
		intValue = -1651864319
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("hu")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("hz")
	@ObfuscatedGetter(
		intValue = -319244401
	)
	static int field571;
	@ObfuscatedName("he")
	static int[] field742;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = 501404749
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ib")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("ij")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 781532859
	)
	static int field578;
	@ObfuscatedName("it")
	static String field676;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(
		intValue = 1605228497
	)
	static int field579;
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = -466590955
	)
	static int field727;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(
		intValue = -1035714311
	)
	static int field581;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		intValue = -1693460413
	)
	static int field582;
	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "[Lix;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jf")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jk")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("jb")
	static final int[] field586;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -347129783
	)
	static int field587;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = -1417865199
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 1852559161
	)
	static int field560;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 1412852269
	)
	static int field590;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1638558953
	)
	static int field624;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = -1246816987
	)
	static int field592;
	@ObfuscatedName("ko")
	static boolean field601;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = 1953249277
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = 2121411655
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = -1007554421
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 1479747429
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = 1507685453
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(
		intValue = 1595536669
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = -1293676985
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = 1994415445
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = 1778250469
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -1672423485
	)
	static int field709;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 797124179
	)
	static int field580;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = 513530031
	)
	static int field605;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -976694797
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -1458097173
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = 1629336117
	)
	@Export("revision")
	static int revision;
	@ObfuscatedName("lb")
	static boolean field609;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -998840009
	)
	static int field610;
	@ObfuscatedName("lm")
	static boolean field640;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = -371524041
	)
	static int field612;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(
		intValue = -625616649
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -1628681735
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("ln")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("lq")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("la")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("ld")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("lr")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("lc")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("ls")
	static int[][] field779;
	@ObfuscatedName("li")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("ly")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("lx")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -2035946903
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -797919909
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 1954584333
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = 1973291607
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = -350322505
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = -1879688637
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -1597326181
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("lw")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(
		intValue = -1923012897
	)
	static int field750;
	@ObfuscatedName("mi")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "[Ldi;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 513998151
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 117631011
	)
	static int field783;
	@ObfuscatedName("mm")
	@ObfuscatedGetter(
		longValue = 1568259725910291393L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		longValue = 823820592882865525L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("mx")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("mz")
	@ObfuscatedGetter(
		intValue = 1238176185
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("my")
	@ObfuscatedGetter(
		intValue = -2108726621
	)
	static int field637;
	@ObfuscatedName("ms")
	static int[] field643;
	@ObfuscatedName("me")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("mw")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ml")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("mk")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("mq")
	@ObfuscatedGetter(
		intValue = -318971713
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "[[[Lps;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nm")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("na")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("no")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nj")
	static int[] field656;
	@ObfuscatedName("nr")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("ny")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("nk")
	@ObfuscatedGetter(
		intValue = 1393357457
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("nl")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("ni")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ns")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("nb")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("nv")
	@Export("menuItemIds")
	static int[] menuItemIds;
	@ObfuscatedName("nh")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("nd")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("ng")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("nx")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("np")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("nu")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -326620835
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("on")
	@ObfuscatedGetter(
		intValue = 104209035
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = -151568775
	)
	static int field673;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -213845595
	)
	static int field622;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 1884054561
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("of")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = 375242793
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = 393054261
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("oc")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("ow")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -1830863367
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("og")
	@ObfuscatedGetter(
		intValue = 505783049
	)
	static int field684;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(
		intValue = 1873470081
	)
	static int field685;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = -171298679
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = 1117430523
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(
		intValue = -1474026165
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = 1268471839
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("pv")
	@ObfuscatedGetter(
		intValue = -1713173713
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("pm")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("clickedWidget")
	public static Widget clickedWidget;
	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -510641151
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -1499508753
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("po")
	static boolean field699;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = 2101611289
	)
	static int field700;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 1332326869
	)
	static int field701;
	@ObfuscatedName("pd")
	static boolean field702;
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = -1301134505
	)
	static int field570;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = -508397453
	)
	static int field704;
	@ObfuscatedName("ph")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = 186152535
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pf")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qt")
	@ObfuscatedGetter(
		intValue = -1863139113
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("qu")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qs")
	@ObfuscatedGetter(
		intValue = 1747756183
	)
	static int field710;
	@ObfuscatedName("qe")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = -267819995
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qp")
	static int[] field631;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 690667561
	)
	static int field714;
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -1248244123
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(
		intValue = 1035217401
	)
	static int field716;
	@ObfuscatedName("qh")
	@ObfuscatedGetter(
		intValue = -1135055711
	)
	static int field717;
	@ObfuscatedName("qc")
	@ObfuscatedGetter(
		intValue = 1448568019
	)
	static int field681;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -815242923
	)
	static int field719;
	@ObfuscatedName("qk")
	@ObfuscatedGetter(
		intValue = 1475690985
	)
	static int field720;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 376064475
	)
	static int field721;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = 283544713
	)
	static int field722;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = -196122999
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static class552 field724;
	@ObfuscatedName("qg")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	static NodeDeque field726;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rv")
	@ObfuscatedGetter(
		intValue = -1439005657
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 175721625
	)
	static int field731;
	@ObfuscatedName("rd")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("ri")
	static boolean[] field816;
	@ObfuscatedName("rx")
	static boolean[] field734;
	@ObfuscatedName("rh")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("rf")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("ry")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("rr")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		intValue = -1698294165
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		longValue = -5593846966809055143L
	)
	static long field740;
	@ObfuscatedName("rn")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("ra")
	static int[] field738;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = -2083220223
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 999936741
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("re")
	static String field745;
	@ObfuscatedName("se")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -1721427473
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("sq")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	@Export("indexCheck")
	static IndexCheck indexCheck;
	@ObfuscatedName("sy")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	static class226 field749;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -2088147641
	)
	static int field611;
	@ObfuscatedName("so")
	static int[] field512;
	@ObfuscatedName("sz")
	static int[] field767;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		longValue = -2562681905139049269L
	)
	static long field753;
	@ObfuscatedName("sv")
	@ObfuscatedSignature(
		descriptor = "[Lfp;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sx")
	@ObfuscatedSignature(
		descriptor = "[Lgi;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = -2057565107
	)
	static int field756;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = -135296505
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("sa")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("sn")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = -1140692337
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("sr")
	@ObfuscatedGetter(
		intValue = -2139653513
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("th")
	@ObfuscatedGetter(
		intValue = 2073268087
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("ts")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = -1120697751
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("ty")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("td")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("tn")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("to")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("tv")
	static int[] field770;
	@ObfuscatedName("tu")
	@ObfuscatedSignature(
		descriptor = "[Lbu;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("tx")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("tc")
	static boolean field603;
	@ObfuscatedName("tt")
	static boolean field774;
	@ObfuscatedName("tk")
	static boolean field514;
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "Ltq;"
	)
	static class499 field776;
	@ObfuscatedName("uh")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	static class498 field777;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	static class498 field778;
	@ObfuscatedName("uu")
	static boolean field626;
	@ObfuscatedName("uq")
	static boolean[] field780;
	@ObfuscatedName("ux")
	static int[] field744;
	@ObfuscatedName("ug")
	static int[] field782;
	@ObfuscatedName("uf")
	static int[] field548;
	@ObfuscatedName("us")
	static int[] field784;
	@ObfuscatedName("uc")
	static short field785;
	@ObfuscatedName("ue")
	static short field786;
	@ObfuscatedName("uz")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("ui")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("um")
	static short field789;
	@ObfuscatedName("vj")
	static short field728;
	@ObfuscatedName("vl")
	static short field791;
	@ObfuscatedName("vg")
	static short field792;
	@ObfuscatedName("vq")
	@ObfuscatedGetter(
		intValue = 1240360395
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vi")
	@ObfuscatedGetter(
		intValue = -95363373
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vb")
	@ObfuscatedGetter(
		intValue = 320464101
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("vv")
	@ObfuscatedGetter(
		intValue = -1387919075
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vc")
	@ObfuscatedGetter(
		intValue = 1263846625
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vd")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("vp")
	@ObfuscatedGetter(
		intValue = -317981919
	)
	static int field799;
	@ObfuscatedName("vx")
	@ObfuscatedGetter(
		intValue = 458385547
	)
	static int field800;
	@ObfuscatedName("vk")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	static class495 field621;
	@ObfuscatedName("gj")
	@Export("token")
	String token;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("gc")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("gk")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("gf")
	@Export("https")
	boolean https;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = 1420283109
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("gq")
	@Export("refreshAccessTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("gh")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	Buffer field564;
	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	class7 field565;
	@ObfuscatedName("hh")
	@ObfuscatedGetter(
		longValue = -8932366639438060943L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field803 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field513 = -1;
		clientType = -1;
		field794 = -1;
		onMobile = false;
		gameState = 0;
		field519 = false;
		field788 = false;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field795 = -1;
		field525 = -1;
		field526 = -1L;
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
		field540 = class93.field1152;
		js5ConnectState = 0;
		field542 = 0;
		js5Errors = 0;
		field544 = 0;
		field667 = 0;
		field546 = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field810 = class539.field5290;
		BASIC_AUTH_DESKTOP_OSRS = class130.base64Encode(class27.method401("com_jagex_auth_desktop_osrs:public"));
		BASIC_AUTH_DESKTOP_RUNELITE = class130.base64Encode(class27.method401("com_jagex_auth_desktop_runelite:public"));
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[65536];
		npcCount = 0;
		npcIndices = new int[65536];
		field571 = 0;
		field742 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field578 = 0;
		field579 = 1;
		field727 = 0;
		field581 = 1;
		field582 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field586 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field587 = -1;
		graphicsCycle = 0;
		field560 = 2301979;
		field590 = 5063219;
		field624 = 3353893;
		field592 = 7759444;
		field601 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field709 = 0;
		field580 = 0;
		field605 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		revision = 0;
		field609 = false;
		field610 = 0;
		field640 = false;
		field612 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field779 = new int[overheadTextLimit][];
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
		field750 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field783 = 0;
		userId = -1L;
		userHash = -1L;
		renderSelf = true;
		drawPlayerNames = 0;
		field637 = 0;
		field643 = new int[1000];
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
		field656 = new int[25];
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
		field673 = 0;
		field622 = 50;
		isItemSelected = 0;
		field676 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field684 = 0;
		field685 = -1;
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
		field699 = false;
		field700 = -1;
		field701 = -1;
		field702 = false;
		field570 = -1;
		field704 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field710 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field631 = new int[32];
		field714 = 0;
		chatCycle = 0;
		field716 = 0;
		field717 = 0;
		field681 = 0;
		field719 = 0;
		field720 = 0;
		field721 = 0;
		field722 = 0;
		mouseWheelRotation = 0;
		field724 = new class552();
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field726 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field731 = -2;
		validRootWidgets = new boolean[100];
		field816 = new boolean[100];
		field734 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field740 = 0L;
		isResizable = true;
		field738 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field745 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		indexCheck = new IndexCheck();
		field749 = new class226();
		field611 = 0;
		field512 = new int[128];
		field767 = new int[128];
		field753 = -1L;
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
		field770 = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field603 = false;
		field774 = false;
		field514 = false;
		field776 = null;
		field777 = null;
		field778 = null;
		field626 = false;
		field780 = new boolean[5];
		field744 = new int[5];
		field782 = new int[5];
		field548 = new int[5];
		field784 = new int[5];
		field785 = 256;
		field786 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field789 = 1;
		field728 = 32767;
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
		field621 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field597 = new class443(8, class441.field4748);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field807 = -1;
		field808 = -1;
		field533 = new ArrayList();
		field629 = new class234();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field773 = 0;
		field814 = new ApproximateRouteStrategy();
		field815 = new int[50];
		field655 = new int[50];
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "93"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field740 = VerticalAlignment.method3924() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1235(true);
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2131760919"
	)
	@Export("setUp")
	protected final void setUp() {
		class195.method3737(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		int var2 = worldProperties;
		class530 var3 = class530.field5203;
		boolean var1 = (var2 & var3.rsOrdinal()) != 0;
		ScriptFrame.field460 = var1;
		HttpRequest.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		SoundCache.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		DesktopPlatformInfoProvider.currentPort = HttpRequest.worldPort;
		class172.field1858 = class348.field3729;
		UrlRequester.field1454 = class348.field3728;
		PlayerComposition.field3682 = class348.field3727;
		class1.field6 = class348.field3726;
		class94.urlRequester = new SecureUrlRequester(this.https, 221);
		this.setUpKeyboard();
		this.setUpMouse();
		HealthBar.mouseWheel = this.mouseWheel();
		this.method466(field749, 0);
		this.method466(indexCheck, 1);
		this.setUpClipboard();
		Decimator.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		NPC.clientPreferences = Projectile.method2178();
		String var5 = class311.field3313;
		class31.field153 = this;
		if (var5 != null) {
			class31.field150 = var5;
		}

		MouseRecorder.setWindowedMode(NPC.clientPreferences.getWindowMode());
		class334.friendSystem = new FriendSystem(class127.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		if (!class321.field3499.contains(this)) {
			class321.field3499.add(this);
		}

		field629.method4441();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1556625952"
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
				boolean var11 = false;
				boolean var12 = false;
				if (!class321.field3498.isEmpty()) {
					SongTask var4 = (SongTask)class321.field3498.get(0);
					if (var4 == null) {
						class321.field3498.remove(0);
					} else if (var4.vmethod7854()) {
						if (var4.method7826()) {
							System.out.println("Error in midimanager.service: " + var4.method7842());
							var11 = true;
						} else {
							if (var4.method7827() != null) {
								class321.field3498.add(1, var4.method7827());
							}

							var12 = var4.method7829();
						}

						class321.field3498.remove(0);
					} else {
						var12 = var4.method7829();
					}
				}

				if (var11) {
					class321.field3498.clear();
					Iterator var16 = class321.musicSongs.iterator();

					label135:
					while (true) {
						MusicSong var5;
						do {
							if (!var16.hasNext()) {
								class321.musicSongs.clear();
								break label135;
							}

							var5 = (MusicSong)var16.next();
						} while(var5 == null);

						var5.midiPcmStream.clear();
						var5.midiPcmStream.method6004();
						var5.midiPcmStream.setPcmStreamVolume(0);
						var5.midiPcmStream.field3534 = 0;
						int var6 = var5.musicTrackGroupId;
						int var7 = var5.musicTrackFileId;
						Iterator var8 = class321.field3499.iterator();

						while (var8.hasNext()) {
							class327 var9 = (class327)var8.next();
							var9.vmethod6187(var6, var7);
						}
					}
				}

				if (var12 && playingJingle && class144.pcmPlayer1 != null) {
					class144.pcmPlayer1.tryDiscard();
				}

				class167.method3417();
				indexCheck.method4327();
				this.method530();
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

				if (HealthBar.mouseWheel != null) {
					int var17 = HealthBar.mouseWheel.useRotation();
					mouseWheelRotation = var17;
				}

				if (gameState == 0) {
					KitDefinition.method3775();
					class11.method103();
				} else if (gameState == 5) {
					Huffman.loginScreen(this, DevicePcmPlayerProvider.fontPlain11, class316.fontPlain12);
					KitDefinition.method3775();
					class11.method103();
				} else if (gameState != 10 && gameState != 11) {
					if (gameState == 20) {
						Huffman.loginScreen(this, DevicePcmPlayerProvider.fontPlain11, class316.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						Huffman.loginScreen(this, DevicePcmPlayerProvider.fontPlain11, class316.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						class444.method8026();
					}
				} else {
					Huffman.loginScreen(this, DevicePcmPlayerProvider.fontPlain11, class316.fontPlain12);
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "17"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field740 && VerticalAlignment.method3924() > field740) {
			MouseRecorder.setWindowedMode(class36.getWindowedMode());
		}

		int var2;
		if (var1) {
			for (var2 = 0; var2 < 100; ++var2) {
				validRootWidgets[var2] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1, class276.field3052);
		} else if (gameState == 5) {
			GrandExchangeEvent.drawTitle(DevicePcmPlayerProvider.fontBold12, DevicePcmPlayerProvider.fontPlain11, class316.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				GrandExchangeEvent.drawTitle(DevicePcmPlayerProvider.fontBold12, DevicePcmPlayerProvider.fontPlain11, class316.fontPlain12);
			} else if (gameState == 50) {
				GrandExchangeEvent.drawTitle(DevicePcmPlayerProvider.fontBold12, DevicePcmPlayerProvider.fontPlain11, class316.fontPlain12);
			} else if (gameState == 25) {
				if (field582 == 1) {
					if (field578 > field579) {
						field579 = field578;
					}

					var2 = (field579 * 50 - field578 * 50) / field579;
					WorldMapSectionType.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field582 == 2) {
					if (field727 > field581) {
						field581 = field727;
					}

					var2 = (field581 * 50 - field727 * 50) / field581 + 50;
					WorldMapSectionType.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					WorldMapSectionType.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				WorldMapSectionType.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				WorldMapSectionType.drawLoadingMessage("Please wait...", false);
			}
		} else {
			GrandExchangeEvent.drawTitle(DevicePcmPlayerProvider.fontBold12, DevicePcmPlayerProvider.fontPlain11, class316.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field816[var2]) {
					UserComparator9.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field816[var2] = false;
				}
			}
		} else if (gameState > 0) {
			UserComparator9.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field816[var2] = false;
			}
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-283961032"
	)
	@Export("kill0")
	protected final void kill0() {
		if (class130.varcs != null && class130.varcs.hasUnwrittenChanges()) {
			class130.varcs.write();
		}

		if (Tiles.mouseRecorder != null) {
			Tiles.mouseRecorder.isRunning = false;
		}

		Tiles.mouseRecorder = null;
		packetWriter.close();
		ItemLayer.method4476();
		HealthBar.mouseWheel = null;
		if (class144.pcmPlayer1 != null) {
			class144.pcmPlayer1.shutdown();
		}

		ChatChannel.field1023.method7078();
		StructComposition.method4041();
		if (class94.urlRequester != null) {
			class94.urlRequester.close();
			class94.urlRequester = null;
		}

		Archive.method6949();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "740257686"
	)
	protected final void vmethod1203() {
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1417553926"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "569638281"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return class308.accessToken != null && !class308.accessToken.trim().isEmpty() && class103.refreshToken != null && !class103.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2073819898"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return class134.sessionId != null && !class134.sessionId.trim().isEmpty() && class363.characterId != null && !class363.characterId.trim().isEmpty();
	}

	@ObfuscatedName("gy")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-92"
	)
	boolean method1212() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1043645398"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(ArchiveLoader.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(ArchiveLoader.authServiceBaseUrl)).getHost());
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

	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1704443459"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(ArchiveLoader.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
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

	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "13"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class31.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "295726016"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = ChatChannel.field1023.method7050();
			if (!var1) {
				this.method1373();
			}

		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1480366802"
	)
	void method1373() {
		if (ChatChannel.field1023.field4456 >= 4) {
			this.error("js5crc");
			FaceNormal.updateGameState(1000);
		} else {
			if (ChatChannel.field1023.field4457 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					FaceNormal.updateGameState(1000);
					return;
				}

				field542 = 3000;
				ChatChannel.field1023.field4457 = 3;
			}

			if (--field542 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class411.js5SocketTask = class350.taskHandler.newSocketTask(class166.worldHost, DesktopPlatformInfoProvider.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class411.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class411.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						Socket var2 = (Socket)class411.js5SocketTask.result;
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
						ViewportMouse.js5Socket = var1;
						Buffer var3 = new Buffer(5);
						var3.writeByte(class314.field3448.field3456);
						var3.writeInt(221);
						ViewportMouse.js5Socket.write(var3.array, 0, 5);
						++js5ConnectState;
						class167.field1823 = VerticalAlignment.method3924();
					}

					if (js5ConnectState == 3) {
						if (ViewportMouse.js5Socket.available() > 0) {
							int var4 = ViewportMouse.js5Socket.readUnsignedByte();
							if (var4 != 0) {
								this.js5Error(var4);
								return;
							}

							++js5ConnectState;
						} else if (VerticalAlignment.method3924() - class167.field1823 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						ChatChannel.field1023.method7053(ViewportMouse.js5Socket, gameState > 20);
						class411.js5SocketTask = null;
						ViewportMouse.js5Socket = null;
						js5ConnectState = 0;
						js5Errors = 0;
					}
				} catch (IOException var5) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1926825051"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		class411.js5SocketTask = null;
		ViewportMouse.js5Socket = null;
		js5ConnectState = 0;
		if (DesktopPlatformInfoProvider.currentPort == HttpRequest.worldPort) {
			DesktopPlatformInfoProvider.currentPort = SoundCache.js5Port;
		} else {
			DesktopPlatformInfoProvider.currentPort = HttpRequest.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				FaceNormal.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					FaceNormal.updateGameState(1000);
				} else {
					field542 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			FaceNormal.updateGameState(1000);
		} else {
			field542 = 3000;
		}

	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1121672504"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (GraphicsObject.loginState == LoginState.SHUTDOWN_PREVIOUS_CONNECTION) {
				if (ClanSettings.field1757 == null && (secureRandomFuture.isDone() || field544 > 250)) {
					ClanSettings.field1757 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (ClanSettings.field1757 != null) {
					if (var1 != null) {
						((AbstractSocket)var1).close();
						var1 = null;
					}

					class317.field3469 = null;
					hadNetworkError = false;
					field544 = 0;
					if (field810.method9558()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(class103.refreshToken);
								class102.updateLoginState(LoginState.TOKEN_RESPONSE);
							} catch (Throwable var22) {
								class180.RunException_sendStackTrace((String)null, var22);
								class28.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								class28.getLoginError(65);
								return;
							}

							try {
								this.authenticate(class134.sessionId, class363.characterId);
								class102.updateLoginState(LoginState.REFRESHING_TOKEN);
							} catch (Exception var21) {
								class180.RunException_sendStackTrace((String)null, var21);
								class28.getLoginError(65);
								return;
							}
						}
					} else {
						class102.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
					}
				}
			}

			HttpResponse var24;
			if (GraphicsObject.loginState == LoginState.TOKEN_RESPONSE) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						class28.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							class28.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						class308.accessToken = var3.getAccessToken();
						class103.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var20) {
						class180.RunException_sendStackTrace((String)null, var20);
						class28.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						class28.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						class180.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						class28.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var24 = this.asyncAccessTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						class28.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field544 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var24.getResponseBody());

					try {
						class308.accessToken = var4.getBody().getString("access_token");
						class103.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var19) {
						class180.RunException_sendStackTrace("Error parsing tokens", var19);
						class28.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(class308.accessToken);
				class102.updateLoginState(LoginState.REFRESHING_TOKEN);
			}

			if (GraphicsObject.loginState == LoginState.REFRESHING_TOKEN) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						class28.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var25.isSuccess()) {
							class28.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var25.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var18) {
						class180.RunException_sendStackTrace((String)null, var18);
						class28.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						class28.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						class180.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						class28.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var24 = this.asyncGameSessionTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						class180.RunException_sendStackTrace("Response code: " + var24.getResponseCode() + "Response body: " + var24.getResponseBody(), (Throwable)null);
						class28.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var27 = (List)var24.getHeaderFields().get("Content-Type");
					if (var27 != null && var27.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var24.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var17) {
							class180.RunException_sendStackTrace((String)null, var17);
							class28.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var24.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field544 = 0;
				class102.updateLoginState(LoginState.INIT_MOUSEHANDLER_SOCKET);
			}

			if (LoginState.INIT_MOUSEHANDLER_SOCKET == GraphicsObject.loginState) {
				if (class317.field3469 == null) {
					class317.field3469 = class350.taskHandler.newSocketTask(class166.worldHost, DesktopPlatformInfoProvider.currentPort);
				}

				if (class317.field3469.status == 2) {
					throw new IOException();
				}

				if (class317.field3469.status == 1) {
					Socket var29 = (Socket)class317.field3469.result;
					BufferedNetSocket var26 = new BufferedNetSocket(var29, 40000, 5000);
					var1 = var26;
					packetWriter.setSocket(var26);
					class317.field3469 = null;
					class102.updateLoginState(LoginState.UNMAPPED_20);
				}
			}

			PacketBufferNode var28;
			if (GraphicsObject.loginState == LoginState.UNMAPPED_20) {
				packetWriter.clearBuffer();
				var28 = class171.method3447();
				var28.packetBuffer.writeByte(class314.field3454.field3456);
				packetWriter.addNode(var28);
				packetWriter.flush();
				var2.offset = 0;
				class102.updateLoginState(LoginState.READ_LOGIN_STATUS);
			}

			int var13;
			if (GraphicsObject.loginState == LoginState.READ_LOGIN_STATUS) {
				if (class144.pcmPlayer1 != null) {
					class144.pcmPlayer1.method763();
				}

				if (((AbstractSocket)var1).isAvailable(1)) {
					var13 = ((AbstractSocket)var1).readUnsignedByte();
					if (class144.pcmPlayer1 != null) {
						class144.pcmPlayer1.method763();
					}

					if (var13 != 0) {
						class28.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					class102.updateLoginState(LoginState.READ_RANDOM_VERIFICATION_NUMBER);
				}
			}

			if (GraphicsObject.loginState == LoginState.READ_RANDOM_VERIFICATION_NUMBER) {
				if (var2.offset < 8) {
					var13 = ((AbstractSocket)var1).available();
					if (var13 > 8 - var2.offset) {
						var13 = 8 - var2.offset;
					}

					if (var13 > 0) {
						((AbstractSocket)var1).read(var2.array, var2.offset, var13);
						var2.offset += var13;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					Buffer.field5233 = var2.readLong();
					class102.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}
			}

			if (LoginState.WRITE_INITIAL_LOGIN_PACKET == GraphicsObject.loginState) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var30 = new PacketBuffer(500);
				int[] var31 = new int[]{ClanSettings.field1757.nextInt(), ClanSettings.field1757.nextInt(), ClanSettings.field1757.nextInt(), ClanSettings.field1757.nextInt()};
				var30.offset = 0;
				var30.writeByte(1);
				var30.writeInt(var31[0]);
				var30.writeInt(var31[1]);
				var30.writeInt(var31[2]);
				var30.writeInt(var31[3]);
				var30.writeLong(Buffer.field5233);
				if (gameState == 40) {
					var30.writeInt(Login.field965[0]);
					var30.writeInt(Login.field965[1]);
					var30.writeInt(Login.field965[2]);
					var30.writeInt(Login.field965[3]);
				} else {
					if (gameState == 50) {
						var30.writeByte(AuthenticationScheme.field1660.rsOrdinal());
						var30.writeInt(class332.field3603);
					} else {
						var30.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
						case 2:
							var30.writeMedium(SpriteMask.otpMedium);
							++var30.offset;
							break;
						case 1:
							var30.offset += 4;
						case 3:
						default:
							break;
						case 4:
							var30.writeInt(NPC.clientPreferences.getParameterValue(Login.Login_username));
						}
					}

					if (field810.method9558()) {
						var30.writeByte(class539.field5285.rsOrdinal());
						var30.writeStringCp1252NullTerminated(this.token);
					} else {
						var30.writeByte(class539.field5290.rsOrdinal());
						var30.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var30.encryptRsa(class75.field923, class75.field921);
				Login.field965 = var31;
				PacketBufferNode var32 = class171.method3447();
				var32.packetBuffer.offset = 0;
				if (gameState == 40) {
					var32.packetBuffer.writeByte(class314.field3451.field3456);
				} else {
					var32.packetBuffer.writeByte(class314.field3450.field3456);
				}

				var32.packetBuffer.writeShort(0);
				int var6 = var32.packetBuffer.offset;
				var32.packetBuffer.writeInt(221);
				var32.packetBuffer.writeInt(1);
				var32.packetBuffer.writeByte(clientType);
				var32.packetBuffer.writeByte(field794);
				byte var7 = 0;
				var32.packetBuffer.writeByte(var7);
				var32.packetBuffer.writeBytes(var30.array, 0, var30.offset);
				int var8 = var32.packetBuffer.offset;
				var32.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var32.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var32.packetBuffer.writeShort(class148.canvasWidth);
				var32.packetBuffer.writeShort(class342.canvasHeight);
				PacketBuffer var9 = var32.packetBuffer;
				if (randomDatData != null) {
					var9.writeBytes(randomDatData, 0, randomDatData.length);
				} else {
					byte[] var10 = Player.randomDatData2();
					var9.writeBytes(var10, 0, var10.length);
				}

				var32.packetBuffer.writeStringCp1252NullTerminated(ViewportMouse.field2868);
				var32.packetBuffer.writeInt(class276.field3045);
				var32.packetBuffer.writeByte(0);
				Buffer var43 = new Buffer(class166.platformInfo.size());
				class166.platformInfo.write(var43);
				var32.packetBuffer.writeBytes(var43.array, 0, var43.array.length);
				var32.packetBuffer.writeByte(clientType);
				var32.packetBuffer.writeInt(0);
				if (ScriptFrame.field460) {
					var32.packetBuffer.writeIntLE(class141.field1669.hash);
					var32.packetBuffer.writeIntME(UserComparator6.archive6.hash);
					var32.packetBuffer.writeIntLE(class93.field1170.hash);
					var32.packetBuffer.writeIntIME(GraphicsObject.field883.hash);
					var32.packetBuffer.writeIntIME(GameEngine.archive8.hash);
					var32.packetBuffer.writeIntIME(SpriteMask.archive10.hash);
					var32.packetBuffer.writeIntLE(LoginState.archive13.hash);
				} else {
					var32.packetBuffer.writeIntLE(UrlRequester.field1452.hash);
					var32.packetBuffer.writeIntIME(class141.field1669.hash);
					var32.packetBuffer.writeIntIME(GraphicsObject.field883.hash);
					var32.packetBuffer.writeIntLE(SceneTilePaint.field2883.hash);
					var32.packetBuffer.writeIntME(LoginState.archive13.hash);
					var32.packetBuffer.writeIntLE(0);
					var32.packetBuffer.writeIntLE(class17.field75.hash);
					var32.packetBuffer.writeInt(SpriteMask.archive10.hash);
					var32.packetBuffer.writeIntME(class107.field1377.hash);
					var32.packetBuffer.writeInt(class470.field4874.hash);
					var32.packetBuffer.writeIntME(GameEngine.archive8.hash);
					var32.packetBuffer.writeIntLE(UserComparator6.archive6.hash);
					var32.packetBuffer.writeIntIME(class153.field1726.hash);
					var32.packetBuffer.writeIntIME(SoundCache.field308.hash);
					var32.packetBuffer.writeInt(class93.field1170.hash);
					var32.packetBuffer.writeInt(GrandExchangeOfferOwnWorldComparator.archive12.hash);
					var32.packetBuffer.writeIntME(class73.archive9.hash);
					var32.packetBuffer.writeIntIME(GrandExchangeOfferOwnWorldComparator.archive4.hash);
					var32.packetBuffer.writeIntIME(WorldMapScaleHandler.field3167.hash);
					var32.packetBuffer.writeIntIME(UserComparator9.archive2.hash);
					var32.packetBuffer.writeIntIME(PlayerType.field4332.hash);
				}

				var32.packetBuffer.xteaEncrypt(var31, var8, var32.packetBuffer.offset);
				var32.packetBuffer.writeLengthShort(var32.packetBuffer.offset - var6);
				packetWriter.addNode(var32);
				packetWriter.flush();
				packetWriter.isaacCipher = new IsaacCipher(var31);
				int[] var11 = new int[4];

				for (int var12 = 0; var12 < 4; ++var12) {
					var11[var12] = var31[var12] + 50;
				}

				var2.newIsaacCipher(var11);
				class102.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			int var14;
			if (GraphicsObject.loginState == LoginState.READ_CLIENT_INFO_STATUS && ((AbstractSocket)var1).available() > 0) {
				var13 = ((AbstractSocket)var1).readUnsignedByte();
				if (var13 == 61) {
					var14 = ((AbstractSocket)var1).available();
					WorldMapRectangle.field3108 = var14 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1;
					class102.updateLoginState(LoginState.WRITE_INITIAL_LOGIN_PACKET);
				}

				if (var13 == 21 && gameState == 20) {
					class102.updateLoginState(LoginState.READ_PROFILE_TRANSFER_TIME);
				} else if (var13 == 2) {
					if (ScriptFrame.field460) {
						class102.updateLoginState(LoginState.UNMAPPED_21);
					} else {
						class102.updateLoginState(LoginState.UNMAPPED);
					}
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					class102.updateLoginState(LoginState.UNMAPPED_19);
				} else if (var13 == 64) {
					class102.updateLoginState(LoginState.READ_STATE_11_PACKET_SIZE);
				} else if (var13 == 23 && field667 < 1) {
					++field667;
					class102.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				} else if (var13 == 29) {
					class102.updateLoginState(LoginState.UNMAPPED_17);
				} else {
					if (var13 != 69) {
						class28.getLoginError(var13);
						return;
					}

					class102.updateLoginState(LoginState.READ_DIGEST_PARSER_PACKET_SIZE);
				}
			}

			if (LoginState.UNMAPPED_21 == GraphicsObject.loginState) {
				class276.field3052 = true;
				ConcurrentMidiTask.method7851(class93.field1156);
				FaceNormal.updateGameState(0);
			}

			if (GraphicsObject.loginState == LoginState.READ_DIGEST_PARSER_PACKET_SIZE && ((AbstractSocket)var1).available() >= 2) {
				((AbstractSocket)var1).read(var2.array, 0, 2);
				var2.offset = 0;
				class127.field1520 = var2.readUnsignedShort();
				class102.updateLoginState(LoginState.SUBMIT_DIGEST_PARSER_TASK);
			}

			if (LoginState.SUBMIT_DIGEST_PARSER_TASK == GraphicsObject.loginState && ((AbstractSocket)var1).available() >= class127.field1520) {
				var2.offset = 0;
				((AbstractSocket)var1).read(var2.array, var2.offset, class127.field1520);
				class6[] var33 = new class6[]{class6.field12};
				class6 var34 = var33[var2.readUnsignedByte()];

				try {
					class3 var35 = FileSystem.method3536(var34);
					this.field565 = new class7(var2, var35);
					class102.updateLoginState(LoginState.WRITE_DIGEST_PARSER_RESULT);
				} catch (Exception var16) {
					class28.getLoginError(22);
					return;
				}
			}

			if (GraphicsObject.loginState == LoginState.WRITE_DIGEST_PARSER_RESULT && this.field565.method46()) {
				this.field564 = this.field565.method58();
				this.field565.method59();
				this.field565 = null;
				if (this.field564 == null) {
					class28.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var28 = class171.method3447();
				var28.packetBuffer.writeByte(class314.field3457.field3456);
				var28.packetBuffer.writeShort(this.field564.offset);
				var28.packetBuffer.writeBuffer(this.field564);
				packetWriter.addNode(var28);
				packetWriter.flush();
				this.field564 = null;
				class102.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (GraphicsObject.loginState == LoginState.READ_STATE_11_PACKET_SIZE && ((AbstractSocket)var1).available() > 0) {
				class234.field2490 = ((AbstractSocket)var1).readUnsignedByte();
				class102.updateLoginState(LoginState.UNMAPPED_11);
			}

			if (GraphicsObject.loginState == LoginState.UNMAPPED_11 && ((AbstractSocket)var1).available() >= class234.field2490) {
				((AbstractSocket)var1).read(var2.array, 0, class234.field2490);
				var2.offset = 0;
				class102.updateLoginState(LoginState.READ_CLIENT_INFO_STATUS);
			}

			if (GraphicsObject.loginState == LoginState.READ_PROFILE_TRANSFER_TIME && ((AbstractSocket)var1).available() > 0) {
				field546 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
				class102.updateLoginState(LoginState.PROFILE_TRANSFER);
			}

			if (LoginState.PROFILE_TRANSFER == GraphicsObject.loginState) {
				field544 = 0;
				class59.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field546 / 60 + " seconds.");
				if (--field546 <= 0) {
					class102.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				}

			} else if (GraphicsObject.loginState == LoginState.READ_ACCOUNT_INFO_PACKET_SIZE) {
				var28 = class171.method3447();
				var28.packetBuffer.writeByte(class314.field3453.field3456);
				var28.packetBuffer.writeShort(class314.field3453.field3452);
				var28.packetBuffer.writeInt(SceneTilePaint.field2883.hash);
				var28.packetBuffer.writeIntIME(UserComparator9.archive2.hash);
				var28.packetBuffer.writeInt(WorldMapScaleHandler.field3167.hash);
				var28.packetBuffer.writeInt(class107.field1377.hash);
				var28.packetBuffer.writeInt(UrlRequester.field1452.hash);
				var28.packetBuffer.writeIntLE(SoundCache.field308.hash);
				var28.packetBuffer.writeIntIME(class470.field4874.hash);
				var28.packetBuffer.writeIntIME(class17.field75.hash);
				var28.packetBuffer.writeIntIME(GrandExchangeOfferOwnWorldComparator.archive12.hash);
				var28.packetBuffer.writeIntME(PlayerType.field4332.hash);
				var28.packetBuffer.writeIntME(GrandExchangeOfferOwnWorldComparator.archive4.hash);
				var28.packetBuffer.writeIntLE(class153.field1726.hash);
				var28.packetBuffer.writeIntME(class73.archive9.hash);
				var28.packetBuffer.writeIntLE(0);
				packetWriter.addNode(var28);
				packetWriter.flush();
				class102.updateLoginState(LoginState.UNMAPPED);
			} else {
				if (LoginState.UNMAPPED == GraphicsObject.loginState && ((AbstractSocket)var1).available() >= 1) {
					UrlRequester.field1453 = ((AbstractSocket)var1).readUnsignedByte();
					if (UrlRequester.field1453 != class314.field3449.field3452) {
						class28.getLoginError(UrlRequester.field1453);
						return;
					}

					class102.updateLoginState(LoginState.READ_ACCOUNT_INFO);
				}

				if (GraphicsObject.loginState == LoginState.READ_ACCOUNT_INFO && ((AbstractSocket)var1).available() >= UrlRequester.field1453) {
					boolean var45 = ((AbstractSocket)var1).readUnsignedByte() == 1;
					((AbstractSocket)var1).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var44 = false;
					if (var45) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						NPC.clientPreferences.put(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						NPC.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						NPC.clientPreferences.updateRememberedUsername((String)null);
					}

					class486.savePreferences();
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
					field783 = ((AbstractSocket)var1).readUnsignedByte();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					((AbstractSocket)var1).read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					AttackOption.method2678().method3589(this.https);
					class102.updateLoginState(LoginState.SET_SERVER_PROTOCOL);
				}

				if (GraphicsObject.loginState == LoginState.SET_SERVER_PROTOCOL && ((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
					((AbstractSocket)var1).read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method9213()) {
						((AbstractSocket)var1).read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var37 = AABB.ServerPacket_values();
					var14 = var2.readSmartByteShortIsaac();
					if (var14 < 0 || var14 >= var37.length) {
						throw new IOException("Invalid ServerProt: " + var14 + " at " + var2.offset);
					}

					packetWriter.serverPacket = var37[var14];
					packetWriter.serverPacketLength = packetWriter.serverPacket.length;
					((AbstractSocket)var1).read(var2.array, 0, 2);
					var2.offset = 0;
					packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var38 = UrlRequest.client;
						JSObject.getWindow(var38).call("zap", (Object[])null);
					} catch (Throwable var15) {
					}

					class102.updateLoginState(LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS);
				}

				if (GraphicsObject.loginState == LoginState.UPDATE_PLAYER_AND_LOAD_REGIONS) {
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method7915();
						RestClientThreadFactory.method204();
						InterfaceParent.updatePlayer(var2);
						HttpRequestTask.field85 = -1;
						class149.loadRegions(false, var2);
						packetWriter.serverPacket = null;
						field519 = false;
					}

				} else {
					if (GraphicsObject.loginState == LoginState.UNMAPPED_17 && ((AbstractSocket)var1).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, 2);
						var2.offset = 0;
						class13.field60 = var2.readUnsignedShort();
						class102.updateLoginState(LoginState.UNMAPPED_18);
					}

					if (LoginState.UNMAPPED_18 == GraphicsObject.loginState && ((AbstractSocket)var1).available() >= class13.field60) {
						var2.offset = 0;
						((AbstractSocket)var1).read(var2.array, 0, class13.field60);
						var2.offset = 0;
						String var40 = var2.readStringCp1252NullTerminated();
						String var36 = var2.readStringCp1252NullTerminated();
						String var41 = var2.readStringCp1252NullTerminated();
						class59.setLoginResponseString(var40, var36, var41);
						FaceNormal.updateGameState(10);
						if (field810.method9558()) {
							class210.method3930(9);
						}
					}

					if (GraphicsObject.loginState != LoginState.UNMAPPED_19) {
						++field544;
						if (field544 > 2000) {
							if (field667 < 1) {
								if (HttpRequest.worldPort == DesktopPlatformInfoProvider.currentPort) {
									DesktopPlatformInfoProvider.currentPort = SoundCache.js5Port;
								} else {
									DesktopPlatformInfoProvider.currentPort = HttpRequest.worldPort;
								}

								++field667;
								class102.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
							} else {
								class28.getLoginError(-3);
							}
						}
					} else {
						if (packetWriter.serverPacketLength == -1) {
							if (((AbstractSocket)var1).available() < 2) {
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2);
							var2.offset = 0;
							packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
							var2.offset = 0;
							var13 = packetWriter.serverPacketLength;
							timer.method7917();
							packetWriter.clearBuffer();
							packetWriter.packetBuffer.offset = 0;
							packetWriter.serverPacket = null;
							packetWriter.field1444 = null;
							packetWriter.field1446 = null;
							packetWriter.field1447 = null;
							packetWriter.serverPacketLength = 0;
							packetWriter.field1442 = 0;
							rebootTimer = 0;
							menuOptionsCount = 0;
							isMenuOpen = false;
							minimapState = 0;
							destinationX = 0;

							for (var14 = 0; var14 < 2048; ++var14) {
								players[var14] = null;
							}

							class133.localPlayer = null;

							for (var14 = 0; var14 < npcs.length; ++var14) {
								NPC var42 = npcs[var14];
								if (var42 != null) {
									var42.targetIndex = -1;
									var42.false0 = false;
								}
							}

							class159.method3344();
							FaceNormal.updateGameState(30);

							for (var14 = 0; var14 < 100; ++var14) {
								validRootWidgets[var14] = true;
							}

							if (packetWriter != null && packetWriter.isaacCipher != null) {
								PacketBufferNode var39 = FadeInTask.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, packetWriter.isaacCipher);
								var39.packetBuffer.writeByte(class36.getWindowedMode());
								var39.packetBuffer.writeShort(class148.canvasWidth);
								var39.packetBuffer.writeShort(class342.canvasHeight);
								packetWriter.addNode(var39);
							}

							InterfaceParent.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var23) {
			if (field667 < 1) {
				if (DesktopPlatformInfoProvider.currentPort == HttpRequest.worldPort) {
					DesktopPlatformInfoProvider.currentPort = SoundCache.js5Port;
				} else {
					DesktopPlatformInfoProvider.currentPort = HttpRequest.worldPort;
				}

				++field667;
				class102.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
			} else {
				class28.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
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
			class190.method3709();
		} else {
			if (!isMenuOpen) {
				class344.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last();
					boolean var32;
					if (var2 == null) {
						var32 = false;
					} else {
						var32 = true;
					}

					int var3;
					PacketBufferNode var33;
					if (!var32) {
						PacketBufferNode var14;
						int var15;
						if (timer.field4696) {
							var14 = FadeInTask.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method7916();
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
						synchronized(Tiles.mouseRecorder.lock) {
							if (!field803) {
								Tiles.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || Tiles.mouseRecorder.index >= 40) {
								var33 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < Tiles.mouseRecorder.index && (var33 == null || var33.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = Tiles.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = Tiles.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field795 || var8 != field525) {
										if (var33 == null) {
											var33 = FadeInTask.getPacketBufferNode(ClientPacket.field3283, packetWriter.isaacCipher);
											var33.packetBuffer.writeByte(0);
											var3 = var33.packetBuffer.offset;
											PacketBuffer var10000 = var33.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (field526 != -1L) {
											var10 = var9 - field795;
											var11 = var8 - field525;
											var12 = (int)((Tiles.mouseRecorder.millis[var7] - field526) / 20L);
											var5 = (int)((long)var5 + (Tiles.mouseRecorder.millis[var7] - field526) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field795 = var9;
										field525 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var33.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var33.packetBuffer.writeByte(var12 + 128);
											var33.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var33.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var33.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var33.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var33.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var33.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var33.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field526 = Tiles.mouseRecorder.millis[var7];
									}
								}

								if (var33 != null) {
									var33.packetBuffer.writeLengthByte(var33.packetBuffer.offset - var3);
									var7 = var33.packetBuffer.offset;
									var33.packetBuffer.offset = var3;
									var33.packetBuffer.writeByte(var5 / var6);
									var33.packetBuffer.writeByte(var5 % var6);
									var33.packetBuffer.offset = var7;
									packetWriter.addNode(var33);
								}

								if (var4 >= Tiles.mouseRecorder.index) {
									Tiles.mouseRecorder.index = 0;
								} else {
									MouseRecorder var48 = Tiles.mouseRecorder;
									var48.index -= var4;
									System.arraycopy(Tiles.mouseRecorder.xs, var4, Tiles.mouseRecorder.xs, 0, Tiles.mouseRecorder.index);
									System.arraycopy(Tiles.mouseRecorder.ys, var4, Tiles.mouseRecorder.ys, 0, Tiles.mouseRecorder.index);
									System.arraycopy(Tiles.mouseRecorder.millis, var4, Tiles.mouseRecorder.millis, 0, Tiles.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !class412.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > class342.canvasHeight) {
								var3 = class342.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class148.canvasWidth) {
								var4 = class148.canvasWidth;
							}

							var5 = (int)var16;
							var18 = FadeInTask.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (mouseWheelRotation != 0) {
							var14 = FadeInTask.getPacketBufferNode(ClientPacket.field3297, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(mouseWheelRotation);
							packetWriter.addNode(var14);
						}

						if (indexCheck.field2431 > 0) {
							var14 = FadeInTask.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = VerticalAlignment.method3924();

							for (var5 = 0; var5 < indexCheck.field2431; ++var5) {
								long var21 = var19 - field753;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field753 = var19;
								var14.packetBuffer.writeMedium((int)var21);
								var14.packetBuffer.writeByteSub(indexCheck.field2432[var5]);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field610 > 0) {
							--field610;
						}

						if (indexCheck.isValidIndexInRange(96) || indexCheck.isValidIndexInRange(97) || indexCheck.isValidIndexInRange(98) || indexCheck.isValidIndexInRange(99)) {
							field640 = true;
						}

						if (field640 && field610 <= 0) {
							field610 = 20;
							field640 = false;
							var14 = FadeInTask.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
							var14.packetBuffer.writeShortLE(camAngleX);
							var14.packetBuffer.writeShortLE(camAngleY);
							packetWriter.addNode(var14);
						}

						if (WorldMapRenderer.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = FadeInTask.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!WorldMapRenderer.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = FadeInTask.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (ModeWhere.worldMap != null) {
							ModeWhere.worldMap.method8913();
						}

						Player var34;
						if (Player.ClanChat_inClanChat) {
							if (class143.friendsChat != null) {
								class143.friendsChat.sort();
							}

							for (var1 = 0; var1 < Players.Players_count; ++var1) {
								var34 = players[Players.Players_indices[var1]];
								var34.clearIsInFriendsChat();
							}

							Player.ClanChat_inClanChat = false;
						}

						if (GraphicsObject.field893) {
							for (var1 = 0; var1 < Players.Players_count; ++var1) {
								var34 = players[Players.Players_indices[var1]];
								var34.method2338();
							}

							GraphicsObject.field893 = false;
						}

						int[] var35;
						if (class172.Client_plane != field756) {
							field756 = class172.Client_plane;
							var1 = class172.Client_plane;
							var35 = Interpreter.sceneMinimapSprite.pixels;
							var3 = var35.length;

							for (var4 = 0; var4 < var3; ++var4) {
								var35[var4] = 0;
							}

							for (var4 = 1; var4 < 103; ++var4) {
								var5 = (103 - var4) * 2048 + 24628;

								for (var6 = 1; var6 < 103; ++var6) {
									if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) {
										LoginType.scene.drawTileMinimap(var35, var5, 512, var1, var6, var4);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) {
										LoginType.scene.drawTileMinimap(var35, var5, 512, var1 + 1, var6, var4);
									}

									var5 += 4;
								}
							}

							var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
							var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
							Interpreter.sceneMinimapSprite.setRaster();

							for (var6 = 1; var6 < 103; ++var6) {
								for (var7 = 1; var7 < 103; ++var7) {
									if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) {
										GrandExchangeOfferOwnWorldComparator.drawObject(var1, var7, var6, var4, var5);
									}

									if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) {
										GrandExchangeOfferOwnWorldComparator.drawObject(var1 + 1, var7, var6, var4, var5);
									}
								}
							}

							mapIconCount = 0;

							for (var6 = 0; var6 < 104; ++var6) {
								for (var7 = 0; var7 < 104; ++var7) {
									long var23 = LoginType.scene.getFloorDecorationTag(class172.Client_plane, var6, var7);
									if (0L != var23) {
										var10 = NpcOverrides.Entity_unpackID(var23);
										var11 = MouseRecorder.getObjectDefinition(var10).mapIconId;
										if (var11 >= 0 && WidgetDefinition.WorldMapElement_get(var11).field2012) {
											mapIcons[mapIconCount] = WidgetDefinition.WorldMapElement_get(var11).getSpriteBool(false);
											mapIconXs[mapIconCount] = var6;
											mapIconYs[mapIconCount] = var7;
											++mapIconCount;
										}
									}
								}
							}

							UserComparator9.rasterProvider.apply();
						}

						if (gameState != 30) {
							return;
						}

						class192.method3720();
						ReflectionCheck.method670();
						++packetWriter.field1442;
						if (packetWriter.field1442 > 750) {
							class190.method3709();
							return;
						}

						var1 = Players.Players_count;
						var35 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var25 = players[var35[var3]];
							if (var25 != null) {
								ModeWhere.updateActorSequence(var25, 1);
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) {
							var15 = npcIndices[var1];
							NPC var26 = npcs[var15];
							if (var26 != null) {
								ModeWhere.updateActorSequence(var26, var26.definition.size);
							}
						}

						class307.method5910();
						++graphicsCycle;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 20;
							if (mouseCrossState * 400 >= 400) {
								mouseCrossColor = 0;
							}
						}

						Widget var40 = ModelData0.mousedOverWidgetIf1;
						Widget var36 = class288.field3137;
						ModelData0.mousedOverWidgetIf1 = null;
						class288.field3137 = null;
						draggedOnWidget = null;
						field702 = false;
						field699 = false;
						field611 = 0;

						while (indexCheck.method4337() && field611 < 128) {
							if (staffModLevel >= 2 && indexCheck.isValidIndexInRange(82) && indexCheck.field2440 == 66) {
								StringBuilder var42 = new StringBuilder();

								Message var41;
								for (Iterator var27 = Messages.Messages_hashTable.iterator(); var27.hasNext(); var42.append(var41.text).append('\n')) {
									var41 = (Message)var27.next();
									if (var41.sender != null && !var41.sender.isEmpty()) {
										var42.append(var41.sender).append(':');
									}
								}

								String var44 = var42.toString();
								UrlRequest.client.method463(var44);
							} else if (oculusOrbState != 1 || indexCheck.field2428 <= 0) {
								field767[field611] = indexCheck.field2440;
								field512[field611] = indexCheck.field2428;
								++field611;
							}
						}

						if (class347.method6641() && indexCheck.isValidIndexInRange(82) && indexCheck.isValidIndexInRange(81) && mouseWheelRotation != 0) {
							var3 = class133.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != class133.localPlayer.plane) {
								HealthBarDefinition.method3818(class133.localPlayer.pathX[0] + GrandExchangeOfferOwnWorldComparator.baseX * 64, class133.localPlayer.pathY[0] + DevicePcmPlayerProvider.baseY * 64, var3, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class31.updateRootInterface(rootInterface, 0, 0, class148.canvasWidth, class342.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var43;
							ScriptEvent var45;
							Widget var47;
							do {
								var45 = (ScriptEvent)scriptEvents2.removeLast();
								if (var45 == null) {
									while (true) {
										do {
											var45 = (ScriptEvent)scriptEvents3.removeLast();
											if (var45 == null) {
												while (true) {
													do {
														var45 = (ScriptEvent)scriptEvents.removeLast();
														if (var45 == null) {
															boolean var37 = false;

															while (true) {
																class227 var46 = (class227)field726.removeLast();
																if (var46 == null) {
																	if (!var37 && MouseHandler.MouseHandler_lastButton == 1) {
																		field749.method4282();
																	}

																	this.menu();
																	SoundCache.method821();
																	if (clickedWidget != null) {
																		this.method1237();
																	}

																	if (Scene.shouldSendWalk()) {
																		var4 = Scene.Scene_selectedX;
																		var5 = Scene.Scene_selectedY;
																		var18 = FadeInTask.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																		var18.packetBuffer.writeByte(5);
																		var18.packetBuffer.writeShort(GrandExchangeOfferOwnWorldComparator.baseX * 64 + var4);
																		var18.packetBuffer.writeByte(indexCheck.isValidIndexInRange(82) ? (indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
																		var18.packetBuffer.writeShortLE(DevicePcmPlayerProvider.baseY * 64 + var5);
																		packetWriter.addNode(var18);
																		Scene.method4748();
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																		mouseCrossColor = 1;
																		mouseCrossState = 0;
																		destinationX = var4;
																		destinationY = var5;
																	}

																	if (var40 != ModelData0.mousedOverWidgetIf1) {
																		if (var40 != null) {
																			WorldMapData_0.invalidateWidget(var40);
																		}

																		if (ModelData0.mousedOverWidgetIf1 != null) {
																			WorldMapData_0.invalidateWidget(ModelData0.mousedOverWidgetIf1);
																		}
																	}

																	if (var36 != class288.field3137 && field622 == field673) {
																		if (var36 != null) {
																			WorldMapData_0.invalidateWidget(var36);
																		}

																		if (class288.field3137 != null) {
																			WorldMapData_0.invalidateWidget(class288.field3137);
																		}
																	}

																	if (class288.field3137 != null) {
																		if (field673 < field622) {
																			++field673;
																			if (field622 == field673) {
																				WorldMapData_0.invalidateWidget(class288.field3137);
																			}
																		}
																	} else if (field673 > 0) {
																		--field673;
																	}

																	if (oculusOrbState == 0) {
																		var4 = class133.localPlayer.x;
																		var5 = class133.localPlayer.y;
																		if (class185.oculusOrbFocalPointX - var4 < -500 || class185.oculusOrbFocalPointX - var4 > 500 || Skeleton.oculusOrbFocalPointY - var5 < -500 || Skeleton.oculusOrbFocalPointY - var5 > 500) {
																			class185.oculusOrbFocalPointX = var4;
																			Skeleton.oculusOrbFocalPointY = var5;
																		}

																		if (var4 != class185.oculusOrbFocalPointX) {
																			class185.oculusOrbFocalPointX += (var4 - class185.oculusOrbFocalPointX) / 16;
																		}

																		if (var5 != Skeleton.oculusOrbFocalPointY) {
																			Skeleton.oculusOrbFocalPointY += (var5 - Skeleton.oculusOrbFocalPointY) / 16;
																		}

																		var6 = class185.oculusOrbFocalPointX >> 7;
																		var7 = Skeleton.oculusOrbFocalPointY >> 7;
																		var8 = Canvas.getTileHeight(class185.oculusOrbFocalPointX, Skeleton.oculusOrbFocalPointY, class172.Client_plane);
																		var9 = 0;
																		if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
																			for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
																				for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																					var12 = class172.Client_plane;
																					if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) {
																						++var12;
																					}

																					int var28 = var8 - Tiles.Tiles_heights[var12][var10][var11];
																					if (var28 > var9) {
																						var9 = var28;
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

																		if (var10 > field612) {
																			field612 += (var10 - field612) / 24;
																		} else if (var10 < field612) {
																			field612 += (var10 - field612) / 80;
																		}

																		FloorUnderlayDefinition.field2198 = Canvas.getTileHeight(class133.localPlayer.x, class133.localPlayer.y, class172.Client_plane) - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		class152.method3221();
																		short var38 = -1;
																		if (indexCheck.isValidIndexInRange(33)) {
																			var38 = 0;
																		} else if (indexCheck.isValidIndexInRange(49)) {
																			var38 = 1024;
																		}

																		if (indexCheck.isValidIndexInRange(48)) {
																			if (var38 == 0) {
																				var38 = 1792;
																			} else if (var38 == 1024) {
																				var38 = 1280;
																			} else {
																				var38 = 1536;
																			}
																		} else if (indexCheck.isValidIndexInRange(50)) {
																			if (var38 == 0) {
																				var38 = 256;
																			} else if (var38 == 1024) {
																				var38 = 768;
																			} else {
																				var38 = 512;
																			}
																		}

																		byte var39 = 0;
																		if (indexCheck.isValidIndexInRange(35)) {
																			var39 = -1;
																		} else if (indexCheck.isValidIndexInRange(51)) {
																			var39 = 1;
																		}

																		var6 = 0;
																		if (var38 >= 0 || var39 != 0) {
																			var6 = indexCheck.isValidIndexInRange(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var6 *= 16;
																			field580 = var38;
																			field605 = var39;
																		}

																		if (field709 < var6) {
																			field709 += var6 / 8;
																			if (field709 > var6) {
																				field709 = var6;
																			}
																		} else if (field709 > var6) {
																			field709 = field709 * 9 / 10;
																		}

																		if (field709 > 0) {
																			var7 = field709 / 16;
																			if (field580 >= 0) {
																				var4 = field580 - class17.cameraYaw & 2047;
																				var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																				var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																				class185.oculusOrbFocalPointX += var7 * var8 / 65536;
																				Skeleton.oculusOrbFocalPointY += var7 * var9 / 65536;
																			}

																			if (field605 != 0) {
																				FloorUnderlayDefinition.field2198 += var7 * field605;
																				if (FloorUnderlayDefinition.field2198 > 0) {
																					FloorUnderlayDefinition.field2198 = 0;
																				}
																			}
																		} else {
																			field580 = -1;
																			field605 = -1;
																		}

																		if (indexCheck.isValidIndexInRange(13)) {
																			class210.method3929();
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && class412.mouseCam) {
																		var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																		camAngleDX = var4 * 2;
																		mouseCamClickedY = var4 != -1 && var4 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
																		var5 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																		camAngleDY = var5 * 2;
																		mouseCamClickedX = var5 != -1 && var5 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
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

																	if (field626) {
																		class277.method5591();
																	} else if (isCameraLocked) {
																		if (!field603) {
																			var4 = class315.field3463 * 128 + 64;
																			var5 = class150.field1714 * 128 + 64;
																			var6 = Canvas.getTileHeight(var4, var5, class172.Client_plane) - Actor.field1276;
																			class1.method7(var4, var6, var5);
																		} else if (field776 != null) {
																			WorldMapLabelSize.cameraX = field776.vmethod8668();
																			class193.cameraZ = field776.vmethod8669();
																			if (field514) {
																				MouseHandler.cameraY = field776.vmethod8674();
																			} else {
																				MouseHandler.cameraY = Canvas.getTileHeight(WorldMapLabelSize.cameraX, class193.cameraZ, class172.Client_plane) - field776.vmethod8674();
																			}

																			field776.method8685();
																		}

																		if (!field774) {
																			var4 = Skeleton.field2633 * 16384 + 64;
																			var5 = class91.field1119 * 16384 + 64;
																			var6 = Canvas.getTileHeight(var4, var5, class172.Client_plane) - HttpMethod.field38;
																			var7 = var4 - WorldMapLabelSize.cameraX;
																			var8 = var6 - MouseHandler.cameraY;
																			var9 = var5 - class193.cameraZ;
																			var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
																			var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047;
																			var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
																			class180.method3594(var11, var12);
																		} else {
																			if (field778 != null) {
																				UserComparator10.cameraPitch = field778.method8666();
																				UserComparator10.cameraPitch = Math.min(Math.max(UserComparator10.cameraPitch, 128), 383);
																				field778.method8685();
																			}

																			if (field777 != null) {
																				class17.cameraYaw = field777.method8666() & 2047;
																				field777.method8685();
																			}
																		}
																	}

																	for (var4 = 0; var4 < 5; ++var4) {
																		int var10002 = field784[var4]++;
																	}

																	class130.varcs.tryWrite();
																	var4 = class522.method9108();
																	var5 = GameEngine.keyHandler.method352();
																	PacketBufferNode var29;
																	if (var4 > 15000 && var5 > 15000) {
																		logoutTimer = 250;
																		UserComparator4.method2861(14500);
																		var29 = FadeInTask.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var29);
																	}

																	class334.friendSystem.processFriendUpdates();
																	class268.method5236();
																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var29 = FadeInTask.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var29);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var30) {
																		class190.method3709();
																	}

																	AttackOption.method2678().method3563();
																	return;
																}

																if (var46.field2426.type == 12) {
																	var37 = true;
																}

																class200.method3820(var46);
															}
														}

														var43 = var45.widget;
														if (var43.childIndex < 0) {
															break;
														}

														var47 = class243.widgetDefinition.method6281(var43.parentId);
													} while(var47 == null || var47.children == null || var43.childIndex >= var47.children.length || var43 != var47.children[var43.childIndex]);

													AbstractWorldMapData.runScriptEvent(var45);
												}
											}

											var43 = var45.widget;
											if (var43.childIndex < 0) {
												break;
											}

											var47 = class243.widgetDefinition.method6281(var43.parentId);
										} while(var47 == null || var47.children == null || var43.childIndex >= var47.children.length || var43 != var47.children[var43.childIndex]);

										AbstractWorldMapData.runScriptEvent(var45);
									}
								}

								var43 = var45.widget;
								if (var43.childIndex < 0) {
									break;
								}

								var47 = class243.widgetDefinition.method6281(var43.parentId);
							} while(var47 == null || var47.children == null || var43.childIndex >= var47.children.length || var43 != var47.children[var43.childIndex]);

							AbstractWorldMapData.runScriptEvent(var45);
						}
					}

					var33 = FadeInTask.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var33.packetBuffer.writeByte(0);
					var3 = var33.packetBuffer.offset;
					class297.performReflectionCheck(var33.packetBuffer);
					var33.packetBuffer.writeLengthByte(var33.packetBuffer.offset - var3);
					packetWriter.addNode(var33);
				}
			}
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1692602581"
	)
	public void vmethod6187(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && NPC.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = FadeInTask.getPacketBufferNode(ClientPacket.field3228, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1162041825"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class148.canvasWidth;
		int var2 = class342.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (NPC.clientPreferences != null) {
			try {
				Client var3 = UrlRequest.client;
				Object[] var4 = new Object[]{class36.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1791765689"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != -1) {
			var1 = rootInterface;
			if (class243.widgetDefinition.loadInterface(var1)) {
				class143.drawModelComponents(class243.widgetDefinition.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field816[var1] = true;
			}

			field734[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field731 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			Messages.drawWidgets(rootInterface, 0, 0, class148.canvasWidth, class342.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class286.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class286.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) {
			if (viewportX != -1) {
				var1 = viewportX;
				var2 = viewportY;
				if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
					var3 = menuOptionsCount - 1;
					String var5;
					if (isItemSelected == 1 && menuOptionsCount < 2) {
						var5 = "Use" + " " + field676 + " " + "->";
					} else if (isSpellSelected && menuOptionsCount < 2) {
						var5 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
					} else {
						var5 = class225.method4275(var3);
					}

					if (menuOptionsCount > 2) {
						var5 = var5 + Decimator.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
					}

					DevicePcmPlayerProvider.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			Language.renderMenu();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field734[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field816[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = class172.Client_plane;
		var2 = class133.localPlayer.x;
		var3 = class133.localPlayer.y;
		int var4 = graphicsCycle;

		for (ObjectSound var14 = (ObjectSound)ObjectSound.objectSounds.last(); var14 != null; var14 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var14.soundEffectId != -1 || var14.soundEffectIds != null) {
				int var6 = 0;
				if (var2 > var14.maxX * 16384) {
					var6 += var2 - var14.maxX * 16384;
				} else if (var2 < var14.x * 128) {
					var6 += var14.x * 128 - var2;
				}

				if (var3 > var14.maxY * 16384) {
					var6 += var3 - var14.maxY * 16384;
				} else if (var3 < var14.y * 16384) {
					var6 += var14.y * 16384 - var3;
				}

				var6 = Math.max(var6 - 64, 0);
				if (var6 < var14.field846 && NPC.clientPreferences.getAreaSoundEffectsVolume() != 0 && var1 == var14.plane) {
					float var7 = var14.field847 < var14.field846 ? Math.min(Math.max((float)(var14.field846 - var6) / (float)(var14.field846 - var14.field847), 0.0F), 1.0F) : 1.0F;
					int var8 = (int)(var7 * (float)NPC.clientPreferences.getAreaSoundEffectsVolume());
					Object var10000;
					if (var14.stream1 == null) {
						if (var14.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var9 = SoundEffect.readSoundEffect(class141.field1669, var14.soundEffectId, 0);
							if (var9 != null) {
								RawSound var10 = var9.toRawSound().resample(class86.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var10, 100, var8);
								var11.setNumLoops(-1);
								HealthBarUpdate.pcmStreamMixer.addSubStream(var11);
								var14.stream1 = var11;
							}
						}
					} else {
						var14.stream1.method859(var8);
					}

					if (var14.stream2 == null) {
						if (var14.soundEffectIds != null && (var14.field843 -= var4) <= 0) {
							int var13 = (int)(Math.random() * (double)var14.soundEffectIds.length);
							var10000 = null;
							SoundEffect var15 = SoundEffect.readSoundEffect(class141.field1669, var14.soundEffectIds[var13], 0);
							if (var15 != null) {
								RawSound var16 = var15.toRawSound().resample(class86.decimator);
								RawPcmStream var12 = RawPcmStream.createRawPcmStream(var16, 100, var8);
								var12.setNumLoops(0);
								HealthBarUpdate.pcmStreamMixer.addSubStream(var12);
								var14.stream2 = var12;
								var14.field843 = var14.field841 + (int)(Math.random() * (double)(var14.field854 - var14.field841));
							}
						}
					} else {
						var14.stream2.method859(var8);
						if (!var14.stream2.hasNext()) {
							var14.stream2 = null;
						}
					}
				} else {
					if (var14.stream1 != null) {
						HealthBarUpdate.pcmStreamMixer.removeSubStream(var14.stream1);
						var14.stream1 = null;
					}

					if (var14.stream2 != null) {
						HealthBarUpdate.pcmStreamMixer.removeSubStream(var14.stream2);
						var14.stream2 = null;
					}
				}
			}
		}

		graphicsCycle = 0;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Ley;II)Z",
		garbageValue = "364472148"
	)
	boolean method1394(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			class143.friendsChat = null;
		} else {
			if (class143.friendsChat == null) {
				class143.friendsChat = new FriendsChat(class127.loginType, UrlRequest.client);
			}

			class143.friendsChat.method8063(var1.packetBuffer, var2);
		}

		field717 = cycleCntr;
		Player.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)Z",
		garbageValue = "-1053683250"
	)
	boolean method1232(PacketWriter var1) {
		if (class143.friendsChat != null) {
			class143.friendsChat.method8064(var1.packetBuffer);
		}

		field717 = cycleCntr;
		Player.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)Z",
		garbageValue = "1169358276"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var25;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1434) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1442 = 0;
						var1.field1434 = false;
					}

					var3.offset = 0;
					if (var3.method9213()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1442 = 0;
					}

					var1.field1434 = true;
					ServerPacket[] var4 = AABB.ServerPacket_values();
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
				var1.field1442 = 0;
				timer.method7912();
				var1.field1447 = var1.field1446;
				var1.field1446 = var1.field1444;
				var1.field1444 = var1.serverPacket;
				int var20;
				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntLE();
					Varps.Varps_temp[var20] = var5;
					if (Varps.Varps_main[var20] != var5) {
						Varps.Varps_main[var20] = var5;
					}

					class11.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				int var7;
				NPC var60;
				if (ServerPacket.field3372 == var1.serverPacket) {
					var20 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedIntIME();
					short var70 = (short)var3.readSignedShort();
					var7 = var3.readUnsignedShort();
					var60 = npcs[var7];
					if (var60 != null) {
						var60.method2595(var20, var5, var70);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3412 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field780[var20] = true;
					field744[var20] = var5;
					field782[var20] = var6;
					field548[var20] = var7;
					field784[var20] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					byte var90 = var3.readByteSub();
					Varps.Varps_temp[var20] = var90;
					if (Varps.Varps_main[var20] != var90) {
						Varps.Varps_main[var20] = var90;
					}

					class11.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				Widget var21;
				if (ServerPacket.field3428 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readInt();
					var21 = class243.widgetDefinition.method6281(var5);
					if (var21.modelType != 6 || var20 != var21.modelId) {
						var21.modelType = 6;
						var21.modelId = var20;
						WorldMapData_0.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3365 == var1.serverPacket && isCameraLocked) {
					field626 = true;
					field774 = false;
					field603 = false;

					for (var20 = 0; var20 < 5; ++var20) {
						field780[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					TextureProvider.updatePlayers(var3, var1.serverPacketLength);
					GrandExchangeOfferOwnWorldComparator.method1199();
					var1.serverPacket = null;
					return true;
				}

				byte var79;
				if (ServerPacket.field3445 == var1.serverPacket) {
					TileItem.method2679();
					var79 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var79 >= 0) {
							currentClanSettings[var79] = null;
						} else {
							class511.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var79 >= 0) {
						currentClanSettings[var79] = new ClanSettings(var3);
					} else {
						class511.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				int var9;
				int var10;
				int var13;
				int var22;
				int var62;
				int var65;
				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var13 = var3.readUnsignedShortAddLE();
					var9 = var3.readUnsignedByteAdd();
					var10 = var9 >> 2;
					var62 = var9 & 3;
					var65 = field586[var10];
					var6 = var3.method9458();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var22 = var5 + (var6 & 7);
					if (var7 >= 0 && var22 >= 0 && var7 < 103 && var22 < 103) {
						HorizontalAlignment.method3853(class172.Client_plane, var7, var22, var10, var62, var65, var13);
					}

					var1.serverPacket = null;
					return true;
				}

				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				byte var61;
				byte var64;
				int var69;
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var18 = var3.readUnsignedByte();
					var65 = var3.readUnsignedShortAdd();
					var17 = var3.readUnsignedByte();
					var13 = var3.readUnsignedByteAdd() * 4;
					var62 = var3.method9478();
					var64 = var3.readByteSub();
					var69 = var3.readUnsignedByte() * 4;
					var6 = var3.readMedium();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var22 = var5 + (var6 & 7);
					var61 = var3.readByteSub();
					var16 = var3.readUnsignedShortAdd();
					var15 = var3.readUnsignedShortAddLE();
					var9 = var64 + var7;
					var10 = var61 + var22;
					if (var7 >= 0 && var22 >= 0 && var7 < 104 && var22 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var65 != 65535) {
						var7 = var7 * 128 + 64;
						var22 = var22 * 128 + 64;
						var9 = var9 * 128 + 64;
						var10 = var10 * 128 + 64;
						var19 = new Projectile(var65, class172.Client_plane, var7, var22, Canvas.getTileHeight(var7, var22, class172.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var62, var69);
						var19.setDestination(var9, var10, Canvas.getTileHeight(var9, var10, class172.Client_plane) - var69, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3364 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					var9 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var22 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShortLE();
					ArrayList var78 = new ArrayList();
					var78.add(var20);
					var78.add(var5);
					FriendSystem.method1892(var78, var6, var7, var22, var9);
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

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					Language.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedByteAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var85 = npcs[var20];
					if (var85 != null) {
						if (var5 == var85.sequence && var5 != -1) {
							var22 = DevicePcmPlayerProvider.SequenceDefinition_get(var5).restartMode;
							if (var22 == 1) {
								var85.sequenceFrame = 0;
								var85.sequenceFrameCycle = 0;
								var85.sequenceDelay = var6;
								var85.field1248 = 0;
							} else if (var22 == 2) {
								var85.field1248 = 0;
							}
						} else if (var5 == -1 || var85.sequence == -1 || DevicePcmPlayerProvider.SequenceDefinition_get(var5).field2393 >= DevicePcmPlayerProvider.SequenceDefinition_get(var85.sequence).field2393) {
							var85.sequence = var5;
							var85.sequenceFrame = 0;
							var85.sequenceFrameCycle = 0;
							var85.sequenceDelay = var6;
							var85.field1248 = 0;
							var85.field1274 = var85.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3349 == var1.serverPacket) {
					field719 = cycleCntr;
					var79 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var79 >= 0) {
							currentClanChannels[var79] = null;
						} else {
							HttpRequestTask.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var79 >= 0) {
						currentClanChannels[var79] = new ClanChannel(var3);
					} else {
						HttpRequestTask.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3344 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					TextureProvider.method4928(var20);
					var1.serverPacket = null;
					return true;
				}

				Widget var93;
				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var93 = class243.widgetDefinition.method6281(var20);
					var93.modelType = 3;
					var93.modelId = class133.localPlayer.appearance.getChatHeadId();
					WorldMapData_0.invalidateWidget(var93);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var7 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShortAddLE();
					var60 = npcs[var20];
					var5 = var3.readInt();
					if (var60 != null) {
						var60.updateSpotAnimation(var7, var6, var5 >> 16, var5 & 65535);
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

				if (ServerPacket.field3393 == var1.serverPacket) {
					class232.method4433(class311.field3306);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3401 == var1.serverPacket) {
					ModelData0.field2905 = var3.readUnsignedByteSub();
					class332.field3602 = var3.readUnsignedByte();
					field587 = var3.readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}

				boolean var71;
				if (ServerPacket.field3408 == var1.serverPacket) {
					var71 = var3.readBoolean();
					if (var71) {
						if (class135.field1621 == null) {
							class135.field1621 = new class389();
						}
					} else {
						class135.field1621 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntME();
					var21 = class243.widgetDefinition.method6281(var5);
					if (var21 != null && var21.type == 0) {
						if (var20 > var21.scrollHeight - var21.height) {
							var20 = var21.scrollHeight - var21.height;
						}

						if (var20 < 0) {
							var20 = 0;
						}

						if (var20 != var21.scrollY) {
							var21.scrollY = var20;
							WorldMapData_0.invalidateWidget(var21);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3431 == var1.serverPacket) {
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

				String var51;
				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var25 = AbstractFont.escapeBrackets(VertexNormal.method5102(class342.method6308(var3)));
					SecureRandomCallable.addGameMessage(6, var51, var25);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortLE() * 30;
					field722 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var93 = class243.widgetDefinition.method6281(var20);

					for (var6 = 0; var6 < var93.itemIds.length; ++var6) {
						var93.itemIds[var6] = -1;
						var93.itemIds[var6] = 0;
					}

					WorldMapData_0.invalidateWidget(var93);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var92 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var92 != null) {
						FloorUnderlayDefinition.closeInterface(var92, true);
					}

					if (meslayerContinueWidget != null) {
						WorldMapData_0.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field626 = false;
					field774 = false;
					Skeleton.field2633 = var3.readUnsignedByte() * 128;
					class91.field1119 = var3.readUnsignedByte() * 128;
					HttpMethod.field38 = var3.readUnsignedShort();
					class440.field4745 = var3.readUnsignedByte();
					CollisionMap.field2445 = var3.readUnsignedByte();
					if (CollisionMap.field2445 >= 100) {
						var20 = Skeleton.field2633 * 16384 + 64;
						var5 = class91.field1119 * 16384 + 64;
						var6 = Canvas.getTileHeight(var20, var5, class172.Client_plane) - HttpMethod.field38;
						var7 = var20 - WorldMapLabelSize.cameraX;
						var22 = var6 - MouseHandler.cameraY;
						var9 = var5 - class193.cameraZ;
						var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
						UserComparator10.cameraPitch = (int)(Math.atan2((double)var22, (double)var10) * 325.9490051269531D) & 2047;
						class17.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (UserComparator10.cameraPitch < 128) {
							UserComparator10.cameraPitch = 128;
						}

						if (UserComparator10.cameraPitch > 383) {
							UserComparator10.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				Widget var24;
				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var20 = var3.readShort();
					var5 = var3.readInt();
					var6 = var3.readShortLE();
					var24 = class243.widgetDefinition.method6281(var5);
					if (var6 != var24.rawX || var20 != var24.rawY || var24.xAlignment != 0 || var24.yAlignment != 0) {
						var24.rawX = var6;
						var24.rawY = var20;
						var24.xAlignment = 0;
						var24.yAlignment = 0;
						WorldMapData_0.invalidateWidget(var24);
						this.alignWidget(var24);
						if (var24.type == 0) {
							IsaacCipher.revalidateWidgetScroll(class243.widgetDefinition.Widget_interfaceComponents[var5 >> 16], var24, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					class106.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					ModelData0.field2905 = var3.readUnsignedByte();
					class332.field3602 = var3.readUnsignedByteNeg();
					field587 = var3.readUnsignedByteSub();

					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						class311 var91 = GrandExchangeOffer.method7148()[var20];
						class232.method4433(var91);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					Language.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var6 = var3.readUnsignedIntME();
					var7 = var3.readUnsignedByteSub();
					var20 = var3.readUnsignedShortAddLE();
					Player var58;
					if (var20 == localPlayerIndex) {
						var58 = class133.localPlayer;
					} else {
						var58 = players[var20];
					}

					var5 = var3.readUnsignedShortLE();
					if (var58 != null) {
						var58.updateSpotAnimation(var7, var5, var6 >> 16, var6 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3437 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class151.queueSoundEffect(var20, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3336 == var1.serverPacket) {
					class232.method4433(class311.field3304);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						class141.method3130(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3323 == var1.serverPacket) {
					isCameraLocked = true;
					field626 = false;
					field603 = true;
					class315.field3463 = var3.readUnsignedByte() * 16384;
					class150.field1714 = var3.readUnsignedByte() * 16384;
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field514 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var7 = class315.field3463 * 128 + 64;
					var22 = class150.field1714 * 128 + 64;
					boolean var67 = false;
					boolean var63 = false;
					if (field514) {
						var9 = MouseHandler.cameraY;
						var10 = Canvas.getTileHeight(var7, var22, class172.Client_plane) - var20;
					} else {
						var9 = Canvas.getTileHeight(WorldMapLabelSize.cameraX, class193.cameraZ, class172.Client_plane) - MouseHandler.cameraY;
						var10 = var20;
					}

					field776 = new class497(WorldMapLabelSize.cameraX, class193.cameraZ, var9, var7, var22, var10, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByte();
					tradeChatMode = var3.readUnsignedByteAdd();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortAdd();
					var21 = class243.widgetDefinition.method6281(var20);
					if (var21.modelType != 1 || var5 != var21.modelId) {
						var21.modelType = 1;
						var21.modelId = var5;
						WorldMapData_0.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					isCameraLocked = true;
					field626 = false;
					field774 = true;
					Skeleton.field2633 = var3.readUnsignedByte() * 128;
					class91.field1119 = var3.readUnsignedByte() * 128;
					HttpMethod.field38 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = Skeleton.field2633 * 16384 + 64;
					var7 = class91.field1119 * 16384 + 64;
					var22 = Canvas.getTileHeight(var6, var7, class172.Client_plane) - HttpMethod.field38;
					var9 = var6 - WorldMapLabelSize.cameraX;
					var10 = var22 - MouseHandler.cameraY;
					var62 = var7 - class193.cameraZ;
					double var83 = Math.sqrt((double)(var62 * var62 + var9 * var9));
					var69 = class328.method6193((int)(Math.atan2((double)var10, var83) * 325.9490051269531D) & 2047);
					var15 = class179.method3554((int)(Math.atan2((double)var9, (double)var62) * -325.9490051269531D) & 2047);
					field778 = new class498(UserComparator10.cameraPitch, var69, var20, var5);
					field777 = new class498(class17.cameraYaw, var15, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				String var35;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var79 = var3.readByte();
					var25 = var3.readStringCp1252NullTerminated();
					long var28 = (long)var3.readUnsignedShort();
					long var30 = (long)var3.readMedium();
					PlayerType var76 = (PlayerType)KitDefinition.findEnumerated(Huffman.PlayerType_values(), var3.readUnsignedByte());
					long var32 = (var28 << 32) + var30;
					boolean var66 = false;
					ClanChannel var34 = null;
					var34 = var79 >= 0 ? currentClanChannels[var79] : HttpRequestTask.guestClanChannel;
					if (var34 == null) {
						var66 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var76.isUser && class334.friendSystem.isIgnored(new Username(var25, class127.loginType))) {
									var66 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var32) {
								var66 = true;
								break;
							}

							++var15;
						}
					}

					if (!var66) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var32;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var35 = AbstractFont.escapeBrackets(class342.method6308(var3));
						var16 = var79 >= 0 ? 41 : 44;
						if (var76.modIcon != -1) {
							class193.addChatMessage(var16, AbstractByteArrayCopier.method6833(var76.modIcon) + var25, var35, var34.name);
						} else {
							class193.addChatMessage(var16, var25, var35, var34.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					class418.privateChatMode = class550.method9855(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							class11.changeGameOptions(var20);
							changedVarps[++changedVarpCount - 1 & 31] = var20;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					class334.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					ClientPacket.FriendSystem_invalidateIgnoreds();
					field716 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					class334.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field716 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				String var73;
				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var54 = new byte[var1.serverPacketLength];
					var3.method9242(var54, 0, var54.length);
					Buffer var88 = new Buffer(var54);
					var73 = var88.readStringCp1252NullTerminated();
					class129.openURL(var73, true, false);
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
						var21 = class243.widgetDefinition.method6281(var20);
					} else {
						var21 = null;
					}

					if (var21 != null) {
						for (var7 = 0; var7 < var21.itemIds.length; ++var7) {
							var21.itemIds[var7] = 0;
							var21.itemQuantities[var7] = 0;
						}
					}

					class277.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var22 = 0; var22 < var7; ++var22) {
						var9 = var3.readUnsignedByteAdd();
						if (var9 == 255) {
							var9 = var3.readUnsignedIntIME();
						}

						var10 = var3.readUnsignedShortAddLE();
						if (var21 != null && var22 < var21.itemIds.length) {
							var21.itemIds[var22] = var10;
							var21.itemQuantities[var22] = var9;
						}

						SecureRandomCallable.itemContainerSetItem(var5, var22, var10 - 1, var9);
					}

					if (var21 != null) {
						WorldMapData_0.invalidateWidget(var21);
					}

					class170.method3431();
					changedItemContainers[++field710 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3326 == var1.serverPacket) {
					var71 = var3.readUnsignedByte() == 1;
					if (var71) {
						class170.field1839 = VerticalAlignment.method3924() - var3.readLong();
						class233.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class233.grandExchangeEvents = null;
					}

					field721 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3324 == var1.serverPacket) {
					TileItem.method2679();
					var79 = var3.readByte();
					class147 var86 = new class147(var3);
					ClanSettings var89;
					if (var79 >= 0) {
						var89 = currentClanSettings[var79];
					} else {
						var89 = class511.guestClanSettings;
					}

					if (var89 == null) {
						this.method1240(var79);
						var1.serverPacket = null;
						return true;
					}

					if (var86.field1696 > var89.field1744) {
						this.method1240(var79);
						var1.serverPacket = null;
						return true;
					}

					if (var86.field1696 < var89.field1744) {
						var1.serverPacket = null;
						return true;
					}

					var86.method3174(var89);
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var77;
				if (ServerPacket.field3348 == var1.serverPacket) {
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedIntLE();
					var77 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var77 != null) {
						FloorUnderlayDefinition.closeInterface(var77, var5 != var77.group);
					}

					UrlRequester.openInterface(var6, var5, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3328 == var1.serverPacket) {
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					class170.method3431();
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedIntLE();
					var6 = var3.readUnsignedByteNeg();
					experience[var20] = var5;
					currentLevels[var20] = var6;
					levels[var20] = 1;
					field656[var20] = var6;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var20] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					class149.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3353 == var1.serverPacket) {
					var17 = var3.readUnsignedByteAdd();
					var61 = var3.readByte();
					var69 = var3.readUnsignedByte() * 4;
					var15 = var3.readUnsignedShort();
					var13 = var3.readUnsignedByteSub() * 4;
					var6 = var3.method9522();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var22 = var5 + (var6 & 7);
					var64 = var3.readByteSub();
					var18 = var3.readUnsignedShortAddLE();
					var16 = var3.readUnsignedShort();
					var62 = var3.method9312();
					var65 = var3.readUnsignedShortAddLE();
					var9 = var64 + var7;
					var10 = var61 + var22;
					if (var7 >= 0 && var22 >= 0 && var7 < 104 && var22 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var65 != 65535) {
						var7 = var7 * 128 + 64;
						var22 = var22 * 128 + 64;
						var9 = var9 * 128 + 64;
						var10 = var10 * 128 + 64;
						var19 = new Projectile(var65, class172.Client_plane, var7, var22, Canvas.getTileHeight(var7, var22, class172.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var62, var69);
						var19.setDestination(var9, var10, Canvas.getTileHeight(var9, var10, class172.Client_plane) - var69, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3434 == var1.serverPacket) {
					class232.method4433(class311.field3310);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3402 == var1.serverPacket) {
					class232.method4433(class311.field3302);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3418 == var1.serverPacket) {
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShortAddLE();
					var20 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedShortLE();
					var22 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					ArrayList var94 = new ArrayList();
					var94.add(var20);
					FriendSystem.method1892(var94, var5, var6, var7, var22);
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
						var53.field831 = "beta";
						ScriptFrame.field460 = true;
					} else {
						ScriptFrame.field460 = false;
					}

					FaceNormal.updateGameState(45);
					var2.close();
					var2 = null;
					class30.changeWorld(var53);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					Object[] var84 = new Object[var51.length() + 1];

					for (var6 = var51.length() - 1; var6 >= 0; --var6) {
						if (var51.charAt(var6) == 's') {
							var84[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var84[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var84[0] = new Integer(var3.readInt());
					ScriptEvent var87 = new ScriptEvent();
					var87.args = var84;
					AbstractWorldMapData.runScriptEvent(var87);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3362 == var1.serverPacket) {
					PendingSpawn.field1189 = new class474(Tiles.field1043);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readInt();
					var6 = var3.readUnsignedIntME();
					var24 = class243.widgetDefinition.method6281(var5);
					ItemComposition var57;
					if (!var24.isIf3) {
						if (var20 == -1) {
							var24.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var57 = HttpRequest.ItemDefinition_get(var20).getCountObj(var6);
						var24.modelType = 4;
						var24.modelId = var20;
						var24.modelAngleX = var57.xan2d;
						var24.modelAngleY = var57.yan2d;
						var24.modelZoom = var57.zoom2d * 100 / var6;
						WorldMapData_0.invalidateWidget(var24);
					} else {
						var24.itemId = var20;
						var24.itemQuantity = var6;
						var57 = HttpRequest.ItemDefinition_get(var20).getCountObj(var6);
						var24.modelAngleX = var57.xan2d;
						var24.modelAngleY = var57.yan2d;
						var24.modelAngleZ = var57.zan2d;
						var24.modelOffsetX = var57.offsetX2d;
						var24.modelOffsetY = var57.offsetY2d;
						var24.modelZoom = var57.zoom2d;
						if (var57.isStackable == 1) {
							var24.itemQuantityMode = 1;
						} else {
							var24.itemQuantityMode = 2;
						}

						if (var24.field3799 > 0) {
							var24.modelZoom = var24.modelZoom * 32 / var24.field3799;
						} else if (var24.rawWidth > 0) {
							var24.modelZoom = var24.modelZoom * 32 / var24.rawWidth;
						}

						WorldMapData_0.invalidateWidget(var24);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < class183.field1945; ++var20) {
						VarpDefinition var82 = UserComparator8.VarpDefinition_get(var20);
						if (var82 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}

					class170.method3431();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3411 == var1.serverPacket) {
					PendingSpawn.field1189 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field626 = false;
					field774 = true;
					var20 = class179.method3554(var3.readShort() & 2027);
					var5 = class328.method6193(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field778 = new class498(UserComparator10.cameraPitch, var5, var6, var7);
					field777 = new class498(class17.cameraYaw, var20, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					class4.playSong(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3443 == var1.serverPacket) {
					var20 = var3.readMedium();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					class137.method3080(var5, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedShortAddLE();
					var6 = var3.method9522();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var22 = var5 + (var6 & 7);
					var10 = var3.readUnsignedByteSub();
					var62 = var3.readUnsignedShortAddLE();
					if (var7 >= 0 && var22 >= 0 && var7 < 104 && var22 < 104) {
						var7 = var7 * 128 + 64;
						var22 = var22 * 128 + 64;
						GraphicsObject var95 = new GraphicsObject(var9, class172.Client_plane, var7, var22, Canvas.getTileHeight(var7, var22, class172.Client_plane) - var10, var62, cycle);
						graphicsObjects.addFirst(var95);
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var11;
				long var38;
				long var40;
				long var42;
				String var44;
				if (ServerPacket.field3342 == var1.serverPacket) {
					var79 = var3.readByte();
					var38 = (long)var3.readUnsignedShort();
					var40 = (long)var3.readMedium();
					var42 = (var38 << 32) + var40;
					var11 = false;
					ClanChannel var37 = var79 >= 0 ? currentClanChannels[var79] : HttpRequestTask.guestClanChannel;
					if (var37 == null) {
						var11 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (var42 == crossWorldMessageIds[var13]) {
								var11 = true;
								break;
							}
						}
					}

					if (!var11) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var42;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var44 = class342.method6308(var3);
						var69 = var79 >= 0 ? 43 : 46;
						class193.addChatMessage(var69, "", var44, var37.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3345 == var1.serverPacket) {
					field626 = false;
					isCameraLocked = false;
					field603 = false;
					field774 = false;
					Skeleton.field2633 = 0;
					class91.field1119 = 0;
					HttpMethod.field38 = 0;
					field514 = false;
					class440.field4745 = 0;
					CollisionMap.field2445 = 0;
					HttpResponse.field91 = 0;
					Renderable.field2716 = 0;
					class315.field3463 = 0;
					class150.field1714 = 0;
					Actor.field1276 = 0;
					field776 = null;
					field778 = null;
					field777 = null;

					for (var20 = 0; var20 < 5; ++var20) {
						field780[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				long var26;
				if (ServerPacket.field3366 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1235(false);
						ApproximateRouteStrategy.method1186(rootInterface);
						KeyHandler.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var72;
					for (; var6-- > 0; var72.field1076 = true) {
						var7 = var3.readInt();
						var22 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var72 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var72 != null && var22 != var72.group) {
							FloorUnderlayDefinition.closeInterface(var72, true);
							var72 = null;
						}

						if (var72 == null) {
							var72 = UrlRequester.openInterface(var7, var22, var9);
						}
					}

					for (var77 = (InterfaceParent)interfaceParents.first(); var77 != null; var77 = (InterfaceParent)interfaceParents.next()) {
						if (var77.field1076) {
							var77.field1076 = false;
						} else {
							FloorUnderlayDefinition.closeInterface(var77, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var20) {
						var7 = var3.readInt();
						var22 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();

						for (var62 = var22; var62 <= var9; ++var62) {
							var26 = (long)var62 + ((long)var7 << 32);
							widgetFlags.put(new IntegerNode(var10), var26);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3363 == var1.serverPacket) {
					class170.method3431();
					weight = var3.readShort();
					field722 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3370 == var1.serverPacket) {
					isCameraLocked = true;
					field626 = false;
					field603 = false;
					class315.field3463 = var3.readUnsignedByte() * 16384;
					class150.field1714 = var3.readUnsignedByte() * 16384;
					Actor.field1276 = var3.readUnsignedShort();
					Renderable.field2716 = var3.readUnsignedByte();
					HttpResponse.field91 = var3.readUnsignedByte();
					if (HttpResponse.field91 >= 100) {
						WorldMapLabelSize.cameraX = class315.field3463 * 128 + 64;
						class193.cameraZ = class150.field1714 * 128 + 64;
						MouseHandler.cameraY = Canvas.getTileHeight(WorldMapLabelSize.cameraX, class193.cameraZ, class172.Client_plane) - Actor.field1276;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3351 == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var25 = var3.readStringCp1252NullTerminated();
					var21 = class243.widgetDefinition.method6281(var20);
					if (!var25.equals(var21.text)) {
						var21.text = var25;
						WorldMapData_0.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3325 == var1.serverPacket) {
					var7 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAddLE();
					WorldMapElement.method3742(var20, var5, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					Fonts.method8920(var20);
					changedItemContainers[++field710 - 1 & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3373 == var1.serverPacket) {
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedIntIME();
					var21 = class243.widgetDefinition.method6281(var5);
					PacketBufferNode.method5921(var21, class133.localPlayer.appearance.gender, var20);
					WorldMapData_0.invalidateWidget(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByteAdd();
					if (var6 >= 1 && var6 <= 8) {
						if (var51.equalsIgnoreCase("null")) {
							var51 = null;
						}

						playerMenuActions[var6 - 1] = var51;
						playerOptionsPriorities[var6 - 1] = var5 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				boolean var12;
				if (ServerPacket.field3350 == var1.serverPacket) {
					isCameraLocked = true;
					field626 = false;
					field603 = true;
					class315.field3463 = var3.readUnsignedByte() * 16384;
					class150.field1714 = var3.readUnsignedByte() * 16384;
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte() * 128 + 64;
					var6 = var3.readUnsignedByte() * 128 + 64;
					var7 = var3.readUnsignedShort();
					field514 = var3.readBoolean();
					var22 = var3.readUnsignedByte();
					var9 = class315.field3463 * 128 + 64;
					var10 = class150.field1714 * 128 + 64;
					var11 = false;
					var12 = false;
					if (field514) {
						var62 = MouseHandler.cameraY;
						var65 = Canvas.getTileHeight(var9, var10, class172.Client_plane) - var20;
					} else {
						var62 = Canvas.getTileHeight(WorldMapLabelSize.cameraX, class193.cameraZ, class172.Client_plane) - MouseHandler.cameraY;
						var65 = var20;
					}

					field776 = new class496(WorldMapLabelSize.cameraX, class193.cameraZ, var62, var9, var10, var65, var5, var6, var7, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3440 == var1.serverPacket) {
					class170.method3431();
					var20 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByteAdd();
					var6 = var3.readUnsignedByteSub();
					var7 = var3.readUnsignedIntLE();
					experience[var20] = var7;
					currentLevels[var20] = var5;
					levels[var20] = 1;
					field656[var20] = var6;

					for (var22 = 0; var22 < 98; ++var22) {
						if (var7 >= Skills.Skills_experienceTable[var22]) {
							levels[var20] = var22 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3329 == var1.serverPacket) {
					return this.method1232(var1);
				}

				Widget var56;
				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedIntIME();
					InterfaceParent var81 = (InterfaceParent)interfaceParents.get((long)var20);
					var77 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var77 != null) {
						FloorUnderlayDefinition.closeInterface(var77, var81 == null || var77.group != var81.group);
					}

					if (var81 != null) {
						var81.remove();
						interfaceParents.put(var81, (long)var5);
					}

					var56 = class243.widgetDefinition.method6281(var20);
					if (var56 != null) {
						WorldMapData_0.invalidateWidget(var56);
					}

					var56 = class243.widgetDefinition.method6281(var5);
					if (var56 != null) {
						WorldMapData_0.invalidateWidget(var56);
						IsaacCipher.revalidateWidgetScroll(class243.widgetDefinition.Widget_interfaceComponents[var56.id >>> 16], var56, true);
					}

					if (rootInterface != -1) {
						Login.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3330 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedIntME();
					var7 = var3.readUnsignedIntIME();

					for (var22 = var5; var22 <= var20; ++var22) {
						var42 = ((long)var6 << 32) + (long)var22;
						Node var96 = widgetFlags.get(var42);
						if (var96 != null) {
							var96.remove();
						}

						widgetFlags.put(new IntegerNode(var7), var42);
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

					field720 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3425 == var1.serverPacket) {
					class232.method4433(class311.field3314);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var6 = class130.getGcDuration();
					PacketBufferNode var74 = FadeInTask.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var74.packetBuffer.writeByteSub(GameEngine.fps);
					var74.packetBuffer.writeByteSub(var6);
					var74.packetBuffer.writeInt(var20);
					var74.packetBuffer.writeIntME(var5);
					packetWriter.addNode(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShort();
					var7 = var3.readInt();
					var56 = class243.widgetDefinition.method6281(var7);
					if (var20 != var56.modelAngleX || var6 != var56.modelAngleY || var5 != var56.modelZoom) {
						var56.modelAngleX = var20;
						var56.modelAngleY = var6;
						var56.modelZoom = var5;
						WorldMapData_0.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readInt();
					var21 = class243.widgetDefinition.method6281(var5);
					if (var21.modelType != 2 || var20 != var21.modelId) {
						var21.modelType = 2;
						var21.modelId = var20;
						WorldMapData_0.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3444 == var1.serverPacket) {
					if (PendingSpawn.field1189 == null) {
						PendingSpawn.field1189 = new class474(Tiles.field1043);
					}

					class543 var52 = Tiles.field1043.method8501(var3);
					PendingSpawn.field1189.field4900.vmethod8990(var52.field5299, var52.field5300);
					field631[++field714 - 1 & 31] = var52.field5299;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3409 == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var38 = (long)var3.readUnsignedShort();
					var40 = (long)var3.readMedium();
					PlayerType var36 = (PlayerType)KitDefinition.findEnumerated(Huffman.PlayerType_values(), var3.readUnsignedByte());
					long var46 = (var38 << 32) + var40;
					var12 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (var46 == crossWorldMessageIds[var13]) {
							var12 = true;
							break;
						}
					}

					if (class334.friendSystem.isIgnored(new Username(var51, class127.loginType))) {
						var12 = true;
					}

					if (!var12 && field750 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var46;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var44 = AbstractFont.escapeBrackets(VertexNormal.method5102(class342.method6308(var3)));
						byte var68;
						if (var36.isPrivileged) {
							var68 = 7;
						} else {
							var68 = 3;
						}

						if (var36.modIcon != -1) {
							SecureRandomCallable.addGameMessage(var68, AbstractByteArrayCopier.method6833(var36.modIcon) + var51, var44);
						} else {
							SecureRandomCallable.addGameMessage(var68, var51, var44);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var51 = var3.readStringCp1252NullTerminated();
					var38 = var3.readLong();
					var40 = (long)var3.readUnsignedShort();
					var42 = (long)var3.readMedium();
					PlayerType var45 = (PlayerType)KitDefinition.findEnumerated(Huffman.PlayerType_values(), var3.readUnsignedByte());
					var26 = var42 + (var40 << 32);
					boolean var14 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var26) {
							var14 = true;
							break;
						}
					}

					if (var45.isUser && class334.friendSystem.isIgnored(new Username(var51, class127.loginType))) {
						var14 = true;
					}

					if (!var14 && field750 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var26;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var35 = AbstractFont.escapeBrackets(VertexNormal.method5102(class342.method6308(var3)));
						if (var45.modIcon != -1) {
							class193.addChatMessage(9, AbstractByteArrayCopier.method6833(var45.modIcon) + var51, var35, ModelData0.base37DecodeLong(var38));
						} else {
							class193.addChatMessage(9, var51, var35, ModelData0.base37DecodeLong(var38));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShort();
					var6 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var22 = var5 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var22 << 3);
					Widget var23 = class243.widgetDefinition.method6281(var20);
					if (var9 != var23.color) {
						var23.color = var9;
						WorldMapData_0.invalidateWidget(var23);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3368 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortAdd();
					class11.method108(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3396 == var1.serverPacket) {
					class232.method4433(class311.field3307);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3419 == var1.serverPacket) {
					field719 = cycleCntr;
					var79 = var3.readByte();
					class161 var80 = new class161(var3);
					ClanChannel var75;
					if (var79 >= 0) {
						var75 = currentClanChannels[var79];
					} else {
						var75 = HttpRequestTask.guestClanChannel;
					}

					if (var75 == null) {
						this.method1239(var79);
						var1.serverPacket = null;
						return true;
					}

					if (var80.field1781 > var75.field1795) {
						this.method1239(var79);
						var1.serverPacket = null;
						return true;
					}

					if (var80.field1781 < var75.field1795) {
						var1.serverPacket = null;
						return true;
					}

					var80.method3357(var75);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						Login.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3382 == var1.serverPacket) {
					return this.method1394(var1, 1);
				}

				if (ServerPacket.field3360 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != revision) {
						revision = var20;
						SecureRandomSSLSocket.method169();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					PendingSpawn.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3332 == var1.serverPacket) {
					class232.method4433(class311.field3309);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3417 == var1.serverPacket) {
					class334.friendSystem.method1849();
					field716 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3397 == var1.serverPacket) {
					class170.method3431();
					runEnergy = var3.readUnsignedShort();
					field722 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3385 == var1.serverPacket) {
					class232.method4433(class311.field3305);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					class332.field3602 = var3.readUnsignedByte();
					field587 = var3.readUnsignedByte();
					ModelData0.field2905 = var3.readUnsignedByteAdd();

					for (var20 = ModelData0.field2905; var20 < ModelData0.field2905 + 8; ++var20) {
						for (var5 = class332.field3602; var5 < class332.field3602 + 8; ++var5) {
							if (groundItems[field587][var20][var5] != null) {
								groundItems[field587][var20][var5] = null;
								class477.updateItemPile(field587, var20, var5);
							}
						}
					}

					for (PendingSpawn var50 = (PendingSpawn)pendingSpawns.last(); var50 != null; var50 = (PendingSpawn)pendingSpawns.previous()) {
						if (var50.x >= ModelData0.field2905 && var50.x < ModelData0.field2905 + 8 && var50.y >= class332.field3602 && var50.y < class332.field3602 + 8 && var50.plane == field587) {
							var50.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3413 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedByteNeg();
					var6 = var3.readUnsignedByteNeg();
					var24 = class243.widgetDefinition.method6281(var20);
					HorizontalAlignment.method3854(var24, var6, var5);
					WorldMapData_0.invalidateWidget(var24);
					var1.serverPacket = null;
					return true;
				}

				boolean var59;
				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var59 = var3.readUnsignedByte() == 1;
					var21 = class243.widgetDefinition.method6281(var20);
					if (var59 != var21.isHidden) {
						var21.isHidden = var59;
						WorldMapData_0.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					var59 = var3.readUnsignedByte() == 1;
					var73 = "";
					boolean var55 = false;
					if (var59) {
						var73 = var3.readStringCp1252NullTerminated();
						if (class334.friendSystem.isIgnored(new Username(var73, class127.loginType))) {
							var55 = true;
						}
					}

					String var8 = var3.readStringCp1252NullTerminated();
					if (!var55) {
						SecureRandomCallable.addGameMessage(var20, var73, var8);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3389 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedIntME();
					var21 = class243.widgetDefinition.method6281(var20);
					Actor.method2413(var21, var5);
					WorldMapData_0.invalidateWidget(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3410 == var1.serverPacket) {
					class232.method4433(class311.field3312);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3429 == var1.serverPacket) {
					var71 = var3.readUnsignedByte() == 1;
					var5 = var3.readUnsignedIntME();
					var21 = class243.widgetDefinition.method6281(var5);
					ChatChannel.method2212(var21, class133.localPlayer.appearance, var71);
					WorldMapData_0.invalidateWidget(var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3347 == var1.serverPacket) {
					var20 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					class182.performPlayerAnimation(class133.localPlayer, var5, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3416 == var1.serverPacket) {
					WorldMapArchiveLoader.method8706(var3.readStringCp1252NullTerminated());
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
						var21 = class243.widgetDefinition.method6281(var20);
					} else {
						var21 = null;
					}

					for (; var3.offset < var1.serverPacketLength; SecureRandomCallable.itemContainerSetItem(var5, var7, var22 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var22 = var3.readUnsignedShort();
						var9 = 0;
						if (var22 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var21 != null && var7 >= 0 && var7 < var21.itemIds.length) {
							var21.itemIds[var7] = var22;
							var21.itemQuantities[var7] = var9;
						}
					}

					if (var21 != null) {
						WorldMapData_0.invalidateWidget(var21);
					}

					class170.method3431();
					changedItemContainers[++field710 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3400 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					if (var20 == 65535) {
						var20 = -1;
					}

					rootInterface = var20;
					this.method1235(false);
					ApproximateRouteStrategy.method1186(var20);
					KeyHandler.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					class149.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3371 == var1.serverPacket) {
					class232.method4433(class311.field3308);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					PacketBufferNode.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3422 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedIntME();
					var24 = class243.widgetDefinition.method6281(var6);
					var24.field3737 = var20 + (var5 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3355 == var1.serverPacket) {
					isCameraLocked = true;
					field626 = false;
					field774 = true;
					var20 = var3.readShort();
					var5 = var3.readShort();
					var6 = class328.method6193(var5 + UserComparator10.cameraPitch & 2027);
					var7 = var20 + class17.cameraYaw;
					var22 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field778 = new class498(UserComparator10.cameraPitch, var6, var22, var9);
					field777 = new class498(class17.cameraYaw, var7, var22, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3359 == var1.serverPacket) {
					var20 = var3.readShortLE();
					var5 = var3.readUnsignedIntLE();
					var21 = class243.widgetDefinition.method6281(var5);
					if (var20 != var21.sequenceId || var20 == -1) {
						var21.sequenceId = var20;
						var21.modelFrame = 0;
						var21.modelFrameCycle = 0;
						WorldMapData_0.invalidateWidget(var21);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3380 == var1.serverPacket) {
					return this.method1394(var1, 2);
				}

				class180.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1446 != null ? var1.field1446.id : -1) + "," + (var1.field1447 != null ? var1.field1447.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				PacketBufferNode.logOut();
			} catch (IOException var48) {
				class190.method3709();
			} catch (Exception var49) {
				var25 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1446 != null ? var1.field1446.id : -1) + "," + (var1.field1447 != null ? var1.field1447.id : -1) + "," + var1.serverPacketLength + "," + (class133.localPlayer.pathX[0] + GrandExchangeOfferOwnWorldComparator.baseX * 64) + "," + (class133.localPlayer.pathY[0] + DevicePcmPlayerProvider.baseY * 64) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var25 = var25 + var3.array[var6] + ",";
				}

				class180.RunException_sendStackTrace(var25, var49);
				PacketBufferNode.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-949677981"
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
				if (var12 != 1 && (class412.mouseCam || var12 != 4)) {
					var2 = MouseHandler.MouseHandler_x;
					var3 = MouseHandler.MouseHandler_y;
					if (var2 < RestClientThreadFactory.menuX - 10 || var2 > RestClientThreadFactory.menuX + HealthBarDefinition.menuWidth + 10 || var3 < LoginScreenAnimation.menuY - 10 || var3 > LoginScreenAnimation.menuY + class1.menuHeight + 10) {
						isMenuOpen = false;
						GrandExchangeOfferWorldComparator.invalidateWidgetsUnder(RestClientThreadFactory.menuX, LoginScreenAnimation.menuY, HealthBarDefinition.menuWidth, class1.menuHeight);
					}
				}

				if (var12 == 1 || !class412.mouseCam && var12 == 4) {
					var2 = RestClientThreadFactory.menuX;
					var3 = LoginScreenAnimation.menuY;
					int var4 = HealthBarDefinition.menuWidth;
					var5 = MouseHandler.MouseHandler_lastPressedX;
					int var13 = MouseHandler.MouseHandler_lastPressedY;
					int var7 = -1;

					for (int var8 = 0; var8 < menuOptionsCount; ++var8) {
						int var9 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31;
						if (var5 > var2 && var5 < var4 + var2 && var13 > var9 - 13 && var13 < var9 + 3) {
							var7 = var8;
						}
					}

					if (var7 != -1) {
						class203.menuActionByIdx(var7);
					}

					isMenuOpen = false;
					GrandExchangeOfferWorldComparator.invalidateWidgetsUnder(RestClientThreadFactory.menuX, LoginScreenAnimation.menuY, HealthBarDefinition.menuWidth, class1.menuHeight);
				}
			} else {
				var2 = menuOptionsCount - 1;
				if ((var12 == 1 || !class412.mouseCam && var12 == 4) && this.shouldLeftClickOpenMenu()) {
					var12 = 2;
				}

				if ((var12 == 1 || !class412.mouseCam && var12 == 4) && menuOptionsCount > 0) {
					class203.menuActionByIdx(var2);
				}

				if (var12 == 2 && menuOptionsCount > 0) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1549526241"
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

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "511559743"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = DevicePcmPlayerProvider.fontBold12.stringWidth("Choose Option");

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) {
			var5 = DevicePcmPlayerProvider.fontBold12.stringWidth(class225.method4275(var4));
			if (var5 > var3) {
				var3 = var5;
			}
		}

		var3 += 8;
		var4 = menuOptionsCount * 15 + 22;
		var5 = var1 - var3 / 2;
		if (var5 + var3 > class148.canvasWidth) {
			var5 = class148.canvasWidth - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		int var6 = var2;
		if (var4 + var2 > class342.canvasHeight) {
			var6 = class342.canvasHeight - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		RestClientThreadFactory.menuX = var5;
		LoginScreenAnimation.menuY = var6;
		HealthBarDefinition.menuWidth = var3;
		class1.menuHeight = menuOptionsCount * 15 + 22;
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		LoginType.scene.menuOpen(class172.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "19136824"
	)
	final void method1235(boolean var1) {
		class93.method2383(rootInterface, class148.canvasWidth, class342.canvasHeight, var1);
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lnt;B)V",
		garbageValue = "4"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class243.widgetDefinition.method6281(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class148.canvasWidth;
			var4 = class342.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		class94.alignWidgetSize(var1, var3, var4, false);
		WorldMapData_0.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1541524736"
	)
	final void method1237() {
		WorldMapData_0.invalidateWidget(clickedWidget);
		++class179.widgetDragDuration;
		int var1;
		int var2;
		if (field702 && field699) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field700) {
				var1 = field700;
			}

			if (var1 + clickedWidget.width > field700 + clickedWidgetParent.width) {
				var1 = field700 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field701) {
				var2 = field701;
			}

			if (var2 + clickedWidget.height > field701 + clickedWidgetParent.height) {
				var2 = field701 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field570;
			int var4 = var2 - field704;
			int var5 = clickedWidget.dragZoneSize;
			if (class179.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field700 + clickedWidgetParent.scrollX;
			int var7 = var2 - field701 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				AbstractWorldMapData.runScriptEvent(var8);
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
						AbstractWorldMapData.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var9 = clickedWidget;
						int var10 = NpcOverrides.method3858(class33.getWidgetFlags(var9));
						Widget var14;
						if (var10 == 0) {
							var14 = null;
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var14 = var9;
									break;
								}

								var9 = class243.widgetDefinition.method6281(var9.parentId);
								if (var9 == null) {
									var14 = null;
									break;
								}

								++var11;
							}
						}

						if (var14 != null) {
							PacketBufferNode var12 = FadeInTask.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(clickedWidget.childIndex);
							var12.packetBuffer.writeShortAddLE(draggedOnWidget.childIndex);
							var12.packetBuffer.writeIntME(clickedWidget.id);
							var12.packetBuffer.writeIntME(draggedOnWidget.id);
							var12.packetBuffer.writeShortLE(clickedWidget.itemId);
							var12.packetBuffer.writeShortAdd(draggedOnWidget.itemId);
							packetWriter.addNode(var12);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(field570 + widgetClickX, widgetClickY + field704);
				} else if (menuOptionsCount > 0) {
					class344.method6318(field570 + widgetClickX, field704 + widgetClickY);
				}

				clickedWidget = null;
			}

		} else {
			if (class179.widgetDragDuration > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					var1 = widgetClickX + field570;
					var2 = widgetClickY + field704;
					MenuAction var13 = Message.tempMenuAction;
					if (var13 != null) {
						CollisionMap.menuAction(var13.param0, var13.param1, var13.opcode, var13.identifier, var13.itemId, var13.action, var13.target, var1, var2);
					}

					Message.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(I)Lvx;",
		garbageValue = "617300231"
	)
	@Export("username")
	public Username username() {
		return class133.localPlayer != null ? class133.localPlayer.username : null;
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-102"
	)
	void method1239(int var1) {
		PacketBufferNode var2 = FadeInTask.getPacketBufferNode(ClientPacket.field3205, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1774536406"
	)
	void method1240(int var1) {
		PacketBufferNode var2 = FadeInTask.getPacketBufferNode(ClientPacket.field3274, packetWriter.isaacCipher);
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
							int var4 = Integer.parseInt(var2);
							Language var10;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var10 = Language.Language_valuesOrdered[var4];
							} else {
								var10 = null;
							}

							GraphicsObject.clientLanguage = var10;
							break;
						case 7:
							HealthBar.field1325 = class226.method4306(Integer.parseInt(var2));
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							ViewportMouse.field2868 = var2;
							break;
						case 10:
							StudioGame[] var3 = new StudioGame[]{StudioGame.game3, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game5, StudioGame.game4, StudioGame.oldscape};
							HorizontalAlignment.field2089 = (StudioGame)KitDefinition.findEnumerated(var3, Integer.parseInt(var2));
							if (HorizontalAlignment.field2089 == StudioGame.oldscape) {
								class127.loginType = LoginType.oldscape;
							} else {
								class127.loginType = LoginType.field5118;
							}
							break;
						case 11:
							ArchiveLoader.authServiceBaseUrl = var2;
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
							class276.field3045 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							class128.field1538 = var2;
							break;
						case 21:
							field513 = Integer.parseInt(var2);
							break;
						case 22:
							class31.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var5 = var2.indexOf(".");
							if (var5 == -1) {
								Integer.parseInt(var2);
							} else {
								Integer.parseInt(var2.substring(0, var5));
								Integer.parseInt(var2.substring(var5 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class166.worldHost = this.getCodeBase().getHost();
				ChatChannel.field1023 = new JagNetThread();
				String var6 = HealthBar.field1325.name;
				byte var7 = 0;
				if ((worldProperties & class530.field5203.rsOrdinal()) != 0) {
					class430.field4669 = "beta";
				}

				try {
					class498.method8662("oldschool", class430.field4669, var6, var7, 23);
				} catch (Exception var8) {
					class180.RunException_sendStackTrace((String)null, var8);
				}

				UrlRequest.client = this;
				WorldMapDecoration.field3118 = clientType;
				class343.initCredentials();
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field794 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field794 = 0;
					} else {
						field794 = 5;
					}
				}

				this.startThread(765, 503, 221, 1);
			}
		} catch (RuntimeException var9) {
			throw class404.newRunException(var9, "client.init(" + ')');
		}
	}

	public void setClient(int var1) {
		this.clientId = var1;
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	protected void finalize() throws Throwable {
		class321.field3499.remove(this);
		super.finalize();
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.refreshAccessTokenRequester = var1;
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
	)
	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.otlTokenRequester = var1;
			class210.method3930(10);
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "732674071"
	)
	static final void method1791(String var0) {
		class6.method40("Please remove " + var0 + " from your ignore list first");
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(IIIILvg;Lmu;I)V",
		garbageValue = "-1174769079"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			class315.redHintArrowSprite.method9733(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			class277.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1492428952"
	)
	static final void method1565(int var0, int var1, boolean var2) {
		if (currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < currentClanChannels[var0].method3394()) {
				ClanChannelMember var3 = (ClanChannelMember)currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = FadeInTask.getPacketBufferNode(ClientPacket.field3288, packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + SequenceDefinition.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				packetWriter.addNode(var4);
			}
		}
	}
}
