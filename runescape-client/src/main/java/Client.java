import com.jagex.oldscape.pub.OtlTokenRequester;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
   @ObfuscatedName("sh")
   @ObfuscatedSignature(
      descriptor = "[Ler;"
   )
   @Export("currentClanSettings")
   static ClanSettings[] currentClanSettings;
   @ObfuscatedName("vf")
   @ObfuscatedGetter(
      intValue = -1428536373
   )
   public static int field793;
   @ObfuscatedName("sr")
   @Export("playingJingle")
   static boolean playingJingle;
   @ObfuscatedName("ur")
   @ObfuscatedGetter(
      intValue = 2083770115
   )
   @Export("viewportOffsetX")
   static int viewportOffsetX;
   @ObfuscatedName("ut")
   @ObfuscatedGetter(
      intValue = 1090543081
   )
   @Export("viewportOffsetY")
   static int viewportOffsetY;
   @ObfuscatedName("wm")
   @ObfuscatedSignature(
      descriptor = "Lbc;"
   )
   static final ApproximateRouteStrategy field790;
   @ObfuscatedName("vr")
   @Export("archiveLoaders")
   static ArrayList archiveLoaders;
   @ObfuscatedName("wq")
   static int[] field693;
   @ObfuscatedName("wx")
   static int[] field792;
   @ObfuscatedName("vh")
   @ObfuscatedGetter(
      intValue = 1275523615
   )
   @Export("archiveLoadersDone")
   static int archiveLoadersDone;
   @ObfuscatedName("tt")
   @Export("isCameraLocked")
   static boolean isCameraLocked;
   @ObfuscatedName("ta")
   static boolean field758;
   @ObfuscatedName("sk")
   @ObfuscatedGetter(
      intValue = 2034935779
   )
   @Export("currentTrackGroupId")
   static int currentTrackGroupId;
   @ObfuscatedName("uq")
   @ObfuscatedGetter(
      intValue = 301417933
   )
   static int field539;
   @ObfuscatedName("tv")
   @ObfuscatedGetter(
      intValue = 1205447809
   )
   @Export("soundEffectCount")
   static int soundEffectCount;
   @ObfuscatedName("uc")
   @ObfuscatedSignature(
      descriptor = "Lks;"
   )
   @Export("playerAppearance")
   static PlayerComposition playerAppearance;
   @ObfuscatedName("uw")
   static boolean[] field556;
   @ObfuscatedName("tn")
   @Export("soundEffectIds")
   static int[] soundEffectIds;
   @ObfuscatedName("uu")
   @ObfuscatedSignature(
      descriptor = "Lpt;"
   )
   @Export("platformInfoProvider")
   static PlatformInfoProvider platformInfoProvider;
   @ObfuscatedName("uh")
   @ObfuscatedGetter(
      intValue = 656131205
   )
   static int field543;
   @ObfuscatedName("tz")
   @Export("queuedSoundEffectLoops")
   static int[] queuedSoundEffectLoops;
   @ObfuscatedName("tr")
   @Export("queuedSoundEffectDelays")
   static int[] queuedSoundEffectDelays;
   @ObfuscatedName("sj")
   @ObfuscatedGetter(
      intValue = 1232216623
   )
   @Export("destinationX")
   static int destinationX;
   @ObfuscatedName("sz")
   @ObfuscatedGetter(
      intValue = 1127045003
   )
   @Export("destinationY")
   static int destinationY;
   @ObfuscatedName("tp")
   @ObfuscatedSignature(
      descriptor = "[Lag;"
   )
   @Export("soundEffects")
   static SoundEffect[] soundEffects;
   @ObfuscatedName("th")
   @Export("soundLocations")
   static int[] soundLocations;
   @ObfuscatedName("sw")
   @ObfuscatedGetter(
      intValue = -1525756261
   )
   @Export("minimapState")
   static int minimapState;
   @ObfuscatedName("vv")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("DBTableIndex_cache")
   static EvictingDualNodeHashTable DBTableIndex_cache;
   @ObfuscatedName("vj")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("DBTableMasterIndex_cache")
   static EvictingDualNodeHashTable DBTableMasterIndex_cache;
   @ObfuscatedName("rs")
   @ObfuscatedGetter(
      longValue = -7050977520656748003L
   )
   static long field738;
   @ObfuscatedName("sf")
   @ObfuscatedGetter(
      intValue = -420744349
   )
   static int field519;
   @ObfuscatedName("sn")
   @ObfuscatedSignature(
      descriptor = "[Leq;"
   )
   @Export("currentClanChannels")
   static ClanChannel[] currentClanChannels;
   @ObfuscatedName("uk")
   static short field764;
   @ObfuscatedName("ul")
   static short field649;
   @ObfuscatedName("ua")
   static short field562;
   @ObfuscatedName("uj")
   static short field771;
   @ObfuscatedName("vt")
   @ObfuscatedGetter(
      intValue = 1645580525
   )
   static int field588;
   @ObfuscatedName("un")
   static short field769;
   @ObfuscatedName("sp")
   @ObfuscatedGetter(
      intValue = 227322785
   )
   @Export("mapIconCount")
   static int mapIconCount;
   @ObfuscatedName("ux")
   @ObfuscatedGetter(
      intValue = -1734567293
   )
   @Export("viewportZoom")
   static int viewportZoom;
   @ObfuscatedName("uv")
   static short field601;
   @ObfuscatedName("ss")
   @Export("mapIconXs")
   static int[] mapIconXs;
   @ObfuscatedName("uz")
   @ObfuscatedGetter(
      intValue = -1010843293
   )
   @Export("viewportWidth")
   static int viewportWidth;
   @ObfuscatedName("sy")
   @Export("mapIconYs")
   static int[] mapIconYs;
   @ObfuscatedName("su")
   @ObfuscatedSignature(
      descriptor = "[Lri;"
   )
   @Export("mapIcons")
   static SpritePixels[] mapIcons;
   @ObfuscatedName("um")
   @ObfuscatedGetter(
      intValue = 355500089
   )
   @Export("viewportHeight")
   static int viewportHeight;
   @ObfuscatedName("ui")
   @Export("zoomWidth")
   static short zoomWidth;
   @ObfuscatedName("ud")
   @Export("zoomHeight")
   static short zoomHeight;
   @ObfuscatedName("rf")
   @ObfuscatedGetter(
      intValue = 987699759
   )
   static int field679;
   @ObfuscatedName("rh")
   static int[] field737;
   @ObfuscatedName("ug")
   static int[] field665;
   @ObfuscatedName("ra")
   static int[] field613;
   @ObfuscatedName("us")
   static int[] field760;
   @ObfuscatedName("uo")
   static int[] field762;
   @ObfuscatedName("up")
   static int[] field763;
   @ObfuscatedName("vb")
   @ObfuscatedSignature(
      descriptor = "[Lmi;"
   )
   @Export("grandExchangeOffers")
   static GrandExchangeOffer[] grandExchangeOffers;
   @ObfuscatedName("ve")
   @ObfuscatedSignature(
      descriptor = "Lbv;"
   )
   @Export("GrandExchangeEvents_worldComparator")
   static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
   @ObfuscatedName("vs")
   @ObfuscatedGetter(
      intValue = 391113383
   )
   static int field785;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "[Lgr;"
   )
   @Export("collisionMaps")
   static CollisionMap[] collisionMaps;
   @ObfuscatedName("bx")
   static boolean field517 = true;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -791246561
   )
   @Export("worldId")
   public static int worldId = 1;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 333694475
   )
   @Export("worldProperties")
   static int worldProperties = 0;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 1570820869
   )
   @Export("gameBuild")
   static int gameBuild = 0;
   @ObfuscatedName("bd")
   @Export("isMembersWorld")
   public static boolean isMembersWorld = false;
   @ObfuscatedName("bq")
   @Export("isLowDetail")
   static boolean isLowDetail = false;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -243147255
   )
   static int field494 = -1;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 210271959
   )
   @Export("clientType")
   static int clientType = -1;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1360270113
   )
   static int field573 = -1;
   @ObfuscatedName("by")
   @Export("onMobile")
   static boolean onMobile = false;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 801669917
   )
   public static int field789 = 209;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = -1954783269
   )
   @Export("gameState")
   static int gameState = 0;
   @ObfuscatedName("df")
   @Export("isLoading")
   static boolean isLoading = true;
   @ObfuscatedName("dc")
   @ObfuscatedGetter(
      intValue = 602500049
   )
   @Export("cycle")
   static int cycle = 0;
   @ObfuscatedName("dk")
   @ObfuscatedGetter(
      longValue = -1538799473230678833L
   )
   @Export("mouseLastLastPressedTimeMillis")
   static long mouseLastLastPressedTimeMillis = -1L;
   @ObfuscatedName("de")
   @ObfuscatedGetter(
      intValue = -1566615457
   )
   static int field504 = -1;
   @ObfuscatedName("dt")
   @ObfuscatedGetter(
      intValue = 2092341179
   )
   static int field630 = -1;
   @ObfuscatedName("da")
   @ObfuscatedGetter(
      longValue = 3869057079940378449L
   )
   static long field501 = -1L;
   @ObfuscatedName("dx")
   @Export("hadFocus")
   static boolean hadFocus = true;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = -1742148499
   )
   @Export("rebootTimer")
   static int rebootTimer = 0;
   @ObfuscatedName("dj")
   @ObfuscatedGetter(
      intValue = -374191823
   )
   @Export("hintArrowType")
   static int hintArrowType = 0;
   @ObfuscatedName("dm")
   @ObfuscatedGetter(
      intValue = -607279851
   )
   @Export("hintArrowNpcIndex")
   static int hintArrowNpcIndex = 0;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = 843945909
   )
   @Export("hintArrowPlayerIndex")
   static int hintArrowPlayerIndex = 0;
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      intValue = -1976921097
   )
   @Export("hintArrowX")
   static int hintArrowX = 0;
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = -1954664197
   )
   @Export("hintArrowY")
   static int hintArrowY = 0;
   @ObfuscatedName("dy")
   @ObfuscatedGetter(
      intValue = -701150334
   )
   @Export("hintArrowHeight")
   static int hintArrowHeight = 0;
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      intValue = 702646592
   )
   static int hintArrowSubX = 0;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = -1215132224
   )
   static int hintArrowSubY = 0;
   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "Lcb;"
   )
   @Export("playerAttackOption")
   static AttackOption playerAttackOption;
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "Lcb;"
   )
   @Export("npcAttackOption")
   static AttackOption npcAttackOption;
   @ObfuscatedName("ej")
   @ObfuscatedGetter(
      intValue = 1122595557
   )
   @Export("titleLoadingStage")
   static int titleLoadingStage;
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = -1998907249
   )
   @Export("js5ConnectState")
   static int js5ConnectState;
   @ObfuscatedName("eo")
   @ObfuscatedGetter(
      intValue = 1606323125
   )
   static int field521;
   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   static Archive field522;
   @ObfuscatedName("ft")
   @ObfuscatedGetter(
      intValue = -1298436933
   )
   @Export("js5Errors")
   static int js5Errors;
   @ObfuscatedName("fg")
   @ObfuscatedGetter(
      intValue = -745221463
   )
   @Export("loginState")
   static int loginState;
   @ObfuscatedName("fk")
   @ObfuscatedGetter(
      intValue = 2012270929
   )
   static int field525;
   @ObfuscatedName("fn")
   @ObfuscatedGetter(
      intValue = -2092618953
   )
   static int field526;
   @ObfuscatedName("fh")
   @ObfuscatedGetter(
      intValue = 1576970333
   )
   static int field574;
   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      descriptor = "Lek;"
   )
   static class131 field528;
   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      descriptor = "Lqc;"
   )
   static class467 field615;
   @ObfuscatedName("gb")
   static final String field652;
   @ObfuscatedName("gg")
   @Export("Login_isUsernameRemembered")
   static boolean Login_isUsernameRemembered;
   @ObfuscatedName("gh")
   @ObfuscatedSignature(
      descriptor = "Lbf;"
   )
   @Export("secureRandomFuture")
   static SecureRandomFuture secureRandomFuture;
   @ObfuscatedName("gi")
   @Export("randomDatData")
   static byte[] randomDatData;
   @ObfuscatedName("gd")
   @ObfuscatedSignature(
      descriptor = "[Lcc;"
   )
   @Export("npcs")
   static NPC[] npcs;
   @ObfuscatedName("ho")
   @ObfuscatedGetter(
      intValue = -1662323069
   )
   @Export("npcCount")
   static int npcCount;
   @ObfuscatedName("hp")
   @Export("npcIndices")
   static int[] npcIndices;
   @ObfuscatedName("hm")
   @ObfuscatedGetter(
      intValue = 477897293
   )
   static int field550;
   @ObfuscatedName("hh")
   static int[] field551;
   @ObfuscatedName("hd")
   @ObfuscatedSignature(
      descriptor = "Ldc;"
   )
   @Export("packetWriter")
   public static final PacketWriter packetWriter;
   @ObfuscatedName("hj")
   @ObfuscatedGetter(
      intValue = -271838389
   )
   @Export("logoutTimer")
   static int logoutTimer;
   @ObfuscatedName("hk")
   @Export("hadNetworkError")
   static boolean hadNetworkError;
   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      descriptor = "Lnr;"
   )
   @Export("timer")
   static Timer timer;
   @ObfuscatedName("hn")
   @Export("fontsMap")
   static HashMap fontsMap;
   @ObfuscatedName("hb")
   @ObfuscatedGetter(
      intValue = -2039747671
   )
   static int field557;
   @ObfuscatedName("hx")
   @ObfuscatedGetter(
      intValue = -641396427
   )
   static int field488;
   @ObfuscatedName("hq")
   @ObfuscatedGetter(
      intValue = 1492089399
   )
   static int field559;
   @ObfuscatedName("it")
   @Export("selectedItemName")
   static String selectedItemName;
   @ObfuscatedName("ii")
   @ObfuscatedGetter(
      intValue = 140741579
   )
   static int field560;
   @ObfuscatedName("il")
   @ObfuscatedGetter(
      intValue = -2018486329
   )
   static int field582;
   @ObfuscatedName("is")
   @Export("isInInstance")
   static boolean isInInstance;
   @ObfuscatedName("ig")
   @Export("instanceChunkTemplates")
   static int[][][] instanceChunkTemplates;
   @ObfuscatedName("ip")
   static final int[] field565;
   @ObfuscatedName("ic")
   @ObfuscatedGetter(
      intValue = -685292213
   )
   static int field558;
   @ObfuscatedName("je")
   @ObfuscatedGetter(
      intValue = -1790452751
   )
   static int field714;
   @ObfuscatedName("jh")
   @ObfuscatedGetter(
      intValue = -539759793
   )
   static int field568;
   @ObfuscatedName("jx")
   @ObfuscatedGetter(
      intValue = 324319485
   )
   static int field569;
   @ObfuscatedName("jt")
   @ObfuscatedGetter(
      intValue = 2031311111
   )
   static int field570;
   @ObfuscatedName("jy")
   static boolean field571;
   @ObfuscatedName("jb")
   @ObfuscatedGetter(
      intValue = 572984807
   )
   @Export("alternativeScrollbarWidth")
   static int alternativeScrollbarWidth;
   @ObfuscatedName("ja")
   @ObfuscatedGetter(
      intValue = -411143469
   )
   @Export("camAngleX")
   static int camAngleX;
   @ObfuscatedName("jo")
   @ObfuscatedGetter(
      intValue = -1553995155
   )
   @Export("camAngleY")
   static int camAngleY;
   @ObfuscatedName("jd")
   @ObfuscatedGetter(
      intValue = 1160779387
   )
   static int camAngleDY;
   @ObfuscatedName("jl")
   @ObfuscatedGetter(
      intValue = -23045263
   )
   static int camAngleDX;
   @ObfuscatedName("jf")
   @ObfuscatedGetter(
      intValue = -669764443
   )
   static int mouseCamClickedX;
   @ObfuscatedName("jv")
   @ObfuscatedGetter(
      intValue = 1685229137
   )
   static int mouseCamClickedY;
   @ObfuscatedName("jz")
   @ObfuscatedGetter(
      intValue = -902763731
   )
   @Export("oculusOrbState")
   static int oculusOrbState;
   @ObfuscatedName("js")
   @ObfuscatedGetter(
      intValue = 1391744237
   )
   @Export("camFollowHeight")
   static int camFollowHeight;
   @ObfuscatedName("km")
   @ObfuscatedGetter(
      intValue = -814747039
   )
   static int field581;
   @ObfuscatedName("kf")
   @ObfuscatedGetter(
      intValue = 1837811165
   )
   static int field533;
   @ObfuscatedName("kj")
   @ObfuscatedGetter(
      intValue = 1324205181
   )
   static int field583;
   @ObfuscatedName("kl")
   @ObfuscatedGetter(
      intValue = 1025325869
   )
   @Export("oculusOrbNormalSpeed")
   static int oculusOrbNormalSpeed;
   @ObfuscatedName("kg")
   @ObfuscatedGetter(
      intValue = 1073119475
   )
   @Export("oculusOrbSlowedSpeed")
   static int oculusOrbSlowedSpeed;
   @ObfuscatedName("ki")
   @ObfuscatedGetter(
      intValue = -1360791435
   )
   static int field586;
   @ObfuscatedName("ko")
   static boolean field500;
   @ObfuscatedName("kp")
   @ObfuscatedGetter(
      intValue = -2123783523
   )
   static int field779;
   @ObfuscatedName("ke")
   static boolean field589;
   @ObfuscatedName("kz")
   @ObfuscatedGetter(
      intValue = 185612375
   )
   static int field590;
   @ObfuscatedName("kx")
   @ObfuscatedGetter(
      intValue = -432166909
   )
   @Export("overheadTextCount")
   static int overheadTextCount;
   @ObfuscatedName("ks")
   @ObfuscatedGetter(
      intValue = 1206971147
   )
   @Export("overheadTextLimit")
   static int overheadTextLimit;
   @ObfuscatedName("kk")
   @Export("overheadTextXs")
   static int[] overheadTextXs;
   @ObfuscatedName("kq")
   @Export("overheadTextYs")
   static int[] overheadTextYs;
   @ObfuscatedName("kn")
   @Export("overheadTextAscents")
   static int[] overheadTextAscents;
   @ObfuscatedName("kd")
   @Export("overheadTextXOffsets")
   static int[] overheadTextXOffsets;
   @ObfuscatedName("ky")
   @Export("overheadTextColors")
   static int[] overheadTextColors;
   @ObfuscatedName("ku")
   @Export("overheadTextEffects")
   static int[] overheadTextEffects;
   @ObfuscatedName("kh")
   @Export("overheadTextCyclesRemaining")
   static int[] overheadTextCyclesRemaining;
   @ObfuscatedName("kw")
   @Export("overheadText")
   static String[] overheadText;
   @ObfuscatedName("kc")
   @Export("tileLastDrawnActor")
   static int[][] tileLastDrawnActor;
   @ObfuscatedName("ka")
   @ObfuscatedGetter(
      intValue = 7304427
   )
   @Export("viewportDrawCount")
   static int viewportDrawCount;
   @ObfuscatedName("kr")
   @ObfuscatedGetter(
      intValue = 16204475
   )
   @Export("viewportTempX")
   static int viewportTempX;
   @ObfuscatedName("kt")
   @ObfuscatedGetter(
      intValue = -1063867163
   )
   @Export("viewportTempY")
   static int viewportTempY;
   @ObfuscatedName("li")
   @ObfuscatedGetter(
      intValue = -1568132759
   )
   @Export("mouseCrossX")
   static int mouseCrossX;
   @ObfuscatedName("lk")
   @ObfuscatedGetter(
      intValue = -649478397
   )
   @Export("mouseCrossY")
   static int mouseCrossY;
   @ObfuscatedName("la")
   @ObfuscatedGetter(
      intValue = 1980937503
   )
   @Export("mouseCrossState")
   static int mouseCrossState;
   @ObfuscatedName("lh")
   @ObfuscatedGetter(
      intValue = -1750345907
   )
   @Export("mouseCrossColor")
   static int mouseCrossColor;
   @ObfuscatedName("lr")
   @Export("showMouseCross")
   static boolean showMouseCross;
   @ObfuscatedName("lq")
   @ObfuscatedGetter(
      intValue = 731352327
   )
   static int field697;
   @ObfuscatedName("lc")
   @ObfuscatedGetter(
      intValue = -1905527007
   )
   static int field745;
   @ObfuscatedName("lz")
   @ObfuscatedGetter(
      intValue = -430386207
   )
   @Export("dragItemSlotSource")
   static int dragItemSlotSource;
   @ObfuscatedName("lf")
   @ObfuscatedGetter(
      intValue = 1384414151
   )
   @Export("draggedWidgetX")
   static int draggedWidgetX;
   @ObfuscatedName("lu")
   @ObfuscatedGetter(
      intValue = 1815531069
   )
   @Export("draggedWidgetY")
   static int draggedWidgetY;
   @ObfuscatedName("lv")
   @ObfuscatedGetter(
      intValue = 48329695
   )
   @Export("dragItemSlotDestination")
   static int dragItemSlotDestination;
   @ObfuscatedName("lj")
   static boolean field616;
   @ObfuscatedName("lx")
   @ObfuscatedGetter(
      intValue = -1660257367
   )
   @Export("itemDragDuration")
   static int itemDragDuration;
   @ObfuscatedName("lw")
   @ObfuscatedGetter(
      intValue = -1045540475
   )
   static int field687;
   @ObfuscatedName("ll")
   @Export("showLoadingMessages")
   static boolean showLoadingMessages;
   @ObfuscatedName("ln")
   @ObfuscatedSignature(
      descriptor = "[Lco;"
   )
   @Export("players")
   static Player[] players;
   @ObfuscatedName("lo")
   @ObfuscatedGetter(
      intValue = 465084021
   )
   @Export("localPlayerIndex")
   static int localPlayerIndex;
   @ObfuscatedName("le")
   @ObfuscatedGetter(
      intValue = -870239743
   )
   static int field778;
   @ObfuscatedName("ld")
   @ObfuscatedGetter(
      longValue = -8829455432363219343L
   )
   static long field489;
   @ObfuscatedName("mi")
   @Export("renderSelf")
   static boolean renderSelf;
   @ObfuscatedName("mw")
   @ObfuscatedGetter(
      intValue = 957209615
   )
   @Export("drawPlayerNames")
   static int drawPlayerNames;
   @ObfuscatedName("mo")
   @ObfuscatedGetter(
      intValue = 1283833171
   )
   static int field626;
   @ObfuscatedName("mh")
   static int[] field627;
   @ObfuscatedName("mp")
   @Export("playerMenuOpcodes")
   static final int[] playerMenuOpcodes;
   @ObfuscatedName("me")
   @Export("playerMenuActions")
   static String[] playerMenuActions;
   @ObfuscatedName("mt")
   @Export("playerOptionsPriorities")
   static boolean[] playerOptionsPriorities;
   @ObfuscatedName("ml")
   static int[] defaultRotations;
   @ObfuscatedName("mf")
   @ObfuscatedGetter(
      intValue = -1327337301
   )
   @Export("combatTargetPlayerIndex")
   static int combatTargetPlayerIndex;
   @ObfuscatedName("mz")
   @ObfuscatedSignature(
      descriptor = "[[[Lme;"
   )
   @Export("groundItems")
   static NodeDeque[][][] groundItems;
   @ObfuscatedName("mq")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("pendingSpawns")
   static NodeDeque pendingSpawns;
   @ObfuscatedName("ma")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("projectiles")
   static NodeDeque projectiles;
   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("graphicsObjects")
   static NodeDeque graphicsObjects;
   @ObfuscatedName("mm")
   @Export("currentLevels")
   static int[] currentLevels;
   @ObfuscatedName("mu")
   @Export("levels")
   static int[] levels;
   @ObfuscatedName("mg")
   @Export("experience")
   static int[] experience;
   @ObfuscatedName("my")
   @Export("leftClickOpensMenu")
   static boolean leftClickOpensMenu;
   @ObfuscatedName("mb")
   @Export("isMenuOpen")
   static boolean isMenuOpen;
   @ObfuscatedName("nu")
   @ObfuscatedGetter(
      intValue = 1625323771
   )
   @Export("menuOptionsCount")
   static int menuOptionsCount;
   @ObfuscatedName("ns")
   @Export("menuArguments1")
   static int[] menuArguments1;
   @ObfuscatedName("nt")
   @Export("menuArguments2")
   static int[] menuArguments2;
   @ObfuscatedName("nx")
   @Export("menuOpcodes")
   static int[] menuOpcodes;
   @ObfuscatedName("nv")
   @Export("menuIdentifiers")
   static int[] menuIdentifiers;
   @ObfuscatedName("nf")
   @Export("menuItemIds")
   static int[] menuItemIds;
   @ObfuscatedName("nn")
   @Export("menuActions")
   static String[] menuActions;
   @ObfuscatedName("nm")
   @Export("menuTargets")
   static String[] menuTargets;
   @ObfuscatedName("nr")
   @Export("menuShiftClick")
   static boolean[] menuShiftClick;
   @ObfuscatedName("no")
   @Export("followerOpsLowPriority")
   static boolean followerOpsLowPriority;
   @ObfuscatedName("nh")
   @Export("shiftClickDrop")
   static boolean shiftClickDrop;
   @ObfuscatedName("na")
   @Export("tapToDrop")
   static boolean tapToDrop;
   @ObfuscatedName("nw")
   @Export("showMouseOverText")
   static boolean showMouseOverText;
   @ObfuscatedName("nj")
   @ObfuscatedGetter(
      intValue = -1911813319
   )
   @Export("viewportX")
   static int viewportX;
   @ObfuscatedName("nb")
   @ObfuscatedGetter(
      intValue = -863938089
   )
   @Export("viewportY")
   static int viewportY;
   @ObfuscatedName("ny")
   @ObfuscatedGetter(
      intValue = -1209442767
   )
   static int field527;
   @ObfuscatedName("nc")
   @ObfuscatedGetter(
      intValue = 1859054271
   )
   static int field786;
   @ObfuscatedName("np")
   @ObfuscatedGetter(
      intValue = 1673492447
   )
   @Export("isItemSelected")
   static int isItemSelected;
   @ObfuscatedName("ni")
   @Export("isSpellSelected")
   static boolean isSpellSelected;
   @ObfuscatedName("oc")
   @ObfuscatedGetter(
      intValue = 812539759
   )
   @Export("selectedSpellChildIndex")
   static int selectedSpellChildIndex;
   @ObfuscatedName("on")
   @ObfuscatedGetter(
      intValue = 1922635793
   )
   @Export("selectedSpellItemId")
   static int selectedSpellItemId;
   @ObfuscatedName("of")
   @Export("selectedSpellActionName")
   static String selectedSpellActionName;
   @ObfuscatedName("ot")
   @Export("selectedSpellName")
   static String selectedSpellName;
   @ObfuscatedName("ok")
   @ObfuscatedGetter(
      intValue = -1500579493
   )
   @Export("rootInterface")
   static int rootInterface;
   @ObfuscatedName("os")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("interfaceParents")
   static NodeHashTable interfaceParents;
   @ObfuscatedName("or")
   @ObfuscatedGetter(
      intValue = -2123777915
   )
   static int field668;
   @ObfuscatedName("oq")
   @ObfuscatedGetter(
      intValue = 274292561
   )
   static int field755;
   @ObfuscatedName("od")
   @ObfuscatedGetter(
      intValue = 502834183
   )
   @Export("chatEffects")
   static int chatEffects;
   @ObfuscatedName("ol")
   @ObfuscatedGetter(
      intValue = 86492395
   )
   static int field671;
   @ObfuscatedName("oy")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("meslayerContinueWidget")
   static Widget meslayerContinueWidget;
   @ObfuscatedName("ov")
   @ObfuscatedGetter(
      intValue = 2108411369
   )
   @Export("runEnergy")
   static int runEnergy;
   @ObfuscatedName("ox")
   @ObfuscatedGetter(
      intValue = -1965732057
   )
   @Export("weight")
   static int weight;
   @ObfuscatedName("oo")
   @ObfuscatedGetter(
      intValue = 2022414179
   )
   @Export("staffModLevel")
   static int staffModLevel;
   @ObfuscatedName("op")
   @ObfuscatedGetter(
      intValue = -1587394821
   )
   @Export("followerIndex")
   static int followerIndex;
   @ObfuscatedName("ou")
   @Export("playerMod")
   static boolean playerMod;
   @ObfuscatedName("oi")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("viewportWidget")
   static Widget viewportWidget;
   @ObfuscatedName("oa")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("clickedWidget")
   static Widget clickedWidget;
   @ObfuscatedName("oz")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("clickedWidgetParent")
   static Widget clickedWidgetParent;
   @ObfuscatedName("oe")
   @ObfuscatedGetter(
      intValue = 405617839
   )
   @Export("widgetClickX")
   static int widgetClickX;
   @ObfuscatedName("pp")
   @ObfuscatedGetter(
      intValue = -570239103
   )
   @Export("widgetClickY")
   static int widgetClickY;
   @ObfuscatedName("pn")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("draggedOnWidget")
   static Widget draggedOnWidget;
   @ObfuscatedName("pc")
   static boolean field684;
   @ObfuscatedName("pi")
   @ObfuscatedGetter(
      intValue = -202807175
   )
   static int field603;
   @ObfuscatedName("po")
   @ObfuscatedGetter(
      intValue = -447960851
   )
   static int field686;
   @ObfuscatedName("pf")
   static boolean field640;
   @ObfuscatedName("pm")
   @ObfuscatedGetter(
      intValue = 1203164655
   )
   static int field688;
   @ObfuscatedName("pg")
   @ObfuscatedGetter(
      intValue = -1709613317
   )
   static int field689;
   @ObfuscatedName("pu")
   @Export("isDraggingWidget")
   static boolean isDraggingWidget;
   @ObfuscatedName("pk")
   @ObfuscatedGetter(
      intValue = -1926854019
   )
   @Export("cycleCntr")
   static int cycleCntr;
   @ObfuscatedName("pt")
   static int[] changedVarps;
   @ObfuscatedName("ps")
   @ObfuscatedGetter(
      intValue = 1048282361
   )
   static int changedVarpCount;
   @ObfuscatedName("pd")
   static int[] changedItemContainers;
   @ObfuscatedName("pq")
   @ObfuscatedGetter(
      intValue = -1582541725
   )
   static int field695;
   @ObfuscatedName("pz")
   static int[] changedSkills;
   @ObfuscatedName("pv")
   @ObfuscatedGetter(
      intValue = -123811959
   )
   static int changedSkillsCount;
   @ObfuscatedName("py")
   static int[] field698;
   @ObfuscatedName("pe")
   @ObfuscatedGetter(
      intValue = -1882369861
   )
   static int field699;
   @ObfuscatedName("pr")
   @ObfuscatedGetter(
      intValue = -2092972535
   )
   @Export("chatCycle")
   static int chatCycle;
   @ObfuscatedName("pa")
   @ObfuscatedGetter(
      intValue = 162073353
   )
   static int field701;
   @ObfuscatedName("qn")
   @ObfuscatedGetter(
      intValue = -2015004537
   )
   static int field702;
   @ObfuscatedName("qu")
   @ObfuscatedGetter(
      intValue = 933606785
   )
   static int field703;
   @ObfuscatedName("qt")
   @ObfuscatedGetter(
      intValue = -580604401
   )
   static int field704;
   @ObfuscatedName("qv")
   @ObfuscatedGetter(
      intValue = 393370855
   )
   static int field705;
   @ObfuscatedName("qx")
   @ObfuscatedGetter(
      intValue = 127385867
   )
   static int field706;
   @ObfuscatedName("qz")
   @ObfuscatedGetter(
      intValue = 1445910661
   )
   static int field499;
   @ObfuscatedName("qi")
   @ObfuscatedGetter(
      intValue = 38044803
   )
   @Export("mouseWheelRotation")
   static int mouseWheelRotation;
   @ObfuscatedName("ql")
   @ObfuscatedSignature(
      descriptor = "Lrc;"
   )
   static class480 field709;
   @ObfuscatedName("qo")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("scriptEvents")
   static NodeDeque scriptEvents;
   @ObfuscatedName("qp")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   static NodeDeque field711;
   @ObfuscatedName("qq")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   static NodeDeque field670;
   @ObfuscatedName("qj")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   static NodeDeque field713;
   @ObfuscatedName("qb")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("widgetFlags")
   static NodeHashTable widgetFlags;
   @ObfuscatedName("qe")
   @ObfuscatedGetter(
      intValue = 2094937951
   )
   @Export("rootWidgetCount")
   static int rootWidgetCount;
   @ObfuscatedName("qk")
   @ObfuscatedGetter(
      intValue = -1183441329
   )
   static int field739;
   @ObfuscatedName("qr")
   static boolean[] field717;
   @ObfuscatedName("qg")
   static boolean[] field718;
   @ObfuscatedName("qm")
   static boolean[] field657;
   @ObfuscatedName("qs")
   @Export("rootWidgetXs")
   static int[] rootWidgetXs;
   @ObfuscatedName("qc")
   @Export("rootWidgetYs")
   static int[] rootWidgetYs;
   @ObfuscatedName("re")
   @Export("rootWidgetWidths")
   static int[] rootWidgetWidths;
   @ObfuscatedName("rv")
   @Export("rootWidgetHeights")
   static int[] rootWidgetHeights;
   @ObfuscatedName("rr")
   @ObfuscatedGetter(
      intValue = -129551427
   )
   @Export("gameDrawingMode")
   static int gameDrawingMode;
   @ObfuscatedName("rj")
   @ObfuscatedGetter(
      longValue = 9133357520759350651L
   )
   static long field587;
   @ObfuscatedName("rq")
   @Export("isResizable")
   static boolean isResizable;
   @ObfuscatedName("ro")
   static int[] field727;
   @ObfuscatedName("rc")
   @ObfuscatedGetter(
      intValue = 1632968345
   )
   @Export("publicChatMode")
   static int publicChatMode;
   @ObfuscatedName("ru")
   @ObfuscatedGetter(
      intValue = -1247476773
   )
   @Export("tradeChatMode")
   static int tradeChatMode;
   @ObfuscatedName("rl")
   static String field730;
   @ObfuscatedName("rg")
   static long[] crossWorldMessageIds;
   @ObfuscatedName("rt")
   @ObfuscatedGetter(
      intValue = 1816562191
   )
   static int crossWorldMessageIdsIndex;
   @ObfuscatedName("rp")
   @ObfuscatedSignature(
      descriptor = "Lgw;"
   )
   public static class199 field733;
   @ObfuscatedName("rx")
   @ObfuscatedSignature(
      descriptor = "Lgh;"
   )
   static class197 field734;
   @ObfuscatedName("fb")
   String field530;
   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      descriptor = "Lo;"
   )
   class14 field531;
   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      descriptor = "Lm;"
   )
   class19 field532;
   @ObfuscatedName("gl")
   OtlTokenRequester field672;
   @ObfuscatedName("gu")
   Future field534;
   @ObfuscatedName("ga")
   boolean field692 = false;
   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      descriptor = "Lm;"
   )
   class19 field536;
   @ObfuscatedName("gc")
   @ObfuscatedSignature(
      descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
   )
   RefreshAccessTokenRequester field537;
   @ObfuscatedName("gt")
   Future field538;
   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      descriptor = "Lqr;"
   )
   Buffer field585;
   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      descriptor = "Ld;"
   )
   class7 field544;
   @ObfuscatedName("go")
   @ObfuscatedGetter(
      longValue = 6349706447758031983L
   )
   long field545 = -1L;

   static {
      playerAttackOption = AttackOption.AttackOption_hidden;
      npcAttackOption = AttackOption.AttackOption_hidden;
      titleLoadingStage = 0;
      js5ConnectState = 0;
      field521 = 0;
      js5Errors = 0;
      loginState = 0;
      field525 = 0;
      field526 = 0;
      field574 = 0;
      field528 = class131.field1559;
      field615 = class467.field4923;
      int var1 = "com_jagex_auth_desktop_osrs:public".length();
      byte[] var2 = new byte[var1];

      int var3;
      for(var3 = 0; var3 < var1; ++var3) {
         char var10 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
         if (var10 > 127) {
            var2[var3] = 63;
         } else {
            var2[var3] = (byte)var10;
         }
      }

      byte[] var0 = var2;
      var3 = var2.length;
      StringBuilder var4 = new StringBuilder();

      for(int var5 = 0; var5 < var3 + 0; var5 += 3) {
         int var6 = var0[var5] & 255;
         var4.append(class356.field4298[var6 >>> 2]);
         if (var5 < var3 - 1) {
            int var7 = var0[var5 + 1] & 255;
            var4.append(class356.field4298[(var6 & 3) << 4 | var7 >>> 4]);
            if (var5 < var3 - 2) {
               int var8 = var0[var5 + 2] & 255;
               var4.append(class356.field4298[(var7 & 15) << 2 | var8 >>> 6]).append(class356.field4298[var8 & 63]);
            } else {
               var4.append(class356.field4298[(var7 & 15) << 2]).append("=");
            }
         } else {
            var4.append(class356.field4298[(var6 & 3) << 4]).append("==");
         }
      }

      String var11 = var4.toString();
      field652 = var11;
      Login_isUsernameRemembered = false;
      secureRandomFuture = new SecureRandomFuture();
      randomDatData = null;
      npcs = new NPC[65536];
      npcCount = 0;
      npcIndices = new int[65536];
      field550 = 0;
      field551 = new int[250];
      packetWriter = new PacketWriter();
      logoutTimer = 0;
      hadNetworkError = false;
      timer = new Timer();
      fontsMap = new HashMap();
      field557 = 0;
      field488 = 1;
      field559 = 0;
      field560 = 1;
      field582 = 0;
      collisionMaps = new CollisionMap[4];
      isInInstance = false;
      instanceChunkTemplates = new int[4][13][13];
      field565 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field558 = 0;
      field714 = 2301979;
      field568 = 5063219;
      field569 = 3353893;
      field570 = 7759444;
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
      field533 = 0;
      field583 = 0;
      oculusOrbNormalSpeed = 12;
      oculusOrbSlowedSpeed = 6;
      field586 = 0;
      field500 = false;
      field779 = 0;
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
      field697 = 0;
      field745 = 0;
      dragItemSlotSource = 0;
      draggedWidgetX = 0;
      draggedWidgetY = 0;
      dragItemSlotDestination = 0;
      field616 = false;
      itemDragDuration = 0;
      field687 = 0;
      showLoadingMessages = true;
      players = new Player[2048];
      localPlayerIndex = -1;
      field778 = 0;
      field489 = -1L;
      renderSelf = true;
      drawPlayerNames = 0;
      field626 = 0;
      field627 = new int[1000];
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
      shiftClickDrop = false;
      tapToDrop = false;
      showMouseOverText = true;
      viewportX = -1;
      viewportY = -1;
      field527 = 0;
      field786 = 50;
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
      field755 = -1;
      chatEffects = 0;
      field671 = 0;
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
      field684 = false;
      field603 = -1;
      field686 = -1;
      field640 = false;
      field688 = -1;
      field689 = -1;
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
      field704 = 0;
      field705 = 0;
      field706 = 0;
      field499 = 0;
      mouseWheelRotation = 0;
      field709 = new class480();
      scriptEvents = new NodeDeque();
      field711 = new NodeDeque();
      field670 = new NodeDeque();
      field713 = new NodeDeque();
      widgetFlags = new NodeHashTable(512);
      rootWidgetCount = 0;
      field739 = -2;
      field717 = new boolean[100];
      field718 = new boolean[100];
      field657 = new boolean[100];
      rootWidgetXs = new int[100];
      rootWidgetYs = new int[100];
      rootWidgetWidths = new int[100];
      rootWidgetHeights = new int[100];
      gameDrawingMode = 0;
      field587 = 0L;
      isResizable = true;
      field727 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      publicChatMode = 0;
      tradeChatMode = 0;
      field730 = "";
      crossWorldMessageIds = new long[100];
      crossWorldMessageIdsIndex = 0;
      field733 = new class199();
      field734 = new class197();
      field679 = 0;
      field613 = new int[128];
      field737 = new int[128];
      field738 = -1L;
      currentClanSettings = new ClanSettings[4];
      currentClanChannels = new ClanChannel[4];
      field519 = -1;
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
      field758 = false;
      field556 = new boolean[5];
      field760 = new int[5];
      field665 = new int[5];
      field762 = new int[5];
      field763 = new int[5];
      field764 = 256;
      field649 = 205;
      zoomHeight = 256;
      zoomWidth = 320;
      field601 = 1;
      field769 = 32767;
      field562 = 1;
      field771 = 32767;
      viewportOffsetX = 0;
      viewportOffsetY = 0;
      viewportWidth = 0;
      viewportHeight = 0;
      viewportZoom = 0;
      playerAppearance = new PlayerComposition();
      field539 = -1;
      field543 = -1;
      platformInfoProvider = new DesktopPlatformInfoProvider();
      grandExchangeOffers = new GrandExchangeOffer[8];
      GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
      DBTableIndex_cache = new EvictingDualNodeHashTable(64);
      DBTableMasterIndex_cache = new EvictingDualNodeHashTable(64);
      field785 = -1;
      field793 = -1;
      archiveLoaders = new ArrayList(10);
      archiveLoadersDone = 0;
      field588 = 0;
      field790 = new ApproximateRouteStrategy();
      field693 = new int[50];
      field792 = new int[50];
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1490185666"
   )
   @Export("resizeGame")
   protected final void resizeGame() {
      field587 = UserComparator8.method2748() + 500L;
      this.resizeJS();
      if (rootInterface != -1) {
         this.resizeRoot(true);
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1983760905"
   )
   @Export("setUp")
   protected final void setUp() {
      int[] var1 = new int[]{20, 260, 10000};
      int[] var2 = new int[]{1000, 100, 500};
      if (var1 != null && var2 != null) {
         BoundaryObject.ByteArrayPool_alternativeSizes = var1;
         class239.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
         class357.ByteArrayPool_arrays = new byte[var1.length][][];

         for(int var3 = 0; var3 < BoundaryObject.ByteArrayPool_alternativeSizes.length; ++var3) {
            class357.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
            ByteArrayPool.field4393.add(var1[var3]);
         }

         Collections.sort(ByteArrayPool.field4393);
      } else {
         BoundaryObject.ByteArrayPool_alternativeSizes = null;
         class239.ByteArrayPool_altSizeArrayCounts = null;
         class357.ByteArrayPool_arrays = null;
         Skills.method6245();
      }

      class159.worldPort = gameBuild == 0 ? 'ꩊ' : worldId + '鱀';
      class131.js5Port = gameBuild == 0 ? 443 : worldId + '썐';
      class454.currentPort = class159.worldPort;
      TaskHandler.field1780 = class301.field3463;
      class34.field193 = class301.field3465;
      class21.field114 = class301.field3462;
      ArchiveLoader.field1016 = class301.field3464;
      PcmPlayer.urlRequester = new class108(this.field692, 209);
      this.setUpKeyboard();
      this.method514();
      class9.mouseWheel = this.mouseWheel();
      this.method513(field734, 0);
      this.method513(field733, 1);
      GameObject.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
      AccessFile var4 = null;
      ClientPreferences var5 = new ClientPreferences();

      try {
         var4 = class156.getPreferencesFile("", class376.field4411.name, false);
         byte[] var6 = new byte[(int)var4.length()];

         int var8;
         for(int var7 = 0; var7 < var6.length; var7 += var8) {
            var8 = var4.read(var6, var7, var6.length - var7);
            if (var8 == -1) {
               throw new IOException();
            }
         }

         var5 = new ClientPreferences(new Buffer(var6));
      } catch (Exception var11) {
      }

      try {
         if (var4 != null) {
            var4.close();
         }
      } catch (Exception var10) {
      }

      BufferedSink.clientPreferences = var5;
      this.setUpClipboard();
      HealthBarUpdate.method2341(this, AttackOption.field1294);
      class167.setWindowedMode(BufferedSink.clientPreferences.method2401());
      WallDecoration.friendSystem = new FriendSystem(ViewportMouse.loginType);
      this.field531 = new class14("tokenRequest", 1, 1);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1176871177"
   )
   @Export("doCycle")
   protected final void doCycle() {
      ++cycle;
      this.doCycleJs5();
      WorldMapManager.method4967();
      KitDefinition.method3476();
      class355.playPcmPlayers();
      field733.method3954();
      this.method603();
      WorldMapSection0.method5106();
      if (class9.mouseWheel != null) {
         int var1 = class9.mouseWheel.useRotation();
         mouseWheelRotation = var1;
      }

      if (gameState == 0) {
         class28.load();
         class354.method6768();
      } else if (gameState == 5) {
         FontName.loginScreen(this, Language.fontPlain12);
         class28.load();
         class354.method6768();
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            FontName.loginScreen(this, Language.fontPlain12);
            this.doCycleLoggedOut();
         } else if (gameState == 50) {
            FontName.loginScreen(this, Language.fontPlain12);
            this.doCycleLoggedOut();
         } else if (gameState == 25) {
            ReflectionCheck.method714();
         }
      } else {
         FontName.loginScreen(this, Language.fontPlain12);
      }

      if (gameState == 30) {
         this.doCycleLoggedIn();
      } else if (gameState == 40 || gameState == 45) {
         this.doCycleLoggedOut();
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1054189604"
   )
   @Export("draw")
   protected final void draw(boolean var1) {
      boolean var2;
      label170: {
         try {
            if (class283.musicPlayerStatus == 2) {
               if (class131.musicTrack == null) {
                  class131.musicTrack = MusicTrack.readTrack(DevicePcmPlayerProvider.musicTrackArchive, class283.musicTrackGroupId, class283.musicTrackFileId);
                  if (class131.musicTrack == null) {
                     var2 = false;
                     break label170;
                  }
               }

               if (class371.soundCache == null) {
                  class371.soundCache = new SoundCache(class283.soundEffectsArchive, class283.musicSamplesArchive);
               }

               if (class283.midiPcmStream.loadMusicTrack(class131.musicTrack, class283.musicPatchesArchive, class371.soundCache, 22050)) {
                  class283.midiPcmStream.clearAll();
                  class283.midiPcmStream.setPcmStreamVolume(Messages.musicTrackVolume);
                  class283.midiPcmStream.setMusicTrack(class131.musicTrack, GrandExchangeEvents.musicTrackBoolean);
                  class283.musicPlayerStatus = 0;
                  class131.musicTrack = null;
                  class371.soundCache = null;
                  DevicePcmPlayerProvider.musicTrackArchive = null;
                  var2 = true;
                  break label170;
               }
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            class283.midiPcmStream.clear();
            class283.musicPlayerStatus = 0;
            class131.musicTrack = null;
            class371.soundCache = null;
            DevicePcmPlayerProvider.musicTrackArchive = null;
         }

         var2 = false;
      }

      if (var2 && playingJingle && HealthBar.pcmPlayer0 != null) {
         HealthBar.pcmPlayer0.tryDiscard();
      }

      if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field587 && UserComparator8.method2748() > field587) {
         class167.setWindowedMode(class13.getWindowedMode());
      }

      int var4;
      if (var1) {
         for(var4 = 0; var4 < 100; ++var4) {
            field717[var4] = true;
         }
      }

      if (gameState == 0) {
         this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
      } else if (gameState == 5) {
         UrlRequest.drawTitle(UserComparator3.fontBold12, ModeWhere.fontPlain11, Language.fontPlain12);
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            UrlRequest.drawTitle(UserComparator3.fontBold12, ModeWhere.fontPlain11, Language.fontPlain12);
         } else if (gameState == 50) {
            UrlRequest.drawTitle(UserComparator3.fontBold12, ModeWhere.fontPlain11, Language.fontPlain12);
         } else if (gameState == 25) {
            if (field582 == 1) {
               if (field557 > field488) {
                  field488 = field557;
               }

               var4 = (field488 * 50 - field557 * 50) / field488;
               class145.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
            } else if (field582 == 2) {
               if (field559 > field560) {
                  field560 = field559;
               }

               var4 = (field560 * 50 - field559 * 50) / field560 + 50;
               class145.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
            } else {
               class145.drawLoadingMessage("Loading - please wait.", false);
            }
         } else if (gameState == 30) {
            this.drawLoggedIn();
         } else if (gameState == 40) {
            class145.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if (gameState == 45) {
            class145.drawLoadingMessage("Please wait...", false);
         }
      } else {
         UrlRequest.drawTitle(UserComparator3.fontBold12, ModeWhere.fontPlain11, Language.fontPlain12);
      }

      if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
         for(var4 = 0; var4 < rootWidgetCount; ++var4) {
            if (field718[var4]) {
               class1.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
               field718[var4] = false;
            }
         }
      } else if (gameState > 0) {
         class1.rasterProvider.drawFull(0, 0);

         for(var4 = 0; var4 < rootWidgetCount; ++var4) {
            field718[var4] = false;
         }
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-5165"
   )
   @Export("kill0")
   protected final void kill0() {
      if (Projectile.varcs.hasUnwrittenChanges()) {
         Projectile.varcs.write();
      }

      if (GrandExchangeOfferOwnWorldComparator.mouseRecorder != null) {
         GrandExchangeOfferOwnWorldComparator.mouseRecorder.isRunning = false;
      }

      GrandExchangeOfferOwnWorldComparator.mouseRecorder = null;
      packetWriter.close();
      MenuAction.method2021();
      class9.mouseWheel = null;
      if (HealthBar.pcmPlayer0 != null) {
         HealthBar.pcmPlayer0.shutdown();
      }

      if (class86.pcmPlayer1 != null) {
         class86.pcmPlayer1.shutdown();
      }

      class313.method6246();
      StructComposition.method3676();
      if (PcmPlayer.urlRequester != null) {
         PcmPlayer.urlRequester.close();
         PcmPlayer.urlRequester = null;
      }

      FriendSystem.method1845();
      this.field531.method173();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1478842545"
   )
   protected final void vmethod1485() {
   }

   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "67"
   )
   boolean method1184() {
      return class298.field3418 != null && !class298.field3418.trim().isEmpty() && SpriteMask.field3386 != null && !SpriteMask.field3386.trim().isEmpty();
   }

   @ObfuscatedName("fp")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1550081441"
   )
   boolean method1366() {
      return this.field672 != null;
   }

   @ObfuscatedName("fg")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "2079292800"
   )
   void method1186(String var1) throws IOException {
      HashMap var2 = new HashMap();
      var2.put("grant_type", "refresh_token");
      var2.put("scope", "gamesso.token.create");
      var2.put("refresh_token", var1);
      URL var3 = new URL(class124.field1482 + "shield/oauth/token" + (new class420(var2)).method7798());
      HashMap var4 = new HashMap();
      var4.put("Authorization", "Basic " + field652);
      var4.put("Host", (new URL(class124.field1482)).getHost());
      var4.put("Accept", class417.field4602.method7779());
      class9 var5 = class9.field42;
      RefreshAccessTokenRequester var6 = this.field537;
      if (var6 != null) {
         this.field538 = var6.request(var5.method70(), var3, var4, "");
      } else {
         class10 var7 = new class10(var3, var5, this.field692);
         Iterator var8 = var4.entrySet().iterator();

         while(var8.hasNext()) {
            Map.Entry var9 = (Map.Entry)var8.next();
            var7.method79((String)var9.getKey(), (String)var9.getValue());
         }

         this.field536 = this.field531.method174(var7);
      }
   }

   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1400074559"
   )
   void method1187(String var1) throws MalformedURLException, IOException {
      URL var2 = new URL(class124.field1482 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
      HashMap var3 = new HashMap();
      var3.put("Authorization", "Bearer " + var1);
      class9 var4 = class9.field39;
      OtlTokenRequester var5 = this.field672;
      if (var5 != null) {
         this.field534 = var5.request(var4.method70(), var2, var3, "");
      } else {
         class10 var6 = new class10(var2, var4, this.field692);
         Iterator var7 = var3.entrySet().iterator();

         while(var7.hasNext()) {
            Map.Entry var8 = (Map.Entry)var7.next();
            var6.method79((String)var8.getKey(), (String)var8.getValue());
         }

         this.field532 = this.field531.method174(var6);
      }
   }

   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-52"
   )
   @Export("doCycleJs5")
   void doCycleJs5() {
      if (gameState != 1000) {
         long var2 = UserComparator8.method2748();
         int var4 = (int)(var2 - DirectByteArrayCopier.field3653);
         DirectByteArrayCopier.field3653 = var2;
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
               label246: {
                  if (NetCache.NetCache_loadTime > 30000) {
                     throw new IOException();
                  }

                  NetFileRequest var5;
                  Buffer var6;
                  while(NetCache.NetCache_pendingPriorityResponsesCount < 200 && NetCache.NetCache_pendingPriorityWritesCount > 0) {
                     var5 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
                     var6 = new Buffer(4);
                     var6.writeByte(1);
                     var6.writeMedium((int)var5.key);
                     NetCache.NetCache_socket.write(var6.array, 0, 4);
                     NetCache.NetCache_pendingPriorityResponses.put(var5, var5.key);
                     --NetCache.NetCache_pendingPriorityWritesCount;
                     ++NetCache.NetCache_pendingPriorityResponsesCount;
                  }

                  while(NetCache.NetCache_pendingResponsesCount < 200 && NetCache.NetCache_pendingWritesCount > 0) {
                     var5 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
                     var6 = new Buffer(4);
                     var6.writeByte(0);
                     var6.writeMedium((int)var5.key);
                     NetCache.NetCache_socket.write(var6.array, 0, 4);
                     var5.removeDual();
                     NetCache.NetCache_pendingResponses.put(var5, var5.key);
                     --NetCache.NetCache_pendingWritesCount;
                     ++NetCache.NetCache_pendingResponsesCount;
                  }

                  for(int var17 = 0; var17 < 100; ++var17) {
                     int var18 = NetCache.NetCache_socket.available();
                     if (var18 < 0) {
                        throw new IOException();
                     }

                     if (var18 == 0) {
                        break;
                     }

                     NetCache.NetCache_loadTime = 0;
                     byte var7 = 0;
                     if (UserComparator6.NetCache_currentResponse == null) {
                        var7 = 8;
                     } else if (NetCache.field4178 == 0) {
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
                        if (NetCache.field4180 != 0) {
                           for(var9 = 0; var9 < var8; ++var9) {
                              var10000 = NetCache.NetCache_responseHeaderBuffer.array;
                              var10001 = var9 + NetCache.NetCache_responseHeaderBuffer.offset;
                              var10000[var10001] ^= NetCache.field4180;
                           }
                        }

                        var25 = NetCache.NetCache_responseHeaderBuffer;
                        var25.offset += var8;
                        if (NetCache.NetCache_responseHeaderBuffer.offset < var7) {
                           break;
                        }

                        if (UserComparator6.NetCache_currentResponse == null) {
                           NetCache.NetCache_responseHeaderBuffer.offset = 0;
                           var9 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
                           var10 = NetCache.NetCache_responseHeaderBuffer.readUnsignedShort();
                           int var11 = NetCache.NetCache_responseHeaderBuffer.readUnsignedByte();
                           var12 = NetCache.NetCache_responseHeaderBuffer.readInt();
                           long var13 = (long)(var10 + (var9 << 16));
                           NetFileRequest var15 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var13);
                           UserComparator10.field1425 = true;
                           if (var15 == null) {
                              var15 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var13);
                              UserComparator10.field1425 = false;
                           }

                           if (var15 == null) {
                              throw new IOException();
                           }

                           int var16 = var11 == 0 ? 5 : 9;
                           UserComparator6.NetCache_currentResponse = var15;
                           class420.NetCache_responseArchiveBuffer = new Buffer(var12 + var16 + UserComparator6.NetCache_currentResponse.padding);
                           class420.NetCache_responseArchiveBuffer.writeByte(var11);
                           class420.NetCache_responseArchiveBuffer.writeInt(var12);
                           NetCache.field4178 = 8;
                           NetCache.NetCache_responseHeaderBuffer.offset = 0;
                        } else if (NetCache.field4178 == 0) {
                           if (NetCache.NetCache_responseHeaderBuffer.array[0] == -1) {
                              NetCache.field4178 = 1;
                              NetCache.NetCache_responseHeaderBuffer.offset = 0;
                           } else {
                              UserComparator6.NetCache_currentResponse = null;
                           }
                        }
                     } else {
                        var8 = class420.NetCache_responseArchiveBuffer.array.length - UserComparator6.NetCache_currentResponse.padding;
                        var9 = 512 - NetCache.field4178;
                        if (var9 > var8 - class420.NetCache_responseArchiveBuffer.offset) {
                           var9 = var8 - class420.NetCache_responseArchiveBuffer.offset;
                        }

                        if (var9 > var18) {
                           var9 = var18;
                        }

                        NetCache.NetCache_socket.read(class420.NetCache_responseArchiveBuffer.array, class420.NetCache_responseArchiveBuffer.offset, var9);
                        if (NetCache.field4180 != 0) {
                           for(var10 = 0; var10 < var9; ++var10) {
                              var10000 = class420.NetCache_responseArchiveBuffer.array;
                              var10001 = var10 + class420.NetCache_responseArchiveBuffer.offset;
                              var10000[var10001] ^= NetCache.field4180;
                           }
                        }

                        var25 = class420.NetCache_responseArchiveBuffer;
                        var25.offset += var9;
                        NetCache.field4178 += var9;
                        if (var8 == class420.NetCache_responseArchiveBuffer.offset) {
                           if (16711935L == UserComparator6.NetCache_currentResponse.key) {
                              Messages.field1361 = class420.NetCache_responseArchiveBuffer;

                              for(var10 = 0; var10 < 256; ++var10) {
                                 Archive var19 = NetCache.NetCache_archives[var10];
                                 if (var19 != null) {
                                    Messages.field1361.offset = var10 * 8 + 5;
                                    if (Messages.field1361.offset >= Messages.field1361.array.length) {
                                       if (!var19.field4140) {
                                          throw new RuntimeException("");
                                       }

                                       var19.method6306();
                                    } else {
                                       var12 = Messages.field1361.readInt();
                                       int var20 = Messages.field1361.readInt();
                                       var19.loadIndex(var12, var20);
                                    }
                                 }
                              }
                           } else {
                              NetCache.NetCache_crc.reset();
                              NetCache.NetCache_crc.update(class420.NetCache_responseArchiveBuffer.array, 0, var8);
                              var10 = (int)NetCache.NetCache_crc.getValue();
                              if (var10 != UserComparator6.NetCache_currentResponse.crc) {
                                 try {
                                    NetCache.NetCache_socket.close();
                                 } catch (Exception var23) {
                                 }

                                 ++NetCache.NetCache_crcMismatches;
                                 NetCache.NetCache_socket = null;
                                 NetCache.field4180 = (byte)((int)(Math.random() * 255.0 + 1.0));
                                 var1 = false;
                                 break label246;
                              }

                              NetCache.NetCache_crcMismatches = 0;
                              NetCache.NetCache_ioExceptions = 0;
                              UserComparator6.NetCache_currentResponse.archive.write((int)(UserComparator6.NetCache_currentResponse.key & 65535L), class420.NetCache_responseArchiveBuffer.array, 16711680L == (UserComparator6.NetCache_currentResponse.key & 16711680L), UserComparator10.field1425);
                           }

                           UserComparator6.NetCache_currentResponse.remove();
                           if (UserComparator10.field1425) {
                              --NetCache.NetCache_pendingPriorityResponsesCount;
                           } else {
                              --NetCache.NetCache_pendingResponsesCount;
                           }

                           NetCache.field4178 = 0;
                           UserComparator6.NetCache_currentResponse = null;
                           class420.NetCache_responseArchiveBuffer = null;
                        } else {
                           if (NetCache.field4178 != 512) {
                              break;
                           }

                           NetCache.field4178 = 0;
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

   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "4032"
   )
   @Export("doCycleJs5Connect")
   void doCycleJs5Connect() {
      if (NetCache.NetCache_crcMismatches >= 4) {
         this.error("js5crc");
         class21.updateGameState(1000);
      } else {
         if (NetCache.NetCache_ioExceptions >= 4) {
            if (gameState <= 5) {
               this.error("js5io");
               class21.updateGameState(1000);
               return;
            }

            field521 = 3000;
            NetCache.NetCache_ioExceptions = 3;
         }

         if (--field521 + 1 <= 0) {
            try {
               if (js5ConnectState == 0) {
                  GrandExchangeOffer.js5SocketTask = GameEngine.taskHandler.newSocketTask(class273.worldHost, class454.currentPort);
                  ++js5ConnectState;
               }

               if (js5ConnectState == 1) {
                  if (GrandExchangeOffer.js5SocketTask.status == 2) {
                     this.js5Error(-1);
                     return;
                  }

                  if (GrandExchangeOffer.js5SocketTask.status == 1) {
                     ++js5ConnectState;
                  }
               }

               Buffer var3;
               if (js5ConnectState == 2) {
                  Socket var2 = (Socket)GrandExchangeOffer.js5SocketTask.result;
                  BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
                  class297.js5Socket = var1;
                  var3 = new Buffer(5);
                  var3.writeByte(15);
                  var3.writeInt(209);
                  class297.js5Socket.write(var3.array, 0, 5);
                  ++js5ConnectState;
                  Frames.field2530 = UserComparator8.method2748();
               }

               if (js5ConnectState == 3) {
                  if (class297.js5Socket.available() > 0) {
                     int var5 = class297.js5Socket.readUnsignedByte();
                     if (var5 != 0) {
                        this.js5Error(var5);
                        return;
                     }

                     ++js5ConnectState;
                  } else if (UserComparator8.method2748() - Frames.field2530 > 30000L) {
                     this.js5Error(-2);
                     return;
                  }
               }

               if (js5ConnectState == 4) {
                  AbstractSocket var11 = class297.js5Socket;
                  boolean var6 = gameState > 20;
                  if (NetCache.NetCache_socket != null) {
                     try {
                        NetCache.NetCache_socket.close();
                     } catch (Exception var9) {
                     }

                     NetCache.NetCache_socket = null;
                  }

                  NetCache.NetCache_socket = var11;
                  MouseHandler.method697(var6);
                  NetCache.NetCache_responseHeaderBuffer.offset = 0;
                  UserComparator6.NetCache_currentResponse = null;
                  class420.NetCache_responseArchiveBuffer = null;
                  NetCache.field4178 = 0;

                  while(true) {
                     NetFileRequest var12 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
                     if (var12 == null) {
                        while(true) {
                           var12 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
                           if (var12 == null) {
                              if (NetCache.field4180 != 0) {
                                 try {
                                    var3 = new Buffer(4);
                                    var3.writeByte(4);
                                    var3.writeByte(NetCache.field4180);
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
                              DirectByteArrayCopier.field3653 = UserComparator8.method2748();
                              GrandExchangeOffer.js5SocketTask = null;
                              class297.js5Socket = null;
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

   @ObfuscatedName("fo")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1260239396"
   )
   @Export("js5Error")
   void js5Error(int var1) {
      GrandExchangeOffer.js5SocketTask = null;
      class297.js5Socket = null;
      js5ConnectState = 0;
      if (class159.worldPort == class454.currentPort) {
         class454.currentPort = class131.js5Port;
      } else {
         class454.currentPort = class159.worldPort;
      }

      ++js5Errors;
      if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
         if (gameState <= 5) {
            this.error("js5connect_full");
            class21.updateGameState(1000);
         } else {
            field521 = 3000;
         }
      } else if (js5Errors >= 2 && var1 == 6) {
         this.error("js5connect_outofdate");
         class21.updateGameState(1000);
      } else if (js5Errors >= 4) {
         if (gameState <= 5) {
            this.error("js5connect");
            class21.updateGameState(1000);
         } else {
            field521 = 3000;
         }
      }

   }

   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2134752646"
   )
   @Export("doCycleLoggedOut")
   final void doCycleLoggedOut() {
      Object var1 = packetWriter.getSocket();
      PacketBuffer var2 = packetWriter.packetBuffer;

      try {
         if (loginState == 0) {
            if (ClanChannel.secureRandom == null && (secureRandomFuture.isDone() || field525 > 250)) {
               ClanChannel.secureRandom = secureRandomFuture.get();
               secureRandomFuture.shutdown();
               secureRandomFuture = null;
            }

            if (ClanChannel.secureRandom != null) {
               if (var1 != null) {
                  ((AbstractSocket)var1).close();
                  var1 = null;
               }

               VertexNormal.socketTask = null;
               hadNetworkError = false;
               field525 = 0;
               if (field615.method8675()) {
                  try {
                     this.method1186(SpriteMask.field3386);
                     ReflectionCheck.method713(21);
                  } catch (Throwable var25) {
                     class421.RunException_sendStackTrace((String)null, var25);
                     class129.getLoginError(65);
                     return;
                  }
               } else {
                  ReflectionCheck.method713(1);
               }
            }
         }

         class21 var27;
         if (loginState == 21) {
            if (this.field538 != null) {
               if (!this.field538.isDone()) {
                  return;
               }

               if (this.field538.isCancelled()) {
                  class129.getLoginError(65);
                  this.field538 = null;
                  return;
               }

               try {
                  RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field538.get();
                  if (!var3.isSuccess()) {
                     class129.getLoginError(65);
                     this.field538 = null;
                     return;
                  }

                  class298.field3418 = var3.getAccessToken();
                  SpriteMask.field3386 = var3.getRefreshToken();
                  this.field538 = null;
               } catch (Exception var24) {
                  class421.RunException_sendStackTrace((String)null, var24);
                  class129.getLoginError(65);
                  this.field538 = null;
                  return;
               }
            } else {
               if (this.field536 == null) {
                  class129.getLoginError(65);
                  return;
               }

               if (!this.field536.method273()) {
                  return;
               }

               if (this.field536.method285()) {
                  class421.RunException_sendStackTrace(this.field536.method277(), (Throwable)null);
                  class129.getLoginError(65);
                  this.field536 = null;
                  return;
               }

               var27 = this.field536.method274();
               if (var27.method295() != 200) {
                  class129.getLoginError(65);
                  this.field536 = null;
                  return;
               }

               field525 = 0;
               class419 var4 = new class419(var27.method296());

               try {
                  class298.field3418 = var4.method7786().getString("access_token");
                  SpriteMask.field3386 = var4.method7786().getString("refresh_token");
               } catch (Exception var23) {
                  class421.RunException_sendStackTrace("Error parsing tokens", var23);
                  class129.getLoginError(65);
                  this.field536 = null;
                  return;
               }
            }

            this.method1187(class298.field3418);
            ReflectionCheck.method713(20);
         }

         if (loginState == 20) {
            if (this.field534 != null) {
               if (!this.field534.isDone()) {
                  return;
               }

               if (this.field534.isCancelled()) {
                  class129.getLoginError(65);
                  this.field534 = null;
                  return;
               }

               try {
                  OtlTokenResponse var28 = (OtlTokenResponse)this.field534.get();
                  if (!var28.isSuccess()) {
                     class129.getLoginError(65);
                     this.field534 = null;
                     return;
                  }

                  this.field530 = var28.getToken();
                  this.field534 = null;
               } catch (Exception var22) {
                  class421.RunException_sendStackTrace((String)null, var22);
                  class129.getLoginError(65);
                  this.field534 = null;
                  return;
               }
            } else {
               if (this.field532 == null) {
                  class129.getLoginError(65);
                  return;
               }

               if (!this.field532.method273()) {
                  return;
               }

               if (this.field532.method285()) {
                  class421.RunException_sendStackTrace(this.field532.method277(), (Throwable)null);
                  class129.getLoginError(65);
                  this.field532 = null;
                  return;
               }

               var27 = this.field532.method274();
               if (var27.method295() != 200) {
                  class421.RunException_sendStackTrace("Response code: " + var27.method295() + "Response body: " + var27.method296(), (Throwable)null);
                  class129.getLoginError(65);
                  this.field532 = null;
                  return;
               }

               this.field530 = var27.method296();
               this.field532 = null;
            }

            field525 = 0;
            ReflectionCheck.method713(1);
         }

         if (loginState == 1) {
            if (VertexNormal.socketTask == null) {
               VertexNormal.socketTask = GameEngine.taskHandler.newSocketTask(class273.worldHost, class454.currentPort);
            }

            if (VertexNormal.socketTask.status == 2) {
               throw new IOException();
            }

            if (VertexNormal.socketTask.status == 1) {
               Socket var29 = (Socket)VertexNormal.socketTask.result;
               BufferedNetSocket var30 = new BufferedNetSocket(var29, 40000, 5000);
               var1 = var30;
               packetWriter.setSocket(var30);
               VertexNormal.socketTask = null;
               ReflectionCheck.method713(2);
            }
         }

         PacketBufferNode var31;
         if (loginState == 2) {
            packetWriter.clearBuffer();
            var31 = class278.method5404();
            var31.packetBuffer.writeByte(LoginPacket.field3247.id);
            packetWriter.addNode(var31);
            packetWriter.flush();
            var2.offset = 0;
            ReflectionCheck.method713(3);
         }

         int var12;
         if (loginState == 3) {
            if (HealthBar.pcmPlayer0 != null) {
               HealthBar.pcmPlayer0.method808();
            }

            if (class86.pcmPlayer1 != null) {
               class86.pcmPlayer1.method808();
            }

            if (((AbstractSocket)var1).isAvailable(1)) {
               var12 = ((AbstractSocket)var1).readUnsignedByte();
               if (HealthBar.pcmPlayer0 != null) {
                  HealthBar.pcmPlayer0.method808();
               }

               if (class86.pcmPlayer1 != null) {
                  class86.pcmPlayer1.method808();
               }

               if (var12 != 0) {
                  class129.getLoginError(var12);
                  return;
               }

               var2.offset = 0;
               ReflectionCheck.method713(4);
            }
         }

         if (loginState == 4) {
            if (var2.offset < 8) {
               var12 = ((AbstractSocket)var1).available();
               if (var12 > 8 - var2.offset) {
                  var12 = 8 - var2.offset;
               }

               if (var12 > 0) {
                  ((AbstractSocket)var1).read(var2.array, var2.offset, var12);
                  var2.offset += var12;
               }
            }

            if (var2.offset == 8) {
               var2.offset = 0;
               FileSystem.field1807 = var2.readLong();
               ReflectionCheck.method713(5);
            }
         }

         int var7;
         int var9;
         int var13;
         int var14;
         if (loginState == 5) {
            packetWriter.packetBuffer.offset = 0;
            packetWriter.clearBuffer();
            PacketBuffer var33 = new PacketBuffer(500);
            int[] var32 = new int[]{ClanChannel.secureRandom.nextInt(), ClanChannel.secureRandom.nextInt(), ClanChannel.secureRandom.nextInt(), ClanChannel.secureRandom.nextInt()};
            var33.offset = 0;
            var33.writeByte(1);
            var33.writeInt(var32[0]);
            var33.writeInt(var32[1]);
            var33.writeInt(var32[2]);
            var33.writeInt(var32[3]);
            var33.writeLong(FileSystem.field1807);
            int var11;
            if (gameState == 40) {
               var33.writeInt(class120.field1445[0]);
               var33.writeInt(class120.field1445[1]);
               var33.writeInt(class120.field1445[2]);
               var33.writeInt(class120.field1445[3]);
            } else {
               if (gameState == 50) {
                  var33.writeByte(class131.field1562.rsOrdinal());
                  var33.writeInt(HealthBarDefinition.field1923);
               } else {
                  var33.writeByte(field528.rsOrdinal());
                  switch (field528.field1563) {
                     case 0:
                        LinkedHashMap var6 = BufferedSink.clientPreferences.parameters;
                        String var8 = Login.Login_username;
                        var9 = var8.length();
                        int var10 = 0;

                        for(var11 = 0; var11 < var9; ++var11) {
                           var10 = (var10 << 5) - var10 + var8.charAt(var11);
                        }

                        var33.writeInt((Integer)var6.get(var10));
                        break;
                     case 1:
                     case 3:
                        var33.writeMedium(class360.field4308);
                        ++var33.offset;
                     case 2:
                     default:
                        break;
                     case 4:
                        var33.offset += 4;
                  }
               }

               if (field615.method8675()) {
                  var33.writeByte(class467.field4919.rsOrdinal());
                  var33.writeStringCp1252NullTerminated(this.field530);
               } else {
                  var33.writeByte(class467.field4923.rsOrdinal());
                  var33.writeStringCp1252NullTerminated(Login.Login_password);
               }
            }

            var33.encryptRsa(class71.field893, class71.field894);
            class120.field1445 = var32;
            PacketBufferNode var5 = class278.method5404();
            var5.packetBuffer.offset = 0;
            if (gameState == 40) {
               var5.packetBuffer.writeByte(LoginPacket.field3246.id);
            } else {
               var5.packetBuffer.writeByte(LoginPacket.field3251.id);
            }

            var5.packetBuffer.writeShort(0);
            var13 = var5.packetBuffer.offset;
            var5.packetBuffer.writeInt(209);
            var5.packetBuffer.writeInt(1);
            var5.packetBuffer.writeByte(clientType);
            var5.packetBuffer.writeByte(field573);
            var7 = 0;
            var5.packetBuffer.writeByte(var7);
            var5.packetBuffer.writeBytes(var33.array, 0, var33.offset);
            var14 = var5.packetBuffer.offset;
            var5.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
            var5.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
            var5.packetBuffer.writeShort(GameEngine.canvasWidth);
            var5.packetBuffer.writeShort(class10.canvasHeight);
            MusicPatchNode.method5669(var5.packetBuffer);
            var5.packetBuffer.writeStringCp1252NullTerminated(DynamicObject.field974);
            var5.packetBuffer.writeInt(Canvas.field126);
            Buffer var15 = new Buffer(class202.platformInfo.size());
            class202.platformInfo.write(var15);
            var5.packetBuffer.writeBytes(var15.array, 0, var15.array.length);
            var5.packetBuffer.writeByte(clientType);
            var5.packetBuffer.writeInt(0);
            var5.packetBuffer.writeIntME(class143.archive13.hash);
            var5.packetBuffer.writeInt(class157.archive2.hash);
            var5.packetBuffer.writeIntIME(class310.archive19.hash);
            var5.packetBuffer.writeInt(class142.archive8.hash);
            var5.packetBuffer.writeIntME(SecureRandomFuture.archive9.hash);
            var5.packetBuffer.writeIntIME(0);
            var5.packetBuffer.writeIntLE(MouseHandler.field251.hash);
            var5.packetBuffer.writeIntIME(ClanChannel.archive15.hash);
            var5.packetBuffer.writeInt(WorldMapRegion.archive10.hash);
            var5.packetBuffer.writeIntME(class150.archive5.hash);
            var5.packetBuffer.writeIntLE(NetCache.archive18.hash);
            var5.packetBuffer.writeIntME(ReflectionCheck.archive6.hash);
            var5.packetBuffer.writeIntIME(PlayerType.archive7.hash);
            var5.packetBuffer.writeIntLE(class7.field32.hash);
            var5.packetBuffer.writeIntIME(WorldMapSectionType.archive11.hash);
            var5.packetBuffer.writeInt(field522.hash);
            var5.packetBuffer.writeIntLE(ChatChannel.archive14.hash);
            var5.packetBuffer.writeIntLE(class382.archive17.hash);
            var5.packetBuffer.writeIntIME(class139.archive20.hash);
            var5.packetBuffer.writeInt(Canvas.archive4.hash);
            var5.packetBuffer.writeIntLE(class188.archive12.hash);
            var5.packetBuffer.xteaEncrypt(var32, var14, var5.packetBuffer.offset);
            var5.packetBuffer.writeLengthShort(var5.packetBuffer.offset - var13);
            packetWriter.addNode(var5);
            packetWriter.flush();
            packetWriter.isaacCipher = new IsaacCipher(var32);
            int[] var16 = new int[4];

            for(var11 = 0; var11 < 4; ++var11) {
               var16[var11] = var32[var11] + 50;
            }

            var2.newIsaacCipher(var16);
            ReflectionCheck.method713(6);
         }

         int var17;
         if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
            var12 = ((AbstractSocket)var1).readUnsignedByte();
            if (var12 == 61) {
               var17 = ((AbstractSocket)var1).available();
               ItemContainer.field1020 = var17 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1;
               ReflectionCheck.method713(5);
            }

            if (var12 == 21 && gameState == 20) {
               ReflectionCheck.method713(12);
            } else if (var12 == 2) {
               ReflectionCheck.method713(14);
            } else if (var12 == 15 && gameState == 40) {
               packetWriter.serverPacketLength = -1;
               ReflectionCheck.method713(19);
            } else if (var12 == 64) {
               ReflectionCheck.method713(10);
            } else if (var12 == 23 && field526 < 1) {
               ++field526;
               ReflectionCheck.method713(0);
            } else if (var12 == 29) {
               ReflectionCheck.method713(17);
            } else {
               if (var12 != 69) {
                  class129.getLoginError(var12);
                  return;
               }

               ReflectionCheck.method713(7);
            }
         }

         if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
            ((AbstractSocket)var1).read(var2.array, 0, 2);
            var2.offset = 0;
            GraphicsObject.field867 = var2.readUnsignedShort();
            ReflectionCheck.method713(8);
         }

         if (loginState == 8 && ((AbstractSocket)var1).available() >= GraphicsObject.field867) {
            var2.offset = 0;
            ((AbstractSocket)var1).read(var2.array, var2.offset, GraphicsObject.field867);
            class6[] var35 = new class6[]{class6.field19};
            class6 var34 = var35[var2.readUnsignedByte()];

            try {
               class3 var36 = HitSplatDefinition.method3716(var34);
               this.field544 = new class7(var2, var36);
               ReflectionCheck.method713(9);
            } catch (Exception var21) {
               class129.getLoginError(22);
               return;
            }
         }

         if (loginState == 9 && this.field544.method33()) {
            this.field585 = this.field544.method35();
            this.field544.method34();
            this.field544 = null;
            if (this.field585 == null) {
               class129.getLoginError(22);
               return;
            }

            packetWriter.clearBuffer();
            var31 = class278.method5404();
            var31.packetBuffer.writeByte(LoginPacket.field3248.id);
            var31.packetBuffer.writeShort(this.field585.offset);
            var31.packetBuffer.writeBuffer(this.field585);
            packetWriter.addNode(var31);
            packetWriter.flush();
            this.field585 = null;
            ReflectionCheck.method713(6);
         }

         if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
            ObjectComposition.field2132 = ((AbstractSocket)var1).readUnsignedByte();
            ReflectionCheck.method713(11);
         }

         if (loginState == 11 && ((AbstractSocket)var1).available() >= ObjectComposition.field2132) {
            ((AbstractSocket)var1).read(var2.array, 0, ObjectComposition.field2132);
            var2.offset = 0;
            ReflectionCheck.method713(6);
         }

         if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
            field574 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
            ReflectionCheck.method713(13);
         }

         if (loginState == 13) {
            field525 = 0;
            MusicPatchNode2.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field574 / 60 + " seconds.");
            if (--field574 <= 0) {
               ReflectionCheck.method713(0);
            }

         } else {
            if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
               GraphicsObject.field860 = ((AbstractSocket)var1).readUnsignedByte();
               ReflectionCheck.method713(15);
            }

            if (loginState == 15 && ((AbstractSocket)var1).available() >= GraphicsObject.field860) {
               boolean var45 = ((AbstractSocket)var1).readUnsignedByte() == 1;
               ((AbstractSocket)var1).read(var2.array, 0, 4);
               var2.offset = 0;
               boolean var46 = false;
               if (var45) {
                  var17 = var2.readByteIsaac() << 24;
                  var17 |= var2.readByteIsaac() << 16;
                  var17 |= var2.readByteIsaac() << 8;
                  var17 |= var2.readByteIsaac();
                  String var42 = Login.Login_username;
                  var7 = var42.length();
                  var14 = 0;
                  var9 = 0;

                  while(true) {
                     if (var9 >= var7) {
                        if (BufferedSink.clientPreferences.parameters.size() >= 10 && !BufferedSink.clientPreferences.parameters.containsKey(var14)) {
                           Iterator var44 = BufferedSink.clientPreferences.parameters.entrySet().iterator();
                           var44.next();
                           var44.remove();
                        }

                        BufferedSink.clientPreferences.parameters.put(var14, var17);
                        break;
                     }

                     var14 = (var14 << 5) - var14 + var42.charAt(var9);
                     ++var9;
                  }
               }

               if (Login_isUsernameRemembered) {
                  BufferedSink.clientPreferences.method2385(Login.Login_username);
               } else {
                  BufferedSink.clientPreferences.method2385((String)null);
               }

               class149.savePreferences();
               staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
               playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
               localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
               localPlayerIndex <<= 8;
               localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
               field778 = ((AbstractSocket)var1).readUnsignedByte();
               ((AbstractSocket)var1).read(var2.array, 0, 8);
               var2.offset = 0;
               this.field545 = var2.readLong();
               if (GraphicsObject.field860 >= 29) {
                  ((AbstractSocket)var1).read(var2.array, 0, 8);
                  var2.offset = 0;
                  field489 = var2.readLong();
               }

               ((AbstractSocket)var1).read(var2.array, 0, 1);
               var2.offset = 0;
               ServerPacket[] var39 = VarcInt.ServerPacket_values();
               var13 = var2.readSmartByteShortIsaac();
               if (var13 < 0 || var13 >= var39.length) {
                  throw new IOException(var13 + " " + var2.offset);
               }

               packetWriter.serverPacket = var39[var13];
               packetWriter.serverPacketLength = packetWriter.serverPacket.length;
               ((AbstractSocket)var1).read(var2.array, 0, 2);
               var2.offset = 0;
               packetWriter.serverPacketLength = var2.readUnsignedShort();

               try {
                  class27.method398(ClanChannelMember.client, "zap");
               } catch (Throwable var20) {
               }

               ReflectionCheck.method713(16);
            }

            if (loginState != 16) {
               if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, 2);
                  var2.offset = 0;
                  class154.field1724 = var2.readUnsignedShort();
                  ReflectionCheck.method713(18);
               }

               if (loginState == 18 && ((AbstractSocket)var1).available() >= class154.field1724) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, class154.field1724);
                  var2.offset = 0;
                  String var43 = var2.readStringCp1252NullTerminated();
                  String var38 = var2.readStringCp1252NullTerminated();
                  String var40 = var2.readStringCp1252NullTerminated();
                  MusicPatchNode2.setLoginResponseString(var43, var38, var40);
                  class21.updateGameState(10);
                  if (field615.method8675()) {
                     GrandExchangeOfferOwnWorldComparator.method1171(9);
                  }
               }

               if (loginState == 19) {
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
                     var12 = packetWriter.serverPacketLength;
                     timer.method7171();
                     WorldMapData_0.method4678();
                     WorldMapCacheName.updatePlayer(var2);
                     if (var12 != var2.offset) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field525;
                  if (field525 > 2000) {
                     if (field526 < 1) {
                        if (class159.worldPort == class454.currentPort) {
                           class454.currentPort = class131.js5Port;
                        } else {
                           class454.currentPort = class159.worldPort;
                        }

                        ++field526;
                        ReflectionCheck.method713(0);
                     } else {
                        class129.getLoginError(-3);
                     }
                  }
               }
            } else {
               if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
                  timer.method7184();
                  mouseLastLastPressedTimeMillis = -1L;
                  GrandExchangeOfferOwnWorldComparator.mouseRecorder.index = 0;
                  ChatChannel.hasFocus = true;
                  hadFocus = true;
                  field738 = -1L;
                  class18.method267();
                  packetWriter.clearBuffer();
                  packetWriter.packetBuffer.offset = 0;
                  packetWriter.serverPacket = null;
                  packetWriter.field1380 = null;
                  packetWriter.field1373 = null;
                  packetWriter.field1381 = null;
                  packetWriter.serverPacketLength = 0;
                  packetWriter.field1371 = 0;
                  rebootTimer = 0;
                  logoutTimer = 0;
                  hintArrowType = 0;
                  menuOptionsCount = 0;
                  isMenuOpen = false;
                  MouseHandler.MouseHandler_idleCycles = 0;
                  Messages.Messages_channels.clear();
                  Messages.Messages_hashTable.clear();
                  Messages.Messages_queue.clear();
                  Messages.Messages_count = 0;
                  isItemSelected = 0;
                  isSpellSelected = false;
                  soundEffectCount = 0;
                  camAngleY = 0;
                  oculusOrbState = 0;
                  NetFileRequest.field4144 = null;
                  minimapState = 0;
                  field519 = -1;
                  destinationX = 0;
                  destinationY = 0;
                  playerAttackOption = AttackOption.AttackOption_hidden;
                  npcAttackOption = AttackOption.AttackOption_hidden;
                  npcCount = 0;
                  Players.Players_count = 0;

                  for(var12 = 0; var12 < 2048; ++var12) {
                     Players.field1315[var12] = null;
                     Players.field1314[var12] = class202.field2282;
                  }

                  for(var12 = 0; var12 < 2048; ++var12) {
                     players[var12] = null;
                  }

                  for(var12 = 0; var12 < 65536; ++var12) {
                     npcs[var12] = null;
                  }

                  combatTargetPlayerIndex = -1;
                  projectiles.clear();
                  graphicsObjects.clear();

                  for(var12 = 0; var12 < 4; ++var12) {
                     for(var17 = 0; var17 < 104; ++var17) {
                        for(int var18 = 0; var18 < 104; ++var18) {
                           groundItems[var12][var17][var18] = null;
                        }
                     }
                  }

                  pendingSpawns = new NodeDeque();
                  WallDecoration.friendSystem.clear();

                  for(var12 = 0; var12 < VarpDefinition.field1866; ++var12) {
                     VarpDefinition var37 = ClientPacket.VarpDefinition_get(var12);
                     if (var37 != null) {
                        Varps.Varps_temp[var12] = 0;
                        Varps.Varps_main[var12] = 0;
                     }
                  }

                  Projectile.varcs.clearTransient();
                  followerIndex = -1;
                  if (rootInterface != -1) {
                     WorldMapAreaData.method5265(rootInterface);
                  }

                  for(InterfaceParent var41 = (InterfaceParent)interfaceParents.first(); var41 != null; var41 = (InterfaceParent)interfaceParents.next()) {
                     class7.closeInterface(var41, true);
                  }

                  rootInterface = -1;
                  interfaceParents = new NodeHashTable(8);
                  meslayerContinueWidget = null;
                  menuOptionsCount = 0;
                  isMenuOpen = false;
                  playerAppearance.method5731((int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

                  for(var12 = 0; var12 < 8; ++var12) {
                     playerMenuActions[var12] = null;
                     playerOptionsPriorities[var12] = false;
                  }

                  class133.method2975();
                  isLoading = true;

                  for(var12 = 0; var12 < 100; ++var12) {
                     field717[var12] = true;
                  }

                  class9.method61();
                  MenuAction.friendsChat = null;
                  class121.guestClanSettings = null;
                  Arrays.fill(currentClanSettings, (Object)null);
                  class198.guestClanChannel = null;
                  Arrays.fill(currentClanChannels, (Object)null);

                  for(var12 = 0; var12 < 8; ++var12) {
                     grandExchangeOffers[var12] = new GrandExchangeOffer();
                  }

                  WorldMapCacheName.grandExchangeEvents = null;
                  WorldMapCacheName.updatePlayer(var2);
                  class343.field4234 = -1;
                  class6.loadRegions(false, var2);
                  packetWriter.serverPacket = null;
               }

            }
         }
      } catch (IOException var26) {
         if (field526 < 1) {
            if (class159.worldPort == class454.currentPort) {
               class454.currentPort = class131.js5Port;
            } else {
               class454.currentPort = class159.worldPort;
            }

            ++field526;
            ReflectionCheck.method713(0);
         } else {
            class129.getLoginError(-2);
         }
      }
   }

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-431353402"
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
         WorldMapSection0.method5101();
      } else {
         if (!isMenuOpen) {
            MusicPatchNode.addCancelMenuEntry();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.method1202(packetWriter); ++var1) {
         }

         if (gameState == 30) {
            while(true) {
               ReflectionCheck var2 = (ReflectionCheck)class37.reflectionChecks.last();
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
                  if (timer.field4399) {
                     var14 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
                     var14.packetBuffer.writeByte(0);
                     var15 = var14.packetBuffer.offset;
                     timer.write(var14.packetBuffer);
                     var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15);
                     packetWriter.addNode(var14);
                     timer.method7170();
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
                  synchronized(GrandExchangeOfferOwnWorldComparator.mouseRecorder.lock) {
                     if (!field517) {
                        GrandExchangeOfferOwnWorldComparator.mouseRecorder.index = 0;
                     } else if (MouseHandler.MouseHandler_lastButton != 0 || GrandExchangeOfferOwnWorldComparator.mouseRecorder.index >= 40) {
                        var30 = null;
                        var3 = 0;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;

                        for(var7 = 0; var7 < GrandExchangeOfferOwnWorldComparator.mouseRecorder.index && (var30 == null || var30.packetBuffer.offset - var3 < 246); ++var7) {
                           var4 = var7;
                           var8 = GrandExchangeOfferOwnWorldComparator.mouseRecorder.ys[var7];
                           if (var8 < -1) {
                              var8 = -1;
                           } else if (var8 > 65534) {
                              var8 = 65534;
                           }

                           var9 = GrandExchangeOfferOwnWorldComparator.mouseRecorder.xs[var7];
                           if (var9 < -1) {
                              var9 = -1;
                           } else if (var9 > 65534) {
                              var9 = 65534;
                           }

                           if (var9 != field504 || var8 != field630) {
                              if (var30 == null) {
                                 var30 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3075, packetWriter.isaacCipher);
                                 var30.packetBuffer.writeByte(0);
                                 var3 = var30.packetBuffer.offset;
                                 var10000 = var30.packetBuffer;
                                 var10000.offset += 2;
                                 var5 = 0;
                                 var6 = 0;
                              }

                              if (-1L != field501) {
                                 var10 = var9 - field504;
                                 var11 = var8 - field630;
                                 var12 = (int)((GrandExchangeOfferOwnWorldComparator.mouseRecorder.millis[var7] - field501) / 20L);
                                 var5 = (int)((long)var5 + (GrandExchangeOfferOwnWorldComparator.mouseRecorder.millis[var7] - field501) % 20L);
                              } else {
                                 var10 = var9;
                                 var11 = var8;
                                 var12 = Integer.MAX_VALUE;
                              }

                              field504 = var9;
                              field630 = var8;
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
                                 var30.packetBuffer.writeShort((var12 & 8191) + '\ue000');
                                 if (var9 != -1 && var8 != -1) {
                                    var30.packetBuffer.writeInt(var9 | var8 << 16);
                                 } else {
                                    var30.packetBuffer.writeInt(Integer.MIN_VALUE);
                                 }
                              }

                              ++var6;
                              field501 = GrandExchangeOfferOwnWorldComparator.mouseRecorder.millis[var7];
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

                        if (var4 >= GrandExchangeOfferOwnWorldComparator.mouseRecorder.index) {
                           GrandExchangeOfferOwnWorldComparator.mouseRecorder.index = 0;
                        } else {
                           MouseRecorder var55 = GrandExchangeOfferOwnWorldComparator.mouseRecorder;
                           var55.index -= var4;
                           System.arraycopy(GrandExchangeOfferOwnWorldComparator.mouseRecorder.xs, var4, GrandExchangeOfferOwnWorldComparator.mouseRecorder.xs, 0, GrandExchangeOfferOwnWorldComparator.mouseRecorder.index);
                           System.arraycopy(GrandExchangeOfferOwnWorldComparator.mouseRecorder.ys, var4, GrandExchangeOfferOwnWorldComparator.mouseRecorder.ys, 0, GrandExchangeOfferOwnWorldComparator.mouseRecorder.index);
                           System.arraycopy(GrandExchangeOfferOwnWorldComparator.mouseRecorder.millis, var4, GrandExchangeOfferOwnWorldComparator.mouseRecorder.millis, 0, GrandExchangeOfferOwnWorldComparator.mouseRecorder.index);
                        }
                     }
                  }

                  if (MouseHandler.MouseHandler_lastButton == 1 || !class82.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
                     long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis;
                     if (var16 > 32767L) {
                        var16 = 32767L;
                     }

                     mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis;
                     var3 = MouseHandler.MouseHandler_lastPressedY;
                     if (var3 < 0) {
                        var3 = 0;
                     } else if (var3 > class10.canvasHeight) {
                        var3 = class10.canvasHeight;
                     }

                     var4 = MouseHandler.MouseHandler_lastPressedX;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > GameEngine.canvasWidth) {
                        var4 = GameEngine.canvasWidth;
                     }

                     var5 = (int)var16;
                     PacketBufferNode var18 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
                     var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
                     var18.packetBuffer.writeShort(var4);
                     var18.packetBuffer.writeShort(var3);
                     packetWriter.addNode(var18);
                  }

                  if (field733.field2247 > 0) {
                     var14 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
                     var14.packetBuffer.writeShort(0);
                     var15 = var14.packetBuffer.offset;
                     long var19 = UserComparator8.method2748();

                     for(var5 = 0; var5 < field733.field2247; ++var5) {
                        long var21 = var19 - field738;
                        if (var21 > 16777215L) {
                           var21 = 16777215L;
                        }

                        field738 = var19;
                        var14.packetBuffer.method8449((int)var21);
                        var14.packetBuffer.writeByteSub(field733.field2246[var5]);
                     }

                     var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
                     packetWriter.addNode(var14);
                  }

                  if (field779 > 0) {
                     --field779;
                  }

                  if (field733.method3956(96) || field733.method3956(97) || field733.method3956(98) || field733.method3956(99)) {
                     field589 = true;
                  }

                  if (field589 && field779 <= 0) {
                     field779 = 20;
                     field589 = false;
                     var14 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
                     var14.packetBuffer.writeShort(camAngleX);
                     var14.packetBuffer.writeShortLE(camAngleY);
                     packetWriter.addNode(var14);
                  }

                  if (ChatChannel.hasFocus && !hadFocus) {
                     hadFocus = true;
                     var14 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
                     var14.packetBuffer.writeByte(1);
                     packetWriter.addNode(var14);
                  }

                  if (!ChatChannel.hasFocus && hadFocus) {
                     hadFocus = false;
                     var14 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
                     var14.packetBuffer.writeByte(0);
                     packetWriter.addNode(var14);
                  }

                  if (class7.worldMap != null) {
                     class7.worldMap.method7866();
                  }

                  Decimator.method1109();
                  if (class139.field1616) {
                     class31.method465();
                     class139.field1616 = false;
                  }

                  if (field519 != ApproximateRouteStrategy.Client_plane) {
                     field519 = ApproximateRouteStrategy.Client_plane;
                     class268.method5364(ApproximateRouteStrategy.Client_plane);
                  }

                  if (gameState != 30) {
                     return;
                  }

                  for(PendingSpawn var38 = (PendingSpawn)pendingSpawns.last(); var38 != null; var38 = (PendingSpawn)pendingSpawns.previous()) {
                     if (var38.hitpoints > 0) {
                        --var38.hitpoints;
                     }

                     if (var38.hitpoints == 0) {
                        if (var38.objectId < 0 || SoundSystem.method862(var38.objectId, var38.field1126)) {
                           class320.addPendingSpawnToScene(var38.plane, var38.type, var38.x, var38.y, var38.objectId, var38.field1125, var38.field1126);
                           var38.remove();
                        }
                     } else {
                        if (var38.delay > 0) {
                           --var38.delay;
                        }

                        if (var38.delay == 0 && var38.x >= 1 && var38.y >= 1 && var38.x <= 102 && var38.y <= 102 && (var38.field1127 < 0 || SoundSystem.method862(var38.field1127, var38.field1129))) {
                           class320.addPendingSpawnToScene(var38.plane, var38.type, var38.x, var38.y, var38.field1127, var38.field1120, var38.field1129);
                           var38.delay = -1;
                           if (var38.objectId == var38.field1127 && var38.objectId == -1) {
                              var38.remove();
                           } else if (var38.objectId == var38.field1127 && var38.field1125 == var38.field1120 && var38.field1126 == var38.field1129) {
                              var38.remove();
                           }
                        }
                     }
                  }

                  int var10002;
                  for(var1 = 0; var1 < soundEffectCount; ++var1) {
                     var10002 = queuedSoundEffectDelays[var1]--;
                     if (queuedSoundEffectDelays[var1] >= -10) {
                        SoundEffect var31 = soundEffects[var1];
                        if (var31 == null) {
                           var10000 = null;
                           var31 = SoundEffect.readSoundEffect(Canvas.archive4, soundEffectIds[var1], 0);
                           if (var31 == null) {
                              continue;
                           }

                           int[] var56 = queuedSoundEffectDelays;
                           var56[var1] += var31.calculateDelay();
                           soundEffects[var1] = var31;
                        }

                        if (queuedSoundEffectDelays[var1] < 0) {
                           if (soundLocations[var1] != 0) {
                              var4 = (soundLocations[var1] & 255) * 128;
                              var5 = soundLocations[var1] >> 16 & 255;
                              var6 = var5 * 128 + 64 - class296.localPlayer.x;
                              if (var6 < 0) {
                                 var6 = -var6;
                              }

                              var7 = soundLocations[var1] >> 8 & 255;
                              var8 = var7 * 128 + 64 - class296.localPlayer.y;
                              if (var8 < 0) {
                                 var8 = -var8;
                              }

                              var9 = var8 + var6 - 128;
                              if (var9 > var4) {
                                 queuedSoundEffectDelays[var1] = -100;
                                 continue;
                              }

                              if (var9 < 0) {
                                 var9 = 0;
                              }

                              var3 = (var4 - var9) * BufferedSink.clientPreferences.method2411() / var4;
                           } else {
                              var3 = BufferedSink.clientPreferences.method2427();
                           }

                           if (var3 > 0) {
                              RawSound var23 = var31.toRawSound().resample(FaceNormal.decimator);
                              RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3);
                              var24.setNumLoops(queuedSoundEffectLoops[var1] - 1);
                              class453.pcmStreamMixer.addSubStream(var24);
                           }

                           queuedSoundEffectDelays[var1] = -100;
                        }
                     } else {
                        --soundEffectCount;

                        for(var15 = var1; var15 < soundEffectCount; ++var15) {
                           soundEffectIds[var15] = soundEffectIds[var15 + 1];
                           soundEffects[var15] = soundEffects[var15 + 1];
                           queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1];
                           queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1];
                           soundLocations[var15] = soundLocations[var15 + 1];
                        }

                        --var1;
                     }
                  }

                  if (playingJingle) {
                     if (class283.musicPlayerStatus != 0) {
                        var29 = true;
                     } else {
                        var29 = class283.midiPcmStream.isReady();
                     }

                     if (!var29) {
                        if (BufferedSink.clientPreferences.method2391() != 0 && currentTrackGroupId != -1) {
                           class18.method266(ReflectionCheck.archive6, currentTrackGroupId, 0, BufferedSink.clientPreferences.method2391(), false);
                        }

                        playingJingle = false;
                     }
                  }

                  ++packetWriter.field1371;
                  if (packetWriter.field1371 > 750) {
                     WorldMapSection0.method5101();
                     return;
                  }

                  var1 = Players.Players_count;
                  int[] var32 = Players.Players_indices;

                  for(var3 = 0; var3 < var1; ++var3) {
                     Player var42 = players[var32[var3]];
                     if (var42 != null) {
                        class6.updateActorSequence(var42, 1);
                     }
                  }

                  for(var1 = 0; var1 < npcCount; ++var1) {
                     var15 = npcIndices[var1];
                     NPC var25 = npcs[var15];
                     if (var25 != null) {
                        class6.updateActorSequence(var25, var25.definition.size);
                     }
                  }

                  int[] var39 = Players.Players_indices;

                  for(var15 = 0; var15 < Players.Players_count; ++var15) {
                     Player var48 = players[var39[var15]];
                     if (var48 != null && var48.overheadTextCyclesRemaining > 0) {
                        --var48.overheadTextCyclesRemaining;
                        if (var48.overheadTextCyclesRemaining == 0) {
                           var48.overheadText = null;
                        }
                     }
                  }

                  for(var15 = 0; var15 < npcCount; ++var15) {
                     var3 = npcIndices[var15];
                     NPC var43 = npcs[var3];
                     if (var43 != null && var43.overheadTextCyclesRemaining > 0) {
                        --var43.overheadTextCyclesRemaining;
                        if (var43.overheadTextCyclesRemaining == 0) {
                           var43.overheadText = null;
                        }
                     }
                  }

                  ++field558;
                  if (mouseCrossColor != 0) {
                     mouseCrossState = mouseCrossState * 400 + 20;
                     if (mouseCrossState * 400 >= 400) {
                        mouseCrossColor = 0;
                     }
                  }

                  if (class133.field1575 != null) {
                     ++field697;
                     if (field697 >= 15) {
                        class143.invalidateWidget(class133.field1575);
                        class133.field1575 = null;
                     }
                  }

                  Widget var40 = Occluder.mousedOverWidgetIf1;
                  Widget var33 = Occluder.field2556;
                  Occluder.mousedOverWidgetIf1 = null;
                  Occluder.field2556 = null;
                  draggedOnWidget = null;
                  field640 = false;
                  field684 = false;
                  field679 = 0;

                  while(field733.method3981() && field679 < 128) {
                     if (staffModLevel >= 2 && field733.method3956(82) && field733.field2252 == 66) {
                        StringBuilder var44 = new StringBuilder();

                        Message var41;
                        for(Iterator var45 = Messages.Messages_hashTable.iterator(); var45.hasNext(); var44.append(var41.text).append('\n')) {
                           var41 = (Message)var45.next();
                           if (var41.sender != null && !var41.sender.isEmpty()) {
                              var44.append(var41.sender).append(':');
                           }
                        }

                        String var49 = var44.toString();
                        ClanChannelMember.client.method527(var49);
                     } else if (oculusOrbState != 1 || field733.field2256 <= 0) {
                        field737[field679] = field733.field2252;
                        field613[field679] = field733.field2256;
                        ++field679;
                     }
                  }

                  if (UserComparator3.method2773() && field733.method3956(82) && field733.method3956(81) && mouseWheelRotation != 0) {
                     var3 = class296.localPlayer.plane - mouseWheelRotation;
                     if (var3 < 0) {
                        var3 = 0;
                     } else if (var3 > 3) {
                        var3 = 3;
                     }

                     if (var3 != class296.localPlayer.plane) {
                        class143.method3054(class296.localPlayer.pathX[0] + KeyHandler.baseX * 64, class296.localPlayer.pathY[0] + class158.baseY * 64, var3, false);
                     }

                     mouseWheelRotation = 0;
                  }

                  if (MouseHandler.MouseHandler_lastButton == 1) {
                     field734.method3933();
                  }

                  if (rootInterface != -1) {
                     WorldMapID.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, class10.canvasHeight, 0, 0);
                  }

                  ++cycleCntr;

                  while(true) {
                     Widget var46;
                     Widget var47;
                     ScriptEvent var51;
                     do {
                        var51 = (ScriptEvent)field711.removeLast();
                        if (var51 == null) {
                           while(true) {
                              do {
                                 var51 = (ScriptEvent)field670.removeLast();
                                 if (var51 == null) {
                                    while(true) {
                                       do {
                                          var51 = (ScriptEvent)scriptEvents.removeLast();
                                          if (var51 == null) {
                                             while(true) {
                                                class198 var53 = (class198)field713.removeLast();
                                                if (var53 == null) {
                                                   this.menu();
                                                   WorldMapLabel.method5157();
                                                   if (clickedWidget != null) {
                                                      this.method1208();
                                                   }

                                                   PacketBufferNode var26;
                                                   if (VerticalAlignment.dragInventoryWidget != null) {
                                                      class143.invalidateWidget(VerticalAlignment.dragInventoryWidget);
                                                      ++itemDragDuration;
                                                      if (MouseHandler.MouseHandler_currentButton == 0) {
                                                         if (field616) {
                                                            if (VerticalAlignment.dragInventoryWidget == class168.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) {
                                                               Widget var54 = VerticalAlignment.dragInventoryWidget;
                                                               byte var34 = 0;
                                                               if (field671 == 1 && var54.contentType == 206) {
                                                                  var34 = 1;
                                                               }

                                                               if (var54.itemIds[dragItemSlotDestination] <= 0) {
                                                                  var34 = 0;
                                                               }

                                                               var6 = class197.getWidgetFlags(var54);
                                                               boolean var35 = (var6 >> 29 & 1) != 0;
                                                               if (var35) {
                                                                  var7 = dragItemSlotSource;
                                                                  var8 = dragItemSlotDestination;
                                                                  var54.itemIds[var8] = var54.itemIds[var7];
                                                                  var54.itemQuantities[var8] = var54.itemQuantities[var7];
                                                                  var54.itemIds[var7] = -1;
                                                                  var54.itemQuantities[var7] = 0;
                                                               } else if (var34 == 1) {
                                                                  var7 = dragItemSlotSource;
                                                                  var8 = dragItemSlotDestination;

                                                                  while(var7 != var8) {
                                                                     if (var7 > var8) {
                                                                        var54.swapItems(var7 - 1, var7);
                                                                        --var7;
                                                                     } else if (var7 < var8) {
                                                                        var54.swapItems(var7 + 1, var7);
                                                                        ++var7;
                                                                     }
                                                                  }
                                                               } else {
                                                                  var54.swapItems(dragItemSlotDestination, dragItemSlotSource);
                                                               }

                                                               var26 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.IF_BUTTOND, packetWriter.isaacCipher);
                                                               var26.packetBuffer.writeIntIME(VerticalAlignment.dragInventoryWidget.id);
                                                               var26.packetBuffer.writeByteSub(var34);
                                                               var26.packetBuffer.writeShortAddLE(dragItemSlotSource);
                                                               var26.packetBuffer.writeShort(dragItemSlotDestination);
                                                               packetWriter.addNode(var26);
                                                            }
                                                         } else if (this.shouldLeftClickOpenMenu()) {
                                                            this.openMenu(draggedWidgetX, draggedWidgetY);
                                                         } else if (menuOptionsCount > 0) {
                                                            var3 = draggedWidgetX;
                                                            var4 = draggedWidgetY;
                                                            MenuAction var50 = PendingSpawn.tempMenuAction;
                                                            if (var50 != null) {
                                                               PacketBufferNode.menuAction(var50.param0, var50.param1, var50.opcode, var50.identifier, var50.itemId, var50.action, var50.target, var3, var4);
                                                            }

                                                            PendingSpawn.tempMenuAction = null;
                                                         }

                                                         field697 = 10;
                                                         MouseHandler.MouseHandler_lastButton = 0;
                                                         VerticalAlignment.dragInventoryWidget = null;
                                                      } else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
                                                         field616 = true;
                                                      }
                                                   }

                                                   if (Scene.shouldSendWalk()) {
                                                      var3 = Scene.Scene_selectedX;
                                                      var4 = Scene.Scene_selectedY;
                                                      PacketBufferNode var52 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
                                                      var52.packetBuffer.writeByte(5);
                                                      var52.packetBuffer.writeShortAddLE(class158.baseY * 64 + var4);
                                                      var52.packetBuffer.writeByteNeg(field733.method3956(82) ? (field733.method3956(81) ? 2 : 1) : 0);
                                                      var52.packetBuffer.writeShortAdd(KeyHandler.baseX * 64 + var3);
                                                      packetWriter.addNode(var52);
                                                      Scene.method4311();
                                                      mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
                                                      mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
                                                      mouseCrossColor = 1;
                                                      mouseCrossState = 0;
                                                      destinationX = var3;
                                                      destinationY = var4;
                                                   }

                                                   if (var40 != Occluder.mousedOverWidgetIf1) {
                                                      if (var40 != null) {
                                                         class143.invalidateWidget(var40);
                                                      }

                                                      if (Occluder.mousedOverWidgetIf1 != null) {
                                                         class143.invalidateWidget(Occluder.mousedOverWidgetIf1);
                                                      }
                                                   }

                                                   if (var33 != Occluder.field2556 && field527 == field786) {
                                                      if (var33 != null) {
                                                         class143.invalidateWidget(var33);
                                                      }

                                                      if (Occluder.field2556 != null) {
                                                         class143.invalidateWidget(Occluder.field2556);
                                                      }
                                                   }

                                                   if (Occluder.field2556 != null) {
                                                      if (field527 < field786) {
                                                         ++field527;
                                                         if (field786 == field527) {
                                                            class143.invalidateWidget(Occluder.field2556);
                                                         }
                                                      }
                                                   } else if (field527 > 0) {
                                                      --field527;
                                                   }

                                                   if (oculusOrbState == 0) {
                                                      var3 = class296.localPlayer.x;
                                                      var4 = class296.localPlayer.y;
                                                      if (class31.oculusOrbFocalPointX - var3 < -500 || class31.oculusOrbFocalPointX - var3 > 500 || PendingSpawn.oculusOrbFocalPointY - var4 < -500 || PendingSpawn.oculusOrbFocalPointY - var4 > 500) {
                                                         class31.oculusOrbFocalPointX = var3;
                                                         PendingSpawn.oculusOrbFocalPointY = var4;
                                                      }

                                                      if (var3 != class31.oculusOrbFocalPointX) {
                                                         class31.oculusOrbFocalPointX += (var3 - class31.oculusOrbFocalPointX) / 16;
                                                      }

                                                      if (var4 != PendingSpawn.oculusOrbFocalPointY) {
                                                         PendingSpawn.oculusOrbFocalPointY += (var4 - PendingSpawn.oculusOrbFocalPointY) / 16;
                                                      }

                                                      var5 = class31.oculusOrbFocalPointX >> 7;
                                                      var6 = PendingSpawn.oculusOrbFocalPointY >> 7;
                                                      var7 = class132.getTileHeight(class31.oculusOrbFocalPointX, PendingSpawn.oculusOrbFocalPointY, ApproximateRouteStrategy.Client_plane);
                                                      var8 = 0;
                                                      if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                                                         for(var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                                                            for(var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                               var11 = ApproximateRouteStrategy.Client_plane;
                                                               if (var11 < 3 && (Tiles.Tiles_renderFlags[1][var9][var10] & 2) == 2) {
                                                                  ++var11;
                                                               }

                                                               var12 = var7 - Tiles.Tiles_heights[var11][var9][var10];
                                                               if (var12 > var8) {
                                                                  var8 = var12;
                                                               }
                                                            }
                                                         }
                                                      }

                                                      var9 = var8 * 192;
                                                      if (var9 > 98048) {
                                                         var9 = 98048;
                                                      }

                                                      if (var9 < 32768) {
                                                         var9 = 32768;
                                                      }

                                                      if (var9 > field590) {
                                                         field590 += (var9 - field590) / 24;
                                                      } else if (var9 < field590) {
                                                         field590 += (var9 - field590) / 80;
                                                      }

                                                      VarpDefinition.field1869 = class132.getTileHeight(class296.localPlayer.x, class296.localPlayer.y, ApproximateRouteStrategy.Client_plane) - camFollowHeight;
                                                   } else if (oculusOrbState == 1) {
                                                      class126.method2911();
                                                      short var37 = -1;
                                                      if (field733.method3956(33)) {
                                                         var37 = 0;
                                                      } else if (field733.method3956(49)) {
                                                         var37 = 1024;
                                                      }

                                                      if (field733.method3956(48)) {
                                                         if (var37 == 0) {
                                                            var37 = 1792;
                                                         } else if (var37 == 1024) {
                                                            var37 = 1280;
                                                         } else {
                                                            var37 = 1536;
                                                         }
                                                      } else if (field733.method3956(50)) {
                                                         if (var37 == 0) {
                                                            var37 = 256;
                                                         } else if (var37 == 1024) {
                                                            var37 = 768;
                                                         } else {
                                                            var37 = 512;
                                                         }
                                                      }

                                                      byte var36 = 0;
                                                      if (field733.method3956(35)) {
                                                         var36 = -1;
                                                      } else if (field733.method3956(51)) {
                                                         var36 = 1;
                                                      }

                                                      var5 = 0;
                                                      if (var37 >= 0 || var36 != 0) {
                                                         var5 = field733.method3956(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
                                                         var5 *= 16;
                                                         field533 = var37;
                                                         field583 = var36;
                                                      }

                                                      if (field581 < var5) {
                                                         field581 += var5 / 8;
                                                         if (field581 > var5) {
                                                            field581 = var5;
                                                         }
                                                      } else if (field581 > var5) {
                                                         field581 = field581 * 9 / 10;
                                                      }

                                                      if (field581 > 0) {
                                                         var6 = field581 / 16;
                                                         if (field533 >= 0) {
                                                            var3 = field533 - WorldMapSection1.cameraYaw & 2047;
                                                            var7 = Rasterizer3D.Rasterizer3D_sine[var3];
                                                            var8 = Rasterizer3D.Rasterizer3D_cosine[var3];
                                                            class31.oculusOrbFocalPointX += var7 * var6 / 65536;
                                                            PendingSpawn.oculusOrbFocalPointY += var8 * var6 / 65536;
                                                         }

                                                         if (field583 != 0) {
                                                            VarpDefinition.field1869 += var6 * field583;
                                                            if (VarpDefinition.field1869 > 0) {
                                                               VarpDefinition.field1869 = 0;
                                                            }
                                                         }
                                                      } else {
                                                         field533 = -1;
                                                         field583 = -1;
                                                      }

                                                      if (field733.method3956(13)) {
                                                         class20.method292();
                                                      }
                                                   }

                                                   if (MouseHandler.MouseHandler_currentButton == 4 && class82.mouseCam) {
                                                      var3 = MouseHandler.MouseHandler_y - mouseCamClickedY;
                                                      camAngleDX = var3 * 2;
                                                      mouseCamClickedY = var3 != -1 && var3 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
                                                      var4 = mouseCamClickedX - MouseHandler.MouseHandler_x;
                                                      camAngleDY = var4 * 2;
                                                      mouseCamClickedX = var4 != -1 && var4 != 1 ? (mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
                                                   } else {
                                                      if (field733.method3956(96)) {
                                                         camAngleDY += (-24 - camAngleDY) / 2;
                                                      } else if (field733.method3956(97)) {
                                                         camAngleDY += (24 - camAngleDY) / 2;
                                                      } else {
                                                         camAngleDY /= 2;
                                                      }

                                                      if (field733.method3956(98)) {
                                                         camAngleDX += (12 - camAngleDX) / 2;
                                                      } else if (field733.method3956(99)) {
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

                                                   if (field758) {
                                                      class96.method2519(SceneTilePaint.field2696, class103.field1344, class295.field3402);
                                                      UrlRequest.method2717(Widget.field3636, class31.field171);
                                                      if (SceneTilePaint.field2696 == TextureProvider.cameraX && class31.cameraY == class103.field1344 && class295.field3402 == class313.cameraZ && class408.cameraPitch == Widget.field3636 && WorldMapSection1.cameraYaw == class31.field171) {
                                                         field758 = false;
                                                         isCameraLocked = false;
                                                         class4.field11 = 0;
                                                         BuddyRankComparator.field1431 = 0;
                                                         MidiPcmStream.field3326 = 0;
                                                         MouseHandler.field254 = 0;
                                                         HealthBarDefinition.field1912 = 0;
                                                         UrlRequest.field1398 = 0;
                                                         class323.field4093 = 0;
                                                         class278.field3264 = 0;
                                                         class11.field62 = 0;
                                                         WorldMapData_1.field2829 = 0;
                                                      }
                                                   } else if (isCameraLocked) {
                                                      var3 = class278.field3264 * 128 + 64;
                                                      var4 = class11.field62 * 128 + 64;
                                                      var5 = class132.getTileHeight(var3, var4, ApproximateRouteStrategy.Client_plane) - WorldMapData_1.field2829;
                                                      class96.method2519(var3, var5, var4);
                                                      var3 = class4.field11 * 128 + 64;
                                                      var4 = BuddyRankComparator.field1431 * 16384 + 64;
                                                      var5 = class132.getTileHeight(var3, var4, ApproximateRouteStrategy.Client_plane) - MidiPcmStream.field3326;
                                                      var6 = var3 - TextureProvider.cameraX;
                                                      var7 = var5 - class31.cameraY;
                                                      var8 = var4 - class313.cameraZ;
                                                      var9 = (int)Math.sqrt((double)(var6 * var6 + var8 * var8));
                                                      var10 = (int)(Math.atan2((double)var7, (double)var9) * 325.9490051269531) & 2047;
                                                      var11 = (int)(Math.atan2((double)var6, (double)var8) * -325.9490051269531) & 2047;
                                                      UrlRequest.method2717(var10, var11);
                                                   }

                                                   for(var3 = 0; var3 < 5; ++var3) {
                                                      var10002 = field763[var3]++;
                                                   }

                                                   Projectile.varcs.tryWrite();
                                                   var3 = ++MouseHandler.MouseHandler_idleCycles - 1;
                                                   var5 = GameEngine.keyHandler.method353();
                                                   if (var3 > 15000 && var5 > 15000) {
                                                      logoutTimer = 250;
                                                      MouseHandler.MouseHandler_idleCycles = 14500;
                                                      var26 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
                                                      packetWriter.addNode(var26);
                                                   }

                                                   WallDecoration.friendSystem.processFriendUpdates();
                                                   ++packetWriter.pendingWrites;
                                                   if (packetWriter.pendingWrites > 50) {
                                                      var26 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
                                                      packetWriter.addNode(var26);
                                                   }

                                                   try {
                                                      packetWriter.flush();
                                                   } catch (IOException var27) {
                                                      WorldMapSection0.method5101();
                                                   }

                                                   return;
                                                }

                                                ModeWhere.method6590(var53);
                                             }
                                          }

                                          var46 = var51.widget;
                                          if (var46.childIndex < 0) {
                                             break;
                                          }

                                          var47 = class281.getWidget(var46.parentId);
                                       } while(var47 == null || var47.children == null || var46.childIndex >= var47.children.length || var46 != var47.children[var46.childIndex]);

                                       ServerPacket.runScriptEvent(var51);
                                    }
                                 }

                                 var46 = var51.widget;
                                 if (var46.childIndex < 0) {
                                    break;
                                 }

                                 var47 = class281.getWidget(var46.parentId);
                              } while(var47 == null || var47.children == null || var46.childIndex >= var47.children.length || var46 != var47.children[var46.childIndex]);

                              ServerPacket.runScriptEvent(var51);
                           }
                        }

                        var46 = var51.widget;
                        if (var46.childIndex < 0) {
                           break;
                        }

                        var47 = class281.getWidget(var46.parentId);
                     } while(var47 == null || var47.children == null || var46.childIndex >= var47.children.length || var46 != var47.children[var46.childIndex]);

                     ServerPacket.runScriptEvent(var51);
                  }
               }

               var30 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
               var30.packetBuffer.writeByte(0);
               var3 = var30.packetBuffer.offset;
               class86.performReflectionCheck(var30.packetBuffer);
               var30.packetBuffer.writeLengthByte(var30.packetBuffer.offset - var3);
               packetWriter.addNode(var30);
            }
         }
      }
   }

   @ObfuscatedName("gd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "141269332"
   )
   @Export("resizeJS")
   void resizeJS() {
      int var1 = GameEngine.canvasWidth;
      int var2 = class10.canvasHeight;
      if (super.contentWidth < var1) {
         var1 = super.contentWidth;
      }

      if (super.contentHeight < var2) {
         var2 = super.contentHeight;
      }

      if (BufferedSink.clientPreferences != null) {
         try {
            class27.method402(ClanChannelMember.client, "resize", new Object[]{class13.getWindowedMode()});
         } catch (Throwable var4) {
         }
      }

   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "80"
   )
   @Export("drawLoggedIn")
   final void drawLoggedIn() {
      if (rootInterface != -1) {
         ByteArrayPool.method7164(rootInterface);
      }

      int var1;
      for(var1 = 0; var1 < rootWidgetCount; ++var1) {
         if (field717[var1]) {
            field718[var1] = true;
         }

         field657[var1] = field717[var1];
         field717[var1] = false;
      }

      field739 = cycle;
      viewportX = -1;
      viewportY = -1;
      class168.hoveredItemContainer = null;
      if (rootInterface != -1) {
         rootWidgetCount = 0;
         class4444.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, class10.canvasHeight, 0, 0, -1);
      }

      Rasterizer2D.Rasterizer2D_resetClip();
      if (showMouseCross) {
         if (mouseCrossColor == 1) {
            class199.crossSprites[mouseCrossState * 400 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
         }

         if (mouseCrossColor == 2) {
            class199.crossSprites[mouseCrossState * 400 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
         }
      }

      if (!isMenuOpen) {
         if (viewportX != -1) {
            WorldMapData_0.method4667(viewportX, viewportY);
         }
      } else {
         var1 = class103.menuX;
         int var2 = class108.menuY;
         int var3 = PlayerCompositionColorTextureOverride.menuWidth;
         int var4 = WorldMapScaleHandler.menuHeight;
         int var5 = 6116423;
         Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
         Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
         UserComparator3.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
         int var6 = MouseHandler.MouseHandler_x;
         int var7 = MouseHandler.MouseHandler_y;

         for(int var8 = 0; var8 < menuOptionsCount; ++var8) {
            int var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
               var10 = 16776960;
            }

            UserComparator3.fontBold12.draw(FaceNormal.method4461(var8), var1 + 3, var9, var10, 0);
         }

         UserComparator8.method2749(class103.menuX, class108.menuY, PlayerCompositionColorTextureOverride.menuWidth, WorldMapScaleHandler.menuHeight);
      }

      if (gameDrawingMode == 3) {
         for(var1 = 0; var1 < rootWidgetCount; ++var1) {
            if (field657[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
            } else if (field718[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
            }
         }
      }

      ApproximateRouteStrategy.method1163(ApproximateRouteStrategy.Client_plane, class296.localPlayer.x, class296.localPlayer.y, field558);
      field558 = 0;
   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      descriptor = "(Ldc;IB)Z",
      garbageValue = "16"
   )
   boolean method1200(PacketWriter var1, int var2) {
      if (var1.serverPacketLength == 0) {
         MenuAction.friendsChat = null;
      } else {
         if (MenuAction.friendsChat == null) {
            MenuAction.friendsChat = new FriendsChat(ViewportMouse.loginType, ClanChannelMember.client);
         }

         MenuAction.friendsChat.method7267(var1.packetBuffer, var2);
      }

      GrandExchangeOffer.method6524();
      var1.serverPacket = null;
      return true;
   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      descriptor = "(Ldc;S)Z",
      garbageValue = "-7257"
   )
   boolean method1217(PacketWriter var1) {
      if (MenuAction.friendsChat != null) {
         MenuAction.friendsChat.method7268(var1.packetBuffer);
      }

      GrandExchangeOffer.method6524();
      var1.serverPacket = null;
      return true;
   }

   @ObfuscatedName("io")
   @ObfuscatedSignature(
      descriptor = "(Ldc;S)Z",
      garbageValue = "1841"
   )
   final boolean method1202(PacketWriter var1) {
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
               if (var1.field1368) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 0, 1);
                  var1.field1371 = 0;
                  var1.field1368 = false;
               }

               var3.offset = 0;
               if (var3.method8346()) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 1, 1);
                  var1.field1371 = 0;
               }

               var1.field1368 = true;
               ServerPacket[] var4 = VarcInt.ServerPacket_values();
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
            var1.field1371 = 0;
            timer.method7167();
            var1.field1381 = var1.field1373;
            var1.field1373 = var1.field1380;
            var1.field1380 = var1.serverPacket;
            if (ServerPacket.field3136 == var1.serverPacket) {
               class363.method6873(class273.field3109);
               var1.serverPacket = null;
               return true;
            }

            Widget var6;
            int var20;
            if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var5 = var3.readUnsignedShortAdd();
               var6 = class281.getWidget(var20);
               if (var6.modelType != 1 || var5 != var6.modelId) {
                  var6.modelType = 1;
                  var6.modelId = var5;
                  class143.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            String var52;
            if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
               var20 = var3.readUnsignedByteNeg();
               var5 = var3.readUnsignedByteNeg();
               var52 = var3.readStringCp1252NullTerminated();
               if (var5 >= 1 && var5 <= 8) {
                  if (var52.equalsIgnoreCase("null")) {
                     var52 = null;
                  }

                  playerMenuActions[var5 - 1] = var52;
                  playerOptionsPriorities[var5 - 1] = var20 == 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
               DevicePcmPlayerProvider.field122 = var3.readUnsignedByteNeg();
               class11.field64 = var3.readUnsignedByteAdd();

               for(var20 = DevicePcmPlayerProvider.field122; var20 < DevicePcmPlayerProvider.field122 + 8; ++var20) {
                  for(var5 = class11.field64; var5 < class11.field64 + 8; ++var5) {
                     if (groundItems[ApproximateRouteStrategy.Client_plane][var20][var5] != null) {
                        groundItems[ApproximateRouteStrategy.Client_plane][var20][var5] = null;
                        class162.updateItemPile(var20, var5);
                     }
                  }
               }

               for(PendingSpawn var51 = (PendingSpawn)pendingSpawns.last(); var51 != null; var51 = (PendingSpawn)pendingSpawns.previous()) {
                  if (var51.x >= DevicePcmPlayerProvider.field122 && var51.x < DevicePcmPlayerProvider.field122 + 8 && var51.y >= class11.field64 && var51.y < class11.field64 + 8 && var51.plane == ApproximateRouteStrategy.Client_plane) {
                     var51.hitpoints = 0;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            String var47;
            if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
               var47 = var3.readStringCp1252NullTerminated();
               Object[] var76 = new Object[var47.length() + 1];

               for(var22 = var47.length() - 1; var22 >= 0; --var22) {
                  if (var47.charAt(var22) == 's') {
                     var76[var22 + 1] = var3.readStringCp1252NullTerminated();
                  } else {
                     var76[var22 + 1] = new Integer(var3.readInt());
                  }
               }

               var76[0] = new Integer(var3.readInt());
               ScriptEvent var61 = new ScriptEvent();
               var61.args = var76;
               ServerPacket.runScriptEvent(var61);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3237 == var1.serverPacket) {
               class363.method6873(class273.field3112);
               var1.serverPacket = null;
               return true;
            }

            GameObject var14;
            int var15;
            int var16;
            String var25;
            byte var68;
            if (ServerPacket.field3192 == var1.serverPacket) {
               var68 = var3.readByte();
               var21 = var3.readStringCp1252NullTerminated();
               long var23 = (long)var3.readUnsignedShort();
               long var8 = (long)var3.readMedium();
               PlayerType var59 = (PlayerType)WallDecoration.findEnumerated(class303.PlayerType_values(), var3.readUnsignedByte());
               long var11 = var8 + (var23 << 32);
               boolean var66 = false;
               var14 = null;
               ClanChannel var67 = var68 >= 0 ? currentClanChannels[var68] : class198.guestClanChannel;
               if (var67 == null) {
                  var66 = true;
               } else {
                  var15 = 0;

                  while(true) {
                     if (var15 >= 100) {
                        if (var59.isUser && WallDecoration.friendSystem.isIgnored(new Username(var21, ViewportMouse.loginType))) {
                           var66 = true;
                        }
                        break;
                     }

                     if (var11 == crossWorldMessageIds[var15]) {
                        var66 = true;
                        break;
                     }

                     ++var15;
                  }
               }

               if (!var66) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var11;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var25 = AbstractFont.escapeBrackets(class296.method5721(var3));
                  var16 = var68 >= 0 ? 41 : 44;
                  if (var59.modIcon != -1) {
                     ItemContainer.addChatMessage(var16, class268.method5367(var59.modIcon) + var21, var25, var67.name);
                  } else {
                     ItemContainer.addChatMessage(var16, var21, var25, var67.name);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            NPC var7;
            int var26;
            if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
               var22 = var3.readUnsignedByte();
               var20 = var3.readUnsignedShortAdd();
               var5 = var3.readUnsignedShortAddLE();
               if (var5 == 65535) {
                  var5 = -1;
               }

               var7 = npcs[var20];
               if (var7 != null) {
                  if (var5 == var7.sequence && var5 != -1) {
                     var26 = WorldMapElement.SequenceDefinition_get(var5).field2232;
                     if (var26 == 1) {
                        var7.sequenceFrame = 0;
                        var7.sequenceFrameCycle = 0;
                        var7.sequenceDelay = var22;
                        var7.field1210 = 0;
                     } else if (var26 == 2) {
                        var7.field1210 = 0;
                     }
                  } else if (var5 == -1 || var7.sequence == -1 || WorldMapElement.SequenceDefinition_get(var5).field2225 >= WorldMapElement.SequenceDefinition_get(var7.sequence).field2225) {
                     var7.sequence = var5;
                     var7.sequenceFrame = 0;
                     var7.sequenceFrameCycle = 0;
                     var7.sequenceDelay = var22;
                     var7.field1210 = 0;
                     var7.field1211 = var7.pathLength;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3199 == var1.serverPacket) {
               class157.field1745 = null;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
               var20 = var3.readInt();
               InterfaceParent var75 = (InterfaceParent)interfaceParents.get((long)var20);
               if (var75 != null) {
                  class7.closeInterface(var75, true);
               }

               if (meslayerContinueWidget != null) {
                  class143.invalidateWidget(meslayerContinueWidget);
                  meslayerContinueWidget = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3222 == var1.serverPacket && isCameraLocked) {
               field758 = true;
               class323.field4093 = var3.readUnsignedByte();
               UrlRequest.field1398 = var3.readUnsignedByte();
               MouseHandler.field254 = var3.readUnsignedByte();
               HealthBarDefinition.field1912 = var3.readUnsignedByte();

               for(var20 = 0; var20 < 5; ++var20) {
                  field556[var20] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
               rebootTimer = var3.readUnsignedShortAdd() * 30;
               field499 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3225 == var1.serverPacket) {
               class363.method6873(class273.field3107);
               var1.serverPacket = null;
               return true;
            }

            boolean var77;
            if (ServerPacket.field3190 == var1.serverPacket) {
               var77 = var3.readUnsignedByte() == 1;
               if (var77) {
                  class101.field1307 = UserComparator8.method2748() - var3.readLong();
                  WorldMapCacheName.grandExchangeEvents = new GrandExchangeEvents(var3, true);
               } else {
                  WorldMapCacheName.grandExchangeEvents = null;
               }

               field706 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
               class6.loadRegions(true, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3161 == var1.serverPacket) {
               class363.method6873(class273.field3118);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readInt();
               var22 = WorldMapLabel.getGcDuration();
               PacketBufferNode var57 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
               var57.packetBuffer.writeInt(var20);
               var57.packetBuffer.writeIntME(var5);
               var57.packetBuffer.writeByteNeg(var22);
               var57.packetBuffer.writeByteSub(GameEngine.fps);
               packetWriter.addNode(var57);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var5 = var3.readUnsignedShortAdd();
               var6 = class281.getWidget(var20);
               if (var6 != null && var6.type == 0) {
                  if (var5 > var6.scrollHeight - var6.height) {
                     var5 = var6.scrollHeight - var6.height;
                  }

                  if (var5 < 0) {
                     var5 = 0;
                  }

                  if (var5 != var6.scrollY) {
                     var6.scrollY = var5;
                     class143.invalidateWidget(var6);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3168 == var1.serverPacket) {
               class363.method6873(class273.field3111);
               var1.serverPacket = null;
               return true;
            }

            int var27;
            Widget var28;
            if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               var5 = var3.readUnsignedShortLE();
               var22 = var3.readUnsignedShortAddLE();
               var27 = var3.readInt();
               var28 = class281.getWidget(var27);
               if (var20 != var28.modelAngleX || var5 != var28.modelAngleY || var22 != var28.modelZoom) {
                  var28.modelAngleX = var20;
                  var28.modelAngleY = var5;
                  var28.modelZoom = var22;
                  class143.invalidateWidget(var28);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3189 == var1.serverPacket) {
               for(var20 = 0; var20 < players.length; ++var20) {
                  if (players[var20] != null) {
                     players[var20].sequence = -1;
                  }
               }

               for(var20 = 0; var20 < npcs.length; ++var20) {
                  if (npcs[var20] != null) {
                     npcs[var20].sequence = -1;
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

            Widget var54;
            if (ServerPacket.field3135 == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               var5 = var3.readUnsignedShortLE();
               var22 = var3.readUnsignedIntME();
               var54 = class281.getWidget(var22);
               var54.field3533 = var5 + (var20 << 16);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3218 == var1.serverPacket) {
               class363.method6873(class273.field3113);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
               var47 = var3.readStringCp1252NullTerminated();
               var21 = AbstractFont.escapeBrackets(HealthBarDefinition.method3513(class296.method5721(var3)));
               MouseHandler.addGameMessage(6, var47, var21);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
               for(var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
                  if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
                     Varps.Varps_main[var20] = Varps.Varps_temp[var20];
                     ClanChannel.changeGameOptions(var20);
                     changedVarps[++changedVarpCount - 1 & 31] = var20;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3214 == var1.serverPacket) {
               return this.method1200(var1, 1);
            }

            if (ServerPacket.field3166 == var1.serverPacket) {
               class123.method2869();
               var68 = var3.readByte();
               class138 var74 = new class138(var3);
               ClanSettings var60;
               if (var68 >= 0) {
                  var60 = currentClanSettings[var68];
               } else {
                  var60 = class121.guestClanSettings;
               }

               var74.method3003(var60);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
               class376.logOut();
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.VARP_LARGE == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShortAddLE();
               Varps.Varps_temp[var5] = var20;
               if (Varps.Varps_main[var5] != var20) {
                  Varps.Varps_main[var5] = var20;
               }

               ClanChannel.changeGameOptions(var5);
               changedVarps[++changedVarpCount - 1 & 31] = var5;
               var1.serverPacket = null;
               return true;
            }

            long var9;
            if (ServerPacket.field3242 == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               if (var20 == 65535) {
                  var20 = -1;
               }

               var5 = var3.readUnsignedShortLE();
               if (var5 == 65535) {
                  var5 = -1;
               }

               var22 = var3.readInt();
               var27 = var3.readInt();

               for(var26 = var20; var26 <= var5; ++var26) {
                  var9 = ((long)var27 << 32) + (long)var26;
                  Node var79 = widgetFlags.get(var9);
                  if (var79 != null) {
                     var79.remove();
                  }

                  widgetFlags.put(new IntegerNode(var22), var9);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3238 == var1.serverPacket) {
               class363.method6873(class273.field3117);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.LOGOUT == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               class376.forceDisconnect(var20);
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.field3183 == var1.serverPacket) {
               class363.method6873(class273.field3110);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
               var3.offset += 28;
               if (var3.checkCrc()) {
                  WorldMapIcon_0.method5075(var3, var3.offset - 28);
               }

               var1.serverPacket = null;
               return true;
            }

            int var30;
            if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if (var20 < -70000) {
                  var5 += 32768;
               }

               if (var20 >= 0) {
                  var6 = class281.getWidget(var20);
               } else {
                  var6 = null;
               }

               for(; var3.offset < var1.serverPacketLength; FaceNormal.itemContainerSetItem(var5, var27, var26 - 1, var30)) {
                  var27 = var3.readUShortSmart();
                  var26 = var3.readUnsignedShort();
                  var30 = 0;
                  if (var26 != 0) {
                     var30 = var3.readUnsignedByte();
                     if (var30 == 255) {
                        var30 = var3.readInt();
                     }
                  }

                  if (var6 != null && var27 >= 0 && var27 < var6.itemIds.length) {
                     var6.itemIds[var27] = var26;
                     var6.itemQuantities[var27] = var30;
                  }
               }

               if (var6 != null) {
                  class143.invalidateWidget(var6);
               }

               ItemComposition.method3786();
               changedItemContainers[++field695 - 1 & 31] = var5 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
               publicChatMode = var3.readUnsignedByteAdd();
               tradeChatMode = var3.readUnsignedByte();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3213 == var1.serverPacket) {
               class363.method6873(class273.field3114);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3240 == var1.serverPacket) {
               class363.method6873(class273.field3121);
               var1.serverPacket = null;
               return true;
            }

            boolean var63;
            if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
               var20 = var3.readUShortSmart();
               var63 = var3.readUnsignedByte() == 1;
               var52 = "";
               boolean var82 = false;
               if (var63) {
                  var52 = var3.readStringCp1252NullTerminated();
                  if (WallDecoration.friendSystem.isIgnored(new Username(var52, ViewportMouse.loginType))) {
                     var82 = true;
                  }
               }

               String var80 = var3.readStringCp1252NullTerminated();
               if (!var82) {
                  MouseHandler.addGameMessage(var20, var52, var80);
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var70;
            if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var70 = class281.getWidget(var20);
               var70.modelType = 3;
               var70.modelId = class296.localPlayer.appearance.getChatHeadId();
               class143.invalidateWidget(var70);
               var1.serverPacket = null;
               return true;
            }

            long var12;
            long var31;
            long var33;
            if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
               var47 = var3.readStringCp1252NullTerminated();
               var31 = var3.readLong();
               var33 = (long)var3.readUnsignedShort();
               var9 = (long)var3.readMedium();
               PlayerType var29 = (PlayerType)WallDecoration.findEnumerated(class303.PlayerType_values(), var3.readUnsignedByte());
               var12 = var9 + (var33 << 32);
               boolean var83 = false;

               for(var15 = 0; var15 < 100; ++var15) {
                  if (var12 == crossWorldMessageIds[var15]) {
                     var83 = true;
                     break;
                  }
               }

               if (var29.isUser && WallDecoration.friendSystem.isIgnored(new Username(var47, ViewportMouse.loginType))) {
                  var83 = true;
               }

               if (!var83 && field687 == 0) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var12;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var25 = AbstractFont.escapeBrackets(HealthBarDefinition.method3513(class296.method5721(var3)));
                  if (var29.modIcon != -1) {
                     ItemContainer.addChatMessage(9, class268.method5367(var29.modIcon) + var47, var25, WorldMapEvent.base37DecodeLong(var31));
                  } else {
                     ItemContainer.addChatMessage(9, var47, var25, WorldMapEvent.base37DecodeLong(var31));
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
               GameObject.field2733 = true;
               WorldMapSection0.updateNpcs(true, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3131 == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               PcmPlayer.method841(var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
               class145.readReflectionCheck(var3, var1.serverPacketLength);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
               class11.field64 = var3.readUnsignedByteSub();
               DevicePcmPlayerProvider.field122 = var3.readUnsignedByte();

               while(var3.offset < var1.serverPacketLength) {
                  var20 = var3.readUnsignedByte();
                  class273 var73 = Tiles.method2169()[var20];
                  class363.method6873(var73);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
               isCameraLocked = true;
               field758 = false;
               class278.field3264 = var3.readUnsignedByte() * 16384;
               class11.field62 = var3.readUnsignedByte() * 16384;
               WorldMapData_1.field2829 = var3.readUnsignedShort();
               class323.field4093 = var3.readUnsignedByte();
               UrlRequest.field1398 = var3.readUnsignedByte();
               if (UrlRequest.field1398 >= 100) {
                  TextureProvider.cameraX = class278.field3264 * 128 + 64;
                  class313.cameraZ = class11.field62 * 128 + 64;
                  class31.cameraY = class132.getTileHeight(TextureProvider.cameraX, class313.cameraZ, ApproximateRouteStrategy.Client_plane) - WorldMapData_1.field2829;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
               WorldMapCacheName.updatePlayers(var3, var1.serverPacketLength);
               class377.method7197();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3233 == var1.serverPacket) {
               Script.field972 = true;
               WorldMapCacheName.updatePlayers(var3, var1.serverPacketLength);
               class377.method7197();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3229 == var1.serverPacket) {
               class316.method6251(var3.readStringCp1252NullTerminated());
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3143 == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               var5 = var3.readUnsignedByte();
               var22 = var3.readUnsignedShort();
               class273.queueSoundEffect(var20, var5, var22);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var63 = var3.readUnsignedByteSub() == 1;
               var6 = class281.getWidget(var20);
               if (var63 != var6.isHidden) {
                  var6.isHidden = var63;
                  class143.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            int var36;
            int var37;
            if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
               var30 = var3.readUnsignedShort();
               var36 = var3.readUnsignedByte();
               var37 = var3.readUnsignedShortLE();
               var22 = var3.method8451();
               var20 = var22 >> 16;
               var5 = var22 >> 8 & 255;
               var27 = var20 + (var22 >> 4 & 7);
               var26 = var5 + (var22 & 7);
               if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
                  var27 = var27 * 128 + 64;
                  var26 = var26 * 128 + 64;
                  GraphicsObject var85 = new GraphicsObject(var30, ApproximateRouteStrategy.Client_plane, var27, var26, class132.getTileHeight(var27, var26, ApproximateRouteStrategy.Client_plane) - var36, var37, cycle);
                  graphicsObjects.addFirst(var85);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3207 == var1.serverPacket) {
               field704 = cycleCntr;
               var68 = var3.readByte();
               class152 var72 = new class152(var3);
               ClanChannel var55;
               if (var68 >= 0) {
                  var55 = currentClanChannels[var68];
               } else {
                  var55 = class198.guestClanChannel;
               }

               var72.method3182(var55);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
               WallDecoration.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
               FontName.FriendSystem_invalidateIgnoreds();
               field701 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3155 == var1.serverPacket) {
               ItemComposition.method3786();
               weight = var3.readShort();
               field499 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var5 = var3.readUnsignedShort();
               var22 = var5 >> 10 & 31;
               var27 = var5 >> 5 & 31;
               var26 = var5 & 31;
               var30 = (var27 << 11) + (var22 << 19) + (var26 << 3);
               Widget var58 = class281.getWidget(var20);
               if (var30 != var58.color) {
                  var58.color = var30;
                  class143.invalidateWidget(var58);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MIDI_SONG == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               if (var20 == 65535) {
                  var20 = -1;
               }

               class37.playSong(var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3132 == var1.serverPacket) {
               var20 = var3.readMediumME();
               var5 = var3.readUnsignedShortLE();
               if (var5 == 65535) {
                  var5 = -1;
               }

               FloorDecoration.method4135(var5, var20);
               var1.serverPacket = null;
               return true;
            }

            int var13;
            int var17;
            int var18;
            Projectile var19;
            int var35;
            int var39;
            byte var81;
            byte var86;
            if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
               var39 = var3.readUnsignedShort();
               var81 = var3.readByteAdd();
               var15 = var3.readUnsignedShortAdd();
               var16 = var3.readUnsignedShortAdd();
               var13 = var3.readUnsignedByte() * 4;
               var86 = var3.readByteAdd();
               var18 = var3.readUnsignedByte();
               var37 = var3.method8465();
               var17 = var3.readUnsignedByteNeg();
               var22 = var3.readMedium();
               var20 = var22 >> 16;
               var5 = var22 >> 8 & 255;
               var27 = var20 + (var22 >> 4 & 7);
               var26 = var5 + (var22 & 7);
               var35 = var3.readUnsignedByteAdd() * 4;
               var30 = var81 + var27;
               var36 = var86 + var26;
               if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104 && var30 >= 0 && var36 >= 0 && var30 < 104 && var36 < 104 && var39 != 65535) {
                  var27 = var27 * 128 + 64;
                  var26 = var26 * 128 + 64;
                  var30 = var30 * 128 + 64;
                  var36 = var36 * 128 + 64;
                  var19 = new Projectile(var39, ApproximateRouteStrategy.Client_plane, var27, var26, class132.getTileHeight(var27, var26, ApproximateRouteStrategy.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var37, var35);
                  var19.setDestination(var30, var36, class132.getTileHeight(var30, var36, ApproximateRouteStrategy.Client_plane) - var35, var15 + cycle);
                  projectiles.addFirst(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3234 == var1.serverPacket) {
               var16 = var3.readUnsignedShort();
               var15 = var3.readUnsignedShortAddLE();
               var18 = var3.readUnsignedByteNeg();
               var22 = var3.readMedium();
               var20 = var22 >> 16;
               var5 = var22 >> 8 & 255;
               var27 = var20 + (var22 >> 4 & 7);
               var26 = var5 + (var22 & 7);
               var39 = var3.readUnsignedShort();
               var37 = var3.method8407();
               var13 = var3.readUnsignedByteNeg() * 4;
               var86 = var3.readByte();
               var35 = var3.readUnsignedByteSub() * 4;
               var81 = var3.readByte();
               var17 = var3.readUnsignedByte();
               var30 = var81 + var27;
               var36 = var86 + var26;
               if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104 && var30 >= 0 && var36 >= 0 && var30 < 104 && var36 < 104 && var39 != 65535) {
                  var27 = var27 * 128 + 64;
                  var26 = var26 * 128 + 64;
                  var30 = var30 * 128 + 64;
                  var36 = var36 * 128 + 64;
                  var19 = new Projectile(var39, ApproximateRouteStrategy.Client_plane, var27, var26, class132.getTileHeight(var27, var26, ApproximateRouteStrategy.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var37, var35);
                  var19.setDestination(var30, var36, class132.getTileHeight(var30, var36, ApproximateRouteStrategy.Client_plane) - var35, var15 + cycle);
                  projectiles.addFirst(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3171 == var1.serverPacket) {
               class363.method6873(class273.field3116);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedIntIME();
               var22 = var3.readUnsignedShort();
               if (var22 == 65535) {
                  var22 = -1;
               }

               var54 = class281.getWidget(var5);
               ItemComposition var78;
               if (!var54.isIf3) {
                  if (var22 == -1) {
                     var54.modelType = 0;
                     var1.serverPacket = null;
                     return true;
                  }

                  var78 = MidiPcmStream.ItemDefinition_get(var22);
                  var54.modelType = 4;
                  var54.modelId = var22;
                  var54.modelAngleX = var78.xan2d;
                  var54.modelAngleY = var78.yan2d;
                  var54.modelZoom = var78.zoom2d * 100 / var20;
                  class143.invalidateWidget(var54);
               } else {
                  var54.itemId = var22;
                  var54.itemQuantity = var20;
                  var78 = MidiPcmStream.ItemDefinition_get(var22);
                  var54.modelAngleX = var78.xan2d;
                  var54.modelAngleY = var78.yan2d;
                  var54.modelAngleZ = var78.zan2d;
                  var54.modelOffsetX = var78.offsetX2d;
                  var54.modelOffsetY = var78.offsetY2d;
                  var54.modelZoom = var78.zoom2d;
                  if (var78.isStackable == 1) {
                     var54.itemQuantityMode = 1;
                  } else {
                     var54.itemQuantityMode = 2;
                  }

                  if (var54.field3537 > 0) {
                     var54.modelZoom = var54.modelZoom * 32 / var54.field3537;
                  } else if (var54.rawWidth > 0) {
                     var54.modelZoom = var54.modelZoom * 32 / var54.rawWidth;
                  }

                  class143.invalidateWidget(var54);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3140 == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               rootInterface = var20;
               this.resizeRoot(false);
               Tiles.Widget_resetModelFrames(var20);
               class147.runWidgetOnLoadListener(rootInterface);

               for(var5 = 0; var5 < 100; ++var5) {
                  field717[var5] = true;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
               if (rootInterface != -1) {
                  WallDecoration.runIntfCloseListeners(rootInterface, 0);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
               WallDecoration.friendSystem.readUpdate(var3, var1.serverPacketLength);
               field701 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3204 == var1.serverPacket) {
               if (class157.field1745 == null) {
                  class157.field1745 = new class411(class203.HitSplatDefinition_cached);
               }

               class471 var49 = class203.HitSplatDefinition_cached.method7747(var3);
               class157.field1745.field4592.vmethod8143(var49.field4932, var49.field4930);
               field698[++field699 - 1 & 31] = var49.field4932;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
               ItemComposition.method3786();
               var20 = var3.readUnsignedIntIME();
               var5 = var3.readUnsignedByteNeg();
               var22 = var3.readUnsignedByteNeg();
               experience[var22] = var20;
               currentLevels[var22] = var5;
               levels[var22] = 1;

               for(var27 = 0; var27 < 98; ++var27) {
                  if (var20 >= Skills.Skills_experienceTable[var27]) {
                     levels[var22] = var27 + 2;
                  }
               }

               changedSkills[++changedSkillsCount - 1 & 31] = var22;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3219 == var1.serverPacket) {
               field704 = cycleCntr;
               var68 = var3.readByte();
               if (var1.serverPacketLength == 1) {
                  if (var68 >= 0) {
                     currentClanChannels[var68] = null;
                  } else {
                     class198.guestClanChannel = null;
                  }

                  var1.serverPacket = null;
                  return true;
               }

               if (var68 >= 0) {
                  currentClanChannels[var68] = new ClanChannel(var3);
               } else {
                  class198.guestClanChannel = new ClanChannel(var3);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3227 == var1.serverPacket) {
               var77 = var3.readBoolean();
               if (var77) {
                  if (NetFileRequest.field4144 == null) {
                     NetFileRequest.field4144 = new class340();
                  }
               } else {
                  NetFileRequest.field4144 = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShortAdd();
               var6 = class281.getWidget(var20);
               if (var6.modelType != 2 || var5 != var6.modelId) {
                  var6.modelType = 2;
                  var6.modelId = var5;
                  class143.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3148 == var1.serverPacket) {
               return this.method1200(var1, 2);
            }

            if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if (var20 < -70000) {
                  var5 += 32768;
               }

               if (var20 >= 0) {
                  var6 = class281.getWidget(var20);
               } else {
                  var6 = null;
               }

               if (var6 != null) {
                  for(var27 = 0; var27 < var6.itemIds.length; ++var27) {
                     var6.itemIds[var27] = 0;
                     var6.itemQuantities[var27] = 0;
                  }
               }

               AbstractWorldMapData.clearItemContainer(var5);
               var27 = var3.readUnsignedShort();

               for(var26 = 0; var26 < var27; ++var26) {
                  var30 = var3.readUnsignedShortLE();
                  var36 = var3.readUnsignedByteSub();
                  if (var36 == 255) {
                     var36 = var3.readUnsignedIntLE();
                  }

                  if (var6 != null && var26 < var6.itemIds.length) {
                     var6.itemIds[var26] = var30;
                     var6.itemQuantities[var26] = var36;
                  }

                  FaceNormal.itemContainerSetItem(var5, var26, var30 - 1, var36);
               }

               if (var6 != null) {
                  class143.invalidateWidget(var6);
               }

               ItemComposition.method3786();
               changedItemContainers[++field695 - 1 & 31] = var5 & 32767;
               var1.serverPacket = null;
               return true;
            }

            InterfaceParent var53;
            if (ServerPacket.field3178 == var1.serverPacket) {
               var20 = var3.readUnsignedByteSub();
               var5 = var3.readUnsignedIntLE();
               var22 = var3.readUnsignedShortAdd();
               var53 = (InterfaceParent)interfaceParents.get((long)var5);
               if (var53 != null) {
                  class7.closeInterface(var53, var22 != var53.group);
               }

               class409.method7738(var5, var22, var20);
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

               field705 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_1 == var1.serverPacket) {
               GameObject.field2733 = true;
               WorldMapSection0.updateNpcs(false, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
               class300.privateChatMode = class359.method6838(var3.readUnsignedByte());
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3202 == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               var5 = var3.readUnsignedByte();
               var22 = var3.readUnsignedByte();
               var27 = var3.readUnsignedByte();
               field556[var20] = true;
               field760[var20] = var5;
               field665[var20] = var22;
               field762[var20] = var27;
               field763[var20] = 0;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               Player var56;
               if (var20 == localPlayerIndex) {
                  var56 = class296.localPlayer;
               } else {
                  var56 = players[var20];
               }

               var22 = var3.readUnsignedIntLE();
               var5 = var3.readUnsignedShortAdd();
               if (var56 != null) {
                  var56.spotAnimation = var5;
                  var56.spotAnimationHeight = var22 >> 16;
                  var56.field1186 = (var22 & '\uffff') + cycle;
                  var56.spotAnimationFrame = 0;
                  var56.spotAnimationFrameCycle = 0;
                  if (var56.field1186 > cycle) {
                     var56.spotAnimationFrame = -1;
                  }

                  if (var56.spotAnimation == 65535) {
                     var56.spotAnimation = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               GraphicsDefaults.method7570(var20);
               changedItemContainers[++field695 - 1 & 31] = var20 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.URL_OPEN == var1.serverPacket) {
               byte[] var48 = new byte[var1.serverPacketLength];
               var3.method8356(var48, 0, var48.length);
               Buffer var71 = new Buffer(var48);
               var52 = var71.readStringCp1252NullTerminated();
               UrlRequester.openURL(var52, true, false);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3215 == var1.serverPacket) {
               class157.field1745 = new class411(class203.HitSplatDefinition_cached);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3208 == var1.serverPacket) {
               return this.method1217(var1);
            }

            if (ServerPacket.field3169 == var1.serverPacket) {
               var47 = var3.readStringCp1252NullTerminated();
               var5 = var3.readUnsignedIntME();
               var6 = class281.getWidget(var5);
               if (!var47.equals(var6.text)) {
                  var6.text = var47;
                  class143.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3177 == var1.serverPacket) {
               ItemComposition.method3786();
               runEnergy = var3.readUnsignedByte();
               field499 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3150 == var1.serverPacket) {
               var20 = var3.readInt();
               if (var20 != field586) {
                  field586 = var20;
                  method1724();
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
               WorldMapSection0.updateNpcs(false, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var5 = var3.readUnsignedIntLE();
               InterfaceParent var50 = (InterfaceParent)interfaceParents.get((long)var5);
               var53 = (InterfaceParent)interfaceParents.get((long)var20);
               if (var53 != null) {
                  class7.closeInterface(var53, var50 == null || var50.group != var53.group);
               }

               if (var50 != null) {
                  var50.remove();
                  interfaceParents.put(var50, (long)var20);
               }

               var28 = class281.getWidget(var5);
               if (var28 != null) {
                  class143.invalidateWidget(var28);
               }

               var28 = class281.getWidget(var20);
               if (var28 != null) {
                  class143.invalidateWidget(var28);
                  class16.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var28.id >>> 16], var28, true);
               }

               if (rootInterface != -1) {
                  WallDecoration.runIntfCloseListeners(rootInterface, 1);
               }

               var1.serverPacket = null;
               return true;
            }

            String var40;
            if (ServerPacket.field3217 == var1.serverPacket) {
               var68 = var3.readByte();
               var31 = (long)var3.readUnsignedShort();
               var33 = (long)var3.readMedium();
               var9 = var33 + (var31 << 32);
               boolean var84 = false;
               ClanChannel var38 = var68 >= 0 ? currentClanChannels[var68] : class198.guestClanChannel;
               if (var38 == null) {
                  var84 = true;
               } else {
                  for(var13 = 0; var13 < 100; ++var13) {
                     if (crossWorldMessageIds[var13] == var9) {
                        var84 = true;
                        break;
                     }
                  }
               }

               if (!var84) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var9;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var40 = class296.method5721(var3);
                  var35 = var68 >= 0 ? 43 : 46;
                  ItemContainer.addChatMessage(var35, "", var40, var38.name);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_2 == var1.serverPacket) {
               WorldMapSection0.updateNpcs(true, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3138 == var1.serverPacket) {
               var20 = var3.method8465();
               var5 = var3.readUnsignedIntLE();
               var6 = class281.getWidget(var5);
               if (var20 != var6.sequenceId || var20 == -1) {
                  var6.sequenceId = var20;
                  var6.modelFrame = 0;
                  var6.modelFrameCycle = 0;
                  class143.invalidateWidget(var6);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3181 == var1.serverPacket) {
               class363.method6873(class273.field3108);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
               class6.loadRegions(false, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var70 = class281.getWidget(var20);

               for(var22 = 0; var22 < var70.itemIds.length; ++var22) {
                  var70.itemIds[var22] = -1;
                  var70.itemIds[var22] = 0;
               }

               class143.invalidateWidget(var70);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
               var47 = var3.readStringCp1252NullTerminated();
               var31 = (long)var3.readUnsignedShort();
               var33 = (long)var3.readMedium();
               PlayerType var41 = (PlayerType)WallDecoration.findEnumerated(class303.PlayerType_values(), var3.readUnsignedByte());
               long var42 = var33 + (var31 << 32);
               boolean var87 = false;

               for(var13 = 0; var13 < 100; ++var13) {
                  if (crossWorldMessageIds[var13] == var42) {
                     var87 = true;
                     break;
                  }
               }

               if (WallDecoration.friendSystem.isIgnored(new Username(var47, ViewportMouse.loginType))) {
                  var87 = true;
               }

               if (!var87 && field687 == 0) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var42;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var40 = AbstractFont.escapeBrackets(HealthBarDefinition.method3513(class296.method5721(var3)));
                  if (var41.isPrivileged) {
                     var35 = 7;
                  } else {
                     var35 = 3;
                  }

                  if (var41.modIcon != -1) {
                     MouseHandler.addGameMessage(var35, class268.method5367(var41.modIcon) + var47, var40);
                  } else {
                     MouseHandler.addGameMessage(var35, var47, var40);
                  }
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

            if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
               var20 = var3.readShort();
               var5 = var3.readUnsignedIntME();
               var22 = var3.method8465();
               var54 = class281.getWidget(var5);
               if (var22 != var54.rawX || var20 != var54.rawY || var54.xAlignment != 0 || var54.yAlignment != 0) {
                  var54.rawX = var22;
                  var54.rawY = var20;
                  var54.xAlignment = 0;
                  var54.yAlignment = 0;
                  class143.invalidateWidget(var54);
                  this.alignWidget(var54);
                  if (var54.type == 0) {
                     class16.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var5 >> 16], var54, false);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_RESET == var1.serverPacket) {
               isCameraLocked = false;

               for(var20 = 0; var20 < 5; ++var20) {
                  field556[var20] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3172 == var1.serverPacket) {
               var20 = var3.offset + var1.serverPacketLength;
               var5 = var3.readUnsignedShort();
               var22 = var3.readUnsignedShort();
               if (var5 != rootInterface) {
                  rootInterface = var5;
                  this.resizeRoot(false);
                  Tiles.Widget_resetModelFrames(rootInterface);
                  class147.runWidgetOnLoadListener(rootInterface);

                  for(var27 = 0; var27 < 100; ++var27) {
                     field717[var27] = true;
                  }
               }

               InterfaceParent var10;
               for(; var22-- > 0; var10.field1037 = true) {
                  var27 = var3.readInt();
                  var26 = var3.readUnsignedShort();
                  var30 = var3.readUnsignedByte();
                  var10 = (InterfaceParent)interfaceParents.get((long)var27);
                  if (var10 != null && var26 != var10.group) {
                     class7.closeInterface(var10, true);
                     var10 = null;
                  }

                  if (var10 == null) {
                     var10 = class409.method7738(var27, var26, var30);
                  }
               }

               for(var53 = (InterfaceParent)interfaceParents.first(); var53 != null; var53 = (InterfaceParent)interfaceParents.next()) {
                  if (var53.field1037) {
                     var53.field1037 = false;
                  } else {
                     class7.closeInterface(var53, true);
                  }
               }

               widgetFlags = new NodeHashTable(512);

               while(var3.offset < var20) {
                  var27 = var3.readInt();
                  var26 = var3.readUnsignedShort();
                  var30 = var3.readUnsignedShort();
                  var36 = var3.readInt();

                  for(var37 = var26; var37 <= var30; ++var37) {
                     var12 = ((long)var27 << 32) + (long)var37;
                     widgetFlags.put(new IntegerNode(var36), var12);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3226 == var1.serverPacket) {
               class363.method6873(class273.field3106);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.VARP_SMALL == var1.serverPacket) {
               var68 = var3.readByteSub();
               var5 = var3.readUnsignedShortAdd();
               Varps.Varps_temp[var5] = var68;
               if (Varps.Varps_main[var5] != var68) {
                  Varps.Varps_main[var5] = var68;
               }

               ClanChannel.changeGameOptions(var5);
               changedVarps[++changedVarpCount - 1 & 31] = var5;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3134 == var1.serverPacket) {
               class11.field64 = var3.readUnsignedByteAdd();
               DevicePcmPlayerProvider.field122 = var3.readUnsignedByteAdd();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               var7 = npcs[var20];
               var22 = var3.readUnsignedShortLE();
               var5 = var3.readUnsignedIntIME();
               if (var7 != null) {
                  var7.spotAnimation = var22;
                  var7.spotAnimationHeight = var5 >> 16;
                  var7.field1186 = (var5 & '\uffff') + cycle;
                  var7.spotAnimationFrame = 0;
                  var7.spotAnimationFrameCycle = 0;
                  if (var7.field1186 > cycle) {
                     var7.spotAnimationFrame = -1;
                  }

                  if (var7.spotAnimation == 65535) {
                     var7.spotAnimation = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3174 == var1.serverPacket) {
               class123.method2869();
               var68 = var3.readByte();
               if (var1.serverPacketLength == 1) {
                  if (var68 >= 0) {
                     currentClanSettings[var68] = null;
                  } else {
                     class121.guestClanSettings = null;
                  }

                  var1.serverPacket = null;
                  return true;
               }

               if (var68 >= 0) {
                  currentClanSettings[var68] = new ClanSettings(var3);
               } else {
                  class121.guestClanSettings = new ClanSettings(var3);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
               for(var20 = 0; var20 < VarpDefinition.field1866; ++var20) {
                  VarpDefinition var69 = ClientPacket.VarpDefinition_get(var20);
                  if (var69 != null) {
                     Varps.Varps_temp[var20] = 0;
                     Varps.Varps_main[var20] = 0;
                  }
               }

               ItemComposition.method3786();
               changedVarpCount += 32;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3149 == var1.serverPacket) {
               class363.method6873(class273.field3119);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
               isCameraLocked = true;
               field758 = false;
               class4.field11 = var3.readUnsignedByte() * 16384;
               BuddyRankComparator.field1431 = var3.readUnsignedByte() * 128;
               MidiPcmStream.field3326 = var3.readUnsignedShort();
               MouseHandler.field254 = var3.readUnsignedByte();
               HealthBarDefinition.field1912 = var3.readUnsignedByte();
               if (HealthBarDefinition.field1912 >= 100) {
                  var20 = class4.field11 * 128 + 64;
                  var5 = BuddyRankComparator.field1431 * 16384 + 64;
                  var22 = class132.getTileHeight(var20, var5, ApproximateRouteStrategy.Client_plane) - MidiPcmStream.field3326;
                  var27 = var20 - TextureProvider.cameraX;
                  var26 = var22 - class31.cameraY;
                  var30 = var5 - class313.cameraZ;
                  var36 = (int)Math.sqrt((double)(var27 * var27 + var30 * var30));
                  class408.cameraPitch = (int)(Math.atan2((double)var26, (double)var36) * 325.9490051269531) & 2047;
                  WorldMapSection1.cameraYaw = (int)(Math.atan2((double)var27, (double)var30) * -325.9490051269531) & 2047;
                  if (class408.cameraPitch < 128) {
                     class408.cameraPitch = 128;
                  }

                  if (class408.cameraPitch > 383) {
                     class408.cameraPitch = 383;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
               World var46 = new World();
               var46.host = var3.readStringCp1252NullTerminated();
               var46.id = var3.readUnsignedShort();
               var5 = var3.readInt();
               var46.properties = var5;
               class21.updateGameState(45);
               var2.close();
               var2 = null;
               changeWorld(var46);
               var1.serverPacket = null;
               return false;
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

            if (ServerPacket.field3167 == var1.serverPacket) {
               WallDecoration.friendSystem.method1842();
               field701 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
               var13 = var3.readUnsignedShortAdd();
               var30 = var3.readUnsignedByteAdd();
               var36 = var30 >> 2;
               var37 = var30 & 3;
               var39 = field565[var36];
               var22 = var3.readMedium();
               var20 = var22 >> 16;
               var5 = var22 >> 8 & 255;
               var27 = var20 + (var22 >> 4 & 7);
               var26 = var5 + (var22 & 7);
               if (var27 >= 0 && var26 >= 0 && var27 < 103 && var26 < 103) {
                  if (var39 == 0) {
                     BoundaryObject var65 = class139.scene.method4293(ApproximateRouteStrategy.Client_plane, var27, var26);
                     if (var65 != null) {
                        var15 = AttackOption.Entity_unpackID(var65.tag);
                        if (var36 == 2) {
                           var65.renderable1 = new DynamicObject(var15, 2, var37 + 4, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var65.renderable1);
                           var65.renderable2 = new DynamicObject(var15, 2, var37 + 1 & 3, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var65.renderable2);
                        } else {
                           var65.renderable1 = new DynamicObject(var15, var36, var37, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var65.renderable1);
                        }
                     }
                  } else if (var39 == 1) {
                     WallDecoration var64 = class139.scene.method4294(ApproximateRouteStrategy.Client_plane, var27, var26);
                     if (var64 != null) {
                        var15 = AttackOption.Entity_unpackID(var64.tag);
                        if (var36 != 4 && var36 != 5) {
                           if (var36 == 6) {
                              var64.renderable1 = new DynamicObject(var15, 4, var37 + 4, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var64.renderable1);
                           } else if (var36 == 7) {
                              var64.renderable1 = new DynamicObject(var15, 4, (var37 + 2 & 3) + 4, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var64.renderable1);
                           } else if (var36 == 8) {
                              var64.renderable1 = new DynamicObject(var15, 4, var37 + 4, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var64.renderable1);
                              var64.renderable2 = new DynamicObject(var15, 4, (var37 + 2 & 3) + 4, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var64.renderable2);
                           }
                        } else {
                           var64.renderable1 = new DynamicObject(var15, 4, var37, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var64.renderable1);
                        }
                     }
                  } else if (var39 == 2) {
                     var14 = class139.scene.getGameObject(ApproximateRouteStrategy.Client_plane, var27, var26);
                     if (var36 == 11) {
                        var36 = 10;
                     }

                     if (var14 != null) {
                        var14.renderable = new DynamicObject(AttackOption.Entity_unpackID(var14.tag), var36, var37, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var14.renderable);
                     }
                  } else if (var39 == 3) {
                     FloorDecoration var62 = class139.scene.getFloorDecoration(ApproximateRouteStrategy.Client_plane, var27, var26);
                     if (var62 != null) {
                        var62.renderable = new DynamicObject(AttackOption.Entity_unpackID(var62.tag), 22, var37, ApproximateRouteStrategy.Client_plane, var27, var26, var13, false, var62.renderable);
                     }
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            class421.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1373 != null ? var1.field1373.id : -1) + "," + (var1.field1381 != null ? var1.field1381.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
            class376.logOut();
         } catch (IOException var44) {
            WorldMapSection0.method5101();
         } catch (Exception var45) {
            var21 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1373 != null ? var1.field1373.id : -1) + "," + (var1.field1381 != null ? var1.field1381.id : -1) + "," + var1.serverPacketLength + "," + (class296.localPlayer.pathX[0] + KeyHandler.baseX * 64) + "," + (class296.localPlayer.pathY[0] + class158.baseY * 64) + ",";

            for(var22 = 0; var22 < var1.serverPacketLength && var22 < 50; ++var22) {
               var21 = var21 + var3.array[var22] + ",";
            }

            class421.RunException_sendStackTrace(var21, var45);
            class376.logOut();
         }

         return true;
      }
   }

   @ObfuscatedName("in")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-15"
   )
   @Export("menu")
   final void menu() {
      boolean var1 = false;

      int var2;
      int var5;
      while(!var1) {
         var1 = true;

         for(var2 = 0; var2 < menuOptionsCount - 1; ++var2) {
            if (menuOpcodes[var2] < 1000 && menuOpcodes[var2 + 1] > 1000) {
               String var19 = menuTargets[var2];
               menuTargets[var2] = menuTargets[var2 + 1];
               menuTargets[var2 + 1] = var19;
               String var20 = menuActions[var2];
               menuActions[var2] = menuActions[var2 + 1];
               menuActions[var2 + 1] = var20;
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
               boolean var15 = menuShiftClick[var2];
               menuShiftClick[var2] = menuShiftClick[var2 + 1];
               menuShiftClick[var2 + 1] = var15;
               var1 = false;
            }
         }
      }

      if (VerticalAlignment.dragInventoryWidget == null) {
         if (clickedWidget == null) {
            int var4;
            int var10;
            int var23;
            label273: {
               int var21 = MouseHandler.MouseHandler_lastButton;
               int var3;
               int var8;
               int var22;
               int var24;
               if (isMenuOpen) {
                  if (var21 != 1 && (class82.mouseCam || var21 != 4)) {
                     var2 = MouseHandler.MouseHandler_x;
                     var3 = MouseHandler.MouseHandler_y;
                     if (var2 < class103.menuX - 10 || var2 > class103.menuX + PlayerCompositionColorTextureOverride.menuWidth + 10 || var3 < class108.menuY - 10 || var3 > WorldMapScaleHandler.menuHeight + class108.menuY + 10) {
                        isMenuOpen = false;
                        AbstractArchive.method6439(class103.menuX, class108.menuY, PlayerCompositionColorTextureOverride.menuWidth, WorldMapScaleHandler.menuHeight);
                     }
                  }

                  if (var21 == 1 || !class82.mouseCam && var21 == 4) {
                     var2 = class103.menuX;
                     var3 = class108.menuY;
                     var4 = PlayerCompositionColorTextureOverride.menuWidth;
                     var5 = MouseHandler.MouseHandler_lastPressedX;
                     var24 = MouseHandler.MouseHandler_lastPressedY;
                     var22 = -1;

                     for(var8 = 0; var8 < menuOptionsCount; ++var8) {
                        var23 = (menuOptionsCount - 1 - var8) * 15 + var3 + 31;
                        if (var5 > var2 && var5 < var2 + var4 && var24 > var23 - 13 && var24 < var23 + 3) {
                           var22 = var8;
                        }
                     }

                     if (var22 != -1 && var22 >= 0) {
                        var8 = menuArguments1[var22];
                        var23 = menuArguments2[var22];
                        var10 = menuOpcodes[var22];
                        int var18 = menuIdentifiers[var22];
                        int var12 = menuItemIds[var22];
                        String var13 = menuActions[var22];
                        String var14 = menuTargets[var22];
                        PacketBufferNode.menuAction(var8, var23, var10, var18, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
                     }

                     isMenuOpen = false;
                     AbstractArchive.method6439(class103.menuX, class108.menuY, PlayerCompositionColorTextureOverride.menuWidth, WorldMapScaleHandler.menuHeight);
                  }
               } else {
                  var2 = class250.method5167();
                  if ((var21 == 1 || !class82.mouseCam && var21 == 4) && var2 >= 0) {
                     var3 = menuOpcodes[var2];
                     if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) {
                        var4 = menuArguments1[var2];
                        var5 = menuArguments2[var2];
                        Widget var6 = class281.getWidget(var5);
                        var8 = class197.getWidgetFlags(var6);
                        boolean var7 = (var8 >> 28 & 1) != 0;
                        if (var7) {
                           break label273;
                        }

                        var10 = class197.getWidgetFlags(var6);
                        boolean var9 = (var10 >> 29 & 1) != 0;
                        if (var9) {
                           break label273;
                        }
                     }
                  }

                  if ((var21 == 1 || !class82.mouseCam && var21 == 4) && this.shouldLeftClickOpenMenu()) {
                     var21 = 2;
                  }

                  if ((var21 == 1 || !class82.mouseCam && var21 == 4) && menuOptionsCount > 0 && var2 >= 0) {
                     var3 = menuArguments1[var2];
                     var4 = menuArguments2[var2];
                     var5 = menuOpcodes[var2];
                     var24 = menuIdentifiers[var2];
                     var22 = menuItemIds[var2];
                     String var16 = menuActions[var2];
                     String var17 = menuTargets[var2];
                     PacketBufferNode.menuAction(var3, var4, var5, var24, var22, var16, var17, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
                  }

                  if (var21 == 2 && menuOptionsCount > 0) {
                     this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
                  }
               }

               return;
            }

            if (VerticalAlignment.dragInventoryWidget != null && !field616 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
               var23 = draggedWidgetX;
               var10 = draggedWidgetY;
               MenuAction var11 = PendingSpawn.tempMenuAction;
               if (var11 != null) {
                  PacketBufferNode.menuAction(var11.param0, var11.param1, var11.opcode, var11.identifier, var11.itemId, var11.action, var11.target, var23, var10);
               }

               PendingSpawn.tempMenuAction = null;
            }

            field616 = false;
            itemDragDuration = 0;
            if (VerticalAlignment.dragInventoryWidget != null) {
               class143.invalidateWidget(VerticalAlignment.dragInventoryWidget);
            }

            VerticalAlignment.dragInventoryWidget = class281.getWidget(var5);
            dragItemSlotSource = var4;
            draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
            draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
            if (var2 >= 0) {
               class10.method93(var2);
            }

            class143.invalidateWidget(VerticalAlignment.dragInventoryWidget);
         }
      }
   }

   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "15"
   )
   @Export("shouldLeftClickOpenMenu")
   final boolean shouldLeftClickOpenMenu() {
      int var1 = class250.method5167();
      return (leftClickOpensMenu && menuOptionsCount > 2 || class37.method710(var1)) && !menuShiftClick[var1];
   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1899380061"
   )
   @Export("openMenu")
   final void openMenu(int var1, int var2) {
      int var3 = UserComparator3.fontBold12.stringWidth("Choose Option");

      int var4;
      int var5;
      for(var4 = 0; var4 < menuOptionsCount; ++var4) {
         var5 = UserComparator3.fontBold12.stringWidth(FaceNormal.method4461(var4));
         if (var5 > var3) {
            var3 = var5;
         }
      }

      var3 += 8;
      var4 = menuOptionsCount * 15 + 22;
      var5 = var1 - var3 / 2;
      if (var5 + var3 > GameEngine.canvasWidth) {
         var5 = GameEngine.canvasWidth - var3;
      }

      if (var5 < 0) {
         var5 = 0;
      }

      int var6 = var2;
      if (var2 + var4 > class10.canvasHeight) {
         var6 = class10.canvasHeight - var4;
      }

      if (var6 < 0) {
         var6 = 0;
      }

      class103.menuX = var5;
      class108.menuY = var6;
      PlayerCompositionColorTextureOverride.menuWidth = var3;
      WorldMapScaleHandler.menuHeight = menuOptionsCount * 15 + 22;
      var1 -= viewportOffsetX;
      var2 -= viewportOffsetY;
      class139.scene.menuOpen(ApproximateRouteStrategy.Client_plane, var1, var2, false);
      isMenuOpen = true;
   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1211256650"
   )
   @Export("resizeRoot")
   final void resizeRoot(boolean var1) {
      int var2 = rootInterface;
      int var3 = GameEngine.canvasWidth;
      int var4 = class10.canvasHeight;
      if (WorldMapManager.loadInterface(var2)) {
         WorldMapID.resizeInterface(Widget.Widget_interfaceComponents[var2], -1, var3, var4, var1);
      }

   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      descriptor = "(Lkn;I)V",
      garbageValue = "-988086674"
   )
   @Export("alignWidget")
   void alignWidget(Widget var1) {
      Widget var2 = var1.parentId == -1 ? null : class281.getWidget(var1.parentId);
      int var3;
      int var4;
      if (var2 == null) {
         var3 = GameEngine.canvasWidth;
         var4 = class10.canvasHeight;
      } else {
         var3 = var2.width;
         var4 = var2.height;
      }

      WorldMapRectangle.alignWidgetSize(var1, var3, var4, false);
      GrandExchangeOfferAgeComparator.alignWidgetPosition(var1, var3, var4);
   }

   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   final void method1208() {
      class143.invalidateWidget(clickedWidget);
      ++Script.widgetDragDuration;
      int var1;
      int var2;
      if (field640 && field684) {
         var1 = MouseHandler.MouseHandler_x;
         var2 = MouseHandler.MouseHandler_y;
         var1 -= widgetClickX;
         var2 -= widgetClickY;
         if (var1 < field603) {
            var1 = field603;
         }

         if (var1 + clickedWidget.width > field603 + clickedWidgetParent.width) {
            var1 = field603 + clickedWidgetParent.width - clickedWidget.width;
         }

         if (var2 < field686) {
            var2 = field686;
         }

         if (var2 + clickedWidget.height > field686 + clickedWidgetParent.height) {
            var2 = field686 + clickedWidgetParent.height - clickedWidget.height;
         }

         int var3 = var1 - field688;
         int var4 = var2 - field689;
         int var5 = clickedWidget.dragZoneSize;
         if (Script.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            isDraggingWidget = true;
         }

         int var6 = var1 - field603 + clickedWidgetParent.scrollX;
         int var7 = var2 - field686 + clickedWidgetParent.scrollY;
         ScriptEvent var8;
         if (clickedWidget.onDrag != null && isDraggingWidget) {
            var8 = new ScriptEvent();
            var8.widget = clickedWidget;
            var8.mouseX = var6;
            var8.mouseY = var7;
            var8.args = clickedWidget.onDrag;
            ServerPacket.runScriptEvent(var8);
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
                  ServerPacket.runScriptEvent(var8);
               }

               if (draggedOnWidget != null) {
                  Widget var15 = clickedWidget;
                  int var11 = class197.getWidgetFlags(var15);
                  int var16 = var11 >> 17 & 7;
                  int var12 = var16;
                  Widget var18;
                  if (var16 == 0) {
                     var18 = null;
                  } else {
                     int var13 = 0;

                     while(true) {
                        if (var13 >= var12) {
                           var18 = var15;
                           break;
                        }

                        var15 = class281.getWidget(var15.parentId);
                        if (var15 == null) {
                           var18 = null;
                           break;
                        }

                        ++var13;
                     }
                  }

                  if (var18 != null) {
                     PacketBufferNode var19 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
                     var19.packetBuffer.writeInt(clickedWidget.id);
                     var19.packetBuffer.writeShort(clickedWidget.itemId);
                     var19.packetBuffer.writeShort(clickedWidget.childIndex);
                     var19.packetBuffer.writeShort(draggedOnWidget.childIndex);
                     var19.packetBuffer.writeInt(draggedOnWidget.id);
                     var19.packetBuffer.writeShortLE(draggedOnWidget.itemId);
                     packetWriter.addNode(var19);
                  }
               }
            } else if (this.shouldLeftClickOpenMenu()) {
               this.openMenu(widgetClickX + field688, widgetClickY + field689);
            } else if (menuOptionsCount > 0) {
               int var14 = widgetClickX + field688;
               int var9 = field689 + widgetClickY;
               MenuAction var10 = PendingSpawn.tempMenuAction;
               if (var10 != null) {
                  PacketBufferNode.menuAction(var10.param0, var10.param1, var10.opcode, var10.identifier, var10.itemId, var10.action, var10.target, var14, var9);
               }

               PendingSpawn.tempMenuAction = null;
            }

            clickedWidget = null;
         }

      } else {
         if (Script.widgetDragDuration > 1) {
            if (!isDraggingWidget && menuOptionsCount > 0) {
               var1 = field688 + widgetClickX;
               var2 = widgetClickY + field689;
               MenuAction var17 = PendingSpawn.tempMenuAction;
               if (var17 != null) {
                  PacketBufferNode.menuAction(var17.param0, var17.param1, var17.opcode, var17.identifier, var17.itemId, var17.action, var17.target, var1, var2);
               }

               PendingSpawn.tempMenuAction = null;
            }

            clickedWidget = null;
         }

      }
   }

   @ObfuscatedName("mo")
   @ObfuscatedSignature(
      descriptor = "(I)Lrg;",
      garbageValue = "-2072830771"
   )
   @Export("username")
   public Username username() {
      return class296.localPlayer != null ? class296.localPlayer.username : null;
   }

   public void setOtlTokenRequester(OtlTokenRequester var1) {
      if (var1 != null) {
         this.field672 = var1;
         GrandExchangeOfferOwnWorldComparator.method1171(10);
      }
   }

   @ObfuscatedSignature(
      descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
   )
   public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.field537 = var1;
      }
   }

   public long getAccountHash() {
      return this.field545;
   }

   public final void init() {
      try {
         if (this.checkHost()) {
            int var3;
            for(int var1 = 0; var1 <= 28; ++var1) {
               String var2 = this.getParameter(Integer.toString(var1));
               if (var2 != null) {
                  switch (var1) {
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
                        class103.clientLanguage = Language.method6580(Integer.parseInt(var2));
                        break;
                     case 7:
                        class259.field2967 = WorldMapSection2.method4746(Integer.parseInt(var2));
                        break;
                     case 8:
                        if (var2.equalsIgnoreCase("true")) {
                        }
                        break;
                     case 9:
                        DynamicObject.field974 = var2;
                        break;
                     case 10:
                        class376.field4411 = (StudioGame)WallDecoration.findEnumerated(Script.method2127(), Integer.parseInt(var2));
                        if (class376.field4411 == StudioGame.oldscape) {
                           ViewportMouse.loginType = LoginType.oldscape;
                        } else {
                           ViewportMouse.loginType = LoginType.field4788;
                        }
                        break;
                     case 11:
                        class124.field1482 = var2;
                        break;
                     case 12:
                        worldId = Integer.parseInt(var2);
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
                        Canvas.field126 = Integer.parseInt(var2);
                        break;
                     case 15:
                        gameBuild = Integer.parseInt(var2);
                        break;
                     case 17:
                        class127.field1534 = var2;
                        break;
                     case 21:
                        field494 = Integer.parseInt(var2);
                        break;
                     case 25:
                        var3 = var2.indexOf(".");
                        if (var3 == -1) {
                           field789 = Integer.parseInt(var2);
                        } else {
                           field789 = Integer.parseInt(var2.substring(0, var3));
                           Integer.parseInt(var2.substring(var3 + 1));
                        }
                  }
               }
            }

            FontName.method8080();
            class273.worldHost = this.getCodeBase().getHost();
            String var8 = class259.field2967.name;
            byte var9 = 0;

            try {
               JagexCache.idxCount = 22;
               JagexCache.cacheGamebuild = var9;

               try {
                  MouseHandler.operatingSystemName = System.getProperty("os.name");
               } catch (Exception var16) {
                  MouseHandler.operatingSystemName = "Unknown";
               }

               class17.formattedOperatingSystemName = MouseHandler.operatingSystemName.toLowerCase();

               try {
                  class37.userHomeDirectory = System.getProperty("user.home");
                  if (class37.userHomeDirectory != null) {
                     class37.userHomeDirectory = class37.userHomeDirectory + "/";
                  }
               } catch (Exception var15) {
               }

               try {
                  if (class17.formattedOperatingSystemName.startsWith("win")) {
                     if (class37.userHomeDirectory == null) {
                        class37.userHomeDirectory = System.getenv("USERPROFILE");
                     }
                  } else if (class37.userHomeDirectory == null) {
                     class37.userHomeDirectory = System.getenv("HOME");
                  }

                  if (class37.userHomeDirectory != null) {
                     class37.userHomeDirectory = class37.userHomeDirectory + "/";
                  }
               } catch (Exception var14) {
               }

               if (class37.userHomeDirectory == null) {
                  class37.userHomeDirectory = "~/";
               }

               GrandExchangeOffer.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class37.userHomeDirectory, "/tmp/", ""};
               AbstractWorldMapIcon.cacheSubPaths = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild};

               label172:
               for(var3 = 0; var3 < 4; ++var3) {
                  class303.cacheDir = class7.method50("oldschool", var8, var3);
                  if (!class303.cacheDir.exists()) {
                     class303.cacheDir.mkdirs();
                  }

                  File[] var4 = class303.cacheDir.listFiles();
                  if (var4 == null) {
                     break;
                  }

                  File[] var5 = var4;
                  int var6 = 0;

                  while(true) {
                     if (var6 >= var5.length) {
                        break label172;
                     }

                     File var7 = var5[var6];
                     if (!class31.method464(var7, false)) {
                        break;
                     }

                     ++var6;
                  }
               }

               class126.method2917(class303.cacheDir);

               try {
                  File var10 = new File(class37.userHomeDirectory, "random.dat");
                  int var12;
                  if (var10.exists()) {
                     JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var10, "rw", 25L), 24, 0);
                  } else {
                     label152:
                     for(int var11 = 0; var11 < AbstractWorldMapIcon.cacheSubPaths.length; ++var11) {
                        for(var12 = 0; var12 < GrandExchangeOffer.cacheParentPaths.length; ++var12) {
                           File var13 = new File(GrandExchangeOffer.cacheParentPaths[var12] + AbstractWorldMapIcon.cacheSubPaths[var11] + File.separatorChar + "random.dat");
                           if (var13.exists()) {
                              JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var13, "rw", 25L), 24, 0);
                              break label152;
                           }
                        }
                     }
                  }

                  if (JagexCache.JagexCache_randomDat == null) {
                     RandomAccessFile var20 = new RandomAccessFile(var10, "rw");
                     var12 = var20.read();
                     var20.seek(0L);
                     var20.write(var12);
                     var20.seek(0L);
                     var20.close();
                     JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var10, "rw", 25L), 24, 0);
                  }
               } catch (IOException var17) {
               }

               JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class124.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
               JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class124.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
               JagexCache.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount];

               for(var3 = 0; var3 < JagexCache.idxCount; ++var3) {
                  JagexCache.JagexCache_idxFiles[var3] = new BufferedFile(new AccessFile(class124.getFile("main_file_cache.idx" + var3), "rw", 1048576L), 6000, 0);
               }
            } catch (Exception var18) {
               class421.RunException_sendStackTrace((String)null, var18);
            }

            ClanChannelMember.client = this;
            Buffer.clientType = clientType;
            if (field573 == -1) {
               field573 = 0;
            }

            class298.field3418 = System.getenv("JX_ACCESS_TOKEN");
            SpriteMask.field3386 = System.getenv("JX_REFRESH_TOKEN");
            if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
               this.field692 = true;
            }

            this.startThread(765, 503, 209, 1);
         }
      } catch (RuntimeException var19) {
         throw class19.newRunException(var19, "client.init(" + ')');
      }
   }

   public boolean isOnLoginScreen() {
      return gameState == 10;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(Lnl;Lnl;I)V",
      garbageValue = "-1063867163"
   )
   static void method1227(Font var0, Font var1) {
      int var4;
      int var5;
      if (DirectByteArrayCopier.worldSelectBackSprites == null) {
         Archive var3 = class142.archive8;
         var4 = var3.getGroupId("sl_back");
         var5 = var3.getFileId(var4, "");
         SpritePixels[] var2 = BufferedSource.method7532(var3, var4, var5);
         DirectByteArrayCopier.worldSelectBackSprites = var2;
      }

      if (CollisionMap.worldSelectFlagSprites == null) {
         CollisionMap.worldSelectFlagSprites = class410.method7741(class142.archive8, "sl_flags", "");
      }

      if (MouseRecorder.worldSelectArrows == null) {
         MouseRecorder.worldSelectArrows = class410.method7741(class142.archive8, "sl_arrows", "");
      }

      if (SpotAnimationDefinition.worldSelectStars == null) {
         SpotAnimationDefinition.worldSelectStars = class410.method7741(class142.archive8, "sl_stars", "");
      }

      if (GameObject.worldSelectLeftSprite == null) {
         GameObject.worldSelectLeftSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(class142.archive8, "leftarrow", "");
      }

      if (DevicePcmPlayerProvider.worldSelectRightSprite == null) {
         DevicePcmPlayerProvider.worldSelectRightSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(class142.archive8, "rightarrow", "");
      }

      Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
      Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
      Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
      var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
      if (SpotAnimationDefinition.worldSelectStars != null) {
         SpotAnimationDefinition.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
         var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
         SpotAnimationDefinition.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
         var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
      }

      if (MouseRecorder.worldSelectArrows != null) {
         int var22 = Login.xPadding + 280;
         if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
            MouseRecorder.worldSelectArrows[2].drawAt(var22, 4);
         } else {
            MouseRecorder.worldSelectArrows[0].drawAt(var22, 4);
         }

         if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
            MouseRecorder.worldSelectArrows[3].drawAt(var22 + 15, 4);
         } else {
            MouseRecorder.worldSelectArrows[1].drawAt(var22 + 15, 4);
         }

         var0.draw("World", var22 + 32, 17, 16777215, -1);
         int var23 = Login.xPadding + 390;
         if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
            MouseRecorder.worldSelectArrows[2].drawAt(var23, 4);
         } else {
            MouseRecorder.worldSelectArrows[0].drawAt(var23, 4);
         }

         if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
            MouseRecorder.worldSelectArrows[3].drawAt(var23 + 15, 4);
         } else {
            MouseRecorder.worldSelectArrows[1].drawAt(var23 + 15, 4);
         }

         var0.draw("Players", var23 + 32, 17, 16777215, -1);
         var4 = Login.xPadding + 500;
         if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
            MouseRecorder.worldSelectArrows[2].drawAt(var4, 4);
         } else {
            MouseRecorder.worldSelectArrows[0].drawAt(var4, 4);
         }

         if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
            MouseRecorder.worldSelectArrows[3].drawAt(var4 + 15, 4);
         } else {
            MouseRecorder.worldSelectArrows[1].drawAt(var4 + 15, 4);
         }

         var0.draw("Location", var4 + 32, 17, 16777215, -1);
         var5 = Login.xPadding + 610;
         if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
            MouseRecorder.worldSelectArrows[2].drawAt(var5, 4);
         } else {
            MouseRecorder.worldSelectArrows[0].drawAt(var5, 4);
         }

         if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
            MouseRecorder.worldSelectArrows[3].drawAt(var5 + 15, 4);
         } else {
            MouseRecorder.worldSelectArrows[1].drawAt(var5 + 15, 4);
         }

         var0.draw("Type", var5 + 32, 17, 16777215, -1);
      }

      Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
      var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
      Login.hoveredWorldIndex = -1;
      if (DirectByteArrayCopier.worldSelectBackSprites != null) {
         byte var26 = 88;
         byte var27 = 19;
         var4 = 765 / (var26 + 1) - 1;
         var5 = 480 / (var27 + 1);

         int var6;
         int var7;
         do {
            var6 = var5;
            var7 = var4;
            if (var5 * (var4 - 1) >= World.World_count) {
               --var4;
            }

            if (var4 * (var5 - 1) >= World.World_count) {
               --var5;
            }

            if (var4 * (var5 - 1) >= World.World_count) {
               --var5;
            }
         } while(var6 != var5 || var4 != var7);

         var6 = (765 - var26 * var4) / (var4 + 1);
         if (var6 > 5) {
            var6 = 5;
         }

         var7 = (480 - var5 * var27) / (var5 + 1);
         if (var7 > 5) {
            var7 = 5;
         }

         int var8 = (765 - var4 * var26 - var6 * (var4 - 1)) / 2;
         int var9 = (480 - var5 * var27 - var7 * (var5 - 1)) / 2;
         int var10 = (var5 + World.World_count - 1) / var5;
         Login.worldSelectPagesCount = var10 - var4;
         if (GameObject.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
            GameObject.worldSelectLeftSprite.drawAt(8, class10.canvasHeight / 2 - GameObject.worldSelectLeftSprite.subHeight / 2);
         }

         if (DevicePcmPlayerProvider.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
            DevicePcmPlayerProvider.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - DevicePcmPlayerProvider.worldSelectRightSprite.subWidth - 8, class10.canvasHeight / 2 - DevicePcmPlayerProvider.worldSelectRightSprite.subHeight / 2);
         }

         int var11 = var9 + 23;
         int var12 = var8 + Login.xPadding;
         int var13 = 0;
         boolean var14 = false;
         int var15 = Login.worldSelectPage;

         int var16;
         for(var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
            World var17 = class412.World_worlds[var16];
            boolean var18 = true;
            String var19 = Integer.toString(var17.population);
            if (var17.population == -1) {
               var19 = "OFF";
               var18 = false;
            } else if (var17.population > 1980) {
               var19 = "FULL";
               var18 = false;
            }

            int var21 = 0;
            int var20;
            if (var17.isBeta()) {
               if (var17.isMembersOnly()) {
                  var20 = class103.field1336.field1343;
               } else {
                  var20 = class103.field1348.field1343;
               }
            } else if (var17.isDeadman()) {
               var21 = 16711680;
               if (var17.isMembersOnly()) {
                  var20 = class103.field1334.field1343;
               } else {
                  var20 = class103.field1333.field1343;
               }
            } else if (var17.method1770()) {
               if (var17.isMembersOnly()) {
                  var20 = class103.field1338.field1343;
               } else {
                  var20 = class103.field1347.field1343;
               }
            } else if (var17.isPvp()) {
               if (var17.isMembersOnly()) {
                  var20 = class103.field1332.field1343;
               } else {
                  var20 = class103.field1331.field1343;
               }
            } else if (var17.method1735()) {
               if (var17.isMembersOnly()) {
                  var20 = class103.field1342.field1343;
               } else {
                  var20 = class103.field1339.field1343;
               }
            } else if (var17.method1759()) {
               if (var17.isMembersOnly()) {
                  var20 = class103.field1340.field1343;
               } else {
                  var20 = class103.field1341.field1343;
               }
            } else if (var17.isMembersOnly()) {
               var20 = class103.field1330.field1343;
            } else {
               var20 = class103.field1337.field1343;
            }

            if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var26 + var12 && MouseHandler.MouseHandler_y < var11 + var27 && var18) {
               Login.hoveredWorldIndex = var16;
               DirectByteArrayCopier.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215);
               var14 = true;
            } else {
               DirectByteArrayCopier.worldSelectBackSprites[var20].drawAt(var12, var11);
            }

            if (CollisionMap.worldSelectFlagSprites != null) {
               CollisionMap.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
            }

            var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1);
            var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1);
            var11 = var11 + var7 + var27;
            ++var13;
            if (var13 >= var5) {
               var11 = var9 + 23;
               var12 = var12 + var6 + var26;
               var13 = 0;
               ++var15;
            }
         }

         if (var14) {
            var16 = var1.stringWidth(class412.World_worlds[Login.hoveredWorldIndex].activity) + 6;
            int var24 = var1.ascent + 8;
            int var25 = MouseHandler.MouseHandler_y + 25;
            if (var24 + var25 > 480) {
               var25 = MouseHandler.MouseHandler_y - 25 - var24;
            }

            Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120);
            Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0);
            var1.drawCentered(class412.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
         }
      }

      class1.rasterProvider.drawFull(0, 0);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lbt;B)V",
      garbageValue = "-106"
   )
   @Export("changeWorld")
   static void changeWorld(World var0) {
      if (var0.isMembersOnly() != isMembersWorld) {
         isMembersWorld = var0.isMembersOnly();
         class269.method5368(var0.isMembersOnly());
      }

      if (var0.properties != worldProperties) {
         Archive var1 = class142.archive8;
         int var2 = var0.properties;
         if ((var2 & 536870912) != 0) {
            MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
         } else if ((var2 & 1073741824) != 0) {
            MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
         } else if ((var2 & 256) != 0) {
            MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
         } else {
            MouseRecorder.logoSprite = AbstractUserComparator.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
         }
      }

      class273.worldHost = var0.host;
      worldId = var0.id;
      worldProperties = var0.properties;
      class159.worldPort = gameBuild == 0 ? 'ꩊ' : var0.id + '鱀';
      class131.js5Port = gameBuild == 0 ? 443 : var0.id + '썐';
      class454.currentPort = class159.worldPort;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-887659277"
   )
   static int method1243(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("mt")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2146499980"
   )
   static void method1724() {
      if (oculusOrbState == 1) {
         field500 = true;
      }

   }

   @ObfuscatedName("mq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "898430797"
   )
   static void method1726() {
      BufferedSink.clientPreferences.method2398(field494);
   }
}
