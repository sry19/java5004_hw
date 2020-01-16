/**
 * Represents an email with their details--login name and domain *
 */
public class Email {

  private String loginName;
  private String domain;

  /**
   * creates a new email given the login name and domain as strings.*
   *
   * @param loginName the login name of the email
   * @param domain    the domain of the email
   */
  public Email(String loginName, String domain) {
    this.loginName = loginName;
    this.domain = domain;
  }

  /**
   * return the login name
   *
   * @return the login name
   */
  public String getLoginName() {
    return this.loginName;
  }

  /**
   * return the domain
   *
   * @return the domain
   */
  public String getDomain() {
    return this.domain;
  }


}
