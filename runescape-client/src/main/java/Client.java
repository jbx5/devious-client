import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "[Led;"
	)
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("sz")
	@Export("playingJingle")
	static boolean playingJingle;
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = -1358104763
	)
	public static int field782;
	@ObfuscatedName("sm")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = 1569844235
	)
	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = 651915753
	)
	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("vt")
	static int[] field787;
	@ObfuscatedName("vo")
	static int[] field788;
	@ObfuscatedName("sn")
	@ObfuscatedGetter(
		intValue = 2058275655
	)
	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("vy")
	@ObfuscatedSignature(
		descriptor = "Lby;"
	)
	static final ApproximateRouteStrategy field786;
	@ObfuscatedName("sh")
	@ObfuscatedGetter(
		intValue = -341659067
	)
	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(
		intValue = 1876141191
	)
	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = 1197744969
	)
	static int field566;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(
		intValue = -189498203
	)
	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = -270756597
	)
	static int field715;
	@ObfuscatedName("sq")
	@ObfuscatedGetter(
		intValue = 472847473
	)
	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("sy")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("sr")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("si")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sk")
	@ObfuscatedGetter(
		intValue = -1850275625
	)
	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "[Lap;"
	)
	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("uf")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;
	@ObfuscatedName("sb")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("ud")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("DBTableMasterIndex_cache")
	static EvictingDualNodeHashTable DBTableMasterIndex_cache;
	@ObfuscatedName("sj")
	@ObfuscatedGetter(
		intValue = -1180731439
	)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("vc")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("rg")
	@ObfuscatedGetter(
		longValue = 1659896925640892851L
	)
	static long field733;
	@ObfuscatedName("vw")
	@ObfuscatedGetter(
		intValue = -1500212927
	)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("sl")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("rl")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("tc")
	static boolean[] field755;
	@ObfuscatedName("tz")
	static int[] field575;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(
		intValue = 1886028331
	)
	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("td")
	static int[] field757;
	@ObfuscatedName("rx")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(
		intValue = -814923163
	)
	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("tb")
	static int[] field758;
	@ObfuscatedName("rm")
	@ObfuscatedSignature(
		descriptor = "[Ler;"
	)
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("uy")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("ta")
	static int[] field759;
	@ObfuscatedName("rb")
	@ObfuscatedGetter(
		intValue = -1267299117
	)
	static int field736;
	@ObfuscatedName("ry")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tl")
	static boolean field544;
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("th")
	static short field760;
	@ObfuscatedName("tw")
	static short field762;
	@ObfuscatedName("uu")
	static short field537;
	@ObfuscatedName("uq")
	static short field638;
	@ObfuscatedName("ur")
	static short field756;
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 1313769551
	)
	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tt")
	static short field764;
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = -308539085
	)
	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("um")
	@ObfuscatedGetter(
		intValue = -1120100653
	)
	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("uj")
	@ObfuscatedSignature(
		descriptor = "[Llr;"
	)
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("ru")
	@ObfuscatedGetter(
		intValue = -2098122201
	)
	static int field529;
	@ObfuscatedName("vd")
	@ObfuscatedGetter(
		intValue = 882600475
	)
	static int field613;
	@ObfuscatedName("rs")
	static int[] field749;
	@ObfuscatedName("rf")
	static int[] field731;
	@ObfuscatedName("tx")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("tn")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("rn")
	static String field752;
	@ObfuscatedName("tg")
	@ObfuscatedGetter(
		intValue = -1693900609
	)
	static int field789;
	@ObfuscatedName("rh")
	static int[] field724;
	@ObfuscatedName("ue")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = 1042842941
	)
	static int field618;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "[Lgj;"
	)
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("au")
	static boolean field587;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -955103455
	)
	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 285959915
	)
	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -926068429
	)
	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("by")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bz")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1086519913
	)
	static int field497;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -942178573
	)
	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -607785167
	)
	static int field571;
	@ObfuscatedName("bx")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1929522483
	)
	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cm")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 1165332781
	)
	@Export("cycle")
	static int cycle;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		longValue = 357724067631522685L
	)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1995242549
	)
	static int field505;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1250215341
	)
	static int field506;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		longValue = -4196392371729312045L
	)
	static long field507;
	@ObfuscatedName("dq")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1319778895
	)
	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1947634697
	)
	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 456318925
	)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -1730174795
	)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -2137633873
	)
	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1850916367
	)
	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1826852820
	)
	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1635656640
	)
	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -1167713216
	)
	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lcq;"
	)
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1084537321
	)
	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -1027332567
	)
	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = -939239011
	)
	static int field522;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 686071665
	)
	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("fc")
	@ObfuscatedGetter(
		intValue = -796037507
	)
	@Export("loginState")
	static int loginState;
	@ObfuscatedName("fr")
	@ObfuscatedGetter(
		intValue = 385086823
	)
	static int field525;
	@ObfuscatedName("fg")
	@ObfuscatedGetter(
		intValue = -1489299043
	)
	static int field526;
	@ObfuscatedName("fv")
	@ObfuscatedGetter(
		intValue = -560586039
	)
	static int field527;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	static class125 field528;
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	static class448 field639;
	@ObfuscatedName("fz")
	static final String field661;
	@ObfuscatedName("gk")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gc")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "[Lco;"
	)
	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -614487589
	)
	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("go")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("ge")
	@ObfuscatedGetter(
		intValue = 1572689161
	)
	static int field549;
	@ObfuscatedName("gm")
	static int[] field550;
	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "Lcs;"
	)
	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("hi")
	@ObfuscatedGetter(
		intValue = -1315915121
	)
	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("he")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hc")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(
		intValue = 1517738829
	)
	static int field523;
	@ObfuscatedName("hf")
	@ObfuscatedGetter(
		intValue = -681391809
	)
	static int field585;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(
		intValue = -1347427523
	)
	static int field558;
	@ObfuscatedName("hy")
	@ObfuscatedGetter(
		intValue = 960719949
	)
	static int field559;
	@ObfuscatedName("hx")
	@ObfuscatedGetter(
		intValue = 856798245
	)
	static int field774;
	@ObfuscatedName("il")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("ie")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("ir")
	static final int[] field564;
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = -1469577063
	)
	static int field743;
	@ObfuscatedName("iu")
	@ObfuscatedGetter(
		intValue = 1618207093
	)
	static int field508;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("io")
	@ObfuscatedGetter(
		intValue = -25198189
	)
	static int field716;
	@ObfuscatedName("if")
	@ObfuscatedGetter(
		intValue = -1436052139
	)
	static int field568;
	@ObfuscatedName("im")
	@ObfuscatedGetter(
		intValue = -1748283211
	)
	static int field727;
	@ObfuscatedName("id")
	static boolean field570;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = -2052071939
	)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 1549581749
	)
	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(
		intValue = 338293883
	)
	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 469381565
	)
	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = -899947855
	)
	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(
		intValue = 1416659259
	)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 584448557
	)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(
		intValue = -1295727583
	)
	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(
		intValue = -822684481
	)
	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(
		intValue = 127647999
	)
	static int field580;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(
		intValue = -2009562911
	)
	static int field581;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(
		intValue = 178959503
	)
	static int field582;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(
		intValue = 1397841051
	)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(
		intValue = 1483305355
	)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("je")
	@ObfuscatedGetter(
		intValue = -1563090891
	)
	static int field754;
	@ObfuscatedName("kv")
	static boolean field586;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = -988021777
	)
	static int field630;
	@ObfuscatedName("ko")
	static boolean field543;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(
		intValue = -1233568483
	)
	static int field589;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = -247945411
	)
	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("ki")
	@ObfuscatedGetter(
		intValue = -2005837749
	)
	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("kk")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("ke")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("kd")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kw")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("km")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kh")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kc")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("kr")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kq")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(
		intValue = 1680051095
	)
	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(
		intValue = -1719740117
	)
	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(
		intValue = 961153905
	)
	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = 2144290199
	)
	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = 1615978565
	)
	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -1615092235
	)
	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(
		intValue = 783878283
	)
	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kf")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(
		intValue = 183903601
	)
	static int field609;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = -1355746395
	)
	static int field635;
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 1550083197
	)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(
		intValue = 1684772177
	)
	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = 1937959615
	)
	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("lh")
	@ObfuscatedGetter(
		intValue = 1285032319
	)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("lg")
	static boolean field763;
	@ObfuscatedName("lo")
	@ObfuscatedGetter(
		intValue = 1511731025
	)
	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lf")
	@ObfuscatedGetter(
		intValue = 323214685
	)
	static int field617;
	@ObfuscatedName("li")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "[Lcl;"
	)
	@Export("players")
	static Player[] players;
	@ObfuscatedName("lt")
	@ObfuscatedGetter(
		intValue = -605970647
	)
	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(
		intValue = 1164507621
	)
	static int field621;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		longValue = -6637453507816676259L
	)
	static long field498;
	@ObfuscatedName("lk")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("lc")
	@ObfuscatedGetter(
		intValue = -263767255
	)
	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lp")
	@ObfuscatedGetter(
		intValue = 1770673121
	)
	static int field625;
	@ObfuscatedName("lz")
	static int[] field775;
	@ObfuscatedName("md")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("mt")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ml")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("mz")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("mo")
	@ObfuscatedGetter(
		intValue = 228143751
	)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "[[[Llc;"
	)
	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("mr")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mh")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("mv")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("mf")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;
	@ObfuscatedName("mc")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mb")
	@ObfuscatedGetter(
		intValue = -1221650631
	)
	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("me")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mw")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mq")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mn")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mk")
	@Export("menuItemIds")
	static int[] menuItemIds;
	@ObfuscatedName("ns")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("nu")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("np")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("na")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ne")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("ni")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("nh")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = 94097817
	)
	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = -726283291
	)
	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 32964859
	)
	static int field560;
	@ObfuscatedName("nl")
	@ObfuscatedGetter(
		intValue = -154462467
	)
	static int field657;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = 1548097615
	)
	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("nb")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(
		intValue = 580477963
	)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(
		intValue = 1851481475
	)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("nz")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("ny")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = -450916759
	)
	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("op")
	@ObfuscatedGetter(
		intValue = -2071864311
	)
	static int field593;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		intValue = 2142545009
	)
	static int field668;
	@ObfuscatedName("of")
	@ObfuscatedGetter(
		intValue = -343729041
	)
	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("oq")
	@ObfuscatedGetter(
		intValue = 859837901
	)
	static int field565;
	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(
		intValue = -532915775
	)
	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = -806074421
	)
	@Export("weight")
	static int weight;
	@ObfuscatedName("om")
	@ObfuscatedGetter(
		intValue = 2096379489
	)
	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(
		intValue = -853079577
	)
	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("oj")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = -572216347
	)
	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = -508828023
	)
	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("or")
	static boolean field683;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(
		intValue = -1081263179
	)
	static int field783;
	@ObfuscatedName("ob")
	@ObfuscatedGetter(
		intValue = -1666573751
	)
	static int field744;
	@ObfuscatedName("os")
	static boolean field686;
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = -617257983
	)
	static int field687;
	@ObfuscatedName("ow")
	@ObfuscatedGetter(
		intValue = 1039872673
	)
	static int field688;
	@ObfuscatedName("pi")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("pm")
	@ObfuscatedGetter(
		intValue = -1341875553
	)
	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pn")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(
		intValue = -1032863153
	)
	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("pk")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -793051319
	)
	static int field694;
	@ObfuscatedName("pv")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("pf")
	@ObfuscatedGetter(
		intValue = -1595421791
	)
	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("po")
	static int[] field590;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(
		intValue = -1669218215
	)
	static int field698;
	@ObfuscatedName("px")
	@ObfuscatedGetter(
		intValue = -1315170369
	)
	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(
		intValue = 1133823213
	)
	static int field700;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(
		intValue = 2039857333
	)
	static int field701;
	@ObfuscatedName("py")
	@ObfuscatedGetter(
		intValue = -1750917415
	)
	static int field702;
	@ObfuscatedName("pg")
	@ObfuscatedGetter(
		intValue = -1220894383
	)
	static int field745;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(
		intValue = -312378233
	)
	static int field704;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(
		intValue = -1530390561
	)
	static int field705;
	@ObfuscatedName("pl")
	@ObfuscatedGetter(
		intValue = 655257345
	)
	static int field706;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(
		intValue = -584786819
	)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static NodeDeque field709;
	@ObfuscatedName("qs")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	static NodeDeque field626;
	@ObfuscatedName("qn")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qg")
	@ObfuscatedGetter(
		intValue = 1284586997
	)
	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("ql")
	@ObfuscatedGetter(
		intValue = -513678565
	)
	static int field713;
	@ObfuscatedName("qk")
	static boolean[] field714;
	@ObfuscatedName("qd")
	static boolean[] field556;
	@ObfuscatedName("qt")
	static boolean[] field671;
	@ObfuscatedName("qu")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qi")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qe")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qp")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(
		intValue = -1589240577
	)
	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(
		longValue = 6601777156529964847L
	)
	static long field678;
	@ObfuscatedName("qm")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("fb")
	String field530;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	class14 field531;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	class19 field576;
	@ObfuscatedName("fu")
	OtlTokenRequester field533;
	@ObfuscatedName("fe")
	Future field515;
	@ObfuscatedName("fy")
	boolean field535;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Le;"
	)
	class19 field536;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
	)
	RefreshAccessTokenRequester field719;
	@ObfuscatedName("ft")
	Future field538;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	Buffer field542;
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "Lq;"
	)
	class7 field721;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		longValue = -6377200187917740923L
	)
	long field710;

	static {
		field587 = true; // L: 148
		worldId = 1; // L: 149
		worldProperties = 0; // L: 150
		gameBuild = 0; // L: 152
		isMembersWorld = false; // L: 155
		isLowDetail = false; // L: 156
		field497 = -1; // L: 161
		clientType = -1; // L: 162
		field571 = -1; // L: 163
		onMobile = false; // L: 164
		gameState = 0; // L: 176
		isLoading = true; // L: 200
		cycle = 0; // L: 201
		mouseLastLastPressedTimeMillis = 1L; // L: 202
		field505 = -1; // L: 204
		field506 = -1; // L: 205
		field507 = -1L; // L: 206
		hadFocus = true; // L: 207
		rebootTimer = 0; // L: 208
		hintArrowType = 0; // L: 209
		hintArrowNpcIndex = 0; // L: 210
		hintArrowPlayerIndex = 0; // L: 211
		hintArrowX = 0; // L: 212
		hintArrowY = 0; // L: 213
		hintArrowHeight = 0; // L: 214
		hintArrowSubX = 0; // L: 215
		hintArrowSubY = 0; // L: 216
		playerAttackOption = AttackOption.AttackOption_hidden; // L: 218
		npcAttackOption = AttackOption.AttackOption_hidden; // L: 219
		titleLoadingStage = 0; // L: 224
		js5ConnectState = 0; // L: 227
		field522 = 0; // L: 228
		js5Errors = 0; // L: 251
		loginState = 0;
		field525 = 0; // L: 254
		field526 = 0; // L: 255
		field527 = 0; // L: 256
		field528 = class125.field1536; // L: 257
		field639 = class448.field4784; // L: 258
		int var1 = "com_jagex_auth_desktop_osrs:public".length(); // L: 283
		byte[] var2 = new byte[var1]; // L: 284

		for (int var3 = 0; var3 < var1; ++var3) { // L: 285
			char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3); // L: 286
			if (var4 > 127) { // L: 287
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4; // L: 288
			}
		}

		field661 = ItemLayer.method4040(var2); // L: 292
		Login_isUsernameRemembered = false; // L: 301
		secureRandomFuture = new SecureRandomFuture(); // L: 302
		randomDatData = null; // L: 308
		npcs = new NPC[32768]; // L: 312
		npcCount = 0; // L: 313
		npcIndices = new int[32768]; // L: 314
		field549 = 0; // L: 315
		field550 = new int[250]; // L: 316
		packetWriter = new PacketWriter(); // L: 319
		logoutTimer = 0; // L: 321
		hadNetworkError = false; // L: 322
		timer = new Timer(); // L: 323
		fontsMap = new HashMap(); // L: 329
		field523 = 0; // L: 336
		field585 = 1; // L: 337
		field558 = 0; // L: 338
		field559 = 1; // L: 339
		field774 = 0; // L: 340
		collisionMaps = new CollisionMap[4]; // L: 348
		isInInstance = false; // L: 349
		instanceChunkTemplates = new int[4][13][13]; // L: 350
		field564 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}; // L: 351
		field743 = 0; // L: 354
		field508 = 2301979; // L: 366
		field716 = 5063219; // L: 367
		field568 = 3353893; // L: 368
		field727 = 7759444; // L: 369
		field570 = false; // L: 370
		alternativeScrollbarWidth = 0; // L: 371
		camAngleX = 128; // L: 379
		camAngleY = 0; // L: 380
		camAngleDY = 0; // L: 381
		camAngleDX = 0; // L: 382
		mouseCamClickedX = 0; // L: 383
		mouseCamClickedY = 0; // L: 384
		oculusOrbState = 0; // L: 385
		camFollowHeight = 50; // L: 386
		field580 = 0; // L: 390
		field581 = 0; // L: 391
		field582 = 0; // L: 392
		oculusOrbNormalSpeed = 12; // L: 394
		oculusOrbSlowedSpeed = 6; // L: 395
		field754 = 0; // L: 396
		field586 = false; // L: 397
		field630 = 0; // L: 398
		field543 = false; // L: 399
		field589 = 0; // L: 400
		overheadTextCount = 0; // L: 401
		overheadTextLimit = 50; // L: 402
		overheadTextXs = new int[overheadTextLimit]; // L: 403
		overheadTextYs = new int[overheadTextLimit]; // L: 404
		overheadTextAscents = new int[overheadTextLimit]; // L: 405
		overheadTextXOffsets = new int[overheadTextLimit]; // L: 406
		overheadTextColors = new int[overheadTextLimit]; // L: 407
		overheadTextEffects = new int[overheadTextLimit]; // L: 408
		overheadTextCyclesRemaining = new int[overheadTextLimit]; // L: 409
		overheadText = new String[overheadTextLimit]; // L: 410
		tileLastDrawnActor = new int[104][104]; // L: 411
		viewportDrawCount = 0; // L: 412
		viewportTempX = -1; // L: 413
		viewportTempY = -1; // L: 414
		mouseCrossX = 0; // L: 415
		mouseCrossY = 0; // L: 416
		mouseCrossState = 0; // L: 417
		mouseCrossColor = 0; // L: 418
		showMouseCross = true; // L: 419
		field609 = 0; // L: 421
		field635 = 0; // L: 422
		dragItemSlotSource = 0; // L: 425
		draggedWidgetX = 0; // L: 426
		draggedWidgetY = 0; // L: 427
		dragItemSlotDestination = 0; // L: 428
		field763 = false; // L: 429
		itemDragDuration = 0; // L: 430
		field617 = 0; // L: 431
		showLoadingMessages = true; // L: 433
		players = new Player[2048]; // L: 435
		localPlayerIndex = -1; // L: 437
		field621 = 0; // L: 438
		field498 = -1L; // L: 439
		renderSelf = true; // L: 441
		drawPlayerNames = 0; // L: 446
		field625 = 0; // L: 447
		field775 = new int[1000]; // L: 448
		playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51}; // L: 450
		playerMenuActions = new String[8]; // L: 451
		playerOptionsPriorities = new boolean[8]; // L: 452
		defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792}; // L: 453
		combatTargetPlayerIndex = -1; // L: 454
		groundItems = new NodeDeque[4][104][104]; // L: 455
		pendingSpawns = new NodeDeque(); // L: 456
		projectiles = new NodeDeque(); // L: 457
		graphicsObjects = new NodeDeque(); // L: 458
		currentLevels = new int[25]; // L: 459
		levels = new int[25]; // L: 460
		experience = new int[25]; // L: 461
		leftClickOpensMenu = false; // L: 462
		isMenuOpen = false; // L: 463
		menuOptionsCount = 0; // L: 469
		menuArguments1 = new int[500]; // L: 470
		menuArguments2 = new int[500]; // L: 471
		menuOpcodes = new int[500]; // L: 472
		menuIdentifiers = new int[500]; // L: 473
		menuItemIds = new int[500]; // L: 474
		menuActions = new String[500]; // L: 475
		menuTargets = new String[500]; // L: 476
		menuShiftClick = new boolean[500]; // L: 477
		followerOpsLowPriority = false; // L: 478
		shiftClickDrop = false; // L: 480
		tapToDrop = false; // L: 481
		showMouseOverText = true; // L: 482
		viewportX = -1; // L: 483
		viewportY = -1; // L: 484
		field560 = 0; // L: 488
		field657 = 50; // L: 489
		isItemSelected = 0; // L: 490
		selectedItemName = null; // L: 494
		isSpellSelected = false; // L: 495
		selectedSpellChildIndex = -1; // L: 497
		selectedSpellItemId = -1; // L: 498
		selectedSpellActionName = null; // L: 500
		selectedSpellName = null; // L: 501
		rootInterface = -1; // L: 502
		interfaceParents = new NodeHashTable(8); // L: 503
		field593 = 0; // L: 508
		field668 = -1; // L: 509
		chatEffects = 0; // L: 510
		field565 = 0; // L: 511
		meslayerContinueWidget = null; // L: 512
		runEnergy = 0; // L: 513
		weight = 0; // L: 514
		staffModLevel = 0; // L: 515
		followerIndex = -1; // L: 516
		playerMod = false; // L: 517
		viewportWidget = null; // L: 518
		clickedWidget = null; // L: 519
		clickedWidgetParent = null; // L: 520
		widgetClickX = 0; // L: 521
		widgetClickY = 0; // L: 522
		draggedOnWidget = null; // L: 523
		field683 = false; // L: 524
		field783 = -1; // L: 525
		field744 = -1; // L: 526
		field686 = false; // L: 527
		field687 = -1; // L: 528
		field688 = -1; // L: 529
		isDraggingWidget = false; // L: 530
		cycleCntr = 1; // L: 535
		changedVarps = new int[32]; // L: 538
		changedVarpCount = 0; // L: 539
		changedItemContainers = new int[32]; // L: 540
		field694 = 0; // L: 541
		changedSkills = new int[32]; // L: 542
		changedSkillsCount = 0; // L: 543
		field590 = new int[32]; // L: 544
		field698 = 0; // L: 545
		chatCycle = 0; // L: 546
		field700 = 0; // L: 547
		field701 = 0; // L: 548
		field702 = 0; // L: 549
		field745 = 0; // L: 550
		field704 = 0; // L: 551
		field705 = 0; // L: 552
		field706 = 0; // L: 553
		mouseWheelRotation = 0; // L: 559
		scriptEvents = new NodeDeque(); // L: 560
		field709 = new NodeDeque(); // L: 561
		field626 = new NodeDeque(); // L: 562
		widgetFlags = new NodeHashTable(512); // L: 563
		rootWidgetCount = 0; // L: 565
		field713 = -2; // L: 566
		field714 = new boolean[100]; // L: 567
		field556 = new boolean[100]; // L: 568
		field671 = new boolean[100]; // L: 569
		rootWidgetXs = new int[100]; // L: 570
		rootWidgetYs = new int[100]; // L: 571
		rootWidgetWidths = new int[100]; // L: 572
		rootWidgetHeights = new int[100]; // L: 573
		gameDrawingMode = 0; // L: 574
		field678 = 0L; // L: 575
		isResizable = true; // L: 576
		field724 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215}; // L: 583
		publicChatMode = 0; // L: 584
		tradeChatMode = 0; // L: 586
		field752 = ""; // L: 587
		crossWorldMessageIds = new long[100]; // L: 589
		crossWorldMessageIdsIndex = 0; // L: 590
		field529 = 0; // L: 592
		field731 = new int[128]; // L: 593
		field749 = new int[128]; // L: 594
		field733 = -1L; // L: 595
		currentClanSettings = new ClanSettings[4]; // L: 599
		currentClanChannels = new ClanChannel[4]; // L: 601
		field736 = -1; // L: 603
		mapIconCount = 0; // L: 604
		mapIconXs = new int[1000]; // L: 605
		mapIconYs = new int[1000]; // L: 606
		mapIcons = new SpritePixels[1000]; // L: 607
		destinationX = 0; // L: 608
		destinationY = 0; // L: 609
		minimapState = 0; // L: 616
		currentTrackGroupId = -1; // L: 617
		playingJingle = false; // L: 618
		soundEffectCount = 0; // L: 624
		soundEffectIds = new int[50]; // L: 625
		queuedSoundEffectLoops = new int[50]; // L: 626
		queuedSoundEffectDelays = new int[50]; // L: 627
		soundLocations = new int[50]; // L: 628
		soundEffects = new SoundEffect[50]; // L: 629
		isCameraLocked = false; // L: 631
		field544 = false; // L: 642
		field755 = new boolean[5]; // L: 650
		field575 = new int[5]; // L: 651
		field757 = new int[5]; // L: 652
		field758 = new int[5]; // L: 653
		field759 = new int[5]; // L: 654
		field760 = 256; // L: 655
		field762 = 205; // L: 656
		zoomHeight = 256; // L: 657
		zoomWidth = 320; // L: 658
		field764 = 1; // L: 659
		field756 = 32767; // L: 660
		field537 = 1; // L: 661
		field638 = 32767; // L: 662
		viewportOffsetX = 0; // L: 663
		viewportOffsetY = 0; // L: 664
		viewportWidth = 0; // L: 665
		viewportHeight = 0; // L: 666
		viewportZoom = 0; // L: 667
		playerAppearance = new PlayerComposition(); // L: 669
		field566 = -1; // L: 670
		field715 = -1; // L: 671
		platformInfoProvider = new DesktopPlatformInfoProvider(); // L: 673
		grandExchangeOffers = new GrandExchangeOffer[8]; // L: 675
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator(); // L: 678
		DBTableIndex_cache = new EvictingDualNodeHashTable(64); // L: 680
		DBTableMasterIndex_cache = new EvictingDualNodeHashTable(64); // L: 681
		field618 = -1; // L: 684
		field782 = -1; // L: 690
		archiveLoaders = new ArrayList(10); // L: 691
		archiveLoadersDone = 0; // L: 692
		field613 = 0; // L: 693
		field786 = new ApproximateRouteStrategy(); // L: 702
		field787 = new int[50]; // L: 703
		field788 = new int[50]; // L: 704
	}

	public Client() {
		this.field535 = false; // L: 274
		this.field710 = -1L;
	} // L: 307

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "35"
	)
	@Export("resizeGame")
	protected final void resizeGame() {
		field678 = Language.method6232() + 500L; // L: 4282
		this.resizeJS(); // L: 4283
		if (rootInterface != -1) { // L: 4284
			this.resizeRoot(true);
		}

	} // L: 4285

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "501973473"
	)
	@Export("setUp")
	protected final void setUp() {
		class307.method5930(new int[]{20, 260, 10000}, new int[]{1000, 100, 500}); // L: 953
		NPC.worldPort = gameBuild == 0 ? 43594 : worldId + 40000; // L: 954
		TaskHandler.js5Port = gameBuild == 0 ? 443 : worldId + 50000; // L: 955
		BuddyRankComparator.currentPort = NPC.worldPort; // L: 956
		class133.field1589 = class294.field3370; // L: 957
		class358.field4279 = class294.field3371; // L: 958
		class239.field2865 = class294.field3372; // L: 959
		MusicPatchPcmStream.field3288 = class294.field3373; // L: 960
		Messages.urlRequester = new class102(this.field535, 208); // L: 961
		this.setUpKeyboard(); // L: 962
		this.method448(); // L: 963
		class136.mouseWheel = this.mouseWheel(); // L: 964
		ChatChannel.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000); // L: 965
		Player.clientPreferences = Decimator.method1102(); // L: 966
		this.setUpClipboard(); // L: 967
		class11.method119(this, class345.field4194); // L: 968
		WallDecoration.setWindowedMode(Player.clientPreferences.method2411()); // L: 969
		Varps.friendSystem = new FriendSystem(Players.loginType); // L: 970
		this.field531 = new class14("tokenRequest", 1, 1); // L: 971
	} // L: 972

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2025034455"
	)
	@Export("doCycle")
	protected final void doCycle() {
		++cycle; // L: 976
		this.doCycleJs5(); // L: 977
		class152.method3303(); // L: 978

		int var1;
		try {
			if (class274.musicPlayerStatus == 1) { // L: 981
				var1 = class139.midiPcmStream.method5466(); // L: 982
				if (var1 > 0 && class139.midiPcmStream.isReady()) { // L: 983
					var1 -= VarcInt.pcmSampleLength; // L: 984
					if (var1 < 0) { // L: 985
						var1 = 0;
					}

					class139.midiPcmStream.setPcmStreamVolume(var1); // L: 986
				} else {
					class139.midiPcmStream.clear(); // L: 989
					class139.midiPcmStream.removeAll(); // L: 990
					if (class274.musicTrackArchive != null) { // L: 991
						class274.musicPlayerStatus = 2;
					} else {
						class274.musicPlayerStatus = 0; // L: 992
					}

					class274.musicTrack = null; // L: 993
					class29.soundCache = null; // L: 994
				}
			}
		} catch (Exception var8) { // L: 997
			var8.printStackTrace(); // L: 998
			class139.midiPcmStream.clear(); // L: 999
			class274.musicPlayerStatus = 0; // L: 1000
			class274.musicTrack = null; // L: 1001
			class29.soundCache = null; // L: 1002
			class274.musicTrackArchive = null; // L: 1003
		}

		class14.playPcmPlayers(); // L: 1006
		synchronized(KeyHandler.KeyHandler_instance) { // L: 1008
			++KeyHandler.KeyHandler_idleCycles; // L: 1009
			KeyHandler.field144 = KeyHandler.field146; // L: 1010
			KeyHandler.field141 = 0; // L: 1011
			KeyHandler.field123 = 0; // L: 1012
			Arrays.fill(KeyHandler.field133, false); // L: 1013
			Arrays.fill(KeyHandler.field134, false); // L: 1014
			if (KeyHandler.field131 < 0) { // L: 1015
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false); // L: 1016
				KeyHandler.field131 = KeyHandler.field136; // L: 1017
			} else {
				while (KeyHandler.field131 != KeyHandler.field136) { // L: 1020
					int var2 = KeyHandler.field135[KeyHandler.field136]; // L: 1021
					KeyHandler.field136 = KeyHandler.field136 + 1 & 127; // L: 1022
					if (var2 < 0) { // L: 1023
						var2 = ~var2; // L: 1024
						if (KeyHandler.KeyHandler_pressedKeys[var2]) { // L: 1025
							KeyHandler.KeyHandler_pressedKeys[var2] = false; // L: 1026
							KeyHandler.field134[var2] = true; // L: 1027
							KeyHandler.field143[KeyHandler.field123] = var2; // L: 1028
							++KeyHandler.field123; // L: 1029
						}
					} else {
						if (!KeyHandler.KeyHandler_pressedKeys[var2] && KeyHandler.field141 < KeyHandler.field140.length - 1) { // L: 1033
							KeyHandler.field133[var2] = true; // L: 1034
							KeyHandler.field140[++KeyHandler.field141 - 1] = var2; // L: 1035
						}

						KeyHandler.KeyHandler_pressedKeys[var2] = true; // L: 1037
					}
				}
			}

			if (KeyHandler.field141 > 0) { // L: 1041
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field146 = KeyHandler.field145; // L: 1042
		}

		synchronized(MouseHandler.MouseHandler_instance) { // L: 1046
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile; // L: 1047
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile; // L: 1048
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile; // L: 1049
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile; // L: 1050
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile; // L: 1051
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile; // L: 1052
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile; // L: 1053
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile; // L: 1054
			MouseHandler.MouseHandler_lastButtonVolatile = 0; // L: 1055
		} // L: 1056

		if (class136.mouseWheel != null) { // L: 1058
			var1 = class136.mouseWheel.useRotation(); // L: 1059
			mouseWheelRotation = var1; // L: 1060
		}

		if (gameState == 0) { // L: 1062
			class202.load(); // L: 1063
			class18.method282(); // L: 1064
		} else if (gameState == 5) { // L: 1066
			ByteArrayPool.loginScreen(this, class1.fontPlain12); // L: 1067
			class202.load(); // L: 1068
			class18.method282(); // L: 1069
		} else if (gameState != 10 && gameState != 11) { // L: 1071
			if (gameState == 20) { // L: 1072
				ByteArrayPool.loginScreen(this, class1.fontPlain12); // L: 1073
				this.doCycleLoggedOut(); // L: 1074
			} else if (gameState == 50) { // L: 1076
				ByteArrayPool.loginScreen(this, class1.fontPlain12); // L: 1077
				this.doCycleLoggedOut(); // L: 1078
			} else if (gameState == 25) { // L: 1080
				class269.method5365();
			}
		} else {
			ByteArrayPool.loginScreen(this, class1.fontPlain12);
		}

		if (gameState == 30) { // L: 1081
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) { // L: 1082
			this.doCycleLoggedOut();
		}

	} // L: 1083

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "8076"
	)
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = class65.method2027(); // L: 1087
		if (var2 && playingJingle && class241.pcmPlayer0 != null) { // L: 1088 1089
			class241.pcmPlayer0.tryDiscard();
		}

		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field678 && Language.method6232() > field678) { // L: 1091 1092
			WallDecoration.setWindowedMode(SceneTilePaint.getWindowedMode()); // L: 1093
		}

		int var3;
		if (var1) { // L: 1096
			for (var3 = 0; var3 < 100; ++var3) { // L: 1097
				field714[var3] = true;
			}
		}

		if (gameState == 0) { // L: 1099
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) { // L: 1100
			WorldMapLabelSize.drawTitle(class29.fontBold12, class156.fontPlain11, class1.fontPlain12);
		} else if (gameState != 10 && gameState != 11) { // L: 1101
			if (gameState == 20) { // L: 1102
				WorldMapLabelSize.drawTitle(class29.fontBold12, class156.fontPlain11, class1.fontPlain12);
			} else if (gameState == 50) { // L: 1103
				WorldMapLabelSize.drawTitle(class29.fontBold12, class156.fontPlain11, class1.fontPlain12);
			} else if (gameState == 25) { // L: 1104
				if (field774 == 1) { // L: 1105
					if (field523 > field585) { // L: 1106
						field585 = field523;
					}

					var3 = (field585 * 50 - field523 * 50) / field585; // L: 1107
					class146.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1108
				} else if (field774 == 2) { // L: 1110
					if (field558 > field559) { // L: 1111
						field559 = field558;
					}

					var3 = (field559 * 50 - field558 * 50) / field559 + 50; // L: 1112
					class146.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var3 + "%" + ")", false); // L: 1113
				} else {
					class146.drawLoadingMessage("Loading - please wait.", false); // L: 1115
				}
			} else if (gameState == 30) { // L: 1117
				this.drawLoggedIn();
			} else if (gameState == 40) { // L: 1118
				class146.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
			} else if (gameState == 45) { // L: 1119
				class146.drawLoadingMessage("Please wait...", false);
			}
		} else {
			WorldMapLabelSize.drawTitle(class29.fontBold12, class156.fontPlain11, class1.fontPlain12); // L: 1109
		}

		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) { // L: 1120
			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1121
				if (field556[var3]) { // L: 1122
					class20.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]); // L: 1123
					field556[var3] = false; // L: 1124
				}
			}
		} else if (gameState > 0) { // L: 1128
			class20.rasterProvider.drawFull(0, 0); // L: 1129

			for (var3 = 0; var3 < rootWidgetCount; ++var3) { // L: 1130
				field556[var3] = false;
			}
		}

	} // L: 1132

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1894132503"
	)
	@Export("kill0")
	protected final void kill0() {
		if (LoginType.varcs.hasUnwrittenChanges()) { // L: 1135
			LoginType.varcs.write();
		}

		if (class268.mouseRecorder != null) { // L: 1136
			class268.mouseRecorder.isRunning = false;
		}

		class268.mouseRecorder = null; // L: 1137
		packetWriter.close(); // L: 1138
		if (KeyHandler.KeyHandler_instance != null) { // L: 1140
			synchronized(KeyHandler.KeyHandler_instance) { // L: 1141
				KeyHandler.KeyHandler_instance = null; // L: 1142
			} // L: 1143
		}

		RouteStrategy.method4027(); // L: 1146
		class136.mouseWheel = null; // L: 1147
		if (class241.pcmPlayer0 != null) { // L: 1148
			class241.pcmPlayer0.shutdown();
		}

		if (pcmPlayer1 != null) { // L: 1149
			pcmPlayer1.shutdown();
		}

		class14.method196(); // L: 1150
		class139.method3104(); // L: 1151
		if (Messages.urlRequester != null) { // L: 1152
			Messages.urlRequester.close(); // L: 1153
			Messages.urlRequester = null; // L: 1154
		}

		try {
			JagexCache.JagexCache_dat2File.close(); // L: 1158

			for (int var3 = 0; var3 < JagexCache.idxCount; ++var3) { // L: 1159
				JagexCache.JagexCache_idxFiles[var3].close();
			}

			JagexCache.JagexCache_idx255File.close(); // L: 1160
			JagexCache.JagexCache_randomDat.close(); // L: 1161
		} catch (Exception var5) { // L: 1163
		}

		this.field531.method192(); // L: 1165
	} // L: 1166

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	protected final void vmethod1229() {
	} // L: 711

	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-27"
	)
	boolean method1190() {
		return AccessFile.field4662 != null && !AccessFile.field4662.trim().isEmpty() && WorldMapManager.field2773 != null && !WorldMapManager.field2773.trim().isEmpty(); // L: 898
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "659678762"
	)
	boolean method1191() {
		return this.field533 != null; // L: 902
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "204177750"
	)
	void method1586(String var1) throws IOException {
		HashMap var2 = new HashMap(); // L: 906
		var2.put("grant_type", "refresh_token"); // L: 907
		var2.put("scope", "gamesso.token.create"); // L: 908
		var2.put("refresh_token", var1); // L: 909
		URL var3 = new URL(Actor.field1164 + "shield/oauth/token" + (new class402(var2)).method7320()); // L: 910
		HashMap var4 = new HashMap(); // L: 911
		var4.put("Authorization", "Basic " + field661); // L: 912
		var4.put("Host", (new URL(Actor.field1164)).getHost()); // L: 913
		var4.put("Accept", class399.field4470.method7299()); // L: 914
		class9 var5 = class9.field34; // L: 915
		RefreshAccessTokenRequester var6 = this.field719; // L: 916
		if (var6 != null) { // L: 917
			this.field538 = var6.request(var5.method75(), var3, var4, ""); // L: 918
		} else {
			class10 var7 = new class10(var3, var5, this.field535); // L: 921
			Iterator var8 = var4.entrySet().iterator(); // L: 922

			while (var8.hasNext()) {
				Entry var9 = (Entry)var8.next(); // L: 923
				var7.method92((String)var9.getKey(), (String)var9.getValue()); // L: 925
			}

			this.field536 = this.field531.method188(var7); // L: 928
		}
	} // L: 919 929

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1756143445"
	)
	void method1193(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(Actor.field1164 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play"); // L: 932
		HashMap var3 = new HashMap(); // L: 933
		var3.put("Authorization", "Bearer " + var1); // L: 934
		class9 var4 = class9.field32; // L: 935
		OtlTokenRequester var5 = this.field533; // L: 936
		if (var5 != null) { // L: 937
			this.field515 = var5.request(var4.method75(), var2, var3, ""); // L: 938
		} else {
			class10 var6 = new class10(var2, var4, this.field535); // L: 941
			Iterator var7 = var3.entrySet().iterator(); // L: 942

			while (var7.hasNext()) {
				Entry var8 = (Entry)var7.next(); // L: 943
				var6.method92((String)var8.getKey(), (String)var8.getValue()); // L: 945
			}

			this.field576 = this.field531.method188(var6); // L: 948
		}
	} // L: 939 949

	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-125"
	)
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) { // L: 1211
			long var2 = Language.method6232(); // L: 1214
			int var4 = (int)(var2 - NetCache.field4058); // L: 1215
			NetCache.field4058 = var2; // L: 1216
			if (var4 > 200) { // L: 1217
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4; // L: 1218
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) { // L: 1219
				var1 = true; // L: 1220
			} else if (NetCache.NetCache_socket == null) { // L: 1223
				var1 = false; // L: 1224
			} else {
				try {
					label244: {
						if (NetCache.NetCache_loadTime > 30000) { // L: 1228
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) { // L: 1229
							var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first(); // L: 1230
							var6 = new Buffer(4); // L: 1231
							var6.writeByte(1); // L: 1232
							var6.writeMedium((int)var5.key); // L: 1233
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1234
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key); // L: 1235
							--NetCache.NetCache_pendingPriorityWritesCount; // L: 1236
							++NetCache.NetCache_pendingPriorityResponsesCount; // L: 1237
						}

						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) { // L: 1239
							var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast(); // L: 1240
							var6 = new Buffer(4); // L: 1241
							var6.writeByte(0); // L: 1242
							var6.writeMedium((int)var5.key); // L: 1243
							NetCache.NetCache_socket.write(var6.array, 0, 4); // L: 1244
							var5.removeDual(); // L: 1245
							NetCache.NetCache_pendingResponses.put(var5, var5.key); // L: 1246
							--NetCache.NetCache_pendingWritesCount; // L: 1247
							++NetCache.NetCache_pendingResponsesCount; // L: 1248
						}

						for (int var17 = 0; var17 < 100; ++var17) { // L: 1250
							int var18 = NetCache.NetCache_socket.available(); // L: 1251
							if (var18 < 0) { // L: 1252
								throw new IOException();
							}

							if (var18 == 0) { // L: 1253
								break;
							}

							NetCache.NetCache_loadTime = 0; // L: 1254
							byte var7 = 0; // L: 1255
							if (class135.NetCache_currentResponse == null) { // L: 1256
								var7 = 8;
							} else if (NetCache.field4075 == 0) { // L: 1257
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							byte[] var10000;
							int var10001;
							Buffer var24;
							if (var7 > 0) { // L: 1258
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset; // L: 1259
								if (var8 > var18) { // L: 1260
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8); // L: 1261
								if (NetCache.field4068 != 0) { // L: 1262
									for (var9 = 0; var9 < var8; ++var9) { // L: 1263
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var9;
										var10000[var10001] ^= NetCache.field4068;
									}
								}

								var24 = NetCache.NetCache_responseHeaderBuffer; // L: 1265
								var24.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) { // L: 1266
									break;
								}

								if (class135.NetCache_currentResponse == null) { // L: 1267
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1268
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1269
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort(); // L: 1270
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte(); // L: 1271
									int var12 = NetCache.NetCache_responseHeaderBuffer.readInt(); // L: 1272
									long var13 = (long)(var10 + (var9 << 16)); // L: 1273
									NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13); // L: 1274
									AbstractWorldMapIcon.field2886 = true; // L: 1275
									if (var15 == null) { // L: 1276
										var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13); // L: 1277
										AbstractWorldMapIcon.field2886 = false; // L: 1278
									}

									if (var15 == null) { // L: 1280
										throw new IOException(); // L: 1281
									}

									int var16 = var11 == 0 ? 5 : 9; // L: 1283
									class135.NetCache_currentResponse = var15; // L: 1284
									class20.NetCache_responseArchiveBuffer = new Buffer(var16 + var12 + class135.NetCache_currentResponse.padding); // L: 1285
									class20.NetCache_responseArchiveBuffer.writeByte(var11); // L: 1286
									class20.NetCache_responseArchiveBuffer.writeInt(var12); // L: 1287
									NetCache.field4075 = 8; // L: 1288
									NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1289
								} else if (NetCache.field4075 == 0) { // L: 1292
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) { // L: 1293
										NetCache.field4075 = 1; // L: 1294
										NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 1295
									} else {
										class135.NetCache_currentResponse = null; // L: 1299
									}
								}
							} else {
								var8 = class20.NetCache_responseArchiveBuffer.array.length - class135.NetCache_currentResponse.padding; // L: 1305
								var9 = 512 - NetCache.field4075; // L: 1306
								if (var9 > var8 - class20.NetCache_responseArchiveBuffer.offset) { // L: 1307
									var9 = var8 - class20.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) { // L: 1308
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class20.NetCache_responseArchiveBuffer.array, class20.NetCache_responseArchiveBuffer.offset, var9); // L: 1309
								if (NetCache.field4068 != 0) { // L: 1310
									for (var10 = 0; var10 < var9; ++var10) { // L: 1311
										var10000 = class20.NetCache_responseArchiveBuffer.array;
										var10001 = var10 + class20.NetCache_responseArchiveBuffer.offset;
										var10000[var10001] ^= NetCache.field4068;
									}
								}

								var24 = class20.NetCache_responseArchiveBuffer; // L: 1313
								var24.offset += var9;
								NetCache.field4075 += var9; // L: 1314
								if (var8 == class20.NetCache_responseArchiveBuffer.offset) { // L: 1315
									if (class135.NetCache_currentResponse.key == 16711935L) { // L: 1316
										MilliClock.field1810 = class20.NetCache_responseArchiveBuffer; // L: 1317

										for (var10 = 0; var10 < 256; ++var10) { // L: 1318
											Archive var19 = NetCache.NetCache_archives[var10]; // L: 1319
											if (var19 != null) { // L: 1320
												WorldMapID.method5123(var19, var10); // L: 1321
											}
										}
									} else {
										NetCache.NetCache_crc.reset(); // L: 1326
										NetCache.NetCache_crc.update(class20.NetCache_responseArchiveBuffer.array, 0, var8); // L: 1327
										var10 = (int)NetCache.NetCache_crc.getValue(); // L: 1328
										if (var10 != class135.NetCache_currentResponse.crc) { // L: 1329
											try {
												NetCache.NetCache_socket.close(); // L: 1331
											} catch (Exception var22) { // L: 1333
											}

											++NetCache.NetCache_crcMismatches; // L: 1334
											NetCache.NetCache_socket = null; // L: 1335
											NetCache.field4068 = (byte)((int)(Math.random() * 255.0D + 1.0D)); // L: 1336
											var1 = false; // L: 1337
											break label244;
										}

										NetCache.NetCache_crcMismatches = 0; // L: 1340
										NetCache.NetCache_ioExceptions = 0; // L: 1341
										class135.NetCache_currentResponse.archive.write((int)(class135.NetCache_currentResponse.key & 65535L), class20.NetCache_responseArchiveBuffer.array, (class135.NetCache_currentResponse.key & 16711680L) == 16711680L, AbstractWorldMapIcon.field2886); // L: 1342
									}

									class135.NetCache_currentResponse.remove(); // L: 1344
									if (AbstractWorldMapIcon.field2886) { // L: 1345
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount; // L: 1346
									}

									NetCache.field4075 = 0; // L: 1347
									class135.NetCache_currentResponse = null; // L: 1348
									class20.NetCache_responseArchiveBuffer = null; // L: 1349
								} else {
									if (NetCache.field4075 != 512) { // L: 1351
										break;
									}

									NetCache.field4075 = 0;
								}
							}
						}

						var1 = true; // L: 1355
					}
				} catch (IOException var23) {
					try {
						NetCache.NetCache_socket.close(); // L: 1359
					} catch (Exception var21) { // L: 1361
					}

					++NetCache.NetCache_ioExceptions; // L: 1362
					NetCache.NetCache_socket = null; // L: 1363
					var1 = false; // L: 1364
				}
			}

			if (!var1) { // L: 1368
				this.doCycleJs5Connect();
			}

		}
	} // L: 1369

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) { // L: 1372
			this.error("js5crc"); // L: 1373
			Coord.updateGameState(1000); // L: 1374
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) { // L: 1377
				if (gameState <= 5) { // L: 1378
					this.error("js5io"); // L: 1379
					Coord.updateGameState(1000); // L: 1380
					return; // L: 1381
				}

				field522 = 3000; // L: 1384
				NetCache.NetCache_ioExceptions = 3; // L: 1385
			}

			if (--field522 + 1 <= 0) { // L: 1388
				try {
					if (js5ConnectState == 0) { // L: 1390
						HealthBarDefinition.js5SocketTask = class11.taskHandler.newSocketTask(WorldMapLabelSize.worldHost, BuddyRankComparator.currentPort); // L: 1391
						++js5ConnectState; // L: 1392
					}

					if (js5ConnectState == 1) { // L: 1394
						if (HealthBarDefinition.js5SocketTask.status == 2) { // L: 1395
							this.js5Error(-1); // L: 1396
							return; // L: 1397
						}

						if (HealthBarDefinition.js5SocketTask.status == 1) { // L: 1399
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) { // L: 1401
						Socket var2 = (Socket)HealthBarDefinition.js5SocketTask.result; // L: 1403
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000); // L: 1405
						WorldMapLabelSize.js5Socket = var1; // L: 1407
						Buffer var3 = new Buffer(5); // L: 1408
						var3.writeByte(15); // L: 1409
						var3.writeInt(208); // L: 1410
						WorldMapLabelSize.js5Socket.write(var3.array, 0, 5); // L: 1411
						++js5ConnectState; // L: 1412
						Projectile.field949 = Language.method6232(); // L: 1413
					}

					if (js5ConnectState == 3) { // L: 1415
						if (WorldMapLabelSize.js5Socket.available() > 0) { // L: 1416
							int var4 = WorldMapLabelSize.js5Socket.readUnsignedByte(); // L: 1417
							if (var4 != 0) { // L: 1418
								this.js5Error(var4); // L: 1419
								return; // L: 1420
							}

							++js5ConnectState; // L: 1422
						} else if (Language.method6232() - Projectile.field949 > 30000L) { // L: 1425
							this.js5Error(-2); // L: 1426
							return; // L: 1427
						}
					}

					if (js5ConnectState == 4) { // L: 1431
						class182.method3703(WorldMapLabelSize.js5Socket, gameState > 20); // L: 1432
						HealthBarDefinition.js5SocketTask = null; // L: 1433
						WorldMapLabelSize.js5Socket = null; // L: 1434
						js5ConnectState = 0; // L: 1435
						js5Errors = 0; // L: 1436
					}
				} catch (IOException var5) { // L: 1439
					this.js5Error(-3); // L: 1440
				}

			}
		}
	} // L: 1375 1442

	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-725482489"
	)
	@Export("js5Error")
	void js5Error(int var1) {
		HealthBarDefinition.js5SocketTask = null; // L: 1445
		WorldMapLabelSize.js5Socket = null; // L: 1446
		js5ConnectState = 0; // L: 1447
		if (BuddyRankComparator.currentPort == NPC.worldPort) { // L: 1448
			BuddyRankComparator.currentPort = TaskHandler.js5Port;
		} else {
			BuddyRankComparator.currentPort = NPC.worldPort; // L: 1449
		}

		++js5Errors; // L: 1450
		if (js5Errors < 2 || var1 != 7 && var1 != 9) { // L: 1451
			if (js5Errors >= 2 && var1 == 6) { // L: 1458
				this.error("js5connect_outofdate"); // L: 1459
				Coord.updateGameState(1000); // L: 1460
			} else if (js5Errors >= 4) { // L: 1462
				if (gameState <= 5) { // L: 1463
					this.error("js5connect"); // L: 1464
					Coord.updateGameState(1000); // L: 1465
				} else {
					field522 = 3000; // L: 1467
				}
			}
		} else if (gameState <= 5) { // L: 1452
			this.error("js5connect_full"); // L: 1453
			Coord.updateGameState(1000); // L: 1454
		} else {
			field522 = 3000; // L: 1456
		}

	} // L: 1469

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2142038163"
	)
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket(); // L: 1906
		PacketBuffer var2 = packetWriter.packetBuffer; // L: 1907

		try {
			if (loginState == 0) { // L: 1909
				if (class29.secureRandom == null && (secureRandomFuture.isDone() || field525 > 250)) { // L: 1910
					class29.secureRandom = secureRandomFuture.get(); // L: 1911
					secureRandomFuture.shutdown(); // L: 1912
					secureRandomFuture = null; // L: 1913
				}

				if (class29.secureRandom != null) { // L: 1915
					if (var1 != null) { // L: 1916
						((AbstractSocket)var1).close(); // L: 1917
						var1 = null; // L: 1918
					}

					Clock.socketTask = null; // L: 1920
					hadNetworkError = false; // L: 1921
					field525 = 0; // L: 1922
					if (field639.method8184()) { // L: 1923
						try {
							this.method1586(WorldMapManager.field2773); // L: 1925
							class142.method3196(21); // L: 1926
						} catch (Throwable var29) { // L: 1928
							Clock.RunException_sendStackTrace((String)null, var29); // L: 1929
							class12.getLoginError(65); // L: 1930
							return; // L: 1931
						}
					} else {
						class142.method3196(1); // L: 1935
					}
				}
			}

			class21 var32;
			if (loginState == 21) { // L: 1939
				if (this.field538 != null) { // L: 1940
					if (!this.field538.isDone()) { // L: 1941
						return; // L: 1942
					}

					if (this.field538.isCancelled()) { // L: 1944
						class12.getLoginError(65); // L: 1945
						this.field538 = null; // L: 1946
						return; // L: 1947
					}

					try {
						RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field538.get(); // L: 1950
						if (!var3.isSuccess()) { // L: 1951
							class12.getLoginError(65); // L: 1952
							this.field538 = null; // L: 1953
							return; // L: 1954
						}

						AccessFile.field4662 = var3.getAccessToken(); // L: 1956
						WorldMapManager.field2773 = var3.getRefreshToken(); // L: 1957
						this.field538 = null; // L: 1958
					} catch (Exception var28) { // L: 1960
						Clock.RunException_sendStackTrace((String)null, var28); // L: 1961
						class12.getLoginError(65); // L: 1962
						this.field538 = null; // L: 1963
						return; // L: 1964
					}
				} else {
					if (this.field536 == null) { // L: 1967
						class12.getLoginError(65); // L: 1997
						return; // L: 1998
					}

					if (!this.field536.method291()) { // L: 1968
						return; // L: 1969
					}

					if (this.field536.method289()) { // L: 1971
						Clock.RunException_sendStackTrace(this.field536.method288(), (Throwable)null); // L: 1972
						class12.getLoginError(65); // L: 1973
						this.field536 = null; // L: 1974
						return; // L: 1975
					}

					var32 = this.field536.method286(); // L: 1977
					if (var32.method306() != 200) { // L: 1978
						class12.getLoginError(65); // L: 1979
						this.field536 = null; // L: 1980
						return; // L: 1981
					}

					field525 = 0; // L: 1983
					class401 var4 = new class401(var32.method307()); // L: 1984

					try {
						AccessFile.field4662 = var4.method7307().getString("access_token"); // L: 1986
						WorldMapManager.field2773 = var4.method7307().getString("refresh_token"); // L: 1987
					} catch (Exception var27) { // L: 1989
						Clock.RunException_sendStackTrace("Error parsing tokens", var27); // L: 1990
						class12.getLoginError(65); // L: 1991
						this.field536 = null; // L: 1992
						return; // L: 1993
					}
				}

				this.method1193(AccessFile.field4662); // L: 2000
				class142.method3196(20); // L: 2001
			}

			if (loginState == 20) { // L: 2003
				if (this.field515 != null) { // L: 2004
					if (!this.field515.isDone()) { // L: 2005
						return; // L: 2006
					}

					if (this.field515.isCancelled()) { // L: 2008
						class12.getLoginError(65); // L: 2009
						this.field515 = null; // L: 2010
						return; // L: 2011
					}

					try {
						OtlTokenResponse var33 = (OtlTokenResponse)this.field515.get(); // L: 2014
						if (!var33.isSuccess()) { // L: 2015
							class12.getLoginError(65); // L: 2016
							this.field515 = null; // L: 2017
							return; // L: 2018
						}

						this.field530 = var33.getToken(); // L: 2020
						this.field515 = null; // L: 2021
					} catch (Exception var26) { // L: 2023
						Clock.RunException_sendStackTrace((String)null, var26); // L: 2024
						class12.getLoginError(65); // L: 2025
						this.field515 = null; // L: 2026
						return; // L: 2027
					}
				} else {
					if (this.field576 == null) { // L: 2030
						class12.getLoginError(65); // L: 2051
						return; // L: 2052
					}

					if (!this.field576.method291()) { // L: 2031
						return; // L: 2032
					}

					if (this.field576.method289()) { // L: 2034
						Clock.RunException_sendStackTrace(this.field576.method288(), (Throwable)null); // L: 2035
						class12.getLoginError(65); // L: 2036
						this.field576 = null; // L: 2037
						return; // L: 2038
					}

					var32 = this.field576.method286(); // L: 2040
					if (var32.method306() != 200) { // L: 2041
						Clock.RunException_sendStackTrace("Response code: " + var32.method306() + "Response body: " + var32.method307(), (Throwable)null); // L: 2042
						class12.getLoginError(65); // L: 2043
						this.field576 = null; // L: 2044
						return; // L: 2045
					}

					this.field530 = var32.method307(); // L: 2047
					this.field576 = null; // L: 2048
				}

				field525 = 0; // L: 2054
				class142.method3196(1); // L: 2055
			}

			if (loginState == 1) { // L: 2057
				if (Clock.socketTask == null) { // L: 2058
					Clock.socketTask = class11.taskHandler.newSocketTask(WorldMapLabelSize.worldHost, BuddyRankComparator.currentPort); // L: 2059
				}

				if (Clock.socketTask.status == 2) { // L: 2061
					throw new IOException();
				}

				if (Clock.socketTask.status == 1) { // L: 2062
					Socket var34 = (Socket)Clock.socketTask.result; // L: 2064
					BufferedNetSocket var35 = new BufferedNetSocket(var34, 40000, 5000); // L: 2066
					var1 = var35; // L: 2068
					packetWriter.setSocket(var35); // L: 2069
					Clock.socketTask = null; // L: 2070
					class142.method3196(2); // L: 2071
				}
			}

			PacketBufferNode var36;
			if (loginState == 2) { // L: 2074
				packetWriter.clearBuffer(); // L: 2075
				var36 = PcmPlayer.method795(); // L: 2078
				var36.clientPacket = null; // L: 2079
				var36.clientPacketLength = 0; // L: 2080
				var36.packetBuffer = new PacketBuffer(5000); // L: 2081
				var36.packetBuffer.writeByte(LoginPacket.field3182.id); // L: 2085
				packetWriter.addNode(var36); // L: 2086
				packetWriter.flush(); // L: 2087
				var2.offset = 0; // L: 2088
				class142.method3196(3); // L: 2089
			}

			int var15;
			if (loginState == 3) { // L: 2091
				if (class241.pcmPlayer0 != null) { // L: 2092
					class241.pcmPlayer0.method774();
				}

				if (pcmPlayer1 != null) { // L: 2093
					pcmPlayer1.method774();
				}

				if (((AbstractSocket)var1).isAvailable(1)) { // L: 2094
					var15 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2095
					if (class241.pcmPlayer0 != null) { // L: 2096
						class241.pcmPlayer0.method774();
					}

					if (pcmPlayer1 != null) { // L: 2097
						pcmPlayer1.method774();
					}

					if (var15 != 0) { // L: 2098
						class12.getLoginError(var15); // L: 2099
						return; // L: 2100
					}

					var2.offset = 0; // L: 2102
					class142.method3196(4); // L: 2103
				}
			}

			if (loginState == 4) { // L: 2106
				if (var2.offset < 8) { // L: 2107
					var15 = ((AbstractSocket)var1).available(); // L: 2108
					if (var15 > 8 - var2.offset) { // L: 2109
						var15 = 8 - var2.offset;
					}

					if (var15 > 0) { // L: 2110
						((AbstractSocket)var1).read(var2.array, var2.offset, var15); // L: 2111
						var2.offset += var15; // L: 2112
					}
				}

				if (var2.offset == 8) { // L: 2115
					var2.offset = 0; // L: 2116
					class6.field16 = var2.readLong(); // L: 2117
					class142.method3196(5); // L: 2118
				}
			}

			if (loginState == 5) { // L: 2121
				packetWriter.packetBuffer.offset = 0; // L: 2122
				packetWriter.clearBuffer(); // L: 2123
				PacketBuffer var37 = new PacketBuffer(500); // L: 2124
				int[] var38 = new int[]{class29.secureRandom.nextInt(), class29.secureRandom.nextInt(), class29.secureRandom.nextInt(), class29.secureRandom.nextInt()}; // L: 2125 2126 2127 2128 2129
				var37.offset = 0; // L: 2130
				var37.writeByte(1); // L: 2131
				var37.writeInt(var38[0]); // L: 2132
				var37.writeInt(var38[1]); // L: 2133
				var37.writeInt(var38[2]); // L: 2134
				var37.writeInt(var38[3]); // L: 2135
				var37.writeLong(class6.field16); // L: 2136
				int var9;
				if (gameState == 40) { // L: 2137
					var37.writeInt(class29.field176[0]); // L: 2138
					var37.writeInt(class29.field176[1]); // L: 2139
					var37.writeInt(class29.field176[2]); // L: 2140
					var37.writeInt(class29.field176[3]); // L: 2141
				} else {
					if (gameState == 50) { // L: 2144
						var37.writeByte(class125.field1540.rsOrdinal()); // L: 2145
						var37.writeInt(MusicPatchNode2.field3223); // L: 2146
					} else {
						var37.writeByte(field528.rsOrdinal()); // L: 2149
						switch(field528.field1544) { // L: 2150
						case 0:
						case 3:
							var37.writeMedium(class347.field4201); // L: 2159
							++var37.offset; // L: 2160
							break; // L: 2161
						case 1:
							LinkedHashMap var6 = Player.clientPreferences.parameters; // L: 2166
							String var8 = Login.Login_username; // L: 2168
							var9 = var8.length(); // L: 2170
							int var10 = 0; // L: 2171

							for (int var11 = 0; var11 < var9; ++var11) { // L: 2172
								var10 = (var10 << 5) - var10 + var8.charAt(var11);
							}

							var37.writeInt((Integer)var6.get(var10)); // L: 2175
						case 2:
						default:
							break;
						case 4:
							var37.offset += 4; // L: 2153
						}
					}

					if (field639.method8184()) { // L: 2180
						var37.writeByte(class448.field4785.rsOrdinal()); // L: 2181
						var37.writeStringCp1252NullTerminated(this.field530); // L: 2182
					} else {
						var37.writeByte(class448.field4784.rsOrdinal()); // L: 2185
						var37.writeStringCp1252NullTerminated(Login.Login_password); // L: 2186
					}
				}

				var37.encryptRsa(class67.field884, class67.field885); // L: 2189
				class29.field176 = var38; // L: 2190
				PacketBufferNode var44 = PcmPlayer.method795(); // L: 2193
				var44.clientPacket = null; // L: 2194
				var44.clientPacketLength = 0; // L: 2195
				var44.packetBuffer = new PacketBuffer(5000); // L: 2196
				var44.packetBuffer.offset = 0; // L: 2200
				if (gameState == 40) { // L: 2201
					var44.packetBuffer.writeByte(LoginPacket.field3179.id); // L: 2202
				} else {
					var44.packetBuffer.writeByte(LoginPacket.field3187.id); // L: 2205
				}

				var44.packetBuffer.writeShort(0); // L: 2207
				int var7 = var44.packetBuffer.offset; // L: 2208
				var44.packetBuffer.writeInt(208); // L: 2209
				var44.packetBuffer.writeInt(1); // L: 2210
				var44.packetBuffer.writeByte(clientType); // L: 2211
				var44.packetBuffer.writeByte(field571); // L: 2212
				byte var16 = 0; // L: 2213
				var44.packetBuffer.writeByte(var16); // L: 2214
				var44.packetBuffer.writeBytes(var37.array, 0, var37.offset); // L: 2215
				var9 = var44.packetBuffer.offset; // L: 2216
				var44.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username); // L: 2217
				var44.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0)); // L: 2218
				var44.packetBuffer.writeShort(class123.canvasWidth); // L: 2219
				var44.packetBuffer.writeShort(class166.canvasHeight); // L: 2220
				PacketBuffer var17 = var44.packetBuffer; // L: 2221
				int var13;
				if (randomDatData != null) { // L: 2223
					var17.writeBytes(randomDatData, 0, randomDatData.length); // L: 2224
				} else {
					byte[] var12 = new byte[24]; // L: 2229

					try {
						JagexCache.JagexCache_randomDat.seek(0L); // L: 2231
						JagexCache.JagexCache_randomDat.readFully(var12); // L: 2232

						for (var13 = 0; var13 < 24 && var12[var13] == 0; ++var13) { // L: 2233 2234 2235
						}

						if (var13 >= 24) { // L: 2237
							throw new IOException();
						}
					} catch (Exception var30) {
						for (int var14 = 0; var14 < 24; ++var14) { // L: 2240
							var12[var14] = -1;
						}
					}

					var17.writeBytes(var12, 0, var12.length); // L: 2245
				}

				var44.packetBuffer.writeStringCp1252NullTerminated(AttackOption.field1279); // L: 2247
				var44.packetBuffer.writeInt(UserComparator10.field1393); // L: 2248
				Buffer var19 = new Buffer(class9.platformInfo.size()); // L: 2249
				class9.platformInfo.write(var19); // L: 2250
				var44.packetBuffer.writeBytes(var19.array, 0, var19.array.length); // L: 2251
				var44.packetBuffer.writeByte(clientType); // L: 2252
				var44.packetBuffer.writeInt(0); // L: 2253
				var44.packetBuffer.writeIntLE(HealthBar.archive17.hash); // L: 2254
				var44.packetBuffer.writeIntME(UserComparator10.archive4.hash); // L: 2255
				var44.packetBuffer.writeIntIME(UserList.archive13.hash); // L: 2256
				var44.packetBuffer.writeInt(class283.field3325.hash); // L: 2257
				var44.packetBuffer.writeIntIME(0); // L: 2258
				var44.packetBuffer.writeIntIME(UserComparator10.archive19.hash); // L: 2259
				var44.packetBuffer.writeInt(DevicePcmPlayerProvider.archive5.hash); // L: 2260
				var44.packetBuffer.writeInt(class163.archive10.hash); // L: 2261
				var44.packetBuffer.writeIntIME(class119.archive2.hash); // L: 2262
				var44.packetBuffer.writeIntME(ChatChannel.archive8.hash); // L: 2263
				var44.packetBuffer.writeIntLE(class301.archive7.hash); // L: 2264
				var44.packetBuffer.writeIntLE(Huffman.archive20.hash); // L: 2265
				var44.packetBuffer.writeInt(HorizontalAlignment.field1926.hash); // L: 2266
				var44.packetBuffer.writeInt(class83.field1081.hash); // L: 2267
				var44.packetBuffer.writeIntME(class14.archive6.hash); // L: 2268
				var44.packetBuffer.writeInt(class14.archive14.hash); // L: 2269
				var44.packetBuffer.writeIntIME(class434.archive9.hash); // L: 2270
				var44.packetBuffer.writeInt(FaceNormal.archive11.hash); // L: 2271
				var44.packetBuffer.writeIntIME(class19.archive15.hash); // L: 2272
				var44.packetBuffer.writeIntLE(class102.archive12.hash); // L: 2273
				var44.packetBuffer.writeIntME(class67.archive18.hash); // L: 2274
				var44.packetBuffer.xteaEncrypt(var38, var9, var44.packetBuffer.offset); // L: 2275
				var44.packetBuffer.writeLengthShort(var44.packetBuffer.offset - var7); // L: 2276
				packetWriter.addNode(var44); // L: 2277
				packetWriter.flush(); // L: 2278
				packetWriter.isaacCipher = new IsaacCipher(var38); // L: 2279
				int[] var46 = new int[4]; // L: 2280

				for (var13 = 0; var13 < 4; ++var13) { // L: 2281
					var46[var13] = var38[var13] + 50;
				}

				var2.newIsaacCipher(var46); // L: 2282
				class142.method3196(6); // L: 2283
			}

			int var20;
			if (loginState == 6 && ((AbstractSocket)var1).available() > 0) { // L: 2285 2286
				var15 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2287
				if (var15 == 61) { // L: 2288
					var20 = ((AbstractSocket)var1).available(); // L: 2289
					UserComparator9.field1387 = var20 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2290
					class142.method3196(5); // L: 2291
				}

				if (var15 == 21 && gameState == 20) { // L: 2293
					class142.method3196(12); // L: 2294
				} else if (var15 == 2) { // L: 2296
					class142.method3196(14); // L: 2297
				} else if (var15 == 15 && gameState == 40) { // L: 2299
					packetWriter.serverPacketLength = -1; // L: 2300
					class142.method3196(19); // L: 2301
				} else if (var15 == 64) { // L: 2303
					class142.method3196(10); // L: 2304
				} else if (var15 == 23 && field526 < 1) { // L: 2306
					++field526; // L: 2307
					class142.method3196(0); // L: 2308
				} else if (var15 == 29) { // L: 2310
					class142.method3196(17); // L: 2311
				} else {
					if (var15 != 69) { // L: 2313
						class12.getLoginError(var15); // L: 2317
						return; // L: 2318
					}

					class142.method3196(7); // L: 2314
				}
			}

			if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) { // L: 2322 2323
				((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2324
				var2.offset = 0; // L: 2325
				FillMode.field4809 = var2.readUnsignedShort(); // L: 2326
				class142.method3196(8); // L: 2327
			}

			if (loginState == 8 && ((AbstractSocket)var1).available() >= FillMode.field4809) { // L: 2330 2331
				var2.offset = 0; // L: 2332
				((AbstractSocket)var1).read(var2.array, var2.offset, FillMode.field4809); // L: 2333
				class6 var39 = class117.method2863()[var2.readUnsignedByte()]; // L: 2334

				try {
					class3 var40 = method1723(var39); // L: 2336
					this.field721 = new class7(var2, var40); // L: 2337
					class142.method3196(9); // L: 2338
				} catch (Exception var25) { // L: 2340
					class12.getLoginError(22); // L: 2341
					return; // L: 2342
				}
			}

			if (loginState == 9 && this.field721.method51()) { // L: 2346 2347
				this.field542 = this.field721.method55(); // L: 2348
				this.field721.method52(); // L: 2349
				this.field721 = null; // L: 2350
				if (this.field542 == null) { // L: 2351
					class12.getLoginError(22); // L: 2352
					return; // L: 2353
				}

				packetWriter.clearBuffer(); // L: 2355
				var36 = PcmPlayer.method795(); // L: 2358
				var36.clientPacket = null; // L: 2359
				var36.clientPacketLength = 0; // L: 2360
				var36.packetBuffer = new PacketBuffer(5000); // L: 2361
				var36.packetBuffer.writeByte(LoginPacket.field3183.id); // L: 2365
				var36.packetBuffer.writeShort(this.field542.offset); // L: 2366
				var36.packetBuffer.writeBuffer(this.field542); // L: 2367
				packetWriter.addNode(var36); // L: 2368
				packetWriter.flush(); // L: 2369
				this.field542 = null; // L: 2370
				class142.method3196(6); // L: 2371
			}

			if (loginState == 10 && ((AbstractSocket)var1).available() > 0) { // L: 2374 2375
				ScriptFrame.field464 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2376
				class142.method3196(11); // L: 2377
			}

			if (loginState == 11 && ((AbstractSocket)var1).available() >= ScriptFrame.field464) { // L: 2380 2381
				((AbstractSocket)var1).read(var2.array, 0, ScriptFrame.field464); // L: 2382
				var2.offset = 0; // L: 2383
				class142.method3196(6); // L: 2384
			}

			if (loginState == 12 && ((AbstractSocket)var1).available() > 0) { // L: 2387 2388
				field527 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60; // L: 2389
				class142.method3196(13); // L: 2390
			}

			if (loginState == 13) { // L: 2393
				field525 = 0; // L: 2394
				SecureRandomCallable.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field527 / 60 + " seconds."); // L: 2395
				if (--field527 <= 0) { // L: 2396
					class142.method3196(0);
				}

			} else {
				if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) { // L: 2399 2400
					class9.field31 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2401
					class142.method3196(15); // L: 2402
				}

				if (loginState == 15 && ((AbstractSocket)var1).available() >= class9.field31) { // L: 2405 2406
					boolean var47 = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2407
					((AbstractSocket)var1).read(var2.array, 0, 4); // L: 2408
					var2.offset = 0; // L: 2409
					boolean var48 = false; // L: 2410
					if (var47) { // L: 2411
						var20 = var2.readByteIsaac() << 24; // L: 2412
						var20 |= var2.readByteIsaac() << 16; // L: 2413
						var20 |= var2.readByteIsaac() << 8; // L: 2414
						var20 |= var2.readByteIsaac(); // L: 2415
						int var21 = Skeleton.method4255(Login.Login_username); // L: 2416
						if (Player.clientPreferences.parameters.size() >= 10 && !Player.clientPreferences.parameters.containsKey(var21)) { // L: 2417 2418
							Iterator var45 = Player.clientPreferences.parameters.entrySet().iterator(); // L: 2419
							var45.next(); // L: 2420
							var45.remove(); // L: 2421
						}

						Player.clientPreferences.parameters.put(var21, var20); // L: 2424
					}

					if (Login_isUsernameRemembered) { // L: 2426
						Player.clientPreferences.method2406(Login.Login_username); // L: 2427
					} else {
						Player.clientPreferences.method2406((String)null); // L: 2430
					}

					GrandExchangeOfferAgeComparator.savePreferences(); // L: 2432
					staffModLevel = ((AbstractSocket)var1).readUnsignedByte(); // L: 2433
					playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1; // L: 2434
					localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte(); // L: 2435
					localPlayerIndex <<= 8; // L: 2436
					localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte(); // L: 2437
					field621 = ((AbstractSocket)var1).readUnsignedByte(); // L: 2438
					((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2439
					var2.offset = 0; // L: 2440
					this.field710 = var2.readLong(); // L: 2441
					if (class9.field31 >= 29) { // L: 2442
						((AbstractSocket)var1).read(var2.array, 0, 8); // L: 2443
						var2.offset = 0; // L: 2444
						field498 = var2.readLong(); // L: 2445
					}

					((AbstractSocket)var1).read(var2.array, 0, 1); // L: 2447
					var2.offset = 0; // L: 2448
					ServerPacket[] var5 = WorldMapEvent.ServerPacket_values(); // L: 2449
					int var22 = var2.readSmartByteShortIsaac(); // L: 2450
					if (var22 < 0 || var22 >= var5.length) { // L: 2451
						throw new IOException(var22 + " " + var2.offset);
					}

					packetWriter.serverPacket = var5[var22]; // L: 2452
					packetWriter.serverPacketLength = packetWriter.serverPacket.length; // L: 2453
					((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2454
					var2.offset = 0; // L: 2455
					packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2456

					try {
						class27.method404(IgnoreList.client, "zap"); // L: 2458
					} catch (Throwable var24) { // L: 2460
					}

					class142.method3196(16); // L: 2461
				}

				if (loginState == 16) { // L: 2464
					if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2465
						var2.offset = 0; // L: 2466
						((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2467
						timer.method6701(); // L: 2468
						class11.method113(); // L: 2469
						RouteStrategy.updatePlayer(var2); // L: 2470
						class6.field17 = -1; // L: 2471
						class114.loadRegions(false, var2); // L: 2472
						packetWriter.serverPacket = null; // L: 2473
					}

				} else {
					if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) { // L: 2477 2478
						var2.offset = 0; // L: 2479
						((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2480
						var2.offset = 0; // L: 2481
						class97.field1320 = var2.readUnsignedShort(); // L: 2482
						class142.method3196(18); // L: 2483
					}

					if (loginState == 18 && ((AbstractSocket)var1).available() >= class97.field1320) { // L: 2486 2487
						var2.offset = 0; // L: 2488
						((AbstractSocket)var1).read(var2.array, 0, class97.field1320); // L: 2489
						var2.offset = 0; // L: 2490
						String var41 = var2.readStringCp1252NullTerminated(); // L: 2491
						String var43 = var2.readStringCp1252NullTerminated(); // L: 2492
						String var42 = var2.readStringCp1252NullTerminated(); // L: 2493
						SecureRandomCallable.setLoginResponseString(var41, var43, var42); // L: 2494
						Coord.updateGameState(10); // L: 2495
						if (field639.method8184()) { // L: 2496
							class139.method3101(9); // L: 2497
						}
					}

					if (loginState == 19) { // L: 2501
						if (packetWriter.serverPacketLength == -1) { // L: 2502
							if (((AbstractSocket)var1).available() < 2) { // L: 2503
								return;
							}

							((AbstractSocket)var1).read(var2.array, 0, 2); // L: 2504
							var2.offset = 0; // L: 2505
							packetWriter.serverPacketLength = var2.readUnsignedShort(); // L: 2506
						}

						if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) { // L: 2508
							((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength); // L: 2509
							var2.offset = 0; // L: 2510
							var15 = packetWriter.serverPacketLength; // L: 2511
							timer.method6725(); // L: 2512
							class343.method6444(); // L: 2513
							RouteStrategy.updatePlayer(var2); // L: 2514
							if (var15 != var2.offset) { // L: 2515
								throw new RuntimeException(); // L: 2516
							}
						}
					} else {
						++field525; // L: 2520
						if (field525 > 2000) { // L: 2521
							if (field526 < 1) { // L: 2522
								if (NPC.worldPort == BuddyRankComparator.currentPort) { // L: 2523
									BuddyRankComparator.currentPort = TaskHandler.js5Port;
								} else {
									BuddyRankComparator.currentPort = NPC.worldPort; // L: 2524
								}

								++field526; // L: 2525
								class142.method3196(0); // L: 2526
							} else {
								class12.getLoginError(-3); // L: 2529
							}
						}
					}
				}
			}
		} catch (IOException var31) { // L: 2533
			if (field526 < 1) { // L: 2534
				if (NPC.worldPort == BuddyRankComparator.currentPort) { // L: 2535
					BuddyRankComparator.currentPort = TaskHandler.js5Port;
				} else {
					BuddyRankComparator.currentPort = NPC.worldPort; // L: 2536
				}

				++field526; // L: 2537
				class142.method3196(0); // L: 2538
			} else {
				class12.getLoginError(-2); // L: 2541
			}
		}
	} // L: 2397 2475 2518 2527 2530 2539 2542 2544

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "695049263"
	)
	@Export("doCycleLoggedIn")
	final void doCycleLoggedIn() {
		if (rebootTimer > 1) { // L: 2914
			--rebootTimer;
		}

		if (logoutTimer > 0) { // L: 2915
			--logoutTimer;
		}

		if (hadNetworkError) { // L: 2916
			hadNetworkError = false; // L: 2917
			class67.method2033(); // L: 2918
		} else {
			if (!isMenuOpen) { // L: 2921
				FloorOverlayDefinition.addCancelMenuEntry();
			}

			for (int var1 = 0; var1 < 100 && this.method1447(packetWriter); ++var1) { // L: 2922 2923
			}

			if (gameState == 30) { // L: 2925
				int var2;
				PacketBufferNode var14;
				while (class153.method3318()) { // L: 2926
					var14 = class120.getPacketBufferNode(ClientPacket.field2960, packetWriter.isaacCipher); // L: 2927
					var14.packetBuffer.writeByte(0); // L: 2928
					var2 = var14.packetBuffer.offset; // L: 2929
					class130.performReflectionCheck(var14.packetBuffer); // L: 2930
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2); // L: 2931
					packetWriter.addNode(var14); // L: 2932
				}

				if (timer.field4265) { // L: 2934
					var14 = class120.getPacketBufferNode(ClientPacket.IF_BUTTON8, packetWriter.isaacCipher); // L: 2936
					var14.packetBuffer.writeByte(0); // L: 2937
					var2 = var14.packetBuffer.offset; // L: 2938
					timer.write(var14.packetBuffer); // L: 2939
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2); // L: 2940
					packetWriter.addNode(var14); // L: 2941
					timer.method6724(); // L: 2942
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var8;
				synchronized(class268.mouseRecorder.lock) { // L: 2945
					if (!field587) { // L: 2946
						class268.mouseRecorder.index = 0; // L: 3032
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class268.mouseRecorder.index >= 40) { // L: 2947
						PacketBufferNode var15 = null; // L: 2949
						var3 = 0; // L: 2950
						var4 = 0; // L: 2951
						var5 = 0; // L: 2952
						var6 = 0; // L: 2953

						for (var7 = 0; var7 < class268.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) { // L: 2954 2955
							var4 = var7; // L: 2956
							var8 = class268.mouseRecorder.ys[var7]; // L: 2957
							if (var8 < -1) { // L: 2958
								var8 = -1;
							} else if (var8 > 65534) { // L: 2959
								var8 = 65534;
							}

							int var9 = class268.mouseRecorder.xs[var7]; // L: 2960
							if (var9 < -1) { // L: 2961
								var9 = -1;
							} else if (var9 > 65534) { // L: 2962
								var9 = 65534;
							}

							if (var9 != field505 || var8 != field506) { // L: 2963
								if (var15 == null) { // L: 2966
									var15 = class120.getPacketBufferNode(ClientPacket.field2952, packetWriter.isaacCipher); // L: 2967
									var15.packetBuffer.writeByte(0); // L: 2968
									var3 = var15.packetBuffer.offset; // L: 2969
									PacketBuffer var10000 = var15.packetBuffer; // L: 2970
									var10000.offset += 2;
									var5 = 0; // L: 2971
									var6 = 0; // L: 2972
								}

								int var10;
								int var11;
								int var12;
								if (field507 != -1L) { // L: 2977
									var10 = var9 - field505; // L: 2978
									var11 = var8 - field506; // L: 2979
									var12 = (int)((class268.mouseRecorder.millis[var7] - field507) / 20L); // L: 2980
									var5 = (int)((long)var5 + (class268.mouseRecorder.millis[var7] - field507) % 20L); // L: 2981
								} else {
									var10 = var9; // L: 2984
									var11 = var8; // L: 2985
									var12 = Integer.MAX_VALUE; // L: 2986
								}

								field505 = var9; // L: 2988
								field506 = var8; // L: 2989
								if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) { // L: 2990
									var10 += 32; // L: 2991
									var11 += 32; // L: 2992
									var15.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6)); // L: 2993
								} else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) { // L: 2995
									var10 += 128; // L: 2996
									var11 += 128; // L: 2997
									var15.packetBuffer.writeByte(var12 + 128); // L: 2998
									var15.packetBuffer.writeShort(var11 + (var10 << 8)); // L: 2999
								} else if (var12 < 32) { // L: 3001
									var15.packetBuffer.writeByte(var12 + 192); // L: 3002
									if (var9 != -1 && var8 != -1) { // L: 3003
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3004
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344); // L: 3007
									if (var9 != -1 && var8 != -1) { // L: 3008
										var15.packetBuffer.writeInt(var9 | var8 << 16); // L: 3009
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6; // L: 3011
								field507 = class268.mouseRecorder.millis[var7]; // L: 3012
							}
						}

						if (var15 != null) { // L: 3014
							var15.packetBuffer.writeLengthByte(var15.packetBuffer.offset - var3); // L: 3015
							var7 = var15.packetBuffer.offset; // L: 3016
							var15.packetBuffer.offset = var3; // L: 3017
							var15.packetBuffer.writeByte(var5 / var6); // L: 3018
							var15.packetBuffer.writeByte(var5 % var6); // L: 3019
							var15.packetBuffer.offset = var7; // L: 3020
							packetWriter.addNode(var15); // L: 3021
						}

						if (var4 >= class268.mouseRecorder.index) { // L: 3023
							class268.mouseRecorder.index = 0;
						} else {
							MouseRecorder var40 = class268.mouseRecorder; // L: 3025
							var40.index -= var4;
							System.arraycopy(class268.mouseRecorder.xs, var4, class268.mouseRecorder.xs, 0, class268.mouseRecorder.index); // L: 3026
							System.arraycopy(class268.mouseRecorder.ys, var4, class268.mouseRecorder.ys, 0, class268.mouseRecorder.index); // L: 3027
							System.arraycopy(class268.mouseRecorder.millis, var4, class268.mouseRecorder.millis, 0, class268.mouseRecorder.index); // L: 3028
						}
					}
				}

				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !Renderable.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) { // L: 3034
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L; // L: 3035
					if (var16 > 32767L) { // L: 3036
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L; // L: 3037
					var3 = MouseHandler.MouseHandler_lastPressedY; // L: 3038
					if (var3 < 0) { // L: 3039
						var3 = 0;
					} else if (var3 > class166.canvasHeight) { // L: 3040
						var3 = class166.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX; // L: 3041
					if (var4 < 0) { // L: 3042
						var4 = 0;
					} else if (var4 > class123.canvasWidth) { // L: 3043
						var4 = class123.canvasWidth;
					}

					var5 = (int)var16; // L: 3044
					var18 = class120.getPacketBufferNode(ClientPacket.OPOBJT, packetWriter.isaacCipher); // L: 3045
					var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1)); // L: 3046
					var18.packetBuffer.writeShort(var4); // L: 3047
					var18.packetBuffer.writeShort(var3); // L: 3048
					packetWriter.addNode(var18); // L: 3049
				}

				if (KeyHandler.field141 > 0) { // L: 3051
					var14 = class120.getPacketBufferNode(ClientPacket.field3023, packetWriter.isaacCipher); // L: 3052
					var14.packetBuffer.writeShort(0); // L: 3053
					var2 = var14.packetBuffer.offset; // L: 3054
					long var19 = Language.method6232(); // L: 3055

					for (var5 = 0; var5 < KeyHandler.field141; ++var5) { // L: 3056
						long var21 = var19 - field733; // L: 3057
						if (var21 > 16777215L) { // L: 3058
							var21 = 16777215L;
						}

						field733 = var19; // L: 3059
						var14.packetBuffer.writeMediumLE((int)var21); // L: 3060
						var14.packetBuffer.writeByteNeg(KeyHandler.field140[var5]); // L: 3061
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2); // L: 3063
					packetWriter.addNode(var14); // L: 3064
				}

				if (field630 > 0) { // L: 3066
					--field630;
				}

				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3067
					field543 = true;
				}

				if (field543 && field630 <= 0) { // L: 3068
					field630 = 20; // L: 3069
					field543 = false; // L: 3070
					var14 = class120.getPacketBufferNode(ClientPacket.field2940, packetWriter.isaacCipher); // L: 3072
					var14.packetBuffer.writeShort(camAngleX); // L: 3073
					var14.packetBuffer.writeShortAddLE(camAngleY); // L: 3074
					packetWriter.addNode(var14); // L: 3075
				}

				if (class92.hasFocus && !hadFocus) { // L: 3077
					hadFocus = true; // L: 3078
					var14 = class120.getPacketBufferNode(ClientPacket.field3005, packetWriter.isaacCipher); // L: 3080
					var14.packetBuffer.writeByte(1); // L: 3081
					packetWriter.addNode(var14); // L: 3082
				}

				if (!class92.hasFocus && hadFocus) { // L: 3084
					hadFocus = false; // L: 3085
					var14 = class120.getPacketBufferNode(ClientPacket.field3005, packetWriter.isaacCipher); // L: 3087
					var14.packetBuffer.writeByte(0); // L: 3088
					packetWriter.addNode(var14); // L: 3089
				}

				if (Decimator.worldMap != null) { // L: 3092
					Decimator.worldMap.method7397();
				}

				TaskHandler.method3430(); // L: 3093
				if (SecureRandomFuture.field964) { // L: 3095
					class230.method5028(); // L: 3096
					SecureRandomFuture.field964 = false; // L: 3097
				}

				class175.method3615(); // L: 3100
				if (gameState == 30) { // L: 3101
					for (PendingSpawn var31 = (PendingSpawn)pendingSpawns.last(); var31 != null; var31 = (PendingSpawn)pendingSpawns.previous()) { // L: 3103 3104 3123
						if (var31.hitpoints > 0) { // L: 3105
							--var31.hitpoints;
						}

						if (var31.hitpoints == 0) { // L: 3106
							if (var31.objectId < 0 || UserComparator9.method2776(var31.objectId, var31.field1121)) { // L: 3107
								TaskHandler.addPendingSpawnToScene(var31.plane, var31.type, var31.x, var31.y, var31.objectId, var31.field1119, var31.field1121); // L: 3108
								var31.remove(); // L: 3109
							}
						} else {
							if (var31.delay > 0) { // L: 3113
								--var31.delay;
							}

							if (var31.delay == 0 && var31.x >= 1 && var31.y >= 1 && var31.x <= 102 && var31.y <= 102 && (var31.id < 0 || UserComparator9.method2776(var31.id, var31.field1123))) { // L: 3114 3115
								TaskHandler.addPendingSpawnToScene(var31.plane, var31.type, var31.x, var31.y, var31.id, var31.orientation, var31.field1123); // L: 3116
								var31.delay = -1; // L: 3117
								if (var31.objectId == var31.id && var31.objectId == -1) { // L: 3118
									var31.remove();
								} else if (var31.id == var31.objectId && var31.field1119 == var31.orientation && var31.field1123 == var31.field1121) { // L: 3119
									var31.remove();
								}
							}
						}
					}

					class390.method7252(); // L: 3126
					++packetWriter.field1349; // L: 3127
					if (packetWriter.field1349 > 750) { // L: 3128
						class67.method2033(); // L: 3129
					} else {
						FloorUnderlayDefinition.method3692(); // L: 3132
						class360.method6734(); // L: 3133
						int[] var32 = Players.Players_indices; // L: 3135

						for (var2 = 0; var2 < Players.Players_count; ++var2) { // L: 3136
							Player var23 = players[var32[var2]]; // L: 3137
							if (var23 != null && var23.overheadTextCyclesRemaining > 0) { // L: 3138
								--var23.overheadTextCyclesRemaining; // L: 3139
								if (var23.overheadTextCyclesRemaining == 0) { // L: 3140
									var23.overheadText = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) { // L: 3143
							var3 = npcIndices[var2]; // L: 3144
							NPC var24 = npcs[var3]; // L: 3145
							if (var24 != null && var24.overheadTextCyclesRemaining > 0) { // L: 3146
								--var24.overheadTextCyclesRemaining; // L: 3147
								if (var24.overheadTextCyclesRemaining == 0) { // L: 3148
									var24.overheadText = null;
								}
							}
						}

						++field743; // L: 3152
						if (mouseCrossColor != 0) { // L: 3153
							mouseCrossState = mouseCrossState * 400 + 20; // L: 3154
							if (mouseCrossState * 400 >= 400) { // L: 3155
								mouseCrossColor = 0;
							}
						}

						if (DevicePcmPlayerProvider.field153 != null) { // L: 3157
							++field609; // L: 3158
							if (field609 >= 15) { // L: 3159
								class403.invalidateWidget(DevicePcmPlayerProvider.field153); // L: 3160
								DevicePcmPlayerProvider.field153 = null; // L: 3161
							}
						}

						Widget var33 = class148.mousedOverWidgetIf1; // L: 3164
						Widget var34 = GrandExchangeEvent.field4105; // L: 3165
						class148.mousedOverWidgetIf1 = null; // L: 3166
						GrandExchangeEvent.field4105 = null; // L: 3167
						draggedOnWidget = null; // L: 3168
						field686 = false; // L: 3169
						field683 = false; // L: 3170
						field529 = 0; // L: 3171

						while (class28.isKeyDown() && field529 < 128) { // L: 3172
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && class142.field1665 == 66) { // L: 3173
								String var35 = ViewportMouse.method4628(); // L: 3174
								IgnoreList.client.method446(var35); // L: 3175
							} else if (oculusOrbState != 1 || class229.field2794 <= 0) { // L: 3178
								field749[field529] = class142.field1665; // L: 3181
								field731[field529] = class229.field2794; // L: 3182
								++field529; // L: 3183
							}
						}

						if (Decimator.method1091() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) { // L: 3185
							var3 = class67.localPlayer.plane - mouseWheelRotation; // L: 3186
							if (var3 < 0) { // L: 3187
								var3 = 0;
							} else if (var3 > 3) { // L: 3188
								var3 = 3;
							}

							if (var3 != class67.localPlayer.plane) { // L: 3189
								var4 = class67.localPlayer.pathX[0] + class128.baseX * 64; // L: 3190
								var5 = class67.localPlayer.pathY[0] + WorldMapData_1.baseY * 64; // L: 3191
								var18 = class120.getPacketBufferNode(ClientPacket.RESUME_STRINGDIALOG, packetWriter.isaacCipher); // L: 3194
								var18.packetBuffer.writeByteAdd(var3); // L: 3195
								var18.packetBuffer.writeShort(var5); // L: 3196
								var18.packetBuffer.writeIntIME(0); // L: 3197
								var18.packetBuffer.writeShortLE(var4); // L: 3198
								packetWriter.addNode(var18); // L: 3199
							}

							mouseWheelRotation = 0; // L: 3202
						}

						if (rootInterface != -1) { // L: 3204
							class259.updateRootInterface(rootInterface, 0, 0, class123.canvasWidth, class166.canvasHeight, 0, 0);
						}

						++cycleCntr; // L: 3205

						while (true) {
							Widget var25;
							ScriptEvent var36;
							Widget var37;
							do {
								var36 = (ScriptEvent)field709.removeLast(); // L: 3207
								if (var36 == null) { // L: 3208
									while (true) {
										do {
											var36 = (ScriptEvent)field626.removeLast(); // L: 3219
											if (var36 == null) { // L: 3220
												while (true) {
													do {
														var36 = (ScriptEvent)scriptEvents.removeLast(); // L: 3231
														if (var36 == null) { // L: 3232
															this.menu(); // L: 3242
															LoginScreenAnimation.method2379(); // L: 3243
															if (clickedWidget != null) { // L: 3244
																this.method1208();
															}

															if (User.dragInventoryWidget != null) { // L: 3245
																class403.invalidateWidget(User.dragInventoryWidget); // L: 3246
																++itemDragDuration; // L: 3247
																if (MouseHandler.MouseHandler_currentButton == 0) { // L: 3248
																	if (field763) { // L: 3249
																		if (User.dragInventoryWidget == SceneTilePaint.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) { // L: 3250
																			Widget var38 = User.dragInventoryWidget; // L: 3251
																			byte var29 = 0; // L: 3252
																			if (field565 == 1 && var38.contentType == 206) { // L: 3253
																				var29 = 1;
																			}

																			if (var38.itemIds[dragItemSlotDestination] <= 0) { // L: 3254
																				var29 = 0;
																			}

																			var6 = class97.getWidgetFlags(var38); // L: 3256
																			boolean var30 = (var6 >> 29 & 1) != 0; // L: 3258
																			if (var30) { // L: 3260
																				var7 = dragItemSlotSource; // L: 3261
																				var8 = dragItemSlotDestination; // L: 3262
																				var38.itemIds[var8] = var38.itemIds[var7]; // L: 3263
																				var38.itemQuantities[var8] = var38.itemQuantities[var7]; // L: 3264
																				var38.itemIds[var7] = -1; // L: 3265
																				var38.itemQuantities[var7] = 0; // L: 3266
																			} else if (var29 == 1) { // L: 3268
																				var7 = dragItemSlotSource; // L: 3269
																				var8 = dragItemSlotDestination; // L: 3270

																				while (var7 != var8) { // L: 3271
																					if (var7 > var8) { // L: 3272
																						var38.swapItems(var7 - 1, var7); // L: 3273
																						--var7; // L: 3274
																					} else if (var7 < var8) { // L: 3276
																						var38.swapItems(var7 + 1, var7); // L: 3277
																						++var7; // L: 3278
																					}
																				}
																			} else {
																				var38.swapItems(dragItemSlotDestination, dragItemSlotSource); // L: 3283
																			}

																			PacketBufferNode var26 = class120.getPacketBufferNode(ClientPacket.OPLOC1, packetWriter.isaacCipher); // L: 3286
																			var26.packetBuffer.writeByteSub(var29); // L: 3287
																			var26.packetBuffer.writeShortAddLE(dragItemSlotSource); // L: 3288
																			var26.packetBuffer.writeIntLE(User.dragInventoryWidget.id); // L: 3289
																			var26.packetBuffer.writeShortLE(dragItemSlotDestination); // L: 3290
																			packetWriter.addNode(var26); // L: 3291
																		}
																	} else if (this.shouldLeftClickOpenMenu()) { // L: 3295
																		this.openMenu(draggedWidgetX, draggedWidgetY); // L: 3296
																	} else if (menuOptionsCount > 0) { // L: 3298
																		NPCComposition.method3663(draggedWidgetX, draggedWidgetY); // L: 3299
																	}

																	field609 = 10; // L: 3302
																	MouseHandler.MouseHandler_lastButton = 0; // L: 3303
																	User.dragInventoryWidget = null; // L: 3304
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) { // L: 3307 3308
																	field763 = true; // L: 3309
																}
															}

															if (Scene.shouldSendWalk()) { // L: 3314
																var3 = Scene.Scene_selectedX; // L: 3315
																var4 = Scene.Scene_selectedY; // L: 3316
																PacketBufferNode var39 = class120.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, packetWriter.isaacCipher); // L: 3318
																var39.packetBuffer.writeByte(5); // L: 3319
																var39.packetBuffer.writeShortAdd(class128.baseX * 64 + var3); // L: 3320
																var39.packetBuffer.writeShort(WorldMapData_1.baseY * 64 + var4); // L: 3321
																var39.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? (KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1) : 0); // L: 3322
																packetWriter.addNode(var39); // L: 3323
																Scene.method4395(); // L: 3324
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX; // L: 3325
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY; // L: 3326
																mouseCrossColor = 1; // L: 3327
																mouseCrossState = 0; // L: 3328
																destinationX = var3; // L: 3329
																destinationY = var4; // L: 3330
															}

															if (var33 != class148.mousedOverWidgetIf1) { // L: 3332
																if (var33 != null) { // L: 3333
																	class403.invalidateWidget(var33);
																}

																if (class148.mousedOverWidgetIf1 != null) { // L: 3334
																	class403.invalidateWidget(class148.mousedOverWidgetIf1);
																}
															}

															if (var34 != GrandExchangeEvent.field4105 && field657 == field560) { // L: 3336
																if (var34 != null) { // L: 3337
																	class403.invalidateWidget(var34);
																}

																if (GrandExchangeEvent.field4105 != null) { // L: 3338
																	class403.invalidateWidget(GrandExchangeEvent.field4105);
																}
															}

															if (GrandExchangeEvent.field4105 != null) { // L: 3340
																if (field560 < field657) { // L: 3341
																	++field560; // L: 3342
																	if (field657 == field560) { // L: 3343
																		class403.invalidateWidget(GrandExchangeEvent.field4105);
																	}
																}
															} else if (field560 > 0) { // L: 3346
																--field560;
															}

															FontName.method7596(); // L: 3347
															if (field544) { // L: 3348
																Tile.method4128(class402.field4479, class152.field1724, ArchiveDiskActionHandler.field4010); // L: 3349
																class7.method67(class21.field120, field789); // L: 3350
																if (TaskHandler.cameraX == class402.field4479 && class152.field1724 == SecureRandomFuture.cameraY && ArchiveDiskActionHandler.field4010 == ApproximateRouteStrategy.cameraZ && class21.field120 == class163.cameraPitch && field789 == class10.cameraYaw) { // L: 3351
																	field544 = false; // L: 3352
																	isCameraLocked = false; // L: 3353
																	class119.field1479 = 0; // L: 3354
																	MusicPatchNode.field3301 = 0; // L: 3355
																	class123.field1520 = 0; // L: 3356
																	SoundSystem.field327 = 0; // L: 3357
																	class93.field1270 = 0; // L: 3358
																	UserComparator6.field1398 = 0; // L: 3359
																	ObjectSound.field832 = 0; // L: 3360
																	SceneTilePaint.field2638 = 0; // L: 3361
																	UrlRequester.field1355 = 0; // L: 3362
																	Strings.field3978 = 0; // L: 3363
																}
															} else if (isCameraLocked) { // L: 3367
																class119.method2909();
															}

															for (var3 = 0; var3 < 5; ++var3) { // L: 3368
																int var10002 = field759[var3]++;
															}

															LoginType.varcs.tryWrite(); // L: 3369
															var3 = ++MouseHandler.MouseHandler_idleCycles - 1; // L: 3372
															var5 = class150.method3287(); // L: 3375
															if (var3 > 15000 && var5 > 15000) { // L: 3376
																logoutTimer = 250; // L: 3377
																GraphicsDefaults.method7089(14500); // L: 3378
																var18 = class120.getPacketBufferNode(ClientPacket.OPPLAYERT, packetWriter.isaacCipher); // L: 3380
																packetWriter.addNode(var18); // L: 3381
															}

															Varps.friendSystem.processFriendUpdates(); // L: 3383
															++packetWriter.pendingWrites; // L: 3384
															if (packetWriter.pendingWrites > 50) { // L: 3385
																var18 = class120.getPacketBufferNode(ClientPacket.OPPLAYER7, packetWriter.isaacCipher); // L: 3387
																packetWriter.addNode(var18); // L: 3388
															}

															try {
																packetWriter.flush(); // L: 3391
															} catch (IOException var27) { // L: 3393
																class67.method2033(); // L: 3394
															}

															return; // L: 3396
														}

														var37 = var36.widget; // L: 3233
														if (var37.childIndex < 0) { // L: 3234
															break;
														}

														var25 = SpotAnimationDefinition.getWidget(var37.parentId); // L: 3235
													} while(var25 == null || var25.children == null || var37.childIndex >= var25.children.length || var37 != var25.children[var37.childIndex]); // L: 3236

													class348.runScriptEvent(var36); // L: 3240
												}
											}

											var37 = var36.widget; // L: 3221
											if (var37.childIndex < 0) { // L: 3222
												break;
											}

											var25 = SpotAnimationDefinition.getWidget(var37.parentId); // L: 3223
										} while(var25 == null || var25.children == null || var37.childIndex >= var25.children.length || var37 != var25.children[var37.childIndex]); // L: 3224

										class348.runScriptEvent(var36); // L: 3228
									}
								}

								var37 = var36.widget; // L: 3209
								if (var37.childIndex < 0) { // L: 3210
									break;
								}

								var25 = SpotAnimationDefinition.getWidget(var37.parentId); // L: 3211
							} while(var25 == null || var25.children == null || var37.childIndex >= var25.children.length || var37 != var25.children[var37.childIndex]); // L: 3212

							class348.runScriptEvent(var36); // L: 3216
						}
					}
				}
			}
		}
	} // L: 2919 3130

	@ObfuscatedName("gg")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "128"
	)
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class123.canvasWidth; // L: 4288
		int var2 = class166.canvasHeight; // L: 4289
		if (super.contentWidth < var1) { // L: 4290
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight; // L: 4291
		}

		if (Player.clientPreferences != null) { // L: 4292
			try {
				class27.method405(IgnoreList.client, "resize", new Object[]{SceneTilePaint.getWindowedMode()}); // L: 4294
			} catch (Throwable var4) { // L: 4296
			}
		}

	} // L: 4298

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1587589415"
	)
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) { // L: 4301
			class260.method5339(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4302
			if (field714[var1]) { // L: 4303
				field556[var1] = true;
			}

			field671[var1] = field714[var1]; // L: 4304
			field714[var1] = false; // L: 4305
		}

		field713 = cycle; // L: 4307
		viewportX = -1; // L: 4308
		viewportY = -1; // L: 4309
		SceneTilePaint.hoveredItemContainer = null; // L: 4310
		if (rootInterface != -1) { // L: 4311
			rootWidgetCount = 0; // L: 4312
			class193.drawWidgets(rootInterface, 0, 0, class123.canvasWidth, class166.canvasHeight, 0, 0, -1); // L: 4313
		}

		Rasterizer2D.Rasterizer2D_resetClip(); // L: 4315
		if (showMouseCross) { // L: 4316
			if (mouseCrossColor == 1) { // L: 4317
				SpotAnimationDefinition.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4318
			}

			if (mouseCrossColor == 2) { // L: 4320
				SpotAnimationDefinition.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8); // L: 4321
			}
		}

		if (!isMenuOpen) { // L: 4324
			if (viewportX != -1) { // L: 4325
				Message.method1165(viewportX, viewportY);
			}
		} else {
			HealthBarUpdate.method2352(); // L: 4327
		}

		if (gameDrawingMode == 3) { // L: 4328
			for (var1 = 0; var1 < rootWidgetCount; ++var1) { // L: 4329
				if (field671[var1]) { // L: 4330
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128); // L: 4331
				} else if (field556[var1]) { // L: 4333
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128); // L: 4334
				}
			}
		}

		class166.method3494(Tiles.Client_plane, class67.localPlayer.x, class67.localPlayer.y, field743); // L: 4338
		field743 = 0; // L: 4339
	} // L: 4340

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lcs;II)Z",
		garbageValue = "-433074130"
	)
	boolean method1206(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) { // L: 5920
			class145.friendsChat = null; // L: 5921
		} else {
			if (class145.friendsChat == null) { // L: 5924
				class145.friendsChat = new FriendsChat(Players.loginType, IgnoreList.client); // L: 5925
			}

			class145.friendsChat.method6823(var1.packetBuffer, var2); // L: 5927
		}

		ByteArrayPool.method6699(); // L: 5929
		var1.serverPacket = null; // L: 5930
		return true; // L: 5931
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(Lcs;S)Z",
		garbageValue = "26433"
	)
	boolean method1207(PacketWriter var1) {
		if (class145.friendsChat != null) { // L: 5935
			class145.friendsChat.method6806(var1.packetBuffer); // L: 5936
		}

		ByteArrayPool.method6699(); // L: 5938
		var1.serverPacket = null; // L: 5939
		return true; // L: 5940
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Lcs;B)Z",
		garbageValue = "82"
	)
	final boolean method1447(PacketWriter var1) {
		AbstractSocket var2 = var1.getSocket(); // L: 5945
		PacketBuffer var3 = var1.packetBuffer; // L: 5946
		if (var2 == null) { // L: 5947
			return false;
		} else {
			int var21;
			String var22;
			try {
				int var5;
				if (var1.serverPacket == null) { // L: 5949
					if (var1.field1340) { // L: 5950
						if (!var2.isAvailable(1)) { // L: 5951
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1); // L: 5952
						var1.field1349 = 0; // L: 5953
						var1.field1340 = false; // L: 5954
					}

					var3.offset = 0; // L: 5956
					if (var3.method7869()) { // L: 5957
						if (!var2.isAvailable(1)) { // L: 5958
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1); // L: 5959
						var1.field1349 = 0; // L: 5960
					}

					var1.field1340 = true; // L: 5962
					ServerPacket[] var4 = WorldMapEvent.ServerPacket_values(); // L: 5963
					var5 = var3.readSmartByteShortIsaac(); // L: 5964
					if (var5 < 0 || var5 >= var4.length) { // L: 5965
						throw new IOException(var5 + " " + var3.offset);
					}

					var1.serverPacket = var4[var5]; // L: 5966
					var1.serverPacketLength = var1.serverPacket.length; // L: 5967
				}

				if (var1.serverPacketLength == -1) { // L: 5969
					if (!var2.isAvailable(1)) { // L: 5970
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1); // L: 5971
					var1.serverPacketLength = var3.array[0] & 255; // L: 5972
				}

				if (var1.serverPacketLength == -2) { // L: 5974
					if (!var2.isAvailable(2)) { // L: 5975
						return false;
					}

					var1.getSocket().read(var3.array, 0, 2); // L: 5976
					var3.offset = 0; // L: 5977
					var1.serverPacketLength = var3.readUnsignedShort(); // L: 5978
				}

				if (!var2.isAvailable(var1.serverPacketLength)) { // L: 5980
					return false;
				}

				var3.offset = 0; // L: 5981
				var2.read(var3.array, 0, var1.serverPacketLength); // L: 5982
				var1.field1349 = 0; // L: 5983
				timer.method6702(); // L: 5984
				var1.field1345 = var1.field1350; // L: 5985
				var1.field1350 = var1.field1348; // L: 5986
				var1.field1348 = var1.serverPacket; // L: 5987
				Widget var6;
				int var7;
				int var8;
				int var9;
				int var10;
				int var20;
				if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) { // L: 5988
					var20 = var3.readInt(); // L: 5989
					var5 = var3.readUnsignedShort(); // L: 5990
					if (var20 < -70000) { // L: 5991
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 5993
						var6 = SpotAnimationDefinition.getWidget(var20);
					} else {
						var6 = null; // L: 5994
					}

					if (var6 != null) { // L: 5995
						for (var7 = 0; var7 < var6.itemIds.length; ++var7) { // L: 5996
							var6.itemIds[var7] = 0; // L: 5997
							var6.itemQuantities[var7] = 0; // L: 5998
						}
					}

					VarpDefinition.clearItemContainer(var5); // L: 6001
					var7 = var3.readUnsignedShort(); // L: 6002

					for (var8 = 0; var8 < var7; ++var8) { // L: 6003
						var9 = var3.readUnsignedByteAdd(); // L: 6004
						if (var9 == 255) { // L: 6005
							var9 = var3.readUnsignedIntLE();
						}

						var10 = var3.readUnsignedShortLE(); // L: 6006
						if (var6 != null && var8 < var6.itemIds.length) { // L: 6007 6008
							var6.itemIds[var8] = var10; // L: 6009
							var6.itemQuantities[var8] = var9; // L: 6010
						}

						class28.itemContainerSetItem(var5, var8, var10 - 1, var9); // L: 6013
					}

					if (var6 != null) { // L: 6015
						class403.invalidateWidget(var6);
					}

					class33.method647(); // L: 6016
					changedItemContainers[++field694 - 1 & 31] = var5 & 32767; // L: 6017
					var1.serverPacket = null; // L: 6018
					return true; // L: 6019
				}

				if (ServerPacket.field3077 == var1.serverPacket) { // L: 6021
					SoundSystem.method813(class264.field3052); // L: 6022
					var1.serverPacket = null; // L: 6023
					return true; // L: 6024
				}

				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) { // L: 6026
					class114.loadRegions(false, var1.packetBuffer); // L: 6027
					var1.serverPacket = null; // L: 6028
					return true; // L: 6029
				}

				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) { // L: 6031
					return this.method1206(var1, 2); // L: 6032
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) { // L: 6034
					SoundSystem.method813(class264.field3046); // L: 6035
					var1.serverPacket = null; // L: 6036
					return true; // L: 6037
				}

				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) { // L: 6039
					WorldMapSectionType.field2826 = true; // L: 6040
					class386.updateNpcs(false, var3); // L: 6041
					var1.serverPacket = null; // L: 6042
					return true; // L: 6043
				}

				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_2 == var1.serverPacket) { // L: 6045
					var20 = var3.readUnsignedShortLE(); // L: 6046
					var5 = var3.readUnsignedIntME(); // L: 6047
					Varps.Varps_temp[var20] = var5; // L: 6048
					if (Varps.Varps_main[var20] != var5) { // L: 6049
						Varps.Varps_main[var20] = var5; // L: 6050
					}

					class269.changeGameOptions(var20); // L: 6052
					changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 6053
					var1.serverPacket = null; // L: 6054
					return true; // L: 6055
				}

				int var11;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				if (ServerPacket.field3166 == var1.serverPacket) { // L: 6057
					byte var66 = var3.readByteNeg(); // L: 6073
					int var18 = var3.readUnsignedByteAdd(); // L: 6074
					var12 = var3.readUnsignedShortAdd(); // L: 6075
					var11 = var3.readShort(); // L: 6076
					var21 = var3.readMediumME(); // L: 6077
					var20 = var21 >> 16; // L: 6078
					var5 = var21 >> 8 & 255; // L: 6079
					var7 = var20 + (var21 >> 4 & 7); // L: 6080
					var8 = var5 + (var21 & 7); // L: 6081
					byte var63 = var3.readByte(); // L: 6082
					var15 = var3.readUnsignedShortLE(); // L: 6083
					var13 = var3.readUnsignedByteSub() * 4; // L: 6084
					var14 = var3.readUnsignedByte() * 4; // L: 6085
					int var17 = var3.readUnsignedByteAdd(); // L: 6086
					var16 = var3.readUnsignedShortAdd(); // L: 6087
					var9 = var66 + var7; // L: 6088
					var10 = var63 + var8; // L: 6089
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 != 65535) { // L: 6090
						var7 = var7 * 128 + 64; // L: 6091
						var8 = var8 * 128 + 64; // L: 6092
						var9 = var9 * 128 + 64; // L: 6093
						var10 = var10 * 128 + 64; // L: 6094
						Projectile var19 = new Projectile(var12, Tiles.Client_plane, var7, var8, class120.getTileHeight(var7, var8, Tiles.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var14); // L: 6095
						var19.setDestination(var9, var10, class120.getTileHeight(var9, var10, Tiles.Client_plane) - var14, var15 + cycle); // L: 6096
						projectiles.addFirst(var19); // L: 6097
					}

					var1.serverPacket = null; // L: 6099
					return true; // L: 6100
				}

				String var50;
				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) { // L: 6102
					var50 = var3.readStringCp1252NullTerminated(); // L: 6103
					var22 = AbstractFont.escapeBrackets(class123.method2954(Occluder.method4474(var3))); // L: 6104
					class65.addGameMessage(6, var50, var22); // L: 6105
					var1.serverPacket = null; // L: 6106
					return true; // L: 6107
				}

				long var23;
				long var25;
				long var27;
				long var30;
				String var32;
				if (ServerPacket.field3132 == var1.serverPacket) { // L: 6109
					var50 = var3.readStringCp1252NullTerminated(); // L: 6110
					var23 = var3.readLong(); // L: 6111
					var25 = (long)var3.readUnsignedShort(); // L: 6112
					var27 = (long)var3.readMedium(); // L: 6113
					PlayerType var80 = (PlayerType)Varps.findEnumerated(DbTableType.PlayerType_values(), var3.readUnsignedByte()); // L: 6114
					var30 = var27 + (var25 << 32); // L: 6115
					boolean var69 = false; // L: 6116

					for (var15 = 0; var15 < 100; ++var15) { // L: 6117
						if (var30 == crossWorldMessageIds[var15]) { // L: 6118
							var69 = true; // L: 6119
							break; // L: 6120
						}
					}

					if (var80.isUser && Varps.friendSystem.isIgnored(new Username(var50, Players.loginType))) { // L: 6123 6124
						var69 = true;
					}

					if (!var69 && field617 == 0) { // L: 6126
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var30; // L: 6127
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6128
						var32 = AbstractFont.escapeBrackets(class123.method2954(Occluder.method4474(var3))); // L: 6129
						if (var80.modIcon != -1) { // L: 6130
							class120.addChatMessage(9, SecureRandomFuture.method2108(var80.modIcon) + var50, var32, class241.base37DecodeLong(var23));
						} else {
							class120.addChatMessage(9, var50, var32, class241.base37DecodeLong(var23)); // L: 6131
						}
					}

					var1.serverPacket = null; // L: 6133
					return true; // L: 6134
				}

				if (ServerPacket.field3089 == var1.serverPacket) { // L: 6136
					Varps.friendSystem.readUpdate(var3, var1.serverPacketLength); // L: 6137
					field700 = cycleCntr; // L: 6138
					var1.serverPacket = null; // L: 6139
					return true; // L: 6140
				}

				Widget var33;
				if (ServerPacket.IF_SETHIDE == var1.serverPacket) { // L: 6142
					var20 = var3.readUnsignedShortLE(); // L: 6143
					var5 = var3.readUnsignedIntIME(); // L: 6144
					var21 = var3.readUnsignedShortLE(); // L: 6145
					var7 = var3.readUnsignedShortAddLE(); // L: 6146
					var33 = SpotAnimationDefinition.getWidget(var5); // L: 6147
					if (var7 != var33.modelAngleX || var20 != var33.modelAngleY || var21 != var33.modelZoom) { // L: 6148
						var33.modelAngleX = var7; // L: 6149
						var33.modelAngleY = var20; // L: 6150
						var33.modelZoom = var21; // L: 6151
						class403.invalidateWidget(var33); // L: 6152
					}

					var1.serverPacket = null; // L: 6154
					return true; // L: 6155
				}

				if (ServerPacket.field3139 == var1.serverPacket) { // L: 6157
					WorldMapID.method5124(var3.readStringCp1252NullTerminated()); // L: 6158
					var1.serverPacket = null; // L: 6159
					return true; // L: 6160
				}

				String var64;
				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) { // L: 6162
					byte[] var57 = new byte[var1.serverPacketLength]; // L: 6163
					var3.method7871(var57, 0, var57.length); // L: 6164
					Buffer var78 = new Buffer(var57); // L: 6165
					var64 = var78.readStringCp1252NullTerminated(); // L: 6166
					CollisionMap.openURL(var64, true, false); // L: 6167
					var1.serverPacket = null; // L: 6168
					return true; // L: 6169
				}

				if (ServerPacket.field3163 == var1.serverPacket) { // L: 6171
					tradeChatMode = var3.readUnsignedByteSub(); // L: 6172
					publicChatMode = var3.readUnsignedByteSub(); // L: 6173
					var1.serverPacket = null; // L: 6174
					return true; // L: 6175
				}

				if (ServerPacket.CAM_RESET == var1.serverPacket) { // L: 6177
					hintArrowType = var3.readUnsignedByte(); // L: 6178
					if (hintArrowType == 1) { // L: 6179
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if (hintArrowType >= 2 && hintArrowType <= 6) { // L: 6180
						if (hintArrowType == 2) { // L: 6181
							hintArrowSubX = 4096; // L: 6182
							hintArrowSubY = 4096; // L: 6183
						}

						if (hintArrowType == 3) { // L: 6185
							hintArrowSubX = 0; // L: 6186
							hintArrowSubY = 4096; // L: 6187
						}

						if (hintArrowType == 4) { // L: 6189
							hintArrowSubX = 8192; // L: 6190
							hintArrowSubY = 4096; // L: 6191
						}

						if (hintArrowType == 5) { // L: 6193
							hintArrowSubX = 4096; // L: 6194
							hintArrowSubY = 0; // L: 6195
						}

						if (hintArrowType == 6) { // L: 6197
							hintArrowSubX = 4096; // L: 6198
							hintArrowSubY = 8192; // L: 6199
						}

						hintArrowType = 2; // L: 6201
						hintArrowX = var3.readUnsignedShort(); // L: 6202
						hintArrowY = var3.readUnsignedShort(); // L: 6203
						hintArrowHeight = var3.readUnsignedByte() * 4; // L: 6204
					}

					if (hintArrowType == 10) { // L: 6206
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null; // L: 6207
					return true; // L: 6208
				}

				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) { // L: 6210
					SoundSystem.method813(class264.field3054); // L: 6211
					var1.serverPacket = null; // L: 6212
					return true; // L: 6213
				}

				if (ServerPacket.field3175 == var1.serverPacket) { // L: 6215
					var20 = var3.readUnsignedShortAddLE(); // L: 6216
					rootInterface = var20; // L: 6217
					this.resizeRoot(false); // L: 6218
					MouseHandler.Widget_resetModelFrames(var20); // L: 6219
					class11.runWidgetOnLoadListener(rootInterface); // L: 6220

					for (var5 = 0; var5 < 100; ++var5) { // L: 6221
						field714[var5] = true;
					}

					var1.serverPacket = null; // L: 6222
					return true; // L: 6223
				}

				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) { // L: 6225
					class392.field4456 = var3.readUnsignedByteNeg(); // L: 6226
					ItemComposition.field2163 = var3.readUnsignedByteAdd(); // L: 6227
					var1.serverPacket = null; // L: 6228
					return true; // L: 6229
				}

				if (ServerPacket.field3133 == var1.serverPacket) { // L: 6231
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) { // L: 6232
						if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) { // L: 6233
							Varps.Varps_main[var20] = Varps.Varps_temp[var20]; // L: 6234
							class269.changeGameOptions(var20); // L: 6235
							changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 6236
						}
					}

					var1.serverPacket = null; // L: 6239
					return true; // L: 6240
				}

				GameObject var41;
				byte var79;
				if (ServerPacket.field3131 == var1.serverPacket) { // L: 6242
					var79 = var3.readByte(); // L: 6243
					var22 = var3.readStringCp1252NullTerminated(); // L: 6244
					long var34 = (long)var3.readUnsignedShort(); // L: 6245
					long var36 = (long)var3.readMedium(); // L: 6246
					PlayerType var84 = (PlayerType)Varps.findEnumerated(DbTableType.PlayerType_values(), var3.readUnsignedByte()); // L: 6247
					long var39 = var36 + (var34 << 32); // L: 6248
					boolean var68 = false; // L: 6249
					var41 = null; // L: 6250
					ClanChannel var89 = var79 >= 0 ? currentClanChannels[var79] : MusicPatchPcmStream.guestClanChannel; // L: 6252
					if (var89 == null) { // L: 6253
						var68 = true; // L: 6254
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var84.isUser && Varps.friendSystem.isIgnored(new Username(var22, Players.loginType))) { // L: 6263 6264
									var68 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var39) { // L: 6258
								var68 = true; // L: 6259
								break; // L: 6260
							}

							++var15; // L: 6257
						}
					}

					if (!var68) { // L: 6267
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var39; // L: 6268
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6269
						var32 = AbstractFont.escapeBrackets(Occluder.method4474(var3)); // L: 6270
						var16 = var79 >= 0 ? 41 : 44; // L: 6271
						if (var84.modIcon != -1) { // L: 6272
							class120.addChatMessage(var16, SecureRandomFuture.method2108(var84.modIcon) + var22, var32, var89.name);
						} else {
							class120.addChatMessage(var16, var22, var32, var89.name); // L: 6273
						}
					}

					var1.serverPacket = null; // L: 6275
					return true; // L: 6276
				}

				if (ServerPacket.HINT_ARROW == var1.serverPacket) { // L: 6278
					ItemComposition.field2163 = var3.readUnsignedByteNeg(); // L: 6279
					class392.field4456 = var3.readUnsignedByte(); // L: 6280

					while (var3.offset < var1.serverPacketLength) { // L: 6281
						var20 = var3.readUnsignedByte(); // L: 6282
						class264 var77 = ItemComposition.method3911()[var20]; // L: 6283
						SoundSystem.method813(var77); // L: 6284
					}

					var1.serverPacket = null; // L: 6286
					return true; // L: 6287
				}

				Widget var71;
				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) { // L: 6289
					var20 = var3.readUnsignedIntME(); // L: 6290
					var71 = SpotAnimationDefinition.getWidget(var20); // L: 6291

					for (var21 = 0; var21 < var71.itemIds.length; ++var21) { // L: 6292
						var71.itemIds[var21] = -1; // L: 6293
						var71.itemIds[var21] = 0; // L: 6294
					}

					class403.invalidateWidget(var71); // L: 6296
					var1.serverPacket = null; // L: 6297
					return true; // L: 6298
				}

				boolean var52;
				if (ServerPacket.field3121 == var1.serverPacket) { // L: 6300
					var20 = var3.readUShortSmart(); // L: 6301
					var52 = var3.readUnsignedByte() == 1; // L: 6302
					var64 = ""; // L: 6303
					boolean var61 = false; // L: 6304
					if (var52) { // L: 6305
						var64 = var3.readStringCp1252NullTerminated(); // L: 6306
						if (Varps.friendSystem.isIgnored(new Username(var64, Players.loginType))) { // L: 6307
							var61 = true;
						}
					}

					String var82 = var3.readStringCp1252NullTerminated(); // L: 6309
					if (!var61) { // L: 6310
						class65.addGameMessage(var20, var64, var82);
					}

					var1.serverPacket = null; // L: 6311
					return true; // L: 6312
				}

				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) { // L: 6314
					var20 = var3.readShort(); // L: 6315
					var5 = var3.readInt(); // L: 6316
					var6 = SpotAnimationDefinition.getWidget(var5); // L: 6317
					if (var20 != var6.sequenceId || var20 == -1) { // L: 6318
						var6.sequenceId = var20; // L: 6319
						var6.modelFrame = 0; // L: 6320
						var6.modelFrameCycle = 0; // L: 6321
						class403.invalidateWidget(var6); // L: 6322
					}

					var1.serverPacket = null; // L: 6324
					return true; // L: 6325
				}

				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) { // L: 6327
					class114.loadRegions(true, var1.packetBuffer); // L: 6328
					var1.serverPacket = null; // L: 6329
					return true; // L: 6330
				}

				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) { // L: 6332
					var20 = var3.readUnsignedShortAddLE(); // L: 6333
					if (var20 == 65535) { // L: 6334
						var20 = -1;
					}

					class9.playSong(var20); // L: 6335
					var1.serverPacket = null; // L: 6336
					return true; // L: 6337
				}

				if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) { // L: 6339
					var20 = var3.readUnsignedShortAdd(); // L: 6340
					if (var20 == 65535) { // L: 6341
						var20 = -1;
					}

					var5 = var3.readMediumME(); // L: 6342
					class161.method3458(var20, var5); // L: 6343
					var1.serverPacket = null; // L: 6344
					return true; // L: 6345
				}

				if (ServerPacket.field3125 == var1.serverPacket) { // L: 6347
					class142.privateChatMode = ChatChannel.method2146(var3.readUnsignedByte()); // L: 6348
					var1.serverPacket = null; // L: 6349
					return true; // L: 6350
				}

				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) { // L: 6352
					class386.updateNpcs(false, var3); // L: 6353
					var1.serverPacket = null; // L: 6354
					return true; // L: 6355
				}

				Widget var91;
				if (ServerPacket.field3108 == var1.serverPacket) { // L: 6357
					var20 = var3.readUnsignedShort(); // L: 6358
					if (var20 == 65535) { // L: 6359
						var20 = -1;
					}

					var5 = var3.readUnsignedIntLE(); // L: 6360
					var21 = var3.readUnsignedIntME(); // L: 6361
					var91 = SpotAnimationDefinition.getWidget(var5); // L: 6362
					ItemComposition var81;
					if (!var91.isIf3) { // L: 6363
						if (var20 == -1) { // L: 6364
							var91.modelType = 0; // L: 6365
							var1.serverPacket = null; // L: 6366
							return true; // L: 6367
						}

						var81 = UserComparator3.ItemDefinition_get(var20); // L: 6369
						var91.modelType = 4; // L: 6370
						var91.modelId = var20; // L: 6371
						var91.modelAngleX = var81.xan2d; // L: 6372
						var91.modelAngleY = var81.yan2d; // L: 6373
						var91.modelZoom = var81.zoom2d * 100 / var21; // L: 6374
						class403.invalidateWidget(var91); // L: 6375
					} else {
						var91.itemId = var20; // L: 6378
						var91.itemQuantity = var21; // L: 6379
						var81 = UserComparator3.ItemDefinition_get(var20); // L: 6380
						var91.modelAngleX = var81.xan2d; // L: 6381
						var91.modelAngleY = var81.yan2d; // L: 6382
						var91.modelAngleZ = var81.zan2d; // L: 6383
						var91.modelOffsetX = var81.offsetX2d; // L: 6384
						var91.modelOffsetY = var81.offsetY2d; // L: 6385
						var91.modelZoom = var81.zoom2d; // L: 6386
						if (var81.isStackable == 1) { // L: 6387
							var91.itemQuantityMode = 1;
						} else {
							var91.itemQuantityMode = 2; // L: 6388
						}

						if (var91.field3446 > 0) { // L: 6389
							var91.modelZoom = var91.modelZoom * 32 / var91.field3446;
						} else if (var91.rawWidth > 0) { // L: 6390
							var91.modelZoom = var91.modelZoom * 32 / var91.rawWidth;
						}

						class403.invalidateWidget(var91); // L: 6391
					}

					var1.serverPacket = null; // L: 6393
					return true; // L: 6394
				}

				if (ServerPacket.field3082 == var1.serverPacket) { // L: 6396
					SecureRandomFuture.updatePlayers(var3, var1.serverPacketLength); // L: 6397
					SpriteMask.method5688(); // L: 6398
					var1.serverPacket = null; // L: 6399
					return true; // L: 6400
				}

				if (ServerPacket.field3075 == var1.serverPacket) { // L: 6402
					Varps.friendSystem.method1785(); // L: 6403
					field700 = cycleCntr; // L: 6404
					var1.serverPacket = null; // L: 6405
					return true; // L: 6406
				}

				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) { // L: 6408
					var20 = var3.readInt(); // L: 6409
					var5 = var3.readUnsignedShort(); // L: 6410
					if (var20 < -70000) { // L: 6411
						var5 += 32768;
					}

					if (var20 >= 0) { // L: 6413
						var6 = SpotAnimationDefinition.getWidget(var20);
					} else {
						var6 = null; // L: 6414
					}

					for (; var3.offset < var1.serverPacketLength; class28.itemContainerSetItem(var5, var7, var8 - 1, var9)) { // L: 6415 6429
						var7 = var3.readUShortSmart(); // L: 6416
						var8 = var3.readUnsignedShort(); // L: 6417
						var9 = 0; // L: 6418
						if (var8 != 0) { // L: 6419
							var9 = var3.readUnsignedByte(); // L: 6420
							if (var9 == 255) { // L: 6421
								var9 = var3.readInt();
							}
						}

						if (var6 != null && var7 >= 0 && var7 < var6.itemIds.length) { // L: 6423 6424
							var6.itemIds[var7] = var8; // L: 6425
							var6.itemQuantities[var7] = var9; // L: 6426
						}
					}

					if (var6 != null) { // L: 6431
						class403.invalidateWidget(var6);
					}

					class33.method647(); // L: 6432
					changedItemContainers[++field694 - 1 & 31] = var5 & 32767; // L: 6433
					var1.serverPacket = null; // L: 6434
					return true; // L: 6435
				}

				if (ServerPacket.URL_OPEN == var1.serverPacket) { // L: 6437
					isCameraLocked = false; // L: 6438

					for (var20 = 0; var20 < 5; ++var20) { // L: 6439
						field755[var20] = false;
					}

					var1.serverPacket = null; // L: 6440
					return true; // L: 6441
				}

				if (ServerPacket.field3091 == var1.serverPacket) { // L: 6443
					if (class29.field182 == null) { // L: 6444
						class29.field182 = new class393(class150.HitSplatDefinition_cached);
					}

					class452 var55 = class150.HitSplatDefinition_cached.method7271(var3); // L: 6445
					class29.field182.field4464.vmethod7652(var55.field4796, var55.field4797); // L: 6446
					field590[++field698 - 1 & 31] = var55.field4796; // L: 6447
					var1.serverPacket = null; // L: 6448
					return true; // L: 6449
				}

				if (ServerPacket.field3140 == var1.serverPacket) { // L: 6451
					var20 = var3.readUnsignedByte(); // L: 6452
					var5 = var3.readUnsignedByte(); // L: 6453
					var21 = var3.readUnsignedByte(); // L: 6454
					var7 = var3.readUnsignedByte(); // L: 6455
					field755[var20] = true; // L: 6456
					field575[var20] = var5; // L: 6457
					field757[var20] = var21; // L: 6458
					field758[var20] = var7; // L: 6459
					field759[var20] = 0; // L: 6460
					var1.serverPacket = null; // L: 6461
					return true; // L: 6462
				}

				boolean var76;
				if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) { // L: 6464
					var76 = var3.readUnsignedByte() == 1; // L: 6465
					if (var76) { // L: 6466
						SceneTilePaint.field2649 = Language.method6232() - var3.readLong(); // L: 6467
						EnumComposition.grandExchangeEvents = new GrandExchangeEvents(var3, true); // L: 6468
					} else {
						EnumComposition.grandExchangeEvents = null; // L: 6470
					}

					field705 = cycleCntr; // L: 6471
					var1.serverPacket = null; // L: 6472
					return true; // L: 6473
				}

				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) { // L: 6475
					field745 = cycleCntr; // L: 6476
					var79 = var3.readByte(); // L: 6477
					class146 var75 = new class146(var3); // L: 6478
					ClanChannel var60;
					if (var79 >= 0) { // L: 6480
						var60 = currentClanChannels[var79];
					} else {
						var60 = MusicPatchPcmStream.guestClanChannel; // L: 6481
					}

					var75.method3230(var60); // L: 6482
					var1.serverPacket = null; // L: 6483
					return true; // L: 6484
				}

				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) { // L: 6486
					var20 = var3.readUnsignedShortAdd(); // L: 6491
					Player var92;
					if (var20 == localPlayerIndex) { // L: 6492
						var92 = class67.localPlayer; // L: 6493
					} else {
						var92 = players[var20]; // L: 6496
					}

					var21 = var3.readUnsignedIntIME(); // L: 6498
					var5 = var3.readUnsignedShort(); // L: 6499
					if (var92 != null) { // L: 6500
						var92.spotAnimation = var5; // L: 6501
						var92.spotAnimationHeight = var21 >> 16; // L: 6502
						var92.field1147 = (var21 & 65535) + cycle; // L: 6503
						var92.spotAnimationFrame = 0; // L: 6504
						var92.spotAnimationFrameCycle = 0; // L: 6505
						if (var92.field1147 > cycle) { // L: 6506
							var92.spotAnimationFrame = -1; // L: 6507
						}

						if (var92.spotAnimation == 65535) { // L: 6509
							var92.spotAnimation = -1; // L: 6510
						}
					}

					var1.serverPacket = null; // L: 6513
					return true; // L: 6514
				}

				if (ServerPacket.field3113 == var1.serverPacket) { // L: 6516
					var20 = var3.readUnsignedShort(); // L: 6517
					if (var20 == 65535) { // L: 6518
						var20 = -1;
					}

					var5 = var3.readUnsignedShortAdd(); // L: 6519
					if (var5 == 65535) { // L: 6520
						var5 = -1;
					}

					var21 = var3.readUnsignedIntLE(); // L: 6521
					var7 = var3.readUnsignedIntLE(); // L: 6522

					for (var8 = var5; var8 <= var20; ++var8) { // L: 6523
						var27 = ((long)var21 << 32) + (long)var8; // L: 6524
						Node var29 = widgetFlags.get(var27); // L: 6525
						if (var29 != null) { // L: 6526
							var29.remove();
						}

						widgetFlags.put(new IntegerNode(var7), var27); // L: 6527
					}

					var1.serverPacket = null; // L: 6529
					return true; // L: 6530
				}

				if (ServerPacket.field3154 == var1.serverPacket) { // L: 6532
					UserComparator3.method2766(); // L: 6533
					var79 = var3.readByte(); // L: 6534
					if (var1.serverPacketLength == 1) { // L: 6535
						if (var79 >= 0) { // L: 6536
							currentClanSettings[var79] = null;
						} else {
							class83.guestClanSettings = null; // L: 6537
						}

						var1.serverPacket = null; // L: 6538
						return true; // L: 6539
					}

					if (var79 >= 0) { // L: 6541
						currentClanSettings[var79] = new ClanSettings(var3); // L: 6542
					} else {
						class83.guestClanSettings = new ClanSettings(var3); // L: 6545
					}

					var1.serverPacket = null; // L: 6547
					return true; // L: 6548
				}

				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) { // L: 6550
					SoundSystem.method813(class264.field3056); // L: 6551
					var1.serverPacket = null; // L: 6552
					return true; // L: 6553
				}

				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) { // L: 6555
					isCameraLocked = true; // L: 6556
					field544 = false; // L: 6557
					class119.field1479 = var3.readUnsignedByte() * 128; // L: 6558
					MusicPatchNode.field3301 = var3.readUnsignedByte() * 16384; // L: 6559
					class123.field1520 = var3.readUnsignedShort(); // L: 6560
					SoundSystem.field327 = var3.readUnsignedByte(); // L: 6561
					class93.field1270 = var3.readUnsignedByte(); // L: 6562
					if (class93.field1270 >= 100) { // L: 6563
						var20 = class119.field1479 * 16384 + 64; // L: 6564
						var5 = MusicPatchNode.field3301 * 128 + 64; // L: 6565
						var21 = class120.getTileHeight(var20, var5, Tiles.Client_plane) - class123.field1520; // L: 6566
						var7 = var20 - TaskHandler.cameraX; // L: 6567
						var8 = var21 - SecureRandomFuture.cameraY; // L: 6568
						var9 = var5 - ApproximateRouteStrategy.cameraZ; // L: 6569
						var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7)); // L: 6570
						class163.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531D) & 2047; // L: 6571
						class10.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531D) & 2047; // L: 6572
						if (class163.cameraPitch < 128) { // L: 6573
							class163.cameraPitch = 128;
						}

						if (class163.cameraPitch > 383) { // L: 6574
							class163.cameraPitch = 383;
						}
					}

					var1.serverPacket = null; // L: 6576
					return true; // L: 6577
				}

				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) { // L: 6579
					SoundSystem.method813(class264.field3057); // L: 6580
					var1.serverPacket = null; // L: 6581
					return true; // L: 6582
				}

				if (ServerPacket.field3081 == var1.serverPacket) { // L: 6584
					var20 = var3.readInt(); // L: 6585
					if (var20 != field754) { // L: 6586
						field754 = var20; // L: 6587
						class434.method7791(); // L: 6588
					}

					var1.serverPacket = null; // L: 6590
					return true; // L: 6591
				}

				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) { // L: 6593
					WorldMapSectionType.field2826 = true; // L: 6594
					class386.updateNpcs(true, var3); // L: 6595
					var1.serverPacket = null; // L: 6596
					return true; // L: 6597
				}

				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) { // L: 6599
					SoundSystem.method813(class264.field3047); // L: 6600
					var1.serverPacket = null; // L: 6601
					return true; // L: 6602
				}

				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) { // L: 6604
					var20 = var3.readUnsignedByte(); // L: 6605
					if (var3.readUnsignedByte() == 0) { // L: 6606
						grandExchangeOffers[var20] = new GrandExchangeOffer(); // L: 6607
						var3.offset += 18; // L: 6608
					} else {
						--var3.offset; // L: 6611
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false); // L: 6612
					}

					field704 = cycleCntr; // L: 6614
					var1.serverPacket = null; // L: 6615
					return true; // L: 6616
				}

				if (ServerPacket.field3084 == var1.serverPacket) { // L: 6618
					ApproximateRouteStrategy.logOut(); // L: 6619
					var1.serverPacket = null; // L: 6620
					return false; // L: 6621
				}

				if (ServerPacket.field3124 == var1.serverPacket) { // L: 6623
					ItemComposition.field2163 = var3.readUnsignedByte(); // L: 6624
					class392.field4456 = var3.readUnsignedByteAdd(); // L: 6625

					for (var20 = class392.field4456; var20 < class392.field4456 + 8; ++var20) { // L: 6626
						for (var5 = ItemComposition.field2163; var5 < ItemComposition.field2163 + 8; ++var5) { // L: 6627
							if (groundItems[Tiles.Client_plane][var20][var5] != null) { // L: 6628
								groundItems[Tiles.Client_plane][var20][var5] = null; // L: 6629
								Friend.updateItemPile(var20, var5); // L: 6630
							}
						}
					}

					for (PendingSpawn var53 = (PendingSpawn)pendingSpawns.last(); var53 != null; var53 = (PendingSpawn)pendingSpawns.previous()) { // L: 6634 6635 6637
						if (var53.x >= class392.field4456 && var53.x < class392.field4456 + 8 && var53.y >= ItemComposition.field2163 && var53.y < ItemComposition.field2163 + 8 && var53.plane == Tiles.Client_plane) { // L: 6636
							var53.hitpoints = 0;
						}
					}

					var1.serverPacket = null; // L: 6639
					return true; // L: 6640
				}

				if (ServerPacket.VARP_LARGE == var1.serverPacket) { // L: 6642
					var20 = var3.readInt(); // L: 6643
					var5 = var3.readUnsignedShortAddLE(); // L: 6644
					var21 = var5 >> 10 & 31; // L: 6645
					var7 = var5 >> 5 & 31; // L: 6646
					var8 = var5 & 31; // L: 6647
					var9 = (var7 << 11) + (var21 << 19) + (var8 << 3); // L: 6648
					Widget var83 = SpotAnimationDefinition.getWidget(var20); // L: 6649
					if (var9 != var83.color) { // L: 6650
						var83.color = var9; // L: 6651
						class403.invalidateWidget(var83); // L: 6652
					}

					var1.serverPacket = null; // L: 6654
					return true; // L: 6655
				}

				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) { // L: 6657
					field745 = cycleCntr; // L: 6658
					var79 = var3.readByte(); // L: 6659
					if (var1.serverPacketLength == 1) { // L: 6660
						if (var79 >= 0) { // L: 6661
							currentClanChannels[var79] = null;
						} else {
							MusicPatchPcmStream.guestClanChannel = null; // L: 6662
						}

						var1.serverPacket = null; // L: 6663
						return true; // L: 6664
					}

					if (var79 >= 0) { // L: 6666
						currentClanChannels[var79] = new ClanChannel(var3); // L: 6667
					} else {
						MusicPatchPcmStream.guestClanChannel = new ClanChannel(var3); // L: 6670
					}

					var1.serverPacket = null; // L: 6672
					return true; // L: 6673
				}

				if (ServerPacket.field3172 == var1.serverPacket) { // L: 6675
					var20 = var3.readInt(); // L: 6676
					var5 = var3.readUnsignedShort(); // L: 6677
					var21 = var3.readUnsignedShort(); // L: 6678
					var91 = SpotAnimationDefinition.getWidget(var20); // L: 6679
					var91.field3451 = var5 + (var21 << 16); // L: 6680
					var1.serverPacket = null; // L: 6681
					return true; // L: 6682
				}

				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) { // L: 6684
					var20 = var3.readShortLE(); // L: 6685
					var5 = var3.readInt(); // L: 6686
					var21 = var3.readShortLE(); // L: 6687
					var91 = SpotAnimationDefinition.getWidget(var5); // L: 6688
					if (var21 != var91.rawX || var20 != var91.rawY || var91.xAlignment != 0 || var91.yAlignment != 0) { // L: 6689
						var91.rawX = var21; // L: 6690
						var91.rawY = var20; // L: 6691
						var91.xAlignment = 0; // L: 6692
						var91.yAlignment = 0; // L: 6693
						class403.invalidateWidget(var91); // L: 6694
						this.alignWidget(var91); // L: 6695
						if (var91.type == 0) { // L: 6696
							StructComposition.revalidateWidgetScroll(Calendar.Widget_interfaceComponents[var5 >> 16], var91, false);
						}
					}

					var1.serverPacket = null; // L: 6698
					return true; // L: 6699
				}

				if (ServerPacket.LOGOUT == var1.serverPacket) { // L: 6701
					var50 = var3.readStringCp1252NullTerminated(); // L: 6702
					var5 = var3.readUnsignedByte(); // L: 6703
					var21 = var3.readUnsignedByte(); // L: 6704
					if (var5 >= 1 && var5 <= 8) { // L: 6705
						if (var50.equalsIgnoreCase("null")) { // L: 6706
							var50 = null;
						}

						playerMenuActions[var5 - 1] = var50; // L: 6707
						playerOptionsPriorities[var5 - 1] = var21 == 0; // L: 6708
					}

					var1.serverPacket = null; // L: 6710
					return true; // L: 6711
				}

				if (ServerPacket.IF_SETMODEL == var1.serverPacket) { // L: 6713
					var3.offset += 28; // L: 6714
					if (var3.checkCrc()) { // L: 6715
						WorldMapData_1.method4979(var3, var3.offset - 28);
					}

					var1.serverPacket = null; // L: 6716
					return true; // L: 6717
				}

				if (ServerPacket.field3098 == var1.serverPacket) { // L: 6719
					for (var20 = 0; var20 < players.length; ++var20) { // L: 6720
						if (players[var20] != null) { // L: 6721
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < npcs.length; ++var20) { // L: 6723
						if (npcs[var20] != null) { // L: 6724
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null; // L: 6726
					return true; // L: 6727
				}

				InterfaceParent var88;
				if (ServerPacket.field3146 == var1.serverPacket) { // L: 6729
					var20 = var3.offset + var1.serverPacketLength; // L: 6730
					var5 = var3.readUnsignedShort(); // L: 6731
					var21 = var3.readUnsignedShort(); // L: 6732
					if (var5 != rootInterface) { // L: 6733
						rootInterface = var5; // L: 6734
						this.resizeRoot(false); // L: 6735
						MouseHandler.Widget_resetModelFrames(rootInterface); // L: 6736
						class11.runWidgetOnLoadListener(rootInterface); // L: 6737

						for (var7 = 0; var7 < 100; ++var7) { // L: 6738
							field714[var7] = true;
						}
					}

					InterfaceParent var38;
					for (; var21-- > 0; var38.field1036 = true) { // L: 6740 6750
						var7 = var3.readInt(); // L: 6741
						var8 = var3.readUnsignedShort(); // L: 6742
						var9 = var3.readUnsignedByte(); // L: 6743
						var38 = (InterfaceParent)interfaceParents.get((long)var7); // L: 6744
						if (var38 != null && var8 != var38.group) { // L: 6745
							class120.closeInterface(var38, true); // L: 6746
							var38 = null; // L: 6747
						}

						if (var38 == null) { // L: 6749
							var38 = class134.method3053(var7, var8, var9);
						}
					}

					for (var88 = (InterfaceParent)interfaceParents.first(); var88 != null; var88 = (InterfaceParent)interfaceParents.next()) { // L: 6752
						if (var88.field1036) { // L: 6753
							var88.field1036 = false;
						} else {
							class120.closeInterface(var88, true); // L: 6755
						}
					}

					widgetFlags = new NodeHashTable(512); // L: 6758

					while (var3.offset < var20) { // L: 6759
						var7 = var3.readInt(); // L: 6760
						var8 = var3.readUnsignedShort(); // L: 6761
						var9 = var3.readUnsignedShort(); // L: 6762
						var10 = var3.readInt(); // L: 6763

						for (var11 = var8; var11 <= var9; ++var11) { // L: 6764
							var30 = ((long)var7 << 32) + (long)var11; // L: 6765
							widgetFlags.put(new IntegerNode(var10), var30); // L: 6766
						}
					}

					var1.serverPacket = null; // L: 6769
					return true; // L: 6770
				}

				if (ServerPacket.field3083 == var1.serverPacket) { // L: 6772
					var20 = var3.readUnsignedByte(); // L: 6773
					Projectile.method2097(var20); // L: 6774
					var1.serverPacket = null; // L: 6775
					return true; // L: 6776
				}

				if (ServerPacket.PLAYER_INFO == var1.serverPacket) { // L: 6778
					var20 = var3.readUnsignedIntME(); // L: 6779
					var5 = var3.readUnsignedShortLE(); // L: 6780
					var6 = SpotAnimationDefinition.getWidget(var20); // L: 6781
					if (var6.modelType != 2 || var5 != var6.modelId) { // L: 6782
						var6.modelType = 2; // L: 6783
						var6.modelId = var5; // L: 6784
						class403.invalidateWidget(var6); // L: 6785
					}

					var1.serverPacket = null; // L: 6787
					return true; // L: 6788
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_1 == var1.serverPacket) { // L: 6790
					if (rootInterface != -1) { // L: 6791
						class18.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null; // L: 6792
					return true; // L: 6793
				}

				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) { // L: 6795
					for (var20 = 0; var20 < VarpDefinition.field1841; ++var20) { // L: 6796
						VarpDefinition var74 = class119.VarpDefinition_get(var20); // L: 6797
						if (var74 != null) { // L: 6798
							Varps.Varps_temp[var20] = 0; // L: 6799
							Varps.Varps_main[var20] = 0; // L: 6800
						}
					}

					class33.method647(); // L: 6803
					changedVarpCount += 32; // L: 6804
					var1.serverPacket = null; // L: 6805
					return true; // L: 6806
				}

				if (ServerPacket.field3176 == var1.serverPacket) { // L: 6808
					SoundSystem.method813(class264.field3050); // L: 6809
					var1.serverPacket = null; // L: 6810
					return true; // L: 6811
				}

				String var46;
				if (ServerPacket.VARP_SMALL == var1.serverPacket) { // L: 6813
					var50 = var3.readStringCp1252NullTerminated(); // L: 6814
					var23 = (long)var3.readUnsignedShort(); // L: 6815
					var25 = (long)var3.readMedium(); // L: 6816
					PlayerType var43 = (PlayerType)Varps.findEnumerated(DbTableType.PlayerType_values(), var3.readUnsignedByte()); // L: 6817
					long var44 = (var23 << 32) + var25; // L: 6818
					boolean var65 = false; // L: 6819

					for (var13 = 0; var13 < 100; ++var13) { // L: 6820
						if (crossWorldMessageIds[var13] == var44) { // L: 6821
							var65 = true; // L: 6822
							break; // L: 6823
						}
					}

					if (Varps.friendSystem.isIgnored(new Username(var50, Players.loginType))) { // L: 6826
						var65 = true;
					}

					if (!var65 && field617 == 0) { // L: 6827
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var44; // L: 6828
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6829
						var46 = AbstractFont.escapeBrackets(class123.method2954(Occluder.method4474(var3))); // L: 6830
						byte var67;
						if (var43.isPrivileged) { // L: 6832
							var67 = 7;
						} else {
							var67 = 3; // L: 6833
						}

						if (var43.modIcon != -1) { // L: 6834
							class65.addGameMessage(var67, SecureRandomFuture.method2108(var43.modIcon) + var50, var46);
						} else {
							class65.addGameMessage(var67, var50, var46); // L: 6835
						}
					}

					var1.serverPacket = null; // L: 6837
					return true; // L: 6838
				}

				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) { // L: 6840
					World var51 = new World(); // L: 6841
					var51.host = var3.readStringCp1252NullTerminated(); // L: 6842
					var51.id = var3.readUnsignedShort(); // L: 6843
					var5 = var3.readInt(); // L: 6844
					var51.properties = var5; // L: 6845
					Coord.updateGameState(45); // L: 6846
					var2.close(); // L: 6847
					var2 = null; // L: 6848
					class221.changeWorld(var51); // L: 6849
					var1.serverPacket = null; // L: 6850
					return false; // L: 6851
				}

				if (ServerPacket.field3099 == var1.serverPacket) { // L: 6853
					var20 = var3.readUnsignedByte(); // L: 6854
					DevicePcmPlayerProvider.forceDisconnect(var20); // L: 6855
					var1.serverPacket = null; // L: 6856
					return false; // L: 6857
				}

				if (ServerPacket.field3145 == var1.serverPacket) { // L: 6859
					SoundSystem.method813(class264.field3053); // L: 6860
					var1.serverPacket = null; // L: 6861
					return true; // L: 6862
				}

				NPC var90;
				if (ServerPacket.field3169 == var1.serverPacket) { // L: 6864
					var5 = var3.readUnsignedShortAdd(); // L: 6868
					var21 = var3.readUnsignedByteSub(); // L: 6869
					var20 = var3.readUnsignedShortAdd(); // L: 6870
					if (var5 == 65535) { // L: 6871
						var5 = -1; // L: 6872
					}

					var90 = npcs[var20]; // L: 6874
					if (var90 != null) { // L: 6875
						if (var5 == var90.sequence && var5 != -1) { // L: 6876
							var8 = class4.SequenceDefinition_get(var5).field2219; // L: 6877
							if (var8 == 1) { // L: 6878
								var90.sequenceFrame = 0; // L: 6879
								var90.sequenceFrameCycle = 0; // L: 6880
								var90.sequenceDelay = var21; // L: 6881
								var90.field1173 = 0; // L: 6882
							} else if (var8 == 2) { // L: 6884
								var90.field1173 = 0; // L: 6885
							}
						} else if (var5 == -1 || var90.sequence == -1 || class4.SequenceDefinition_get(var5).field2212 >= class4.SequenceDefinition_get(var90.sequence).field2212) { // L: 6888
							var90.sequence = var5; // L: 6889
							var90.sequenceFrame = 0; // L: 6890
							var90.sequenceFrameCycle = 0; // L: 6891
							var90.sequenceDelay = var21; // L: 6892
							var90.field1173 = 0; // L: 6893
							var90.field1202 = var90.pathLength; // L: 6894
						}
					}

					var1.serverPacket = null; // L: 6898
					return true; // L: 6899
				}

				if (ServerPacket.field3072 == var1.serverPacket) { // L: 6901
					UserComparator3.method2766(); // L: 6902
					var79 = var3.readByte(); // L: 6903
					class132 var73 = new class132(var3); // L: 6904
					ClanSettings var59;
					if (var79 >= 0) { // L: 6906
						var59 = currentClanSettings[var79];
					} else {
						var59 = class83.guestClanSettings; // L: 6907
					}

					var73.method3028(var59); // L: 6908
					var1.serverPacket = null; // L: 6909
					return true; // L: 6910
				}

				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) { // L: 6912
					var79 = var3.readByte(); // L: 6913
					var23 = (long)var3.readUnsignedShort(); // L: 6914
					var25 = (long)var3.readMedium(); // L: 6915
					var27 = var25 + (var23 << 32); // L: 6916
					boolean var62 = false; // L: 6917
					ClanChannel var93 = var79 >= 0 ? currentClanChannels[var79] : MusicPatchPcmStream.guestClanChannel; // L: 6918
					if (var93 == null) { // L: 6919
						var62 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) { // L: 6921
							if (var27 == crossWorldMessageIds[var13]) { // L: 6922
								var62 = true; // L: 6923
								break; // L: 6924
							}
						}
					}

					if (!var62) { // L: 6928
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var27; // L: 6929
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100; // L: 6930
						var46 = Occluder.method4474(var3); // L: 6931
						var14 = var79 >= 0 ? 43 : 46; // L: 6932
						class120.addChatMessage(var14, "", var46, var93.name); // L: 6933
					}

					var1.serverPacket = null; // L: 6935
					return true; // L: 6936
				}

				if (ServerPacket.field3143 == var1.serverPacket) { // L: 6938
					Varps.friendSystem.ignoreList.read(var3, var1.serverPacketLength); // L: 6939
					class364.FriendSystem_invalidateIgnoreds(); // L: 6940
					field700 = cycleCntr; // L: 6941
					var1.serverPacket = null; // L: 6942
					return true; // L: 6943
				}

				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) { // L: 6945
					class29.field182 = null; // L: 6946
					var1.serverPacket = null; // L: 6947
					return true; // L: 6948
				}

				if (ServerPacket.REBUILD_REGION == var1.serverPacket) { // L: 6950
					return this.method1206(var1, 1); // L: 6951
				}

				if (ServerPacket.MIDI_SONG == var1.serverPacket) { // L: 6953
					destinationX = var3.readUnsignedByte(); // L: 6954
					if (destinationX == 255) { // L: 6955
						destinationX = 0;
					}

					destinationY = var3.readUnsignedByte(); // L: 6956
					if (destinationY == 255) { // L: 6957
						destinationY = 0;
					}

					var1.serverPacket = null; // L: 6958
					return true; // L: 6959
				}

				if (ServerPacket.IF_MOVESUB == var1.serverPacket) { // L: 6961
					var50 = var3.readStringCp1252NullTerminated(); // L: 6962
					Object[] var72 = new Object[var50.length() + 1]; // L: 6963

					for (var21 = var50.length() - 1; var21 >= 0; --var21) { // L: 6964
						if (var50.charAt(var21) == 's') { // L: 6965
							var72[var21 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var72[var21 + 1] = new Integer(var3.readInt()); // L: 6966
						}
					}

					var72[0] = new Integer(var3.readInt()); // L: 6968
					ScriptEvent var58 = new ScriptEvent(); // L: 6969
					var58.args = var72; // L: 6970
					class348.runScriptEvent(var58); // L: 6971
					var1.serverPacket = null; // L: 6972
					return true; // L: 6973
				}

				if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) { // L: 6975
					var20 = var3.readUnsignedShortAddLE(); // L: 6976
					var5 = var3.readUnsignedIntLE(); // L: 6977
					var21 = var3.readUnsignedByteAdd(); // L: 6978
					var88 = (InterfaceParent)interfaceParents.get((long)var5); // L: 6979
					if (var88 != null) { // L: 6980
						class120.closeInterface(var88, var20 != var88.group);
					}

					class134.method3053(var5, var20, var21); // L: 6981
					var1.serverPacket = null; // L: 6982
					return true; // L: 6983
				}

				if (ServerPacket.field3103 == var1.serverPacket) { // L: 6985
					class33.method647(); // L: 6986
					var20 = var3.readUnsignedIntME(); // L: 6987
					var5 = var3.readUnsignedByteAdd(); // L: 6988
					var21 = var3.readUnsignedByteAdd(); // L: 6989
					experience[var5] = var20; // L: 6990
					currentLevels[var5] = var21; // L: 6991
					levels[var5] = 1; // L: 6992

					for (var7 = 0; var7 < 98; ++var7) { // L: 6993
						if (var20 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					changedSkills[++changedSkillsCount - 1 & 31] = var5; // L: 6994
					var1.serverPacket = null; // L: 6995
					return true; // L: 6996
				}

				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) { // L: 6998
					isCameraLocked = true; // L: 6999
					field544 = false; // L: 7000
					SceneTilePaint.field2638 = var3.readUnsignedByte() * 16384; // L: 7001
					UrlRequester.field1355 = var3.readUnsignedByte() * 16384; // L: 7002
					Strings.field3978 = var3.readUnsignedShort(); // L: 7003
					ObjectSound.field832 = var3.readUnsignedByte(); // L: 7004
					UserComparator6.field1398 = var3.readUnsignedByte(); // L: 7005
					if (UserComparator6.field1398 >= 100) { // L: 7006
						TaskHandler.cameraX = SceneTilePaint.field2638 * 128 + 64; // L: 7007
						ApproximateRouteStrategy.cameraZ = UrlRequester.field1355 * 128 + 64; // L: 7008
						SecureRandomFuture.cameraY = class120.getTileHeight(TaskHandler.cameraX, ApproximateRouteStrategy.cameraZ, Tiles.Client_plane) - Strings.field3978; // L: 7009
					}

					var1.serverPacket = null; // L: 7011
					return true; // L: 7012
				}

				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) { // L: 7014
					return this.method1207(var1); // L: 7015
				}

				if (ServerPacket.field3151 == var1.serverPacket) { // L: 7017
					class386.updateNpcs(true, var3); // L: 7018
					var1.serverPacket = null; // L: 7019
					return true; // L: 7020
				}

				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) { // L: 7022
					class33.method647(); // L: 7023
					runEnergy = var3.readUnsignedByte(); // L: 7024
					field706 = cycleCntr; // L: 7025
					var1.serverPacket = null; // L: 7026
					return true; // L: 7027
				}

				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) { // L: 7029
					var20 = var3.readUnsignedShort(); // L: 7030
					var5 = var3.readUnsignedByte(); // L: 7031
					var21 = var3.readUnsignedShort(); // L: 7032
					class67.queueSoundEffect(var20, var5, var21); // L: 7033
					var1.serverPacket = null; // L: 7034
					return true; // L: 7035
				}

				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) { // L: 7037
					var20 = var3.readInt(); // L: 7038
					var71 = SpotAnimationDefinition.getWidget(var20); // L: 7039
					var71.modelType = 3; // L: 7040
					var71.modelId = class67.localPlayer.appearance.getChatHeadId(); // L: 7041
					class403.invalidateWidget(var71); // L: 7042
					var1.serverPacket = null; // L: 7043
					return true; // L: 7044
				}

				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) { // L: 7046
					SoundSystem.method813(class264.field3049); // L: 7047
					var1.serverPacket = null; // L: 7048
					return true; // L: 7049
				}

				if (ServerPacket.field3127 == var1.serverPacket && isCameraLocked) { // L: 7051 7052
					field544 = true; // L: 7053
					ObjectSound.field832 = var3.readUnsignedByte(); // L: 7054
					UserComparator6.field1398 = var3.readUnsignedByte(); // L: 7055
					SoundSystem.field327 = var3.readUnsignedByte(); // L: 7056
					class93.field1270 = var3.readUnsignedByte(); // L: 7057

					for (var20 = 0; var20 < 5; ++var20) { // L: 7058
						field755[var20] = false;
					}

					var1.serverPacket = null; // L: 7059
					return true; // L: 7060
				}

				if (ServerPacket.field3074 == var1.serverPacket) { // L: 7063
					rebootTimer = var3.readUnsignedShort() * 30; // L: 7064
					field706 = cycleCntr; // L: 7065
					var1.serverPacket = null; // L: 7066
					return true; // L: 7067
				}

				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) { // L: 7069
					var21 = var3.readUnsignedShortLE(); // L: 7074
					var20 = var3.readUnsignedShortAdd(); // L: 7075
					var90 = npcs[var20]; // L: 7076
					var5 = var3.readUnsignedIntLE(); // L: 7077
					if (var90 != null) { // L: 7078
						var90.spotAnimation = var21; // L: 7079
						var90.spotAnimationHeight = var5 >> 16; // L: 7080
						var90.field1147 = (var5 & 65535) + cycle; // L: 7081
						var90.spotAnimationFrame = 0; // L: 7082
						var90.spotAnimationFrameCycle = 0; // L: 7083
						if (var90.field1147 > cycle) { // L: 7084
							var90.spotAnimationFrame = -1; // L: 7085
						}

						if (var90.spotAnimation == 65535) { // L: 7087
							var90.spotAnimation = -1; // L: 7088
						}
					}

					var1.serverPacket = null; // L: 7091
					return true; // L: 7092
				}

				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) { // L: 7094
					var20 = var3.readUnsignedShortLE(); // L: 7095
					class33.method639(var20); // L: 7096
					changedItemContainers[++field694 - 1 & 31] = var20 & 32767; // L: 7097
					var1.serverPacket = null; // L: 7098
					return true; // L: 7099
				}

				if (ServerPacket.field3092 == var1.serverPacket) { // L: 7101
					var76 = var3.readBoolean(); // L: 7102
					if (var76) { // L: 7103
						if (Varcs.field1323 == null) { // L: 7104
							Varcs.field1323 = new class327();
						}
					} else {
						Varcs.field1323 = null; // L: 7106
					}

					var1.serverPacket = null; // L: 7107
					return true; // L: 7108
				}

				if (ServerPacket.UPDATE_STAT == var1.serverPacket) { // L: 7110
					var11 = var3.readUnsignedShort(); // L: 7119
					var9 = var3.readUnsignedShortLE(); // L: 7120
					var21 = var3.readMediumME(); // L: 7121
					var20 = var21 >> 16; // L: 7122
					var5 = var21 >> 8 & 255; // L: 7123
					var7 = var20 + (var21 >> 4 & 7); // L: 7124
					var8 = var5 + (var21 & 7); // L: 7125
					var10 = var3.readUnsignedByteSub(); // L: 7126
					if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) { // L: 7127
						var7 = var7 * 128 + 64; // L: 7128
						var8 = var8 * 128 + 64; // L: 7129
						GraphicsObject var47 = new GraphicsObject(var9, Tiles.Client_plane, var7, var8, class120.getTileHeight(var7, var8, Tiles.Client_plane) - var10, var11, cycle); // L: 7130
						graphicsObjects.addFirst(var47); // L: 7131
					}

					var1.serverPacket = null; // L: 7133
					return true; // L: 7134
				}

				if (ServerPacket.field3086 == var1.serverPacket) { // L: 7136
					var20 = var3.readUnsignedIntLE(); // L: 7137
					var5 = var3.readUnsignedShortAddLE(); // L: 7138
					var6 = SpotAnimationDefinition.getWidget(var20); // L: 7139
					if (var6.modelType != 1 || var5 != var6.modelId) { // L: 7140
						var6.modelType = 1; // L: 7141
						var6.modelId = var5; // L: 7142
						class403.invalidateWidget(var6); // L: 7143
					}

					var1.serverPacket = null; // L: 7145
					return true; // L: 7146
				}

				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) { // L: 7148
					SoundSystem.method813(class264.field3055); // L: 7149
					var1.serverPacket = null; // L: 7150
					return true; // L: 7151
				}

				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) { // L: 7153
					class33.method647(); // L: 7154
					weight = var3.readShort(); // L: 7155
					field706 = cycleCntr; // L: 7156
					var1.serverPacket = null; // L: 7157
					return true; // L: 7158
				}

				if (ServerPacket.IF_SETANGLE == var1.serverPacket) { // L: 7160
					SoundSystem.method813(class264.field3051); // L: 7161
					var1.serverPacket = null; // L: 7162
					return true; // L: 7163
				}

				if (ServerPacket.field3105 == var1.serverPacket) { // L: 7165
					minimapState = var3.readUnsignedByte(); // L: 7166
					var1.serverPacket = null; // L: 7167
					return true; // L: 7168
				}

				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) { // L: 7170
					ServerPacket.readReflectionCheck(var3, var1.serverPacketLength); // L: 7171
					var1.serverPacket = null; // L: 7172
					return true; // L: 7173
				}

				if (ServerPacket.field3171 == var1.serverPacket) { // L: 7175
					var21 = var3.readMediumME(); // L: 7186
					var20 = var21 >> 16; // L: 7187
					var5 = var21 >> 8 & 255; // L: 7188
					var7 = var20 + (var21 >> 4 & 7); // L: 7189
					var8 = var5 + (var21 & 7); // L: 7190
					var13 = var3.readUnsignedShortAddLE(); // L: 7191
					var9 = var3.readUnsignedByteSub(); // L: 7192
					var10 = var9 >> 2; // L: 7193
					var11 = var9 & 3; // L: 7194
					var12 = field564[var10]; // L: 7195
					if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) { // L: 7196
						if (var12 == 0) { // L: 7197
							BoundaryObject var87 = MusicPatchNode.scene.method4281(Tiles.Client_plane, var7, var8); // L: 7198
							if (var87 != null) { // L: 7199
								var15 = class156.Entity_unpackID(var87.tag); // L: 7200
								if (var10 == 2) { // L: 7201
									var87.renderable1 = new DynamicObject(var15, 2, var11 + 4, Tiles.Client_plane, var7, var8, var13, false, var87.renderable1); // L: 7202
									var87.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, Tiles.Client_plane, var7, var8, var13, false, var87.renderable2); // L: 7203
								} else {
									var87.renderable1 = new DynamicObject(var15, var10, var11, Tiles.Client_plane, var7, var8, var13, false, var87.renderable1); // L: 7205
								}
							}
						} else if (var12 == 1) { // L: 7208
							WallDecoration var86 = MusicPatchNode.scene.method4282(Tiles.Client_plane, var7, var8); // L: 7209
							if (var86 != null) { // L: 7210
								var15 = class156.Entity_unpackID(var86.tag); // L: 7211
								if (var10 != 4 && var10 != 5) { // L: 7212
									if (var10 == 6) { // L: 7215
										var86.renderable1 = new DynamicObject(var15, 4, var11 + 4, Tiles.Client_plane, var7, var8, var13, false, var86.renderable1); // L: 7216
									} else if (var10 == 7) { // L: 7218
										var86.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, Tiles.Client_plane, var7, var8, var13, false, var86.renderable1); // L: 7219
									} else if (var10 == 8) { // L: 7221
										var86.renderable1 = new DynamicObject(var15, 4, var11 + 4, Tiles.Client_plane, var7, var8, var13, false, var86.renderable1); // L: 7222
										var86.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, Tiles.Client_plane, var7, var8, var13, false, var86.renderable2); // L: 7223
									}
								} else {
									var86.renderable1 = new DynamicObject(var15, 4, var11, Tiles.Client_plane, var7, var8, var13, false, var86.renderable1); // L: 7213
								}
							}
						} else if (var12 == 2) { // L: 7227
							var41 = MusicPatchNode.scene.getGameObject(Tiles.Client_plane, var7, var8); // L: 7228
							if (var10 == 11) { // L: 7229
								var10 = 10; // L: 7230
							}

							if (var41 != null) { // L: 7232
								var41.renderable = new DynamicObject(class156.Entity_unpackID(var41.tag), var10, var11, Tiles.Client_plane, var7, var8, var13, false, var41.renderable); // L: 7233
							}
						} else if (var12 == 3) { // L: 7236
							FloorDecoration var85 = MusicPatchNode.scene.getFloorDecoration(Tiles.Client_plane, var7, var8); // L: 7237
							if (var85 != null) { // L: 7238
								var85.renderable = new DynamicObject(class156.Entity_unpackID(var85.tag), 22, var11, Tiles.Client_plane, var7, var8, var13, false, var85.renderable); // L: 7239
							}
						}
					}

					var1.serverPacket = null; // L: 7243
					return true; // L: 7244
				}

				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) { // L: 7246
					var20 = var3.readUnsignedShortLE(); // L: 7247
					byte var54 = var3.readByteAdd(); // L: 7248
					Varps.Varps_temp[var20] = var54; // L: 7249
					if (Varps.Varps_main[var20] != var54) { // L: 7250
						Varps.Varps_main[var20] = var54; // L: 7251
					}

					class269.changeGameOptions(var20); // L: 7253
					changedVarps[++changedVarpCount - 1 & 31] = var20; // L: 7254
					var1.serverPacket = null; // L: 7255
					return true; // L: 7256
				}

				if (ServerPacket.field3097 == var1.serverPacket) { // L: 7258
					var20 = var3.readInt(); // L: 7259
					InterfaceParent var70 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7260
					if (var70 != null) { // L: 7261
						class120.closeInterface(var70, true);
					}

					if (meslayerContinueWidget != null) { // L: 7262
						class403.invalidateWidget(meslayerContinueWidget); // L: 7263
						meslayerContinueWidget = null; // L: 7264
					}

					var1.serverPacket = null; // L: 7266
					return true; // L: 7267
				}

				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) { // L: 7269
					class29.field182 = new class393(class150.HitSplatDefinition_cached); // L: 7270
					var1.serverPacket = null; // L: 7271
					return true; // L: 7272
				}

				if (ServerPacket.field3071 == var1.serverPacket) { // L: 7274
					var20 = var3.readUnsignedIntLE(); // L: 7275
					var5 = var3.readUnsignedIntME(); // L: 7276
					InterfaceParent var56 = (InterfaceParent)interfaceParents.get((long)var20); // L: 7277
					var88 = (InterfaceParent)interfaceParents.get((long)var5); // L: 7278
					if (var88 != null) { // L: 7279
						class120.closeInterface(var88, var56 == null || var56.group != var88.group);
					}

					if (var56 != null) { // L: 7280
						var56.remove(); // L: 7281
						interfaceParents.put(var56, (long)var5); // L: 7282
					}

					var33 = SpotAnimationDefinition.getWidget(var20); // L: 7284
					if (var33 != null) { // L: 7285
						class403.invalidateWidget(var33);
					}

					var33 = SpotAnimationDefinition.getWidget(var5); // L: 7286
					if (var33 != null) { // L: 7287
						class403.invalidateWidget(var33); // L: 7288
						StructComposition.revalidateWidgetScroll(Calendar.Widget_interfaceComponents[var33.id >>> 16], var33, true); // L: 7289
					}

					if (rootInterface != -1) { // L: 7291
						class18.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null; // L: 7292
					return true; // L: 7293
				}

				if (ServerPacket.field3080 == var1.serverPacket) { // L: 7295
					var20 = var3.readUnsignedShortLE(); // L: 7296
					var5 = var3.readUnsignedIntME(); // L: 7297
					var6 = SpotAnimationDefinition.getWidget(var5); // L: 7298
					if (var6 != null && var6.type == 0) { // L: 7299
						if (var20 > var6.scrollHeight - var6.height) { // L: 7300
							var20 = var6.scrollHeight - var6.height;
						}

						if (var20 < 0) { // L: 7301
							var20 = 0;
						}

						if (var20 != var6.scrollY) { // L: 7302
							var6.scrollY = var20; // L: 7303
							class403.invalidateWidget(var6); // L: 7304
						}
					}

					var1.serverPacket = null; // L: 7307
					return true; // L: 7308
				}

				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) { // L: 7310
					var20 = var3.readInt(); // L: 7311
					var52 = var3.readUnsignedByte() == 1; // L: 7312
					var6 = SpotAnimationDefinition.getWidget(var20); // L: 7313
					if (var52 != var6.isHidden) { // L: 7314
						var6.isHidden = var52; // L: 7315
						class403.invalidateWidget(var6); // L: 7316
					}

					var1.serverPacket = null; // L: 7318
					return true; // L: 7319
				}

				if (ServerPacket.field3147 == var1.serverPacket) { // L: 7321
					var20 = var3.readInt(); // L: 7322
					var5 = var3.readInt(); // L: 7323
					var21 = DynamicObject.getGcDuration(); // L: 7324
					PacketBufferNode var42 = class120.getPacketBufferNode(ClientPacket.OPPLAYER6, packetWriter.isaacCipher); // L: 7326
					var42.packetBuffer.writeInt(var20); // L: 7327
					var42.packetBuffer.writeInt(var5); // L: 7328
					var42.packetBuffer.writeByte(GameEngine.fps); // L: 7329
					var42.packetBuffer.writeByteSub(var21); // L: 7330
					packetWriter.addNode(var42); // L: 7331
					var1.serverPacket = null; // L: 7332
					return true; // L: 7333
				}

				if (ServerPacket.field3073 == var1.serverPacket) { // L: 7335
					var20 = var3.readInt(); // L: 7336
					var22 = var3.readStringCp1252NullTerminated(); // L: 7337
					var6 = SpotAnimationDefinition.getWidget(var20); // L: 7338
					if (!var22.equals(var6.text)) { // L: 7339
						var6.text = var22; // L: 7340
						class403.invalidateWidget(var6); // L: 7341
					}

					var1.serverPacket = null; // L: 7343
					return true; // L: 7344
				}

				Clock.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1350 != null ? var1.field1350.id : -1) + "," + (var1.field1345 != null ? var1.field1345.id : -1) + "," + var1.serverPacketLength, (Throwable)null); // L: 7346
				ApproximateRouteStrategy.logOut(); // L: 7347
			} catch (IOException var48) { // L: 7349
				class67.method2033(); // L: 7350
			} catch (Exception var49) {
				var22 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1350 != null ? var1.field1350.id : -1) + "," + (var1.field1345 != null ? var1.field1345.id : -1) + "," + var1.serverPacketLength + "," + (class67.localPlayer.pathX[0] + class128.baseX * 64) + "," + (class67.localPlayer.pathY[0] + WorldMapData_1.baseY * 64) + ","; // L: 7353

				for (var21 = 0; var21 < var1.serverPacketLength && var21 < 50; ++var21) { // L: 7354
					var22 = var22 + var3.array[var21] + ",";
				}

				Clock.RunException_sendStackTrace(var22, var49); // L: 7355
				ApproximateRouteStrategy.logOut(); // L: 7356
			}

			return true; // L: 7358
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "279726113"
	)
	@Export("menu")
	final void menu() {
		boolean var1 = false; // L: 8187

		int var2;
		int var5;
		while (!var1) { // L: 8188
			var1 = true; // L: 8189

			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) { // L: 8190
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) { // L: 8191
					String var18 = menuTargets[var2]; // L: 8192
					menuTargets[var2] = menuTargets[var2 + 1]; // L: 8193
					menuTargets[var2 + 1] = var18; // L: 8194
					String var19 = menuActions[var2]; // L: 8195
					menuActions[var2] = menuActions[var2 + 1]; // L: 8196
					menuActions[var2 + 1] = var19; // L: 8197
					var5 = menuOpcodes[var2]; // L: 8198
					menuOpcodes[var2] = menuOpcodes[var2 + 1]; // L: 8199
					menuOpcodes[var2 + 1] = var5; // L: 8200
					var5 = menuArguments1[var2]; // L: 8201
					menuArguments1[var2] = menuArguments1[var2 + 1]; // L: 8202
					menuArguments1[var2 + 1] = var5; // L: 8203
					var5 = menuArguments2[var2]; // L: 8204
					menuArguments2[var2] = menuArguments2[var2 + 1]; // L: 8205
					menuArguments2[var2 + 1] = var5; // L: 8206
					var5 = menuIdentifiers[var2]; // L: 8207
					menuIdentifiers[var2] = menuIdentifiers[var2 + 1]; // L: 8208
					menuIdentifiers[var2 + 1] = var5; // L: 8209
					var5 = menuItemIds[var2]; // L: 8210
					menuItemIds[var2] = menuItemIds[var2 + 1]; // L: 8211
					menuItemIds[var2 + 1] = var5; // L: 8212
					boolean var15 = menuShiftClick[var2]; // L: 8213
					menuShiftClick[var2] = menuShiftClick[var2 + 1]; // L: 8214
					menuShiftClick[var2 + 1] = var15; // L: 8215
					var1 = false; // L: 8216
				}
			}
		}

		if (User.dragInventoryWidget == null) { // L: 8221
			if (clickedWidget == null) { // L: 8222
				int var4;
				label260: {
					int var20 = MouseHandler.MouseHandler_lastButton; // L: 8223
					int var3;
					int var8;
					int var21;
					int var22;
					if (isMenuOpen) { // L: 8224
						if (var20 != 1 && (Renderable.mouseCam || var20 != 4)) { // L: 8225
							var2 = MouseHandler.MouseHandler_x; // L: 8226
							var3 = MouseHandler.MouseHandler_y; // L: 8227
							if (var2 < BufferedSource.menuX - 10 || var2 > MusicPatchNode.menuWidth + BufferedSource.menuX + 10 || var3 < class115.menuY - 10 || var3 > class115.menuY + GrandExchangeEvents.menuHeight + 10) { // L: 8228
								isMenuOpen = false; // L: 8229
								class9.method89(BufferedSource.menuX, class115.menuY, MusicPatchNode.menuWidth, GrandExchangeEvents.menuHeight); // L: 8230
							}
						}

						if (var20 == 1 || !Renderable.mouseCam && var20 == 4) { // L: 8233
							var2 = BufferedSource.menuX; // L: 8234
							var3 = class115.menuY; // L: 8235
							var4 = MusicPatchNode.menuWidth; // L: 8236
							var5 = MouseHandler.MouseHandler_lastPressedX; // L: 8237
							var22 = MouseHandler.MouseHandler_lastPressedY; // L: 8238
							var21 = -1; // L: 8239

							int var17;
							for (var8 = 0; var8 < menuOptionsCount; ++var8) { // L: 8240
								var17 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31; // L: 8241
								if (var5 > var2 && var5 < var4 + var2 && var22 > var17 - 13 && var22 < var17 + 3) { // L: 8242
									var21 = var8;
								}
							}

							if (var21 != -1 && var21 >= 0) { // L: 8244 8245
								var8 = menuArguments1[var21]; // L: 8246
								var17 = menuArguments2[var21]; // L: 8247
								int var10 = menuOpcodes[var21]; // L: 8248
								int var11 = menuIdentifiers[var21]; // L: 8249
								int var12 = menuItemIds[var21]; // L: 8250
								String var13 = menuActions[var21]; // L: 8251
								String var14 = menuTargets[var21]; // L: 8252
								class17.menuAction(var8, var17, var10, var11, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8253
							}

							isMenuOpen = false; // L: 8255
							class9.method89(BufferedSource.menuX, class115.menuY, MusicPatchNode.menuWidth, GrandExchangeEvents.menuHeight); // L: 8256
						}
					} else {
						var2 = class156.method3411(); // L: 8260
						if ((var20 == 1 || !Renderable.mouseCam && var20 == 4) && var2 >= 0) { // L: 8261
							var3 = menuOpcodes[var2]; // L: 8262
							if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) { // L: 8263
								var4 = menuArguments1[var2]; // L: 8264
								var5 = menuArguments2[var2]; // L: 8265
								Widget var6 = SpotAnimationDefinition.getWidget(var5); // L: 8266
								if (class328.method6220(class97.getWidgetFlags(var6))) { // L: 8268
									break label260;
								}

								var8 = class97.getWidgetFlags(var6); // L: 8270
								boolean var7 = (var8 >> 29 & 1) != 0; // L: 8272
								if (var7) { // L: 8274
									break label260;
								}
							}
						}

						if ((var20 == 1 || !Renderable.mouseCam && var20 == 4) && this.shouldLeftClickOpenMenu()) { // L: 8303 8304
							var20 = 2; // L: 8305
						}

						if ((var20 == 1 || !Renderable.mouseCam && var20 == 4) && menuOptionsCount > 0 && var2 >= 0) { // L: 8308 8310
							var3 = menuArguments1[var2]; // L: 8311
							var4 = menuArguments2[var2]; // L: 8312
							var5 = menuOpcodes[var2]; // L: 8313
							var22 = menuIdentifiers[var2]; // L: 8314
							var21 = menuItemIds[var2]; // L: 8315
							String var16 = menuActions[var2]; // L: 8316
							String var9 = menuTargets[var2]; // L: 8317
							class17.menuAction(var3, var4, var5, var22, var21, var16, var9, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 8318
						}

						if (var20 == 2 && menuOptionsCount > 0) { // L: 8321
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return; // L: 8323
				}

				if (User.dragInventoryWidget != null && !field763 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) { // L: 8276 8277
					NPCComposition.method3663(draggedWidgetX, draggedWidgetY); // L: 8278
				}

				field763 = false; // L: 8281
				itemDragDuration = 0; // L: 8282
				if (User.dragInventoryWidget != null) { // L: 8283
					class403.invalidateWidget(User.dragInventoryWidget);
				}

				User.dragInventoryWidget = SpotAnimationDefinition.getWidget(var5); // L: 8284
				dragItemSlotSource = var4; // L: 8285
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX; // L: 8286
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY; // L: 8287
				if (var2 >= 0) { // L: 8288
					class146.tempMenuAction = new MenuAction(); // L: 8289
					class146.tempMenuAction.param0 = menuArguments1[var2]; // L: 8290
					class146.tempMenuAction.param1 = menuArguments2[var2]; // L: 8291
					class146.tempMenuAction.opcode = menuOpcodes[var2]; // L: 8292
					class146.tempMenuAction.identifier = menuIdentifiers[var2]; // L: 8293
					class146.tempMenuAction.itemId = menuItemIds[var2]; // L: 8294
					class146.tempMenuAction.action = menuActions[var2]; // L: 8295
					class146.tempMenuAction.target = menuTargets[var2]; // L: 8296
				}

				class403.invalidateWidget(User.dragInventoryWidget); // L: 8298
			}
		}
	} // L: 8299

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-910299550"
	)
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = class156.method3411(); // L: 8326
		return (leftClickOpensMenu && menuOptionsCount > 2 || class1.method15(var1)) && !menuShiftClick[var1]; // L: 8327
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "831466911"
	)
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = class29.fontBold12.stringWidth("Choose Option"); // L: 8332

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) { // L: 8333
			var5 = class29.fontBold12.stringWidth(DynamicObject.method2135(var4)); // L: 8334
			if (var5 > var3) { // L: 8335
				var3 = var5;
			}
		}

		var3 += 8; // L: 8337
		var4 = menuOptionsCount * 15 + 22; // L: 8338
		var5 = var1 - var3 / 2; // L: 8339
		if (var3 + var5 > class123.canvasWidth) { // L: 8340
			var5 = class123.canvasWidth - var3;
		}

		if (var5 < 0) { // L: 8341
			var5 = 0;
		}

		int var6 = var2; // L: 8342
		if (var2 + var4 > class166.canvasHeight) { // L: 8343
			var6 = class166.canvasHeight - var4;
		}

		if (var6 < 0) { // L: 8344
			var6 = 0;
		}

		BufferedSource.menuX = var5; // L: 8345
		class115.menuY = var6; // L: 8346
		MusicPatchNode.menuWidth = var3; // L: 8347
		GrandExchangeEvents.menuHeight = menuOptionsCount * 15 + 22; // L: 8348
		var1 -= viewportOffsetX; // L: 8350
		var2 -= viewportOffsetY; // L: 8351
		MusicPatchNode.scene.menuOpen(Tiles.Client_plane, var1, var2, false); // L: 8352
		isMenuOpen = true; // L: 8353
	} // L: 8354

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1858917735"
	)
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface; // L: 10313
		int var3 = class123.canvasWidth; // L: 10314
		int var4 = class166.canvasHeight; // L: 10315
		if (FloorOverlayDefinition.loadInterface(var2)) { // L: 10317
			StructComposition.resizeInterface(Calendar.Widget_interfaceComponents[var2], -1, var3, var4, var1); // L: 10318
		}

	} // L: 10320

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Lkw;I)V",
		garbageValue = "903202346"
	)
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = var1.parentId == -1 ? null : SpotAnimationDefinition.getWidget(var1.parentId); // L: 10323
		int var3;
		int var4;
		if (var2 == null) { // L: 10326
			var3 = class123.canvasWidth; // L: 10327
			var4 = class166.canvasHeight; // L: 10328
		} else {
			var3 = var2.width; // L: 10331
			var4 = var2.height; // L: 10332
		}

		class93.alignWidgetSize(var1, var3, var4, false); // L: 10334
		HealthBarDefinition.alignWidgetPosition(var1, var3, var4); // L: 10335
	} // L: 10336

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-125"
	)
	final void method1208() {
		class403.invalidateWidget(clickedWidget); // L: 11396
		++class259.widgetDragDuration; // L: 11397
		if (field686 && field683) { // L: 11398
			int var1 = MouseHandler.MouseHandler_x; // L: 11407
			int var2 = MouseHandler.MouseHandler_y; // L: 11408
			var1 -= widgetClickX; // L: 11409
			var2 -= widgetClickY; // L: 11410
			if (var1 < field783) { // L: 11411
				var1 = field783;
			}

			if (var1 + clickedWidget.width > field783 + clickedWidgetParent.width) { // L: 11412
				var1 = field783 + clickedWidgetParent.width - clickedWidget.width;
			}

			if (var2 < field744) { // L: 11413
				var2 = field744;
			}

			if (var2 + clickedWidget.height > field744 + clickedWidgetParent.height) { // L: 11414
				var2 = field744 + clickedWidgetParent.height - clickedWidget.height;
			}

			int var3 = var1 - field687; // L: 11415
			int var4 = var2 - field688; // L: 11416
			int var5 = clickedWidget.dragZoneSize; // L: 11417
			if (class259.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) { // L: 11418 11419
				isDraggingWidget = true; // L: 11420
			}

			int var6 = var1 - field783 + clickedWidgetParent.scrollX; // L: 11423
			int var7 = var2 - field744 + clickedWidgetParent.scrollY; // L: 11424
			ScriptEvent var8;
			if (clickedWidget.onDrag != null && isDraggingWidget) { // L: 11425
				var8 = new ScriptEvent(); // L: 11426
				var8.widget = clickedWidget; // L: 11427
				var8.mouseX = var6; // L: 11428
				var8.mouseY = var7; // L: 11429
				var8.args = clickedWidget.onDrag; // L: 11430
				class348.runScriptEvent(var8); // L: 11431
			}

			if (MouseHandler.MouseHandler_currentButton == 0) { // L: 11433
				if (isDraggingWidget) { // L: 11434
					if (clickedWidget.onDragComplete != null) { // L: 11435
						var8 = new ScriptEvent(); // L: 11436
						var8.widget = clickedWidget; // L: 11437
						var8.mouseX = var6; // L: 11438
						var8.mouseY = var7; // L: 11439
						var8.dragTarget = draggedOnWidget; // L: 11440
						var8.args = clickedWidget.onDragComplete; // L: 11441
						class348.runScriptEvent(var8); // L: 11442
					}

					if (draggedOnWidget != null && HitSplatDefinition.method3782(clickedWidget) != null) { // L: 11444
						PacketBufferNode var9 = class120.getPacketBufferNode(ClientPacket.FREECAM_EXIT, packetWriter.isaacCipher); // L: 11446
						var9.packetBuffer.writeShortAddLE(clickedWidget.childIndex); // L: 11447
						var9.packetBuffer.writeShortLE(draggedOnWidget.itemId); // L: 11448
						var9.packetBuffer.writeShortAddLE(clickedWidget.itemId); // L: 11449
						var9.packetBuffer.writeIntIME(draggedOnWidget.id); // L: 11450
						var9.packetBuffer.writeShortLE(draggedOnWidget.childIndex); // L: 11451
						var9.packetBuffer.writeIntIME(clickedWidget.id); // L: 11452
						packetWriter.addNode(var9); // L: 11453
					}
				} else if (this.shouldLeftClickOpenMenu()) { // L: 11457
					this.openMenu(widgetClickX + field687, field688 + widgetClickY); // L: 11458
				} else if (menuOptionsCount > 0) { // L: 11460
					NPCComposition.method3663(field687 + widgetClickX, field688 + widgetClickY); // L: 11461
				}

				clickedWidget = null; // L: 11464
			}

		} else {
			if (class259.widgetDragDuration > 1) { // L: 11399
				if (!isDraggingWidget && menuOptionsCount > 0) { // L: 11400
					NPCComposition.method3663(field687 + widgetClickX, widgetClickY + field688); // L: 11401
				}

				clickedWidget = null; // L: 11403
			}

		}
	} // L: 11405 11466

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(B)Lqo;",
		garbageValue = "101"
	)
	@Export("username")
	public Username username() {
		return class67.localPlayer != null ? class67.localPlayer.username : null; // L: 12121
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) { // L: 870
			this.field533 = var1; // L: 873
			class139.method3101(10); // L: 874
		}
	} // L: 871 875

	@ObfuscatedSignature(
		descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
	)
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) { // L: 880
			this.field719 = var1; // L: 883
		}
	} // L: 881 884

	public boolean isOnLoginScreen() {
		return gameState == 10; // L: 889
	}

	public long getAccountHash() {
		return this.field710; // L: 894
	}

	public final void init() {
		try {
			if (this.checkHost()) { // L: 717
				for (int var1 = 0; var1 <= 28; ++var1) { // L: 718
					String var2 = this.getParameter(Integer.toString(var1)); // L: 719
					if (var2 != null) { // L: 720
						int var4;
						switch(var1) { // L: 721
						case 3:
							if (var2.equalsIgnoreCase("true")) { // L: 832
								isMembersWorld = true;
							} else {
								isMembersWorld = false; // L: 833
							}
							break;
						case 4:
							if (clientType == -1) { // L: 785
								clientType = Integer.parseInt(var2); // L: 786
							}
							break;
						case 5:
							worldProperties = Integer.parseInt(var2); // L: 756
							break; // L: 757
						case 6:
							var4 = Integer.parseInt(var2); // L: 772
							Language var13;
							if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) { // L: 774
								var13 = Language.Language_valuesOrdered[var4]; // L: 778
							} else {
								var13 = null; // L: 775
							}

							class271.clientLanguage = var13; // L: 780
							break; // L: 781
						case 7:
							var4 = Integer.parseInt(var2); // L: 811
							GameBuild[] var5 = class7.method59(); // L: 814
							int var6 = 0;

							GameBuild var8;
							while (true) {
								if (var6 >= var5.length) {
									var8 = null; // L: 825
									break;
								}

								GameBuild var7 = var5[var6]; // L: 816
								if (var4 == var7.buildId) { // L: 818
									var8 = var7; // L: 819
									break; // L: 820
								}

								++var6; // L: 815
							}

							WorldMapSectionType.field2825 = var8; // L: 827
							break; // L: 828
						case 8:
							if (var2.equalsIgnoreCase("true")) { // L: 804
							}
							break;
						case 9:
							AttackOption.field1279 = var2; // L: 766
							break; // L: 767
						case 10:
							class153.field1729 = (StudioGame)Varps.findEnumerated(InvDefinition.method3523(), Integer.parseInt(var2)); // L: 792
							if (StudioGame.oldscape == class153.field1729) { // L: 793
								Players.loginType = LoginType.oldscape;
							} else {
								Players.loginType = LoginType.field4650; // L: 794
							}
							break;
						case 11:
							Actor.field1164 = var2; // L: 746
							break; // L: 747
						case 12:
							worldId = Integer.parseInt(var2); // L: 799
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
							UserComparator10.field1393 = Integer.parseInt(var2); // L: 729
							break; // L: 730
						case 15:
							gameBuild = Integer.parseInt(var2); // L: 751
							break; // L: 752
						case 17:
							WorldMapSection1.field2879 = var2; // L: 761
							break; // L: 762
						case 21:
							field497 = Integer.parseInt(var2); // L: 724
							break; // L: 725
						case 25:
							int var3 = var2.indexOf("."); // L: 734
							if (var3 == -1) { // L: 735
								Integer.parseInt(var2); // L: 736
							} else {
								Integer.parseInt(var2.substring(0, var3)); // L: 739
								Integer.parseInt(var2.substring(var3 + 1)); // L: 740
							}
						}
					}
				}

				class97.method2585(); // L: 839
				WorldMapLabelSize.worldHost = this.getCodeBase().getHost(); // L: 840
				String var9 = WorldMapSectionType.field2825.name; // L: 841
				byte var10 = 0; // L: 842

				try {
					class33.method641("oldschool", var9, var10, 22); // L: 844
				} catch (Exception var11) { // L: 846
					Clock.RunException_sendStackTrace((String)null, var11); // L: 847
				}

				IgnoreList.client = this; // L: 849
				class130.clientType = clientType; // L: 850
				if (field571 == -1) { // L: 851
					field571 = 0; // L: 852
				}

				AccessFile.field4662 = System.getenv("JX_ACCESS_TOKEN"); // L: 854
				WorldMapManager.field2773 = System.getenv("JX_REFRESH_TOKEN"); // L: 855
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) { // L: 856
					this.field535 = true; // L: 857
				}

				this.startThread(765, 503, 208, 1); // L: 859
			}
		} catch (RuntimeException var12) {
			throw Bounds.newRunException(var12, "client.init(" + ')');
		}
	} // L: 860

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ls;B)Ln;",
		garbageValue = "1"
	)
	public static class3 method1723(class6 var0) {
		switch(var0.field14) { // L: 9
		case 0:
			return new class0(); // L: 12
		default:
			throw new IllegalArgumentException(); // L: 16
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lqu;",
		garbageValue = "-2098723867"
	)
	static IndexedSprite method1725(boolean var0, boolean var1) {
		return var0 ? (var1 ? class116.field1428 : UserComparator7.options_buttons_2Sprite) : (var1 ? SoundSystem.field324 : WorldMapDecoration.options_buttons_0Sprite); // L: 253
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1643217593"
	)
	static void method1726() {
		int var0 = Players.Players_count; // L: 4648
		int[] var1 = Players.Players_indices; // L: 4649

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4650
			if (var1[var2] != combatTargetPlayerIndex && var1[var2] != localPlayerIndex) { // L: 4651
				class67.addPlayerToScene(players[var1[var2]], true); // L: 4652
			}
		}

	} // L: 4654

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lgb;",
		garbageValue = "117"
	)
	static RouteStrategy method1724(int var0, int var1) {
		field786.approxDestinationX = var0; // L: 8113
		field786.approxDestinationY = var1; // L: 8114
		field786.approxDestinationSizeX = 1; // L: 8115
		field786.approxDestinationSizeY = 1; // L: 8116
		return field786; // L: 8117
	}
}
