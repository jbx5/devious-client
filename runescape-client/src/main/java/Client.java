import com.jagex.oldscape.pub.OtlTokenRequester;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
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
public final class Client extends GameEngine implements Usernamed, OAuthApi {
   @ObfuscatedName("se")
   @ObfuscatedSignature(
      descriptor = "[Leb;"
   )
   @Export("currentClanSettings")
   static ClanSettings[] currentClanSettings;
   @ObfuscatedName("uh")
   @ObfuscatedGetter(
      intValue = -2007768733
   )
   @Export("viewportOffsetX")
   static int viewportOffsetX;
   @ObfuscatedName("uo")
   @ObfuscatedGetter(
      intValue = -1310780451
   )
   @Export("viewportOffsetY")
   static int viewportOffsetY;
   @ObfuscatedName("vs")
   @ObfuscatedGetter(
      intValue = 1576656145
   )
   public static int field796;
   @ObfuscatedName("tu")
   @Export("playingJingle")
   static boolean playingJingle;
   @ObfuscatedName("wv")
   @ObfuscatedSignature(
      descriptor = "Lbn;"
   )
   static final ApproximateRouteStrategy field544;
   @ObfuscatedName("sx")
   @ObfuscatedGetter(
      intValue = -913304205
   )
   @Export("destinationX")
   static int destinationX;
   @ObfuscatedName("sr")
   @ObfuscatedGetter(
      intValue = -1656979995
   )
   @Export("destinationY")
   static int destinationY;
   @ObfuscatedName("tc")
   @ObfuscatedGetter(
      intValue = -309516689
   )
   @Export("soundEffectCount")
   static int soundEffectCount;
   @ObfuscatedName("tl")
   @Export("soundEffectIds")
   static int[] soundEffectIds;
   @ObfuscatedName("tg")
   @Export("queuedSoundEffectLoops")
   static int[] queuedSoundEffectLoops;
   @ObfuscatedName("ws")
   static int[] field802;
   @ObfuscatedName("tj")
   @Export("queuedSoundEffectDelays")
   static int[] queuedSoundEffectDelays;
   @ObfuscatedName("wx")
   static int[] field785;
   @ObfuscatedName("ti")
   @ObfuscatedSignature(
      descriptor = "[Lac;"
   )
   @Export("soundEffects")
   static SoundEffect[] soundEffects;
   @ObfuscatedName("tz")
   @Export("isCameraLocked")
   static boolean isCameraLocked;
   @ObfuscatedName("ts")
   @Export("soundLocations")
   static int[] soundLocations;
   @ObfuscatedName("ul")
   static boolean field767;
   @ObfuscatedName("vu")
   @Export("archiveLoaders")
   static ArrayList archiveLoaders;
   @ObfuscatedName("wd")
   @ObfuscatedGetter(
      intValue = -245177751
   )
   @Export("archiveLoadersDone")
   static int archiveLoadersDone;
   @ObfuscatedName("va")
   @ObfuscatedGetter(
      intValue = -354385425
   )
   static int field787;
   @ObfuscatedName("vn")
   @ObfuscatedSignature(
      descriptor = "Lka;"
   )
   @Export("playerAppearance")
   static PlayerComposition playerAppearance;
   @ObfuscatedName("uf")
   static boolean[] field569;
   @ObfuscatedName("vw")
   @ObfuscatedGetter(
      intValue = 1995992149
   )
   static int field788;
   @ObfuscatedName("vh")
   @ObfuscatedSignature(
      descriptor = "Lqm;"
   )
   @Export("platformInfoProvider")
   static PlatformInfoProvider platformInfoProvider;
   @ObfuscatedName("tm")
   @ObfuscatedGetter(
      intValue = 1487362307
   )
   @Export("minimapState")
   static int minimapState;
   @ObfuscatedName("vo")
   @ObfuscatedSignature(
      descriptor = "[Lmi;"
   )
   @Export("grandExchangeOffers")
   static GrandExchangeOffer[] grandExchangeOffers;
   @ObfuscatedName("vj")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("DBTableIndex_cache")
   static EvictingDualNodeHashTable DBTableIndex_cache;
   @ObfuscatedName("vy")
   @ObfuscatedSignature(
      descriptor = "Lja;"
   )
   @Export("DBTableMasterIndex_cache")
   static EvictingDualNodeHashTable DBTableMasterIndex_cache;
   @ObfuscatedName("sq")
   @ObfuscatedGetter(
      intValue = 1300699193
   )
   static int field749;
   @ObfuscatedName("sw")
   @ObfuscatedSignature(
      descriptor = "[Lfm;"
   )
   @Export("currentClanChannels")
   static ClanChannel[] currentClanChannels;
   @ObfuscatedName("vd")
   @ObfuscatedSignature(
      descriptor = "Lok;"
   )
   @Export("archive5")
   static class391 archive5;
   @ObfuscatedName("us")
   static short field773;
   @ObfuscatedName("uv")
   static short field774;
   @ObfuscatedName("ut")
   static short field779;
   @ObfuscatedName("uj")
   static short field780;
   @ObfuscatedName("ua")
   static short field778;
   @ObfuscatedName("um")
   @ObfuscatedGetter(
      intValue = -1592045029
   )
   @Export("viewportZoom")
   static int viewportZoom;
   @ObfuscatedName("uw")
   static short field763;
   @ObfuscatedName("ug")
   @ObfuscatedGetter(
      intValue = -1052970327
   )
   @Export("viewportWidth")
   static int viewportWidth;
   @ObfuscatedName("tb")
   @ObfuscatedGetter(
      intValue = 1037820387
   )
   @Export("currentTrackGroupId")
   static int currentTrackGroupId;
   @ObfuscatedName("uk")
   @ObfuscatedGetter(
      intValue = -1817754101
   )
   @Export("viewportHeight")
   static int viewportHeight;
   @ObfuscatedName("sc")
   @ObfuscatedGetter(
      intValue = -1092997549
   )
   @Export("mapIconCount")
   static int mapIconCount;
   @ObfuscatedName("sb")
   @Export("mapIconXs")
   static int[] mapIconXs;
   @ObfuscatedName("sn")
   @Export("mapIconYs")
   static int[] mapIconYs;
   @ObfuscatedName("su")
   @ObfuscatedSignature(
      descriptor = "[Lrs;"
   )
   @Export("mapIcons")
   static SpritePixels[] mapIcons;
   @ObfuscatedName("wy")
   @ObfuscatedGetter(
      intValue = 1093744453
   )
   static int field800;
   @ObfuscatedName("ud")
   @Export("zoomHeight")
   static short zoomHeight;
   @ObfuscatedName("up")
   @Export("zoomWidth")
   static short zoomWidth;
   @ObfuscatedName("uz")
   static int[] field525;
   @ObfuscatedName("uc")
   static int[] field769;
   @ObfuscatedName("ub")
   static int[] field771;
   @ObfuscatedName("ue")
   static int[] field772;
   @ObfuscatedName("vk")
   @ObfuscatedSignature(
      descriptor = "Lbi;"
   )
   @Export("GrandExchangeEvents_worldComparator")
   static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
   @ObfuscatedName("ve")
   @ObfuscatedGetter(
      intValue = -386377411
   )
   static int field777;
   @ObfuscatedName("vb")
   static List field797;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "[Lgv;"
   )
   @Export("collisionMaps")
   static CollisionMap[] collisionMaps;
   @ObfuscatedName("bj")
   static boolean field534 = true;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 986258055
   )
   @Export("worldId")
   public static int worldId = 1;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -1447111149
   )
   @Export("worldProperties")
   static int worldProperties = 0;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -1449876163
   )
   @Export("gameBuild")
   static int gameBuild = 0;
   @ObfuscatedName("bl")
   @Export("isMembersWorld")
   public static boolean isMembersWorld = false;
   @ObfuscatedName("bq")
   @Export("isLowDetail")
   static boolean isLowDetail = false;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -459350759
   )
   static int field501 = -1;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 324376373
   )
   @Export("clientType")
   static int clientType = -1;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -1706614599
   )
   static int field503 = -1;
   @ObfuscatedName("bk")
   @Export("onMobile")
   static boolean onMobile = false;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 118366835
   )
   public static int field505 = 211;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = 1478828793
   )
   @Export("gameState")
   static int gameState = 0;
   @ObfuscatedName("dz")
   @Export("isLoading")
   static boolean isLoading = true;
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      intValue = -2058959797
   )
   @Export("cycle")
   static int cycle = 0;
   @ObfuscatedName("di")
   @ObfuscatedGetter(
      longValue = -7466561445147549075L
   )
   @Export("mouseLastLastPressedTimeMillis")
   static long mouseLastLastPressedTimeMillis = 1L;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = -1933487065
   )
   static int field563 = -1;
   @ObfuscatedName("dm")
   @ObfuscatedGetter(
      intValue = 2050458131
   )
   static int field513 = -1;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      longValue = -8229270082617636071L
   )
   static long field685 = -1L;
   @ObfuscatedName("df")
   @Export("hadFocus")
   static boolean hadFocus = true;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      intValue = -1039033513
   )
   @Export("rebootTimer")
   static int rebootTimer = 0;
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      intValue = 1437214935
   )
   @Export("hintArrowType")
   static int hintArrowType = 0;
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      intValue = -935624133
   )
   @Export("hintArrowNpcIndex")
   static int hintArrowNpcIndex = 0;
   @ObfuscatedName("dt")
   @ObfuscatedGetter(
      intValue = 2053177439
   )
   @Export("hintArrowPlayerIndex")
   static int hintArrowPlayerIndex = 0;
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = 1639532511
   )
   @Export("hintArrowX")
   static int hintArrowX = 0;
   @ObfuscatedName("dh")
   @ObfuscatedGetter(
      intValue = 657459307
   )
   @Export("hintArrowY")
   static int hintArrowY = 0;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = -1163477500
   )
   @Export("hintArrowHeight")
   static int hintArrowHeight = 0;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = -1848849191
   )
   static int hintArrowSubX = 0;
   @ObfuscatedName("ds")
   @ObfuscatedGetter(
      intValue = 1335659968
   )
   static int hintArrowSubY = 0;
   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "Lco;"
   )
   @Export("playerAttackOption")
   static AttackOption playerAttackOption;
   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "Lco;"
   )
   @Export("npcAttackOption")
   static AttackOption npcAttackOption;
   @ObfuscatedName("eq")
   @ObfuscatedGetter(
      intValue = -1549890999
   )
   @Export("titleLoadingStage")
   static int titleLoadingStage;
   @ObfuscatedName("ew")
   @ObfuscatedGetter(
      intValue = 2027584875
   )
   @Export("js5ConnectState")
   static int js5ConnectState;
   @ObfuscatedName("ej")
   @ObfuscatedGetter(
      intValue = 1390906507
   )
   static int field529;
   @ObfuscatedName("fu")
   @ObfuscatedGetter(
      intValue = -1374145211
   )
   @Export("js5Errors")
   static int js5Errors;
   @ObfuscatedName("fk")
   @ObfuscatedGetter(
      intValue = 1173391779
   )
   @Export("loginState")
   static int loginState;
   @ObfuscatedName("fd")
   @ObfuscatedGetter(
      intValue = -635052675
   )
   static int field532;
   @ObfuscatedName("fs")
   @ObfuscatedGetter(
      intValue = 53230041
   )
   static int field533;
   @ObfuscatedName("fg")
   @ObfuscatedGetter(
      intValue = -1991936121
   )
   static int field646;
   @ObfuscatedName("fq")
   @ObfuscatedSignature(
      descriptor = "Leq;"
   )
   static class135 field535;
   @ObfuscatedName("fj")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   static class478 field536;
   @ObfuscatedName("gd")
   static final String field546;
   @ObfuscatedName("gg")
   static String field805;
   @ObfuscatedName("ge")
   @Export("Login_isUsernameRemembered")
   static boolean Login_isUsernameRemembered;
   @ObfuscatedName("gm")
   @ObfuscatedSignature(
      descriptor = "Lbc;"
   )
   @Export("secureRandomFuture")
   static SecureRandomFuture secureRandomFuture;
   @ObfuscatedName("hf")
   @Export("randomDatData")
   static byte[] randomDatData;
   @ObfuscatedName("hv")
   @ObfuscatedSignature(
      descriptor = "[Lcf;"
   )
   @Export("npcs")
   static NPC[] npcs;
   @ObfuscatedName("hm")
   @ObfuscatedGetter(
      intValue = 1949198273
   )
   @Export("npcCount")
   static int npcCount;
   @ObfuscatedName("hy")
   @Export("npcIndices")
   static int[] npcIndices;
   @ObfuscatedName("hr")
   @ObfuscatedGetter(
      intValue = -148759513
   )
   static int field557;
   @ObfuscatedName("hk")
   static int[] field558;
   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      descriptor = "Ldb;"
   )
   @Export("packetWriter")
   public static final PacketWriter packetWriter;
   @ObfuscatedName("hb")
   @ObfuscatedGetter(
      intValue = 464035559
   )
   @Export("logoutTimer")
   static int logoutTimer;
   @ObfuscatedName("hw")
   @Export("hadNetworkError")
   static boolean hadNetworkError;
   @ObfuscatedName("hx")
   @ObfuscatedSignature(
      descriptor = "Lns;"
   )
   @Export("timer")
   static Timer timer;
   @ObfuscatedName("hc")
   @Export("fontsMap")
   static HashMap fontsMap;
   @ObfuscatedName("ij")
   @ObfuscatedGetter(
      intValue = -1421375125
   )
   @Export("baseY")
   static int baseY;
   @ObfuscatedName("ip")
   @ObfuscatedGetter(
      intValue = 887372899
   )
   static int field565;
   @ObfuscatedName("iw")
   @ObfuscatedGetter(
      intValue = 942775227
   )
   static int field566;
   @ObfuscatedName("ii")
   @ObfuscatedGetter(
      intValue = -541624079
   )
   static int field567;
   @ObfuscatedName("id")
   @ObfuscatedGetter(
      intValue = -1736609889
   )
   static int field568;
   @ObfuscatedName("ic")
   @ObfuscatedGetter(
      intValue = -724139947
   )
   static int field744;
   @ObfuscatedName("it")
   @Export("selectedItemName")
   static String selectedItemName;
   @ObfuscatedName("ik")
   @Export("isInInstance")
   static boolean isInInstance;
   @ObfuscatedName("iy")
   @Export("instanceChunkTemplates")
   static int[][][] instanceChunkTemplates;
   @ObfuscatedName("il")
   static final int[] field573;
   @ObfuscatedName("if")
   @ObfuscatedGetter(
      intValue = -1316720395
   )
   @Export("graphicsCycle")
   static int graphicsCycle;
   @ObfuscatedName("jb")
   @ObfuscatedGetter(
      intValue = -1246854321
   )
   static int field575;
   @ObfuscatedName("jp")
   @ObfuscatedGetter(
      intValue = -1127680155
   )
   static int field576;
   @ObfuscatedName("jh")
   @ObfuscatedGetter(
      intValue = -1168042169
   )
   static int field656;
   @ObfuscatedName("ja")
   @ObfuscatedGetter(
      intValue = 938761909
   )
   static int field636;
   @ObfuscatedName("jc")
   static boolean field681;
   @ObfuscatedName("jr")
   @ObfuscatedGetter(
      intValue = -555172739
   )
   @Export("alternativeScrollbarWidth")
   static int alternativeScrollbarWidth;
   @ObfuscatedName("jg")
   @ObfuscatedGetter(
      intValue = -1469577095
   )
   @Export("camAngleX")
   static int camAngleX;
   @ObfuscatedName("jw")
   @ObfuscatedGetter(
      intValue = -1153086063
   )
   @Export("camAngleY")
   static int camAngleY;
   @ObfuscatedName("jx")
   @ObfuscatedGetter(
      intValue = 651770897
   )
   static int camAngleDY;
   @ObfuscatedName("jk")
   @ObfuscatedGetter(
      intValue = 542177225
   )
   static int camAngleDX;
   @ObfuscatedName("ki")
   @ObfuscatedGetter(
      intValue = -1265674855
   )
   static int field585;
   @ObfuscatedName("ku")
   @ObfuscatedGetter(
      intValue = -801588943
   )
   static int mouseCamClickedY;
   @ObfuscatedName("kf")
   @ObfuscatedGetter(
      intValue = -1391828463
   )
   @Export("oculusOrbState")
   static int oculusOrbState;
   @ObfuscatedName("kq")
   @ObfuscatedGetter(
      intValue = -286791049
   )
   @Export("camFollowHeight")
   static int camFollowHeight;
   @ObfuscatedName("kk")
   @ObfuscatedGetter(
      intValue = -607018751
   )
   static int field589;
   @ObfuscatedName("kt")
   @ObfuscatedGetter(
      intValue = 542125445
   )
   static int field590;
   @ObfuscatedName("kd")
   @ObfuscatedGetter(
      intValue = -1062116963
   )
   static int field531;
   @ObfuscatedName("kx")
   @ObfuscatedGetter(
      intValue = -134546011
   )
   @Export("oculusOrbNormalSpeed")
   static int oculusOrbNormalSpeed;
   @ObfuscatedName("kb")
   @ObfuscatedGetter(
      intValue = -237513411
   )
   @Export("oculusOrbSlowedSpeed")
   static int oculusOrbSlowedSpeed;
   @ObfuscatedName("ke")
   @ObfuscatedGetter(
      intValue = 523373087
   )
   static int field594;
   @ObfuscatedName("ko")
   static boolean field595;
   @ObfuscatedName("km")
   @ObfuscatedGetter(
      intValue = -375417741
   )
   static int field697;
   @ObfuscatedName("kr")
   static boolean field597;
   @ObfuscatedName("kc")
   @ObfuscatedGetter(
      intValue = 906965081
   )
   static int field598;
   @ObfuscatedName("kn")
   @ObfuscatedGetter(
      intValue = 1986822487
   )
   @Export("overheadTextCount")
   static int overheadTextCount;
   @ObfuscatedName("kl")
   @ObfuscatedGetter(
      intValue = 25500469
   )
   @Export("overheadTextLimit")
   static int overheadTextLimit;
   @ObfuscatedName("ka")
   @Export("overheadTextXs")
   static int[] overheadTextXs;
   @ObfuscatedName("kp")
   @Export("overheadTextYs")
   static int[] overheadTextYs;
   @ObfuscatedName("kh")
   @Export("overheadTextAscents")
   static int[] overheadTextAscents;
   @ObfuscatedName("kz")
   @Export("overheadTextXOffsets")
   static int[] overheadTextXOffsets;
   @ObfuscatedName("kw")
   @Export("overheadTextColors")
   static int[] overheadTextColors;
   @ObfuscatedName("kg")
   @Export("overheadTextEffects")
   static int[] overheadTextEffects;
   @ObfuscatedName("lj")
   @Export("overheadTextCyclesRemaining")
   static int[] overheadTextCyclesRemaining;
   @ObfuscatedName("lh")
   @Export("overheadText")
   static String[] overheadText;
   @ObfuscatedName("lc")
   @Export("tileLastDrawnActor")
   static int[][] tileLastDrawnActor;
   @ObfuscatedName("lw")
   @ObfuscatedGetter(
      intValue = 1296317463
   )
   @Export("viewportDrawCount")
   static int viewportDrawCount;
   @ObfuscatedName("lk")
   @ObfuscatedGetter(
      intValue = -546788933
   )
   @Export("viewportTempX")
   static int viewportTempX;
   @ObfuscatedName("ly")
   @ObfuscatedGetter(
      intValue = 1361406555
   )
   @Export("viewportTempY")
   static int viewportTempY;
   @ObfuscatedName("lf")
   @ObfuscatedGetter(
      intValue = 118207711
   )
   @Export("mouseCrossX")
   static int mouseCrossX;
   @ObfuscatedName("ls")
   @ObfuscatedGetter(
      intValue = -357153549
   )
   @Export("mouseCrossY")
   static int mouseCrossY;
   @ObfuscatedName("lg")
   @ObfuscatedGetter(
      intValue = 584420972
   )
   @Export("mouseCrossState")
   static int mouseCrossState;
   @ObfuscatedName("lb")
   @ObfuscatedGetter(
      intValue = -576177311
   )
   @Export("mouseCrossColor")
   static int mouseCrossColor;
   @ObfuscatedName("lz")
   @Export("showMouseCross")
   static boolean showMouseCross;
   @ObfuscatedName("lp")
   @ObfuscatedGetter(
      intValue = -1029128259
   )
   static int field743;
   @ObfuscatedName("le")
   @ObfuscatedGetter(
      intValue = 119471555
   )
   static int field619;
   @ObfuscatedName("lt")
   @ObfuscatedGetter(
      intValue = 2124097597
   )
   @Export("dragItemSlotSource")
   static int dragItemSlotSource;
   @ObfuscatedName("lq")
   @ObfuscatedGetter(
      intValue = 1500901181
   )
   @Export("draggedWidgetX")
   static int draggedWidgetX;
   @ObfuscatedName("lo")
   @ObfuscatedGetter(
      intValue = -110326507
   )
   @Export("draggedWidgetY")
   static int draggedWidgetY;
   @ObfuscatedName("lu")
   @ObfuscatedGetter(
      intValue = 1863353709
   )
   @Export("dragItemSlotDestination")
   static int dragItemSlotDestination;
   @ObfuscatedName("lx")
   static boolean field624;
   @ObfuscatedName("li")
   @ObfuscatedGetter(
      intValue = -1016079739
   )
   @Export("itemDragDuration")
   static int itemDragDuration;
   @ObfuscatedName("lm")
   @ObfuscatedGetter(
      intValue = -828403509
   )
   static int field626;
   @ObfuscatedName("ln")
   @Export("showLoadingMessages")
   static boolean showLoadingMessages;
   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      descriptor = "[Lcl;"
   )
   @Export("players")
   static Player[] players;
   @ObfuscatedName("mp")
   @ObfuscatedGetter(
      intValue = -1049273929
   )
   @Export("localPlayerIndex")
   static int localPlayerIndex;
   @ObfuscatedName("ma")
   @ObfuscatedGetter(
      intValue = -1817229421
   )
   static int field630;
   @ObfuscatedName("mg")
   @ObfuscatedGetter(
      longValue = -3786105234876673669L
   )
   static long field631;
   @ObfuscatedName("mv")
   @Export("renderSelf")
   static boolean renderSelf;
   @ObfuscatedName("mb")
   @ObfuscatedGetter(
      intValue = 732439465
   )
   @Export("drawPlayerNames")
   static int drawPlayerNames;
   @ObfuscatedName("mq")
   @ObfuscatedGetter(
      intValue = -6020277
   )
   static int field634;
   @ObfuscatedName("mn")
   static int[] field635;
   @ObfuscatedName("ms")
   @Export("playerMenuOpcodes")
   static final int[] playerMenuOpcodes;
   @ObfuscatedName("my")
   @Export("playerMenuActions")
   static String[] playerMenuActions;
   @ObfuscatedName("mo")
   @Export("playerOptionsPriorities")
   static boolean[] playerOptionsPriorities;
   @ObfuscatedName("mf")
   static int[] defaultRotations;
   @ObfuscatedName("mt")
   @ObfuscatedGetter(
      intValue = -2109267551
   )
   @Export("combatTargetPlayerIndex")
   static int combatTargetPlayerIndex;
   @ObfuscatedName("me")
   @ObfuscatedSignature(
      descriptor = "[[[Lmo;"
   )
   @Export("groundItems")
   static NodeDeque[][][] groundItems;
   @ObfuscatedName("mj")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   @Export("pendingSpawns")
   static NodeDeque pendingSpawns;
   @ObfuscatedName("mc")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   @Export("projectiles")
   static NodeDeque projectiles;
   @ObfuscatedName("mz")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   @Export("graphicsObjects")
   static NodeDeque graphicsObjects;
   @ObfuscatedName("mh")
   @Export("currentLevels")
   static int[] currentLevels;
   @ObfuscatedName("mr")
   @Export("levels")
   static int[] levels;
   @ObfuscatedName("nc")
   @Export("experience")
   static int[] experience;
   @ObfuscatedName("ni")
   @Export("leftClickOpensMenu")
   static boolean leftClickOpensMenu;
   @ObfuscatedName("ne")
   @Export("isMenuOpen")
   static boolean isMenuOpen;
   @ObfuscatedName("np")
   @ObfuscatedGetter(
      intValue = 2120822081
   )
   @Export("menuOptionsCount")
   static int menuOptionsCount;
   @ObfuscatedName("nu")
   @Export("menuArguments1")
   static int[] menuArguments1;
   @ObfuscatedName("nq")
   @Export("menuArguments2")
   static int[] menuArguments2;
   @ObfuscatedName("nw")
   @Export("menuOpcodes")
   static int[] menuOpcodes;
   @ObfuscatedName("nm")
   @Export("menuIdentifiers")
   static int[] menuIdentifiers;
   @ObfuscatedName("nn")
   @Export("menuItemIds")
   static int[] menuItemIds;
   @ObfuscatedName("na")
   @Export("menuActions")
   static String[] menuActions;
   @ObfuscatedName("no")
   @Export("menuTargets")
   static String[] menuTargets;
   @ObfuscatedName("ny")
   @Export("menuShiftClick")
   static boolean[] menuShiftClick;
   @ObfuscatedName("ns")
   @Export("followerOpsLowPriority")
   static boolean followerOpsLowPriority;
   @ObfuscatedName("nt")
   @Export("shiftClickDrop")
   static boolean shiftClickDrop;
   @ObfuscatedName("nj")
   @Export("tapToDrop")
   static boolean tapToDrop;
   @ObfuscatedName("nz")
   @Export("showMouseOverText")
   static boolean showMouseOverText;
   @ObfuscatedName("nb")
   @ObfuscatedGetter(
      intValue = -1903721245
   )
   @Export("viewportX")
   static int viewportX;
   @ObfuscatedName("nx")
   @ObfuscatedGetter(
      intValue = -846725849
   )
   @Export("viewportY")
   static int viewportY;
   @ObfuscatedName("ok")
   @ObfuscatedGetter(
      intValue = -1594871497
   )
   static int field665;
   @ObfuscatedName("oh")
   @ObfuscatedGetter(
      intValue = 199173531
   )
   static int field666;
   @ObfuscatedName("om")
   @ObfuscatedGetter(
      intValue = -72118161
   )
   @Export("isItemSelected")
   static int isItemSelected;
   @ObfuscatedName("oe")
   @Export("isSpellSelected")
   static boolean isSpellSelected;
   @ObfuscatedName("ol")
   @ObfuscatedGetter(
      intValue = 85136151
   )
   @Export("selectedSpellChildIndex")
   static int selectedSpellChildIndex;
   @ObfuscatedName("oo")
   @ObfuscatedGetter(
      intValue = -508590269
   )
   @Export("selectedSpellItemId")
   static int selectedSpellItemId;
   @ObfuscatedName("ow")
   @Export("selectedSpellActionName")
   static String selectedSpellActionName;
   @ObfuscatedName("ou")
   @Export("selectedSpellName")
   static String selectedSpellName;
   @ObfuscatedName("ob")
   @ObfuscatedGetter(
      intValue = -1718458183
   )
   @Export("rootInterface")
   static int rootInterface;
   @ObfuscatedName("oz")
   @ObfuscatedSignature(
      descriptor = "Lqg;"
   )
   @Export("interfaceParents")
   static NodeHashTable interfaceParents;
   @ObfuscatedName("ox")
   @ObfuscatedGetter(
      intValue = 1180321257
   )
   static int field798;
   @ObfuscatedName("os")
   @ObfuscatedGetter(
      intValue = -190615213
   )
   static int field677;
   @ObfuscatedName("oi")
   @ObfuscatedGetter(
      intValue = 304971839
   )
   @Export("chatEffects")
   static int chatEffects;
   @ObfuscatedName("of")
   @ObfuscatedGetter(
      intValue = 2141618577
   )
   static int field679;
   @ObfuscatedName("or")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("meslayerContinueWidget")
   static Widget meslayerContinueWidget;
   @ObfuscatedName("oj")
   @ObfuscatedGetter(
      intValue = -1382263095
   )
   @Export("runEnergy")
   static int runEnergy;
   @ObfuscatedName("op")
   @ObfuscatedGetter(
      intValue = 123109427
   )
   @Export("weight")
   static int weight;
   @ObfuscatedName("oy")
   @ObfuscatedGetter(
      intValue = -404548639
   )
   @Export("staffModLevel")
   public static int staffModLevel;
   @ObfuscatedName("pl")
   @ObfuscatedGetter(
      intValue = -1168259937
   )
   @Export("followerIndex")
   static int followerIndex;
   @ObfuscatedName("pb")
   @Export("playerMod")
   static boolean playerMod;
   @ObfuscatedName("pn")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("viewportWidget")
   static Widget viewportWidget;
   @ObfuscatedName("pv")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("clickedWidget")
   public static Widget clickedWidget;
   @ObfuscatedName("px")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("clickedWidgetParent")
   static Widget clickedWidgetParent;
   @ObfuscatedName("pq")
   @ObfuscatedGetter(
      intValue = 917283277
   )
   @Export("widgetClickX")
   static int widgetClickX;
   @ObfuscatedName("po")
   @ObfuscatedGetter(
      intValue = -688456321
   )
   @Export("widgetClickY")
   static int widgetClickY;
   @ObfuscatedName("pp")
   @ObfuscatedSignature(
      descriptor = "Lkz;"
   )
   @Export("draggedOnWidget")
   static Widget draggedOnWidget;
   @ObfuscatedName("pj")
   static boolean field692;
   @ObfuscatedName("pk")
   @ObfuscatedGetter(
      intValue = -183486423
   )
   static int field795;
   @ObfuscatedName("pe")
   @ObfuscatedGetter(
      intValue = 1075829493
   )
   static int field803;
   @ObfuscatedName("pf")
   static boolean field695;
   @ObfuscatedName("pm")
   @ObfuscatedGetter(
      intValue = -117107249
   )
   static int field735;
   @ObfuscatedName("ps")
   @ObfuscatedGetter(
      intValue = 509907309
   )
   static int field554;
   @ObfuscatedName("pt")
   @Export("isDraggingWidget")
   static boolean isDraggingWidget;
   @ObfuscatedName("py")
   @ObfuscatedGetter(
      intValue = 622694841
   )
   @Export("cycleCntr")
   static int cycleCntr;
   @ObfuscatedName("pg")
   static int[] changedVarps;
   @ObfuscatedName("pr")
   @ObfuscatedGetter(
      intValue = -2069158649
   )
   static int changedVarpCount;
   @ObfuscatedName("pc")
   static int[] changedItemContainers;
   @ObfuscatedName("pu")
   @ObfuscatedGetter(
      intValue = 1232857917
   )
   static int field524;
   @ObfuscatedName("qm")
   static int[] changedSkills;
   @ObfuscatedName("qz")
   @ObfuscatedGetter(
      intValue = -1953987119
   )
   static int changedSkillsCount;
   @ObfuscatedName("qf")
   static int[] field706;
   @ObfuscatedName("qq")
   @ObfuscatedGetter(
      intValue = -2130298563
   )
   static int field698;
   @ObfuscatedName("qy")
   @ObfuscatedGetter(
      intValue = -455061253
   )
   @Export("chatCycle")
   static int chatCycle;
   @ObfuscatedName("qd")
   @ObfuscatedGetter(
      intValue = -2026923785
   )
   static int field709;
   @ObfuscatedName("qi")
   @ObfuscatedGetter(
      intValue = -1014085359
   )
   static int field637;
   @ObfuscatedName("qu")
   @ObfuscatedGetter(
      intValue = -325839815
   )
   static int field694;
   @ObfuscatedName("qg")
   @ObfuscatedGetter(
      intValue = -85968625
   )
   static int field693;
   @ObfuscatedName("qs")
   @ObfuscatedGetter(
      intValue = -217901753
   )
   static int field713;
   @ObfuscatedName("qe")
   @ObfuscatedGetter(
      intValue = -81166965
   )
   static int field804;
   @ObfuscatedName("qj")
   @ObfuscatedGetter(
      intValue = 752041097
   )
   static int field761;
   @ObfuscatedName("qk")
   @ObfuscatedGetter(
      intValue = 273082057
   )
   @Export("mouseWheelRotation")
   static int mouseWheelRotation;
   @ObfuscatedName("qx")
   @ObfuscatedSignature(
      descriptor = "Lrj;"
   )
   static class491 field717;
   @ObfuscatedName("qw")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   @Export("scriptEvents")
   static NodeDeque scriptEvents;
   @ObfuscatedName("ql")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   static NodeDeque field768;
   @ObfuscatedName("qn")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   static NodeDeque field720;
   @ObfuscatedName("qv")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   static NodeDeque field721;
   @ObfuscatedName("qo")
   @ObfuscatedSignature(
      descriptor = "Lqg;"
   )
   @Export("widgetFlags")
   static NodeHashTable widgetFlags;
   @ObfuscatedName("qc")
   @ObfuscatedGetter(
      intValue = 1758146877
   )
   @Export("rootWidgetCount")
   static int rootWidgetCount;
   @ObfuscatedName("rn")
   @ObfuscatedGetter(
      intValue = -1609338923
   )
   static int field724;
   @ObfuscatedName("rr")
   static boolean[] field725;
   @ObfuscatedName("rf")
   static boolean[] field678;
   @ObfuscatedName("rl")
   static boolean[] field560;
   @ObfuscatedName("ru")
   @Export("rootWidgetXs")
   static int[] rootWidgetXs;
   @ObfuscatedName("rd")
   @Export("rootWidgetYs")
   static int[] rootWidgetYs;
   @ObfuscatedName("rx")
   @Export("rootWidgetWidths")
   static int[] rootWidgetWidths;
   @ObfuscatedName("ri")
   @Export("rootWidgetHeights")
   static int[] rootWidgetHeights;
   @ObfuscatedName("rb")
   @ObfuscatedGetter(
      intValue = 277858403
   )
   @Export("gameDrawingMode")
   static int gameDrawingMode;
   @ObfuscatedName("rz")
   @ObfuscatedGetter(
      longValue = -8964237554665563941L
   )
   static long field733;
   @ObfuscatedName("ro")
   @Export("isResizable")
   static boolean isResizable;
   @ObfuscatedName("re")
   static int[] field758;
   @ObfuscatedName("rg")
   @ObfuscatedGetter(
      intValue = -434515103
   )
   @Export("publicChatMode")
   static int publicChatMode;
   @ObfuscatedName("rk")
   @ObfuscatedGetter(
      intValue = 1030846147
   )
   @Export("tradeChatMode")
   static int tradeChatMode;
   @ObfuscatedName("rw")
   static String field738;
   @ObfuscatedName("rj")
   static long[] crossWorldMessageIds;
   @ObfuscatedName("ra")
   @ObfuscatedGetter(
      intValue = 1805212403
   )
   static int crossWorldMessageIdsIndex;
   @ObfuscatedName("rp")
   @ObfuscatedSignature(
      descriptor = "Lgl;"
   )
   public static class205 field702;
   @ObfuscatedName("sp")
   @ObfuscatedSignature(
      descriptor = "Lgm;"
   )
   static class203 field752;
   @ObfuscatedName("si")
   @ObfuscatedGetter(
      intValue = 836261777
   )
   static int field759;
   @ObfuscatedName("sd")
   static int[] field753;
   @ObfuscatedName("st")
   static int[] field745;
   @ObfuscatedName("sf")
   @ObfuscatedGetter(
      longValue = 2579936191070244689L
   )
   static long field746;
   @ObfuscatedName("gk")
   String field523;
   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      descriptor = "Lt;"
   )
   class14 field538;
   @ObfuscatedName("gf")
   @ObfuscatedSignature(
      descriptor = "Lu;"
   )
   class18 field680;
   @ObfuscatedName("gi")
   OtlTokenRequester field540;
   @ObfuscatedName("gx")
   Future field541;
   @ObfuscatedName("gq")
   boolean field542 = false;
   @ObfuscatedName("gw")
   @ObfuscatedSignature(
      descriptor = "Lu;"
   )
   class18 field543;
   @ObfuscatedName("gj")
   @ObfuscatedSignature(
      descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
   )
   RefreshAccessTokenRequester field613;
   @ObfuscatedName("go")
   Future field784;
   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      descriptor = "Lrd;"
   )
   Buffer field550;
   @ObfuscatedName("gt")
   @ObfuscatedSignature(
      descriptor = "Ln;"
   )
   class7 field551;
   @ObfuscatedName("hz")
   @ObfuscatedGetter(
      longValue = -674525235776955765L
   )
   long field552 = -1L;

   static {
      playerAttackOption = AttackOption.AttackOption_hidden;
      npcAttackOption = AttackOption.AttackOption_hidden;
      titleLoadingStage = 0;
      js5ConnectState = 0;
      field529 = 0;
      js5Errors = 0;
      loginState = 0;
      field532 = 0;
      field533 = 0;
      field646 = 0;
      field535 = class135.field1624;
      field536 = class478.field4996;
      byte[] var1 = NetCache.method6642("com_jagex_auth_desktop_osrs:public");
      int var3 = var1.length;
      StringBuilder var4 = new StringBuilder();

      for(int var5 = 0; var5 < var3 + 0; var5 += 3) {
         int var6 = var1[var5] & 255;
         var4.append(class363.field4363[var6 >>> 2]);
         if (var5 < var3 - 1) {
            int var7 = var1[var5 + 1] & 255;
            var4.append(class363.field4363[(var6 & 3) << 4 | var7 >>> 4]);
            if (var5 < var3 - 2) {
               int var8 = var1[var5 + 2] & 255;
               var4.append(class363.field4363[(var7 & 15) << 2 | var8 >>> 6]).append(class363.field4363[var8 & 63]);
            } else {
               var4.append(class363.field4363[(var7 & 15) << 2]).append("=");
            }
         } else {
            var4.append(class363.field4363[(var6 & 3) << 4]).append("==");
         }
      }

      String var2 = var4.toString();
      field546 = var2;
      Login_isUsernameRemembered = false;
      secureRandomFuture = new SecureRandomFuture();
      randomDatData = null;
      npcs = new NPC[65536];
      npcCount = 0;
      npcIndices = new int[65536];
      field557 = 0;
      field558 = new int[250];
      packetWriter = new PacketWriter();
      logoutTimer = 0;
      hadNetworkError = false;
      timer = new Timer();
      fontsMap = new HashMap();
      field565 = 0;
      field566 = 1;
      field567 = 0;
      field568 = 1;
      field744 = 0;
      collisionMaps = new CollisionMap[4];
      isInInstance = false;
      instanceChunkTemplates = new int[4][13][13];
      field573 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      graphicsCycle = 0;
      field575 = 2301979;
      field576 = 5063219;
      field656 = 3353893;
      field636 = 7759444;
      field681 = false;
      alternativeScrollbarWidth = 0;
      camAngleX = 128;
      camAngleY = 0;
      camAngleDY = 0;
      camAngleDX = 0;
      field585 = 0;
      mouseCamClickedY = 0;
      oculusOrbState = 0;
      camFollowHeight = 50;
      field589 = 0;
      field590 = 0;
      field531 = 0;
      oculusOrbNormalSpeed = 12;
      oculusOrbSlowedSpeed = 6;
      field594 = 0;
      field595 = false;
      field697 = 0;
      field597 = false;
      field598 = 0;
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
      field743 = 0;
      field619 = 0;
      dragItemSlotSource = 0;
      draggedWidgetX = 0;
      draggedWidgetY = 0;
      dragItemSlotDestination = 0;
      field624 = false;
      itemDragDuration = 0;
      field626 = 0;
      showLoadingMessages = true;
      players = new Player[2048];
      localPlayerIndex = -1;
      field630 = 0;
      field631 = -1L;
      renderSelf = true;
      drawPlayerNames = 0;
      field634 = 0;
      field635 = new int[1000];
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
      field665 = 0;
      field666 = 50;
      isItemSelected = 0;
      selectedItemName = null;
      isSpellSelected = false;
      selectedSpellChildIndex = -1;
      selectedSpellItemId = -1;
      selectedSpellActionName = null;
      selectedSpellName = null;
      rootInterface = -1;
      interfaceParents = new NodeHashTable(8);
      field798 = 0;
      field677 = -1;
      chatEffects = 0;
      field679 = 0;
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
      field692 = false;
      field795 = -1;
      field803 = -1;
      field695 = false;
      field735 = -1;
      field554 = -1;
      isDraggingWidget = false;
      cycleCntr = 1;
      changedVarps = new int[32];
      changedVarpCount = 0;
      changedItemContainers = new int[32];
      field524 = 0;
      changedSkills = new int[32];
      changedSkillsCount = 0;
      field706 = new int[32];
      field698 = 0;
      chatCycle = 0;
      field709 = 0;
      field637 = 0;
      field694 = 0;
      field693 = 0;
      field713 = 0;
      field804 = 0;
      field761 = 0;
      mouseWheelRotation = 0;
      field717 = new class491();
      scriptEvents = new NodeDeque();
      field768 = new NodeDeque();
      field720 = new NodeDeque();
      field721 = new NodeDeque();
      widgetFlags = new NodeHashTable(512);
      rootWidgetCount = 0;
      field724 = -2;
      field725 = new boolean[100];
      field678 = new boolean[100];
      field560 = new boolean[100];
      rootWidgetXs = new int[100];
      rootWidgetYs = new int[100];
      rootWidgetWidths = new int[100];
      rootWidgetHeights = new int[100];
      gameDrawingMode = 0;
      field733 = 0L;
      isResizable = true;
      field758 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      publicChatMode = 0;
      tradeChatMode = 0;
      field738 = "";
      crossWorldMessageIds = new long[100];
      crossWorldMessageIdsIndex = 0;
      field702 = new class205();
      field752 = new class203();
      field759 = 0;
      field753 = new int[128];
      field745 = new int[128];
      field746 = -1L;
      currentClanSettings = new ClanSettings[4];
      currentClanChannels = new ClanChannel[4];
      field749 = -1;
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
      field767 = false;
      field569 = new boolean[5];
      field769 = new int[5];
      field525 = new int[5];
      field771 = new int[5];
      field772 = new int[5];
      field773 = 256;
      field774 = 205;
      zoomHeight = 256;
      zoomWidth = 320;
      field763 = 1;
      field778 = 32767;
      field779 = 1;
      field780 = 32767;
      viewportOffsetX = 0;
      viewportOffsetY = 0;
      viewportWidth = 0;
      viewportHeight = 0;
      viewportZoom = 0;
      playerAppearance = new PlayerComposition();
      field787 = -1;
      field788 = -1;
      platformInfoProvider = new DesktopPlatformInfoProvider();
      grandExchangeOffers = new GrandExchangeOffer[8];
      GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
      archive5 = new class391(8, class389.field4516);
      DBTableIndex_cache = new EvictingDualNodeHashTable(64);
      DBTableMasterIndex_cache = new EvictingDualNodeHashTable(64);
      field777 = -1;
      field796 = -1;
      field797 = new ArrayList();
      archiveLoaders = new ArrayList(10);
      archiveLoadersDone = 0;
      field800 = 0;
      field544 = new ApproximateRouteStrategy();
      field802 = new int[50];
      field785 = new int[50];
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1977939270"
   )
   @Export("resizeGame")
   protected final void resizeGame() {
      field733 = class153.method3317() + 500L;
      this.resizeJS();
      if (rootInterface != -1) {
         this.resizeRoot(true);
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1082760075"
   )
   @Export("setUp")
   protected final void setUp() {
      int[] var1 = new int[]{20, 260, 10000};
      int[] var2 = new int[]{1000, 100, 500};
      if (var1 != null && var2 != null) {
         class172.ByteArrayPool_alternativeSizes = var1;
         class132.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
         class9.ByteArrayPool_arrays = new byte[var1.length][][];

         for(int var3 = 0; var3 < class172.ByteArrayPool_alternativeSizes.length; ++var3) {
            class9.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
            ByteArrayPool.field4443.add(var1[var3]);
         }

         Collections.sort(ByteArrayPool.field4443);
      } else {
         class172.ByteArrayPool_alternativeSizes = null;
         class132.ByteArrayPool_altSizeArrayCounts = null;
         class9.ByteArrayPool_arrays = null;
         class36.method694();
      }

      class1.worldPort = gameBuild == 0 ? 'ꩊ' : worldId + '鱀';
      class10.js5Port = gameBuild == 0 ? 443 : worldId + '썐';
      Calendar.currentPort = class1.worldPort;
      class384.field4483 = class308.field3532;
      UserComparator8.field1435 = class308.field3533;
      ItemLayer.field2385 = class308.field3534;
      Varcs.field1379 = class308.field3535;
      class245.urlRequester = new class108(this.field542, 211);
      this.setUpKeyboard();
      this.method506();
      class326.mouseWheel = this.mouseWheel();
      this.method505(field752, 0);
      this.method505(field702, 1);
      class12.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
      PacketWriter.clientPreferences = class138.method3150();
      this.setUpClipboard();
      Occluder.method4650(this, FriendsList.field4540);
      class160.setWindowedMode(PacketWriter.clientPreferences.method2505());
      WorldMapElement.friendSystem = new FriendSystem(WorldMapCacheName.loginType);
      this.field538 = new class14("tokenRequest", 1, 1);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1127205702"
   )
   @Export("doCycle")
   protected final void doCycle() {
      ++cycle;
      this.doCycleJs5();
      WorldMapIcon_0.method5262();

      int var1;
      try {
         if (class290.musicPlayerStatus == 1) {
            var1 = class290.midiPcmStream.method5615();
            if (var1 > 0 && class290.midiPcmStream.isReady()) {
               var1 -= class203.pcmSampleLength;
               if (var1 < 0) {
                  var1 = 0;
               }

               class290.midiPcmStream.setPcmStreamVolume(var1);
            } else {
               class290.midiPcmStream.clear();
               class290.midiPcmStream.removeAll();
               if (class6.musicTrackArchive != null) {
                  class290.musicPlayerStatus = 2;
               } else {
                  class290.musicPlayerStatus = 0;
               }

               class427.musicTrack = null;
               class154.soundCache = null;
            }
         }
      } catch (Exception var3) {
         var3.printStackTrace();
         class290.midiPcmStream.clear();
         class290.musicPlayerStatus = 0;
         class427.musicTrack = null;
         class154.soundCache = null;
         class6.musicTrackArchive = null;
      }

      HorizontalAlignment.playPcmPlayers();
      field702.method4140();
      this.method521();
      class9.method93();
      if (class326.mouseWheel != null) {
         var1 = class326.mouseWheel.useRotation();
         mouseWheelRotation = var1;
      }

      if (gameState == 0) {
         class366.load();
         class204.method4130();
      } else if (gameState == 5) {
         PacketWriter.loginScreen(this, MenuAction.fontPlain12);
         class366.load();
         class204.method4130();
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            PacketWriter.loginScreen(this, MenuAction.fontPlain12);
            this.doCycleLoggedOut();
         } else if (gameState == 50) {
            PacketWriter.loginScreen(this, MenuAction.fontPlain12);
            this.doCycleLoggedOut();
         } else if (gameState == 25) {
            class361.method6965();
         }
      } else {
         PacketWriter.loginScreen(this, MenuAction.fontPlain12);
      }

      if (gameState == 30) {
         this.doCycleLoggedIn();
      } else if (gameState == 40 || gameState == 45) {
         this.doCycleLoggedOut();
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1484603297"
   )
   @Export("draw")
   protected final void draw(boolean var1) {
      boolean var2;
      label170: {
         try {
            if (class290.musicPlayerStatus == 2) {
               if (class427.musicTrack == null) {
                  class427.musicTrack = MusicTrack.readTrack(class6.musicTrackArchive, class20.musicTrackGroupId, class161.musicTrackFileId);
                  if (class427.musicTrack == null) {
                     var2 = false;
                     break label170;
                  }
               }

               if (class154.soundCache == null) {
                  class154.soundCache = new SoundCache(class290.soundEffectsArchive, class290.musicSamplesArchive);
               }

               if (class290.midiPcmStream.loadMusicTrack(class427.musicTrack, class290.musicPatchesArchive, class154.soundCache, 22050)) {
                  class290.midiPcmStream.clearAll();
                  class290.midiPcmStream.setPcmStreamVolume(class290.musicTrackVolume);
                  class290.midiPcmStream.setMusicTrack(class427.musicTrack, class423.musicTrackBoolean);
                  class290.musicPlayerStatus = 0;
                  class427.musicTrack = null;
                  class154.soundCache = null;
                  class6.musicTrackArchive = null;
                  var2 = true;
                  break label170;
               }
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            class290.midiPcmStream.clear();
            class290.musicPlayerStatus = 0;
            class427.musicTrack = null;
            class154.soundCache = null;
            class6.musicTrackArchive = null;
         }

         var2 = false;
      }

      if (var2 && playingJingle && SoundSystem.pcmPlayer0 != null) {
         SoundSystem.pcmPlayer0.tryDiscard();
      }

      if ((gameState == 10 || gameState == 20 || gameState == 30) && field733 != 0L && class153.method3317() > field733) {
         class160.setWindowedMode(Message.getWindowedMode());
      }

      int var4;
      if (var1) {
         for(var4 = 0; var4 < 100; ++var4) {
            field725[var4] = true;
         }
      }

      if (gameState == 0) {
         this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
      } else if (gameState == 5) {
         GrandExchangeOfferAgeComparator.drawTitle(class19.fontBold12, class276.fontPlain11, MenuAction.fontPlain12);
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            GrandExchangeOfferAgeComparator.drawTitle(class19.fontBold12, class276.fontPlain11, MenuAction.fontPlain12);
         } else if (gameState == 50) {
            GrandExchangeOfferAgeComparator.drawTitle(class19.fontBold12, class276.fontPlain11, MenuAction.fontPlain12);
         } else if (gameState == 25) {
            if (field744 == 1) {
               if (field565 > field566) {
                  field566 = field565;
               }

               var4 = (field566 * 50 - field565 * 50) / field566;
               class165.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
            } else if (field744 == 2) {
               if (field567 > field568) {
                  field568 = field567;
               }

               var4 = (field568 * 50 - field567 * 50) / field568 + 50;
               class165.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
            } else {
               class165.drawLoadingMessage("Loading - please wait.", false);
            }
         } else if (gameState == 30) {
            this.drawLoggedIn();
         } else if (gameState == 40) {
            class165.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if (gameState == 45) {
            class165.drawLoadingMessage("Please wait...", false);
         }
      } else {
         GrandExchangeOfferAgeComparator.drawTitle(class19.fontBold12, class276.fontPlain11, MenuAction.fontPlain12);
      }

      if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
         for(var4 = 0; var4 < rootWidgetCount; ++var4) {
            if (field678[var4]) {
               KeyHandler.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
               field678[var4] = false;
            }
         }
      } else if (gameState > 0) {
         KeyHandler.rasterProvider.drawFull(0, 0);

         for(var4 = 0; var4 < rootWidgetCount; ++var4) {
            field678[var4] = false;
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1860938943"
   )
   @Export("kill0")
   protected final void kill0() {
      if (class9.varcs.hasUnwrittenChanges()) {
         class9.varcs.write();
      }

      if (class36.mouseRecorder != null) {
         class36.mouseRecorder.isRunning = false;
      }

      class36.mouseRecorder = null;
      packetWriter.close();
      if (MouseHandler.MouseHandler_instance != null) {
         synchronized(MouseHandler.MouseHandler_instance) {
            MouseHandler.MouseHandler_instance = null;
         }
      }

      class326.mouseWheel = null;
      if (SoundSystem.pcmPlayer0 != null) {
         SoundSystem.pcmPlayer0.shutdown();
      }

      if (WorldMapSectionType.pcmPlayer1 != null) {
         WorldMapSectionType.pcmPlayer1.shutdown();
      }

      CollisionMap.method4208();
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (ArchiveDiskActionHandler.field4199 != 0) {
            ArchiveDiskActionHandler.field4199 = 1;

            try {
               ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
            } catch (InterruptedException var4) {
            }
         }
      }

      if (class245.urlRequester != null) {
         class245.urlRequester.close();
         class245.urlRequester = null;
      }

      Huffman.method6381();
      this.field538.method183();
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1991813544"
   )
   protected final void vmethod1338() {
   }

   @ObfuscatedName("fx")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1921365209"
   )
   boolean method1723() {
      return Frames.field2620 != null && !Frames.field2620.trim().isEmpty() && class152.field1755 != null && !class152.field1755.trim().isEmpty();
   }

   @ObfuscatedName("fh")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2126073648"
   )
   boolean method1217() {
      return MusicPatchNode.field3449 != null && !MusicPatchNode.field3449.trim().isEmpty() && VarcInt.field1962 != null && !VarcInt.field1962.trim().isEmpty();
   }

   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "167"
   )
   boolean method1218() {
      return this.field540 != null;
   }

   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1761087263"
   )
   void method1219(String var1) throws IOException {
      HashMap var2 = new HashMap();
      var2.put("grant_type", "refresh_token");
      var2.put("scope", "gamesso.token.create");
      var2.put("refresh_token", var1);
      URL var3 = new URL(field805 + "shield/oauth/token" + (new class430(var2)).method8060());
      class387 var4 = new class387();
      var4.method7442(field546);
      var4.method7453("Host", (new URL(field805)).getHost());
      var4.method7424(class427.field4680);
      class9 var5 = class9.field31;
      RefreshAccessTokenRequester var6 = this.field613;
      if (var6 != null) {
         this.field784 = var6.request(var5.method80(), var3, var4.method7416(), "");
      } else {
         class10 var7 = new class10(var3, var5, var4, this.field542);
         this.field543 = this.field538.method187(var7);
      }
   }

   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "2143605223"
   )
   void method1564(String var1) throws IOException {
      URL var2 = new URL(field805 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
      class387 var3 = new class387();
      var3.method7445(var1);
      class9 var4 = class9.field32;
      OtlTokenRequester var5 = this.field540;
      if (var5 != null) {
         this.field541 = var5.request(var4.method80(), var2, var3.method7416(), "");
      } else {
         class10 var6 = new class10(var2, var4, var3, this.field542);
         this.field680 = this.field538.method187(var6);
      }
   }

   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-986853622"
   )
   void method1213(String var1, String var2) throws IOException, JSONException {
      URL var3 = new URL(field805 + "/game-session/v1/tokens");
      class10 var4 = new class10(var3, class9.field31, this.field542);
      var4.method100().method7445(var1);
      var4.method100().method7424(class427.field4680);
      JSONObject var5 = new JSONObject();
      var5.method8392("accountId", var2);
      var4.method96(new class429(var5));
      this.field680 = this.field538.method187(var4);
   }

   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1902910944"
   )
   @Export("doCycleJs5")
   void doCycleJs5() {
      if (gameState != 1000) {
         boolean var1 = class96.method2680();
         if (!var1) {
            this.doCycleJs5Connect();
         }

      }
   }

   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "3134"
   )
   @Export("doCycleJs5Connect")
   void doCycleJs5Connect() {
      if (NetCache.NetCache_crcMismatches >= 4) {
         this.error("js5crc");
         class246.updateGameState(1000);
      } else {
         if (NetCache.NetCache_ioExceptions >= 4) {
            if (gameState <= 5) {
               this.error("js5io");
               class246.updateGameState(1000);
               return;
            }

            field529 = 3000;
            NetCache.NetCache_ioExceptions = 3;
         }

         if (--field529 + 1 <= 0) {
            try {
               if (js5ConnectState == 0) {
                  WorldMapRenderer.js5SocketTask = GameEngine.taskHandler.newSocketTask(NetCache.worldHost, Calendar.currentPort);
                  ++js5ConnectState;
               }

               if (js5ConnectState == 1) {
                  if (WorldMapRenderer.js5SocketTask.status == 2) {
                     this.js5Error(-1);
                     return;
                  }

                  if (WorldMapRenderer.js5SocketTask.status == 1) {
                     ++js5ConnectState;
                  }
               }

               Buffer var3;
               if (js5ConnectState == 2) {
                  Socket var2 = (Socket)WorldMapRenderer.js5SocketTask.result;
                  BufferedNetSocket var1 = new BufferedNetSocket(var2, 40000, 5000);
                  Decimator.js5Socket = var1;
                  var3 = new Buffer(5);
                  var3.writeByte(15);
                  var3.writeInt(211);
                  Decimator.js5Socket.write(var3.array, 0, 5);
                  ++js5ConnectState;
                  HorizontalAlignment.field2016 = class153.method3317();
               }

               if (js5ConnectState == 3) {
                  if (Decimator.js5Socket.available() > 0) {
                     int var5 = Decimator.js5Socket.readUnsignedByte();
                     if (var5 != 0) {
                        this.js5Error(var5);
                        return;
                     }

                     ++js5ConnectState;
                  } else if (class153.method3317() - HorizontalAlignment.field2016 > 30000L) {
                     this.js5Error(-2);
                     return;
                  }
               }

               if (js5ConnectState == 4) {
                  AbstractSocket var13 = Decimator.js5Socket;
                  boolean var6 = gameState > 20;
                  if (NetCache.NetCache_socket != null) {
                     try {
                        NetCache.NetCache_socket.close();
                     } catch (Exception var11) {
                     }

                     NetCache.NetCache_socket = null;
                  }

                  NetCache.NetCache_socket = var13;
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
                  WorldMapDecoration.NetCache_currentResponse = null;
                  class14.NetCache_responseArchiveBuffer = null;
                  NetCache.field4250 = 0;

                  while(true) {
                     NetFileRequest var14 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
                     if (var14 == null) {
                        while(true) {
                           var14 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
                           if (var14 == null) {
                              if (NetCache.field4248 != 0) {
                                 try {
                                    var3 = new Buffer(4);
                                    var3.writeByte(4);
                                    var3.writeByte(NetCache.field4248);
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
                              NetCache.field4252 = class153.method3317();
                              WorldMapRenderer.js5SocketTask = null;
                              Decimator.js5Socket = null;
                              js5ConnectState = 0;
                              js5Errors = 0;
                              return;
                           }

                           NetCache.NetCache_pendingWritesQueue.addLast(var14);
                           NetCache.NetCache_pendingWrites.put(var14, var14.key);
                           ++NetCache.NetCache_pendingWritesCount;
                           --NetCache.NetCache_pendingResponsesCount;
                        }
                     }

                     NetCache.NetCache_pendingPriorityWrites.put(var14, var14.key);
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

   @ObfuscatedName("fs")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1698459928"
   )
   @Export("js5Error")
   void js5Error(int var1) {
      WorldMapRenderer.js5SocketTask = null;
      Decimator.js5Socket = null;
      js5ConnectState = 0;
      if (Calendar.currentPort == class1.worldPort) {
         Calendar.currentPort = class10.js5Port;
      } else {
         Calendar.currentPort = class1.worldPort;
      }

      ++js5Errors;
      if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
         if (gameState <= 5) {
            this.error("js5connect_full");
            class246.updateGameState(1000);
         } else {
            field529 = 3000;
         }
      } else if (js5Errors >= 2 && var1 == 6) {
         this.error("js5connect_outofdate");
         class246.updateGameState(1000);
      } else if (js5Errors >= 4) {
         if (gameState <= 5) {
            this.error("js5connect");
            class246.updateGameState(1000);
         } else {
            field529 = 3000;
         }
      }

   }

   @ObfuscatedName("fv")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1895423785"
   )
   @Export("doCycleLoggedOut")
   final void doCycleLoggedOut() {
      Object var1 = packetWriter.getSocket();
      PacketBuffer var2 = packetWriter.packetBuffer;

      try {
         if (loginState == 0) {
            if (GrandExchangeOfferTotalQuantityComparator.secureRandom == null && (secureRandomFuture.isDone() || field532 > 250)) {
               GrandExchangeOfferTotalQuantityComparator.secureRandom = secureRandomFuture.get();
               secureRandomFuture.shutdown();
               secureRandomFuture = null;
            }

            if (GrandExchangeOfferTotalQuantityComparator.secureRandom != null) {
               if (var1 != null) {
                  ((AbstractSocket)var1).close();
                  var1 = null;
               }

               BufferedSource.socketTask = null;
               hadNetworkError = false;
               field532 = 0;
               if (field536.method8938()) {
                  if (this.method1723()) {
                     try {
                        this.method1219(class152.field1755);
                        ModeWhere.method6787(21);
                     } catch (Throwable var23) {
                        class121.RunException_sendStackTrace((String)null, var23);
                        class33.getLoginError(65);
                        return;
                     }
                  } else {
                     if (!this.method1217()) {
                        class33.getLoginError(65);
                        return;
                     }

                     try {
                        this.method1213(MusicPatchNode.field3449, VarcInt.field1962);
                        ModeWhere.method6787(20);
                     } catch (Exception var22) {
                        class121.RunException_sendStackTrace((String)null, var22);
                        class33.getLoginError(65);
                        return;
                     }
                  }
               } else {
                  ModeWhere.method6787(1);
               }
            }
         }

         class20 var25;
         if (loginState == 21) {
            if (this.field784 != null) {
               if (!this.field784.isDone()) {
                  return;
               }

               if (this.field784.isCancelled()) {
                  class33.getLoginError(65);
                  this.field784 = null;
                  return;
               }

               try {
                  RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field784.get();
                  if (!var3.isSuccess()) {
                     class33.getLoginError(65);
                     this.field784 = null;
                     return;
                  }

                  Frames.field2620 = var3.getAccessToken();
                  class152.field1755 = var3.getRefreshToken();
                  this.field784 = null;
               } catch (Exception var21) {
                  class121.RunException_sendStackTrace((String)null, var21);
                  class33.getLoginError(65);
                  this.field784 = null;
                  return;
               }
            } else {
               if (this.field543 == null) {
                  class33.getLoginError(65);
                  return;
               }

               if (!this.field543.method279()) {
                  return;
               }

               if (this.field543.method282()) {
                  class121.RunException_sendStackTrace(this.field543.method277(), (Throwable)null);
                  class33.getLoginError(65);
                  this.field543 = null;
                  return;
               }

               var25 = this.field543.method280();
               if (var25.method300() != 200) {
                  class33.getLoginError(65);
                  this.field543 = null;
                  return;
               }

               field532 = 0;
               class429 var4 = new class429(var25.method298());

               try {
                  Frames.field2620 = var4.method8045().getString("access_token");
                  class152.field1755 = var4.method8045().getString("refresh_token");
               } catch (Exception var20) {
                  class121.RunException_sendStackTrace("Error parsing tokens", var20);
                  class33.getLoginError(65);
                  this.field543 = null;
                  return;
               }
            }

            this.method1564(Frames.field2620);
            ModeWhere.method6787(20);
         }

         if (loginState == 20) {
            if (this.field541 != null) {
               if (!this.field541.isDone()) {
                  return;
               }

               if (this.field541.isCancelled()) {
                  class33.getLoginError(65);
                  this.field541 = null;
                  return;
               }

               try {
                  OtlTokenResponse var26 = (OtlTokenResponse)this.field541.get();
                  if (!var26.isSuccess()) {
                     class33.getLoginError(65);
                     this.field541 = null;
                     return;
                  }

                  this.field523 = var26.getToken();
                  this.field541 = null;
               } catch (Exception var19) {
                  class121.RunException_sendStackTrace((String)null, var19);
                  class33.getLoginError(65);
                  this.field541 = null;
                  return;
               }
            } else {
               if (this.field680 == null) {
                  class33.getLoginError(65);
                  return;
               }

               if (!this.field680.method279()) {
                  return;
               }

               if (this.field680.method282()) {
                  class121.RunException_sendStackTrace(this.field680.method277(), (Throwable)null);
                  class33.getLoginError(65);
                  this.field680 = null;
                  return;
               }

               var25 = this.field680.method280();
               if (var25.method300() != 200) {
                  class121.RunException_sendStackTrace("Response code: " + var25.method300() + "Response body: " + var25.method298(), (Throwable)null);
                  class33.getLoginError(65);
                  this.field680 = null;
                  return;
               }

               List var28 = (List)var25.method297().get("Content-Type");
               if (var28 != null && var28.contains(class427.field4680.method8031())) {
                  try {
                     JSONObject var5 = new JSONObject(var25.method298());
                     this.field523 = var5.getString("token");
                  } catch (JSONException var18) {
                     class121.RunException_sendStackTrace((String)null, var18);
                     class33.getLoginError(65);
                     this.field680 = null;
                     return;
                  }
               } else {
                  this.field523 = var25.method298();
               }

               this.field680 = null;
            }

            field532 = 0;
            ModeWhere.method6787(1);
         }

         if (loginState == 1) {
            if (BufferedSource.socketTask == null) {
               BufferedSource.socketTask = GameEngine.taskHandler.newSocketTask(NetCache.worldHost, Calendar.currentPort);
            }

            if (BufferedSource.socketTask.status == 2) {
               throw new IOException();
            }

            if (BufferedSource.socketTask.status == 1) {
               Socket var30 = (Socket)BufferedSource.socketTask.result;
               BufferedNetSocket var27 = new BufferedNetSocket(var30, 40000, 5000);
               var1 = var27;
               packetWriter.setSocket(var27);
               BufferedSource.socketTask = null;
               ModeWhere.method6787(2);
            }
         }

         PacketBufferNode var29;
         if (loginState == 2) {
            packetWriter.clearBuffer();
            var29 = ObjectComposition.method3922();
            var29.packetBuffer.writeByte(LoginPacket.field3317.id);
            packetWriter.addNode(var29);
            packetWriter.flush();
            var2.offset = 0;
            ModeWhere.method6787(3);
         }

         int var12;
         if (loginState == 3) {
            if (SoundSystem.pcmPlayer0 != null) {
               SoundSystem.pcmPlayer0.method783();
            }

            if (WorldMapSectionType.pcmPlayer1 != null) {
               WorldMapSectionType.pcmPlayer1.method783();
            }

            if (((AbstractSocket)var1).isAvailable(1)) {
               var12 = ((AbstractSocket)var1).readUnsignedByte();
               if (SoundSystem.pcmPlayer0 != null) {
                  SoundSystem.pcmPlayer0.method783();
               }

               if (WorldMapSectionType.pcmPlayer1 != null) {
                  WorldMapSectionType.pcmPlayer1.method783();
               }

               if (var12 != 0) {
                  class33.getLoginError(var12);
                  return;
               }

               var2.offset = 0;
               ModeWhere.method6787(4);
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
               class149.field1709 = var2.readLong();
               ModeWhere.method6787(5);
            }
         }

         int var6;
         if (loginState == 5) {
            packetWriter.packetBuffer.offset = 0;
            packetWriter.clearBuffer();
            PacketBuffer var31 = new PacketBuffer(500);
            int[] var32 = new int[]{GrandExchangeOfferTotalQuantityComparator.secureRandom.nextInt(), GrandExchangeOfferTotalQuantityComparator.secureRandom.nextInt(), GrandExchangeOfferTotalQuantityComparator.secureRandom.nextInt(), GrandExchangeOfferTotalQuantityComparator.secureRandom.nextInt()};
            var31.offset = 0;
            var31.writeByte(1);
            var31.writeInt(var32[0]);
            var31.writeInt(var32[1]);
            var31.writeInt(var32[2]);
            var31.writeInt(var32[3]);
            var31.writeLong(class149.field1709);
            if (gameState == 40) {
               var31.writeInt(class18.field99[0]);
               var31.writeInt(class18.field99[1]);
               var31.writeInt(class18.field99[2]);
               var31.writeInt(class18.field99[3]);
            } else {
               if (gameState == 50) {
                  var31.writeByte(class135.field1630.rsOrdinal());
                  var31.writeInt(MusicPatchNode2.field3356);
               } else {
                  var31.writeByte(field535.rsOrdinal());
                  switch (field535.field1627) {
                     case 0:
                        var31.offset += 4;
                     case 1:
                     default:
                        break;
                     case 2:
                        var31.writeInt(PacketWriter.clientPreferences.method2508(Login.Login_username));
                        break;
                     case 3:
                     case 4:
                        var31.writeMedium(UserComparator4.field1429);
                        ++var31.offset;
                  }
               }

               if (field536.method8938()) {
                  var31.writeByte(class478.field4992.rsOrdinal());
                  var31.writeStringCp1252NullTerminated(this.field523);
               } else {
                  var31.writeByte(class478.field4996.rsOrdinal());
                  var31.writeStringCp1252NullTerminated(Login.Login_password);
               }
            }

            var31.encryptRsa(class70.field899, class70.field896);
            class18.field99 = var32;
            PacketBufferNode var33 = ObjectComposition.method3922();
            var33.packetBuffer.offset = 0;
            if (gameState == 40) {
               var33.packetBuffer.writeByte(LoginPacket.field3309.id);
            } else {
               var33.packetBuffer.writeByte(LoginPacket.field3310.id);
            }

            var33.packetBuffer.writeShort(0);
            var6 = var33.packetBuffer.offset;
            var33.packetBuffer.writeInt(211);
            var33.packetBuffer.writeInt(1);
            var33.packetBuffer.writeByte(clientType);
            var33.packetBuffer.writeByte(field503);
            byte var7 = 0;
            var33.packetBuffer.writeByte(var7);
            var33.packetBuffer.writeBytes(var31.array, 0, var31.offset);
            int var8 = var33.packetBuffer.offset;
            var33.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
            var33.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
            var33.packetBuffer.writeShort(GameEngine.canvasWidth);
            var33.packetBuffer.writeShort(class127.canvasHeight);
            UserComparator3.method2941(var33.packetBuffer);
            var33.packetBuffer.writeStringCp1252NullTerminated(GraphicsDefaults.field4623);
            var33.packetBuffer.writeInt(Message.field486);
            Buffer var9 = new Buffer(UserComparator9.platformInfo.size());
            UserComparator9.platformInfo.write(var9);
            var33.packetBuffer.writeBytes(var9.array, 0, var9.array.length);
            var33.packetBuffer.writeByte(clientType);
            var33.packetBuffer.writeInt(0);
            var33.packetBuffer.writeIntME(class12.archive12.hash);
            var33.packetBuffer.writeIntME(class372.archive2.hash);
            var33.packetBuffer.writeIntME(ApproximateRouteStrategy.archive10.hash);
            var33.packetBuffer.writeIntLE(MusicPatchNode.field3448.hash);
            var33.packetBuffer.writeIntIME(NetCache.archive9.hash);
            var33.packetBuffer.writeIntLE(0);
            var33.packetBuffer.writeIntLE(class174.archive14.hash);
            var33.packetBuffer.writeInt(GameEngine.archive19.hash);
            var33.packetBuffer.writeIntIME(class419.archive18.hash);
            var33.packetBuffer.writeInt(class27.archive20.hash);
            var33.packetBuffer.writeIntME(class13.field70.hash);
            var33.packetBuffer.writeIntLE(class144.archive4.hash);
            var33.packetBuffer.writeIntIME(WorldMapEvent.archive8.hash);
            var33.packetBuffer.writeInt(PendingSpawn.archive13.hash);
            var33.packetBuffer.writeIntIME(class153.archive6.hash);
            var33.packetBuffer.writeIntIME(class286.archive15.hash);
            var33.packetBuffer.writeIntME(class148.field1704.hash);
            var33.packetBuffer.writeIntME(class151.archive11.hash);
            var33.packetBuffer.writeIntLE(CollisionMap.archive17.hash);
            var33.packetBuffer.writeInt(DynamicObject.field1001.hash);
            var33.packetBuffer.writeIntLE(FriendsChat.archive7.hash);
            var33.packetBuffer.xteaEncrypt(var32, var8, var33.packetBuffer.offset);
            var33.packetBuffer.writeLengthShort(var33.packetBuffer.offset - var6);
            packetWriter.addNode(var33);
            packetWriter.flush();
            packetWriter.isaacCipher = new IsaacCipher(var32);
            int[] var10 = new int[4];

            for(int var11 = 0; var11 < 4; ++var11) {
               var10[var11] = var32[var11] + 50;
            }

            var2.newIsaacCipher(var10);
            ModeWhere.method6787(6);
         }

         int var13;
         if (loginState == 6 && ((AbstractSocket)var1).available() > 0) {
            var12 = ((AbstractSocket)var1).readUnsignedByte();
            if (var12 == 61) {
               var13 = ((AbstractSocket)var1).available();
               class209.field2376 = var13 == 1 && ((AbstractSocket)var1).readUnsignedByte() == 1;
               ModeWhere.method6787(5);
            }

            if (var12 == 21 && gameState == 20) {
               ModeWhere.method6787(12);
            } else if (var12 == 2) {
               ModeWhere.method6787(14);
            } else if (var12 == 15 && gameState == 40) {
               packetWriter.serverPacketLength = -1;
               ModeWhere.method6787(19);
            } else if (var12 == 64) {
               ModeWhere.method6787(10);
            } else if (var12 == 23 && field533 < 1) {
               ++field533;
               ModeWhere.method6787(0);
            } else if (var12 == 29) {
               ModeWhere.method6787(17);
            } else {
               if (var12 != 69) {
                  class33.getLoginError(var12);
                  return;
               }

               ModeWhere.method6787(7);
            }
         }

         if (loginState == 7 && ((AbstractSocket)var1).available() >= 2) {
            ((AbstractSocket)var1).read(var2.array, 0, 2);
            var2.offset = 0;
            MidiPcmStream.field3381 = var2.readUnsignedShort();
            ModeWhere.method6787(8);
         }

         if (loginState == 8 && ((AbstractSocket)var1).available() >= MidiPcmStream.field3381) {
            var2.offset = 0;
            ((AbstractSocket)var1).read(var2.array, var2.offset, MidiPcmStream.field3381);
            class6[] var34 = new class6[]{class6.field16};
            class6 var35 = var34[var2.readUnsignedByte()];

            try {
               class3 var36 = class70.method2090(var35);
               this.field551 = new class7(var2, var36);
               ModeWhere.method6787(9);
            } catch (Exception var17) {
               class33.getLoginError(22);
               return;
            }
         }

         if (loginState == 9 && this.field551.method54()) {
            this.field550 = this.field551.method66();
            this.field551.method55();
            this.field551 = null;
            if (this.field550 == null) {
               class33.getLoginError(22);
               return;
            }

            packetWriter.clearBuffer();
            var29 = ObjectComposition.method3922();
            var29.packetBuffer.writeByte(LoginPacket.field3312.id);
            var29.packetBuffer.writeShort(this.field550.offset);
            var29.packetBuffer.writeBuffer(this.field550);
            packetWriter.addNode(var29);
            packetWriter.flush();
            this.field550 = null;
            ModeWhere.method6787(6);
         }

         if (loginState == 10 && ((AbstractSocket)var1).available() > 0) {
            class121.field1483 = ((AbstractSocket)var1).readUnsignedByte();
            ModeWhere.method6787(11);
         }

         if (loginState == 11 && ((AbstractSocket)var1).available() >= class121.field1483) {
            ((AbstractSocket)var1).read(var2.array, 0, class121.field1483);
            var2.offset = 0;
            ModeWhere.method6787(6);
         }

         if (loginState == 12 && ((AbstractSocket)var1).available() > 0) {
            field646 = (((AbstractSocket)var1).readUnsignedByte() + 3) * 60;
            ModeWhere.method6787(13);
         }

         if (loginState == 13) {
            field532 = 0;
            class70.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field646 / 60 + " seconds.");
            if (--field646 <= 0) {
               ModeWhere.method6787(0);
            }

         } else {
            if (loginState == 14 && ((AbstractSocket)var1).available() >= 1) {
               TriBool.field4580 = ((AbstractSocket)var1).readUnsignedByte();
               ModeWhere.method6787(15);
            }

            boolean var43;
            if (loginState == 15 && ((AbstractSocket)var1).available() >= TriBool.field4580) {
               boolean var44 = ((AbstractSocket)var1).readUnsignedByte() == 1;
               ((AbstractSocket)var1).read(var2.array, 0, 4);
               var2.offset = 0;
               var43 = false;
               if (var44) {
                  var13 = var2.readByteIsaac() << 24;
                  var13 |= var2.readByteIsaac() << 16;
                  var13 |= var2.readByteIsaac() << 8;
                  var13 |= var2.readByteIsaac();
                  PacketWriter.clientPreferences.method2589(Login.Login_username, var13);
               }

               if (Login_isUsernameRemembered) {
                  PacketWriter.clientPreferences.method2500(Login.Login_username);
               } else {
                  PacketWriter.clientPreferences.method2500((String)null);
               }

               SoundSystem.savePreferences();
               staffModLevel = ((AbstractSocket)var1).readUnsignedByte();
               playerMod = ((AbstractSocket)var1).readUnsignedByte() == 1;
               localPlayerIndex = ((AbstractSocket)var1).readUnsignedByte();
               localPlayerIndex <<= 8;
               localPlayerIndex += ((AbstractSocket)var1).readUnsignedByte();
               field630 = ((AbstractSocket)var1).readUnsignedByte();
               ((AbstractSocket)var1).read(var2.array, 0, 8);
               var2.offset = 0;
               this.field552 = var2.readLong();
               if (TriBool.field4580 >= 29) {
                  ((AbstractSocket)var1).read(var2.array, 0, 8);
                  var2.offset = 0;
                  field631 = var2.readLong();
               }

               ((AbstractSocket)var1).read(var2.array, 0, 1);
               var2.offset = 0;
               ServerPacket[] var39 = PlayerCompositionColorTextureOverride.ServerPacket_values();
               var6 = var2.readSmartByteShortIsaac();
               if (var6 < 0 || var6 >= var39.length) {
                  throw new IOException(var6 + " " + var2.offset);
               }

               packetWriter.serverPacket = var39[var6];
               packetWriter.serverPacketLength = packetWriter.serverPacket.length;
               ((AbstractSocket)var1).read(var2.array, 0, 2);
               var2.offset = 0;
               packetWriter.serverPacketLength = var2.readUnsignedShort();

               try {
                  Client var14 = Decimator.client;
                  JSObject.getWindow(var14).call("zap", (Object[])null);
               } catch (Throwable var16) {
               }

               ModeWhere.method6787(16);
            }

            if (loginState != 16) {
               if (loginState == 17 && ((AbstractSocket)var1).available() >= 2) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, 2);
                  var2.offset = 0;
                  Canvas.field138 = var2.readUnsignedShort();
                  ModeWhere.method6787(18);
               }

               if (loginState == 18 && ((AbstractSocket)var1).available() >= Canvas.field138) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, Canvas.field138);
                  var2.offset = 0;
                  String var42 = var2.readStringCp1252NullTerminated();
                  String var38 = var2.readStringCp1252NullTerminated();
                  String var41 = var2.readStringCp1252NullTerminated();
                  class70.setLoginResponseString(var42, var38, var41);
                  class246.updateGameState(10);
                  if (field536.method8938()) {
                     ReflectionCheck.method696(9);
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
                     timer.method7382();
                     class12.method169();
                     Login.updatePlayer(var2);
                     if (var12 != var2.offset) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field532;
                  if (field532 > 2000) {
                     if (field533 < 1) {
                        if (Calendar.currentPort == class1.worldPort) {
                           Calendar.currentPort = class10.js5Port;
                        } else {
                           Calendar.currentPort = class1.worldPort;
                        }

                        ++field533;
                        ModeWhere.method6787(0);
                     } else {
                        class33.getLoginError(-3);
                     }
                  }
               }
            } else {
               if (((AbstractSocket)var1).available() >= packetWriter.serverPacketLength) {
                  var2.offset = 0;
                  ((AbstractSocket)var1).read(var2.array, 0, packetWriter.serverPacketLength);
                  timer.method7380();
                  mouseLastLastPressedTimeMillis = 1L;
                  class36.mouseRecorder.index = 0;
                  GameEngine.hasFocus = true;
                  hadFocus = true;
                  field746 = -1L;
                  class146.method3200();
                  packetWriter.clearBuffer();
                  packetWriter.packetBuffer.offset = 0;
                  packetWriter.serverPacket = null;
                  packetWriter.field1405 = null;
                  packetWriter.field1401 = null;
                  packetWriter.field1402 = null;
                  packetWriter.serverPacketLength = 0;
                  packetWriter.field1398 = 0;
                  rebootTimer = 0;
                  logoutTimer = 0;
                  hintArrowType = 0;
                  ScriptFrame.method1156();
                  MouseHandler.MouseHandler_idleCycles = 0;
                  class140.method3164();
                  isItemSelected = 0;
                  isSpellSelected = false;
                  soundEffectCount = 0;
                  camAngleY = 0;
                  oculusOrbState = 0;
                  class136.field1633 = null;
                  minimapState = 0;
                  field749 = -1;
                  destinationX = 0;
                  destinationY = 0;
                  playerAttackOption = AttackOption.AttackOption_hidden;
                  npcAttackOption = AttackOption.AttackOption_hidden;
                  npcCount = 0;
                  Players.Players_count = 0;

                  for(var12 = 0; var12 < 2048; ++var12) {
                     Players.field1341[var12] = null;
                     Players.field1340[var12] = class208.field2360;
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

                  int var15;
                  for(var12 = 0; var12 < 4; ++var12) {
                     for(var13 = 0; var13 < 104; ++var13) {
                        for(var15 = 0; var15 < 104; ++var15) {
                           groundItems[var12][var13][var15] = null;
                        }
                     }
                  }

                  pendingSpawns = new NodeDeque();
                  WorldMapElement.friendSystem.clear();

                  for(var12 = 0; var12 < VarpDefinition.field1927; ++var12) {
                     VarpDefinition var37 = TaskHandler.VarpDefinition_get(var12);
                     if (var37 != null) {
                        Varps.Varps_temp[var12] = 0;
                        Varps.Varps_main[var12] = 0;
                     }
                  }

                  class9.varcs.clearTransient();
                  followerIndex = -1;
                  if (rootInterface != -1) {
                     var12 = rootInterface;
                     if (var12 != -1 && class431.Widget_loadedInterfaces[var12]) {
                        UserComparator8.Widget_archive.clearFilesGroup(var12);
                        if (WorldMapLabel.Widget_interfaceComponents[var12] != null) {
                           var43 = true;

                           for(var15 = 0; var15 < WorldMapLabel.Widget_interfaceComponents[var12].length; ++var15) {
                              if (WorldMapLabel.Widget_interfaceComponents[var12][var15] != null) {
                                 if (WorldMapLabel.Widget_interfaceComponents[var12][var15].type != 2) {
                                    WorldMapLabel.Widget_interfaceComponents[var12][var15] = null;
                                 } else {
                                    var43 = false;
                                 }
                              }
                           }

                           if (var43) {
                              WorldMapLabel.Widget_interfaceComponents[var12] = null;
                           }

                           class431.Widget_loadedInterfaces[var12] = false;
                        }
                     }
                  }

                  for(InterfaceParent var40 = (InterfaceParent)interfaceParents.first(); var40 != null; var40 = (InterfaceParent)interfaceParents.next()) {
                     class10.closeInterface(var40, true);
                  }

                  rootInterface = -1;
                  interfaceParents = new NodeHashTable(8);
                  meslayerContinueWidget = null;
                  ScriptFrame.method1156();
                  playerAppearance.method5910((int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

                  for(var12 = 0; var12 < 8; ++var12) {
                     playerMenuActions[var12] = null;
                     playerOptionsPriorities[var12] = false;
                  }

                  class320.method6429();
                  isLoading = true;

                  for(var12 = 0; var12 < 100; ++var12) {
                     field725[var12] = true;
                  }

                  var29 = Renderable.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, packetWriter.isaacCipher);
                  var29.packetBuffer.writeByte(Message.getWindowedMode());
                  var29.packetBuffer.writeShort(GameEngine.canvasWidth);
                  var29.packetBuffer.writeShort(class127.canvasHeight);
                  packetWriter.addNode(var29);
                  class463.friendsChat = null;
                  DynamicObject.guestClanSettings = null;
                  Arrays.fill(currentClanSettings, (Object)null);
                  class482.guestClanChannel = null;
                  Arrays.fill(currentClanChannels, (Object)null);

                  for(var12 = 0; var12 < 8; ++var12) {
                     grandExchangeOffers[var12] = new GrandExchangeOffer();
                  }

                  EnumComposition.grandExchangeEvents = null;
                  Login.updatePlayer(var2);
                  class303.field3472 = -1;
                  class277.loadRegions(false, var2);
                  packetWriter.serverPacket = null;
               }

            }
         }
      } catch (IOException var24) {
         if (field533 < 1) {
            if (class1.worldPort == Calendar.currentPort) {
               Calendar.currentPort = class10.js5Port;
            } else {
               Calendar.currentPort = class1.worldPort;
            }

            ++field533;
            ModeWhere.method6787(0);
         } else {
            class33.getLoginError(-2);
         }
      }
   }

   @ObfuscatedName("fp")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1825942383"
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
         WorldMapRenderer.method5197();
      } else {
         if (!isMenuOpen) {
            class174.addCancelMenuEntry();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.method1621(packetWriter); ++var1) {
         }

         if (gameState == 30) {
            while(true) {
               ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last();
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
                  if (timer.field4471) {
                     var14 = Renderable.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
                     var14.packetBuffer.writeByte(0);
                     var15 = var14.packetBuffer.offset;
                     timer.write(var14.packetBuffer);
                     var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15);
                     packetWriter.addNode(var14);
                     timer.method7386();
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
                  synchronized(class36.mouseRecorder.lock) {
                     if (!field534) {
                        class36.mouseRecorder.index = 0;
                     } else if (MouseHandler.MouseHandler_lastButton != 0 || class36.mouseRecorder.index >= 40) {
                        var31 = null;
                        var3 = 0;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;

                        for(var7 = 0; var7 < class36.mouseRecorder.index && (var31 == null || var31.packetBuffer.offset - var3 < 246); ++var7) {
                           var4 = var7;
                           var8 = class36.mouseRecorder.ys[var7];
                           if (var8 < -1) {
                              var8 = -1;
                           } else if (var8 > 65534) {
                              var8 = 65534;
                           }

                           var9 = class36.mouseRecorder.xs[var7];
                           if (var9 < -1) {
                              var9 = -1;
                           } else if (var9 > 65534) {
                              var9 = 65534;
                           }

                           if (var9 != field563 || var8 != field513) {
                              if (var31 == null) {
                                 var31 = Renderable.getPacketBufferNode(ClientPacket.field3166, packetWriter.isaacCipher);
                                 var31.packetBuffer.writeByte(0);
                                 var3 = var31.packetBuffer.offset;
                                 PacketBuffer var10000 = var31.packetBuffer;
                                 var10000.offset += 2;
                                 var5 = 0;
                                 var6 = 0;
                              }

                              if (-1L != field685) {
                                 var10 = var9 - field563;
                                 var11 = var8 - field513;
                                 var12 = (int)((class36.mouseRecorder.millis[var7] - field685) / 20L);
                                 var5 = (int)((long)var5 + (class36.mouseRecorder.millis[var7] - field685) % 20L);
                              } else {
                                 var10 = var9;
                                 var11 = var8;
                                 var12 = Integer.MAX_VALUE;
                              }

                              field563 = var9;
                              field513 = var8;
                              if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                 var10 += 32;
                                 var11 += 32;
                                 var31.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
                              } else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                                 var10 += 128;
                                 var11 += 128;
                                 var31.packetBuffer.writeByte(var12 + 128);
                                 var31.packetBuffer.writeShort(var11 + (var10 << 8));
                              } else if (var12 < 32) {
                                 var31.packetBuffer.writeByte(var12 + 192);
                                 if (var9 != -1 && var8 != -1) {
                                    var31.packetBuffer.writeInt(var9 | var8 << 16);
                                 } else {
                                    var31.packetBuffer.writeInt(Integer.MIN_VALUE);
                                 }
                              } else {
                                 var31.packetBuffer.writeShort((var12 & 8191) + '\ue000');
                                 if (var9 != -1 && var8 != -1) {
                                    var31.packetBuffer.writeInt(var9 | var8 << 16);
                                 } else {
                                    var31.packetBuffer.writeInt(Integer.MIN_VALUE);
                                 }
                              }

                              ++var6;
                              field685 = class36.mouseRecorder.millis[var7];
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

                        if (var4 >= class36.mouseRecorder.index) {
                           class36.mouseRecorder.index = 0;
                        } else {
                           MouseRecorder var47 = class36.mouseRecorder;
                           var47.index -= var4;
                           System.arraycopy(class36.mouseRecorder.xs, var4, class36.mouseRecorder.xs, 0, class36.mouseRecorder.index);
                           System.arraycopy(class36.mouseRecorder.ys, var4, class36.mouseRecorder.ys, 0, class36.mouseRecorder.index);
                           System.arraycopy(class36.mouseRecorder.millis, var4, class36.mouseRecorder.millis, 0, class36.mouseRecorder.index);
                        }
                     }
                  }

                  PacketBufferNode var18;
                  if (MouseHandler.MouseHandler_lastButton == 1 || !ClanMate.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
                     long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
                     if (var16 > 32767L) {
                        var16 = 32767L;
                     }

                     mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
                     var3 = MouseHandler.MouseHandler_lastPressedY;
                     if (var3 < 0) {
                        var3 = 0;
                     } else if (var3 > class127.canvasHeight) {
                        var3 = class127.canvasHeight;
                     }

                     var4 = MouseHandler.MouseHandler_lastPressedX;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > GameEngine.canvasWidth) {
                        var4 = GameEngine.canvasWidth;
                     }

                     var5 = (int)var16;
                     var18 = Renderable.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
                     var18.packetBuffer.writeShort((var5 << 1) + (MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0));
                     var18.packetBuffer.writeShort(var4);
                     var18.packetBuffer.writeShort(var3);
                     packetWriter.addNode(var18);
                  }

                  if (field702.field2335 > 0) {
                     var14 = Renderable.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
                     var14.packetBuffer.writeShort(0);
                     var15 = var14.packetBuffer.offset;
                     long var19 = class153.method3317();

                     for(var5 = 0; var5 < field702.field2335; ++var5) {
                        long var21 = var19 - field746;
                        if (var21 > 16777215L) {
                           var21 = 16777215L;
                        }

                        field746 = var19;
                        var14.packetBuffer.method8690((int)var21);
                        var14.packetBuffer.writeByteNeg(field702.field2328[var5]);
                     }

                     var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
                     packetWriter.addNode(var14);
                  }

                  if (field697 > 0) {
                     --field697;
                  }

                  if (field702.method4143(96) || field702.method4143(97) || field702.method4143(98) || field702.method4143(99)) {
                     field597 = true;
                  }

                  if (field597 && field697 <= 0) {
                     field697 = 20;
                     field597 = false;
                     var14 = Renderable.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
                     var14.packetBuffer.writeShortAddLE(camAngleX);
                     var14.packetBuffer.writeShort(camAngleY);
                     packetWriter.addNode(var14);
                  }

                  if (GameEngine.hasFocus && !hadFocus) {
                     hadFocus = true;
                     var14 = Renderable.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
                     var14.packetBuffer.writeByte(1);
                     packetWriter.addNode(var14);
                  }

                  if (!GameEngine.hasFocus && hadFocus) {
                     hadFocus = false;
                     var14 = Renderable.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
                     var14.packetBuffer.writeByte(0);
                     packetWriter.addNode(var14);
                  }

                  if (GrandExchangeOfferUnitPriceComparator.worldMap != null) {
                     GrandExchangeOfferUnitPriceComparator.worldMap.method8113();
                  }

                  class374.method7187();
                  if (VarbitComposition.field2116) {
                     for(var1 = 0; var1 < Players.Players_count; ++var1) {
                        Player var32 = players[Players.Players_indices[var1]];
                        var32.method2359();
                     }

                     VarbitComposition.field2116 = false;
                  }

                  if (field749 != class103.Client_plane) {
                     field749 = class103.Client_plane;
                     AttackOption.method2710(class103.Client_plane);
                  }

                  if (gameState != 30) {
                     return;
                  }

                  for(PendingSpawn var38 = (PendingSpawn)pendingSpawns.last(); var38 != null; var38 = (PendingSpawn)pendingSpawns.previous()) {
                     if (var38.hitpoints > 0) {
                        --var38.hitpoints;
                     }

                     ObjectComposition var23;
                     boolean var39;
                     if (var38.hitpoints == 0) {
                        if (var38.objectId >= 0) {
                           var3 = var38.objectId;
                           var4 = var38.field1149;
                           var23 = class463.getObjectDefinition(var3);
                           if (var4 == 11) {
                              var4 = 10;
                           }

                           if (var4 >= 5 && var4 <= 8) {
                              var4 = 4;
                           }

                           var39 = var23.method3907(var4);
                           if (!var39) {
                              continue;
                           }
                        }

                        Skills.addPendingSpawnToScene(var38.plane, var38.type, var38.x, var38.y, var38.objectId, var38.field1148, var38.field1149);
                        var38.remove();
                     } else {
                        if (var38.delay > 0) {
                           --var38.delay;
                        }

                        if (var38.delay == 0 && var38.x >= 1 && var38.y >= 1 && var38.x <= 102 && var38.y <= 102) {
                           if (var38.field1150 >= 0) {
                              var3 = var38.field1150;
                              var4 = var38.field1152;
                              var23 = class463.getObjectDefinition(var3);
                              if (var4 == 11) {
                                 var4 = 10;
                              }

                              if (var4 >= 5 && var4 <= 8) {
                                 var4 = 4;
                              }

                              var39 = var23.method3907(var4);
                              if (!var39) {
                                 continue;
                              }
                           }

                           Skills.addPendingSpawnToScene(var38.plane, var38.type, var38.x, var38.y, var38.field1150, var38.field1151, var38.field1152);
                           var38.delay = -1;
                           if (var38.objectId == var38.field1150 && var38.objectId == -1) {
                              var38.remove();
                           } else if (var38.field1150 == var38.objectId && var38.field1151 == var38.field1148 && var38.field1149 == var38.field1152) {
                              var38.remove();
                           }
                        }
                     }
                  }

                  class7.method64();
                  ++packetWriter.field1398;
                  if (packetWriter.field1398 > 750) {
                     WorldMapRenderer.method5197();
                     return;
                  }

                  MenuAction.method2082();
                  VarbitComposition.method3812();
                  class120.method2978();
                  ++graphicsCycle;
                  if (mouseCrossColor != 0) {
                     mouseCrossState = mouseCrossState * 400 + 400;
                     if (mouseCrossState * 20 >= 400) {
                        mouseCrossColor = 0;
                     }
                  }

                  if (class378.field4437 != null) {
                     ++field743;
                     if (field743 >= 15) {
                        LoginScreenAnimation.invalidateWidget(class378.field4437);
                        class378.field4437 = null;
                     }
                  }

                  Widget var40 = KeyHandler.mousedOverWidgetIf1;
                  Widget var33 = class18.field102;
                  KeyHandler.mousedOverWidgetIf1 = null;
                  class18.field102 = null;
                  draggedOnWidget = null;
                  field695 = false;
                  field692 = false;
                  field759 = 0;

                  while(field702.method4141() && field759 < 128) {
                     if (staffModLevel >= 2 && field702.method4143(82) && field702.field2339 == 66) {
                        String var24 = class209.method4225();
                        Decimator.client.method501(var24);
                     } else if (oculusOrbState != 1 || field702.field2333 <= 0) {
                        field745[field759] = field702.field2339;
                        field753[field759] = field702.field2333;
                        ++field759;
                     }
                  }

                  boolean var34 = staffModLevel >= 2;
                  if (var34 && field702.method4143(82) && field702.method4143(81) && mouseWheelRotation != 0) {
                     var4 = class387.localPlayer.plane - mouseWheelRotation;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > 3) {
                        var4 = 3;
                     }

                     if (var4 != class387.localPlayer.plane) {
                        class168.method3487(class387.localPlayer.pathX[0] + ParamComposition.baseX * 64, class387.localPlayer.pathY[0] + baseY * 64, var4, false);
                     }

                     mouseWheelRotation = 0;
                  }

                  if (MouseHandler.MouseHandler_lastButton == 1) {
                     field752.method4097();
                  }

                  if (rootInterface != -1) {
                     class144.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, class127.canvasHeight, 0, 0);
                  }

                  ++cycleCntr;

                  while(true) {
                     ScriptEvent var25;
                     Widget var41;
                     Widget var42;
                     do {
                        var25 = (ScriptEvent)field768.removeLast();
                        if (var25 == null) {
                           while(true) {
                              do {
                                 var25 = (ScriptEvent)field720.removeLast();
                                 if (var25 == null) {
                                    while(true) {
                                       do {
                                          var25 = (ScriptEvent)scriptEvents.removeLast();
                                          if (var25 == null) {
                                             while(true) {
                                                while(true) {
                                                   class204 var45;
                                                   do {
                                                      do {
                                                         do {
                                                            var45 = (class204)field721.removeLast();
                                                            if (var45 == null) {
                                                               this.menu();
                                                               if (GrandExchangeOfferUnitPriceComparator.worldMap != null) {
                                                                  GrandExchangeOfferUnitPriceComparator.worldMap.method8306(class103.Client_plane, ParamComposition.baseX * 64 + (class387.localPlayer.x >> 7), baseY * 64 + (class387.localPlayer.y >> 7), false);
                                                                  GrandExchangeOfferUnitPriceComparator.worldMap.loadCache();
                                                               }

                                                               if (clickedWidget != null) {
                                                                  this.method1730();
                                                               }

                                                               if (WorldMapLabelSize.dragInventoryWidget != null) {
                                                                  LoginScreenAnimation.invalidateWidget(WorldMapLabelSize.dragInventoryWidget);
                                                                  ++itemDragDuration;
                                                                  if (MouseHandler.MouseHandler_currentButton == 0) {
                                                                     if (field624) {
                                                                        if (WorldMapLabelSize.dragInventoryWidget == class157.hoveredItemContainer && dragItemSlotSource != dragItemSlotDestination) {
                                                                           Widget var46 = WorldMapLabelSize.dragInventoryWidget;
                                                                           byte var35 = 0;
                                                                           if (field679 == 1 && var46.contentType == 206) {
                                                                              var35 = 1;
                                                                           }

                                                                           if (var46.itemIds[dragItemSlotDestination] <= 0) {
                                                                              var35 = 0;
                                                                           }

                                                                           if (class16.method216(class173.getWidgetFlags(var46))) {
                                                                              var6 = dragItemSlotSource;
                                                                              var7 = dragItemSlotDestination;
                                                                              var46.itemIds[var7] = var46.itemIds[var6];
                                                                              var46.itemQuantities[var7] = var46.itemQuantities[var6];
                                                                              var46.itemIds[var6] = -1;
                                                                              var46.itemQuantities[var6] = 0;
                                                                           } else if (var35 == 1) {
                                                                              var6 = dragItemSlotSource;
                                                                              var7 = dragItemSlotDestination;

                                                                              while(var6 != var7) {
                                                                                 if (var6 > var7) {
                                                                                    var46.swapItems(var6 - 1, var6);
                                                                                    --var6;
                                                                                 } else if (var6 < var7) {
                                                                                    var46.swapItems(var6 + 1, var6);
                                                                                    ++var6;
                                                                                 }
                                                                              }
                                                                           } else {
                                                                              var46.swapItems(dragItemSlotDestination, dragItemSlotSource);
                                                                           }

                                                                           var18 = Renderable.getPacketBufferNode(ClientPacket.IF_BUTTOND, packetWriter.isaacCipher);
                                                                           var18.packetBuffer.writeShortAdd(dragItemSlotSource);
                                                                           var18.packetBuffer.writeShortLE(dragItemSlotDestination);
                                                                           var18.packetBuffer.writeByteAdd(var35);
                                                                           var18.packetBuffer.writeIntME(WorldMapLabelSize.dragInventoryWidget.id);
                                                                           packetWriter.addNode(var18);
                                                                        }
                                                                     } else if (this.shouldLeftClickOpenMenu()) {
                                                                        this.openMenu(draggedWidgetX, draggedWidgetY);
                                                                     } else if (menuOptionsCount > 0) {
                                                                        Skills.method6427(draggedWidgetX, draggedWidgetY);
                                                                     }

                                                                     field743 = 10;
                                                                     MouseHandler.MouseHandler_lastButton = 0;
                                                                     WorldMapLabelSize.dragInventoryWidget = null;
                                                                  } else if (itemDragDuration >= 5 && (MouseHandler.MouseHandler_x > draggedWidgetX + 5 || MouseHandler.MouseHandler_x < draggedWidgetX - 5 || MouseHandler.MouseHandler_y > draggedWidgetY + 5 || MouseHandler.MouseHandler_y < draggedWidgetY - 5)) {
                                                                     field624 = true;
                                                                  }
                                                               }

                                                               if (Scene.shouldSendWalk()) {
                                                                  var4 = Scene.Scene_selectedX;
                                                                  var5 = Scene.Scene_selectedY;
                                                                  var18 = Renderable.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
                                                                  var18.packetBuffer.writeByte(5);
                                                                  var18.packetBuffer.writeShort(ParamComposition.baseX * 64 + var4);
                                                                  var18.packetBuffer.writeByteSub(field702.method4143(82) ? (field702.method4143(81) ? 2 : 1) : 0);
                                                                  var18.packetBuffer.writeShort(baseY * 64 + var5);
                                                                  packetWriter.addNode(var18);
                                                                  Scene.method4510();
                                                                  mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
                                                                  mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
                                                                  mouseCrossColor = 1;
                                                                  mouseCrossState = 0;
                                                                  destinationX = var4;
                                                                  destinationY = var5;
                                                               }

                                                               if (var40 != KeyHandler.mousedOverWidgetIf1) {
                                                                  if (var40 != null) {
                                                                     LoginScreenAnimation.invalidateWidget(var40);
                                                                  }

                                                                  if (KeyHandler.mousedOverWidgetIf1 != null) {
                                                                     LoginScreenAnimation.invalidateWidget(KeyHandler.mousedOverWidgetIf1);
                                                                  }
                                                               }

                                                               if (var33 != class18.field102 && field665 == field666) {
                                                                  if (var33 != null) {
                                                                     LoginScreenAnimation.invalidateWidget(var33);
                                                                  }

                                                                  if (class18.field102 != null) {
                                                                     LoginScreenAnimation.invalidateWidget(class18.field102);
                                                                  }
                                                               }

                                                               if (class18.field102 != null) {
                                                                  if (field665 < field666) {
                                                                     ++field665;
                                                                     if (field666 == field665) {
                                                                        LoginScreenAnimation.invalidateWidget(class18.field102);
                                                                     }
                                                                  }
                                                               } else if (field665 > 0) {
                                                                  --field665;
                                                               }

                                                               if (oculusOrbState == 0) {
                                                                  var4 = class387.localPlayer.x;
                                                                  var5 = class387.localPlayer.y;
                                                                  if (class245.oculusOrbFocalPointX - var4 < -500 || class245.oculusOrbFocalPointX - var4 > 500 || UserComparator10.oculusOrbFocalPointY - var5 < -500 || UserComparator10.oculusOrbFocalPointY - var5 > 500) {
                                                                     class245.oculusOrbFocalPointX = var4;
                                                                     UserComparator10.oculusOrbFocalPointY = var5;
                                                                  }

                                                                  if (var4 != class245.oculusOrbFocalPointX) {
                                                                     class245.oculusOrbFocalPointX += (var4 - class245.oculusOrbFocalPointX) / 16;
                                                                  }

                                                                  if (var5 != UserComparator10.oculusOrbFocalPointY) {
                                                                     UserComparator10.oculusOrbFocalPointY += (var5 - UserComparator10.oculusOrbFocalPointY) / 16;
                                                                  }

                                                                  var6 = class245.oculusOrbFocalPointX >> 7;
                                                                  var7 = UserComparator10.oculusOrbFocalPointY >> 7;
                                                                  var8 = GrandExchangeOfferNameComparator.getTileHeight(class245.oculusOrbFocalPointX, UserComparator10.oculusOrbFocalPointY, class103.Client_plane);
                                                                  var9 = 0;
                                                                  if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
                                                                     for(var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                                        for(var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
                                                                           var12 = class103.Client_plane;
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

                                                                  if (var10 > field598) {
                                                                     field598 += (var10 - field598) / 24;
                                                                  } else if (var10 < field598) {
                                                                     field598 += (var10 - field598) / 80;
                                                                  }

                                                                  Ignored.field4573 = GrandExchangeOfferNameComparator.getTileHeight(class387.localPlayer.x, class387.localPlayer.y, class103.Client_plane) - camFollowHeight;
                                                               } else if (oculusOrbState == 1) {
                                                                  GrandExchangeOfferOwnWorldComparator.method1210();
                                                                  short var37 = -1;
                                                                  if (field702.method4143(33)) {
                                                                     var37 = 0;
                                                                  } else if (field702.method4143(49)) {
                                                                     var37 = 1024;
                                                                  }

                                                                  if (field702.method4143(48)) {
                                                                     if (var37 == 0) {
                                                                        var37 = 1792;
                                                                     } else if (var37 == 1024) {
                                                                        var37 = 1280;
                                                                     } else {
                                                                        var37 = 1536;
                                                                     }
                                                                  } else if (field702.method4143(50)) {
                                                                     if (var37 == 0) {
                                                                        var37 = 256;
                                                                     } else if (var37 == 1024) {
                                                                        var37 = 768;
                                                                     } else {
                                                                        var37 = 512;
                                                                     }
                                                                  }

                                                                  byte var36 = 0;
                                                                  if (field702.method4143(35)) {
                                                                     var36 = -1;
                                                                  } else if (field702.method4143(51)) {
                                                                     var36 = 1;
                                                                  }

                                                                  var6 = 0;
                                                                  if (var37 >= 0 || var36 != 0) {
                                                                     var6 = field702.method4143(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
                                                                     var6 *= 16;
                                                                     field590 = var37;
                                                                     field531 = var36;
                                                                  }

                                                                  if (field589 < var6) {
                                                                     field589 += var6 / 8;
                                                                     if (field589 > var6) {
                                                                        field589 = var6;
                                                                     }
                                                                  } else if (field589 > var6) {
                                                                     field589 = field589 * 9 / 10;
                                                                  }

                                                                  if (field589 > 0) {
                                                                     var7 = field589 / 16;
                                                                     if (field590 >= 0) {
                                                                        var4 = field590 - class285.cameraYaw & 2047;
                                                                        var8 = Rasterizer3D.Rasterizer3D_sine[var4];
                                                                        var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
                                                                        class245.oculusOrbFocalPointX += var8 * var7 / 65536;
                                                                        UserComparator10.oculusOrbFocalPointY += var9 * var7 / 65536;
                                                                     }

                                                                     if (field531 != 0) {
                                                                        Ignored.field4573 += var7 * field531;
                                                                        if (Ignored.field4573 > 0) {
                                                                           Ignored.field4573 = 0;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     field590 = -1;
                                                                     field531 = -1;
                                                                  }

                                                                  if (field702.method4143(13)) {
                                                                     packetWriter.addNode(Renderable.getPacketBufferNode(ClientPacket.FREECAM_EXIT, packetWriter.isaacCipher));
                                                                     oculusOrbState = 0;
                                                                  }
                                                               }

                                                               if (MouseHandler.MouseHandler_currentButton == 4 && ClanMate.mouseCam) {
                                                                  var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
                                                                  camAngleDX = var4 * 2;
                                                                  mouseCamClickedY = var4 != -1 && var4 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
                                                                  var5 = field585 - MouseHandler.MouseHandler_x;
                                                                  camAngleDY = var5 * 2;
                                                                  field585 = var5 != -1 && var5 != 1 ? (field585 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
                                                               } else {
                                                                  if (field702.method4143(96)) {
                                                                     camAngleDY += (-24 - camAngleDY) / 2;
                                                                  } else if (field702.method4143(97)) {
                                                                     camAngleDY += (24 - camAngleDY) / 2;
                                                                  } else {
                                                                     camAngleDY /= 2;
                                                                  }

                                                                  if (field702.method4143(98)) {
                                                                     camAngleDX += (12 - camAngleDX) / 2;
                                                                  } else if (field702.method4143(99)) {
                                                                     camAngleDX += (-12 - camAngleDX) / 2;
                                                                  } else {
                                                                     camAngleDX /= 2;
                                                                  }

                                                                  mouseCamClickedY = MouseHandler.MouseHandler_y;
                                                                  field585 = MouseHandler.MouseHandler_x;
                                                               }

                                                               camAngleY = camAngleDY / 2 + camAngleY & 2047;
                                                               camAngleX += camAngleDX / 2;
                                                               if (camAngleX < 128) {
                                                                  camAngleX = 128;
                                                               }

                                                               if (camAngleX > 383) {
                                                                  camAngleX = 383;
                                                               }

                                                               if (field767) {
                                                                  BoundaryObject.method4846();
                                                               } else if (isCameraLocked) {
                                                                  var4 = Occluder.field2636 * 16384 + 64;
                                                                  var5 = class108.field1416 * 128 + 64;
                                                                  var6 = GrandExchangeOfferNameComparator.getTileHeight(var4, var5, class103.Client_plane) - class10.field55;
                                                                  class275.method5532(var4, var6, var5);
                                                                  var4 = WorldMapData_0.field2806 * 128 + 64;
                                                                  var5 = Players.field1352 * 16384 + 64;
                                                                  var6 = GrandExchangeOfferNameComparator.getTileHeight(var4, var5, class103.Client_plane) - FloorOverlayDefinition.field2266;
                                                                  var7 = var4 - ClanSettings.cameraX;
                                                                  var8 = var6 - UserComparator10.cameraY;
                                                                  var9 = var5 - class366.cameraZ;
                                                                  var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
                                                                  var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531) & 2047;
                                                                  var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531) & 2047;
                                                                  FloorOverlayDefinition.method4027(var11, var12);
                                                               }

                                                               for(var4 = 0; var4 < 5; ++var4) {
                                                                  int var10002 = field772[var4]++;
                                                               }

                                                               class9.varcs.tryWrite();
                                                               var4 = class133.method3119();
                                                               var5 = GameEngine.keyHandler.method353();
                                                               PacketBufferNode var27;
                                                               if (var4 > 15000 && var5 > 15000) {
                                                                  logoutTimer = 250;
                                                                  MouseHandler.MouseHandler_idleCycles = 14500;
                                                                  var27 = Renderable.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
                                                                  packetWriter.addNode(var27);
                                                               }

                                                               WorldMapElement.friendSystem.processFriendUpdates();

                                                               for(var7 = 0; var7 < field797.size(); ++var7) {
                                                                  if (class70.method2087((Integer)field797.get(var7)) != 2) {
                                                                     field797.remove(var7);
                                                                     --var7;
                                                                  }
                                                               }

                                                               ++packetWriter.pendingWrites;
                                                               if (packetWriter.pendingWrites > 50) {
                                                                  var27 = Renderable.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
                                                                  packetWriter.addNode(var27);
                                                               }

                                                               try {
                                                                  packetWriter.flush();
                                                               } catch (IOException var28) {
                                                                  WorldMapRenderer.method5197();
                                                               }

                                                               return;
                                                            }
                                                         } while(var45 == null);
                                                      } while(var45.field2324 == null);

                                                      if (var45.field2324.childIndex < 0) {
                                                         break;
                                                      }

                                                      var42 = class133.getWidget(var45.field2324.parentId);
                                                   } while(var42 == null || var42.children == null || var42.children.length == 0 || var45.field2324.childIndex >= var42.children.length || var45.field2324 != var42.children[var45.field2324.childIndex]);

                                                   if (var45.field2324.type == 11 && var45.field2317 == 0) {
                                                      switch (var45.field2324.method6218()) {
                                                         case 0:
                                                            AttackOption.openURL(var45.field2324.method6229(), true, false);
                                                            break;
                                                         case 1:
                                                            if (NewStuff.method3716(class173.getWidgetFlags(var45.field2324))) {
                                                               int[] var44 = var45.field2324.method6247();
                                                               if (var44 != null) {
                                                                  var18 = Renderable.getPacketBufferNode(ClientPacket.field3164, packetWriter.isaacCipher);
                                                                  var18.packetBuffer.writeIntLE(var44[2]);
                                                                  var18.packetBuffer.writeIntIME(var44[1]);
                                                                  var18.packetBuffer.writeInt(var45.field2324.method6335());
                                                                  var18.packetBuffer.writeIntME(var45.field2324.id);
                                                                  var18.packetBuffer.writeShortAddLE(var45.field2324.childIndex);
                                                                  var18.packetBuffer.writeIntIME(var44[0]);
                                                                  packetWriter.addNode(var18);
                                                               }
                                                            }
                                                      }
                                                   } else if (var45.field2324.type == 12) {
                                                      class307 var43 = var45.field2324.method6235();
                                                      if (var43 != null && var43.method5954()) {
                                                         switch (var45.field2317) {
                                                            case 0:
                                                               field752.method4096(var45.field2324);
                                                               var43.method6057(true);
                                                               var43.method5962(var45.field2319, var45.field2322, field702.method4143(82), field702.method4143(81));
                                                               break;
                                                            case 1:
                                                               var43.method6048(var45.field2319, var45.field2322);
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }

                                          var42 = var25.widget;
                                          if (var42.childIndex < 0) {
                                             break;
                                          }

                                          var41 = class133.getWidget(var42.parentId);
                                       } while(var41 == null || var41.children == null || var42.childIndex >= var41.children.length || var42 != var41.children[var42.childIndex]);

                                       WorldMapAreaData.runScriptEvent(var25);
                                    }
                                 }

                                 var42 = var25.widget;
                                 if (var42.childIndex < 0) {
                                    break;
                                 }

                                 var41 = class133.getWidget(var42.parentId);
                              } while(var41 == null || var41.children == null || var42.childIndex >= var41.children.length || var42 != var41.children[var42.childIndex]);

                              WorldMapAreaData.runScriptEvent(var25);
                           }
                        }

                        var42 = var25.widget;
                        if (var42.childIndex < 0) {
                           break;
                        }

                        var41 = class133.getWidget(var42.parentId);
                     } while(var41 == null || var41.children == null || var42.childIndex >= var41.children.length || var42 != var41.children[var42.childIndex]);

                     WorldMapAreaData.runScriptEvent(var25);
                  }
               }

               var31 = Renderable.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
               var31.packetBuffer.writeByte(0);
               var3 = var31.packetBuffer.offset;
               ClanChannel.performReflectionCheck(var31.packetBuffer);
               var31.packetBuffer.writeLengthByte(var31.packetBuffer.offset - var3);
               packetWriter.addNode(var31);
            }
         }
      }
   }

   @ObfuscatedName("gm")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1406120481"
   )
   @Export("resizeJS")
   void resizeJS() {
      int var1 = GameEngine.canvasWidth;
      int var2 = class127.canvasHeight;
      if (super.contentWidth < var1) {
         var1 = super.contentWidth;
      }

      if (super.contentHeight < var2) {
         var2 = super.contentHeight;
      }

      if (PacketWriter.clientPreferences != null) {
         try {
            Client var3 = Decimator.client;
            Object[] var4 = new Object[]{Message.getWindowedMode()};
            JSObject.getWindow(var3).call("resize", var4);
         } catch (Throwable var5) {
         }
      }

   }

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "551347183"
   )
   @Export("drawLoggedIn")
   final void drawLoggedIn() {
      int var1;
      if (rootInterface != -1) {
         var1 = rootInterface;
         if (class153.loadInterface(var1)) {
            class390.drawModelComponents(WorldMapLabel.Widget_interfaceComponents[var1], -1);
         }
      }

      for(var1 = 0; var1 < rootWidgetCount; ++var1) {
         if (field725[var1]) {
            field678[var1] = true;
         }

         field560[var1] = field725[var1];
         field725[var1] = false;
      }

      field724 = cycle;
      viewportX = -1;
      viewportY = -1;
      class157.hoveredItemContainer = null;
      if (rootInterface != -1) {
         rootWidgetCount = 0;
         class97.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, class127.canvasHeight, 0, 0, -1);
      }

      Rasterizer2D.Rasterizer2D_resetClip();
      if (showMouseCross) {
         if (mouseCrossColor == 1) {
            Calendar.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
         }

         if (mouseCrossColor == 2) {
            Calendar.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
         }
      }

      if (!isMenuOpen) {
         if (viewportX != -1) {
            var1 = viewportX;
            int var2 = viewportY;
            if ((menuOptionsCount >= 2 || isItemSelected != 0 || isSpellSelected) && showMouseOverText) {
               int var3 = menuOptionsCount - 1;
               String var5;
               if (isItemSelected == 1 && menuOptionsCount < 2) {
                  var5 = "Use" + " " + selectedItemName + " " + "->";
               } else if (isSpellSelected && menuOptionsCount < 2) {
                  var5 = selectedSpellActionName + " " + selectedSpellName + " " + "->";
               } else {
                  var5 = TriBool.method7753(var3);
               }

               if (menuOptionsCount > 2) {
                  var5 = var5 + class149.colorStartTag(16777215) + " " + '/' + " " + (menuOptionsCount - 2) + " more options";
               }

               class19.fontBold12.drawRandomAlphaAndSpacing(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
            }
         }
      } else {
         StructComposition.method3853();
      }

      if (gameDrawingMode == 3) {
         for(var1 = 0; var1 < rootWidgetCount; ++var1) {
            if (field560[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
            } else if (field678[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
            }
         }
      }

      class12.method172(class103.Client_plane, class387.localPlayer.x, class387.localPlayer.y, graphicsCycle);
      graphicsCycle = 0;
   }

   @ObfuscatedName("hg")
   @ObfuscatedSignature(
      descriptor = "(Ldb;IB)Z",
      garbageValue = "-1"
   )
   boolean method1770(PacketWriter var1, int var2) {
      if (var1.serverPacketLength == 0) {
         class463.friendsChat = null;
      } else {
         if (class463.friendsChat == null) {
            class463.friendsChat = new FriendsChat(WorldMapCacheName.loginType, Decimator.client);
         }

         class463.friendsChat.method7554(var1.packetBuffer, var2);
      }

      class138.method3149();
      var1.serverPacket = null;
      return true;
   }

   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      descriptor = "(Ldb;I)Z",
      garbageValue = "270594437"
   )
   boolean method1235(PacketWriter var1) {
      if (class463.friendsChat != null) {
         class463.friendsChat.method7550(var1.packetBuffer);
      }

      class138.method3149();
      var1.serverPacket = null;
      return true;
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      descriptor = "(Ldb;I)Z",
      garbageValue = "897974344"
   )
   final boolean method1621(PacketWriter var1) {
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
               if (var1.field1397) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 0, 1);
                  var1.field1398 = 0;
                  var1.field1397 = false;
               }

               var3.offset = 0;
               if (var3.method8624()) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 1, 1);
                  var1.field1398 = 0;
               }

               var1.field1397 = true;
               ServerPacket[] var4 = PlayerCompositionColorTextureOverride.ServerPacket_values();
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
            var1.field1398 = 0;
            timer.method7381();
            var1.field1402 = var1.field1401;
            var1.field1401 = var1.field1405;
            var1.field1405 = var1.serverPacket;
            if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
               KeyHandler.field147 = var3.readUnsignedByteNeg();
               class373.field4406 = var3.readUnsignedByte();
               var1.serverPacket = null;
               return true;
            }

            int var20;
            String var54;
            boolean var72;
            if (ServerPacket.field3224 == var1.serverPacket) {
               var20 = var3.readUShortSmart();
               var72 = var3.readUnsignedByte() == 1;
               var54 = "";
               boolean var69 = false;
               if (var72) {
                  var54 = var3.readStringCp1252NullTerminated();
                  if (WorldMapElement.friendSystem.isIgnored(new Username(var54, WorldMapCacheName.loginType))) {
                     var69 = true;
                  }
               }

               String var60 = var3.readStringCp1252NullTerminated();
               if (!var69) {
                  class280.addGameMessage(var20, var54, var60);
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var53;
            if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
               var20 = var3.readInt();
               var72 = var3.readUnsignedByteAdd() == 1;
               var53 = class133.getWidget(var20);
               if (var72 != var53.isHidden) {
                  var53.isHidden = var72;
                  LoginScreenAnimation.invalidateWidget(var53);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3306 == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               var5 = var3.readUnsignedByte();
               var21 = var3.readUnsignedShort();
               class275.queueSoundEffect(var20, var5, var21);
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

            Widget var75;
            if (ServerPacket.field3272 == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               var5 = var3.readUnsignedShort();
               var21 = var3.readUnsignedIntLE();
               var75 = class133.getWidget(var21);
               var75.field3585 = var5 + (var20 << 16);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
               class277.loadRegions(false, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            boolean var92;
            if (ServerPacket.field3259 == var1.serverPacket) {
               var92 = var3.readUnsignedByte() == 1;
               if (var92) {
                  class361.field4359 = class153.method3317() - var3.readLong();
                  EnumComposition.grandExchangeEvents = new GrandExchangeEvents(var3, true);
               } else {
                  EnumComposition.grandExchangeEvents = null;
               }

               field804 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            int var7;
            int var9;
            int var10;
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            Projectile var19;
            int var23;
            byte var62;
            int var64;
            byte var66;
            if (ServerPacket.field3298 == var1.serverPacket) {
               var62 = var3.readByteNeg();
               var14 = var3.readUnsignedByteAdd() * 4;
               var66 = var3.readByteSub();
               var18 = var3.readUnsignedByteAdd();
               var13 = var3.readUnsignedByteAdd() * 4;
               var15 = var3.readUnsignedShort();
               var17 = var3.readUnsignedByte();
               var12 = var3.readUnsignedShortAddLE();
               var16 = var3.readUnsignedShortAddLE();
               var21 = var3.method8692();
               var20 = var21 >> 16;
               var5 = var21 >> 8 & 255;
               var7 = var20 + (var21 >> 4 & 7);
               var23 = var5 + (var21 & 7);
               var64 = var3.readShortLE();
               var9 = var66 + var7;
               var10 = var62 + var23;
               if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 != 65535) {
                  var7 = var7 * 128 + 64;
                  var23 = var23 * 128 + 64;
                  var9 = var9 * 128 + 64;
                  var10 = var10 * 128 + 64;
                  var19 = new Projectile(var12, class103.Client_plane, var7, var23, GrandExchangeOfferNameComparator.getTileHeight(var7, var23, class103.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var64, var14);
                  var19.setDestination(var9, var10, GrandExchangeOfferNameComparator.getTileHeight(var9, var10, class103.Client_plane) - var14, var15 + cycle);
                  projectiles.addFirst(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
               var66 = var3.readByteSub();
               var18 = var3.readUnsignedByteNeg();
               var15 = var3.readUnsignedShortLE();
               var12 = var3.readUnsignedShort();
               var17 = var3.readUnsignedByteAdd();
               var21 = var3.method8692();
               var20 = var21 >> 16;
               var5 = var21 >> 8 & 255;
               var7 = var20 + (var21 >> 4 & 7);
               var23 = var5 + (var21 & 7);
               var64 = var3.method8710();
               var13 = var3.readUnsignedByteNeg() * 4;
               var62 = var3.readByte();
               var16 = var3.readUnsignedShortLE();
               var14 = var3.readUnsignedByteNeg() * 4;
               var9 = var66 + var7;
               var10 = var62 + var23;
               if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104 && var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var12 != 65535) {
                  var7 = var7 * 128 + 64;
                  var23 = var23 * 128 + 64;
                  var9 = var9 * 128 + 64;
                  var10 = var10 * 128 + 64;
                  var19 = new Projectile(var12, class103.Client_plane, var7, var23, GrandExchangeOfferNameComparator.getTileHeight(var7, var23, class103.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var64, var14);
                  var19.setDestination(var9, var10, GrandExchangeOfferNameComparator.getTileHeight(var9, var10, class103.Client_plane) - var14, var15 + cycle);
                  projectiles.addFirst(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3225 == var1.serverPacket) {
               if (class388.field4512 == null) {
                  class388.field4512 = new class421(class208.HitSplatDefinition_cached);
               }

               class482 var56 = class208.HitSplatDefinition_cached.method8003(var3);
               class388.field4512.field4671.vmethod8378(var56.field5003, var56.field5004);
               field706[++field698 - 1 & 31] = var56.field5003;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
               isCameraLocked = true;
               field767 = false;
               Occluder.field2636 = var3.readUnsignedByte() * 128;
               class108.field1416 = var3.readUnsignedByte() * 16384;
               class10.field55 = var3.readUnsignedShort();
               ModeWhere.field4340 = var3.readUnsignedByte();
               UserComparator7.field1444 = var3.readUnsignedByte();
               if (UserComparator7.field1444 >= 100) {
                  ClanSettings.cameraX = Occluder.field2636 * 16384 + 64;
                  class366.cameraZ = class108.field1416 * 128 + 64;
                  UserComparator10.cameraY = GrandExchangeOfferNameComparator.getTileHeight(ClanSettings.cameraX, class366.cameraZ, class103.Client_plane) - class10.field55;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3200 == var1.serverPacket) {
               class388.field4512 = null;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               VarpDefinition.method3596(var20);
               changedItemContainers[++field524 - 1 & 31] = var20 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
               var20 = var3.readInt();
               InterfaceParent var85 = (InterfaceParent)interfaceParents.get((long)var20);
               if (var85 != null) {
                  class10.closeInterface(var85, true);
               }

               if (meslayerContinueWidget != null) {
                  LoginScreenAnimation.invalidateWidget(meslayerContinueWidget);
                  meslayerContinueWidget = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3235 == var1.serverPacket) {
               var20 = var3.readInt();
               if (var20 != field594) {
                  field594 = var20;
                  SoundSystem.method850();
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_RESET == var1.serverPacket) {
               isCameraLocked = false;

               for(var20 = 0; var20 < 5; ++var20) {
                  field569[var20] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            String var50;
            if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
               var50 = var3.readStringCp1252NullTerminated();
               Object[] var84 = new Object[var50.length() + 1];

               for(var21 = var50.length() - 1; var21 >= 0; --var21) {
                  if (var50.charAt(var21) == 's') {
                     var84[var21 + 1] = var3.readStringCp1252NullTerminated();
                  } else {
                     var84[var21 + 1] = new Integer(var3.readInt());
                  }
               }

               var84[0] = new Integer(var3.readInt());
               ScriptEvent var65 = new ScriptEvent();
               var65.args = var84;
               WorldMapAreaData.runScriptEvent(var65);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               if (var20 == 65535) {
                  var20 = -1;
               }

               var5 = var3.readUnsignedIntME();
               var21 = var3.readUnsignedIntME();
               var75 = class133.getWidget(var21);
               ItemComposition var59;
               if (!var75.isIf3) {
                  if (var20 == -1) {
                     var75.modelType = 0;
                     var1.serverPacket = null;
                     return true;
                  }

                  var59 = TileItem.ItemDefinition_get(var20);
                  var75.modelType = 4;
                  var75.modelId = var20;
                  var75.modelAngleX = var59.xan2d;
                  var75.modelAngleY = var59.yan2d;
                  var75.modelZoom = var59.zoom2d * 100 / var5;
                  LoginScreenAnimation.invalidateWidget(var75);
               } else {
                  var75.itemId = var20;
                  var75.itemQuantity = var5;
                  var59 = TileItem.ItemDefinition_get(var20);
                  var75.modelAngleX = var59.xan2d;
                  var75.modelAngleY = var59.yan2d;
                  var75.modelAngleZ = var59.zan2d;
                  var75.modelOffsetX = var59.offsetX2d;
                  var75.modelOffsetY = var59.offsetY2d;
                  var75.modelZoom = var59.zoom2d;
                  if (var59.isStackable == 1) {
                     var75.itemQuantityMode = 1;
                  } else {
                     var75.itemQuantityMode = 2;
                  }

                  if (var75.field3616 > 0) {
                     var75.modelZoom = var75.modelZoom * 32 / var75.field3616;
                  } else if (var75.rawWidth > 0) {
                     var75.modelZoom = var75.modelZoom * 32 / var75.rawWidth;
                  }

                  LoginScreenAnimation.invalidateWidget(var75);
               }

               var1.serverPacket = null;
               return true;
            }

            GameObject var32;
            String var33;
            byte var83;
            if (ServerPacket.field3232 == var1.serverPacket) {
               var83 = var3.readByte();
               var24 = var3.readStringCp1252NullTerminated();
               long var25 = (long)var3.readUnsignedShort();
               long var27 = (long)var3.readMedium();
               PlayerType var87 = (PlayerType)class4.findEnumerated(ArchiveLoader.PlayerType_values(), var3.readUnsignedByte());
               long var30 = var27 + (var25 << 32);
               boolean var68 = false;
               var32 = null;
               ClanChannel var91 = var83 >= 0 ? currentClanChannels[var83] : class482.guestClanChannel;
               if (var91 == null) {
                  var68 = true;
               } else {
                  var15 = 0;

                  while(true) {
                     if (var15 >= 100) {
                        if (var87.isUser && WorldMapElement.friendSystem.isIgnored(new Username(var24, WorldMapCacheName.loginType))) {
                           var68 = true;
                        }
                        break;
                     }

                     if (var30 == crossWorldMessageIds[var15]) {
                        var68 = true;
                        break;
                     }

                     ++var15;
                  }
               }

               if (!var68) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var30;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var33 = AbstractFont.escapeBrackets(class163.method3398(var3));
                  var16 = var83 >= 0 ? 41 : 44;
                  if (var87.modIcon != -1) {
                     class134.addChatMessage(var16, ObjectSound.method1919(var87.modIcon) + var24, var33, var91.name);
                  } else {
                     class134.addChatMessage(var16, var24, var33, var91.name);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3291 == var1.serverPacket) {
               return this.method1770(var1, 1);
            }

            if (ServerPacket.field3301 == var1.serverPacket) {
               Decimator.method1123(class280.field3178);
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

               field713 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
               var5 = var3.readUnsignedShortLE();
               var20 = var3.readUnsignedShortAdd();
               Player var76;
               if (var20 == localPlayerIndex) {
                  var76 = class387.localPlayer;
               } else {
                  var76 = players[var20];
               }

               var21 = var3.readUnsignedIntME();
               if (var76 != null) {
                  var76.spotAnimation = var5;
                  var76.spotAnimationHeight = var21 >> 16;
                  var76.field1207 = (var21 & '\uffff') + cycle;
                  var76.spotAnimationFrame = 0;
                  var76.spotAnimationFrameCycle = 0;
                  if (var76.field1207 > cycle) {
                     var76.spotAnimationFrame = -1;
                  }

                  if (var76.spotAnimation == 65535) {
                     var76.spotAnimation = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3230 == var1.serverPacket) {
               Decimator.method1123(class280.field3175);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShortAddLE();
               var53 = class133.getWidget(var20);
               if (var53.modelType != 2 || var5 != var53.modelId) {
                  var53.modelType = 2;
                  var53.modelId = var5;
                  LoginScreenAnimation.invalidateWidget(var53);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3247 == var1.serverPacket) {
               Decimator.method1123(class280.field3182);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3228 == var1.serverPacket) {
               Decimator.method1123(class280.field3172);
               var1.serverPacket = null;
               return true;
            }

            long var34;
            InterfaceParent var73;
            if (ServerPacket.field3285 == var1.serverPacket) {
               var20 = var3.offset + var1.serverPacketLength;
               var5 = var3.readUnsignedShort();
               var21 = var3.readUnsignedShort();
               if (var5 != rootInterface) {
                  rootInterface = var5;
                  this.resizeRoot(false);
                  class155.Widget_resetModelFrames(rootInterface);
                  SoundCache.runWidgetOnLoadListener(rootInterface);

                  for(var7 = 0; var7 < 100; ++var7) {
                     field725[var7] = true;
                  }
               }

               InterfaceParent var86;
               for(; var21-- > 0; var86.field1055 = true) {
                  var7 = var3.readInt();
                  var23 = var3.readUnsignedShort();
                  var9 = var3.readUnsignedByte();
                  var86 = (InterfaceParent)interfaceParents.get((long)var7);
                  if (var86 != null && var23 != var86.group) {
                     class10.closeInterface(var86, true);
                     var86 = null;
                  }

                  if (var86 == null) {
                     var86 = ModeWhere.method6788(var7, var23, var9);
                  }
               }

               for(var73 = (InterfaceParent)interfaceParents.first(); var73 != null; var73 = (InterfaceParent)interfaceParents.next()) {
                  if (var73.field1055) {
                     var73.field1055 = false;
                  } else {
                     class10.closeInterface(var73, true);
                  }
               }

               widgetFlags = new NodeHashTable(512);

               while(var3.offset < var20) {
                  var7 = var3.readInt();
                  var23 = var3.readUnsignedShort();
                  var9 = var3.readUnsignedShort();
                  var10 = var3.readInt();

                  for(var64 = var23; var64 <= var9; ++var64) {
                     var34 = ((long)var7 << 32) + (long)var64;
                     widgetFlags.put(new IntegerNode(var10), var34);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            NPC var74;
            if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               var5 = var3.readUnsignedShortAdd();
               var21 = var3.readUnsignedByte();
               if (var5 == 65535) {
                  var5 = -1;
               }

               var74 = npcs[var20];
               if (var74 != null) {
                  if (var5 == var74.sequence && var5 != -1) {
                     var23 = class85.SequenceDefinition_get(var5).field2308;
                     if (var23 == 1) {
                        var74.sequenceFrame = 0;
                        var74.sequenceFrameCycle = 0;
                        var74.sequenceDelay = var21;
                        var74.field1205 = 0;
                     } else if (var23 == 2) {
                        var74.field1205 = 0;
                     }
                  } else if (var5 == -1 || var74.sequence == -1 || class85.SequenceDefinition_get(var5).field2292 >= class85.SequenceDefinition_get(var74.sequence).field2292) {
                     var74.sequence = var5;
                     var74.sequenceFrame = 0;
                     var74.sequenceFrameCycle = 0;
                     var74.sequenceDelay = var21;
                     var74.field1205 = 0;
                     var74.field1230 = var74.pathLength;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3251 == var1.serverPacket) {
               field693 = cycleCntr;
               var83 = var3.readByte();
               class156 var82 = new class156(var3);
               ClanChannel var61;
               if (var83 >= 0) {
                  var61 = currentClanChannels[var83];
               } else {
                  var61 = class482.guestClanChannel;
               }

               var82.method3335(var61);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
               ClientPacket.updateNpcs(false, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3264 == var1.serverPacket) {
               field693 = cycleCntr;
               var83 = var3.readByte();
               if (var1.serverPacketLength == 1) {
                  if (var83 >= 0) {
                     currentClanChannels[var83] = null;
                  } else {
                     class482.guestClanChannel = null;
                  }

                  var1.serverPacket = null;
                  return true;
               }

               if (var83 >= 0) {
                  currentClanChannels[var83] = new ClanChannel(var3);
               } else {
                  class482.guestClanChannel = new ClanChannel(var3);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
               var64 = var3.readUnsignedShort();
               var10 = var3.readUnsignedByteNeg();
               var9 = var3.readUnsignedShortAdd();
               var21 = var3.method8843();
               var20 = var21 >> 16;
               var5 = var21 >> 8 & 255;
               var7 = var20 + (var21 >> 4 & 7);
               var23 = var5 + (var21 & 7);
               if (var7 >= 0 && var23 >= 0 && var7 < 104 && var23 < 104) {
                  var7 = var7 * 128 + 64;
                  var23 = var23 * 128 + 64;
                  GraphicsObject var93 = new GraphicsObject(var9, class103.Client_plane, var7, var23, GrandExchangeOfferNameComparator.getTileHeight(var7, var23, class103.Client_plane) - var10, var64, cycle);
                  graphicsObjects.addFirst(var93);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3219 == var1.serverPacket) {
               return this.method1235(var1);
            }

            if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
               class310.updatePlayers(var3, var1.serverPacketLength);
               GameObject.method4866();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3195 == var1.serverPacket) {
               class323.isLargePlayerInfo = true;
               class310.updatePlayers(var3, var1.serverPacketLength);
               GameObject.method4866();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_2 == var1.serverPacket) {
               ClientPacket.updateNpcs(true, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
               class288.privateChatMode = NewStuff.method3719(var3.readUnsignedByte());
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
               var3.offset += 28;
               if (var3.checkCrc()) {
                  class10.method95(var3, var3.offset - 28);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
               World var55 = new World();
               var55.host = var3.readStringCp1252NullTerminated();
               var55.id = var3.readUnsignedShort();
               var5 = var3.readInt();
               var55.properties = var5;
               class246.updateGameState(45);
               var2.close();
               var2 = null;
               VarbitComposition.changeWorld(var55);
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               var5 = var3.readInt();
               var53 = class133.getWidget(var5);
               if (var53.modelType != 1 || var20 != var53.modelId) {
                  var53.modelType = 1;
                  var53.modelId = var20;
                  LoginScreenAnimation.invalidateWidget(var53);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
               HealthBarDefinition.logOut();
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.field3248 == var1.serverPacket) {
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
               KeyHandler.field147 = var3.readUnsignedByteNeg();
               class373.field4406 = var3.readUnsignedByteNeg();

               while(var3.offset < var1.serverPacketLength) {
                  var20 = var3.readUnsignedByte();
                  class280 var81 = class27.method424()[var20];
                  Decimator.method1123(var81);
               }

               var1.serverPacket = null;
               return true;
            }

            short var71;
            if (ServerPacket.field3220 == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               var71 = (short)var3.method8688();
               var21 = var3.readUnsignedByteNeg();
               var7 = var3.readUnsignedIntME();
               NPC var57 = npcs[var20];
               if (var57 != null) {
                  var57.method2623(var21, var7, var71);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
               isCameraLocked = true;
               field767 = false;
               WorldMapData_0.field2806 = var3.readUnsignedByte() * 16384;
               Players.field1352 = var3.readUnsignedByte() * 128;
               FloorOverlayDefinition.field2266 = var3.readUnsignedShort();
               Message.field485 = var3.readUnsignedByte();
               AttackOption.field1320 = var3.readUnsignedByte();
               if (AttackOption.field1320 >= 100) {
                  var20 = WorldMapData_0.field2806 * 128 + 64;
                  var5 = Players.field1352 * 16384 + 64;
                  var21 = GrandExchangeOfferNameComparator.getTileHeight(var20, var5, class103.Client_plane) - FloorOverlayDefinition.field2266;
                  var7 = var20 - ClanSettings.cameraX;
                  var23 = var21 - UserComparator10.cameraY;
                  var9 = var5 - class366.cameraZ;
                  var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
                  class103.cameraPitch = (int)(Math.atan2((double)var23, (double)var10) * 325.9490051269531) & 2047;
                  class285.cameraYaw = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531) & 2047;
                  if (class103.cameraPitch < 128) {
                     class103.cameraPitch = 128;
                  }

                  if (class103.cameraPitch > 383) {
                     class103.cameraPitch = 383;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3244 == var1.serverPacket) {
               SoundCache.method861();
               var83 = var3.readByte();
               if (var1.serverPacketLength == 1) {
                  if (var83 >= 0) {
                     currentClanSettings[var83] = null;
                  } else {
                     DynamicObject.guestClanSettings = null;
                  }

                  var1.serverPacket = null;
                  return true;
               }

               if (var83 >= 0) {
                  currentClanSettings[var83] = new ClanSettings(var3);
               } else {
                  DynamicObject.guestClanSettings = new ClanSettings(var3);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3197 == var1.serverPacket) {
               class123.method3032();
               weight = var3.readShort();
               field761 = cycleCntr;
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

            if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
               var20 = var3.readUnsignedIntLE();
               var5 = var3.method8688();
               var21 = var3.method8688();
               var75 = class133.getWidget(var20);
               if (var5 != var75.rawX || var21 != var75.rawY || var75.xAlignment != 0 || var75.yAlignment != 0) {
                  var75.rawX = var5;
                  var75.rawY = var21;
                  var75.xAlignment = 0;
                  var75.yAlignment = 0;
                  LoginScreenAnimation.invalidateWidget(var75);
                  this.alignWidget(var75);
                  if (var75.type == 0) {
                     AbstractWorldMapData.revalidateWidgetScroll(WorldMapLabel.Widget_interfaceComponents[var20 >> 16], var75, false);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3213 == var1.serverPacket) {
               return this.method1770(var1, 2);
            }

            if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
               minimapState = var3.readUnsignedByte();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.VARP_LARGE == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               var71 = var3.readByteAdd();
               Varps.Varps_temp[var20] = var71;
               if (Varps.Varps_main[var20] != var71) {
                  Varps.Varps_main[var20] = var71;
               }

               ReflectionCheck.changeGameOptions(var20);
               changedVarps[++changedVarpCount - 1 & 31] = var20;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
               WorldMapElement.friendSystem.readUpdate(var3, var1.serverPacketLength);
               field709 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3212 == var1.serverPacket) {
               NewStuff.method3718(var3.readStringCp1252NullTerminated());
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3198 == var1.serverPacket) {
               Decimator.method1123(class280.field3183);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
               var50 = var3.readStringCp1252NullTerminated();
               var24 = AbstractFont.escapeBrackets(ParamComposition.method3842(class163.method3398(var3)));
               class280.addGameMessage(6, var50, var24);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3241 == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               UrlRequest.method2899(var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3277 == var1.serverPacket) {
               var92 = var3.readBoolean();
               if (var92) {
                  if (class136.field1633 == null) {
                     class136.field1633 = new class347();
                  }
               } else {
                  class136.field1633 = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
               class277.loadRegions(true, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MIDI_SONG == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               if (var20 == 65535) {
                  var20 = -1;
               }

               SpriteMask.playSong(var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3242 == var1.serverPacket) {
               var20 = var3.readMedium();
               var5 = var3.readUnsignedShortAdd();
               if (var5 == 65535) {
                  var5 = -1;
               }

               ScriptEvent.method2321(var5, var20);
               var1.serverPacket = null;
               return true;
            }

            long var37;
            long var39;
            String var44;
            if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
               var50 = var3.readStringCp1252NullTerminated();
               var37 = (long)var3.readUnsignedShort();
               var39 = (long)var3.readMedium();
               PlayerType var41 = (PlayerType)class4.findEnumerated(ArchiveLoader.PlayerType_values(), var3.readUnsignedByte());
               long var42 = var39 + (var37 << 32);
               boolean var63 = false;

               for(var13 = 0; var13 < 100; ++var13) {
                  if (var42 == crossWorldMessageIds[var13]) {
                     var63 = true;
                     break;
                  }
               }

               if (WorldMapElement.friendSystem.isIgnored(new Username(var50, WorldMapCacheName.loginType))) {
                  var63 = true;
               }

               if (!var63 && field626 == 0) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var42;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var44 = AbstractFont.escapeBrackets(ParamComposition.method3842(class163.method3398(var3)));
                  byte var70;
                  if (var41.isPrivileged) {
                     var70 = 7;
                  } else {
                     var70 = 3;
                  }

                  if (var41.modIcon != -1) {
                     class280.addGameMessage(var70, ObjectSound.method1919(var41.modIcon) + var50, var44);
                  } else {
                     class280.addGameMessage(var70, var50, var44);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               var74 = npcs[var20];
               var21 = var3.readUnsignedShortAddLE();
               var5 = var3.readUnsignedIntIME();
               if (var74 != null) {
                  var74.spotAnimation = var21;
                  var74.spotAnimationHeight = var5 >> 16;
                  var74.field1207 = (var5 & '\uffff') + cycle;
                  var74.spotAnimationFrame = 0;
                  var74.spotAnimationFrameCycle = 0;
                  if (var74.field1207 > cycle) {
                     var74.spotAnimationFrame = -1;
                  }

                  if (var74.spotAnimation == 65535) {
                     var74.spotAnimation = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3240 == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               rootInterface = var20;
               this.resizeRoot(false);
               class155.Widget_resetModelFrames(var20);
               SoundCache.runWidgetOnLoadListener(rootInterface);

               for(var5 = 0; var5 < 100; ++var5) {
                  field725[var5] = true;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3275 == var1.serverPacket) {
               var50 = var3.readStringCp1252NullTerminated();
               var5 = var3.readUnsignedIntIME();
               var53 = class133.getWidget(var5);
               if (!var50.equals(var53.text)) {
                  var53.text = var50;
                  LoginScreenAnimation.invalidateWidget(var53);
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var80;
            if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var80 = class133.getWidget(var20);

               for(var21 = 0; var21 < var80.itemIds.length; ++var21) {
                  var80.itemIds[var21] = -1;
                  var80.itemIds[var21] = 0;
               }

               LoginScreenAnimation.invalidateWidget(var80);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3193 == var1.serverPacket) {
               Decimator.method1123(class280.field3171);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var80 = class133.getWidget(var20);
               var80.modelType = 3;
               var80.modelId = class387.localPlayer.appearance.getChatHeadId();
               LoginScreenAnimation.invalidateWidget(var80);
               var1.serverPacket = null;
               return true;
            }

            long var45;
            if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
               var50 = var3.readStringCp1252NullTerminated();
               var37 = var3.readLong();
               var39 = (long)var3.readUnsignedShort();
               var45 = (long)var3.readMedium();
               PlayerType var94 = (PlayerType)class4.findEnumerated(ArchiveLoader.PlayerType_values(), var3.readUnsignedByte());
               var34 = var45 + (var39 << 32);
               boolean var67 = false;

               for(var15 = 0; var15 < 100; ++var15) {
                  if (var34 == crossWorldMessageIds[var15]) {
                     var67 = true;
                     break;
                  }
               }

               if (var94.isUser && WorldMapElement.friendSystem.isIgnored(new Username(var50, WorldMapCacheName.loginType))) {
                  var67 = true;
               }

               if (!var67 && field626 == 0) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var34;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var33 = AbstractFont.escapeBrackets(ParamComposition.method3842(class163.method3398(var3)));
                  if (var94.modIcon != -1) {
                     class134.addChatMessage(9, ObjectSound.method1919(var94.modIcon) + var50, var33, WorldMapSection1.base37DecodeLong(var37));
                  } else {
                     class134.addChatMessage(9, var50, var33, WorldMapSection1.base37DecodeLong(var37));
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.LOGOUT == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               FaceNormal.forceDisconnect(var20);
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.field3300 == var1.serverPacket) {
               WorldMapElement.friendSystem.method1856();
               field709 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3215 == var1.serverPacket) {
               Decimator.method1123(class280.field3176);
               var1.serverPacket = null;
               return true;
            }

            Widget var8;
            if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               var5 = var3.readUnsignedIntLE();
               var21 = var3.readUnsignedShortAdd();
               var7 = var3.readUnsignedShort();
               var8 = class133.getWidget(var5);
               if (var20 != var8.modelAngleX || var21 != var8.modelAngleY || var7 != var8.modelZoom) {
                  var8.modelAngleX = var20;
                  var8.modelAngleY = var21;
                  var8.modelZoom = var7;
                  LoginScreenAnimation.invalidateWidget(var8);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
               class147.readReflectionCheck(var3, var1.serverPacketLength);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
               ServerPacket.field3307 = true;
               ClientPacket.updateNpcs(true, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
               class123.method3032();
               var20 = var3.readUnsignedByteSub();
               var5 = var3.readUnsignedByteSub();
               var21 = var3.readUnsignedIntME();
               experience[var5] = var21;
               currentLevels[var5] = var20;
               levels[var5] = 1;

               for(var7 = 0; var7 < 98; ++var7) {
                  if (var21 >= Skills.Skills_experienceTable[var7]) {
                     levels[var5] = var7 + 2;
                  }
               }

               changedSkills[++changedSkillsCount - 1 & 31] = var5;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3263 == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               var5 = var3.readUnsignedByteAdd();
               var21 = var3.readUnsignedIntME();
               var73 = (InterfaceParent)interfaceParents.get((long)var21);
               if (var73 != null) {
                  class10.closeInterface(var73, var20 != var73.group);
               }

               ModeWhere.method6788(var21, var20, var5);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.VARP_SMALL == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               var5 = var3.readUnsignedIntLE();
               Varps.Varps_temp[var20] = var5;
               if (Varps.Varps_main[var20] != var5) {
                  Varps.Varps_main[var20] = var5;
               }

               ReflectionCheck.changeGameOptions(var20);
               changedVarps[++changedVarpCount - 1 & 31] = var20;
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
                  var53 = class133.getWidget(var20);
               } else {
                  var53 = null;
               }

               if (var53 != null) {
                  for(var7 = 0; var7 < var53.itemIds.length; ++var7) {
                     var53.itemIds[var7] = 0;
                     var53.itemQuantities[var7] = 0;
                  }
               }

               GrandExchangeOfferTotalQuantityComparator.clearItemContainer(var5);
               var7 = var3.readUnsignedShort();

               for(var23 = 0; var23 < var7; ++var23) {
                  var9 = var3.readUnsignedByte();
                  if (var9 == 255) {
                     var9 = var3.readInt();
                  }

                  var10 = var3.readUnsignedShortAdd();
                  if (var53 != null && var23 < var53.itemIds.length) {
                     var53.itemIds[var23] = var10;
                     var53.itemQuantities[var23] = var9;
                  }

                  CollisionMap.itemContainerSetItem(var5, var23, var10 - 1, var9);
               }

               if (var53 != null) {
                  LoginScreenAnimation.invalidateWidget(var53);
               }

               class123.method3032();
               changedItemContainers[++field524 - 1 & 31] = var5 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3221 == var1.serverPacket) {
               SoundCache.method861();
               var83 = var3.readByte();
               class142 var79 = new class142(var3);
               ClanSettings var58;
               if (var83 >= 0) {
                  var58 = currentClanSettings[var83];
               } else {
                  var58 = DynamicObject.guestClanSettings;
               }

               var79.method3169(var58);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3233 == var1.serverPacket) {
               Decimator.method1123(class280.field3179);
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
                  var53 = class133.getWidget(var20);
               } else {
                  var53 = null;
               }

               for(; var3.offset < var1.serverPacketLength; CollisionMap.itemContainerSetItem(var5, var7, var23 - 1, var9)) {
                  var7 = var3.readUShortSmart();
                  var23 = var3.readUnsignedShort();
                  var9 = 0;
                  if (var23 != 0) {
                     var9 = var3.readUnsignedByte();
                     if (var9 == 255) {
                        var9 = var3.readInt();
                     }
                  }

                  if (var53 != null && var7 >= 0 && var7 < var53.itemIds.length) {
                     var53.itemIds[var7] = var23;
                     var53.itemQuantities[var7] = var9;
                  }
               }

               if (var53 != null) {
                  LoginScreenAnimation.invalidateWidget(var53);
               }

               class123.method3032();
               changedItemContainers[++field524 - 1 & 31] = var5 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3252 == var1.serverPacket) {
               class123.method3032();
               runEnergy = var3.readUnsignedShort();
               field761 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3238 == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var5 = var3.readUnsignedShort();
               if (var5 == 65535) {
                  var5 = -1;
               }

               var21 = var3.readInt();
               var7 = var3.readUnsignedShortLE();
               if (var7 == 65535) {
                  var7 = -1;
               }

               for(var23 = var7; var23 <= var5; ++var23) {
                  var45 = ((long)var20 << 32) + (long)var23;
                  Node var47 = widgetFlags.get(var45);
                  if (var47 != null) {
                     var47.remove();
                  }

                  widgetFlags.put(new IntegerNode(var21), var45);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3304 == var1.serverPacket) {
               Decimator.method1123(class280.field3177);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3202 == var1.serverPacket) {
               Decimator.method1123(class280.field3180);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
               var21 = var3.method8843();
               var20 = var21 >> 16;
               var5 = var21 >> 8 & 255;
               var7 = var20 + (var21 >> 4 & 7);
               var23 = var5 + (var21 & 7);
               var9 = var3.readUnsignedByteAdd();
               var10 = var9 >> 2;
               var64 = var9 & 3;
               var12 = field573[var10];
               var13 = var3.readUnsignedShortLE();
               if (var7 >= 0 && var23 >= 0 && var7 < 103 && var23 < 103) {
                  if (var12 == 0) {
                     BoundaryObject var90 = WorldMapAreaData.scene.method4478(class103.Client_plane, var7, var23);
                     if (var90 != null) {
                        var15 = class124.Entity_unpackID(var90.tag);
                        if (var10 == 2) {
                           var90.renderable1 = new DynamicObject(var15, 2, var64 + 4, class103.Client_plane, var7, var23, var13, false, var90.renderable1);
                           var90.renderable2 = new DynamicObject(var15, 2, var64 + 1 & 3, class103.Client_plane, var7, var23, var13, false, var90.renderable2);
                        } else {
                           var90.renderable1 = new DynamicObject(var15, var10, var64, class103.Client_plane, var7, var23, var13, false, var90.renderable1);
                        }
                     }
                  } else if (var12 == 1) {
                     WallDecoration var89 = WorldMapAreaData.scene.method4479(class103.Client_plane, var7, var23);
                     if (var89 != null) {
                        var15 = class124.Entity_unpackID(var89.tag);
                        if (var10 != 4 && var10 != 5) {
                           if (var10 == 6) {
                              var89.renderable1 = new DynamicObject(var15, 4, var64 + 4, class103.Client_plane, var7, var23, var13, false, var89.renderable1);
                           } else if (var10 == 7) {
                              var89.renderable1 = new DynamicObject(var15, 4, (var64 + 2 & 3) + 4, class103.Client_plane, var7, var23, var13, false, var89.renderable1);
                           } else if (var10 == 8) {
                              var89.renderable1 = new DynamicObject(var15, 4, var64 + 4, class103.Client_plane, var7, var23, var13, false, var89.renderable1);
                              var89.renderable2 = new DynamicObject(var15, 4, (var64 + 2 & 3) + 4, class103.Client_plane, var7, var23, var13, false, var89.renderable2);
                           }
                        } else {
                           var89.renderable1 = new DynamicObject(var15, 4, var64, class103.Client_plane, var7, var23, var13, false, var89.renderable1);
                        }
                     }
                  } else if (var12 == 2) {
                     var32 = WorldMapAreaData.scene.getGameObject(class103.Client_plane, var7, var23);
                     if (var10 == 11) {
                        var10 = 10;
                     }

                     if (var32 != null) {
                        var32.renderable = new DynamicObject(class124.Entity_unpackID(var32.tag), var10, var64, class103.Client_plane, var7, var23, var13, false, var32.renderable);
                     }
                  } else if (var12 == 3) {
                     FloorDecoration var88 = WorldMapAreaData.scene.getFloorDecoration(class103.Client_plane, var7, var23);
                     if (var88 != null) {
                        var88.renderable = new DynamicObject(class124.Entity_unpackID(var88.tag), 22, var64, class103.Client_plane, var7, var23, var13, false, var88.renderable);
                     }
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3280 == var1.serverPacket) {
               var20 = var3.method8688();
               var5 = var3.readUnsignedIntIME();
               var53 = class133.getWidget(var5);
               if (var20 != var53.sequenceId || var20 == -1) {
                  var53.sequenceId = var20;
                  var53.modelFrame = 0;
                  var53.modelFrameCycle = 0;
                  LoginScreenAnimation.invalidateWidget(var53);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3266 == var1.serverPacket) {
               var83 = var3.readByte();
               var37 = (long)var3.readUnsignedShort();
               var39 = (long)var3.readMedium();
               var45 = var39 + (var37 << 32);
               boolean var11 = false;
               ClanChannel var36 = var83 >= 0 ? currentClanChannels[var83] : class482.guestClanChannel;
               if (var36 == null) {
                  var11 = true;
               } else {
                  for(var13 = 0; var13 < 100; ++var13) {
                     if (var45 == crossWorldMessageIds[var13]) {
                        var11 = true;
                        break;
                     }
                  }
               }

               if (!var11) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var45;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var44 = class163.method3398(var3);
                  var14 = var83 >= 0 ? 43 : 46;
                  class134.addChatMessage(var14, "", var44, var36.name);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var5 = var3.readUnsignedShortLE();
               var21 = var5 >> 10 & 31;
               var7 = var5 >> 5 & 31;
               var23 = var5 & 31;
               var9 = (var7 << 11) + (var21 << 19) + (var23 << 3);
               Widget var29 = class133.getWidget(var20);
               if (var9 != var29.color) {
                  var29.color = var9;
                  LoginScreenAnimation.invalidateWidget(var29);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
               WorldMapElement.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
               FontName.FriendSystem_invalidateIgnoreds();
               field709 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               var5 = var3.readUnsignedIntME();
               var53 = class133.getWidget(var5);
               if (var53 != null && var53.type == 0) {
                  if (var20 > var53.scrollHeight - var53.height) {
                     var20 = var53.scrollHeight - var53.height;
                  }

                  if (var20 < 0) {
                     var20 = 0;
                  }

                  if (var20 != var53.scrollY) {
                     var53.scrollY = var20;
                     LoginScreenAnimation.invalidateWidget(var53);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3295 == var1.serverPacket && isCameraLocked) {
               field767 = true;
               ModeWhere.field4340 = var3.readUnsignedByte();
               UserComparator7.field1444 = var3.readUnsignedByte();
               Message.field485 = var3.readUnsignedByte();
               AttackOption.field1320 = var3.readUnsignedByte();

               for(var20 = 0; var20 < 5; ++var20) {
                  field569[var20] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3273 == var1.serverPacket) {
               class388.field4512 = new class421(class208.HitSplatDefinition_cached);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3223 == var1.serverPacket) {
               Decimator.method1123(class280.field3181);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.URL_OPEN == var1.serverPacket) {
               byte[] var52 = new byte[var1.serverPacketLength];
               var3.method8595(var52, 0, var52.length);
               Buffer var78 = new Buffer(var52);
               var54 = var78.readStringCp1252NullTerminated();
               AttackOption.openURL(var54, true, false);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3269 == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var5 = var3.readUnsignedShort();
               var53 = class133.getWidget(var20);
               if (var53.modelType != 6 || var5 != var53.modelId) {
                  var53.modelType = 6;
                  var53.modelId = var5;
                  LoginScreenAnimation.invalidateWidget(var53);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var5 = var3.readUnsignedIntIME();
               InterfaceParent var6 = (InterfaceParent)interfaceParents.get((long)var20);
               var73 = (InterfaceParent)interfaceParents.get((long)var5);
               if (var73 != null) {
                  class10.closeInterface(var73, var6 == null || var6.group != var73.group);
               }

               if (var6 != null) {
                  var6.remove();
                  interfaceParents.put(var6, (long)var5);
               }

               var8 = class133.getWidget(var20);
               if (var8 != null) {
                  LoginScreenAnimation.invalidateWidget(var8);
               }

               var8 = class133.getWidget(var5);
               if (var8 != null) {
                  LoginScreenAnimation.invalidateWidget(var8);
                  AbstractWorldMapData.revalidateWidgetScroll(WorldMapLabel.Widget_interfaceComponents[var8.id >>> 16], var8, true);
               }

               if (rootInterface != -1) {
                  class147.runIntfCloseListeners(rootInterface, 1);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3206 == var1.serverPacket) {
               Decimator.method1123(class280.field3174);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
               tradeChatMode = var3.readUnsignedByteAdd();
               publicChatMode = var3.readUnsignedByteNeg();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_1 == var1.serverPacket) {
               ServerPacket.field3307 = true;
               ClientPacket.updateNpcs(false, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
               rebootTimer = var3.readUnsignedShortAdd() * 30;
               field761 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
               for(var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
                  if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
                     Varps.Varps_main[var20] = Varps.Varps_temp[var20];
                     ReflectionCheck.changeGameOptions(var20);
                     changedVarps[++changedVarpCount - 1 & 31] = var20;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3299 == var1.serverPacket) {
               Decimator.method1123(class280.field3173);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
               class373.field4406 = var3.readUnsignedByteAdd();
               KeyHandler.field147 = var3.readUnsignedByte();

               for(var20 = class373.field4406; var20 < class373.field4406 + 8; ++var20) {
                  for(var5 = KeyHandler.field147; var5 < KeyHandler.field147 + 8; ++var5) {
                     if (groundItems[class103.Client_plane][var20][var5] != null) {
                        groundItems[class103.Client_plane][var20][var5] = null;
                        ClientPacket.updateItemPile(var20, var5);
                     }
                  }
               }

               for(PendingSpawn var51 = (PendingSpawn)pendingSpawns.last(); var51 != null; var51 = (PendingSpawn)pendingSpawns.previous()) {
                  if (var51.x >= class373.field4406 && var51.x < class373.field4406 + 8 && var51.y >= KeyHandler.field147 && var51.y < KeyHandler.field147 + 8 && var51.plane == class103.Client_plane) {
                     var51.hitpoints = 0;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
               for(var20 = 0; var20 < VarpDefinition.field1927; ++var20) {
                  VarpDefinition var77 = TaskHandler.VarpDefinition_get(var20);
                  if (var77 != null) {
                     Varps.Varps_temp[var20] = 0;
                     Varps.Varps_main[var20] = 0;
                  }
               }

               class123.method3032();
               changedVarpCount += 32;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3208 == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               var5 = var3.readUnsignedByte();
               var21 = var3.readUnsignedByte();
               var7 = var3.readUnsignedByte();
               field569[var20] = true;
               field769[var20] = var5;
               field525[var20] = var21;
               field771[var20] = var7;
               field772[var20] = 0;
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
                     hintArrowSubX = 64;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 3) {
                     hintArrowSubX = 0;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 4) {
                     hintArrowSubX = 128;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 5) {
                     hintArrowSubX = 64;
                     hintArrowSubY = 0;
                  }

                  if (hintArrowType == 6) {
                     hintArrowSubX = 64;
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

            if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
               var50 = var3.readStringCp1252NullTerminated();
               var5 = var3.readUnsignedByteNeg();
               var21 = var3.readUnsignedByteSub();
               if (var21 >= 1 && var21 <= 8) {
                  if (var50.equalsIgnoreCase("null")) {
                     var50 = null;
                  }

                  playerMenuActions[var21 - 1] = var50;
                  playerOptionsPriorities[var21 - 1] = var5 == 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3293 == var1.serverPacket) {
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

            if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readInt();
               var21 = class287.getGcDuration();
               PacketBufferNode var22 = Renderable.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
               var22.packetBuffer.writeIntIME(var20);
               var22.packetBuffer.writeIntLE(var5);
               var22.packetBuffer.writeByteSub(GameEngine.fps);
               var22.packetBuffer.writeByte(var21);
               packetWriter.addNode(var22);
               var1.serverPacket = null;
               return true;
            }

            class121.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1401 != null ? var1.field1401.id : -1) + "," + (var1.field1402 != null ? var1.field1402.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
            HealthBarDefinition.logOut();
         } catch (IOException var48) {
            WorldMapRenderer.method5197();
         } catch (Exception var49) {
            var24 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1401 != null ? var1.field1401.id : -1) + "," + (var1.field1402 != null ? var1.field1402.id : -1) + "," + var1.serverPacketLength + "," + (class387.localPlayer.pathX[0] + ParamComposition.baseX * 64) + "," + (class387.localPlayer.pathY[0] + baseY * 64) + ",";

            for(var21 = 0; var21 < var1.serverPacketLength && var21 < 50; ++var21) {
               var24 = var24 + var3.array[var21] + ",";
            }

            class121.RunException_sendStackTrace(var24, var49);
            HealthBarDefinition.logOut();
         }

         return true;
      }
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-124"
   )
   @Export("menu")
   final void menu() {
      class127.method3082();
      if (WorldMapLabelSize.dragInventoryWidget == null) {
         if (clickedWidget == null) {
            int var1 = MouseHandler.MouseHandler_lastButton;
            int var2;
            int var4;
            int var5;
            int var6;
            if (isMenuOpen) {
               int var3;
               if (var1 != 1 && (ClanMate.mouseCam || var1 != 4)) {
                  var2 = MouseHandler.MouseHandler_x;
                  var3 = MouseHandler.MouseHandler_y;
                  if (var2 < class130.menuX - 10 || var2 > class130.menuX + class7.menuWidth + 10 || var3 < ModeWhere.menuY - 10 || var3 > PlayerType.menuHeight + ModeWhere.menuY + 10) {
                     isMenuOpen = false;
                     Language.method6779(class130.menuX, ModeWhere.menuY, class7.menuWidth, PlayerType.menuHeight);
                  }
               }

               if (var1 == 1 || !ClanMate.mouseCam && var1 == 4) {
                  var2 = class130.menuX;
                  var3 = ModeWhere.menuY;
                  var4 = class7.menuWidth;
                  var5 = MouseHandler.MouseHandler_lastPressedX;
                  var6 = MouseHandler.MouseHandler_lastPressedY;
                  int var10 = -1;

                  for(int var8 = 0; var8 < menuOptionsCount; ++var8) {
                     int var9 = var3 + (menuOptionsCount - 1 - var8) * 15 + 31;
                     if (var5 > var2 && var5 < var2 + var4 && var6 > var9 - 13 && var6 < var9 + 3) {
                        var10 = var8;
                     }
                  }

                  if (var10 != -1) {
                     FloorDecoration.method4313(var10);
                  }

                  isMenuOpen = false;
                  Language.method6779(class130.menuX, ModeWhere.menuY, class7.menuWidth, PlayerType.menuHeight);
               }
            } else {
               var2 = menuOptionsCount - 1;
               if ((var1 == 1 || !ClanMate.mouseCam && var1 == 4) && var2 >= 0) {
                  var4 = menuOpcodes[var2];
                  if (var4 == 39 || var4 == 40 || var4 == 41 || var4 == 42 || var4 == 43 || var4 == 33 || var4 == 34 || var4 == 35 || var4 == 36 || var4 == 37 || var4 == 38 || var4 == 1005) {
                     var5 = menuArguments1[var2];
                     var6 = menuArguments2[var2];
                     Widget var7 = class133.getWidget(var6);
                     if (ViewportMouse.method4813(class173.getWidgetFlags(var7)) || class16.method216(class173.getWidgetFlags(var7))) {
                        if (WorldMapLabelSize.dragInventoryWidget != null && !field624 && menuOptionsCount > 0 && !this.shouldLeftClickOpenMenu()) {
                           Skills.method6427(draggedWidgetX, draggedWidgetY);
                        }

                        field624 = false;
                        itemDragDuration = 0;
                        if (WorldMapLabelSize.dragInventoryWidget != null) {
                           LoginScreenAnimation.invalidateWidget(WorldMapLabelSize.dragInventoryWidget);
                        }

                        WorldMapLabelSize.dragInventoryWidget = class133.getWidget(var6);
                        dragItemSlotSource = var5;
                        draggedWidgetX = MouseHandler.MouseHandler_lastPressedX;
                        draggedWidgetY = MouseHandler.MouseHandler_lastPressedY;
                        if (var2 >= 0) {
                           class33.method492(var2);
                        }

                        LoginScreenAnimation.invalidateWidget(WorldMapLabelSize.dragInventoryWidget);
                        return;
                     }
                  }
               }

               if ((var1 == 1 || !ClanMate.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
                  var1 = 2;
               }

               if ((var1 == 1 || !ClanMate.mouseCam && var1 == 4) && menuOptionsCount > 0) {
                  FloorDecoration.method4313(var2);
               }

               if (var1 == 2 && menuOptionsCount > 0) {
                  this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
               }
            }

         }
      }
   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1730699476"
   )
   @Export("shouldLeftClickOpenMenu")
   final boolean shouldLeftClickOpenMenu() {
      int var1 = menuOptionsCount - 1;
      return (leftClickOpensMenu && menuOptionsCount > 2 || ArchiveDisk.method7839(var1)) && !menuShiftClick[var1];
   }

   @ObfuscatedName("il")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "3638"
   )
   @Export("openMenu")
   final void openMenu(int var1, int var2) {
      class275.method5531(var1, var2);
      var1 -= viewportOffsetX;
      var2 -= viewportOffsetY;
      WorldMapAreaData.scene.menuOpen(class103.Client_plane, var1, var2, false);
      isMenuOpen = true;
   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1196271761"
   )
   @Export("resizeRoot")
   final void resizeRoot(boolean var1) {
      int var2 = rootInterface;
      int var3 = GameEngine.canvasWidth;
      int var4 = class127.canvasHeight;
      if (class153.loadInterface(var2)) {
         class374.resizeInterface(WorldMapLabel.Widget_interfaceComponents[var2], -1, var3, var4, var1);
      }

   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      descriptor = "(Lkz;I)V",
      garbageValue = "-2114785008"
   )
   @Export("alignWidget")
   void alignWidget(Widget var1) {
      Widget var2 = var1.parentId == -1 ? null : class133.getWidget(var1.parentId);
      int var3;
      int var4;
      if (var2 == null) {
         var3 = GameEngine.canvasWidth;
         var4 = class127.canvasHeight;
      } else {
         var3 = var2.width;
         var4 = var2.height;
      }

      alignWidgetSize(var1, var3, var4, false);
      alignWidgetPosition(var1, var3, var4);
   }

   @ObfuscatedName("kx")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "839046279"
   )
   final void method1730() {
      LoginScreenAnimation.invalidateWidget(clickedWidget);
      ++class27.widgetDragDuration;
      if (field695 && field692) {
         int var1 = MouseHandler.MouseHandler_x;
         int var2 = MouseHandler.MouseHandler_y;
         var1 -= widgetClickX;
         var2 -= widgetClickY;
         if (var1 < field795) {
            var1 = field795;
         }

         if (var1 + clickedWidget.width > field795 + clickedWidgetParent.width) {
            var1 = field795 + clickedWidgetParent.width - clickedWidget.width;
         }

         if (var2 < field803) {
            var2 = field803;
         }

         if (var2 + clickedWidget.height > field803 + clickedWidgetParent.height) {
            var2 = field803 + clickedWidgetParent.height - clickedWidget.height;
         }

         int var3 = var1 - field735;
         int var4 = var2 - field554;
         int var5 = clickedWidget.dragZoneSize;
         if (class27.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            isDraggingWidget = true;
         }

         int var6 = var1 - field795 + clickedWidgetParent.scrollX;
         int var7 = var2 - field803 + clickedWidgetParent.scrollY;
         ScriptEvent var8;
         if (clickedWidget.onDrag != null && isDraggingWidget) {
            var8 = new ScriptEvent();
            var8.widget = clickedWidget;
            var8.mouseX = var6;
            var8.mouseY = var7;
            var8.args = clickedWidget.onDrag;
            WorldMapAreaData.runScriptEvent(var8);
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
                  WorldMapAreaData.runScriptEvent(var8);
               }

               if (draggedOnWidget != null) {
                  Widget var9 = clickedWidget;
                  int var10 = ClanChannel.method3366(class173.getWidgetFlags(var9));
                  Widget var13;
                  if (var10 == 0) {
                     var13 = null;
                  } else {
                     int var11 = 0;

                     while(true) {
                        if (var11 >= var10) {
                           var13 = var9;
                           break;
                        }

                        var9 = class133.getWidget(var9.parentId);
                        if (var9 == null) {
                           var13 = null;
                           break;
                        }

                        ++var11;
                     }
                  }

                  if (var13 != null) {
                     PacketBufferNode var12 = Renderable.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
                     var12.packetBuffer.writeShort(clickedWidget.itemId);
                     var12.packetBuffer.writeInt(draggedOnWidget.id);
                     var12.packetBuffer.writeShort(draggedOnWidget.childIndex);
                     var12.packetBuffer.writeShortAddLE(draggedOnWidget.itemId);
                     var12.packetBuffer.writeShort(clickedWidget.childIndex);
                     var12.packetBuffer.writeIntME(clickedWidget.id);
                     packetWriter.addNode(var12);
                  }
               }
            } else if (this.shouldLeftClickOpenMenu()) {
               this.openMenu(widgetClickX + field735, widgetClickY + field554);
            } else if (menuOptionsCount > 0) {
               Skills.method6427(widgetClickX + field735, widgetClickY + field554);
            }

            clickedWidget = null;
         }

      } else {
         if (class27.widgetDragDuration > 1) {
            if (!isDraggingWidget && menuOptionsCount > 0) {
               Skills.method6427(widgetClickX + field735, widgetClickY + field554);
            }

            clickedWidget = null;
         }

      }
   }

   @ObfuscatedName("ma")
   @ObfuscatedSignature(
      descriptor = "(I)Lsi;",
      garbageValue = "-2141997640"
   )
   @Export("username")
   public Username username() {
      return class387.localPlayer != null ? class387.localPlayer.username : null;
   }

   public final void init() {
      try {
         if (this.checkHost()) {
            int var3;
            int var4;
            int var7;
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
                        var4 = Integer.parseInt(var2);
                        Language var54;
                        if (var4 >= 0 && var4 < Language.Language_valuesOrdered.length) {
                           var54 = Language.Language_valuesOrdered[var4];
                        } else {
                           var54 = null;
                        }

                        class36.clientLanguage = var54;
                        break;
                     case 7:
                        var4 = Integer.parseInt(var2);
                        GameBuild[] var5 = new GameBuild[]{GameBuild.WIP, GameBuild.RC, GameBuild.LIVE, GameBuild.BUILDLIVE};
                        GameBuild[] var6 = var5;
                        var7 = 0;

                        GameBuild var17;
                        while(true) {
                           if (var7 >= var6.length) {
                              var17 = null;
                              break;
                           }

                           GameBuild var8 = var6[var7];
                           if (var4 == var8.buildId) {
                              var17 = var8;
                              break;
                           }

                           ++var7;
                        }

                        class147.field1700 = var17;
                        break;
                     case 8:
                        if (var2.equalsIgnoreCase("true")) {
                        }
                        break;
                     case 9:
                        GraphicsDefaults.field4623 = var2;
                        break;
                     case 10:
                        class134.field1606 = (StudioGame)class4.findEnumerated(WorldMapSection1.method5371(), Integer.parseInt(var2));
                        if (class134.field1606 == StudioGame.oldscape) {
                           WorldMapCacheName.loginType = LoginType.oldscape;
                        } else {
                           WorldMapCacheName.loginType = LoginType.field4858;
                        }
                        break;
                     case 11:
                        field805 = var2;
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
                        Message.field486 = Integer.parseInt(var2);
                        break;
                     case 15:
                        gameBuild = Integer.parseInt(var2);
                        break;
                     case 17:
                        VerticalAlignment.field2070 = var2;
                        break;
                     case 21:
                        field501 = Integer.parseInt(var2);
                        break;
                     case 25:
                        var3 = var2.indexOf(".");
                        if (var3 == -1) {
                           field505 = Integer.parseInt(var2);
                        } else {
                           field505 = Integer.parseInt(var2.substring(0, var3));
                           Integer.parseInt(var2.substring(var3 + 1));
                        }
                  }
               }
            }

            Scene.Scene_isLowDetail = false;
            isLowDetail = false;
            NetCache.worldHost = this.getCodeBase().getHost();
            String var18 = class147.field1700.name;
            byte var19 = 0;

            try {
               JagexCache.idxCount = 22;
               class86.cacheGamebuild = var19;

               try {
                  class168.operatingSystemName = System.getProperty("os.name");
               } catch (Exception var36) {
                  class168.operatingSystemName = "Unknown";
               }

               SpotAnimationDefinition.formattedOperatingSystemName = class168.operatingSystemName.toLowerCase();

               try {
                  UserComparator4.userHomeDirectory = System.getProperty("user.home");
                  if (UserComparator4.userHomeDirectory != null) {
                     UserComparator4.userHomeDirectory = UserComparator4.userHomeDirectory + "/";
                  }
               } catch (Exception var35) {
               }

               try {
                  if (SpotAnimationDefinition.formattedOperatingSystemName.startsWith("win")) {
                     if (UserComparator4.userHomeDirectory == null) {
                        UserComparator4.userHomeDirectory = System.getenv("USERPROFILE");
                     }
                  } else if (UserComparator4.userHomeDirectory == null) {
                     UserComparator4.userHomeDirectory = System.getenv("HOME");
                  }

                  if (UserComparator4.userHomeDirectory != null) {
                     UserComparator4.userHomeDirectory = UserComparator4.userHomeDirectory + "/";
                  }
               } catch (Exception var34) {
               }

               if (UserComparator4.userHomeDirectory == null) {
                  UserComparator4.userHomeDirectory = "~/";
               }

               class158.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", UserComparator4.userHomeDirectory, "/tmp/", ""};
               class130.cacheSubPaths = new String[]{".jagex_cache_" + class86.cacheGamebuild, ".file_store_" + class86.cacheGamebuild};
               var3 = 0;

               label344:
               while(var3 < 4) {
                  String var42 = var3 == 0 ? "" : "" + var3;
                  UserComparator5.JagexCache_locationFile = new File(UserComparator4.userHomeDirectory, "jagex_cl_oldschool_" + var18 + var42 + ".dat");
                  String var44 = null;
                  String var20 = null;
                  boolean var21 = false;
                  Buffer var10;
                  int var11;
                  int var13;
                  File var47;
                  if (UserComparator5.JagexCache_locationFile.exists()) {
                     try {
                        AccessFile var9 = new AccessFile(UserComparator5.JagexCache_locationFile, "rw", 10000L);

                        for(var10 = new Buffer((int)var9.length()); var10.offset < var10.array.length; var10.offset += var11) {
                           var11 = var9.read(var10.array, var10.offset, var10.array.length - var10.offset);
                           if (var11 == -1) {
                              throw new IOException();
                           }
                        }

                        var10.offset = 0;
                        var11 = var10.readUnsignedByte();
                        if (var11 < 1 || var11 > 3) {
                           throw new IOException("" + var11);
                        }

                        int var12 = 0;
                        if (var11 > 1) {
                           var12 = var10.readUnsignedByte();
                        }

                        if (var11 <= 2) {
                           var44 = var10.readStringCp1252NullCircumfixed();
                           if (var12 == 1) {
                              var20 = var10.readStringCp1252NullCircumfixed();
                           }
                        } else {
                           var44 = var10.readCESU8();
                           if (var12 == 1) {
                              var20 = var10.readCESU8();
                           }
                        }

                        var9.close();
                     } catch (IOException var39) {
                        var39.printStackTrace();
                     }

                     if (var44 != null) {
                        var47 = new File(var44);
                        if (!var47.exists()) {
                           var44 = null;
                        }
                     }

                     if (var44 != null) {
                        var47 = new File(var44, "test.dat");

                        boolean var50;
                        try {
                           RandomAccessFile var22 = new RandomAccessFile(var47, "rw");
                           var13 = var22.read();
                           var22.seek(0L);
                           var22.write(var13);
                           var22.seek(0L);
                           var22.close();
                           var47.delete();
                           var50 = true;
                        } catch (Exception var33) {
                           var50 = false;
                        }

                        if (!var50) {
                           var44 = null;
                        }
                     }
                  }

                  if (var44 == null && var3 == 0) {
                     label320:
                     for(int var23 = 0; var23 < class130.cacheSubPaths.length; ++var23) {
                        for(int var24 = 0; var24 < class158.cacheParentPaths.length; ++var24) {
                           File var25 = new File(class158.cacheParentPaths[var24] + class130.cacheSubPaths[var23] + File.separatorChar + "oldschool" + File.separatorChar);
                           if (var25.exists()) {
                              File var26 = new File(var25, "test.dat");

                              boolean var52;
                              try {
                                 RandomAccessFile var14 = new RandomAccessFile(var26, "rw");
                                 int var15 = var14.read();
                                 var14.seek(0L);
                                 var14.write(var15);
                                 var14.seek(0L);
                                 var14.close();
                                 var26.delete();
                                 var52 = true;
                              } catch (Exception var32) {
                                 var52 = false;
                              }

                              if (var52) {
                                 var44 = var25.toString();
                                 var21 = true;
                                 break label320;
                              }
                           }
                        }
                     }
                  }

                  if (var44 == null) {
                     var44 = UserComparator4.userHomeDirectory + File.separatorChar + "jagexcache" + var42 + File.separatorChar + "oldschool" + File.separatorChar + var18 + File.separatorChar;
                     var21 = true;
                  }

                  File var46;
                  if (var20 != null) {
                     var46 = new File(var20);
                     var47 = new File(var44);

                     try {
                        File[] var59 = var46.listFiles();
                        File[] var56 = var59;

                        for(var13 = 0; var13 < var56.length; ++var13) {
                           File var53 = var56[var13];
                           File var27 = new File(var47, var53.getName());
                           boolean var16 = var53.renameTo(var27);
                           if (!var16) {
                              throw new IOException();
                           }
                        }
                     } catch (Exception var38) {
                        var38.printStackTrace();
                     }

                     var21 = true;
                  }

                  if (var21) {
                     var46 = new File(var44);
                     var10 = null;

                     try {
                        AccessFile var60 = new AccessFile(UserComparator5.JagexCache_locationFile, "rw", 10000L);
                        Buffer var57 = new Buffer(500);
                        var57.writeByte(3);
                        var57.writeByte(var10 != null ? 1 : 0);
                        var57.writeCESU8(var46.getPath());
                        if (var10 != null) {
                           var57.writeCESU8("");
                        }

                        var60.write(var57.array, 0, var57.offset);
                        var60.close();
                     } catch (IOException var31) {
                        var31.printStackTrace();
                     }
                  }

                  File var28 = new File(var44);
                  Ignored.cacheDir = var28;
                  if (!Ignored.cacheDir.exists()) {
                     Ignored.cacheDir.mkdirs();
                  }

                  File[] var43 = Ignored.cacheDir.listFiles();
                  if (var43 == null) {
                     break;
                  }

                  File[] var48 = var43;
                  var7 = 0;

                  while(true) {
                     if (var7 >= var48.length) {
                        break label344;
                     }

                     File var45 = var48[var7];

                     boolean var58;
                     try {
                        RandomAccessFile var51 = new RandomAccessFile(var45, "rw");
                        var11 = var51.read();
                        var51.seek(0L);
                        var51.write(var11);
                        var51.seek(0L);
                        var51.close();
                        var58 = true;
                     } catch (Exception var30) {
                        var58 = false;
                     }

                     if (!var58) {
                        ++var3;
                        break;
                     }

                     ++var7;
                  }
               }

               PendingSpawn.method2421(Ignored.cacheDir);

               try {
                  File var55 = new File(UserComparator4.userHomeDirectory, "random.dat");
                  int var29;
                  if (var55.exists()) {
                     JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var55, "rw", 25L), 24, 0);
                  } else {
                     label273:
                     for(var4 = 0; var4 < class130.cacheSubPaths.length; ++var4) {
                        for(var29 = 0; var29 < class158.cacheParentPaths.length; ++var29) {
                           File var49 = new File(class158.cacheParentPaths[var29] + class130.cacheSubPaths[var4] + File.separatorChar + "random.dat");
                           if (var49.exists()) {
                              JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var49, "rw", 25L), 24, 0);
                              break label273;
                           }
                        }
                     }
                  }

                  if (JagexCache.JagexCache_randomDat == null) {
                     RandomAccessFile var61 = new RandomAccessFile(var55, "rw");
                     var29 = var61.read();
                     var61.seek(0L);
                     var61.write(var29);
                     var61.seek(0L);
                     var61.close();
                     JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var55, "rw", 25L), 24, 0);
                  }
               } catch (IOException var37) {
               }

               JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class372.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
               JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class372.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
               class18.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount];

               for(var3 = 0; var3 < JagexCache.idxCount; ++var3) {
                  class18.JagexCache_idxFiles[var3] = new BufferedFile(new AccessFile(class372.getFile("main_file_cache.idx" + var3), "rw", 1048576L), 6000, 0);
               }
            } catch (Exception var40) {
               class121.RunException_sendStackTrace((String)null, var40);
            }

            Decimator.client = this;
            RunException.clientType = clientType;
            Frames.field2620 = System.getenv("JX_ACCESS_TOKEN");
            class152.field1755 = System.getenv("JX_REFRESH_TOKEN");
            MusicPatchNode.field3449 = System.getenv("JX_SESSION_ID");
            VarcInt.field1962 = System.getenv("JX_CHARACTER_ID");
            Occluder.method4649(System.getenv("JX_DISPLAY_NAME"));
            if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
               this.field542 = true;
            }

            if (field503 == -1) {
               if (!this.method1723() && !this.method1217()) {
                  field503 = 0;
               } else {
                  field503 = 5;
               }
            }

            this.startThread(765, 503, 211, 1);
         }
      } catch (RuntimeException var41) {
         throw class320.newRunException(var41, "client.init(" + ')');
      }
   }

   public void setOtlTokenRequester(OtlTokenRequester var1) {
      if (var1 != null) {
         this.field540 = var1;
         ReflectionCheck.method696(10);
      }
   }

   @ObfuscatedSignature(
      descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
   )
   public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.field613 = var1;
      }
   }

   public boolean isOnLoginScreen() {
      return gameState == 10;
   }

   public long getAccountHash() {
      return this.field552;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "-381999451"
   )
   static int method1634(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/Object;",
      garbageValue = "-1698320506"
   )
   static Object method1773(int var0) {
      return FriendsList.method7543((class463)class4.findEnumerated(class463.method8503(), var0));
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      descriptor = "(Lkz;IIZI)V",
      garbageValue = "1319818447"
   )
   @Export("alignWidgetSize")
   static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
      int var4 = var0.width;
      int var5 = var0.height;
      if (var0.widthAlignment == 0) {
         var0.width = var0.rawWidth;
      } else if (var0.widthAlignment == 1) {
         var0.width = var1 - var0.rawWidth;
      } else if (var0.widthAlignment == 2) {
         var0.width = var0.rawWidth * var1 >> 14;
      }

      if (var0.heightAlignment == 0) {
         var0.height = var0.rawHeight;
      } else if (var0.heightAlignment == 1) {
         var0.height = var2 - var0.rawHeight;
      } else if (var0.heightAlignment == 2) {
         var0.height = var2 * var0.rawHeight >> 14;
      }

      if (var0.widthAlignment == 4) {
         var0.width = var0.field3659 * var0.height / var0.field3569;
      }

      if (var0.heightAlignment == 4) {
         var0.height = var0.width * var0.field3569 / var0.field3659;
      }

      if (var0.contentType == 1337) {
         viewportWidget = var0;
      }

      if (var0.type == 12) {
         var0.method6235().method5928(var0.width, var0.height);
      }

      if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
         ScriptEvent var6 = new ScriptEvent();
         var6.widget = var0;
         var6.args = var0.onResize;
         scriptEvents.addFirst(var6);
      }

   }

   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      descriptor = "(Lkz;III)V",
      garbageValue = "1034721181"
   )
   @Export("alignWidgetPosition")
   static void alignWidgetPosition(Widget var0, int var1, int var2) {
      if (var0.xAlignment == 0) {
         var0.x = var0.rawX;
      } else if (var0.xAlignment == 1) {
         var0.x = var0.rawX + (var1 - var0.width) / 2;
      } else if (var0.xAlignment == 2) {
         var0.x = var1 - var0.width - var0.rawX;
      } else if (var0.xAlignment == 3) {
         var0.x = var0.rawX * var1 >> 14;
      } else if (var0.xAlignment == 4) {
         var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
      } else {
         var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
      }

      if (var0.yAlignment == 0) {
         var0.y = var0.rawY;
      } else if (var0.yAlignment == 1) {
         var0.y = (var2 - var0.height) / 2 + var0.rawY;
      } else if (var0.yAlignment == 2) {
         var0.y = var2 - var0.height - var0.rawY;
      } else if (var0.yAlignment == 3) {
         var0.y = var2 * var0.rawY >> 14;
      } else if (var0.yAlignment == 4) {
         var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
      } else {
         var0.y = var2 - var0.height - (var2 * var0.rawY >> 14);
      }

   }
}
