import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Future;





import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed , OAuthApi {
	@ObfuscatedName("ro")
	@ObfuscatedSignature(descriptor = 
	"[Leh;")

	@Export("currentClanSettings")
	static ClanSettings[] currentClanSettings;
	@ObfuscatedName("uq")
	@ObfuscatedGetter(intValue = 
	1668730285)

	public static int field764;
	@ObfuscatedName("se")
	static boolean field731;
	@ObfuscatedName("tn")
	@ObfuscatedGetter(intValue = 
	-910392373)

	@Export("viewportOffsetX")
	static int viewportOffsetX;
	@ObfuscatedName("tw")
	@ObfuscatedGetter(intValue = 
	-741785837)

	@Export("viewportOffsetY")
	static int viewportOffsetY;
	@ObfuscatedName("ri")
	@ObfuscatedGetter(intValue = 
	1225239435)

	@Export("destinationX")
	static int destinationX;
	@ObfuscatedName("rm")
	@ObfuscatedGetter(intValue = 
	-1994078091)

	@Export("destinationY")
	static int destinationY;
	@ObfuscatedName("vo")
	@ObfuscatedSignature(descriptor = 
	"Lbg;")

	static final ApproximateRouteStrategy field477;
	@ObfuscatedName("sv")
	@Export("isCameraLocked")
	static boolean isCameraLocked;
	@ObfuscatedName("vf")
	static int[] field743;
	@ObfuscatedName("tv")
	static boolean field739;
	@ObfuscatedName("vp")
	static int[] field670;
	@ObfuscatedName("sf")
	@ObfuscatedGetter(intValue = 
	-626586819)

	@Export("currentTrackGroupId")
	static int currentTrackGroupId;
	@ObfuscatedName("uk")
	@ObfuscatedGetter(intValue = 
	-1394688195)

	static int field759;
	@ObfuscatedName("ur")
	@ObfuscatedSignature(descriptor = 
	"Lkq;")

	@Export("playerAppearance")
	static PlayerComposition playerAppearance;
	@ObfuscatedName("tt")
	static boolean[] field740;
	@ObfuscatedName("ua")
	@ObfuscatedGetter(intValue = 
	-1186847035)

	static int field738;
	@ObfuscatedName("sa")
	@ObfuscatedGetter(intValue = 
	-511056461)

	@Export("minimapState")
	static int minimapState;
	@ObfuscatedName("ts")
	static int[] field482;
	@ObfuscatedName("uy")
	@Export("archiveLoaders")
	static ArrayList archiveLoaders;
	@ObfuscatedName("tq")
	static int[] field549;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(intValue = 
	-19127139)

	@Export("archiveLoadersDone")
	static int archiveLoadersDone;
	@ObfuscatedName("tp")
	static int[] field766;
	@ObfuscatedName("re")
	@ObfuscatedGetter(intValue = 
	-948451773)

	static int field721;
	@ObfuscatedName("tr")
	static int[] field744;
	@ObfuscatedName("rz")
	@ObfuscatedGetter(longValue = 
	36479923069350349L)

	static long field718;
	@ObfuscatedName("sd")
	@ObfuscatedGetter(intValue = 
	1597289503)

	@Export("soundEffectCount")
	static int soundEffectCount;
	@ObfuscatedName("sk")
	@Export("queuedSoundEffectDelays")
	static int[] queuedSoundEffectDelays;
	@ObfuscatedName("sl")
	@Export("soundEffectIds")
	static int[] soundEffectIds;
	@ObfuscatedName("ss")
	@Export("queuedSoundEffectLoops")
	static int[] queuedSoundEffectLoops;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(descriptor = 
	"[Lad;")

	@Export("soundEffects")
	static SoundEffect[] soundEffects;
	@ObfuscatedName("qq")
	@Export("crossWorldMessageIds")
	static long[] crossWorldMessageIds;
	@ObfuscatedName("so")
	@Export("soundLocations")
	static int[] soundLocations;
	@ObfuscatedName("un")
	@ObfuscatedSignature(descriptor = 
	"Loy;")

	@Export("platformInfoProvider")
	static PlatformInfoProvider platformInfoProvider;
	@ObfuscatedName("rn")
	@ObfuscatedGetter(intValue = 
	802039019)

	@Export("mapIconCount")
	static int mapIconCount;
	@ObfuscatedName("rq")
	@ObfuscatedGetter(intValue = 
	392085463)

	@Export("crossWorldMessageIdsIndex")
	static int crossWorldMessageIdsIndex;
	@ObfuscatedName("rd")
	@Export("mapIconXs")
	static int[] mapIconXs;
	@ObfuscatedName("rh")
	@Export("mapIconYs")
	static int[] mapIconYs;
	@ObfuscatedName("tc")
	static short field745;
	@ObfuscatedName("tf")
	static short field706;
	@ObfuscatedName("to")
	static short field751;
	@ObfuscatedName("rx")
	@ObfuscatedSignature(descriptor = 
	"[Lql;")

	@Export("mapIcons")
	static SpritePixels[] mapIcons;
	@ObfuscatedName("te")
	static short field752;
	@ObfuscatedName("tz")
	static short field750;
	@ObfuscatedName("th")
	@ObfuscatedGetter(intValue = 
	1682209625)

	@Export("viewportZoom")
	static int viewportZoom;
	@ObfuscatedName("tg")
	static short field562;
	@ObfuscatedName("td")
	@ObfuscatedGetter(intValue = 
	1039364719)

	@Export("viewportWidth")
	static int viewportWidth;
	@ObfuscatedName("rw")
	@ObfuscatedGetter(intValue = 
	611890173)

	static int field713;
	@ObfuscatedName("rp")
	@ObfuscatedSignature(descriptor = 
	"[Ley;")

	@Export("currentClanChannels")
	static ClanChannel[] currentClanChannels;
	@ObfuscatedName("tu")
	@ObfuscatedGetter(intValue = 
	-1076722529)

	@Export("viewportHeight")
	static int viewportHeight;
	@ObfuscatedName("rk")
	static int[] field568;
	@ObfuscatedName("ty")
	@Export("zoomWidth")
	static short zoomWidth;
	@ObfuscatedName("tl")
	@Export("zoomHeight")
	static short zoomHeight;
	@ObfuscatedName("ue")
	@ObfuscatedGetter(intValue = 
	1688103811)

	static int field767;
	@ObfuscatedName("ru")
	static int[] field716;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(intValue = 
	-89242055)

	@Export("publicChatMode")
	static int publicChatMode;
	@ObfuscatedName("qp")
	@ObfuscatedGetter(intValue = 
	-1997550173)

	@Export("tradeChatMode")
	static int tradeChatMode;
	@ObfuscatedName("qw")
	static String field712;
	@ObfuscatedName("uh")
	@ObfuscatedSignature(descriptor = 
	"[Lly;")

	@Export("grandExchangeOffers")
	static GrandExchangeOffer[] grandExchangeOffers;
	@ObfuscatedName("uc")
	@ObfuscatedSignature(descriptor = 
	"Lbq;")

	@Export("GrandExchangeEvents_worldComparator")
	static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"[Lgf;")

	@Export("collisionMaps")
	static CollisionMap[] collisionMaps;
	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("ai")
	static boolean field536;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(intValue = 
	1384475225)

	@Export("worldId")
	public static int worldId;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(intValue = 
	-1403980901)

	@Export("worldProperties")
	static int worldProperties;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = 
	"Lkx;")

	static GameBuild field509;
	@ObfuscatedName("be")
	@ObfuscatedGetter(intValue = 
	-1486899745)

	@Export("gameBuild")
	static int gameBuild;
	@ObfuscatedName("bg")
	@Export("isMembersWorld")
	public static boolean isMembersWorld;
	@ObfuscatedName("bq")
	@Export("isLowDetail")
	static boolean isLowDetail;
	@ObfuscatedName("by")
	@ObfuscatedGetter(intValue = 
	908315739)

	static int field484;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(intValue = 
	936245025)

	@Export("clientType")
	static int clientType;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(intValue = 
	-306665125)

	static int field486;
	@ObfuscatedName("bb")
	@Export("onMobile")
	static boolean onMobile;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(intValue = 
	-82914107)

	@Export("gameState")
	static int gameState;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(descriptor = 
	"[Lqx;")

	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ct")
	@Export("isLoading")
	static boolean isLoading;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(intValue = 
	-334140379)

	@Export("cycle")
	static int cycle;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(longValue = 
	-1788546083079634723L)

	@Export("mouseLastLastPressedTimeMillis")
	static long mouseLastLastPressedTimeMillis;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(intValue = 
	-100074845)

	static int field493;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(intValue = 
	629104417)

	static int field494;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(longValue = 
	1321924427680064723L)

	static long field495;
	@ObfuscatedName("dk")
	@Export("hadFocus")
	static boolean hadFocus;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(intValue = 
	1351490809)

	@Export("rebootTimer")
	static int rebootTimer;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(intValue = 
	-1663625947)

	@Export("hintArrowType")
	static int hintArrowType;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(intValue = 
	192342013)

	@Export("hintArrowNpcIndex")
	static int hintArrowNpcIndex;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(intValue = 
	-1937230559)

	@Export("hintArrowPlayerIndex")
	static int hintArrowPlayerIndex;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(intValue = 
	-1944327797)

	@Export("hintArrowX")
	static int hintArrowX;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(intValue = 
	1483438593)

	@Export("hintArrowY")
	static int hintArrowY;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(intValue = 
	625837163)

	@Export("hintArrowHeight")
	static int hintArrowHeight;
	@ObfuscatedName("di")
	@ObfuscatedGetter(intValue = 
	-238897213)

	@Export("hintArrowSubX")
	static int hintArrowSubX;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(intValue = 
	1241852729)

	@Export("hintArrowSubY")
	static int hintArrowSubY;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(descriptor = 
	"Lcb;")

	@Export("playerAttackOption")
	static AttackOption playerAttackOption;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(descriptor = 
	"Lcb;")

	@Export("npcAttackOption")
	static AttackOption npcAttackOption;
	@ObfuscatedName("df")
	@ObfuscatedGetter(intValue = 
	1509781755)

	@Export("titleLoadingStage")
	static int titleLoadingStage;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(intValue = 
	825267883)

	@Export("js5ConnectState")
	static int js5ConnectState;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(intValue = 
	440824439)

	static int field510;
	@ObfuscatedName("et")
	@ObfuscatedGetter(intValue = 
	-1319621541)

	@Export("js5Errors")
	static int js5Errors;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(intValue = 
	873675793)

	@Export("loginState")
	static int loginState;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(intValue = 
	1202903661)

	static int field513;
	@ObfuscatedName("fw")
	@ObfuscatedGetter(intValue = 
	595512899)

	static int field742;
	@ObfuscatedName("fl")
	@ObfuscatedGetter(intValue = 
	-1543261187)

	static int field490;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(descriptor = 
	"Ldr;")

	static class124 field516;
	@ObfuscatedName("fu")
	@ObfuscatedSignature(descriptor = 
	"Lpb;")

	static class441 field517;
	@ObfuscatedName("fj")
	@Export("Login_isUsernameRemembered")
	static boolean Login_isUsernameRemembered;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(descriptor = 
	"Lbx;")

	@Export("secureRandomFuture")
	static SecureRandomFuture secureRandomFuture;
	@ObfuscatedName("gj")
	@Export("randomDatData")
	static byte[] randomDatData;
	@ObfuscatedName("gg")
	@ObfuscatedSignature(descriptor = 
	"[Lcx;")

	@Export("npcs")
	static NPC[] npcs;
	@ObfuscatedName("gf")
	@ObfuscatedGetter(intValue = 
	821728721)

	@Export("npcCount")
	static int npcCount;
	@ObfuscatedName("ge")
	@Export("npcIndices")
	static int[] npcIndices;
	@ObfuscatedName("gv")
	@ObfuscatedGetter(intValue = 
	-1172632999)

	static int field609;
	@ObfuscatedName("ga")
	static int[] field533;
	@ObfuscatedName("gb")
	@ObfuscatedSignature(descriptor = 
	"Lcj;")

	@Export("packetWriter")
	public static final PacketWriter packetWriter;
	@ObfuscatedName("gi")
	@ObfuscatedGetter(intValue = 
	-1448088797)

	@Export("logoutTimer")
	static int logoutTimer;
	@ObfuscatedName("gy")
	@Export("hadNetworkError")
	static boolean hadNetworkError;
	@ObfuscatedName("gr")
	@Export("useBufferedSocket")
	static boolean useBufferedSocket;
	@ObfuscatedName("gl")
	static boolean field753;
	@ObfuscatedName("gq")
	@ObfuscatedSignature(descriptor = 
	"Lmk;")

	@Export("timer")
	static Timer timer;
	@ObfuscatedName("hm")
	@Export("fontsMap")
	static HashMap fontsMap;
	@ObfuscatedName("hu")
	@ObfuscatedGetter(intValue = 
	-1925693523)

	static int field541;
	@ObfuscatedName("ht")
	@ObfuscatedGetter(intValue = 
	-1659706153)

	static int field558;
	@ObfuscatedName("hr")
	@ObfuscatedGetter(intValue = 
	321841455)

	static int field543;
	@ObfuscatedName("hg")
	@ObfuscatedGetter(intValue = 
	221917147)

	static int field679;
	@ObfuscatedName("hn")
	@ObfuscatedGetter(intValue = 
	1969712165)

	static int field545;
	@ObfuscatedName("hk")
	@Export("isInInstance")
	static boolean isInInstance;
	@ObfuscatedName("ho")
	@Export("instanceChunkTemplates")
	static int[][][] instanceChunkTemplates;
	@ObfuscatedName("hq")
	static final int[] field711;
	@ObfuscatedName("hs")
	@ObfuscatedGetter(intValue = 
	-801639369)

	static int field550;
	@ObfuscatedName("il")
	@ObfuscatedSignature(descriptor = 
	"[Lql;")

	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("io")
	@ObfuscatedGetter(intValue = 
	1321495201)

	static int field619;
	@ObfuscatedName("ie")
	@ObfuscatedGetter(intValue = 
	-1490389591)

	static int field684;
	@ObfuscatedName("it")
	@Export("selectedItemName")
	static String selectedItemName;
	@ObfuscatedName("iy")
	@ObfuscatedGetter(intValue = 
	-1195780917)

	static int field554;
	@ObfuscatedName("ip")
	@ObfuscatedGetter(intValue = 
	-1210560909)

	static int field514;
	@ObfuscatedName("if")
	static boolean field556;
	@ObfuscatedName("ih")
	@ObfuscatedGetter(intValue = 
	-1437744235)

	@Export("alternativeScrollbarWidth")
	static int alternativeScrollbarWidth;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(intValue = 
	-1351920695)

	@Export("camAngleX")
	static int camAngleX;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(intValue = 
	216266331)

	@Export("camAngleY")
	static int camAngleY;
	@ObfuscatedName("ji")
	@ObfuscatedGetter(intValue = 
	-1258752111)

	@Export("camAngleDY")
	static int camAngleDY;
	@ObfuscatedName("jt")
	@ObfuscatedGetter(intValue = 
	-1533362551)

	@Export("camAngleDX")
	static int camAngleDX;
	@ObfuscatedName("jd")
	@ObfuscatedGetter(intValue = 
	-455239761)

	@Export("mouseCamClickedX")
	static int mouseCamClickedX;
	@ObfuscatedName("jx")
	@ObfuscatedGetter(intValue = 
	-1065676509)

	@Export("mouseCamClickedY")
	static int mouseCamClickedY;
	@ObfuscatedName("jk")
	@ObfuscatedGetter(intValue = 
	201796585)

	@Export("oculusOrbState")
	static int oculusOrbState;
	@ObfuscatedName("jj")
	@ObfuscatedGetter(intValue = 
	-227218527)

	@Export("camFollowHeight")
	static int camFollowHeight;
	@ObfuscatedName("jf")
	@ObfuscatedGetter(intValue = 
	2135438815)

	static int field566;
	@ObfuscatedName("jv")
	@ObfuscatedGetter(intValue = 
	344639155)

	static int field567;
	@ObfuscatedName("je")
	@ObfuscatedGetter(intValue = 
	-341747801)

	static int field696;
	@ObfuscatedName("jb")
	@ObfuscatedGetter(intValue = 
	-1286782535)

	@Export("oculusOrbNormalSpeed")
	static int oculusOrbNormalSpeed;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(intValue = 
	-881862903)

	@Export("oculusOrbSlowedSpeed")
	static int oculusOrbSlowedSpeed;
	@ObfuscatedName("js")
	@ObfuscatedGetter(intValue = 
	1761289457)

	static int field571;
	@ObfuscatedName("ju")
	static boolean field602;
	@ObfuscatedName("jo")
	@ObfuscatedGetter(intValue = 
	-1962424793)

	static int field542;
	@ObfuscatedName("jp")
	static boolean field616;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(intValue = 
	1036039517)

	static int field756;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(intValue = 
	-1554495705)

	@Export("overheadTextCount")
	static int overheadTextCount;
	@ObfuscatedName("jw")
	@ObfuscatedGetter(intValue = 
	-1616639625)

	@Export("overheadTextLimit")
	static int overheadTextLimit;
	@ObfuscatedName("jc")
	@Export("overheadTextXs")
	static int[] overheadTextXs;
	@ObfuscatedName("kc")
	@Export("overheadTextYs")
	static int[] overheadTextYs;
	@ObfuscatedName("kw")
	@Export("overheadTextAscents")
	static int[] overheadTextAscents;
	@ObfuscatedName("kd")
	@Export("overheadTextXOffsets")
	static int[] overheadTextXOffsets;
	@ObfuscatedName("ko")
	@Export("overheadTextColors")
	static int[] overheadTextColors;
	@ObfuscatedName("kt")
	@Export("overheadTextEffects")
	static int[] overheadTextEffects;
	@ObfuscatedName("kf")
	@Export("overheadTextCyclesRemaining")
	static int[] overheadTextCyclesRemaining;
	@ObfuscatedName("kq")
	@Export("overheadText")
	static String[] overheadText;
	@ObfuscatedName("kg")
	@Export("tileLastDrawnActor")
	static int[][] tileLastDrawnActor;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(intValue = 
	-2025340953)

	@Export("viewportDrawCount")
	static int viewportDrawCount;
	@ObfuscatedName("km")
	@ObfuscatedGetter(intValue = 
	-861538357)

	@Export("viewportTempX")
	static int viewportTempX;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(intValue = 
	41145337)

	@Export("viewportTempY")
	static int viewportTempY;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(intValue = 
	-1179160659)

	@Export("mouseCrossX")
	static int mouseCrossX;
	@ObfuscatedName("ks")
	@ObfuscatedGetter(intValue = 
	-1155625427)

	@Export("mouseCrossY")
	static int mouseCrossY;
	@ObfuscatedName("kr")
	@ObfuscatedGetter(intValue = 
	-986269893)

	@Export("mouseCrossState")
	static int mouseCrossState;
	@ObfuscatedName("kp")
	@ObfuscatedGetter(intValue = 
	1318362113)

	@Export("mouseCrossColor")
	static int mouseCrossColor;
	@ObfuscatedName("ku")
	@Export("showMouseCross")
	static boolean showMouseCross;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(intValue = 
	-1221596075)

	static int field595;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(intValue = 
	16392841)

	static int field741;
	@ObfuscatedName("ky")
	@ObfuscatedGetter(intValue = 
	-859747187)

	@Export("dragItemSlotSource")
	static int dragItemSlotSource;
	@ObfuscatedName("ka")
	@ObfuscatedGetter(intValue = 
	1957419163)

	@Export("draggedWidgetX")
	static int draggedWidgetX;
	@ObfuscatedName("kb")
	@ObfuscatedGetter(intValue = 
	-1932614367)

	@Export("draggedWidgetY")
	static int draggedWidgetY;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(intValue = 
	276455063)

	@Export("dragItemSlotDestination")
	static int dragItemSlotDestination;
	@ObfuscatedName("kv")
	static boolean field601;
	@ObfuscatedName("lz")
	@ObfuscatedGetter(intValue = 
	-1359218603)

	@Export("itemDragDuration")
	static int itemDragDuration;
	@ObfuscatedName("lu")
	@ObfuscatedGetter(intValue = 
	-763217451)

	static int field603;
	@ObfuscatedName("lq")
	@Export("showLoadingMessages")
	static boolean showLoadingMessages;
	@ObfuscatedName("ll")
	@ObfuscatedSignature(descriptor = 
	"[Lcw;")

	@Export("players")
	static Player[] players;
	@ObfuscatedName("lk")
	@ObfuscatedGetter(intValue = 
	439770895)

	@Export("localPlayerIndex")
	static int localPlayerIndex;
	@ObfuscatedName("lg")
	@ObfuscatedGetter(intValue = 
	-1383096841)

	static int field607;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(longValue = 
	6514604348113006825L)

	static long field608;
	@ObfuscatedName("lm")
	@Export("renderSelf")
	static boolean renderSelf;
	@ObfuscatedName("ls")
	@ObfuscatedGetter(intValue = 
	171593155)

	@Export("drawPlayerNames")
	static int drawPlayerNames;
	@ObfuscatedName("lr")
	@ObfuscatedGetter(intValue = 
	-754880113)

	static int field634;
	@ObfuscatedName("lp")
	static int[] field612;
	@ObfuscatedName("lw")
	@Export("playerMenuOpcodes")
	static final int[] playerMenuOpcodes;
	@ObfuscatedName("lv")
	@Export("playerMenuActions")
	static String[] playerMenuActions;
	@ObfuscatedName("le")
	@Export("playerOptionsPriorities")
	static boolean[] playerOptionsPriorities;
	@ObfuscatedName("li")
	@Export("defaultRotations")
	static int[] defaultRotations;
	@ObfuscatedName("ld")
	@ObfuscatedGetter(intValue = 
	942532963)

	@Export("combatTargetPlayerIndex")
	static int combatTargetPlayerIndex;
	@ObfuscatedName("lt")
	@ObfuscatedSignature(descriptor = 
	"[[[Lle;")

	@Export("groundItems")
	static NodeDeque[][][] groundItems;
	@ObfuscatedName("mp")
	@ObfuscatedSignature(descriptor = 
	"Lle;")

	@Export("pendingSpawns")
	static NodeDeque pendingSpawns;
	@ObfuscatedName("mq")
	@ObfuscatedSignature(descriptor = 
	"Lle;")

	@Export("projectiles")
	static NodeDeque projectiles;
	@ObfuscatedName("mt")
	@ObfuscatedSignature(descriptor = 
	"Lle;")

	@Export("graphicsObjects")
	static NodeDeque graphicsObjects;
	@ObfuscatedName("md")
	@Export("currentLevels")
	static int[] currentLevels;
	@ObfuscatedName("mj")
	@Export("levels")
	static int[] levels;
	@ObfuscatedName("mr")
	@Export("experience")
	static int[] experience;
	@ObfuscatedName("mi")
	@ObfuscatedGetter(intValue = 
	1375313987)

	@Export("leftClickOpensMenu")
	static int leftClickOpensMenu;
	@ObfuscatedName("mx")
	@Export("isMenuOpen")
	static boolean isMenuOpen;
	@ObfuscatedName("ml")
	@ObfuscatedGetter(intValue = 
	-695569243)

	@Export("menuOptionsCount")
	static int menuOptionsCount;
	@ObfuscatedName("me")
	@Export("menuArguments1")
	static int[] menuArguments1;
	@ObfuscatedName("mb")
	@Export("menuArguments2")
	static int[] menuArguments2;
	@ObfuscatedName("mk")
	@Export("menuOpcodes")
	static int[] menuOpcodes;
	@ObfuscatedName("mw")
	@Export("menuIdentifiers")
	static int[] menuIdentifiers;
	@ObfuscatedName("ma")
	@Export("menuActions")
	static String[] menuActions;
	@ObfuscatedName("mu")
	@Export("menuTargets")
	static String[] menuTargets;
	@ObfuscatedName("mg")
	@Export("menuShiftClick")
	static boolean[] menuShiftClick;
	@ObfuscatedName("mh")
	@Export("followerOpsLowPriority")
	static boolean followerOpsLowPriority;
	@ObfuscatedName("ms")
	@Export("shiftClickDrop")
	static boolean shiftClickDrop;
	@ObfuscatedName("mv")
	@Export("tapToDrop")
	static boolean tapToDrop;
	@ObfuscatedName("mm")
	@Export("showMouseOverText")
	static boolean showMouseOverText;
	@ObfuscatedName("nv")
	@ObfuscatedGetter(intValue = 
	-1871086395)

	@Export("viewportX")
	static int viewportX;
	@ObfuscatedName("nt")
	@ObfuscatedGetter(intValue = 
	-1530402969)

	@Export("viewportY")
	static int viewportY;
	@ObfuscatedName("np")
	@ObfuscatedGetter(intValue = 
	2027210895)

	static int field641;
	@ObfuscatedName("nc")
	@ObfuscatedGetter(intValue = 
	-238451065)

	static int field642;
	@ObfuscatedName("nq")
	@ObfuscatedGetter(intValue = 
	-320489825)

	@Export("isItemSelected")
	static int isItemSelected;
	@ObfuscatedName("ng")
	@Export("isSpellSelected")
	static boolean isSpellSelected;
	@ObfuscatedName("ni")
	@ObfuscatedGetter(intValue = 
	-419489305)

	@Export("selectedSpellChildIndex")
	static int selectedSpellChildIndex;
	@ObfuscatedName("nj")
	@ObfuscatedGetter(intValue = 
	913012823)

	static int field688;
	@ObfuscatedName("ny")
	@Export("selectedSpellActionName")
	static String selectedSpellActionName;
	@ObfuscatedName("nh")
	@Export("selectedSpellName")
	static String selectedSpellName;
	@ObfuscatedName("nn")
	@ObfuscatedGetter(intValue = 
	1841301513)

	@Export("rootInterface")
	static int rootInterface;
	@ObfuscatedName("nz")
	@ObfuscatedSignature(descriptor = 
	"Lpo;")

	@Export("interfaceParents")
	static NodeHashTable interfaceParents;
	@ObfuscatedName("nf")
	@ObfuscatedGetter(intValue = 
	709549119)

	static int field652;
	@ObfuscatedName("nu")
	@ObfuscatedGetter(intValue = 
	773813339)

	static int field653;
	@ObfuscatedName("nr")
	@ObfuscatedGetter(intValue = 
	-726450495)

	@Export("chatEffects")
	static int chatEffects;
	@ObfuscatedName("na")
	@ObfuscatedGetter(intValue = 
	-2056870609)

	static int field655;
	@ObfuscatedName("od")
	@ObfuscatedSignature(descriptor = 
	"Lkn;")

	@Export("meslayerContinueWidget")
	static Widget meslayerContinueWidget;
	@ObfuscatedName("os")
	@ObfuscatedGetter(intValue = 
	1511589879)

	@Export("runEnergy")
	static int runEnergy;
	@ObfuscatedName("oo")
	@ObfuscatedGetter(intValue = 
	114871879)

	@Export("weight")
	static int weight;
	@ObfuscatedName("of")
	@ObfuscatedGetter(intValue = 
	245777471)

	@Export("staffModLevel")
	public static int staffModLevel;
	@ObfuscatedName("oi")
	@ObfuscatedGetter(intValue = 
	-1876332251)

	@Export("followerIndex")
	static int followerIndex;
	@ObfuscatedName("oe")
	@Export("playerMod")
	static boolean playerMod;
	@ObfuscatedName("oc")
	@ObfuscatedSignature(descriptor = 
	"Lkn;")

	@Export("viewportWidget")
	static Widget viewportWidget;
	@ObfuscatedName("om")
	@ObfuscatedSignature(descriptor = 
	"Lkn;")

	@Export("clickedWidget")
	static Widget clickedWidget;
	@ObfuscatedName("ob")
	@ObfuscatedSignature(descriptor = 
	"Lkn;")

	@Export("clickedWidgetParent")
	static Widget clickedWidgetParent;
	@ObfuscatedName("ox")
	@ObfuscatedGetter(intValue = 
	-113793529)

	@Export("widgetClickX")
	static int widgetClickX;
	@ObfuscatedName("op")
	@ObfuscatedGetter(intValue = 
	-2043651089)

	@Export("widgetClickY")
	static int widgetClickY;
	@ObfuscatedName("ou")
	@ObfuscatedSignature(descriptor = 
	"Lkn;")

	@Export("draggedOnWidget")
	static Widget draggedOnWidget;
	@ObfuscatedName("ol")
	static boolean field668;
	@ObfuscatedName("oh")
	@ObfuscatedGetter(intValue = 
	-1143835253)

	static int field669;
	@ObfuscatedName("og")
	@ObfuscatedGetter(intValue = 
	22061565)

	static int field628;
	@ObfuscatedName("oq")
	static boolean field671;
	@ObfuscatedName("or")
	@ObfuscatedGetter(intValue = 
	903753461)

	static int field596;
	@ObfuscatedName("oj")
	@ObfuscatedGetter(intValue = 
	1998416981)

	static int field673;
	@ObfuscatedName("oz")
	@Export("isDraggingWidget")
	static boolean isDraggingWidget;
	@ObfuscatedName("on")
	@ObfuscatedGetter(intValue = 
	-1738168199)

	@Export("cycleCntr")
	static int cycleCntr;
	@ObfuscatedName("pg")
	@Export("changedVarps")
	static int[] changedVarps;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(intValue = 
	-1421271391)

	@Export("changedVarpCount")
	static int changedVarpCount;
	@ObfuscatedName("po")
	@Export("changedItemContainers")
	static int[] changedItemContainers;
	@ObfuscatedName("px")
	@ObfuscatedGetter(intValue = 
	1404029533)

	static int field746;
	@ObfuscatedName("pf")
	@Export("changedSkills")
	static int[] changedSkills;
	@ObfuscatedName("pa")
	@ObfuscatedGetter(intValue = 
	2109604157)

	@Export("changedSkillsCount")
	static int changedSkillsCount;
	@ObfuscatedName("pe")
	static int[] field682;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(intValue = 
	2129941941)

	static int field683;
	@ObfuscatedName("pz")
	@ObfuscatedGetter(intValue = 
	1046213047)

	@Export("chatCycle")
	static int chatCycle;
	@ObfuscatedName("ph")
	@ObfuscatedGetter(intValue = 
	-80976053)

	static int field685;
	@ObfuscatedName("ps")
	@ObfuscatedGetter(intValue = 
	-96614403)

	static int field726;
	@ObfuscatedName("pj")
	@ObfuscatedGetter(intValue = 
	1238069005)

	static int field687;
	@ObfuscatedName("pk")
	@ObfuscatedGetter(intValue = 
	-405028691)

	static int field749;
	@ObfuscatedName("pt")
	@ObfuscatedGetter(intValue = 
	-1795985535)

	static int field689;
	@ObfuscatedName("pi")
	@ObfuscatedGetter(intValue = 
	514531863)

	static int field572;
	@ObfuscatedName("pc")
	@ObfuscatedGetter(intValue = 
	-2000287459)

	static int field762;
	@ObfuscatedName("pd")
	@ObfuscatedGetter(intValue = 
	762274993)

	@Export("mouseWheelRotation")
	static int mouseWheelRotation;
	@ObfuscatedName("pw")
	@ObfuscatedSignature(descriptor = 
	"Lle;")

	@Export("scriptEvents")
	static NodeDeque scriptEvents;
	@ObfuscatedName("pm")
	@ObfuscatedSignature(descriptor = 
	"Lle;")

	static NodeDeque field694;
	@ObfuscatedName("pn")
	@ObfuscatedSignature(descriptor = 
	"Lle;")

	static NodeDeque field695;
	@ObfuscatedName("pb")
	@ObfuscatedSignature(descriptor = 
	"Lpo;")

	@Export("widgetFlags")
	static NodeHashTable widgetFlags;
	@ObfuscatedName("qa")
	@ObfuscatedGetter(intValue = 
	-1183396979)

	@Export("rootWidgetCount")
	static int rootWidgetCount;
	@ObfuscatedName("qf")
	@ObfuscatedGetter(intValue = 
	365020005)

	static int field698;
	@ObfuscatedName("qk")
	static boolean[] field564;
	@ObfuscatedName("qm")
	static boolean[] field651;
	@ObfuscatedName("qh")
	static boolean[] field576;
	@ObfuscatedName("qs")
	@Export("rootWidgetXs")
	static int[] rootWidgetXs;
	@ObfuscatedName("qx")
	@Export("rootWidgetYs")
	static int[] rootWidgetYs;
	@ObfuscatedName("ql")
	@Export("rootWidgetWidths")
	static int[] rootWidgetWidths;
	@ObfuscatedName("qb")
	@Export("rootWidgetHeights")
	static int[] rootWidgetHeights;
	@ObfuscatedName("qj")
	@ObfuscatedGetter(intValue = 
	-2080658517)

	@Export("gameDrawingMode")
	static int gameDrawingMode;
	@ObfuscatedName("qo")
	@ObfuscatedGetter(longValue = 
	4892386005405626473L)

	static long field529;
	@ObfuscatedName("qv")
	@Export("isResizable")
	static boolean isResizable;
	@ObfuscatedName("qe")
	static int[] field709;
	@ObfuscatedName("fd")
	String field518;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(descriptor = 
	"Lp;")

	class14 field519;
	@ObfuscatedName("fs")
	@ObfuscatedSignature(descriptor = 
	"Lm;")

	class19 field618;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(descriptor = 
	"Lcom/jagex/oldscape/pub/OtlTokenRequester;")

	OtlTokenRequester field544;
	@ObfuscatedName("fi")
	Future field522;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(descriptor = 
	"Lpd;")

	Buffer field525;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(descriptor = 
	"Lf;")

	class7 field526;
	@ObfuscatedName("gp")
	@ObfuscatedGetter(longValue = 
	-4252506564993549717L)

	long field658;
	static 
	{
		field536 = true;
		worldId = 1;
		worldProperties = 0;
		gameBuild = 0;
		isMembersWorld = false;
		isLowDetail = false;
		field484 = -1;
		clientType = -1;
		field486 = -1;
		onMobile = false;
		gameState = 0;
		isLoading = true;
		cycle = 0;
		mouseLastLastPressedTimeMillis = -1L;
		field493 = -1;
		field494 = -1;
		field495 = -1L;
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
		field510 = 0;
		js5Errors = 0;
		loginState = 0;
		field513 = 0;
		field742 = 0;
		field490 = 0;
		field516 = class124.field1510;
		field517 = class441.field4672;
		Login_isUsernameRemembered = false;
		secureRandomFuture = new SecureRandomFuture();
		randomDatData = null;
		npcs = new NPC[32768];
		npcCount = 0;
		npcIndices = new int[32768];
		field609 = 0;
		field533 = new int[250];
		packetWriter = new PacketWriter();
		logoutTimer = 0;
		hadNetworkError = false;
		useBufferedSocket = true;
		field753 = false;
		timer = new Timer();
		fontsMap = new HashMap();
		field541 = 0;
		field558 = 1;
		field543 = 0;
		field679 = 1;
		field545 = 0;
		collisionMaps = new CollisionMap[4];
		isInInstance = false;
		instanceChunkTemplates = new int[4][13][13];
		field711 = new int[]{ 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		field550 = 0;
		field619 = 2301979;
		field684 = 5063219;
		field554 = 3353893;
		field514 = 7759444;
		field556 = false;
		alternativeScrollbarWidth = 0;
		camAngleX = 128;
		camAngleY = 0;
		camAngleDY = 0;
		camAngleDX = 0;
		mouseCamClickedX = 0;
		mouseCamClickedY = 0;
		oculusOrbState = 0;
		camFollowHeight = 50;
		field566 = 0;
		field567 = 0;
		field696 = 0;
		oculusOrbNormalSpeed = 12;
		oculusOrbSlowedSpeed = 6;
		field571 = 0;
		field602 = false;
		field542 = 0;
		field616 = false;
		field756 = 0;
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
		field595 = 0;
		field741 = 0;
		dragItemSlotSource = 0;
		draggedWidgetX = 0;
		draggedWidgetY = 0;
		dragItemSlotDestination = 0;
		field601 = false;
		itemDragDuration = 0;
		field603 = 0;
		showLoadingMessages = true;
		players = new Player[2048];
		localPlayerIndex = -1;
		field607 = 0;
		field608 = -1L;
		renderSelf = true;
		drawPlayerNames = 0;
		field634 = 0;
		field612 = new int[1000];
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
		field641 = 0;
		field642 = 50;
		isItemSelected = 0;
		selectedItemName = null;
		isSpellSelected = false;
		selectedSpellChildIndex = -1;
		field688 = -1;
		selectedSpellActionName = null;
		selectedSpellName = null;
		rootInterface = -1;
		interfaceParents = new NodeHashTable(8);
		field652 = 0;
		field653 = -1;
		chatEffects = 0;
		field655 = 0;
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
		field668 = false;
		field669 = -1;
		field628 = -1;
		field671 = false;
		field596 = -1;
		field673 = -1;
		isDraggingWidget = false;
		cycleCntr = 1;
		changedVarps = new int[32];
		changedVarpCount = 0;
		changedItemContainers = new int[32];
		field746 = 0;
		changedSkills = new int[32];
		changedSkillsCount = 0;
		field682 = new int[32];
		field683 = 0;
		chatCycle = 0;
		field685 = 0;
		field726 = 0;
		field687 = 0;
		field749 = 0;
		field689 = 0;
		field572 = 0;
		field762 = 0;
		mouseWheelRotation = 0;
		scriptEvents = new NodeDeque();
		field694 = new NodeDeque();
		field695 = new NodeDeque();
		widgetFlags = new NodeHashTable(512);
		rootWidgetCount = 0;
		field698 = -2;
		field564 = new boolean[100];
		field651 = new boolean[100];
		field576 = new boolean[100];
		rootWidgetXs = new int[100];
		rootWidgetYs = new int[100];
		rootWidgetWidths = new int[100];
		rootWidgetHeights = new int[100];
		gameDrawingMode = 0;
		field529 = 0L;
		isResizable = true;
		field709 = new int[]{ 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		publicChatMode = 0;
		tradeChatMode = 0;
		field712 = "";
		crossWorldMessageIds = new long[100];
		crossWorldMessageIdsIndex = 0;
		field713 = 0;
		field716 = new int[128];
		field568 = new int[128];
		field718 = -1L;
		currentClanSettings = new ClanSettings[3];
		currentClanChannels = new ClanChannel[3];
		field721 = -1;
		mapIconCount = 0;
		mapIconXs = new int[1000];
		mapIconYs = new int[1000];
		mapIcons = new SpritePixels[1000];
		destinationX = 0;
		destinationY = 0;
		minimapState = 0;
		currentTrackGroupId = -1;
		field731 = false;
		soundEffectCount = 0;
		soundEffectIds = new int[50];
		queuedSoundEffectLoops = new int[50];
		queuedSoundEffectDelays = new int[50];
		soundLocations = new int[50];
		soundEffects = new SoundEffect[50];
		isCameraLocked = false;
		field739 = false;
		field740 = new boolean[5];
		field482 = new int[5];
		field549 = new int[5];
		field766 = new int[5];
		field744 = new int[5];
		field745 = 256;
		field706 = 205;
		zoomHeight = 256;
		zoomWidth = 320;
		field562 = 1;
		field750 = 32767;
		field751 = 1;
		field752 = 32767;
		viewportOffsetX = 0;
		viewportOffsetY = 0;
		viewportWidth = 0;
		viewportHeight = 0;
		viewportZoom = 0;
		playerAppearance = new PlayerComposition();
		field759 = -1;
		field738 = -1;
		platformInfoProvider = new DesktopPlatformInfoProvider();
		grandExchangeOffers = new GrandExchangeOffer[8];
		GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
		field764 = -1;
		archiveLoaders = new ArrayList(10);
		archiveLoadersDone = 0;
		field767 = 0;
		field477 = new ApproximateRouteStrategy();
		field743 = new int[50];
		field670 = new int[50];
	}

	public Client() {
		this.field658 = -1L;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"1")

	@Export("resizeGame")
	protected final void resizeGame() {
		field529 = WorldMapSprite.getServerTime() + 500L;
		this.resizeJS();
		if (rootInterface != (-1)) {
			this.resizeRoot(true);
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"120")

	@Export("setUp")
	protected final void setUp() {
		int[] var1 = new int[]{ 20, 260, 10000 };
		int[] var2 = new int[]{ 1000, 100, 500 };
		if ((var1 != null) && (var2 != null)) {
			ByteArrayPool.ByteArrayPool_alternativeSizes = var1;
			GameObject.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
			ScriptEvent.ByteArrayPool_arrays = new byte[var1.length][][];

			for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) {
				ScriptEvent.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
				ByteArrayPool.field4173.add(var1[var3]);
			}

			Collections.sort(ByteArrayPool.field4173);
		} else {
			ByteArrayPool.ByteArrayPool_alternativeSizes = null;
			GameObject.ByteArrayPool_altSizeArrayCounts = null;
			ScriptEvent.ByteArrayPool_arrays = null;
			ByteArrayPool.field4173.clear();
			ByteArrayPool.field4173.add(100);
			ByteArrayPool.field4173.add(5000);
			ByteArrayPool.field4173.add(10000);
			ByteArrayPool.field4173.add(30000);
		}

		class101.worldPort = (gameBuild == 0) ? 43594 : worldId + 40000;
		BuddyRankComparator.js5Port = (gameBuild == 0) ? 443 : worldId + 50000;
		ItemContainer.currentPort = class101.worldPort;
		TileItem.field1281 = class293.field3323;
		class20.field102 = class293.field3321;
		VerticalAlignment.field1950 = class293.field3320;
		class160.field1747 = class293.field3326;
		UserComparator9.urlRequester = new class101();
		this.setUpKeyboard();
		this.method534();
		class18.mouseWheel = this.mouseWheel();
		PcmPlayer.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		Interpreter.clientPreferences = class349.method6537();
		this.setUpClipboard();
		String var4 = ModeWhere.field4087;
		class29.field168 = this;
		if (var4 != null) {
			class29.field169 = var4;
		}

		UserComparator6.setWindowedMode(Interpreter.clientPreferences.method2317());
		class155.friendSystem = new FriendSystem(class83.loginType);
		this.field519 = new class14("tokenRequest", 1, 1);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"0")

	@Export("doCycle")
	protected final void doCycle() {
		++cycle;
		this.doCycleJs5();
		Canvas.method391();
		class126.method2819();
		MouseHandler.playPcmPlayers();
		synchronized(KeyHandler.KeyHandler_instance) {
			++KeyHandler.KeyHandler_idleCycles;
			KeyHandler.field135 = KeyHandler.field137;
			KeyHandler.field132 = 0;
			KeyHandler.field134 = 0;
			Arrays.fill(KeyHandler.field121, false);
			Arrays.fill(KeyHandler.field125, false);
			if (KeyHandler.field124 < 0) {
				Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
				KeyHandler.field124 = KeyHandler.field138;
			} else {
				while (KeyHandler.field138 != KeyHandler.field124) {
					int var2 = KeyHandler.field129[KeyHandler.field138];
					KeyHandler.field138 = (KeyHandler.field138 + 1) & 127;
					if (var2 < 0) {
						var2 = ~var2;
						if (KeyHandler.KeyHandler_pressedKeys[var2]) {
							KeyHandler.KeyHandler_pressedKeys[var2] = false;
							KeyHandler.field125[var2] = true;
							KeyHandler.field133[KeyHandler.field134] = var2;
							++KeyHandler.field134;
						}
					} else {
						if ((!KeyHandler.KeyHandler_pressedKeys[var2]) && (KeyHandler.field132 < (KeyHandler.field139.length - 1))) {
							KeyHandler.field121[var2] = true;
							KeyHandler.field139[(++KeyHandler.field132) - 1] = var2;
						}

						KeyHandler.KeyHandler_pressedKeys[var2] = true;
					}
				} 
			}

			if (KeyHandler.field132 > 0) {
				KeyHandler.KeyHandler_idleCycles = 0;
			}

			KeyHandler.field137 = KeyHandler.field136;
		}

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

		if (class18.mouseWheel != null) {
			int var5 = class18.mouseWheel.useRotation();
			mouseWheelRotation = var5;
		}

		if (gameState == 0) {
			HorizontalAlignment.load();
			class78.method2098();
		} else if (gameState == 5) {
			class194.method3894(this, ViewportMouse.fontPlain12);
			HorizontalAlignment.load();
			class78.method2098();
		} else if ((gameState != 10) && (gameState != 11)) {
			if (gameState == 20) {
				class194.method3894(this, ViewportMouse.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 50) {
				class194.method3894(this, ViewportMouse.fontPlain12);
				this.doCycleLoggedOut();
			} else if (gameState == 25) {
				DirectByteArrayCopier.method5546();
			}
		} else {
			class194.method3894(this, ViewportMouse.fontPlain12);
		}

		if (gameState == 30) {
			this.doCycleLoggedIn();
		} else if ((gameState == 40) || (gameState == 45)) {
			this.doCycleLoggedOut();
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(ZI)V", garbageValue = 
	"1683905481")

	@Export("draw")
	protected final void draw(boolean var1) {
		boolean var2 = class356.method6621();
		if ((var2 && field731) && (class290.pcmPlayer0 != null)) {
			class290.pcmPlayer0.tryDiscard();
		}

		if (((((gameState == 10) || (gameState == 20)) || (gameState == 30)) && (field529 != 0L)) && (WorldMapSprite.getServerTime() > field529)) {
			UserComparator6.setWindowedMode(ReflectionCheck.getWindowedMode());
		}

		int var3;
		if (var1) {
			for (var3 = 0; var3 < 100; ++var3) {
				field564[var3] = true;
			}
		}

		if (gameState == 0) {
			this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
		} else if (gameState == 5) {
			class132.drawTitle(FloorOverlayDefinition.fontBold12, TextureProvider.fontPlain11, ViewportMouse.fontPlain12);
		} else if ((gameState != 10) && (gameState != 11)) {
			if (gameState == 20) {
				class132.drawTitle(FloorOverlayDefinition.fontBold12, TextureProvider.fontPlain11, ViewportMouse.fontPlain12);
			} else if (gameState == 50) {
				class132.drawTitle(FloorOverlayDefinition.fontBold12, TextureProvider.fontPlain11, ViewportMouse.fontPlain12);
			} else if (gameState == 25) {
				if (field545 == 1) {
					if (field541 > field558) {
						field558 = field541;
					}

					var3 = ((field558 * 50) - (field541 * 50)) / field558;
					class119.drawLoadingMessage(((("Loading - please wait." + ("<br>" + " (")) + var3) + "%") + ")", false);
				} else if (field545 == 2) {
					if (field543 > field679) {
						field679 = field543;
					}

					var3 = (((field679 * 50) - (field543 * 50)) / field679) + 50;
					class119.drawLoadingMessage(((("Loading - please wait." + ("<br>" + " (")) + var3) + "%") + ")", false);
				} else {
					class119.drawLoadingMessage("Loading - please wait.", false);
				}
			} else if (gameState == 30) {
				this.drawLoggedIn();
			} else if (gameState == 40) {
				class119.drawLoadingMessage("Connection lost" + ("<br>" + "Please wait - attempting to reestablish"), false);
			} else if (gameState == 45) {
				class119.drawLoadingMessage("Please wait...", false);
			}
		} else {
			class132.drawTitle(FloorOverlayDefinition.fontBold12, TextureProvider.fontPlain11, ViewportMouse.fontPlain12);
		}

		if ((((gameState == 30) && (gameDrawingMode == 0)) && (!var1)) && (!isResizable)) {
			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				if (field651[var3]) {
					SpotAnimationDefinition.rasterProvider.draw(rootWidgetXs[var3], rootWidgetYs[var3], rootWidgetWidths[var3], rootWidgetHeights[var3]);
					field651[var3] = false;
				}
			}
		} else if (gameState > 0) {
			SpotAnimationDefinition.rasterProvider.drawFull(0, 0);

			for (var3 = 0; var3 < rootWidgetCount; ++var3) {
				field651[var3] = false;
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"2114912088")

	@Export("kill0")
	protected final void kill0() {
		if (JagexCache.varcs.hasUnwrittenChanges()) {
			JagexCache.varcs.write();
		}

		if (BuddyRankComparator.mouseRecorder != null) {
			BuddyRankComparator.mouseRecorder.isRunning = false;
		}

		BuddyRankComparator.mouseRecorder = null;
		packetWriter.close();
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}

		class160.method3237();
		class18.mouseWheel = null;
		if (class290.pcmPlayer0 != null) {
			class290.pcmPlayer0.shutdown();
		}

		if (class182.pcmPlayer1 != null) {
			class182.pcmPlayer1.shutdown();
		}

		class309.method5804();
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3940 != 0) {
				ArchiveDiskActionHandler.field3940 = 1;

				try {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
				} catch (InterruptedException var4) {
				}
			}
		}

		if (UserComparator9.urlRequester != null) {
			UserComparator9.urlRequester.close();
			UserComparator9.urlRequester = null;
		}

		World.method1655();
		this.field519.method178();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"14")

	protected final void vmethod1135() {
	}

	@ObfuscatedName("ep")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1620120590")

	boolean method1138() {
		return (AbstractWorldMapData.field2796 != null) && (!AbstractWorldMapData.field2796.trim().isEmpty());
	}

	@ObfuscatedName("ey")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"34")

	boolean method1139() {
		return this.field544 != null;
	}

	@ObfuscatedName("es")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)V", garbageValue = 
	"70")

	void method1146(String var1) throws MalformedURLException, IOException {
		URL var2 = new URL(class124.field1518 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
		OtlTokenRequester var3 = this.field544;
		if (var3 != null) {
			this.field522 = var3.request(var2);
		} else {
			class10 var4 = new class10(var2, class9.field44);
			var4.method87("Authorization", "Bearer " + var1);
			this.field618 = this.field519.method180(var4);
		}
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1743294306")

	@Export("doCycleJs5")
	void doCycleJs5() {
		if (gameState != 1000) {
			boolean var1 = class65.method1875();
			if (!var1) {
				this.doCycleJs5Connect();
			}

		}
	}

	@ObfuscatedName("et")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1720635301")

	@Export("doCycleJs5Connect")
	void doCycleJs5Connect() {
		if (NetCache.NetCache_crcMismatches >= 4) {
			this.error("js5crc");
			InterfaceParent.updateGameState(1000);
		} else {
			if (NetCache.NetCache_ioExceptions >= 4) {
				if (gameState <= 5) {
					this.error("js5io");
					InterfaceParent.updateGameState(1000);
					return;
				}

				field510 = 3000;
				NetCache.NetCache_ioExceptions = 3;
			}

			if (((--field510) + 1) <= 0) {
				try {
					if (js5ConnectState == 0) {
						class194.js5SocketTask = class434.taskHandler.newSocketTask(GrandExchangeOfferOwnWorldComparator.worldHost, ItemContainer.currentPort);
						++js5ConnectState;
					}

					if (js5ConnectState == 1) {
						if (class194.js5SocketTask.status == 2) {
							this.js5Error(-1);
							return;
						}

						if (class194.js5SocketTask.status == 1) {
							++js5ConnectState;
						}
					}

					if (js5ConnectState == 2) {
						if (useBufferedSocket) {
							Socket var2 = ((Socket) (class194.js5SocketTask.result));
							BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
							ApproximateRouteStrategy.js5Socket = var1;
						} else {
							ApproximateRouteStrategy.js5Socket = new NetSocket(((Socket) (class194.js5SocketTask.result)), class434.taskHandler, 5000);
						}

						Buffer var11 = new Buffer(5);
						var11.writeByte(15);
						var11.writeInt(204);
						ApproximateRouteStrategy.js5Socket.write(var11.array, 0, 5);
						++js5ConnectState;
						class29.field165 = WorldMapSprite.getServerTime();
					}

					if (js5ConnectState == 3) {
						if ((ApproximateRouteStrategy.js5Socket.available() > 0) || ((!useBufferedSocket) && (gameState <= 5))) {
							int var5 = ApproximateRouteStrategy.js5Socket.readUnsignedByte();
							if (var5 != 0) {
								this.js5Error(var5);
								return;
							}

							++js5ConnectState;
						} else if ((WorldMapSprite.getServerTime() - class29.field165) > 30000L) {
							this.js5Error(-2);
							return;
						}
					}

					if (js5ConnectState == 4) {
						AbstractSocket var12 = ApproximateRouteStrategy.js5Socket;
						boolean var6 = gameState > 20;
						if (NetCache.NetCache_socket != null) {
							try {
								NetCache.NetCache_socket.close();
							} catch (Exception var9) {
							}

							NetCache.NetCache_socket = null;
						}

						NetCache.NetCache_socket = var12;
						NPC.method2366(var6);
						NetCache.NetCache_responseHeaderBuffer.offset = 0;
						NetCache.NetCache_currentResponse = null;
						class291.NetCache_responseArchiveBuffer = null;
						NetCache.field3990 = 0;

						while (true) {
							NetFileRequest var3 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.first()));
							if (var3 == null) {
								while (true) {
									var3 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.first()));
									if (var3 == null) {
										if (NetCache.field3999 != 0) {
											try {
												Buffer var13 = new Buffer(4);
												var13.writeByte(4);
												var13.writeByte(NetCache.field3999);
												var13.writeShort(0);
												NetCache.NetCache_socket.write(var13.array, 0, 4);
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
										NetCache.field3976 = WorldMapSprite.getServerTime();
										class194.js5SocketTask = null;
										ApproximateRouteStrategy.js5Socket = null;
										js5ConnectState = 0;
										js5Errors = 0;
										return;
									}

									NetCache.NetCache_pendingWritesQueue.addLast(var3);
									NetCache.NetCache_pendingWrites.put(var3, var3.key);
									++NetCache.NetCache_pendingWritesCount;
									--NetCache.NetCache_pendingResponsesCount;
								} 
							}

							NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key);
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

	@ObfuscatedName("ew")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1597130616")

	@Export("js5Error")
	void js5Error(int var1) {
		class194.js5SocketTask = null;
		ApproximateRouteStrategy.js5Socket = null;
		js5ConnectState = 0;
		if (ItemContainer.currentPort == class101.worldPort) {
			ItemContainer.currentPort = BuddyRankComparator.js5Port;
		} else {
			ItemContainer.currentPort = class101.worldPort;
		}

		++js5Errors;
		if ((js5Errors >= 2) && ((var1 == 7) || (var1 == 9))) {
			if (gameState <= 5) {
				this.error("js5connect_full");
				InterfaceParent.updateGameState(1000);
			} else {
				field510 = 3000;
			}
		} else if ((js5Errors >= 2) && (var1 == 6)) {
			this.error("js5connect_outofdate");
			InterfaceParent.updateGameState(1000);
		} else if (js5Errors >= 4) {
			if (gameState <= 5) {
				this.error("js5connect");
				InterfaceParent.updateGameState(1000);
			} else {
				field510 = 3000;
			}
		}

	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1515563233")

	@Export("doCycleLoggedOut")
	final void doCycleLoggedOut() {
		Object var1 = packetWriter.getSocket();
		PacketBuffer var2 = Client.packetWriter.packetBuffer;

		try {
			if (loginState == 0) {
				if ((class260.secureRandom == null) && (secureRandomFuture.isDone() || (field513 > 250))) {
					class260.secureRandom = secureRandomFuture.get();
					secureRandomFuture.shutdown();
					secureRandomFuture = null;
				}

				if (class260.secureRandom != null) {
					if (var1 != null) {
						((AbstractSocket) (var1)).close();
						var1 = null;
					}

					WorldMapEvent.socketTask = null;
					hadNetworkError = false;
					field513 = 0;
					if (field517.method8013()) {
						try {
							this.method1146(AbstractWorldMapData.field2796);
							UrlRequester.method2533(20);
						} catch (Throwable var23) {
							class301.RunException_sendStackTrace(((String) (null)), var23);
							class150.getLoginError(65);
							return;
						}
					} else {
						UrlRequester.method2533(1);
					}
				}
			}

			if (loginState == 20) {
				if (this.field522 != null) {
					if (!this.field522.isDone()) {
						return;
					}

					if (this.field522.isCancelled()) {
						class150.getLoginError(65);
						this.field522 = null;
						return;
					}

					try {
						OtlTokenResponse var3 = ((OtlTokenResponse) (this.field522.get()));
						if (!var3.isSuccess()) {
							class150.getLoginError(65);
							this.field522 = null;
							return;
						}

						this.field518 = var3.getToken();
						this.field522 = null;
					} catch (Exception var22) {
						class301.RunException_sendStackTrace(((String) (null)), var22);
						class150.getLoginError(65);
						this.field522 = null;
						return;
					}
				} else {
					if (this.field618 == null) {
						class150.getLoginError(65);
						return;
					}

					if (!this.field618.method303()) {
						return;
					}

					if (this.field618.method316()) {
						class301.RunException_sendStackTrace(this.field618.method299(), ((Throwable) (null)));
						class150.getLoginError(65);
						this.field618 = null;
						return;
					}

					class21 var25 = this.field618.method301();
					if (var25.method328() != 200) {
						class301.RunException_sendStackTrace((("Response code: " + var25.method328()) + "Response body: ") + var25.method330(), ((Throwable) (null)));
						class150.getLoginError(65);
						this.field618 = null;
						return;
					}

					this.field518 = var25.method330();
					this.field618 = null;
				}

				field513 = 0;
				UrlRequester.method2533(1);
			}

			if (loginState == 1) {
				if (WorldMapEvent.socketTask == null) {
					WorldMapEvent.socketTask = class434.taskHandler.newSocketTask(GrandExchangeOfferOwnWorldComparator.worldHost, ItemContainer.currentPort);
				}

				if (WorldMapEvent.socketTask.status == 2) {
					throw new IOException();
				}

				if (WorldMapEvent.socketTask.status == 1) {
					if (useBufferedSocket) {
						Socket var4 = ((Socket) (WorldMapEvent.socketTask.result));
						BufferedNetSocket var26 = new BufferedNetSocket(var4, 40000, 5000);
						var1 = var26;
					} else {
						var1 = new NetSocket(((Socket) (WorldMapEvent.socketTask.result)), class434.taskHandler, 5000);
					}

					packetWriter.setSocket(((AbstractSocket) (var1)));
					WorldMapEvent.socketTask = null;
					UrlRequester.method2533(2);
				}
			}

			PacketBufferNode var27;
			if (loginState == 2) {
				packetWriter.clearBuffer();
				var27 = FriendSystem.method1723();
				var27.packetBuffer.writeByte(LoginPacket.field3135.id);
				packetWriter.addNode(var27);
				packetWriter.flush();
				var2.offset = 0;
				UrlRequester.method2533(3);
			}

			boolean var12;
			int var13;
			if (loginState == 3) {
				if (class290.pcmPlayer0 != null) {
					class290.pcmPlayer0.method722();
				}

				if (class182.pcmPlayer1 != null) {
					class182.pcmPlayer1.method722();
				}

				var12 = true;
				if (useBufferedSocket && (!((AbstractSocket) (var1)).isAvailable(1))) {
					var12 = false;
				}

				if (var12) {
					var13 = ((AbstractSocket) (var1)).readUnsignedByte();
					if (class290.pcmPlayer0 != null) {
						class290.pcmPlayer0.method722();
					}

					if (class182.pcmPlayer1 != null) {
						class182.pcmPlayer1.method722();
					}

					if (var13 != 0) {
						class150.getLoginError(var13);
						return;
					}

					var2.offset = 0;
					UrlRequester.method2533(4);
				}
			}

			int var40;
			if (loginState == 4) {
				if (var2.offset < 8) {
					var40 = ((AbstractSocket) (var1)).available();
					if (var40 > (8 - var2.offset)) {
						var40 = 8 - var2.offset;
					}

					if (var40 > 0) {
						((AbstractSocket) (var1)).read(var2.array, var2.offset, var40);
						var2.offset += var40;
					}
				}

				if (var2.offset == 8) {
					var2.offset = 0;
					class121.field1479 = var2.readLong();
					UrlRequester.method2533(5);
				}
			}

			int var7;
			int var9;
			int var14;
			if (loginState == 5) {
				Client.packetWriter.packetBuffer.offset = 0;
				packetWriter.clearBuffer();
				PacketBuffer var28 = new PacketBuffer(500);
				int[] var29 = new int[]{ class260.secureRandom.nextInt(), class260.secureRandom.nextInt(), class260.secureRandom.nextInt(), class260.secureRandom.nextInt() };
				var28.offset = 0;
				var28.writeByte(1);
				var28.writeInt(var29[0]);
				var28.writeInt(var29[1]);
				var28.writeInt(var29[2]);
				var28.writeInt(var29[3]);
				var28.writeLong(class121.field1479);
				int var11;
				if (gameState == 40) {
					var28.writeInt(NPCComposition.field1918[0]);
					var28.writeInt(NPCComposition.field1918[1]);
					var28.writeInt(NPCComposition.field1918[2]);
					var28.writeInt(NPCComposition.field1918[3]);
				} else {
					if (gameState == 50) {
						var28.writeByte(class124.field1512.rsOrdinal());
						var28.writeInt(class9.field35);
					} else {
						var28.writeByte(field516.rsOrdinal());
						switch (Client.field516.field1513) {
							case 0 :
							case 3 :
								var28.writeMedium(UrlRequest.field1346);
								++var28.offset;
								break;
							case 1 :
								LinkedHashMap var6 = Interpreter.clientPreferences.parameters;
								String var8 = Login.Login_username;
								var9 = var8.length();
								int var10 = 0;

								for (var11 = 0; var11 < var9; ++var11) {
									var10 = ((var10 << 5) - var10) + var8.charAt(var11);
								}

								var28.writeInt(((Integer) (var6.get(var10))));
								break;
							case 2 :
								var28.offset += 4;}

					}

					if (field517.method8013()) {
						var28.writeByte(class441.field4667.rsOrdinal());
						var28.writeStringCp1252NullTerminated(this.field518);
					} else {
						var28.writeByte(class441.field4672.rsOrdinal());
						var28.writeStringCp1252NullTerminated(Login.Login_password);
					}
				}

				var28.encryptRsa(class67.field875, class67.field878);
				NPCComposition.field1918 = var29;
				PacketBufferNode var5 = FriendSystem.method1723();
				var5.packetBuffer.offset = 0;
				if (gameState == 40) {
					var5.packetBuffer.writeByte(LoginPacket.field3134.id);
				} else {
					var5.packetBuffer.writeByte(LoginPacket.field3133.id);
				}

				var5.packetBuffer.writeShort(0);
				var14 = var5.packetBuffer.offset;
				var5.packetBuffer.writeInt(204);
				var5.packetBuffer.writeInt(1);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeByte(field486);
				var5.packetBuffer.writeBytes(var28.array, 0, var28.offset);
				var7 = var5.packetBuffer.offset;
				var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
				var5.packetBuffer.writeByte(((isResizable ? 1 : 0) << 1) | (isLowDetail ? 1 : 0));
				var5.packetBuffer.writeShort(class4.canvasWidth);
				var5.packetBuffer.writeShort(class309.canvasHeight);
				PacketBuffer var38 = var5.packetBuffer;
				if (randomDatData != null) {
					var38.writeBytes(randomDatData, 0, Client.randomDatData.length);
				} else {
					byte[] var15 = class67.method1878();
					var38.writeBytes(var15, 0, var15.length);
				}

				if (!class429.field4593.endsWith(";A")) {
					class429.field4593 = class429.field4593 + ";A";
				}

				var5.packetBuffer.writeStringCp1252NullTerminated(class429.field4593);
				var5.packetBuffer.writeInt(class7.field27);
				Buffer var42 = new Buffer(UserComparator2.platformInfo.size());
				UserComparator2.platformInfo.write(var42);
				var5.packetBuffer.writeBytes(var42.array, 0, var42.array.length);
				var5.packetBuffer.writeByte(clientType);
				var5.packetBuffer.writeInt(0);
				var5.packetBuffer.writeInt(class268.archive11.hash);
				var5.packetBuffer.writeIntLE(ReflectionCheck.archive20.hash);
				var5.packetBuffer.writeIntIME(DevicePcmPlayerProvider.archive14.hash);
				var5.packetBuffer.writeInt(WorldMapData_1.archive8.hash);
				var5.packetBuffer.writeIntIME(FloorOverlayDefinition.archive2.hash);
				var5.packetBuffer.writeIntIME(class202.archive19.hash);
				var5.packetBuffer.writeIntLE(0);
				var5.packetBuffer.writeIntME(MouseHandler.archive4.hash);
				var5.packetBuffer.writeInt(class132.archive9.hash);
				var5.packetBuffer.writeIntIME(World.archive10.hash);
				var5.packetBuffer.writeInt(class4.archive13.hash);
				var5.packetBuffer.writeIntLE(JagexCache.archive18.hash);
				var5.packetBuffer.writeIntLE(ViewportMouse.archive15.hash);
				var5.packetBuffer.writeIntME(class145.archive7.hash);
				var5.packetBuffer.writeIntME(ArchiveLoader.archive6.hash);
				var5.packetBuffer.writeInt(class302.archive5.hash);
				var5.packetBuffer.writeIntLE(class121.archive3.hash);
				var5.packetBuffer.writeIntME(class321.archive1.hash);
				var5.packetBuffer.writeIntLE(ArchiveLoader.archive17.hash);
				var5.packetBuffer.writeIntIME(TileItem.archive0.hash);
				var5.packetBuffer.writeInt(class135.archive12.hash);
				var5.packetBuffer.xteaEncrypt(var29, var7, var5.packetBuffer.offset);
				var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var14);
				packetWriter.addNode(var5);
				packetWriter.flush();
				Client.packetWriter.isaacCipher = new IsaacCipher(var29);
				int[] var16 = new int[4];

				for (var11 = 0; var11 < 4; ++var11) {
					var16[var11] = var29[var11] + 50;
				}

				var2.newIsaacCipher(var16);
				UrlRequester.method2533(6);
			}

			if ((loginState == 6) && (((AbstractSocket) (var1)).available() > 0)) {
				var40 = ((AbstractSocket) (var1)).readUnsignedByte();
				if (var40 == 61) {
					var13 = ((AbstractSocket) (var1)).available();
					class260.field2888 = (var13 == 1) && (((AbstractSocket) (var1)).readUnsignedByte() == 1);
					UrlRequester.method2533(5);
				}

				if ((var40 == 21) && (gameState == 20)) {
					UrlRequester.method2533(12);
				} else if (var40 == 2) {
					UrlRequester.method2533(14);
				} else if ((var40 == 15) && (gameState == 40)) {
					Client.packetWriter.serverPacketLength = -1;
					UrlRequester.method2533(19);
				} else if (var40 == 64) {
					UrlRequester.method2533(10);
				} else if ((var40 == 23) && (field742 < 1)) {
					++field742;
					UrlRequester.method2533(0);
				} else if (var40 == 29) {
					UrlRequester.method2533(17);
				} else {
					if (var40 != 69) {
						class150.getLoginError(var40);
						return;
					}

					UrlRequester.method2533(7);
				}
			}

			if ((loginState == 7) && (((AbstractSocket) (var1)).available() >= 2)) {
				((AbstractSocket) (var1)).read(var2.array, 0, 2);
				var2.offset = 0;
				class116.field1418 = var2.readUnsignedShort();
				UrlRequester.method2533(8);
			}

			if ((loginState == 8) && (((AbstractSocket) (var1)).available() >= class116.field1418)) {
				var2.offset = 0;
				((AbstractSocket) (var1)).read(var2.array, var2.offset, class116.field1418);
				class6 var30 = JagexCache.method3224()[var2.readUnsignedByte()];

				try {
					class3 var31 = class385.method7027(var30);
					this.field526 = new class7(var2, var31);
					UrlRequester.method2533(9);
				} catch (Exception var21) {
					class150.getLoginError(22);
					return;
				}
			}

			if ((loginState == 9) && this.field526.method42()) {
				this.field525 = this.field526.method44();
				this.field526.method43();
				this.field526 = null;
				if (this.field525 == null) {
					class150.getLoginError(22);
					return;
				}

				packetWriter.clearBuffer();
				var27 = FriendSystem.method1723();
				var27.packetBuffer.writeByte(LoginPacket.field3137.id);
				var27.packetBuffer.writeShort(this.field525.offset);
				var27.packetBuffer.writeBuffer(this.field525);
				packetWriter.addNode(var27);
				packetWriter.flush();
				this.field525 = null;
				UrlRequester.method2533(6);
			}

			if ((loginState == 10) && (((AbstractSocket) (var1)).available() > 0)) {
				WorldMapSectionType.field2768 = ((AbstractSocket) (var1)).readUnsignedByte();
				UrlRequester.method2533(11);
			}

			if ((loginState == 11) && (((AbstractSocket) (var1)).available() >= WorldMapSectionType.field2768)) {
				((AbstractSocket) (var1)).read(var2.array, 0, WorldMapSectionType.field2768);
				var2.offset = 0;
				UrlRequester.method2533(6);
			}

			if ((loginState == 12) && (((AbstractSocket) (var1)).available() > 0)) {
				field490 = (((AbstractSocket) (var1)).readUnsignedByte() + 3) * 60;
				UrlRequester.method2533(13);
			}

			if (loginState == 13) {
				field513 = 0;
				GrandExchangeEvent.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", (field490 / 60) + " seconds.");
				if ((--field490) <= 0) {
					UrlRequester.method2533(0);
				}

			} else {
				if ((loginState == 14) && (((AbstractSocket) (var1)).available() >= 1)) {
					class124.field1514 = ((AbstractSocket) (var1)).readUnsignedByte();
					UrlRequester.method2533(15);
				}

				if ((loginState == 15) && (((AbstractSocket) (var1)).available() >= class124.field1514)) {
					var12 = ((AbstractSocket) (var1)).readUnsignedByte() == 1;
					((AbstractSocket) (var1)).read(var2.array, 0, 4);
					var2.offset = 0;
					boolean var41 = false;
					if (var12) {
						var13 = var2.readByteIsaac() << 24;
						var13 |= var2.readByteIsaac() << 16;
						var13 |= var2.readByteIsaac() << 8;
						var13 |= var2.readByteIsaac();
						String var37 = Login.Login_username;
						var7 = var37.length();
						int var17 = 0;
						var9 = 0;

						while (true) {
							if (var9 >= var7) {
								if ((Interpreter.clientPreferences.parameters.size() >= 10) && (!Interpreter.clientPreferences.parameters.containsKey(var17))) {
									Iterator var39 = Interpreter.clientPreferences.parameters.entrySet().iterator();
									var39.next();
									var39.remove();
								}

								Interpreter.clientPreferences.parameters.put(var17, var13);
								break;
							}

							var17 = ((var17 << 5) - var17) + var37.charAt(var9);
							++var9;
						} 
					}

					if (Login_isUsernameRemembered) {
						Interpreter.clientPreferences.method2316(Login.Login_username);
					} else {
						Interpreter.clientPreferences.method2316(((String) (null)));
					}

					class307.savePreferences();
					staffModLevel = ((AbstractSocket) (var1)).readUnsignedByte();
					playerMod = ((AbstractSocket) (var1)).readUnsignedByte() == 1;
					localPlayerIndex = ((AbstractSocket) (var1)).readUnsignedByte();
					localPlayerIndex <<= 8;
					localPlayerIndex += ((AbstractSocket) (var1)).readUnsignedByte();
					field607 = ((AbstractSocket) (var1)).readUnsignedByte();
					((AbstractSocket) (var1)).read(var2.array, 0, 8);
					var2.offset = 0;
					this.field658 = var2.readLong();
					if (class124.field1514 >= 29) {
						((AbstractSocket) (var1)).read(var2.array, 0, 8);
						var2.offset = 0;
						field608 = var2.readLong();
					}

					((AbstractSocket) (var1)).read(var2.array, 0, 1);
					var2.offset = 0;
					ServerPacket[] var34 = class230.ServerPacket_values();
					var14 = var2.readSmartByteShortIsaac();
					if ((var14 < 0) || (var14 >= var34.length)) {
						throw new IOException((var14 + " ") + var2.offset);
					}

					Client.packetWriter.serverPacket = var34[var14];
					Client.packetWriter.serverPacketLength = Client.packetWriter.serverPacket.length;
					((AbstractSocket) (var1)).read(var2.array, 0, 2);
					var2.offset = 0;
					Client.packetWriter.serverPacketLength = var2.readUnsignedShort();

					try {
						Client var19 = UserComparator10.client;
						JSObject.getWindow(var19).call("zap", ((Object[]) (null)));
					} catch (Throwable var20) {
					}

					UrlRequester.method2533(16);
				}

				if (loginState == 16) {
					if (((AbstractSocket) (var1)).available() >= Client.packetWriter.serverPacketLength) {
						var2.offset = 0;
						((AbstractSocket) (var1)).read(var2.array, 0, Client.packetWriter.serverPacketLength);
						timer.method6597();
						PacketWriter.method2489();
						Strings.updatePlayer(var2);
						class193.field2197 = -1;
						class146.loadRegions(false, var2);
						Client.packetWriter.serverPacket = null;
					}

				} else {
					if ((loginState == 17) && (((AbstractSocket) (var1)).available() >= 2)) {
						var2.offset = 0;
						((AbstractSocket) (var1)).read(var2.array, 0, 2);
						var2.offset = 0;
						class142.field1634 = var2.readUnsignedShort();
						UrlRequester.method2533(18);
					}

					if ((loginState == 18) && (((AbstractSocket) (var1)).available() >= class142.field1634)) {
						var2.offset = 0;
						((AbstractSocket) (var1)).read(var2.array, 0, class142.field1634);
						var2.offset = 0;
						String var33 = var2.readStringCp1252NullTerminated();
						String var32 = var2.readStringCp1252NullTerminated();
						String var35 = var2.readStringCp1252NullTerminated();
						GrandExchangeEvent.setLoginResponseString(var33, var32, var35);
						InterfaceParent.updateGameState(10);
					}

					if (loginState != 19) {
						++field513;
						if (field513 > 2000) {
							if (field742 < 1) {
								if (ItemContainer.currentPort == class101.worldPort) {
									ItemContainer.currentPort = BuddyRankComparator.js5Port;
								} else {
									ItemContainer.currentPort = class101.worldPort;
								}

								++field742;
								UrlRequester.method2533(0);
							} else {
								class150.getLoginError(-3);
							}
						}
					} else {
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
							var40 = Client.packetWriter.serverPacketLength;
							timer.method6598();
							packetWriter.clearBuffer();
							Client.packetWriter.packetBuffer.offset = 0;
							Client.packetWriter.serverPacket = null;
							Client.packetWriter.field1320 = null;
							Client.packetWriter.field1329 = null;
							Client.packetWriter.field1331 = null;
							Client.packetWriter.serverPacketLength = 0;
							Client.packetWriter.field1326 = 0;
							rebootTimer = 0;
							class268.method5228();
							minimapState = 0;
							destinationX = 0;

							for (var13 = 0; var13 < 2048; ++var13) {
								players[var13] = null;
							}

							class19.localPlayer = null;

							for (var13 = 0; var13 < Client.npcs.length; ++var13) {
								NPC var36 = npcs[var13];
								if (var36 != null) {
									var36.targetIndex = -1;
									var36.false0 = false;
								}
							}

							ItemContainer.itemContainers = new NodeHashTable(32);
							InterfaceParent.updateGameState(30);

							for (var13 = 0; var13 < 100; ++var13) {
								field564[var13] = true;
							}

							class17.method228();
							Strings.updatePlayer(var2);
							if (var40 != var2.offset) {
								throw new RuntimeException();
							}
						}
					}
				}
			}
		} catch (IOException var24) {
			if (field742 < 1) {
				if (ItemContainer.currentPort == class101.worldPort) {
					ItemContainer.currentPort = BuddyRankComparator.js5Port;
				} else {
					ItemContainer.currentPort = class101.worldPort;
				}

				++field742;
				UrlRequester.method2533(0);
			} else {
				class150.getLoginError(-2);
			}
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-2093046778")

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
			class9.method64();
		} else {
			if (!isMenuOpen) {
				VarpDefinition.addCancelMenuEntry();
			}

			int var1;
			for (var1 = 0; (var1 < 100) && this.method1153(packetWriter); ++var1) {
			}

			if (gameState == 30) {
				while (true) {
					ReflectionCheck var2 = ((ReflectionCheck) (class33.reflectionChecks.last()));
					boolean var30;
					if (var2 == null) {
						var30 = false;
					} else {
						var30 = true;
					}

					int var3;
					PacketBufferNode var31;
					if (!var30) {
						PacketBufferNode var14;
						int var15;
						if (Client.timer.field4182) {
							var14 = ItemContainer.getPacketBufferNode(ClientPacket.field2935, Client.packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							var15 = var14.packetBuffer.offset;
							timer.write(var14.packetBuffer);
							var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
							timer.method6593();
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
						synchronized(BuddyRankComparator.mouseRecorder.lock) {
							if (!field536) {
								BuddyRankComparator.mouseRecorder.index = 0;
							} else if ((MouseHandler.MouseHandler_lastButton != 0) || (BuddyRankComparator.mouseRecorder.index >= 40)) {
								var31 = null;
								var3 = 0;
								var4 = 0;
								var5 = 0;
								var6 = 0;

								for (var7 = 0; (var7 < BuddyRankComparator.mouseRecorder.index) && ((var31 == null) || ((var31.packetBuffer.offset - var3) < 246)); ++var7) {
									var4 = var7;
									var8 = BuddyRankComparator.mouseRecorder.ys[var7];
									if (var8 < (-1)) {
										var8 = -1;
									} else if (var8 > 65534) {
										var8 = 65534;
									}

									var9 = BuddyRankComparator.mouseRecorder.xs[var7];
									if (var9 < (-1)) {
										var9 = -1;
									} else if (var9 > 65534) {
										var9 = 65534;
									}

									if ((var9 != field493) || (var8 != field494)) {
										if (var31 == null) {
											var31 = ItemContainer.getPacketBufferNode(ClientPacket.field2965, Client.packetWriter.isaacCipher);
											var31.packetBuffer.writeByte(0);
											var3 = var31.packetBuffer.offset;
											var10000 = var31.packetBuffer;
											var10000.offset += 2;
											var5 = 0;
											var6 = 0;
										}

										if ((-1L) != field495) {
											var10 = var9 - field493;
											var11 = var8 - field494;
											var12 = ((int) ((BuddyRankComparator.mouseRecorder.millis[var7] - field495) / 20L));
											var5 = ((int) (((long) (var5)) + ((BuddyRankComparator.mouseRecorder.millis[var7] - field495) % 20L)));
										} else {
											var10 = var9;
											var11 = var8;
											var12 = Integer.MAX_VALUE;
										}

										field493 = var9;
										field494 = var8;
										if (((((var12 < 8) && (var10 >= (-32))) && (var10 <= 31)) && (var11 >= (-32))) && (var11 <= 31)) {
											var10 += 32;
											var11 += 32;
											var31.packetBuffer.writeShort(((var12 << 12) + var11) + (var10 << 6));
										} else if (((((var12 < 32) && (var10 >= (-128))) && (var10 <= 127)) && (var11 >= (-128))) && (var11 <= 127)) {
											var10 += 128;
											var11 += 128;
											var31.packetBuffer.writeByte(var12 + 128);
											var31.packetBuffer.writeShort(var11 + (var10 << 8));
										} else if (var12 < 32) {
											var31.packetBuffer.writeByte(var12 + 192);
											if ((var9 != (-1)) && (var8 != (-1))) {
												var31.packetBuffer.writeInt(var9 | (var8 << 16));
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										} else {
											var31.packetBuffer.writeShort((var12 & 8191) + 57344);
											if ((var9 != (-1)) && (var8 != (-1))) {
												var31.packetBuffer.writeInt(var9 | (var8 << 16));
											} else {
												var31.packetBuffer.writeInt(Integer.MIN_VALUE);
											}
										}

										++var6;
										field495 = BuddyRankComparator.mouseRecorder.millis[var7];
									}
								}

								if (var31 != null) {
									var31.packetBuffer.writeLengthByte(var31.packetBuffer.offset - var3);
									var7 = var31.packetBuffer.offset;
									var31.packetBuffer.offset = var3;
									var31.packetBuffer.writeByte(var5 / var6);
									var31.packetBuffer.writeByte(var5 % var6);
									var31.packetBuffer.offset = var7;
									packetWriter.addNode(var31);
								}

								if (var4 >= BuddyRankComparator.mouseRecorder.index) {
									BuddyRankComparator.mouseRecorder.index = 0;
								} else {
									MouseRecorder var49 = BuddyRankComparator.mouseRecorder;
									var49.index -= var4;
									System.arraycopy(BuddyRankComparator.mouseRecorder.xs, var4, BuddyRankComparator.mouseRecorder.xs, 0, BuddyRankComparator.mouseRecorder.index);
									System.arraycopy(BuddyRankComparator.mouseRecorder.ys, var4, BuddyRankComparator.mouseRecorder.ys, 0, BuddyRankComparator.mouseRecorder.index);
									System.arraycopy(BuddyRankComparator.mouseRecorder.millis, var4, BuddyRankComparator.mouseRecorder.millis, 0, BuddyRankComparator.mouseRecorder.index);
								}
							}
						}

						PacketBufferNode var18;
						if (((MouseHandler.MouseHandler_lastButton == 1) || ((!UserComparator5.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4))) || (MouseHandler.MouseHandler_lastButton == 2)) {
							long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
							if (var16 > 32767L) {
								var16 = 32767L;
							}

							mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
							var3 = MouseHandler.MouseHandler_lastPressedY;
							if (var3 < 0) {
								var3 = 0;
							} else if (var3 > class309.canvasHeight) {
								var3 = class309.canvasHeight;
							}

							var4 = MouseHandler.MouseHandler_lastPressedX;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > class4.canvasWidth) {
								var4 = class4.canvasWidth;
							}

							var5 = ((int) (var16));
							var18 = ItemContainer.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, Client.packetWriter.isaacCipher);
							var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
							var18.packetBuffer.writeShort(var4);
							var18.packetBuffer.writeShort(var3);
							packetWriter.addNode(var18);
						}

						if (KeyHandler.field132 > 0) {
							var14 = ItemContainer.getPacketBufferNode(ClientPacket.field2899, Client.packetWriter.isaacCipher);
							var14.packetBuffer.writeShort(0);
							var15 = var14.packetBuffer.offset;
							long var19 = WorldMapSprite.getServerTime();

							for (var5 = 0; var5 < KeyHandler.field132; ++var5) {
								long var21 = var19 - field718;
								if (var21 > 16777215L) {
									var21 = 16777215L;
								}

								field718 = var19;
								var14.packetBuffer.writeByte(KeyHandler.field139[var5]);
								var14.packetBuffer.writeMediumLME(((int) (var21)));
							}

							var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
							packetWriter.addNode(var14);
						}

						if (field542 > 0) {
							--field542;
						}

						if (((KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97]) || KeyHandler.KeyHandler_pressedKeys[98]) || KeyHandler.KeyHandler_pressedKeys[99]) {
							field616 = true;
						}

						if (field616 && (field542 <= 0)) {
							field542 = 20;
							field616 = false;
							var14 = ItemContainer.getPacketBufferNode(ClientPacket.field2975, Client.packetWriter.isaacCipher);
							var14.packetBuffer.writeShortAdd(camAngleY);
							var14.packetBuffer.writeShort(camAngleX);
							packetWriter.addNode(var14);
						}

						if (Varps.hasFocus && (!hadFocus)) {
							hadFocus = true;
							var14 = ItemContainer.getPacketBufferNode(ClientPacket.field2897, Client.packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(1);
							packetWriter.addNode(var14);
						}

						if ((!Varps.hasFocus) && hadFocus) {
							hadFocus = false;
							var14 = ItemContainer.getPacketBufferNode(ClientPacket.field2897, Client.packetWriter.isaacCipher);
							var14.packetBuffer.writeByte(0);
							packetWriter.addNode(var14);
						}

						if (ClanChannel.worldMap != null) {
							ClanChannel.worldMap.method7303();
						}

						UserComparator7.method2577();
						if (class82.field1070) {
							SecureRandomFuture.method1968();
							class82.field1070 = false;
						}

						WorldMapSectionType.method4945();
						if (gameState != 30) {
							return;
						}

						class286.method5549();

						int var10002;
						for (var1 = 0; var1 < soundEffectCount; ++var1) {
							var10002 = queuedSoundEffectDelays[var1]--;
							if (queuedSoundEffectDelays[var1] >= (-10)) {
								SoundEffect var32 = soundEffects[var1];
								if (var32 == null) {
									var10000 = null;
									var32 = SoundEffect.readSoundEffect(MouseHandler.archive4, soundEffectIds[var1], 0);
									if (var32 == null) {
										continue;
									}

									int[] var50 = queuedSoundEffectDelays;
									var50[var1] += var32.calculateDelay();
									soundEffects[var1] = var32;
								}

								if (queuedSoundEffectDelays[var1] < 0) {
									if (soundLocations[var1] != 0) {
										var4 = (soundLocations[var1] & 255) * 128;
										var5 = (soundLocations[var1] >> 16) & 255;
										var6 = ((var5 * 128) + 64) - class19.localPlayer.x;
										if (var6 < 0) {
											var6 = -var6;
										}

										var7 = (soundLocations[var1] >> 8) & 255;
										var8 = ((var7 * 128) + 64) - class19.localPlayer.y;
										if (var8 < 0) {
											var8 = -var8;
										}

										var9 = (var8 + var6) - 128;
										if (var9 > var4) {
											queuedSoundEffectDelays[var1] = -100;
											continue;
										}

										if (var9 < 0) {
											var9 = 0;
										}

										var3 = ((var4 - var9) * Interpreter.clientPreferences.method2286()) / var4;
									} else {
										var3 = Interpreter.clientPreferences.method2269();
									}

									if (var3 > 0) {
										RawSound var23 = var32.toRawSound().resample(LoginScreenAnimation.decimator);
										RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3);
										var24.setNumLoops(queuedSoundEffectLoops[var1] - 1);
										WorldMapIcon_1.pcmStreamMixer.addSubStream(var24);
									}

									queuedSoundEffectDelays[var1] = -100;
								}
							} else {
								--soundEffectCount;

								for (var15 = var1; var15 < soundEffectCount; ++var15) {
									soundEffectIds[var15] = soundEffectIds[var15 + 1];
									soundEffects[var15] = soundEffects[var15 + 1];
									queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1];
									queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1];
									soundLocations[var15] = soundLocations[var15 + 1];
								}

								--var1;
							}
						}

						if (field731 && (!KeyHandler.method376())) {
							if ((Interpreter.clientPreferences.method2288() != 0) && (currentTrackGroupId != (-1))) {
								WorldMapSection2.method4561(ArchiveLoader.archive6, currentTrackGroupId, 0, Interpreter.clientPreferences.method2288(), false);
							}

							field731 = false;
						}

						++Client.packetWriter.field1326;
						if (Client.packetWriter.field1326 > 750) {
							class9.method64();
							return;
						}

						var1 = Players.Players_count;
						int[] var33 = Players.Players_indices;

						for (var3 = 0; var3 < var1; ++var3) {
							Player var42 = players[var33[var3]];
							if (var42 != null) {
								BuddyRankComparator.updateActorSequence(var42, 1);
							}
						}

						for (var1 = 0; var1 < npcCount; ++var1) {
							var15 = npcIndices[var1];
							NPC var25 = npcs[var15];
							if (var25 != null) {
								BuddyRankComparator.updateActorSequence(var25, var25.definition.size);
							}
						}

						VarpDefinition.method3345();
						++field550;
						if (mouseCrossColor != 0) {
							mouseCrossState += 20;
							if (mouseCrossState >= 400) {
								mouseCrossColor = 0;
							}
						}

						if (class12.field64 != null) {
							++field595;
							if (field595 >= 15) {
								class290.invalidateWidget(class12.field64);
								class12.field64 = null;
							}
						}

						Widget var39 = Player.mousedOverWidgetIf1;
						Widget var34 = class160.field1750;
						Player.mousedOverWidgetIf1 = null;
						class160.field1750 = null;
						draggedOnWidget = null;
						field671 = false;
						field668 = false;
						field713 = 0;

						while (class16.isKeyDown() && (field713 < 128)) {
							if (((staffModLevel >= 2) && KeyHandler.KeyHandler_pressedKeys[82]) && (class241.field2833 == 66)) {
								StringBuilder var43 = new StringBuilder();

								Message var40;
								for (Iterator var45 = Messages.Messages_hashTable.iterator(); var45.hasNext(); var43.append(var40.text).append('\n')) {
									var40 = ((Message) (var45.next()));
									if ((var40.sender != null) && (!var40.sender.isEmpty())) {
										var43.append(var40.sender).append(':');
									}
								}

								String var48 = var43.toString();
								UserComparator10.client.method535(var48);
							} else if ((oculusOrbState != 1) || (class1.field3 <= 0)) {
								field568[field713] = class241.field2833;
								field716[field713] = class1.field3;
								++field713;
							}
						} 

						boolean var35 = staffModLevel >= 2;
						if (((var35 && KeyHandler.KeyHandler_pressedKeys[82]) && KeyHandler.KeyHandler_pressedKeys[81]) && (mouseWheelRotation != 0)) {
							var4 = class19.localPlayer.plane - mouseWheelRotation;
							if (var4 < 0) {
								var4 = 0;
							} else if (var4 > 3) {
								var4 = 3;
							}

							if (var4 != class19.localPlayer.plane) {
								class392.method7191(class19.localPlayer.pathX[0] + ApproximateRouteStrategy.baseX, class19.localPlayer.pathY[0] + class250.baseY, var4, false);
							}

							mouseWheelRotation = 0;
						}

						if (rootInterface != (-1)) {
							ItemComposition.updateRootInterface(rootInterface, 0, 0, class4.canvasWidth, class309.canvasHeight, 0, 0);
						}

						++cycleCntr;

						while (true) {
							Widget var41;
							ScriptEvent var44;
							Widget var46;
							do {
								var44 = ((ScriptEvent) (field694.removeLast()));
								if (var44 == null) {
									while (true) {
										do {
											var44 = ((ScriptEvent) (field695.removeLast()));
											if (var44 == null) {
												while (true) {
													do {
														var44 = ((ScriptEvent) (scriptEvents.removeLast()));
														if (var44 == null) {
															this.menu();
															class154.method3127();
															if (clickedWidget != null) {
																this.method1159();
															}

															if (FloorDecoration.dragInventoryWidget != null) {
																class290.invalidateWidget(FloorDecoration.dragInventoryWidget);
																++itemDragDuration;
																if (MouseHandler.MouseHandler_currentButton == 0) {
																	if (field601) {
																		if ((FloorDecoration.dragInventoryWidget == GrandExchangeEvent.hoveredItemContainer) && (dragItemSlotSource != dragItemSlotDestination)) {
																			Widget var47 = FloorDecoration.dragInventoryWidget;
																			byte var36 = 0;
																			if ((field655 == 1) && (var47.contentType == 206)) {
																				var36 = 1;
																			}

																			if (var47.itemIds[dragItemSlotDestination] <= 0) {
																				var36 = 0;
																			}

																			if (class239.method4998(WorldMapSection2.getWidgetFlags(var47))) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;
																				var47.itemIds[var7] = var47.itemIds[var6];
																				var47.itemQuantities[var7] = var47.itemQuantities[var6];
																				var47.itemIds[var6] = -1;
																				var47.itemQuantities[var6] = 0;
																			} else if (var36 == 1) {
																				var6 = dragItemSlotSource;
																				var7 = dragItemSlotDestination;

																				while (var7 != var6) {
																					if (var6 > var7) {
																						var47.swapItems(var6 - 1, var6);
																						--var6;
																					} else if (var6 < var7) {
																						var47.swapItems(var6 + 1, var6);
																						++var6;
																					}
																				} 
																			} else {
																				var47.swapItems(dragItemSlotDestination, dragItemSlotSource);
																			}

																			var18 = ItemContainer.getPacketBufferNode(ClientPacket.field2996, Client.packetWriter.isaacCipher);
																			var18.packetBuffer.writeShortAddLE(dragItemSlotDestination);
																			var18.packetBuffer.writeShortLE(dragItemSlotSource);
																			var18.packetBuffer.writeIntLE(FloorDecoration.dragInventoryWidget.id);
																			var18.packetBuffer.writeByteNeg(var36);
																			packetWriter.addNode(var18);
																		}
																	} else if (this.shouldLeftClickOpenMenu()) {
																		this.openMenu(draggedWidgetX, draggedWidgetY);
																	} else if (menuOptionsCount > 0) {
																		UserComparator8.method2576(draggedWidgetX, draggedWidgetY);
																	}

																	field595 = 10;
																	MouseHandler.MouseHandler_lastButton = 0;
																	FloorDecoration.dragInventoryWidget = null;
																} else if ((itemDragDuration >= 5) && ((((MouseHandler.MouseHandler_x > (draggedWidgetX + 5)) || (MouseHandler.MouseHandler_x < (draggedWidgetX - 5))) || (MouseHandler.MouseHandler_y > (draggedWidgetY + 5))) || (MouseHandler.MouseHandler_y < (draggedWidgetY - 5)))) {
																	field601 = true;
																}
															}

															if (Scene.shouldSendWalk()) {
																var4 = Scene.Scene_selectedX;
																var5 = Scene.Scene_selectedY;
																var18 = ItemContainer.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, Client.packetWriter.isaacCipher);
																var18.packetBuffer.writeByte(5);
																var18.packetBuffer.writeShortLE(var4 + ApproximateRouteStrategy.baseX);
																var18.packetBuffer.writeShort(var5 + class250.baseY);
																var18.packetBuffer.writeByteSub(KeyHandler.KeyHandler_pressedKeys[82] ? KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1 : 0);
																packetWriter.addNode(var18);
																Scene.method4167();
																mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
																mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
																mouseCrossColor = 1;
																mouseCrossState = 0;
																destinationX = var4;
																destinationY = var5;
															}

															if (var39 != Player.mousedOverWidgetIf1) {
																if (var39 != null) {
																	class290.invalidateWidget(var39);
																}

																if (Player.mousedOverWidgetIf1 != null) {
																	class290.invalidateWidget(Player.mousedOverWidgetIf1);
																}
															}

															if ((var34 != class160.field1750) && (field641 == field642)) {
																if (var34 != null) {
																	class290.invalidateWidget(var34);
																}

																if (class160.field1750 != null) {
																	class290.invalidateWidget(class160.field1750);
																}
															}

															if (class160.field1750 != null) {
																if (field641 < field642) {
																	++field641;
																	if (field642 == field641) {
																		class290.invalidateWidget(class160.field1750);
																	}
																}
															} else if (field641 > 0) {
																--field641;
															}

															if (oculusOrbState == 0) {
																var4 = class19.localPlayer.x;
																var5 = class19.localPlayer.y;
																if (((((Messages.oculusOrbFocalPointX - var4) < (-500)) || ((Messages.oculusOrbFocalPointX - var4) > 500)) || ((class115.oculusOrbFocalPointY - var5) < (-500))) || ((class115.oculusOrbFocalPointY - var5) > 500)) {
																	Messages.oculusOrbFocalPointX = var4;
																	class115.oculusOrbFocalPointY = var5;
																}

																if (var4 != Messages.oculusOrbFocalPointX) {
																	Messages.oculusOrbFocalPointX += (var4 - Messages.oculusOrbFocalPointX) / 16;
																}

																if (var5 != class115.oculusOrbFocalPointY) {
																	class115.oculusOrbFocalPointY += (var5 - class115.oculusOrbFocalPointY) / 16;
																}

																var6 = Messages.oculusOrbFocalPointX >> 7;
																var7 = class115.oculusOrbFocalPointY >> 7;
																var8 = Archive.getTileHeight(Messages.oculusOrbFocalPointX, class115.oculusOrbFocalPointY, class160.Client_plane);
																var9 = 0;
																if ((((var6 > 3) && (var7 > 3)) && (var6 < 100)) && (var7 < 100)) {
																	for (var10 = var6 - 4; var10 <= (var6 + 4); ++var10) {
																		for (var11 = var7 - 4; var11 <= (var7 + 4); ++var11) {
																			var12 = class160.Client_plane;
																			if ((var12 < 3) && ((Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2)) {
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

																if (var10 > field756) {
																	field756 += (var10 - field756) / 24;
																} else if (var10 < field756) {
																	field756 += (var10 - field756) / 80;
																}

																FloorOverlayDefinition.field2136 = Archive.getTileHeight(class19.localPlayer.x, class19.localPlayer.y, class160.Client_plane) - camFollowHeight;
															} else if (oculusOrbState == 1) {
																class391.method7169();
																short var37 = -1;
																if (KeyHandler.KeyHandler_pressedKeys[33]) {
																	var37 = 0;
																} else if (KeyHandler.KeyHandler_pressedKeys[49]) {
																	var37 = 1024;
																}

																if (KeyHandler.KeyHandler_pressedKeys[48]) {
																	if (var37 == 0) {
																		var37 = 1792;
																	} else if (var37 == 1024) {
																		var37 = 1280;
																	} else {
																		var37 = 1536;
																	}
																} else if (KeyHandler.KeyHandler_pressedKeys[50]) {
																	if (var37 == 0) {
																		var37 = 256;
																	} else if (var37 == 1024) {
																		var37 = 768;
																	} else {
																		var37 = 512;
																	}
																}

																byte var38 = 0;
																if (KeyHandler.KeyHandler_pressedKeys[35]) {
																	var38 = -1;
																} else if (KeyHandler.KeyHandler_pressedKeys[51]) {
																	var38 = 1;
																}

																var6 = 0;
																if ((var37 >= 0) || (var38 != 0)) {
																	var6 = (KeyHandler.KeyHandler_pressedKeys[81]) ? (oculusOrbSlowedSpeed * (-881862903)) * 881911609 : (oculusOrbNormalSpeed * (-1286782535)) * (-924814199);
																	var6 *= 16;
																	field567 = var37;
																	field696 = var38;
																}

																if (field566 < var6) {
																	field566 += var6 / 8;
																	if (field566 > var6) {
																		field566 = var6;
																	}
																} else if (field566 > var6) {
																	field566 = (field566 * 9) / 10;
																}

																if (field566 > 0) {
																	var7 = field566 / 16;
																	if (field567 >= 0) {
																		var4 = (field567 - MusicPatchNode2.cameraYaw) & 2047;
																		var8 = Rasterizer3D.Rasterizer3D_sine[var4];
																		var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
																		Messages.oculusOrbFocalPointX += (var7 * var8) / 65536;
																		class115.oculusOrbFocalPointY += (var7 * var9) / 65536;
																	}

																	if (field696 != 0) {
																		FloorOverlayDefinition.field2136 += var7 * field696;
																		if (FloorOverlayDefinition.field2136 > 0) {
																			FloorOverlayDefinition.field2136 = 0;
																		}
																	}
																} else {
																	field567 = -1;
																	field696 = -1;
																}

																if (KeyHandler.KeyHandler_pressedKeys[13]) {
																	class291.method5589();
																}
															}

															if ((MouseHandler.MouseHandler_currentButton == 4) && UserComparator5.mouseCam) {
																var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
																camAngleDX = var4 * 2;
																mouseCamClickedY = ((var4 != (-1)) && (var4 != 1)) ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : (MouseHandler.MouseHandler_y * (-501791789)) * (-601944997);
																var5 = mouseCamClickedX - MouseHandler.MouseHandler_x;
																camAngleDY = var5 * 2;
																mouseCamClickedX = ((var5 != (-1)) && (var5 != 1)) ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : (MouseHandler.MouseHandler_x * 1113383001) * (-833329175);
															} else {
																if (KeyHandler.KeyHandler_pressedKeys[96]) {
																	camAngleDY += ((-24) - camAngleDY) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[97]) {
																	camAngleDY += (24 - camAngleDY) / 2;
																} else {
																	camAngleDY /= 2;
																}

																if (KeyHandler.KeyHandler_pressedKeys[98]) {
																	camAngleDX += (12 - camAngleDX) / 2;
																} else if (KeyHandler.KeyHandler_pressedKeys[99]) {
																	camAngleDX += ((-12) - camAngleDX) / 2;
																} else {
																	camAngleDX /= 2;
																}

																mouseCamClickedY = MouseHandler.MouseHandler_y;
																mouseCamClickedX = MouseHandler.MouseHandler_x;
															}

															camAngleY = ((camAngleDY / 2) + camAngleY) & 2047;
															camAngleX += camAngleDX / 2;
															if (camAngleX < 128) {
																camAngleX = 128;
															}

															if (camAngleX > 383) {
																camAngleX = 383;
															}

															if (field739) {
																class291.method5587();
															} else if (isCameraLocked) {
																class147.method3052();
															}

															for (var4 = 0; var4 < 5; ++var4) {
																var10002 = field744[var4]++;
															}

															JagexCache.varcs.tryWrite();
															var4 = (++MouseHandler.MouseHandler_idleCycles) - 1;
															var6 = class18.method294();
															PacketBufferNode var27;
															if ((var4 > 15000) && (var6 > 15000)) {
																logoutTimer = 250;
																ItemComposition.method3764(14500);
																var27 = ItemContainer.getPacketBufferNode(ClientPacket.field2979, Client.packetWriter.isaacCipher);
																packetWriter.addNode(var27);
															}

															class155.friendSystem.processFriendUpdates();
															++Client.packetWriter.pendingWrites;
															if (Client.packetWriter.pendingWrites > 50) {
																var27 = ItemContainer.getPacketBufferNode(ClientPacket.field2950, Client.packetWriter.isaacCipher);
																packetWriter.addNode(var27);
															}

															try {
																packetWriter.flush();
															} catch (IOException var28) {
																class9.method64();
															}

															return;
														}

														var46 = var44.widget;
														if (var46.childIndex < 0) {
															break;
														}

														var41 = HorizontalAlignment.getWidget(var46.parentId);
													} while ((((var41 == null) || (var41.children == null)) || (var46.childIndex >= var41.children.length)) || (var46 != var41.children[var46.childIndex]) );

													class1.runScriptEvent(var44);
												} 
											}

											var46 = var44.widget;
											if (var46.childIndex < 0) {
												break;
											}

											var41 = HorizontalAlignment.getWidget(var46.parentId);
										} while ((((var41 == null) || (var41.children == null)) || (var46.childIndex >= var41.children.length)) || (var46 != var41.children[var46.childIndex]) );

										class1.runScriptEvent(var44);
									} 
								}

								var46 = var44.widget;
								if (var46.childIndex < 0) {
									break;
								}

								var41 = HorizontalAlignment.getWidget(var46.parentId);
							} while ((((var41 == null) || (var41.children == null)) || (var46.childIndex >= var41.children.length)) || (var46 != var41.children[var46.childIndex]) );

							class1.runScriptEvent(var44);
						} 
					}

					var31 = ItemContainer.getPacketBufferNode(ClientPacket.field2914, Client.packetWriter.isaacCipher);
					var31.packetBuffer.writeByte(0);
					var3 = var31.packetBuffer.offset;
					WorldMapAreaData.performReflectionCheck(var31.packetBuffer);
					var31.packetBuffer.writeLengthByte(var31.packetBuffer.offset - var3);
					packetWriter.addNode(var31);
				} 
			}
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-70275720")

	@Export("resizeJS")
	void resizeJS() {
		int var1 = class4.canvasWidth;
		int var2 = class309.canvasHeight;
		if (super.contentWidth < var1) {
			var1 = super.contentWidth;
		}

		if (super.contentHeight < var2) {
			var2 = super.contentHeight;
		}

		if (Interpreter.clientPreferences != null) {
			try {
				class27.method412(UserComparator10.client, "resize", new Object[]{ ReflectionCheck.getWindowedMode() });
			} catch (Throwable var4) {
			}
		}

	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1155883709")

	@Export("drawLoggedIn")
	final void drawLoggedIn() {
		int var1;
		if (rootInterface != (-1)) {
			var1 = rootInterface;
			if (MusicPatchNode2.loadInterface(var1)) {
				ItemComposition.drawModelComponents(EnumComposition.Widget_interfaceComponents[var1], -1);
			}
		}

		for (var1 = 0; var1 < rootWidgetCount; ++var1) {
			if (field564[var1]) {
				field651[var1] = true;
			}

			field576[var1] = field564[var1];
			field564[var1] = false;
		}

		field698 = cycle;
		viewportX = -1;
		viewportY = -1;
		GrandExchangeEvent.hoveredItemContainer = null;
		if (rootInterface != (-1)) {
			rootWidgetCount = 0;
			class11.drawWidgets(rootInterface, 0, 0, class4.canvasWidth, class309.canvasHeight, 0, 0, -1);
		}

		Rasterizer2D.Rasterizer2D_resetClip();
		if (showMouseCross) {
			if (mouseCrossColor == 1) {
				crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}

			if (mouseCrossColor == 2) {
				crossSprites[(mouseCrossState / 100) + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
			}
		}

		int var2;
		int var3;
		if (!isMenuOpen) {
			if (viewportX != (-1)) {
				var1 = viewportX;
				var2 = viewportY;
				if ((((menuOptionsCount >= 2) || (isItemSelected != 0)) || isSpellSelected) && showMouseOverText) {
					var3 = class168.method3324();
					String var11;
					if ((isItemSelected == 1) && (menuOptionsCount < 2)) {
						var11 = ((("Use" + " ") + selectedItemName) + " ") + "->";
					} else if (isSpellSelected && (menuOptionsCount < 2)) {
						var11 = (((selectedSpellActionName + " ") + selectedSpellName) + " ") + "->";
					} else {
						var11 = ReflectionCheck.method637(var3);
					}

					if (menuOptionsCount > 2) {
						var11 = (((((var11 + ChatChannel.colorStartTag(16777215)) + " ") + '/') + " ") + (menuOptionsCount - 2)) + " more options";
					}

					FloorOverlayDefinition.fontBold12.drawRandomAlphaAndSpacing(var11, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
				}
			}
		} else {
			var1 = class307.menuX;
			var2 = ArchiveDiskActionHandler.menuY;
			var3 = class11.menuWidth;
			int var4 = UrlRequester.menuHeight;
			int var5 = 6116423;
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
			FloorOverlayDefinition.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
			int var6 = MouseHandler.MouseHandler_x;
			int var7 = MouseHandler.MouseHandler_y;

			for (int var8 = 0; var8 < menuOptionsCount; ++var8) {
				int var9 = (var2 + (((menuOptionsCount - 1) - var8) * 15)) + 31;
				int var10 = 16777215;
				if ((((var6 > var1) && (var6 < (var1 + var3))) && (var7 > (var9 - 13))) && (var7 < (var9 + 3))) {
					var10 = 16776960;
				}

				FloorOverlayDefinition.fontBold12.draw(ReflectionCheck.method637(var8), var1 + 3, var9, var10, 0);
			}

			LoginScreenAnimation.method2240(class307.menuX, ArchiveDiskActionHandler.menuY, class11.menuWidth, UrlRequester.menuHeight);
		}

		if (gameDrawingMode == 3) {
			for (var1 = 0; var1 < rootWidgetCount; ++var1) {
				if (field576[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
				} else if (field651[var1]) {
					Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
				}
			}
		}

		class268.method5232(class160.Client_plane, class19.localPlayer.x, class19.localPlayer.y, field550);
		field550 = 0;
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(descriptor = 
	"(Lcj;I)Z", garbageValue = 
	"911154934")

	final boolean method1153(PacketWriter var1) {
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
					if (var1.field1328) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 0, 1);
						var1.field1326 = 0;
						var1.field1328 = false;
					}

					var3.offset = 0;
					if (var3.method7701()) {
						if (!var2.isAvailable(1)) {
							return false;
						}

						var2.read(var1.packetBuffer.array, 1, 1);
						var1.field1326 = 0;
					}

					var1.field1328 = true;
					ServerPacket[] var4 = class230.ServerPacket_values();
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
				var1.field1326 = 0;
				timer.method6594();
				var1.field1331 = var1.field1329;
				var1.field1329 = var1.field1320;
				var1.field1320 = var1.serverPacket;
				byte var70;
				if (ServerPacket.field3043 == var1.serverPacket) {
					RouteStrategy.method3875();
					var70 = var3.readByte();
					class131 var83 = new class131(var3);
					ClanSettings var65;
					if (var70 >= 0) {
						var65 = currentClanSettings[var70];
					} else {
						var65 = class134.guestClanSettings;
					}

					var83.method2851(var65);
					var1.serverPacket = null;
					return true;
				}

				int var7;
				int var20;
				Widget var56;
				if (ServerPacket.field3052 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAdd();
					var22 = var3.readUnsignedShortAdd();
					var7 = var3.readUnsignedIntME();
					var56 = HorizontalAlignment.getWidget(var7);
					if (((var22 != var56.modelAngleX) || (var5 != var56.modelAngleY)) || (var20 != var56.modelZoom)) {
						var56.modelAngleX = var22;
						var56.modelAngleY = var5;
						var56.modelZoom = var20;
						class290.invalidateWidget(var56);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3061 == var1.serverPacket) {
					class83.updatePlayers(var3, var1.serverPacketLength);
					class4.method19();
					var1.serverPacket = null;
					return true;
				}

				Widget var6;
				boolean var71;
				if (ServerPacket.field3107 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var71 = var3.readUnsignedByte() == 1;
					var6 = HorizontalAlignment.getWidget(var20);
					if (var71 != var6.isHidden) {
						var6.isHidden = var71;
						class290.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3034 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					byte var72 = var3.readByteAdd();
					Varps.Varps_temp[var20] = var72;
					if (Varps.Varps_main[var20] != var72) {
						Varps.Varps_main[var20] = var72;
					}

					class78.changeGameOptions(var20);
					changedVarps[((++changedVarpCount) - 1) & 31] = var20;
					var1.serverPacket = null;
					return true;
				}

				String var59;
				if (ServerPacket.field3032 == var1.serverPacket) {
					var20 = var3.readUShortSmart();
					var71 = var3.readUnsignedByte() == 1;
					var59 = "";
					boolean var66 = false;
					if (var71) {
						var59 = var3.readStringCp1252NullTerminated();
						if (class155.friendSystem.isIgnored(new Username(var59, class83.loginType))) {
							var66 = true;
						}
					}

					String var58 = var3.readStringCp1252NullTerminated();
					if (!var66) {
						Login.addGameMessage(var20, var59, var58);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3058 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShort();
					Varps.Varps_temp[var5] = var20;
					if (Varps.Varps_main[var5] != var20) {
						Varps.Varps_main[var5] = var20;
					}

					class78.changeGameOptions(var5);
					changedVarps[((++changedVarpCount) - 1) & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3038 == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var21 = var3.readStringCp1252NullTerminated();
					var6 = HorizontalAlignment.getWidget(var20);
					if (!var21.equals(var6.text)) {
						var6.text = var21;
						class290.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				int var9;
				int var10;
				int var23;
				if (ServerPacket.field3079 == var1.serverPacket) {
					isCameraLocked = true;
					field739 = false;
					class12.field62 = var3.readUnsignedByte();
					WorldMapSectionType.field2778 = var3.readUnsignedByte();
					class351.field4157 = var3.readUnsignedShort();
					ClanChannel.field1660 = var3.readUnsignedByte();
					JagexCache.field1737 = var3.readUnsignedByte();
					if (JagexCache.field1737 >= 100) {
						var20 = (class12.field62 * 128) + 64;
						var5 = (WorldMapSectionType.field2778 * 128) + 64;
						var22 = Archive.getTileHeight(var20, var5, class160.Client_plane) - class351.field4157;
						var7 = var20 - EnumComposition.cameraX;
						var23 = var22 - FriendSystem.cameraY;
						var9 = var5 - CollisionMap.cameraZ;
						var10 = ((int) (Math.sqrt(((double) ((var9 * var9) + (var7 * var7))))));
						Language.cameraPitch = ((int) (Math.atan2(((double) (var23)), ((double) (var10))) * 325.9490051269531)) & 2047;
						MusicPatchNode2.cameraYaw = ((int) (Math.atan2(((double) (var7)), ((double) (var9))) * (-325.9490051269531))) & 2047;
						if (Language.cameraPitch < 128) {
							Language.cameraPitch = 128;
						}

						if (Language.cameraPitch > 383) {
							Language.cameraPitch = 383;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3103 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readInt();
					var22 = NetCache.getGcDuration();
					PacketBufferNode var84 = ItemContainer.getPacketBufferNode(ClientPacket.field2983, Client.packetWriter.isaacCipher);
					var84.packetBuffer.writeIntME(var20);
					var84.packetBuffer.writeIntLE(var5);
					var84.packetBuffer.writeByteSub(GameEngine.fps);
					var84.packetBuffer.writeByteSub(var22);
					packetWriter.addNode(var84);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3042 == var1.serverPacket) {
					class9.field34 = var3.readUnsignedByteAdd();
					FriendSystem.field803 = var3.readUnsignedByteSub();

					while (var3.offset < var1.serverPacketLength) {
						var20 = var3.readUnsignedByte();
						class263 var81 = Language.method6134()[var20];
						class221.method4531(var81);
					} 

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3095 == var1.serverPacket) {
					GameEngine.field205 = null;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3040 == var1.serverPacket) {
					class9.field34 = var3.readUnsignedByteAdd();
					FriendSystem.field803 = var3.readUnsignedByte();

					for (var20 = FriendSystem.field803; var20 < (FriendSystem.field803 + 8); ++var20) {
						for (var5 = class9.field34; var5 < (class9.field34 + 8); ++var5) {
							if (groundItems[class160.Client_plane][var20][var5] != null) {
								groundItems[class160.Client_plane][var20][var5] = null;
								class162.updateItemPile(var20, var5);
							}
						}
					}

					for (PendingSpawn var54 = ((PendingSpawn) (pendingSpawns.last())); var54 != null; var54 = ((PendingSpawn) (pendingSpawns.previous()))) {
						if (((((var54.x >= FriendSystem.field803) && (var54.x < (FriendSystem.field803 + 8))) && (var54.y >= class9.field34)) && (var54.y < (class9.field34 + 8))) && (var54.plane == class160.Client_plane)) {
							var54.hitpoints = 0;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3114 == var1.serverPacket) {
					class221.method4531(class263.field3012);
					var1.serverPacket = null;
					return true;
				}

				long var25;
				long var27;
				String var32;
				String var50;
				int var68;
				if (ServerPacket.field3048 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var25 = ((long) (var3.readUnsignedShort()));
					var27 = ((long) (var3.readMedium()));
					PlayerType var29 = ((PlayerType) (ChatChannel.findEnumerated(HitSplatDefinition.PlayerType_values(), var3.readUnsignedByte())));
					long var30 = var27 + (var25 << 32);
					boolean var62 = false;

					for (var68 = 0; var68 < 100; ++var68) {
						if (var30 == crossWorldMessageIds[var68]) {
							var62 = true;
							break;
						}
					}

					if (class155.friendSystem.isIgnored(new Username(var50, class83.loginType))) {
						var62 = true;
					}

					if ((!var62) && (field603 == 0)) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var30;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var32 = AbstractFont.escapeBrackets(AbstractByteArrayCopier.method5528(class118.method2737(var3)));
						byte var69;
						if (var29.isPrivileged) {
							var69 = 7;
						} else {
							var69 = 3;
						}

						if (var29.modIcon != (-1)) {
							Login.addGameMessage(var69, class351.method6579(var29.modIcon) + var50, var32);
						} else {
							Login.addGameMessage(var69, var50, var32);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				int var12;
				int var14;
				int var15;
				int var16;
				int var61;
				if (ServerPacket.field3090 == var1.serverPacket) {
					int var18 = var3.readUnsignedByte();
					var16 = var3.readUnsignedShortAddLE();
					var22 = var3.method7805();
					var20 = var22 >> 16;
					var5 = (var22 >> 8) & 255;
					var7 = var20 + ((var22 >> 4) & 7);
					var23 = var5 + (var22 & 7);
					byte var63 = var3.readByte();
					var12 = var3.readUnsignedShortAddLE();
					var68 = var3.readUnsignedByteAdd() * 4;
					byte var64 = var3.readByteAdd();
					var15 = var3.readUnsignedShortLE();
					int var17 = var3.readUnsignedByte();
					var14 = var3.readUnsignedByteSub() * 4;
					var61 = var3.method7769();
					var9 = var63 + var7;
					var10 = var64 + var23;
					if (((((((((var7 >= 0) && (var23 >= 0)) && (var7 < 104)) && (var23 < 104)) && (var9 >= 0)) && (var10 >= 0)) && (var9 < 104)) && (var10 < 104)) && (var12 != 65535)) {
						var7 = (var7 * 128) + 64;
						var23 = (var23 * 128) + 64;
						var9 = (var9 * 128) + 64;
						var10 = (var10 * 128) + 64;
						Projectile var19 = new Projectile(var12, class160.Client_plane, var7, var23, Archive.getTileHeight(var7, var23, class160.Client_plane) - var68, var15 + cycle, var16 + cycle, var17, var18, var61, var14);
						var19.setDestination(var9, var10, Archive.getTileHeight(var9, var10, class160.Client_plane) - var14, var15 + cycle);
						projectiles.addFirst(var19);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3051 == var1.serverPacket) {
					isCameraLocked = false;

					for (var20 = 0; var20 < 5; ++var20) {
						field740[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3117 == var1.serverPacket) {
					if (class230.friendsChat != null) {
						class230.friendsChat.method6718(var3);
					}

					Strings.method5798();
					var1.serverPacket = null;
					return true;
				}

				InterfaceParent var82;
				if (ServerPacket.field3044 == var1.serverPacket) {
					var20 = var3.readUnsignedIntLE();
					var5 = var3.readUnsignedIntIME();
					InterfaceParent var60 = ((InterfaceParent) (interfaceParents.get(((long) (var20)))));
					var82 = ((InterfaceParent) (interfaceParents.get(((long) (var5)))));
					if (var82 != null) {
						class20.closeInterface(var82, (var60 == null) || (var82.group != var60.group));
					}

					if (var60 != null) {
						var60.remove();
						interfaceParents.put(var60, ((long) (var5)));
					}

					var56 = HorizontalAlignment.getWidget(var20);
					if (var56 != null) {
						class290.invalidateWidget(var56);
					}

					var56 = HorizontalAlignment.getWidget(var5);
					if (var56 != null) {
						class290.invalidateWidget(var56);
						GrandExchangeEvents.revalidateWidgetScroll(EnumComposition.Widget_interfaceComponents[var56.id >>> 16], var56, true);
					}

					if (rootInterface != (-1)) {
						MouseHandler.runIntfCloseListeners(rootInterface, 1);
					}

					var1.serverPacket = null;
					return true;
				}

				if ((ServerPacket.field3100 == var1.serverPacket) && isCameraLocked) {
					field739 = true;
					Tiles.field996 = var3.readUnsignedByte();
					class33.field231 = var3.readUnsignedByte();
					ClanChannel.field1660 = var3.readUnsignedByte();
					JagexCache.field1737 = var3.readUnsignedByte();

					for (var20 = 0; var20 < 5; ++var20) {
						field740[var20] = false;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3030 == var1.serverPacket) {
					DynamicObject.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				boolean var87;
				if (ServerPacket.field3036 == var1.serverPacket) {
					var87 = var3.readUnsignedByte() == 1;
					if (var87) {
						Varps.field3287 = WorldMapSprite.getServerTime() - var3.readLong();
						ReflectionCheck.grandExchangeEvents = new GrandExchangeEvents(var3, true);
					} else {
						ReflectionCheck.grandExchangeEvents = null;
					}

					field572 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3065 == var1.serverPacket) {
					class221.method4531(class263.field3010);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3116 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readUnsignedByte();
					var22 = var3.readUnsignedByte();
					var7 = var3.readUnsignedByte();
					field740[var20] = true;
					field482[var20] = var5;
					field549[var20] = var22;
					field766[var20] = var7;
					field744[var20] = 0;
					var1.serverPacket = null;
					return true;
				}

				Widget var80;
				if (ServerPacket.field3072 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					var5 = var3.readUnsignedShortAddLE();
					var22 = var3.readUnsignedIntIME();
					var80 = HorizontalAlignment.getWidget(var22);
					var80.field3399 = var5 + (var20 << 16);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3110 == var1.serverPacket) {
					World var53 = new World();
					var53.host = var3.readStringCp1252NullTerminated();
					var53.id = var3.readUnsignedShort();
					var5 = var3.readInt();
					var53.properties = var5;
					InterfaceParent.updateGameState(45);
					var2.close();
					var2 = null;
					ItemContainer.changeWorld(var53);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3085 == var1.serverPacket) {
					var3.offset += 28;
					if (var3.checkCrc()) {
						WorldMapRegion.method4798(var3, var3.offset - 28);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3041 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readShort();
					var22 = var3.method7769();
					var80 = HorizontalAlignment.getWidget(var20);
					if ((((var5 != var80.rawX) || (var22 != var80.rawY)) || (var80.xAlignment != 0)) || (var80.yAlignment != 0)) {
						var80.rawX = var5;
						var80.rawY = var22;
						var80.xAlignment = 0;
						var80.yAlignment = 0;
						class290.invalidateWidget(var80);
						this.alignWidget(var80);
						if (var80.type == 0) {
							GrandExchangeEvents.revalidateWidgetScroll(EnumComposition.Widget_interfaceComponents[var20 >> 16], var80, false);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3033 == var1.serverPacket) {
					var87 = var3.readBoolean();
					if (var87) {
						if (class340.field4109 == null) {
							class340.field4109 = new class326();
						}
					} else {
						class340.field4109 = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3105 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var5 = var3.readInt();
					var22 = var3.readUnsignedShortAddLE();
					var82 = ((InterfaceParent) (interfaceParents.get(((long) (var5)))));
					if (var82 != null) {
						class20.closeInterface(var82, var22 != var82.group);
					}

					ServerPacket.method5222(var5, var22, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3057 == var1.serverPacket) {
					GameObject.logOut();
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3088 == var1.serverPacket) {
					class146.loadRegions(true, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3027 == var1.serverPacket) {
					class221.method4531(class263.field3006);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3060 == var1.serverPacket) {
					Varps.privateChatMode = class83.method2124(var3.readUnsignedByte());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3091 == var1.serverPacket) {
					class221.method4531(class263.field3013);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3126 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					var5 = var3.readInt();
					var22 = (var20 >> 10) & 31;
					var7 = (var20 >> 5) & 31;
					var23 = var20 & 31;
					var9 = ((var7 << 11) + (var22 << 19)) + (var23 << 3);
					Widget var86 = HorizontalAlignment.getWidget(var5);
					if (var9 != var86.color) {
						var86.color = var9;
						class290.invalidateWidget(var86);
					}

					var1.serverPacket = null;
					return true;
				}

				long var34;
				if (ServerPacket.field3071 == var1.serverPacket) {
					var20 = var3.readUnsignedIntIME();
					var5 = var3.readUnsignedShortLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					var22 = var3.readUnsignedShortAddLE();
					if (var22 == 65535) {
						var22 = -1;
					}

					var7 = var3.readInt();

					for (var23 = var5; var23 <= var22; ++var23) {
						var34 = ((long) (var23)) + (((long) (var7)) << 32);
						Node var88 = widgetFlags.get(var34);
						if (var88 != null) {
							var88.remove();
						}

						widgetFlags.put(new IntegerNode(var20), var34);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3078 == var1.serverPacket) {
					DynamicObject.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3124 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < (-70000)) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var6 = HorizontalAlignment.getWidget(var20);
					} else {
						var6 = null;
					}

					if (var6 != null) {
						for (var7 = 0; var7 < var6.itemIds.length; ++var7) {
							var6.itemIds[var7] = 0;
							var6.itemQuantities[var7] = 0;
						}
					}

					TileItem.clearItemContainer(var5);
					var7 = var3.readUnsignedShort();

					for (var23 = 0; var23 < var7; ++var23) {
						var9 = var3.readUnsignedShort();
						var10 = var3.readUnsignedByteAdd();
						if (var10 == 255) {
							var10 = var3.readInt();
						}

						if ((var6 != null) && (var23 < var6.itemIds.length)) {
							var6.itemIds[var23] = var9;
							var6.itemQuantities[var23] = var10;
						}

						class29.itemContainerSetItem(var5, var23, var9 - 1, var10);
					}

					if (var6 != null) {
						class290.invalidateWidget(var6);
					}

					SceneTilePaint.method4499();
					changedItemContainers[((++field746) - 1) & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3086 == var1.serverPacket) {
					var22 = var3.method7877();
					var20 = var22 >> 16;
					var5 = (var22 >> 8) & 255;
					var7 = var20 + ((var22 >> 4) & 7);
					var23 = var5 + (var22 & 7);
					var10 = var3.readUnsignedByte();
					var61 = var3.readUnsignedShort();
					var9 = var3.readUnsignedShortAddLE();
					if ((((var7 >= 0) && (var23 >= 0)) && (var7 < 104)) && (var23 < 104)) {
						var7 = (var7 * 128) + 64;
						var23 = (var23 * 128) + 64;
						GraphicsObject var89 = new GraphicsObject(var9, class160.Client_plane, var7, var23, Archive.getTileHeight(var7, var23, class160.Client_plane) - var10, var61, cycle);
						graphicsObjects.addFirst(var89);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3129 == var1.serverPacket) {
					var20 = var3.readInt();
					if (var20 != field571) {
						field571 = var20;
						class11.method115();
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3064 == var1.serverPacket) {
					class221.method4531(class263.field3009);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3025 == var1.serverPacket) {
					byte[] var52 = new byte[var1.serverPacketLength];
					var3.method7708(var52, 0, var52.length);
					Buffer var79 = new Buffer(var52);
					var59 = var79.readStringCp1252NullTerminated();
					class11.openURL(var59, true, false);
					var1.serverPacket = null;
					return true;
				}

				Widget var74;
				if (ServerPacket.field3035 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var74 = HorizontalAlignment.getWidget(var20);
					var74.modelType = 3;
					var74.modelId = class19.localPlayer.appearance.getChatHeadId();
					class290.invalidateWidget(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3099 == var1.serverPacket) {
					var20 = var3.readInt();
					InterfaceParent var78 = ((InterfaceParent) (interfaceParents.get(((long) (var20)))));
					if (var78 != null) {
						class20.closeInterface(var78, true);
					}

					if (meslayerContinueWidget != null) {
						class290.invalidateWidget(meslayerContinueWidget);
						meslayerContinueWidget = null;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3076 == var1.serverPacket) {
					field749 = cycleCntr;
					var70 = var3.readByte();
					class145 var76 = new class145(var3);
					ClanChannel var57;
					if (var70 >= 0) {
						var57 = currentClanChannels[var70];
					} else {
						var57 = class83.guestClanChannel;
					}

					var76.method3030(var57);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3054 == var1.serverPacket) {
					field749 = cycleCntr;
					var70 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var70 >= 0) {
							currentClanChannels[var70] = null;
						} else {
							class83.guestClanChannel = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var70 >= 0) {
						currentClanChannels[var70] = new ClanChannel(var3);
					} else {
						class83.guestClanChannel = new ClanChannel(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3096 == var1.serverPacket) {
					for (var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
						if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
							Varps.Varps_main[var20] = Varps.Varps_temp[var20];
							class78.changeGameOptions(var20);
							changedVarps[((++changedVarpCount) - 1) & 31] = var20;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3045 == var1.serverPacket) {
					RouteStrategy.method3875();
					var70 = var3.readByte();
					if (var1.serverPacketLength == 1) {
						if (var70 >= 0) {
							currentClanSettings[var70] = null;
						} else {
							class134.guestClanSettings = null;
						}

						var1.serverPacket = null;
						return true;
					}

					if (var70 >= 0) {
						currentClanSettings[var70] = new ClanSettings(var3);
					} else {
						class134.guestClanSettings = new ClanSettings(var3);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3028 == var1.serverPacket) {
					rebootTimer = var3.readUnsignedShort() * 30;
					field762 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3118 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedIntIME();
					var6 = HorizontalAlignment.getWidget(var5);
					if ((var6.modelType != 2) || (var20 != var6.modelId)) {
						var6.modelType = 2;
						var6.modelId = var20;
						class290.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3121 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShort();
					var6 = HorizontalAlignment.getWidget(var20);
					if ((var6.modelType != 1) || (var5 != var6.modelId)) {
						var6.modelType = 1;
						var6.modelId = var5;
						class290.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3024 == var1.serverPacket) {
					minimapState = var3.readUnsignedByte();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3075 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					Language.method6136(var20);
					changedItemContainers[((++field746) - 1) & 31] = var20 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3101 == var1.serverPacket) {
					var20 = var3.readUnsignedShort();
					var5 = var3.readUnsignedByte();
					var22 = var3.readUnsignedShort();
					KitDefinition.queueSoundEffect(var20, var5, var22);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3098 == var1.serverPacket) {
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

				if (ServerPacket.field3102 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAdd();
					rootInterface = var20;
					this.resizeRoot(false);
					class127.Widget_resetModelFrames(var20);
					class358.runWidgetOnLoadListener(rootInterface);

					for (var5 = 0; var5 < 100; ++var5) {
						field564[var5] = true;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3119 == var1.serverPacket) {
					SceneTilePaint.method4499();
					var20 = var3.readUnsignedByteSub();
					var5 = var3.readUnsignedByteNeg();
					var22 = var3.readUnsignedIntME();
					experience[var5] = var22;
					currentLevels[var5] = var20;
					levels[var5] = 1;

					for (var7 = 0; var7 < 98; ++var7) {
						if (var22 >= Skills.Skills_experienceTable[var7]) {
							levels[var5] = var7 + 2;
						}
					}

					changedSkills[((++changedSkillsCount) - 1) & 31] = var5;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3104 == var1.serverPacket) {
					publicChatMode = var3.readUnsignedByteSub();
					tradeChatMode = var3.readUnsignedByteAdd();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3092 == var1.serverPacket) {
					if (rootInterface != (-1)) {
						MouseHandler.runIntfCloseListeners(rootInterface, 0);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3106 == var1.serverPacket) {
					SceneTilePaint.method4499();
					weight = var3.readShort();
					field762 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				long var38;
				if (ServerPacket.field3069 == var1.serverPacket) {
					var20 = var3.offset + var1.serverPacketLength;
					var5 = var3.readUnsignedShort();
					var22 = var3.readUnsignedShort();
					if (var5 != rootInterface) {
						rootInterface = var5;
						this.resizeRoot(false);
						class127.Widget_resetModelFrames(rootInterface);
						class358.runWidgetOnLoadListener(rootInterface);

						for (var7 = 0; var7 < 100; ++var7) {
							field564[var7] = true;
						}
					}

					InterfaceParent var85;
					for (; (var22--) > 0; var85.field1039 = true) {
						var7 = var3.readInt();
						var23 = var3.readUnsignedShort();
						var9 = var3.readUnsignedByte();
						var85 = ((InterfaceParent) (interfaceParents.get(((long) (var7)))));
						if ((var85 != null) && (var23 != var85.group)) {
							class20.closeInterface(var85, true);
							var85 = null;
						}

						if (var85 == null) {
							var85 = ServerPacket.method5222(var7, var23, var9);
						}
					}

					for (var82 = ((InterfaceParent) (interfaceParents.first())); var82 != null; var82 = ((InterfaceParent) (interfaceParents.next()))) {
						if (var82.field1039) {
							var82.field1039 = false;
						} else {
							class20.closeInterface(var82, true);
						}
					}

					widgetFlags = new NodeHashTable(512);

					while (var3.offset < var20) {
						var7 = var3.readInt();
						var23 = var3.readUnsignedShort();
						var9 = var3.readUnsignedShort();
						var10 = var3.readInt();

						for (var61 = var23; var61 <= var9; ++var61) {
							var38 = (((long) (var7)) << 32) + ((long) (var61));
							widgetFlags.put(new IntegerNode(var10), var38);
						}
					} 

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3031 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var21 = AbstractFont.escapeBrackets(AbstractByteArrayCopier.method5528(class118.method2737(var3)));
					Login.addGameMessage(6, var50, var21);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3050 == var1.serverPacket) {
					if (GameEngine.field205 == null) {
						GameEngine.field205 = new class391(FontName.HitSplatDefinition_cached);
					}

					class445 var51 = FontName.HitSplatDefinition_cached.method7173(var3);
					GameEngine.field205.field4376.vmethod7561(var51.field4680, var51.field4681);
					field682[((++field683) - 1) & 31] = var51.field4680;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3112 == var1.serverPacket) {
					class9.field34 = var3.readUnsignedByteAdd();
					FriendSystem.field803 = var3.readUnsignedByteSub();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3074 == var1.serverPacket) {
					for (var20 = 0; var20 < VarpDefinition.VarpDefinition_fileCount; ++var20) {
						VarpDefinition var75 = SoundCache.VarpDefinition_get(var20);
						if (var75 != null) {
							Varps.Varps_temp[var20] = 0;
							Varps.Varps_main[var20] = 0;
						}
					}

					SceneTilePaint.method4499();
					changedVarpCount += 32;
					var1.serverPacket = null;
					return true;
				}

				String var40;
				if (ServerPacket.field3082 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					var25 = var3.readLong();
					var27 = ((long) (var3.readUnsignedShort()));
					var34 = ((long) (var3.readMedium()));
					PlayerType var36 = ((PlayerType) (ChatChannel.findEnumerated(HitSplatDefinition.PlayerType_values(), var3.readUnsignedByte())));
					var38 = (var27 << 32) + var34;
					boolean var67 = false;

					for (var15 = 0; var15 < 100; ++var15) {
						if (crossWorldMessageIds[var15] == var38) {
							var67 = true;
							break;
						}
					}

					if (var36.isUser && class155.friendSystem.isIgnored(new Username(var50, class83.loginType))) {
						var67 = true;
					}

					if ((!var67) && (field603 == 0)) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var38;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var40 = AbstractFont.escapeBrackets(AbstractByteArrayCopier.method5528(class118.method2737(var3)));
						if (var36.modIcon != (-1)) {
							class6.addChatMessage(9, class351.method6579(var36.modIcon) + var50, var40, UserComparator7.base37DecodeLong(var25));
						} else {
							class6.addChatMessage(9, var50, var40, UserComparator7.base37DecodeLong(var25));
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3047 == var1.serverPacket) {
					class155.friendSystem.readUpdate(var3, var1.serverPacketLength);
					field685 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3122 == var1.serverPacket) {
					SceneTilePaint.method4499();
					runEnergy = var3.readUnsignedByte();
					field762 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3084 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					var21 = var3.readStringCp1252NullTerminated();
					var22 = var3.readUnsignedByteAdd();
					if ((var20 >= 1) && (var20 <= 8)) {
						if (var21.equalsIgnoreCase("null")) {
							var21 = null;
						}

						playerMenuActions[var20 - 1] = var21;
						playerOptionsPriorities[var20 - 1] = var22 == 0;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3123 == var1.serverPacket) {
					var22 = var3.method7877();
					var20 = var22 >> 16;
					var5 = (var22 >> 8) & 255;
					var7 = var20 + ((var22 >> 4) & 7);
					var23 = var5 + (var22 & 7);
					var9 = var3.readUnsignedByteAdd();
					var10 = var9 >> 2;
					var61 = var9 & 3;
					var12 = field711[var10];
					var68 = var3.readUnsignedShort();
					if ((((var7 >= 0) && (var23 >= 0)) && (var7 < 103)) && (var23 < 103)) {
						if (var12 == 0) {
							BoundaryObject var93 = FriendSystem.scene.method4150(class160.Client_plane, var7, var23);
							if (var93 != null) {
								var15 = class121.Entity_unpackID(var93.tag);
								if (var10 == 2) {
									var93.renderable1 = new DynamicObject(var15, 2, var61 + 4, class160.Client_plane, var7, var23, var68, false, var93.renderable1);
									var93.renderable2 = new DynamicObject(var15, 2, (var61 + 1) & 3, class160.Client_plane, var7, var23, var68, false, var93.renderable2);
								} else {
									var93.renderable1 = new DynamicObject(var15, var10, var61, class160.Client_plane, var7, var23, var68, false, var93.renderable1);
								}
							}
						} else if (var12 == 1) {
							WallDecoration var92 = FriendSystem.scene.method4224(class160.Client_plane, var7, var23);
							if (var92 != null) {
								var15 = class121.Entity_unpackID(var92.tag);
								if ((var10 != 4) && (var10 != 5)) {
									if (var10 == 6) {
										var92.renderable1 = new DynamicObject(var15, 4, var61 + 4, class160.Client_plane, var7, var23, var68, false, var92.renderable1);
									} else if (var10 == 7) {
										var92.renderable1 = new DynamicObject(var15, 4, ((var61 + 2) & 3) + 4, class160.Client_plane, var7, var23, var68, false, var92.renderable1);
									} else if (var10 == 8) {
										var92.renderable1 = new DynamicObject(var15, 4, var61 + 4, class160.Client_plane, var7, var23, var68, false, var92.renderable1);
										var92.renderable2 = new DynamicObject(var15, 4, ((var61 + 2) & 3) + 4, class160.Client_plane, var7, var23, var68, false, var92.renderable2);
									}
								} else {
									var92.renderable1 = new DynamicObject(var15, 4, var61, class160.Client_plane, var7, var23, var68, false, var92.renderable1);
								}
							}
						} else if (var12 == 2) {
							GameObject var90 = FriendSystem.scene.getGameObject(class160.Client_plane, var7, var23);
							if (var10 == 11) {
								var10 = 10;
							}

							if (var90 != null) {
								var90.renderable = new DynamicObject(class121.Entity_unpackID(var90.tag), var10, var61, class160.Client_plane, var7, var23, var68, false, var90.renderable);
							}
						} else if (var12 == 3) {
							FloorDecoration var91 = FriendSystem.scene.getFloorDecoration(class160.Client_plane, var7, var23);
							if (var91 != null) {
								var91.renderable = new DynamicObject(class121.Entity_unpackID(var91.tag), 22, var61, class160.Client_plane, var7, var23, var68, false, var91.renderable);
							}
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3046 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var74 = HorizontalAlignment.getWidget(var20);

					for (var22 = 0; var22 < var74.itemIds.length; ++var22) {
						var74.itemIds[var22] = -1;
						var74.itemIds[var22] = 0;
					}

					class290.invalidateWidget(var74);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3068 == var1.serverPacket) {
					var70 = var3.readByte();
					var25 = ((long) (var3.readUnsignedShort()));
					var27 = ((long) (var3.readMedium()));
					var34 = (var25 << 32) + var27;
					boolean var11 = false;
					ClanChannel var37 = (var70 >= 0) ? currentClanChannels[var70] : class83.guestClanChannel;
					if (var37 == null) {
						var11 = true;
					} else {
						for (var68 = 0; var68 < 100; ++var68) {
							if (crossWorldMessageIds[var68] == var34) {
								var11 = true;
								break;
							}
						}
					}

					if (!var11) {
						crossWorldMessageIds[crossWorldMessageIdsIndex] = var34;
						crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
						var32 = class118.method2737(var3);
						var14 = (var70 >= 0) ? 43 : 46;
						class6.addChatMessage(var14, "", var32, var37.name);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3029 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					class19.forceDisconnect(var20);
					var1.serverPacket = null;
					return false;
				}

				if (ServerPacket.field3081 == var1.serverPacket) {
					GameEngine.field205 = new class391(FontName.HitSplatDefinition_cached);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3083 == var1.serverPacket) {
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

				if (ServerPacket.field3039 == var1.serverPacket) {
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

				if (ServerPacket.field3120 == var1.serverPacket) {
					class268.readReflectionCheck(var3, var1.serverPacketLength);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3125 == var1.serverPacket) {
					class162.field1768 = true;
					DynamicObject.updateNpcs(false, var3);
					var1.serverPacket = null;
					return true;
				}

				NPC var24;
				if (ServerPacket.field3063 == var1.serverPacket) {
					var5 = var3.readUnsignedIntIME();
					var22 = var3.readUnsignedShortAdd();
					var20 = var3.readUnsignedShortLE();
					var24 = npcs[var20];
					if (var24 != null) {
						var24.spotAnimation = var22;
						var24.spotAnimationHeight = var5 >> 16;
						var24.field1173 = (var5 & 65535) + cycle;
						var24.spotAnimationFrame = 0;
						var24.spotAnimationFrameCycle = 0;
						if (var24.field1173 > cycle) {
							var24.spotAnimationFrame = -1;
						}

						if (var24.spotAnimation == 65535) {
							var24.spotAnimation = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3053 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readShortAdd();
					var6 = HorizontalAlignment.getWidget(var20);
					if ((var5 != var6.sequenceId) || (var5 == (-1))) {
						var6.sequenceId = var5;
						var6.modelFrame = 0;
						var6.modelFrameCycle = 0;
						class290.invalidateWidget(var6);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3094 == var1.serverPacket) {
					class221.method4531(class263.field3005);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3067 == var1.serverPacket) {
					class221.method4531(class263.field3008);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3062 == var1.serverPacket) {
					var20 = var3.readUnsignedShortLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					var5 = var3.readUnsignedIntME();
					var22 = var3.readUnsignedIntIME();
					var80 = HorizontalAlignment.getWidget(var22);
					ItemComposition var8;
					if (!var80.isIf3) {
						if (var20 == (-1)) {
							var80.modelType = 0;
							var1.serverPacket = null;
							return true;
						}

						var8 = class67.ItemDefinition_get(var20);
						var80.modelType = 4;
						var80.modelId = var20;
						var80.modelAngleX = var8.xan2d;
						var80.modelAngleY = var8.yan2d;
						var80.modelZoom = (var8.zoom2d * 100) / var5;
						class290.invalidateWidget(var80);
					} else {
						var80.itemId = var20;
						var80.itemQuantity = var5;
						var8 = class67.ItemDefinition_get(var20);
						var80.modelAngleX = var8.xan2d;
						var80.modelAngleY = var8.yan2d;
						var80.modelAngleZ = var8.zan2d;
						var80.modelOffsetX = var8.offsetX2d;
						var80.modelOffsetY = var8.offsetY2d;
						var80.modelZoom = var8.zoom2d;
						if (var8.isStackable == 1) {
							var80.itemQuantityMode = 1;
						} else {
							var80.itemQuantityMode = 2;
						}

						if (var80.field3398 > 0) {
							var80.modelZoom = (var80.modelZoom * 32) / var80.field3398;
						} else if (var80.rawWidth > 0) {
							var80.modelZoom = (var80.modelZoom * 32) / var80.rawWidth;
						}

						class290.invalidateWidget(var80);
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3111 == var1.serverPacket) {
					var20 = var3.readUnsignedIntME();
					var5 = var3.readUnsignedShortAdd();
					var6 = HorizontalAlignment.getWidget(var20);
					if ((var6 != null) && (var6.type == 0)) {
						if (var5 > (var6.scrollHeight - var6.height)) {
							var5 = var6.scrollHeight - var6.height;
						}

						if (var5 < 0) {
							var5 = 0;
						}

						if (var5 != var6.scrollY) {
							var6.scrollY = var5;
							class290.invalidateWidget(var6);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3109 == var1.serverPacket) {
					var5 = var3.readUnsignedShort();
					var22 = var3.readUnsignedIntLE();
					var20 = var3.readUnsignedShort();
					Player var77;
					if (var20 == localPlayerIndex) {
						var77 = class19.localPlayer;
					} else {
						var77 = players[var20];
					}

					if (var77 != null) {
						var77.spotAnimation = var5;
						var77.spotAnimationHeight = var22 >> 16;
						var77.field1173 = (var22 & 65535) + cycle;
						var77.spotAnimationFrame = 0;
						var77.spotAnimationFrameCycle = 0;
						if (var77.field1173 > cycle) {
							var77.spotAnimationFrame = -1;
						}

						if (var77.spotAnimation == 65535) {
							var77.spotAnimation = -1;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3089 == var1.serverPacket) {
					var50 = var3.readStringCp1252NullTerminated();
					Object[] var73 = new Object[var50.length() + 1];

					for (var22 = var50.length() - 1; var22 >= 0; --var22) {
						if (var50.charAt(var22) == 's') {
							var73[var22 + 1] = var3.readStringCp1252NullTerminated();
						} else {
							var73[var22 + 1] = new Integer(var3.readInt());
						}
					}

					var73[0] = new Integer(var3.readInt());
					ScriptEvent var55 = new ScriptEvent();
					var55.args = var73;
					class1.runScriptEvent(var55);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3066 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					class82.method2123(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3097 == var1.serverPacket) {
					isCameraLocked = true;
					field739 = false;
					PcmPlayer.field302 = var3.readUnsignedByte();
					DevicePcmPlayerProvider.field146 = var3.readUnsignedByte();
					ClanSettings.field1608 = var3.readUnsignedShort();
					Tiles.field996 = var3.readUnsignedByte();
					class33.field231 = var3.readUnsignedByte();
					if (class33.field231 >= 100) {
						EnumComposition.cameraX = (PcmPlayer.field302 * 128) + 64;
						CollisionMap.cameraZ = (DevicePcmPlayerProvider.field146 * 128) + 64;
						FriendSystem.cameraY = Archive.getTileHeight(EnumComposition.cameraX, CollisionMap.cameraZ, class160.Client_plane) - ClanSettings.field1608;
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3037 == var1.serverPacket) {
					class221.method4531(class263.field3011);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3059 == var1.serverPacket) {
					var22 = var3.readUnsignedByteNeg();
					var20 = var3.readUnsignedShortAddLE();
					var5 = var3.readUnsignedShortAdd();
					if (var5 == 65535) {
						var5 = -1;
					}

					var24 = npcs[var20];
					if (var24 != null) {
						if ((var5 == var24.sequence) && (var5 != (-1))) {
							var23 = ItemContainer.SequenceDefinition_get(var5).field2172;
							if (var23 == 1) {
								var24.sequenceFrame = 0;
								var24.sequenceFrameCycle = 0;
								var24.sequenceDelay = var22;
								var24.field1169 = 0;
							} else if (var23 == 2) {
								var24.field1169 = 0;
							}
						} else if (((var5 == (-1)) || (var24.sequence == (-1))) || (ItemContainer.SequenceDefinition_get(var5).field2166 >= ItemContainer.SequenceDefinition_get(var24.sequence).field2166)) {
							var24.sequence = var5;
							var24.sequenceFrame = 0;
							var24.sequenceFrameCycle = 0;
							var24.sequenceDelay = var22;
							var24.field1169 = 0;
							var24.field1134 = var24.pathLength;
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3070 == var1.serverPacket) {
					class221.method4531(class263.field3007);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3080 == var1.serverPacket) {
					var20 = var3.readInt();
					var5 = var3.readUnsignedShort();
					if (var20 < (-70000)) {
						var5 += 32768;
					}

					if (var20 >= 0) {
						var6 = HorizontalAlignment.getWidget(var20);
					} else {
						var6 = null;
					}

					for (; var3.offset < var1.serverPacketLength; class29.itemContainerSetItem(var5, var7, var23 - 1, var9)) {
						var7 = var3.readUShortSmart();
						var23 = var3.readUnsignedShort();
						var9 = 0;
						if (var23 != 0) {
							var9 = var3.readUnsignedByte();
							if (var9 == 255) {
								var9 = var3.readInt();
							}
						}

						if (((var6 != null) && (var7 >= 0)) && (var7 < var6.itemIds.length)) {
							var6.itemIds[var7] = var23;
							var6.itemQuantities[var7] = var9;
						}
					}

					if (var6 != null) {
						class290.invalidateWidget(var6);
					}

					SceneTilePaint.method4499();
					changedItemContainers[((++field746) - 1) & 31] = var5 & 32767;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3049 == var1.serverPacket) {
					var20 = var3.readUnsignedShortAddLE();
					if (var20 == 65535) {
						var20 = -1;
					}

					class401.playSong(var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3093 == var1.serverPacket) {
					var20 = var3.method7805();
					var5 = var3.readUnsignedShortAddLE();
					if (var5 == 65535) {
						var5 = -1;
					}

					class145.method3032(var5, var20);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3113 == var1.serverPacket) {
					FillMode.method8155(var3.readStringCp1252NullTerminated());
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3026 == var1.serverPacket) {
					class221.method4531(class263.field3004);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3127 == var1.serverPacket) {
					class146.loadRegions(false, var1.packetBuffer);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3055 == var1.serverPacket) {
					class155.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
					ObjectComposition.FriendSystem_invalidateIgnoreds();
					field685 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3087 == var1.serverPacket) {
					class162.field1768 = true;
					DynamicObject.updateNpcs(true, var3);
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3073 == var1.serverPacket) {
					class155.friendSystem.method1687();
					field685 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3108 == var1.serverPacket) {
					if (var1.serverPacketLength == 0) {
						class230.friendsChat = null;
					} else {
						if (class230.friendsChat == null) {
							class230.friendsChat = new FriendsChat(class83.loginType, UserComparator10.client);
						}

						class230.friendsChat.readUpdate(var3);
					}

					Strings.method5798();
					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3115 == var1.serverPacket) {
					var70 = var3.readByte();
					var21 = var3.readStringCp1252NullTerminated();
					long var42 = ((long) (var3.readUnsignedShort()));
					long var44 = ((long) (var3.readMedium()));
					PlayerType var33 = ((PlayerType) (ChatChannel.findEnumerated(HitSplatDefinition.PlayerType_values(), var3.readUnsignedByte())));
					long var46 = (var42 << 32) + var44;
					boolean var13 = false;
					ClanChannel var41 = null;
					var41 = (var70 >= 0) ? currentClanChannels[var70] : class83.guestClanChannel;
					if (var41 == null) {
						var13 = true;
					} else {
						var15 = 0;

						while (true) {
							if (var15 >= 100) {
								if (var33.isUser && class155.friendSystem.isIgnored(new Username(var21, class83.loginType))) {
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
						var40 = AbstractFont.escapeBrackets(class118.method2737(var3));
						var16 = (var70 >= 0) ? 41 : 44;
						if (var33.modIcon != (-1)) {
							class6.addChatMessage(var16, class351.method6579(var33.modIcon) + var21, var40, var41.name);
						} else {
							class6.addChatMessage(var16, var21, var40, var41.name);
						}
					}

					var1.serverPacket = null;
					return true;
				}

				if (ServerPacket.field3077 == var1.serverPacket) {
					var20 = var3.readUnsignedByte();
					if (var3.readUnsignedByte() == 0) {
						grandExchangeOffers[var20] = new GrandExchangeOffer();
						var3.offset += 18;
					} else {
						--var3.offset;
						grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false);
					}

					field689 = cycleCntr;
					var1.serverPacket = null;
					return true;
				}

				class301.RunException_sendStackTrace((((((("" + (var1.serverPacket != null ? (var1.serverPacket.id * (-805983233)) * (-998616065) : -1)) + ",") + (var1.field1329 != null ? (var1.field1329.id * (-805983233)) * (-998616065) : -1)) + ",") + (var1.field1331 != null ? (var1.field1331.id * (-805983233)) * (-998616065) : -1)) + ",") + var1.serverPacketLength, ((Throwable) (null)));
				GameObject.logOut();
			} catch (IOException var48) {
				class9.method64();
			} catch (Exception var49) {
				var21 = ((((((((((("" + (var1.serverPacket != null ? (var1.serverPacket.id * (-805983233)) * (-998616065) : -1)) + ",") + (var1.field1329 != null ? (var1.field1329.id * (-805983233)) * (-998616065) : -1)) + ",") + (var1.field1331 != null ? (var1.field1331.id * (-805983233)) * (-998616065) : -1)) + ",") + var1.serverPacketLength) + ",") + (class19.localPlayer.pathX[0] + ApproximateRouteStrategy.baseX)) + ",") + (class19.localPlayer.pathY[0] + class250.baseY)) + ",";

				for (var22 = 0; (var22 < var1.serverPacketLength) && (var22 < 50); ++var22) {
					var21 = (var21 + var3.array[var22]) + ",";
				}

				class301.RunException_sendStackTrace(var21, var49);
				GameObject.logOut();
			}

			return true;
		}
	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-6")

	@Export("menu")
	final void menu() {
		class21.incrementMenuEntries();
		if (FloorDecoration.dragInventoryWidget == null) {
			if (clickedWidget == null) {
				int var2;
				int var4;
				int var5;
				label281 : {
					int var1 = MouseHandler.MouseHandler_lastButton;
					int var3;
					int var8;
					int var14;
					if (isMenuOpen) {
						int var18;
						if ((var1 != 1) && (UserComparator5.mouseCam || (var1 != 4))) {
							var2 = MouseHandler.MouseHandler_x;
							var3 = MouseHandler.MouseHandler_y;
							if ((((var2 < (class307.menuX - 10)) || (var2 > ((class307.menuX + class11.menuWidth) + 10))) || (var3 < (ArchiveDiskActionHandler.menuY - 10))) || (var3 > ((ArchiveDiskActionHandler.menuY + UrlRequester.menuHeight) + 10))) {
								isMenuOpen = false;
								var4 = class307.menuX;
								var5 = ArchiveDiskActionHandler.menuY;
								var14 = class11.menuWidth;
								var18 = UrlRequester.menuHeight;

								for (var8 = 0; var8 < rootWidgetCount; ++var8) {
									if (((((rootWidgetXs[var8] + rootWidgetWidths[var8]) > var4) && (rootWidgetXs[var8] < (var14 + var4))) && ((rootWidgetHeights[var8] + rootWidgetYs[var8]) > var5)) && (rootWidgetYs[var8] < (var18 + var5))) {
										field564[var8] = true;
									}
								}
							}
						}

						if ((var1 == 1) || ((!UserComparator5.mouseCam) && (var1 == 4))) {
							var2 = class307.menuX;
							var3 = ArchiveDiskActionHandler.menuY;
							var4 = class11.menuWidth;
							var5 = MouseHandler.MouseHandler_lastPressedX;
							var14 = MouseHandler.MouseHandler_lastPressedY;
							var18 = -1;

							int var9;
							for (var8 = 0; var8 < menuOptionsCount; ++var8) {
								var9 = (var3 + (((menuOptionsCount - 1) - var8) * 15)) + 31;
								if ((((var5 > var2) && (var5 < (var4 + var2))) && (var14 > (var9 - 13))) && (var14 < (var9 + 3))) {
									var18 = var8;
								}
							}

							int var10;
							int var11;
							if ((var18 != (-1)) && (var18 >= 0)) {
								var8 = menuArguments1[var18];
								var9 = menuArguments2[var18];
								var10 = menuOpcodes[var18];
								var11 = menuIdentifiers[var18];
								String var12 = menuActions[var18];
								String var13 = menuTargets[var18];
								SoundCache.menuAction(var8, var9, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
							}

							isMenuOpen = false;
							var8 = class307.menuX;
							var9 = ArchiveDiskActionHandler.menuY;
							var10 = class11.menuWidth;
							var11 = UrlRequester.menuHeight;

							for (int var17 = 0; var17 < rootWidgetCount; ++var17) {
								if (((((rootWidgetXs[var17] + rootWidgetWidths[var17]) > var8) && (rootWidgetXs[var17] < (var8 + var10))) && ((rootWidgetYs[var17] + rootWidgetHeights[var17]) > var9)) && (rootWidgetYs[var17] < (var11 + var9))) {
									field564[var17] = true;
								}
							}
						}
					} else {
						var2 = class168.method3324();
						if (((var1 == 1) || ((!UserComparator5.mouseCam) && (var1 == 4))) && (var2 >= 0)) {
							var3 = menuOpcodes[var2];
							if ((((((((((((var3 == 39) || (var3 == 40)) || (var3 == 41)) || (var3 == 42)) || (var3 == 43)) || (var3 == 33)) || (var3 == 34)) || (var3 == 35)) || (var3 == 36)) || (var3 == 37)) || (var3 == 38)) || (var3 == 1005)) {
								var4 = menuArguments1[var2];
								var5 = menuArguments2[var2];
								Widget var6 = HorizontalAlignment.getWidget(var5);
								var8 = WorldMapSection2.getWidgetFlags(var6);
								boolean var7 = ((var8 >> 28) & 1) != 0;
								if (var7) {
									break label281;
								}

								Object var10000 = null;
								if (class239.method4998(WorldMapSection2.getWidgetFlags(var6))) {
									break label281;
								}
							}
						}

						if (((var1 == 1) || ((!UserComparator5.mouseCam) && (var1 == 4))) && this.shouldLeftClickOpenMenu()) {
							var1 = 2;
						}

						if ((((var1 == 1) || ((!UserComparator5.mouseCam) && (var1 == 4))) && (menuOptionsCount > 0)) && (var2 >= 0)) {
							var3 = menuArguments1[var2];
							var4 = menuArguments2[var2];
							var5 = menuOpcodes[var2];
							var14 = menuIdentifiers[var2];
							String var15 = menuActions[var2];
							String var16 = menuTargets[var2];
							SoundCache.menuAction(var3, var4, var5, var14, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}

						if ((var1 == 2) && (menuOptionsCount > 0)) {
							this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
						}
					}

					return;
				}

				if ((((FloorDecoration.dragInventoryWidget != null) && (!field601)) && (menuOptionsCount > 0)) && (!this.shouldLeftClickOpenMenu())) {
					UserComparator8.method2576(draggedWidgetX, draggedWidgetY);
				}

				field601 = false;
				itemDragDuration = 0;
				if (FloorDecoration.dragInventoryWidget != null) {
					class290.invalidateWidget(FloorDecoration.dragInventoryWidget);
				}

				FloorDecoration.dragInventoryWidget = HorizontalAlignment.getWidget(var5);
				dragItemSlotSource = var4;
				draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
				draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
				if (var2 >= 0) {
					PacketWriter.tempMenuAction = new MenuAction();
					PacketWriter.tempMenuAction.param0 = menuArguments1[var2];
					PacketWriter.tempMenuAction.param1 = menuArguments2[var2];
					PacketWriter.tempMenuAction.opcode = menuOpcodes[var2];
					PacketWriter.tempMenuAction.identifier = menuIdentifiers[var2];
					PacketWriter.tempMenuAction.action = menuActions[var2];
				}

				class290.invalidateWidget(FloorDecoration.dragInventoryWidget);
			}
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1137783125")

	@Export("shouldLeftClickOpenMenu")
	final boolean shouldLeftClickOpenMenu() {
		int var1 = class168.method3324();
		return (((leftClickOpensMenu == 1) && (menuOptionsCount > 2)) || ArchiveLoader.method2071(var1)) && (!menuShiftClick[var1]);
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"1232643092")

	@Export("openMenu")
	final void openMenu(int var1, int var2) {
		int var3 = FloorOverlayDefinition.fontBold12.stringWidth("Choose Option");

		int var4;
		int var5;
		for (var4 = 0; var4 < menuOptionsCount; ++var4) {
			var5 = FloorOverlayDefinition.fontBold12.stringWidth(ReflectionCheck.method637(var4));
			if (var5 > var3) {
				var3 = var5;
			}
		}

		var3 += 8;
		var4 = (menuOptionsCount * 15) + 22;
		var5 = var1 - (var3 / 2);
		if ((var3 + var5) > class4.canvasWidth) {
			var5 = class4.canvasWidth - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		int var6 = var2;
		if ((var4 + var2) > class309.canvasHeight) {
			var6 = class309.canvasHeight - var4;
		}

		if (var6 < 0) {
			var6 = 0;
		}

		class307.menuX = var5;
		ArchiveDiskActionHandler.menuY = var6;
		class11.menuWidth = var3;
		UrlRequester.menuHeight = (menuOptionsCount * 15) + 22;
		var1 -= viewportOffsetX;
		var2 -= viewportOffsetY;
		FriendSystem.scene.menuOpen(class160.Client_plane, var1, var2, false);
		isMenuOpen = true;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(descriptor = 
	"(ZB)V", garbageValue = 
	"112")

	@Export("resizeRoot")
	final void resizeRoot(boolean var1) {
		DynamicObject.method1982(rootInterface, class4.canvasWidth, class309.canvasHeight, var1);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;I)V", garbageValue = 
	"-1069729591")

	@Export("alignWidget")
	void alignWidget(Widget var1) {
		Widget var2 = (var1.parentId == (-1)) ? null : HorizontalAlignment.getWidget(var1.parentId);
		int var3;
		int var4;
		if (var2 == null) {
			var3 = class4.canvasWidth;
			var4 = class309.canvasHeight;
		} else {
			var3 = var2.width;
			var4 = var2.height;
		}

		class116.alignWidgetSize(var1, var3, var4, false);
		class162.alignWidgetPosition(var1, var3, var4);
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"976912886")

	final void method1159() {
		class290.invalidateWidget(clickedWidget);
		++class136.widgetDragDuration;
		if (field671 && field668) {
			int var1 = MouseHandler.MouseHandler_x;
			int var2 = MouseHandler.MouseHandler_y;
			var1 -= widgetClickX;
			var2 -= widgetClickY;
			if (var1 < field669) {
				var1 = field669;
			}

			if ((var1 + Client.clickedWidget.width) > (field669 + Client.clickedWidgetParent.width)) {
				var1 = (field669 + Client.clickedWidgetParent.width) - Client.clickedWidget.width;
			}

			if (var2 < field628) {
				var2 = field628;
			}

			if ((var2 + Client.clickedWidget.height) > (field628 + Client.clickedWidgetParent.height)) {
				var2 = (field628 + Client.clickedWidgetParent.height) - Client.clickedWidget.height;
			}

			int var3 = var1 - field596;
			int var4 = var2 - field673;
			int var5 = Client.clickedWidget.dragZoneSize;
			if ((class136.widgetDragDuration > Client.clickedWidget.dragThreshold) && ((((var3 > var5) || (var3 < (-var5))) || (var4 > var5)) || (var4 < (-var5)))) {
				isDraggingWidget = true;
			}

			int var6 = (var1 - field669) + Client.clickedWidgetParent.scrollX;
			int var7 = (var2 - field628) + Client.clickedWidgetParent.scrollY;
			ScriptEvent var8;
			if ((Client.clickedWidget.onDrag != null) && isDraggingWidget) {
				var8 = new ScriptEvent();
				var8.widget = clickedWidget;
				var8.mouseX = var6;
				var8.mouseY = var7;
				var8.args = Client.clickedWidget.onDrag;
				class1.runScriptEvent(var8);
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
						class1.runScriptEvent(var8);
					}

					if ((draggedOnWidget != null) && (UserComparator3.method2601(clickedWidget) != null)) {
						PacketBufferNode var9 = ItemContainer.getPacketBufferNode(ClientPacket.field2919, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeIntME(Client.clickedWidget.id);
						var9.packetBuffer.writeShort(Client.clickedWidget.childIndex);
						var9.packetBuffer.writeShortAdd(Client.clickedWidget.itemId);
						var9.packetBuffer.writeShort(Client.draggedOnWidget.childIndex);
						var9.packetBuffer.writeShortAddLE(Client.draggedOnWidget.itemId);
						var9.packetBuffer.writeIntME(Client.draggedOnWidget.id);
						packetWriter.addNode(var9);
					}
				} else if (this.shouldLeftClickOpenMenu()) {
					this.openMenu(widgetClickX + field596, widgetClickY + field673);
				} else if (menuOptionsCount > 0) {
					UserComparator8.method2576(field596 + widgetClickX, widgetClickY + field673);
				}

				clickedWidget = null;
			}

		} else 
		if (class136.widgetDragDuration > 1) {
			clickedWidget = null;
		}


	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(descriptor = 
	"(B)Lqy;", garbageValue = 
	"4")

	@Export("username")
	public Username username() {
		return class19.localPlayer != null ? class19.localPlayer.username : null;
	}

	@ObfuscatedSignature(descriptor = 
	"(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V")

	public void setOtlTokenRequester(OtlTokenRequester var1) {
		if (var1 != null) {
			this.field544 = var1;
			class150.method3089(10);
		}
	}

	public boolean isOnLoginScreen() {
		return gameState == 10;
	}

	public long getAccountHash() {
		return this.field658;
	}

	public final void init() {
		try {
			if (this.checkHost()) {
				int var4;
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
								var4 = Integer.parseInt(var2);
								Language var20;
								if ((var4 >= 0) && (var4 < Language.Language_valuesOrdered.length)) {
									var20 = Language.Language_valuesOrdered[var4];
								} else {
									var20 = null;
								}

								FriendSystem.clientLanguage = var20;
								break;
							case 7 :
								var4 = Integer.parseInt(var2);
								GameBuild[] var5 = new GameBuild[]{ GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP, GameBuild.LIVE };
								GameBuild[] var6 = var5;
								int var7 = 0;

								GameBuild var3;
								while (true) {
									if (var7 >= var6.length) {
										var3 = null;
										break;
									}

									GameBuild var8 = var6[var7];
									if (var4 == var8.buildId) {
										var3 = var8;
										break;
									}

									++var7;
								} 

								field509 = var3;
								break;
							case 8 :
								if (var2.equalsIgnoreCase("true")) {
								}
								break;
							case 9 :
								class429.field4593 = var2;
								break;
							case 10 :
								Login.field917 = ((StudioGame) (ChatChannel.findEnumerated(ArchiveLoader.method2076(), Integer.parseInt(var2))));
								if (StudioGame.oldscape == Login.field917) {
									class83.loginType = LoginType.oldscape;
								} else {
									class83.loginType = LoginType.field4559;
								}
								break;
							case 11 :
								class124.field1518 = var2;
								break;
							case 12 :
								worldId = Integer.parseInt(var2);
								break;
							case 14 :
								class7.field27 = Integer.parseInt(var2);
								break;
							case 15 :
								gameBuild = Integer.parseInt(var2);
								break;
							case 17 :
								class152.field1686 = var2;
								break;
							case 21 :
								field484 = Integer.parseInt(var2);
								break;
							case 22 :
								field753 = Integer.parseInt(var2) != 0;}

					}
				}

				class299.method5767();
				GrandExchangeOfferOwnWorldComparator.worldHost = this.getCodeBase().getHost();
				String var9 = Client.field509.name;
				byte var10 = 0;

				try {
					JagexCache.idxCount = 21;
					SecureRandomFuture.cacheGamebuild = var10;

					try {
						ReflectionCheck.operatingSystemName = System.getProperty("os.name");
					} catch (Exception var17) {
						ReflectionCheck.operatingSystemName = "Unknown";
					}

					Buffer.formattedOperatingSystemName = ReflectionCheck.operatingSystemName.toLowerCase();

					try {
						class230.userHomeDirectory = System.getProperty("user.home");
						if (class230.userHomeDirectory != null) {
							class230.userHomeDirectory = class230.userHomeDirectory + "/";
						}
					} catch (Exception var16) {
					}

					try {
						if (Buffer.formattedOperatingSystemName.startsWith("win")) {
							if (class230.userHomeDirectory == null) {
								class230.userHomeDirectory = System.getenv("USERPROFILE");
							}
						} else if (class230.userHomeDirectory == null) {
							class230.userHomeDirectory = System.getenv("HOME");
						}

						if (class230.userHomeDirectory != null) {
							class230.userHomeDirectory = class230.userHomeDirectory + "/";
						}
					} catch (Exception var15) {
					}

					if (class230.userHomeDirectory == null) {
						class230.userHomeDirectory = "~/";
					}

					PendingSpawn.cacheParentPaths = new String[]{ "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class230.userHomeDirectory, "/tmp/", "" };
					WorldMapSection1.cacheSubPaths = new String[]{ ".jagex_cache_" + SecureRandomFuture.cacheGamebuild, ".file_store_" + SecureRandomFuture.cacheGamebuild };

					label148 : for (
					int var11 = 0; var11 < 4; ++var11) {
						VertexNormal.cacheDir = class29.method431("oldschool", var9, var11);
						if (!VertexNormal.cacheDir.exists()) {
							VertexNormal.cacheDir.mkdirs();
						}

						File[] var12 = VertexNormal.cacheDir.listFiles();
						if (var12 == null) {
							break;
						}

						File[] var22 = var12;
						int var13 = 0;

						while (true) {
							if (var13 >= var22.length) {
								break label148;
							}

							File var14 = var22[var13];
							if (!SecureRandomCallable.method2069(var14, false)) {
								break;
							}

							++var13;
						} 
					}

					File var21 = VertexNormal.cacheDir;
					class17.FileSystem_cacheDir = var21;
					if (!class17.FileSystem_cacheDir.exists()) {
						throw new RuntimeException("");
					}

					FileSystem.FileSystem_hasPermissions = true;
					ClanChannel.method3068();
					JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(Varcs.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
					JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(Varcs.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
					class194.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount];

					for (var4 = 0; var4 < JagexCache.idxCount; ++var4) {
						class194.JagexCache_idxFiles[var4] = new BufferedFile(new AccessFile(Varcs.getFile("main_file_cache.idx" + var4), "rw", 1048576L), 6000, 0);
					}
				} catch (Exception var18) {
					class301.RunException_sendStackTrace(((String) (null)), var18);
				}

				UserComparator10.client = this;
				RunException.clientType = clientType;
				if (field486 == (-1)) {
					field486 = 0;
				}

				AbstractWorldMapData.field2796 = System.getenv("JX_ACCESS_TOKEN");
				System.getenv("JX_REFRESH_TOKEN");
				this.startThread(765, 503, 204);
			}
		} catch (RuntimeException var19) {
			throw KitDefinition.newRunException(var19, "client.init(" + ')');
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"10")

	static final boolean method1198() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;II)V", garbageValue = 
	"1767968807")

	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3422 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3406 == null) {
				var0.field3406 = new int[var0.field3422.length];
			}

			var0.field3406[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZB)I", garbageValue = 
	"16")

	static int method1606(int var0, Script var1, boolean var2) {
		Widget var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var3.modelTransparency) ? 1 : 0;
			return 1;
		} else if ((var0 != 2615) && (var0 != 2616)) {
			return 2;
		} else {
			++class295.Interpreter_intStackSize;
			return 1;
		}
	}
}