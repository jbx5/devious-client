import com.jagex.oldscape.pub.OtlTokenRequester;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed , OAuthApi {
	@ObfuscatedName("rc")
	@ObfuscatedSignature(descriptor = "[Lez;")
	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;

	@ObfuscatedName("sw")
	@Export("playingJingle")
	static boolean playingJingle;

	@ObfuscatedName("vh")
	@ObfuscatedGetter(intValue = 310105341)
	public static int field773;

	@ObfuscatedName("uw")
	@ObfuscatedGetter(intValue = 1093086377)
	@Export("viewportOffsetX")
	static int viewportOffsetX;

	@ObfuscatedName("ut")
	@ObfuscatedGetter(intValue = -32672707)
	@Export("viewportOffsetY")
	static int viewportOffsetY;

	@ObfuscatedName("vs")
	@ObfuscatedSignature(descriptor = "Lbf;")
	static final ApproximateRouteStrategy field777;

	@ObfuscatedName("ss")
	@ObfuscatedGetter(intValue = 285575435)
	@Export("destinationX")
	static int destinationX;

	@ObfuscatedName("sh")
	@ObfuscatedGetter(intValue = -836761901)
	@Export("destinationY")
	static int destinationY;

	@ObfuscatedName("vg")
	static int[] field778;

	@ObfuscatedName("vw")
	static int[] field779;

	@ObfuscatedName("sa")
	@ObfuscatedGetter(intValue = -1930673701)
	@Export("currentTrackGroupId")
	static int currentTrackGroupId;

	@ObfuscatedName("vb")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;

	@ObfuscatedName("vn")
	@ObfuscatedGetter(intValue = -989946301)
	@Export("archiveLoadersDone")
	static int archiveLoadersDone;

	@ObfuscatedName("uf")
	@ObfuscatedGetter(intValue = 1080233945)
	static int field765;

	@ObfuscatedName("uv")
	@ObfuscatedSignature(descriptor = "Lko;")
	@Export("playerAppearance")
	static PlayerComposition playerAppearance;

	@ObfuscatedName("ue")
	@ObfuscatedGetter(intValue = -1882507051)
	static int field627;

	@ObfuscatedName("sd")
	@ObfuscatedGetter(intValue = 1897653291)
	@Export("soundEffectCount")
	static int soundEffectCount;

	@ObfuscatedName("sg")
	@Export("soundEffectIds")
	static int[] soundEffectIds;

	@ObfuscatedName("rq")
	@ObfuscatedSignature(descriptor = "[Ley;")
	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;

	@ObfuscatedName("sq")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;

	@ObfuscatedName("rk")
	static long[] crossWorldMessageIds;

	@ObfuscatedName("sx")
	@Export("isCameraLocked")
	static boolean isCameraLocked;

	@ObfuscatedName("rh")
	@ObfuscatedGetter(intValue = -140035135)
	static int crossWorldMessageIdsIndex;

	@ObfuscatedName("sn")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;

	@ObfuscatedName("ty")
	static boolean[] field678;

	@ObfuscatedName("sb")
	@ObfuscatedGetter(intValue = -1085635401)
	@Export("minimapState")
	static int minimapState;

	@ObfuscatedName("sm")
	@ObfuscatedSignature(descriptor = "[Lac;")
	@Export("soundEffects")
	static SoundEffect[] soundEffects;

	@ObfuscatedName("so")
	@Export("soundLocations")
	static int[] soundLocations;

	@ObfuscatedName("uj")
	@ObfuscatedSignature(descriptor = "Loh;")
	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;

	@ObfuscatedName("ud")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("DBTableIndex_cache")
	static EvictingDualNodeHashTable DBTableIndex_cache;

	@ObfuscatedName("ug")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("DBTableMasterIndex_cache")
	static EvictingDualNodeHashTable DBTableMasterIndex_cache;

	@ObfuscatedName("ra")
	@ObfuscatedGetter(intValue = -340081923)
	static int field518;

	@ObfuscatedName("ta")
	static short field644;

	@ObfuscatedName("tg")
	static short field695;

	@ObfuscatedName("uy")
	static short field757;

	@ObfuscatedName("ub")
	static short field567;

	@ObfuscatedName("uk")
	static short field756;

	@ObfuscatedName("uu")
	@ObfuscatedGetter(intValue = -207740787)
	@Export("viewportZoom")
	static int viewportZoom;

	@ObfuscatedName("tb")
	static short field677;

	@ObfuscatedName("uq")
	@ObfuscatedGetter(intValue = 1908225021)
	@Export("viewportWidth")
	static int viewportWidth;

	@ObfuscatedName("rn")
	@ObfuscatedGetter(intValue = -267205637)
	@Export("mapIconCount")
	static int mapIconCount;

	@ObfuscatedName("us")
	@ObfuscatedSignature(descriptor = "[Llh;")
	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;

	@ObfuscatedName("rd")
	@Export("mapIconXs")
	static int[] mapIconXs;

	@ObfuscatedName("rx")
	@Export("mapIconYs")
	static int[] mapIconYs;

	@ObfuscatedName("tc")
	static boolean field745;

	@ObfuscatedName("rv")
	@ObfuscatedGetter(longValue = -3598197458423428557L)
	static long field725;

	@ObfuscatedName("rz")
	@ObfuscatedSignature(descriptor = "[Lqj;")
	@Export("mapIcons")
	static SpritePixels[] mapIcons;

	@ObfuscatedName("uo")
	@ObfuscatedGetter(intValue = 1106565235)
	@Export("viewportHeight")
	static int viewportHeight;

	@ObfuscatedName("vx")
	@ObfuscatedGetter(intValue = 680304633)
	static int field630;

	@ObfuscatedName("re")
	@ObfuscatedGetter(intValue = 1156791999)
	static int field722;

	@ObfuscatedName("tk")
	static int[] field654;

	@ObfuscatedName("tv")
	@Export("zoomHeight")
	static short zoomHeight;

	@ObfuscatedName("td")
	@Export("zoomWidth")
	static short zoomWidth;

	@ObfuscatedName("rp")
	static int[] field724;

	@ObfuscatedName("ro")
	static int[] field626;

	@ObfuscatedName("ru")
	@ObfuscatedGetter(intValue = 16815395)
	@Export("publicChatMode")
	static int publicChatMode;

	@ObfuscatedName("rt")
	@ObfuscatedGetter(intValue = -411679803)
	@Export("tradeChatMode")
	static int tradeChatMode;

	@ObfuscatedName("to")
	static int[] field747;

	@ObfuscatedName("tw")
	static int[] field749;

	@ObfuscatedName("te")
	static int[] field653;

	@ObfuscatedName("rm")
	static String field719;

	@ObfuscatedName("ul")
	@ObfuscatedSignature(descriptor = "Lbu;")
	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;

	@ObfuscatedName("up")
	@ObfuscatedGetter(intValue = 848328459)
	static int field772;

	@ObfuscatedName("rf")
	static int[] field555;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "[Lgr;")
	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;

	@ObfuscatedName("az")
	static boolean field510 = true;

	@ObfuscatedName("bz")
	@ObfuscatedGetter(intValue = -407247497)
	@Export("worldId")
	public static int worldId = 1;

	@ObfuscatedName("bs")
	@ObfuscatedGetter(intValue = 1534154533)
	@Export("worldProperties")
	static int worldProperties = 0;

	@ObfuscatedName("bv")
	@ObfuscatedGetter(intValue = 219384257)
	@Export("gameBuild")
	static int gameBuild = 0;

	@ObfuscatedName("bf")
	@Export("isMembersWorld")
	public static boolean isMembersWorld = false;

	@ObfuscatedName("bu")
	@Export("isLowDetail")
	static boolean isLowDetail = false;

	@ObfuscatedName("bp")
	@ObfuscatedGetter(intValue = 1288240551)
	static int field504 = -1;

	@ObfuscatedName("br")
	@ObfuscatedGetter(intValue = -389910515)
	@Export("clientType")
	static int clientType = -1;

	@ObfuscatedName("be")
	@ObfuscatedGetter(intValue = 853577439)
	static int field489 = -1;

	@ObfuscatedName("bx")
	@Export("onMobile")
	static boolean onMobile = false;

	@ObfuscatedName("cd")
	@ObfuscatedGetter(intValue = -170822283)
	@Export("gameState")
	static int gameState = 0;

	@ObfuscatedName("cf")
	@Export("isLoading")
	static boolean isLoading = true;

	@ObfuscatedName("dz")
	@ObfuscatedGetter(intValue = 95361837)
	@Export("cycle")
	static int cycle = 0;

	@ObfuscatedName("dc")
	@ObfuscatedGetter(longValue = 8116000310809479845L)
	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis = 1L;

	@ObfuscatedName("dt")
	@ObfuscatedGetter(intValue = 1220062861)
	static int field548 = -1;

	@ObfuscatedName("dw")
	@ObfuscatedGetter(intValue = 2140270859)
	static int field497 = -1;

	@ObfuscatedName("dm")
	@ObfuscatedGetter(longValue = 4071531815298312627L)
	static long field723 = -1L;

	@ObfuscatedName("da")
	@Export("hadFocus")
	static boolean hadFocus = true;

	@ObfuscatedName("dr")
	@ObfuscatedGetter(intValue = -1803255089)
	@Export("rebootTimer")
	static int rebootTimer = 0;

	@ObfuscatedName("db")
	@ObfuscatedGetter(intValue = -1045183031)
	@Export("hintArrowType")
	static int hintArrowType = 0;

	@ObfuscatedName("dd")
	@ObfuscatedGetter(intValue = 524187045)
	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex = 0;

	@ObfuscatedName("du")
	@ObfuscatedGetter(intValue = -292720363)
	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex = 0;

	@ObfuscatedName("do")
	@ObfuscatedGetter(intValue = -155030709)
	@Export("hintArrowX")
	static int hintArrowX = 0;

	@ObfuscatedName("dy")
	@ObfuscatedGetter(intValue = -2117523373)
	@Export("hintArrowY")
	static int hintArrowY = 0;

	@ObfuscatedName("dp")
	@ObfuscatedGetter(intValue = 1392041916)
	@Export("hintArrowHeight")
	static int hintArrowHeight = 0;

	@ObfuscatedName("dk")
	@ObfuscatedGetter(intValue = 91830208)
	@Export("hintArrowSubX")
	static int hintArrowSubX = 0;

	@ObfuscatedName("dg")
	@ObfuscatedGetter(intValue = 770359488)
	@Export("hintArrowSubY")
	static int hintArrowSubY = 0;

	@ObfuscatedName("dx")
	@ObfuscatedSignature(descriptor = "Lcl;")
	@Export("playerAttackOption")
	static AttackOption playerAttackOption;

	@ObfuscatedName("dj")
	@ObfuscatedSignature(descriptor = "Lcl;")
	@Export("npcAttackOption")
	static AttackOption npcAttackOption;

	@ObfuscatedName("ds")
	@ObfuscatedGetter(intValue = -1534163991)
	@Export("titleLoadingStage")
	static int titleLoadingStage;

	@ObfuscatedName("em")
	@ObfuscatedGetter(intValue = -2136359077)
	@Export("js5ConnectState")
	static int js5ConnectState;

	@ObfuscatedName("ec")
	@ObfuscatedGetter(intValue = 1272298597)
	static int field513;

	@ObfuscatedName("eg")
	@ObfuscatedGetter(intValue = -1011736325)
	@Export("js5Errors")
	static int js5Errors;

	@ObfuscatedName("ff")
	@ObfuscatedGetter(intValue = -589095715)
	@Export("loginState")
	static int loginState;

	@ObfuscatedName("fm")
	@ObfuscatedGetter(intValue = -1981022037)
	static int field516;

	@ObfuscatedName("ft")
	@ObfuscatedGetter(intValue = 794782465)
	static int field766;

	@ObfuscatedName("fv")
	@ObfuscatedGetter(intValue = -352394441)
	static int field711;

	@ObfuscatedName("fk")
	@ObfuscatedSignature(descriptor = "Ldf;")
	static class124 field645;

	@ObfuscatedName("fu")
	@ObfuscatedSignature(descriptor = "Lqp;")
	static class447 field741;

	@ObfuscatedName("fc")
	static final String field530;

	@ObfuscatedName("gs")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;

	@ObfuscatedName("gc")
	@ObfuscatedSignature(descriptor = "Lbh;")
	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;

	@ObfuscatedName("gh")
	static int[] field618;

	@ObfuscatedName("gw")
	@Export("randomDatData")
	static byte[] randomDatData;

	@ObfuscatedName("gt")
	@ObfuscatedSignature(descriptor = "[Lco;")
	@Export("npcs")
	static NPC[] npcs;

	@ObfuscatedName("gu")
	@ObfuscatedGetter(intValue = 474545801)
	@Export("npcCount")
	static int npcCount;

	@ObfuscatedName("gj")
	@Export("npcIndices")
	static int[] npcIndices;

	@ObfuscatedName("gn")
	@ObfuscatedGetter(intValue = -1416829447)
	static int field541;

	@ObfuscatedName("go")
	static int[] field729;

	@ObfuscatedName("gz")
	@ObfuscatedSignature(descriptor = "Lcx;")
	@Export("packetWriter")
	public static final PacketWriter packetWriter;

	@ObfuscatedName("hm")
	@ObfuscatedGetter(intValue = 1467768851)
	@Export("logoutTimer")
	static int logoutTimer;

	@ObfuscatedName("hk")
	@Export("hadNetworkError")
	static boolean hadNetworkError;

	@ObfuscatedName("hd")
	@ObfuscatedSignature(descriptor = "Lmm;")
	@Export("timer")
	static Timer timer;

	@ObfuscatedName("hs")
	@Export("fontsMap")
	static HashMap fontsMap;

	@ObfuscatedName("hj")
	@ObfuscatedGetter(intValue = -1945642975)
	static int field613;

	@ObfuscatedName("hw")
	@ObfuscatedGetter(intValue = -1806455793)
	static int field774;

	@ObfuscatedName("hp")
	@ObfuscatedGetter(intValue = 1608610259)
	static int field609;

	@ObfuscatedName("ha")
	@ObfuscatedGetter(intValue = -1666612595)
	static int field551;

	@ObfuscatedName("hc")
	@ObfuscatedGetter(intValue = 749368111)
	static int field552;

	@ObfuscatedName("ik")
	@Export("isInInstance")
	static boolean isInInstance;

	@ObfuscatedName("ic")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;

	@ObfuscatedName("iy")
	static final int[] field556;

	@ObfuscatedName("ip")
	@ObfuscatedGetter(intValue = 798180175)
	static int field744;

	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;

	@ObfuscatedName("iu")
	@ObfuscatedGetter(intValue = -553978885)
	static int field557;

	@ObfuscatedName("ia")
	@ObfuscatedGetter(intValue = -1569810719)
	static int field559;

	@ObfuscatedName("if")
	@ObfuscatedGetter(intValue = -1876170783)
	static int field560;

	@ObfuscatedName("iq")
	@ObfuscatedGetter(intValue = -298710163)
	static int field561;

	@ObfuscatedName("is")
	static boolean field562;

	@ObfuscatedName("jd")
	@ObfuscatedGetter(intValue = -1693889789)
	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;

	@ObfuscatedName("jt")
	@ObfuscatedGetter(intValue = 1755328015)
	@Export("camAngleX")
	static int camAngleX;

	@ObfuscatedName("jc")
	@ObfuscatedGetter(intValue = 1649127917)
	@Export("camAngleY")
	static int camAngleY;

	@ObfuscatedName("jl")
	@ObfuscatedGetter(intValue = 1012965049)
	@Export("camAngleDY")
	static int camAngleDY;

	@ObfuscatedName("js")
	@ObfuscatedGetter(intValue = 1920648657)
	@Export("camAngleDX")
	static int camAngleDX;

	@ObfuscatedName("jb")
	@ObfuscatedGetter(intValue = 1738160867)
	@Export("mouseCamClickedX")
	static int mouseCamClickedX;

	@ObfuscatedName("jy")
	@ObfuscatedGetter(intValue = 1943640979)
	@Export("mouseCamClickedY")
	static int mouseCamClickedY;

	@ObfuscatedName("jv")
	@ObfuscatedGetter(intValue = 415079439)
	@Export("oculusOrbState")
	static int oculusOrbState;

	@ObfuscatedName("je")
	@ObfuscatedGetter(intValue = 1716463733)
	@Export("camFollowHeight")
	static int camFollowHeight;

	@ObfuscatedName("jf")
	@ObfuscatedGetter(intValue = 779601763)
	static int field572;

	@ObfuscatedName("ju")
	@ObfuscatedGetter(intValue = -1989360651)
	static int field573;

	@ObfuscatedName("ja")
	@ObfuscatedGetter(intValue = -2127582263)
	static int field574;

	@ObfuscatedName("jp")
	@ObfuscatedGetter(intValue = 1796939455)
	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;

	@ObfuscatedName("jw")
	@ObfuscatedGetter(intValue = -28845409)
	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;

	@ObfuscatedName("jq")
	@ObfuscatedGetter(intValue = -277345349)
	public static int field698;

	@ObfuscatedName("kt")
	static boolean field701;

	@ObfuscatedName("kr")
	@ObfuscatedGetter(intValue = 2022200065)
	static int field748;

	@ObfuscatedName("kk")
	static boolean field481;

	@ObfuscatedName("kp")
	@ObfuscatedGetter(intValue = -883679839)
	static int field581;

	@ObfuscatedName("kc")
	@ObfuscatedGetter(intValue = 600800367)
	@Export("overheadTextCount")
	static int overheadTextCount;

	@ObfuscatedName("kq")
	@ObfuscatedGetter(intValue = 1156341529)
	@Export("overheadTextLimit")
	static int overheadTextLimit;

	@ObfuscatedName("ko")
	@Export("overheadTextXs")
	static int[] overheadTextXs;

	@ObfuscatedName("kh")
	@Export("overheadTextYs")
	static int[] overheadTextYs;

	@ObfuscatedName("ku")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;

	@ObfuscatedName("kv")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;

	@ObfuscatedName("kg")
	@Export("overheadTextColors")
	static int[] overheadTextColors;

	@ObfuscatedName("ke")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;

	@ObfuscatedName("kb")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;

	@ObfuscatedName("ki")
	@Export("overheadText")
	static String[] overheadText;

	@ObfuscatedName("ky")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;

	@ObfuscatedName("kd")
	@ObfuscatedGetter(intValue = -1656822849)
	@Export("viewportDrawCount")
	static int viewportDrawCount;

	@ObfuscatedName("kx")
	@ObfuscatedGetter(intValue = -1136176017)
	@Export("viewportTempX")
	static int viewportTempX;

	@ObfuscatedName("kf")
	@ObfuscatedGetter(intValue = -1276821173)
	@Export("viewportTempY")
	static int viewportTempY;

	@ObfuscatedName("kz")
	@ObfuscatedGetter(intValue = -490986245)
	@Export("mouseCrossX")
	static int mouseCrossX;

	@ObfuscatedName("ka")
	@ObfuscatedGetter(intValue = 1281000605)
	@Export("mouseCrossY")
	static int mouseCrossY;

	@ObfuscatedName("kw")
	@ObfuscatedGetter(intValue = 331250692)
	@Export("mouseCrossState")
	static int mouseCrossState;

	@ObfuscatedName("km")
	@ObfuscatedGetter(intValue = 1844515145)
	@Export("mouseCrossColor")
	static int mouseCrossColor;

	@ObfuscatedName("kn")
	@Export("showMouseCross")
	static boolean showMouseCross;

	@ObfuscatedName("kl")
	@ObfuscatedGetter(intValue = -2103051577)
	static int field601;

	@ObfuscatedName("ks")
	@ObfuscatedGetter(intValue = 1466281877)
	static int field602;

	@ObfuscatedName("lz")
	@ObfuscatedGetter(intValue = -864631493)
	@Export("dragItemSlotSource")
	static int dragItemSlotSource;

	@ObfuscatedName("lc")
	@ObfuscatedGetter(intValue = 401775147)
	@Export("draggedWidgetX")
	static int draggedWidgetX;

	@ObfuscatedName("lv")
	@ObfuscatedGetter(intValue = -1637344529)
	@Export("draggedWidgetY")
	static int draggedWidgetY;

	@ObfuscatedName("ll")
	@ObfuscatedGetter(intValue = -449617919)
	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;

	@ObfuscatedName("lw")
	static boolean field607;

	@ObfuscatedName("lo")
	@ObfuscatedGetter(intValue = 727707903)
	@Export("itemDragDuration")
	static int itemDragDuration;

	@ObfuscatedName("ls")
	@ObfuscatedGetter(intValue = -170867955)
	static int field542;

	@ObfuscatedName("lg")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;

	@ObfuscatedName("lh")
	@ObfuscatedSignature(descriptor = "[Lcz;")
	@Export("players")
	static Player[] players;

	@ObfuscatedName("lx")
	@ObfuscatedGetter(intValue = -698126847)
	@Export("localPlayerIndex")
	static int localPlayerIndex;

	@ObfuscatedName("lp")
	@ObfuscatedGetter(intValue = 429923903)
	static int field770;

	@ObfuscatedName("lm")
	@ObfuscatedGetter(longValue = 6039396914381301651L)
	static long field614;

	@ObfuscatedName("lj")
	@Export("renderSelf")
	static boolean renderSelf;

	@ObfuscatedName("la")
	@ObfuscatedGetter(intValue = 1659264153)
	@Export("drawPlayerNames")
	static int drawPlayerNames;

	@ObfuscatedName("ln")
	@ObfuscatedGetter(intValue = 1596863855)
	static int field617;

	@ObfuscatedName("ly")
	static int[] field636;

	@ObfuscatedName("me")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;

	@ObfuscatedName("mk")
	@Export("playerMenuActions")
	static String[] playerMenuActions;

	@ObfuscatedName("mw")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;

	@ObfuscatedName("mi")
	@Export("defaultRotations")
	static int[] defaultRotations;

	@ObfuscatedName("mf")
	@ObfuscatedGetter(intValue = 627828331)
	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;

	@ObfuscatedName("ml")
	@ObfuscatedSignature(descriptor = "[[[Llt;")
	@Export("groundItems")
	static NodeDeque[][][] groundItems;

	@ObfuscatedName("mn")
	@ObfuscatedSignature(descriptor = "Llt;")
	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;

	@ObfuscatedName("mg")
	@ObfuscatedSignature(descriptor = "Llt;")
	@Export("projectiles")
	static NodeDeque projectiles;

	@ObfuscatedName("mp")
	@ObfuscatedSignature(descriptor = "Llt;")
	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;

	@ObfuscatedName("mh")
	@Export("currentLevels")
	static int[] currentLevels;

	@ObfuscatedName("mx")
	@Export("levels")
	static int[] levels;

	@ObfuscatedName("ma")
	@Export("experience")
	static int[] experience;

	@ObfuscatedName("mu")
	@Export("leftClickOpensMenu")
	static boolean leftClickOpensMenu;

	@ObfuscatedName("mb")
	@Export("isMenuOpen")
	static boolean isMenuOpen;

	@ObfuscatedName("mj")
	@ObfuscatedGetter(intValue = 2126838789)
	@Export("menuOptionsCount")
	static int menuOptionsCount;

	@ObfuscatedName("mr")
	@Export("menuArguments1")
	static int[] menuArguments1;

	@ObfuscatedName("md")
	@Export("menuArguments2")
	static int[] menuArguments2;

	@ObfuscatedName("ms")
	@Export("menuOpcodes")
	static int[] menuOpcodes;

	@ObfuscatedName("mq")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;

	@ObfuscatedName("mz")
	static int[] menuItemIds;

	@ObfuscatedName("nv")
	@Export("menuActions")
	static String[] menuActions;

	@ObfuscatedName("nc")
	@Export("menuTargets")
	static String[] menuTargets;

	@ObfuscatedName("na")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;

	@ObfuscatedName("nw")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;

	@ObfuscatedName("nf")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;

	@ObfuscatedName("nt")
	@Export("tapToDrop")
	static boolean tapToDrop;

	@ObfuscatedName("nd")
	@Export("showMouseOverText")
	static boolean showMouseOverText;

	@ObfuscatedName("np")
	@ObfuscatedGetter(intValue = -953960509)
	@Export("viewportX")
	static int viewportX;

	@ObfuscatedName("ns")
	@ObfuscatedGetter(intValue = -384320635)
	@Export("viewportY")
	static int viewportY;

	@ObfuscatedName("nj")
	@ObfuscatedGetter(intValue = 65288631)
	static int field535;

	@ObfuscatedName("ni")
	@ObfuscatedGetter(intValue = 1508890005)
	static int field631;

	@ObfuscatedName("nu")
	@ObfuscatedGetter(intValue = 310567771)
	@Export("isItemSelected")
	static int isItemSelected;

	@ObfuscatedName("ng")
	@Export("isSpellSelected")
	static boolean isSpellSelected;

	@ObfuscatedName("nr")
	@ObfuscatedGetter(intValue = -1475596071)
	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;

	@ObfuscatedName("nz")
	@ObfuscatedGetter(intValue = 220084033)
	@Export("selectedSpellItemId")
	static int selectedSpellItemId;

	@ObfuscatedName("ny")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;

	@ObfuscatedName("no")
	@Export("selectedSpellName")
	static String selectedSpellName;

	@ObfuscatedName("nb")
	@ObfuscatedGetter(intValue = 947439613)
	@Export("rootInterface")
	static int rootInterface;

	@ObfuscatedName("nn")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("interfaceParents")
	static NodeHashTable interfaceParents;

	@ObfuscatedName("om")
	@ObfuscatedGetter(intValue = 822823191)
	static int field603;

	@ObfuscatedName("of")
	@ObfuscatedGetter(intValue = -2145540861)
	static int field660;

	@ObfuscatedName("op")
	@ObfuscatedGetter(intValue = -1517821033)
	@Export("chatEffects")
	static int chatEffects;

	@ObfuscatedName("on")
	@ObfuscatedGetter(intValue = 819784613)
	static int field662;

	@ObfuscatedName("oz")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;

	@ObfuscatedName("ox")
	@ObfuscatedGetter(intValue = 385904047)
	@Export("runEnergy")
	static int runEnergy;

	@ObfuscatedName("oa")
	@ObfuscatedGetter(intValue = -619724883)
	@Export("weight")
	static int weight;

	@ObfuscatedName("ov")
	@ObfuscatedGetter(intValue = 1641091231)
	@Export("staffModLevel")
	public static int staffModLevel;

	@ObfuscatedName("oc")
	@ObfuscatedGetter(intValue = 292886159)
	@Export("followerIndex")
	static int followerIndex;

	@ObfuscatedName("oq")
	@Export("playerMod")
	static boolean playerMod;

	@ObfuscatedName("od")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("viewportWidget")
	static Widget viewportWidget;

	@ObfuscatedName("ob")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("clickedWidget")
	static Widget clickedWidget;

	@ObfuscatedName("oe")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;

	@ObfuscatedName("og")
	@ObfuscatedGetter(intValue = -332678017)
	@Export("widgetClickX")
	static int widgetClickX;

	@ObfuscatedName("oj")
	@ObfuscatedGetter(intValue = 1464673091)
	@Export("widgetClickY")
	static int widgetClickY;

	@ObfuscatedName("ol")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("draggedOnWidget")
	static Widget draggedOnWidget;

	@ObfuscatedName("or")
	static boolean field675;

	@ObfuscatedName("ow")
	@ObfuscatedGetter(intValue = 900070009)
	static int field676;

	@ObfuscatedName("ou")
	@ObfuscatedGetter(intValue = -92914957)
	static int field751;

	@ObfuscatedName("oh")
	static boolean field549;

	@ObfuscatedName("os")
	@ObfuscatedGetter(intValue = -1086723837)
	static int field679;

	@ObfuscatedName("ot")
	@ObfuscatedGetter(intValue = 1433960217)
	static int field680;

	@ObfuscatedName("pb")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;

	@ObfuscatedName("ph")
	@ObfuscatedGetter(intValue = -360905729)
	@Export("cycleCntr")
	static int cycleCntr;

	@ObfuscatedName("pw")
	@Export("changedVarps")
	static int[] changedVarps;

	@ObfuscatedName("pi")
	@ObfuscatedGetter(intValue = -990729913)
	@Export("changedVarpCount")
	static int changedVarpCount;

	@ObfuscatedName("pm")
	@Export("changedItemContainers")
	static int[] changedItemContainers;

	@ObfuscatedName("pd")
	@ObfuscatedGetter(intValue = 1732973057)
	static int field686;

	@ObfuscatedName("po")
	@Export("changedSkills")
	static int[] changedSkills;

	@ObfuscatedName("pc")
	@ObfuscatedGetter(intValue = 1771249731)
	@Export("changedSkillsCount")
	static int changedSkillsCount;

	@ObfuscatedName("pt")
	static int[] field689;

	@ObfuscatedName("ps")
	@ObfuscatedGetter(intValue = 655105537)
	static int field690;

	@ObfuscatedName("pv")
	@ObfuscatedGetter(intValue = -1498563941)
	@Export("chatCycle")
	static int chatCycle;

	@ObfuscatedName("py")
	@ObfuscatedGetter(intValue = -2107057685)
	static int field750;

	@ObfuscatedName("pg")
	@ObfuscatedGetter(intValue = -991201885)
	static int field612;

	@ObfuscatedName("pk")
	@ObfuscatedGetter(intValue = -960757625)
	static int field694;

	@ObfuscatedName("pq")
	@ObfuscatedGetter(intValue = 1065606213)
	static int field755;

	@ObfuscatedName("pp")
	@ObfuscatedGetter(intValue = -1040139219)
	static int field696;

	@ObfuscatedName("pr")
	@ObfuscatedGetter(intValue = -1088558955)
	static int field697;

	@ObfuscatedName("pj")
	@ObfuscatedGetter(intValue = -1128989727)
	static int field726;

	@ObfuscatedName("qo")
	@ObfuscatedGetter(intValue = 157166571)
	@Export("mouseWheelRotation")
	static int mouseWheelRotation;

	@ObfuscatedName("qs")
	@ObfuscatedSignature(descriptor = "Llt;")
	@Export("scriptEvents")
	static NodeDeque scriptEvents;

	@ObfuscatedName("qp")
	@ObfuscatedSignature(descriptor = "Llt;")
	static NodeDeque field758;

	@ObfuscatedName("qh")
	@ObfuscatedSignature(descriptor = "Llt;")
	static NodeDeque field702;

	@ObfuscatedName("qt")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("widgetFlags")
	static NodeHashTable widgetFlags;

	@ObfuscatedName("qn")
	@ObfuscatedGetter(intValue = -2077862919)
	@Export("rootWidgetCount")
	static int rootWidgetCount;

	@ObfuscatedName("qf")
	@ObfuscatedGetter(intValue = 1217307177)
	static int field705;

	@ObfuscatedName("qr")
	static boolean[] field610;

	@ObfuscatedName("qe")
	static boolean[] field691;

	@ObfuscatedName("ql")
	static boolean[] field550;

	@ObfuscatedName("qj")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;

	@ObfuscatedName("qv")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;

	@ObfuscatedName("qg")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;

	@ObfuscatedName("qx")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;

	@ObfuscatedName("qb")
	@ObfuscatedGetter(intValue = -2019619931)
	@Export("gameDrawingMode")
	static int gameDrawingMode;

	@ObfuscatedName("qu")
	@ObfuscatedGetter(longValue = -3271561353902982121L)
	static long field714;

	@ObfuscatedName("qa")
	@Export("isResizable")
	static boolean isResizable;

	@ObfuscatedName("fj")
	String field521;

	@ObfuscatedName("fi")
	@ObfuscatedSignature(descriptor = "Lp;")
	class14 field522;

	@ObfuscatedName("fg")
	@ObfuscatedSignature(descriptor = "Lv;")
	class19 field523;

	@ObfuscatedName("fa")
	OtlTokenRequester field524;

	@ObfuscatedName("fq")
	Future field525;

	@ObfuscatedName("fx")
	boolean field526 = false;

	@ObfuscatedName("fd")
	@ObfuscatedSignature(descriptor = "Lv;")
	class19 field527;

	@ObfuscatedName("fs")
	@ObfuscatedSignature(descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;")
	RefreshAccessTokenRequester field528;

	@ObfuscatedName("fh")
	Future field514;

	@ObfuscatedName("gl")
	@ObfuscatedSignature(descriptor = "Lqw;")
	Buffer field534;

	@ObfuscatedName("gi")
	@ObfuscatedSignature(descriptor = "Lj;")
	class7 field519;

	@ObfuscatedName("ga")
	@ObfuscatedGetter(longValue = 7558368042315501297L)
	long field536 = -1L;

	static {
		playerAttackOption = AttackOption.AttackOption_hidden;
		npcAttackOption = AttackOption.AttackOption_hidden;
		titleLoadingStage = 0;
		js5ConnectState = 0;
		field513 = 0;
		js5Errors = 0;
		loginState = 0;
		field516 = 0;
		field766 = 0;
		field711 = 0;
		field645 = class124.field1516;
		field741 = class447.field4766;
		byte[] var1 = MusicPatchPcmStream.method5470("com_jagex_auth_desktop_osrs:public");
		String var0 = Frames.method4310(var1, 0, var1.length);
		field530 = var0;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC['耀'];
		npcCount = 0;
		npcIndices = new int['耀'];
		field541 = 0;
		field729 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field613 = 0;
		field774 = 1;
		field609 = 0;
		field551 = 1;
		field552 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field556 = new int[]{ 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		field744 = 0;
		field557 = 2301979;
		field559 = 5063219;
		field560 = 3353893;
		field561 = 7759444;
		field562 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field572 = 0;
		field573 = 0;
		field574 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field698 = 0;
		field701 = false;
		field748 = 0;
		field481 = false;
		field581 = 0;
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
		field601 = 0;
		field602 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field607 = false;
		itemDragDuration = 0;
		field542 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field770 = 0;
		field614 = -1L;
		renderSelf = true;
		drawPlayerNames = 0;
		field617 = 0;
		field636 = new int[1000];
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
		shiftClickDrop = false;
		tapToDrop = false;
		showMouseOverText = true;
		viewportX = -1;
		viewportY = -1;
		field535 = 0;
		field631 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		selectedSpellItemId = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field603 = 0;
		field660 = -1;
		chatEffects = 0;
		field662 = 0;
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
		field675 = false;
		field676 = -1;
		field751 = -1;
		field549 = false;
		field679 = -1;
		field680 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field686 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field689 = new int[32];
		field690 = 0;
		chatCycle = 0;
		field750 = 0;
		field612 = 0;
		field694 = 0;
		field755 = 0;
		field696 = 0;
		field697 = 0;
		field726 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field758 = new NodeDeque();
		field702 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field705 = -2;
		field610 = new boolean[100];
		field691 = new boolean[100];
		field550 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field714 = 0L;
		isResizable = true;
		field555 = new int[]{ 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		publicChatMode = 0;
		tradeChatMode = 0;
		field719 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field722 = 0;
		field626 = new int[128];
		field724 = new int[128];
		field725 = -1L;
		currentClanSettings = new ClanSettings[4];
		currentClanChannels = new ClanChannel[4];
		field518 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		playingJingle = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field745 = false;
		field678 = new boolean[5];
		field747 = new int[5];
		field654 = new int[5];
		field749 = new int[5];
		field653 = new int[5];
		field644 = 256;
		field695 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field677 = 1;
		field756 = 32767;
		field757 = 1;
		field567 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field765 = -1;
		field627 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		DBTableIndex_cache = new EvictingDualNodeHashTable(64);
		DBTableMasterIndex_cache = new EvictingDualNodeHashTable(64);
		field772 = -1;
		field773 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field630 = 0;
		field777 = new ApproximateRouteStrategy();
		field778 = new int[50];
		field779 = new int[50];
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "15")
	@Export("resizeGame")
	protected final void resizeGame() {
		field714 = class131.method2916() + 500L;
		this.resizeJS();
		if (rootInterface != -1) {
			this.resizeRoot(true);
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-8")
	@Export("setUp")
	protected final void setUp() {
		class120.method2823(new int[]{ 20, 260, 10000 }, new int[]{ 1000, 100, 500 });
		class18.worldPort = (gameBuild == 0) ? 'ꩊ' : worldId + '鱀';
		DbRowType.js5Port = (gameBuild == 0) ? 443 : worldId + '썐';
		class117.currentPort = class18.worldPort;
		WorldMapEvent.field2881 = class293.field3345;
		DynamicObject.field986 = class293.field3343;
		AbstractWorldMapIcon.field2859 = class293.field3344;
		PlayerComposition.field3339 = class293.field3346;
		class152.urlRequester = new class101(this.field526, 207);
		this.setUpKeyboard();
		this.method420();
		class16.mouseWheel = this.mouseWheel();
		EnumComposition.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		class260.clientPreferences = class7.method57();
		this.setUpClipboard();
		class119.method2814(this, ScriptEvent.field1045);
		class67.setWindowedMode(class260.clientPreferences.method2387());
		MusicPatchPcmStream.friendSystem = new FriendSystem(class162.loginType);
		this.field522 = new class14("tokenRequest", 1, 1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-787882687")
	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		ClientPacket.method5191();
		CollisionMap.method3888();
		class12.playPcmPlayers();
		ModeWhere.method6093();
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
		if (class16.mouseWheel != null) {
			int var3 = class16.mouseWheel.useRotation();
			mouseWheelRotation = var3;
		}
		if (gameState == 0) {
			HitSplatDefinition.load();
			FriendSystem.method1769();
		} else if (gameState == 5) {
			class123.loginScreen(this, class149.fontPlain12);
			HitSplatDefinition.load();
			FriendSystem.method1769();
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				class123.loginScreen(this, class149.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 50) {
				class123.loginScreen(this, class149.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				GrandExchangeOffer.method6027();
			}
		} else {
			class123.loginScreen(this, class149.fontPlain12);
		}
		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if (gameState == 40 || gameState == 45) {
			this.doCycleLoggedOut();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "-66")
	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2;
		label168 : {
			try {
				if (class273.musicPlayerStatus == 2) {
					if (InterfaceParent.musicTrack == null) {
						InterfaceParent.musicTrack = MusicTrack.readTrack(class149.musicTrackArchive, class273.musicTrackGroupId, UserComparator6.musicTrackFileId);
						if (InterfaceParent.musicTrack == null) {
							var2 = false;
							break label168;
						}
					}
					if (class358.soundCache == null) {
						class358.soundCache = new SoundCache(class329.soundEffectsArchive, class273.musicSamplesArchive);
					}
					if (class273.midiPcmStream.loadMusicTrack(InterfaceParent.musicTrack, class273.musicPatchesArchive, class358.soundCache, 22050)) {
						class273.midiPcmStream.clearAll();
						class273.midiPcmStream.setPcmStreamVolume(class273.musicTrackVolume);
						class273.midiPcmStream.setMusicTrack(InterfaceParent.musicTrack, class347.musicTrackBoolean);
						class273.musicPlayerStatus = 0;
						InterfaceParent.musicTrack = null;
						class358.soundCache = null;
						class149.musicTrackArchive = null;
						var2 = true;
						break label168;
					}
				}
			} catch (Exception var6) {
				var6.printStackTrace();
				class273.midiPcmStream.clear();
				class273.musicPlayerStatus = 0;
				InterfaceParent.musicTrack = null;
				class358.soundCache = null;
				class149.musicTrackArchive = null;
			}
			var2 = false;
		}
		if (var2 && playingJingle && class192.pcmPlayer0 != null) {
			class192.pcmPlayer0.tryDiscard();
		}
		if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field714 && class131.method2916() > field714) {
			class67.setWindowedMode(MouseRecorder.getWindowedMode());
		}
		int var4;
		if (var1) {
			for (var4 = 0; var4 < 100; ++var4) {
				field610[var4] = true;
			}
		}
		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			ServerPacket.drawTitle(class116.fontBold12, class116.fontPlain11, class149.fontPlain12);
		} else if (gameState != 10 && gameState != 11) {
			if (gameState == 20) {
				ServerPacket.drawTitle(class116.fontBold12, class116.fontPlain11, class149.fontPlain12);
			} else if (gameState == 50) {
				ServerPacket.drawTitle(class116.fontBold12, class116.fontPlain11, class149.fontPlain12);
			} else if (gameState == 25) {
				if (field552 == 1) {
					if (field613 > field774) {
						field774 = field613;
					}
					var4 = (field774 * 50 - field613 * 50) / field774;
					class273.drawLoadingMessage("Loading - please wait." + ("<br>" + " (") + var4 + "%" + ")", false);
				} else if (field552 == 2) {
					if (field609 > field551) {
						field551 = field609;
					}
					var4 = (field551 * 50 - field609 * 50) / field551 + 50;
					class273.drawLoadingMessage("Loading - please wait." + ("<br>" + " (") + var4 + "%" + ")", false);
				} else {
					class273.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class273.drawLoadingMessage("Connection lost" + ("<br>" + "Please wait - attempting to reestablish"), false);
			} else if (gameState == 45) {
				class273.drawLoadingMessage("Please wait...", false);
			}
		} else {
			ServerPacket.drawTitle(class116.fontBold12, class116.fontPlain11, class149.fontPlain12);
		}
		if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				if (field691[var4]) {
					class268.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
					field691[var4] = false;
				}
			}
		} else if (gameState > 0) {
			class268.rasterProvider.drawFull(0, 0);
			for (var4 = 0; var4 < rootWidgetCount; ++var4) {
				field691[var4] = false;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "453908152")
	@Export("kill0")
	protected final void kill0() {
		if (class151.varcs.hasUnwrittenChanges()) {
			class151.varcs.write();
		}
		if (class309.mouseRecorder != null) {
			class309.mouseRecorder.isRunning = false;
		}
		class309.mouseRecorder = null;
		packetWriter.close();
		class346.method6353();
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}
		class16.mouseWheel = null;
		if (class192.pcmPlayer0 != null) {
			class192.pcmPlayer0.shutdown();
		}
		if (SequenceDefinition.pcmPlayer1 != null) {
			SequenceDefinition.pcmPlayer1.shutdown();
		}
		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}
		class33.method609();
		if (class152.urlRequester != null) {
			class152.urlRequester.close();
			class152.urlRequester = null;
		}
		class268.method5210();
		this.field522.method184();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-395659383")
	protected final void vmethod1109() {
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1249169550")
	boolean method1112() {
		return class344.field4179 != null && !class344.field4179.trim().isEmpty();
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-102")
	boolean method1113() {
		return this.field524 != null;
	}

	@ObfuscatedName("fm")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "968949768")
	void method1114(String var1) throws IOException {
		HashMap var2 = new HashMap();
		var2.put("grant_type", "refresh_token");
		var2.put("scope", "gamesso.token.create");
		var2.put("refresh_token", var1);
		URL var3 = new URL(class65.field874 + "shield/oauth/token" + new class401(var2).method7141());
		HashMap var4 = new HashMap();
		var4.put("Authorization", "Basic " + field530);
		var4.put("Host", new URL(class65.field874).getHost());
		var4.put("Accept", class398.field4447.method7126());
		class9 var5 = class9.field43;
		RefreshAccessTokenRequester var6 = this.field528;
		if (var6 != null) {
			this.field514 = var6.request(var5.method79(), var3, var4, "");
		} else {
			class10 var7 = new class10(var3, var5, this.field526);
			Iterator var8 = var4.entrySet().iterator();
			while (var8.hasNext()) {
				Map.Entry var9 = ((Map.Entry) (var8.next()));
				var7.method84(((String) (var9.getKey())), ((String) (var9.getValue())));
			} 
			this.field527 = this.field522.method177(var7);
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-90825894")
	void method1115(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(class65.field874 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		HashMap var3 = new HashMap();
		var3.put("Authorization", "Bearer " + var1);
		class9 var4 = class9.field41;
		OtlTokenRequester var5 = this.field524;
		if (var5 != null) {
			this.field525 = var5.request(var4.method79(), var2, var3, "");
		} else {
			class10 var6 = new class10(var2, var4, this.field526);
			Iterator var7 = var3.entrySet().iterator();
			while (var7.hasNext()) {
				Map.Entry var8 = ((Map.Entry) (var7.next()));
				var6.method84(((String) (var8.getKey())), ((String) (var8.getValue())));
			} 
			this.field523 = this.field522.method177(var6);
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "693258012")
	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			long var2 = class131.method2916();
			int var4 = ((int) (var2 - class295.field3526));
			class295.field3526 = var2;
			if (var4 > 200) {
				var4 = 200;
			}
			NetCache.NetCache_loadTime += var4;
			boolean var1;
			if (NetCache.NetCache_pendingResponsesCount == 0 && NetCache.NetCache_pendingPriorityResponsesCount == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.NetCache_pendingPriorityWritesCount == 0) {
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
						while (NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
							var5 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityWrites.first()));
							var6 = new Buffer(4);
							var6.writeByte(1);
							var6.writeMedium(((int) (var5.key)));
							NetCache.NetCache_socket.write(var6.array, 0, 4);
							NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key);
							--NetCache.NetCache_pendingPriorityWritesCount;
							++NetCache.NetCache_pendingPriorityResponsesCount;
						} 
						while (NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
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
							if (ClanChannel.NetCache_currentResponse == null) {
								var7 = 8;
							} else if (NetCache.field4045 == 0) {
								var7 = 1;
							}
							int var8;
							int var9;
							int var10;
							byte[] var10000;
							int var10001;
							Buffer var24;
							if (var7 > 0) {
								var8 = var7 - NetCache.NetCache_responseHeaderBuffer.offset;
								if (var8 > var18) {
									var8 = var18;
								}
								NetCache.NetCache_socket.read(NetCache.NetCache_responseHeaderBuffer.array, NetCache.NetCache_responseHeaderBuffer.offset, var8);
								if (NetCache.field4033 != 0) {
									for (var9 = 0; var9 < var8; ++var9) {
										var10000 = NetCache.NetCache_responseHeaderBuffer.array;
										var10001 = NetCache.NetCache_responseHeaderBuffer.offset + var9;
										var10000[var10001] ^= NetCache.field4033;
									}
								}
								var24 = NetCache.NetCache_responseHeaderBuffer;
								var24.offset += var8;
								if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
									break;
								}
								if (ClanChannel.NetCache_currentResponse == null) {
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
									var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
									int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
									int var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
									long var13 = ((long) (var10 + (var9 << 16)));
									NetFileRequest var15 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.get(var13)));
									class342.field4171 = true;
									if (var15 == null) {
										var15 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.get(var13)));
										class342.field4171 = false;
									}
									if (var15 == null) {
										throw new IOException();
									}
									int var16 = (var11 == 0) ? 5 : 9;
									ClanChannel.NetCache_currentResponse = var15;
									WorldMapSection2.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + ClanChannel.NetCache_currentResponse.padding);
									WorldMapSection2.NetCache_responseArchiveBuffer.writeByte(var11);
									WorldMapSection2.NetCache_responseArchiveBuffer.writeInt(var12);
									NetCache.field4045 = 8;
									NetCache.NetCache_responseHeaderBuffer.offset = 0;
								} else if (NetCache.field4045 == 0) {
									if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
										NetCache.field4045 = 1;
										NetCache.NetCache_responseHeaderBuffer.offset = 0;
									} else {
										ClanChannel.NetCache_currentResponse = null;
									}
								}
							} else {
								var8 = WorldMapSection2.NetCache_responseArchiveBuffer.array.length - ClanChannel.NetCache_currentResponse.padding;
								var9 = 512 - NetCache.field4045;
								if (var9 > var8 - WorldMapSection2.NetCache_responseArchiveBuffer.offset) {
									var9 = var8 - WorldMapSection2.NetCache_responseArchiveBuffer.offset;
								}
								if (var9 > var18) {
									var9 = var18;
								}
								NetCache.NetCache_socket.read(WorldMapSection2.NetCache_responseArchiveBuffer.array, WorldMapSection2.NetCache_responseArchiveBuffer.offset, var9);
								if (NetCache.field4033 != 0) {
									for (var10 = 0; var10 < var9; ++var10) {
										var10000 = WorldMapSection2.NetCache_responseArchiveBuffer.array;
										var10001 = WorldMapSection2.NetCache_responseArchiveBuffer.offset + var10;
										var10000[var10001] ^= NetCache.field4033;
									}
								}
								var24 = WorldMapSection2.NetCache_responseArchiveBuffer;
								var24.offset += var9;
								NetCache.field4045 += var9;
								if (var8 == WorldMapSection2.NetCache_responseArchiveBuffer.offset) {
									if (ClanChannel.NetCache_currentResponse.key == 16711935L) {
										Skills.field3568 = WorldMapSection2.NetCache_responseArchiveBuffer;
										for (var10 = 0; var10 < 256; ++var10) {
											Archive var19 = NetCache.NetCache_archives[var10];
											if (var19 != null) {
												class9.method81(var19, var10);
											}
										}
									} else {
										NetCache.NetCache_crc.reset();
										NetCache.NetCache_crc.update(WorldMapSection2.NetCache_responseArchiveBuffer.array, 0, var8);
										var10 = ((int) (NetCache.NetCache_crc.getValue()));
										if (var10 != ClanChannel.NetCache_currentResponse.crc) {
											try {
												NetCache.NetCache_socket.close();
											} catch (Exception var22) {
											}
											++NetCache.NetCache_crcMismatches;
											NetCache.NetCache_socket = null;
											NetCache.field4033 = ((byte) ((int) (Math.random() * 255.0 + 1.0)));
											var1 = false;
											break label243;
										}
										NetCache.NetCache_crcMismatches = 0;
										NetCache.NetCache_ioExceptions = 0;
										ClanChannel.NetCache_currentResponse.archive.write(((int) (ClanChannel.NetCache_currentResponse.key & 65535L)), WorldMapSection2.NetCache_responseArchiveBuffer.array, 16711680L == (ClanChannel.NetCache_currentResponse.key & 16711680L), class342.field4171);
									}
									ClanChannel.NetCache_currentResponse.remove();
									if (class342.field4171) {
										--NetCache.NetCache_pendingPriorityResponsesCount;
									} else {
										--NetCache.NetCache_pendingResponsesCount;
									}
									NetCache.field4045 = 0;
									ClanChannel.NetCache_currentResponse = null;
									WorldMapSection2.NetCache_responseArchiveBuffer = null;
								} else {
									if (NetCache.field4045 != 512) {
										break;
									}
									NetCache.field4045 = 0;
								}
							}
						}
						var1 = true;
					}
				} catch (IOException var23) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var21) {
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

	@ObfuscatedName("fu")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "4334")
	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			class82.updateGameState(1000);
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					class82.updateGameState(1000);
					return;
				}
				field513 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}
			if (--field513 + 1 <= 0) {
				try {
					if (js5ConnectState == 0) {
						class1.js5SocketTask = GameEngine.taskHandler.newSocketTask(WorldMapSectionType.worldHost, class117.currentPort);
						++js5ConnectState;
					}
					if (js5ConnectState == 1) {
						if (class1.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}
						if (class1.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}
					Buffer var3;
					if (js5ConnectState == 2) {
						Socket var2 = ((Socket) (class1.js5SocketTask.result));
						BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
						class101.js5Socket = var1;
						var3 = new Buffer(5);
						var3.writeByte(15);
						var3.writeInt(207);
						class101.js5Socket.write(var3.array, 0, 5);
						++js5ConnectState;
						class137.field1602 = class131.method2916();
					}
					if (js5ConnectState == 3) {
						if (class101.js5Socket.available() > 0) {
							int var5 = class101.js5Socket.readUnsignedByte();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}
							++js5ConnectState;
						} else if (class131.method2916() - class137.field1602 > 30000L) {
							this.js5Error(-2);
							return;
						}
					}
					if (js5ConnectState == 4) {
						AbstractSocket var11 = class101.js5Socket;
						boolean var6 = gameState > 20;
						if (NetCache.NetCache_socket != null) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var9) {
							}
							NetCache.NetCache_socket = null;
						}
						NetCache.NetCache_socket = var11;
						StructComposition.method3597(var6);
						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						ClanChannel.NetCache_currentResponse = null;
						WorldMapSection2.NetCache_responseArchiveBuffer = null;
						NetCache.field4045 = 0;
						while (true) {
							NetFileRequest var12 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.first()));
							if (var12 == null) {
								while (true) {
									var12 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.first()));
									if (var12 == null) {
										if (NetCache.field4033 != 0) {
											try {
												var3 = new Buffer(4);
												var3.writeByte(4);
												var3.writeByte(NetCache.field4033);
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
										class295.field3526 = class131.method2916();
										class1.js5SocketTask = null;
										class101.js5Socket = null;
										js5ConnectState = 0;
										js5Errors = 0;
										return;
									}
									NetCache.NetCache_pendingWritesQueue.addLast(var12);
									NetCache.NetCache_pendingWrites.put(var12, var12.key);
									++NetCache.NetCache_pendingWritesCount;
									--NetCache.NetCache_pendingResponsesCount;
								} 
							}
							NetCache.NetCache_pendingPriorityWrites.put(var12, var12.key);
							++NetCache.NetCache_pendingPriorityWritesCount;
							--NetCache.NetCache_pendingPriorityResponsesCount;
						} 
					}
				} catch (IOException var10) {
					this.js5Error(-3);
				}
			}
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1901606866")
	@Export("js5Error")
	void js5Error(int var1) {
		class1.js5SocketTask = null;
		class101.js5Socket = null;
		js5ConnectState = 0;
		if (class18.worldPort == class117.currentPort) {
			class117.currentPort = DbRowType.js5Port;
		} else {
			class117.currentPort = class18.worldPort;
		}
		++js5Errors;
		if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				class82.updateGameState(1000);
			} else {
				field513 = 3000;
			}
		} else if (js5Errors >= 2 && var1 == 6) {
			this.error("js5connect_outofdate");
			class82.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				class82.updateGameState(1000);
			} else {
				field513 = 3000;
			}
		}
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "68")
	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		try {
			if (loginState == 0) {
				if (SpriteMask.secureRandom == null && (secureRandomFuture.isDone() || field516 > 250)) {
					SpriteMask.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}
				if (SpriteMask.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket) (var1)).close();
						var1 = null;
					}
					VarpDefinition.socketTask = null;
					hadNetworkError = false;
					field516 = 0;
					if (field741.method8024()) {
						try {
							this.method1114(class402.field4461);
							GameBuild.method5758(21);
						} catch (Throwable var29) {
							class359.RunException_sendStackTrace(((String) (null)), var29);
							WorldMapData_1.getLoginError(65);
							return;
						}
					} else {
						GameBuild.method5758(1);
					}
				}
			}
			class21 var32;
			if (loginState == 21) {
				if (this.field514 != null) {
					if (!this.field514.isDone()) {
						return;
					}
					if (this.field514.isCancelled()) {
						WorldMapData_1.getLoginError(65);
						this.field514 = null;
						return;
					}
					try {
						OtlTokenResponse var3 = ((OtlTokenResponse) (this.field514.get()));
						if (!var3.isSuccess()) {
							WorldMapData_1.getLoginError(65);
							this.field514 = null;
							return;
						}
						class344.field4179 = var3.getAccessToken();
						class402.field4461 = var3.getRefreshToken();
						this.field514 = null;
					} catch (Exception var28) {
						class359.RunException_sendStackTrace(((String) (null)), var28);
						WorldMapData_1.getLoginError(65);
						this.field514 = null;
						return;
					}
				} else {
					if (this.field527 == null) {
						WorldMapData_1.getLoginError(65);
						return;
					}
					if (!this.field527.method278()) {
						return;
					}
					if (this.field527.method277()) {
						class359.RunException_sendStackTrace(this.field527.method280(), ((Throwable) (null)));
						WorldMapData_1.getLoginError(65);
						this.field527 = null;
						return;
					}
					var32 = this.field527.method279();
					if (var32.method298() != 200) {
						WorldMapData_1.getLoginError(65);
						this.field527 = null;
						return;
					}
					field516 = 0;
					class400 var4 = new class400(var32.method299());
					try {
						class344.field4179 = var4.method7134().getString("access_token");
						class402.field4461 = var4.method7134().getString("refresh_token");
					} catch (Exception var27) {
						class359.RunException_sendStackTrace("Error parsing tokens", var27);
						WorldMapData_1.getLoginError(65);
						this.field527 = null;
						return;
					}
				}
				this.method1115(class344.field4179);
				GameBuild.method5758(20);
			}
			if (loginState == 20) {
				if (this.field525 != null) {
					if (!this.field525.isDone()) {
						return;
					}
					if (this.field525.isCancelled()) {
						WorldMapData_1.getLoginError(65);
						this.field525 = null;
						return;
					}
					try {
						com.jagex.oldscape.pub.OtlTokenResponse var33 = ((com.jagex.oldscape.pub.OtlTokenResponse) (this.field525.get()));
						if (!var33.isSuccess()) {
							WorldMapData_1.getLoginError(65);
							this.field525 = null;
							return;
						}
						this.field521 = var33.getToken();
						this.field525 = null;
					} catch (Exception var26) {
						class359.RunException_sendStackTrace(((String) (null)), var26);
						WorldMapData_1.getLoginError(65);
						this.field525 = null;
						return;
					}
				} else {
					if (this.field523 == null) {
						WorldMapData_1.getLoginError(65);
						return;
					}
					if (!this.field523.method278()) {
						return;
					}
					if (this.field523.method277()) {
						class359.RunException_sendStackTrace(this.field523.method280(), ((Throwable) (null)));
						WorldMapData_1.getLoginError(65);
						this.field523 = null;
						return;
					}
					var32 = this.field523.method279();
					if (var32.method298() != 200) {
						class359.RunException_sendStackTrace("Response code: " + var32.method298() + "Response body: " + var32.method299(), ((Throwable) (null)));
						WorldMapData_1.getLoginError(65);
						this.field523 = null;
						return;
					}
					this.field521 = var32.method299();
					this.field523 = null;
				}
				field516 = 0;
				GameBuild.method5758(1);
			}
			if (loginState == 1) {
				if (VarpDefinition.socketTask == null) {
					VarpDefinition.socketTask = GameEngine.taskHandler.newSocketTask(WorldMapSectionType.worldHost, class117.currentPort);
				}
				if (VarpDefinition.socketTask.status == 2) {
					throw new IOException();
				}
				if (VarpDefinition.socketTask.status == 1) {
					Socket var34 = ((Socket) (VarpDefinition.socketTask.result));
					BufferedNetSocket var35 = new BufferedNetSocket(var34, 40000, 5000);
					var1 = var35;
					packetWriter.setSocket(var35);
					VarpDefinition.socketTask = null;
					GameBuild.method5758(2);
				}
			}
			PacketBufferNode var36;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var36 = class228.method4876();
				var36.packetBuffer.writeByte(LoginPacket.field3149.id);
				packetWriter.addNode(var36);
				packetWriter.flush();
				var2.offset = 0;
				GameBuild.method5758(3);
			}
			int var14;
			if (loginState == 3) {
				if (class192.pcmPlayer0 != null) {
					class192.pcmPlayer0.method698();
				}
				if (SequenceDefinition.pcmPlayer1 != null) {
					SequenceDefinition.pcmPlayer1.method698();
				}
				if (((AbstractSocket) (var1)).isAvailable(1)) {
					var14 = ((AbstractSocket) (var1)).readUnsignedByte();
					if (class192.pcmPlayer0 != null) {
						class192.pcmPlayer0.method698();
					}
					if (SequenceDefinition.pcmPlayer1 != null) {
						SequenceDefinition.pcmPlayer1.method698();
					}
					if (var14 != 0) {
						WorldMapData_1.getLoginError(var14);
						return;
					}
					var2.offset = 0;
					GameBuild.method5758(4);
				}
			}
			if (loginState == 4) {
				if (var2.offset < 8) {
					var14 = ((AbstractSocket) (var1)).available();
					if (var14 > 8 - var2.offset) {
						var14 = 8 - var2.offset;
					}
					if (var14 > 0) {
						((AbstractSocket) (var1)).read(var2.array, var2.offset, var14);
						var2.offset += var14;
					}
				}
				if (var2.offset == 8) {
					var2.offset = 0;
					ArchiveLoader.field1020 = var2.readLong();
					GameBuild.method5758(5);
				}
			}
			int var7;
			int var9;
			int var15;
			int var16;
			if (loginState == 5) {
				Client.packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var38 = new PacketBuffer(500);
				int[] var37 = new int[]{ SpriteMask.secureRandom.nextInt(), SpriteMask.secureRandom.nextInt(), SpriteMask.secureRandom.nextInt(), SpriteMask.secureRandom.nextInt() };
				var38.offset = 0;
				var38.writeByte(1);
				var38.writeInt(var37[0]);
				var38.writeInt(var37[1]);
				var38.writeInt(var37[2]);
				var38.writeInt(var37[3]);
				var38.writeLong(ArchiveLoader.field1020);
				if (gameState == 40) {
					var38.writeInt(field618[0]);
					var38.writeInt(field618[1]);
					var38.writeInt(field618[2]);
					var38.writeInt(field618[3]);
				} else {
					if (gameState == 50) {
						var38.writeByte(class124.field1519.rsOrdinal());
						var38.writeInt(Projectile.field950);
					} else {
						var38.writeByte(field645.rsOrdinal());
						switch (Client.field645.field1520) {
							case 1 :
							case 4 :
								var38.writeMedium(class260.field2908);
								++var38.offset;
								break;
							case 2 :
								var38.offset += 4;
								break;
							case 3 :
								LinkedHashMap var6 = class260.clientPreferences.parameters;
								String var8 = Login.Login_username;
								var9 = var8.length();
								int var10 = 0;
								for (int var11 = 0; var11 < var9; ++var11) {
									var10 = (var10 << 5) - var10 + var8.charAt(var11);
								}
								var38.writeInt(((Integer) (var6.get(var10))));
						}
					}
					if (field741.method8024()) {
						var38.writeByte(class447.field4761.rsOrdinal());
						var38.writeStringCp1252NullTerminated(this.field521);
					} else {
						var38.writeByte(class447.field4766.rsOrdinal());
						var38.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}
				var38.encryptRsa(class67.field889, class67.field888);
				field618 = var37;
				PacketBufferNode var5 = class228.method4876();
				var5.packetBuffer.offset = 0;
				if (gameState == 40) {
					var5.packetBuffer.writeByte(LoginPacket.field3150.id);
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field3146.id);
				}
				var5.packetBuffer.writeShort(0);
				var15 = var5.packetBuffer.offset;
				var5.packetBuffer.writeInt(207);
				var5.packetBuffer.writeInt(1);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeByte(field489);
				var7 = 0;
				var5.packetBuffer.writeByte(var7);
				var5.packetBuffer.writeBytes(var38.array, 0, var38.offset);
				var16 = var5.packetBuffer.offset;
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
				var5.packetBuffer.writeShort(class352.canvasWidth);
				var5.packetBuffer.writeShort(class228.canvasHeight);
				PacketBuffer var17 = var5.packetBuffer;
				int var12;
				if (randomDatData != null) {
					var17.writeBytes(randomDatData, 0, Client.randomDatData.length);
				} else {
					byte[] var18 = new byte[24];
					try {
						JagexCache.JagexCache_randomDat.seek(0L);
						JagexCache.JagexCache_randomDat.readFully(var18);
						for (var12 = 0; var12 < 24 && var18[var12] == 0; ++var12) {
						}
						if (var12 >= 24) {
							throw new IOException();
						}
					} catch (Exception var30) {
						for (int var13 = 0; var13 < 24; ++var13) {
							var18[var13] = -1;
						}
					}
					var17.writeBytes(var18, 0, var18.length);
				}
				var5.packetBuffer.writeStringCp1252NullTerminated(Script.field975);
				var5.packetBuffer.writeInt(Decimator.field402);
				Buffer var20 = new Buffer(class92.platformInfo.size());
				class92.platformInfo.write(var20);
				var5.packetBuffer.writeBytes(var20.array, 0, var20.array.length);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.writeIntIME(WorldMapRegion.archive15.hash);
				var5.packetBuffer.writeShortAddLE(Skills.archive7.hash);
				var5.packetBuffer.writeIntLE(class117.archive12.hash);
				var5.packetBuffer.writeShortAddLE(ClanSettings.archive20.hash);
				var5.packetBuffer.writeIntIME(AbstractWorldMapData.archive8.hash);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.writeShortAddLE(WorldMapArchiveLoader.archive4.hash);
				var5.packetBuffer.writeIntLE(class1.archive13.hash);
				var5.packetBuffer.writeIntLE(Calendar.field3297.hash);
				var5.packetBuffer.writeIntIME(class20.archive2.hash);
				var5.packetBuffer.writeIntIME(TaskHandler.archive11.hash);
				var5.packetBuffer.writeIntLE(MouseHandler.archive6.hash);
				var5.packetBuffer.writeInt(class174.archive18.hash);
				var5.packetBuffer.writeInt(InvDefinition.archive14.hash);
				var5.packetBuffer.writeIntIME(Actor.archive10.hash);
				var5.packetBuffer.writeShortAddLE(WorldMapRegion.field2708.hash);
				var5.packetBuffer.writeIntIME(class293.field3349.hash);
				var5.packetBuffer.writeShortAddLE(Calendar.archive5.hash);
				var5.packetBuffer.writeShortAddLE(class21.archive9.hash);
				var5.packetBuffer.writeIntLE(GrandExchangeOffer.archive19.hash);
				var5.packetBuffer.writeIntLE(class155.archive17.hash);
				var5.packetBuffer.xteaEncrypt(var37, var16, var5.packetBuffer.offset);
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var15);
				packetWriter.addNode(var5);
				packetWriter.flush();
				Client.packetWriter.isaacCipher = new IsaacCipher(var37);
				int[] var51 = new int[4];
				for (var12 = 0; var12 < 4; ++var12) {
					var51[var12] = var37[var12] + 50;
				}
				var2.newIsaacCipher(var51);
				GameBuild.method5758(6);
			}
			int var21;
			if (loginState == 6 && ((AbstractSocket) (var1)).available() > 0) {
				var14 = ((AbstractSocket) (var1)).readUnsignedByte();
				if (var14 == 61) {
					var21 = ((AbstractSocket) (var1)).available();
					FriendsChat.field4305 = var21 == 1 && ((AbstractSocket) (var1)).readUnsignedByte() == 1;
					GameBuild.method5758(5);
				}
				if (var14 == 21 && gameState == 20) {
					GameBuild.method5758(12);
				} else if (var14 == 2) {
					GameBuild.method5758(14);
				} else if (var14 == 15 && gameState == 40) {
					Client.packetWriter.serverPacketLength = -1;
					GameBuild.method5758(19);
				} else if (var14 == 64) {
					GameBuild.method5758(10);
				} else if (var14 == 23 && field766 < 1) {
					++field766;
					GameBuild.method5758(0);
				} else if (var14 == 29) {
					GameBuild.method5758(17);
				} else {
					if (var14 != 69) {
						WorldMapData_1.getLoginError(var14);
						return;
					}
					GameBuild.method5758(7);
				}
			}
			if (loginState == 7 && ((AbstractSocket) (var1)).available() >= 2) {
				((AbstractSocket) (var1)).read(var2.array, 0, 2);
				var2.offset = 0;
				class135.field1593 = var2.readUnsignedShort();
				GameBuild.method5758(8);
			}
			if (loginState == 8 && ((AbstractSocket) (var1)).available() >= class135.field1593) {
				var2.offset = 0;
				((AbstractSocket) (var1)).read(var2.array, var2.offset, class135.field1593);
				class6[] var40 = new class6[]{ class6.field14 };
				class6 var39 = var40[var2.readUnsignedByte()];
				try {
					class3 var41 = class293.method5614(var39);
					this.field519 = new class7(var2, var41);
					GameBuild.method5758(9);
				} catch (Exception var25) {
					WorldMapData_1.getLoginError(22);
					return;
				}
			}
			if (loginState == 9 && this.field519.method59()) {
				this.field534 = this.field519.method41();
				this.field519.method40();
				this.field519 = null;
				if (this.field534 == null) {
					WorldMapData_1.getLoginError(22);
					return;
				}
				packetWriter.clearBuffer();
				var36 = class228.method4876();
				var36.packetBuffer.writeByte(LoginPacket.field3153.id);
				var36.packetBuffer.writeShort(this.field534.offset);
				var36.packetBuffer.writeBuffer(this.field534);
				packetWriter.addNode(var36);
				packetWriter.flush();
				this.field534 = null;
				GameBuild.method5758(6);
			}
			if (loginState == 10 && ((AbstractSocket) (var1)).available() > 0) {
				class9.field42 = ((AbstractSocket) (var1)).readUnsignedByte();
				GameBuild.method5758(11);
			}
			if (loginState == 11 && ((AbstractSocket) (var1)).available() >= class9.field42) {
				((AbstractSocket) (var1)).read(var2.array, 0, class9.field42);
				var2.offset = 0;
				GameBuild.method5758(6);
			}
			if (loginState == 12 && ((AbstractSocket) (var1)).available() > 0) {
				field711 = (((AbstractSocket) (var1)).readUnsignedByte() + 3) * 60;
				GameBuild.method5758(13);
			}
			if (loginState == 13) {
				field516 = 0;
				HealthBarUpdate.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field711 / 60 + " seconds.");
				if (--field711 <= 0) {
					GameBuild.method5758(0);
				}
			} else {
				if (loginState == 14 && ((AbstractSocket) (var1)).available() >= 1) {
					WorldMapSection2.field2691 = ((AbstractSocket) (var1)).readUnsignedByte();
					GameBuild.method5758(15);
				}
				if (loginState == 15 && ((AbstractSocket) (var1)).available() >= WorldMapSection2.field2691) {
					boolean var50 = ((AbstractSocket) (var1)).readUnsignedByte() == 1;
					((AbstractSocket) (var1)).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var52 = false;
					if (var50) {
						var21 = var2.readByteIsaac() << 24;
						var21 |= var2.readByteIsaac() << 16;
						var21 |= var2.readByteIsaac() << 8;
						var21 |= var2.readByteIsaac();
						String var47 = Login.Login_username;
						var7 = var47.length();
						var16 = 0;
						var9 = 0;
						while (true) {
							if (var9 >= var7) {
								if (class260.clientPreferences.parameters.size() >= 10 && !class260.clientPreferences.parameters.containsKey(var16)) {
									Iterator var49 = class260.clientPreferences.parameters.entrySet().iterator();
									var49.next();
									var49.remove();
								}
								class260.clientPreferences.parameters.put(var16, var21);
								break;
							}
							var16 = (var16 << 5) - var16 + var47.charAt(var9);
							++var9;
						} 
					}
					if (Login_isUsernameRemembered) {
						class260.clientPreferences.method2330(Login.Login_username);
					} else {
						class260.clientPreferences.method2330(((String) (null)));
					}
					class270.savePreferences();
					staffModLevel = ((AbstractSocket) (var1)).readUnsignedByte();
					playerMod = ((AbstractSocket) (var1)).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket) (var1)).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket) (var1)).readUnsignedByte();
					field770 = ((AbstractSocket) (var1)).readUnsignedByte();
					((AbstractSocket) (var1)).read(var2.array, 0, 8);
					var2.offset = 0;
					this.field536 = var2.readLong();
					if (WorldMapSection2.field2691 >= 29) {
						((AbstractSocket) (var1)).read(var2.array, 0, 8);
						var2.offset = 0;
						field614 = var2.readLong();
					}
					((AbstractSocket) (var1)).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var43 = class389.ServerPacket_values();
					var15 = var2.readSmartByteShortIsaac();
					if (var15 < 0 || var15 >= var43.length) {
						throw new IOException(var15 + " " + var2.offset);
					}
					Client.packetWriter.serverPacket = var43[var15];
					Client.packetWriter.serverPacketLength = Client.packetWriter.serverPacket.length;
					((AbstractSocket) (var1)).read(var2.array, 0, 2);
					var2.offset = 0;
					Client.packetWriter.serverPacketLength = var2.readUnsignedShort();
					try {
						class27.method378(class329.client, "zap");
					} catch (Throwable var24) {
					}
					GameBuild.method5758(16);
				}
				if (loginState == 16) {
					if (((AbstractSocket) (var1)).available() >= Client.packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket) (var1)).read(var2.array, 0, Client.packetWriter.serverPacketLength);
						timer.method6555();
						HealthBarUpdate.method2274();
						class134.updatePlayer(var2);
						WorldMapCacheName.field2868 = -1;
						NPC.loadRegions(false, var2);
						Client.packetWriter.serverPacket = null;
					}
				} else {
					if (loginState == 17 && ((AbstractSocket) (var1)).available() >= 2) {
						var2.offset = 0;
						((AbstractSocket) (var1)).read(var2.array, 0, 2);
						var2.offset = 0;
						UserList.field4331 = var2.readUnsignedShort();
						GameBuild.method5758(18);
					}
					if (loginState == 18 && ((AbstractSocket) (var1)).available() >= UserList.field4331) {
						var2.offset = 0;
						((AbstractSocket) (var1)).read(var2.array, 0, UserList.field4331);
						var2.offset = 0;
						String var45 = var2.readStringCp1252NullTerminated();
						String var42 = var2.readStringCp1252NullTerminated();
						String var46 = var2.readStringCp1252NullTerminated();
						HealthBarUpdate.setLoginResponseString(var45, var42, var46);
						class82.updateGameState(10);
						if (field741.method8024()) {
							UserComparator6.method2701(9);
						}
					}
					if (loginState != 19) {
						++field516;
						if (field516 > 2000) {
							if (field766 < 1) {
								if (class117.currentPort == class18.worldPort) {
									class117.currentPort = DbRowType.js5Port;
								} else {
									class117.currentPort = class18.worldPort;
								}
								++field766;
								GameBuild.method5758(0);
							} else {
								WorldMapData_1.getLoginError(-3);
							}
						}
					} else {
						if (Client.packetWriter.serverPacketLength == -1) {
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
							var14 = Client.packetWriter.serverPacketLength;
							timer.method6557();
							packetWriter.clearBuffer();
							Client.packetWriter.packetBuffer.offset = 0;
							Client.packetWriter.serverPacket = null;
							Client.packetWriter.field1339 = null;
							Client.packetWriter.field1338 = null;
							Client.packetWriter.field1333 = null;
							Client.packetWriter.serverPacketLength = 0;
							Client.packetWriter.field1332 = 0;
							rebootTimer = 0;
							menuOptionsCount = 0;
							isMenuOpen = false;
							minimapState = 0;
							destinationX = 0;
							for (var21 = 0; var21 < 2048; ++var21) {
								players[var21] = null;
							}
							class28.localPlayer = null;
							for (var21 = 0; var21 < Client.npcs.length; ++var21) {
								NPC var48 = npcs[var21];
								if (var48 != null) {
									var48.targetIndex = -1;
									var48.false0 = false;
								}
							}
							class127.method2888();
							class82.updateGameState(30);
							for (var21 = 0; var21 < 100; ++var21) {
								field610[var21] = true;
							}
							PacketBufferNode var44 = class433.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
							var44.packetBuffer.writeByte(MouseRecorder.getWindowedMode());
							var44.packetBuffer.writeShort(class352.canvasWidth);
							var44.packetBuffer.writeShort(class228.canvasHeight);
							packetWriter.addNode(var44);
							class134.updatePlayer(var2);
							if (var14 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var31) {
			if (field766 < 1) {
				if (class117.currentPort == class18.worldPort) {
					class117.currentPort = DbRowType.js5Port;
				} else {
					class117.currentPort = class18.worldPort;
				}
				++field766;
				GameBuild.method5758(0);
			} else {
				WorldMapData_1.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "88")
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
			UserComparator4.method2654();
		} else {
			if (!isMenuOpen) {
				UserComparator9.addCancelMenuEntry();
			}
			int var1;
			for (var1 = 0; var1 < 100 && this.method1386(packetWriter); ++var1) {
			}
			if (gameState == 30) {
				int var2;
				PacketBufferNode var14;
				while (ObjectComposition.method3699()) {
					var14 = class433.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					class259.performReflectionCheck(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				} 
				if (Client.timer.field4246) {
					var14 = class433.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					var2 = var14.packetBuffer.offset;
					timer.write(var14.packetBuffer);
					var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
					timer.method6574();
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
				synchronized(class309.mouseRecorder.lock) {
					if (!field510) {
						class309.mouseRecorder.index = 0;
					} else if (MouseHandler.MouseHandler_lastButton != 0 || class309.mouseRecorder.index >= 40) {
						PacketBufferNode var15 = null;
						var3 = 0;
						var4 = 0;
						var5 = 0;
						var6 = 0;
						for (var7 = 0; var7 < class309.mouseRecorder.index && (var15 == null || var15.packetBuffer.offset - var3 < 246); ++var7) {
							var4 = var7;
							var8 = class309.mouseRecorder.ys[var7];
							if (var8 < -1) {
								var8 = -1;
							} else if (var8 > 65534) {
								var8 = 65534;
							}
							var9 = class309.mouseRecorder.xs[var7];
							if (var9 < -1) {
								var9 = -1;
							} else if (var9 > 65534) {
								var9 = 65534;
							}
							if (var9 != field548 || var8 != field497) {
								if (var15 == null) {
									var15 = class433.getPacketBufferNode(ClientPacket.field2954, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeByte(0);
									var3 = var15.packetBuffer.offset;
									PacketBuffer var10000 = var15.packetBuffer;
									var10000.offset += 2;
									var5 = 0;
									var6 = 0;
								}
								if (-1L != field723) {
									var10 = var9 - field548;
									var11 = var8 - field497;
									var12 = ((int) ((class309.mouseRecorder.millis[var7] - field723) / 20L));
									var5 = ((int) (((long) (var5)) + (class309.mouseRecorder.millis[var7] - field723) % 20L));
								} else {
									var10 = var9;
									var11 = var8;
									var12 = Integer.MAX_VALUE;
								}
								field548 = var9;
								field497 = var8;
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
									var15.packetBuffer.writeShort((var12 & 8191) + '');
									if (var9 != -1 && var8 != -1) {
										var15.packetBuffer.writeInt(var9 | var8 << 16);
									} else {
										var15.packetBuffer.writeInt(Integer.MIN_VALUE);
									}
								}
								++var6;
								field723 = class309.mouseRecorder.millis[var7];
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
						if (var4 >= class309.mouseRecorder.index) {
							class309.mouseRecorder.index = 0;
						} else {
							MouseRecorder var44 = class309.mouseRecorder;
							var44.index -= var4;
							System.arraycopy(class309.mouseRecorder.xs, var4, class309.mouseRecorder.xs, 0, class309.mouseRecorder.index);
							System.arraycopy(class309.mouseRecorder.ys, var4, class309.mouseRecorder.ys, 0, class309.mouseRecorder.index);
							System.arraycopy(class309.mouseRecorder.millis, var4, class309.mouseRecorder.millis, 0, class309.mouseRecorder.index);
						}
					}
				}
				PacketBufferNode var18;
				if (MouseHandler.MouseHandler_lastButton == 1 || !ObjectSound.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
					long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
					if (var16 > 32767L) {
						var16 = 32767L;
					}
					mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
					var3 = MouseHandler.MouseHandler_lastPressedY;
					if (var3 < 0) {
						var3 = 0;
					} else if (var3 > class228.canvasHeight) {
						var3 = class228.canvasHeight;
					}
					var4 = MouseHandler.MouseHandler_lastPressedX;
					if (var4 < 0) {
						var4 = 0;
					} else if (var4 > class352.canvasWidth) {
						var4 = class352.canvasWidth;
					}
					var5 = ((int) (var16));
					var18 = class433.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, Client.packetWriter.isaacCipher);
					var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
					var18.packetBuffer.writeShort(var4);
					var18.packetBuffer.writeShort(var3);
					packetWriter.addNode(var18);
				}
				if (KeyHandler.field131 > 0) {
					var14 = class433.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(0);
					var2 = var14.packetBuffer.offset;
					long var19 = class131.method2916();
					for (var5 = 0; var5 < KeyHandler.field131; ++var5) {
						long var21 = var19 - field725;
						if (var21 > 16777215L) {
							var21 = 16777215L;
						}
						field725 = var19;
						var14.packetBuffer.writeByteAdd(KeyHandler.field146[var5]);
						var14.packetBuffer.writeMediumLE(((int) (var21)));
					}
					var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
					packetWriter.addNode(var14);
				}
				if (field748 > 0) {
					--field748;
				}
				if (KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97] || KeyHandler.KeyHandler_pressedKeys[98] || KeyHandler.KeyHandler_pressedKeys[99]) {
					field481 = true;
				}
				if (field481 && field748 <= 0) {
					field748 = 20;
					field481 = false;
					var14 = class433.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeShort(camAngleY);
					var14.packetBuffer.writeShortLE(camAngleX);
					packetWriter.addNode(var14);
				}
				if (class125.hasFocus && !hadFocus) {
					hadFocus = true;
					var14 = class433.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(1);
					packetWriter.addNode(var14);
				}
				if (!class125.hasFocus && hadFocus) {
					hadFocus = false;
					var14 = class433.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(0);
					packetWriter.addNode(var14);
				}
				if (class344.worldMap != null) {
					class344.worldMap.method7224();
				}
				class142.method3068();
				if (class122.field1499) {
					for (var1 = 0; var1 < Players.Players_count; ++var1) {
						Player var35 = players[Players.Players_indices[var1]];
						var35.method2215();
					}
					class122.field1499 = false;
				}
				if (field518 != FriendSystem.Client_plane) {
					field518 = FriendSystem.Client_plane;
					var1 = FriendSystem.Client_plane;
					int[] var37 = SceneTilePaint.sceneMinimapSprite.pixels;
					var3 = var37.length;
					for (var4 = 0; var4 < var3; ++var4) {
						var37[var4] = 0;
					}
					for (var4 = 1; var4 < 103; ++var4) {
						var5 = (103 - var4) * 2048 + 24628;
						for (var6 = 1; var6 < 103; ++var6) {
							if ((Tiles.Tiles_renderFlags[var1][var6][var4] & 24) == 0) {
								Decimator.scene.drawTileMinimap(var37, var5, 512, var1, var6, var4);
							}
							if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var6][var4] & 8) != 0) {
								Decimator.scene.drawTileMinimap(var37, var5, 512, var1 + 1, var6, var4);
							}
							var5 += 4;
						}
					}
					var4 = (238 + ((int) (Math.random() * 20.0)) - 10 << 16) + (238 + ((int) (Math.random() * 20.0)) - 10 << 8) + (238 + ((int) (Math.random() * 20.0)) - 10);
					var5 = 238 + ((int) (Math.random() * 20.0)) - 10 << 16;
					SceneTilePaint.sceneMinimapSprite.setRaster();
					for (var6 = 1; var6 < 103; ++var6) {
						for (var7 = 1; var7 < 103; ++var7) {
							if ((Tiles.Tiles_renderFlags[var1][var7][var6] & 24) == 0) {
								AbstractWorldMapData.drawObject(var1, var7, var6, var4, var5);
							}
							if (var1 < 3 && (Tiles.Tiles_renderFlags[var1 + 1][var7][var6] & 8) != 0) {
								AbstractWorldMapData.drawObject(var1 + 1, var7, var6, var4, var5);
							}
						}
					}
					mapIconCount = 0;
					for (var6 = 0; var6 < 104; ++var6) {
						for (var7 = 0; var7 < 104; ++var7) {
							long var23 = Decimator.scene.getFloorDecorationTag(FriendSystem.Client_plane, var6, var7);
							if (var23 != 0L) {
								var10 = class141.Entity_unpackID(var23);
								var11 = WorldMapDecoration.getObjectDefinition(var10).mapIconId;
								if (var11 >= 0 && TileItem.WorldMapElement_get(var11).field1836) {
									mapIcons[mapIconCount] = TileItem.WorldMapElement_get(var11).getSpriteBool(false);
									mapIconXs[mapIconCount] = var6;
									mapIconYs[mapIconCount] = var7;
									++mapIconCount;
								}
							}
						}
					}
					class268.rasterProvider.apply();
				}
				if (gameState == 30) {
					for (PendingSpawn var33 = ((PendingSpawn) (pendingSpawns.last())); var33 != null; var33 = ((PendingSpawn) (pendingSpawns.previous()))) {
						if (var33.hitpoints > 0) {
							--var33.hitpoints;
						}
						if (var33.hitpoints == 0) {
							if (var33.objectId < 0 || InvDefinition.method3337(var33.objectId, var33.field1120)) {
								class1.addPendingSpawnToScene(var33.plane, var33.type, var33.x, var33.y, var33.objectId, var33.field1122, var33.field1120);
								var33.remove();
							}
						} else {
							if (var33.delay > 0) {
								--var33.delay;
							}
							if (var33.delay == 0 && var33.x >= 1 && var33.y >= 1 && var33.x <= 102 && var33.y <= 102 && (var33.id < 0 || InvDefinition.method3337(var33.id, var33.field1123))) {
								class1.addPendingSpawnToScene(var33.plane, var33.type, var33.x, var33.y, var33.id, var33.orientation, var33.field1123);
								var33.delay = -1;
								if (var33.objectId == var33.id && var33.objectId == -1) {
									var33.remove();
								} else if (var33.objectId == var33.id && var33.orientation == var33.field1122 && var33.field1123 == var33.field1120) {
									var33.remove();
								}
							}
						}
					}
					SecureRandomCallable.method2125();
					++Client.packetWriter.field1332;
					if (Client.packetWriter.field1332 > 750) {
						UserComparator4.method2654();
					} else {
						InvDefinition.method3336();
						for (var1 = 0; var1 < npcCount; ++var1) {
							var2 = npcIndices[var1];
							NPC var25 = npcs[var2];
							if (var25 != null) {
								AbstractByteArrayCopier.updateActorSequence(var25, var25.definition.size);
							}
						}
						int[] var34 = Players.Players_indices;
						for (var2 = 0; var2 < Players.Players_count; ++var2) {
							Player var40 = players[var34[var2]];
							if (var40 != null && var40.overheadTextCyclesRemaining > 0) {
								--var40.overheadTextCyclesRemaining;
								if (var40.overheadTextCyclesRemaining == 0) {
									var40.overheadText = null;
								}
							}
						}
						for (var2 = 0; var2 < npcCount; ++var2) {
							var3 = npcIndices[var2];
							NPC var26 = npcs[var3];
							if (var26 != null && var26.overheadTextCyclesRemaining > 0) {
								--var26.overheadTextCyclesRemaining;
								if (var26.overheadTextCyclesRemaining == 0) {
									var26.overheadText = null;
								}
							}
						}
						++field744;
						if (mouseCrossColor != 0) {
							mouseCrossState = mouseCrossState * 400 + 400;
							if (mouseCrossState * 20 >= 400) {
								mouseCrossColor = 0;
							}
						}
						if (class121.field1488 != null) {
							++field601;
							if (field601 >= 15) {
								class220.invalidateWidget(class121.field1488);
								class121.field1488 = null;
							}
						}
						Widget var36 = FontName.mousedOverWidgetIf1;
						Widget var38 = class10.field59;
						FontName.mousedOverWidgetIf1 = null;
						class10.field59 = null;
						draggedOnWidget = null;
						field549 = false;
						field675 = false;
						field722 = 0;
						while (WorldMapSectionType.isKeyDown() && field722 < 128) {
							if (staffModLevel >= 2 && KeyHandler.KeyHandler_pressedKeys[82] && SequenceDefinition.field2176 == 66) {
								String var41 = WorldMapRegion.method4785();
								class329.client.method418(var41);
							} else if (oculusOrbState != 1 || Clock.field1797 <= 0) {
								field724[field722] = SequenceDefinition.field2176;
								field626[field722] = Clock.field1797;
								++field722;
							}
						} 
						boolean var31 = staffModLevel >= 2;
						PacketBufferNode var27;
						if (var31 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81] && mouseWheelRotation != 0) {
							var4 = class28.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}
							if (var4 != class28.localPlayer.plane) {
								var5 = class28.localPlayer.pathX[0] + class300.baseX * 8;
								var6 = class28.localPlayer.pathY[0] + Message.baseY * 64;
								var27 = class433.getPacketBufferNode(ClientPacket.CLICKWORLDMAP_TELEPORT, Client.packetWriter.isaacCipher);
								var27.packetBuffer.writeByteAdd(var4);
								var27.packetBuffer.writeIntIME(0);
								var27.packetBuffer.writeShortAddLE(var6);
								var27.packetBuffer.writeShortAddLE(var5);
								packetWriter.addNode(var27);
							}
							mouseWheelRotation = 0;
						}
						if (rootInterface != -1) {
							MouseHandler.updateRootInterface(rootInterface, 0, 0, class352.canvasWidth, class228.canvasHeight, 0, 0);
						}
						++cycleCntr;
						while (true) {
							Widget var28;
							Widget var39;
							ScriptEvent var42;
							do {
								var42 = ((ScriptEvent) (field758.removeLast()));
								if (var42 == null) {
									while (true) {
										do {
											var42 = ((ScriptEvent) (field702.removeLast()));
											if (var42 == null) {
												while (true) {
													do {
														var42 = ((ScriptEvent) (scriptEvents.removeLast()));
														if (var42 == null) {
															this.menu();
															if (class344.worldMap != null) {
																class344.worldMap.method7249(FriendSystem.Client_plane, class300.baseX * 8 + (class28.localPlayer.x >> 7), Message.baseY * 64 + (class28.localPlayer.y >> 7), false);
																class344.worldMap.loadCache();
															}
															if (clickedWidget != null) {
																this.method1298();
															}
															if (class115.dragInventoryWidget != null) {
																class220.invalidateWidget(class115.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field607) {
																		if (NetCache.hoveredItemContainer == class115.dragInventoryWidget && dragItemSlotSource != dragItemSlotDestination) {
																			Widget var43 = class115.dragInventoryWidget;
																			byte var32 = 0;
																			if (field662 == 1 && var43.contentType == 206) {
																				var32 = 1;
																			}
																			if (var43.itemIds[dragItemSlotDestination] <= 0) {
																				var32 = 0;
																			}
																			if (class7.method51(class67.getWidgetFlags(var43))) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;
																				var43.itemIds[var7] = var43.itemIds[var6];
																				var43.itemQuantities[var7] = var43.itemQuantities[var6];
																				var43.itemIds[var6] = -1;
																				var43.itemQuantities[var6] = 0;
																			} else if (var32 == 1) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;
																				while (var6 != var7) {
																					if (var6 > var7) {
																						var43.swapItems(var6 - 1, var6);
																						--var6;
																					} else if (var6 < var7) {
																						var43.swapItems(var6 + 1, var6);
																						++var6;
																					}
																				} 
																			} else {
																				var43.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}
																			var18 = class433.getPacketBufferNode(ClientPacket.IF_BUTTOND, Client.packetWriter.isaacCipher);
																			var18.packetBuffer.writeIntLE(class115.dragInventoryWidget.id);
																			var18.packetBuffer.writeShortAdd(dragItemSlotDestination);
																			var18.packetBuffer.writeByteSub(var32);
																			var18.packetBuffer.writeShort(dragItemSlotSource);
																			packetWriter.addNode(var18);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		var4 = draggedWidgetX;
																		var5 = draggedWidgetY;
																		ArchiveDiskAction.method5787(class136.tempMenuAction, var4, var5);
																		class136.tempMenuAction = null;
																	}
																	field601 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	class115.dragInventoryWidget = null;
																} else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
																	field607 = true;
																}
															}
															if (Scene.shouldSendWalk()) {
																var4 = Scene.Scene_selectedX;
																var5 = Scene.Scene_selectedY;
																var18 = class433.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, Client.packetWriter.isaacCipher);
																var18.packetBuffer.writeByte(5);
																var18.packetBuffer.writeShortAddLE(Message.baseY * 64 + var5);
																var18.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1 : 0);
																var18.packetBuffer.writeShortAdd(class300.baseX * 8 + var4);
																packetWriter.addNode(var18);
																Scene.method4203();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var4;
																destinationY = var5;
															}
															if (var36 != FontName.mousedOverWidgetIf1) {
																if (var36 != null) {
																	class220.invalidateWidget(var36);
																}
																if (FontName.mousedOverWidgetIf1 != null) {
																	class220.invalidateWidget(FontName.mousedOverWidgetIf1);
																}
															}
															if (var38 != class10.field59 && field535 == field631) {
																if (var38 != null) {
																	class220.invalidateWidget(var38);
																}
																if (class10.field59 != null) {
																	class220.invalidateWidget(class10.field59);
																}
															}
															if (class10.field59 != null) {
																if (field535 < field631) {
																	++field535;
																	if (field535 == field631) {
																		class220.invalidateWidget(class10.field59);
																	}
																}
															} else if (field535 > 0) {
																--field535;
															}
															class363.method6621();
															if (field745) {
																class116.method2763();
															} else if (isCameraLocked) {
																var4 = class457.field4811 * 16384 + 64;
																var5 = NPC.field1261 * 16384 + 64;
																var6 = SecureRandomFuture.getTileHeight(var4, var5, FriendSystem.Client_plane) - ScriptEvent.field1052;
																FriendSystem.method1764(var4, var6, var5);
																var4 = WorldMapLabelSize.field2673 * 16384 + 64;
																var5 = LoginScreenAnimation.field1233 * 128 + 64;
																var6 = SecureRandomFuture.getTileHeight(var4, var5, FriendSystem.Client_plane) - UrlRequest.field1350;
																var7 = var4 - WorldMapLabelSize.cameraX;
																var8 = var6 - class123.cameraY;
																var9 = var5 - Widget.cameraZ;
																var10 = ((int) (Math.sqrt(((double) (var7 * var7 + var9 * var9)))));
																var11 = ((int) (Math.atan2(((double) (var8)), ((double) (var10))) * 325.9490051269531)) & 2047;
																var12 = ((int) (Math.atan2(((double) (var7)), ((double) (var9))) * -325.9490051269531)) & 2047;
																WorldMapSectionType.method4927(var11, var12);
															}
															for (var4 = 0; var4 < 5; ++var4) {
																int var10002 = field653[var4]++;
															}
															class151.varcs.tryWrite();
															var4 = class268.method5213();
															var5 = KeyHandler.KeyHandler_idleCycles;
															if (var4 > 15000 && var5 > 15000) {
																logoutTimer = 250;
																MouseHandler.MouseHandler_idleCycles = 14500;
																var27 = class433.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, Client.packetWriter.isaacCipher);
																packetWriter.addNode(var27);
															}
															MusicPatchPcmStream.friendSystem.processFriendUpdates();
															++Client.packetWriter.pendingWrites;
															if (Client.packetWriter.pendingWrites > 50) {
																var27 = class433.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
																packetWriter.addNode(var27);
															}
															try {
																packetWriter.flush();
															} catch (IOException var29) {
																UserComparator4.method2654();
															}
															return;
														}
														var28 = var42.widget;
														if (var28.childIndex < 0) {
															break;
														}
														var39 = FloorUnderlayDefinition.getWidget(var28.parentId);
													} while (var39 == null || var39.children == null || var28.childIndex >= var39.children.length || var28 != var39.children[var28.childIndex] );
													class17.runScriptEvent(var42);
												} 
											}
											var28 = var42.widget;
											if (var28.childIndex < 0) {
												break;
											}
											var39 = FloorUnderlayDefinition.getWidget(var28.parentId);
										} while (var39 == null || var39.children == null || var28.childIndex >= var39.children.length || var28 != var39.children[var28.childIndex] );
										class17.runScriptEvent(var42);
									} 
								}
								var28 = var42.widget;
								if (var28.childIndex < 0) {
									break;
								}
								var39 = FloorUnderlayDefinition.getWidget(var28.parentId);
							} while (var39 == null || var39.children == null || var28.childIndex >= var39.children.length || var28 != var39.children[var28.childIndex] );
							class17.runScriptEvent(var42);
						} 
					}
				}
			}
		}
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "2")
	@Export("resizeJS")
	void resizeJS() {
		int var1 = class352.canvasWidth;
		int var2 = class228.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}
		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}
		if (class260.clientPreferences != null) {
			try {
				class27.method379(class329.client, "resize", new Object[]{ MouseRecorder.getWindowedMode() });
			} catch (Throwable var4) {
			}
		}
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1043847640")
	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		if (rootInterface != -1) {
			ReflectionCheck.method610(rootInterface);
		}
		int var1;
		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field610[var1]) {
				field691[var1] = true;
			}
			field550[var1] = field610[var1];
			field610[var1] = false;
		}
		field705 = cycle;
		viewportX = -1;
		viewportY = -1;
		NetCache.hoveredItemContainer = null;
		if (rootInterface != -1) {
			rootWidgetCount = 0;
			WorldMapSection0.drawWidgets(rootInterface, 0, 0, class352.canvasWidth, class228.canvasHeight, 0, 0, -1);
		}
		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				MouseHandler.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
			if (mouseCrossColor == 2) {
				MouseHandler.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}
		if (!isMenuOpen) {
			if (viewportX != -1) {
				VarbitComposition.method3557(viewportX, viewportY);
			}
		} else {
			ScriptEvent.method2169();
		}
		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field550[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field691[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}
		var1 = FriendSystem.Client_plane;
		int var2 = class28.localPlayer.x;
		int var3 = class28.localPlayer.y;
		int var4 = field744;
		for (ObjectSound var5 = ((ObjectSound) (ObjectSound.objectSounds.last())); var5 != null; var5 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if (var5.soundEffectId != -1 || var5.soundEffectIds != null) {
				int var6 = 0;
				if (var2 > var5.maxX * 16384) {
					var6 += var2 - var5.maxX * 16384;
				} else if (var2 < var5.x * 16384) {
					var6 += var5.x * 16384 - var2;
				}
				if (var3 > var5.maxY * 16384) {
					var6 += var3 - var5.maxY * 16384;
				} else if (var3 < var5.y * 128) {
					var6 += var5.y * 128 - var3;
				}
				if (var6 - 64 <= var5.field814 && class260.clientPreferences.method2329() != 0 && var1 == var5.plane) {
					var6 -= 64;
					if (var6 < 0) {
						var6 = 0;
					}
					int var7 = (var5.field814 - var6) * class260.clientPreferences.method2329() / var5.field814;
					Object var10000;
					if (var5.stream1 == null) {
						if (var5.soundEffectId >= 0) {
							var10000 = null;
							SoundEffect var8 = SoundEffect.readSoundEffect(WorldMapArchiveLoader.archive4, var5.soundEffectId, 0);
							if (var8 != null) {
								RawSound var9 = var8.toRawSound().resample(Tiles.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
								var10.setNumLoops(-1);
								StructComposition.pcmStreamMixer.addSubStream(var10);
								var5.stream1 = var10;
							}
						}
					} else {
						var5.stream1.method798(var7);
					}
					if (var5.stream2 == null) {
						if (var5.soundEffectIds != null && (var5.field818 -= var4) <= 0) {
							int var12 = ((int) (Math.random() * ((double) (var5.soundEffectIds.length))));
							var10000 = null;
							SoundEffect var13 = SoundEffect.readSoundEffect(WorldMapArchiveLoader.archive4, var5.soundEffectIds[var12], 0);
							if (var13 != null) {
								RawSound var14 = var13.toRawSound().resample(Tiles.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var14, 100, var7);
								var11.setNumLoops(0);
								StructComposition.pcmStreamMixer.addSubStream(var11);
								var5.stream2 = var11;
								var5.field818 = var5.field817 + ((int) (Math.random() * ((double) (var5.field823 - var5.field817))));
							}
						}
					} else {
						var5.stream2.method798(var7);
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
		field744 = 0;
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(descriptor = "(Lcx;II)Z", garbageValue = "-563767291")
	boolean method1128(PacketWriter var1, int var2) {
		if (var1.serverPacketLength == 0) {
			class13.friendsChat = null;
		} else {
			if (class13.friendsChat == null) {
				class13.friendsChat = new FriendsChat(class162.loginType, class329.client);
			}
			class13.friendsChat.method6655(var1.packetBuffer, var2);
		}
		field612 = cycleCntr;
		ClanChannelMember.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(descriptor = "(Lcx;I)Z", garbageValue = "-852059450")
	boolean method1129(PacketWriter var1) {
		if (class13.friendsChat != null) {
			class13.friendsChat.method6656(var1.packetBuffer);
		}
		field612 = cycleCntr;
		ClanChannelMember.ClanChat_inClanChat = true;
		var1.serverPacket = null;
		return true;
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(descriptor = "(Lcx;I)Z", garbageValue = "1555479176")
	final boolean method1386(PacketWriter var1) {
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
					if (var1.field1328) {
						if (!var2.isAvailable(1)) {
							return false;
						}
						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1332 = 0;
						var1.field1328 = false;
					}
					var3.offset = 0;
					if (var3.method7695()) {
						if (!var2.isAvailable(1)) {
							return false;
						}
						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1332 = 0;
					}
					var1.field1328 = true;
					ServerPacket[] var4 = class389.ServerPacket_values();
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
				var1.field1332 = 0;
				timer.method6552();
				var1.field1333 = var1.field1338;
				var1.field1338 = var1.field1339;
				var1.field1339 = var1.serverPacket;
				if (ServerPacket.field3108 == var1.serverPacket) {
					return this.method1128(var1, 1);
				}
				if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
					if (rootInterface != -1) {
						class220.runIntfCloseListeners(rootInterface, 0);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3073 == var1.serverPacket) {
					ClanChannelMember.method2908(class263.field3021);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3077 == var1.serverPacket) {
					class20.method295(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}
				int var20;
				if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var6 = UserComparator6.getGcDuration();
					PacketBufferNode var60 = class433.getPacketBufferNode(ClientPacket.PING_STATISTICS, Client.packetWriter.isaacCipher);
					var60.packetBuffer.writeByteNeg(var6);
					var60.packetBuffer.writeShortAddLE(var20);
					var60.packetBuffer.writeIntLE(var5);
					var60.packetBuffer.writeByte(GameEngine.fps);
					packetWriter.addNode(var60);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3131 == var1.serverPacket) {
					ClanChannelMember.method2908(class263.field3024);
					var1.serverPacket = null;
					return true;
				}
				GameObject var14;
				int var15;
				int var16;
				String var24;
				byte var80;
				if (ServerPacket.field3097 == var1.serverPacket) {
					var80 = var3.readByte();
					var21 = var3.readStringCp1252NullTerminated();
					long var22 = ((long) (var3.readUnsignedShort()));
					long var8 = ((long) (var3.readMedium()));
					PlayerType var61 = ((PlayerType) (class271.findEnumerated(PlayerType_values(), var3.readUnsignedByte())));
					long var11 = (var22 << 32) + var8;
					boolean var65 = false;
					var14 = null;
					ClanChannel var67 = (var80 >= 0) ? currentClanChannels[var80] : class17.guestClanChannel;
					if (var67 == null) {
						var65 = true;
					} else {
						var15 = 0;
						while (true) {
							if (var15 >= 100) {
								if (var61.isUser && MusicPatchPcmStream.friendSystem.isIgnored(new Username(var21, class162.loginType))) {
									var65 = true;
								}
								break;
							}
							if (var11 == crossWorldMessageIds[var15]) {
								var65 = true;
								break;
							}
							++var15;
						} 
					}
					if (!var65) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var11;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var24 = AbstractFont.escapeBrackets(CollisionMap.method3870(var3));
						var16 = (var80 >= 0) ? 41 : 44;
						if (var61.modIcon != -1) {
							Interpreter.addChatMessage(var16, UrlRequester.method2619(var61.modIcon) + var21, var24, var67.name);
						} else {
							Interpreter.addChatMessage(var16, var21, var24, var67.name);
						}
					}
					var1.serverPacket = null;
					return true;
				}
				int var9;
				int var25;
				int var26;
				int var27;
				int var28;
				if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
					var25 = var3.readUnsignedShort();
					var26 = var3.readUnsignedByte();
					var6 = var3.readMedium();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var27 = var20 + (var6 >> 4 & 7);
					var28 = var5 + (var6 & 7);
					var9 = var3.readUnsignedShort();
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
						var27 = var27 * 128 + 64;
						var28 = var28 * 128 + 64;
						GraphicsObject var62 = new GraphicsObject(var9, FriendSystem.Client_plane, var27, var28, SecureRandomFuture.getTileHeight(var27, var28, FriendSystem.Client_plane) - var26, var25, cycle);
						graphicsObjects.addFirst(var62);
					}
					var1.serverPacket = null;
					return true;
				}
				long var29;
				long var31;
				long var33;
				long var36;
				String var50;
				if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var29 = var3.readLong();
					var31 = ((long) (var3.readUnsignedShort()));
					var33 = ((long) (var3.readMedium()));
					PlayerType var81 = ((PlayerType) (class271.findEnumerated(PlayerType_values(), var3.readUnsignedByte())));
					var36 = (var31 << 32) + var33;
					boolean var84 = false;
					for (var15 = 0; var15 < 100; ++var15) {
						if (var36 == crossWorldMessageIds[var15]) {
							var84 = true;
							break;
						}
					}
					if (var81.isUser && MusicPatchPcmStream.friendSystem.isIgnored(new Username(var50, class162.loginType))) {
						var84 = true;
					}
					if (!var84 && field542 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var36;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var24 = AbstractFont.escapeBrackets(class4.method13(CollisionMap.method3870(var3)));
						if (var81.modIcon != -1) {
							Interpreter.addChatMessage(9, UrlRequester.method2619(var81.modIcon) + var50, var24, Script.base37DecodeLong(var29));
						} else {
							Interpreter.addChatMessage(9, var50, var24, Script.base37DecodeLong(var29));
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3141 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readInt();
					var6 = var3.readUnsignedShort();
					if (var6 == 65535) {
						var6 = -1;
					}
					var27 = var3.readUnsignedShortLE();
					if (var27 == 65535) {
						var27 = -1;
					}
					for (var28 = var27; var28 <= var6; ++var28) {
						var33 = ((long) (var28)) + (((long) (var20)) << 32);
						Node var35 = widgetFlags.get(var33);
						if (var35 != null) {
							var35.remove();
						}
						widgetFlags.put(new IntegerNode(var5), var33);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3049 == var1.serverPacket) {
					ClanChannelMember.method2908(class263.field3027);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3126 == var1.serverPacket) {
					if (SoundCache.field327 == null) {
						SoundCache.field327 = new class392(class6.HitSplatDefinition_cached);
					}
					class451 var53 = class6.HitSplatDefinition_cached.method7104(var3);
					SoundCache.field327.field4434.vmethod7481(var53.field4771, var53.field4770);
					field689[++field690 - 1 & 31] = var53.field4771;
					var1.serverPacket = null;
					return true;
				}
				int var13;
				int var39;
				if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
					var9 = var3.readUnsignedByteSub();
					var26 = var9 >> 2;
					var25 = var9 & 3;
					var39 = field556[var26];
					var6 = var3.readMediumME();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var27 = var20 + (var6 >> 4 & 7);
					var28 = var5 + (var6 & 7);
					var13 = var3.readUnsignedShortLE();
					if (var27 >= 0 && var28 >= 0 && var27 < 103 && var28 < 103) {
						if (var39 == 0) {
							BoundaryObject var66 = Decimator.scene.method4129(FriendSystem.Client_plane, var27, var28);
							if (var66 != null) {
								var15 = class141.Entity_unpackID(var66.tag);
								if (var26 == 2) {
									var66.renderable1 = new DynamicObject(var15, 2, var25 + 4, FriendSystem.Client_plane, var27, var28, var13, false, var66.renderable1);
									var66.renderable2 = new DynamicObject(var15, 2, var25 + 1 & 3, FriendSystem.Client_plane, var27, var28, var13, false, var66.renderable2);
								} else {
									var66.renderable1 = new DynamicObject(var15, var26, var25, FriendSystem.Client_plane, var27, var28, var13, false, var66.renderable1);
								}
							}
						} else if (var39 == 1) {
							WallDecoration var64 = Decimator.scene.method4130(FriendSystem.Client_plane, var27, var28);
							if (var64 != null) {
								var15 = class141.Entity_unpackID(var64.tag);
								if (var26 != 4 && var26 != 5) {
									if (var26 == 6) {
										var64.renderable1 = new DynamicObject(var15, 4, var25 + 4, FriendSystem.Client_plane, var27, var28, var13, false, var64.renderable1);
									} else if (var26 == 7) {
										var64.renderable1 = new DynamicObject(var15, 4, (var25 + 2 & 3) + 4, FriendSystem.Client_plane, var27, var28, var13, false, var64.renderable1);
									} else if (var26 == 8) {
										var64.renderable1 = new DynamicObject(var15, 4, var25 + 4, FriendSystem.Client_plane, var27, var28, var13, false, var64.renderable1);
										var64.renderable2 = new DynamicObject(var15, 4, (var25 + 2 & 3) + 4, FriendSystem.Client_plane, var27, var28, var13, false, var64.renderable2);
									}
								} else {
									var64.renderable1 = new DynamicObject(var15, 4, var25, FriendSystem.Client_plane, var27, var28, var13, false, var64.renderable1);
								}
							}
						} else if (var39 == 2) {
							var14 = Decimator.scene.getGameObject(FriendSystem.Client_plane, var27, var28);
							if (var26 == 11) {
								var26 = 10;
							}
							if (var14 != null) {
								var14.renderable = new DynamicObject(class141.Entity_unpackID(var14.tag), var26, var25, FriendSystem.Client_plane, var27, var28, var13, false, var14.renderable);
							}
						} else if (var39 == 3) {
							FloorDecoration var63 = Decimator.scene.getFloorDecoration(FriendSystem.Client_plane, var27, var28);
							if (var63 != null) {
								var63.renderable = new DynamicObject(class141.Entity_unpackID(var63.tag), 22, var25, FriendSystem.Client_plane, var27, var28, var13, false, var63.renderable);
							}
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3087 == var1.serverPacket) {
					MusicPatchPcmStream.friendSystem.method1733();
					field750 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				Widget var68;
				if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var68 = FloorUnderlayDefinition.getWidget(var20);
					var68.modelType = 3;
					var68.modelId = class28.localPlayer.appearance.getChatHeadId();
					class220.invalidateWidget(var68);
					var1.serverPacket = null;
					return true;
				}
				Widget var40;
				if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < -70000) {
						var5 += 32768;
					}
					if (var20 >= 0) {
						var40 = FloorUnderlayDefinition.getWidget(var20);
					} else {
						var40 = null;
					}
					for (; var3.offset < var1.serverPacketLength; WorldMapSection1.itemContainerSetItem(var5, var27, var28 - 1, var9)) {
						var27 = var3.readUShortSmart();
						var28 = var3.readUnsignedShort();
						var9 = 0;
						if (var28 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}
						if (var40 != null && var27 >= 0 && var27 < var40.itemIds.length) {
							var40.itemIds[var27] = var28;
							var40.itemQuantities[var27] = var9;
						}
					}
					if (var40 != null) {
						class220.invalidateWidget(var40);
					}
					class424.method7495();
					changedItemContainers[++field686 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					Object[] var76 = new Object[var50.length() + 1];
					for (var6 = var50.length() - 1; var6 >= 0; --var6) {
						if (var50.charAt(var6) == 's') {
							var76[var6 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var76[var6 + 1] = new Integer(var3.readInt());
						}
					}
					var76[0] = new Integer(var3.readInt());
					ScriptEvent var91 = new ScriptEvent();
					var91.args = var76;
					class17.runScriptEvent(var91);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3094 == var1.serverPacket) {
					SoundCache.field327 = null;
					var1.serverPacket = null;
					return true;
				}
				int var38;
				String var41;
				if (ServerPacket.field3115 == var1.serverPacket) {
					var80 = var3.readByte();
					var29 = ((long) (var3.readUnsignedShort()));
					var31 = ((long) (var3.readMedium()));
					var33 = (var29 << 32) + var31;
					boolean var77 = false;
					ClanChannel var12 = (var80 >= 0) ? currentClanChannels[var80] : class17.guestClanChannel;
					if (var12 == null) {
						var77 = true;
					} else {
						for (var13 = 0; var13 < 100; ++var13) {
							if (crossWorldMessageIds[var13] == var33) {
								var77 = true;
								break;
							}
						}
					}
					if (!var77) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var33;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var41 = CollisionMap.method3870(var3);
						var38 = (var80 >= 0) ? 43 : 46;
						Interpreter.addChatMessage(var38, "", var41, var12.name);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3119 == var1.serverPacket) {
					MilliClock.method3292();
					var80 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var80 >= 0) {
							currentClanSettings[var80] = null;
						} else {
							SecureRandomCallable.guestClanSettings = null;
						}
						var1.serverPacket = null;
						return true;
					}
					if (var80 >= 0) {
						currentClanSettings[var80] = new ClanSettings(var3);
					} else {
						SecureRandomCallable.guestClanSettings = new ClanSettings(var3);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3109 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					class240.method4994(var20);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < VarpDefinition.field1811; ++var20) {
						VarpDefinition var75 = MouseRecorder.VarpDefinition_get(var20);
						if (var75 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}
					class424.method7495();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.CAM_RESET == var1.serverPacket) {
					isCameraLocked = false;
					for (var20 = 0; var20 < 5; ++var20) {
						field678[var20] = false;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var29 = ((long) (var3.readUnsignedShort()));
					var31 = ((long) (var3.readMedium()));
					PlayerType var42 = ((PlayerType) (class271.findEnumerated(PlayerType_values(), var3.readUnsignedByte())));
					long var43 = (var29 << 32) + var31;
					boolean var83 = false;
					for (var13 = 0; var13 < 100; ++var13) {
						if (var43 == crossWorldMessageIds[var13]) {
							var83 = true;
							break;
						}
					}
					if (MusicPatchPcmStream.friendSystem.isIgnored(new Username(var50, class162.loginType))) {
						var83 = true;
					}
					if (!var83 && field542 == 0) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var43;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var41 = AbstractFont.escapeBrackets(class4.method13(CollisionMap.method3870(var3)));
						byte var82;
						if (var42.isPrivileged) {
							var82 = 7;
						} else {
							var82 = 3;
						}
						if (var42.modIcon != -1) {
							FileSystem.addGameMessage(var82, UrlRequester.method2619(var42.modIcon) + var50, var41);
						} else {
							FileSystem.addGameMessage(var82, var50, var41);
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
					int var18 = var3.readUnsignedByteAdd();
					var38 = var3.readUnsignedByteAdd() * 4;
					var25 = var3.readShortLE();
					var16 = var3.readUnsignedShortLE();
					var39 = var3.readUnsignedShortAdd();
					var13 = var3.readUnsignedByte() * 4;
					byte var78 = var3.readByteNeg();
					int var17 = var3.readUnsignedByteNeg();
					var6 = var3.readUnsignedMediumRME();
					var20 = var6 >> 16;
					var5 = var6 >> 8 & 255;
					var27 = var20 + (var6 >> 4 & 7);
					var28 = var5 + (var6 & 7);
					byte var59 = var3.readByteSub();
					var15 = var3.readUnsignedShortLE();
					var9 = var59 + var27;
					var26 = var78 + var28;
					if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && var9 >= 0 && var26 >= 0 && var9 < 104 && var26 < 104 && var39 != 65535) {
						var27 = var27 * 128 + 64;
						var28 = var28 * 128 + 64;
						var9 = var9 * 128 + 64;
						var26 = var26 * 128 + 64;
						Projectile var19 = new Projectile(var39, FriendSystem.Client_plane, var27, var28, SecureRandomFuture.getTileHeight(var27, var28, FriendSystem.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var25, var38);
						var19.setDestination(var9, var26, SecureRandomFuture.getTileHeight(var9, var26, FriendSystem.Client_plane) - var38, var15 + cycle);
						projectiles.addFirst(var19);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3043 == var1.serverPacket) {
					field755 = cycleCntr;
					var80 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var80 >= 0) {
							currentClanChannels[var80] = null;
						} else {
							class17.guestClanChannel = null;
						}
						var1.serverPacket = null;
						return true;
					}
					if (var80 >= 0) {
						currentClanChannels[var80] = new ClanChannel(var3);
					} else {
						class17.guestClanChannel = new ClanChannel(var3);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
					class433.logOut();
					var1.serverPacket = null;
					return false;
				}
				if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
					NPC.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
					NPC.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3096 == var1.serverPacket) {
					ClanChannelMember.method2908(class263.field3028);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3081 == var1.serverPacket) {
					SoundCache.field327 = new class392(class6.HitSplatDefinition_cached);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
					ScriptFrame.field462 = true;
					class145.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3088 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != field698) {
						field698 = var20;
						class9.method82();
					}
					var1.serverPacket = null;
					return true;
				}
				boolean var73;
				if (ServerPacket.field3061 == var1.serverPacket) {
					var73 = var3.readUnsignedByte() == 1;
					if (var73) {
						class20.field116 = class131.method2916() - var3.readLong();
						class302.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						class302.grandExchangeEvents = null;
					}
					field697 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
					HealthBarDefinition.updatePlayers(var3, var1.serverPacketLength);
					Archive.method5847();
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3091 == var1.serverPacket) {
					class10.field58 = var3.readUnsignedByte();
					class326.field4097 = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3114 == var1.serverPacket) {
					return this.method1129(var1);
				}
				if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
					ItemLayer.privateChatMode = class119.method2819(var3.readUnsignedByte());
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
					field696 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				InterfaceParent var56;
				if (ServerPacket.field3044 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var6 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						WorldMapIcon_0.Widget_resetModelFrames(rootInterface);
						KeyHandler.runWidgetOnLoadListener(rootInterface);
						for (var27 = 0; var27 < 100; ++var27) {
							field610[var27] = true;
						}
					}
					InterfaceParent var58;
					for (; var6-- > 0; var58.field1035 = true) {
						var27 = var3.readInt();
						var28 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var58 = ((InterfaceParent) (interfaceParents.get(((long) (var27)))));
						if (var58 != null && var28 != var58.group) {
							Canvas.closeInterface(var58, true);
							var58 = null;
						}
						if (var58 == null) {
							var58 = class258.method5185(var27, var28, var9);
						}
					}
					for (var56 = ((InterfaceParent) (interfaceParents.first())); var56 != null; var56 = ((InterfaceParent) (interfaceParents.next()))) {
						if (var56.field1035) {
							var56.field1035 = false;
						} else {
							Canvas.closeInterface(var56, true);
						}
					}
					widgetFlags = new NodeHashTable(512);
					while (var3.offset < var20) {
						var27 = var3.readInt();
						var28 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var26 = var3.readInt();
						for (var25 = var28; var25 <= var9; ++var25) {
							var36 = ((long) (var25)) + (((long) (var27)) << 32);
							widgetFlags.put(new IntegerNode(var26), var36);
						}
					} 
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
					MusicPatchPcmStream.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field750 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntLE();
					var40 = FloorUnderlayDefinition.getWidget(var5);
					if (var40.modelType != 1 || var20 != var40.modelId) {
						var40.modelType = 1;
						var40.modelId = var20;
						class220.invalidateWidget(var40);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedShort();
					var40 = FloorUnderlayDefinition.getWidget(var20);
					if (var40.modelType != 2 || var5 != var40.modelId) {
						var40.modelType = 2;
						var40.modelId = var5;
						class220.invalidateWidget(var40);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
					isCameraLocked = true;
					field745 = false;
					WorldMapLabelSize.field2673 = var3.readUnsignedByte() * 128;
					LoginScreenAnimation.field1233 = var3.readUnsignedByte() * 16384;
					UrlRequest.field1350 = var3.readUnsignedShort();
					class83.field1082 = var3.readUnsignedByte();
					ScriptFrame.field459 = var3.readUnsignedByte();
					if (ScriptFrame.field459 >= 100) {
						var20 = WorldMapLabelSize.field2673 * 16384 + 64;
						var5 = LoginScreenAnimation.field1233 * 128 + 64;
						var6 = SecureRandomFuture.getTileHeight(var20, var5, FriendSystem.Client_plane) - UrlRequest.field1350;
						var27 = var20 - WorldMapLabelSize.cameraX;
						var28 = var6 - class123.cameraY;
						var9 = var5 - Widget.cameraZ;
						var26 = ((int) (Math.sqrt(((double) (var9 * var9 + var27 * var27)))));
						UserComparator9.cameraPitch = ((int) (Math.atan2(((double) (var28)), ((double) (var26))) * 325.9490051269531)) & 2047;
						PendingSpawn.cameraYaw = ((int) (Math.atan2(((double) (var27)), ((double) (var9))) * -325.9490051269531)) & 2047;
						if (UserComparator9.cameraPitch < 128) {
							UserComparator9.cameraPitch = 128;
						}
						if (UserComparator9.cameraPitch > 383) {
							UserComparator9.cameraPitch = 383;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3060 == var1.serverPacket) {
					ClanChannelMember.method2908(class263.field3025);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3069 == var1.serverPacket) {
					ClanChannelMember.method2908(class263.field3019);
					var1.serverPacket = null;
					return true;
				}
				NPC var55;
				if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
					var6 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedShortAddLE();
					var20 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}
					var55 = npcs[var20];
					if (var55 != null) {
						if (var5 == var55.sequence && var5 != -1) {
							var28 = class14.SequenceDefinition_get(var5).field2175;
							if (var28 == 1) {
								var55.sequenceFrame = 0;
								var55.sequenceFrameCycle = 0;
								var55.sequenceDelay = var6;
								var55.field1174 = 0;
							} else if (var28 == 2) {
								var55.field1174 = 0;
							}
						} else if (var5 == -1 || var55.sequence == -1 || class14.SequenceDefinition_get(var5).field2168 >= class14.SequenceDefinition_get(var55.sequence).field2168) {
							var55.sequence = var5;
							var55.sequenceFrame = 0;
							var55.sequenceFrameCycle = 0;
							var55.sequenceDelay = var6;
							var55.field1174 = 0;
							var55.field1203 = var55.pathLength;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3140 == var1.serverPacket) {
					MilliClock.method3292();
					var80 = var3.readByte();
					class131 var74 = new class131(var3);
					ClanSettings var88;
					if (var80 >= 0) {
						var88 = currentClanSettings[var80];
					} else {
						var88 = SecureRandomCallable.guestClanSettings;
					}
					var74.method2911(var88);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.VARP_LARGE == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedIntME();
					Varps.Varps_temp[var20] = var5;
					if (Varps.Varps_main[var20] != var5) {
						Varps.Varps_main[var20] = var5;
					}
					class155.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.MIDI_SONG == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					if (var20 == 65535) {
						var20 = -1;
					}
					class1.playSong(var20);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3107 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					if (var20 == 65535) {
						var20 = -1;
					}
					var5 = var3.readUnsignedMediumRME();
					MouseRecorder.method2170(var20, var5);
					var1.serverPacket = null;
					return true;
				}
				Widget var45;
				if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntME();
					InterfaceParent var87 = ((InterfaceParent) (interfaceParents.get(((long) (var5)))));
					var56 = ((InterfaceParent) (interfaceParents.get(((long) (var20)))));
					if (var56 != null) {
						Canvas.closeInterface(var56, var87 == null || var87.group != var56.group);
					}
					if (var87 != null) {
						var87.remove();
						interfaceParents.put(var87, ((long) (var20)));
					}
					var45 = FloorUnderlayDefinition.getWidget(var5);
					if (var45 != null) {
						class220.invalidateWidget(var45);
					}
					var45 = FloorUnderlayDefinition.getWidget(var20);
					if (var45 != null) {
						class220.invalidateWidget(var45);
						class439.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var45.id >>> 16], var45, true);
					}
					if (rootInterface != -1) {
						class220.runIntfCloseListeners(rootInterface, 1);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3047 == var1.serverPacket) {
					ClanChannelMember.method2908(class263.field3026);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
					class424.method7495();
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByteNeg();
					var6 = var3.readInt();
					experience[var5] = var6;
					currentLevels[var5] = var20;
					levels[var5] = 1;
					for (var27 = 0; var27 < 98; ++var27) {
						if (var6 >= Skills.Skills_experienceTable[var27]) {
							levels[var5] = var27 + 2;
						}
					}
					changedSkills[++changedSkillsCount - 1 & 31] = var5;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShortAddLE() * 30;
					field726 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3133 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var5 = var3.readInt();
					var40 = FloorUnderlayDefinition.getWidget(var5);
					if (!var50.equals(var40.text)) {
						var40.text = var50;
						class220.invalidateWidget(var40);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3105 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedShort();
					class174.queueSoundEffect(var20, var5, var6);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3063 == var1.serverPacket) {
					class424.method7495();
					weight = var3.readShort();
					field726 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
					isCameraLocked = true;
					field745 = false;
					class457.field4811 = var3.readUnsignedByte() * 128;
					NPC.field1261 = var3.readUnsignedByte() * 128;
					ScriptEvent.field1052 = var3.readUnsignedShort();
					class115.field1419 = var3.readUnsignedByte();
					SoundCache.field325 = var3.readUnsignedByte();
					if (SoundCache.field325 >= 100) {
						WorldMapLabelSize.cameraX = class457.field4811 * 16384 + 64;
						Widget.cameraZ = NPC.field1261 * 16384 + 64;
						class123.cameraY = SecureRandomFuture.getTileHeight(WorldMapLabelSize.cameraX, Widget.cameraZ, FriendSystem.Client_plane) - ScriptEvent.field1052;
					}
					var1.serverPacket = null;
					return true;
				}
				Widget var54;
				if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var5 == 65535) {
						var5 = -1;
					}
					var6 = var3.readUnsignedIntME();
					var54 = FloorUnderlayDefinition.getWidget(var6);
					ItemComposition var90;
					if (!var54.isIf3) {
						if (var5 == -1) {
							var54.modelType = 0;
							var1.serverPacket = null;
							return true;
						}
						var90 = class258.ItemDefinition_get(var5);
						var54.modelType = 4;
						var54.modelId = var5;
						var54.modelAngleX = var90.xan2d;
						var54.modelAngleY = var90.yan2d;
						var54.modelZoom = var90.zoom2d * 100 / var20;
						class220.invalidateWidget(var54);
					} else {
						var54.itemId = var5;
						var54.itemQuantity = var20;
						var90 = class258.ItemDefinition_get(var5);
						var54.modelAngleX = var90.xan2d;
						var54.modelAngleY = var90.yan2d;
						var54.modelAngleZ = var90.zan2d;
						var54.modelOffsetX = var90.offsetX2d;
						var54.modelOffsetY = var90.offsetY2d;
						var54.modelZoom = var90.zoom2d;
						if (var90.isStackable == 1) {
							var54.itemQuantityMode = 1;
						} else {
							var54.itemQuantityMode = 2;
						}
						if (var54.field3421 > 0) {
							var54.modelZoom = var54.modelZoom * 32 / var54.field3421;
						} else if (var54.rawWidth > 0) {
							var54.modelZoom = var54.modelZoom * 32 / var54.rawWidth;
						}
						class220.invalidateWidget(var54);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3129 == var1.serverPacket) {
					field755 = cycleCntr;
					var80 = var3.readByte();
					class145 var72 = new class145(var3);
					ClanChannel var86;
					if (var80 >= 0) {
						var86 = currentClanChannels[var80];
					} else {
						var86 = class17.guestClanChannel;
					}
					var72.method3095(var86);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_2 == var1.serverPacket) {
					class145.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3065 == var1.serverPacket) {
					ClanChannelMember.method2908(class263.field3022);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
					var73 = var3.readUnsignedByteAdd() == 1;
					var5 = var3.readInt();
					var40 = FloorUnderlayDefinition.getWidget(var5);
					if (var73 != var40.isHidden) {
						var40.isHidden = var73;
						class220.invalidateWidget(var40);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
					class326.field4097 = var3.readUnsignedByteAdd();
					class10.field58 = var3.readUnsignedByteAdd();
					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						class263 var71 = UserComparator10.method2689()[var20];
						ClanChannelMember.method2908(var71);
					} 
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByteAdd();
					tradeChatMode = var3.readUnsignedByteNeg();
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3058 == var1.serverPacket) {
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
				if (ServerPacket.field3071 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByteNeg();
					var6 = var3.readInt();
					var56 = ((InterfaceParent) (interfaceParents.get(((long) (var6)))));
					if (var56 != null) {
						Canvas.closeInterface(var56, var20 != var56.group);
					}
					class258.method5185(var6, var20, var5);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var55 = npcs[var20];
					var5 = var3.readUnsignedIntLE();
					var6 = var3.readUnsignedShortLE();
					if (var55 != null) {
						var55.spotAnimation = var6;
						var55.spotAnimationHeight = var5 >> 16;
						var55.field1178 = (var5 & '￿') + cycle;
						var55.spotAnimationFrame = 0;
						var55.spotAnimationFrameCycle = 0;
						if (var55.field1178 > cycle) {
							var55.spotAnimationFrame = -1;
						}
						if (var55.spotAnimation == 65535) {
							var55.spotAnimation = -1;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					var40 = FloorUnderlayDefinition.getWidget(var20);
					if (var40 != null && var40.type == 0) {
						if (var5 > var40.scrollHeight - var40.height) {
							var5 = var40.scrollHeight - var40.height;
						}
						if (var5 < 0) {
							var5 = 0;
						}
						if (var5 != var40.scrollY) {
							var40.scrollY = var5;
							class220.invalidateWidget(var40);
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					class78.method2159(var20);
					changedItemContainers[++field686 - 1 & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETANIM == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readShortAdd();
					var40 = FloorUnderlayDefinition.getWidget(var20);
					if (var5 != var40.sequenceId || var5 == -1) {
						var40.sequenceId = var5;
						var40.modelFrame = 0;
						var40.modelFrameCycle = 0;
						class220.invalidateWidget(var40);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
					class326.field4097 = var3.readUnsignedByte();
					class10.field58 = var3.readUnsignedByteNeg();
					for (var20 = class326.field4097; var20 < class326.field4097 + 8; ++var20) {
						for (var5 = class10.field58; var5 < class10.field58 + 8; ++var5) {
							if (groundItems[FriendSystem.Client_plane][var20][var5] != null) {
								groundItems[FriendSystem.Client_plane][var20][var5] = null;
								WorldMapManager.updateItemPile(var20, var5);
							}
						}
					}
					for (PendingSpawn var51 = ((PendingSpawn) (pendingSpawns.last())); var51 != null; var51 = ((PendingSpawn) (pendingSpawns.previous()))) {
						if (var51.x >= class326.field4097 && var51.x < class326.field4097 + 8 && var51.y >= class10.field58 && var51.y < class10.field58 + 8 && var51.plane == FriendSystem.Client_plane) {
							var51.hitpoints = 0;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							class155.changeGameOptions(var20);
							changedVarps[++changedVarpCount - 1 & 31] = var20;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
					var20 = var3.readUnsignedByteSub();
					var21 = var3.readStringCp1252NullTerminated();
					var6 = var3.readUnsignedByteNeg();
					if (var20 >= 1 && var20 <= 8) {
						if (var21.equalsIgnoreCase("null")) {
							var21 = null;
						}
						playerMenuActions[var20 - 1] = var21;
						playerOptionsPriorities[var20 - 1] = var6 == 0;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var21 = AbstractFont.escapeBrackets(class4.method13(CollisionMap.method3870(var3)));
					FileSystem.addGameMessage(6, var50, var21);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
					class145.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3066 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntME();
					var6 = var3.readUnsignedShortAddLE();
					var54 = FloorUnderlayDefinition.getWidget(var5);
					var54.field3422 = var20 + (var6 << 16);
					var1.serverPacket = null;
					return true;
				}
				String var85;
				if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					boolean var57 = var3.readUnsignedByte() == 1;
					var85 = "";
					boolean var79 = false;
					if (var57) {
						var85 = var3.readStringCp1252NullTerminated();
						if (MusicPatchPcmStream.friendSystem.isIgnored(new Username(var85, class162.loginType))) {
							var79 = true;
						}
					}
					String var89 = var3.readStringCp1252NullTerminated();
					if (!var79) {
						FileSystem.addGameMessage(var20, var85, var89);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
					MusicPatchPcmStream.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					class16.FriendSystem_invalidateIgnoreds();
					field750 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3039 == var1.serverPacket) {
					var73 = var3.readBoolean();
					if (var73) {
						if (class302.field3596 == null) {
							class302.field3596 = new class326();
						}
					} else {
						class302.field3596 = null;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShortLE();
					var6 = var5 >> 10 & 31;
					var27 = var5 >> 5 & 31;
					var28 = var5 & 31;
					var9 = (var27 << 11) + (var6 << 19) + (var28 << 3);
					Widget var10 = FloorUnderlayDefinition.getWidget(var20);
					if (var9 != var10.color) {
						var10.color = var9;
						class220.invalidateWidget(var10);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3046 == var1.serverPacket) {
					ClanChannelMember.method2908(class263.field3023);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.URL_OPEN == var1.serverPacket) {
					byte[] var49 = new byte[var1.serverPacketLength];
					var3.method7680(var49, 0, var49.length);
					Buffer var70 = new Buffer(var49);
					var85 = var70.readStringCp1252NullTerminated();
					class238.openURL(var85, true, false);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3054 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var6 = var3.readUnsignedByte();
					var27 = var3.readUnsignedByte();
					field678[var20] = true;
					field747[var20] = var5;
					field654[var20] = var6;
					field749[var20] = var27;
					field653[var20] = 0;
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
						var40 = FloorUnderlayDefinition.getWidget(var20);
					} else {
						var40 = null;
					}
					if (var40 != null) {
						for (var27 = 0; var27 < var40.itemIds.length; ++var27) {
							var40.itemIds[var27] = 0;
							var40.itemQuantities[var27] = 0;
						}
					}
					Canvas.clearItemContainer(var5);
					var27 = var3.readUnsignedShort();
					for (var28 = 0; var28 < var27; ++var28) {
						var9 = var3.readUnsignedShortAddLE();
						var26 = var3.readUnsignedByteSub();
						if (var26 == 255) {
							var26 = var3.readInt();
						}
						if (var40 != null && var28 < var40.itemIds.length) {
							var40.itemIds[var28] = var9;
							var40.itemQuantities[var28] = var26;
						}
						WorldMapSection1.itemContainerSetItem(var5, var28, var9 - 1, var26);
					}
					if (var40 != null) {
						class220.invalidateWidget(var40);
					}
					class424.method7495();
					changedItemContainers[++field686 - 1 & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3086 == var1.serverPacket && isCameraLocked) {
					field745 = true;
					class115.field1419 = var3.readUnsignedByte();
					SoundCache.field325 = var3.readUnsignedByte();
					class83.field1082 = var3.readUnsignedByte();
					ScriptFrame.field459 = var3.readUnsignedByte();
					for (var20 = 0; var20 < 5; ++var20) {
						field678[var20] = false;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3099 == var1.serverPacket) {
					ClanChannelMember.method2908(class263.field3020);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.LOGOUT == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					class136.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}
				if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
					World var48 = new World();
					var48.host = var3.readStringCp1252NullTerminated();
					var48.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var48.properties = var5;
					class82.updateGameState(45);
					var2.close();
					var2 = null;
					FriendSystem.changeWorld(var48);
					var1.serverPacket = null;
					return false;
				}
				if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
					var20 = var3.readShortLE();
					var5 = var3.readShort();
					var6 = var3.readInt();
					var54 = FloorUnderlayDefinition.getWidget(var6);
					if (var20 != var54.rawX || var5 != var54.rawY || var54.xAlignment != 0 || var54.yAlignment != 0) {
						var54.rawX = var20;
						var54.rawY = var5;
						var54.xAlignment = 0;
						var54.yAlignment = 0;
						class220.invalidateWidget(var54);
						this.alignWidget(var54);
						if (var54.type == 0) {
							class439.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var6 >> 16], var54, false);
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
				if (ServerPacket.field3064 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					rootInterface = var20;
					this.resizeRoot(false);
					WorldMapIcon_0.Widget_resetModelFrames(var20);
					KeyHandler.runWidgetOnLoadListener(rootInterface);
					for (var5 = 0; var5 < 100; ++var5) {
						field610[var5] = true;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
					class128.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.VARP_SMALL == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					byte var52 = var3.readByteAdd();
					Varps.Varps_temp[var20] = var52;
					if (Varps.Varps_main[var20] != var52) {
						Varps.Varps_main[var20] = var52;
					}
					class155.changeGameOptions(var20);
					changedVarps[++changedVarpCount - 1 & 31] = var20;
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
				if (ServerPacket.field3137 == var1.serverPacket) {
					class424.method7495();
					runEnergy = var3.readUnsignedByte();
					field726 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.field3041 == var1.serverPacket) {
					return this.method1128(var1, 2);
				}
				if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_1 == var1.serverPacket) {
					ScriptFrame.field462 = true;
					class145.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var69 = ((InterfaceParent) (interfaceParents.get(((long) (var20)))));
					if (var69 != null) {
						Canvas.closeInterface(var69, true);
					}
					if (meslayerContinueWidget != null) {
						class220.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var68 = FloorUnderlayDefinition.getWidget(var20);
					for (var6 = 0; var6 < var68.itemIds.length; ++var6) {
						var68.itemIds[var6] = -1;
						var68.itemIds[var6] = 0;
					}
					class220.invalidateWidget(var68);
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
					var6 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShort();
					var20 = var3.readUnsignedShortAdd();
					Player var7;
					if (var20 == localPlayerIndex) {
						var7 = class28.localPlayer;
					} else {
						var7 = players[var20];
					}
					if (var7 != null) {
						var7.spotAnimation = var5;
						var7.spotAnimationHeight = var6 >> 16;
						var7.field1178 = (var6 & '￿') + cycle;
						var7.spotAnimationFrame = 0;
						var7.spotAnimationFrameCycle = 0;
						if (var7.field1178 > cycle) {
							var7.spotAnimationFrame = -1;
						}
						if (var7.spotAnimation == 65535) {
							var7.spotAnimation = -1;
						}
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedShort();
					var6 = var3.readInt();
					var27 = var3.readUnsignedShort();
					var45 = FloorUnderlayDefinition.getWidget(var6);
					if (var20 != var45.modelAngleX || var5 != var45.modelAngleY || var27 != var45.modelZoom) {
						var45.modelAngleX = var20;
						var45.modelAngleY = var5;
						var45.modelZoom = var27;
						class220.invalidateWidget(var45);
					}
					var1.serverPacket = null;
					return true;
				}
				if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						NPCComposition.method3470(var3, var3.offset - 28);
					}
					var1.serverPacket = null;
					return true;
				}
				class359.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1338 != null ? var1.field1338.id : -1) + "," + (var1.field1333 != null ? var1.field1333.id : -1) + "," + var1.serverPacketLength, ((Throwable) (null)));
				class433.logOut();
			} catch (IOException var46) {
				UserComparator4.method2654();
			} catch (Exception var47) {
				var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1338 != null ? var1.field1338.id : -1) + "," + (var1.field1333 != null ? var1.field1333.id : -1) + "," + var1.serverPacketLength + "," + (class28.localPlayer.pathX[0] + class300.baseX * 8) + "," + (class28.localPlayer.pathY[0] + Message.baseY * 64) + ",";
				for (var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
					var21 = var21 + var3.array[var6] + ",";
				}
				class359.RunException_sendStackTrace(var21, var47);
				class433.logOut();
			}
			return true;
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-9")
	@Export("menu")
	final void menu() {
		boolean var1 = false;
		int var2;
		int var5;
		while (!var1) {
			var1 = true;
			for (var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
				if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
					String var14 = menuTargets[var2];
					menuTargets[var2] = menuTargets[var2 + 1];
					menuTargets[var2 + 1] = var14;
					String var15 = menuActions[var2];
					menuActions[var2] = menuActions[var2 + 1];
					menuActions[var2 + 1] = var15;
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
					boolean var11 = menuShiftClick[var2];
					menuShiftClick[var2] = menuShiftClick[var2 + 1];
					menuShiftClick[var2 + 1] = var11;
					var1 = false;
				}
			}
		} 
		if (class115.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var4;
				int var10;
				int var18;
				label262 : {
					int var16 = MouseHandler.MouseHandler_lastButton;
					int var3;
					int var8;
					int var17;
					int var19;
					if (isMenuOpen) {
						if (var16 != 1 && (ObjectSound.mouseCam || var16 != 4)) {
							var2 = MouseHandler.MouseHandler_x;
							var3 = MouseHandler.MouseHandler_y;
							if (var2 < Language.menuX - 10 || var2 > Language.menuX + class402.menuWidth + 10 || var3 < UrlRequest.menuY - 10 || var3 > UrlRequest.menuY + class321.menuHeight + 10) {
								isMenuOpen = false;
								class16.method214(Language.menuX, UrlRequest.menuY, class402.menuWidth, class321.menuHeight);
							}
						}
						if (var16 == 1 || !ObjectSound.mouseCam && var16 == 4) {
							var2 = Language.menuX;
							var3 = UrlRequest.menuY;
							var4 = class402.menuWidth;
							var5 = MouseHandler.MouseHandler_lastPressedX;
							var19 = MouseHandler.MouseHandler_lastPressedY;
							var17 = -1;
							for (var8 = 0; var8 < menuOptionsCount; ++var8) {
								var18 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
								if (var5 > var2 && var5 < var4 + var2 && var19 > var18 - 13 && var19 < var18 + 3) {
									var17 = var8;
								}
							}
							if (var17 != -1) {
								FloorUnderlayDefinition.method3543(var17);
							}
							isMenuOpen = false;
							class16.method214(Language.menuX, UrlRequest.menuY, class402.menuWidth, class321.menuHeight);
						}
					} else {
						var2 = Player.method2211();
						if ((var16 == 1 || !ObjectSound.mouseCam && var16 == 4) && var2 >= 0) {
							var3 = menuOpcodes[var2];
							if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) {
								var4 = menuArguments1[var2];
								var5 = menuArguments2[var2];
								Widget var6 = FloorUnderlayDefinition.getWidget(var5);
								var8 = class67.getWidgetFlags(var6);
								boolean var7 = (var8 >> 28 & 1) != 0;
								if (var7) {
									break label262;
								}
								var10 = class67.getWidgetFlags(var6);
								boolean var9 = (var10 >> 29 & 1) != 0;
								if (var9) {
									break label262;
								}
							}
						}
						if ((var16 == 1 || !ObjectSound.mouseCam && var16 == 4) && this.shouldLeftClickOpenMenu()) {
							var16 = 2;
						}
						if ((var16 == 1 || !ObjectSound.mouseCam && var16 == 4) && menuOptionsCount > 0 && var2 >= 0) {
							var3 = menuArguments1[var2];
							var4 = menuArguments2[var2];
							var5 = menuOpcodes[var2];
							var19 = menuIdentifiers[var2];
							var17 = menuItemIds[var2];
							String var12 = menuActions[var2];
							String var13 = menuTargets[var2];
							class9.menuAction(var3, var4, var5, var19, var17, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
						if (var16 == 2 && menuOptionsCount > 0) {
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}
					return;
				}
				if (class115.dragInventoryWidget != null && !field607 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
					var18 = draggedWidgetX;
					var10 = draggedWidgetY;
					ArchiveDiskAction.method5787(class136.tempMenuAction, var18, var10);
					class136.tempMenuAction = null;
				}
				field607 = false;
				itemDragDuration = 0;
				if (class115.dragInventoryWidget != null) {
					class220.invalidateWidget(class115.dragInventoryWidget);
				}
				class115.dragInventoryWidget = FloorUnderlayDefinition.getWidget(var5);
				dragItemSlotSource = var4;
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
				if (var2 >= 0) {
					class113.method2713(var2);
				}
				class220.invalidateWidget(class115.dragInventoryWidget);
			}
		}
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "268498014")
	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = Player.method2211();
		boolean var2 = leftClickOpensMenu && menuOptionsCount > 2;
		if (!var2) {
			boolean var3;
			if (var1 < 0) {
				var3 = false;
			} else {
				int var4 = menuOpcodes[var1];
				if (var4 >= 2000) {
					var4 -= 2000;
				}
				if (var4 == 1007) {
					var3 = true;
				} else {
					var3 = false;
				}
			}
			var2 = var3;
		}
		return var2 && !menuShiftClick[var1];
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "8")
	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = class116.fontBold12.stringWidth("Choose Option");
		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) {
			var5 = class116.fontBold12.stringWidth(ClanChannelMember.method2906(var4));
			if (var5 > var3) {
				var3 = var5;
			}
		}
		var3 += 8;
		var4 = menuOptionsCount * 15 + 22;
		var5 = var1 - var3 / 2;
		if (var5 + var3 > class352.canvasWidth) {
			var5 = class352.canvasWidth - var3;
		}
		if (var5 < 0) {
			var5 = 0;
		}
		int var6 = var2;
		if (var4 + var2 > class228.canvasHeight) {
			var6 = class228.canvasHeight - var4;
		}
		if (var6 < 0) {
			var6 = 0;
		}
		Language.menuX = var5;
		UrlRequest.menuY = var6;
		class402.menuWidth = var3;
		class321.menuHeight = menuOptionsCount * 15 + 22;
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		Decimator.scene.menuOpen(FriendSystem.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-1199540139")
	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		int var2 = rootInterface;
		int var3 = class352.canvasWidth;
		int var4 = class228.canvasHeight;
		if (ReflectionCheck.loadInterface(var2)) {
			NetCache.resizeInterface(Widget.Widget_interfaceComponents[var2], -1, var3, var4, var1);
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(descriptor = "(Lku;I)V", garbageValue = "-1915332217")
	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = (var1.parentId == -1) ? null : FloorUnderlayDefinition.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class352.canvasWidth;
			var4 = class228.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}
		class356.alignWidgetSize(var1, var3, var4, false);
		VertexNormal.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "429748026")
	final void method1298() {
		class220.invalidateWidget(clickedWidget);
		++LoginScreenAnimation.widgetDragDuration;
		int var1;
		int var2;
		if (field549 && field675) {
			var1 = MouseHandler.MouseHandler_x;
			var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field676) {
				var1 = field676;
			}
			if (var1 + Client.clickedWidget.width > field676 + Client.clickedWidgetParent.width) {
				var1 = field676 + Client.clickedWidgetParent.width - Client.clickedWidget.width;
			}
			if (var2 < field751) {
				var2 = field751;
			}
			if (var2 + Client.clickedWidget.height > field751 + Client.clickedWidgetParent.height) {
				var2 = field751 + Client.clickedWidgetParent.height - Client.clickedWidget.height;
			}
			int var3 = var1 - field679;
			int var4 = var2 - field680;
			int var5 = Client.clickedWidget.dragZoneSize;
			if (LoginScreenAnimation.widgetDragDuration > Client.clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
				isDraggingWidget = true;
			}
			int var6 = var1 - field676 + Client.clickedWidgetParent.scrollX;
			int var7 = var2 - field751 + Client.clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if (Client.clickedWidget.onDrag != null && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = Client.clickedWidget.onDrag;
				class17.runScriptEvent(var8);
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
						class17.runScriptEvent(var8);
					}
					if (draggedOnWidget != null) {
						Widget var15 = clickedWidget;
						int var11 = class67.getWidgetFlags(var15);
						int var10 = var11 >> 17 & 7;
						int var12 = var10;
						Widget var17;
						if (var10 == 0) {
							var17 = null;
						} else {
							int var13 = 0;
							while (true) {
								if (var13 >= var12) {
									var17 = var15;
									break;
								}
								var15 = FloorUnderlayDefinition.getWidget(var15.parentId);
								if (var15 == null) {
									var17 = null;
									break;
								}
								++var13;
							} 
						}
						if (var17 != null) {
							PacketBufferNode var16 = class433.getPacketBufferNode(ClientPacket.OPHELDD, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeShortAddLE(Client.clickedWidget.id);
							var16.packetBuffer.writeShortAddLE(Client.clickedWidget.childIndex);
							var16.packetBuffer.writeIntLE(Client.draggedOnWidget.id);
							var16.packetBuffer.writeShortAddLE(Client.clickedWidget.itemId);
							var16.packetBuffer.writeShortLE(Client.draggedOnWidget.childIndex);
							var16.packetBuffer.writeShortAdd(Client.draggedOnWidget.itemId);
							packetWriter.addNode(var16);
						}
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(widgetClickX + field679, widgetClickY + field680);
				} else if (menuOptionsCount > 0) {
					int var14 = widgetClickX + field679;
					int var9 = widgetClickY + field680;
					ArchiveDiskAction.method5787(class136.tempMenuAction, var14, var9);
					class136.tempMenuAction = null;
				}
				clickedWidget = null;
			}
		} else if (LoginScreenAnimation.widgetDragDuration > 1) {
			if (!isDraggingWidget && menuOptionsCount > 0) {
				var1 = widgetClickX + field679;
				var2 = field680 + widgetClickY;
				ArchiveDiskAction.method5787(class136.tempMenuAction, var1, var2);
				class136.tempMenuAction = null;
			}
			clickedWidget = null;
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(descriptor = "(B)Lqi;", garbageValue = "37")
	@Export("username")
	public Username username() {
		return class28.localPlayer != null ? class28.localPlayer.username : null;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				int var3;
				for (int var1 = 0; var1 <= 28; ++var1) {
					String var2 = this.getParameter(Integer.toString(var1));
					if (var2 != null) {
						switch (var1) {
							case 3 :
								if (var2.equalsIgnoreCase("true")) {
									isMembersWorld = true;
								} else {
									isMembersWorld = false;
								}
								break;
							case 4 :
								if (clientType == -1) {
									clientType = Integer.parseInt(var2);
								}
								break;
							case 5 :
								worldProperties = Integer.parseInt(var2);
								break;
							case 6 :
								class21.clientLanguage = Language.method6080(Integer.parseInt(var2));
								break;
							case 7 :
								HealthBarUpdate.field1207 = class19.method290(Integer.parseInt(var2));
								break;
							case 8 :
								if (var2.equalsIgnoreCase("true")) {
								}
								break;
							case 9 :
								Script.field975 = var2;
								break;
							case 10 :
								StudioGame[] var8 = new StudioGame[]{ StudioGame.oldscape, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game3, StudioGame.game4, StudioGame.game5 };
								AbstractByteArrayCopier.field3293 = ((StudioGame) (class271.findEnumerated(var8, Integer.parseInt(var2))));
								if (AbstractByteArrayCopier.field3293 == StudioGame.oldscape) {
									class162.loginType = LoginType.oldscape;
								} else {
									class162.loginType = LoginType.field4631;
								}
								break;
							case 11 :
								class65.field874 = var2;
								break;
							case 12 :
								worldId = Integer.parseInt(var2);
							case 13 :
							case 16 :
							case 18 :
							case 19 :
							case 20 :
							case 22 :
							case 23 :
							case 24 :
							default :
								break;
							case 14 :
								Decimator.field402 = Integer.parseInt(var2);
								break;
							case 15 :
								gameBuild = Integer.parseInt(var2);
								break;
							case 17 :
								GrandExchangeOfferOwnWorldComparator.field479 = var2;
								break;
							case 21 :
								field504 = Integer.parseInt(var2);
								break;
							case 25 :
								var3 = var2.indexOf(".");
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
				WorldMapSectionType.worldHost = this.getCodeBase().getHost();
				String var9 = HealthBarUpdate.field1207.name;
				byte var10 = 0;
				try {
					JagexCache.idxCount = 22;
					KeyHandler.cacheGamebuild = var10;
					try {
						MusicPatchPcmStream.operatingSystemName = System.getProperty("os.name");
					} catch (Exception var16) {
						MusicPatchPcmStream.operatingSystemName = "Unknown";
					}
					class7.formattedOperatingSystemName = MusicPatchPcmStream.operatingSystemName.toLowerCase();
					try {
						JagexCache.userHomeDirectory = System.getProperty("user.home");
						if (JagexCache.userHomeDirectory != null) {
							JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
						}
					} catch (Exception var15) {
					}
					try {
						if (class7.formattedOperatingSystemName.startsWith("win")) {
							if (JagexCache.userHomeDirectory == null) {
								JagexCache.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (JagexCache.userHomeDirectory == null) {
							JagexCache.userHomeDirectory = System.getenv("HOME");
						}
						if (JagexCache.userHomeDirectory != null) {
							JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
						}
					} catch (Exception var14) {
					}
					if (JagexCache.userHomeDirectory == null) {
						JagexCache.userHomeDirectory = "~/";
					}
					class329.cacheParentPaths = new String[]{ "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", JagexCache.userHomeDirectory, "/tmp/", "" };
					class14.cacheSubPaths = new String[]{ ".jagex_cache_" + KeyHandler.cacheGamebuild, ".file_store_" + KeyHandler.cacheGamebuild };
					label172 : for (var3 = 0; var3 < 4; ++var3) {
						UserComparator10.cacheDir = class1.method9("oldschool", var9, var3);
						if (!UserComparator10.cacheDir.exists()) {
							UserComparator10.cacheDir.mkdirs();
						}
						File[] var4 = UserComparator10.cacheDir.listFiles();
						if (var4 == null) {
							break;
						}
						File[] var5 = var4;
						int var6 = 0;
						while (true) {
							if (var6 >= var5.length) {
								break label172;
							}
							File var7 = var5[var6];
							if (!ClanSettings.method3006(var7, false)) {
								break;
							}
							++var6;
						} 
					}
					class132.method2918(UserComparator10.cacheDir);
					try {
						File var21 = new File(JagexCache.userHomeDirectory, "random.dat");
						int var12;
						if (var21.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var21, "rw", 25L), 24, 0);
						} else {
							label152 : for (int var11 = 0; var11 < class14.cacheSubPaths.length; ++var11) {
								for (var12 = 0; var12 < class329.cacheParentPaths.length; ++var12) {
									File var13 = new File(class329.cacheParentPaths[var12] + class14.cacheSubPaths[var11] + File.separatorChar + "random.dat");
									if (var13.exists()) {
										JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var13, "rw", 25L), 24, 0);
										break label152;
									}
								}
							}
						}
						if (JagexCache.JagexCache_randomDat == null) {
							RandomAccessFile var20 = new RandomAccessFile(var21, "rw");
							var12 = var20.read();
							var20.seek(0L);
							var20.write(var12);
							var20.seek(0L);
							var20.close();
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var21, "rw", 25L), 24, 0);
						}
					} catch (IOException var17) {
					}
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(NetFileRequest.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(NetFileRequest.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
					class346.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount];
					for (var3 = 0; var3 < JagexCache.idxCount; ++var3) {
						class346.JagexCache_idxFiles[var3] = new BufferedFile(new AccessFile(NetFileRequest.getFile("main_file_cache.idx" + var3), "rw", 1048576L), 6000, 0);
					}
				} catch (Exception var18) {
					class359.RunException_sendStackTrace(((String) (null)), var18);
				}
				class329.client = this;
				class133.clientType = clientType;
				if (field489 == -1) {
					field489 = 0;
				}
				class344.field4179 = System.getenv("JX_ACCESS_TOKEN");
				class402.field4461 = System.getenv("JX_REFRESH_TOKEN");
				if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
					this.field526 = true;
				}
				this.startThread(765, 503, 207, 1);
			}
		} catch (RuntimeException var19) {
			throw class134.newRunException(var19, "client.init(" + ')');
		}
	}

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field524 = var1;
			UserComparator6.method2701(10);
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.field536;
	}

	@ObfuscatedSignature(descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V")
	public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
		if (var1 != null) {
			this.field528 = var1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;I)V", garbageValue = "-387846567")
	public static void method1321(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(III)Lbc;", garbageValue = "-2001490507")
	static Script method1636(int var0, int var1) {
		Script var2 = ((Script) (Script.Script_cached.get(((long) (var0 << 16)))));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = class117.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = class117.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}
					var2 = class282.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, ((long) (var0 << 16)));
						return var2;
					}
				}
				return null;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(B)[Lkl;", garbageValue = "109")
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{ PlayerType.field3969, PlayerType.field3973, PlayerType.PlayerType_ultimateIronman, PlayerType.field3972, PlayerType.PlayerType_normal, PlayerType.field3963, PlayerType.field3979, PlayerType.field3970, PlayerType.field3975, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_jagexModerator, PlayerType.field3977, PlayerType.field3976, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ironman, PlayerType.field3971 };
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1730632976")
	static void method1639() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class260.clientPreferences.method2331() != null) {
				Login.Login_username = class260.clientPreferences.method2331();
				Login_isUsernameRemembered = true;
			} else {
				Login_isUsernameRemembered = false;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(IIIB)I", garbageValue = "-73")
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}
		if (var2 > 192) {
			var1 /= 2;
		}
		if (var2 > 217) {
			var1 /= 2;
		}
		if (var2 > 243) {
			var1 /= 2;
		}
		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}