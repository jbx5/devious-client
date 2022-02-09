import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import net.runelite.mapping.*;
import net.runelite.rs.ScriptOpcodes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.*;
import java.util.concurrent.Future;
@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed , OAuthApi {
    @ObfuscatedName("rv")
    @ObfuscatedSignature(descriptor = "[Ley;")
    @Export("currentClanSettings")
    static ClanSettings[] currentClanSettings;

    @ObfuscatedName("tr")
    @ObfuscatedGetter(intValue = 1817797031)
    @Export("viewportOffsetX")
    static int viewportOffsetX;

    @ObfuscatedName("qk")
    @ObfuscatedGetter(longValue = 930669406456533829L)
    static long field764;

    @ObfuscatedName("tu")
    @ObfuscatedGetter(intValue = -1819525643)
    @Export("viewportOffsetY")
    static int viewportOffsetY;

    @ObfuscatedName("qe")
    @Export("isResizable")
    static boolean isResizable;

    @ObfuscatedName("ul")
    @ObfuscatedGetter(intValue = 854071175)
    public static int field777;

    @ObfuscatedName("rb")
    static boolean field744;

    @ObfuscatedName("qj")
    @Export("rootWidgetWidths")
    static int[] rootWidgetWidths;

    @ObfuscatedName("qf")
    @ObfuscatedGetter(intValue = -464505279)
    @Export("gameDrawingMode")
    static int gameDrawingMode;

    @ObfuscatedName("ql")
    @Export("rootWidgetYs")
    static int[] rootWidgetYs;

    @ObfuscatedName("qx")
    @Export("rootWidgetHeights")
    static int[] rootWidgetHeights;

    @ObfuscatedName("rp")
    @ObfuscatedGetter(intValue = 374236091)
    @Export("destinationX")
    static int destinationX;

    @ObfuscatedName("rf")
    @ObfuscatedGetter(intValue = -678558309)
    @Export("destinationY")
    static int destinationY;

    @ObfuscatedName("uk")
    @ObfuscatedSignature(descriptor = "Lbg;")
    static final ApproximateRouteStrategy field781;

    @ObfuscatedName("sd")
    @Export("isCameraLocked")
    static boolean isCameraLocked;

    @ObfuscatedName("ry")
    @ObfuscatedGetter(intValue = -1833483057)
    @Export("currentTrackGroupId")
    static int currentTrackGroupId;

    @ObfuscatedName("tl")
    static boolean[] field753;

    @ObfuscatedName("vn")
    static int[] field782;

    @ObfuscatedName("vt")
    static int[] field783;

    @ObfuscatedName("tz")
    @ObfuscatedGetter(intValue = 1826736357)
    static int field585;

    @ObfuscatedName("ta")
    @ObfuscatedSignature(descriptor = "Ljo;")
    @Export("playerAppearance")
    static PlayerComposition playerAppearance;

    @ObfuscatedName("tn")
    @ObfuscatedGetter(intValue = -854420355)
    static int field773;

    @ObfuscatedName("si")
    @ObfuscatedGetter(intValue = 1994544265)
    @Export("soundEffectCount")
    static int soundEffectCount;

    @ObfuscatedName("se")
    @Export("soundEffectIds")
    static int[] soundEffectIds;

    @ObfuscatedName("sf")
    @Export("queuedSoundEffectLoops")
    static int[] queuedSoundEffectLoops;

    @ObfuscatedName("rc")
    @ObfuscatedGetter(intValue = 1465004509)
    @Export("minimapState")
    static int minimapState;

    @ObfuscatedName("sn")
    @Export("queuedSoundEffectDelays")
    static int[] queuedSoundEffectDelays;

    @ObfuscatedName("uw")
    @Export("archiveLoaders")
    static ArrayList archiveLoaders;

    @ObfuscatedName("sy")
    @ObfuscatedSignature(descriptor = "[Lac;")
    @Export("soundEffects")
    static SoundEffect[] soundEffects;

    @ObfuscatedName("uo")
    @ObfuscatedGetter(intValue = -885821757)
    @Export("archiveLoadersDone")
    static int archiveLoadersDone;

    @ObfuscatedName("sb")
    @Export("soundLocations")
    static int[] soundLocations;

    @ObfuscatedName("rq")
    @ObfuscatedGetter(intValue = -368225351)
    static int field735;

    @ObfuscatedName("ri")
    @ObfuscatedGetter(longValue = 6843126589043801957L)
    static long field685;

    @ObfuscatedName("ud")
    @ObfuscatedSignature(descriptor = "Lof;")
    @Export("platformInfoProvider")
    static PlatformInfoProvider platformInfoProvider;

    @ObfuscatedName("qs")
    @Export("crossWorldMessageIds")
    static long[] crossWorldMessageIds;

    @ObfuscatedName("tp")
    static short field775;

    @ObfuscatedName("rr")
    @ObfuscatedGetter(intValue = -622667913)
    @Export("mapIconCount")
    static int mapIconCount;

    @ObfuscatedName("tb")
    static short field759;

    @ObfuscatedName("te")
    static short field656;

    @ObfuscatedName("tk")
    static short field514;

    @ObfuscatedName("rw")
    @Export("mapIconXs")
    static int[] mapIconXs;

    @ObfuscatedName("tt")
    static short field763;

    @ObfuscatedName("rj")
    @ObfuscatedSignature(descriptor = "[Leg;")
    @Export("currentClanChannels")
    static ClanChannel[] currentClanChannels;

    @ObfuscatedName("tx")
    @ObfuscatedGetter(intValue = -777516881)
    @Export("viewportZoom")
    static int viewportZoom;

    @ObfuscatedName("tm")
    static short field762;

    @ObfuscatedName("qw")
    @ObfuscatedGetter(intValue = 1740108721)
    @Export("crossWorldMessageIdsIndex")
    static int crossWorldMessageIdsIndex;

    @ObfuscatedName("tw")
    @ObfuscatedGetter(intValue = -843685037)
    @Export("viewportWidth")
    static int viewportWidth;

    @ObfuscatedName("ra")
    @Export("mapIconYs")
    static int[] mapIconYs;

    @ObfuscatedName("qd")
    @ObfuscatedGetter(intValue = 833757541)
    @Export("publicChatMode")
    static int publicChatMode;

    @ObfuscatedName("qm")
    @ObfuscatedGetter(intValue = 1922614903)
    @Export("tradeChatMode")
    static int tradeChatMode;

    @ObfuscatedName("rn")
    @ObfuscatedSignature(descriptor = "[Lpt;")
    @Export("mapIcons")
    static SpritePixels[] mapIcons;

    @ObfuscatedName("tg")
    @ObfuscatedGetter(intValue = 967859563)
    @Export("viewportHeight")
    static int viewportHeight;

    @ObfuscatedName("qh")
    @ObfuscatedGetter(intValue = -76972905)
    static int field729;

    @ObfuscatedName("rd")
    static int[] field731;

    @ObfuscatedName("uj")
    @ObfuscatedGetter(intValue = -1624970861)
    static int field698;

    @ObfuscatedName("qv")
    static int[] field684;

    @ObfuscatedName("sa")
    static boolean field755;

    @ObfuscatedName("ti")
    static int[] field733;

    @ObfuscatedName("th")
    @Export("zoomWidth")
    static short zoomWidth;

    @ObfuscatedName("tj")
    @Export("zoomHeight")
    static short zoomHeight;

    @ObfuscatedName("ue")
    @ObfuscatedSignature(descriptor = "[Llm;")
    @Export("grandExchangeOffers")
    static GrandExchangeOffer[] grandExchangeOffers;

    @ObfuscatedName("tc")
    static int[] field754;

    @ObfuscatedName("ts")
    static int[] field757;

    @ObfuscatedName("tq")
    static int[] field500;

    @ObfuscatedName("qg")
    static String field726;

    @ObfuscatedName("ui")
    @ObfuscatedSignature(descriptor = "Lbm;")
    @Export("GrandExchangeEvents_worldComparator")
    static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;

    @ObfuscatedName("qu")
    static int[] field723;

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "[Lgi;")
    @Export("collisionMaps")
    static CollisionMap[] collisionMaps;

    @ObfuscatedName("am")
    static boolean field592;

    @ObfuscatedName("be")
    @ObfuscatedGetter(intValue = 1297363365)
    @Export("worldId")
    public static int worldId;

    @ObfuscatedName("bt")
    @ObfuscatedGetter(intValue = 116273241)
    @Export("worldProperties")
    static int worldProperties;

    @ObfuscatedName("bz")
    @ObfuscatedGetter(intValue = -1405594741)
    @Export("gameBuild")
    static int gameBuild;

    @ObfuscatedName("bg")
    @Export("isMembersWorld")
    public static boolean isMembersWorld;

    @ObfuscatedName("bm")
    @Export("isLowDetail")
    static boolean isLowDetail;

    @ObfuscatedName("bb")
    @ObfuscatedGetter(intValue = -1418032453)
    static int field699;

    @ObfuscatedName("br")
    @ObfuscatedGetter(intValue = -841132883)
    @Export("clientType")
    static int clientType;

    @ObfuscatedName("bh")
    @ObfuscatedGetter(intValue = -94908921)
    static int field502;

    @ObfuscatedName("bf")
    @Export("onMobile")
    static boolean onMobile;

    @ObfuscatedName("cf")
    @ObfuscatedGetter(intValue = -155932355)
    @Export("gameState")
    static int gameState;

    @ObfuscatedName("ce")
    @Export("isLoading")
    static boolean isLoading;

    @ObfuscatedName("cv")
    @ObfuscatedGetter(intValue = 968083277)
    @Export("cycle")
    static int cycle;

    @ObfuscatedName("ds")
    @ObfuscatedGetter(longValue = -8632979679249400797L)
    @Export("mouseLastLastPressedTimeMillis")
    static long mouseLastLastPressedTimeMillis;

    @ObfuscatedName("df")
    @ObfuscatedGetter(intValue = -1600597029)
    static int field508;

    @ObfuscatedName("db")
    @ObfuscatedGetter(intValue = -918082281)
    static int field509;

    @ObfuscatedName("dr")
    @ObfuscatedGetter(longValue = 639557550265501447L)
    static long field651;

    @ObfuscatedName("dq")
    @Export("hadFocus")
    static boolean hadFocus;

    @ObfuscatedName("dj")
    @Export("displayFps")
    static boolean displayFps;

    @ObfuscatedName("dz")
    @ObfuscatedGetter(intValue = 241519551)
    @Export("rebootTimer")
    static int rebootTimer;

    @ObfuscatedName("du")
    @ObfuscatedGetter(intValue = 2123774043)
    @Export("hintArrowType")
    static int hintArrowType;

    @ObfuscatedName("dm")
    @ObfuscatedGetter(intValue = -120672351)
    @Export("hintArrowNpcIndex")
    static int hintArrowNpcIndex;

    @ObfuscatedName("di")
    @ObfuscatedGetter(intValue = 1828156911)
    @Export("hintArrowPlayerIndex")
    static int hintArrowPlayerIndex;

    @ObfuscatedName("dt")
    @ObfuscatedGetter(intValue = -1918050169)
    @Export("hintArrowX")
    static int hintArrowX;

    @ObfuscatedName("dl")
    @ObfuscatedGetter(intValue = -488629447)
    @Export("hintArrowY")
    static int hintArrowY;

    @ObfuscatedName("do")
    @ObfuscatedGetter(intValue = 970200859)
    @Export("hintArrowHeight")
    static int hintArrowHeight;

    @ObfuscatedName("dv")
    @ObfuscatedGetter(intValue = -1796978717)
    @Export("hintArrowSubX")
    static int hintArrowSubX;

    @ObfuscatedName("dh")
    @ObfuscatedGetter(intValue = 915460843)
    @Export("hintArrowSubY")
    static int hintArrowSubY;

    @ObfuscatedName("dp")
    @ObfuscatedSignature(descriptor = "Lco;")
    @Export("playerAttackOption")
    static AttackOption playerAttackOption;

    @ObfuscatedName("dd")
    @ObfuscatedSignature(descriptor = "Lco;")
    @Export("npcAttackOption")
    static AttackOption npcAttackOption;

    @ObfuscatedName("dn")
    @ObfuscatedGetter(intValue = 1539894515)
    @Export("titleLoadingStage")
    static int titleLoadingStage;

    @ObfuscatedName("dc")
    @ObfuscatedGetter(intValue = -420899701)
    @Export("js5ConnectState")
    static int js5ConnectState;

    @ObfuscatedName("dk")
    @ObfuscatedGetter(intValue = 1569793661)
    static int field526;

    @ObfuscatedName("ea")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive1")
    static Archive archive1;

    @ObfuscatedName("ee")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive5")
    static Archive archive5;

    @ObfuscatedName("ec")
    @ObfuscatedGetter(intValue = -204121931)
    @Export("js5Errors")
    static int js5Errors;

    @ObfuscatedName("el")
    @ObfuscatedGetter(intValue = 1828856517)
    @Export("loginState")
    static int loginState;

    @ObfuscatedName("ei")
    @ObfuscatedGetter(intValue = -333045029)
    static int field530;

    @ObfuscatedName("ek")
    @ObfuscatedGetter(intValue = -1243459083)
    static int field531;

    @ObfuscatedName("fc")
    @ObfuscatedGetter(intValue = -2144694239)
    static int field532;

    @ObfuscatedName("fi")
    @ObfuscatedSignature(descriptor = "Ldd;")
    static class122 field533;

    @ObfuscatedName("fw")
    @ObfuscatedSignature(descriptor = "Lpn;")
    static class424 field534;

    @ObfuscatedName("fe")
    @Export("Login_isUsernameRemembered")
    static boolean Login_isUsernameRemembered;

    @ObfuscatedName("fy")
    @ObfuscatedSignature(descriptor = "Lbv;")
    @Export("secureRandomFuture")
    static SecureRandomFuture secureRandomFuture;

    @ObfuscatedName("gi")
    @Export("randomDatData")
    static byte[] randomDatData;

    @ObfuscatedName("gr")
    @ObfuscatedSignature(descriptor = "[Lcy;")
    @Export("npcs")
    static NPC[] npcs;

    @ObfuscatedName("gq")
    @ObfuscatedGetter(intValue = 1262640691)
    @Export("npcCount")
    static int npcCount;

    @ObfuscatedName("go")
    @Export("npcIndices")
    static int[] npcIndices;

    @ObfuscatedName("gy")
    @ObfuscatedGetter(intValue = -727189653)
    static int field548;

    @ObfuscatedName("ge")
    static int[] field549;

    @ObfuscatedName("ga")
    @ObfuscatedSignature(descriptor = "Lcx;")
    @Export("packetWriter")
    public static final PacketWriter packetWriter;

    @ObfuscatedName("gn")
    @ObfuscatedGetter(intValue = -442747785)
    @Export("logoutTimer")
    static int logoutTimer;

    @ObfuscatedName("gp")
    @Export("hadNetworkError")
    static boolean hadNetworkError;

    @ObfuscatedName("gk")
    @Export("useBufferedSocket")
    static boolean useBufferedSocket;

    @ObfuscatedName("gu")
    static boolean field554;

    @ObfuscatedName("gg")
    @ObfuscatedSignature(descriptor = "Lms;")
    @Export("timer")
    static Timer timer;

    @ObfuscatedName("gj")
    @Export("fontsMap")
    static HashMap fontsMap;

    @ObfuscatedName("he")
    @ObfuscatedGetter(intValue = -489222059)
    static int field498;

    @ObfuscatedName("hh")
    @ObfuscatedGetter(intValue = -1285944621)
    static int field558;

    @ObfuscatedName("hs")
    @ObfuscatedGetter(intValue = -616383345)
    static int field559;

    @ObfuscatedName("hv")
    @ObfuscatedGetter(intValue = 1091761069)
    static int field560;

    @ObfuscatedName("hm")
    @ObfuscatedGetter(intValue = -1427189465)
    static int field621;

    @ObfuscatedName("hf")
    @Export("isInInstance")
    static boolean isInInstance;

    @ObfuscatedName("hx")
    @Export("instanceChunkTemplates")
    static int[][][] instanceChunkTemplates;

    @ObfuscatedName("hd")
    static final int[] field565;

    @ObfuscatedName("hp")
    @ObfuscatedGetter(intValue = 1925962995)
    static int field566;

    @ObfuscatedName("in")
    @ObfuscatedGetter(intValue = 87567199)
    static int field720;

    @ObfuscatedName("im")
    @ObfuscatedGetter(intValue = 440485109)
    static int field568;

    @ObfuscatedName("it")
    @Export("selectedItemName")
    static String selectedItemName;

    @ObfuscatedName("iy")
    @ObfuscatedGetter(intValue = -1217300637)
    static int field569;

    @ObfuscatedName("ir")
    @ObfuscatedGetter(intValue = -1668657361)
    static int field562;

    @ObfuscatedName("ic")
    static boolean field571;

    @ObfuscatedName("iv")
    @ObfuscatedGetter(intValue = 1215152143)
    @Export("alternativeScrollbarWidth")
    static int alternativeScrollbarWidth;

    @ObfuscatedName("is")
    @ObfuscatedGetter(intValue = 1295752691)
    @Export("camAngleX")
    static int camAngleX;

    @ObfuscatedName("ia")
    @ObfuscatedGetter(intValue = -380334693)
    @Export("camAngleY")
    static int camAngleY;

    @ObfuscatedName("jh")
    @ObfuscatedGetter(intValue = -1909356475)
    @Export("camAngleDY")
    static int camAngleDY;

    @ObfuscatedName("jr")
    @ObfuscatedGetter(intValue = 13790011)
    @Export("camAngleDX")
    static int camAngleDX;

    @ObfuscatedName("jg")
    @ObfuscatedGetter(intValue = -252023461)
    @Export("mouseCamClickedX")
    static int mouseCamClickedX;

    @ObfuscatedName("ji")
    @ObfuscatedGetter(intValue = -2123914003)
    @Export("mouseCamClickedY")
    static int mouseCamClickedY;

    @ObfuscatedName("ju")
    @ObfuscatedGetter(intValue = -757227727)
    @Export("oculusOrbState")
    static int oculusOrbState;

    @ObfuscatedName("jk")
    @ObfuscatedGetter(intValue = -1261284505)
    @Export("camFollowHeight")
    static int camFollowHeight;

    @ObfuscatedName("jn")
    @ObfuscatedGetter(intValue = 2101579937)
    static int field581;

    @ObfuscatedName("jp")
    @ObfuscatedGetter(intValue = 998186131)
    static int field497;

    @ObfuscatedName("jm")
    @ObfuscatedGetter(intValue = -1725171981)
    static int field583;

    @ObfuscatedName("je")
    @ObfuscatedGetter(intValue = 1261221539)
    @Export("oculusOrbNormalSpeed")
    static int oculusOrbNormalSpeed;

    @ObfuscatedName("js")
    @ObfuscatedGetter(intValue = 714395705)
    @Export("oculusOrbSlowedSpeed")
    static int oculusOrbSlowedSpeed;

    @ObfuscatedName("jc")
    @ObfuscatedGetter(intValue = 1156105773)
    static int field513;

    @ObfuscatedName("jx")
    static boolean field587;

    @ObfuscatedName("ja")
    @ObfuscatedGetter(intValue = 1535638355)
    static int field677;

    @ObfuscatedName("jw")
    static boolean field589;

    @ObfuscatedName("jq")
    @ObfuscatedGetter(intValue = -1930198833)
    static int field590;

    @ObfuscatedName("jv")
    @ObfuscatedGetter(intValue = 1967330903)
    @Export("overheadTextCount")
    static int overheadTextCount;

    @ObfuscatedName("jd")
    @ObfuscatedGetter(intValue = 1420113129)
    @Export("overheadTextLimit")
    static int overheadTextLimit;

    @ObfuscatedName("jt")
    @Export("overheadTextXs")
    static int[] overheadTextXs;

    @ObfuscatedName("jo")
    @Export("overheadTextYs")
    static int[] overheadTextYs;

    @ObfuscatedName("jy")
    @Export("overheadTextAscents")
    static int[] overheadTextAscents;

    @ObfuscatedName("jz")
    @Export("overheadTextXOffsets")
    static int[] overheadTextXOffsets;

    @ObfuscatedName("kp")
    @Export("overheadTextColors")
    static int[] overheadTextColors;

    @ObfuscatedName("kh")
    @Export("overheadTextEffects")
    static int[] overheadTextEffects;

    @ObfuscatedName("kj")
    @Export("overheadTextCyclesRemaining")
    static int[] overheadTextCyclesRemaining;

    @ObfuscatedName("ka")
    @Export("overheadText")
    static String[] overheadText;

    @ObfuscatedName("kc")
    @Export("tileLastDrawnActor")
    static int[][] tileLastDrawnActor;

    @ObfuscatedName("kb")
    @ObfuscatedGetter(intValue = 1639362925)
    @Export("viewportDrawCount")
    static int viewportDrawCount;

    @ObfuscatedName("ku")
    @ObfuscatedGetter(intValue = -226589049)
    @Export("viewportTempX")
    static int viewportTempX;

    @ObfuscatedName("kn")
    @ObfuscatedGetter(intValue = -1735370989)
    @Export("viewportTempY")
    static int viewportTempY;

    @ObfuscatedName("kf")
    @ObfuscatedGetter(intValue = 1696879705)
    @Export("mouseCrossX")
    static int mouseCrossX;

    @ObfuscatedName("kr")
    @ObfuscatedGetter(intValue = -760976631)
    @Export("mouseCrossY")
    static int mouseCrossY;

    @ObfuscatedName("kw")
    @ObfuscatedGetter(intValue = -296603501)
    @Export("mouseCrossState")
    static int mouseCrossState;

    @ObfuscatedName("kv")
    @ObfuscatedGetter(intValue = -429254197)
    @Export("mouseCrossColor")
    static int mouseCrossColor;

    @ObfuscatedName("kx")
    @Export("showMouseCross")
    static boolean showMouseCross;

    @ObfuscatedName("ko")
    @ObfuscatedGetter(intValue = 871537309)
    static int field610;

    @ObfuscatedName("km")
    @ObfuscatedGetter(intValue = -129097821)
    static int field611;

    @ObfuscatedName("kz")
    @ObfuscatedGetter(intValue = 321052771)
    @Export("dragItemSlotSource")
    static int dragItemSlotSource;

    @ObfuscatedName("ki")
    @ObfuscatedGetter(intValue = -1915361223)
    @Export("draggedWidgetX")
    static int draggedWidgetX;

    @ObfuscatedName("kq")
    @ObfuscatedGetter(intValue = 579354749)
    @Export("draggedWidgetY")
    static int draggedWidgetY;

    @ObfuscatedName("kk")
    @ObfuscatedGetter(intValue = 509889901)
    @Export("dragItemSlotDestination")
    static int dragItemSlotDestination;

    @ObfuscatedName("ke")
    static boolean field616;

    @ObfuscatedName("kl")
    @ObfuscatedGetter(intValue = -400807797)
    @Export("itemDragDuration")
    static int itemDragDuration;

    @ObfuscatedName("kt")
    @ObfuscatedGetter(intValue = 1857190161)
    static int field658;

    @ObfuscatedName("la")
    @Export("showLoadingMessages")
    static boolean showLoadingMessages;

    @ObfuscatedName("ld")
    @ObfuscatedSignature(descriptor = "[Lcw;")
    @Export("players")
    static Player[] players;

    @ObfuscatedName("lq")
    @ObfuscatedGetter(intValue = 2008160479)
    @Export("localPlayerIndex")
    static int localPlayerIndex;

    @ObfuscatedName("lk")
    @ObfuscatedGetter(intValue = -384934989)
    static int field772;

    @ObfuscatedName("lr")
    @Export("renderSelf")
    static boolean renderSelf;

    @ObfuscatedName("lo")
    @ObfuscatedGetter(intValue = -1699040655)
    @Export("drawPlayerNames")
    static int drawPlayerNames;

    @ObfuscatedName("ls")
    @ObfuscatedGetter(intValue = 487107011)
    static int field625;

    @ObfuscatedName("lc")
    static int[] field683;

    @ObfuscatedName("lp")
    @Export("playerMenuOpcodes")
    static final int[] playerMenuOpcodes;

    @ObfuscatedName("ln")
    @Export("playerMenuActions")
    static String[] playerMenuActions;

    @ObfuscatedName("li")
    @Export("playerOptionsPriorities")
    static boolean[] playerOptionsPriorities;

    @ObfuscatedName("lv")
    @Export("defaultRotations")
    static int[] defaultRotations;

    @ObfuscatedName("ly")
    @ObfuscatedGetter(intValue = 835790275)
    @Export("combatTargetPlayerIndex")
    static int combatTargetPlayerIndex;

    @ObfuscatedName("lw")
    @ObfuscatedSignature(descriptor = "[[[Lls;")
    @Export("groundItems")
    static NodeDeque[][][] groundItems;

    @ObfuscatedName("lj")
    @ObfuscatedSignature(descriptor = "Lls;")
    @Export("pendingSpawns")
    static NodeDeque pendingSpawns;

    @ObfuscatedName("lb")
    @ObfuscatedSignature(descriptor = "Lls;")
    @Export("projectiles")
    static NodeDeque projectiles;

    @ObfuscatedName("lz")
    @ObfuscatedSignature(descriptor = "Lls;")
    @Export("graphicsObjects")
    static NodeDeque graphicsObjects;

    @ObfuscatedName("lh")
    @Export("currentLevels")
    static int[] currentLevels;

    @ObfuscatedName("mh")
    @Export("levels")
    static int[] levels;

    @ObfuscatedName("mt")
    @Export("experience")
    static int[] experience;

    @ObfuscatedName("mq")
    @ObfuscatedGetter(intValue = -1408069719)
    @Export("leftClickOpensMenu")
    static int leftClickOpensMenu;

    @ObfuscatedName("mf")
    @Export("isMenuOpen")
    static boolean isMenuOpen;

    @ObfuscatedName("mn")
    @ObfuscatedGetter(intValue = -1947866801)
    @Export("menuOptionsCount")
    static int menuOptionsCount;

    @ObfuscatedName("mb")
    @Export("menuArguments1")
    static int[] menuArguments1;

    @ObfuscatedName("mi")
    @Export("menuArguments2")
    static int[] menuArguments2;

    @ObfuscatedName("mp")
    @Export("menuOpcodes")
    static int[] menuOpcodes;

    @ObfuscatedName("ma")
    @Export("menuIdentifiers")
    static int[] menuIdentifiers;

    @ObfuscatedName("mu")
    @Export("menuActions")
    static String[] menuActions;

    @ObfuscatedName("mm")
    @Export("menuTargets")
    static String[] menuTargets;

    @ObfuscatedName("my")
    @Export("menuShiftClick")
    static boolean[] menuShiftClick;

    @ObfuscatedName("mz")
    @Export("followerOpsLowPriority")
    static boolean followerOpsLowPriority;

    @ObfuscatedName("mo")
    @Export("shiftClickDrop")
    static boolean shiftClickDrop;

    @ObfuscatedName("md")
    @Export("tapToDrop")
    static boolean tapToDrop;

    @ObfuscatedName("mc")
    @Export("showMouseOverText")
    static boolean showMouseOverText;

    @ObfuscatedName("mg")
    @ObfuscatedGetter(intValue = -1089656559)
    @Export("viewportX")
    static int viewportX;

    @ObfuscatedName("mr")
    @ObfuscatedGetter(intValue = -540706391)
    @Export("viewportY")
    static int viewportY;

    @ObfuscatedName("nc")
    @ObfuscatedGetter(intValue = 578775537)
    static int field506;

    @ObfuscatedName("nm")
    @ObfuscatedGetter(intValue = 159931315)
    static int field734;

    @ObfuscatedName("na")
    @ObfuscatedGetter(intValue = -1913085343)
    @Export("isItemSelected")
    static int isItemSelected;

    @ObfuscatedName("nn")
    @Export("isSpellSelected")
    static boolean isSpellSelected;

    @ObfuscatedName("ni")
    @ObfuscatedGetter(intValue = 592729301)
    @Export("selectedSpellChildIndex")
    static int selectedSpellChildIndex;

    @ObfuscatedName("ng")
    @ObfuscatedGetter(intValue = 54529773)
    static int field536;

    @ObfuscatedName("nz")
    @Export("selectedSpellActionName")
    static String selectedSpellActionName;

    @ObfuscatedName("nh")
    @Export("selectedSpellName")
    static String selectedSpellName;

    @ObfuscatedName("ny")
    @ObfuscatedGetter(intValue = -265984395)
    @Export("rootInterface")
    static int rootInterface;

    @ObfuscatedName("nt")
    @ObfuscatedSignature(descriptor = "Loj;")
    @Export("interfaceParents")
    static NodeHashTable interfaceParents;

    @ObfuscatedName("nv")
    @ObfuscatedGetter(intValue = -1285490963)
    static int field666;

    @ObfuscatedName("ns")
    @ObfuscatedGetter(intValue = 823232333)
    static int field667;

    @ObfuscatedName("nx")
    @ObfuscatedGetter(intValue = 954728993)
    @Export("chatEffects")
    static int chatEffects;

    @ObfuscatedName("nf")
    @ObfuscatedGetter(intValue = -585848403)
    static int field669;

    @ObfuscatedName("nd")
    @ObfuscatedSignature(descriptor = "Ljz;")
    @Export("meslayerContinueWidget")
    static Widget meslayerContinueWidget;

    @ObfuscatedName("no")
    @ObfuscatedGetter(intValue = -455693023)
    @Export("runEnergy")
    static int runEnergy;

    @ObfuscatedName("nl")
    @ObfuscatedGetter(intValue = -1477842933)
    @Export("weight")
    static int weight;

    @ObfuscatedName("ne")
    @ObfuscatedGetter(intValue = -1827490843)
    @Export("staffModLevel")
    static int staffModLevel;

    @ObfuscatedName("od")
    @ObfuscatedGetter(intValue = -1736670385)
    @Export("followerIndex")
    static int followerIndex;

    @ObfuscatedName("oe")
    @Export("playerMod")
    static boolean playerMod;

    @ObfuscatedName("oh")
    @ObfuscatedSignature(descriptor = "Ljz;")
    @Export("viewportWidget")
    static Widget viewportWidget;

    @ObfuscatedName("om")
    @ObfuscatedSignature(descriptor = "Ljz;")
    @Export("clickedWidget")
    static Widget clickedWidget;

    @ObfuscatedName("of")
    @ObfuscatedSignature(descriptor = "Ljz;")
    @Export("clickedWidgetParent")
    static Widget clickedWidgetParent;

    @ObfuscatedName("og")
    @ObfuscatedGetter(intValue = -637833021)
    @Export("widgetClickX")
    static int widgetClickX;

    @ObfuscatedName("or")
    @ObfuscatedGetter(intValue = 385949319)
    @Export("widgetClickY")
    static int widgetClickY;

    @ObfuscatedName("ov")
    @ObfuscatedSignature(descriptor = "Ljz;")
    @Export("draggedOnWidget")
    static Widget draggedOnWidget;

    @ObfuscatedName("ox")
    static boolean field682;

    @ObfuscatedName("oc")
    @ObfuscatedGetter(intValue = 387137487)
    static int field606;

    @ObfuscatedName("on")
    @ObfuscatedGetter(intValue = 111424275)
    static int field561;

    @ObfuscatedName("oj")
    static boolean field648;

    @ObfuscatedName("oq")
    @ObfuscatedGetter(intValue = 1928898267)
    static int field686;

    @ObfuscatedName("ou")
    @ObfuscatedGetter(intValue = 464909207)
    static int field687;

    @ObfuscatedName("ok")
    @Export("isDraggingWidget")
    static boolean isDraggingWidget;

    @ObfuscatedName("op")
    @ObfuscatedGetter(intValue = 381969455)
    @Export("cycleCntr")
    static int cycleCntr;

    @ObfuscatedName("ow")
    @Export("changedVarps")
    static int[] changedVarps;

    @ObfuscatedName("oy")
    @ObfuscatedGetter(intValue = 1944785463)
    @Export("changedVarpCount")
    static int changedVarpCount;

    @ObfuscatedName("oi")
    @Export("changedItemContainers")
    static int[] changedItemContainers;

    @ObfuscatedName("oz")
    @ObfuscatedGetter(intValue = -1824937689)
    static int field494;

    @ObfuscatedName("pm")
    @Export("changedSkills")
    static int[] changedSkills;

    @ObfuscatedName("pp")
    @ObfuscatedGetter(intValue = -68824309)
    @Export("changedSkillsCount")
    static int changedSkillsCount;

    @ObfuscatedName("pe")
    static int[] field696;

    @ObfuscatedName("pc")
    @ObfuscatedGetter(intValue = -656100991)
    static int field697;

    @ObfuscatedName("pi")
    @ObfuscatedGetter(intValue = 1308042703)
    @Export("chatCycle")
    static int chatCycle;

    @ObfuscatedName("pl")
    @ObfuscatedGetter(intValue = -1072732201)
    static int field600;

    @ObfuscatedName("ph")
    @ObfuscatedGetter(intValue = 885192419)
    static int field664;

    @ObfuscatedName("pz")
    @ObfuscatedGetter(intValue = -1816932351)
    static int field701;

    @ObfuscatedName("pn")
    @ObfuscatedGetter(intValue = -1841758695)
    static int field503;

    @ObfuscatedName("pu")
    @ObfuscatedGetter(intValue = 748340115)
    static int field703;

    @ObfuscatedName("pk")
    @ObfuscatedGetter(intValue = 176429417)
    static int field652;

    @ObfuscatedName("pr")
    @ObfuscatedGetter(intValue = 70901175)
    static int field705;

    @ObfuscatedName("pt")
    @ObfuscatedGetter(intValue = -1339939483)
    @Export("mouseWheelRotation")
    static int mouseWheelRotation;

    @ObfuscatedName("pa")
    @ObfuscatedSignature(descriptor = "Lls;")
    @Export("scriptEvents")
    static NodeDeque scriptEvents;

    @ObfuscatedName("pj")
    @ObfuscatedSignature(descriptor = "Lls;")
    static NodeDeque field708;

    @ObfuscatedName("pv")
    @ObfuscatedSignature(descriptor = "Lls;")
    static NodeDeque field709;

    @ObfuscatedName("py")
    @ObfuscatedSignature(descriptor = "Loj;")
    @Export("widgetFlags")
    static NodeHashTable widgetFlags;

    @ObfuscatedName("pf")
    @ObfuscatedGetter(intValue = 1891130109)
    @Export("rootWidgetCount")
    static int rootWidgetCount;

    @ObfuscatedName("px")
    @ObfuscatedGetter(intValue = 1671801663)
    static int field712;

    @ObfuscatedName("pb")
    static boolean[] field713;

    @ObfuscatedName("qo")
    static boolean[] field714;

    @ObfuscatedName("qq")
    static boolean[] field715;

    @ObfuscatedName("qy")
    @Export("rootWidgetXs")
    static int[] rootWidgetXs;

    @ObfuscatedName("fq")
    String field535;

    @ObfuscatedName("fh")
    @ObfuscatedSignature(descriptor = "Lx;")
    class14 field700;

    @ObfuscatedName("fj")
    @ObfuscatedSignature(descriptor = "Lj;")
    class19 field537;

    @ObfuscatedName("fo")
    OtlTokenRequester field510;

    @ObfuscatedName("fd")
    Future field539;

    @ObfuscatedName("fm")
    @ObfuscatedSignature(descriptor = "Lpi;")
    Buffer field542;

    @ObfuscatedName("gm")
    @ObfuscatedSignature(descriptor = "Lw;")
    class7 field528;

    static {
        field592 = true;
        worldId = 1;
        worldProperties = 0;
        gameBuild = 0;
        isMembersWorld = false;
        isLowDetail = false;
        field699 = -1;
        clientType = -1;
        field502 = -1;
        onMobile = false;
        gameState = 0;
        isLoading = true;
        cycle = 0;
        mouseLastLastPressedTimeMillis = -1L;
        field508 = -1;
        field509 = -1;
        field651 = -1L;
        hadFocus = true;
        displayFps = false;
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
        field526 = 0;
        js5Errors = 0;
        loginState = 0;
        field530 = 0;
        field531 = 0;
        field532 = 0;
        field533 = class122.field1495;
        field534 = class424.field4569;
        Login_isUsernameRemembered = false;
        secureRandomFuture = new SecureRandomFuture();
        randomDatData = null;
        npcs = new NPC[32768];
        npcCount = 0;
        npcIndices = new int[32768];
        field548 = 0;
        field549 = new int[250];
        packetWriter = new PacketWriter();
        logoutTimer = 0;
        hadNetworkError = false;
        useBufferedSocket = true;
        field554 = false;
        timer = new Timer();
        fontsMap = new HashMap();
        field498 = 0;
        field558 = 1;
        field559 = 0;
        field560 = 1;
        field621 = 0;
        collisionMaps = new CollisionMap[4];
        isInInstance = false;
        instanceChunkTemplates = new int[4][13][13];
        field565 = new int[]{ 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field566 = 0;
        field720 = 2301979;
        field568 = 5063219;
        field569 = 3353893;
        field562 = 7759444;
        field571 = false;
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
        field497 = 0;
        field583 = 0;
        oculusOrbNormalSpeed = 12;
        oculusOrbSlowedSpeed = 6;
        field513 = 0;
        field587 = false;
        field677 = 0;
        field589 = false;
        field590 = 0;
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
        field616 = false;
        itemDragDuration = 0;
        field658 = 0;
        showLoadingMessages = true;
        players = new Player[2048];
        localPlayerIndex = -1;
        field772 = 0;
        renderSelf = true;
        drawPlayerNames = 0;
        field625 = 0;
        field683 = new int[1000];
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
        field506 = 0;
        field734 = 50;
        isItemSelected = 0;
        selectedItemName = null;
        isSpellSelected = false;
        selectedSpellChildIndex = -1;
        field536 = -1;
        selectedSpellActionName = null;
        selectedSpellName = null;
        rootInterface = -1;
        interfaceParents = new NodeHashTable(8);
        field666 = 0;
        field667 = -1;
        chatEffects = 0;
        field669 = 0;
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
        field682 = false;
        field606 = -1;
        field561 = -1;
        field648 = false;
        field686 = -1;
        field687 = -1;
        isDraggingWidget = false;
        cycleCntr = 1;
        changedVarps = new int[32];
        changedVarpCount = 0;
        changedItemContainers = new int[32];
        field494 = 0;
        changedSkills = new int[32];
        changedSkillsCount = 0;
        field696 = new int[32];
        field697 = 0;
        chatCycle = 0;
        field600 = 0;
        field664 = 0;
        field701 = 0;
        field503 = 0;
        field703 = 0;
        field652 = 0;
        field705 = 0;
        mouseWheelRotation = 0;
        scriptEvents = new NodeDeque();
        field708 = new NodeDeque();
        field709 = new NodeDeque();
        widgetFlags = new NodeHashTable(512);
        rootWidgetCount = 0;
        field712 = -2;
        field713 = new boolean[100];
        field714 = new boolean[100];
        field715 = new boolean[100];
        rootWidgetXs = new int[100];
        rootWidgetYs = new int[100];
        rootWidgetWidths = new int[100];
        rootWidgetHeights = new int[100];
        gameDrawingMode = 0;
        field764 = 0L;
        isResizable = true;
        field723 = new int[]{ 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        publicChatMode = 0;
        tradeChatMode = 0;
        field726 = "";
        crossWorldMessageIds = new long[100];
        crossWorldMessageIdsIndex = 0;
        field729 = 0;
        field684 = new int[128];
        field731 = new int[128];
        field685 = -1L;
        currentClanSettings = new ClanSettings[2];
        currentClanChannels = new ClanChannel[2];
        field735 = -1;
        mapIconCount = 0;
        mapIconXs = new int[1000];
        mapIconYs = new int[1000];
        mapIcons = new SpritePixels[1000];
        destinationX = 0;
        destinationY = 0;
        minimapState = 0;
        currentTrackGroupId = -1;
        field744 = false;
        soundEffectCount = 0;
        soundEffectIds = new int[50];
        queuedSoundEffectLoops = new int[50];
        queuedSoundEffectDelays = new int[50];
        soundLocations = new int[50];
        soundEffects = new SoundEffect[50];
        isCameraLocked = false;
        field755 = false;
        field753 = new boolean[5];
        field754 = new int[5];
        field733 = new int[5];
        field500 = new int[5];
        field757 = new int[5];
        field775 = 256;
        field759 = 205;
        zoomHeight = 256;
        zoomWidth = 320;
        field762 = 1;
        field763 = 32767;
        field656 = 1;
        field514 = 32767;
        viewportOffsetX = 0;
        viewportOffsetY = 0;
        viewportWidth = 0;
        viewportHeight = 0;
        viewportZoom = 0;
        playerAppearance = new PlayerComposition();
        field585 = -1;
        field773 = -1;
        platformInfoProvider = new DesktopPlatformInfoProvider();
        grandExchangeOffers = new GrandExchangeOffer[8];
        GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
        field777 = -1;
        archiveLoaders = new ArrayList(10);
        archiveLoadersDone = 0;
        field698 = 0;
        field781 = new ApproximateRouteStrategy();
        field782 = new int[50];
        field783 = new int[50];
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1486103800")
    @Export("resizeGame")
    protected final void resizeGame() {
        field764 = DirectByteArrayCopier.getServerTime() + 500L;
        this.resizeJS();
        if (rootInterface != (-1)) {
            this.resizeRoot(true);
        }
    }

    @ObfuscatedName("b")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1919454515")
    @Export("setUp")
    protected final void setUp() {
        int[] var1 = new int[]{ 20, 260, 10000 };
        int[] var2 = new int[]{ 1000, 100, 500 };
        if ((var1 != null) && (var2 != null)) {
            ByteArrayPool.ByteArrayPool_alternativeSizes = var1;
            ArchiveDiskActionHandler.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
            class113.ByteArrayPool_arrays = new byte[var1.length][][];
            for (int var3 = 0; var3 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var3) {
                class113.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
                ByteArrayPool.field4083.add(var1[var3]);
            }
            Collections.sort(ByteArrayPool.field4083);
        } else {
            ByteArrayPool.ByteArrayPool_alternativeSizes = null;
            ArchiveDiskActionHandler.ByteArrayPool_altSizeArrayCounts = null;
            class113.ByteArrayPool_arrays = null;
            NetCache.method5677();
        }
        class346.worldPort = (gameBuild == 0) ? 43594 : worldId + 40000;
        class297.js5Port = (gameBuild == 0) ? 443 : worldId + 50000;
        class274.currentPort = class346.worldPort;
        PlayerComposition.field3236 = class284.field3250;
        class1.field8 = class284.field3249;
        class21.field120 = class284.field3248;
        class7.field40 = class284.field3246;
        class6.urlRequester = new UrlRequester();
        this.setUpKeyboard();
        this.method438();
        Widget.mouseWheel = this.mouseWheel();
        class16.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
        class424.clientPreferences = Interpreter.method1877();
        this.setUpClipboard();
        ChatChannel.method2003(this, ModelData0.field2547);
        if (gameBuild != 0) {
            displayFps = true;
        }
        WorldMapLabelSize.setWindowedMode(class424.clientPreferences.windowMode);
        ClanSettings.friendSystem = new FriendSystem(VarcInt.loginType);
        this.field700 = new class14("tokenRequest", 1, 1);
    }

    @ObfuscatedName("z")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "512730998")
    @Export("doCycle")
    protected final void doCycle() {
        ++cycle;
        this.doCycleJs5();
        WorldMapAreaData.method4853();
        NetSocket.method3105();
        class122.playPcmPlayers();
        synchronized(KeyHandler.KeyHandler_instance) {
            ++KeyHandler.KeyHandler_idleCycles;
            KeyHandler.field140 = KeyHandler.field144;
            KeyHandler.field139 = 0;
            KeyHandler.field141 = 0;
            Arrays.fill(KeyHandler.field131, false);
            Arrays.fill(KeyHandler.field138, false);
            if (KeyHandler.field148 < 0) {
                Arrays.fill(KeyHandler.KeyHandler_pressedKeys, false);
                KeyHandler.field148 = KeyHandler.field145;
            } else {
                while (KeyHandler.field145 != KeyHandler.field148) {
                    int var2 = KeyHandler.field133[KeyHandler.field145];
                    KeyHandler.field145 = (KeyHandler.field145 + 1) & 127;
                    if (var2 < 0) {
                        var2 = ~var2;
                        if (KeyHandler.KeyHandler_pressedKeys[var2]) {
                            KeyHandler.KeyHandler_pressedKeys[var2] = false;
                            KeyHandler.field138[var2] = true;
                            KeyHandler.field125[KeyHandler.field141] = var2;
                            ++KeyHandler.field141;
                        }
                    } else {
                        if ((!KeyHandler.KeyHandler_pressedKeys[var2]) && (KeyHandler.field139 < (KeyHandler.field135.length - 1))) {
                            KeyHandler.field131[var2] = true;
                            KeyHandler.field135[(++KeyHandler.field139) - 1] = var2;
                        }
                        KeyHandler.KeyHandler_pressedKeys[var2] = true;
                    }
                } 
            }
            if (KeyHandler.field139 > 0) {
                KeyHandler.KeyHandler_idleCycles = 0;
            }
            KeyHandler.field144 = KeyHandler.field146;
        }
        ScriptFrame.method1075();
        if (Widget.mouseWheel != null) {
            int var4 = Widget.mouseWheel.useRotation();
            mouseWheelRotation = var4;
        }
        if (gameState == 0) {
            Decimator.load();
            GrandExchangeOfferOwnWorldComparator.method1121();
        } else if (gameState == 5) {
            UserComparator7.method2465(this, Players.fontPlain12);
            Decimator.load();
            GrandExchangeOfferOwnWorldComparator.method1121();
        } else if ((gameState != 10) && (gameState != 11)) {
            if (gameState == 20) {
                UserComparator7.method2465(this, Players.fontPlain12);
                this.doCycleLoggedOut();
            } else if (gameState == 50) {
                UserComparator7.method2465(this, Players.fontPlain12);
                this.doCycleLoggedOut();
            } else if (gameState == 25) {
                MouseHandler.method615();
            }
        } else {
            UserComparator7.method2465(this, Players.fontPlain12);
        }
        if (gameState == 30) {
            this.doCycleLoggedIn();
        } else if ((gameState == 40) || (gameState == 45)) {
            this.doCycleLoggedOut();
        }
    }

    @ObfuscatedName("ap")
    @ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "1874168283")
    @Export("draw")
    protected final void draw(boolean var1) {
        boolean var2;
        label170 : {
            try {
                if (class265.musicPlayerStatus == 2) {
                    if (class265.musicTrack == null) {
                        class265.musicTrack = MusicTrack.readTrack(class265.musicTrackArchive, class265.musicTrackGroupId, class140.musicTrackFileId);
                        if (class265.musicTrack == null) {
                            var2 = false;
                            break label170;
                        }
                    }
                    if (FileSystem.soundCache == null) {
                        FileSystem.soundCache = new SoundCache(UserComparator8.soundEffectsArchive, class265.musicSamplesArchive);
                    }
                    if (class265.midiPcmStream.loadMusicTrack(class265.musicTrack, class265.musicPatchesArchive, FileSystem.soundCache, 22050)) {
                        class265.midiPcmStream.clearAll();
                        class265.midiPcmStream.setPcmStreamVolume(class167.musicTrackVolume);
                        class265.midiPcmStream.setMusicTrack(class265.musicTrack, MusicPatch.musicTrackBoolean);
                        class265.musicPlayerStatus = 0;
                        class265.musicTrack = null;
                        FileSystem.soundCache = null;
                        class265.musicTrackArchive = null;
                        var2 = true;
                        break label170;
                    }
                }
            } catch (Exception var6) {
                var6.printStackTrace();
                class265.midiPcmStream.clear();
                class265.musicPlayerStatus = 0;
                class265.musicTrack = null;
                FileSystem.soundCache = null;
                class265.musicTrackArchive = null;
            }
            var2 = false;
        }
        if ((var2 && field744) && (PacketBufferNode.pcmPlayer0 != null)) {
            PacketBufferNode.pcmPlayer0.tryDiscard();
        }
        if (((((gameState == 10) || (gameState == 20)) || (gameState == 30)) && (0L != field764)) && (DirectByteArrayCopier.getServerTime() > field764)) {
            WorldMapLabelSize.setWindowedMode(class339.getWindowedMode());
        }
        int var4;
        if (var1) {
            for (var4 = 0; var4 < 100; ++var4) {
                field713[var4] = true;
            }
        }
        if (gameState == 0) {
            this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
        } else if (gameState == 5) {
            ObjectSound.drawTitle(class408.fontBold12, class1.fontPlain11, Players.fontPlain12);
        } else if ((gameState != 10) && (gameState != 11)) {
            if (gameState == 20) {
                ObjectSound.drawTitle(class408.fontBold12, class1.fontPlain11, Players.fontPlain12);
            } else if (gameState == 50) {
                ObjectSound.drawTitle(class408.fontBold12, class1.fontPlain11, Players.fontPlain12);
            } else if (gameState == 25) {
                if (field621 == 1) {
                    if (field498 > field558) {
                        field558 = field498;
                    }
                    var4 = ((field558 * 50) - (field498 * 50)) / field558;
                    Calendar.drawLoadingMessage(((("Loading - please wait." + ("<br>" + " (")) + var4) + "%") + ")", false);
                } else if (field621 == 2) {
                    if (field559 > field560) {
                        field560 = field559;
                    }
                    var4 = (((field560 * 50) - (field559 * 50)) / field560) + 50;
                    Calendar.drawLoadingMessage(((("Loading - please wait." + ("<br>" + " (")) + var4) + "%") + ")", false);
                } else {
                    Calendar.drawLoadingMessage("Loading - please wait.", false);
                }
            } else if (gameState == 30) {
                this.drawLoggedIn();
            } else if (gameState == 40) {
                Calendar.drawLoadingMessage("Connection lost" + ("<br>" + "Please wait - attempting to reestablish"), false);
            } else if (gameState == 45) {
                Calendar.drawLoadingMessage("Please wait...", false);
            }
        } else {
            ObjectSound.drawTitle(class408.fontBold12, class1.fontPlain11, Players.fontPlain12);
        }
        if ((((gameState == 30) && (gameDrawingMode == 0)) && (!var1)) && (!isResizable)) {
            for (var4 = 0; var4 < rootWidgetCount; ++var4) {
                if (field714[var4]) {
                    PcmPlayer.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
                    field714[var4] = false;
                }
            }
        } else if (gameState > 0) {
            PcmPlayer.rasterProvider.drawFull(0, 0);
            for (var4 = 0; var4 < rootWidgetCount; ++var4) {
                field714[var4] = false;
            }
        }
    }

    @ObfuscatedName("af")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-104")
    @Export("kill0")
    protected final void kill0() {
        if (JagexCache.varcs.hasUnwrittenChanges()) {
            JagexCache.varcs.write();
        }
        if (PacketWriter.mouseRecorder != null) {
            PacketWriter.mouseRecorder.isRunning = false;
        }
        PacketWriter.mouseRecorder = null;
        packetWriter.close();
        if (KeyHandler.KeyHandler_instance != null) {
            synchronized(KeyHandler.KeyHandler_instance) {
                KeyHandler.KeyHandler_instance = null;
            }
        }
        if (MouseHandler.MouseHandler_instance != null) {
            synchronized(MouseHandler.MouseHandler_instance) {
                MouseHandler.MouseHandler_instance = null;
            }
        }
        Widget.mouseWheel = null;
        if (PacketBufferNode.pcmPlayer0 != null) {
            PacketBufferNode.pcmPlayer0.shutdown();
        }
        if (MouseHandler.pcmPlayer1 != null) {
            MouseHandler.pcmPlayer1.shutdown();
        }
        if (NetCache.NetCache_socket != null) {
            NetCache.NetCache_socket.close();
        }
        class259.method4999();
        if (class6.urlRequester != null) {
            class6.urlRequester.close();
            class6.urlRequester = null;
        }
        try {
            JagexCache.JagexCache_dat2File.close();
            for (int var4 = 0; var4 < JagexCache.idxCount; ++var4) {
                VerticalAlignment.JagexCache_idxFiles[var4].close();
            }
            JagexCache.JagexCache_idx255File.close();
            JagexCache.JagexCache_randomDat.close();
        } catch (Exception var7) {
        }
        this.field700.method169();
    }

    @ObfuscatedName("ay")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1773309183")
    protected final void vmethod1124() {
    }

    @ObfuscatedName("eo")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-86390836")
    boolean method1305() {
        return (LoginScreenAnimation.field1200 != null) && (!LoginScreenAnimation.field1200.trim().isEmpty());
    }

    @ObfuscatedName("ef")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-647319922")
    boolean method1219() {
        return this.field510 != null;
    }

    @ObfuscatedName("ec")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1874688058")
    void method1226(String var1) throws MalformedURLException, IOException {
        URL var2 = new URL(FileSystem.field1707 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        OtlTokenRequester var3 = this.field510;
        if (var3 != null) {
            this.field539 = var3.request(var2);
        } else {
            class10 var4 = new class10(var2, class9.field49);
            var4.method85("Authorization", "Bearer " + var1);
            this.field537 = this.field700.method174(var4);
        }
    }

    @ObfuscatedName("el")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1924196492")
    @Export("doCycleJs5")
    void doCycleJs5() {
        if (gameState != 1000) {
            long var2 = DirectByteArrayCopier.getServerTime();
            int var4 = ((int) (var2 - NetCache.field3911));
            NetCache.field3911 = var2;
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
                    label241 : {
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
                            if (class19.NetCache_currentResponse == null) {
                                var7 = 8;
                            } else if (NetCache.field3926 == 0) {
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
                                if (NetCache.field3929 != 0) {
                                    for (var9 = 0; var9 < var8; ++var9) {
                                        var10000 = NetCache.NetCache_responseHeaderBuffer.array;
                                        var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
                                        var10000[var10001] ^= NetCache.field3929;
                                    }
                                }
                                var25 = NetCache.NetCache_responseHeaderBuffer;
                                var25.offset += var8;
                                if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
                                    break;
                                }
                                if (class19.NetCache_currentResponse == null) {
                                    NetCache.NetCache_responseHeaderBuffer.offset = 0;
                                    var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
                                    var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
                                    int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
                                    var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
                                    long var13 = ((long) (var10 + (var9 << 16)));
                                    NetFileRequest var15 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.get(var13)));
                                    NetCache.field3922 = true;
                                    if (var15 == null) {
                                        var15 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.get(var13)));
                                        NetCache.field3922 = false;
                                    }
                                    if (var15 == null) {
                                        throw new IOException();
                                    }
                                    int var16 = (var11 == 0) ? 5 : 9;
                                    class19.NetCache_currentResponse = var15;
                                    NetCache.NetCache_responseArchiveBuffer = new Buffer((var12 + var16) + class19.NetCache_currentResponse.padding);
                                    NetCache.NetCache_responseArchiveBuffer.writeByte(var11);
                                    NetCache.NetCache_responseArchiveBuffer.writeInt(var12);
                                    NetCache.field3926 = 8;
                                    NetCache.NetCache_responseHeaderBuffer.offset = 0;
                                } else if (NetCache.field3926 == 0) {
                                    if (NetCache.NetCache_responseHeaderBuffer.array[0] == (-1)) {
                                        NetCache.field3926 = 1;
                                        NetCache.NetCache_responseHeaderBuffer.offset = 0;
                                    } else {
                                        class19.NetCache_currentResponse = null;
                                    }
                                }
                            } else {
                                var8 = NetCache.NetCache_responseArchiveBuffer.array.length - class19.NetCache_currentResponse.padding;
                                var9 = 512 - NetCache.field3926;
                                if (var9 > (var8 - NetCache.NetCache_responseArchiveBuffer.offset)) {
                                    var9 = var8 - NetCache.NetCache_responseArchiveBuffer.offset;
                                }
                                if (var9 > var18) {
                                    var9 = var18;
                                }
                                NetCache.NetCache_socket.read(NetCache.NetCache_responseArchiveBuffer.array, NetCache.NetCache_responseArchiveBuffer.offset, var9);
                                if (NetCache.field3929 != 0) {
                                    for (var10 = 0; var10 < var9; ++var10) {
                                        var10000 = NetCache.NetCache_responseArchiveBuffer.array;
                                        var10001 = var10 + NetCache.NetCache_responseArchiveBuffer.offset;
                                        var10000[var10001] ^= NetCache.field3929;
                                    }
                                }
                                var25 = NetCache.NetCache_responseArchiveBuffer;
                                var25.offset += var9;
                                NetCache.field3926 += var9;
                                if (var8 == NetCache.NetCache_responseArchiveBuffer.offset) {
                                    if (class19.NetCache_currentResponse.key == 16711935L) {
                                        class346.NetCache_reference = NetCache.NetCache_responseArchiveBuffer;
                                        for (var10 = 0; var10 < 256; ++var10) {
                                            Archive var19 = NetCache.NetCache_archives[var10];
                                            if (var19 != null) {
                                                class346.NetCache_reference.offset = (var10 * 8) + 5;
                                                var12 = class346.NetCache_reference.readInt();
                                                int var20 = class346.NetCache_reference.readInt();
                                                var19.loadIndex(var12, var20);
                                            }
                                        }
                                    } else {
                                        NetCache.NetCache_crc.reset();
                                        NetCache.NetCache_crc.update(NetCache.NetCache_responseArchiveBuffer.array, 0, var8);
                                        var10 = ((int) (NetCache.NetCache_crc.getValue()));
                                        if (var10 != class19.NetCache_currentResponse.crc) {
                                            try {
                                                NetCache.NetCache_socket.close();
                                            } catch (Exception var23) {
                                            }
                                            ++NetCache.NetCache_crcMismatches;
                                            NetCache.NetCache_socket = null;
                                            NetCache.field3929 = ((byte) ((int) ((Math.random() * 255.0) + 1.0)));
                                            var1 = false;
                                            break label241;
                                        }
                                        NetCache.NetCache_crcMismatches = 0;
                                        NetCache.NetCache_ioExceptions = 0;
                                        class19.NetCache_currentResponse.archive.write(((int) (class19.NetCache_currentResponse.key & 65535L)), NetCache.NetCache_responseArchiveBuffer.array, 16711680L == (class19.NetCache_currentResponse.key & 16711680L), NetCache.field3922);
                                    }
                                    class19.NetCache_currentResponse.remove();
                                    if (NetCache.field3922) {
                                        --NetCache.NetCache_pendingPriorityResponsesCount;
                                    } else {
                                        --NetCache.NetCache_pendingResponsesCount;
                                    }
                                    NetCache.field3926 = 0;
                                    class19.NetCache_currentResponse = null;
                                    NetCache.NetCache_responseArchiveBuffer = null;
                                } else {
                                    if (NetCache.field3926 != 512) {
                                        break;
                                    }
                                    NetCache.field3926 = 0;
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

    @ObfuscatedName("ei")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "372818485")
    @Export("doCycleJs5Connect")
    void doCycleJs5Connect() {
        if (NetCache.NetCache_crcMismatches >= 4) {
            this.error("js5crc");
            class111.updateGameState(1000);
        } else {
            if (NetCache.NetCache_ioExceptions >= 4) {
                if (gameState <= 5) {
                    this.error("js5io");
                    class111.updateGameState(1000);
                    return;
                }
                field526 = 3000;
                NetCache.NetCache_ioExceptions = 3;
            }
            if (((--field526) + 1) <= 0) {
                try {
                    if (js5ConnectState == 0) {
                        FontName.js5SocketTask = GameEngine.taskHandler.newSocketTask(HealthBar.worldHost, class274.currentPort);
                        ++js5ConnectState;
                    }
                    if (js5ConnectState == 1) {
                        if (FontName.js5SocketTask.status == 2) {
                            this.js5Error(-1);
                            return;
                        }
                        if (FontName.js5SocketTask.status == 1) {
                            ++js5ConnectState;
                        }
                    }
                    if (js5ConnectState == 2) {
                        if (useBufferedSocket) {
                            Socket var2 = ((Socket) (FontName.js5SocketTask.result));
                            BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
                            WorldMapCacheName.js5Socket = var1;
                        } else {
                            WorldMapCacheName.js5Socket = new NetSocket(((Socket) (FontName.js5SocketTask.result)), GameEngine.taskHandler, 5000);
                        }
                        Buffer var11 = new Buffer(5);
                        var11.writeByte(15);
                        var11.writeInt(203);
                        WorldMapCacheName.js5Socket.write(var11.array, 0, 5);
                        ++js5ConnectState;
                        UserComparator8.field1347 = DirectByteArrayCopier.getServerTime();
                    }
                    if (js5ConnectState == 3) {
                        if ((WorldMapCacheName.js5Socket.available() > 0) || ((!useBufferedSocket) && (gameState <= 5))) {
                            int var5 = WorldMapCacheName.js5Socket.readUnsignedByte();
                            if (var5 != 0) {
                                this.js5Error(var5);
                                return;
                            }
                            ++js5ConnectState;
                        } else if ((DirectByteArrayCopier.getServerTime() - UserComparator8.field1347) > 30000L) {
                            this.js5Error(-2);
                            return;
                        }
                    }
                    if (js5ConnectState == 4) {
                        AbstractSocket var12 = WorldMapCacheName.js5Socket;
                        boolean var6 = gameState > 20;
                        if (NetCache.NetCache_socket != null) {
                            try {
                                NetCache.NetCache_socket.close();
                            } catch (Exception var9) {
                            }
                            NetCache.NetCache_socket = null;
                        }
                        NetCache.NetCache_socket = var12;
                        UserComparator4.method2434(var6);
                        NetCache.NetCache_responseHeaderBuffer.offset = 0;
                        class19.NetCache_currentResponse = null;
                        NetCache.NetCache_responseArchiveBuffer = null;
                        NetCache.field3926 = 0;
                        while (true) {
                            NetFileRequest var3 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.first()));
                            if (var3 == null) {
                                while (true) {
                                    var3 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.first()));
                                    if (var3 == null) {
                                        if (NetCache.field3929 != 0) {
                                            try {
                                                Buffer var13 = new Buffer(4);
                                                var13.writeByte(4);
                                                var13.writeByte(NetCache.field3929);
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
                                        NetCache.field3911 = DirectByteArrayCopier.getServerTime();
                                        FontName.js5SocketTask = null;
                                        WorldMapCacheName.js5Socket = null;
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

    @ObfuscatedName("ek")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1065244976")
    @Export("js5Error")
    void js5Error(int var1) {
        FontName.js5SocketTask = null;
        WorldMapCacheName.js5Socket = null;
        js5ConnectState = 0;
        if (class346.worldPort == class274.currentPort) {
            class274.currentPort = class297.js5Port;
        } else {
            class274.currentPort = class346.worldPort;
        }
        ++js5Errors;
        if ((js5Errors >= 2) && ((var1 == 7) || (var1 == 9))) {
            if (gameState <= 5) {
                this.error("js5connect_full");
                class111.updateGameState(1000);
            } else {
                field526 = 3000;
            }
        } else if ((js5Errors >= 2) && (var1 == 6)) {
            this.error("js5connect_outofdate");
            class111.updateGameState(1000);
        } else if (js5Errors >= 4) {
            if (gameState <= 5) {
                this.error("js5connect");
                class111.updateGameState(1000);
            } else {
                field526 = 3000;
            }
        }
    }

    @ObfuscatedName("fu")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-476296379")
    @Export("doCycleLoggedOut")
    final void doCycleLoggedOut() {
        Object var1 = packetWriter.getSocket();
        PacketBuffer var2 = Client.packetWriter.packetBuffer;
        try {
            if (loginState == 0) {
                if ((class142.secureRandom == null) && (secureRandomFuture.isDone() || (field530 > 250))) {
                    class142.secureRandom = secureRandomFuture.get();
                    secureRandomFuture.shutdown();
                    secureRandomFuture = null;
                }
                if (class142.secureRandom != null) {
                    if (var1 != null) {
                        ((AbstractSocket) (var1)).close();
                        var1 = null;
                    }
                    NetFileRequest.socketTask = null;
                    hadNetworkError = false;
                    field530 = 0;
                    if (field534.method7628()) {
                        try {
                            this.method1226(LoginScreenAnimation.field1200);
                            WorldMapLabelSize.method4321(20);
                        } catch (Throwable var25) {
                            FloorDecoration.RunException_sendStackTrace(((String) (null)), var25);
                            class221.getLoginError(65);
                            return;
                        }
                    } else {
                        WorldMapLabelSize.method4321(1);
                    }
                }
            }
            if (loginState == 20) {
                if (this.field539 != null) {
                    if (!this.field539.isDone()) {
                        return;
                    }
                    if (this.field539.isCancelled()) {
                        class221.getLoginError(65);
                        this.field539 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var3 = ((OtlTokenResponse) (this.field539.get()));
                        if (!var3.isSuccess()) {
                            class221.getLoginError(65);
                            this.field539 = null;
                            return;
                        }
                        this.field535 = var3.getToken();
                        this.field539 = null;
                    } catch (Exception var24) {
                        FloorDecoration.RunException_sendStackTrace(((String) (null)), var24);
                        class221.getLoginError(65);
                        this.field539 = null;
                        return;
                    }
                } else {
                    if (this.field537 == null) {
                        class221.getLoginError(65);
                        return;
                    }
                    if (!this.field537.method283()) {
                        return;
                    }
                    if (this.field537.method273()) {
                        FloorDecoration.RunException_sendStackTrace(this.field537.method272(), ((Throwable) (null)));
                        class221.getLoginError(65);
                        this.field537 = null;
                        return;
                    }
                    class21 var27 = this.field537.method274();
                    if (var27.method294() != 200) {
                        FloorDecoration.RunException_sendStackTrace((("Response code: " + var27.method294()) + "Response body: ") + var27.method295(), ((Throwable) (null)));
                        class221.getLoginError(65);
                        this.field537 = null;
                        return;
                    }
                    this.field535 = var27.method295();
                    this.field537 = null;
                }
                field530 = 0;
                WorldMapLabelSize.method4321(1);
            }
            if (loginState == 1) {
                if (NetFileRequest.socketTask == null) {
                    NetFileRequest.socketTask = GameEngine.taskHandler.newSocketTask(HealthBar.worldHost, class274.currentPort);
                }
                if (NetFileRequest.socketTask.status == 2) {
                    throw new IOException();
                }
                if (NetFileRequest.socketTask.status == 1) {
                    if (useBufferedSocket) {
                        Socket var4 = ((Socket) (NetFileRequest.socketTask.result));
                        BufferedNetSocket var28 = new BufferedNetSocket(var4, 40000, 5000);
                        var1 = var28;
                    } else {
                        var1 = new NetSocket(((Socket) (NetFileRequest.socketTask.result)), GameEngine.taskHandler, 5000);
                    }
                    packetWriter.setSocket(((AbstractSocket) (var1)));
                    NetFileRequest.socketTask = null;
                    WorldMapLabelSize.method4321(2);
                }
            }
            PacketBufferNode var30;
            if (loginState == 2) {
                packetWriter.clearBuffer();
                if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
                    var30 = new PacketBufferNode();
                } else {
                    var30 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
                }
                var30.clientPacket = null;
                var30.clientPacketLength = 0;
                var30.packetBuffer = new PacketBuffer(5000);
                var30.packetBuffer.writeByte(LoginPacket.field3064.id);
                packetWriter.addNode(var30);
                packetWriter.flush();
                var2.offset = 0;
                WorldMapLabelSize.method4321(3);
            }
            boolean var13;
            int var14;
            if (loginState == 3) {
                if (PacketBufferNode.pcmPlayer0 != null) {
                    PacketBufferNode.pcmPlayer0.method710();
                }
                if (MouseHandler.pcmPlayer1 != null) {
                    MouseHandler.pcmPlayer1.method710();
                }
                var13 = true;
                if (useBufferedSocket && (!((AbstractSocket) (var1)).isAvailable(1))) {
                    var13 = false;
                }
                if (var13) {
                    var14 = ((AbstractSocket) (var1)).readUnsignedByte();
                    if (PacketBufferNode.pcmPlayer0 != null) {
                        PacketBufferNode.pcmPlayer0.method710();
                    }
                    if (MouseHandler.pcmPlayer1 != null) {
                        MouseHandler.pcmPlayer1.method710();
                    }
                    if (var14 != 0) {
                        class221.getLoginError(var14);
                        return;
                    }
                    var2.offset = 0;
                    WorldMapLabelSize.method4321(4);
                }
            }
            int var42;
            if (loginState == 4) {
                if (var2.offset < 8) {
                    var42 = ((AbstractSocket) (var1)).available();
                    if (var42 > (8 - var2.offset)) {
                        var42 = 8 - var2.offset;
                    }
                    if (var42 > 0) {
                        ((AbstractSocket) (var1)).read(var2.array, var2.offset, var42);
                        var2.offset += var42;
                    }
                }
                if (var2.offset == 8) {
                    var2.offset = 0;
                    Canvas.field159 = var2.readLong();
                    WorldMapLabelSize.method4321(5);
                }
            }
            int var7;
            int var9;
            int var16;
            if (loginState == 5) {
                Client.packetWriter.packetBuffer.offset = 0;
                packetWriter.clearBuffer();
                PacketBuffer var29 = new PacketBuffer(500);
                int[] var33 = new int[]{ class142.secureRandom.nextInt(), class142.secureRandom.nextInt(), class142.secureRandom.nextInt(), class142.secureRandom.nextInt() };
                var29.offset = 0;
                var29.writeByte(1);
                var29.writeInt(var33[0]);
                var29.writeInt(var33[1]);
                var29.writeInt(var33[2]);
                var29.writeInt(var33[3]);
                var29.writeLong(Canvas.field159);
                if (gameState == 40) {
                    var29.writeInt(class213.field2597[0]);
                    var29.writeInt(class213.field2597[1]);
                    var29.writeInt(class213.field2597[2]);
                    var29.writeInt(class213.field2597[3]);
                } else {
                    if (gameState == 50) {
                        var29.writeByte(class122.field1497.rsOrdinal());
                        var29.writeInt(Occluder.field2399);
                    } else {
                        var29.writeByte(field533.rsOrdinal());
                        switch (Client.field533.field1493) {
                            case 0 :
                                LinkedHashMap var6 = class424.clientPreferences.parameters;
                                String var8 = Login.Login_username;
                                var9 = var8.length();
                                int var10 = 0;
                                for (int var11 = 0; var11 < var9; ++var11) {
                                    var10 = ((var10 << 5) - var10) + var8.charAt(var11);
                                }
                                var29.writeInt(((Integer) (var6.get(var10))));
                                break;
                            case 1 :
                            case 3 :
                                var29.writeMedium(GameObject.field2588);
                                ++var29.offset;
                            case 2 :
                            default :
                                break;
                            case 4 :
                                var29.offset += 4;
                        }
                    }
                    if (field534.method7628()) {
                        var29.writeByte(class424.field4561.rsOrdinal());
                        var29.writeStringCp1252NullTerminated(this.field535);
                    } else {
                        var29.writeByte(class424.field4569.rsOrdinal());
                        var29.writeStringCp1252NullTerminated(Login.Login_password);
                    }
                }
                var29.encryptRsa(class67.field886, class67.field885);
                class213.field2597 = var33;
                PacketBufferNode var38;
                if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
                    var38 = new PacketBufferNode();
                } else {
                    var38 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
                }
                var38.clientPacket = null;
                var38.clientPacketLength = 0;
                var38.packetBuffer = new PacketBuffer(5000);
                var38.packetBuffer.offset = 0;
                if (gameState == 40) {
                    var38.packetBuffer.writeByte(LoginPacket.field3065.id);
                } else {
                    var38.packetBuffer.writeByte(LoginPacket.field3067.id);
                }
                var38.packetBuffer.writeShort(0);
                var7 = var38.packetBuffer.offset;
                var38.packetBuffer.writeInt(203);
                var38.packetBuffer.writeInt(1);
                var38.packetBuffer.writeByte(clientType);
                var38.packetBuffer.writeByte(field502);
                var38.packetBuffer.writeBytes(var29.array, 0, var29.offset);
                var16 = var38.packetBuffer.offset;
                var38.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
                var38.packetBuffer.writeByte(((isResizable ? 1 : 0) << 1) | (isLowDetail ? 1 : 0));
                var38.packetBuffer.writeShort(DirectByteArrayCopier.canvasWidth);
                var38.packetBuffer.writeShort(NPC.canvasHeight);
                PacketBuffer var17 = var38.packetBuffer;
                if (randomDatData != null) {
                    var17.writeBytes(randomDatData, 0, Client.randomDatData.length);
                } else {
                    byte[] var18 = KeyHandler.method332();
                    var17.writeBytes(var18, 0, var18.length);
                }
                var38.packetBuffer.writeStringCp1252NullTerminated(ReflectionCheck.field256);
                var38.packetBuffer.writeInt(class87.field1218);
                Buffer var44 = new Buffer(MouseHandler.platformInfo.size());
                MouseHandler.platformInfo.write(var44);
                var38.packetBuffer.writeBytes(var44.array, 0, var44.array.length);
                var38.packetBuffer.writeByte(clientType);
                var38.packetBuffer.writeInt(0);
                var38.packetBuffer.writeIntIME(class252.archive11.hash);
                var38.packetBuffer.writeInt(SoundCache.archive14.hash);
                var38.packetBuffer.writeIntIME(Clock.archive17.hash);
                var38.packetBuffer.writeIntIME(FontName.archive15.hash);
                var38.packetBuffer.writeIntME(WorldMapRegion.archive19.hash);
                var38.packetBuffer.writeIntIME(class7.archive0.hash);
                var38.packetBuffer.writeIntME(0);
                var38.packetBuffer.writeIntME(WorldMapLabelSize.archive6.hash);
                var38.packetBuffer.writeIntME(class403.archive4.hash);
                var38.packetBuffer.writeIntLE(Tile.archive3.hash);
                var38.packetBuffer.writeIntIME(WorldMapLabelSize.archive7.hash);
                var38.packetBuffer.writeIntME(Client.archive5.hash);
                var38.packetBuffer.writeIntLE(Message.archive8.hash);
                var38.packetBuffer.writeIntIME(Client.archive1.hash);
                var38.packetBuffer.writeInt(UrlRequest.archive18.hash);
                var38.packetBuffer.writeIntME(class148.archive12.hash);
                var38.packetBuffer.writeIntLE(Varcs.archive20.hash);
                var38.packetBuffer.writeInt(KitDefinition.archive13.hash);
                var38.packetBuffer.writeInt(FriendLoginUpdate.archive2.hash);
                var38.packetBuffer.writeInt(Tile.archive10.hash);
                var38.packetBuffer.writeIntME(class9.archive9.hash);
                var38.packetBuffer.xteaEncrypt(var33, var16, var38.packetBuffer.offset);
                var38.packetBuffer.writeLengthShort(var38.packetBuffer.offset - var7);
                packetWriter.addNode(var38);
                packetWriter.flush();
                Client.packetWriter.isaacCipher = new IsaacCipher(var33);
                int[] var19 = new int[4];
                for (int var12 = 0; var12 < 4; ++var12) {
                    var19[var12] = var33[var12] + 50;
                }
                var2.newIsaacCipher(var19);
                WorldMapLabelSize.method4321(6);
            }
            if ((loginState == 6) && (((AbstractSocket) (var1)).available() > 0)) {
                var42 = ((AbstractSocket) (var1)).readUnsignedByte();
                if (var42 == 61) {
                    var14 = ((AbstractSocket) (var1)).available();
                    class261.field3085 = (var14 == 1) && (((AbstractSocket) (var1)).readUnsignedByte() == 1);
                    WorldMapLabelSize.method4321(5);
                }
                if ((var42 == 21) && (gameState == 20)) {
                    WorldMapLabelSize.method4321(12);
                } else if (var42 == 2) {
                    WorldMapLabelSize.method4321(14);
                } else if ((var42 == 15) && (gameState == 40)) {
                    Client.packetWriter.serverPacketLength = -1;
                    WorldMapLabelSize.method4321(19);
                } else if (var42 == 64) {
                    WorldMapLabelSize.method4321(10);
                } else if ((var42 == 23) && (field531 < 1)) {
                    ++field531;
                    WorldMapLabelSize.method4321(0);
                } else if (var42 == 29) {
                    WorldMapLabelSize.method4321(17);
                } else {
                    if (var42 != 69) {
                        class221.getLoginError(var42);
                        return;
                    }
                    WorldMapLabelSize.method4321(7);
                }
            }
            if ((loginState == 7) && (((AbstractSocket) (var1)).available() >= 2)) {
                ((AbstractSocket) (var1)).read(var2.array, 0, 2);
                var2.offset = 0;
                Projectile.field955 = var2.readUnsignedShort();
                WorldMapLabelSize.method4321(8);
            }
            if ((loginState == 8) && (((AbstractSocket) (var1)).available() >= Projectile.field955)) {
                var2.offset = 0;
                ((AbstractSocket) (var1)).read(var2.array, var2.offset, Projectile.field955);
                class6[] var31 = new class6[]{ class6.field27 };
                class6 var35 = var31[var2.readUnsignedByte()];
                try {
                    class3 var5 = class134.method2824(var35);
                    this.field528 = new class7(var2, var5);
                    WorldMapLabelSize.method4321(9);
                } catch (Exception var23) {
                    class221.getLoginError(22);
                    return;
                }
            }
            if ((loginState == 9) && this.field528.method43()) {
                this.field542 = this.field528.method45();
                this.field528.method44();
                this.field528 = null;
                if (this.field542 == null) {
                    class221.getLoginError(22);
                    return;
                }
                packetWriter.clearBuffer();
                if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
                    var30 = new PacketBufferNode();
                } else {
                    var30 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
                }
                var30.clientPacket = null;
                var30.clientPacketLength = 0;
                var30.packetBuffer = new PacketBuffer(5000);
                var30.packetBuffer.writeByte(LoginPacket.field3066.id);
                var30.packetBuffer.writeShort(this.field542.offset);
                var30.packetBuffer.writeBuffer(this.field542);
                packetWriter.addNode(var30);
                packetWriter.flush();
                this.field542 = null;
                WorldMapLabelSize.method4321(6);
            }
            if ((loginState == 10) && (((AbstractSocket) (var1)).available() > 0)) {
                VertexNormal.field2534 = ((AbstractSocket) (var1)).readUnsignedByte();
                WorldMapLabelSize.method4321(11);
            }
            if ((loginState == 11) && (((AbstractSocket) (var1)).available() >= VertexNormal.field2534)) {
                ((AbstractSocket) (var1)).read(var2.array, 0, VertexNormal.field2534);
                var2.offset = 0;
                WorldMapLabelSize.method4321(6);
            }
            if ((loginState == 12) && (((AbstractSocket) (var1)).available() > 0)) {
                field532 = (((AbstractSocket) (var1)).readUnsignedByte() + 3) * 60;
                WorldMapLabelSize.method4321(13);
            }
            if (loginState == 13) {
                field530 = 0;
                UserComparator7.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", (field532 / 60) + " seconds.");
                if ((--field532) <= 0) {
                    WorldMapLabelSize.method4321(0);
                }
            } else {
                if ((loginState == 14) && (((AbstractSocket) (var1)).available() >= 1)) {
                    class134.field1572 = ((AbstractSocket) (var1)).readUnsignedByte();
                    WorldMapLabelSize.method4321(15);
                }
                if ((loginState == 15) && (((AbstractSocket) (var1)).available() >= class134.field1572)) {
                    var13 = ((AbstractSocket) (var1)).readUnsignedByte() == 1;
                    ((AbstractSocket) (var1)).read(var2.array, 0, 4);
                    var2.offset = 0;
                    boolean var43 = false;
                    if (var13) {
                        var14 = var2.readByteIsaac() << 24;
                        var14 |= var2.readByteIsaac() << 16;
                        var14 |= var2.readByteIsaac() << 8;
                        var14 |= var2.readByteIsaac();
                        String var40 = Login.Login_username;
                        var7 = var40.length();
                        var16 = 0;
                        var9 = 0;
                        while (true) {
                            if (var9 >= var7) {
                                if ((class424.clientPreferences.parameters.size() >= 10) && (!class424.clientPreferences.parameters.containsKey(var16))) {
                                    Iterator var41 = class424.clientPreferences.parameters.entrySet().iterator();
                                    var41.next();
                                    var41.remove();
                                }
                                class424.clientPreferences.parameters.put(var16, var14);
                                break;
                            }
                            var16 = ((var16 << 5) - var16) + var40.charAt(var9);
                            ++var9;
                        } 
                    }
                    if (Login_isUsernameRemembered) {
                        class424.clientPreferences.rememberedUsername = Login.Login_username;
                    } else {
                        class424.clientPreferences.rememberedUsername = null;
                    }
                    GameEngine.savePreferences();
                    staffModLevel = ((AbstractSocket) (var1)).readUnsignedByte();
                    playerMod = ((AbstractSocket) (var1)).readUnsignedByte() == 1;
                    localPlayerIndex = ((AbstractSocket) (var1)).readUnsignedByte();
                    localPlayerIndex <<= 8;
                    localPlayerIndex += ((AbstractSocket) (var1)).readUnsignedByte();
                    field772 = ((AbstractSocket) (var1)).readUnsignedByte();
                    ((AbstractSocket) (var1)).read(var2.array, 0, 1);
                    var2.offset = 0;
                    ServerPacket[] var34 = CollisionMap.ServerPacket_values();
                    int var21 = var2.readSmartByteShortIsaac();
                    if ((var21 < 0) || (var21 >= var34.length)) {
                        throw new IOException((var21 + " ") + var2.offset);
                    }
                    Client.packetWriter.serverPacket = var34[var21];
                    Client.packetWriter.serverPacketLength = Client.packetWriter.serverPacket.length;
                    ((AbstractSocket) (var1)).read(var2.array, 0, 2);
                    var2.offset = 0;
                    Client.packetWriter.serverPacketLength = var2.readUnsignedShort();
                    try {
                        class27.method395(class414.client, "zap");
                    } catch (Throwable var22) {
                    }
                    WorldMapLabelSize.method4321(16);
                }
                if (loginState == 16) {
                    if (((AbstractSocket) (var1)).available() >= Client.packetWriter.serverPacketLength) {
                        var2.offset = 0;
                        ((AbstractSocket) (var1)).read(var2.array, 0, Client.packetWriter.serverPacketLength);
                        timer.method6240();
                        MusicPatch.method5233();
                        AbstractSocket.updatePlayer(var2);
                        MouseHandler.field240 = -1;
                        Decimator.loadRegions(false, var2);
                        Client.packetWriter.serverPacket = null;
                    }
                } else {
                    if ((loginState == 17) && (((AbstractSocket) (var1)).available() >= 2)) {
                        var2.offset = 0;
                        ((AbstractSocket) (var1)).read(var2.array, 0, 2);
                        var2.offset = 0;
                        GrandExchangeOfferAgeComparator.field3941 = var2.readUnsignedShort();
                        WorldMapLabelSize.method4321(18);
                    }
                    if ((loginState == 18) && (((AbstractSocket) (var1)).available() >= GrandExchangeOfferAgeComparator.field3941)) {
                        var2.offset = 0;
                        ((AbstractSocket) (var1)).read(var2.array, 0, GrandExchangeOfferAgeComparator.field3941);
                        var2.offset = 0;
                        String var32 = var2.readStringCp1252NullTerminated();
                        String var39 = var2.readStringCp1252NullTerminated();
                        String var36 = var2.readStringCp1252NullTerminated();
                        UserComparator7.setLoginResponseString(var32, var39, var36);
                        class111.updateGameState(10);
                    }
                    if (loginState != 19) {
                        ++field530;
                        if (field530 > 2000) {
                            if (field531 < 1) {
                                if (class346.worldPort == class274.currentPort) {
                                    class274.currentPort = class297.js5Port;
                                } else {
                                    class274.currentPort = class346.worldPort;
                                }
                                ++field531;
                                WorldMapLabelSize.method4321(0);
                            } else {
                                class221.getLoginError(-3);
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
                            var42 = Client.packetWriter.serverPacketLength;
                            timer.method6235();
                            packetWriter.clearBuffer();
                            Client.packetWriter.packetBuffer.offset = 0;
                            Client.packetWriter.serverPacket = null;
                            Client.packetWriter.field1325 = null;
                            Client.packetWriter.field1326 = null;
                            Client.packetWriter.field1327 = null;
                            Client.packetWriter.serverPacketLength = 0;
                            Client.packetWriter.field1323 = 0;
                            rebootTimer = 0;
                            HitSplatDefinition.method3454();
                            minimapState = 0;
                            destinationX = 0;
                            for (var14 = 0; var14 < 2048; ++var14) {
                                players[var14] = null;
                            }
                            WorldMapSprite.localPlayer = null;
                            for (var14 = 0; var14 < Client.npcs.length; ++var14) {
                                NPC var37 = npcs[var14];
                                if (var37 != null) {
                                    var37.targetIndex = -1;
                                    var37.false0 = false;
                                }
                            }
                            ItemContainer.itemContainers = new NodeHashTable(32);
                            class111.updateGameState(30);
                            for (var14 = 0; var14 < 100; ++var14) {
                                field713[var14] = true;
                            }
                            DesktopPlatformInfoProvider.method6847();
                            AbstractSocket.updatePlayer(var2);
                            if (var42 != var2.offset) {
                                throw new RuntimeException();
                            }
                        }
                    }
                }
            }
        } catch (IOException var26) {
            if (field531 < 1) {
                if (class274.currentPort == class346.worldPort) {
                    class274.currentPort = class297.js5Port;
                } else {
                    class274.currentPort = class346.worldPort;
                }
                ++field531;
                WorldMapLabelSize.method4321(0);
            } else {
                class221.getLoginError(-2);
            }
        }
    }

    @ObfuscatedName("fh")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1188087780")
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
            class17.method258();
        } else {
            if (!isMenuOpen) {
                class87.addCancelMenuEntry();
            }
            int var1;
            for (var1 = 0; (var1 < 100) && this.method1145(packetWriter); ++var1) {
            }
            if (gameState == 30) {
                int var2;
                PacketBufferNode var14;
                while (Language.method5810()) {
                    var14 = class135.getPacketBufferNode(ClientPacket.field2896, Client.packetWriter.isaacCipher);
                    var14.packetBuffer.writeByte(0);
                    var2 = var14.packetBuffer.offset;
                    Coord.performReflectionCheck(var14.packetBuffer);
                    var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
                    packetWriter.addNode(var14);
                } 
                if (Client.timer.field4087) {
                    var14 = class135.getPacketBufferNode(ClientPacket.field2915, Client.packetWriter.isaacCipher);
                    var14.packetBuffer.writeByte(0);
                    var2 = var14.packetBuffer.offset;
                    timer.write(var14.packetBuffer);
                    var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var2);
                    packetWriter.addNode(var14);
                    timer.method6234();
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
                PacketBuffer var10000;
                synchronized(PacketWriter.mouseRecorder.lock) {
                    if (!field592) {
                        PacketWriter.mouseRecorder.index = 0;
                    } else if ((MouseHandler.MouseHandler_lastButton != 0) || (PacketWriter.mouseRecorder.index >= 40)) {
                        PacketBufferNode var15 = null;
                        var3 = 0;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;
                        for (var7 = 0; (var7 < PacketWriter.mouseRecorder.index) && ((var15 == null) || ((var15.packetBuffer.offset - var3) < 246)); ++var7) {
                            var4 = var7;
                            var8 = PacketWriter.mouseRecorder.ys[var7];
                            if (var8 < (-1)) {
                                var8 = -1;
                            } else if (var8 > 65534) {
                                var8 = 65534;
                            }
                            var9 = PacketWriter.mouseRecorder.xs[var7];
                            if (var9 < (-1)) {
                                var9 = -1;
                            } else if (var9 > 65534) {
                                var9 = 65534;
                            }
                            if ((var9 != field508) || (var8 != field509)) {
                                if (var15 == null) {
                                    var15 = class135.getPacketBufferNode(ClientPacket.field2838, Client.packetWriter.isaacCipher);
                                    var15.packetBuffer.writeByte(0);
                                    var3 = var15.packetBuffer.offset;
                                    var10000 = var15.packetBuffer;
                                    var10000.offset += 2;
                                    var5 = 0;
                                    var6 = 0;
                                }
                                int var12;
                                if ((-1L) != field651) {
                                    var10 = var9 - field508;
                                    var11 = var8 - field509;
                                    var12 = ((int) ((PacketWriter.mouseRecorder.millis[var7] - field651) / 20L));
                                    var5 = ((int) (((long) (var5)) + ((PacketWriter.mouseRecorder.millis[var7] - field651) % 20L)));
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
                                field651 = PacketWriter.mouseRecorder.millis[var7];
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
                        if (var4 >= PacketWriter.mouseRecorder.index) {
                            PacketWriter.mouseRecorder.index = 0;
                        } else {
                            MouseRecorder var44 = PacketWriter.mouseRecorder;
                            var44.index -= var4;
                            System.arraycopy(PacketWriter.mouseRecorder.xs, var4, PacketWriter.mouseRecorder.xs, 0, PacketWriter.mouseRecorder.index);
                            System.arraycopy(PacketWriter.mouseRecorder.ys, var4, PacketWriter.mouseRecorder.ys, 0, PacketWriter.mouseRecorder.index);
                            System.arraycopy(PacketWriter.mouseRecorder.millis, var4, PacketWriter.mouseRecorder.millis, 0, PacketWriter.mouseRecorder.index);
                        }
                    }
                }
                if (((MouseHandler.MouseHandler_lastButton == 1) || ((!class370.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4))) || (MouseHandler.MouseHandler_lastButton == 2)) {
                    long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
                    if (var16 > 32767L) {
                        var16 = 32767L;
                    }
                    mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
                    var3 = MouseHandler.MouseHandler_lastPressedY;
                    if (var3 < 0) {
                        var3 = 0;
                    } else if (var3 > NPC.canvasHeight) {
                        var3 = NPC.canvasHeight;
                    }
                    var4 = MouseHandler.MouseHandler_lastPressedX;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > DirectByteArrayCopier.canvasWidth) {
                        var4 = DirectByteArrayCopier.canvasWidth;
                    }
                    var5 = ((int) (var16));
                    PacketBufferNode var18 = class135.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, Client.packetWriter.isaacCipher);
                    var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
                    var18.packetBuffer.writeShort(var4);
                    var18.packetBuffer.writeShort(var3);
                    packetWriter.addNode(var18);
                }
                if (KeyHandler.field139 > 0) {
                    var14 = class135.getPacketBufferNode(ClientPacket.field2882, Client.packetWriter.isaacCipher);
                    var14.packetBuffer.writeShort(0);
                    var2 = var14.packetBuffer.offset;
                    long var19 = DirectByteArrayCopier.getServerTime();
                    for (var5 = 0; var5 < KeyHandler.field139; ++var5) {
                        long var21 = var19 - field685;
                        if (var21 > 16777215L) {
                            var21 = 16777215L;
                        }
                        field685 = var19;
                        var14.packetBuffer.writeByteNeg(KeyHandler.field135[var5]);
                        var14.packetBuffer.writeMedium(((int) (var21)));
                    }
                    var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var2);
                    packetWriter.addNode(var14);
                }
                if (field677 > 0) {
                    --field677;
                }
                if (((KeyHandler.KeyHandler_pressedKeys[96] || KeyHandler.KeyHandler_pressedKeys[97]) || KeyHandler.KeyHandler_pressedKeys[98]) || KeyHandler.KeyHandler_pressedKeys[99]) {
                    field589 = true;
                }
                if (field589 && (field677 <= 0)) {
                    field677 = 20;
                    field589 = false;
                    var14 = class135.getPacketBufferNode(ClientPacket.field2836, Client.packetWriter.isaacCipher);
                    var14.packetBuffer.writeShortAdd(camAngleX);
                    var14.packetBuffer.writeShortAddLE(camAngleY);
                    packetWriter.addNode(var14);
                }
                if (class297.hasFocus && (!hadFocus)) {
                    hadFocus = true;
                    var14 = class135.getPacketBufferNode(ClientPacket.field2930, Client.packetWriter.isaacCipher);
                    var14.packetBuffer.writeByte(1);
                    packetWriter.addNode(var14);
                }
                if ((!class297.hasFocus) && hadFocus) {
                    hadFocus = false;
                    var14 = class135.getPacketBufferNode(ClientPacket.field2930, Client.packetWriter.isaacCipher);
                    var14.packetBuffer.writeByte(0);
                    packetWriter.addNode(var14);
                }
                if (Huffman.worldMap != null) {
                    Huffman.worldMap.method6884();
                }
                WorldMapSectionType.method4725();
                if (ClanChannelMember.field1528) {
                    Actor.method2177();
                    ClanChannelMember.field1528 = false;
                }
                class118.method2657();
                if (gameState == 30) {
                    for (PendingSpawn var30 = ((PendingSpawn) (pendingSpawns.last())); var30 != null; var30 = ((PendingSpawn) (pendingSpawns.previous()))) {
                        if (var30.hitpoints > 0) {
                            --var30.hitpoints;
                        }
                        if (var30.hitpoints == 0) {
                            if ((var30.objectId < 0) || WorldMapSectionType.method4717(var30.objectId, var30.field1100)) {
                                FloorDecoration.addPendingSpawnToScene(var30.plane, var30.type, var30.x, var30.y, var30.objectId, var30.field1106, var30.field1100);
                                var30.remove();
                            }
                        } else {
                            if (var30.delay > 0) {
                                --var30.delay;
                            }
                            if ((((((var30.delay == 0) && (var30.x >= 1)) && (var30.y >= 1)) && (var30.x <= 102)) && (var30.y <= 102)) && ((var30.id < 0) || WorldMapSectionType.method4717(var30.id, var30.field1103))) {
                                FloorDecoration.addPendingSpawnToScene(var30.plane, var30.type, var30.x, var30.y, var30.id, var30.orientation, var30.field1103);
                                var30.delay = -1;
                                if ((var30.objectId == var30.id) && (var30.objectId == (-1))) {
                                    var30.remove();
                                } else if (((var30.objectId == var30.id) && (var30.orientation == var30.field1106)) && (var30.field1100 == var30.field1103)) {
                                    var30.remove();
                                }
                            }
                        }
                    }
                    int var10002;
                    for (var1 = 0; var1 < soundEffectCount; ++var1) {
                        var10002 = queuedSoundEffectDelays[var1]--;
                        if (queuedSoundEffectDelays[var1] >= (-10)) {
                            SoundEffect var32 = soundEffects[var1];
                            if (var32 == null) {
                                var10000 = null;
                                var32 = SoundEffect.readSoundEffect(class403.archive4, soundEffectIds[var1], 0);
                                if (var32 == null) {
                                    continue;
                                }
                                int[] var45 = queuedSoundEffectDelays;
                                var45[var1] += var32.calculateDelay();
                                soundEffects[var1] = var32;
                            }
                            if (queuedSoundEffectDelays[var1] < 0) {
                                if (soundLocations[var1] != 0) {
                                    var4 = (soundLocations[var1] & 255) * 128;
                                    var5 = (soundLocations[var1] >> 16) & 255;
                                    var6 = ((var5 * 128) + 64) - WorldMapSprite.localPlayer.x;
                                    if (var6 < 0) {
                                        var6 = -var6;
                                    }
                                    var7 = (soundLocations[var1] >> 8) & 255;
                                    var8 = ((var7 * 128) + 64) - WorldMapSprite.localPlayer.y;
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
                                    var3 = ((var4 - var9) * class424.clientPreferences.areaSoundEffectsVolume) / var4;
                                } else {
                                    var3 = class424.clientPreferences.soundEffectsVolume;
                                }
                                if (var3 > 0) {
                                    RawSound var23 = var32.toRawSound().resample(class131.decimator);
                                    RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3);
                                    var24.setNumLoops(queuedSoundEffectLoops[var1] - 1);
                                    class123.pcmStreamMixer.addSubStream(var24);
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
                    if (field744) {
                        boolean var28;
                        if (class265.musicPlayerStatus != 0) {
                            var28 = true;
                        } else {
                            var28 = class265.midiPcmStream.isReady();
                        }
                        if (!var28) {
                            if ((class424.clientPreferences.musicVolume != 0) && (currentTrackGroupId != (-1))) {
                                MenuAction.method1894(WorldMapLabelSize.archive6, currentTrackGroupId, 0, class424.clientPreferences.musicVolume, false);
                            }
                            field744 = false;
                        }
                    }
                    ++Client.packetWriter.field1323;
                    if (Client.packetWriter.field1323 > 750) {
                        class17.method258();
                    } else {
                        var1 = Players.Players_count;
                        int[] var34 = Players.Players_indices;
                        for (var3 = 0; var3 < var1; ++var3) {
                            Player var36 = players[var34[var3]];
                            if (var36 != null) {
                                class334.updateActorSequence(var36, 1);
                            }
                        }
                        UserComparator9.method2494();
                        int[] var31 = Players.Players_indices;
                        for (var2 = 0; var2 < Players.Players_count; ++var2) {
                            Player var25 = players[var31[var2]];
                            if ((var25 != null) && (var25.overheadTextCyclesRemaining > 0)) {
                                --var25.overheadTextCyclesRemaining;
                                if (var25.overheadTextCyclesRemaining == 0) {
                                    var25.overheadText = null;
                                }
                            }
                        }
                        for (var2 = 0; var2 < npcCount; ++var2) {
                            var3 = npcIndices[var2];
                            NPC var37 = npcs[var3];
                            if ((var37 != null) && (var37.overheadTextCyclesRemaining > 0)) {
                                --var37.overheadTextCyclesRemaining;
                                if (var37.overheadTextCyclesRemaining == 0) {
                                    var37.overheadText = null;
                                }
                            }
                        }
                        ++field566;
                        if (mouseCrossColor != 0) {
                            mouseCrossState += 20;
                            if (mouseCrossState >= 400) {
                                mouseCrossColor = 0;
                            }
                        }
                        if (WorldMapSectionType.field2720 != null) {
                            ++field610;
                            if (field610 >= 15) {
                                class112.invalidateWidget(WorldMapSectionType.field2720);
                                WorldMapSectionType.field2720 = null;
                            }
                        }
                        Widget var33 = class242.mousedOverWidgetIf1;
                        Widget var35 = class126.field1516;
                        class242.mousedOverWidgetIf1 = null;
                        class126.field1516 = null;
                        draggedOnWidget = null;
                        field648 = false;
                        field682 = false;
                        field729 = 0;
                        while (class370.isKeyDown() && (field729 < 128)) {
                            if (((staffModLevel >= 2) && KeyHandler.KeyHandler_pressedKeys[82]) && (class160.field1749 == 66)) {
                                String var40 = ClanChannelMember.method2769();
                                class414.client.method448(var40);
                            } else if ((oculusOrbState != 1) || (ClanSettings.field1610 <= 0)) {
                                field731[field729] = class160.field1749;
                                field684[field729] = ClanSettings.field1610;
                                ++field729;
                            }
                        } 
                        if (((class133.method2807() && KeyHandler.KeyHandler_pressedKeys[82]) && KeyHandler.KeyHandler_pressedKeys[81]) && (mouseWheelRotation != 0)) {
                            var3 = WorldMapSprite.localPlayer.plane - mouseWheelRotation;
                            if (var3 < 0) {
                                var3 = 0;
                            } else if (var3 > 3) {
                                var3 = 3;
                            }
                            if (var3 != WorldMapSprite.localPlayer.plane) {
                                DevicePcmPlayerProvider.method361(WorldMapSprite.localPlayer.pathX[0] + Canvas.baseX, WorldMapSprite.localPlayer.pathY[0] + class118.baseY, var3, false);
                            }
                            mouseWheelRotation = 0;
                        }
                        if (rootInterface != (-1)) {
                            class123.updateRootInterface(rootInterface, 0, 0, DirectByteArrayCopier.canvasWidth, NPC.canvasHeight, 0, 0);
                        }
                        ++cycleCntr;
                        while (true) {
                            Widget var38;
                            Widget var39;
                            ScriptEvent var42;
                            do {
                                var42 = ((ScriptEvent) (field708.removeLast()));
                                if (var42 == null) {
                                    while (true) {
                                        do {
                                            var42 = ((ScriptEvent) (field709.removeLast()));
                                            if (var42 == null) {
                                                while (true) {
                                                    do {
                                                        var42 = ((ScriptEvent) (scriptEvents.removeLast()));
                                                        if (var42 == null) {
                                                            this.menu();
                                                            if (Huffman.worldMap != null) {
                                                                Huffman.worldMap.method6894(SoundSystem.Client_plane, (WorldMapSprite.localPlayer.x >> 7) + Canvas.baseX, (WorldMapSprite.localPlayer.y >> 7) + class118.baseY, false);
                                                                Huffman.worldMap.loadCache();
                                                            }
                                                            if (clickedWidget != null) {
                                                                this.method1149();
                                                            }
                                                            PacketBufferNode var41;
                                                            if (class20.dragInventoryWidget != null) {
                                                                class112.invalidateWidget(class20.dragInventoryWidget);
                                                                ++itemDragDuration;
                                                                if (MouseHandler.MouseHandler_currentButton == 0) {
                                                                    if (field616) {
                                                                        if ((NPC.hoveredItemContainer == class20.dragInventoryWidget) && (dragItemSlotDestination != dragItemSlotSource)) {
                                                                            Widget var43 = class20.dragInventoryWidget;
                                                                            byte var29 = 0;
                                                                            if ((field669 == 1) && (var43.contentType == 206)) {
                                                                                var29 = 1;
                                                                            }
                                                                            if (var43.itemIds[dragItemSlotDestination] <= 0) {
                                                                                var29 = 0;
                                                                            }
                                                                            if (HorizontalAlignment.method3275(Language.getWidgetFlags(var43))) {
                                                                                var5 = dragItemSlotSource;
                                                                                var6 = dragItemSlotDestination;
                                                                                var43.itemIds[var6] = var43.itemIds[var5];
                                                                                var43.itemQuantities[var6] = var43.itemQuantities[var5];
                                                                                var43.itemIds[var5] = -1;
                                                                                var43.itemQuantities[var5] = 0;
                                                                            } else if (var29 == 1) {
                                                                                var5 = dragItemSlotSource;
                                                                                var6 = dragItemSlotDestination;
                                                                                while (var5 != var6) {
                                                                                    if (var5 > var6) {
                                                                                        var43.swapItems(var5 - 1, var5);
                                                                                        --var5;
                                                                                    } else if (var5 < var6) {
                                                                                        var43.swapItems(var5 + 1, var5);
                                                                                        ++var5;
                                                                                    }
                                                                                } 
                                                                            } else {
                                                                                var43.swapItems(dragItemSlotDestination, dragItemSlotSource);
                                                                            }
                                                                            var41 = class135.getPacketBufferNode(ClientPacket.field2856, Client.packetWriter.isaacCipher);
                                                                            var41.packetBuffer.writeShortAddLE(dragItemSlotDestination);
                                                                            var41.packetBuffer.writeShortAddLE(dragItemSlotSource);
                                                                            var41.packetBuffer.writeInt(class20.dragInventoryWidget.id);
                                                                            var41.packetBuffer.writeByteAdd(var29);
                                                                            packetWriter.addNode(var41);
                                                                        }
                                                                    } else if (this.shouldLeftClickOpenMenu()) {
                                                                        this.openMenu(draggedWidgetX, draggedWidgetY);
                                                                    } else if (menuOptionsCount > 0) {
                                                                        Tiles.method2054(draggedWidgetX, draggedWidgetY);
                                                                    }
                                                                    field610 = 10;
                                                                    MouseHandler.MouseHandler_lastButton = 0;
                                                                    class20.dragInventoryWidget = null;
                                                                } else if ((itemDragDuration >= 5) && ((((MouseHandler.MouseHandler_x > (draggedWidgetX + 5)) || (MouseHandler.MouseHandler_x < (draggedWidgetX - 5))) || (MouseHandler.MouseHandler_y > (draggedWidgetY + 5))) || (MouseHandler.MouseHandler_y < (draggedWidgetY - 5)))) {
                                                                    field616 = true;
                                                                }
                                                            }
                                                            if (Scene.shouldSendWalk()) {
                                                                var3 = Scene.Scene_selectedX;
                                                                var4 = Scene.Scene_selectedY;
                                                                var41 = class135.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, Client.packetWriter.isaacCipher);
                                                                var41.packetBuffer.writeByte(5);
                                                                var41.packetBuffer.writeByteAdd(KeyHandler.KeyHandler_pressedKeys[82] ? KeyHandler.KeyHandler_pressedKeys[81] ? 2 : 1 : 0);
                                                                var41.packetBuffer.writeShortLE(var3 + Canvas.baseX);
                                                                var41.packetBuffer.writeShortLE(var4 + class118.baseY);
                                                                packetWriter.addNode(var41);
                                                                Scene.method3936();
                                                                mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
                                                                mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
                                                                mouseCrossColor = 1;
                                                                mouseCrossState = 0;
                                                                destinationX = var3;
                                                                destinationY = var4;
                                                            }
                                                            if (var33 != class242.mousedOverWidgetIf1) {
                                                                if (var33 != null) {
                                                                    class112.invalidateWidget(var33);
                                                                }
                                                                if (class242.mousedOverWidgetIf1 != null) {
                                                                    class112.invalidateWidget(class242.mousedOverWidgetIf1);
                                                                }
                                                            }
                                                            if ((var35 != class126.field1516) && (field506 == field734)) {
                                                                if (var35 != null) {
                                                                    class112.invalidateWidget(var35);
                                                                }
                                                                if (class126.field1516 != null) {
                                                                    class112.invalidateWidget(class126.field1516);
                                                                }
                                                            }
                                                            if (class126.field1516 != null) {
                                                                if (field506 < field734) {
                                                                    ++field506;
                                                                    if (field506 == field734) {
                                                                        class112.invalidateWidget(class126.field1516);
                                                                    }
                                                                }
                                                            } else if (field506 > 0) {
                                                                --field506;
                                                            }
                                                            UserComparator4.method2443();
                                                            if (field755) {
                                                                class291.method5478();
                                                            } else if (isCameraLocked) {
                                                                var3 = (Message.field478 * 128) + 64;
                                                                var4 = (class12.field75 * 128) + 64;
                                                                var5 = class92.getTileHeight(var3, var4, SoundSystem.Client_plane) - class121.field1492;
                                                                SceneTilePaint.method4270(var3, var5, var4);
                                                                var3 = (class7.field33 * 128) + 64;
                                                                var4 = (class21.field119 * 128) + 64;
                                                                var5 = class92.getTileHeight(var3, var4, SoundSystem.Client_plane) - class334.field4057;
                                                                var6 = var3 - class414.cameraX;
                                                                var7 = var5 - WorldMapDecoration.cameraY;
                                                                var8 = var4 - GrandExchangeOfferOwnWorldComparator.cameraZ;
                                                                var9 = ((int) (Math.sqrt(((double) ((var6 * var6) + (var8 * var8))))));
                                                                var10 = ((int) (Math.atan2(((double) (var7)), ((double) (var9))) * 325.9490051269531)) & 2047;
                                                                var11 = ((int) (Math.atan2(((double) (var6)), ((double) (var8))) * (-325.9490051269531))) & 2047;
                                                                class260.method5000(var10, var11);
                                                            }
                                                            for (var3 = 0; var3 < 5; ++var3) {
                                                                var10002 = field757[var3]++;
                                                            }
                                                            JagexCache.varcs.tryWrite();
                                                            var3 = class221.method4644();
                                                            var4 = class135.method2834();
                                                            if ((var3 > 15000) && (var4 > 15000)) {
                                                                logoutTimer = 250;
                                                                Script.method1993(14500);
                                                                var41 = class135.getPacketBufferNode(ClientPacket.field2903, Client.packetWriter.isaacCipher);
                                                                packetWriter.addNode(var41);
                                                            }
                                                            ClanSettings.friendSystem.processFriendUpdates();
                                                            ++Client.packetWriter.pendingWrites;
                                                            if (Client.packetWriter.pendingWrites > 50) {
                                                                var41 = class135.getPacketBufferNode(ClientPacket.field2837, Client.packetWriter.isaacCipher);
                                                                packetWriter.addNode(var41);
                                                            }
                                                            try {
                                                                packetWriter.flush();
                                                            } catch (IOException var26) {
                                                                class17.method258();
                                                            }
                                                            return;
                                                        }
                                                        var38 = var42.widget;
                                                        if (var38.childIndex < 0) {
                                                            break;
                                                        }
                                                        var39 = class130.getWidget(var38.parentId);
                                                    } while ((((var39 == null) || (var39.children == null)) || (var38.childIndex >= var39.children.length)) || (var38 != var39.children[var38.childIndex]) );
                                                    class92.runScriptEvent(var42);
                                                } 
                                            }
                                            var38 = var42.widget;
                                            if (var38.childIndex < 0) {
                                                break;
                                            }
                                            var39 = class130.getWidget(var38.parentId);
                                        } while ((((var39 == null) || (var39.children == null)) || (var38.childIndex >= var39.children.length)) || (var38 != var39.children[var38.childIndex]) );
                                        class92.runScriptEvent(var42);
                                    } 
                                }
                                var38 = var42.widget;
                                if (var38.childIndex < 0) {
                                    break;
                                }
                                var39 = class130.getWidget(var38.parentId);
                            } while ((((var39 == null) || (var39.children == null)) || (var38.childIndex >= var39.children.length)) || (var38 != var39.children[var38.childIndex]) );
                            class92.runScriptEvent(var42);
                        } 
                    }
                }
            }
        }
    }

    @ObfuscatedName("gb")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "531081400")
    @Export("resizeJS")
    void resizeJS() {
        int var1 = DirectByteArrayCopier.canvasWidth;
        int var2 = NPC.canvasHeight;
        if (super.contentWidth < var1) {
            var1 = super.contentWidth;
        }
        if (super.contentHeight < var2) {
            var2 = super.contentHeight;
        }
        if (class424.clientPreferences != null) {
            try {
                class27.method396(class414.client, "resize", new Object[]{ class339.getWindowedMode() });
            } catch (Throwable var4) {
            }
        }
    }

    @ObfuscatedName("ga")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1862887067")
    @Export("drawLoggedIn")
    final void drawLoggedIn() {
        int var1;
        if (rootInterface != (-1)) {
            var1 = rootInterface;
            if (class13.loadInterface(var1)) {
                Player.drawModelComponents(Widget.Widget_interfaceComponents[var1], -1);
            }
        }
        for (var1 = 0; var1 < rootWidgetCount; ++var1) {
            if (field713[var1]) {
                field714[var1] = true;
            }
            field715[var1] = field713[var1];
            field713[var1] = false;
        }
        field712 = cycle;
        viewportX = -1;
        viewportY = -1;
        NPC.hoveredItemContainer = null;
        if (rootInterface != (-1)) {
            rootWidgetCount = 0;
            UserComparator5.drawWidgets(rootInterface, 0, 0, DirectByteArrayCopier.canvasWidth, NPC.canvasHeight, 0, 0, -1);
        }
        Rasterizer2D.Rasterizer2D_resetClip();
        if (showMouseCross) {
            if (mouseCrossColor == 1) {
                WorldMapData_1.crossSprites[mouseCrossState / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
            }
            if (mouseCrossColor == 2) {
                WorldMapData_1.crossSprites[(mouseCrossState / 100) + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
            }
        }
        if (!isMenuOpen) {
            if (viewportX != (-1)) {
                class87.method2221(viewportX, viewportY);
            }
        } else {
            var1 = Projectile.menuX;
            int var2 = ReflectionCheck.menuY;
            int var3 = Calendar.menuWidth;
            int var4 = ScriptFrame.menuHeight;
            int var5 = 6116423;
            Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
            Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
            class408.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
            int var6 = MouseHandler.MouseHandler_x;
            int var7 = MouseHandler.MouseHandler_y;
            for (int var8 = 0; var8 < menuOptionsCount; ++var8) {
                int var9 = ((((menuOptionsCount - 1) - var8) * 15) + var2) + 31;
                int var10 = 16777215;
                if ((((var6 > var1) && (var6 < (var1 + var3))) && (var7 > (var9 - 13))) && (var7 < (var9 + 3))) {
                    var10 = 16776960;
                }
                class408.fontBold12.draw(class144.method2969(var8), var1 + 3, var9, var10, 0);
            }
            class127.method2765(Projectile.menuX, ReflectionCheck.menuY, Calendar.menuWidth, ScriptFrame.menuHeight);
        }
        if (gameDrawingMode == 3) {
            for (var1 = 0; var1 < rootWidgetCount; ++var1) {
                if (field715[var1]) {
                    Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
                } else if (field714[var1]) {
                    Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
                }
            }
        }
        SoundCache.method800(SoundSystem.Client_plane, WorldMapSprite.localPlayer.x, WorldMapSprite.localPlayer.y, field566);
        field566 = 0;
    }

    @ObfuscatedName("hr")
    @ObfuscatedSignature(descriptor = "(Lcx;I)Z", garbageValue = "-826761503")
    final boolean method1145(PacketWriter var1) {
        AbstractSocket var2 = var1.getSocket();
        PacketBuffer var3 = var1.packetBuffer;
        if (var2 == null) {
            return false;
        } else {
            int var6;
            String var18;
            try {
                int var5;
                if (var1.serverPacket == null) {
                    if (var1.field1322) {
                        if (!var2.isAvailable(1)) {
                            return false;
                        }
                        var2.read(var1.packetBuffer.array, 0, 1);
                        var1.field1323 = 0;
                        var1.field1322 = false;
                    }
                    var3.offset = 0;
                    if (var3.method7321()) {
                        if (!var2.isAvailable(1)) {
                            return false;
                        }
                        var2.read(var1.packetBuffer.array, 1, 1);
                        var1.field1323 = 0;
                    }
                    var1.field1322 = true;
                    ServerPacket[] var4 = CollisionMap.ServerPacket_values();
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
                var1.field1323 = 0;
                timer.method6230();
                var1.field1327 = var1.field1326;
                var1.field1326 = var1.field1325;
                var1.field1325 = var1.serverPacket;
                int var17;
                if (ServerPacket.field2977 == var1.serverPacket) {
                    var17 = var3.readUnsignedByteSub();
                    var18 = var3.readStringCp1252NullTerminated();
                    var6 = var3.readUnsignedByteNeg();
                    if ((var17 >= 1) && (var17 <= 8)) {
                        if (var18.equalsIgnoreCase("null")) {
                            var18 = null;
                        }
                        playerMenuActions[var17 - 1] = var18;
                        playerOptionsPriorities[var17 - 1] = var6 == 0;
                    }
                    var1.serverPacket = null;
                    return true;
                }
                Widget var53;
                if (ServerPacket.field3034 == var1.serverPacket) {
                    var17 = var3.readInt();
                    var5 = var3.readUnsignedShortAddLE();
                    var6 = var3.readUnsignedShortAdd();
                    var53 = class130.getWidget(var17);
                    var53.field3320 = var5 + (var6 << 16);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3059 == var1.serverPacket) {
                    class368.updateNpcs(false, var3);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2996 == var1.serverPacket) {
                    for (var17 = 0; var17 < Varps.Varps_main.length; ++var17) {
                        if (Varps.Varps_main[var17] != Varps.Varps_temp[var17]) {
                            Varps.Varps_main[var17] = Varps.Varps_temp[var17];
                            NetFileRequest.changeGameOptions(var17);
                            changedVarps[((++changedVarpCount) - 1) & 31] = var17;
                        }
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2962 == var1.serverPacket) {
                    UserComparator7.method2463(class255.field2948);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2975 == var1.serverPacket) {
                    UserComparator7.method2463(class255.field2950);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3005 == var1.serverPacket) {
                    isCameraLocked = false;
                    for (var17 = 0; var17 < 5; ++var17) {
                        field753[var17] = false;
                    }
                    var1.serverPacket = null;
                    return true;
                }
                Widget var19;
                if (ServerPacket.field3026 == var1.serverPacket) {
                    var17 = var3.readUnsignedIntIME();
                    var5 = var3.readUnsignedShortAddLE();
                    var19 = class130.getWidget(var17);
                    if ((var19.modelType != 1) || (var5 != var19.modelId)) {
                        var19.modelType = 1;
                        var19.modelId = var5;
                        class112.invalidateWidget(var19);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3015 == var1.serverPacket) {
                    var17 = var3.readInt();
                    var5 = var3.readUnsignedShortAddLE();
                    var19 = class130.getWidget(var17);
                    if ((var19 != null) && (var19.type == 0)) {
                        if (var5 > (var19.scrollHeight - var19.height)) {
                            var5 = var19.scrollHeight - var19.height;
                        }
                        if (var5 < 0) {
                            var5 = 0;
                        }
                        if (var5 != var19.scrollY) {
                            var19.scrollY = var5;
                            class112.invalidateWidget(var19);
                        }
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3049 == var1.serverPacket) {
                    UserComparator7.method2463(class255.field2949);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3033 == var1.serverPacket) {
                    var17 = var3.readUnsignedByte();
                    ClientPacket.method4975(var17);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3011 == var1.serverPacket) {
                    ClanSettings.friendSystem.method1704();
                    field600 = cycleCntr;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3056 == var1.serverPacket) {
                    class221.field2680 = new class375(FloorOverlayDefinition.HitSplatDefinition_cached);
                    var1.serverPacket = null;
                    return true;
                }
                String var69;
                if (ServerPacket.field2995 == var1.serverPacket) {
                    byte[] var51 = new byte[var1.serverPacketLength];
                    var3.method7317(var51, 0, var51.length);
                    Buffer var68 = new Buffer(var51);
                    var69 = var68.readStringCp1252NullTerminated();
                    MilliClock.openURL(var69, true, false);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2982 == var1.serverPacket) {
                    class221.field2680 = null;
                    var1.serverPacket = null;
                    return true;
                }
                Widget var64;
                if (ServerPacket.field3018 == var1.serverPacket) {
                    var17 = var3.readUnsignedIntME();
                    var64 = class130.getWidget(var17);
                    var64.modelType = 3;
                    var64.modelId = WorldMapSprite.localPlayer.appearance.getChatHeadId();
                    class112.invalidateWidget(var64);
                    var1.serverPacket = null;
                    return true;
                }
                int var13;
                long var20;
                long var22;
                String var24;
                String var48;
                if (ServerPacket.field3022 == var1.serverPacket) {
                    var48 = var3.readStringCp1252NullTerminated();
                    var20 = ((long) (var3.readUnsignedShort()));
                    var22 = ((long) (var3.readMedium()));
                    PlayerType var9 = ((PlayerType) (class140.findEnumerated(MidiPcmStream.PlayerType_values(), var3.readUnsignedByte())));
                    long var10 = var22 + (var20 << 32);
                    boolean var12 = false;
                    for (var13 = 0; var13 < 100; ++var13) {
                        if (var10 == crossWorldMessageIds[var13]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (ClanSettings.friendSystem.isIgnored(new Username(var48, VarcInt.loginType))) {
                        var12 = true;
                    }
                    if ((!var12) && (field658 == 0)) {
                        crossWorldMessageIds[crossWorldMessageIdsIndex] = var10;
                        crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                        var24 = AbstractFont.escapeBrackets(ModelData0.method4273(GrandExchangeOfferUnitPriceComparator.method5755(var3)));
                        byte var58;
                        if (var9.isPrivileged) {
                            var58 = 7;
                        } else {
                            var58 = 3;
                        }
                        if (var9.modIcon != (-1)) {
                            LoginScreenAnimation.addGameMessage(var58, WorldMapSectionType.method4720(var9.modIcon) + var48, var24);
                        } else {
                            LoginScreenAnimation.addGameMessage(var58, var48, var24);
                        }
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3027 == var1.serverPacket) {
                    var17 = var3.readUnsignedShort();
                    var5 = var3.readUnsignedByte();
                    var6 = var3.readUnsignedShort();
                    ObjectComposition.queueSoundEffect(var17, var5, var6);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2978 == var1.serverPacket) {
                    var48 = var3.readStringCp1252NullTerminated();
                    Object[] var67 = new Object[var48.length() + 1];
                    for (var6 = var48.length() - 1; var6 >= 0; --var6) {
                        if (var48.charAt(var6) == 's') {
                            var67[var6 + 1] = var3.readStringCp1252NullTerminated();
                        } else {
                            var67[var6 + 1] = new Integer(var3.readInt());
                        }
                    }
                    var67[0] = new Integer(var3.readInt());
                    ScriptEvent var73 = new ScriptEvent();
                    var73.args = var67;
                    class92.runScriptEvent(var73);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2963 == var1.serverPacket) {
                    var17 = var3.readInt();
                    InterfaceParent var66 = ((InterfaceParent) (interfaceParents.get(((long) (var17)))));
                    if (var66 != null) {
                        class127.closeInterface(var66, true);
                    }
                    if (meslayerContinueWidget != null) {
                        class112.invalidateWidget(meslayerContinueWidget);
                        meslayerContinueWidget = null;
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2998 == var1.serverPacket) {
                    class33.field243 = var3.readUnsignedByteSub();
                    Canvas.field157 = var3.readUnsignedByte();
                    while (var3.offset < var1.serverPacketLength) {
                        var17 = var3.readUnsignedByte();
                        class255 var65 = VerticalAlignment.method3321()[var17];
                        UserComparator7.method2463(var65);
                    } 
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3046 == var1.serverPacket) {
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
                if (ServerPacket.field3060 == var1.serverPacket) {
                    var17 = var3.readUnsignedShortAddLE();
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    WorldMapSection2.playSong(var17);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3032 == var1.serverPacket) {
                    var17 = var3.method7412();
                    var5 = var3.readUnsignedShortAdd();
                    if (var5 == 65535) {
                        var5 = -1;
                    }
                    class186.method3695(var5, var17);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3051 == var1.serverPacket) {
                    var17 = var3.readUnsignedIntME();
                    var5 = var3.readShortAddLE();
                    var19 = class130.getWidget(var17);
                    if ((var5 != var19.sequenceId) || (var5 == (-1))) {
                        var19.sequenceId = var5;
                        var19.modelFrame = 0;
                        var19.modelFrameCycle = 0;
                        class112.invalidateWidget(var19);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2964 == var1.serverPacket) {
                    UserComparator7.method2463(class255.field2947);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3050 == var1.serverPacket) {
                    var3.offset += 28;
                    if (var3.checkCrc()) {
                        Frames.method4098(var3, var3.offset - 28);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3012 == var1.serverPacket) {
                    var17 = var3.readInt();
                    var64 = class130.getWidget(var17);
                    for (var6 = 0; var6 < var64.itemIds.length; ++var6) {
                        var64.itemIds[var6] = -1;
                        var64.itemIds[var6] = 0;
                    }
                    class112.invalidateWidget(var64);
                    var1.serverPacket = null;
                    return true;
                }
                boolean var72;
                if (ServerPacket.field2970 == var1.serverPacket) {
                    var72 = var3.readBoolean();
                    if (var72) {
                        if (class9.field58 == null) {
                            class9.field58 = new class317();
                        }
                    } else {
                        class9.field58 = null;
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3054 == var1.serverPacket) {
                    ClanSettings.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
                    MouseRecorder.FriendSystem_invalidateIgnoreds();
                    field600 = cycleCntr;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3016 == var1.serverPacket) {
                    PrivateChatMode.updatePlayers(var3, var1.serverPacketLength);
                    class414.method7254();
                    var1.serverPacket = null;
                    return true;
                }
                int var8;
                int var25;
                long var26;
                if (ServerPacket.field2967 == var1.serverPacket) {
                    var17 = var3.readUnsignedIntLE();
                    var5 = var3.readUnsignedIntME();
                    var6 = var3.readUnsignedShortAddLE();
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    var25 = var3.readUnsignedShortAdd();
                    if (var25 == 65535) {
                        var25 = -1;
                    }
                    for (var8 = var6; var8 <= var25; ++var8) {
                        var26 = ((long) (var8)) + (((long) (var17)) << 32);
                        Node var54 = widgetFlags.get(var26);
                        if (var54 != null) {
                            var54.remove();
                        }
                        widgetFlags.put(new IntegerNode(var5), var26);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3052 == var1.serverPacket) {
                    WorldMapAreaData.method4855();
                    var17 = var3.readUnsignedByteSub();
                    var5 = var3.readUnsignedByteAdd();
                    var6 = var3.readInt();
                    experience[var17] = var6;
                    currentLevels[var17] = var5;
                    levels[var17] = 1;
                    for (var25 = 0; var25 < 98; ++var25) {
                        if (var6 >= Skills.Skills_experienceTable[var25]) {
                            levels[var17] = var25 + 2;
                        }
                    }
                    changedSkills[((++changedSkillsCount) - 1) & 31] = var17;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3024 == var1.serverPacket) {
                    for (var17 = 0; var17 < VarpDefinition.VarpDefinition_fileCount; ++var17) {
                        VarpDefinition var62 = PcmPlayer.VarpDefinition_get(var17);
                        if (var62 != null) {
                            Varps.Varps_temp[var17] = 0;
                            Varps.Varps_main[var17] = 0;
                        }
                    }
                    WorldMapAreaData.method4855();
                    changedVarpCount += 32;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3041 == var1.serverPacket) {
                    var17 = var3.readUnsignedShort();
                    WorldMapLabelSize.method4324(var17);
                    changedItemContainers[((++field494) - 1) & 31] = var17 & 32767;
                    var1.serverPacket = null;
                    return true;
                }
                int var28;
                if (ServerPacket.field3045 == var1.serverPacket) {
                    var17 = var3.readUnsignedShortLE();
                    var5 = var3.readUnsignedIntLE();
                    var6 = (var17 >> 10) & 31;
                    var25 = (var17 >> 5) & 31;
                    var8 = var17 & 31;
                    var28 = ((var25 << 11) + (var6 << 19)) + (var8 << 3);
                    Widget var76 = class130.getWidget(var5);
                    if (var28 != var76.color) {
                        var76.color = var28;
                        class112.invalidateWidget(var76);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3042 == var1.serverPacket) {
                    var17 = var3.readUnsignedByte();
                    class282.forceDisconnect(var17);
                    var1.serverPacket = null;
                    return false;
                }
                byte var59;
                if (ServerPacket.field2969 == var1.serverPacket) {
                    field503 = cycleCntr;
                    var59 = var3.readByte();
                    class143 var61 = new class143(var3);
                    ClanChannel var71;
                    if (var59 >= 0) {
                        var71 = currentClanChannels[var59];
                    } else {
                        var71 = InterfaceParent.guestClanChannel;
                    }
                    var61.method2957(var71);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3048 == var1.serverPacket) {
                    var17 = var3.readInt();
                    var5 = var3.readUnsignedShortLE();
                    var19 = class130.getWidget(var17);
                    if ((var19.modelType != 2) || (var5 != var19.modelId)) {
                        var19.modelType = 2;
                        var19.modelId = var5;
                        class112.invalidateWidget(var19);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3009 == var1.serverPacket) {
                    var17 = var3.readUnsignedIntLE();
                    var5 = var3.readUnsignedShortAdd();
                    if (var5 == 65535) {
                        var5 = -1;
                    }
                    var6 = var3.readUnsignedIntME();
                    var53 = class130.getWidget(var6);
                    ItemComposition var78;
                    if (!var53.isIf3) {
                        if (var5 == (-1)) {
                            var53.modelType = 0;
                            var1.serverPacket = null;
                            return true;
                        }
                        var78 = ItemDefinition_get(var5);
                        var53.modelType = 4;
                        var53.modelId = var5;
                        var53.modelAngleX = var78.xan2d;
                        var53.modelAngleY = var78.yan2d;
                        var53.modelZoom = (var78.zoom2d * 100) / var17;
                        class112.invalidateWidget(var53);
                    } else {
                        var53.itemId = var5;
                        var53.itemQuantity = var17;
                        var78 = ItemDefinition_get(var5);
                        var53.modelAngleX = var78.xan2d;
                        var53.modelAngleY = var78.yan2d;
                        var53.modelAngleZ = var78.zan2d;
                        var53.modelOffsetX = var78.offsetX2d;
                        var53.modelOffsetY = var78.offsetY2d;
                        var53.modelZoom = var78.zoom2d;
                        if (var78.isStackable == 1) {
                            var53.itemQuantityMode = 1;
                        } else {
                            var53.itemQuantityMode = 2;
                        }
                        if (var53.field3310 > 0) {
                            var53.modelZoom = (var53.modelZoom * 32) / var53.field3310;
                        } else if (var53.rawWidth > 0) {
                            var53.modelZoom = (var53.modelZoom * 32) / var53.rawWidth;
                        }
                        class112.invalidateWidget(var53);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2989 == var1.serverPacket) {
                    if (rootInterface != (-1)) {
                        DevicePcmPlayerProvider.runIntfCloseListeners(rootInterface, 0);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2976 == var1.serverPacket) {
                    publicChatMode = var3.readUnsignedByteSub();
                    tradeChatMode = var3.readUnsignedByteSub();
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3038 == var1.serverPacket) {
                    for (var17 = 0; var17 < Client.players.length; ++var17) {
                        if (players[var17] != null) {
                            players[var17].sequence = -1;
                        }
                    }
                    for (var17 = 0; var17 < Client.npcs.length; ++var17) {
                        if (npcs[var17] != null) {
                            npcs[var17].sequence = -1;
                        }
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2999 == var1.serverPacket) {
                    var48 = var3.readStringCp1252NullTerminated();
                    var5 = var3.readUnsignedIntIME();
                    var19 = class130.getWidget(var5);
                    if (!var48.equals(var19.text)) {
                        var19.text = var48;
                        class112.invalidateWidget(var19);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3019 == var1.serverPacket) {
                    var48 = var3.readStringCp1252NullTerminated();
                    var18 = AbstractFont.escapeBrackets(ModelData0.method4273(GrandExchangeOfferUnitPriceComparator.method5755(var3)));
                    LoginScreenAnimation.addGameMessage(6, var48, var18);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3025 == var1.serverPacket) {
                    var72 = var3.readUnsignedByte() == 1;
                    if (var72) {
                        class140.field1626 = DirectByteArrayCopier.getServerTime() - var3.readLong();
                        class135.grandExchangeEvents = new GrandExchangeEvents(var3, true);
                    } else {
                        class135.grandExchangeEvents = null;
                    }
                    field652 = cycleCntr;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3029 == var1.serverPacket) {
                    WorldMapSection2.method4360();
                    var59 = var3.readByte();
                    class129 var60 = new class129(var3);
                    ClanSettings var70;
                    if (var59 >= 0) {
                        var70 = currentClanSettings[var59];
                    } else {
                        var70 = UserComparator7.guestClanSettings;
                    }
                    var60.method2775(var70);
                    var1.serverPacket = null;
                    return true;
                }
                boolean var55;
                if (ServerPacket.field2990 == var1.serverPacket) {
                    var17 = var3.readUShortSmart();
                    var55 = var3.readUnsignedByte() == 1;
                    var69 = "";
                    boolean var74 = false;
                    if (var55) {
                        var69 = var3.readStringCp1252NullTerminated();
                        if (ClanSettings.friendSystem.isIgnored(new Username(var69, VarcInt.loginType))) {
                            var74 = true;
                        }
                    }
                    String var77 = var3.readStringCp1252NullTerminated();
                    if (!var74) {
                        LoginScreenAnimation.addGameMessage(var17, var69, var77);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                InterfaceParent var7;
                if (ServerPacket.field3004 == var1.serverPacket) {
                    var17 = var3.readInt();
                    var5 = var3.readUnsignedShort();
                    var6 = var3.readUnsignedByteAdd();
                    var7 = ((InterfaceParent) (interfaceParents.get(((long) (var17)))));
                    if (var7 != null) {
                        class127.closeInterface(var7, var5 != var7.group);
                    }
                    class233.method4772(var17, var5, var6);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3057 == var1.serverPacket) {
                    Decimator.loadRegions(true, var1.packetBuffer);
                    var1.serverPacket = null;
                    return true;
                }
                int var15;
                String var38;
                if (ServerPacket.field2980 == var1.serverPacket) {
                    var59 = var3.readByte();
                    var18 = var3.readStringCp1252NullTerminated();
                    long var31 = ((long) (var3.readUnsignedShort()));
                    long var33 = ((long) (var3.readMedium()));
                    PlayerType var75 = ((PlayerType) (class140.findEnumerated(MidiPcmStream.PlayerType_values(), var3.readUnsignedByte())));
                    long var35 = (var31 << 32) + var33;
                    boolean var56 = false;
                    ClanChannel var37 = null;
                    var37 = (var59 >= 0) ? currentClanChannels[var59] : InterfaceParent.guestClanChannel;
                    if (var37 == null) {
                        var56 = true;
                    } else {
                        var15 = 0;
                        while (true) {
                            if (var15 >= 100) {
                                if (var75.isUser && ClanSettings.friendSystem.isIgnored(new Username(var18, VarcInt.loginType))) {
                                    var56 = true;
                                }
                                break;
                            }
                            if (var35 == crossWorldMessageIds[var15]) {
                                var56 = true;
                                break;
                            }
                            ++var15;
                        } 
                    }
                    if (!var56) {
                        crossWorldMessageIds[crossWorldMessageIdsIndex] = var35;
                        crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                        var38 = AbstractFont.escapeBrackets(GrandExchangeOfferUnitPriceComparator.method5755(var3));
                        int var16 = (var59 >= 0) ? 41 : 44;
                        if (var75.modIcon != (-1)) {
                            GraphicsObject.addChatMessage(var16, WorldMapSectionType.method4720(var75.modIcon) + var18, var38, var37.name);
                        } else {
                            GraphicsObject.addChatMessage(var16, var18, var38, var37.name);
                        }
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2968 == var1.serverPacket) {
                    class33.field243 = var3.readUnsignedByte();
                    Canvas.field157 = var3.readUnsignedByteNeg();
                    for (var17 = class33.field243; var17 < (class33.field243 + 8); ++var17) {
                        for (var5 = Canvas.field157; var5 < (Canvas.field157 + 8); ++var5) {
                            if (groundItems[SoundSystem.Client_plane][var17][var5] != null) {
                                groundItems[SoundSystem.Client_plane][var17][var5] = null;
                                StudioGame.updateItemPile(var17, var5);
                            }
                        }
                    }
                    for (PendingSpawn var49 = ((PendingSpawn) (pendingSpawns.last())); var49 != null; var49 = ((PendingSpawn) (pendingSpawns.previous()))) {
                        if (((((var49.x >= class33.field243) && (var49.x < (class33.field243 + 8))) && (var49.y >= Canvas.field157)) && (var49.y < (Canvas.field157 + 8))) && (var49.plane == SoundSystem.Client_plane)) {
                            var49.hitpoints = 0;
                        }
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2972 == var1.serverPacket) {
                    HealthBarUpdate.field1178 = true;
                    class368.updateNpcs(false, var3);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2993 == var1.serverPacket) {
                    minimapState = var3.readUnsignedByte();
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2971 == var1.serverPacket) {
                    class368.updateNpcs(true, var3);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3039 == var1.serverPacket) {
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
                if (ServerPacket.field3001 == var1.serverPacket) {
                    class123.method2721(var3.readStringCp1252NullTerminated());
                    var1.serverPacket = null;
                    return true;
                }
                int var39;
                if (ServerPacket.field3036 == var1.serverPacket) {
                    isCameraLocked = true;
                    field755 = false;
                    class7.field33 = var3.readUnsignedByte();
                    class21.field119 = var3.readUnsignedByte();
                    class334.field4057 = var3.readUnsignedShort();
                    WorldMapSectionType.field2723 = var3.readUnsignedByte();
                    WallDecoration.field2573 = var3.readUnsignedByte();
                    if (WallDecoration.field2573 >= 100) {
                        var17 = (class7.field33 * 128) + 64;
                        var5 = (class21.field119 * 128) + 64;
                        var6 = class92.getTileHeight(var17, var5, SoundSystem.Client_plane) - class334.field4057;
                        var25 = var17 - class414.cameraX;
                        var8 = var6 - WorldMapDecoration.cameraY;
                        var28 = var5 - GrandExchangeOfferOwnWorldComparator.cameraZ;
                        var39 = ((int) (Math.sqrt(((double) ((var28 * var28) + (var25 * var25))))));
                        class7.cameraPitch = ((int) (Math.atan2(((double) (var8)), ((double) (var39))) * 325.9490051269531)) & 2047;
                        class7.cameraYaw = ((int) (Math.atan2(((double) (var25)), ((double) (var28))) * (-325.9490051269531))) & 2047;
                        if (class7.cameraPitch < 128) {
                            class7.cameraPitch = 128;
                        }
                        if (class7.cameraPitch > 383) {
                            class7.cameraPitch = 383;
                        }
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3047 == var1.serverPacket) {
                    var17 = var3.readInt();
                    var55 = var3.readUnsignedByteAdd() == 1;
                    var19 = class130.getWidget(var17);
                    if (var55 != var19.isHidden) {
                        var19.isHidden = var55;
                        class112.invalidateWidget(var19);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3010 == var1.serverPacket) {
                    var17 = var3.readShortAdd();
                    var5 = var3.method7409();
                    var6 = var3.readUnsignedIntME();
                    var53 = class130.getWidget(var6);
                    if ((((var17 != var53.rawX) || (var5 != var53.rawY)) || (var53.xAlignment != 0)) || (var53.yAlignment != 0)) {
                        var53.rawX = var17;
                        var53.rawY = var5;
                        var53.xAlignment = 0;
                        var53.yAlignment = 0;
                        class112.invalidateWidget(var53);
                        this.alignWidget(var53);
                        if (var53.type == 0) {
                            PcmPlayer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var6 >> 16], var53, false);
                        }
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2985 == var1.serverPacket) {
                    Decimator.loadRegions(false, var1.packetBuffer);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2994 == var1.serverPacket) {
                    UserComparator7.method2463(class255.field2945);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3021 == var1.serverPacket) {
                    var17 = var3.readInt();
                    var5 = var3.readUnsignedShort();
                    if (var17 < (-70000)) {
                        var5 += 32768;
                    }
                    if (var17 >= 0) {
                        var19 = class130.getWidget(var17);
                    } else {
                        var19 = null;
                    }
                    for (; var3.offset < var1.serverPacketLength; WorldMapElement.itemContainerSetItem(var5, var25, var8 - 1, var28)) {
                        var25 = var3.readUShortSmart();
                        var8 = var3.readUnsignedShort();
                        var28 = 0;
                        if (var8 != 0) {
                            var28 = var3.readUnsignedByte();
                            if (var28 == 255) {
                                var28 = var3.readInt();
                            }
                        }
                        if (((var19 != null) && (var25 >= 0)) && (var25 < var19.itemIds.length)) {
                            var19.itemIds[var25] = var8;
                            var19.itemQuantities[var25] = var28;
                        }
                    }
                    if (var19 != null) {
                        class112.invalidateWidget(var19);
                    }
                    WorldMapAreaData.method4855();
                    changedItemContainers[((++field494) - 1) & 31] = var5 & 32767;
                    var1.serverPacket = null;
                    return true;
                }
                Widget var30;
                if (ServerPacket.field3008 == var1.serverPacket) {
                    var17 = var3.readInt();
                    var5 = var3.readUnsignedIntIME();
                    InterfaceParent var63 = ((InterfaceParent) (interfaceParents.get(((long) (var17)))));
                    var7 = ((InterfaceParent) (interfaceParents.get(((long) (var5)))));
                    if (var7 != null) {
                        class127.closeInterface(var7, (var63 == null) || (var7.group != var63.group));
                    }
                    if (var63 != null) {
                        var63.remove();
                        interfaceParents.put(var63, ((long) (var5)));
                    }
                    var30 = class130.getWidget(var17);
                    if (var30 != null) {
                        class112.invalidateWidget(var30);
                    }
                    var30 = class130.getWidget(var5);
                    if (var30 != null) {
                        class112.invalidateWidget(var30);
                        PcmPlayer.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var30.id >>> 16], var30, true);
                    }
                    if (rootInterface != (-1)) {
                        DevicePcmPlayerProvider.runIntfCloseListeners(rootInterface, 1);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3040 == var1.serverPacket) {
                    class65.privateChatMode = class231.method4764(var3.readUnsignedByte());
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3020 == var1.serverPacket) {
                    if (class67.friendsChat != null) {
                        class67.friendsChat.method6299(var3);
                    }
                    class131.method2793();
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2973 == var1.serverPacket) {
                    var17 = var3.readInt();
                    var5 = var3.readUnsignedShort();
                    if (var17 < (-70000)) {
                        var5 += 32768;
                    }
                    if (var17 >= 0) {
                        var19 = class130.getWidget(var17);
                    } else {
                        var19 = null;
                    }
                    if (var19 != null) {
                        for (var25 = 0; var25 < var19.itemIds.length; ++var25) {
                            var19.itemIds[var25] = 0;
                            var19.itemQuantities[var25] = 0;
                        }
                    }
                    Ignored.clearItemContainer(var5);
                    var25 = var3.readUnsignedShort();
                    for (var8 = 0; var8 < var25; ++var8) {
                        var28 = var3.readUnsignedShortAdd();
                        var39 = var3.readUnsignedByteAdd();
                        if (var39 == 255) {
                            var39 = var3.readUnsignedIntME();
                        }
                        if ((var19 != null) && (var8 < var19.itemIds.length)) {
                            var19.itemIds[var8] = var28;
                            var19.itemQuantities[var8] = var39;
                        }
                        WorldMapElement.itemContainerSetItem(var5, var8, var28 - 1, var39);
                    }
                    if (var19 != null) {
                        class112.invalidateWidget(var19);
                    }
                    WorldMapAreaData.method4855();
                    changedItemContainers[((++field494) - 1) & 31] = var5 & 32767;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2997 == var1.serverPacket) {
                    var17 = var3.readUnsignedByte();
                    if (var3.readUnsignedByte() == 0) {
                        grandExchangeOffers[var17] = new GrandExchangeOffer();
                        var3.offset += 18;
                    } else {
                        --var3.offset;
                        grandExchangeOffers[var17] = new GrandExchangeOffer(var3, false);
                    }
                    field703 = cycleCntr;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2986 == var1.serverPacket) {
                    UserComparator7.method2463(class255.field2941);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2974 == var1.serverPacket) {
                    UserComparator7.method2463(class255.field2946);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3023 == var1.serverPacket) {
                    var17 = var3.readInt();
                    var5 = var3.readInt();
                    var6 = BuddyRankComparator.getGcDuration();
                    PacketBufferNode var52 = class135.getPacketBufferNode(ClientPacket.field2890, Client.packetWriter.isaacCipher);
                    var52.packetBuffer.writeIntME(var17);
                    var52.packetBuffer.writeIntME(var5);
                    var52.packetBuffer.writeByteNeg(var6);
                    var52.packetBuffer.writeByteSub(GameEngine.fps);
                    packetWriter.addNode(var52);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3013 == var1.serverPacket) {
                    UserComparator7.method2463(class255.field2943);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3043 == var1.serverPacket) {
                    class133.logOut();
                    var1.serverPacket = null;
                    return false;
                }
                if (ServerPacket.field3014 == var1.serverPacket) {
                    UserComparator7.method2463(class255.field2944);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3000 == var1.serverPacket) {
                    ClanSettings.friendSystem.readUpdate(var3, var1.serverPacketLength);
                    field600 = cycleCntr;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2988 == var1.serverPacket) {
                    WorldMapAreaData.method4855();
                    weight = var3.readShort();
                    field705 = cycleCntr;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3044 == var1.serverPacket) {
                    WorldMapAreaData.method4855();
                    runEnergy = var3.readUnsignedByte();
                    field705 = cycleCntr;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2965 == var1.serverPacket) {
                    var17 = var3.readUnsignedShort();
                    var5 = var3.readUnsignedIntIME();
                    var6 = var3.readUnsignedShort();
                    var25 = var3.readUnsignedShortAdd();
                    var30 = class130.getWidget(var5);
                    if (((var25 != var30.modelAngleX) || (var17 != var30.modelAngleY)) || (var6 != var30.modelZoom)) {
                        var30.modelAngleX = var25;
                        var30.modelAngleY = var17;
                        var30.modelZoom = var6;
                        class112.invalidateWidget(var30);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                long var40;
                if (ServerPacket.field3055 == var1.serverPacket) {
                    var48 = var3.readStringCp1252NullTerminated();
                    var20 = var3.readLong();
                    var22 = ((long) (var3.readUnsignedShort()));
                    var26 = ((long) (var3.readMedium()));
                    PlayerType var11 = ((PlayerType) (class140.findEnumerated(MidiPcmStream.PlayerType_values(), var3.readUnsignedByte())));
                    var40 = var26 + (var22 << 32);
                    boolean var57 = false;
                    for (var15 = 0; var15 < 100; ++var15) {
                        if (crossWorldMessageIds[var15] == var40) {
                            var57 = true;
                            break;
                        }
                    }
                    if (var11.isUser && ClanSettings.friendSystem.isIgnored(new Username(var48, VarcInt.loginType))) {
                        var57 = true;
                    }
                    if ((!var57) && (field658 == 0)) {
                        crossWorldMessageIds[crossWorldMessageIdsIndex] = var40;
                        crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                        var38 = AbstractFont.escapeBrackets(ModelData0.method4273(GrandExchangeOfferUnitPriceComparator.method5755(var3)));
                        if (var11.modIcon != (-1)) {
                            GraphicsObject.addChatMessage(9, WorldMapSectionType.method4720(var11.modIcon) + var48, var38, class335.base37DecodeLong(var20));
                        } else {
                            GraphicsObject.addChatMessage(9, var48, var38, class335.base37DecodeLong(var20));
                        }
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2987 == var1.serverPacket) {
                    if (var1.serverPacketLength == 0) {
                        class67.friendsChat = null;
                    } else {
                        if (class67.friendsChat == null) {
                            class67.friendsChat = new FriendsChat(VarcInt.loginType, class414.client);
                        }
                        class67.friendsChat.readUpdate(var3);
                    }
                    class131.method2793();
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3007 == var1.serverPacket) {
                    if (class221.field2680 == null) {
                        class221.field2680 = new class375(FloorOverlayDefinition.HitSplatDefinition_cached);
                    }
                    class428 var47 = FloorOverlayDefinition.HitSplatDefinition_cached.method6784(var3);
                    class221.field2680.field4268.vmethod7140(var47.field4576, var47.field4575);
                    field696[((++field697) - 1) & 31] = var47.field4576;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3003 == var1.serverPacket) {
                    var17 = var3.offset + var1.serverPacketLength;
                    var5 = var3.readUnsignedShort();
                    var6 = var3.readUnsignedShort();
                    if (var5 != rootInterface) {
                        rootInterface = var5;
                        this.resizeRoot(false);
                        class336.Widget_resetModelFrames(rootInterface);
                        Occluder.runWidgetOnLoadListener(rootInterface);
                        for (var25 = 0; var25 < 100; ++var25) {
                            field713[var25] = true;
                        }
                    }
                    InterfaceParent var29;
                    for (; (var6--) > 0; var29.field1040 = true) {
                        var25 = var3.readInt();
                        var8 = var3.readUnsignedShort();
                        var28 = var3.readUnsignedByte();
                        var29 = ((InterfaceParent) (interfaceParents.get(((long) (var25)))));
                        if ((var29 != null) && (var8 != var29.group)) {
                            class127.closeInterface(var29, true);
                            var29 = null;
                        }
                        if (var29 == null) {
                            var29 = class233.method4772(var25, var8, var28);
                        }
                    }
                    for (var7 = ((InterfaceParent) (interfaceParents.first())); var7 != null; var7 = ((InterfaceParent) (interfaceParents.next()))) {
                        if (var7.field1040) {
                            var7.field1040 = false;
                        } else {
                            class127.closeInterface(var7, true);
                        }
                    }
                    widgetFlags = new NodeHashTable(512);
                    while (var3.offset < var17) {
                        var25 = var3.readInt();
                        var8 = var3.readUnsignedShort();
                        var28 = var3.readUnsignedShort();
                        var39 = var3.readInt();
                        for (int var79 = var8; var79 <= var28; ++var79) {
                            var40 = (((long) (var25)) << 32) + ((long) (var79));
                            widgetFlags.put(new IntegerNode(var39), var40);
                        }
                    } 
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3017 == var1.serverPacket) {
                    HealthBarUpdate.field1178 = true;
                    class368.updateNpcs(true, var3);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3030 == var1.serverPacket) {
                    var59 = var3.readByte();
                    var20 = ((long) (var3.readUnsignedShort()));
                    var22 = ((long) (var3.readMedium()));
                    var26 = var22 + (var20 << 32);
                    boolean var42 = false;
                    ClanChannel var43 = (var59 >= 0) ? currentClanChannels[var59] : InterfaceParent.guestClanChannel;
                    if (var43 == null) {
                        var42 = true;
                    } else {
                        for (var13 = 0; var13 < 100; ++var13) {
                            if (crossWorldMessageIds[var13] == var26) {
                                var42 = true;
                                break;
                            }
                        }
                    }
                    if (!var42) {
                        crossWorldMessageIds[crossWorldMessageIdsIndex] = var26;
                        crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                        var24 = GrandExchangeOfferUnitPriceComparator.method5755(var3);
                        int var14 = (var59 >= 0) ? 43 : 46;
                        GraphicsObject.addChatMessage(var14, "", var24, var43.name);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2981 == var1.serverPacket) {
                    var17 = var3.readUnsignedShortAddLE();
                    rootInterface = var17;
                    this.resizeRoot(false);
                    class336.Widget_resetModelFrames(var17);
                    Occluder.runWidgetOnLoadListener(rootInterface);
                    for (var5 = 0; var5 < 100; ++var5) {
                        field713[var5] = true;
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2992 == var1.serverPacket) {
                    field503 = cycleCntr;
                    var59 = var3.readByte();
                    if (var1.serverPacketLength == 1) {
                        if (var59 >= 0) {
                            currentClanChannels[var59] = null;
                        } else {
                            InterfaceParent.guestClanChannel = null;
                        }
                        var1.serverPacket = null;
                        return true;
                    }
                    if (var59 >= 0) {
                        currentClanChannels[var59] = new ClanChannel(var3);
                    } else {
                        InterfaceParent.guestClanChannel = new ClanChannel(var3);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3053 == var1.serverPacket) {
                    UserComparator7.method2463(class255.field2942);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2983 == var1.serverPacket) {
                    RouteStrategy.readReflectionCheck(var3, var1.serverPacketLength);
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3035 == var1.serverPacket) {
                    isCameraLocked = true;
                    field755 = false;
                    Message.field478 = var3.readUnsignedByte();
                    class12.field75 = var3.readUnsignedByte();
                    class121.field1492 = var3.readUnsignedShort();
                    SceneTilePaint.field2543 = var3.readUnsignedByte();
                    class4.field17 = var3.readUnsignedByte();
                    if (class4.field17 >= 100) {
                        class414.cameraX = (Message.field478 * 128) + 64;
                        GrandExchangeOfferOwnWorldComparator.cameraZ = (class12.field75 * 128) + 64;
                        WorldMapDecoration.cameraY = class92.getTileHeight(class414.cameraX, GrandExchangeOfferOwnWorldComparator.cameraZ, SoundSystem.Client_plane) - class121.field1492;
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2966 == var1.serverPacket) {
                    World var46 = new World();
                    var46.host = var3.readStringCp1252NullTerminated();
                    var46.id = var3.readUnsignedShort();
                    var5 = var3.readInt();
                    var46.properties = var5;
                    class111.updateGameState(45);
                    var2.close();
                    var2 = null;
                    InterfaceParent.changeWorld(var46);
                    var1.serverPacket = null;
                    return false;
                }
                if ((ServerPacket.field3002 == var1.serverPacket) && isCameraLocked) {
                    field755 = true;
                    SceneTilePaint.field2543 = var3.readUnsignedByte();
                    class4.field17 = var3.readUnsignedByte();
                    WorldMapSectionType.field2723 = var3.readUnsignedByte();
                    WallDecoration.field2573 = var3.readUnsignedByte();
                    for (var17 = 0; var17 < 5; ++var17) {
                        field753[var17] = false;
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2984 == var1.serverPacket) {
                    WorldMapSection2.method4360();
                    var59 = var3.readByte();
                    if (var1.serverPacketLength == 1) {
                        if (var59 >= 0) {
                            currentClanSettings[var59] = null;
                        } else {
                            UserComparator7.guestClanSettings = null;
                        }
                        var1.serverPacket = null;
                        return true;
                    }
                    if (var59 >= 0) {
                        currentClanSettings[var59] = new ClanSettings(var3);
                    } else {
                        UserComparator7.guestClanSettings = new ClanSettings(var3);
                    }
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2979 == var1.serverPacket) {
                    var17 = var3.readUnsignedIntME();
                    var5 = var3.readUnsignedShortAddLE();
                    Varps.Varps_temp[var5] = var17;
                    if (Varps.Varps_main[var5] != var17) {
                        Varps.Varps_main[var5] = var17;
                    }
                    NetFileRequest.changeGameOptions(var5);
                    changedVarps[((++changedVarpCount) - 1) & 31] = var5;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3058 == var1.serverPacket) {
                    var17 = var3.readUnsignedShort();
                    byte var50 = var3.readByteNeg();
                    Varps.Varps_temp[var17] = var50;
                    if (Varps.Varps_main[var17] != var50) {
                        Varps.Varps_main[var17] = var50;
                    }
                    NetFileRequest.changeGameOptions(var17);
                    changedVarps[((++changedVarpCount) - 1) & 31] = var17;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3031 == var1.serverPacket) {
                    rebootTimer = var3.readUnsignedShortAddLE() * 30;
                    field705 = cycleCntr;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3006 == var1.serverPacket) {
                    var17 = var3.readUnsignedByte();
                    var5 = var3.readUnsignedByte();
                    var6 = var3.readUnsignedByte();
                    var25 = var3.readUnsignedByte();
                    field753[var17] = true;
                    field754[var17] = var5;
                    field733[var17] = var6;
                    field500[var17] = var25;
                    field757[var17] = 0;
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field3037 == var1.serverPacket) {
                    class33.field243 = var3.readUnsignedByteAdd();
                    Canvas.field157 = var3.readUnsignedByteSub();
                    var1.serverPacket = null;
                    return true;
                }
                if (ServerPacket.field2991 == var1.serverPacket) {
                    var17 = var3.readInt();
                    if (var17 != field513) {
                        field513 = var17;
                        class290.method5477();
                    }
                    var1.serverPacket = null;
                    return true;
                }
                FloorDecoration.RunException_sendStackTrace((((((("" + (var1.serverPacket != null ? (var1.serverPacket.id * 510830107) * 1275315219 : -1)) + ",") + (var1.field1326 != null ? (var1.field1326.id * 510830107) * 1275315219 : -1)) + ",") + (var1.field1327 != null ? (var1.field1327.id * 510830107) * 1275315219 : -1)) + ",") + var1.serverPacketLength, ((Throwable) (null)));
                class133.logOut();
            } catch (IOException var44) {
                class17.method258();
            } catch (Exception var45) {
                var18 = ((((((((((("" + (var1.serverPacket != null ? (var1.serverPacket.id * 510830107) * 1275315219 : -1)) + ",") + (var1.field1326 != null ? (var1.field1326.id * 510830107) * 1275315219 : -1)) + ",") + (var1.field1327 != null ? (var1.field1327.id * 510830107) * 1275315219 : -1)) + ",") + var1.serverPacketLength) + ",") + (WorldMapSprite.localPlayer.pathX[0] + Canvas.baseX)) + ",") + (WorldMapSprite.localPlayer.pathY[0] + class118.baseY)) + ",";
                for (var6 = 0; (var6 < var1.serverPacketLength) && (var6 < 50); ++var6) {
                    var18 = (var18 + var3.array[var6]) + ",";
                }
                FloorDecoration.RunException_sendStackTrace(var18, var45);
                class133.logOut();
            }
            return true;
        }
    }

    @ObfuscatedName("iu")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-215127232")
    @Export("menu")
    final void menu() {
        GrandExchangeEvents.incrementMenuEntries();
        if (class20.dragInventoryWidget == null) {
            if (clickedWidget == null) {
                int var1 = MouseHandler.MouseHandler_lastButton;
                int var2;
                int var4;
                int var5;
                int var6;
                int var9;
                int var14;
                if (isMenuOpen) {
                    int var3;
                    if ((var1 != 1) && (class370.mouseCam || (var1 != 4))) {
                        var2 = MouseHandler.MouseHandler_x;
                        var3 = MouseHandler.MouseHandler_y;
                        if ((((var2 < (Projectile.menuX - 10)) || (var2 > ((Calendar.menuWidth + Projectile.menuX) + 10))) || (var3 < (ReflectionCheck.menuY - 10))) || (var3 > ((ReflectionCheck.menuY + ScriptFrame.menuHeight) + 10))) {
                            isMenuOpen = false;
                            SceneTilePaint.method4268(Projectile.menuX, ReflectionCheck.menuY, Calendar.menuWidth, ScriptFrame.menuHeight);
                        }
                    }
                    if ((var1 == 1) || ((!class370.mouseCam) && (var1 == 4))) {
                        var2 = Projectile.menuX;
                        var3 = ReflectionCheck.menuY;
                        var4 = Calendar.menuWidth;
                        var5 = MouseHandler.MouseHandler_lastPressedX;
                        var6 = MouseHandler.MouseHandler_lastPressedY;
                        var14 = -1;
                        int var17;
                        for (var17 = 0; var17 < menuOptionsCount; ++var17) {
                            var9 = (var3 + (((menuOptionsCount - 1) - var17) * 15)) + 31;
                            if ((((var5 > var2) && (var5 < (var2 + var4))) && (var6 > (var9 - 13))) && (var6 < (var9 + 3))) {
                                var14 = var17;
                            }
                        }
                        if ((var14 != (-1)) && (var14 >= 0)) {
                            var17 = menuArguments1[var14];
                            var9 = menuArguments2[var14];
                            int var10 = menuOpcodes[var14];
                            int var11 = menuIdentifiers[var14];
                            String var12 = menuActions[var14];
                            String var13 = menuTargets[var14];
                            class18.menuAction(var17, var9, var10, var11, var12, var13, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
                        }
                        isMenuOpen = false;
                        SceneTilePaint.method4268(Projectile.menuX, ReflectionCheck.menuY, Calendar.menuWidth, ScriptFrame.menuHeight);
                    }
                } else {
                    var2 = menuOptionsCount - 1;
                    if (((var1 == 1) || ((!class370.mouseCam) && (var1 == 4))) && (var2 >= 0)) {
                        var4 = menuOpcodes[var2];
                        if ((((((((((((var4 == 39) || (var4 == 40)) || (var4 == 41)) || (var4 == 42)) || (var4 == 43)) || (var4 == 33)) || (var4 == 34)) || (var4 == 35)) || (var4 == 36)) || (var4 == 37)) || (var4 == 38)) || (var4 == 1005)) {
                            label238 : {
                                var5 = menuArguments1[var2];
                                var6 = menuArguments2[var2];
                                Widget var7 = class130.getWidget(var6);
                                var9 = Language.getWidgetFlags(var7);
                                boolean var8 = ((var9 >> 28) & 1) != 0;
                                if (!var8) {
                                    Object var10000 = null;
                                    if (!HorizontalAlignment.method3275(Language.getWidgetFlags(var7))) {
                                        break label238;
                                    }
                                }
                                if ((((class20.dragInventoryWidget != null) && (!field616)) && (menuOptionsCount > 0)) && (!this.shouldLeftClickOpenMenu())) {
                                    Tiles.method2054(draggedWidgetX, draggedWidgetY);
                                }
                                field616 = false;
                                itemDragDuration = 0;
                                if (class20.dragInventoryWidget != null) {
                                    class112.invalidateWidget(class20.dragInventoryWidget);
                                }
                                class20.dragInventoryWidget = class130.getWidget(var6);
                                dragItemSlotSource = var5;
                                draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
                                draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
                                if (var2 >= 0) {
                                    ScriptFrame.method1076(var2);
                                }
                                class112.invalidateWidget(class20.dragInventoryWidget);
                                return;
                            }
                        }
                    }
                    if (((var1 == 1) || ((!class370.mouseCam) && (var1 == 4))) && this.shouldLeftClickOpenMenu()) {
                        var1 = 2;
                    }
                    if ((((var1 == 1) || ((!class370.mouseCam) && (var1 == 4))) && (menuOptionsCount > 0)) && (var2 >= 0)) {
                        var4 = menuArguments1[var2];
                        var5 = menuArguments2[var2];
                        var6 = menuOpcodes[var2];
                        var14 = menuIdentifiers[var2];
                        String var15 = menuActions[var2];
                        String var16 = menuTargets[var2];
                        class18.menuAction(var4, var5, var6, var14, var15, var16, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
                    }
                    if ((var1 == 2) && (menuOptionsCount > 0)) {
                        this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ip")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-100310681")
    @Export("shouldLeftClickOpenMenu")
    final boolean shouldLeftClickOpenMenu() {
        int var1 = menuOptionsCount - 1;
        boolean var3 = (leftClickOpensMenu == 1) && (menuOptionsCount > 2);
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
        return var3 && (!menuShiftClick[var1]);
    }

    @ObfuscatedName("if")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "337278524")
    @Export("openMenu")
    final void openMenu(int var1, int var2) {
        Interpreter.method1875(var1, var2);
        var1 -= viewportOffsetX;
        var2 -= viewportOffsetY;
        Decimator.scene.menuOpen(SoundSystem.Client_plane, var1, var2, false);
        isMenuOpen = true;
    }

    @ObfuscatedName("jh")
    @ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "26")
    @Export("resizeRoot")
    final void resizeRoot(boolean var1) {
        int var2 = rootInterface;
        int var3 = DirectByteArrayCopier.canvasWidth;
        int var4 = NPC.canvasHeight;
        if (class13.loadInterface(var2)) {
            class21.resizeInterface(Widget.Widget_interfaceComponents[var2], -1, var3, var4, var1);
        }
    }

    @ObfuscatedName("jr")
    @ObfuscatedSignature(descriptor = "(Ljz;I)V", garbageValue = "-1480251945")
    @Export("alignWidget")
    void alignWidget(Widget var1) {
        Widget var2 = (var1.parentId == (-1)) ? null : class130.getWidget(var1.parentId);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = DirectByteArrayCopier.canvasWidth;
            var4 = NPC.canvasHeight;
        } else {
            var3 = var2.width;
            var4 = var2.height;
        }
        class141.alignWidgetSize(var1, var3, var4, false);
        NetCache.alignWidgetPosition(var1, var3, var4);
    }

    @ObfuscatedName("jt")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1701477601")
    final void method1149() {
        class112.invalidateWidget(clickedWidget);
        ++ByteArrayPool.widgetDragDuration;
        if (field648 && field682) {
            int var1 = MouseHandler.MouseHandler_x;
            int var2 = MouseHandler.MouseHandler_y;
            var1 -= widgetClickX;
            var2 -= widgetClickY;
            if (var1 < field606) {
                var1 = field606;
            }
            if ((var1 + Client.clickedWidget.width) > (field606 + Client.clickedWidgetParent.width)) {
                var1 = (field606 + Client.clickedWidgetParent.width) - Client.clickedWidget.width;
            }
            if (var2 < field561) {
                var2 = field561;
            }
            if ((var2 + Client.clickedWidget.height) > (field561 + Client.clickedWidgetParent.height)) {
                var2 = (field561 + Client.clickedWidgetParent.height) - Client.clickedWidget.height;
            }
            int var3 = var1 - field686;
            int var4 = var2 - field687;
            int var5 = Client.clickedWidget.dragZoneSize;
            if ((ByteArrayPool.widgetDragDuration > Client.clickedWidget.dragThreshold) && ((((var3 > var5) || (var3 < (-var5))) || (var4 > var5)) || (var4 < (-var5)))) {
                isDraggingWidget = true;
            }
            int var6 = (var1 - field606) + Client.clickedWidgetParent.scrollX;
            int var7 = (var2 - field561) + Client.clickedWidgetParent.scrollY;
            ScriptEvent var8;
            if ((Client.clickedWidget.onDrag != null) && isDraggingWidget) {
                var8 = new ScriptEvent();
                var8.widget = clickedWidget;
                var8.mouseX = var6;
                var8.mouseY = var7;
                var8.args = Client.clickedWidget.onDrag;
                class92.runScriptEvent(var8);
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
                        class92.runScriptEvent(var8);
                    }
                    if (draggedOnWidget != null) {
                        Widget var9 = clickedWidget;
                        int var10 = GrandExchangeOfferOwnWorldComparator.method1118(Language.getWidgetFlags(var9));
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
                                var9 = class130.getWidget(var9.parentId);
                                if (var9 == null) {
                                    var13 = null;
                                    break;
                                }
                                ++var11;
                            } 
                        }
                        if (var13 != null) {
                            PacketBufferNode var12 = class135.getPacketBufferNode(ClientPacket.field2847, Client.packetWriter.isaacCipher);
                            var12.packetBuffer.writeShortLE(Client.draggedOnWidget.childIndex);
                            var12.packetBuffer.writeInt(Client.clickedWidget.id);
                            var12.packetBuffer.writeShortAdd(Client.draggedOnWidget.itemId);
                            var12.packetBuffer.writeShortLE(Client.clickedWidget.itemId);
                            var12.packetBuffer.writeIntME(Client.draggedOnWidget.id);
                            var12.packetBuffer.writeShort(Client.clickedWidget.childIndex);
                            packetWriter.addNode(var12);
                        }
                    }
                } else if (this.shouldLeftClickOpenMenu()) {
                    this.openMenu(field686 + widgetClickX, field687 + widgetClickY);
                } else if (menuOptionsCount > 0) {
                    Tiles.method2054(widgetClickX + field686, field687 + widgetClickY);
                }
                clickedWidget = null;
            }
        } else if (ByteArrayPool.widgetDragDuration > 1) {
            clickedWidget = null;
        }
    }

    @ObfuscatedName("ll")
    @ObfuscatedSignature(descriptor = "(B)Lpb;", garbageValue = "0")
    @Export("username")
    public Username username() {
        return WorldMapSprite.localPlayer != null ? WorldMapSprite.localPlayer.username : null;
    }

    public boolean isOnLoginScreen() {
        return gameState == 10;
    }

    public final void init() {
        try {
            if (this.checkHost()) {
                for (int var1 = 0; var1 <= 27; ++var1) {
                    String var2 = this.getParameter(Integer.toString(var1));
                    if (var2 != null) {
                        int var4;
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
                                Language var13;
                                if ((var4 >= 0) && (var4 < Language.Language_valuesOrdered.length)) {
                                    var13 = Language.Language_valuesOrdered[var4];
                                } else {
                                    var13 = null;
                                }
                                class122.clientLanguage = var13;
                                break;
                            case 7 :
                                var4 = Integer.parseInt(var2);
                                GameBuild[] var5 = new GameBuild[]{ GameBuild.LIVE, GameBuild.WIP, GameBuild.BUILDLIVE, GameBuild.RC };
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
                                Language.field3990 = var3;
                                break;
                            case 8 :
                                if (var2.equalsIgnoreCase("true")) {
                                }
                                break;
                            case 9 :
                                ReflectionCheck.field256 = var2;
                                break;
                            case 10 :
                                HorizontalAlignment.field1846 = ((StudioGame) (class140.findEnumerated(WorldMapAreaData.method4851(), Integer.parseInt(var2))));
                                if (StudioGame.oldscape == HorizontalAlignment.field1846) {
                                    VarcInt.loginType = LoginType.oldscape;
                                } else {
                                    VarcInt.loginType = LoginType.field4454;
                                }
                                break;
                            case 11 :
                                FileSystem.field1707 = var2;
                                break;
                            case 12 :
                                worldId = Integer.parseInt(var2);
                                break;
                            case 14 :
                                class87.field1218 = Integer.parseInt(var2);
                                break;
                            case 15 :
                                gameBuild = Integer.parseInt(var2);
                                break;
                            case 17 :
                                ModelData0.field2546 = var2;
                                break;
                            case 21 :
                                field699 = Integer.parseInt(var2);
                                break;
                            case 22 :
                                field554 = Integer.parseInt(var2) != 0;
                        }
                    }
                }
                AttackOption.method2293();
                HealthBar.worldHost = this.getCodeBase().getHost();
                String var9 = Language.field3990.name;
                byte var10 = 0;
                try {
                    Interpreter.method1876("oldschool", var9, var10, 21);
                } catch (Exception var11) {
                    FloorDecoration.RunException_sendStackTrace(((String) (null)), var11);
                }
                class414.client = this;
                RunException.clientType = clientType;
                if (field502 == (-1)) {
                    field502 = 0;
                }
                LoginScreenAnimation.field1200 = System.getenv("JX_ACCESS_TOKEN");
                System.getenv("JX_REFRESH_TOKEN");
                this.startThread(765, 503, 203);
            }
        } catch (RuntimeException var12) {
            throw ByteArrayPool.newRunException(var12, "client.init(" + ')');
        }
    }

    public void setOtlTokenRequester(OtlTokenRequester var1) {
        if (var1 != null) {
            this.field510 = var1;
            Player.method2159(10);
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)Lfn;", garbageValue = "1114292674")
    @Export("ItemDefinition_get")
    public static ItemComposition ItemDefinition_get(int var0) {
        ItemComposition var1 = ((ItemComposition) (ItemComposition.ItemDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = DefaultsGroup.ItemDefinition_archive.takeFile(10, var0);
            var1 = new ItemComposition();
            var1.id = var0;
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            var1.post();
            if (var1.noteTemplate != (-1)) {
                var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
            }
            if (var1.notedId != (-1)) {
                var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
            }
            if (var1.placeholderTemplate != (-1)) {
                var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
            }
            if ((!MilliClock.ItemDefinition_inMembersWorld) && var1.isMembersOnly) {
                var1.name = "Members object";
                var1.isTradable = false;
                int var3;
                for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
                    var1.groundActions[var3] = null;
                }
                for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
                    if (var3 != 4) {
                        var1.inventoryActions[var3] = null;
                    }
                }
                var1.shiftClickIndex = -2;
                var1.team = 0;
                if (var1.params != null) {
                    boolean var6 = false;
                    for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
                        ParamComposition var5 = HealthBarUpdate.getParamDefinition(((int) (var4.key)));
                        if (var5.autoDisable) {
                            var4.remove();
                        } else {
                            var6 = true;
                        }
                    }
                    if (!var6) {
                        var1.params = null;
                    }
                }
            }
            ItemComposition.ItemDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SI)V", garbageValue = "79995270")
    public static void method1632(String[] var0, short[] var1) {
        MusicPatch.sortItemsByName(var0, var1, 0, var0.length - 1);
    }

    @ObfuscatedName("t")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "98")
    static int method1630(int var0, Script var1, boolean var2) {
        if (var0 == ScriptOpcodes.SOUND_SYNTH) {
            Interpreter.Interpreter_intStackSize -= 3;
            ObjectComposition.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
            return 1;
        } else if (var0 == ScriptOpcodes.SOUND_SONG) {
            WorldMapSection2.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            return 1;
        } else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
            Interpreter.Interpreter_intStackSize -= 2;
            class186.method3695(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
            return 1;
        } else {
            int var3;
            int var4;
            if (((((var0 != 3209) && (var0 != 3181)) && (var0 != 3203)) && (var0 != 3205)) && (var0 != 3207)) {
                if (((((var0 != 3210) && (var0 != 3182)) && (var0 != 3204)) && (var0 != 3206)) && (var0 != 3208)) {
                    return var0 == 3211 ? 1 : 2;
                } else {
                    var3 = 0;
                    var4 = 0;
                    if (var0 == 3210) {
                        var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    } else if (var0 == 3182) {
                        var3 = 6;
                    } else if (var0 == 3204) {
                        var3 = 7;
                    } else if (var0 == 3206) {
                        var3 = 8;
                    } else if (var0 == 3208) {
                        var3 = 9;
                    }
                    if (var3 == 6) {
                        float var5 = (((float) (class424.clientPreferences.brightness)) - 0.5F) * 200.0F;
                        var4 = 100 - Math.round(var5);
                    } else if (var3 == 7) {
                        var4 = Math.round(((float) (class424.clientPreferences.musicVolume)) / 2.55F);
                    } else if (var3 == 8) {
                        var4 = Math.round(((float) (class424.clientPreferences.soundEffectsVolume)) / 1.27F);
                    } else if (var3 == 9) {
                        var4 = Math.round(((float) (class424.clientPreferences.areaSoundEffectsVolume)) / 1.27F);
                    }
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4;
                    return 1;
                }
            } else {
                var3 = 0;
                var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                if (var0 == 3209) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                } else if (var0 == 3181) {
                    var3 = 6;
                } else if (var0 == 3203) {
                    var3 = 7;
                } else if (var0 == 3205) {
                    var3 = 8;
                } else if (var0 == 3207) {
                    var3 = 9;
                }
                if (var3 == 6) {
                    var4 = 100 - Math.min(Math.max(var4, 0), 100);
                    LoginType.method7149(((double) ((((float) (var4)) / 200.0F) + 0.5F)));
                } else if (var3 == 7) {
                    var4 = Math.min(Math.max(var4, 0), 100);
                    class21.method299(Math.round(2.55F * ((float) (var4))));
                } else if (var3 == 8) {
                    var4 = Math.min(Math.max(var4, 0), 100);
                    MouseHandler.updateSoundEffectVolume(Math.round(1.27F * ((float) (var4))));
                } else if (var3 == 9) {
                    var4 = Math.min(Math.max(var4, 0), 100);
                    UrlRequest.method2424(Math.round(1.27F * ((float) (var4))));
                }
                return 1;
            }
        }
    }
}