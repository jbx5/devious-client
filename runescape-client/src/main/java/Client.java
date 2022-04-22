import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.security.SecureRandom; import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Future;





import netscape.javascript.JSObject; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed , OAuthApi {
	@ObfuscatedName("rw")
	@ObfuscatedSignature(descriptor = 
	"[Lex;")

	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("us")
	@ObfuscatedGetter(intValue = 
	1674651291)

	public static int field779;
	@ObfuscatedName("ss")
	static boolean field746;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(intValue = 
	599158567)

	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("to")
	@ObfuscatedGetter(intValue = 
	-296270013)

	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("rk")
	@ObfuscatedGetter(intValue = 
	1370188631)

	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("rf")
	@ObfuscatedGetter(intValue = 
	-1262873417)

	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("vi")
	@ObfuscatedSignature(descriptor = 
	"Lbh;")

	static final ApproximateRouteStrategy field783;
	@ObfuscatedName("vy")
	static int[] field784;
	@ObfuscatedName("vj")
	static int[] field785;
	@ObfuscatedName("sa")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("tu")
	static boolean field754;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(intValue = 
	1572034959)

	static int field561;
	@ObfuscatedName("uz")
	@ObfuscatedSignature(descriptor = 
	"Lkp;")

	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(intValue = 
	1679635193)

	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("qn")
	@ObfuscatedGetter(intValue = 
	-1673017289)

	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("sq")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("uj")
	@ObfuscatedGetter(intValue = 
	984000669)

	static int field775;
	@ObfuscatedName("qz")
	@ObfuscatedGetter(intValue = 
	1124774391)

	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("sc")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("sm")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sp")
	@ObfuscatedSignature(descriptor = 
	"[Lav;")

	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("sb")
	@ObfuscatedGetter(intValue = 
	-1290712593)

	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("sy")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("so")
	@ObfuscatedGetter(intValue = 
	362704857)

	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("rt")
	@ObfuscatedGetter(intValue = 
	223521103)

	static int field714;
	@ObfuscatedName("rj")
	@ObfuscatedGetter(longValue = 
	-2347175531478296847L)

	static long field585;
	@ObfuscatedName("uf")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("tx")
	static boolean[] field546;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(intValue = 
	810173849)

	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("rx")
	@ObfuscatedGetter(intValue = 
	-2104517495)

	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("tk")
	static short field760;
	@ObfuscatedName("te")
	static short field761;
	@ObfuscatedName("tt")
	static short field766;
	@ObfuscatedName("rd")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("tq")
	static short field666;
	@ObfuscatedName("tg")
	static short field765;
	@ObfuscatedName("um")
	@ObfuscatedSignature(descriptor = 
	"Lor;")

	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("tc")
	@ObfuscatedGetter(intValue = 
	-985861069)

	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tw")
	static short field764;
	@ObfuscatedName("td")
	@ObfuscatedGetter(intValue = 
	115517713)

	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("ri")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("th")
	static int[] field756;
	@ObfuscatedName("rc")
	@ObfuscatedSignature(descriptor = 
	"[Lqi;")

	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("tl")
	static int[] field636;
	@ObfuscatedName("tb")
	static int[] field674;
	@ObfuscatedName("ru")
	@ObfuscatedSignature(descriptor = 
	"[Lea;")

	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tm")
	static int[] field600;
	@ObfuscatedName("ty")
	@ObfuscatedGetter(intValue = 
	-2113477791)

	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("ra")
	@ObfuscatedGetter(intValue = 
	-319356623)

	static int field731;
	@ObfuscatedName("qt")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("ts")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("tr")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(intValue = 
	959543265)

	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("rn")
	static int[] field733;
	@ObfuscatedName("re")
	static int[] field732;
	@ObfuscatedName("ul")
	@ObfuscatedGetter(intValue = 
	75180695)

	static int field782;
	@ObfuscatedName("ug")
	@ObfuscatedSignature(descriptor = 
	"[Llh;")

	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("qs")
	static String field728;
	@ObfuscatedName("uw")
	@ObfuscatedSignature(descriptor = 
	"Lbf;")

	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"[Lgv;")

	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("aa")
	static boolean field490;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(intValue = 
	125631107)

	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(intValue = 
	1205446505)

	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(intValue = 
	648294645)

	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bh")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bf")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(intValue = 
	302223075)

	static int field617;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(intValue = 
	-1896865619)

	@Export("clientType")
	static int clientType;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(intValue = 
	2077868883)

	static int field498;
	@ObfuscatedName("bk")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(intValue = 
	1430199997)

	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cd")
	static boolean field504;
	@ObfuscatedName("cw")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(intValue = 
	395789251)

	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(longValue = 
	4039727128502314979L)

	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(intValue = 
	-1271698921)

	static int field508;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(intValue = 
	-636439299)

	static int field509;
	@ObfuscatedName("de")
	@ObfuscatedGetter(longValue = 
	-3400389721311801431L)

	static long field510;
	@ObfuscatedName("dp")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(intValue = 
	-1948172533)

	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(intValue = 
	-1059936819)

	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(intValue = 
	-1326790571)

	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(intValue = 
	1613753799)

	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(intValue = 
	678748679)

	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("da")
	@ObfuscatedGetter(intValue = 
	-484656195)

	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("di")
	@ObfuscatedGetter(intValue = 
	-2063879327)

	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(intValue = 
	800403081)

	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("df")
	@ObfuscatedGetter(intValue = 
	576607501)

	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("du")
	@ObfuscatedSignature(descriptor = 
	"Lcn;")

	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dz")
	@ObfuscatedSignature(descriptor = 
	"Lcn;")

	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("db")
	@ObfuscatedGetter(intValue = 
	1784085227)

	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(intValue = 
	-20961693)

	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(intValue = 
	1976785561)

	static int field525;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(intValue = 
	962124251)

	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(intValue = 
	1954076743)

	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(intValue = 
	-1036916585)

	static int field528;
	@ObfuscatedName("ff")
	@ObfuscatedGetter(intValue = 
	-1101689681)

	static int field661;
	@ObfuscatedName("fp")
	@ObfuscatedGetter(intValue = 
	1469005087)

	static int field530;
	@ObfuscatedName("fo")
	@ObfuscatedSignature(descriptor = 
	"Ldl;")

	static class124 field531;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(descriptor = 
	"Lpq;")

	static class441 field532;
	@ObfuscatedName("ft")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(descriptor = 
	"Lbt;")

	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gs")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gw")
	@ObfuscatedSignature(descriptor = 
	"[Lcy;")

	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(intValue = 
	1354722257)

	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("gt")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gm")
	@ObfuscatedGetter(intValue = 
	349713523)

	static int field547;
	@ObfuscatedName("go")
	static int[] field548;
	@ObfuscatedName("gp")
	@ObfuscatedSignature(descriptor = 
	"Lcl;")

	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(intValue = 
	-429421433)

	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("gu")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("gd")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("gq")
	static boolean field553;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(descriptor = 
	"Lmu;")

	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hz")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(intValue = 
	-2040429487)

	static int field747;
	@ObfuscatedName("hd")
	@ObfuscatedGetter(intValue = 
	1657321755)

	static int field608;
	@ObfuscatedName("hq")
	@ObfuscatedGetter(intValue = 
	800034625)

	static int field558;
	@ObfuscatedName("hw")
	@ObfuscatedGetter(intValue = 
	-1284292665)

	static int field758;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(intValue = 
	-1957551061)

	static int field560;
	@ObfuscatedName("hf")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("hu")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("hb")
	static final int[] field748;
	@ObfuscatedName("hv")
	@ObfuscatedGetter(intValue = 
	-1481528837)

	static int field556;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("io")
	@ObfuscatedGetter(intValue = 
	90219493)

	static int field566;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(intValue = 
	2041898935)

	static int field670;
	@ObfuscatedName("ib")
	@ObfuscatedGetter(intValue = 
	2062325883)

	static int field694;
	@ObfuscatedName("ir")
	@ObfuscatedGetter(intValue = 
	-541139307)

	static int field740;
	@ObfuscatedName("iu")
	static boolean field570;
	@ObfuscatedName("is")
	@ObfuscatedGetter(intValue = 
	-5461521)

	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("jm")
	@ObfuscatedGetter(intValue = 
	1628522517)

	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jl")
	@ObfuscatedGetter(intValue = 
	275555387)

	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(intValue = 
	170715045)

	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(intValue = 
	-1211766585)

	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(intValue = 
	2051456837)

	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(intValue = 
	-1066673885)

	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(intValue = 
	-1265757545)

	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(intValue = 
	924147421)

	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(intValue = 
	-733089741)

	static int field581;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(intValue = 
	-145236613)

	static int field590;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(intValue = 
	-665527289)

	static int field489;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(intValue = 
	-210849807)

	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(intValue = 
	868767683)

	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("ju")
	@ObfuscatedGetter(intValue = 
	-416666023)

	static int field586;
	@ObfuscatedName("jn")
	static boolean field759;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(intValue = 
	865687077)

	static int field588;
	@ObfuscatedName("jx")
	static boolean field589;
	@ObfuscatedName("jg")
	@ObfuscatedGetter(intValue = 
	158316317)

	static int field718;
	@ObfuscatedName("je")
	@ObfuscatedGetter(intValue = 
	-170106615)

	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("ja")
	@ObfuscatedGetter(intValue = 
	-1300592885)

	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("js")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("kn")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("ki")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kg")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ks")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kj")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kf")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("kp")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kk")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(intValue = 
	1107217747)

	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(intValue = 
	-1551118407)

	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(intValue = 
	1986228753)

	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(intValue = 
	741952061)

	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("kq")
	@ObfuscatedGetter(intValue = 
	1652587127)

	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(intValue = 
	734553977)

	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("ku")
	@ObfuscatedGetter(intValue = 
	-1471175899)

	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("kx")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(intValue = 
	151117229)

	static int field610;
	@ObfuscatedName("kt")
	@ObfuscatedGetter(intValue = 
	1905969143)

	static int field611;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(intValue = 
	771238189)

	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("kv")
	@ObfuscatedGetter(intValue = 
	-1731633013)

	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(intValue = 
	591102181)

	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(intValue = 
	1965014457)

	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("kz")
	static boolean field767;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(intValue = 
	1504694891)

	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lx")
	@ObfuscatedGetter(intValue = 
	-961793091)

	static int field618;
	@ObfuscatedName("ln")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("lu")
	@ObfuscatedSignature(descriptor = 
	"[Lcz;")

	@Export("players")
	static Player[] players;
	@ObfuscatedName("li")
	@ObfuscatedGetter(intValue = 
	911475385)

	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lq")
	@ObfuscatedGetter(intValue = 
	-525615991)

	static int field544;
	@ObfuscatedName("ll")
	@ObfuscatedGetter(longValue = 
	4157369345681014175L)

	static long field623;
	@ObfuscatedName("lc")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(intValue = 
	-871115459)

	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lm")
	@ObfuscatedGetter(intValue = 
	1054913333)

	static int field626;
	@ObfuscatedName("lo")
	static int[] field627;
	@ObfuscatedName("lj")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("la")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("ld")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("lt")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(intValue = 
	1885958183)

	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("lr")
	@ObfuscatedSignature(descriptor = 
	"[[[Lld;")

	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("ms")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("mr")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("mk")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("mq")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mn")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("md")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("me")
	@ObfuscatedGetter(intValue = 
	-410278811)

	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("ma")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("mp")
	@ObfuscatedGetter(intValue = 
	121755793)

	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("my")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mj")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mu")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mf")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("mi")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("mm")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("mc")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("mx")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("mg")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("mv")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("mw")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("np")
	@ObfuscatedGetter(intValue = 
	-1210803439)

	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(intValue = 
	119579989)

	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("ne")
	@ObfuscatedGetter(intValue = 
	-1368411589)

	static int field656;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(intValue = 
	-2015724673)

	static int field657;
	@ObfuscatedName("nz")
	@ObfuscatedGetter(intValue = 
	1419000661)

	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ng")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(intValue = 
	-1858579497)

	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(intValue = 
	-151006751)

	@Export("selectedSpellItemId")
	static int selectedSpellItemId;
	@ObfuscatedName("nx")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("nd")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nw")
	@ObfuscatedGetter(intValue = 
	1632536739)

	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nu")
	@ObfuscatedSignature(descriptor = 
	"Lpo;")

	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(intValue = 
	-90975371)

	static int field668;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(intValue = 
	-1017961137)

	static int field628;
	@ObfuscatedName("nb")
	@ObfuscatedGetter(intValue = 
	-1279214155)

	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(intValue = 
	1543781551)

	static int field524;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(descriptor = 
	"Lky;")

	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("oa")
	@ObfuscatedGetter(intValue = 
	-1063216989)

	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("om")
	@ObfuscatedGetter(intValue = 
	-749223927)

	@Export("weight")
	static int weight;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(intValue = 
	-1274512229)

	@Export("staffModLevel")
	static int staffModLevel;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(intValue = 
	-1488347039)

	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("oe")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("oi")
	@ObfuscatedSignature(descriptor = 
	"Lky;")

	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("oy")
	@ObfuscatedSignature(descriptor = 
	"Lky;")

	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ok")
	@ObfuscatedSignature(descriptor = 
	"Lky;")

	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("op")
	@ObfuscatedGetter(intValue = 
	-1977634921)

	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("on")
	@ObfuscatedGetter(intValue = 
	933052317)

	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(descriptor = 
	"Lky;")

	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ot")
	static boolean field696;
	@ObfuscatedName("oz")
	@ObfuscatedGetter(intValue = 
	-1107790009)

	static int field773;
	@ObfuscatedName("ou")
	@ObfuscatedGetter(intValue = 
	-754925295)

	static int field686;
	@ObfuscatedName("ol")
	static boolean field687;
	@ObfuscatedName("os")
	@ObfuscatedGetter(intValue = 
	-1838827617)

	static int field688;
	@ObfuscatedName("og")
	@ObfuscatedGetter(intValue = 
	1850811259)

	static int field757;
	@ObfuscatedName("oq")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("ov")
	@ObfuscatedGetter(intValue = 
	1092217725)

	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pu")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(intValue = 
	-334272855)

	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("po")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(intValue = 
	-478615495)

	static int field695;
	@ObfuscatedName("pp")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("pe")
	@ObfuscatedGetter(intValue = 
	2097836455)

	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pg")
	static int[] field698;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(intValue = 
	1885131439)

	static int field699;
	@ObfuscatedName("pb")
	@ObfuscatedGetter(intValue = 
	-1111710623)

	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("pn")
	@ObfuscatedGetter(intValue = 
	1773222505)

	static int field701;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(intValue = 
	-1118711907)

	static int field702;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(intValue = 
	614772325)

	static int field703;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(intValue = 
	-1232589287)

	static int field755;
	@ObfuscatedName("py")
	@ObfuscatedGetter(intValue = 
	-646988223)

	static int field705;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(intValue = 
	776062487)

	static int field706;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(intValue = 
	-409433949)

	static int field707;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(intValue = 
	96279785)

	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("pr")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("pm")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	static NodeDeque field710;
	@ObfuscatedName("pv")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	static NodeDeque field711;
	@ObfuscatedName("pq")
	@ObfuscatedSignature(descriptor = 
	"Lpo;")

	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qr")
	@ObfuscatedGetter(intValue = 
	-988949017)

	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(intValue = 
	-398701791)

	static int field540;
	@ObfuscatedName("qd")
	static boolean[] field715;
	@ObfuscatedName("ql")
	static boolean[] field716;
	@ObfuscatedName("qu")
	static boolean[] field717;
	@ObfuscatedName("qe")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qq")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("qi")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qy")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("qx")
	@ObfuscatedGetter(intValue = 
	1720526633)

	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qv")
	@ObfuscatedGetter(longValue = 
	669441914719297349L)

	static long field601;
	@ObfuscatedName("qa")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("qo")
	static int[] field725;
	@ObfuscatedName("fl")
	String field564;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(descriptor = 
	"Ld;")

	class14 field622;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(descriptor = 
	"Lx;")

	class19 field690;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(descriptor = 
	"Lcom/jagex/oldscape/pub/OtlTokenRequester;")

	OtlTokenRequester field536;
	@ObfuscatedName("fq")
	Future field599;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(descriptor = 
	"Lpi;")

	Buffer field496;
	@ObfuscatedName("gi")
	@ObfuscatedSignature(descriptor = 
	"Ll;")

	class7 field541;
	@ObfuscatedName("gn")
	@ObfuscatedGetter(longValue = 
	1413967701067592279L)

	long field542;
	static 
	{
		field490 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field617 = -1;
		clientType = -1;
		field498 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field508 = -1;
		field509 = -1;
		field510 = -1L;
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
		titleLoadingStage = 0;
		js5ConnectState = 0;
		field525 = 0;
		js5Errors = 0;
		loginState = 0;
		field528 = 0;
		field661 = 0;
		field530 = 0;
		field531 = class124.field1495;
		field532 = class441.field4678;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field547 = 0;
		field548 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		useBufferedSocket = true;
		field553 = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field747 = 0;
		field608 = 1;
		field558 = 0;
		field758 = 1;
		field560 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field748 = new int[]{ 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		field556 = 0;
		field566 = 2301979;
		field670 = 5063219;
		field694 = 3353893;
		field740 = 7759444;
		field570 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field581 = 0;
		field590 = 0;
		field489 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field586 = 0;
		field759 = false;
		field588 = 0;
		field589 = false;
		field718 = 0;
		overheadTextCount = 0;
		overheadTextLimit = 50;
		overheadTextXs = new int[overheadTextLimit];
		overheadTextYs = new int[overheadTextLimit];
		overheadTextAscents = new int[overheadTextLimit];
		overheadTextXOffsets = new int[overheadTextLimit];
		overheadTextColors = new int[overheadTextLimit];
		overheadTextEffects = new int[overheadTextLimit];
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
		field610 = 0;
		field611 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field767 = false;
		itemDragDuration = 0;
		field618 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field544 = 0;
		field623 = -1L;
		renderSelf = true;
		drawPlayerNames = 0;
		field626 = 0;
		field627 = new int[1000];
		playerMenuOpcodes = new int[]{ 44, 45, 46, 47, 48, 49, 50, 51 };
		playerMenuActions = new String[8];
		playerOptionsPriorities = new boolean[8];
		defaultRotations = new int[]{ 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
		combatTargetPlayerIndex = -1;
		groundItems = new NodeDeque[4][104][104];
		pendingSpawns = new NodeDeque();
		projectiles = new NodeDeque();
		graphicsObjects = new NodeDeque();
		currentLevels = new int[25];
		levels = new int[25];
		experience = new int[25];
		leftClickOpensMenu = 0;
		isMenuOpen = false;
		menuOptionsCount = 0;
		menuArguments1 = new int[500];
		menuArguments2 = new int[500];
		menuOpcodes = new int[500];
		menuIdentifiers = new int[500];
		menuActions = new String[500];
		menuTargets = new String[500];
		menuShiftClick = new boolean[500];
		followerOpsLowPriority = false;
		shiftClickDrop = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field656 = 0;
		field657 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field668 = 0;
		field628 = -1;
		chatEffects = 0;
		field524 = 0;
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
		field696 = false;
		field773 = -1;
		field686 = -1;
		field687 = false;
		field688 = -1;
		field757 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field695 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field698 = new int[32];
		field699 = 0;
		chatCycle = 0;
		field701 = 0;
		field702 = 0;
		field703 = 0;
		field755 = 0;
		field705 = 0;
		field706 = 0;
		field707 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field710 = new NodeDeque();
		field711 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field540 = -2;
		field715 = new boolean[100];
		field716 = new boolean[100];
		field717 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field601 = 0L;
		isResizable = true;
		field725 = new int[]{ 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		publicChatMode = 0;
		tradeChatMode = 0;
		field728 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field731 = 0;
		field732 = new int[128];
		field733 = new int[128];
		field585 = -1L;
		currentClanSettings = new ClanSettings[3];
		currentClanChannels = new ClanChannel[3];
		field714 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field746 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field754 = false;
		field546 = new boolean[5];
		field756 = new int[5];
		field636 = new int[5];
		field674 = new int[5];
		field600 = new int[5];
		field760 = 256;
		field761 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field764 = 1;
		field765 = 32767;
		field766 = 1;
		field666 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field561 = -1;
		field775 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field779 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field782 = 0;
		field783 = new ApproximateRouteStrategy();
		field784 = new int[50];
		field785 = new int[50];
	}

	public Client() {
		this.field542 = -1L;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1462606142")

	@Export("resizeGame")
	protected final void resizeGame() {
		field601 = class136.method2931() + 500L;
		this.resizeJS();
		if (rootInterface != (-1)) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1665364684")

	@Export("setUp")
	protected final void setUp() {
		ArchiveLoader.method2061(new int[]{ 20, 260, 10000 }, new int[]{ 1000, 100, 500 });
		SecureRandomFuture.worldPort = (gameBuild == 0) ? 43594 : worldId + 40000;
		UserComparator9.js5Port = (gameBuild == 0) ? 443 : worldId + 50000;
		class329.currentPort = SecureRandomFuture.worldPort;
		PlayerComposition.field3304 = class293.field3308;
		class144.field1629 = class293.field3309;
		WorldMapIcon_0.field2300 = class293.field3310;
		WorldMapRectangle.field2356 = class293.field3312;
		VerticalAlignment.urlRequester = new class101();
		this.setUpKeyboard();
		this.method428();
		MenuAction.mouseWheel = this.mouseWheel();
		class182.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		class131.clientPreferences = AbstractWorldMapData.method4344();
		this.setUpClipboard();
		ModelData0.method5093(this, class193.field2189);
		class131.setWindowedMode(class131.clientPreferences.method2251());
		Decimator.friendSystem = new FriendSystem(class122.loginType);
		this.field622 = new class14("tokenRequest", 1, 1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"612160698")

	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();

		while (true) {
			ArchiveDiskAction var1;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				var1 = ((ArchiveDiskAction) (ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast()));
			}

			if (var1 == null) {
				int var5;
				try {
					if (class273.musicPlayerStatus == 1) {
						var5 = class273.midiPcmStream.method5264();
						if ((var5 > 0) && class273.midiPcmStream.isReady()) {
							var5 -= class273.pcmSampleLength;
							if (var5 < 0) {
								var5 = 0;
							}

							class273.midiPcmStream.setPcmStreamVolume(var5);
						} else {
							class273.midiPcmStream.clear();
							class273.midiPcmStream.removeAll();
							if (class273.musicTrackArchive != null) {
								class273.musicPlayerStatus = 2;
							} else {
								class273.musicPlayerStatus = 0;
							}

							ArchiveDiskActionHandler.musicTrack = null;
							class152.soundCache = null;
						}
					}
				} catch (Exception var9) {
					var9.printStackTrace();
					class273.midiPcmStream.clear();
					class273.musicPlayerStatus = 0;
					ArchiveDiskActionHandler.musicTrack = null;
					class152.soundCache = null;
					class273.musicTrackArchive = null;
				}

				class116.playPcmPlayers();
				synchronized(KeyHandler.KeyHandler_instance) {
					++KeyHandler.KeyHandler_idleCycles;
					KeyHandler.field141 = KeyHandler.field138;
					KeyHandler.field118 = 0;
					KeyHandler.field132 = 0;
					Arrays.fill(KeyHandler.field140, false);
					Arrays.fill(KeyHandler.field131, false);
					if (KeyHandler.field128 < 0) {
						Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
						KeyHandler.field128 = KeyHandler.field133;
					} else {
						while (KeyHandler.field128 != KeyHandler.field133) {
							int var6 = KeyHandler.field145[KeyHandler.field133];
							KeyHandler.field133 = (KeyHandler.field133 + 1) & 127;
							if (var6 < 0) {
								var6 = ~var6;
								if (KeyHandler.KeyHandler_pressedKeys[var6]) {
									KeyHandler.KeyHandler_pressedKeys[var6] = false;
									KeyHandler.field131[var6] = true;
									KeyHandler.field139[KeyHandler.field132] = var6;
									++KeyHandler.field132;
								}
							} else {
								if ((!KeyHandler.KeyHandler_pressedKeys[var6]) && (KeyHandler.field118 < (KeyHandler.field143.length - 1))) {
									KeyHandler.field140[var6] = true;
									KeyHandler.field143[(++KeyHandler.field118) - 1] = var6;
								}

								KeyHandler.KeyHandler_pressedKeys[var6] = true;
							}
						} 
					}

					if (KeyHandler.field118 > 0) {
						KeyHandler.KeyHandler_idleCycles = 0;
					}

					KeyHandler.field138 = KeyHandler.field142;
				}

				HealthBarDefinition.method3473();
				if (MenuAction.mouseWheel != null) {
					var5 = MenuAction.mouseWheel.useRotation();
					mouseWheelRotation = var5;
				}

				if (gameState == 0) {
					Archive.load();
					UserComparator9.method2619();
				} else if (gameState == 5) {
					class360.method6592(this, class13.fontPlain12);
					Archive.load();
					UserComparator9.method2619();
				} else if ((gameState != 10) && (gameState != 11)) {
					if (gameState == 20) {
						class360.method6592(this, class13.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 50) {
						class360.method6592(this, class13.fontPlain12);
						this.doCycleLoggedOut();
					} else if (gameState == 25) {
						FriendSystem.method1715();
					}
				} else {
					class360.method6592(this, class13.fontPlain12);
				}

				if (gameState == 30) {
					this.doCycleLoggedIn();
				} else if ((gameState == 40) || (gameState == 45)) {
					this.doCycleLoggedOut();
				}

				return;
			}

			var1.archive.load(var1.archiveDisk, ((int) (var1.key)), var1.data, false);
		} 
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(ZS)V", garbageValue = 
	"-8708")

	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label175 : {
			try {
				if (class273.musicPlayerStatus == 2) {
					if (ArchiveDiskActionHandler.musicTrack == null) {
						ArchiveDiskActionHandler.musicTrack = MusicTrack.readTrack(class273.musicTrackArchive, AccessFile.musicTrackGroupId, class273.musicTrackFileId);
						if (ArchiveDiskActionHandler.musicTrack == null) {
							var2 = false;
							break label175;
						}
					}

					if (class152.soundCache == null) {
						class152.soundCache = new SoundCache(class273.soundEffectsArchive, class273.musicSamplesArchive);
					}

					if (class273.midiPcmStream.loadMusicTrack(ArchiveDiskActionHandler.musicTrack, class273.musicPatchesArchive, class152.soundCache, 22050)) {
						class273.midiPcmStream.clearAll();
						class273.midiPcmStream.setPcmStreamVolume(class273.musicTrackVolume);
						class273.midiPcmStream.setMusicTrack(ArchiveDiskActionHandler.musicTrack, class17.musicTrackBoolean);
						class273.musicPlayerStatus = 0;
						ArchiveDiskActionHandler.musicTrack = null;
						class152.soundCache = null;
						class273.musicTrackArchive = null;
						var2 = true;
						break label175;
					}
				}
			} catch (Exception var6) {
				var6.printStackTrace();
				class273.midiPcmStream.clear();
				class273.musicPlayerStatus = 0;
				ArchiveDiskActionHandler.musicTrack = null;
				class152.soundCache = null;
				class273.musicTrackArchive = null;
			}

			var2 = false;
		}

		if ((var2 && field746) && (KeyHandler.pcmPlayer0 != null)) {
			KeyHandler.pcmPlayer0.tryDiscard();
		}

		if (((((gameState == 10) || (gameState == 20)) || (gameState == 30)) && (field601 != 0L)) && (class136.method2931() > field601)) {
			class131.setWindowedMode(getWindowedMode());
		}

		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field715[var4] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			class128.drawTitle(RouteStrategy.fontBold12, class113.fontPlain11, class13.fontPlain12);
		} else if ((gameState != 10) && (gameState != 11)) {
			if (gameState == 20) {
				class128.drawTitle(RouteStrategy.fontBold12, class113.fontPlain11, class13.fontPlain12);
			} else if (gameState == 50) {
				class128.drawTitle(RouteStrategy.fontBold12, class113.fontPlain11, class13.fontPlain12);
			} else if (gameState == 25) {
				if (field560 == 1) {
					if (field747 > field608) {
						field608 = field747;
					}

					var4 = ((field608 * 50) - (field747 * 50)) / field608;
					MusicPatch.drawLoadingMessage(((("Loading - please wait." + ("<br>" + " (")) + var4) + "%") + ")", false);
				} else if (field560 == 2) {
					if (field558 > field758) {
						field758 = field558;
					}

					var4 = (((field758 * 50) - (field558 * 50)) / field758) + 50;
					MusicPatch.drawLoadingMessage(((("Loading - please wait." + ("<br>" + " (")) + var4) + "%") + ")", false);
				} else {
					MusicPatch.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				MusicPatch.drawLoadingMessage("Connection lost" + ("<br>" + "Please wait - attempting to reestablish"), false);
			} else if (gameState == 45) {
				MusicPatch.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class128.drawTitle(RouteStrategy.fontBold12, class113.fontPlain11, class13.fontPlain12);
		}

		if ((((gameState == 30) && (gameDrawingMode == 0)) && (!var1)) && (!isResizable)) {
			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				if (field716[var4]) {
					FontName.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
					field716[var4] = false;
				}
			}
		} else if (gameState > 0) {
			FontName.rasterProvider.drawFull(0, 0);

			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				field716[var4] = false;
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1364313232")

	@Export("kill0")
	protected final void kill0() {
		if (class160.varcs.hasUnwrittenChanges()) {
			class160.varcs.write();
		}

		if (class120.mouseRecorder != null) {
			class120.mouseRecorder.isRunning = false;
		}

		class120.mouseRecorder = null;
		packetWriter.close();
		class205.method4256();
		class116.method2705();
		MenuAction.mouseWheel = null;
		if (KeyHandler.pcmPlayer0 != null) {
			KeyHandler.pcmPlayer0.shutdown();
		}

		if (ViewportMouse.pcmPlayer1 != null) {
			ViewportMouse.pcmPlayer1.shutdown();
		}

		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3945 != 0) {
				ArchiveDiskActionHandler.field3945 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var4) {
				}
			}
		}

		if (VerticalAlignment.urlRequester != null) {
			VerticalAlignment.urlRequester.close();
			VerticalAlignment.urlRequester = null;
		}

		FriendLoginUpdate.method6685();
		this.field622.method167();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"111435525")

	protected final void vmethod1140() {
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"104545398")

	boolean method1532() {
		return (class360.field4209 != null) && (!class360.field4209.trim().isEmpty());
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"42")

	boolean method1476() {
		return this.field536 != null;
	}

	@ObfuscatedName("ev")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)V", garbageValue = 
	"20")

	void method1366(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(class113.field1372 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		OtlTokenRequester var3 = this.field536;
		if (var3 != null) {
			this.field599 = var3.request(var2);
		} else {
			class10 var4 = new class10(var2, class9.field37);
			var4.method77("Authorization", "Bearer " + var1);
			this.field690 = this.field622.method166(var4);
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-2117459446")

	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = class136.method2931();
			int var4 = ((int) (var2 - NetCache.field3982));
			NetCache.field3982 = var2;
			if (var4 > 200) {
				var4 = 200;
			}

			NetCache.NetCache_loadTime += var4;
			boolean var1;
			if ((((NetCache.NetCache_pendingResponsesCount == 0) && (NetCache.NetCache_pendingPriorityResponsesCount == 0)) && (NetCache.NetCache_pendingWritesCount == 0)) && (NetCache.NetCache_pendingPriorityWritesCount == 0)) {
				var1 = true;
			} else if (NetCache.NetCache_socket == null) {
				var1 = false;
			} else {
				try {
					label243 : {
						if (NetCache.NetCache_loadTime > 30000) {
							throw new IOException();
						}

						NetFileRequest var5;
						Buffer var6;
						while ((NetCache.NetCache_pendingPriorityResponsesCount < 200) && (NetCache.NetCache_pendingPriorityWritesCount > 0)) {
							var5 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityWrites.first()));
							var6 = new Buffer(4);
							var6.writeByte(1);
							var6.writeMedium(((int) (var5.key)));
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingPriorityWritesCount;
							++NetCache.NetCache_pendingPriorityResponsesCount;
						} 

						while ((NetCache.NetCache_pendingResponsesCount < 200) && (NetCache.NetCache_pendingWritesCount > 0)) {
							var5 = ((NetFileRequest) (NetCache.NetCache_pendingWritesQueue.removeLast()));
							var6 = new Buffer(4);
							var6.writeByte(0);
							var6.writeMedium(((int) (var5.key)));
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							var5.removeDual();
							NetCache.NetCache_pendingResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingWritesCount;
							++NetCache.NetCache_pendingResponsesCount;
						} 

						for (int var17 = 0; var17 < 100; ++var17) {
							int var18 = NetCache.NetCache_socket.available();
							if (var18 < 0) {
								throw new IOException();
							}

							if (var18 == 0) {
								break;
							}

							NetCache.NetCache_loadTime = 0;
							byte var7 = 0;
							if (class271.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field3995 == 0) {
								var7 = 1;
							}

							int var8;
							int var9;
							int var10;
							int var12;
							byte[] var10000;
							int var10001;
							Buffer var25;
							if (var7 > 0) {
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset;
								if (var8 > var18) {
									var8 = var18;
								}

								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8);
								if (NetCache.field3998 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var9;
										var10000[var10001] ^= NetCache.field3998;
									}
								}

								var25 = NetCache.NetCache_responseHeaderBuffer;
								var25.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}

								if (class271.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = ((long) (var10 + (var9 << 16)));
									NetFileRequest var15 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.get(var13)));
									Coord.field3289 = true;
									if (var15 == null) {
										var15 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.get(var13)));
										Coord.field3289 = false;
									}

									if (var15 == null) {
										throw new IOException();
									}

									int var16 = (var11 == 0) ? 5 : 9;
									class271.NetCache_currentResponse = var15;
									class194.NetCache_responseArchiveBuffer = new Buffer((var16 + var12) + class271.NetCache_currentResponse.padding);
									class194.NetCache_responseArchiveBuffer.writeByte(var11);
									class194.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field3995 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field3995 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == (-1)) {
										NetCache.field3995 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										class271.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = class194.NetCache_responseArchiveBuffer.array.length - class271.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field3995;
								if (var9 > (var8 - class194.NetCache_responseArchiveBuffer.offset)) {
									var9 = var8 - class194.NetCache_responseArchiveBuffer.offset;
								}

								if (var9 > var18) {
									var9 = var18;
								}

								NetCache.NetCache_socket.read(class194.NetCache_responseArchiveBuffer.array, class194.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field3998 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = class194.NetCache_responseArchiveBuffer.array;
										var10001 = class194.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field3998;
									}
								}

								var25 = class194.NetCache_responseArchiveBuffer;
								var25.offset += var9;
								NetCache.field3995 += var9;
								if (var8 == class194.NetCache_responseArchiveBuffer.offset) {
									if (16711935L == class271.NetCache_currentResponse.key) {
										Huffman.NetCache_reference = class194.NetCache_responseArchiveBuffer;

										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												Huffman.NetCache_reference.offset = (var10 * 8) + 5;
												var12 = Huffman.NetCache_reference.readInt();
												int var20 = Huffman.NetCache_reference.readInt();
												var19.loadIndex(var12, var20);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(class194.NetCache_responseArchiveBuffer.array, 0, var8);
										var10 = ((int) (NetCache.NetCache_crc.getValue()));
										if (var10 != class271.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var23) {
											}

											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field3998 = ((byte) ((int) ((Math.random() * 255.0) + 1.0)));
											var1 = false;
											break label243;
										}

										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										class271.NetCache_currentResponse.archive.write(((int) (class271.NetCache_currentResponse.key & 65535L)), class194.NetCache_responseArchiveBuffer.array, (class271.NetCache_currentResponse.key & 16711680L) == 16711680L, Coord.field3289);
									}

									class271.NetCache_currentResponse.remove();
									if (Coord.field3289) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}

									NetCache.field3995 = 0;
									class271.NetCache_currentResponse = null;
									class194.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field3995 != 512) {
										break;
									}

									NetCache.field3995 = 0;
								}
							}
						}

						var1 = true;
					}
				} catch (IOException var24) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var22) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
					var1 = false;
				}
			}

			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-49490538")

	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			Decimator.updateGameState(1000);
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					Decimator.updateGameState(1000);
					return;
				}

				field525 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (((--field525) + 1) <= 0) {
				try {
					if (js5ConnectState == 0) {
						VerticalAlignment.js5SocketTask = GameEngine.taskHandler.newSocketTask(class17.worldHost, class329.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (VerticalAlignment.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (VerticalAlignment.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							Socket var2 = ((Socket) (VerticalAlignment.js5SocketTask.result));
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
							Decimator.js5Socket = var1;
						} else {
							Decimator.js5Socket = new NetSocket(((Socket) (VerticalAlignment.js5SocketTask.result)), GameEngine.taskHandler, 5000);
						}

						Buffer var13 = new Buffer(5);
						var13.writeByte(15);
						var13.writeInt(204);
						Decimator.js5Socket.write(var13.array, 0, 5);
						++js5ConnectState;
						KeyHandler.field149 = class136.method2931();
					}

					if (js5ConnectState == 3) {
						if ((Decimator.js5Socket.available() > 0) || ((!useBufferedSocket) && (gameState <= 5))) {
							int var5 = Decimator.js5Socket.readUnsignedByte();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}

							++js5ConnectState;
						} else if ((class136.method2931() - KeyHandler.field149) > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AbstractSocket var14 = Decimator.js5Socket;
						boolean var6 = gameState > 20;
						if (NetCache.NetCache_socket != null) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var11) {
							}

							NetCache.NetCache_socket = null;
						}

						NetCache.NetCache_socket = var14;
						Buffer var3;
						if (NetCache.NetCache_socket != null) {
							try {
								var3 = new Buffer(4);
								var3.writeByte(var6 ? 2 : 3);
								var3.writeMedium(0);
								NetCache.NetCache_socket.write(var3.array, 0, 4);
							} catch (IOException var10) {
								try {
									NetCache.NetCache_socket.close();
								} catch (Exception var9) {
								}

								++NetCache.NetCache_ioExceptions;
								NetCache.NetCache_socket = null;
							}
						}

						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						class271.NetCache_currentResponse = null;
						class194.NetCache_responseArchiveBuffer = null;
						NetCache.field3995 = 0;

						while (true) {
							NetFileRequest var15 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.first()));
							if (var15 == null) {
								while (true) {
									var15 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.first()));
									if (var15 == null) {
										if (NetCache.field3998 != 0) {
											try {
												var3 = new Buffer(4);
												var3.writeByte(4);
												var3.writeByte(NetCache.field3998);
												var3.writeShort(0);
												NetCache.NetCache_socket.write(var3.array, 0, 4);
											} catch (IOException var8) {
												try {
													NetCache.NetCache_socket.close();
												} catch (Exception var7) {
												}

												++NetCache.NetCache_ioExceptions;
												NetCache.NetCache_socket = null;
											}
										}

										NetCache.NetCache_loadTime = 0;
										NetCache.field3982 = class136.method2931();
										VerticalAlignment.js5SocketTask = null;
										Decimator.js5Socket = null;
										js5ConnectState = 0;
										js5Errors = 0;
										return;
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var15);
									NetCache.NetCache_pendingWrites.put(var15, var15.key);
									++NetCache.NetCache_pendingWritesCount;
									--NetCache.NetCache_pendingResponsesCount;
								} 
							}

							NetCache.NetCache_pendingPriorityWrites.put(var15, var15.key);
							++NetCache.NetCache_pendingPriorityWritesCount;
							--NetCache.NetCache_pendingPriorityResponsesCount;
						} 
					}
				} catch (IOException var12) {
					this.js5Error(-3);
				}

			}
		}
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"66")

	@Export("js5Error")
	void js5Error(int var1) {
		VerticalAlignment.js5SocketTask = null;
		Decimator.js5Socket = null;
		js5ConnectState = 0;
		if (SecureRandomFuture.worldPort == class329.currentPort) {
			class329.currentPort = UserComparator9.js5Port;
		} else {
			class329.currentPort = SecureRandomFuture.worldPort;
		}

		++js5Errors;
		if ((js5Errors < 2) || ((var1 != 7) && (var1 != 9))) {
			if ((js5Errors >= 2) && (var1 == 6)) {
				this.error("js5connect_outofdate");
				Decimator.updateGameState(1000);
			} else if (js5Errors >= 4) {
				if (gameState <= 5) {
					this.error("js5connect");
					Decimator.updateGameState(1000);
				} else {
					field525 = 3000;
				}
			}
		} else if (gameState <= 5) {
			this.error("js5connect_full");
			Decimator.updateGameState(1000);
		} else {
			field525 = 3000;
		}

	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1166216650")

	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = Client.packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if ((class347.secureRandom == null) && (secureRandomFuture.isDone() || (field528 > 250))) {
					class347.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class347.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket) (var1)).close();
						var1 = null;
					}

					DynamicObject.socketTask = null;
					hadNetworkError = false;
					field528 = 0;
					if (field532.method7928()) {
						try {
							this.method1366(class360.field4209);
							ModeWhere.method6099(20);
						} catch (Throwable var27) {
							Widget.RunException_sendStackTrace(((String) (null)), var27);
							ScriptFrame.getLoginError(65);
							return;
						}
					} else {
						ModeWhere.method6099(1);
					}
				}
			}

			if (loginState == 20) {
				if (this.field599 != null) {
					if (!this.field599.isDone()) {
						return;
					}

					if (this.field599.isCancelled()) {
						ScriptFrame.getLoginError(65);
						this.field599 = null;
						return;
					}

					try {
						OtlTokenResponse var3 = ((OtlTokenResponse) (this.field599.get()));
						if (!var3.isSuccess()) {
							ScriptFrame.getLoginError(65);
							this.field599 = null;
							return;
						}

						this.field564 = var3.getToken();
						this.field599 = null;
					} catch (Exception var26) {
						Widget.RunException_sendStackTrace(((String) (null)), var26);
						ScriptFrame.getLoginError(65);
						this.field599 = null;
						return;
					}
				} else {
					if (this.field690 == null) {
						ScriptFrame.getLoginError(65);
						return;
					}

					if (!this.field690.method268()) {
						return;
					}

					if (this.field690.method283()) {
						Widget.RunException_sendStackTrace(this.field690.method271(), ((Throwable) (null)));
						ScriptFrame.getLoginError(65);
						this.field690 = null;
						return;
					}

					class21 var30 = this.field690.method274();
					if (var30.method299() != 200) {
						Widget.RunException_sendStackTrace((("Response code: " + var30.method299()) + "Response body: ") + var30.method297(), ((Throwable) (null)));
						ScriptFrame.getLoginError(65);
						this.field690 = null;
						return;
					}

					this.field564 = var30.method297();
					this.field690 = null;
				}

				field528 = 0;
				ModeWhere.method6099(1);
			}

			if (loginState == 1) {
				if (DynamicObject.socketTask == null) {
					DynamicObject.socketTask = GameEngine.taskHandler.newSocketTask(class17.worldHost, class329.currentPort);
				}

				if (DynamicObject.socketTask.status == 2) {
					throw new IOException();
				}

				if (DynamicObject.socketTask.status == 1) {
					if (useBufferedSocket) {
						Socket var4 = ((Socket) (DynamicObject.socketTask.result));
						BufferedNetSocket var31 = new BufferedNetSocket(var4, 40000, 5000);
						var1 = var31;
					} else {
						var1 = new NetSocket(((Socket) (DynamicObject.socketTask.result)), GameEngine.taskHandler, 5000);
					}

					packetWriter.setSocket(((AbstractSocket) (var1)));
					DynamicObject.socketTask = null;
					ModeWhere.method6099(2);
				}
			}

			PacketBufferNode var33;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var33 = new PacketBufferNode();
				} else {
					var33 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var33.clientPacket = null;
				var33.clientPacketLength = 0;
				var33.packetBuffer = new PacketBuffer(5000);
				var33.packetBuffer.writeByte(LoginPacket.field3137.id);
				packetWriter.addNode(var33);
				packetWriter.flush();
				var2.offset = 0;
				ModeWhere.method6099(3);
			}

			boolean var14;
			int var15;
			if (loginState == 3) {
				if (KeyHandler.pcmPlayer0 != null) {
					KeyHandler.pcmPlayer0.method690();
				}

				if (ViewportMouse.pcmPlayer1 != null) {
					ViewportMouse.pcmPlayer1.method690();
				}

				var14 = true;
				if (useBufferedSocket && (!((AbstractSocket) (var1)).isAvailable(1))) {
					var14 = false;
				}

				if (var14) {
					var15 = ((AbstractSocket) (var1)).readUnsignedByte();
					if (KeyHandler.pcmPlayer0 != null) {
						KeyHandler.pcmPlayer0.method690();
					}

					if (ViewportMouse.pcmPlayer1 != null) {
						ViewportMouse.pcmPlayer1.method690();
					}

					if (var15 != 0) {
						ScriptFrame.getLoginError(var15);
						return;
					}

					var2.offset = 0;
					ModeWhere.method6099(4);
				}
			}

			int var44;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var44 = ((AbstractSocket) (var1)).available();
					if (var44 > (8 - var2.offset)) {
						var44 = 8 - var2.offset;
					}

					if (var44 > 0) {
						((AbstractSocket) (var1)).read(var2.array, var2.offset, var44);
						var2.offset += var44;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					ServerPacket.field3129 = var2.readLong();
					ModeWhere.method6099(5);
				}
			}

			int var7;
			int var9;
			int var17;
			if (loginState == 5) {
				Client.packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var32 = new PacketBuffer(500);
				int[] var36 = new int[]{ class347.secureRandom.nextInt(), class347.secureRandom.nextInt(), class347.secureRandom.nextInt(), class347.secureRandom.nextInt() };
				var32.offset = 0;
				var32.writeByte(1);
				var32.writeInt(var36[0]);
				var32.writeInt(var36[1]);
				var32.writeInt(var36[2]);
				var32.writeInt(var36[3]);
				var32.writeLong(ServerPacket.field3129);
				if (gameState == 40) {
					var32.writeInt(VertexNormal.field2817[0]);
					var32.writeInt(VertexNormal.field2817[1]);
					var32.writeInt(VertexNormal.field2817[2]);
					var32.writeInt(VertexNormal.field2817[3]);
				} else {
					if (gameState == 50) {
						var32.writeByte(class124.field1497.rsOrdinal());
						var32.writeInt(WorldMapSectionType.field2321);
					} else {
						var32.writeByte(field531.rsOrdinal());
						switch (Client.field531.field1493) {
							case 1 :
								var32.offset += 4;
								break;
							case 2 :
							case 3 :
								var32.writeMedium(WorldMapID.field2386);
								++var32.offset;
								break;
							case 4 :
								LinkedHashMap var6 = class131.clientPreferences.parameters;
								String var8 = Login.Login_username;
								var9 = var8.length();
								int var10 = 0;

								for (int var11 = 0; var11 < var9; ++var11) {
									var10 = ((var10 << 5) - var10) + var8.charAt(var11);
								}

								var32.writeInt(((Integer) (var6.get(var10))));}

					}

					if (field532.method7928()) {
						var32.writeByte(class441.field4671.rsOrdinal());
						var32.writeStringCp1252NullTerminated(this.field564);
					} else {
						var32.writeByte(class441.field4678.rsOrdinal());
						var32.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var32.encryptRsa(class67.field882, class67.field880);
				VertexNormal.field2817 = var36;
				PacketBufferNode var40;
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var40 = new PacketBufferNode();
				} else {
					var40 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var40.clientPacket = null;
				var40.clientPacketLength = 0;
				var40.packetBuffer = new PacketBuffer(5000);
				var40.packetBuffer.offset = 0;
				if (gameState == 40) {
					var40.packetBuffer.writeByte(LoginPacket.field3133.id);
				} else {
					var40.packetBuffer.writeByte(LoginPacket.field3132.id);
				}

				var40.packetBuffer.writeShort(0);
				var7 = var40.packetBuffer.offset;
				var40.packetBuffer.writeInt(204);
				var40.packetBuffer.writeInt(1);
				var40.packetBuffer.writeByte(clientType);
				var40.packetBuffer.writeByte(field498);
				var40.packetBuffer.writeBytes(var32.array, 0, var32.offset);
				var17 = var40.packetBuffer.offset;
				var40.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var40.packetBuffer.writeByte(((isResizable ? 1 : 0) << 1) | (isLowDetail ? 1 : 0));
				var40.packetBuffer.writeShort(InvDefinition.canvasWidth);
				var40.packetBuffer.writeShort(class321.canvasHeight);
				PacketBuffer var18 = var40.packetBuffer;
				int var12;
				if (randomDatData != null) {
					var18.writeBytes(randomDatData, 0, Client.randomDatData.length);
				} else {
					byte[] var19 = new byte[24];

					try {
						JagexCache.JagexCache_randomDat.seek(0L);
						JagexCache.JagexCache_randomDat.readFully(var19);

						for (var12 = 0; (var12 < 24) && (var19[var12] == 0); ++var12) {
						}

						if (var12 >= 24) {
							throw new IOException();
						}
					} catch (Exception var28) {
						for (int var13 = 0; var13 < 24; ++var13) {
							var19[var13] = -1;
						}
					}

					var18.writeBytes(var19, 0, var19.length);
				}

				if (!class65.field868.endsWith(";A")) {
					class65.field868 = class65.field868 + ";A";
				}

				var40.packetBuffer.writeStringCp1252NullTerminated(class65.field868);
				var40.packetBuffer.writeInt(GrandExchangeOfferOwnWorldComparator.field483);
				Buffer var21 = new Buffer(class263.platformInfo.size());
				class263.platformInfo.write(var21);
				var40.packetBuffer.writeBytes(var21.array, 0, var21.array.length);
				var40.packetBuffer.writeByte(clientType);
				var40.packetBuffer.writeInt(0);
				var40.packetBuffer.writeInt(Message.archive11.hash);
				var40.packetBuffer.writeIntLE(ApproximateRouteStrategy.archive20.hash);
				var40.packetBuffer.writeIntIME(class291.archive14.hash);
				var40.packetBuffer.writeInt(class145.archive8.hash);
				var40.packetBuffer.writeIntIME(class10.archive2.hash);
				var40.packetBuffer.writeIntIME(ObjectSound.archive19.hash);
				var40.packetBuffer.writeIntLE(0);
				var40.packetBuffer.writeIntME(class182.archive4.hash);
				var40.packetBuffer.writeInt(WorldMapDecorationType.archive9.hash);
				var40.packetBuffer.writeIntIME(JagexCache.archive10.hash);
				var40.packetBuffer.writeInt(class166.archive13.hash);
				var40.packetBuffer.writeIntLE(WorldMapRectangle.archive18.hash);
				var40.packetBuffer.writeIntLE(class28.archive15.hash);
				var40.packetBuffer.writeIntME(LoginScreenAnimation.archive7.hash);
				var40.packetBuffer.writeIntME(class16.archive6.hash);
				var40.packetBuffer.writeInt(Players.archive5.hash);
				var40.packetBuffer.writeIntLE(BufferedNetSocket.archive3.hash);
				var40.packetBuffer.writeIntME(UserComparator8.archive1.hash);
				var40.packetBuffer.writeIntLE(class54.archive17.hash);
				var40.packetBuffer.writeIntIME(KeyHandler.archive0.hash);
				var40.packetBuffer.writeInt(class152.archive12.hash);
				var40.packetBuffer.xteaEncrypt(var36, var17, var40.packetBuffer.offset);
				var40.packetBuffer.writeLengthShort(var40.packetBuffer.offset - var7);
				packetWriter.addNode(var40);
				packetWriter.flush();
				Client.packetWriter.isaacCipher = new IsaacCipher(var36);
				int[] var46 = new int[4];

				for (var12 = 0; var12 < 4; ++var12) {
					var46[var12] = var36[var12] + 50;
				}

				var2.newIsaacCipher(var46);
				ModeWhere.method6099(6);
			}

			if ((loginState == 6) && (((AbstractSocket) (var1)).available() > 0)) {
				var44 = ((AbstractSocket) (var1)).readUnsignedByte();
				if (var44 == 61) {
					var15 = ((AbstractSocket) (var1)).available();
					field504 = (var15 == 1) && (((AbstractSocket) (var1)).readUnsignedByte() == 1);
					ModeWhere.method6099(5);
				}

				if ((var44 == 21) && (gameState == 20)) {
					ModeWhere.method6099(12);
				} else if (var44 == 2) {
					ModeWhere.method6099(14);
				} else if ((var44 == 15) && (gameState == 40)) {
					Client.packetWriter.serverPacketLength = -1;
					ModeWhere.method6099(19);
				} else if (var44 == 64) {
					ModeWhere.method6099(10);
				} else if ((var44 == 23) && (field661 < 1)) {
					++field661;
					ModeWhere.method6099(0);
				} else if (var44 == 29) {
					ModeWhere.method6099(17);
				} else {
					if (var44 != 69) {
						ScriptFrame.getLoginError(var44);
						return;
					}

					ModeWhere.method6099(7);
				}
			}

			if ((loginState == 7) && (((AbstractSocket) (var1)).available() >= 2)) {
				((AbstractSocket) (var1)).read(var2.array, 0, 2);
				var2.offset = 0;
				VertexNormal.field2816 = var2.readUnsignedShort();
				ModeWhere.method6099(8);
			}

			if ((loginState == 8) && (((AbstractSocket) (var1)).available() >= VertexNormal.field2816)) {
				var2.offset = 0;
				((AbstractSocket) (var1)).read(var2.array, var2.offset, VertexNormal.field2816);
				class6[] var34 = new class6[]{ class6.field14 };
				class6 var38 = var34[var2.readUnsignedByte()];

				try {
					switch (var38.field12) {
						case 0 :
							class0 var5 = new class0();
							this.field541 = new class7(var2, var5);
							ModeWhere.method6099(9);
							break;
						default :
							throw new IllegalArgumentException();}

				} catch (Exception var25) {
					ScriptFrame.getLoginError(22);
					return;
				}
			}

			if ((loginState == 9) && this.field541.method43()) {
				this.field496 = this.field541.method45();
				this.field541.method47();
				this.field541 = null;
				if (this.field496 == null) {
					ScriptFrame.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
					var33 = new PacketBufferNode();
				} else {
					var33 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
				}

				var33.clientPacket = null;
				var33.clientPacketLength = 0;
				var33.packetBuffer = new PacketBuffer(5000);
				var33.packetBuffer.writeByte(LoginPacket.field3134.id);
				var33.packetBuffer.writeShort(this.field496.offset);
				var33.packetBuffer.writeBuffer(this.field496);
				packetWriter.addNode(var33);
				packetWriter.flush();
				this.field496 = null;
				ModeWhere.method6099(6);
			}

			if ((loginState == 10) && (((AbstractSocket) (var1)).available() > 0)) {
				class11.field54 = ((AbstractSocket) (var1)).readUnsignedByte();
				ModeWhere.method6099(11);
			}

			if ((loginState == 11) && (((AbstractSocket) (var1)).available() >= class11.field54)) {
				((AbstractSocket) (var1)).read(var2.array, 0, class11.field54);
				var2.offset = 0;
				ModeWhere.method6099(6);
			}

			if ((loginState == 12) && (((AbstractSocket) (var1)).available() > 0)) {
				field530 = (((AbstractSocket) (var1)).readUnsignedByte() + 3) * 60;
				ModeWhere.method6099(13);
			}

			if (loginState == 13) {
				field528 = 0;
				class4.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", (field530 / 60) + " seconds.");
				if ((--field530) <= 0) {
					ModeWhere.method6099(0);
				}

			} else {
				if ((loginState == 14) && (((AbstractSocket) (var1)).available() >= 1)) {
					class391.field4372 = ((AbstractSocket) (var1)).readUnsignedByte();
					ModeWhere.method6099(15);
				}

				if ((loginState == 15) && (((AbstractSocket) (var1)).available() >= class391.field4372)) {
					var14 = ((AbstractSocket) (var1)).readUnsignedByte() == 1;
					((AbstractSocket) (var1)).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var45 = false;
					if (var14) {
						var15 = var2.readByteIsaac() << 24;
						var15 |= var2.readByteIsaac() << 16;
						var15 |= var2.readByteIsaac() << 8;
						var15 |= var2.readByteIsaac();
						String var42 = Login.Login_username;
						var7 = var42.length();
						var17 = 0;
						var9 = 0;

						while (true) {
							if (var9 >= var7) {
								if ((class131.clientPreferences.parameters.size() >= 10) && (!class131.clientPreferences.parameters.containsKey(var17))) {
									Iterator var43 = class131.clientPreferences.parameters.entrySet().iterator();
									var43.next();
									var43.remove();
								}

								class131.clientPreferences.parameters.put(var17, var15);
								break;
							}

							var17 = ((var17 << 5) - var17) + var42.charAt(var9);
							++var9;
						} 
					}

					if (Login_isUsernameRemembered) {
						class131.clientPreferences.method2286(Login.Login_username);
					} else {
						class131.clientPreferences.method2286(((String) (null)));
					}

					GameEngine.savePreferences();
					staffModLevel = ((AbstractSocket) (var1)).readUnsignedByte();
					playerMod = ((AbstractSocket) (var1)).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket) (var1)).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket) (var1)).readUnsignedByte();
					field544 = ((AbstractSocket) (var1)).readUnsignedByte();
					((AbstractSocket) (var1)).read(var2.array, 0, 8);
					var2.offset = 0;
					this.field542 = var2.readLong();
					if (class391.field4372 >= 29) {
						((AbstractSocket) (var1)).read(var2.array, 0, 8);
						var2.offset = 0;
						field623 = var2.readLong();
					}

					((AbstractSocket) (var1)).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var37 = class82.ServerPacket_values();
					int var23 = var2.readSmartByteShortIsaac();
					if ((var23 < 0) || (var23 >= var37.length)) {
						throw new IOException((var23 + " ") + var2.offset);
					}

					Client.packetWriter.serverPacket = var37[var23];
					Client.packetWriter.serverPacketLength = Client.packetWriter.serverPacket.length;
					((AbstractSocket) (var1)).read(var2.array, 0, 2);
					var2.offset = 0;
					Client.packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						class27.method383(class127.client, "zap");
					} catch (Throwable var24) {
					}

					ModeWhere.method6099(16);
				}

				if (loginState == 16) {
					if (((AbstractSocket) (var1)).available() >= Client.packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket) (var1)).read(var2.array, 0, Client.packetWriter.serverPacketLength);
						timer.method6564();
						Renderable.method4925();
						Fonts.updatePlayer(var2);
						ScriptEvent.field1042 = -1;
						StudioGame.loadRegions(false, var2);
						Client.packetWriter.serverPacket = null;
					}

				} else {
					if ((loginState == 17) && (((AbstractSocket) (var1)).available() >= 2)) {
						var2.offset = 0;
						((AbstractSocket) (var1)).read(var2.array, 0, 2);
						var2.offset = 0;
						SceneTilePaint.field2826 = var2.readUnsignedShort();
						ModeWhere.method6099(18);
					}

					if ((loginState == 18) && (((AbstractSocket) (var1)).available() >= SceneTilePaint.field2826)) {
						var2.offset = 0;
						((AbstractSocket) (var1)).read(var2.array, 0, SceneTilePaint.field2826);
						var2.offset = 0;
						String var35 = var2.readStringCp1252NullTerminated();
						String var41 = var2.readStringCp1252NullTerminated();
						String var39 = var2.readStringCp1252NullTerminated();
						class4.setLoginResponseString(var35, var41, var39);
						Decimator.updateGameState(10);
					}

					if (loginState == 19) {
						if (Client.packetWriter.serverPacketLength == (-1)) {
							if (((AbstractSocket) (var1)).available() < 2) {
								return;
							}

							((AbstractSocket) (var1)).read(var2.array, 0, 2);
							var2.offset = 0;
							Client.packetWriter.serverPacketLength = var2.readUnsignedShort();
						}

						if (((AbstractSocket) (var1)).available() >= Client.packetWriter.serverPacketLength) {
							((AbstractSocket) (var1)).read(var2.array, 0, Client.packetWriter.serverPacketLength);
							var2.offset = 0;
							var44 = Client.packetWriter.serverPacketLength;
							timer.method6566();
							ReflectionCheck.method1080();
							Fonts.updatePlayer(var2);
							if (var44 != var2.offset) {
								throw new RuntimeException();
							}
						}
					} else {
						++field528;
						if (field528 > 2000) {
							if (field661 < 1) {
								if (class329.currentPort == SecureRandomFuture.worldPort) {
									class329.currentPort = UserComparator9.js5Port;
								} else {
									class329.currentPort = SecureRandomFuture.worldPort;
								}

								++field661;
								ModeWhere.method6099(0);
							} else {
								ScriptFrame.getLoginError(-3);
							}
						}
					}
				}
			}
		} catch (IOException var29) {
			if (field661 < 1) {
				if (SecureRandomFuture.worldPort == class329.currentPort) {
					class329.currentPort = UserComparator9.js5Port;
				} else {
					class329.currentPort = SecureRandomFuture.worldPort;
				}

				++field661;
				ModeWhere.method6099(0);
			} else {
				ScriptFrame.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"0")

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
			ClanChannelMember.method2868();
		} else {
			if (!isMenuOpen) {
				ByteArrayPool.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; (var1 < 100) && this.method1158(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				int var2;
				PacketBufferNode var14;
				while (WorldMapID.method4360()) {
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2963, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					class151.performReflectionCheck(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				} 

				if (Client.timer.field4179) {
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2935, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					timer.write(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
					timer.method6580();
				}

				int var3;
				int var4;
				int var5;
				int var6;
				int var7;
				int var10;
				int var11;
				synchronized(class120.mouseRecorder.lock) {
					if (!field490) {
						class120.mouseRecorder.index = 0;
					} else if ((MouseHandler.MouseHandler_lastButton != 0) || (class120.mouseRecorder.index >= 40)) {
						PacketBufferNode var15 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;

						for (var7 = 0; (var7 < class120.mouseRecorder.index) && ((var15 == null) || ((var15.packetBuffer.offset - var3) < 246)); ++var7) {
							var4 = var7;
							int var8 = class120.mouseRecorder.ys[var7];
							if (var8 < (-1)) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}

							int var9 = class120.mouseRecorder.xs[var7];
							if (var9 < (-1)) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}

							if ((var9 != field508) || (var8 != field509)) {
								if (var15 == null) {
									var15 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2965, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeByte(0);
									var3 = var15.packetBuffer.offset;
									PacketBuffer var10000 = var15.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}

								int var12;
								if (field510 != (-1L)) {
									var10 = var9 - field508;
									var11 = var8 - field509;
									var12 = ((int) ((class120.mouseRecorder.millis[var7] - field510) / 20L));
									var5 = ((int) (((long) (var5)) + ((class120.mouseRecorder.millis[var7] - field510) % 20L)));
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}

								field508 = var9;
								field509 = var8;
								if (((((var12 < 8) && (var10 >= (-32))) && (var10 <= 31)) && (var11 >= (-32))) && (var11 <= 31)) {
									var10 += 32;
									var11 += 32;
									var15.packetBuffer.writeShort(((var12 << 12) + var11) + (var10 << 6));
								} else if (((((var12 < 32) && (var10 >= (-128))) && (var10 <= 127)) && (var11 >= (-128))) && (var11 <= 127)) {
									var10 += 128;
									var11 += 128;
									var15.packetBuffer.writeByte(var12 + 128);
									var15.packetBuffer.writeShort(var11 + (var10 << 8));
								} else if (var12 < 32) {
									var15.packetBuffer.writeByte(var12 + 192);
									if ((var9 != (-1)) && (var8 != (-1))) {
										var15.packetBuffer.writeInt(var9 | (var8 << 16));
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								} else {
									var15.packetBuffer.writeShort((var12 & 8191) + 57344);
									if ((var9 != (-1)) && (var8 != (-1))) {
										var15.packetBuffer.writeInt(var9 | (var8 << 16));
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}

								++var6;
								field510 = class120.mouseRecorder.millis[var7];
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

						if (var4 >= class120.mouseRecorder.index) {
							class120.mouseRecorder.index = 0;
						} else {
							MouseRecorder var41 = class120.mouseRecorder;
							var41.index -= var4;
							System.arraycopy(class120.mouseRecorder.xs, var4, class120.mouseRecorder.xs, 0, class120.mouseRecorder.index);
							System.arraycopy(class120.mouseRecorder.ys, var4, class120.mouseRecorder.ys, 0, class120.mouseRecorder.index);
							System.arraycopy(class120.mouseRecorder.millis, var4, class120.mouseRecorder.millis, 0, class120.mouseRecorder.index);
						}
					}
				}

				PacketBufferNode var18;
				if (((MouseHandler.MouseHandler_lastButton == 1) || ((!GameBuild.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4))) || (MouseHandler.MouseHandler_lastButton == 2)) {
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
					if (var16 > 32767L) {
						var16 = 32767L;
					}

					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > class321.canvasHeight) {
						var3 = class321.canvasHeight;
					}

					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > InvDefinition.canvasWidth) {
						var4 = InvDefinition.canvasWidth;
					}

					var5 = ((int) (var16));
					var18 = WorldMapSprite.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, Client.packetWriter.isaacCipher);
					var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
					var18.packetBuffer.writeShort(var4);
					var18.packetBuffer.writeShort(var3);
					packetWriter.addNode(var18);
				}

				if (KeyHandler.field118 > 0) {
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2899, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(0);
					var2 = var14.packetBuffer.offset;
					long var19 = class136.method2931();

					for (var5 = 0; var5 < KeyHandler.field118; ++var5) {
						long var21 = var19 - field585;
						if (var21 > 16777215L) {
							var21 = 16777215L;
						}

						field585 = var19;
						var14.packetBuffer.writeByte(KeyHandler.field143[var5]);
						var14.packetBuffer.writeMediumLME(((int) (var21)));
					}

					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}

				if (field588 > 0) {
					--field588;
				}

				if (((KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97]) || KeyHandler.KeyHandler_pressedKeys[98]) || KeyHandler.KeyHandler_pressedKeys[99]) {
					field589 = true;
				}

				if (field589 && (field588 <= 0)) {
					field588 = 20;
					field589 = false;
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2990, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeShortAdd(camAngleY);
					var14.packetBuffer.writeShort(camAngleX);
					packetWriter.addNode(var14);
				}

				if (Varcs.hasFocus && (!hadFocus)) {
					hadFocus = true;
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2978, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(1);
					packetWriter.addNode(var14);
				}

				if ((!Varcs.hasFocus) && hadFocus) {
					hadFocus = false;
					var14 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2978, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					packetWriter.addNode(var14);
				}

				if (ScriptFrame.worldMap != null) {
					ScriptFrame.worldMap.method7215();
				}

				if (Interpreter.ClanChat_inClanChat) {
					if (ClientPacket.friendsChat != null) {
						ClientPacket.friendsChat.sort();
					}

					ModeWhere.method6102();
					Interpreter.ClanChat_inClanChat = false;
				}

				class19.method287();
				if (field714 != class18.Client_plane) {
					field714 = class18.Client_plane;
					var1 = class18.Client_plane;
					int[] var33 = HealthBarUpdate.sceneMinimapSprite.pixels;
					var3 = var33.length;

					for (var4 = 0; var4 < var3; ++var4) {
						var33[var4] = 0;
					}

					for (var4 = 1; var4 < 103; ++var4) {
						var5 = ((103 - var4) * 2048) + 24628;

						for (var6 = 1; var6 < 103; ++var6) {
							if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) {
								ArchiveLoader.scene.drawTileMinimap(var33, var5, 512, var1, var6, var4);
							}

							if ((var1 < 3) && ((Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0)) {
								ArchiveLoader.scene.drawTileMinimap(var33, var5, 512, var1 + 1, var6, var4);
							}

							var5 += 4;
						}
					}

					var4 = ((((238 + ((int) (Math.random() * 20.0))) - 10) << 16) + (((238 + ((int) (Math.random() * 20.0))) - 10) << 8)) + ((238 + ((int) (Math.random() * 20.0))) - 10);
					var5 = ((238 + ((int) (Math.random() * 20.0))) - 10) << 16;
					HealthBarUpdate.sceneMinimapSprite.setRaster();

					for (var6 = 1; var6 < 103; ++var6) {
						for (var7 = 1; var7 < 103; ++var7) {
							if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) {
								GrandExchangeOfferUnitPriceComparator.drawObject(var1, var7, var6, var4, var5);
							}

							if ((var1 < 3) && ((Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0)) {
								GrandExchangeOfferUnitPriceComparator.drawObject(var1 + 1, var7, var6, var4, var5);
							}
						}
					}

					mapIconCount = 0;

					for (var6 = 0; var6 < 104; ++var6) {
						for (var7 = 0; var7 < 104; ++var7) {
							long var23 = ArchiveLoader.scene.getFloorDecorationTag(class18.Client_plane, var6, var7);
							if (0L != var23) {
								var10 = FileSystem.Entity_unpackID(var23);
								var11 = class146.getObjectDefinition(var10).mapIconId;
								if ((var11 >= 0) && UserComparator7.WorldMapElement_get(var11).field1823) {
									mapIcons[mapIconCount] = UserComparator7.WorldMapElement_get(var11).getSpriteBool(false);
									mapIconXs[mapIconCount] = var6;
									mapIconYs[mapIconCount] = var7;
									++mapIconCount;
								}
							}
						}
					}

					FontName.rasterProvider.apply();
				}

				if (gameState == 30) {
					MenuAction.method1907();
					class136.method2923();
					++Client.packetWriter.field1322;
					if (Client.packetWriter.field1322 > 750) {
						ClanChannelMember.method2868();
					} else {
						class92.method2362();

						for (var1 = 0; var1 < npcCount; ++var1) {
							var2 = npcIndices[var1];
							NPC var25 = npcs[var2];
							if (var25 != null) {
								class149.updateActorSequence(var25, var25.definition.size);
							}
						}

						int[] var31 = Players.Players_indices;

						for (var2 = 0; var2 < Players.Players_count; ++var2) {
							Player var35 = players[var31[var2]];
							if ((var35 != null) && (var35.overheadTextCyclesRemaining > 0)) {
								--var35.overheadTextCyclesRemaining;
								if (var35.overheadTextCyclesRemaining == 0) {
									var35.overheadText = null;
								}
							}
						}

						for (var2 = 0; var2 < npcCount; ++var2) {
							var3 = npcIndices[var2];
							NPC var26 = npcs[var3];
							if ((var26 != null) && (var26.overheadTextCyclesRemaining > 0)) {
								--var26.overheadTextCyclesRemaining;
								if (var26.overheadTextCyclesRemaining == 0) {
									var26.overheadText = null;
								}
							}
						}

						++field556;
						if (mouseCrossColor != 0) {
							mouseCrossState += 20;
							if (mouseCrossState >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (GrandExchangeOfferAgeComparator.field4011 != null) {
							++field610;
							if (field610 >= 15) {
								class346.invalidateWidget(GrandExchangeOfferAgeComparator.field4011);
								GrandExchangeOfferAgeComparator.field4011 = null;
							}
						}

						Widget var32 = DevicePcmPlayerProvider.mousedOverWidgetIf1;
						Widget var34 = GrandExchangeOfferOwnWorldComparator.field486;
						DevicePcmPlayerProvider.mousedOverWidgetIf1 = null;
						GrandExchangeOfferOwnWorldComparator.field486 = null;
						draggedOnWidget = null;
						field687 = false;
						field696 = false;
						field731 = 0;

						while (SecureRandomCallable.isKeyDown() && (field731 < 128)) {
							if (((staffModLevel >= 2) && KeyHandler.KeyHandler_pressedKeys[82]) && (GameEngine.field218 == 66)) {
								String var36 = TextureProvider.method4950();
								class127.client.method452(var36);
							} else if ((oculusOrbState != 1) || (ItemComposition.field2121 <= 0)) {
								field733[field731] = GameEngine.field218;
								field732[field731] = ItemComposition.field2121;
								++field731;
							}
						} 

						if (((class113.method2651() && KeyHandler.KeyHandler_pressedKeys[82]) && KeyHandler.KeyHandler_pressedKeys[81]) && (mouseWheelRotation != 0)) {
							var3 = GrandExchangeEvents.localPlayer.plane - mouseWheelRotation;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > 3) {
								var3 = 3;
							}

							if (var3 != GrandExchangeEvents.localPlayer.plane) {
								StructComposition.method3619(GrandExchangeEvents.localPlayer.pathX[0] + GrandExchangeOfferOwnWorldComparator.baseX, GrandExchangeEvents.localPlayer.pathY[0] + VarcInt.baseY, var3, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != (-1)) {
							Language.updateRootInterface(rootInterface, 0, 0, InvDefinition.canvasWidth, class321.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var27;
							ScriptEvent var37;
							Widget var38;
							do {
								var37 = ((ScriptEvent) (field710.removeLast()));
								if (var37 == null) {
									while (true) {
										do {
											var37 = ((ScriptEvent) (field711.removeLast()));
											if (var37 == null) {
												while (true) {
													do {
														var37 = ((ScriptEvent) (scriptEvents.removeLast()));
														if (var37 == null) {
															this.menu();
															if (ScriptFrame.worldMap != null) {
																ScriptFrame.worldMap.method7327(class18.Client_plane, (GrandExchangeEvents.localPlayer.x >> 7) + GrandExchangeOfferOwnWorldComparator.baseX, (GrandExchangeEvents.localPlayer.y >> 7) + VarcInt.baseY, false);
																ScriptFrame.worldMap.loadCache();
															}

															if (clickedWidget != null) {
																this.method1164();
															}

															PacketBufferNode var40;
															if (class142.dragInventoryWidget != null) {
																class346.invalidateWidget(class142.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field767) {
																		if ((class142.dragInventoryWidget == GrandExchangeEvent.hoveredItemContainer) && (dragItemSlotSource != dragItemSlotDestination)) {
																			Widget var39 = class142.dragInventoryWidget;
																			byte var30 = 0;
																			if ((field524 == 1) && (var39.contentType == 206)) {
																				var30 = 1;
																			}

																			if (var39.itemIds[dragItemSlotDestination] <= 0) {
																				var30 = 0;
																			}

																			if (ReflectionCheck.method1079(class326.getWidgetFlags(var39))) {
																				var5 = dragItemSlotSource;
																				var6 = dragItemSlotDestination;
																				var39.itemIds[var6] = var39.itemIds[var5];
																				var39.itemQuantities[var6] = var39.itemQuantities[var5];
																				var39.itemIds[var5] = -1;
																				var39.itemQuantities[var5] = 0;
																			} else if (var30 == 1) {
																				var5 = dragItemSlotSource;
																				var6 = dragItemSlotDestination;

																				while (var6 != var5) {
																					if (var5 > var6) {
																						var39.swapItems(var5 - 1, var5);
																						--var5;
																					} else if (var5 < var6) {
																						var39.swapItems(var5 + 1, var5);
																						++var5;
																					}
																				} 
																			} else {
																				var39.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			var40 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher);
																			var40.packetBuffer.writeShortAddLE(dragItemSlotDestination);
																			var40.packetBuffer.writeShortLE(dragItemSlotSource);
																			var40.packetBuffer.writeIntLE(class142.dragInventoryWidget.id);
																			var40.packetBuffer.writeByteNeg(var30);
																			packetWriter.addNode(var40);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		UrlRequest.method2551(draggedWidgetX, draggedWidgetY);
																	}

																	field610 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	class142.dragInventoryWidget = null;
																} else if ((itemDragDuration >= 5) && ((((MouseHandler.MouseHandler_x > (draggedWidgetX + 5)) || (MouseHandler.MouseHandler_x < (draggedWidgetX - 5))) || (MouseHandler.MouseHandler_y > (draggedWidgetY + 5))) || (MouseHandler.MouseHandler_y < (draggedWidgetY - 5)))) {
																	field767 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var3 = Scene.Scene_selectedX;
																var4 = Scene.Scene_selectedY;
																var40 = WorldMapSprite.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, Client.packetWriter.isaacCipher);
																var40.packetBuffer.writeByte(5);
																var40.packetBuffer.writeShortLE(var3 + GrandExchangeOfferOwnWorldComparator.baseX);
																var40.packetBuffer.writeShort(var4 + VarcInt.baseY);
																var40.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1 : 0);
																packetWriter.addNode(var40);
																Scene.method4771();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var3;
																destinationY = var4;
															}

															if (var32 != DevicePcmPlayerProvider.mousedOverWidgetIf1) {
																if (var32 != null) {
																	class346.invalidateWidget(var32);
																}

																if (DevicePcmPlayerProvider.mousedOverWidgetIf1 != null) {
																	class346.invalidateWidget(DevicePcmPlayerProvider.mousedOverWidgetIf1);
																}
															}

															if ((var34 != GrandExchangeOfferOwnWorldComparator.field486) && (field657 == field656)) {
																if (var34 != null) {
																	class346.invalidateWidget(var34);
																}

																if (GrandExchangeOfferOwnWorldComparator.field486 != null) {
																	class346.invalidateWidget(GrandExchangeOfferOwnWorldComparator.field486);
																}
															}

															if (GrandExchangeOfferOwnWorldComparator.field486 != null) {
																if (field656 < field657) {
																	++field656;
																	if (field656 == field657) {
																		class346.invalidateWidget(GrandExchangeOfferOwnWorldComparator.field486);
																	}
																}
															} else if (field656 > 0) {
																--field656;
															}

															class135.method2920();
															if (field754) {
																SpotAnimationDefinition.method3545();
															} else if (isCameraLocked) {
																GrandExchangeOfferOwnWorldComparator.method1128();
															}

															for (var3 = 0; var3 < 5; ++var3) {
																int var10002 = field600[var3]++;
															}

															class160.varcs.tryWrite();
															var3 = World.method1677();
															var4 = KeyHandler.KeyHandler_idleCycles;
															if ((var3 > 15000) && (var4 > 15000)) {
																logoutTimer = 250;
																ClientPacket.method5176(14500);
																var18 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2979, Client.packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															Decimator.friendSystem.processFriendUpdates();
															++Client.packetWriter.pendingWrites;
															if (Client.packetWriter.pendingWrites > 50) {
																var18 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2950, Client.packetWriter.isaacCipher);
																packetWriter.addNode(var18);
															}

															try {
																packetWriter.flush();
															} catch (IOException var28) {
																ClanChannelMember.method2868();
															}

															return;
														}

														var38 = var37.widget;
														if (var38.childIndex < 0) {
															break;
														}

														var27 = class127.getWidget(var38.parentId);
													} while ((((var27 == null) || (var27.children == null)) || (var38.childIndex >= var27.children.length)) || (var38 != var27.children[var38.childIndex]) );

													ClanSettings.runScriptEvent(var37);
												} 
											}

											var38 = var37.widget;
											if (var38.childIndex < 0) {
												break;
											}

											var27 = class127.getWidget(var38.parentId);
										} while ((((var27 == null) || (var27.children == null)) || (var38.childIndex >= var27.children.length)) || (var38 != var27.children[var38.childIndex]) );

										ClanSettings.runScriptEvent(var37);
									} 
								}

								var38 = var37.widget;
								if (var38.childIndex < 0) {
									break;
								}

								var27 = class127.getWidget(var38.parentId);
							} while ((((var27 == null) || (var27.children == null)) || (var38.childIndex >= var27.children.length)) || (var38 != var27.children[var38.childIndex]) );

							ClanSettings.runScriptEvent(var37);
						} 
					}
				}
			}
		}
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1620064665")

	@Export("resizeJS")
	void resizeJS() {
		int var1 = InvDefinition.canvasWidth;
		int var2 = class321.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (class131.clientPreferences != null) {
			try {
				Client var3 = class127.client;
				Object[] var4 = new Object[]{ getWindowedMode() };
				JSObject.getWindow(var3).call("resize", var4);
			} catch (Throwable var5) {
			}
		}

	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(descriptor = 
	"(S)V", garbageValue = 
	"-27115")

	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != (-1)) {
			class115.method2680(rootInterface);
		}

		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field715[var1]) {
				field716[var1] = true;
			}

			field717[var1] = field715[var1];
			field715[var1] = false;
		}

		field540 = cycle;
		viewportX = -1;
		viewportY = -1;
		GrandExchangeEvent.hoveredItemContainer = null;
		if (rootInterface != (-1)) {
			rootWidgetCount = 0;
			class131.drawWidgets(rootInterface, 0, 0, InvDefinition.canvasWidth, class321.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				class11.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				class11.crossSprites[(mouseCrossState / 100) + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		if (!isMenuOpen) {
			if (viewportX != (-1)) {
				UrlRequester.method2537(viewportX, viewportY);
			}
		} else {
			Coord.method5531();
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field717[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field716[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		var1 = class18.Client_plane;
		int var2 = GrandExchangeEvents.localPlayer.x;
		int var3 = GrandExchangeEvents.localPlayer.y;
		int var4 = field556;

		for (ObjectSound var5 = ((ObjectSound) (ObjectSound.objectSounds.last())); var5 != null; var5 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if ((var5.soundEffectId != (-1)) || (var5.soundEffectIds != null)) {
				int var6 = 0;
				if (var2 > var5.maxX) {
					var6 += var2 - var5.maxX;
				} else if (var2 < var5.x) {
					var6 += var5.x - var2;
				}

				if (var3 > var5.maxY) {
					var6 += var3 - var5.maxY;
				} else if (var3 < var5.y) {
					var6 += var5.y - var3;
				}

				if ((((var6 - 64) <= var5.field814) && (class131.clientPreferences.method2270() != 0)) && (var1 == var5.plane)) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}

					int var7 = ((var5.field814 - var6) * class131.clientPreferences.method2270()) / var5.field814;
					Object var10000;
					if (var5.stream1 == null) {
						if (var5.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var8 = SoundEffect.readSoundEffect(class182.archive4, var5.soundEffectId, 0);
							if (var8 != null) {
								RawSound var9 = var8.toRawSound().resample(WorldMapRectangle.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
								var10.setNumLoops(-1);
								StructComposition.pcmStreamMixer.addSubStream(var10);
								var5.stream1 = var10;
							}
						}
					} else {
						var5.stream1.method929(var7);
					}

					if (var5.stream2 == null) {
						if ((var5.soundEffectIds != null) && ((var5.field821 -= var4) <= 0)) {
							int var12 = ((int) (Math.random() * ((double) (var5.soundEffectIds.length))));
							var10000 = null;
							SoundEffect var13 = SoundEffect.readSoundEffect(class182.archive4, var5.soundEffectIds[var12], 0);
							if (var13 != null) {
								RawSound var14 = var13.toRawSound().resample(WorldMapRectangle.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var14, 100, var7);
								var11.setNumLoops(0);
								StructComposition.pcmStreamMixer.addSubStream(var11);
								var5.stream2 = var11;
								var5.field821 = var5.field818 + ((int) (Math.random() * ((double) (var5.field810 - var5.field818))));
							}
						}
					} else {
						var5.stream2.method929(var7);
						if (!var5.stream2.hasNext()) {
							var5.stream2 = null;
						}
					}
				} else {
					if (var5.stream1 != null) {
						StructComposition.pcmStreamMixer.removeSubStream(var5.stream1);
						var5.stream1 = null;
					}

					if (var5.stream2 != null) {
						StructComposition.pcmStreamMixer.removeSubStream(var5.stream2);
						var5.stream2 = null;
					}
				}
			}
		}

		field556 = 0;
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(descriptor = 
	"(Lcl;B)Z", garbageValue = 
	"1")

	final boolean method1158(PacketWriter var1) {
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
					if (var1.field1317) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1322 = 0;
						var1.field1317 = false;
					}

					var3.offset = 0;
					if (var3.method7622()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1322 = 0;
					}

					var1.field1317 = true;
					ServerPacket[] var4 = class82.ServerPacket_values();
					var5 = var3.readSmartByteShortIsaac();
					if ((var5 < 0) || (var5 >= var4.length)) {
						throw new IOException((var5 + " ") + var3.offset);
					}

					var1.serverPacket = var4[var5];
					var1.serverPacketLength = var1.serverPacket.length;
				}

				if (var1.serverPacketLength == (-1)) {
					if (!var2.isAvailable(1)) {
						return false;
					}

					var1.getSocket().read(var3.array, 0, 1);
					var1.serverPacketLength = var3.array[0] & 255;
				}

				if (var1.serverPacketLength == (-2)) {
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
				var1.field1322 = 0;
				timer.method6574();
				var1.field1313 = var1.field1325;
				var1.field1325 = var1.field1324;
				var1.field1324 = var1.serverPacket;
				if (ServerPacket.field3108 == var1.serverPacket) {
					ClanMate.method6700(class263.field3007);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3113 == var1.serverPacket) {
					class431.field4602 = true;
					WorldMapSection1.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				int var20;
				if (ServerPacket.field3073 == var1.serverPacket) {
					for (var20 = 0; var20 < VarpDefinition.VarpDefinition_fileCount; ++var20) {
						VarpDefinition var84 = class134.VarpDefinition_get(var20);
						if (var84 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}

					class143.method3072();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3120 == var1.serverPacket) {
					Decimator.friendSystem.method1726();
					field701 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3040 == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var82 = ((InterfaceParent) (interfaceParents.get(((long) (var20)))));
					if (var82 != null) {
						Script.closeInterface(var82, true);
					}

					if (meslayerContinueWidget != null) {
						class346.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var60;
				if (ServerPacket.field3071 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortAddLE();
					var6 = var3.readUnsignedIntIME();
					var60 = class127.getWidget(var6);
					var60.field3392 = var5 + (var20 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3090 == var1.serverPacket) {
					ClanMate.method6700(class263.field3011);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3055 == var1.serverPacket) {
					class29.field181 = var3.readUnsignedByteAdd();
					PlayerComposition.field3307 = var3.readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3024 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readShort();
					var6 = var3.method7716();
					var60 = class127.getWidget(var20);
					if ((((var5 != var60.rawX) || (var6 != var60.rawY)) || (var60.xAlignment != 0)) || (var60.yAlignment != 0)) {
						var60.rawX = var5;
						var60.rawY = var6;
						var60.xAlignment = 0;
						var60.yAlignment = 0;
						class346.invalidateWidget(var60);
						this.alignWidget(var60);
						if (var60.type == 0) {
							AbstractByteArrayCopier.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var20 >> 16], var60, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3104 == var1.serverPacket) {
					isCameraLocked = true;
					field754 = false;
					class286.field3274 = var3.readUnsignedByte();
					class54.field447 = var3.readUnsignedByte();
					BZip2State.field4662 = var3.readUnsignedShort();
					Script.field955 = var3.readUnsignedByte();
					ArchiveDisk.field4309 = var3.readUnsignedByte();
					if (ArchiveDisk.field4309 >= 100) {
						WorldMapLabelSize.cameraX = (class286.field3274 * 128) + 64;
						class154.cameraZ = (class54.field447 * 128) + 64;
						ItemContainer.cameraY = WorldMapLabel.getTileHeight(WorldMapLabelSize.cameraX, class154.cameraZ, class18.Client_plane) - BZip2State.field4662;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3066 == var1.serverPacket) {
					ClanMate.method6700(class263.field3009);
					var1.serverPacket = null;
					return true;
				}

				String var52;
				if (ServerPacket.field3030 == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var21 = AbstractFont.escapeBrackets(MouseHandler.method584(class193.method3883(var3)));
					Actor.addGameMessage(6, var52, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3114 == var1.serverPacket) {
					class29.field181 = var3.readUnsignedByteAdd();
					PlayerComposition.field3307 = var3.readUnsignedByte();

					for (var20 = PlayerComposition.field3307; var20 < (PlayerComposition.field3307 + 8); ++var20) {
						for (var5 = class29.field181; var5 < (class29.field181 + 8); ++var5) {
							if (groundItems[class18.Client_plane][var20][var5] != null) {
								groundItems[class18.Client_plane][var20][var5] = null;
								UserComparator3.updateItemPile(var20, var5);
							}
						}
					}

					for (PendingSpawn var54 = ((PendingSpawn) (pendingSpawns.last())); var54 != null; var54 = ((PendingSpawn) (pendingSpawns.previous()))) {
						if (((((var54.x >= PlayerComposition.field3307) && (var54.x < (PlayerComposition.field3307 + 8))) && (var54.y >= class29.field181)) && (var54.y < (class29.field181 + 8))) && (var54.plane == class18.Client_plane)) {
							var54.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var8;
				int var11;
				int var22;
				int var61;
				int var62;
				if (ServerPacket.field3123 == var1.serverPacket) {
					var6 = var3.method7752();
					var20 = var6 >> 16;
					var5 = (var6 >> 8) & 255;
					var22 = var20 + ((var6 >> 4) & 7);
					var8 = var5 + (var6 & 7);
					var62 = var3.readUnsignedByte();
					var11 = var3.readUnsignedShort();
					var61 = var3.readUnsignedShortAddLE();
					if ((((var22 >= 0) && (var8 >= 0)) && (var22 < 104)) && (var8 < 104)) {
						var22 = (var22 * 128) + 64;
						var8 = (var8 * 128) + 64;
						GraphicsObject var64 = new GraphicsObject(var61, class18.Client_plane, var22, var8, WorldMapLabel.getTileHeight(var22, var8, class18.Client_plane) - var62, var11, cycle);
						graphicsObjects.addFirst(var64);
					}

					var1.serverPacket = null;
					return true;
				}

				Widget var74;
				if (ServerPacket.field3052 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readShortAdd();
					var74 = class127.getWidget(var20);
					if ((var5 != var74.sequenceId) || (var5 == (-1))) {
						var74.sequenceId = var5;
						var74.modelFrame = 0;
						var74.modelFrameCycle = 0;
						class346.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				int var13;
				int var15;
				int var24;
				if (ServerPacket.field3122 == var1.serverPacket) {
					var6 = var3.method7752();
					var20 = var6 >> 16;
					var5 = (var6 >> 8) & 255;
					var22 = var20 + ((var6 >> 4) & 7);
					var8 = var5 + (var6 & 7);
					var61 = var3.readUnsignedByteAdd();
					var62 = var61 >> 2;
					var11 = var61 & 3;
					var24 = field748[var62];
					var13 = var3.readUnsignedShort();
					if ((((var22 >= 0) && (var8 >= 0)) && (var22 < 103)) && (var8 < 103)) {
						if (var24 == 0) {
							BoundaryObject var69 = ArchiveLoader.scene.method4754(class18.Client_plane, var22, var8);
							if (var69 != null) {
								var15 = FileSystem.Entity_unpackID(var69.tag);
								if (var62 == 2) {
									var69.renderable1 = new DynamicObject(var15, 2, var11 + 4, class18.Client_plane, var22, var8, var13, false, var69.renderable1);
									var69.renderable2 = new DynamicObject(var15, 2, (var11 + 1) & 3, class18.Client_plane, var22, var8, var13, false, var69.renderable2);
								} else {
									var69.renderable1 = new DynamicObject(var15, var62, var11, class18.Client_plane, var22, var8, var13, false, var69.renderable1);
								}
							}
						} else if (var24 == 1) {
							WallDecoration var68 = ArchiveLoader.scene.method4860(class18.Client_plane, var22, var8);
							if (var68 != null) {
								var15 = FileSystem.Entity_unpackID(var68.tag);
								if ((var62 != 4) && (var62 != 5)) {
									if (var62 == 6) {
										var68.renderable1 = new DynamicObject(var15, 4, var11 + 4, class18.Client_plane, var22, var8, var13, false, var68.renderable1);
									} else if (var62 == 7) {
										var68.renderable1 = new DynamicObject(var15, 4, ((var11 + 2) & 3) + 4, class18.Client_plane, var22, var8, var13, false, var68.renderable1);
									} else if (var62 == 8) {
										var68.renderable1 = new DynamicObject(var15, 4, var11 + 4, class18.Client_plane, var22, var8, var13, false, var68.renderable1);
										var68.renderable2 = new DynamicObject(var15, 4, ((var11 + 2) & 3) + 4, class18.Client_plane, var22, var8, var13, false, var68.renderable2);
									}
								} else {
									var68.renderable1 = new DynamicObject(var15, 4, var11, class18.Client_plane, var22, var8, var13, false, var68.renderable1);
								}
							}
						} else if (var24 == 2) {
							GameObject var66 = ArchiveLoader.scene.getGameObject(class18.Client_plane, var22, var8);
							if (var62 == 11) {
								var62 = 10;
							}

							if (var66 != null) {
								var66.renderable = new DynamicObject(FileSystem.Entity_unpackID(var66.tag), var62, var11, class18.Client_plane, var22, var8, var13, false, var66.renderable);
							}
						} else if (var24 == 3) {
							FloorDecoration var67 = ArchiveLoader.scene.getFloorDecoration(class18.Client_plane, var22, var8);
							if (var67 != null) {
								var67.renderable = new DynamicObject(FileSystem.Entity_unpackID(var67.tag), 22, var11, class18.Client_plane, var22, var8, var13, false, var67.renderable);
							}
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3119 == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByteSub();
					tradeChatMode = var3.readUnsignedByteAdd();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3101 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					Tile.method4603(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3051 == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_main[var20] != Varps.Varps_temp[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							WorldMapLabel.changeGameOptions(var20);
							changedVarps[((++changedVarpCount) - 1) & 31] = var20;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3048 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					SoundCache.playSong(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3045 == var1.serverPacket) {
					var20 = var3.method7793();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					Players.method2419(var5, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3094 == var1.serverPacket) {
					HorizontalAlignment.field1885 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3031 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var20;
					if (Varps.Varps_main[var5] != var20) {
						Varps.Varps_main[var5] = var20;
					}

					WorldMapLabel.changeGameOptions(var5);
					changedVarps[((++changedVarpCount) - 1) & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3080 == var1.serverPacket) {
					HorizontalAlignment.field1885 = new class391(DirectByteArrayCopier.HitSplatDefinition_cached);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3036 == var1.serverPacket) {
					ClanMate.method6700(class263.field3012);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3074 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < (-70000)) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var74 = class127.getWidget(var20);
					} else {
						var74 = null;
					}

					if (var74 != null) {
						for (var22 = 0; var22 < var74.itemIds.length; ++var22) {
							var74.itemIds[var22] = 0;
							var74.itemQuantities[var22] = 0;
						}
					}

					WorldMapSection1.clearItemContainer(var5);
					var22 = var3.readUnsignedShort();

					for (var8 = 0; var8 < var22; ++var8) {
						var61 = var3.readUnsignedShort();
						var62 = var3.readUnsignedByteAdd();
						if (var62 == 255) {
							var62 = var3.readInt();
						}

						if ((var74 != null) && (var8 < var74.itemIds.length)) {
							var74.itemIds[var8] = var61;
							var74.itemQuantities[var8] = var62;
						}

						ChatChannel.itemContainerSetItem(var5, var8, var61 - 1, var62);
					}

					if (var74 != null) {
						class346.invalidateWidget(var74);
					}

					class143.method3072();
					changedItemContainers[((++field695) - 1) & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3058 == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					Object[] var79 = new Object[var52.length() + 1];

					for (var6 = var52.length() - 1; var6 >= 0; --var6) {
						if (var52.charAt(var6) == 's') {
							var79[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var79[var6 + 1] = new Integer(var3.readInt());
						}
					}

					var79[0] = new Integer(var3.readInt());
					ScriptEvent var88 = new ScriptEvent();
					var88.args = var79;
					ClanSettings.runScriptEvent(var88);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3110 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAdd();
					var74 = class127.getWidget(var20);
					if ((var74 != null) && (var74.type == 0)) {
						if (var5 > (var74.scrollHeight - var74.height)) {
							var5 = var74.scrollHeight - var74.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var74.scrollY) {
							var74.scrollY = var5;
							class346.invalidateWidget(var74);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3091 == var1.serverPacket) {
					if (rootInterface != (-1)) {
						MouseRecorder.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3061 == var1.serverPacket) {
					class431.field4602 = true;
					WorldMapSection1.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3085 == var1.serverPacket) {
					isCameraLocked = false;

					for (var20 = 0; var20 < 5; ++var20) {
						field546[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				String var23;
				boolean var56;
				if (ServerPacket.field3062 == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					var56 = var3.readUnsignedByte() == 1;
					var23 = "";
					boolean var85 = false;
					if (var56) {
						var23 = var3.readStringCp1252NullTerminated();
						if (Decimator.friendSystem.isIgnored(new Username(var23, class122.loginType))) {
							var85 = true;
						}
					}

					String var86 = var3.readStringCp1252NullTerminated();
					if (!var85) {
						Actor.addGameMessage(var20, var23, var86);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3112 == var1.serverPacket) {
					class119.method2760(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3107 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						ClientPacket.friendsChat = null;
					} else {
						if (ClientPacket.friendsChat == null) {
							ClientPacket.friendsChat = new FriendsChat(class122.loginType, class127.client);
						}

						ClientPacket.friendsChat.readUpdate(var3);
					}

					SecureRandomCallable.method2050();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3032 == var1.serverPacket) {
					ClanMate.method6700(class263.field3013);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3037 == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var21 = var3.readStringCp1252NullTerminated();
					var74 = class127.getWidget(var20);
					if (!var21.equals(var74.text)) {
						var74.text = var21;
						class346.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3128 == var1.serverPacket) {
					hintArrowType = var3.readUnsignedByte();
					if (hintArrowType == 1) {
						hintArrowNpcIndex = var3.readUnsignedShort();
					}

					if ((hintArrowType >= 2) && (hintArrowType <= 6)) {
						if (hintArrowType == 2) {
							hintArrowSubX = 64;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 3) {
							hintArrowSubX = 0;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 4) {
							hintArrowSubX = 128;
							hintArrowSubY = 64;
						}

						if (hintArrowType == 5) {
							hintArrowSubX = 64;
							hintArrowSubY = 0;
						}

						if (hintArrowType == 6) {
							hintArrowSubX = 64;
							hintArrowSubY = 128;
						}

						hintArrowType = 2;
						hintArrowX = var3.readUnsignedShort();
						hintArrowY = var3.readUnsignedShort();
						hintArrowHeight = var3.readUnsignedByte();
					}

					if (hintArrowType == 10) {
						hintArrowPlayerIndex = var3.readUnsignedShort();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3063 == var1.serverPacket) {
					ClanMate.method6700(class263.field3004);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3057 == var1.serverPacket) {
					World var53 = new World();
					var53.host = var3.readStringCp1252NullTerminated();
					var53.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var53.properties = var5;
					Decimator.updateGameState(45);
					var2.close();
					var2 = null;
					PlatformInfo.changeWorld(var53);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3081 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3077 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var22 = var3.readUnsignedByte();
					field546[var20] = true;
					field756[var20] = var5;
					field636[var20] = var6;
					field674[var20] = var22;
					field600[var20] = 0;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3075 == var1.serverPacket) {
					class143.method3072();
					weight = var3.readShort();
					field707 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				byte var72;
				if (ServerPacket.field3043 == var1.serverPacket) {
					field755 = cycleCntr;
					var72 = var3.readByte();
					class145 var77 = new class145(var3);
					ClanChannel var87;
					if (var72 >= 0) {
						var87 = currentClanChannels[var72];
					} else {
						var87 = class21.guestClanChannel;
					}

					var77.method3086(var87);
					var1.serverPacket = null;
					return true;
				}

				NPC var57;
				if (ServerPacket.field3121 == var1.serverPacket) {
					var6 = var3.readUnsignedByteNeg();
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					var57 = npcs[var20];
					if (var57 != null) {
						if ((var5 == var57.sequence) && (var5 != (-1))) {
							var8 = class163.SequenceDefinition_get(var5).field2161;
							if (var8 == 1) {
								var57.sequenceFrame = 0;
								var57.sequenceFrameCycle = 0;
								var57.sequenceDelay = var6;
								var57.field1152 = 0;
							} else if (var8 == 2) {
								var57.field1152 = 0;
							}
						} else if (((var5 == (-1)) || (var57.sequence == (-1))) || (class163.SequenceDefinition_get(var5).field2155 >= class163.SequenceDefinition_get(var57.sequence).field2155)) {
							var57.sequence = var5;
							var57.sequenceFrame = 0;
							var57.sequenceFrameCycle = 0;
							var57.sequenceDelay = var6;
							var57.field1152 = 0;
							var57.field1170 = var57.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3042 == var1.serverPacket) {
					class426.method7546();
					var72 = var3.readByte();
					class131 var75 = new class131(var3);
					ClanSettings var83;
					if (var72 >= 0) {
						var83 = currentClanSettings[var72];
					} else {
						var83 = class154.guestClanSettings;
					}

					var75.method2873(var83);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3083 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var21 = var3.readStringCp1252NullTerminated();
					var6 = var3.readUnsignedByteAdd();
					if ((var20 >= 1) && (var20 <= 8)) {
						if (var21.equalsIgnoreCase("null")) {
							var21 = null;
						}

						playerMenuActions[var20 - 1] = var21;
						playerOptionsPriorities[var20 - 1] = var6 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3096 == var1.serverPacket) {
					ClanMate.method6700(class263.field3005);
					var1.serverPacket = null;
					return true;
				}

				long var26;
				long var28;
				long var30;
				String var32;
				int var33;
				if (ServerPacket.field3067 == var1.serverPacket) {
					var72 = var3.readByte();
					var26 = ((long) (var3.readUnsignedShort()));
					var28 = ((long) (var3.readMedium()));
					var30 = (var26 << 32) + var28;
					boolean var63 = false;
					ClanChannel var12 = (var72 >= 0) ? currentClanChannels[var72] : class21.guestClanChannel;
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
						var32 = class193.method3883(var3);
						var33 = (var72 >= 0) ? 43 : 46;
						class301.addChatMessage(var33, "", var32, var12.name);
					}

					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var7;
				long var35;
				if (ServerPacket.field3068 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						class29.Widget_resetModelFrames(rootInterface);
						class145.runWidgetOnLoadListener(rootInterface);

						for (var22 = 0; var22 < 100; ++var22) {
							field715[var22] = true;
						}
					}

					InterfaceParent var91;
					for (; (var6--) > 0; var91.field1028 = true) {
						var22 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var61 = var3.readUnsignedByte();
						var91 = ((InterfaceParent) (interfaceParents.get(((long) (var22)))));
						if ((var91 != null) && (var8 != var91.group)) {
							Script.closeInterface(var91, true);
							var91 = null;
						}

						if (var91 == null) {
							var91 = class4.method16(var22, var8, var61);
						}
					}

					for (var7 = ((InterfaceParent) (interfaceParents.first())); var7 != null; var7 = ((InterfaceParent) (interfaceParents.next()))) {
						if (var7.field1028) {
							var7.field1028 = false;
						} else {
							Script.closeInterface(var7, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var20) {
						var22 = var3.readInt();
						var8 = var3.readUnsignedShort();
						var61 = var3.readUnsignedShort();
						var62 = var3.readInt();

						for (var11 = var8; var11 <= var61; ++var11) {
							var35 = ((long) (var11)) + (((long) (var22)) << 32);
							widgetFlags.put(new IntegerNode(var62), var35);
						}
					} 

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3025 == var1.serverPacket) {
					GameEngine.privateChatMode = class166.method3343(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3026 == var1.serverPacket) {
					WorldMapSection1.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				Widget var25;
				if (ServerPacket.field3097 == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntIME();
					InterfaceParent var81 = ((InterfaceParent) (interfaceParents.get(((long) (var20)))));
					var7 = ((InterfaceParent) (interfaceParents.get(((long) (var5)))));
					if (var7 != null) {
						Script.closeInterface(var7, (var81 == null) || (var7.group != var81.group));
					}

					if (var81 != null) {
						var81.remove();
						interfaceParents.put(var81, ((long) (var5)));
					}

					var25 = class127.getWidget(var20);
					if (var25 != null) {
						class346.invalidateWidget(var25);
					}

					var25 = class127.getWidget(var5);
					if (var25 != null) {
						class346.invalidateWidget(var25);
						AbstractByteArrayCopier.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var25.id >>> 16], var25, true);
					}

					if (rootInterface != (-1)) {
						MouseRecorder.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3093 == var1.serverPacket) {
					ClanMate.method6700(class263.field3015);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3116 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != field586) {
						field586 = var20;
						ObjectSound.method1757();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3082 == var1.serverPacket) {
					AbstractWorldMapData.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				boolean var78;
				if (ServerPacket.field3027 == var1.serverPacket) {
					var78 = var3.readBoolean();
					if (var78) {
						if (VarcInt.field1841 == null) {
							VarcInt.field1841 = new class326();
						}
					} else {
						VarcInt.field1841 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3054 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readUnsignedIntME();
					var6 = var3.readUnsignedIntIME();
					var60 = class127.getWidget(var6);
					ItemComposition var80;
					if (!var60.isIf3) {
						if (var20 == (-1)) {
							var60.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var80 = class19.ItemDefinition_get(var20);
						var60.modelType = 4;
						var60.modelId = var20;
						var60.modelAngleX = var80.xan2d;
						var60.modelAngleY = var80.yan2d;
						var60.modelZoom = (var80.zoom2d * 100) / var5;
						class346.invalidateWidget(var60);
					} else {
						var60.itemId = var20;
						var60.itemQuantity = var5;
						var80 = class19.ItemDefinition_get(var20);
						var60.modelAngleX = var80.xan2d;
						var60.modelAngleY = var80.yan2d;
						var60.modelAngleZ = var80.zan2d;
						var60.modelOffsetX = var80.offsetX2d;
						var60.modelOffsetY = var80.offsetY2d;
						var60.modelZoom = var80.zoom2d;
						if (var80.isStackable == 1) {
							var60.itemQuantityMode = 1;
						} else {
							var60.itemQuantityMode = 2;
						}

						if (var60.field3467 > 0) {
							var60.modelZoom = (var60.modelZoom * 32) / var60.field3467;
						} else if (var60.rawWidth > 0) {
							var60.modelZoom = (var60.modelZoom * 32) / var60.rawWidth;
						}

						class346.invalidateWidget(var60);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3102 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var6 = Tile.getGcDuration();
					PacketBufferNode var59 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2983, Client.packetWriter.isaacCipher);
					var59.packetBuffer.writeIntME(var20);
					var59.packetBuffer.writeIntLE(var5);
					var59.packetBuffer.writeByteSub(GameEngine.fps);
					var59.packetBuffer.writeByteSub(var6);
					packetWriter.addNode(var59);
					var1.serverPacket = null;
					return true;
				}

				Widget var73;
				if (ServerPacket.field3086 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var73 = class127.getWidget(var20);

					for (var6 = 0; var6 < var73.itemIds.length; ++var6) {
						var73.itemIds[var6] = -1;
						var73.itemIds[var6] = 0;
					}

					class346.invalidateWidget(var73);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3044 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < (-70000)) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var74 = class127.getWidget(var20);
					} else {
						var74 = null;
					}

					for (; var3.offset < var1.serverPacketLength; ChatChannel.itemContainerSetItem(var5, var22, var8 - 1, var61)) {
						var22 = var3.readUShortSmart();
						var8 = var3.readUnsignedShort();
						var61 = 0;
						if (var8 != 0) {
							var61 = var3.readUnsignedByte();
							if (var61 == 255) {
								var61 = var3.readInt();
							}
						}

						if (((var74 != null) && (var22 >= 0)) && (var22 < var74.itemIds.length)) {
							var74.itemIds[var22] = var8;
							var74.itemQuantities[var22] = var61;
						}
					}

					if (var74 != null) {
						class346.invalidateWidget(var74);
					}

					class143.method3072();
					changedItemContainers[((++field695) - 1) & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3095 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var73 = class127.getWidget(var20);
					var73.modelType = 3;
					var73.modelId = GrandExchangeEvents.localPlayer.appearance.getChatHeadId();
					class346.invalidateWidget(var73);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3092 == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var26 = ((long) (var3.readUnsignedShort()));
					var28 = ((long) (var3.readMedium()));
					PlayerType var37 = ((PlayerType) (MusicPatchPcmStream.findEnumerated(WorldMapManager.PlayerType_values(), var3.readUnsignedByte())));
					long var38 = (var26 << 32) + var28;
					boolean var76 = false;

					for (var13 = 0; var13 < 100; ++var13) {
						if (var38 == crossWorldMessageIds[var13]) {
							var76 = true;
							break;
						}
					}

					if (Decimator.friendSystem.isIgnored(new Username(var52, class122.loginType))) {
						var76 = true;
					}

					if ((!var76) && (field618 == 0)) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var38;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var32 = AbstractFont.escapeBrackets(MouseHandler.method584(class193.method3883(var3)));
						byte var92;
						if (var37.isPrivileged) {
							var92 = 7;
						} else {
							var92 = 3;
						}

						if (var37.modIcon != (-1)) {
							Actor.addGameMessage(var92, Script.method1990(var37.modIcon) + var52, var32);
						} else {
							Actor.addGameMessage(var92, var52, var32);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3117 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntIME();
					var74 = class127.getWidget(var5);
					if ((var74.modelType != 2) || (var20 != var74.modelId)) {
						var74.modelType = 2;
						var74.modelId = var20;
						class346.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3070 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var6 = var3.readUnsignedShortAddLE();
					if (var6 == 65535) {
						var6 = -1;
					}

					var22 = var3.readInt();

					for (var8 = var5; var8 <= var6; ++var8) {
						var30 = (((long) (var22)) << 32) + ((long) (var8));
						Node var93 = widgetFlags.get(var30);
						if (var93 != null) {
							var93.remove();
						}

						widgetFlags.put(new IntegerNode(var20), var30);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3041 == var1.serverPacket) {
					class29.field181 = var3.readUnsignedByteAdd();
					PlayerComposition.field3307 = var3.readUnsignedByteSub();

					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						class263 var71 = class114.method2662()[var20];
						ClanMate.method6700(var71);
					} 

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3109 == var1.serverPacket) {
					class426.method7546();
					var72 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var72 >= 0) {
							currentClanSettings[var72] = null;
						} else {
							class154.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var72 >= 0) {
						currentClanSettings[var72] = new ClanSettings(var3);
					} else {
						class154.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3089 == var1.serverPacket) {
					if (ClientPacket.friendsChat != null) {
						ClientPacket.friendsChat.method6661(var3);
					}

					SecureRandomCallable.method2050();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3046 == var1.serverPacket) {
					ClanMate.method6700(class263.field3008);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3069 == var1.serverPacket) {
					Decimator.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field701 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3098 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					var74 = class127.getWidget(var20);
					if ((var74.modelType != 1) || (var5 != var74.modelId)) {
						var74.modelType = 1;
						var74.modelId = var5;
						class346.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3034 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					rootInterface = var20;
					this.resizeRoot(false);
					class29.Widget_resetModelFrames(var20);
					class145.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field715[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3060 == var1.serverPacket) {
					Projectile.updatePlayers(var3, var1.serverPacketLength);
					class115.method2684();
					var1.serverPacket = null;
					return true;
				}

				String var41;
				if (ServerPacket.field3111 == var1.serverPacket) {
					var52 = var3.readStringCp1252NullTerminated();
					var26 = var3.readLong();
					var28 = ((long) (var3.readUnsignedShort()));
					var30 = ((long) (var3.readMedium()));
					PlayerType var40 = ((PlayerType) (MusicPatchPcmStream.findEnumerated(WorldMapManager.PlayerType_values(), var3.readUnsignedByte())));
					var35 = (var28 << 32) + var30;
					boolean var89 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var35) {
							var89 = true;
							break;
						}
					}

					if (var40.isUser && Decimator.friendSystem.isIgnored(new Username(var52, class122.loginType))) {
						var89 = true;
					}

					if ((!var89) && (field618 == 0)) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var35;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var41 = AbstractFont.escapeBrackets(MouseHandler.method584(class193.method3883(var3)));
						if (var40.modIcon != (-1)) {
							class301.addChatMessage(9, Script.method1990(var40.modIcon) + var52, var41, class82.base37DecodeLong(var26));
						} else {
							class301.addChatMessage(9, var52, var41, class82.base37DecodeLong(var26));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3047 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAdd();
					var6 = var3.readUnsignedShortAdd();
					var22 = var3.readUnsignedIntME();
					var25 = class127.getWidget(var22);
					if (((var6 != var25.modelAngleX) || (var5 != var25.modelAngleY)) || (var20 != var25.modelZoom)) {
						var25.modelAngleX = var6;
						var25.modelAngleY = var5;
						var25.modelZoom = var20;
						class346.invalidateWidget(var25);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3050 == var1.serverPacket) {
					class143.method3072();
					runEnergy = var3.readUnsignedByte();
					field707 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3105 == var1.serverPacket) {
					for (var20 = 0; var20 < Client.players.length; ++var20) {
						if (players[var20] != null) {
							players[var20].sequence = -1;
						}
					}

					for (var20 = 0; var20 < Client.npcs.length; ++var20) {
						if (npcs[var20] != null) {
							npcs[var20].sequence = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3038 == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShort() * 30;
					field707 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3023 == var1.serverPacket) {
					Decimator.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					KitDefinition.FriendSystem_invalidateIgnoreds();
					field701 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3078 == var1.serverPacket) {
					isCameraLocked = true;
					field754 = false;
					class154.field1691 = var3.readUnsignedByte();
					class67.field881 = var3.readUnsignedByte();
					DevicePcmPlayerProvider.field154 = var3.readUnsignedShort();
					NetFileRequest.field3960 = var3.readUnsignedByte();
					class386.field4337 = var3.readUnsignedByte();
					if (class386.field4337 >= 100) {
						var20 = (class154.field1691 * 128) + 64;
						var5 = (class67.field881 * 128) + 64;
						var6 = WorldMapLabel.getTileHeight(var20, var5, class18.Client_plane) - DevicePcmPlayerProvider.field154;
						var22 = var20 - WorldMapLabelSize.cameraX;
						var8 = var6 - ItemContainer.cameraY;
						var61 = var5 - class154.cameraZ;
						var62 = ((int) (Math.sqrt(((double) ((var22 * var22) + (var61 * var61))))));
						class147.cameraPitch = ((int) (Math.atan2(((double) (var8)), ((double) (var62))) * 325.9490051269531)) & 2047;
						class21.cameraYaw = ((int) (Math.atan2(((double) (var22)), ((double) (var61))) * (-325.9490051269531))) & 2047;
						if (class147.cameraPitch < 128) {
							class147.cameraPitch = 128;
						}

						if (class147.cameraPitch > 383) {
							class147.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3028 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					class16.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3035 == var1.serverPacket) {
					var78 = var3.readUnsignedByte() == 1;
					if (var78) {
						WorldMapID.field2388 = class136.method2931() - var3.readLong();
						class83.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class83.grandExchangeEvents = null;
					}

					field706 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3033 == var1.serverPacket) {
					StudioGame.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3100 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					Actor.queueSoundEffect(var20, var5, var6);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3088 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readInt();
					var6 = (var20 >> 10) & 31;
					var22 = (var20 >> 5) & 31;
					var8 = var20 & 31;
					var61 = ((var22 << 11) + (var6 << 19)) + (var8 << 3);
					Widget var90 = class127.getWidget(var5);
					if (var61 != var90.color) {
						var90.color = var61;
						class346.invalidateWidget(var90);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3076 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var20] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false);
					}

					field705 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3079 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					class78.method2081(var20);
					changedItemContainers[((++field695) - 1) & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3106 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var56 = var3.readUnsignedByte() == 1;
					var74 = class127.getWidget(var20);
					if (var56 != var74.isHidden) {
						var74.isHidden = var56;
						class346.invalidateWidget(var74);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3064 == var1.serverPacket) {
					ClanMate.method6700(class263.field3006);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3087 == var1.serverPacket) {
					StudioGame.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3053 == var1.serverPacket) {
					byte[] var51 = new byte[var1.serverPacketLength];
					var3.method7624(var51, 0, var51.length);
					Buffer var70 = new Buffer(var51);
					var23 = var70.readStringCp1252NullTerminated();
					class391.openURL(var23, true, false);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3125 == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedIntLE();
					var20 = var3.readUnsignedShort();
					Player var58;
					if (var20 == localPlayerIndex) {
						var58 = GrandExchangeEvents.localPlayer;
					} else {
						var58 = players[var20];
					}

					if (var58 != null) {
						var58.spotAnimation = var5;
						var58.spotAnimationHeight = var6 >> 16;
						var58.field1134 = (var6 & 65535) + cycle;
						var58.spotAnimationFrame = 0;
						var58.spotAnimationFrameCycle = 0;
						if (var58.field1134 > cycle) {
							var58.spotAnimationFrame = -1;
						}

						if (var58.spotAnimation == 65535) {
							var58.spotAnimation = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var16;
				if (ServerPacket.field3039 == var1.serverPacket) {
					var72 = var3.readByte();
					var21 = var3.readStringCp1252NullTerminated();
					long var42 = ((long) (var3.readUnsignedShort()));
					long var44 = ((long) (var3.readMedium()));
					PlayerType var34 = ((PlayerType) (MusicPatchPcmStream.findEnumerated(WorldMapManager.PlayerType_values(), var3.readUnsignedByte())));
					long var46 = (var42 << 32) + var44;
					boolean var65 = false;
					ClanChannel var14 = null;
					var14 = (var72 >= 0) ? currentClanChannels[var72] : class21.guestClanChannel;
					if (var14 == null) {
						var65 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var34.isUser && Decimator.friendSystem.isIgnored(new Username(var21, class122.loginType))) {
									var65 = true;
								}
								break;
							}

							if (crossWorldMessageIds[var15] == var46) {
								var65 = true;
								break;
							}

							++var15;
						} 
					}

					if (!var65) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var46;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var41 = AbstractFont.escapeBrackets(class193.method3883(var3));
						var16 = (var72 >= 0) ? 41 : 44;
						if (var34.modIcon != (-1)) {
							class301.addChatMessage(var16, Script.method1990(var34.modIcon) + var21, var41, var14.name);
						} else {
							class301.addChatMessage(var16, var21, var41, var14.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3056 == var1.serverPacket) {
					ItemLayer.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3029 == var1.serverPacket) {
					field755 = cycleCntr;
					var72 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var72 >= 0) {
							currentClanChannels[var72] = null;
						} else {
							class21.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var72 >= 0) {
						currentClanChannels[var72] = new ClanChannel(var3);
					} else {
						class21.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3049 == var1.serverPacket) {
					if (HorizontalAlignment.field1885 == null) {
						HorizontalAlignment.field1885 = new class391(DirectByteArrayCopier.HitSplatDefinition_cached);
					}

					class445 var50 = DirectByteArrayCopier.HitSplatDefinition_cached.method7115(var3);
					HorizontalAlignment.field1885.field4373.vmethod7464(var50.field4683, var50.field4681);
					field698[((++field699) - 1) & 31] = var50.field4683;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3072 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					byte var55 = var3.readByteAdd();
					Varps.Varps_temp[var20] = var55;
					if (Varps.Varps_main[var20] != var55) {
						Varps.Varps_main[var20] = var55;
					}

					WorldMapLabel.changeGameOptions(var20);
					changedVarps[((++changedVarpCount) - 1) & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3124 == var1.serverPacket) {
					var5 = var3.readUnsignedIntIME();
					var6 = var3.readUnsignedShortAdd();
					var20 = var3.readUnsignedShortLE();
					var57 = npcs[var20];
					if (var57 != null) {
						var57.spotAnimation = var6;
						var57.spotAnimationHeight = var5 >> 16;
						var57.field1134 = (var5 & 65535) + cycle;
						var57.spotAnimationFrame = 0;
						var57.spotAnimationFrameCycle = 0;
						if (var57.field1134 > cycle) {
							var57.spotAnimationFrame = -1;
						}

						if (var57.spotAnimation == 65535) {
							var57.spotAnimation = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3084 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						DefaultsGroup.method6936(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3099 == var1.serverPacket) {
					WorldMapSection1.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3126 == var1.serverPacket) {
					int var18 = var3.readUnsignedByte();
					var16 = var3.readUnsignedShortAddLE();
					var6 = var3.method7793();
					var20 = var6 >> 16;
					var5 = (var6 >> 8) & 255;
					var22 = var20 + ((var6 >> 4) & 7);
					var8 = var5 + (var6 & 7);
					byte var9 = var3.readByte();
					var24 = var3.readUnsignedShortAddLE();
					var13 = var3.readUnsignedByteAdd() * 4;
					byte var10 = var3.readByteAdd();
					var15 = var3.readUnsignedShortLE();
					int var17 = var3.readUnsignedByte();
					var33 = var3.readUnsignedByteSub() * 4;
					var11 = var3.method7716();
					var61 = var9 + var22;
					var62 = var10 + var8;
					if (((((((((var22 >= 0) && (var8 >= 0)) && (var22 < 104)) && (var8 < 104)) && (var61 >= 0)) && (var62 >= 0)) && (var61 < 104)) && (var62 < 104)) && (var24 != 65535)) {
						var22 = (var22 * 128) + 64;
						var8 = (var8 * 128) + 64;
						var61 = (var61 * 128) + 64;
						var62 = (var62 * 128) + 64;
						Projectile var19 = new Projectile(var24, class18.Client_plane, var22, var8, WorldMapLabel.getTileHeight(var22, var8, class18.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var33);
						var19.setDestination(var61, var62, WorldMapLabel.getTileHeight(var61, var62, class18.Client_plane) - var33, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3118 == var1.serverPacket) {
					class143.method3072();
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedByteNeg();
					var6 = var3.readUnsignedIntME();
					experience[var5] = var6;
					currentLevels[var5] = var20;
					levels[var5] = 1;

					for (var22 = 0; var22 < 98; ++var22) {
						if (var6 >= Skills.Skills_experienceTable[var22]) {
							levels[var5] = var22 + 2;
						}
					}

					changedSkills[((++changedSkillsCount) - 1) & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if ((ServerPacket.field3059 == var1.serverPacket) && isCameraLocked) {
					field754 = true;
					Script.field955 = var3.readUnsignedByte();
					ArchiveDisk.field4309 = var3.readUnsignedByte();
					NetFileRequest.field3960 = var3.readUnsignedByte();
					class386.field4337 = var3.readUnsignedByte();

					for (var20 = 0; var20 < 5; ++var20) {
						field546[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3103 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readInt();
					var6 = var3.readUnsignedShortAddLE();
					var7 = ((InterfaceParent) (interfaceParents.get(((long) (var5)))));
					if (var7 != null) {
						Script.closeInterface(var7, var6 != var7.group);
					}

					class4.method16(var5, var6, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3115 == var1.serverPacket) {
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

				Widget.RunException_sendStackTrace((((((("" + (var1.serverPacket != null ? (var1.serverPacket.id * (-1948146481)) * 766304815 : -1)) + ",") + (var1.field1325 != null ? (var1.field1325.id * (-1948146481)) * 766304815 : -1)) + ",") + (var1.field1313 != null ? (var1.field1313.id * (-1948146481)) * 766304815 : -1)) + ",") + var1.serverPacketLength, ((Throwable) (null)));
				ItemLayer.logOut();
			} catch (IOException var48) {
				ClanChannelMember.method2868();
			} catch (Exception var49) {
				var21 = ((((((((((("" + (var1.serverPacket != null ? (var1.serverPacket.id * (-1948146481)) * 766304815 : -1)) + ",") + (var1.field1325 != null ? (var1.field1325.id * (-1948146481)) * 766304815 : -1)) + ",") + (var1.field1313 != null ? (var1.field1313.id * (-1948146481)) * 766304815 : -1)) + ",") + var1.serverPacketLength) + ",") + (GrandExchangeEvents.localPlayer.pathX[0] + GrandExchangeOfferOwnWorldComparator.baseX)) + ",") + (GrandExchangeEvents.localPlayer.pathY[0] + VarcInt.baseY)) + ",";

				for (var6 = 0; (var6 < var1.serverPacketLength) && (var6 < 50); ++var6) {
					var21 = (var21 + var3.array[var6]) + ",";
				}

				Widget.RunException_sendStackTrace(var21, var49);
				ItemLayer.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"117")

	@Export("menu")
	final void menu() {
		GrandExchangeOfferTotalQuantityComparator.incrementMenuEntries();
		if (class142.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var1 = MouseHandler.MouseHandler_lastButton;
				int var2;
				int var3;
				int var4;
				int var5;
				int var14;
				if (isMenuOpen) {
					if ((var1 != 1) && (GameBuild.mouseCam || (var1 != 4))) {
						var2 = MouseHandler.MouseHandler_x;
						var3 = MouseHandler.MouseHandler_y;
						if ((((var2 < (class138.menuX - 10)) || (var2 > ((class138.menuX + ItemComposition.menuWidth) + 10))) || (var3 < (class1.menuY - 10))) || (var3 > ((class1.menuY + ByteArrayPool.menuHeight) + 10))) {
							isMenuOpen = false;
							HealthBar.method2330(class138.menuX, class1.menuY, ItemComposition.menuWidth, ByteArrayPool.menuHeight);
						}
					}

					if ((var1 == 1) || ((!GameBuild.mouseCam) && (var1 == 4))) {
						var2 = class138.menuX;
						var3 = class1.menuY;
						var4 = ItemComposition.menuWidth;
						var5 = MouseHandler.MouseHandler_lastPressedX;
						var14 = MouseHandler.MouseHandler_lastPressedY;
						int var15 = -1;

						int var9;
						int var16;
						for (var16 = 0; var16 < menuOptionsCount; ++var16) {
							var9 = ((((menuOptionsCount - 1) - var16) * 15) + var3) + 31;
							if ((((var5 > var2) && (var5 < (var4 + var2))) && (var14 > (var9 - 13))) && (var14 < (var9 + 3))) {
								var15 = var16;
							}
						}

						if ((var15 != (-1)) && (var15 >= 0)) {
							var16 = menuArguments1[var15];
							var9 = menuArguments2[var15];
							int var10 = menuOpcodes[var15];
							int var11 = menuIdentifiers[var15];
							String var12 = menuActions[var15];
							String var13 = menuTargets[var15];
							class9.menuAction(var16, var9, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}

						isMenuOpen = false;
						HealthBar.method2330(class138.menuX, class1.menuY, ItemComposition.menuWidth, ByteArrayPool.menuHeight);
					}
				} else {
					var2 = GameBuild.method5773();
					if (((var1 == 1) || ((!GameBuild.mouseCam) && (var1 == 4))) && (var2 >= 0)) {
						var3 = menuOpcodes[var2];
						if ((((((((((((var3 == 39) || (var3 == 40)) || (var3 == 41)) || (var3 == 42)) || (var3 == 43)) || (var3 == 33)) || (var3 == 34)) || (var3 == 35)) || (var3 == 36)) || (var3 == 37)) || (var3 == 38)) || (var3 == 1005)) {
							var4 = menuArguments1[var2];
							var5 = menuArguments2[var2];
							Widget var6 = class127.getWidget(var5);
							if (FriendSystem.method1698(class326.getWidgetFlags(var6)) || ReflectionCheck.method1079(class326.getWidgetFlags(var6))) {
								if ((((class142.dragInventoryWidget != null) && (!field767)) && (menuOptionsCount > 0)) && (!this.shouldLeftClickOpenMenu())) {
									UrlRequest.method2551(draggedWidgetX, draggedWidgetY);
								}

								field767 = false;
								itemDragDuration = 0;
								if (class142.dragInventoryWidget != null) {
									class346.invalidateWidget(class142.dragInventoryWidget);
								}

								class142.dragInventoryWidget = class127.getWidget(var5);
								dragItemSlotSource = var4;
								draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
								draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
								if (var2 >= 0) {
									Interpreter.tempMenuAction = new MenuAction();
									Interpreter.tempMenuAction.param0 = menuArguments1[var2];
									Interpreter.tempMenuAction.param1 = menuArguments2[var2];
									Interpreter.tempMenuAction.opcode = menuOpcodes[var2];
									Interpreter.tempMenuAction.identifier = menuIdentifiers[var2];
									Interpreter.tempMenuAction.action = menuActions[var2];
								}

								class346.invalidateWidget(class142.dragInventoryWidget);
								return;
							}
						}
					}

					if (((var1 == 1) || ((!GameBuild.mouseCam) && (var1 == 4))) && this.shouldLeftClickOpenMenu()) {
						var1 = 2;
					}

					if ((((var1 == 1) || ((!GameBuild.mouseCam) && (var1 == 4))) && (menuOptionsCount > 0)) && (var2 >= 0)) {
						var3 = menuArguments1[var2];
						var4 = menuArguments2[var2];
						var5 = menuOpcodes[var2];
						var14 = menuIdentifiers[var2];
						String var7 = menuActions[var2];
						String var8 = menuTargets[var2];
						class9.menuAction(var3, var4, var5, var14, var7, var8, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}

					if ((var1 == 2) && (menuOptionsCount > 0)) {
						this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
					}
				}

			}
		}
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"26")

	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = GameBuild.method5773();
		return (((leftClickOpensMenu == 1) && (menuOptionsCount > 2)) || SoundCache.method781(var1)) && (!menuShiftClick[var1]);
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(descriptor = 
	"(IIB)V", garbageValue = 
	"39")

	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = RouteStrategy.fontBold12.stringWidth("Choose Option");

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) {
			var5 = RouteStrategy.fontBold12.stringWidth(AbstractUserComparator.method6736(var4));
			if (var5 > var3) {
				var3 = var5;
			}
		}

		var3 += 8;
		var4 = (menuOptionsCount * 15) + 22;
		var5 = var1 - (var3 / 2);
		if ((var5 + var3) > InvDefinition.canvasWidth) {
			var5 = InvDefinition.canvasWidth - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		int var6 = var2;
		if ((var4 + var2) > class321.canvasHeight) {
			var6 = class321.canvasHeight - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		class138.menuX = var5;
		class1.menuY = var6;
		ItemComposition.menuWidth = var3;
		ByteArrayPool.menuHeight = (menuOptionsCount * 15) + 22;
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		ArchiveLoader.scene.menuOpen(class18.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"982244774")

	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface;
		int var3 = InvDefinition.canvasWidth;
		int var4 = class321.canvasHeight;
		if (class155.loadInterface(var2)) {
			ModelData0.resizeInterface(Widget.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}

	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(descriptor = 
	"(Lky;I)V", garbageValue = 
	"-2147483648")

	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = (var1.parentId == (-1)) ? null : class127.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = InvDefinition.canvasWidth;
			var4 = class321.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		ApproximateRouteStrategy.alignWidgetSize(var1, var3, var4, false);
		HealthBarUpdate.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-20")

	final void method1164() {
		class346.invalidateWidget(clickedWidget);
		++class124.widgetDragDuration;
		if (field687 && field696) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field773) {
				var1 = field773;
			}

			if ((var1 + Client.clickedWidget.width) > (field773 + Client.clickedWidgetParent.width)) {
				var1 = (field773 + Client.clickedWidgetParent.width) - Client.clickedWidget.width;
			}

			if (var2 < field686) {
				var2 = field686;
			}

			if ((var2 + Client.clickedWidget.height) > (field686 + Client.clickedWidgetParent.height)) {
				var2 = (field686 + Client.clickedWidgetParent.height) - Client.clickedWidget.height;
			}

			int var3 = var1 - field688;
			int var4 = var2 - field757;
			int var5 = Client.clickedWidget.dragZoneSize;
			if ((class124.widgetDragDuration > Client.clickedWidget.dragThreshold) && ((((var3 > var5) || (var3 < (-var5))) || (var4 > var5)) || (var4 < (-var5)))) {
				isDraggingWidget = true;
			}

			int var6 = (var1 - field773) + Client.clickedWidgetParent.scrollX;
			int var7 = (var2 - field686) + Client.clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if ((Client.clickedWidget.onDrag != null) && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = Client.clickedWidget.onDrag;
				ClanSettings.runScriptEvent(var8);
			}

			if (MouseHandler.MouseHandler_currentButton == 0) {
				if (isDraggingWidget) {
					if (Client.clickedWidget.onDragComplete != null) {
						var8 = new ScriptEvent();
						var8.widget = clickedWidget;
						var8.mouseX = var6;
						var8.mouseY = var7;
						var8.dragTarget = draggedOnWidget;
						var8.args = Client.clickedWidget.onDragComplete;
						ClanSettings.runScriptEvent(var8);
					}

					if (draggedOnWidget != null) {
						Widget var9 = clickedWidget;
						int var10 = Players.method2420(class326.getWidgetFlags(var9));
						Widget var13;
						if (var10 == 0) {
							var13 = null;
						} else {
							int var11 = 0;

							while (true) {
								if (var11 >= var10) {
									var13 = var9;
									break;
								}

								var9 = class127.getWidget(var9.parentId);
								if (var9 == null) {
									var13 = null;
									break;
								}

								++var11;
							} 
						}

						if (var13 != null) {
							PacketBufferNode var12 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2919, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeIntME(Client.clickedWidget.id);
							var12.packetBuffer.writeShort(Client.clickedWidget.childIndex);
							var12.packetBuffer.writeShortAdd(Client.clickedWidget.itemId);
							var12.packetBuffer.writeShort(Client.draggedOnWidget.childIndex);
							var12.packetBuffer.writeShortAddLE(Client.draggedOnWidget.itemId);
							var12.packetBuffer.writeIntME(Client.draggedOnWidget.id);
							packetWriter.addNode(var12);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(widgetClickX + field688, widgetClickY + field757);
				} else if (menuOptionsCount > 0) {
					UrlRequest.method2551(widgetClickX + field688, widgetClickY + field757);
				}

				clickedWidget = null;
			}

		} else 
		if (class124.widgetDragDuration > 1) {
			if ((!isDraggingWidget) && (menuOptionsCount > 0)) {
				UrlRequest.method2551(widgetClickX + field688, field757 + widgetClickY);
			}

			clickedWidget = null;
		}


	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(descriptor = 
	"(I)Lqb;", garbageValue = 
	"529633925")

	@Export("username")
	public Username username() {
		return GrandExchangeEvents.localPlayer != null ? GrandExchangeEvents.localPlayer.username : null;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				for (int var1 = 0; var1 <= 27; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch (var1) {
							case 1 :
								useBufferedSocket = Integer.parseInt(var2) != 0;
							case 2 :
							case 13 :
							case 16 :
							case 18 :
							case 19 :
							case 20 :
							default :
								break;
							case 3 :
								if (var2.equalsIgnoreCase("true")) {
									isMembersWorld = true;
								} else {
									isMembersWorld = false;
								}
								break;
							case 4 :
								if (clientType == (-1)) {
									clientType = Integer.parseInt(var2);
								}
								break;
							case 5 :
								worldProperties = Integer.parseInt(var2);
								break;
							case 6 :
								Skills.clientLanguage = Language.method6077(Integer.parseInt(var2));
								break;
							case 7 :
								class301.field3545 = KeyHandler.method332(Integer.parseInt(var2));
								break;
							case 8 :
								if (var2.equalsIgnoreCase("true")) {
								}
								break;
							case 9 :
								class65.field868 = var2;
								break;
							case 10 :
								Messages.field1305 = ((StudioGame) (MusicPatchPcmStream.findEnumerated(Message.method1116(), Integer.parseInt(var2))));
								if (StudioGame.oldscape == Messages.field1305) {
									class122.loginType = LoginType.oldscape;
								} else {
									class122.loginType = LoginType.field4555;
								}
								break;
							case 11 :
								class113.field1372 = var2;
								break;
							case 12 :
								worldId = Integer.parseInt(var2);
								break;
							case 14 :
								GrandExchangeOfferOwnWorldComparator.field483 = Integer.parseInt(var2);
								break;
							case 15 :
								gameBuild = Integer.parseInt(var2);
								break;
							case 17 :
								WorldMapElement.field1836 = var2;
								break;
							case 21 :
								field617 = Integer.parseInt(var2);
								break;
							case 22 :
								field553 = Integer.parseInt(var2) != 0;}

					}
				}

				Scene.Scene_isLowDetail = false;
				isLowDetail = false;
				class17.worldHost = this.getCodeBase().getHost();
				String var4 = class301.field3545.name;
				byte var5 = 0;

				try {
					FloorOverlayDefinition.method3788("oldschool", var4, var5, 21);
				} catch (Exception var6) {
					Widget.RunException_sendStackTrace(((String) (null)), var6);
				}

				class127.client = this;
				WorldMapRegion.clientType = clientType;
				if (field498 == (-1)) {
					field498 = 0;
				}

				class360.field4209 = System.getenv("JX_ACCESS_TOKEN");
				System.getenv("JX_REFRESH_TOKEN");
				this.startThread(765, 503, 204);
			}
		} catch (RuntimeException var7) {
			throw MilliClock.newRunException(var7, "client.init(" + ')');
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.field542;
	}

	@ObfuscatedSignature(descriptor = 
	"(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V")

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field536 = var1;
			Ignored.method6828(10);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(B)[Lkr;", garbageValue = 
	"1")

	public static class309[] method1633() {
		return new class309[]{ class309.field3913, class309.field3911, class309.field3914, class309.field3915 };
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"37")

	@Export("getWindowedMode")
	static int getWindowedMode() {
		return isResizable ? 2 : 1;
	}
}