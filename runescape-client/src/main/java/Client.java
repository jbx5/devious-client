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
public final class Client extends GameEngine implements Usernamed, OAuthApi, class325 {
	@ObfuscatedName("wm")
	@ObfuscatedGetter(
		intValue = 615763991
	)
	public static int field758;
	@ObfuscatedName("vf")
	@ObfuscatedGetter(
		intValue = 1430293525
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("vo")
	@ObfuscatedGetter(
		intValue = -354190159
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("xa")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	static final class232 field691;
	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "[Lob;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("xb")
	@ObfuscatedSignature(
		descriptor = "Lcy;"
	)
	static final ApproximateRouteStrategy field801;
	@ObfuscatedName("xi")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("xr")
	@ObfuscatedGetter(
		intValue = -411648017
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("xu")
	static int[] field802;
	@ObfuscatedName("xl")
	static int[] field803;
	@ObfuscatedName("vw")
	static int[] field769;
	@ObfuscatedName("vk")
	static int[] field788;
	@ObfuscatedName("vi")
	static int[] field775;
	@ObfuscatedName("wa")
	@ObfuscatedGetter(
		intValue = 717023111
	)
	static int field736;
	@ObfuscatedName("wz")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("wj")
	@ObfuscatedGetter(
		intValue = -1662251693
	)
	static int field787;
	@ObfuscatedName("wx")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	static class491 field529;
	@ObfuscatedName("xy")
	@ObfuscatedGetter(
		intValue = -318963277
	)
	static int field785;
	@ObfuscatedName("vz")
	static short field772;
	@ObfuscatedName("vb")
	static short field773;
	@ObfuscatedName("vc")
	static short field778;
	@ObfuscatedName("vx")
	static short field779;
	@ObfuscatedName("vm")
	static short field596;
	@ObfuscatedName("wv")
	@ObfuscatedGetter(
		intValue = 167824091
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("vh")
	static short field776;
	@ObfuscatedName("vt")
	@ObfuscatedGetter(
		intValue = -719449221
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = -1013697845
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("vu")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("vj")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("wo")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static class439 field791;
	@ObfuscatedName("wr")
	@ObfuscatedSignature(
		descriptor = "Lcn;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("archive11")
	static EvictingDualNodeHashTable archive11;
	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("wt")
	@ObfuscatedGetter(
		intValue = -1158671041
	)
	static int field730;
	@ObfuscatedName("xx")
	static List field786;
	@ObfuscatedName("bz")
	static boolean field764;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 372409427
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1830395405
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1962887721
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("cp")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("cq")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 693198435
	)
	static int field503;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -819398511
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1877012345
	)
	static int field667;
	@ObfuscatedName("cn")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -2113245209
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("dc")
	static boolean field544;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("el")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -2135818467
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		longValue = -4023857630691881787L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = 223961985
	)
	static int field512;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = 761694021
	)
	static int field783;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		longValue = 672644838026227771L
	)
	static long field514;
	@ObfuscatedName("ed")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -773022657
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 1268819849
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = 2037771437
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("er")
	@ObfuscatedGetter(
		intValue = -178600353
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = -1082225157
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = -541975243
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -412826730
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("ep")
	@ObfuscatedGetter(
		intValue = 960645568
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 627451584
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("eq")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("ex")
	@Export("z")
	static boolean z;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Ldp;"
	)
	static class92 field528;
	@ObfuscatedName("fh")
	@ObfuscatedGetter(
		intValue = 463373345
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("fu")
	@ObfuscatedGetter(
		intValue = 2126569125
	)
	static int field530;
	@ObfuscatedName("gl")
	@ObfuscatedGetter(
		intValue = -1547201225
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("go")
	@ObfuscatedGetter(
		intValue = 693058951
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(
		intValue = 1610372549
	)
	static int field533;
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = 1778658497
	)
	static int field534;
	@ObfuscatedName("gx")
	@ObfuscatedGetter(
		intValue = -1955617867
	)
	static int field745;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("authenticationScheme")
	static AuthenticationScheme authenticationScheme;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	static class535 field626;
	@ObfuscatedName("hh")
	@Export("BASIC_AUTH_DESKTOP_OSRS")
	static final String BASIC_AUTH_DESKTOP_OSRS;
	@ObfuscatedName("hq")
	@Export("BASIC_AUTH_DESKTOP_RUNELITE")
	static final String BASIC_AUTH_DESKTOP_RUNELITE;
	@ObfuscatedName("ha")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("io")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "[Lds;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = 1556887453
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ik")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		intValue = -563841167
	)
	static int field549;
	@ObfuscatedName("it")
	static String field664;
	@ObfuscatedName("iu")
	static int[] field603;
	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("in")
	@ObfuscatedGetter(
		intValue = -1924766771
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("ir")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("jc")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = 553048541
	)
	static int field566;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(
		intValue = -1282086821
	)
	static int field567;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(
		intValue = 1976910813
	)
	static int field555;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(
		intValue = -758003773
	)
	static int field569;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1346067087
	)
	static int field568;
	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "[Lii;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("jk")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("jd")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("kv")
	static final int[] field574;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 808638425
	)
	static int field652;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 270515271
	)
	@Export("graphicsCycle")
	static int graphicsCycle;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1743627567
	)
	static int field577;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = -683561757
	)
	static int field578;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = -414578351
	)
	static int field541;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 788252263
	)
	static int field580;
	@ObfuscatedName("kc")
	static boolean field581;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = -1653121723
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 173824795
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -174233219
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(
		intValue = -1689698371
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(
		intValue = 2132674567
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(
		intValue = -1781040041
	)
	static int field587;
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 2059001215
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("lj")
	@ObfuscatedGetter(
		intValue = -118125651
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 1655731525
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("la")
	@ObfuscatedGetter(
		intValue = -1846858683
	)
	static int field623;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(
		intValue = -904393347
	)
	static int field510;
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 292730893
	)
	static int field593;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(
		intValue = -2058705
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = -192349719
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ly")
	@ObfuscatedGetter(
		intValue = 1521745677
	)
	@Export("revision")
	public static int revision;
	@ObfuscatedName("lc")
	static boolean field597;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = -1281453811
	)
	static int field598;
	@ObfuscatedName("lz")
	static boolean field599;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(
		intValue = -1422011957
	)
	static int field600;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 1434760849
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(
		intValue = 987149163
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("mt")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("md")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("mi")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("mo")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("mg")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("mx")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("mw")
	static int[][] field609;
	@ObfuscatedName("mk")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("my")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("ms")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("mj")
	@ObfuscatedGetter(
		intValue = -959235535
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = -1706098039
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = 1999386603
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(
		intValue = 1731351673
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(
		intValue = 1256174471
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = 705035700
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("mv")
	@ObfuscatedGetter(
		intValue = 820801341
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("mf")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ma")
	@ObfuscatedGetter(
		intValue = -1771740829
	)
	static int field621;
	@ObfuscatedName("mz")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "[Ldn;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("mn")
	@ObfuscatedGetter(
		intValue = -2056560221
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("np")
	@ObfuscatedGetter(
		intValue = -1501725293
	)
	static int field518;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(
		longValue = -377412463607773213L
	)
	@Export("userId")
	static long userId;
	@ObfuscatedName("nh")
	@ObfuscatedGetter(
		longValue = -6790769406651105171L
	)
	@Export("userHash")
	static long userHash;
	@ObfuscatedName("nm")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(
		intValue = 424329739
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("na")
	@ObfuscatedGetter(
		intValue = -1351300135
	)
	static int field708;
	@ObfuscatedName("nq")
	static int[] field625;
	@ObfuscatedName("nv")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("nc")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ne")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("ng")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = -201620211
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "[[[Lpu;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("nk")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("nb")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("nd")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("nw")
	static int[] field644;
	@ObfuscatedName("og")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("ox")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -795846725
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("oz")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("oi")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("ow")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("or")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("on")
	@Export("menuItemIds")
	static int[] menuItemIds;
	@ObfuscatedName("ou")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("op")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("oa")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("oe")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("oo")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("ob")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("od")
	@ObfuscatedGetter(
		intValue = -141293425
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(
		intValue = 234718099
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = 1905280739
	)
	static int field750;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -909628163
	)
	static int field662;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = 673527131
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("pu")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = 1726574561
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -647715427
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("pm")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("pk")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(
		intValue = 315943785
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("pf")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("pp")
	@ObfuscatedGetter(
		intValue = 424545795
	)
	static int field798;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(
		intValue = 623268979
	)
	static int field673;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(
		intValue = 1659563493
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = -1085151731
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(
		intValue = 1399247769
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(
		intValue = 63160595
	)
	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 2142557975
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("po")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("qr")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("qe")
	@ObfuscatedGetter(
		intValue = 413522021
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = 1581367107
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("qt")
	static boolean field739;
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 110966287
	)
	static int field688;
	@ObfuscatedName("qy")
	@ObfuscatedGetter(
		intValue = 1277419091
	)
	static int field689;
	@ObfuscatedName("qk")
	static boolean field714;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = -684237471
	)
	static int field719;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = -739406419
	)
	static int field692;
	@ObfuscatedName("qh")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(
		intValue = 258337423
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("qp")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = -155823437
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("qu")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(
		intValue = 590203651
	)
	static int field777;
	@ObfuscatedName("qj")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = -2032240533
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("qb")
	static int[] field701;
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = 1362152973
	)
	static int field702;
	@ObfuscatedName("rs")
	@ObfuscatedGetter(
		intValue = 1338771405
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("rp")
	@ObfuscatedGetter(
		intValue = 1912580257
	)
	static int field704;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(
		intValue = -160625697
	)
	static int field705;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(
		intValue = -1878590793
	)
	static int field706;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(
		intValue = -1678846283
	)
	static int field707;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = -1055410881
	)
	static int field590;
	@ObfuscatedName("rd")
	@ObfuscatedGetter(
		intValue = -1697646961
	)
	static int field709;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(
		intValue = -850571213
	)
	static int field592;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = 1445594441
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("rf")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static class548 field712;
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("scriptEvents2")
	static NodeDeque scriptEvents2;
	@ObfuscatedName("rk")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("scriptEvents3")
	static NodeDeque scriptEvents3;
	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static NodeDeque field716;
	@ObfuscatedName("rr")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("rc")
	@ObfuscatedGetter(
		intValue = -1565262513
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ro")
	@ObfuscatedGetter(
		intValue = -2012854991
	)
	static int field607;
	@ObfuscatedName("rh")
	@Export("validRootWidgets")
	static boolean[] validRootWidgets;
	@ObfuscatedName("rg")
	static boolean[] field663;
	@ObfuscatedName("si")
	static boolean[] field729;
	@ObfuscatedName("su")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("ss")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("sn")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("sr")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(
		intValue = 1432497677
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("sp")
	@ObfuscatedGetter(
		longValue = 7129987891726135011L
	)
	static long field728;
	@ObfuscatedName("sw")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("sx")
	static int[] field656;
	@ObfuscatedName("sv")
	@ObfuscatedGetter(
		intValue = 557195145
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = -1768412463
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("st")
	static String field733;
	@ObfuscatedName("se")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("sm")
	@ObfuscatedGetter(
		intValue = 2040478791
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("sa")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static class226 field661;
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static class224 field608;
	@ObfuscatedName("sg")
	@ObfuscatedGetter(
		intValue = -409423185
	)
	static int field738;
	@ObfuscatedName("tn")
	static int[] field617;
	@ObfuscatedName("tp")
	static int[] field559;
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		longValue = 3802643986184578083L
	)
	static long field741;
	@ObfuscatedName("ti")
	@ObfuscatedSignature(
		descriptor = "[Lfn;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "[Lgt;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("ts")
	@ObfuscatedGetter(
		intValue = -894415587
	)
	static int field732;
	@ObfuscatedName("tk")
	@ObfuscatedGetter(
		intValue = 1932594645
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("ty")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("ta")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = -1702495937
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("tt")
	@ObfuscatedGetter(
		intValue = -1962001337
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = -1915554767
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("tq")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		intValue = 1143136131
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("uy")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ub")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("ul")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("um")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ux")
	@ObfuscatedSignature(
		descriptor = "[Lbv;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uk")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("up")
	static boolean field760;
	@ObfuscatedName("uw")
	static boolean field761;
	@ObfuscatedName("us")
	static boolean field762;
	@ObfuscatedName("uc")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	static class495 field763;
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	static class494 field500;
	@ObfuscatedName("vg")
	@ObfuscatedSignature(
		descriptor = "Ltn;"
	)
	static class494 field765;
	@ObfuscatedName("vd")
	static boolean field766;
	@ObfuscatedName("vr")
	static boolean[] field767;
	@ObfuscatedName("vp")
	static int[] field722;
	@ObfuscatedName("hw")
	@Export("token")
	String token;
	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	@Export("asyncRestClient")
	AsyncRestClient asyncRestClient;
	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("asyncGameSessionTokenResponse")
	AsyncHttpResponse asyncGameSessionTokenResponse;
	@ObfuscatedName("hr")
	@Export("otlTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
	)
	OtlTokenRequester otlTokenRequester;
	@ObfuscatedName("hn")
	@Export("otlTokenRequestFuture")
	Future otlTokenRequestFuture;
	@ObfuscatedName("hb")
	@Export("https")
	boolean https;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(
		intValue = 1463900463
	)
	@Export("clientId")
	int clientId;
	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("asyncAccessTokenResponse")
	AsyncHttpResponse asyncAccessTokenResponse;
	@ObfuscatedName("he")
	@Export("refreshAccessTokenRequester")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester refreshAccessTokenRequester;
	@ObfuscatedName("hv")
	@Export("refreshAccessTokenRequestFuture")
	Future refreshAccessTokenRequestFuture;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	Buffer field552;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	class7 field695;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(
		longValue = 8285185216542760149L
	)
	@Export("accountHash")
	long accountHash;

	static {
		field764 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field503 = -1;
		clientType = -1;
		field667 = -1;
		onMobile = false;
		gameState = 0;
		field544 = false;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = 1L;
		field512 = -1;
		field783 = -1;
		field514 = -1L;
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
		field528 = class92.field1139;
		js5ConnectState = 0;
		field530 = 0;
		js5Errors = 0;
		loginState = 0;
		field533 = 0;
		field534 = 0;
		field745 = 0;
		authenticationScheme = AuthenticationScheme.USERNAME_PASSWORD;
		field626 = class535.field5235;
		byte[] var1 = class332.method6309("com_jagex_auth_desktop_osrs:public");
		String var0 = ItemComposition.base64Encode(var1, 0, var1.length);
		BASIC_AUTH_DESKTOP_OSRS = var0;
		var1 = class332.method6309("com_jagex_auth_desktop_runelite:public");
		var0 = ItemComposition.base64Encode(var1, 0, var1.length);
		BASIC_AUTH_DESKTOP_RUNELITE = var0;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[65536];
		npcCount = 0;
		npcIndices = new int[65536];
		field549 = 0;
		field603 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field566 = 0;
		field567 = 1;
		field555 = 0;
		field569 = 1;
		field568 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field574 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
		field652 = -1;
		graphicsCycle = 0;
		field577 = 2301979;
		field578 = 5063219;
		field541 = 3353893;
		field580 = 7759444;
		field581 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		field587 = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field623 = 0;
		field510 = 0;
		field593 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		revision = 0;
		field597 = false;
		field598 = 0;
		field599 = false;
		field600 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
		field609 = new int[overheadTextLimit][];
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
		field621 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field518 = 0;
		userId = -1L;
		userHash = -1L;
		renderSelf = true;
		drawPlayerNames = 0;
		field708 = 0;
		field625 = new int[1000];
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
		field644 = new int[25];
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
		field750 = 0;
		field662 = 50;
		isItemSelected = 0;
		field664 = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field798 = 0;
		field673 = -1;
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
		field739 = false;
		field688 = -1;
		field689 = -1;
		field714 = false;
		field719 = -1;
		field692 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field777 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field701 = new int[32];
		field702 = 0;
		chatCycle = 0;
		field704 = 0;
		field705 = 0;
		field706 = 0;
		field707 = 0;
		field590 = 0;
		field709 = 0;
		field592 = 0;
		mouseWheelRotation = 0;
		field712 = new class548();
		scriptEvents = new NodeDeque();
		scriptEvents2 = new NodeDeque();
		scriptEvents3 = new NodeDeque();
		field716 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field607 = -2;
		validRootWidgets = new boolean[100];
		field663 = new boolean[100];
		field729 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field728 = 0L;
		isResizable = true;
		field656 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
		publicChatMode = 0;
		tradeChatMode = 0;
		field733 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field661 = new class226();
		field608 = new class224();
		field738 = 0;
		field617 = new int[128];
		field559 = new int[128];
		field741 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field732 = -1;
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
		field760 = false;
		field761 = false;
		field762 = false;
		field763 = null;
		field500 = null;
		field765 = null;
		field766 = false;
		field767 = new boolean[5];
		field722 = new int[5];
		field769 = new int[5];
		field788 = new int[5];
		field775 = new int[5];
		field772 = 256;
		field773 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field776 = 1;
		field596 = 32767;
		field778 = 1;
		field779 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field736 = -1;
		field787 = -1;
		field529 = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field791 = new class439(8, class437.field4677);
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		archive11 = new EvictingDualNodeHashTable(64);
		field730 = -1;
		field758 = -1;
		field786 = new ArrayList();
		field691 = new class232();
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field785 = 0;
		field801 = new ApproximateRouteStrategy();
		field802 = new int[50];
		field803 = new int[50];
	}

	public Client() {
		this.https = false;
		this.clientId = 0;
		this.accountHash = -1L;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field728 = UserComparator9.method2973() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.method1280(true);
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1581898600"
	)
	@Export("setUp")
	protected final void setUp() {
		UserComparator10.method2989(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
		SecureRandomCallable.worldPort = gameBuild == 0 ? 43594 : worldId + 40000;
		AsyncRestClient.js5Port = gameBuild == 0 ? 443 : worldId + 50000;
		GrandExchangeOfferOwnWorldComparator.currentPort = SecureRandomCallable.worldPort;
		class539.field5245 = class345.field3685;
		PlayerComposition.field3646 = class345.field3684;
		PlayerComposition.field3648 = class345.field3686;
		DevicePcmPlayerProvider.field113 = class345.field3683;
		SecureUrlRequester.urlRequester = new SecureUrlRequester(this.https, 219);
		this.setUpKeyboard();
		this.setUpMouse();
		PlayerCompositionColorTextureOverride.mouseWheel = this.mouseWheel();
		this.method632(field608, 0);
		this.method632(field661, 1);
		this.setUpClipboard();
		class357.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		AccessFile var2 = null;
		ClientPreferences var3 = new ClientPreferences();

		try {
			var2 = Huffman.getPreferencesFile("", class1.field3.name, false);
			byte[] var4 = new byte[(int)var2.length()];

			int var6;
			for (int var5 = 0; var5 < var4.length; var5 += var6) {
				var6 = var2.read(var4, var5, var4.length - var5);
				if (var6 == -1) {
					throw new IOException();
				}
			}

			var3 = new ClientPreferences(new Buffer(var4));
		} catch (Exception var8) {
		}

		try {
			if (var2 != null) {
				var2.close();
			}
		} catch (Exception var7) {
		}

		class93.clientPreferences = var3;
		String var9 = Canvas.field120;
		class31.field163 = this;
		if (var9 != null) {
			class31.field161 = var9;
		}

		ClanSettings.setWindowedMode(class93.clientPreferences.getWindowMode());
		class332.friendSystem = new FriendSystem(UserComparator10.loginType);
		this.asyncRestClient = new AsyncRestClient("tokenRequest", 1, 1);
		Players.method2786(this);
		field691.method4561();
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		Timer.method8056();
		boolean var2 = false;
		boolean var3 = false;
		if (!class319.field3462.isEmpty()) {
			SongTask var4 = (SongTask)class319.field3462.get(0);
			if (var4 == null) {
				class319.field3462.remove(0);
			} else if (var4.vmethod7975()) {
				if (var4.method7949()) {
					System.out.println("Error in midimanager.service: " + var4.method7952());
					var2 = true;
				} else {
					if (var4.method7953() != null) {
						class319.field3462.add(1, var4.method7953());
					}

					var3 = var4.method7963();
				}

				class319.field3462.remove(0);
			} else {
				var3 = var4.method7963();
			}
		}

		if (var2) {
			class319.field3462.clear();
			class150.method3304();
		}

		if (var3 && playingJingle && WorldMap.pcmPlayer1 != null) {
			WorldMap.pcmPlayer1.tryDiscard();
		}

		WorldMapRectangle.method5020();
		field661.method4423();
		this.method504();
		class208.method4205();
		if (PlayerCompositionColorTextureOverride.mouseWheel != null) {
			int var5 = PlayerCompositionColorTextureOverride.mouseWheel.useRotation();
			mouseWheelRotation = var5;
		}

		if (gameState == 0) {
			class102.method2736();
			WorldMapLabelSize.method4610();
		} else if (gameState == 5) {
			HealthBarDefinition.loginScreen(this, UserComparator5.fontPlain11, class339.fontPlain12);
			class102.method2736();
			WorldMapLabelSize.method4610();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				HealthBarDefinition.loginScreen(this, UserComparator5.fontPlain11, class339.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 50) {
				HealthBarDefinition.loginScreen(this, UserComparator5.fontPlain11, class339.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				class466.method8613();
			}
		} else {
			HealthBarDefinition.loginScreen(this, UserComparator5.fontPlain11, class339.fontPlain12);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "65536"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field728 && UserComparator9.method2973() > field728) {
			ClanSettings.setWindowedMode(ClanChannelMember.getWindowedMode());
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
			class207.drawTitle(class90.fontBold12, UserComparator5.fontPlain11, class339.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class207.drawTitle(class90.fontBold12, UserComparator5.fontPlain11, class339.fontPlain12);
			} else if (gameState == 50) {
				class207.drawTitle(class90.fontBold12, UserComparator5.fontPlain11, class339.fontPlain12);
			} else if (gameState == 25) {
				if (field568 == 1) {
					if (field566 > field567) {
						field567 = field566;
					}

					var2 = (field567 * 50 - field566 * 50) / field567;
					StructComposition.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else if (field568 == 2) {
					if (field555 > field569) {
						field569 = field555;
					}

					var2 = (field569 * 50 - field555 * 50) / field569 + 50;
					StructComposition.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
				} else {
					StructComposition.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				StructComposition.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) {
				StructComposition.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class207.drawTitle(class90.fontBold12, UserComparator5.fontPlain11, class339.fontPlain12);
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				if (field663[var2]) {
					WorldMapData_1.rasterProvider.draw(rootWidgetXs[var2], rootWidgetYs[var2], rootWidgetWidths[var2], rootWidgetHeights[var2]);
					field663[var2] = false;
				}
			}
		} else if (gameState > 0) {
			WorldMapData_1.rasterProvider.drawFull(0, 0);

			for (var2 = 0; var2 < rootWidgetCount; ++var2) {
				field663[var2] = false;
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1847953596"
	)
	@Export("kill0")
	protected final void kill0() {
		if (ClientPreferences.varcs.hasUnwrittenChanges()) {
			ClientPreferences.varcs.write();
		}

		if (Canvas.mouseRecorder != null) {
			Canvas.mouseRecorder.isRunning = false;
		}

		Canvas.mouseRecorder = null;
		packetWriter.close();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

		PlayerCompositionColorTextureOverride.mouseWheel = null;
		if (WorldMap.pcmPlayer1 != null) {
			WorldMap.pcmPlayer1.shutdown();
		}

		UrlRequester.field1418.method7134();
		Skeleton.method5380();
		if (SecureUrlRequester.urlRequester != null) {
			SecureUrlRequester.urlRequester.close();
			SecureUrlRequester.urlRequester = null;
		}

		class106.method2774();
		this.asyncRestClient.shutdown();
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "164188662"
	)
	protected final void vmethod1251() {
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "27475"
	)
	@Export("isRuneLite")
	boolean isRuneLite() {
		return this.clientId == 1;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "463011586"
	)
	@Export("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken() {
		return HttpRequest.accessToken != null && !HttpRequest.accessToken.trim().isEmpty() && class4.refreshToken != null && !class4.refreshToken.trim().isEmpty();
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1185257720"
	)
	@Export("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId() {
		return ClanChannel.sessionId != null && !ClanChannel.sessionId.trim().isEmpty() && class60.characterId != null && !class60.characterId.trim().isEmpty();
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1362910256"
	)
	boolean method1368() {
		return this.otlTokenRequester != null;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1792751076"
	)
	@Export("requestRefreshAccessToken")
	void requestRefreshAccessToken(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class424.authServiceBaseUrl + "shield/oauth/token" + (new HttpQueryParams(var2)).encode());
		HttpHeaders var4 = new HttpHeaders();
		if (this.isRuneLite()) {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_RUNELITE);
		} else {
			var4.basicAuthentication(BASIC_AUTH_DESKTOP_OSRS);
		}

		var4.header("Host", (new URL(class424.authServiceBaseUrl)).getHost());
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

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-28241"
	)
	@Export("requestOtlToken")
	void requestOtlToken(String var1) throws IOException {
		URL var2 = new URL(class424.authServiceBaseUrl + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
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

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "7"
	)
	@Export("authenticate")
	void authenticate(String var1, String var2) throws IOException, JSONException {
		URL var3 = new URL(class148.gameSessionServiceBaseUrl + "game-session/v1/tokens");
		HttpRequest var4 = new HttpRequest(var3, HttpMethod.POST, this.https);
		var4.getHeaders().bearerToken(var1);
		var4.getHeaders().accept(HttpContentType.APPLICATION_JSON);
		JSONObject var5 = new JSONObject();
		var5.setProperty("accountId", var2);
		var4.setPayload(new HttpJsonRequestBody(var5));
		this.asyncGameSessionTokenResponse = this.asyncRestClient.submitRequest(var4);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = UrlRequester.field1418.method7139();
			if (!var1) {
				this.method1569();
			}

		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1702065078"
	)
	void method1569() {
		if (UrlRequester.field1418.field4377 >= 4) {
			this.error("js5crc");
			class131.updateGameState(1000);
		} else {
			if (UrlRequester.field1418.field4398 >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					class131.updateGameState(1000);
					return;
				}

				field530 = 3000;
				UrlRequester.field1418.field4398 = 3;
			}

			if (--field530 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						Bounds.js5SocketTask = GameEngine.taskHandler.newSocketTask(InvDefinition.worldHost, GrandExchangeOfferOwnWorldComparator.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (Bounds.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (Bounds.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						ClanMate.js5Socket = WorldMapRenderer.method4879((Socket)Bounds.js5SocketTask.result, 40000, 5000);
						Buffer var1 = new Buffer(5);
						var1.writeByte(15);
						var1.writeInt(219);
						ClanMate.js5Socket.write(var1.array, 0, 5);
						++js5ConnectState;
						AsyncHttpResponse.field83 = UserComparator9.method2973();
					}

					if (js5ConnectState == 3) {
						if (ClanMate.js5Socket.available() > 0) {
							int var2 = ClanMate.js5Socket.readUnsignedByte();
							if (var2 != 0) {
								this.js5Error(var2);
								return;
							}

							++js5ConnectState;
						} else if (UserComparator9.method2973() - AsyncHttpResponse.field83 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						UrlRequester.field1418.method7127(ClanMate.js5Socket, gameState > 20);
						Bounds.js5SocketTask = null;
						ClanMate.js5Socket = null;
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
		descriptor = "(II)V",
		garbageValue = "1719019352"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		Bounds.js5SocketTask = null;
		ClanMate.js5Socket = null;
		js5ConnectState = 0;
		if (GrandExchangeOfferOwnWorldComparator.currentPort == SecureRandomCallable.worldPort) {
			GrandExchangeOfferOwnWorldComparator.currentPort = AsyncRestClient.js5Port;
		} else {
			GrandExchangeOfferOwnWorldComparator.currentPort = SecureRandomCallable.worldPort;
		}

		++js5Errors;
		if (js5Errors < 2 || var1 != 7 && var1 != 9) {
			if (js5Errors >= 2 && var1 == 6) {
				this.error("js5connect_outofdate");
				class131.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					class131.updateGameState(1000);
				} else {
					field530 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			class131.updateGameState(1000);
		} else {
			field530 = 3000;
		}

	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "534530571"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		AbstractSocket var1 = packetWriter.getSocket();
		PacketBuffer var2 = packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if (class161.field1753 == null && (secureRandomFuture.isDone() || field533 > 250)) {
					class161.field1753 = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class161.field1753 != null) {
					if (var1 != null) {
						var1.close();
						var1 = null;
					}

					class132.field1563 = null;
					hadNetworkError = false;
					field533 = 0;
					if (field626.method9672()) {
						if (this.containsAccessAndRefreshToken()) {
							try {
								this.requestRefreshAccessToken(class4.refreshToken);
								UrlRequest.updateLoginState(21);
							} catch (Throwable var22) {
								class368.RunException_sendStackTrace((String)null, var22);
								HealthBar.getLoginError(65);
								return;
							}
						} else {
							if (!this.containsSessionAndCharacterId()) {
								HealthBar.getLoginError(65);
								return;
							}

							try {
								this.authenticate(ClanChannel.sessionId, class60.characterId);
								UrlRequest.updateLoginState(20);
							} catch (Exception var21) {
								class368.RunException_sendStackTrace((String)null, var21);
								HealthBar.getLoginError(65);
								return;
							}
						}
					} else {
						UrlRequest.updateLoginState(1);
					}
				}
			}

			HttpResponse var24;
			if (loginState == 21) {
				if (this.refreshAccessTokenRequestFuture != null) {
					if (!this.refreshAccessTokenRequestFuture.isDone()) {
						return;
					}

					if (this.refreshAccessTokenRequestFuture.isCancelled()) {
						HealthBar.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.refreshAccessTokenRequestFuture.get();
						if (!var3.isSuccess()) {
							HealthBar.getLoginError(65);
							this.refreshAccessTokenRequestFuture = null;
							return;
						}

						HttpRequest.accessToken = var3.getAccessToken();
						class4.refreshToken = var3.getRefreshToken();
						this.refreshAccessTokenRequestFuture = null;
					} catch (Exception var20) {
						class368.RunException_sendStackTrace((String)null, var20);
						HealthBar.getLoginError(65);
						this.refreshAccessTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncAccessTokenResponse == null) {
						HealthBar.getLoginError(65);
						return;
					}

					if (!this.asyncAccessTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncAccessTokenResponse.hasError()) {
						class368.RunException_sendStackTrace(this.asyncAccessTokenResponse.getErrorMessage(), (Throwable)null);
						HealthBar.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					var24 = this.asyncAccessTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						HealthBar.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}

					field533 = 0;
					HttpJsonRequestBody var4 = new HttpJsonRequestBody(var24.getResponseBody());

					try {
						HttpRequest.accessToken = var4.getBody().getString("access_token");
						class4.refreshToken = var4.getBody().getString("refresh_token");
					} catch (Exception var19) {
						class368.RunException_sendStackTrace("Error parsing tokens", var19);
						HealthBar.getLoginError(65);
						this.asyncAccessTokenResponse = null;
						return;
					}
				}

				this.requestOtlToken(HttpRequest.accessToken);
				UrlRequest.updateLoginState(20);
			}

			if (loginState == 20) {
				if (this.otlTokenRequestFuture != null) {
					if (!this.otlTokenRequestFuture.isDone()) {
						return;
					}

					if (this.otlTokenRequestFuture.isCancelled()) {
						HealthBar.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}

					try {
						OtlTokenResponse var25 = (OtlTokenResponse)this.otlTokenRequestFuture.get();
						if (!var25.isSuccess()) {
							HealthBar.getLoginError(65);
							this.otlTokenRequestFuture = null;
							return;
						}

						this.token = var25.getToken();
						this.otlTokenRequestFuture = null;
					} catch (Exception var18) {
						class368.RunException_sendStackTrace((String)null, var18);
						HealthBar.getLoginError(65);
						this.otlTokenRequestFuture = null;
						return;
					}
				} else {
					if (this.asyncGameSessionTokenResponse == null) {
						HealthBar.getLoginError(65);
						return;
					}

					if (!this.asyncGameSessionTokenResponse.hasFinished()) {
						return;
					}

					if (this.asyncGameSessionTokenResponse.hasError()) {
						class368.RunException_sendStackTrace(this.asyncGameSessionTokenResponse.getErrorMessage(), (Throwable)null);
						HealthBar.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					var24 = this.asyncGameSessionTokenResponse.await();
					if (var24.getResponseCode() != 200) {
						class368.RunException_sendStackTrace("Response code: " + var24.getResponseCode() + "Response body: " + var24.getResponseBody(), (Throwable)null);
						HealthBar.getLoginError(65);
						this.asyncGameSessionTokenResponse = null;
						return;
					}

					List var26 = (List)var24.getHeaderFields().get("Content-Type");
					if (var26 != null && var26.contains(HttpContentType.APPLICATION_JSON.getValue())) {
						try {
							JSONObject var5 = new JSONObject(var24.getResponseBody());
							this.token = var5.getString("token");
						} catch (JSONException var17) {
							class368.RunException_sendStackTrace((String)null, var17);
							HealthBar.getLoginError(65);
							this.asyncGameSessionTokenResponse = null;
							return;
						}
					} else {
						this.token = var24.getResponseBody();
					}

					this.asyncGameSessionTokenResponse = null;
				}

				field533 = 0;
				UrlRequest.updateLoginState(1);
			}

			if (loginState == 1) {
				if (class132.field1563 == null) {
					class132.field1563 = GameEngine.taskHandler.newSocketTask(InvDefinition.worldHost, GrandExchangeOfferOwnWorldComparator.currentPort);
				}

				if (class132.field1563.status == 2) {
					throw new IOException();
				}

				if (class132.field1563.status == 1) {
					var1 = WorldMapRenderer.method4879((Socket)class132.field1563.result, 40000, 5000);
					packetWriter.setSocket(var1);
					class132.field1563 = null;
					UrlRequest.updateLoginState(2);
				}
			}

			PacketBufferNode var28;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var28 = SecureRandomFuture.method2234();
				var28.clientPacket = null;
				var28.clientPacketLength = 0;
				var28.packetBuffer = new PacketBuffer(5000);
				var28.packetBuffer.writeByte(LoginPacket.field3421.id);
				packetWriter.addNode(var28);
				packetWriter.flush();
				var2.offset = 0;
				UrlRequest.updateLoginState(3);
			}

			int var13;
			if (loginState == 3) {
				if (WorldMap.pcmPlayer1 != null) {
					WorldMap.pcmPlayer1.method845();
				}

				if (var1.isAvailable(1)) {
					var13 = var1.readUnsignedByte();
					if (WorldMap.pcmPlayer1 != null) {
						WorldMap.pcmPlayer1.method845();
					}

					if (var13 != 0) {
						HealthBar.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					UrlRequest.updateLoginState(4);
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
					class137.field1594 = var2.readLong();
					UrlRequest.updateLoginState(5);
				}
			}

			if (loginState == 5) {
				packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var27 = new PacketBuffer(500);
				int[] var30 = new int[]{class161.field1753.nextInt(), class161.field1753.nextInt(), class161.field1753.nextInt(), class161.field1753.nextInt()};
				var27.offset = 0;
				var27.writeByte(1);
				var27.writeInt(var30[0]);
				var27.writeInt(var30[1]);
				var27.writeInt(var30[2]);
				var27.writeInt(var30[3]);
				var27.writeLong(class137.field1594);
				if (gameState == 40) {
					var27.writeInt(class17.field75[0]);
					var27.writeInt(class17.field75[1]);
					var27.writeInt(class17.field75[2]);
					var27.writeInt(class17.field75[3]);
				} else {
					if (gameState == 50) {
						var27.writeByte(AuthenticationScheme.field1473.rsOrdinal());
						var27.writeInt(class105.field1340);
					} else {
						var27.writeByte(authenticationScheme.rsOrdinal());
						switch(authenticationScheme.schemeId) {
						case 0:
						case 4:
							var27.writeMedium(class130.otpMedium);
							++var27.offset;
							break;
						case 1:
							var27.writeInt(class93.clientPreferences.getParameterValue(Login.Login_username));
						case 2:
						default:
							break;
						case 3:
							var27.offset += 4;
						}
					}

					if (field626.method9672()) {
						var27.writeByte(class535.field5233.rsOrdinal());
						var27.writeStringCp1252NullTerminated(this.token);
					} else {
						var27.writeByte(class535.field5235.rsOrdinal());
						var27.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var27.encryptRsa(class74.field898, class74.field902);
				class17.field75 = var30;
				PacketBufferNode var6 = SecureRandomFuture.method2234();
				var6.clientPacket = null;
				var6.clientPacketLength = 0;
				var6.packetBuffer = new PacketBuffer(5000);
				var6.packetBuffer.offset = 0;
				if (gameState == 40) {
					var6.packetBuffer.writeByte(LoginPacket.field3415.id);
				} else {
					var6.packetBuffer.writeByte(LoginPacket.field3416.id);
				}

				var6.packetBuffer.writeShort(0);
				int var7 = var6.packetBuffer.offset;
				var6.packetBuffer.writeInt(219);
				var6.packetBuffer.writeInt(1);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeByte(field667);
				byte var8 = 0;
				var6.packetBuffer.writeByte(var8);
				var6.packetBuffer.writeBytes(var27.array, 0, var27.offset);
				int var9 = var6.packetBuffer.offset;
				var6.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var6.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var6.packetBuffer.writeShort(class524.canvasWidth);
				var6.packetBuffer.writeShort(GameEngine.canvasHeight);
				SecureRandomSSLSocket.method170(var6.packetBuffer);
				var6.packetBuffer.writeStringCp1252NullTerminated(class426.field4608);
				var6.packetBuffer.writeInt(WorldMapData_0.field2467);
				var6.packetBuffer.writeByte(0);
				Buffer var10 = new Buffer(FriendSystem.platformInfo.size());
				FriendSystem.platformInfo.write(var10);
				var6.packetBuffer.writeBytes(var10.array, 0, var10.array.length);
				var6.packetBuffer.writeByte(clientType);
				var6.packetBuffer.writeInt(0);
				var6.packetBuffer.writeIntME(class142.field1632.hash);
				var6.packetBuffer.writeIntME(DynamicObject.field994.hash);
				var6.packetBuffer.writeIntIME(HttpRequestTask.archive8.hash);
				var6.packetBuffer.writeIntLE(class127.field1489.hash);
				var6.packetBuffer.writeIntIME(WorldMapDecorationType.archive12.hash);
				var6.packetBuffer.writeIntLE(HttpContentType.field4844.hash);
				var6.packetBuffer.writeIntME(WorldMapDecoration.field2627.hash);
				var6.packetBuffer.writeIntIME(class314.field3428.hash);
				var6.packetBuffer.writeInt(class30.archive9.hash);
				var6.packetBuffer.writeIntIME(0);
				var6.packetBuffer.writeInt(MusicPatchNode.field3548.hash);
				var6.packetBuffer.writeIntLE(HitSplatDefinition.archive13.hash);
				var6.packetBuffer.writeIntME(class189.archive10.hash);
				var6.packetBuffer.writeIntME(class130.field1521.hash);
				var6.packetBuffer.writeIntME(WorldMapSection0.archive6.hash);
				var6.packetBuffer.writeIntLE(PacketBufferNode.field3284.hash);
				var6.packetBuffer.writeIntIME(AABB.field2907.hash);
				var6.packetBuffer.writeIntLE(class36.archive2.hash);
				var6.packetBuffer.writeIntLE(class189.field1999.hash);
				var6.packetBuffer.writeIntIME(DirectByteArrayCopier.field3862.hash);
				var6.packetBuffer.writeIntIME(class173.archive4.hash);
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
				UrlRequest.updateLoginState(6);
			}

			int var14;
			if (loginState == 6 && var1.available() > 0) {
				var13 = var1.readUnsignedByte();
				if (var13 == 61) {
					var14 = var1.available();
					class373.field4355 = var14 == 1 && var1.readUnsignedByte() == 1;
					UrlRequest.updateLoginState(5);
				}

				if (var13 == 21 && gameState == 20) {
					UrlRequest.updateLoginState(12);
				} else if (var13 == 2) {
					UrlRequest.updateLoginState(14);
				} else if (var13 == 15 && gameState == 40) {
					packetWriter.serverPacketLength = -1;
					UrlRequest.updateLoginState(19);
				} else if (var13 == 64) {
					UrlRequest.updateLoginState(10);
				} else if (var13 == 23 && field534 < 1) {
					++field534;
					UrlRequest.updateLoginState(0);
				} else if (var13 == 29) {
					UrlRequest.updateLoginState(17);
				} else {
					if (var13 != 69) {
						HealthBar.getLoginError(var13);
						return;
					}

					UrlRequest.updateLoginState(7);
				}
			}

			if (loginState == 7 && var1.available() >= 2) {
				var1.read(var2.array, 0, 2);
				var2.offset = 0;
				MusicPatch.field3532 = var2.readUnsignedShort();
				UrlRequest.updateLoginState(8);
			}

			if (loginState == 8 && var1.available() >= MusicPatch.field3532) {
				var2.offset = 0;
				var1.read(var2.array, var2.offset, MusicPatch.field3532);
				class6 var29 = class31.method467()[var2.readUnsignedByte()];

				try {
					switch(var29.field9) {
					case 0:
						class0 var32 = new class0();
						this.field695 = new class7(var2, var32);
						UrlRequest.updateLoginState(9);
						break;
					default:
						throw new IllegalArgumentException();
					}
				} catch (Exception var16) {
					HealthBar.getLoginError(22);
					return;
				}
			}

			if (loginState == 9 && this.field695.method44()) {
				this.field552 = this.field695.method46();
				this.field695.method45();
				this.field695 = null;
				if (this.field552 == null) {
					HealthBar.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var28 = SecureRandomFuture.method2234();
				var28.clientPacket = null;
				var28.clientPacketLength = 0;
				var28.packetBuffer = new PacketBuffer(5000);
				var28.packetBuffer.writeByte(LoginPacket.field3414.id);
				var28.packetBuffer.writeShort(this.field552.offset);
				var28.packetBuffer.writeBuffer(this.field552);
				packetWriter.addNode(var28);
				packetWriter.flush();
				this.field552 = null;
				UrlRequest.updateLoginState(6);
			}

			if (loginState == 10 && var1.available() > 0) {
				class351.field3864 = var1.readUnsignedByte();
				UrlRequest.updateLoginState(11);
			}

			if (loginState == 11 && var1.available() >= class351.field3864) {
				var1.read(var2.array, 0, class351.field3864);
				var2.offset = 0;
				UrlRequest.updateLoginState(6);
			}

			if (loginState == 12 && var1.available() > 0) {
				field745 = (var1.readUnsignedByte() + 3) * 60;
				UrlRequest.updateLoginState(13);
			}

			if (loginState == 13) {
				field533 = 0;
				class142.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field745 / 60 + " seconds.");
				if (--field745 <= 0) {
					UrlRequest.updateLoginState(0);
				}

			} else {
				if (loginState == 14 && var1.available() >= 1) {
					class53.field369 = var1.readUnsignedByte();
					UrlRequest.updateLoginState(15);
				}

				if (loginState == 15 && var1.available() >= class53.field369) {
					boolean var38 = var1.readUnsignedByte() == 1;
					var1.read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var37 = false;
					if (var38) {
						var14 = var2.readByteIsaac() << 24;
						var14 |= var2.readByteIsaac() << 16;
						var14 |= var2.readByteIsaac() << 8;
						var14 |= var2.readByteIsaac();
						class93.clientPreferences.put(Login.Login_username, var14);
					}

					if (Login_isUsernameRemembered) {
						class93.clientPreferences.updateRememberedUsername(Login.Login_username);
					} else {
						class93.clientPreferences.updateRememberedUsername((String)null);
					}

					class408.savePreferences();
					staffModLevel = var1.readUnsignedByte();
					playerMod = var1.readUnsignedByte() == 1;
					localPlayerIndex = var1.readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += var1.readUnsignedByte();
					field518 = var1.readUnsignedByte();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					this.accountHash = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userId = var2.readLong();
					var1.read(var2.array, 0, 8);
					var2.offset = 0;
					userHash = var2.readLong();
					KitDefinition.method3664().method4281();
					UrlRequest.updateLoginState(22);
				}

				if (loginState == 22 && var1.available() >= packetWriter.serverPacketLength) {
					var1.read(var2.array, 0, 1);
					var2.offset = 0;
					if (var2.method9326()) {
						var1.read(var2.array, 1, 1);
						var2.offset = 0;
					}

					ServerPacket[] var31 = class143.ServerPacket_values();
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
						Client var33 = VertexNormal.client;
						JSObject.getWindow(var33).call("zap", (Object[])null);
					} catch (Throwable var15) {
					}

					UrlRequest.updateLoginState(16);
				}

				if (loginState == 16) {
					if (var1.available() >= packetWriter.serverPacketLength) {
						var2.offset = 0;
						var1.read(var2.array, 0, packetWriter.serverPacketLength);
						timer.method8042();
						WorldMapElement.method3627();
						ClientPacket.updatePlayer(var2);
						KeyHandler.field134 = -1;
						class467.loadRegions(false, var2);
						packetWriter.serverPacket = null;
					}

				} else {
					if (loginState == 17 && var1.available() >= 2) {
						var2.offset = 0;
						var1.read(var2.array, 0, 2);
						var2.offset = 0;
						RouteStrategy.field2446 = var2.readUnsignedShort();
						UrlRequest.updateLoginState(18);
					}

					if (loginState == 18 && var1.available() >= RouteStrategy.field2446) {
						var2.offset = 0;
						var1.read(var2.array, 0, RouteStrategy.field2446);
						var2.offset = 0;
						String var34 = var2.readStringCp1252NullTerminated();
						String var36 = var2.readStringCp1252NullTerminated();
						String var35 = var2.readStringCp1252NullTerminated();
						class142.setLoginResponseString(var34, var36, var35);
						class131.updateGameState(10);
						if (field626.method9672()) {
							Actor.method2489(9);
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
							timer.method8038();
							MouseHandler.method716();
							ClientPacket.updatePlayer(var2);
							if (var13 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field533;
						if (field533 > 2000) {
							if (field534 < 1) {
								if (GrandExchangeOfferOwnWorldComparator.currentPort == SecureRandomCallable.worldPort) {
									GrandExchangeOfferOwnWorldComparator.currentPort = AsyncRestClient.js5Port;
								} else {
									GrandExchangeOfferOwnWorldComparator.currentPort = SecureRandomCallable.worldPort;
								}

								++field534;
								UrlRequest.updateLoginState(0);
							} else {
								HealthBar.getLoginError(-3);
							}
						}
					}
				}
			}
		} catch (IOException var23) {
			if (field534 < 1) {
				if (GrandExchangeOfferOwnWorldComparator.currentPort == SecureRandomCallable.worldPort) {
					GrandExchangeOfferOwnWorldComparator.currentPort = AsyncRestClient.js5Port;
				} else {
					GrandExchangeOfferOwnWorldComparator.currentPort = SecureRandomCallable.worldPort;
				}

				++field534;
				UrlRequest.updateLoginState(0);
			} else {
				HealthBar.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1682282602"
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
			Messages.method2849();
		} else {
			if (!isMenuOpen) {
				class365.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; var1 < 100 && this.method1434(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last();
					boolean var29;
					if (var2 == null) {
						var29 = false;
					} else {
						var29 = true;
					}

					int var3;
					PacketBufferNode var30;
					if (!var29) {
						PacketBufferNode var14;
						int var15;
						if (timer.field4633) {
							var14 = class482.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method8043();
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
						synchronized(Canvas.mouseRecorder.lock) {
							if (!field764) {
								Canvas.mouseRecorder.index = 0;
							} else if (MouseHandler.MouseHandler_lastButton != 0 || Canvas.mouseRecorder.index >= 40) {
								var30 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; var7 < Canvas.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) {
									var4 = var7;
									var8 = Canvas.mouseRecorder.ys[var7];
									if (var8 < -1) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = Canvas.mouseRecorder.xs[var7];
									if (var9 < -1) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if (var9 != field512 || var8 != field783) {
										if (var30 == null) {
											var30 = class482.getPacketBufferNode(ClientPacket.field3166, packetWriter.isaacCipher);
											var30.packetBuffer.writeByte(0);
											var3 = var30.packetBuffer.offset;
											PacketBuffer var10000 = var30.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if (-1L != field514) {
											var10 = var9 - field512;
											var11 = var8 - field783;
											var12 = (int)((Canvas.mouseRecorder.millis[var7] - field514) / 20L);
											var5 = (int)((long)var5 + (Canvas.mouseRecorder.millis[var7] - field514) % 20L);
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field512 = var9;
										field783 = var8;
										if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
											var10 += 32;
											var11 += 32;
											var30.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
										} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
											var10 += 128;
											var11 += 128;
											var30.packetBuffer.writeByte(var12 + 128);
											var30.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var30.packetBuffer.writeByte(var12 + 192);
											if (var9 != -1 && var8 != -1) {
												var30.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var30.packetBuffer.writeShort((var12 & 8191) + 57344);
											if (var9 != -1 && var8 != -1) {
												var30.packetBuffer.writeInt(var9 | var8 << 16);
											} else {
												var30.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field514 = Canvas.mouseRecorder.millis[var7];
									}
								}

								if (var30 != null) {
									var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
									var7 = var30.packetBuffer.offset;
									var30.packetBuffer.offset = var3;
									var30.packetBuffer.writeByte(var5 / var6);
									var30.packetBuffer.writeByte(var5 % var6);
									var30.packetBuffer.offset = var7;
									packetWriter.addNode(var30);
								}

								if (var4 >= Canvas.mouseRecorder.index) {
									Canvas.mouseRecorder.index = 0;
								} else {
									MouseRecorder var51 = Canvas.mouseRecorder;
									var51.index -= var4;
									System.arraycopy(Canvas.mouseRecorder.xs, var4, Canvas.mouseRecorder.xs, 0, Canvas.mouseRecorder.index);
									System.arraycopy(Canvas.mouseRecorder.ys, var4, Canvas.mouseRecorder.ys, 0, Canvas.mouseRecorder.index);
									System.arraycopy(Canvas.mouseRecorder.millis, var4, Canvas.mouseRecorder.millis, 0, Canvas.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (MouseHandler.MouseHandler_lastButton == 1 || !SoundCache.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > GameEngine.canvasHeight) {
								var3 = GameEngine.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class524.canvasWidth) {
								var4 = class524.canvasWidth;
							}

							var5 = (int)var16;
							var18 = class482.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (mouseWheelRotation != 0) {
							var14 = class482.getPacketBufferNode(ClientPacket.field3258, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(mouseWheelRotation);
							packetWriter.addNode(var14);
						}

						if (field661.field2398 > 0) {
							var14 = class482.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = UserComparator9.method2973();

							for (var5 = 0; var5 < field661.field2398; ++var5) {
								long var21 = var19 - field741;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field741 = var19;
								var14.packetBuffer.writeByteNeg(field661.field2395[var5]);
								var14.packetBuffer.writeMediumLE((int)var21);
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field598 > 0) {
							--field598;
						}

						if (field661.method4426(96) || field661.method4426(97) || field661.method4426(98) || field661.method4426(99)) {
							field599 = true;
						}

						if (field599 && field598 <= 0) {
							field598 = 20;
							field599 = false;
							var14 = class482.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
							var14.packetBuffer.writeShortLE(camAngleX);
							var14.packetBuffer.writeShortAdd(camAngleY);
							packetWriter.addNode(var14);
						}

						if (class31.hasFocus && !hadFocus) {
							hadFocus = true;
							var14 = class482.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if (!class31.hasFocus && hadFocus) {
							hadFocus = false;
							var14 = class482.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (GrandExchangeOfferUnitPriceComparator.worldMap != null) {
							GrandExchangeOfferUnitPriceComparator.worldMap.method8852();
						}

						Player var31;
						if (VarpDefinition.ClanChat_inClanChat) {
							if (ClientPreferences.friendsChat != null) {
								ClientPreferences.friendsChat.sort();
							}

							for (var1 = 0; var1 < Players.Players_count; ++var1) {
								var31 = players[Players.Players_indices[var1]];
								var31.clearIsInFriendsChat();
							}

							VarpDefinition.ClanChat_inClanChat = false;
						}

						if (VarpDefinition.field1832) {
							for (var1 = 0; var1 < Players.Players_count; ++var1) {
								var31 = players[Players.Players_indices[var1]];
								var31.method2395();
							}

							VarpDefinition.field1832 = false;
						}

						HttpMethod.method79();
						if (gameState != 30) {
							return;
						}

						for (PendingSpawn var37 = (PendingSpawn)pendingSpawns.last(); var37 != null; var37 = (PendingSpawn)pendingSpawns.previous()) {
							if (var37.hitpoints > 0) {
								--var37.hitpoints;
							}

							if (var37.hitpoints == 0) {
								if (var37.objectId < 0 || BufferedSink.method8461(var37.objectId, var37.field1163)) {
									class133.addPendingSpawnToScene(var37.plane, var37.type, var37.x, var37.y, var37.objectId, var37.field1162, var37.field1163, var37.field1167);
									var37.remove();
								}
							} else {
								if (var37.delay > 0) {
									--var37.delay;
								}

								if (var37.delay == 0 && var37.x >= 1 && var37.y >= 1 && var37.x <= 102 && var37.y <= 102 && (var37.field1164 < 0 || BufferedSink.method8461(var37.field1164, var37.field1166))) {
									class133.addPendingSpawnToScene(var37.plane, var37.type, var37.x, var37.y, var37.field1164, var37.field1157, var37.field1166, var37.field1167);
									var37.delay = -1;
									if (var37.field1164 == var37.objectId && var37.objectId == -1) {
										var37.remove();
									} else if (var37.objectId == var37.field1164 && var37.field1157 == var37.field1162 && var37.field1166 == var37.field1163) {
										var37.remove();
									}
								}
							}
						}

						class317.method6035();
						++packetWriter.field1399;
						if (packetWriter.field1399 > 750) {
							Messages.method2849();
							return;
						}

						var1 = Players.Players_count;
						int[] var32 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var23 = players[var32[var3]];
							if (var23 != null) {
								ParamComposition.updateActorSequence(var23, 1);
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) {
							var15 = npcIndices[var1];
							NPC var24 = npcs[var15];
							if (var24 != null) {
								ParamComposition.updateActorSequence(var24, var24.definition.size);
							}
						}

						int[] var38 = Players.Players_indices;

						for (var15 = 0; var15 < Players.Players_count; ++var15) {
							Player var44 = players[var38[var15]];
							if (var44 != null && var44.overheadTextCyclesRemaining > 0) {
								--var44.overheadTextCyclesRemaining;
								if (var44.overheadTextCyclesRemaining == 0) {
									var44.overheadText = null;
								}
							}
						}

						for (var15 = 0; var15 < npcCount; ++var15) {
							var3 = npcIndices[var15];
							NPC var41 = npcs[var3];
							if (var41 != null && var41.overheadTextCyclesRemaining > 0) {
								--var41.overheadTextCyclesRemaining;
								if (var41.overheadTextCyclesRemaining == 0) {
									var41.overheadText = null;
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

						Widget var39 = class433.mousedOverWidgetIf1;
						Widget var33 = class209.field2287;
						class433.mousedOverWidgetIf1 = null;
						class209.field2287 = null;
						draggedOnWidget = null;
						field714 = false;
						field739 = false;
						field738 = 0;

						while (field661.method4424() && field738 < 128) {
							if (staffModLevel >= 2 && field661.method4426(82) && field661.field2393 == 66) {
								StringBuilder var42 = new StringBuilder();

								Message var40;
								for (Iterator var25 = Messages.Messages_hashTable.iterator(); var25.hasNext(); var42.append(var40.text).append('\n')) {
									var40 = (Message)var25.next();
									if (var40.sender != null && !var40.sender.isEmpty()) {
										var42.append(var40.sender).append(':');
									}
								}

								String var45 = var42.toString();
								VertexNormal.client.method619(var45);
							} else if (oculusOrbState != 1 || field661.field2402 <= 0) {
								field559[field738] = field661.field2393;
								field617[field738] = field661.field2402;
								++field738;
							}
						}

						if (class36.method733() && field661.method4426(82) && field661.method4426(81) && mouseWheelRotation != 0) {
							var3 = KeyHandler.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != KeyHandler.localPlayer.plane) {
								class4.method17(KeyHandler.localPlayer.pathX[0] + HealthBarDefinition.baseX * 64, KeyHandler.localPlayer.pathY[0] + WorldMapScaleHandler.baseY * 64, var3, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != -1) {
							class28.updateRootInterface(rootInterface, 0, 0, class524.canvasWidth, GameEngine.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var43;
							ScriptEvent var46;
							Widget var48;
							do {
								var46 = (ScriptEvent)scriptEvents2.removeLast();
								if (var46 == null) {
									while (true) {
										do {
											var46 = (ScriptEvent)scriptEvents3.removeLast();
											if (var46 == null) {
												while (true) {
													do {
														var46 = (ScriptEvent)scriptEvents.removeLast();
														if (var46 == null) {
															boolean var35 = false;

															while (true) {
																class225 var47 = (class225)field716.removeLast();
																if (var47 == null) {
																	if (!var35 && MouseHandler.MouseHandler_lastButton == 1) {
																		field608.method4407();
																	}

																	this.menu();
																	if (GrandExchangeOfferUnitPriceComparator.worldMap != null) {
																		GrandExchangeOfferUnitPriceComparator.worldMap.method9017(SecureUrlRequester.Client_plane, HealthBarDefinition.baseX * 64 + (KeyHandler.localPlayer.x >> 7), WorldMapScaleHandler.baseY * 64 + (KeyHandler.localPlayer.y >> 7), false);
																		GrandExchangeOfferUnitPriceComparator.worldMap.loadCache();
																	}

																	if (clickedWidget != null) {
																		this.method1282();
																	}

																	if (Scene.shouldSendWalk()) {
																		var4 = Scene.Scene_selectedX;
																		var5 = Scene.Scene_selectedY;
																		var18 = class482.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
																		var18.packetBuffer.writeByte(5);
																		var18.packetBuffer.writeShortAddLE(HealthBarDefinition.baseX * 64 + var4);
																		var18.packetBuffer.writeShortAdd(WorldMapScaleHandler.baseY * 64 + var5);
																		var18.packetBuffer.writeByteSub(field661.method4426(82) ? (field661.method4426(81) ? 2 : 1) : 0);
																		packetWriter.addNode(var18);
																		Scene.method5384();
																		mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																		mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																		mouseCrossColor = 1;
																		mouseCrossState = 0;
																		destinationX = var4;
																		destinationY = var5;
																	}

																	if (var39 != class433.mousedOverWidgetIf1) {
																		if (var39 != null) {
																			FaceNormal.invalidateWidget(var39);
																		}

																		if (class433.mousedOverWidgetIf1 != null) {
																			FaceNormal.invalidateWidget(class433.mousedOverWidgetIf1);
																		}
																	}

																	if (var33 != class209.field2287 && field662 == field750) {
																		if (var33 != null) {
																			FaceNormal.invalidateWidget(var33);
																		}

																		if (class209.field2287 != null) {
																			FaceNormal.invalidateWidget(class209.field2287);
																		}
																	}

																	if (class209.field2287 != null) {
																		if (field750 < field662) {
																			++field750;
																			if (field750 == field662) {
																				FaceNormal.invalidateWidget(class209.field2287);
																			}
																		}
																	} else if (field750 > 0) {
																		--field750;
																	}

																	if (oculusOrbState == 0) {
																		var4 = KeyHandler.localPlayer.x;
																		var5 = KeyHandler.localPlayer.y;
																		if (class367.oculusOrbFocalPointX - var4 < -500 || class367.oculusOrbFocalPointX - var4 > 500 || WorldMapCacheName.oculusOrbFocalPointY - var5 < -500 || WorldMapCacheName.oculusOrbFocalPointY - var5 > 500) {
																			class367.oculusOrbFocalPointX = var4;
																			WorldMapCacheName.oculusOrbFocalPointY = var5;
																		}

																		if (var4 != class367.oculusOrbFocalPointX) {
																			class367.oculusOrbFocalPointX += (var4 - class367.oculusOrbFocalPointX) / 16;
																		}

																		if (var5 != WorldMapCacheName.oculusOrbFocalPointY) {
																			WorldMapCacheName.oculusOrbFocalPointY += (var5 - WorldMapCacheName.oculusOrbFocalPointY) / 16;
																		}

																		var6 = class367.oculusOrbFocalPointX >> 7;
																		var7 = WorldMapCacheName.oculusOrbFocalPointY >> 7;
																		var8 = HttpRequestTask.getTileHeight(class367.oculusOrbFocalPointX, WorldMapCacheName.oculusOrbFocalPointY, SecureUrlRequester.Client_plane);
																		var9 = 0;
																		if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
																			for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
																				for (var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
																					var12 = SecureUrlRequester.Client_plane;
																					if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) {
																						++var12;
																					}

																					int var26 = var8 - Tiles.Tiles_heights[var12][var10][var11];
																					if (var26 > var9) {
																						var9 = var26;
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

																		if (var10 > field600) {
																			field600 += (var10 - field600) / 24;
																		} else if (var10 < field600) {
																			field600 += (var10 - field600) / 80;
																		}

																		WorldMapArea.field2516 = HttpRequestTask.getTileHeight(KeyHandler.localPlayer.x, KeyHandler.localPlayer.y, SecureUrlRequester.Client_plane) - camFollowHeight;
																	} else if (oculusOrbState == 1) {
																		World.method1898();
																		short var34 = -1;
																		if (field661.method4426(33)) {
																			var34 = 0;
																		} else if (field661.method4426(49)) {
																			var34 = 1024;
																		}

																		if (field661.method4426(48)) {
																			if (var34 == 0) {
																				var34 = 1792;
																			} else if (var34 == 1024) {
																				var34 = 1280;
																			} else {
																				var34 = 1536;
																			}
																		} else if (field661.method4426(50)) {
																			if (var34 == 0) {
																				var34 = 256;
																			} else if (var34 == 1024) {
																				var34 = 768;
																			} else {
																				var34 = 512;
																			}
																		}

																		byte var36 = 0;
																		if (field661.method4426(35)) {
																			var36 = -1;
																		} else if (field661.method4426(51)) {
																			var36 = 1;
																		}

																		var6 = 0;
																		if (var34 >= 0 || var36 != 0) {
																			var6 = field661.method4426(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
																			var6 *= 16;
																			field510 = var34;
																			field593 = var36;
																		}

																		if (field623 < var6) {
																			field623 += var6 / 8;
																			if (field623 > var6) {
																				field623 = var6;
																			}
																		} else if (field623 > var6) {
																			field623 = field623 * 9 / 10;
																		}

																		if (field623 > 0) {
																			var7 = field623 / 16;
																			if (field510 >= 0) {
																				var4 = field510 - HealthBarUpdate.cameraYaw & 2047;
																				var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																				var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																				class367.oculusOrbFocalPointX += var8 * var7 / 65536;
																				WorldMapCacheName.oculusOrbFocalPointY += var7 * var9 / 65536;
																			}

																			if (field593 != 0) {
																				WorldMapArea.field2516 += var7 * field593;
																				if (WorldMapArea.field2516 > 0) {
																					WorldMapArea.field2516 = 0;
																				}
																			}
																		} else {
																			field510 = -1;
																			field593 = -1;
																		}

																		if (field661.method4426(13)) {
																			UserComparator5.method2963();
																		}
																	}

																	if (MouseHandler.MouseHandler_currentButton == 4 && SoundCache.mouseCam) {
																		var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																		camAngleDX = var4 * 2;
																		mouseCamClickedY = var4 != -1 && var4 != 1 ? (MouseHandler.MouseHandler_y + mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y;
																		var5 = field587 - MouseHandler.MouseHandler_x;
																		camAngleDY = var5 * 2;
																		field587 = var5 != -1 && var5 != 1 ? (field587 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
																	} else {
																		if (field661.method4426(96)) {
																			camAngleDY += (-24 - camAngleDY) / 2;
																		} else if (field661.method4426(97)) {
																			camAngleDY += (24 - camAngleDY) / 2;
																		} else {
																			camAngleDY /= 2;
																		}

																		if (field661.method4426(98)) {
																			camAngleDX += (12 - camAngleDX) / 2;
																		} else if (field661.method4426(99)) {
																			camAngleDX += (-12 - camAngleDX) / 2;
																		} else {
																			camAngleDX /= 2;
																		}

																		mouseCamClickedY = MouseHandler.MouseHandler_y;
																		field587 = MouseHandler.MouseHandler_x;
																	}

																	camAngleY = camAngleDY / 2 + camAngleY & 2047;
																	camAngleX += camAngleDX / 2;
																	if (camAngleX < 128) {
																		camAngleX = 128;
																	}

																	if (camAngleX > 383) {
																		camAngleX = 383;
																	}

																	if (field766) {
																		GameObject.method5901(class518.field5105, Huffman.field3870, class53.field367);
																		class401.method7504(SecureRandomCallable.field1027, WorldMapLabelSize.field2487);
																		if (GameEngine.cameraX == class518.field5105 && Huffman.field3870 == class28.cameraY && GrandExchangeOfferTotalQuantityComparator.cameraZ == class53.field367 && SecureRandomCallable.field1027 == UserComparator3.cameraPitch && HealthBarUpdate.cameraYaw == WorldMapLabelSize.field2487) {
																			field766 = false;
																			isCameraLocked = false;
																			field760 = false;
																			field761 = false;
																			SoundSystem.field314 = 0;
																			ArchiveDiskActionHandler.field4334 = 0;
																			ClanChannel.field1766 = 0;
																			class195.field2045 = 0;
																			class439.field4690 = 0;
																			class380.field4416 = 0;
																			HealthBarDefinition.field1890 = 0;
																			HttpMethod.field29 = 0;
																			class172.field1817 = 0;
																			HealthBar.field1296 = 0;
																			field763 = null;
																			field765 = null;
																			field500 = null;
																		}
																	} else if (isCameraLocked) {
																		class412.method7749();
																	}

																	for (var4 = 0; var4 < 5; ++var4) {
																		int var10002 = field775[var4]++;
																	}

																	ClientPreferences.varcs.tryWrite();
																	var4 = ParamComposition.method3877();
																	var5 = class171.method3569();
																	if (var4 > 15000 && var5 > 15000) {
																		logoutTimer = 250;
																		MouseHandler.MouseHandler_idleCycles = 14500;
																		var18 = class482.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
																		packetWriter.addNode(var18);
																	}

																	class332.friendSystem.processFriendUpdates();

																	for (var6 = 0; var6 < field786.size(); ++var6) {
																		if (RouteStrategy.method4508((Integer)field786.get(var6)) != 2) {
																			field786.remove(var6);
																			--var6;
																		}
																	}

																	++packetWriter.pendingWrites;
																	if (packetWriter.pendingWrites > 50) {
																		var18 = class482.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
																		packetWriter.addNode(var18);
																	}

																	try {
																		packetWriter.flush();
																	} catch (IOException var27) {
																		Messages.method2849();
																	}

																	KitDefinition.method3664().method4286();
																	return;
																}

																if (var47.field2391.type == 12) {
																	var35 = true;
																}

																if (var47 != null && var47.field2391 != null) {
																	if (var47.field2391.childIndex >= 0) {
																		var48 = class380.widgetDefinition.method6348(var47.field2391.parentId);
																		if (var48 == null || var48.children == null || var48.children.length == 0 || var47.field2391.childIndex >= var48.children.length || var47.field2391 != var48.children[var47.field2391.childIndex]) {
																			continue;
																		}
																	}

																	if (var47.field2391.type == 11 && var47.field2388 == 0) {
																		if (var47.field2391.method6824(var47.field2389, var47.field2390, 0, 0)) {
																			var47.field2391.method6718().method4142().method4280(1, var47.field2391.method6718().method4154());
																			switch(var47.field2391.method6714()) {
																			case 0:
																				class217.openURL(var47.field2391.method6688(), true, false);
																				break;
																			case 1:
																				if (ModeWhere.method7296(class405.getWidgetFlags(var47.field2391))) {
																					int[] var50 = var47.field2391.method6717();
																					if (var50 != null) {
																						var18 = class482.getPacketBufferNode(ClientPacket.field3167, packetWriter.isaacCipher);
																						var18.packetBuffer.writeIntIME(var47.field2391.id);
																						var18.packetBuffer.writeIntME(var50[1]);
																						var18.packetBuffer.writeIntIME(var47.field2391.method6715());
																						var18.packetBuffer.writeIntME(var50[2]);
																						var18.packetBuffer.writeShortAdd(var47.field2391.childIndex);
																						var18.packetBuffer.writeInt(var50[0]);
																						packetWriter.addNode(var18);
																					}
																				}
																			}
																		}
																	} else if (var47.field2391.type == 12) {
																		class344 var49 = var47.field2391.method6700();
																		if (var49 != null && var49.method6672()) {
																			switch(var47.field2388) {
																			case 0:
																				field608.method4391(var47.field2391);
																				var49.method6475(true);
																				var49.method6465(var47.field2389, var47.field2390, field661.method4426(82), field661.method4426(81));
																				break;
																			case 1:
																				var49.method6518(var47.field2389, var47.field2390);
																			}
																		}
																	}
																}
															}
														}

														var43 = var46.widget;
														if (var43.childIndex < 0) {
															break;
														}

														var48 = class380.widgetDefinition.method6348(var43.parentId);
													} while(var48 == null || var48.children == null || var43.childIndex >= var48.children.length || var43 != var48.children[var43.childIndex]);

													WorldMapSectionType.runScriptEvent(var46);
												}
											}

											var43 = var46.widget;
											if (var43.childIndex < 0) {
												break;
											}

											var48 = class380.widgetDefinition.method6348(var43.parentId);
										} while(var48 == null || var48.children == null || var43.childIndex >= var48.children.length || var43 != var48.children[var43.childIndex]);

										WorldMapSectionType.runScriptEvent(var46);
									}
								}

								var43 = var46.widget;
								if (var43.childIndex < 0) {
									break;
								}

								var48 = class380.widgetDefinition.method6348(var43.parentId);
							} while(var48 == null || var48.children == null || var43.childIndex >= var48.children.length || var43 != var48.children[var43.childIndex]);

							WorldMapSectionType.runScriptEvent(var46);
						}
					}

					var30 = class482.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
					var30.packetBuffer.writeByte(0);
					var3 = var30.packetBuffer.offset;
					MusicPatchNode.performReflectionCheck(var30.packetBuffer);
					var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
					packetWriter.addNode(var30);
				}
			}
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "25935"
	)
	public void vmethod6254(int var1, int var2) {
		if (packetWriter != null && packetWriter.isaacCipher != null) {
			if (var1 > -1 && class93.clientPreferences.getMusicVolume() > 0 && !playingJingle) {
				PacketBufferNode var3 = class482.getPacketBufferNode(ClientPacket.field3252, packetWriter.isaacCipher);
				var3.packetBuffer.writeInt(var1);
				packetWriter.addNode(var3);
			}

		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-10443562"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class524.canvasWidth;
		int var2 = GameEngine.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class93.clientPreferences != null) {
			try {
				Client var3 = VertexNormal.client;
				Object[] var4 = new Object[]{ClanChannelMember.getWindowedMode()};
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			class401.method7505(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (validRootWidgets[var1]) {
				field663[var1] = true;
			}

			field729[var1] = validRootWidgets[var1];
			validRootWidgets[var1] = false;
		}

		field607 = cycle;
		viewportX = -1;
		viewportY = -1;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			TextureProvider.drawWidgets(rootInterface, 0, 0, class524.canvasWidth, GameEngine.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				Players.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				Players.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != -1) {
				class149.method3291(viewportX, viewportY);
			}
		} else {
			var1 = class209.menuX;
			int var2 = MouseRecorder.menuY;
			int var3 = MusicPatchPcmStream.menuWidth;
			int var4 = class60.menuHeight;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			class90.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			int var6 = MouseHandler.MouseHandler_x;
			int var7 = MouseHandler.MouseHandler_y;

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) {
				int var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31;
				int var10 = 16777215;
				if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
					var10 = 16776960;
				}

				Font var11 = class90.fontBold12;
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

			AbstractWorldMapIcon.method5085(class209.menuX, MouseRecorder.menuY, MusicPatchPcmStream.menuWidth, class60.menuHeight);
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field729[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field663[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		KitDefinition.method3668(SecureUrlRequester.Client_plane, KeyHandler.localPlayer.x, KeyHandler.localPlayer.y, graphicsCycle);
		graphicsCycle = 0;
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Led;IB)Z",
		garbageValue = "16"
	)
	boolean method1608(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			ClientPreferences.friendsChat = null;
		} else {
			if (ClientPreferences.friendsChat == null) {
				ClientPreferences.friendsChat = new FriendsChat(UserComparator10.loginType, VertexNormal.client);
			}

			ClientPreferences.friendsChat.method8193(var1.packetBuffer, var2);
		}

		field705 = cycleCntr;
		VarpDefinition.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(Led;I)Z",
		garbageValue = "-1706548822"
	)
	boolean method1779(PacketWriter var1) {
		if (ClientPreferences.friendsChat != null) {
			ClientPreferences.friendsChat.method8194(var1.packetBuffer);
		}

		field705 = cycleCntr;
		VarpDefinition.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Led;I)Z",
		garbageValue = "1739108326"
	)
	@Export("method1434")
	final boolean method1434(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket();
		PacketBuffer var3 = var1.packetBuffer;
		if (var2 == null) {
			return false;
		} else {
			int var6;
			String var21;
			try {
				int var5;
				if (var1.serverPacket == null) {
					if (var1.field1408) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1399 = 0;
						var1.field1408 = false;
					}

					var3.offset = 0;
					if (var3.method9326()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1399 = 0;
					}

					var1.field1408 = true;
					ServerPacket[] var4 = class143.ServerPacket_values();
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
				var1.field1399 = 0;
				timer.method8044();
				var1.field1407 = var1.field1411;
				var1.field1411 = var1.field1402;
				var1.field1402 = var1.serverPacket;
				int var7;
				Widget var8;
				int var20;
				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readInt();
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedShortAddLE();
					var8 = class380.widgetDefinition.method6348(var5);
					if (var6 != var8.modelAngleX || var7 != var8.modelAngleY || var20 != var8.modelZoom) {
						var8.modelAngleX = var6;
						var8.modelAngleY = var7;
						var8.modelZoom = var20;
						FaceNormal.invalidateWidget(var8);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var7 = var3.readUnsignedByteAdd();
					var20 = var3.readUnsignedShortLE();
					Player var58;
					if (var20 == localPlayerIndex) {
						var58 = KeyHandler.localPlayer;
					} else {
						var58 = players[var20];
					}

					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedIntME();
					if (var58 != null) {
						var58.updateSpotAnimation(var7, var5, var6 >> 16, var6 & 65535);
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

					field590 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3298 == var1.serverPacket) {
					class235.field2478 = var3.readUnsignedByte();
					NpcOverrides.field1944 = var3.readUnsignedByteAdd();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					class72.method2149(var20);
					changedItemContainers[++field777 - 1 & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}

				String var77;
				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var54 = new byte[var1.serverPacketLength];
					var3.method9357(var54, 0, var54.length);
					Buffer var87 = new Buffer(var54);
					var77 = var87.readStringCp1252NullTerminated();
					class217.openURL(var77, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3409 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field767[var20] = true;
					field722[var20] = var5;
					field769[var20] = var6;
					field788[var20] = var7;
					field775[var20] = 0;
					var1.serverPacket = null;
					return true;
				}

				Widget var73;
				if (ServerPacket.field3289 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readInt();
					var73 = class380.widgetDefinition.method6348(var20);
					PendingSpawn.method2448(var73, var5);
					FaceNormal.invalidateWidget(var73);
					var1.serverPacket = null;
					return true;
				}

				int var9;
				int var10;
				int var11;
				int var23;
				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var6 = var3.method9310();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var23 = var5 + (var6 & 7);
					var11 = var3.readUnsignedShortAdd();
					var10 = var3.readUnsignedByteSub();
					var9 = var3.readUnsignedShort();
					if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104) {
						var7 = var7 * 128 + 64;
						var23 = var23 * 128 + 64;
						GraphicsObject var62 = new GraphicsObject(var9, SecureUrlRequester.Client_plane, var7, var23, HttpRequestTask.getTileHeight(var7, var23, SecureUrlRequester.Client_plane) - var10, var11, cycle);
						graphicsObjects.addFirst(var62);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					class467.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					World.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field766 = false;
					field761 = true;
					var20 = var3.readShort();
					var5 = var3.readShort();
					var6 = class518.method9254(var5 + UserComparator3.cameraPitch & 2027);
					var7 = var20 + HealthBarUpdate.cameraYaw;
					var23 = var3.readUnsignedShort();
					var9 = var3.readUnsignedByte();
					field765 = new class494(UserComparator3.cameraPitch, var6, var23, var9);
					field500 = new class494(HealthBarUpdate.cameraYaw, var7, var23, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3399 == var1.serverPacket) {
					ClientPacket.method5980();
					var20 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByteNeg();
					var7 = var3.readUnsignedIntIME();
					experience[var5] = var7;
					currentLevels[var5] = var20;
					levels[var5] = 1;
					field644[var5] = var6;

					for (var23 = 0; var23 < 98; ++var23) {
						if (var7 >= Skills.Skills_experienceTable[var23]) {
							levels[var5] = var23 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				byte var90;
				if (ServerPacket.field3335 == var1.serverPacket) {
					field707 = cycleCntr;
					var90 = var3.readByte();
					class160 var85 = new class160(var3);
					ClanChannel var89;
					if (var90 >= 0) {
						var89 = currentClanChannels[var90];
					} else {
						var89 = UserComparator4.guestClanChannel;
					}

					if (var89 == null) {
						this.method1284(var90);
						var1.serverPacket = null;
						return true;
					}

					if (var85.field1744 > var89.field1764) {
						this.method1284(var90);
						var1.serverPacket = null;
						return true;
					}

					if (var85.field1744 < var89.field1764) {
						var1.serverPacket = null;
						return true;
					}

					var85.method3465(var89);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var84 = (InterfaceParent)interfaceParents.get((long)var20);
					if (var84 != null) {
						class363.closeInterface(var84, true);
					}

					if (meslayerContinueWidget != null) {
						FaceNormal.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3380 == var1.serverPacket) {
					field707 = cycleCntr;
					var90 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var90 >= 0) {
							currentClanChannels[var90] = null;
						} else {
							UserComparator4.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var90 >= 0) {
						currentClanChannels[var90] = new ClanChannel(var3);
					} else {
						UserComparator4.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3343 == var1.serverPacket) {
					isCameraLocked = true;
					field766 = false;
					field760 = true;
					HttpMethod.field29 = var3.readUnsignedByte() * 16384;
					class172.field1817 = var3.readUnsignedByte() * 128;
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					field762 = var3.readBoolean();
					var6 = var3.readUnsignedByte();
					var7 = HttpMethod.field29 * 128 + 64;
					var23 = class172.field1817 * 16384 + 64;
					boolean var70 = false;
					boolean var65 = false;
					if (field762) {
						var9 = class28.cameraY;
						var10 = HttpRequestTask.getTileHeight(var7, var23, SecureUrlRequester.Client_plane) - var20;
					} else {
						var9 = HttpRequestTask.getTileHeight(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, SecureUrlRequester.Client_plane) - class28.cameraY;
						var10 = var20;
					}

					field763 = new class493(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, var9, var7, var23, var10, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				Widget var86;
				if (ServerPacket.field3285 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShort();
					var86 = class380.widgetDefinition.method6348(var20);
					var86.field3758 = var5 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					var73 = class380.widgetDefinition.method6348(var20);
					if (var73.modelType != 2 || var5 != var73.modelId) {
						var73.modelType = 2;
						var73.modelId = var5;
						FaceNormal.invalidateWidget(var73);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					byte var78 = var3.readByteSub();
					Varps.Varps_temp[var20] = var78;
					if (Varps.Varps_main[var20] != var78) {
						Varps.Varps_main[var20] = var78;
					}

					class136.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					field766 = false;
					isCameraLocked = false;
					field760 = false;
					field761 = false;
					SoundSystem.field314 = 0;
					ArchiveDiskActionHandler.field4334 = 0;
					ClanChannel.field1766 = 0;
					field762 = false;
					class195.field2045 = 0;
					class439.field4690 = 0;
					class380.field4416 = 0;
					HealthBarDefinition.field1890 = 0;
					HttpMethod.field29 = 0;
					class172.field1817 = 0;
					HealthBar.field1296 = 0;
					field763 = null;
					field765 = null;
					field500 = null;

					for (var20 = 0; var20 < 5; ++var20) {
						field767[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3356 == var1.serverPacket) {
					class407.field4517 = new class470(class176.Widget_cachedFonts);
					var1.serverPacket = null;
					return true;
				}

				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				Projectile var19;
				int var25;
				byte var59;
				byte var60;
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					var14 = var3.readUnsignedByteNeg() * 4;
					var60 = var3.readByteSub();
					var13 = var3.readUnsignedByteAdd() * 4;
					var6 = var3.method9310();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var23 = var5 + (var6 & 7);
					var15 = var3.readUnsignedShortAdd();
					var25 = var3.readUnsignedShortLE();
					var17 = var3.readUnsignedByteNeg();
					var18 = var3.readUnsignedByte();
					var59 = var3.readByteNeg();
					var11 = var3.method9435();
					var16 = var3.readUnsignedShort();
					var9 = var60 + var7;
					var10 = var59 + var23;
					if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var25 != 65535) {
						var7 = var7 * 128 + 64;
						var23 = var23 * 128 + 64;
						var9 = var9 * 128 + 64;
						var10 = var10 * 128 + 64;
						var19 = new Projectile(var25, SecureUrlRequester.Client_plane, var7, var23, HttpRequestTask.getTileHeight(var7, var23, SecureUrlRequester.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14);
						var19.setDestination(var9, var10, HttpRequestTask.getTileHeight(var9, var10, SecureUrlRequester.Client_plane) - var14, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3365 == var1.serverPacket) {
					Messages.method2850();
					var90 = var3.readByte();
					class146 var82 = new class146(var3);
					ClanSettings var88;
					if (var90 >= 0) {
						var88 = currentClanSettings[var90];
					} else {
						var88 = SecureUrlRequester.guestClanSettings;
					}

					if (var88 == null) {
						this.method1285(var90);
						var1.serverPacket = null;
						return true;
					}

					if (var82.field1645 > var88.field1716) {
						this.method1285(var90);
						var1.serverPacket = null;
						return true;
					}

					if (var82.field1645 < var88.field1716) {
						var1.serverPacket = null;
						return true;
					}

					var82.method3253(var88);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var6 = var3.method9310();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var23 = var5 + (var6 & 7);
					var9 = var3.readUnsignedByte();
					var10 = var9 >> 2;
					var11 = var9 & 3;
					var25 = field574[var10];
					var13 = var3.readUnsignedShortAdd();
					if (var7 >= 0 && var23 >= 0 && var7 < 103 && var23 < 103) {
						class167.method3538(SecureUrlRequester.Client_plane, var7, var23, var10, var11, var25, var13);
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
						var73 = class380.widgetDefinition.method6348(var20);
					} else {
						var73 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class281.itemContainerSetItem(var5, var7, var23 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var23 = var3.readUnsignedShort();
						var9 = 0;
						if (var23 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (var73 != null && var7 >= 0 && var7 < var73.itemIds.length) {
							var73.itemIds[var7] = var23;
							var73.itemQuantities[var7] = var9;
						}
					}

					if (var73 != null) {
						FaceNormal.invalidateWidget(var73);
					}

					ClientPacket.method5980();
					changedItemContainers[++field777 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3331 == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShort();
					var73 = class380.widgetDefinition.method6348(var20);
					if (var73.modelType != 6 || var5 != var73.modelId) {
						var73.modelType = 6;
						var73.modelId = var5;
						FaceNormal.invalidateWidget(var73);
					}

					var1.serverPacket = null;
					return true;
				}

				class309 var80;
				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					class235.field2478 = var3.readUnsignedByteAdd();
					NpcOverrides.field1944 = var3.readUnsignedByteNeg();

					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						var80 = ArchiveDisk.method8476()[var20];
						BoundaryObject.method5888(var80);
					}

					var1.serverPacket = null;
					return true;
				}

				long var26;
				long var28;
				long var30;
				String var32;
				boolean var63;
				if (ServerPacket.field3383 == var1.serverPacket) {
					var90 = var3.readByte();
					var26 = (long)var3.readUnsignedShort();
					var28 = (long)var3.readMedium();
					var30 = var28 + (var26 << 32);
					var63 = false;
					ClanChannel var12 = var90 >= 0 ? currentClanChannels[var90] : UserComparator4.guestClanChannel;
					if (var12 == null) {
						var63 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (var30 == crossWorldMessageIds[var13]) {
								var63 = true;
								break;
							}
						}
					}

					if (!var63) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var30;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var32 = Huffman.method6899(var3);
						var14 = var90 >= 0 ? 43 : 46;
						ItemContainer.addChatMessage(var14, "", var32, var12.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					ClientPacket.method5980();
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readInt();
					var6 = var3.readUnsignedByteSub();
					experience[var6] = var5;
					currentLevels[var6] = var20;
					levels[var6] = 1;
					field644[var6] = var20;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var5 >= Skills.Skills_experienceTable[var7]) {
							levels[var6] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var6;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					class401.privateChatMode = GrandExchangeOfferAgeComparator.method7184(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3341 == var1.serverPacket) {
					BoundaryObject.method5888(class309.field3268);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					var6 = var5 >> 10 & 31;
					var7 = var5 >> 5 & 31;
					var23 = var5 & 31;
					var9 = (var7 << 11) + (var6 << 19) + (var23 << 3);
					Widget var93 = class380.widgetDefinition.method6348(var20);
					if (var9 != var93.color) {
						var93.color = var9;
						FaceNormal.invalidateWidget(var93);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3295 == var1.serverPacket) {
					class235.field2478 = var3.readUnsignedByteAdd();
					field652 = var3.readUnsignedByte();
					NpcOverrides.field1944 = var3.readUnsignedByteNeg();

					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						var80 = ArchiveDisk.method8476()[var20];
						BoundaryObject.method5888(var80);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							class136.changeGameOptions(var20);
							changedVarps[++changedVarpCount - 1 & 31] = var20;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3327 == var1.serverPacket) {
					return this.method1608(var1, 1);
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByte();
					tradeChatMode = var3.readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}

				boolean var71;
				if (ServerPacket.field3318 == var1.serverPacket) {
					var71 = var3.readUnsignedByteAdd() == 1;
					var5 = var3.readInt();
					var73 = class380.widgetDefinition.method6348(var5);
					NPC.method2717(var73, KeyHandler.localPlayer.appearance, var71);
					FaceNormal.invalidateWidget(var73);
					var1.serverPacket = null;
					return true;
				}

				String var41;
				if (ServerPacket.field3346 == var1.serverPacket) {
					var90 = var3.readByte();
					var21 = var3.readStringCp1252NullTerminated();
					long var34 = (long)var3.readUnsignedShort();
					long var36 = (long)var3.readMedium();
					PlayerType var92 = (PlayerType)GrandExchangeEvents.findEnumerated(class184.PlayerType_values(), var3.readUnsignedByte());
					long var38 = var36 + (var34 << 32);
					boolean var66 = false;
					ClanChannel var40 = null;
					var40 = var90 >= 0 ? currentClanChannels[var90] : UserComparator4.guestClanChannel;
					if (var40 == null) {
						var66 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var92.isUser && class332.friendSystem.isIgnored(new Username(var21, UserComparator10.loginType))) {
									var66 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var38) {
								var66 = true;
								break;
							}

							++var15;
						}
					}

					if (!var66) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var38;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var41 = AbstractFont.escapeBrackets(Huffman.method6899(var3));
						var16 = var90 >= 0 ? 41 : 44;
						if (var92.modIcon != -1) {
							ItemContainer.addChatMessage(var16, class228.method4503(var92.modIcon) + var21, var41, var40.name);
						} else {
							ItemContainer.addChatMessage(var16, var21, var41, var40.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3304 == var1.serverPacket) {
					BoundaryObject.method5888(class309.field3267);
					var1.serverPacket = null;
					return true;
				}

				String var50;
				if (ServerPacket.field3354 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var5 = var3.readInt();
					var73 = class380.widgetDefinition.method6348(var5);
					if (!var50.equals(var73.text)) {
						var73.text = var50;
						FaceNormal.invalidateWidget(var73);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedIntLE();
					var73 = class380.widgetDefinition.method6348(var5);
					if (var73.modelType != 1 || var20 != var73.modelId) {
						var73.modelType = 1;
						var73.modelId = var20;
						FaceNormal.invalidateWidget(var73);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var21 = AbstractFont.escapeBrackets(class167.method3535(Huffman.method6899(var3)));
					GrandExchangeEvents.addGameMessage(6, var50, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3338 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					RouteStrategy.method4506(var20);
					var1.serverPacket = null;
					return true;
				}

				boolean var83;
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var26 = (long)var3.readUnsignedShort();
					var28 = (long)var3.readMedium();
					PlayerType var94 = (PlayerType)GrandExchangeEvents.findEnumerated(class184.PlayerType_values(), var3.readUnsignedByte());
					long var43 = var28 + (var26 << 32);
					var83 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (crossWorldMessageIds[var13] == var43) {
							var83 = true;
							break;
						}
					}

					if (class332.friendSystem.isIgnored(new Username(var50, UserComparator10.loginType))) {
						var83 = true;
					}

					if (!var83 && field621 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var43;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var32 = AbstractFont.escapeBrackets(class167.method3535(Huffman.method6899(var3)));
						byte var68;
						if (var94.isPrivileged) {
							var68 = 7;
						} else {
							var68 = 3;
						}

						if (var94.modIcon != -1) {
							GrandExchangeEvents.addGameMessage(var68, class228.method4503(var94.modIcon) + var50, var32);
						} else {
							GrandExchangeEvents.addGameMessage(var68, var50, var32);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var20 = var3.readShort();
					var5 = var3.readUnsignedIntME();
					var6 = var3.method9432();
					var86 = class380.widgetDefinition.method6348(var5);
					if (var6 != var86.rawX || var20 != var86.rawY || var86.xAlignment != 0 || var86.yAlignment != 0) {
						var86.rawX = var6;
						var86.rawY = var20;
						var86.xAlignment = 0;
						var86.yAlignment = 0;
						FaceNormal.invalidateWidget(var86);
						this.alignWidget(var86);
						if (var86.type == 0) {
							RestClientThreadFactory.revalidateWidgetScroll(class380.widgetDefinition.Widget_interfaceComponents[var5 >> 16], var86, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3326 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class365.queueSoundEffect(var20, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					if (var20 == 65535) {
						var20 = -1;
					}

					Coord.playSong(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3371 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.method9310();
					class405.method7552(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3377 == var1.serverPacket && isCameraLocked) {
					field766 = true;
					field761 = false;
					field760 = false;

					for (var20 = 0; var20 < 5; ++var20) {
						field767[var20] = false;
					}

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

				if (ServerPacket.field3345 == var1.serverPacket) {
					var20 = var3.readUnsignedByteNeg();
					var5 = var3.readUnsignedByteSub();
					var6 = var3.readUnsignedIntIME();
					var86 = class380.widgetDefinition.method6348(var6);
					class128.method3070(var86, var5, var20);
					FaceNormal.invalidateWidget(var86);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					class332.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field704 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						Varcs.method2826(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				NPC var57;
				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var5 = var3.readInt();
					var20 = var3.readUnsignedShortAdd();
					var57 = npcs[var20];
					var6 = var3.readUnsignedShortAddLE();
					var7 = var3.readUnsignedByte();
					if (var57 != null) {
						var57.updateSpotAnimation(var7, var6, var5 >> 16, var5 & 65535);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3310 == var1.serverPacket) {
					BoundaryObject.method5888(class309.field3274);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field766 = false;
					field761 = false;
					SoundSystem.field314 = var3.readUnsignedByte() * 128;
					ArchiveDiskActionHandler.field4334 = var3.readUnsignedByte() * 16384;
					ClanChannel.field1766 = var3.readUnsignedShort();
					class195.field2045 = var3.readUnsignedByte();
					class439.field4690 = var3.readUnsignedByte();
					if (class439.field4690 >= 100) {
						var20 = SoundSystem.field314 * 16384 + 64;
						var5 = ArchiveDiskActionHandler.field4334 * 128 + 64;
						var6 = HttpRequestTask.getTileHeight(var20, var5, SecureUrlRequester.Client_plane) - ClanChannel.field1766;
						var7 = var20 - GameEngine.cameraX;
						var23 = var6 - class28.cameraY;
						var9 = var5 - GrandExchangeOfferTotalQuantityComparator.cameraZ;
						var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
						UserComparator3.cameraPitch = (int)(Math.atan2((double)var23, (double)var10) * 325.9490051269531D) & 2047;
						HealthBarUpdate.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047;
						if (UserComparator3.cameraPitch < 128) {
							UserComparator3.cameraPitch = 128;
						}

						if (UserComparator3.cameraPitch > 383) {
							UserComparator3.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3402 == var1.serverPacket) {
					BoundaryObject.method5888(class309.field3270);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3319 == var1.serverPacket) {
					ClientPacket.method5980();
					runEnergy = var3.readUnsignedShort();
					field592 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3321 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedByteNeg();
					if (var20 == 65535) {
						var20 = -1;
					}

					class358.performPlayerAnimation(KeyHandler.localPlayer, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3299 == var1.serverPacket) {
					return this.method1779(var1);
				}

				if (ServerPacket.field3316 == var1.serverPacket) {
					Coord.method6339(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					class189.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3334 == var1.serverPacket) {
					BoundaryObject.method5888(class309.field3266);
					var1.serverPacket = null;
					return true;
				}

				long var46;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var26 = var3.readLong();
					var28 = (long)var3.readUnsignedShort();
					var30 = (long)var3.readMedium();
					PlayerType var95 = (PlayerType)GrandExchangeEvents.findEnumerated(class184.PlayerType_values(), var3.readUnsignedByte());
					var46 = var30 + (var28 << 32);
					boolean var67 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var46) {
							var67 = true;
							break;
						}
					}

					if (var95.isUser && class332.friendSystem.isIgnored(new Username(var50, UserComparator10.loginType))) {
						var67 = true;
					}

					if (!var67 && field621 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var46;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var41 = AbstractFont.escapeBrackets(class167.method3535(Huffman.method6899(var3)));
						if (var95.modIcon != -1) {
							ItemContainer.addChatMessage(9, class228.method4503(var95.modIcon) + var50, var41, HttpRequestTask.base37DecodeLong(var26));
						} else {
							ItemContainer.addChatMessage(9, var50, var41, HttpRequestTask.base37DecodeLong(var26));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3348 == var1.serverPacket) {
					BoundaryObject.method5888(class309.field3264);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3396 == var1.serverPacket) {
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShortLE();
					var9 = var3.readUnsignedShortAdd();
					var23 = var3.readUnsignedShortAddLE();
					var7 = var3.readUnsignedShortLE();
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					ArrayList var91 = new ArrayList();
					var91.add(var20);
					var91.add(var5);
					Skills.method6928(var91, var6, var7, var23, var9);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3375 == var1.serverPacket) {
					isCameraLocked = true;
					field766 = false;
					field761 = true;
					var20 = class36.method729(var3.readShort() & 2027);
					var5 = class518.method9254(var3.readShort() & 2027);
					var6 = var3.readUnsignedShort();
					var7 = var3.readUnsignedByte();
					field765 = new class494(UserComparator3.cameraPitch, var5, var6, var7);
					field500 = new class494(HealthBarUpdate.cameraYaw, var20, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3303 == var1.serverPacket) {
					var7 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortAddLE();
					var20 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedShort();
					FriendSystem.method1927(var20, var5, var6, var7);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					class353.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3323 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					short var69 = (short)var3.readShort();
					var6 = var3.readUnsignedByteSub();
					var7 = var3.readInt();
					var57 = npcs[var20];
					if (var57 != null) {
						var57.method2692(var6, var7, var69);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					class195.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3344 == var1.serverPacket) {
					class407.field4517 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortLE();
					Varps.Varps_temp[var5] = var20;
					if (Varps.Varps_main[var5] != var20) {
						Varps.Varps_main[var5] = var20;
					}

					class136.changeGameOptions(var5);
					changedVarps[++changedVarpCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				Widget var74;
				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var20 = var3.readInt();
					var74 = class380.widgetDefinition.method6348(var20);

					for (var6 = 0; var6 < var74.itemIds.length; ++var6) {
						var74.itemIds[var6] = -1;
						var74.itemIds[var6] = 0;
					}

					FaceNormal.invalidateWidget(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3363 == var1.serverPacket) {
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedIntLE();
					var73 = class380.widgetDefinition.method6348(var5);
					MidiPcmStream.method6132(var73, KeyHandler.localPlayer.appearance.gender, var20);
					FaceNormal.invalidateWidget(var73);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3381 == var1.serverPacket) {
					BoundaryObject.method5888(class309.field3271);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3394 == var1.serverPacket) {
					isCameraLocked = true;
					field766 = false;
					field760 = true;
					HttpMethod.field29 = var3.readUnsignedByte() * 16384;
					class172.field1817 = var3.readUnsignedByte() * 128;
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte() * 128 + 64;
					var6 = var3.readUnsignedByte() * 128 + 64;
					var7 = var3.readUnsignedShort();
					field762 = var3.readBoolean();
					var23 = var3.readUnsignedByte();
					var9 = HttpMethod.field29 * 128 + 64;
					var10 = class172.field1817 * 16384 + 64;
					var63 = false;
					var83 = false;
					if (field762) {
						var11 = class28.cameraY;
						var25 = HttpRequestTask.getTileHeight(var9, var10, SecureUrlRequester.Client_plane) - var20;
					} else {
						var11 = HttpRequestTask.getTileHeight(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, SecureUrlRequester.Client_plane) - class28.cameraY;
						var25 = var20;
					}

					field763 = new class492(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, var11, var9, var10, var25, var5, var6, var7, var23);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3411 == var1.serverPacket) {
					isCameraLocked = true;
					field766 = false;
					field761 = true;
					SoundSystem.field314 = var3.readUnsignedByte() * 128;
					ArchiveDiskActionHandler.field4334 = var3.readUnsignedByte() * 16384;
					ClanChannel.field1766 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = SoundSystem.field314 * 16384 + 64;
					var7 = ArchiveDiskActionHandler.field4334 * 128 + 64;
					var23 = HttpRequestTask.getTileHeight(var6, var7, SecureUrlRequester.Client_plane) - ClanChannel.field1766;
					var9 = var6 - GameEngine.cameraX;
					var10 = var23 - class28.cameraY;
					var11 = var7 - GrandExchangeOfferTotalQuantityComparator.cameraZ;
					double var96 = Math.sqrt((double)(var9 * var9 + var11 * var11));
					var14 = class518.method9254((int)(Math.atan2((double)var10, var96) * 325.9490051269531D) & 2047);
					var15 = class36.method729((int)(Math.atan2((double)var9, (double)var11) * -325.9490051269531D) & 2047);
					field765 = new class494(UserComparator3.cameraPitch, var14, var20, var5);
					field500 = new class494(HealthBarUpdate.cameraYaw, var15, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var71 = var3.readUnsignedByte() == 1;
					var5 = var3.readUnsignedIntLE();
					var73 = class380.widgetDefinition.method6348(var5);
					if (var71 != var73.isHidden) {
						var73.isHidden = var71;
						FaceNormal.invalidateWidget(var73);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3397 == var1.serverPacket) {
					Messages.method2850();
					var90 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var90 >= 0) {
							currentClanSettings[var90] = null;
						} else {
							SecureUrlRequester.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var90 >= 0) {
						currentClanSettings[var90] = new ClanSettings(var3);
					} else {
						SecureUrlRequester.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntME();
					var73 = class380.widgetDefinition.method6348(var5);
					if (var73 != null && var73.type == 0) {
						if (var20 > var73.scrollHeight - var73.height) {
							var20 = var73.scrollHeight - var73.height;
						}

						if (var20 < 0) {
							var20 = 0;
						}

						if (var20 != var73.scrollY) {
							var73.scrollY = var20;
							FaceNormal.invalidateWidget(var73);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3370 == var1.serverPacket) {
					var20 = var3.readShort();
					var5 = var3.readInt();
					var73 = class380.widgetDefinition.method6348(var5);
					if (var20 != var73.sequenceId || var20 == -1) {
						var73.sequenceId = var20;
						var73.modelFrame = 0;
						var73.modelFrameCycle = 0;
						FaceNormal.invalidateWidget(var73);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					boolean var64 = var3.readUnsignedByte() == 1;
					var77 = "";
					boolean var61 = false;
					if (var64) {
						var77 = var3.readStringCp1252NullTerminated();
						if (class332.friendSystem.isIgnored(new Username(var77, UserComparator10.loginType))) {
							var61 = true;
						}
					}

					String var56 = var3.readStringCp1252NullTerminated();
					if (!var61) {
						GrandExchangeEvents.addGameMessage(var20, var77, var56);
					}

					var1.serverPacket = null;
					return true;
				}

				PendingSpawn var52;
				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					NpcOverrides.field1944 = var3.readUnsignedByteAdd();
					class235.field2478 = var3.readUnsignedByteAdd();

					for (var20 = NpcOverrides.field1944; var20 < NpcOverrides.field1944 + 8; ++var20) {
						for (var5 = class235.field2478; var5 < class235.field2478 + 8; ++var5) {
							if (groundItems[SecureUrlRequester.Client_plane][var20][var5] != null) {
								groundItems[SecureUrlRequester.Client_plane][var20][var5] = null;
								class134.updateItemPile(SecureUrlRequester.Client_plane, var20, var5);
							}
						}
					}

					for (var52 = (PendingSpawn)pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)pendingSpawns.previous()) {
						if (var52.x >= NpcOverrides.field1944 && var52.x < NpcOverrides.field1944 + 8 && var52.y >= class235.field2478 && var52.y < class235.field2478 + 8 && var52.plane == SecureUrlRequester.Client_plane) {
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					class388.updatePlayers(var3, var1.serverPacketLength);
					SceneTilePaint.method5786();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3385 == var1.serverPacket) {
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

				if (ServerPacket.field3357 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShort();
					Actor.method2488(var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3387 == var1.serverPacket) {
					BoundaryObject.method5888(class309.field3269);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3367 == var1.serverPacket) {
					if (class407.field4517 == null) {
						class407.field4517 = new class470(class176.Widget_cachedFonts);
					}

					class539 var53 = class176.Widget_cachedFonts.method8659(var3);
					class407.field4517.field4835.vmethod9116(var53.field5246, var53.field5244);
					field701[++field702 - 1 & 31] = var53.field5246;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3297 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readUnsignedIntME();
					var6 = var3.readUnsignedIntLE();
					var7 = var3.readUnsignedShort();
					if (var7 == 65535) {
						var7 = -1;
					}

					for (var23 = var7; var23 <= var20; ++var23) {
						var30 = ((long)var5 << 32) + (long)var23;
						Node var45 = widgetFlags.get(var30);
						if (var45 != null) {
							var45.remove();
						}

						widgetFlags.put(new IntegerNode(var6), var30);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3302 == var1.serverPacket) {
					field652 = var3.readUnsignedByteAdd();
					NpcOverrides.field1944 = var3.readUnsignedByteAdd();
					class235.field2478 = var3.readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedIntLE();
					var6 = var3.readUnsignedShort();
					if (var6 == 65535) {
						var6 = -1;
					}

					var86 = class380.widgetDefinition.method6348(var20);
					ItemComposition var55;
					if (!var86.isIf3) {
						if (var6 == -1) {
							var86.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var55 = class341.ItemDefinition_get(var6).getCountObj(var5);
						var86.modelType = 4;
						var86.modelId = var6;
						var86.modelAngleX = var55.xan2d;
						var86.modelAngleY = var55.yan2d;
						var86.modelZoom = var55.zoom2d * 100 / var5;
						FaceNormal.invalidateWidget(var86);
					} else {
						var86.itemId = var6;
						var86.itemQuantity = var5;
						var55 = class341.ItemDefinition_get(var6).getCountObj(var5);
						var86.modelAngleX = var55.xan2d;
						var86.modelAngleY = var55.yan2d;
						var86.modelAngleZ = var55.zan2d;
						var86.modelOffsetX = var55.offsetX2d;
						var86.modelOffsetY = var55.offsetY2d;
						var86.modelZoom = var55.zoom2d;
						if (var55.isStackable == 1) {
							var86.itemQuantityMode = 1;
						} else {
							var86.itemQuantityMode = 2;
						}

						if (var86.field3785 > 0) {
							var86.modelZoom = var86.modelZoom * 32 / var86.field3785;
						} else if (var86.rawWidth > 0) {
							var86.modelZoom = var86.modelZoom * 32 / var86.rawWidth;
						}

						FaceNormal.invalidateWidget(var86);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3339 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					rootInterface = var20;
					this.method1280(false);
					BufferedSink.method8450(var20);
					class195.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						validRootWidgets[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var81;
				if (ServerPacket.field3342 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readUnsignedByteNeg();
					var6 = var3.readUnsignedIntME();
					var81 = (InterfaceParent)interfaceParents.get((long)var6);
					if (var81 != null) {
						class363.closeInterface(var81, var20 != var81.group);
					}

					class155.openInterface(var6, var20, var5);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < AbstractByteArrayCopier.field3856; ++var20) {
						VarpDefinition var75 = class128.VarpDefinition_get(var20);
						if (var75 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}

					ClientPacket.method5980();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3311 == var1.serverPacket) {
					isCameraLocked = true;
					field766 = false;
					field760 = false;
					HttpMethod.field29 = var3.readUnsignedByte() * 16384;
					class172.field1817 = var3.readUnsignedByte() * 128;
					HealthBar.field1296 = var3.readUnsignedShort();
					HealthBarDefinition.field1890 = var3.readUnsignedByte();
					class380.field4416 = var3.readUnsignedByte();
					if (class380.field4416 >= 100) {
						GameEngine.cameraX = HttpMethod.field29 * 128 + 64;
						GrandExchangeOfferTotalQuantityComparator.cameraZ = class172.field1817 * 16384 + 64;
						class28.cameraY = HttpRequestTask.getTileHeight(GameEngine.cameraX, GrandExchangeOfferTotalQuantityComparator.cameraZ, SecureUrlRequester.Client_plane) - HealthBar.field1296;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3392 == var1.serverPacket) {
					ClientPacket.method5980();
					weight = var3.readShort();
					field592 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3390 == var1.serverPacket) {
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3312 == var1.serverPacket) {
					var6 = var3.readMedium();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var7 = var20 + (var6 >> 4 & 7);
					var23 = var5 + (var6 & 7);
					var18 = var3.readUnsignedShortLE();
					var11 = var3.method9435();
					var59 = var3.readByteNeg();
					var15 = var3.readUnsignedShortLE();
					var14 = var3.readUnsignedByteNeg() * 4;
					var25 = var3.readUnsignedShort();
					var17 = var3.readUnsignedByteNeg();
					var60 = var3.readByteAdd();
					var16 = var3.readUnsignedShort();
					var13 = var3.readUnsignedByteSub() * 4;
					var9 = var60 + var7;
					var10 = var59 + var23;
					if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var25 != 65535) {
						var7 = var7 * 128 + 64;
						var23 = var23 * 128 + 64;
						var9 = var9 * 128 + 64;
						var10 = var10 * 128 + 64;
						var19 = new Projectile(var25, SecureUrlRequester.Client_plane, var7, var23, HttpRequestTask.getTileHeight(var7, var23, SecureUrlRequester.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14);
						var19.setDestination(var9, var10, HttpRequestTask.getTileHeight(var9, var10, SecureUrlRequester.Client_plane) - var14, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3404 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != revision) {
						revision = var20;
						AbstractSocket.method8405();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3382 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.method1280(false);
						BufferedSink.method8450(rootInterface);
						class195.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							validRootWidgets[var7] = true;
						}
					}

					InterfaceParent var33;
					for (; var6-- > 0; var33.field1053 = true) {
						var7 = var3.readInt();
						var23 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var33 = (InterfaceParent)interfaceParents.get((long)var7);
						if (var33 != null && var23 != var33.group) {
							class363.closeInterface(var33, true);
							var33 = null;
						}

						if (var33 == null) {
							var33 = class155.openInterface(var7, var23, var9);
						}
					}

					for (var81 = (InterfaceParent)interfaceParents.first(); var81 != null; var81 = (InterfaceParent)interfaceParents.next()) {
						if (var81.field1053) {
							var81.field1053 = false;
						} else {
							class363.closeInterface(var81, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var20) {
						var7 = var3.readInt();
						var23 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();

						for (var11 = var23; var11 <= var9; ++var11) {
							var46 = ((long)var7 << 32) + (long)var11;
							widgetFlags.put(new IntegerNode(var10), var46);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var74 = class380.widgetDefinition.method6348(var20);
					var74.modelType = 3;
					var74.modelId = KeyHandler.localPlayer.appearance.getChatHeadId();
					FaceNormal.invalidateWidget(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3332 == var1.serverPacket) {
					return this.method1608(var1, 2);
				}

				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedIntLE();
					InterfaceParent var76 = (InterfaceParent)interfaceParents.get((long)var20);
					var81 = (InterfaceParent)interfaceParents.get((long)var5);
					if (var81 != null) {
						class363.closeInterface(var81, var76 == null || var81.group != var76.group);
					}

					if (var76 != null) {
						var76.remove();
						interfaceParents.put(var76, (long)var5);
					}

					var8 = class380.widgetDefinition.method6348(var20);
					if (var8 != null) {
						FaceNormal.invalidateWidget(var8);
					}

					var8 = class380.widgetDefinition.method6348(var5);
					if (var8 != null) {
						FaceNormal.invalidateWidget(var8);
						RestClientThreadFactory.revalidateWidgetScroll(class380.widgetDefinition.Widget_interfaceComponents[var8.id >>> 16], var8, true);
					}

					if (rootInterface != -1) {
						WorldMapScaleHandler.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAddLE() * 30;
					field592 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3347 == var1.serverPacket) {
					var71 = var3.readUnsignedByte() == 1;
					if (var71) {
						class17.field74 = UserComparator9.method2973() - var3.readLong();
						class380.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class380.grandExchangeEvents = null;
					}

					field709 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var20 = var3.readUnsignedByteSub();
					var21 = var3.readStringCp1252NullTerminated();
					var6 = var3.readUnsignedByte();
					if (var6 >= 1 && var6 <= 8) {
						if (var21.equalsIgnoreCase("null")) {
							var21 = null;
						}

						playerMenuActions[var6 - 1] = var21;
						playerOptionsPriorities[var6 - 1] = var20 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3337 == var1.serverPacket) {
					class235.field2478 = var3.readUnsignedByteNeg();
					field652 = var3.readUnsignedByte();
					NpcOverrides.field1944 = var3.readUnsignedByteSub();

					for (var20 = NpcOverrides.field1944; var20 < NpcOverrides.field1944 + 8; ++var20) {
						for (var5 = class235.field2478; var5 < class235.field2478 + 8; ++var5) {
							if (groundItems[field652][var20][var5] != null) {
								groundItems[field652][var20][var5] = null;
								class134.updateItemPile(field652, var20, var5);
							}
						}
					}

					for (var52 = (PendingSpawn)pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)pendingSpawns.previous()) {
						if (var52.x >= NpcOverrides.field1944 && var52.x < NpcOverrides.field1944 + 8 && var52.y >= class235.field2478 && var52.y < class235.field2478 + 8 && var52.plane == field652) {
							var52.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3389 == var1.serverPacket) {
					var23 = var3.readUnsignedShortLE();
					var6 = var3.readUnsignedShortAddLE();
					var7 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAddLE();
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					ArrayList var42 = new ArrayList();
					var42.add(var20);
					Skills.method6928(var42, var5, var6, var7, var23);
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
						var51.field821 = "beta";
					}

					class131.updateGameState(45);
					var2.close();
					var2 = null;
					class465.changeWorld(var51);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var73 = class380.widgetDefinition.method6348(var20);
					} else {
						var73 = null;
					}

					if (var73 != null) {
						for (var7 = 0; var7 < var73.itemIds.length; ++var7) {
							var73.itemIds[var7] = 0;
							var73.itemQuantities[var7] = 0;
						}
					}

					class127.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var23 = 0; var23 < var7; ++var23) {
						var9 = var3.readUnsignedByteAdd();
						if (var9 == 255) {
							var9 = var3.readUnsignedIntLE();
						}

						var10 = var3.readUnsignedShortAdd();
						if (var73 != null && var23 < var73.itemIds.length) {
							var73.itemIds[var23] = var10;
							var73.itemQuantities[var23] = var9;
						}

						class281.itemContainerSetItem(var5, var23, var10 - 1, var9);
					}

					if (var73 != null) {
						FaceNormal.invalidateWidget(var73);
					}

					ClientPacket.method5980();
					changedItemContainers[++field777 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3328 == var1.serverPacket) {
					class332.friendSystem.method1901();
					field704 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					class353.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3340 == var1.serverPacket) {
					BoundaryObject.method5888(class309.field3273);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3308 == var1.serverPacket) {
					var71 = var3.readBoolean();
					if (var71) {
						if (Varps.field3599 == null) {
							Varps.field3599 = new class385();
						}
					} else {
						Varps.field3599 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						WorldMapScaleHandler.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					class467.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					class332.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					Varps.FriendSystem_invalidateIgnoreds();
					field704 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3291 == var1.serverPacket) {
					BoundaryObject.method5888(class309.field3263);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var6 = KitDefinition.getGcDuration();
					PacketBufferNode var79 = class482.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
					var79.packetBuffer.writeByteNeg(GameEngine.fps);
					var79.packetBuffer.writeByteNeg(var6);
					var79.packetBuffer.writeIntIME(var20);
					var79.packetBuffer.writeIntLE(var5);
					packetWriter.addNode(var79);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					Object[] var72 = new Object[var50.length() + 1];

					for (var6 = var50.length() - 1; var6 >= 0; --var6) {
						if (var50.charAt(var6) == 's') {
							var72[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var72[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var72[0] = new Integer(var3.readInt());
					ScriptEvent var22 = new ScriptEvent();
					var22.args = var72;
					WorldMapSectionType.runScriptEvent(var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var6 = var3.readUnsignedByteAdd();
					var5 = var3.readUnsignedShortAddLE();
					var20 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					NPC var24 = npcs[var20];
					if (var24 != null) {
						if (var5 == var24.sequence && var5 != -1) {
							var23 = HttpMethod.SequenceDefinition_get(var5).restartMode;
							if (var23 == 1) {
								var24.sequenceFrame = 0;
								var24.sequenceFrameCycle = 0;
								var24.sequenceDelay = var6;
								var24.field1220 = 0;
							} else if (var23 == 2) {
								var24.field1220 = 0;
							}
						} else if (var5 == -1 || var24.sequence == -1 || HttpMethod.SequenceDefinition_get(var5).field2220 >= HttpMethod.SequenceDefinition_get(var24.sequence).field2220) {
							var24.sequence = var5;
							var24.sequenceFrame = 0;
							var24.sequenceFrameCycle = 0;
							var24.sequenceDelay = var6;
							var24.field1220 = 0;
							var24.field1215 = var24.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3374 == var1.serverPacket) {
					BoundaryObject.method5888(class309.field3265);
					var1.serverPacket = null;
					return true;
				}

				class368.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1411 != null ? var1.field1411.id : -1) + "," + (var1.field1407 != null ? var1.field1407.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
				class189.logOut();
			} catch (IOException var48) {
				Messages.method2849();
			} catch (Exception var49) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1411 != null ? var1.field1411.id : -1) + "," + (var1.field1407 != null ? var1.field1407.id : -1) + "," + var1.serverPacketLength + "," + (KeyHandler.localPlayer.pathX[0] + HealthBarDefinition.baseX * 64) + "," + (KeyHandler.localPlayer.pathY[0] + WorldMapScaleHandler.baseY * 64) + ",";

				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var21 = var21 + var3.array[var6] + ",";
				}

				class368.RunException_sendStackTrace(var21, var49);
				class189.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "325531729"
	)
	@Export("menu")
	final void menu() {
		class131.method3113();
		if (clickedWidget == null) {
			int var1 = MouseHandler.MouseHandler_lastButton;
			int var2;
			if (isMenuOpen) {
				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				if (var1 != 1 && (SoundCache.mouseCam || var1 != 4)) {
					var2 = MouseHandler.MouseHandler_x;
					var3 = MouseHandler.MouseHandler_y;
					if (var2 < class209.menuX - 10 || var2 > class209.menuX + MusicPatchPcmStream.menuWidth + 10 || var3 < MouseRecorder.menuY - 10 || var3 > class60.menuHeight + MouseRecorder.menuY + 10) {
						isMenuOpen = false;
						var4 = class209.menuX;
						var5 = MouseRecorder.menuY;
						var6 = MusicPatchPcmStream.menuWidth;
						var7 = class60.menuHeight;

						for (var8 = 0; var8 < rootWidgetCount; ++var8) {
							if (rootWidgetXs[var8] + rootWidgetWidths[var8] > var4 && rootWidgetXs[var8] < var4 + var6 && rootWidgetHeights[var8] + rootWidgetYs[var8] > var5 && rootWidgetYs[var8] < var7 + var5) {
								validRootWidgets[var8] = true;
							}
						}
					}
				}

				if (var1 == 1 || !SoundCache.mouseCam && var1 == 4) {
					var2 = class209.menuX;
					var3 = MouseRecorder.menuY;
					var4 = MusicPatchPcmStream.menuWidth;
					var5 = MouseHandler.MouseHandler_lastPressedX;
					var6 = MouseHandler.MouseHandler_lastPressedY;
					var7 = -1;

					int var9;
					for (var8 = 0; var8 < menuOptionsCount; ++var8) {
						var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
						if (var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) {
							var7 = var8;
						}
					}

					if (var7 != -1) {
						NPCComposition.method3719(var7);
					}

					isMenuOpen = false;
					var8 = class209.menuX;
					var9 = MouseRecorder.menuY;
					int var10 = MusicPatchPcmStream.menuWidth;
					int var11 = class60.menuHeight;

					for (int var12 = 0; var12 < rootWidgetCount; ++var12) {
						if (rootWidgetXs[var12] + rootWidgetWidths[var12] > var8 && rootWidgetXs[var12] < var8 + var10 && rootWidgetHeights[var12] + rootWidgetYs[var12] > var9 && rootWidgetYs[var12] < var11 + var9) {
							validRootWidgets[var12] = true;
						}
					}
				}
			} else {
				var2 = menuOptionsCount - 1;
				if ((var1 == 1 || !SoundCache.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
					var1 = 2;
				}

				if ((var1 == 1 || !SoundCache.mouseCam && var1 == 4) && menuOptionsCount > 0) {
					NPCComposition.method3719(var2);
				}

				if (var1 == 2 && menuOptionsCount > 0) {
					this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
				}
			}

		}
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1123266317"
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

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = class90.fontBold12.stringWidth("Choose Option");

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) {
			var5 = class90.fontBold12.stringWidth(class195.method3836(var4));
			if (var5 > var3) {
				var3 = var5;
			}
		}

		var3 += 8;
		var4 = menuOptionsCount * 15 + 22;
		var5 = var1 - var3 / 2;
		if (var3 + var5 > class524.canvasWidth) {
			var5 = class524.canvasWidth - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		int var6 = var2;
		if (var2 + var4 > GameEngine.canvasHeight) {
			var6 = GameEngine.canvasHeight - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		class209.menuX = var5;
		MouseRecorder.menuY = var6;
		MusicPatchPcmStream.menuWidth = var3;
		class60.menuHeight = menuOptionsCount * 15 + 22;
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		GrandExchangeOfferOwnWorldComparator.scene.menuOpen(SecureUrlRequester.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-402233070"
	)
	final void method1280(boolean var1) {
		int var2 = rootInterface;
		int var3 = class524.canvasWidth;
		int var4 = GameEngine.canvasHeight;
		if (class380.widgetDefinition.loadInterface(var2)) {
			class428.resizeInterface(class380.widgetDefinition.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)V",
		garbageValue = "7"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : class380.widgetDefinition.method6348(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class524.canvasWidth;
			var4 = GameEngine.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		DelayFadeTask.alignWidgetSize(var1, var3, var4, false);
		WorldMapID.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	final void method1282() {
		FaceNormal.invalidateWidget(clickedWidget);
		++HttpRequest.widgetDragDuration;
		int var1;
		int var2;
		if (field714 && field739) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field688) {
				var1 = field688;
			}

			if (var1 + clickedWidget.width > field688 + clickedWidgetParent.width) {
				var1 = field688 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field689) {
				var2 = field689;
			}

			if (var2 + clickedWidget.height > field689 + clickedWidgetParent.height) {
				var2 = field689 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field719;
			int var4 = var2 - field692;
			int var5 = clickedWidget.dragZoneSize;
			if (HttpRequest.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}

			int var6 = var1 - field688 + clickedWidgetParent.scrollX;
			int var7 = var2 - field689 + clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = clickedWidget.onDrag;
				WorldMapSectionType.runScriptEvent(var8);
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
						WorldMapSectionType.runScriptEvent(var8);
					}

					if (draggedOnWidget != null && class482.method8733(clickedWidget) != null) {
						PacketBufferNode var13 = class482.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
						var13.packetBuffer.writeIntLE(draggedOnWidget.id);
						var13.packetBuffer.writeShortAdd(clickedWidget.itemId);
						var13.packetBuffer.writeShort(draggedOnWidget.childIndex);
						var13.packetBuffer.writeInt(clickedWidget.id);
						var13.packetBuffer.writeShortAdd(draggedOnWidget.itemId);
						var13.packetBuffer.writeShortAdd(clickedWidget.childIndex);
						packetWriter.addNode(var13);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(widgetClickX + field719, widgetClickY + field692);
				} else if (menuOptionsCount > 0) {
					int var11 = widgetClickX + field719;
					int var9 = field692 + widgetClickY;
					MenuAction var10 = class74.tempMenuAction;
					if (var10 != null) {
						class31.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.itemId, var10.action, var10.target, var11, var9);
					}

					class74.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		} else {
			if (HttpRequest.widgetDragDuration > 1) {
				if (!isDraggingWidget && menuOptionsCount > 0) {
					var1 = field719 + widgetClickX;
					var2 = widgetClickY + field692;
					MenuAction var12 = class74.tempMenuAction;
					if (var12 != null) {
						class31.menuAction(var12.param0, var12.param1, var12.opcode, var12.identifier, var12.itemId, var12.action, var12.target, var1, var2);
					}

					class74.tempMenuAction = null;
				}

				clickedWidget = null;
			}

		}
	}

	@ObfuscatedName("pa")
	@ObfuscatedSignature(
		descriptor = "(I)Lvs;",
		garbageValue = "-227041458"
	)
	@Export("username")
	public Username username() {
		return KeyHandler.localPlayer != null ? KeyHandler.localPlayer.username : null;
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1742661162"
	)
	void method1284(int var1) {
		PacketBufferNode var2 = class482.getPacketBufferNode(ClientPacket.field3215, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1090419053"
	)
	void method1285(int var1) {
		PacketBufferNode var2 = class482.getPacketBufferNode(ClientPacket.field3260, packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var1);
		packetWriter.addNode(var2);
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
							Language var14;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
								var14 = Language.Language_valuesOrdered[var4];
							} else {
								var14 = null;
							}

							class92.clientLanguage = var14;
							break;
						case 7:
							var4 = Integer.parseInt(var2);
							GameBuild[] var5 = new GameBuild[]{GameBuild.BUILDLIVE, GameBuild.WIP, GameBuild.RC, GameBuild.LIVE};
							GameBuild[] var6 = var5;
							int var7 = 0;

							GameBuild var9;
							while (true) {
								if (var7 >= var6.length) {
									var9 = null;
									break;
								}

								GameBuild var8 = var6[var7];
								if (var4 == var8.buildId) {
									var9 = var8;
									break;
								}

								++var7;
							}

							class28.field153 = var9;
							break;
						case 8:
							if (var2.equalsIgnoreCase("true")) {
							}
							break;
						case 9:
							class426.field4608 = var2;
							break;
						case 10:
							class1.field3 = (StudioGame)GrandExchangeEvents.findEnumerated(Projectile.method2222(), Integer.parseInt(var2));
							if (StudioGame.oldscape == class1.field3) {
								UserComparator10.loginType = LoginType.oldscape;
							} else {
								UserComparator10.loginType = LoginType.field5070;
							}
							break;
						case 11:
							class424.authServiceBaseUrl = var2;
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
							WorldMapData_0.field2467 = Integer.parseInt(var2);
							break;
						case 15:
							gameBuild = Integer.parseInt(var2);
							break;
						case 17:
							PacketWriter.field1412 = var2;
							break;
						case 21:
							field503 = Integer.parseInt(var2);
							break;
						case 22:
							class148.gameSessionServiceBaseUrl = var2;
							break;
						case 25:
							int var3 = var2.indexOf(".");
							if (var3 == -1) {
								Integer.parseInt(var2);
							} else {
								Integer.parseInt(var2.substring(0, var3));
								Integer.parseInt(var2.substring(var3 + 1));
							}
						}
					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				InvDefinition.worldHost = this.getCodeBase().getHost();
				UrlRequester.field1418 = new JagNetThread();
				String var10 = class28.field153.name;
				byte var11 = 0;
				if ((worldProperties & class526.field5160.rsOrdinal()) != 0) {
					WorldMapCacheName.field2676 = "beta";
				}

				try {
					HealthBarUpdate.method2495("oldschool", WorldMapCacheName.field2676, var10, var11, 23);
				} catch (Exception var12) {
					class368.RunException_sendStackTrace((String)null, var12);
				}

				VertexNormal.client = this;
				class317.field3442 = clientType;
				class33.initCredentials();
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.https = true;
				}

				if (field667 == -1) {
					if (!this.containsAccessAndRefreshToken() && !this.containsSessionAndCharacterId()) {
						field667 = 0;
					} else {
						field667 = 5;
					}
				}

				this.startThread(765, 503, 219, 1);
			}
		} catch (RuntimeException var13) {
			throw UserComparator5.newRunException(var13, "client.init(" + ')');
		}
	}

	protected void finalize() throws Throwable {
		class319.field3463.remove(this);
		super.finalize();
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
			Actor.method2489(10);
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
			this.refreshAccessTokenRequester = var1;
		}
	}

	public long getAccountHash() {
		return this.accountHash;
	}

	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class482.getPacketBufferNode(ClientPacket.field3217, packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		packetWriter.addNode(var0);
	}
}
