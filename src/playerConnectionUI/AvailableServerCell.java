package playerConnectionUI;

import connectionsModel.ConnectionModel;
import playerConnectionUI.actions.ConnectToPlayerAction;
import playerConnectionUI.actions.DisconnectFromPlayerAction;
import status.checker.AvailableServer;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: mcgui230
 * Date: 4/26/14
 * Time: 2:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class AvailableServerCell extends JPanel {

    private AvailableServer availableServer;
    private ConnectionModel connectionModel;

    public AvailableServerCell(AvailableServer availableServer, ConnectionModel connectionModel, Refreshable refreshable) {
        setPreferredSize(new Dimension(200,50));
        this.availableServer = availableServer;
        this.connectionModel = connectionModel;
        add(new JLabel(availableServer.getName()));
        add(new JButton(new ConnectToPlayerAction(availableServer, connectionModel, refreshable)));
    }

}
