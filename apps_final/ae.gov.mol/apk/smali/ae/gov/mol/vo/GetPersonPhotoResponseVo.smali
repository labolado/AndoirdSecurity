.class public Lae/gov/mol/vo/GetPersonPhotoResponseVo;
.super Ljava/lang/Object;
.source "GetPersonPhotoResponseVo.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lae/gov/mol/vo/GetPersonPhotoResponseVo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private getPersonPhotoResult:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    new-instance v0, Lae/gov/mol/vo/GetPersonPhotoResponseVo$1;

    invoke-direct {v0}, Lae/gov/mol/vo/GetPersonPhotoResponseVo$1;-><init>()V

    sput-object v0, Lae/gov/mol/vo/GetPersonPhotoResponseVo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 49
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lae/gov/mol/vo/GetPersonPhotoResponseVo;->getPersonPhotoResult:Ljava/lang/String;

    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lae/gov/mol/vo/GetPersonPhotoResponseVo;->getPersonPhotoResult:Ljava/lang/String;

    .line 21
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lae/gov/mol/vo/GetPersonPhotoResponseVo;->getPersonPhotoResult:Ljava/lang/String;

    .line 22
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 53
    const/4 v0, 0x0

    return v0
.end method

.method public getGetPersonPhotoResult()Ljava/lang/String;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lae/gov/mol/vo/GetPersonPhotoResponseVo;->getPersonPhotoResult:Ljava/lang/String;

    return-object v0
.end method

.method public setGetPersonPhotoResult(Ljava/lang/String;)V
    .locals 0
    .param p1, "getPersonPhotoResult"    # Ljava/lang/String;

    .prologue
    .line 35
    iput-object p1, p0, Lae/gov/mol/vo/GetPersonPhotoResponseVo;->getPersonPhotoResult:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .line 58
    iget-object v0, p0, Lae/gov/mol/vo/GetPersonPhotoResponseVo;->getPersonPhotoResult:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 59
    return-void
.end method